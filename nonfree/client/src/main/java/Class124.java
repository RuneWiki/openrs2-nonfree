import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jg")
public final class Class124 implements Runnable {

	@OriginalMember(owner = "client!jg", name = "d", descriptor = "Lclient!a;")
	private Class1 aClass1_6;

	@OriginalMember(owner = "client!jg", name = "r", descriptor = "[B")
	private byte[] aByteArray50;

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "Z")
	private boolean aBoolean220 = false;

	@OriginalMember(owner = "client!jg", name = "c", descriptor = "I")
	private int anInt2966 = 0;

	@OriginalMember(owner = "client!jg", name = "i", descriptor = "Z")
	private boolean aBoolean221 = false;

	@OriginalMember(owner = "client!jg", name = "l", descriptor = "I")
	private int anInt2972 = 0;

	@OriginalMember(owner = "client!jg", name = "w", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!jg", name = "v", descriptor = "Lclient!dq;")
	private final Class53 aClass53_3;

	@OriginalMember(owner = "client!jg", name = "u", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!dq;)V")
	public Class124(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class53 arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aClass53_3 = arg1;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)I")
	public int method2712() throws IOException {
		return this.aBoolean220 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!jg", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method2714();
	}

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(I)V")
	public void method2714() {
		if (this.aBoolean220) {
			return;
		}
		synchronized (this) {
			this.aBoolean220 = true;
			this.notifyAll();
		}
		if (this.aClass1_6 != null) {
			while (this.aClass1_6.anInt2 == 0) {
				Static185.method3004(1L);
			}
			if (this.aClass1_6.anInt2 == 1) {
				try {
					((Thread) this.aClass1_6.anObject1).join();
				} catch (@Pc(55) InterruptedException local55) {
				}
			}
		}
		this.aClass1_6 = null;
	}

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(B)V")
	public void method2715() {
		if (!this.aBoolean220) {
			this.anInputStream1 = new InputStream_Sub1();
			this.anOutputStream1 = new OutputStream_Sub1();
		}
	}

	@OriginalMember(owner = "client!jg", name = "c", descriptor = "(I)I")
	public int method2716() throws IOException {
		return this.aBoolean220 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!jg", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label77: {
					@Pc(42) int local42;
					@Pc(28) int local28;
					synchronized (this) {
						if (this.anInt2972 == this.anInt2966) {
							if (this.aBoolean220) {
								break label77;
							}
							try {
								this.wait();
							} catch (@Pc(24) InterruptedException local24) {
							}
						}
						local28 = this.anInt2966;
						if (this.anInt2972 < this.anInt2966) {
							local42 = 5000 - this.anInt2966;
						} else {
							local42 = this.anInt2972 - this.anInt2966;
						}
					}
					if (local42 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray50, local28, local42);
					} catch (@Pc(67) IOException local67) {
						this.aBoolean221 = true;
					}
					this.anInt2966 = (this.anInt2966 + local42) % 5000;
					try {
						if (this.anInt2972 == this.anInt2966) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(93) IOException local93) {
						this.aBoolean221 = true;
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
				this.aByteArray50 = null;
				return;
			}
		} catch (@Pc(122) Exception local122) {
			Static235.method3843(null, local122);
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(II[BI)V")
	public void method2717(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) throws IOException {
		if (this.aBoolean220) {
			return;
		}
		if (this.aBoolean221) {
			this.aBoolean221 = false;
			throw new IOException();
		}
		if (this.aByteArray50 == null) {
			this.aByteArray50 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(32) int local32 = 0; local32 < arg0; local32++) {
				this.aByteArray50[this.anInt2972] = arg1[local32];
				this.anInt2972 = (this.anInt2972 + 1) % 5000;
				if (this.anInt2972 == (this.anInt2966 + 4900) % 5000) {
					throw new IOException();
				}
			}
			if (this.aClass1_6 == null) {
				this.aClass1_6 = this.aClass53_3.method1169(this, 3);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!jg", name = "d", descriptor = "(I)V")
	public void method2719() throws IOException {
		if (!this.aBoolean220 && this.aBoolean221) {
			this.aBoolean221 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "([BIII)V")
	public void method2720(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aBoolean220) {
			return;
		}
		while (arg1 > 0) {
			@Pc(18) int local18 = this.anInputStream1.read(arg0, arg2, arg1);
			if (local18 <= 0) {
				throw new EOFException();
			}
			arg2 += local18;
			arg1 -= local18;
		}
	}
}
