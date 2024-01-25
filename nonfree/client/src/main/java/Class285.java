import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qh")
public final class Class285 implements Runnable {

	@OriginalMember(owner = "client!qh", name = "p", descriptor = "Ljava/io/IOException;")
	private IOException anIOException2;

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "I")
	private int anInt8059 = 0;

	@OriginalMember(owner = "client!qh", name = "c", descriptor = "I")
	private int anInt8060 = 0;

	@OriginalMember(owner = "client!qh", name = "q", descriptor = "I")
	private final int anInt8069;

	@OriginalMember(owner = "client!qh", name = "j", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!qh", name = "g", descriptor = "[B")
	private final byte[] aByteArray86;

	@OriginalMember(owner = "client!qh", name = "k", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread6;

	@OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V")
	public Class285(@OriginalArg(0) InputStream arg0, @OriginalArg(1) int arg1) {
		this.anInt8069 = arg1 + 1;
		this.anInputStream1 = arg0;
		this.aByteArray86 = new byte[this.anInt8069];
		this.aThread6 = new Thread(this);
		this.aThread6.setDaemon(true);
		this.aThread6.start();
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)V")
	public void method7049() {
		this.anInputStream1 = new InputStream_Sub1();
	}

	@OriginalMember(owner = "client!qh", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(30) int local30;
			synchronized (this) {
				while (true) {
					if (this.anIOException2 != null) {
						return;
					}
					if (this.anInt8060 == 0) {
						local30 = this.anInt8069 - this.anInt8059 - 1;
					} else if (this.anInt8060 <= this.anInt8059) {
						local30 = this.anInt8069 - this.anInt8059;
					} else {
						local30 = this.anInt8060 - this.anInt8059 - 1;
					}
					if (local30 > 0) {
						break;
					}
					try {
						this.wait();
					} catch (@Pc(60) InterruptedException local60) {
					}
				}
			}
			@Pc(77) int local77;
			try {
				local77 = this.anInputStream1.read(this.aByteArray86, this.anInt8059, local30);
				if (local77 == -1) {
					throw new EOFException();
				}
			} catch (@Pc(85) IOException local85) {
				@Pc(85) IOException local85x = local85;
				synchronized (this) {
					this.anIOException2 = local85x;
					return;
				}
			}
			synchronized (this) {
				this.anInt8059 = (this.anInt8059 + local77) % this.anInt8069;
			}
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Z)V")
	public void method7050() {
		synchronized (this) {
			if (this.anIOException2 == null) {
				this.anIOException2 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread6.join();
		} catch (@Pc(34) InterruptedException local34) {
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(II)Z")
	public boolean method7053(@OriginalArg(1) int arg0) throws IOException {
		if (arg0 <= 0 || this.anInt8069 <= arg0) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(30) int local30;
			if (this.anInt8060 <= this.anInt8059) {
				local30 = this.anInt8059 - this.anInt8060;
			} else {
				local30 = this.anInt8069 + this.anInt8059 - this.anInt8060;
			}
			if (arg0 <= local30) {
				return true;
			} else if (this.anIOException2 == null) {
				this.notifyAll();
				return false;
			} else {
				throw new IOException(this.anIOException2.toString());
			}
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(II[BB)I")
	public int method7055(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		if (arg1 < 0 || arg0 < 0 || arg1 + arg0 > arg2.length) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(41) int local41;
			if (this.anInt8059 >= this.anInt8060) {
				local41 = this.anInt8059 - this.anInt8060;
			} else {
				local41 = this.anInt8059 + this.anInt8069 - this.anInt8060;
			}
			if (local41 < arg1) {
				arg1 = local41;
			}
			if (arg1 == 0 && this.anIOException2 != null) {
				throw new IOException(this.anIOException2.toString());
			}
			if (this.anInt8060 + arg1 > this.anInt8069) {
				@Pc(87) int local87 = this.anInt8069 - this.anInt8060;
				Static684.method5324(this.aByteArray86, this.anInt8060, arg2, arg0, local87);
				Static684.method5324(this.aByteArray86, 0, arg2, arg0 + local87, -local87 + arg1);
			} else {
				Static684.method5324(this.aByteArray86, this.anInt8060, arg2, arg0, arg1);
			}
			this.anInt8060 = (arg1 + this.anInt8060) % this.anInt8069;
			this.notifyAll();
			return arg1;
		}
	}
}
