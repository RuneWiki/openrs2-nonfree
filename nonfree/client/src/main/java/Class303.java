import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!se")
public final class Class303 implements Runnable {

	@OriginalMember(owner = "client!se", name = "l", descriptor = "Lclient!wp;")
	private Class376 aClass376_34;

	@OriginalMember(owner = "client!se", name = "o", descriptor = "[B")
	private byte[] aByteArray90;

	@OriginalMember(owner = "client!se", name = "i", descriptor = "I")
	private int anInt8980 = 0;

	@OriginalMember(owner = "client!se", name = "p", descriptor = "I")
	private int anInt8983 = 0;

	@OriginalMember(owner = "client!se", name = "a", descriptor = "Z")
	private boolean aBoolean757 = false;

	@OriginalMember(owner = "client!se", name = "w", descriptor = "Z")
	private boolean aBoolean758 = false;

	@OriginalMember(owner = "client!se", name = "k", descriptor = "Lclient!nga;")
	private final Class228 aClass228_9;

	@OriginalMember(owner = "client!se", name = "v", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket2;

	@OriginalMember(owner = "client!se", name = "b", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!se", name = "f", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!se", name = "B", descriptor = "I")
	private final int anInt8991;

	@OriginalMember(owner = "client!se", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!nga;I)V")
	public Class303(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class228 arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass228_9 = arg1;
		this.aSocket2 = arg0;
		this.aSocket2.setSoTimeout(30000);
		this.aSocket2.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket2.getInputStream();
		this.anOutputStream2 = this.aSocket2.getOutputStream();
		this.anInt8991 = arg2;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(B)V")
	public void method7396() throws IOException {
		if (!this.aBoolean758 && this.aBoolean757) {
			this.aBoolean757 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(I)I")
	public int method7398() throws IOException {
		return this.aBoolean758 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(II[BB)V")
	public void method7399(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		if (this.aBoolean758) {
			return;
		}
		while (arg0 > 0) {
			@Pc(22) int local22 = this.anInputStream1.read(arg2, arg1, arg0);
			if (local22 <= 0) {
				throw new EOFException();
			}
			arg1 += local22;
			arg0 -= local22;
		}
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(I)I")
	public int method7400() throws IOException {
		return this.aBoolean758 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!se", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method7406();
	}

	@OriginalMember(owner = "client!se", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label77: {
					@Pc(37) int local37;
					@Pc(49) int local49;
					synchronized (this) {
						if (this.anInt8983 == this.anInt8980) {
							if (this.aBoolean758) {
								break label77;
							}
							try {
								this.wait();
							} catch (@Pc(24) InterruptedException local24) {
							}
						}
						if (this.anInt8983 <= this.anInt8980) {
							local37 = this.anInt8980 - this.anInt8983;
						} else {
							local37 = this.anInt8991 - this.anInt8983;
						}
						local49 = this.anInt8983;
					}
					if (local37 <= 0) {
						continue;
					}
					try {
						this.anOutputStream2.write(this.aByteArray90, local49, local37);
					} catch (@Pc(66) IOException local66) {
						this.aBoolean757 = true;
					}
					this.anInt8983 = (local37 + this.anInt8983) % this.anInt8991;
					try {
						if (this.anInt8983 == this.anInt8980) {
							this.anOutputStream2.flush();
						}
					} catch (@Pc(92) IOException local92) {
						this.aBoolean757 = true;
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
					if (this.aSocket2 != null) {
						this.aSocket2.close();
					}
				} catch (@Pc(116) IOException local116) {
				}
				this.aByteArray90 = null;
				return;
			}
		} catch (@Pc(121) Exception local121) {
			Static544.method7724(null, local121);
		}
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(B)V")
	public void method7401() {
		if (!this.aBoolean758) {
			this.anInputStream1 = new InputStream_Sub2();
			this.anOutputStream2 = new OutputStream_Sub1();
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "([BIII)V")
	public void method7404(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) throws IOException {
		if (this.aBoolean758) {
			return;
		}
		if (this.aBoolean757) {
			this.aBoolean757 = false;
			throw new IOException();
		}
		if (this.aByteArray90 == null) {
			this.aByteArray90 = new byte[this.anInt8991];
		}
		synchronized (this) {
			for (@Pc(33) int local33 = 0; local33 < arg1; local33++) {
				this.aByteArray90[this.anInt8980] = arg0[local33];
				this.anInt8980 = (this.anInt8980 + 1) % this.anInt8991;
				if ((this.anInt8983 + this.anInt8991 - 100) % this.anInt8991 == this.anInt8980) {
					throw new IOException();
				}
			}
			if (this.aClass376_34 == null) {
				this.aClass376_34 = this.aClass228_9.method5938(3, this);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Z)V")
	public void method7406() {
		if (this.aBoolean758) {
			return;
		}
		synchronized (this) {
			this.aBoolean758 = true;
			this.notifyAll();
		}
		if (this.aClass376_34 != null) {
			while (this.aClass376_34.anInt10510 == 0) {
				Static500.method7308(1L);
			}
			if (this.aClass376_34.anInt10510 == 1) {
				try {
					((Thread) this.aClass376_34.anObject19).join();
				} catch (@Pc(56) InterruptedException local56) {
				}
			}
		}
		this.aClass376_34 = null;
	}
}
