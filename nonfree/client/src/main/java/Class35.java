import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ie")
public final class Class35 implements Runnable {

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "Lclient!vb;")
	private Class70 aClass70_5;

	@OriginalMember(owner = "client!ie", name = "z", descriptor = "[B")
	private byte[] aByteArray10;

	@OriginalMember(owner = "client!ie", name = "g", descriptor = "I")
	private int anInt1409 = 0;

	@OriginalMember(owner = "client!ie", name = "n", descriptor = "Z")
	private boolean aBoolean54 = false;

	@OriginalMember(owner = "client!ie", name = "p", descriptor = "I")
	private int anInt1414 = 0;

	@OriginalMember(owner = "client!ie", name = "k", descriptor = "Z")
	private boolean aBoolean53 = false;

	@OriginalMember(owner = "client!ie", name = "i", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!ie", name = "l", descriptor = "Lclient!ha;")
	private final Class29 aClass29_5;

	@OriginalMember(owner = "client!ie", name = "d", descriptor = "Ljava/io/InputStream;")
	private final InputStream anInputStream1;

	@OriginalMember(owner = "client!ie", name = "v", descriptor = "Ljava/io/OutputStream;")
	private final OutputStream anOutputStream1;

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!ha;)V")
	public Class35(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class29 arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aClass29_5 = arg1;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!ie", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label80: {
					@Pc(41) int local41;
					@Pc(52) int local52;
					synchronized (this) {
						if (this.anInt1409 == this.anInt1414) {
							if (this.aBoolean53) {
								break label80;
							}
							try {
								this.wait();
							} catch (@Pc(24) InterruptedException local24) {
							}
						}
						if (this.anInt1409 <= this.anInt1414) {
							local41 = this.anInt1414 - this.anInt1409;
						} else {
							local41 = 5000 - this.anInt1409;
						}
						local52 = this.anInt1409;
					}
					if (local41 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray10, local52, local41);
					} catch (@Pc(72) IOException local72) {
						this.aBoolean54 = true;
					}
					this.anInt1409 = (local41 + this.anInt1409) % 5000;
					try {
						if (this.anInt1414 == this.anInt1409) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(97) IOException local97) {
						this.aBoolean54 = true;
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
				} catch (@Pc(121) IOException local121) {
				}
				this.aByteArray10 = null;
				break;
			}
		} catch (@Pc(126) Exception local126) {
			Static93.method1558(null, local126);
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)I")
	public int method960() throws IOException {
		return this.aBoolean53 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(I)V")
	public void method961() {
		if (this.aBoolean53) {
			return;
		}
		synchronized (this) {
			this.aBoolean53 = true;
			this.notifyAll();
		}
		if (this.aClass70_5 != null) {
			while (this.aClass70_5.anInt2692 == 0) {
				Static23.method546(1L);
			}
			if (this.aClass70_5.anInt2692 == 1) {
				try {
					((Thread) this.aClass70_5.anObject3).join();
				} catch (@Pc(48) InterruptedException local48) {
				}
			}
		}
		this.aClass70_5 = null;
	}

	@OriginalMember(owner = "client!ie", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method961();
	}

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "(I)I")
	public int method965() throws IOException {
		return this.aBoolean53 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIZ[B)V")
	public void method967(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) throws IOException {
		if (this.aBoolean53) {
			return;
		}
		if (this.aBoolean54) {
			this.aBoolean54 = false;
			throw new IOException();
		}
		if (this.aByteArray10 == null) {
			this.aByteArray10 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(36) int local36 = 0; local36 < arg0; local36++) {
				this.aByteArray10[this.anInt1414] = arg1[local36];
				this.anInt1414 = (this.anInt1414 + 1) % 5000;
				if (this.anInt1414 == (this.anInt1409 + 4900) % 5000) {
					throw new IOException();
				}
			}
			if (this.aClass70_5 == null) {
				this.aClass70_5 = this.aClass29_5.method774(this, 3);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(II[BI)V")
	public void method968(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aBoolean53) {
			return;
		}
		while (arg2 > 0) {
			@Pc(14) int local14 = this.anInputStream1.read(arg1, arg0, arg2);
			if (local14 <= 0) {
				throw new EOFException();
			}
			arg2 -= local14;
			arg0 += local14;
		}
	}
}
