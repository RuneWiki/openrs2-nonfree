import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bn")
public final class Class30 implements Runnable {

	@OriginalMember(owner = "client!bn", name = "f", descriptor = "[B")
	private byte[] aByteArray6;

	@OriginalMember(owner = "client!bn", name = "x", descriptor = "Lclient!uu;")
	private Class249 aClass249_2;

	@OriginalMember(owner = "client!bn", name = "l", descriptor = "I")
	private int anInt793 = 0;

	@OriginalMember(owner = "client!bn", name = "j", descriptor = "Z")
	private boolean aBoolean68 = false;

	@OriginalMember(owner = "client!bn", name = "m", descriptor = "I")
	private int anInt794 = 0;

	@OriginalMember(owner = "client!bn", name = "c", descriptor = "Z")
	private boolean aBoolean67 = false;

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!bn", name = "g", descriptor = "Lclient!hf;")
	private final Class103 aClass103_1;

	@OriginalMember(owner = "client!bn", name = "q", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!bn", name = "w", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!hf;)V")
	public Class30(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class103 arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aClass103_1 = arg1;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "([BIII)V")
	public void method733(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) throws IOException {
		if (this.aBoolean67) {
			return;
		}
		if (this.aBoolean68) {
			this.aBoolean68 = false;
			throw new IOException();
		}
		if (this.aByteArray6 == null) {
			this.aByteArray6 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(38) int local38 = 0; local38 < arg1; local38++) {
				this.aByteArray6[this.anInt793] = arg0[local38];
				this.anInt793 = (this.anInt793 + 1) % 5000;
				if (this.anInt793 == (this.anInt794 + 4900) % 5000) {
					throw new IOException();
				}
			}
			if (this.aClass249_2 == null) {
				this.aClass249_2 = this.aClass103_1.method2374(3, this);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(II[BI)V")
	public void method734(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aBoolean67) {
			return;
		}
		while (arg2 > 0) {
			@Pc(23) int local23 = this.anInputStream1.read(arg1, arg0, arg2);
			if (local23 <= 0) {
				throw new EOFException();
			}
			arg2 -= local23;
			arg0 += local23;
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(I)I")
	public int method735() throws IOException {
		return this.aBoolean67 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(B)V")
	public void method736() {
		if (!this.aBoolean67) {
			this.anInputStream1 = new InputStream_Sub1();
			this.anOutputStream1 = new OutputStream_Sub1();
		}
	}

	@OriginalMember(owner = "client!bn", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method741();
	}

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "(I)I")
	public int method738() throws IOException {
		return this.aBoolean67 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!bn", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label77: {
					@Pc(41) int local41;
					@Pc(51) int local51;
					synchronized (this) {
						if (this.anInt793 == this.anInt794) {
							if (this.aBoolean67) {
								break label77;
							}
							try {
								this.wait();
							} catch (@Pc(24) InterruptedException local24) {
							}
						}
						if (this.anInt793 >= this.anInt794) {
							local41 = this.anInt793 - this.anInt794;
						} else {
							local41 = 5000 - this.anInt794;
						}
						local51 = this.anInt794;
					}
					if (local41 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray6, local51, local41);
					} catch (@Pc(68) IOException local68) {
						this.aBoolean68 = true;
					}
					this.anInt794 = (this.anInt794 + local41) % 5000;
					try {
						if (this.anInt794 == this.anInt793) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(93) IOException local93) {
						this.aBoolean68 = true;
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
				} catch (@Pc(117) IOException local117) {
				}
				this.aByteArray6 = null;
				return;
			}
		} catch (@Pc(122) Exception local122) {
			Static40.method799(local122, null);
		}
	}

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "(B)V")
	public void method740() throws IOException {
		if (!this.aBoolean67 && this.aBoolean68) {
			this.aBoolean68 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!bn", name = "c", descriptor = "(B)V")
	public void method741() {
		if (this.aBoolean67) {
			return;
		}
		synchronized (this) {
			this.aBoolean67 = true;
			this.notifyAll();
		}
		if (this.aClass249_2 != null) {
			while (this.aClass249_2.anInt6929 == 0) {
				Static170.method1617(1L);
			}
			if (this.aClass249_2.anInt6929 == 1) {
				try {
					((Thread) this.aClass249_2.anObject10).join();
				} catch (@Pc(57) InterruptedException local57) {
				}
			}
		}
		this.aClass249_2 = null;
	}
}
