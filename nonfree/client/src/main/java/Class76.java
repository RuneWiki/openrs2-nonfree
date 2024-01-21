import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vc")
public final class Class76 implements Runnable {

	@OriginalMember(owner = "client!vc", name = "d", descriptor = "Lclient!gd;")
	private Class22 aClass22_8;

	@OriginalMember(owner = "client!vc", name = "r", descriptor = "[B")
	private byte[] aByteArray42;

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "I")
	private int anInt3187 = 0;

	@OriginalMember(owner = "client!vc", name = "C", descriptor = "Z")
	private boolean aBoolean178 = false;

	@OriginalMember(owner = "client!vc", name = "E", descriptor = "I")
	private int anInt3198 = 0;

	@OriginalMember(owner = "client!vc", name = "w", descriptor = "Z")
	private boolean aBoolean177 = false;

	@OriginalMember(owner = "client!vc", name = "x", descriptor = "Lclient!vb;")
	private final Class75 aClass75_5;

	@OriginalMember(owner = "client!vc", name = "n", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!vc", name = "j", descriptor = "Ljava/io/InputStream;")
	private final InputStream anInputStream1;

	@OriginalMember(owner = "client!vc", name = "i", descriptor = "Ljava/io/OutputStream;")
	private final OutputStream anOutputStream1;

	@OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!vb;)V")
	public Class76(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class75 arg1) throws IOException {
		this.aClass75_5 = arg1;
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V")
	public void method2183() {
		if (this.aBoolean177) {
			return;
		}
		synchronized (this) {
			this.aBoolean177 = true;
			this.notifyAll();
		}
		if (this.aClass22_8 != null) {
			while (this.aClass22_8.anInt1200 == 0) {
				Static40.method783(1L);
			}
			if (this.aClass22_8.anInt1200 == 1) {
				try {
					((Thread) this.aClass22_8.anObject3).join();
				} catch (@Pc(50) InterruptedException local50) {
				}
			}
		}
		this.aClass22_8 = null;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(III[B)V")
	public void method2185(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) throws IOException {
		if (this.aBoolean177) {
			return;
		}
		if (this.aBoolean178) {
			this.aBoolean178 = false;
			throw new IOException();
		}
		if (this.aByteArray42 == null) {
			this.aByteArray42 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(32) int local32 = 0; local32 < arg0; local32++) {
				this.aByteArray42[this.anInt3187] = arg1[local32];
				this.anInt3187 = (this.anInt3187 + 1) % 5000;
				if ((this.anInt3198 + 4900) % 5000 == this.anInt3187) {
					throw new IOException();
				}
			}
			if (this.aClass22_8 == null) {
				this.aClass22_8 = this.aClass75_5.method2174(this, 3);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "(I)I")
	public int method2186() throws IOException {
		return this.aBoolean177 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "([BIII)V")
	public void method2188(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aBoolean177) {
			return;
		}
		while (arg2 > 0) {
			@Pc(14) int local14 = this.anInputStream1.read(arg0, arg1, arg2);
			if (local14 <= 0) {
				throw new EOFException();
			}
			arg1 += local14;
			arg2 -= local14;
		}
	}

	@OriginalMember(owner = "client!vc", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method2183();
	}

	@OriginalMember(owner = "client!vc", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label77: {
					@Pc(44) int local44;
					@Pc(56) int local56;
					synchronized (this) {
						if (this.anInt3198 == this.anInt3187) {
							if (this.aBoolean177) {
								break label77;
							}
							try {
								this.wait();
							} catch (@Pc(28) InterruptedException local28) {
							}
						}
						if (this.anInt3187 < this.anInt3198) {
							local44 = 5000 - this.anInt3198;
						} else {
							local44 = this.anInt3187 - this.anInt3198;
						}
						local56 = this.anInt3198;
					}
					if (local44 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray42, local56, local44);
					} catch (@Pc(73) IOException local73) {
						this.aBoolean178 = true;
					}
					this.anInt3198 = (this.anInt3198 + local44) % 5000;
					try {
						if (this.anInt3198 == this.anInt3187) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(98) IOException local98) {
						this.aBoolean178 = true;
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
				} catch (@Pc(122) IOException local122) {
				}
				this.aByteArray42 = null;
				return;
			}
		} catch (@Pc(127) Exception local127) {
			Static38.method768(local127, null);
		}
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(Z)I")
	public int method2191() throws IOException {
		return this.aBoolean177 ? 0 : this.anInputStream1.available();
	}
}
