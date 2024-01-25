import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!th")
public final class Class312 implements Runnable {

	@OriginalMember(owner = "client!th", name = "x", descriptor = "[B")
	private byte[] aByteArray92;

	@OriginalMember(owner = "client!th", name = "A", descriptor = "Lclient!ba;")
	private Class23 aClass23_9;

	@OriginalMember(owner = "client!th", name = "o", descriptor = "Z")
	private boolean aBoolean625 = false;

	@OriginalMember(owner = "client!th", name = "u", descriptor = "Z")
	private boolean aBoolean626 = false;

	@OriginalMember(owner = "client!th", name = "w", descriptor = "I")
	private int anInt8471 = 0;

	@OriginalMember(owner = "client!th", name = "j", descriptor = "I")
	private int anInt8461 = 0;

	@OriginalMember(owner = "client!th", name = "p", descriptor = "Lclient!gba;")
	private final Class114 aClass114_9;

	@OriginalMember(owner = "client!th", name = "c", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket2;

	@OriginalMember(owner = "client!th", name = "z", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!th", name = "b", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!th", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!gba;)V")
	public Class312(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class114 arg1) throws IOException {
		this.aClass114_9 = arg1;
		this.aSocket2 = arg0;
		this.aSocket2.setSoTimeout(30000);
		this.aSocket2.setTcpNoDelay(true);
		this.anInputStream2 = this.aSocket2.getInputStream();
		this.anOutputStream2 = this.aSocket2.getOutputStream();
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(I)V")
	public void method7013() {
		if (this.aBoolean625) {
			return;
		}
		synchronized (this) {
			this.aBoolean625 = true;
			this.notifyAll();
		}
		if (this.aClass23_9 != null) {
			while (this.aClass23_9.anInt875 == 0) {
				Static423.method5918(1L);
			}
			if (this.aClass23_9.anInt875 == 1) {
				try {
					((Thread) this.aClass23_9.anObject1).join();
				} catch (@Pc(48) InterruptedException local48) {
				}
			}
		}
		this.aClass23_9 = null;
	}

	@OriginalMember(owner = "client!th", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method7013();
	}

	@OriginalMember(owner = "client!th", name = "d", descriptor = "(I)V")
	public void method7016() {
		if (!this.aBoolean625) {
			this.anInputStream2 = new InputStream_Sub2();
			this.anOutputStream2 = new OutputStream_Sub1();
		}
	}

	@OriginalMember(owner = "client!th", name = "e", descriptor = "(I)I")
	public int method7017() throws IOException {
		return this.aBoolean625 ? 0 : this.anInputStream2.available();
	}

	@OriginalMember(owner = "client!th", name = "f", descriptor = "(I)V")
	public void method7018() throws IOException {
		if (!this.aBoolean625 && this.aBoolean626) {
			this.aBoolean626 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!th", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label80: {
					@Pc(39) int local39;
					@Pc(28) int local28;
					synchronized (this) {
						if (this.anInt8461 == this.anInt8471) {
							if (this.aBoolean625) {
								break label80;
							}
							try {
								this.wait();
							} catch (@Pc(24) InterruptedException local24) {
							}
						}
						local28 = this.anInt8471;
						if (this.anInt8471 <= this.anInt8461) {
							local39 = this.anInt8461 - this.anInt8471;
						} else {
							local39 = 5000 - this.anInt8471;
						}
					}
					if (local39 <= 0) {
						continue;
					}
					try {
						this.anOutputStream2.write(this.aByteArray92, local28, local39);
					} catch (@Pc(64) IOException local64) {
						this.aBoolean626 = true;
					}
					this.anInt8471 = (local39 + this.anInt8471) % 5000;
					try {
						if (this.anInt8461 == this.anInt8471) {
							this.anOutputStream2.flush();
						}
					} catch (@Pc(85) IOException local85) {
						this.aBoolean626 = true;
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
				} catch (@Pc(109) IOException local109) {
				}
				this.aByteArray92 = null;
				break;
			}
		} catch (@Pc(114) Exception local114) {
			Static259.method4059(null, local114);
		}
	}

	@OriginalMember(owner = "client!th", name = "h", descriptor = "(I)I")
	public int method7020() throws IOException {
		return this.aBoolean625 ? 0 : this.anInputStream2.read();
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(II[BI)V")
	public void method7021(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) throws IOException {
		if (this.aBoolean625) {
			return;
		}
		if (this.aBoolean626) {
			this.aBoolean626 = false;
			throw new IOException();
		}
		if (this.aByteArray92 == null) {
			this.aByteArray92 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(36) int local36 = 0; local36 < arg0; local36++) {
				this.aByteArray92[this.anInt8461] = arg1[local36];
				this.anInt8461 = (this.anInt8461 + 1) % 5000;
				if ((this.anInt8471 + 4900) % 5000 == this.anInt8461) {
					throw new IOException();
				}
			}
			if (this.aClass23_9 == null) {
				this.aClass23_9 = this.aClass114_9.method2498(this, 3);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(II[BI)V")
	public void method7022(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aBoolean625) {
			return;
		}
		while (arg2 > 0) {
			@Pc(19) int local19 = this.anInputStream2.read(arg1, arg0, arg2);
			if (local19 <= 0) {
				throw new EOFException();
			}
			arg0 += local19;
			arg2 -= local19;
		}
	}
}
