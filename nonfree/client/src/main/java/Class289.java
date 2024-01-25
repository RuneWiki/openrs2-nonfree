import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qk")
public final class Class289 implements Runnable {

	@OriginalMember(owner = "client!qk", name = "c", descriptor = "[B")
	private byte[] aByteArray87;

	@OriginalMember(owner = "client!qk", name = "t", descriptor = "Lclient!eba;")
	private Class81 aClass81_7;

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "Z")
	private boolean aBoolean615 = false;

	@OriginalMember(owner = "client!qk", name = "i", descriptor = "I")
	private int anInt8124 = 0;

	@OriginalMember(owner = "client!qk", name = "o", descriptor = "Z")
	private boolean aBoolean616 = false;

	@OriginalMember(owner = "client!qk", name = "w", descriptor = "I")
	private int anInt8133 = 0;

	@OriginalMember(owner = "client!qk", name = "v", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket2;

	@OriginalMember(owner = "client!qk", name = "d", descriptor = "Lclient!qn;")
	private final Class291 aClass291_5;

	@OriginalMember(owner = "client!qk", name = "n", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!qk", name = "x", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!qk", name = "u", descriptor = "I")
	private final int anInt8132;

	@OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!qn;I)V")
	public Class289(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class291 arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aSocket2 = arg0;
		this.aClass291_5 = arg1;
		this.aSocket2.setSoTimeout(30000);
		this.aSocket2.setTcpNoDelay(true);
		this.anInputStream2 = this.aSocket2.getInputStream();
		this.anOutputStream2 = this.aSocket2.getOutputStream();
		this.anInt8132 = arg2;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)V")
	public void method7097() {
		if (this.aBoolean615) {
			return;
		}
		synchronized (this) {
			this.aBoolean615 = true;
			this.notifyAll();
		}
		if (this.aClass81_7 != null) {
			while (this.aClass81_7.anInt2532 == 0) {
				Static373.method5403(1L);
			}
			if (this.aClass81_7.anInt2532 == 1) {
				try {
					((Thread) this.aClass81_7.anObject4).join();
				} catch (@Pc(58) InterruptedException local58) {
				}
			}
		}
		this.aClass81_7 = null;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(III[B)V")
	public void method7098(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (this.aBoolean615) {
			return;
		}
		while (arg1 > 0) {
			@Pc(14) int local14 = this.anInputStream2.read(arg2, arg0, arg1);
			if (local14 <= 0) {
				throw new EOFException();
			}
			arg0 += local14;
			arg1 -= local14;
		}
	}

	@OriginalMember(owner = "client!qk", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label80: {
					@Pc(37) int local37;
					@Pc(49) int local49;
					synchronized (this) {
						if (this.anInt8133 == this.anInt8124) {
							if (this.aBoolean615) {
								break label80;
							}
							try {
								this.wait();
							} catch (@Pc(20) InterruptedException local20) {
							}
						}
						if (this.anInt8133 >= this.anInt8124) {
							local37 = this.anInt8133 - this.anInt8124;
						} else {
							local37 = this.anInt8132 - this.anInt8124;
						}
						local49 = this.anInt8124;
					}
					if (local37 <= 0) {
						continue;
					}
					try {
						this.anOutputStream2.write(this.aByteArray87, local49, local37);
					} catch (@Pc(66) IOException local66) {
						this.aBoolean616 = true;
					}
					this.anInt8124 = (this.anInt8124 + local37) % this.anInt8132;
					try {
						if (this.anInt8124 == this.anInt8133) {
							this.anOutputStream2.flush();
						}
					} catch (@Pc(92) IOException local92) {
						this.aBoolean616 = true;
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
				} catch (@Pc(116) IOException local116) {
				}
				this.aByteArray87 = null;
				break;
			}
		} catch (@Pc(121) Exception local121) {
			Static503.method7153((String) null, local121);
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(I[BII)V")
	public void method7099(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) throws IOException {
		if (this.aBoolean615) {
			return;
		}
		if (this.aBoolean616) {
			this.aBoolean616 = false;
			throw new IOException();
		}
		if (this.aByteArray87 == null) {
			this.aByteArray87 = new byte[this.anInt8132];
		}
		synchronized (this) {
			for (@Pc(33) int local33 = 0; local33 < arg0; local33++) {
				this.aByteArray87[this.anInt8133] = arg1[local33];
				this.anInt8133 = (this.anInt8133 + 1) % this.anInt8132;
				if (this.anInt8133 == (this.anInt8132 + this.anInt8124 - 100) % this.anInt8132) {
					throw new IOException();
				}
			}
			if (this.aClass81_7 == null) {
				this.aClass81_7 = this.aClass291_5.method7136(this, 3);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(B)I")
	public int method7100() throws IOException {
		return this.aBoolean615 ? 0 : this.anInputStream2.read();
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(Z)V")
	public void method7101() {
		if (!this.aBoolean615) {
			this.anInputStream2 = new InputStream_Sub2();
			this.anOutputStream2 = new OutputStream_Sub1();
		}
	}

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "(B)I")
	public int method7105() throws IOException {
		return this.aBoolean615 ? 0 : this.anInputStream2.available();
	}

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "(I)V")
	public void method7106() throws IOException {
		if (!this.aBoolean615 && this.aBoolean616) {
			this.aBoolean616 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!qk", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method7097();
	}
}
