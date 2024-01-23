import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kb")
public final class Class55 implements Runnable {

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "[B")
	private byte[] aByteArray32;

	@OriginalMember(owner = "client!kb", name = "w", descriptor = "Lclient!fi;")
	private Class36 aClass36_4;

	@OriginalMember(owner = "client!kb", name = "l", descriptor = "I")
	private int anInt2341 = 0;

	@OriginalMember(owner = "client!kb", name = "k", descriptor = "Z")
	private boolean aBoolean132 = false;

	@OriginalMember(owner = "client!kb", name = "m", descriptor = "I")
	private int anInt2342 = 0;

	@OriginalMember(owner = "client!kb", name = "i", descriptor = "Z")
	private boolean aBoolean131 = false;

	@OriginalMember(owner = "client!kb", name = "q", descriptor = "Ljava/net/Socket;")
	private Socket aSocket1;

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "Lclient!mc;")
	private Class65 aClass65_3;

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!kb", name = "x", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!mc;)V")
	public Class55(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class65 arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aClass65_3 = arg1;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)I")
	public int method1753() throws IOException {
		return this.aBoolean132 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V")
	public void method1754() {
		if (this.aBoolean132) {
			return;
		}
		synchronized (this) {
			this.aBoolean132 = true;
			this.notifyAll();
		}
		if (this.aClass36_4 != null) {
			while (this.aClass36_4.anInt1500 == 0) {
				Static146.method2494(1L);
			}
			if (this.aClass36_4.anInt1500 == 1) {
				try {
					((Thread) this.aClass36_4.anObject2).join();
				} catch (@Pc(60) InterruptedException local60) {
				}
			}
		}
		this.aClass36_4 = null;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(I[BII)V")
	public void method1756(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) throws IOException {
		if (this.aBoolean132) {
			return;
		}
		if (this.aBoolean131) {
			this.aBoolean131 = false;
			throw new IOException();
		}
		if (this.aByteArray32 == null) {
			this.aByteArray32 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(36) int local36 = 0; local36 < arg1; local36++) {
				this.aByteArray32[this.anInt2341] = arg0[local36];
				this.anInt2341 = (this.anInt2341 + 1) % 5000;
				if (this.anInt2341 == (this.anInt2342 + 4900) % 5000) {
					throw new IOException();
				}
			}
			if (this.aClass36_4 == null) {
				this.aClass36_4 = this.aClass65_3.method2005(3, this);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!kb", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method1754();
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)I")
	public int method1757() throws IOException {
		return this.aBoolean132 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!kb", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label80: {
					@Pc(40) int local40;
					@Pc(24) int local24;
					synchronized (this) {
						if (this.anInt2342 == this.anInt2341) {
							if (this.aBoolean132) {
								break label80;
							}
							try {
								this.wait();
							} catch (@Pc(20) InterruptedException local20) {
							}
						}
						local24 = this.anInt2342;
						if (this.anInt2342 <= this.anInt2341) {
							local40 = this.anInt2341 - this.anInt2342;
						} else {
							local40 = 5000 - this.anInt2342;
						}
					}
					if (local40 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray32, local24, local40);
					} catch (@Pc(68) IOException local68) {
						this.aBoolean131 = true;
					}
					this.anInt2342 = (local40 + this.anInt2342) % 5000;
					try {
						if (this.anInt2342 == this.anInt2341) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(93) IOException local93) {
						this.aBoolean131 = true;
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
				this.aByteArray32 = null;
				break;
			}
		} catch (@Pc(122) Exception local122) {
			Static131.method2194(null, local122);
		}
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(III[B)V")
	public void method1759(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (this.aBoolean132) {
			return;
		}
		while (arg0 > 0) {
			@Pc(18) int local18 = this.anInputStream1.read(arg2, arg1, arg0);
			if (local18 <= 0) {
				throw new EOFException();
			}
			arg0 -= local18;
			arg1 += local18;
		}
	}
}
