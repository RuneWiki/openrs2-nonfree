import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fg")
public final class Class33 implements Runnable {

	@OriginalMember(owner = "client!fg", name = "n", descriptor = "Lclient!ef;")
	private Class29 aClass29_3;

	@OriginalMember(owner = "client!fg", name = "A", descriptor = "[B")
	private byte[] aByteArray7;

	@OriginalMember(owner = "client!fg", name = "c", descriptor = "Z")
	private boolean aBoolean75 = false;

	@OriginalMember(owner = "client!fg", name = "e", descriptor = "I")
	private int anInt1269 = 0;

	@OriginalMember(owner = "client!fg", name = "t", descriptor = "Z")
	private boolean aBoolean77 = false;

	@OriginalMember(owner = "client!fg", name = "p", descriptor = "I")
	private int anInt1275 = 0;

	@OriginalMember(owner = "client!fg", name = "h", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!fg", name = "w", descriptor = "Lclient!ja;")
	private final Class47 aClass47_2;

	@OriginalMember(owner = "client!fg", name = "z", descriptor = "Ljava/io/InputStream;")
	private final InputStream anInputStream1;

	@OriginalMember(owner = "client!fg", name = "f", descriptor = "Ljava/io/OutputStream;")
	private final OutputStream anOutputStream1;

	@OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!ja;)V")
	public Class33(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class47 arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aClass47_2 = arg1;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "([BBII)V")
	public void method917(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aBoolean75) {
			return;
		}
		while (arg1 > 0) {
			@Pc(18) int local18 = this.anInputStream1.read(arg0, arg2, arg1);
			if (local18 <= 0) {
				throw new EOFException();
			}
			arg2 += local18;
			arg1 -= local18;
		}
	}

	@OriginalMember(owner = "client!fg", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label77: {
					@Pc(44) int local44;
					@Pc(32) int local32;
					synchronized (this) {
						if (this.anInt1275 == this.anInt1269) {
							if (this.aBoolean75) {
								break label77;
							}
							try {
								this.wait();
							} catch (@Pc(28) InterruptedException local28) {
							}
						}
						local32 = this.anInt1275;
						if (this.anInt1275 <= this.anInt1269) {
							local44 = this.anInt1269 - this.anInt1275;
						} else {
							local44 = 5000 - this.anInt1275;
						}
					}
					if (local44 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray7, local32, local44);
					} catch (@Pc(72) IOException local72) {
						this.aBoolean77 = true;
					}
					this.anInt1275 = (local44 + this.anInt1275) % 5000;
					try {
						if (this.anInt1269 == this.anInt1275) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(97) IOException local97) {
						this.aBoolean77 = true;
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
				this.aByteArray7 = null;
				return;
			}
		} catch (@Pc(126) Exception local126) {
			Static208.method1860(null, local126);
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)I")
	public int method920() throws IOException {
		return this.aBoolean75 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "(I)I")
	public int method922() throws IOException {
		return this.aBoolean75 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!fg", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method925();
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(I[BII)V")
	public void method924(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) throws IOException {
		if (this.aBoolean75) {
			return;
		}
		if (this.aBoolean77) {
			this.aBoolean77 = false;
			throw new IOException();
		}
		if (this.aByteArray7 == null) {
			this.aByteArray7 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(30) int local30 = 0; local30 < arg0; local30++) {
				this.aByteArray7[this.anInt1269] = arg1[local30];
				this.anInt1269 = (this.anInt1269 + 1) % 5000;
				if (this.anInt1269 == (this.anInt1275 + 4900) % 5000) {
					throw new IOException();
				}
			}
			if (this.aClass29_3 == null) {
				this.aClass29_3 = this.aClass47_2.method1363(this, 3);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!fg", name = "c", descriptor = "(I)V")
	public void method925() {
		if (this.aBoolean75) {
			return;
		}
		synchronized (this) {
			this.aBoolean75 = true;
			this.notifyAll();
		}
		if (this.aClass29_3 != null) {
			while (this.aClass29_3.anInt973 == 0) {
				Static119.method1720(1L);
			}
			if (this.aClass29_3.anInt973 == 1) {
				try {
					((Thread) this.aClass29_3.anObject2).join();
				} catch (@Pc(56) InterruptedException local56) {
				}
			}
		}
		this.aClass29_3 = null;
	}
}
