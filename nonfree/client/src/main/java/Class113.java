import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fb")
public final class Class113 implements Runnable {

	@OriginalMember(owner = "client!fb", name = "p", descriptor = "Ljava/io/IOException;")
	private IOException anIOException1;

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "I")
	private int anInt3157 = 0;

	@OriginalMember(owner = "client!fb", name = "g", descriptor = "I")
	private int anInt3159 = 0;

	@OriginalMember(owner = "client!fb", name = "k", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!fb", name = "h", descriptor = "I")
	private final int anInt3160;

	@OriginalMember(owner = "client!fb", name = "n", descriptor = "[B")
	private final byte[] aByteArray23;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread4;

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V")
	public Class113(@OriginalArg(0) OutputStream arg0, @OriginalArg(1) int arg1) {
		this.anOutputStream1 = arg0;
		this.anInt3160 = arg1 + 1;
		this.aByteArray23 = new byte[this.anInt3160];
		this.aThread4 = new Thread(this);
		this.aThread4.setDaemon(true);
		this.aThread4.start();
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)V")
	public void method2790() {
		this.anOutputStream1 = new OutputStream_Sub1();
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IBI[B)V")
	public void method2793(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) throws IOException {
		if (arg0 < 0 || arg0 > arg1.length) {
			throw new IOException();
		}
		synchronized (this) {
			if (this.anIOException1 != null) {
				throw new IOException(this.anIOException1.toString());
			}
			@Pc(64) int local64;
			if (this.anInt3159 >= this.anInt3157) {
				local64 = this.anInt3157 + this.anInt3160 - this.anInt3159 - 1;
			} else {
				local64 = this.anInt3157 - this.anInt3159 - 1;
			}
			if (arg0 > local64) {
				throw new IOException("");
			}
			if (this.anInt3160 >= arg0 + this.anInt3159) {
				Static686.method4972(arg1, 0, this.aByteArray23, this.anInt3159, arg0);
			} else {
				@Pc(116) int local116 = this.anInt3160 - this.anInt3159;
				Static686.method4972(arg1, 0, this.aByteArray23, this.anInt3159, local116);
				Static686.method4972(arg1, local116, this.aByteArray23, 0, arg0 - local116);
			}
			this.anInt3159 = (arg0 + this.anInt3159) % this.anInt3160;
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "(B)V")
	public void method2794() {
		synchronized (this) {
			if (this.anIOException1 == null) {
				this.anIOException1 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread4.join();
		} catch (@Pc(37) InterruptedException local37) {
		}
	}

	@OriginalMember(owner = "client!fb", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(31) int local31;
			synchronized (this) {
				while (true) {
					if (this.anIOException1 != null) {
						return;
					}
					if (this.anInt3157 <= this.anInt3159) {
						local31 = this.anInt3159 - this.anInt3157;
					} else {
						local31 = this.anInt3159 + this.anInt3160 - this.anInt3157;
					}
					if (local31 > 0) {
						break;
					}
					try {
						this.wait();
					} catch (@Pc(52) InterruptedException local52) {
					}
				}
			}
			try {
				if (local31 + this.anInt3157 <= this.anInt3160) {
					this.anOutputStream1.write(this.aByteArray23, this.anInt3157, local31);
				} else {
					@Pc(88) int local88 = this.anInt3160 - this.anInt3157;
					this.anOutputStream1.write(this.aByteArray23, this.anInt3157, local88);
					this.anOutputStream1.write(this.aByteArray23, 0, local31 - local88);
				}
			} catch (@Pc(107) IOException local107) {
				@Pc(107) IOException local107x = local107;
				synchronized (this) {
					this.anIOException1 = local107x;
					return;
				}
			}
			synchronized (this) {
				this.anInt3157 = (this.anInt3157 + local31) % this.anInt3160;
			}
		}
	}
}
