import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nd")
public final class Class57 implements Runnable {

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "[B")
	private byte[] aByteArray32;

	@OriginalMember(owner = "client!nd", name = "x", descriptor = "Lclient!da;")
	private Class16 aClass16_7;

	@OriginalMember(owner = "client!nd", name = "d", descriptor = "Z")
	private boolean aBoolean98 = false;

	@OriginalMember(owner = "client!nd", name = "l", descriptor = "I")
	private int anInt2293 = 0;

	@OriginalMember(owner = "client!nd", name = "e", descriptor = "I")
	private int anInt2288 = 0;

	@OriginalMember(owner = "client!nd", name = "z", descriptor = "Z")
	private boolean aBoolean99 = false;

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "Lclient!ke;")
	private final Class45 aClass45_4;

	@OriginalMember(owner = "client!nd", name = "n", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!nd", name = "v", descriptor = "Ljava/io/InputStream;")
	private final InputStream anInputStream1;

	@OriginalMember(owner = "client!nd", name = "A", descriptor = "Ljava/io/OutputStream;")
	private final OutputStream anOutputStream1;

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!ke;)V")
	public Class57(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class45 arg1) throws IOException {
		this.aClass45_4 = arg1;
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(II[BI)V")
	public void method1883(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aBoolean98) {
			return;
		}
		while (arg0 > 0) {
			@Pc(22) int local22 = this.anInputStream1.read(arg1, arg2, arg0);
			if (local22 <= 0) {
				throw new EOFException();
			}
			arg2 += local22;
			arg0 -= local22;
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)I")
	public int method1884() throws IOException {
		return this.aBoolean98 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(III[B)V")
	public void method1885(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) throws IOException {
		if (this.aBoolean98) {
			return;
		}
		if (this.aBoolean99) {
			this.aBoolean99 = false;
			throw new IOException();
		}
		if (this.aByteArray32 == null) {
			this.aByteArray32 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(32) int local32 = 0; local32 < arg0; local32++) {
				this.aByteArray32[this.anInt2288] = arg1[local32];
				this.anInt2288 = (this.anInt2288 + 1) % 5000;
				if ((this.anInt2293 + 4900) % 5000 == this.anInt2288) {
					throw new IOException();
				}
			}
			if (this.aClass16_7 == null) {
				this.aClass16_7 = this.aClass45_4.method1479(this, 3);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Z)I")
	public int method1891() throws IOException {
		return this.aBoolean98 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!nd", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label77: {
					@Pc(40) int local40;
					@Pc(51) int local51;
					synchronized (this) {
						if (this.anInt2288 == this.anInt2293) {
							if (this.aBoolean98) {
								break label77;
							}
							try {
								this.wait();
							} catch (@Pc(28) InterruptedException local28) {
							}
						}
						if (this.anInt2293 > this.anInt2288) {
							local40 = 5000 - this.anInt2293;
						} else {
							local40 = this.anInt2288 - this.anInt2293;
						}
						local51 = this.anInt2293;
					}
					if (local40 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray32, local51, local40);
					} catch (@Pc(71) IOException local71) {
						this.aBoolean99 = true;
					}
					this.anInt2293 = (local40 + this.anInt2293) % 5000;
					try {
						if (this.anInt2293 == this.anInt2288) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(92) IOException local92) {
						this.aBoolean99 = true;
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
				this.aByteArray32 = null;
				return;
			}
		} catch (@Pc(121) Exception local121) {
			Static8.method1789(null, local121);
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)V")
	public void method1892() {
		if (this.aBoolean98) {
			return;
		}
		synchronized (this) {
			this.aBoolean98 = true;
			this.notifyAll();
		}
		if (this.aClass16_7 != null) {
			while (this.aClass16_7.anInt749 == 0) {
				Static50.method901(1L);
			}
			if (this.aClass16_7.anInt749 == 1) {
				try {
					((Thread) this.aClass16_7.anObject1).join();
				} catch (@Pc(54) InterruptedException local54) {
				}
			}
		}
		this.aClass16_7 = null;
	}

	@OriginalMember(owner = "client!nd", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method1892();
	}
}
