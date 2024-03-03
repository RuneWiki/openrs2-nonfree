import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iu")
public final class Class111 implements Runnable {

	@OriginalMember(owner = "client!iu", name = "g", descriptor = "[Lclient!rk;")
	public static final Class37[] aClass37Array1 = new Class37[128];

	@OriginalMember(owner = "client!iu", name = "q", descriptor = "Lclient!cc;")
	private Class32 aClass32_6;

	@OriginalMember(owner = "client!iu", name = "v", descriptor = "[B")
	private byte[] aByteArray29;

	@OriginalMember(owner = "client!iu", name = "l", descriptor = "Z")
	private boolean aBoolean196 = false;

	@OriginalMember(owner = "client!iu", name = "p", descriptor = "Z")
	private boolean aBoolean197 = false;

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "I")
	private int anInt2811 = 0;

	@OriginalMember(owner = "client!iu", name = "k", descriptor = "I")
	private int anInt2818 = 0;

	@OriginalMember(owner = "client!iu", name = "r", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!iu", name = "u", descriptor = "Lclient!ml;")
	private final Class152 aClass152_2;

	@OriginalMember(owner = "client!iu", name = "s", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!iu", name = "b", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!iu", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!ml;)V", line = 388)
	public Class111(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class152 arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aClass152_2 = arg1;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(B)V", line = 22)
	public void method2794() throws IOException {
		if (!this.aBoolean197 && this.aBoolean196) {
			this.aBoolean196 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!iu", name = "finalize", descriptor = "()V", line = 45)
	@Override
	public void finalize() {
		this.method2801();
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "([BIII)V", line = 60)
	public void method2795(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aBoolean197) {
			return;
		}
		while (arg1 > 0) {
			@Pc(14) int local14 = this.anInputStream1.read(arg0, arg2, arg1);
			if (local14 <= 0) {
				throw new EOFException();
			}
			arg1 -= local14;
			arg2 += local14;
		}
	}

	@OriginalMember(owner = "client!iu", name = "b", descriptor = "(I)I", line = 102)
	public int method2797() throws IOException {
		return this.aBoolean197 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(ZII[B)V", line = 152)
	public void method2799(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) throws IOException {
		if (this.aBoolean197) {
			return;
		}
		if (this.aBoolean196) {
			this.aBoolean196 = false;
			throw new IOException();
		}
		if (this.aByteArray29 == null) {
			this.aByteArray29 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(38) int local38 = 0; local38 < arg0; local38++) {
				this.aByteArray29[this.anInt2818] = arg1[local38];
				this.anInt2818 = (this.anInt2818 + 1) % 5000;
				if (this.anInt2818 == (this.anInt2811 + 4900) % 5000) {
					throw new IOException();
				}
			}
			if (this.aClass32_6 == null) {
				this.aClass32_6 = this.aClass152_2.method3770(3, this);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!iu", name = "c", descriptor = "(I)V", line = 240)
	public void method2801() {
		if (this.aBoolean197) {
			return;
		}
		synchronized (this) {
			this.aBoolean197 = true;
			this.notifyAll();
		}
		if (this.aClass32_6 != null) {
			while (this.aClass32_6.anInt992 == 0) {
				Static214.method4024(1L);
			}
			if (this.aClass32_6.anInt992 == 1) {
				try {
					((Thread) this.aClass32_6.anObject2).join();
				} catch (@Pc(54) InterruptedException local54) {
				}
			}
		}
		this.aClass32_6 = null;
	}

	@OriginalMember(owner = "client!iu", name = "d", descriptor = "(I)I", line = 279)
	public int method2802() throws IOException {
		return this.aBoolean197 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!iu", name = "run", descriptor = "()V", line = 300)
	@Override
	public void run() {
		try {
			while (true) {
				label80: {
					@Pc(37) int local37;
					@Pc(47) int local47;
					synchronized (this) {
						if (this.anInt2818 == this.anInt2811) {
							if (this.aBoolean197) {
								break label80;
							}
							try {
								this.wait();
							} catch (@Pc(24) InterruptedException local24) {
							}
						}
						if (this.anInt2811 <= this.anInt2818) {
							local37 = this.anInt2818 - this.anInt2811;
						} else {
							local37 = 5000 - this.anInt2811;
						}
						local47 = this.anInt2811;
					}
					if (local37 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray29, local47, local37);
					} catch (@Pc(67) IOException local67) {
						this.aBoolean196 = true;
					}
					this.anInt2811 = (local37 + this.anInt2811) % 5000;
					try {
						if (this.anInt2818 == this.anInt2811) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(92) IOException local92) {
						this.aBoolean196 = true;
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
				this.aByteArray29 = null;
				break;
			}
		} catch (@Pc(121) Exception local121) {
			Static241.method6254(local121, null);
		}
	}

	@OriginalMember(owner = "client!iu", name = "e", descriptor = "(I)V", line = 373)
	public void method2803() {
		if (!this.aBoolean197) {
			this.anInputStream1 = new InputStream_Sub1();
			this.anOutputStream1 = new OutputStream_Sub1();
		}
	}
}
