import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fd")
public final class Class22 implements Runnable {

	@OriginalMember(owner = "client!fd", name = "f", descriptor = "Lclient!je;")
	private Class41 aClass41_1;

	@OriginalMember(owner = "client!fd", name = "w", descriptor = "[B")
	private byte[] aByteArray13;

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "I")
	private int anInt1342 = 0;

	@OriginalMember(owner = "client!fd", name = "l", descriptor = "Z")
	private boolean aBoolean59 = false;

	@OriginalMember(owner = "client!fd", name = "x", descriptor = "Z")
	private boolean aBoolean60 = false;

	@OriginalMember(owner = "client!fd", name = "y", descriptor = "I")
	private int anInt1354 = 0;

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!fd", name = "r", descriptor = "Lclient!qe;")
	private final Class66 aClass66_1;

	@OriginalMember(owner = "client!fd", name = "i", descriptor = "Ljava/io/InputStream;")
	private final InputStream anInputStream1;

	@OriginalMember(owner = "client!fd", name = "g", descriptor = "Ljava/io/OutputStream;")
	private final OutputStream anOutputStream1;

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!qe;)V")
	public Class22(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class66 arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aClass66_1 = arg1;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Z)V")
	public void method962() {
		if (this.aBoolean59) {
			return;
		}
		synchronized (this) {
			this.aBoolean59 = true;
			this.notifyAll();
		}
		if (this.aClass41_1 != null) {
			while (this.aClass41_1.anInt2096 == 0) {
				Static176.method2744(1L);
			}
			if (this.aClass41_1.anInt2096 == 1) {
				try {
					((Thread) this.aClass41_1.anObject2).join();
				} catch (@Pc(51) InterruptedException local51) {
				}
			}
		}
		this.aClass41_1 = null;
	}

	@OriginalMember(owner = "client!fd", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method962();
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)I")
	public int method963() throws IOException {
		return this.aBoolean59 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(II[BB)V")
	public void method965(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) throws IOException {
		if (this.aBoolean59) {
			return;
		}
		if (this.aBoolean60) {
			this.aBoolean60 = false;
			throw new IOException();
		}
		if (this.aByteArray13 == null) {
			this.aByteArray13 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(40) int local40 = 0; local40 < arg0; local40++) {
				this.aByteArray13[this.anInt1342] = arg1[local40];
				this.anInt1342 = (this.anInt1342 + 1) % 5000;
				if (this.anInt1342 == (this.anInt1354 + 4900) % 5000) {
					throw new IOException();
				}
			}
			if (this.aClass41_1 == null) {
				this.aClass41_1 = this.aClass66_1.method2127(this, 3);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(III[B)V")
	public void method967(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (this.aBoolean59) {
			return;
		}
		while (arg1 > 0) {
			@Pc(19) int local19 = this.anInputStream1.read(arg2, arg0, arg1);
			if (local19 <= 0) {
				throw new EOFException();
			}
			arg0 += local19;
			arg1 -= local19;
		}
	}

	@OriginalMember(owner = "client!fd", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label77: {
					@Pc(46) int local46;
					@Pc(32) int local32;
					synchronized (this) {
						if (this.anInt1354 == this.anInt1342) {
							if (this.aBoolean59) {
								break label77;
							}
							try {
								this.wait();
							} catch (@Pc(28) InterruptedException local28) {
							}
						}
						local32 = this.anInt1354;
						if (this.anInt1354 > this.anInt1342) {
							local46 = 5000 - this.anInt1354;
						} else {
							local46 = this.anInt1342 - this.anInt1354;
						}
					}
					if (local46 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray13, local32, local46);
					} catch (@Pc(75) IOException local75) {
						this.aBoolean60 = true;
					}
					this.anInt1354 = (local46 + this.anInt1354) % 5000;
					try {
						if (this.anInt1354 == this.anInt1342) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(96) IOException local96) {
						this.aBoolean60 = true;
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
				} catch (@Pc(120) IOException local120) {
				}
				this.aByteArray13 = null;
				return;
			}
		} catch (@Pc(125) Exception local125) {
			Static178.method2785(null, local125);
		}
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(B)I")
	public int method969() throws IOException {
		return this.aBoolean59 ? 0 : this.anInputStream1.read();
	}
}
