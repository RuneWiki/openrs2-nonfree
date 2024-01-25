import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qu")
public final class Class295 implements Runnable {

	@OriginalMember(owner = "client!qu", name = "l", descriptor = "Lclient!tba;")
	private Class331 aClass331_9;

	@OriginalMember(owner = "client!qu", name = "n", descriptor = "[B")
	private byte[] aByteArray78;

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "I")
	private int anInt8262 = 0;

	@OriginalMember(owner = "client!qu", name = "j", descriptor = "I")
	private int anInt8268 = 0;

	@OriginalMember(owner = "client!qu", name = "b", descriptor = "Z")
	private boolean aBoolean703 = false;

	@OriginalMember(owner = "client!qu", name = "p", descriptor = "Z")
	private boolean aBoolean704 = false;

	@OriginalMember(owner = "client!qu", name = "e", descriptor = "Lclient!oq;")
	private final Class268 aClass268_4;

	@OriginalMember(owner = "client!qu", name = "q", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket2;

	@OriginalMember(owner = "client!qu", name = "r", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!qu", name = "k", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!qu", name = "h", descriptor = "I")
	private final int anInt8266;

	@OriginalMember(owner = "client!qu", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!oq;I)V")
	public Class295(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class268 arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass268_4 = arg1;
		this.aSocket2 = arg0;
		this.aSocket2.setSoTimeout(30000);
		this.aSocket2.setTcpNoDelay(true);
		this.anInputStream2 = this.aSocket2.getInputStream();
		this.anOutputStream2 = this.aSocket2.getOutputStream();
		this.anInt8266 = arg2;
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(B)I")
	public int method7073() throws IOException {
		return this.aBoolean703 ? 0 : this.anInputStream2.read();
	}

	@OriginalMember(owner = "client!qu", name = "b", descriptor = "(B)V")
	public void method7076() {
		if (!this.aBoolean703) {
			this.anInputStream2 = new InputStream_Sub2();
			this.anOutputStream2 = new OutputStream_Sub2();
		}
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "([BZII)V")
	public void method7078(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) throws IOException {
		if (this.aBoolean703) {
			return;
		}
		if (this.aBoolean704) {
			this.aBoolean704 = false;
			throw new IOException();
		}
		if (this.aByteArray78 == null) {
			this.aByteArray78 = new byte[this.anInt8266];
		}
		synchronized (this) {
			for (@Pc(31) int local31 = 0; local31 < arg1; local31++) {
				this.aByteArray78[this.anInt8268] = arg0[local31];
				this.anInt8268 = (this.anInt8268 + 1) % this.anInt8266;
				if ((this.anInt8262 + this.anInt8266 - 100) % this.anInt8266 == this.anInt8268) {
					throw new IOException();
				}
			}
			if (this.aClass331_9 == null) {
				this.aClass331_9 = this.aClass268_4.method6340(this, 3);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!qu", name = "c", descriptor = "(B)V")
	public void method7079() throws IOException {
		if (!this.aBoolean703 && this.aBoolean704) {
			this.aBoolean704 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!qu", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label77: {
					@Pc(41) int local41;
					@Pc(53) int local53;
					synchronized (this) {
						if (this.anInt8262 == this.anInt8268) {
							if (this.aBoolean703) {
								break label77;
							}
							try {
								this.wait();
							} catch (@Pc(28) InterruptedException local28) {
							}
						}
						if (this.anInt8262 <= this.anInt8268) {
							local41 = this.anInt8268 - this.anInt8262;
						} else {
							local41 = this.anInt8266 - this.anInt8262;
						}
						local53 = this.anInt8262;
					}
					if (local41 <= 0) {
						continue;
					}
					try {
						this.anOutputStream2.write(this.aByteArray78, local53, local41);
					} catch (@Pc(73) IOException local73) {
						this.aBoolean704 = true;
					}
					this.anInt8262 = (this.anInt8262 + local41) % this.anInt8266;
					try {
						if (this.anInt8262 == this.anInt8268) {
							this.anOutputStream2.flush();
						}
					} catch (@Pc(96) IOException local96) {
						this.aBoolean704 = true;
					}
					continue;
				}
				try {
					if (this.anInputStream2 != null) {
						this.anInputStream2.close();
					}
					if (this.anOutputStream2 != null) {
						this.anOutputStream2.close();
					}
					if (this.aSocket2 != null) {
						this.aSocket2.close();
					}
				} catch (@Pc(120) IOException local120) {
				}
				this.aByteArray78 = null;
				return;
			}
		} catch (@Pc(125) Exception local125) {
			Static234.method3615(local125, (String) null);
		}
	}

	@OriginalMember(owner = "client!qu", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method7082();
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(II[BI)V")
	public void method7080(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aBoolean703) {
			return;
		}
		while (arg0 > 0) {
			@Pc(19) int local19 = this.anInputStream2.read(arg1, arg2, arg0);
			if (local19 <= 0) {
				throw new EOFException();
			}
			arg0 -= local19;
			arg2 += local19;
		}
	}

	@OriginalMember(owner = "client!qu", name = "b", descriptor = "(I)I")
	public int method7081() throws IOException {
		return this.aBoolean703 ? 0 : this.anInputStream2.available();
	}

	@OriginalMember(owner = "client!qu", name = "c", descriptor = "(I)V")
	public void method7082() {
		if (this.aBoolean703) {
			return;
		}
		synchronized (this) {
			this.aBoolean703 = true;
			this.notifyAll();
		}
		if (this.aClass331_9 != null) {
			while (this.aClass331_9.anInt9108 == 0) {
				Static579.method8004(1L);
			}
			if (this.aClass331_9.anInt9108 == 1) {
				try {
					((Thread) this.aClass331_9.anObject20).join();
				} catch (@Pc(56) InterruptedException local56) {
				}
			}
		}
		this.aClass331_9 = null;
	}
}
