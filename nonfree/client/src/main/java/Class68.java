import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fr")
public final class Class68 implements Runnable {

	@OriginalMember(owner = "client!fr", name = "p", descriptor = "[B")
	private byte[] aByteArray20;

	@OriginalMember(owner = "client!fr", name = "y", descriptor = "Lclient!ep;")
	private Class60 aClass60_5;

	@OriginalMember(owner = "client!fr", name = "h", descriptor = "Z")
	private boolean aBoolean138 = false;

	@OriginalMember(owner = "client!fr", name = "r", descriptor = "Z")
	private boolean aBoolean139 = false;

	@OriginalMember(owner = "client!fr", name = "z", descriptor = "I")
	private int anInt2176 = 0;

	@OriginalMember(owner = "client!fr", name = "s", descriptor = "I")
	private int anInt2173 = 0;

	@OriginalMember(owner = "client!fr", name = "n", descriptor = "Lclient!am;")
	private final Class10 aClass10_2;

	@OriginalMember(owner = "client!fr", name = "t", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!fr", name = "x", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!fr", name = "b", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!fr", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!am;)V")
	public Class68(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class10 arg1) throws IOException {
		this.aClass10_2 = arg1;
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "([BIII)V")
	public void method1993(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aBoolean139) {
			return;
		}
		while (arg1 > 0) {
			@Pc(19) int local19 = this.anInputStream1.read(arg0, arg2, arg1);
			if (local19 <= 0) {
				throw new EOFException();
			}
			arg1 -= local19;
			arg2 += local19;
		}
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(Z)V")
	public void method1994() {
		if (this.aBoolean139) {
			return;
		}
		synchronized (this) {
			this.aBoolean139 = true;
			this.notifyAll();
		}
		if (this.aClass60_5 != null) {
			while (this.aClass60_5.anInt1838 == 0) {
				Static105.method2138(1L);
			}
			if (this.aClass60_5.anInt1838 == 1) {
				try {
					((Thread) this.aClass60_5.anObject2).join();
				} catch (@Pc(57) InterruptedException local57) {
				}
			}
		}
		this.aClass60_5 = null;
	}

	@OriginalMember(owner = "client!fr", name = "b", descriptor = "(I)V")
	public void method1996() {
		if (!this.aBoolean139) {
			this.anInputStream1 = new InputStream_Sub1();
			this.anOutputStream1 = new OutputStream_Sub1();
		}
	}

	@OriginalMember(owner = "client!fr", name = "b", descriptor = "(B)I")
	public int method1999() throws IOException {
		return this.aBoolean139 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!fr", name = "c", descriptor = "(B)I")
	public int method2000() throws IOException {
		return this.aBoolean139 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!fr", name = "c", descriptor = "(I)V")
	public void method2001() throws IOException {
		if (!this.aBoolean139 && this.aBoolean138) {
			this.aBoolean138 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!fr", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label80: {
					@Pc(39) int local39;
					@Pc(28) int local28;
					synchronized (this) {
						if (this.anInt2176 == this.anInt2173) {
							if (this.aBoolean139) {
								break label80;
							}
							try {
								this.wait();
							} catch (@Pc(24) InterruptedException local24) {
							}
						}
						local28 = this.anInt2176;
						if (this.anInt2173 >= this.anInt2176) {
							local39 = this.anInt2173 - this.anInt2176;
						} else {
							local39 = 5000 - this.anInt2176;
						}
					}
					if (local39 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray20, local28, local39);
					} catch (@Pc(67) IOException local67) {
						this.aBoolean138 = true;
					}
					this.anInt2176 = (this.anInt2176 + local39) % 5000;
					try {
						if (this.anInt2173 == this.anInt2176) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(92) IOException local92) {
						this.aBoolean138 = true;
					}
					continue;
				}
				try {
					if (this.anInputStream1 != null) {
						this.anInputStream1.close();
					}
					if (this.anOutputStream1 != null) {
						this.anOutputStream1.close();
					}
					if (this.aSocket1 != null) {
						this.aSocket1.close();
					}
				} catch (@Pc(116) IOException local116) {
				}
				this.aByteArray20 = null;
				break;
			}
		} catch (@Pc(121) Exception local121) {
			Static113.method2252(local121, null);
		}
	}

	@OriginalMember(owner = "client!fr", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method1994();
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(III[B)V")
	public void method2002(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) throws IOException {
		if (this.aBoolean139) {
			return;
		}
		if (this.aBoolean138) {
			this.aBoolean138 = false;
			throw new IOException();
		}
		if (this.aByteArray20 == null) {
			this.aByteArray20 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(38) int local38 = 0; local38 < arg0; local38++) {
				this.aByteArray20[this.anInt2173] = arg1[local38];
				this.anInt2173 = (this.anInt2173 + 1) % 5000;
				if (this.anInt2173 == (this.anInt2176 + 4900) % 5000) {
					throw new IOException();
				}
			}
			if (this.aClass60_5 == null) {
				this.aClass60_5 = this.aClass10_2.method316(3, this);
			}
			this.notifyAll();
		}
	}
}
