import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vd")
public final class Class78 implements Runnable {

	@OriginalMember(owner = "client!vd", name = "j", descriptor = "[B")
	private byte[] aByteArray124;

	@OriginalMember(owner = "client!vd", name = "n", descriptor = "Lclient!he;")
	private Class30 aClass30_8;

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "I")
	private int anInt2934 = 0;

	@OriginalMember(owner = "client!vd", name = "s", descriptor = "Z")
	private boolean aBoolean122 = false;

	@OriginalMember(owner = "client!vd", name = "v", descriptor = "I")
	private int anInt2943 = 0;

	@OriginalMember(owner = "client!vd", name = "u", descriptor = "Z")
	private boolean aBoolean123 = false;

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "Lclient!jb;")
	private final Class35 aClass35_2;

	@OriginalMember(owner = "client!vd", name = "h", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!vd", name = "r", descriptor = "Ljava/io/InputStream;")
	private final InputStream anInputStream1;

	@OriginalMember(owner = "client!vd", name = "m", descriptor = "Ljava/io/OutputStream;")
	private final OutputStream anOutputStream1;

	@OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!jb;)V")
	public Class78(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class35 arg1) throws IOException {
		this.aClass35_2 = arg1;
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!vd", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label80: {
					@Pc(33) int local33;
					@Pc(44) int local44;
					synchronized (this) {
						if (this.anInt2934 == this.anInt2943) {
							if (this.aBoolean123) {
								break label80;
							}
							try {
								this.wait();
							} catch (@Pc(20) InterruptedException local20) {
							}
						}
						if (this.anInt2943 <= this.anInt2934) {
							local33 = this.anInt2934 - this.anInt2943;
						} else {
							local33 = 5000 - this.anInt2943;
						}
						local44 = this.anInt2943;
					}
					if (local33 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray124, local44, local33);
					} catch (@Pc(61) IOException local61) {
						this.aBoolean122 = true;
					}
					this.anInt2943 = (local33 + this.anInt2943) % 5000;
					try {
						if (this.anInt2934 == this.anInt2943) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(86) IOException local86) {
						this.aBoolean122 = true;
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
				} catch (@Pc(110) IOException local110) {
				}
				this.aByteArray124 = null;
				break;
			}
		} catch (@Pc(115) Exception local115) {
			Static15.method2092(local115, null);
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)I")
	public int method2076() throws IOException {
		return this.aBoolean123 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(BII[B)V")
	public void method2077(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (this.aBoolean123) {
			return;
		}
		while (arg0 > 0) {
			@Pc(20) int local20 = this.anInputStream1.read(arg2, arg1, arg0);
			if (local20 <= 0) {
				throw new EOFException();
			}
			arg0 -= local20;
			arg1 += local20;
		}
	}

	@OriginalMember(owner = "client!vd", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method2085();
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(I)I")
	public int method2079() throws IOException {
		return this.aBoolean123 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "([BBII)V")
	public void method2081(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) throws IOException {
		if (this.aBoolean123) {
			return;
		}
		if (this.aBoolean122) {
			this.aBoolean122 = false;
			throw new IOException();
		}
		if (this.aByteArray124 == null) {
			this.aByteArray124 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(32) int local32 = 0; local32 < arg1; local32++) {
				this.aByteArray124[this.anInt2934] = arg0[local32];
				this.anInt2934 = (this.anInt2934 + 1) % 5000;
				if ((this.anInt2943 + 4900) % 5000 == this.anInt2934) {
					throw new IOException();
				}
			}
			if (this.aClass30_8 == null) {
				this.aClass30_8 = this.aClass35_2.method981(3, this);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!vd", name = "d", descriptor = "(I)V")
	public void method2085() {
		if (this.aBoolean123) {
			return;
		}
		synchronized (this) {
			this.aBoolean123 = true;
			this.notifyAll();
		}
		if (this.aClass30_8 != null) {
			while (this.aClass30_8.anInt1209 == 0) {
				Static13.method278(1L);
			}
			if (this.aClass30_8.anInt1209 == 1) {
				try {
					((Thread) this.aClass30_8.anObject3).join();
				} catch (@Pc(58) InterruptedException local58) {
				}
			}
		}
		this.aClass30_8 = null;
	}
}
