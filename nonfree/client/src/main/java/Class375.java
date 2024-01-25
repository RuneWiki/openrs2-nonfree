import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ws")
public final class Class375 implements Runnable {

	@OriginalMember(owner = "client!ws", name = "c", descriptor = "[B")
	private byte[] aByteArray108;

	@OriginalMember(owner = "client!ws", name = "f", descriptor = "Lclient!sb;")
	private Class301 aClass301_9;

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "Z")
	private boolean aBoolean759 = false;

	@OriginalMember(owner = "client!ws", name = "o", descriptor = "Z")
	private boolean aBoolean760 = false;

	@OriginalMember(owner = "client!ws", name = "m", descriptor = "I")
	private int anInt10669 = 0;

	@OriginalMember(owner = "client!ws", name = "s", descriptor = "I")
	private int anInt10673 = 0;

	@OriginalMember(owner = "client!ws", name = "n", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket2;

	@OriginalMember(owner = "client!ws", name = "v", descriptor = "Lclient!gh;")
	private final Class118 aClass118_6;

	@OriginalMember(owner = "client!ws", name = "w", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!ws", name = "d", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!ws", name = "u", descriptor = "I")
	private final int anInt10675;

	@OriginalMember(owner = "client!ws", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!gh;I)V")
	public Class375(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class118 arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aSocket2 = arg0;
		this.aClass118_6 = arg1;
		this.aSocket2.setSoTimeout(30000);
		this.aSocket2.setTcpNoDelay(true);
		this.anInputStream2 = this.aSocket2.getInputStream();
		this.anOutputStream2 = this.aSocket2.getOutputStream();
		this.anInt10675 = arg2;
	}

	@OriginalMember(owner = "client!ws", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method8605();
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(B)I")
	public int method8604() throws IOException {
		return this.aBoolean760 ? 0 : this.anInputStream2.read();
	}

	@OriginalMember(owner = "client!ws", name = "b", descriptor = "(B)V")
	public void method8605() {
		if (this.aBoolean760) {
			return;
		}
		synchronized (this) {
			this.aBoolean760 = true;
			this.notifyAll();
		}
		if (this.aClass301_9 != null) {
			while (this.aClass301_9.anInt8915 == 0) {
				Static214.method4061(1L);
			}
			if (this.aClass301_9.anInt8915 == 1) {
				try {
					((Thread) this.aClass301_9.anObject18).join();
				} catch (@Pc(54) InterruptedException local54) {
				}
			}
		}
		this.aClass301_9 = null;
	}

	@OriginalMember(owner = "client!ws", name = "c", descriptor = "(B)V")
	public void method8607() {
		if (!this.aBoolean760) {
			this.anInputStream2 = new InputStream_Sub1();
			this.anOutputStream2 = new OutputStream_Sub2();
		}
	}

	@OriginalMember(owner = "client!ws", name = "d", descriptor = "(B)I")
	public int method8608() throws IOException {
		return this.aBoolean760 ? 0 : this.anInputStream2.available();
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "([BIII)V")
	public void method8609(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) throws IOException {
		if (this.aBoolean760) {
			return;
		}
		if (this.aBoolean759) {
			this.aBoolean759 = false;
			throw new IOException();
		}
		if (this.aByteArray108 == null) {
			this.aByteArray108 = new byte[this.anInt10675];
		}
		synchronized (this) {
			for (@Pc(41) int local41 = 0; local41 < arg1; local41++) {
				this.aByteArray108[this.anInt10669] = arg0[local41];
				this.anInt10669 = (this.anInt10669 + 1) % this.anInt10675;
				if (this.anInt10669 == (this.anInt10673 + this.anInt10675 - 100) % this.anInt10675) {
					throw new IOException();
				}
			}
			if (this.aClass301_9 == null) {
				this.aClass301_9 = this.aClass118_6.method3410(3, this);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(I[BZI)V")
	public void method8610(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aBoolean760) {
			return;
		}
		while (arg0 > 0) {
			@Pc(20) int local20 = this.anInputStream2.read(arg1, arg2, arg0);
			if (local20 <= 0) {
				throw new EOFException();
			}
			arg2 += local20;
			arg0 -= local20;
		}
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(Z)V")
	public void method8611() throws IOException {
		if (!this.aBoolean760 && this.aBoolean759) {
			this.aBoolean759 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!ws", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label77: {
					@Pc(41) int local41;
					@Pc(53) int local53;
					synchronized (this) {
						if (this.anInt10673 == this.anInt10669) {
							if (this.aBoolean760) {
								break label77;
							}
							try {
								this.wait();
							} catch (@Pc(24) InterruptedException local24) {
							}
						}
						if (this.anInt10673 > this.anInt10669) {
							local41 = this.anInt10675 - this.anInt10673;
						} else {
							local41 = this.anInt10669 - this.anInt10673;
						}
						local53 = this.anInt10673;
					}
					if (local41 <= 0) {
						continue;
					}
					try {
						this.anOutputStream2.write(this.aByteArray108, local53, local41);
					} catch (@Pc(70) IOException local70) {
						this.aBoolean759 = true;
					}
					this.anInt10673 = (local41 + this.anInt10673) % this.anInt10675;
					try {
						if (this.anInt10673 == this.anInt10669) {
							this.anOutputStream2.flush();
						}
					} catch (@Pc(92) IOException local92) {
						this.aBoolean759 = true;
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
				this.aByteArray108 = null;
				return;
			}
		} catch (@Pc(121) Exception local121) {
			Static596.method8231(null, local121);
		}
	}
}
