import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ak")
public final class Class11 implements Runnable {

	@OriginalMember(owner = "client!ak", name = "h", descriptor = "[B")
	private byte[] aByteArray1;

	@OriginalMember(owner = "client!ak", name = "x", descriptor = "Lclient!ue;")
	private Class196 aClass196_1;

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "Z")
	private boolean aBoolean16 = false;

	@OriginalMember(owner = "client!ak", name = "f", descriptor = "Z")
	private boolean aBoolean17 = false;

	@OriginalMember(owner = "client!ak", name = "o", descriptor = "I")
	private int anInt160 = 0;

	@OriginalMember(owner = "client!ak", name = "y", descriptor = "I")
	private int anInt166 = 0;

	@OriginalMember(owner = "client!ak", name = "m", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!ak", name = "u", descriptor = "Lclient!vj;")
	private final Class206 aClass206_1;

	@OriginalMember(owner = "client!ak", name = "e", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!ak", name = "c", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!vj;)V")
	public Class11(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class206 arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aClass206_1 = arg1;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "([BIII)V")
	public void method158(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) throws IOException {
		if (this.aBoolean16) {
			return;
		}
		if (this.aBoolean17) {
			this.aBoolean17 = false;
			throw new IOException();
		}
		if (this.aByteArray1 == null) {
			this.aByteArray1 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(32) int local32 = 0; local32 < arg1; local32++) {
				this.aByteArray1[this.anInt160] = arg0[local32];
				this.anInt160 = (this.anInt160 + 1) % 5000;
				if (this.anInt160 == (this.anInt166 + 4900) % 5000) {
					throw new IOException();
				}
			}
			if (this.aClass196_1 == null) {
				this.aClass196_1 = this.aClass206_1.method5526(this, 3);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)V")
	public void method159() {
		if (this.aBoolean16) {
			return;
		}
		synchronized (this) {
			this.aBoolean16 = true;
			this.notifyAll();
		}
		if (this.aClass196_1 != null) {
			while (this.aClass196_1.anInt5851 == 0) {
				Static278.method5283(1L);
			}
			if (this.aClass196_1.anInt5851 == 1) {
				try {
					((Thread) this.aClass196_1.anObject8).join();
				} catch (@Pc(51) InterruptedException local51) {
				}
			}
		}
		this.aClass196_1 = null;
	}

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "(I)I")
	public int method160() throws IOException {
		return this.aBoolean16 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(B)V")
	public void method162() {
		if (!this.aBoolean16) {
			this.anInputStream1 = new InputStream_Sub1();
			this.anOutputStream1 = new OutputStream_Sub1();
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(I[BII)V")
	public void method164(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aBoolean16) {
			return;
		}
		while (arg1 > 0) {
			@Pc(22) int local22 = this.anInputStream1.read(arg0, arg2, arg1);
			if (local22 <= 0) {
				throw new EOFException();
			}
			arg2 += local22;
			arg1 -= local22;
		}
	}

	@OriginalMember(owner = "client!ak", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method159();
	}

	@OriginalMember(owner = "client!ak", name = "d", descriptor = "(I)I")
	public int method167() throws IOException {
		return this.aBoolean16 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!ak", name = "e", descriptor = "(I)V")
	public void method169() throws IOException {
		if (!this.aBoolean16 && this.aBoolean17) {
			this.aBoolean17 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!ak", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label80: {
					@Pc(32) int local32;
					@Pc(43) int local43;
					synchronized (this) {
						if (this.anInt160 == this.anInt166) {
							if (this.aBoolean16) {
								break label80;
							}
							try {
								this.wait();
							} catch (@Pc(20) InterruptedException local20) {
							}
						}
						if (this.anInt160 < this.anInt166) {
							local32 = 5000 - this.anInt166;
						} else {
							local32 = this.anInt160 - this.anInt166;
						}
						local43 = this.anInt166;
					}
					if (local32 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray1, local43, local32);
					} catch (@Pc(60) IOException local60) {
						this.aBoolean17 = true;
					}
					this.anInt166 = (this.anInt166 + local32) % 5000;
					try {
						if (this.anInt160 == this.anInt166) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(85) IOException local85) {
						this.aBoolean17 = true;
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
				} catch (@Pc(109) IOException local109) {
				}
				this.aByteArray1 = null;
				break;
			}
		} catch (@Pc(114) Exception local114) {
			Static346.method5707(null, local114);
		}
	}
}
