import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ed")
public final class Class87 implements Runnable {

	@OriginalMember(owner = "client!ed", name = "j", descriptor = "[B")
	private byte[] aByteArray31;

	@OriginalMember(owner = "client!ed", name = "r", descriptor = "Lclient!ot;")
	private Class268 aClass268_4;

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "I")
	private int anInt2436 = 0;

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "Z")
	private boolean aBoolean180 = false;

	@OriginalMember(owner = "client!ed", name = "k", descriptor = "I")
	private int anInt2442 = 0;

	@OriginalMember(owner = "client!ed", name = "n", descriptor = "Z")
	private boolean aBoolean181 = false;

	@OriginalMember(owner = "client!ed", name = "m", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!ed", name = "s", descriptor = "Lclient!cea;")
	private final Class48 aClass48_3;

	@OriginalMember(owner = "client!ed", name = "v", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!ed", name = "p", descriptor = "I")
	private final int anInt2445;

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!cea;I)V")
	public Class87(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class48 arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aSocket1 = arg0;
		this.aClass48_3 = arg1;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream2 = this.aSocket1.getOutputStream();
		this.anInt2445 = arg2;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(I[BII)V")
	public void method2255(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aBoolean181) {
			return;
		}
		while (arg0 > 0) {
			@Pc(14) int local14 = this.anInputStream1.read(arg1, arg2, arg0);
			if (local14 <= 0) {
				throw new EOFException();
			}
			arg0 -= local14;
			arg2 += local14;
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V")
	public void method2257() {
		if (this.aBoolean181) {
			return;
		}
		synchronized (this) {
			this.aBoolean181 = true;
			this.notifyAll();
		}
		if (this.aClass268_4 != null) {
			while (this.aClass268_4.anInt8008 == 0) {
				Static650.method9565(1L);
			}
			if (this.aClass268_4.anInt8008 == 1) {
				try {
					((Thread) this.aClass268_4.anObject19).join();
				} catch (@Pc(58) InterruptedException local58) {
				}
			}
		}
		this.aClass268_4 = null;
	}

	@OriginalMember(owner = "client!ed", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method2257();
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)I")
	public int method2258() throws IOException {
		return this.aBoolean181 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(ZII[B)V")
	public void method2259(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) throws IOException {
		if (this.aBoolean181) {
			return;
		}
		if (this.aBoolean180) {
			this.aBoolean180 = false;
			throw new IOException();
		}
		if (this.aByteArray31 == null) {
			this.aByteArray31 = new byte[this.anInt2445];
		}
		synchronized (this) {
			for (@Pc(33) int local33 = 0; local33 < arg0; local33++) {
				this.aByteArray31[this.anInt2436] = arg1[local33];
				this.anInt2436 = (this.anInt2436 + 1) % this.anInt2445;
				if ((this.anInt2442 + this.anInt2445 - 100) % this.anInt2445 == this.anInt2436) {
					throw new IOException();
				}
			}
			if (this.aClass268_4 == null) {
				this.aClass268_4 = this.aClass48_3.method1317(3, this);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(B)V")
	public void method2260() throws IOException {
		if (!this.aBoolean181 && this.aBoolean180) {
			this.aBoolean180 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!ed", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label77: {
					@Pc(41) int local41;
					@Pc(53) int local53;
					synchronized (this) {
						if (this.anInt2436 == this.anInt2442) {
							if (this.aBoolean181) {
								break label77;
							}
							try {
								this.wait();
							} catch (@Pc(24) InterruptedException local24) {
							}
						}
						if (this.anInt2436 < this.anInt2442) {
							local41 = this.anInt2445 - this.anInt2442;
						} else {
							local41 = this.anInt2436 - this.anInt2442;
						}
						local53 = this.anInt2442;
					}
					if (local41 <= 0) {
						continue;
					}
					try {
						this.anOutputStream2.write(this.aByteArray31, local53, local41);
					} catch (@Pc(70) IOException local70) {
						this.aBoolean180 = true;
					}
					this.anInt2442 = (local41 + this.anInt2442) % this.anInt2445;
					try {
						if (this.anInt2442 == this.anInt2436) {
							this.anOutputStream2.flush();
						}
					} catch (@Pc(92) IOException local92) {
						this.aBoolean180 = true;
					}
					continue;
				}
				try {
					if (this.anInputStream1 != null) {
						this.anInputStream1.close();
					}
					if (this.anOutputStream2 != null) {
						this.anOutputStream2.close();
					}
					if (this.aSocket1 != null) {
						this.aSocket1.close();
					}
				} catch (@Pc(116) IOException local116) {
				}
				this.aByteArray31 = null;
				return;
			}
		} catch (@Pc(121) Exception local121) {
			Static165.method3319(local121, (String) null);
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Z)I")
	public int method2262() throws IOException {
		return this.aBoolean181 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(I)V")
	public void method2263() {
		if (!this.aBoolean181) {
			this.anInputStream1 = new InputStream_Sub2();
			this.anOutputStream2 = new OutputStream_Sub2();
		}
	}
}
