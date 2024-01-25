import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!or")
public final class Class257 implements Runnable {

	@OriginalMember(owner = "client!or", name = "c", descriptor = "[B")
	private byte[] aByteArray79;

	@OriginalMember(owner = "client!or", name = "h", descriptor = "Lclient!fg;")
	private Class108 aClass108_7;

	@OriginalMember(owner = "client!or", name = "a", descriptor = "Z")
	private boolean aBoolean459 = false;

	@OriginalMember(owner = "client!or", name = "f", descriptor = "I")
	private int anInt6429 = 0;

	@OriginalMember(owner = "client!or", name = "p", descriptor = "Z")
	private boolean aBoolean460 = false;

	@OriginalMember(owner = "client!or", name = "v", descriptor = "I")
	private int anInt6439 = 0;

	@OriginalMember(owner = "client!or", name = "n", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket2;

	@OriginalMember(owner = "client!or", name = "b", descriptor = "Lclient!mr;")
	private final Class226 aClass226_5;

	@OriginalMember(owner = "client!or", name = "t", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!or", name = "g", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!or", name = "m", descriptor = "I")
	private final int anInt6434;

	@OriginalMember(owner = "client!or", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!mr;I)V")
	public Class257(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class226 arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aSocket2 = arg0;
		this.aClass226_5 = arg1;
		this.aSocket2.setSoTimeout(30000);
		this.aSocket2.setTcpNoDelay(true);
		this.anInputStream2 = this.aSocket2.getInputStream();
		this.anOutputStream2 = this.aSocket2.getOutputStream();
		this.anInt6434 = arg2;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(IIB[B)V")
	public void method5543(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (this.aBoolean459) {
			return;
		}
		while (arg0 > 0) {
			@Pc(23) int local23 = this.anInputStream2.read(arg2, arg1, arg0);
			if (local23 <= 0) {
				throw new EOFException();
			}
			arg0 -= local23;
			arg1 += local23;
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(I)I")
	public int method5544() throws IOException {
		return this.aBoolean459 ? 0 : this.anInputStream2.read();
	}

	@OriginalMember(owner = "client!or", name = "c", descriptor = "(I)V")
	public void method5546() {
		if (!this.aBoolean459) {
			this.anInputStream2 = new InputStream_Sub2();
			this.anOutputStream2 = new OutputStream_Sub2();
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Z)V")
	public void method5548() throws IOException {
		if (!this.aBoolean459 && this.aBoolean460) {
			this.aBoolean460 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(B)V")
	public void method5549() {
		if (this.aBoolean459) {
			return;
		}
		synchronized (this) {
			this.aBoolean459 = true;
			this.notifyAll();
		}
		if (this.aClass108_7 != null) {
			while (this.aClass108_7.anInt2766 == 0) {
				Static444.method6061(1L);
			}
			if (this.aClass108_7.anInt2766 == 1) {
				try {
					((Thread) this.aClass108_7.anObject6).join();
				} catch (@Pc(58) InterruptedException local58) {
				}
			}
		}
		this.aClass108_7 = null;
	}

	@OriginalMember(owner = "client!or", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method5549();
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(IB[BI)V")
	public void method5550(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) throws IOException {
		if (this.aBoolean459) {
			return;
		}
		if (this.aBoolean460) {
			this.aBoolean460 = false;
			throw new IOException();
		}
		if (this.aByteArray79 == null) {
			this.aByteArray79 = new byte[this.anInt6434];
		}
		synchronized (this) {
			for (@Pc(39) int local39 = 0; local39 < arg0; local39++) {
				this.aByteArray79[this.anInt6429] = arg1[local39];
				this.anInt6429 = (this.anInt6429 + 1) % this.anInt6434;
				if (this.anInt6429 == (this.anInt6439 + this.anInt6434 - 100) % this.anInt6434) {
					throw new IOException();
				}
			}
			if (this.aClass108_7 == null) {
				this.aClass108_7 = this.aClass226_5.method4842(this, 3);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!or", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label80: {
					@Pc(36) int local36;
					@Pc(24) int local24;
					synchronized (this) {
						if (this.anInt6429 == this.anInt6439) {
							if (this.aBoolean459) {
								break label80;
							}
							try {
								this.wait();
							} catch (@Pc(20) InterruptedException local20) {
							}
						}
						local24 = this.anInt6439;
						if (this.anInt6429 < this.anInt6439) {
							local36 = this.anInt6434 - this.anInt6439;
						} else {
							local36 = this.anInt6429 - this.anInt6439;
						}
					}
					if (local36 <= 0) {
						continue;
					}
					try {
						this.anOutputStream2.write(this.aByteArray79, local24, local36);
					} catch (@Pc(65) IOException local65) {
						this.aBoolean460 = true;
					}
					this.anInt6439 = (this.anInt6439 + local36) % this.anInt6434;
					try {
						if (this.anInt6429 == this.anInt6439) {
							this.anOutputStream2.flush();
						}
					} catch (@Pc(91) IOException local91) {
						this.aBoolean460 = true;
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
				} catch (@Pc(115) IOException local115) {
				}
				this.aByteArray79 = null;
				break;
			}
		} catch (@Pc(120) Exception local120) {
			Static163.method2447(local120, null);
		}
	}

	@OriginalMember(owner = "client!or", name = "b", descriptor = "(Z)I")
	public int method5551() throws IOException {
		return this.aBoolean459 ? 0 : this.anInputStream2.available();
	}
}
