import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vc")
public final class Class65 implements Runnable {

	@OriginalMember(owner = "client!vc", name = "m", descriptor = "Lclient!gd;")
	private Class25 aClass25_8;

	@OriginalMember(owner = "client!vc", name = "A", descriptor = "[B")
	private byte[] aByteArray17;

	@OriginalMember(owner = "client!vc", name = "f", descriptor = "Z")
	private boolean aBoolean160 = false;

	@OriginalMember(owner = "client!vc", name = "g", descriptor = "I")
	private int anInt3096 = 0;

	@OriginalMember(owner = "client!vc", name = "r", descriptor = "I")
	private int anInt3102 = 0;

	@OriginalMember(owner = "client!vc", name = "e", descriptor = "Z")
	private boolean aBoolean159 = false;

	@OriginalMember(owner = "client!vc", name = "q", descriptor = "Lclient!fb;")
	private final Class20 aClass20_5;

	@OriginalMember(owner = "client!vc", name = "o", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!vc", name = "s", descriptor = "Ljava/io/InputStream;")
	private final InputStream anInputStream1;

	@OriginalMember(owner = "client!vc", name = "y", descriptor = "Ljava/io/OutputStream;")
	private final OutputStream anOutputStream1;

	@OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!fb;)V")
	public Class65(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class20 arg1) throws IOException {
		this.aClass20_5 = arg1;
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(B)I")
	public int method2007() throws IOException {
		return this.aBoolean159 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)I")
	public int method2008() throws IOException {
		return this.aBoolean159 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(I[BII)V")
	public void method2009(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) throws IOException {
		if (this.aBoolean159) {
			return;
		}
		if (this.aBoolean160) {
			this.aBoolean160 = false;
			throw new IOException();
		}
		if (this.aByteArray17 == null) {
			this.aByteArray17 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(32) int local32 = 0; local32 < arg1; local32++) {
				this.aByteArray17[this.anInt3102] = arg0[local32];
				this.anInt3102 = (this.anInt3102 + 1) % 5000;
				if (this.anInt3102 == (this.anInt3096 + 4900) % 5000) {
					throw new IOException();
				}
			}
			if (this.aClass25_8 == null) {
				this.aClass25_8 = this.aClass20_5.method728(3, this);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!vc", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method2012();
	}

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "(I)V")
	public void method2012() {
		if (this.aBoolean159) {
			return;
		}
		synchronized (this) {
			this.aBoolean159 = true;
			this.notifyAll();
		}
		if (this.aClass25_8 != null) {
			while (this.aClass25_8.anInt1212 == 0) {
				Static58.method1193(1L);
			}
			if (this.aClass25_8.anInt1212 == 1) {
				try {
					((Thread) this.aClass25_8.anObject3).join();
				} catch (@Pc(52) InterruptedException local52) {
				}
			}
		}
		this.aClass25_8 = null;
	}

	@OriginalMember(owner = "client!vc", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label80: {
					@Pc(41) int local41;
					@Pc(52) int local52;
					synchronized (this) {
						if (this.anInt3102 == this.anInt3096) {
							if (this.aBoolean159) {
								break label80;
							}
							try {
								this.wait();
							} catch (@Pc(24) InterruptedException local24) {
							}
						}
						if (this.anInt3096 <= this.anInt3102) {
							local41 = this.anInt3102 - this.anInt3096;
						} else {
							local41 = 5000 - this.anInt3096;
						}
						local52 = this.anInt3096;
					}
					if (local41 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray17, local52, local41);
					} catch (@Pc(69) IOException local69) {
						this.aBoolean160 = true;
					}
					this.anInt3096 = (this.anInt3096 + local41) % 5000;
					try {
						if (this.anInt3096 == this.anInt3102) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(91) IOException local91) {
						this.aBoolean160 = true;
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
				} catch (@Pc(115) IOException local115) {
				}
				this.aByteArray17 = null;
				break;
			}
		} catch (@Pc(120) Exception local120) {
			Static15.method544(null, local120);
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(B[BII)V")
	public void method2015(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aBoolean159) {
			return;
		}
		while (arg1 > 0) {
			@Pc(18) int local18 = this.anInputStream1.read(arg0, arg2, arg1);
			if (local18 <= 0) {
				throw new EOFException();
			}
			arg1 -= local18;
			arg2 += local18;
		}
	}
}
