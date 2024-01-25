import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wca")
public final class Class368 implements Runnable {

	@OriginalMember(owner = "client!wca", name = "l", descriptor = "Ljava/io/IOException;")
	private IOException anIOException2;

	@OriginalMember(owner = "client!wca", name = "j", descriptor = "I")
	private int anInt10020 = 0;

	@OriginalMember(owner = "client!wca", name = "h", descriptor = "I")
	private int anInt10019 = 0;

	@OriginalMember(owner = "client!wca", name = "k", descriptor = "I")
	private final int anInt10021;

	@OriginalMember(owner = "client!wca", name = "i", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!wca", name = "m", descriptor = "[B")
	private final byte[] aByteArray105;

	@OriginalMember(owner = "client!wca", name = "c", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread7;

	@OriginalMember(owner = "client!wca", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V")
	public Class368(@OriginalArg(0) OutputStream arg0, @OriginalArg(1) int arg1) {
		this.anInt10021 = arg1 + 1;
		this.anOutputStream2 = arg0;
		this.aByteArray105 = new byte[this.anInt10021];
		this.aThread7 = new Thread(this);
		this.aThread7.setDaemon(true);
		this.aThread7.start();
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(I[BIZ)V")
	public void method8586(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) throws IOException {
		if (arg1 < 0 || arg1 > arg0.length) {
			throw new IOException();
		}
		synchronized (this) {
			if (this.anIOException2 != null) {
				throw new IOException(this.anIOException2.toString());
			}
			@Pc(59) int local59;
			if (this.anInt10020 >= this.anInt10019) {
				local59 = this.anInt10019 + this.anInt10021 - this.anInt10020 - 1;
			} else {
				local59 = this.anInt10019 - this.anInt10020 - 1;
			}
			if (arg1 > local59) {
				throw new IOException("");
			}
			if (this.anInt10020 + arg1 <= this.anInt10021) {
				Static653.method6858(arg0, 0, this.aByteArray105, this.anInt10020, arg1);
			} else {
				@Pc(115) int local115 = this.anInt10021 - this.anInt10020;
				Static653.method6858(arg0, 0, this.aByteArray105, this.anInt10020, local115);
				Static653.method6858(arg0, local115, this.aByteArray105, 0, arg1 - local115);
			}
			this.anInt10020 = (arg1 + this.anInt10020) % this.anInt10021;
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(B)V")
	public void method8588() {
		synchronized (this) {
			if (this.anIOException2 == null) {
				this.anIOException2 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread7.join();
		} catch (@Pc(29) InterruptedException local29) {
		}
	}

	@OriginalMember(owner = "client!wca", name = "b", descriptor = "(Z)V")
	public void method8589() {
		this.anOutputStream2 = new OutputStream_Sub2();
	}

	@OriginalMember(owner = "client!wca", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(31) int local31;
			synchronized (this) {
				while (true) {
					if (this.anIOException2 != null) {
						return;
					}
					if (this.anInt10019 <= this.anInt10020) {
						local31 = this.anInt10020 - this.anInt10019;
					} else {
						local31 = this.anInt10021 + this.anInt10020 - this.anInt10019;
					}
					if (local31 > 0) {
						break;
					}
					try {
						this.wait();
					} catch (@Pc(53) InterruptedException local53) {
					}
				}
			}
			try {
				if (this.anInt10021 >= this.anInt10019 + local31) {
					this.anOutputStream2.write(this.aByteArray105, this.anInt10019, local31);
				} else {
					@Pc(89) int local89 = this.anInt10021 - this.anInt10019;
					this.anOutputStream2.write(this.aByteArray105, this.anInt10019, local89);
					this.anOutputStream2.write(this.aByteArray105, 0, local31 - local89);
				}
			} catch (@Pc(109) IOException local109) {
				@Pc(109) IOException local109x = local109;
				synchronized (this) {
					this.anIOException2 = local109x;
					return;
				}
			}
			synchronized (this) {
				this.anInt10019 = (local31 + this.anInt10019) % this.anInt10021;
			}
		}
	}
}
