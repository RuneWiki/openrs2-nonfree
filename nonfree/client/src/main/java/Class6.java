import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!d")
public final class Class6 implements Runnable {

	@OriginalMember(owner = "client!d", name = "g", descriptor = "[B")
	private byte[] aByteArray5;

	@OriginalMember(owner = "client!d", name = "h", descriptor = "I")
	private int anInt340;

	@OriginalMember(owner = "client!d", name = "i", descriptor = "I")
	private int anInt341;

	@OriginalMember(owner = "client!d", name = "a", descriptor = "I")
	private int anInt339 = -19523;

	@OriginalMember(owner = "client!d", name = "e", descriptor = "Z")
	private boolean aBoolean78 = false;

	@OriginalMember(owner = "client!d", name = "j", descriptor = "Z")
	private boolean aBoolean79 = false;

	@OriginalMember(owner = "client!d", name = "k", descriptor = "Z")
	private boolean aBoolean80 = false;

	@OriginalMember(owner = "client!d", name = "f", descriptor = "Lclient!a;")
	private Applet_Sub1 anApplet_Sub1_2;

	@OriginalMember(owner = "client!d", name = "d", descriptor = "Ljava/net/Socket;")
	private Socket aSocket1;

	@OriginalMember(owner = "client!d", name = "b", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!d", name = "c", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!d", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!a;I)V")
	public Class6(@OriginalArg(0) Socket arg0, @OriginalArg(1) Applet_Sub1 arg1, @OriginalArg(2) int arg2) throws IOException {
		try {
			this.anApplet_Sub1_2 = arg1;
			this.aSocket1 = arg0;
			if (arg2 != -3154) {
				for (@Pc(24) int local24 = 1; local24 > 0; local24++) {
				}
			}
			this.aSocket1.setSoTimeout(30000);
			this.aSocket1.setTcpNoDelay(true);
			this.anInputStream1 = this.aSocket1.getInputStream();
			this.anOutputStream1 = this.aSocket1.getOutputStream();
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("39795, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "()V")
	public void method201() {
		this.aBoolean78 = true;
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
		} catch (@Pc(22) IOException local22) {
			System.out.println("Error closing stream");
		}
		this.aBoolean79 = false;
		synchronized (this) {
			this.notify();
		}
		this.aByteArray5 = null;
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "()I")
	public int method202() throws IOException {
		return this.aBoolean78 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!d", name = "c", descriptor = "()I")
	public int method203() throws IOException {
		return this.aBoolean78 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "([BII)V")
	public void method204(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aBoolean78) {
			return;
		}
		while (arg2 > 0) {
			@Pc(11) int local11 = this.anInputStream1.read(arg0, arg1, arg2);
			if (local11 <= 0) {
				throw new IOException("EOF");
			}
			arg1 += local11;
			arg2 -= local11;
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(I[BII)V")
	public void method205(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg2 == this.anInt339 && !this.aBoolean78) {
				if (this.aBoolean80) {
					this.aBoolean80 = false;
					throw new IOException("Error in writer thread");
				}
				if (this.aByteArray5 == null) {
					this.aByteArray5 = new byte[5000];
				}
				synchronized (this) {
					for (@Pc(33) int local33 = 0; local33 < arg1; local33++) {
						this.aByteArray5[this.anInt341] = arg0[local33 + 0];
						this.anInt341 = (this.anInt341 + 1) % 5000;
						if (this.anInt341 == (this.anInt340 + 4900) % 5000) {
							throw new IOException("buffer overflow");
						}
					}
					if (!this.aBoolean79) {
						this.aBoolean79 = true;
						this.anApplet_Sub1_2.method73(this, 2);
					}
					this.notify();
				}
			}
		} catch (@Pc(92) RuntimeException local92) {
			signlink.reporterror("11931, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local92.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!d", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean79) {
			@Pc(38) int local38;
			@Pc(27) int local27;
			synchronized (this) {
				if (this.anInt341 == this.anInt340) {
					try {
						this.wait();
					} catch (@Pc(16) InterruptedException local16) {
					}
				}
				if (!this.aBoolean79) {
					return;
				}
				local27 = this.anInt340;
				if (this.anInt341 >= this.anInt340) {
					local38 = this.anInt341 - this.anInt340;
				} else {
					local38 = 5000 - this.anInt340;
				}
			}
			if (local38 > 0) {
				try {
					this.anOutputStream1.write(this.aByteArray5, local27, local38);
				} catch (@Pc(62) IOException local62) {
					this.aBoolean80 = true;
				}
				this.anInt340 = (this.anInt340 + local38) % 5000;
				try {
					if (this.anInt341 == this.anInt340) {
						this.anOutputStream1.flush();
					}
				} catch (@Pc(83) IOException local83) {
					this.aBoolean80 = true;
				}
			}
		}
	}
}
