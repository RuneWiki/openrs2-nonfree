import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aa")
public final class Class2 implements Runnable {

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "Lclient!ha;")
	private Class29 aClass29_1;

	@OriginalMember(owner = "client!aa", name = "l", descriptor = "[B")
	private byte[] aByteArray1;

	@OriginalMember(owner = "client!aa", name = "m", descriptor = "Z")
	private boolean aBoolean1 = false;

	@OriginalMember(owner = "client!aa", name = "o", descriptor = "I")
	private int anInt6 = 0;

	@OriginalMember(owner = "client!aa", name = "z", descriptor = "I")
	private int anInt11 = 0;

	@OriginalMember(owner = "client!aa", name = "x", descriptor = "Z")
	private boolean aBoolean2 = false;

	@OriginalMember(owner = "client!aa", name = "d", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!aa", name = "p", descriptor = "Lclient!ih;")
	private final Class39 aClass39_1;

	@OriginalMember(owner = "client!aa", name = "r", descriptor = "Ljava/io/InputStream;")
	private final InputStream anInputStream1;

	@OriginalMember(owner = "client!aa", name = "i", descriptor = "Ljava/io/OutputStream;")
	private final OutputStream anOutputStream1;

	@OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!ih;)V")
	public Class2(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class39 arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aClass39_1 = arg1;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)I")
	public int method10() throws IOException {
		return this.aBoolean1 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!aa", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label80: {
					@Pc(35) int local35;
					@Pc(24) int local24;
					synchronized (this) {
						if (this.anInt11 == this.anInt6) {
							if (this.aBoolean1) {
								break label80;
							}
							try {
								this.wait();
							} catch (@Pc(20) InterruptedException local20) {
							}
						}
						local24 = this.anInt6;
						if (this.anInt11 < this.anInt6) {
							local35 = 5000 - this.anInt6;
						} else {
							local35 = this.anInt11 - this.anInt6;
						}
					}
					if (local35 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray1, local24, local35);
					} catch (@Pc(60) IOException local60) {
						this.aBoolean2 = true;
					}
					this.anInt6 = (this.anInt6 + local35) % 5000;
					try {
						if (this.anInt6 == this.anInt11) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(85) IOException local85) {
						this.aBoolean2 = true;
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
			Static29.method571(local114, null);
		}
	}

	@OriginalMember(owner = "client!aa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method12();
	}

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(B)V")
	public void method12() {
		if (this.aBoolean1) {
			return;
		}
		synchronized (this) {
			this.aBoolean1 = true;
			this.notifyAll();
		}
		if (this.aClass29_1 != null) {
			while (this.aClass29_1.anInt1375 == 0) {
				Static166.method2609(1L);
			}
			if (this.aClass29_1.anInt1375 == 1) {
				try {
					((Thread) this.aClass29_1.anObject2).join();
				} catch (@Pc(58) InterruptedException local58) {
				}
			}
		}
		this.aClass29_1 = null;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "([BZII)V")
	public void method13(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aBoolean1) {
			return;
		}
		while (arg2 > 0) {
			@Pc(19) int local19 = this.anInputStream1.read(arg0, arg1, arg2);
			if (local19 <= 0) {
				throw new EOFException();
			}
			arg1 += local19;
			arg2 -= local19;
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIB[B)V")
	public void method15(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) throws IOException {
		if (this.aBoolean1) {
			return;
		}
		if (this.aBoolean2) {
			this.aBoolean2 = false;
			throw new IOException();
		}
		if (this.aByteArray1 == null) {
			this.aByteArray1 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(36) int local36 = 0; local36 < arg0; local36++) {
				this.aByteArray1[this.anInt11] = arg1[local36];
				this.anInt11 = (this.anInt11 + 1) % 5000;
				if (this.anInt11 == (this.anInt6 + 4900) % 5000) {
					throw new IOException();
				}
			}
			if (this.aClass29_1 == null) {
				this.aClass29_1 = this.aClass39_1.method1232(this, 3);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!aa", name = "d", descriptor = "(B)I")
	public int method16() throws IOException {
		return this.aBoolean1 ? 0 : this.anInputStream1.available();
	}
}
