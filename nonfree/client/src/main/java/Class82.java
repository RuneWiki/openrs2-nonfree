import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ng")
public final class Class82 implements Runnable {

	@OriginalMember(owner = "client!ng", name = "o", descriptor = "[B")
	private byte[] aByteArray44;

	@OriginalMember(owner = "client!ng", name = "r", descriptor = "Lclient!ni;")
	private Class84 aClass84_7;

	@OriginalMember(owner = "client!ng", name = "i", descriptor = "Z")
	private boolean aBoolean268 = false;

	@OriginalMember(owner = "client!ng", name = "p", descriptor = "I")
	private int anInt3161 = 0;

	@OriginalMember(owner = "client!ng", name = "n", descriptor = "I")
	private int anInt3160 = 0;

	@OriginalMember(owner = "client!ng", name = "c", descriptor = "Z")
	private boolean aBoolean267 = false;

	@OriginalMember(owner = "client!ng", name = "g", descriptor = "Lclient!ej;")
	private Class34 aClass34_3;

	@OriginalMember(owner = "client!ng", name = "d", descriptor = "Ljava/net/Socket;")
	private Socket aSocket1;

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!ng", name = "h", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!ej;)V")
	public Class82(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class34 arg1) throws IOException {
		this.aClass34_3 = arg1;
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "(B)I")
	public int method2394() throws IOException {
		return this.aBoolean268 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!ng", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method2395();
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)V")
	public void method2395() {
		if (this.aBoolean268) {
			return;
		}
		synchronized (this) {
			this.aBoolean268 = true;
			this.notifyAll();
		}
		if (this.aClass84_7 != null) {
			while (this.aClass84_7.anInt3171 == 0) {
				Static148.method2431(1L);
			}
			if (this.aClass84_7.anInt3171 == 1) {
				try {
					((Thread) this.aClass84_7.anObject4).join();
				} catch (@Pc(56) InterruptedException local56) {
				}
			}
		}
		this.aClass84_7 = null;
	}

	@OriginalMember(owner = "client!ng", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label80: {
					@Pc(39) int local39;
					@Pc(24) int local24;
					synchronized (this) {
						if (this.anInt3161 == this.anInt3160) {
							if (this.aBoolean268) {
								break label80;
							}
							try {
								this.wait();
							} catch (@Pc(20) InterruptedException local20) {
							}
						}
						local24 = this.anInt3161;
						if (this.anInt3160 < this.anInt3161) {
							local39 = 5000 - this.anInt3161;
						} else {
							local39 = this.anInt3160 - this.anInt3161;
						}
					}
					if (local39 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray44, local24, local39);
					} catch (@Pc(68) IOException local68) {
						this.aBoolean267 = true;
					}
					this.anInt3161 = (local39 + this.anInt3161) % 5000;
					try {
						if (this.anInt3161 == this.anInt3160) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(89) IOException local89) {
						this.aBoolean267 = true;
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
				} catch (@Pc(113) IOException local113) {
				}
				this.aByteArray44 = null;
				break;
			}
		} catch (@Pc(118) Exception local118) {
			Static81.method1384(local118, null);
		}
	}

	@OriginalMember(owner = "client!ng", name = "c", descriptor = "(B)I")
	public int method2397() throws IOException {
		return this.aBoolean268 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IB[BI)V")
	public void method2398(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aBoolean268) {
			return;
		}
		while (arg2 > 0) {
			@Pc(22) int local22 = this.anInputStream1.read(arg1, arg0, arg2);
			if (local22 <= 0) {
				throw new EOFException();
			}
			arg2 -= local22;
			arg0 += local22;
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(II[BI)V")
	public void method2399(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) throws IOException {
		if (this.aBoolean268) {
			return;
		}
		if (this.aBoolean267) {
			this.aBoolean267 = false;
			throw new IOException();
		}
		if (this.aByteArray44 == null) {
			this.aByteArray44 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(40) int local40 = 0; local40 < arg0; local40++) {
				this.aByteArray44[this.anInt3160] = arg1[local40];
				this.anInt3160 = (this.anInt3160 + 1) % 5000;
				if ((this.anInt3161 + 4900) % 5000 == this.anInt3160) {
					throw new IOException();
				}
			}
			if (this.aClass84_7 == null) {
				this.aClass84_7 = this.aClass34_3.method1068(3, this);
			}
			this.notifyAll();
		}
	}
}
