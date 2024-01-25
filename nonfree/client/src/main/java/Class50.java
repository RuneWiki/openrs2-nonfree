import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cf")
public final class Class50 implements Runnable {

	@OriginalMember(owner = "client!cf", name = "f", descriptor = "Ljava/io/IOException;")
	private IOException anIOException1;

	@OriginalMember(owner = "client!cf", name = "e", descriptor = "I")
	private int anInt1103 = 0;

	@OriginalMember(owner = "client!cf", name = "i", descriptor = "I")
	private int anInt1105 = 0;

	@OriginalMember(owner = "client!cf", name = "h", descriptor = "I")
	private final int anInt1104;

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!cf", name = "g", descriptor = "[B")
	private final byte[] aByteArray5;

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	@OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V")
	public Class50(@OriginalArg(0) OutputStream arg0, @OriginalArg(1) int arg1) {
		this.anInt1104 = arg1 + 1;
		this.anOutputStream1 = arg0;
		this.aByteArray5 = new byte[this.anInt1104];
		this.aThread1 = new Thread(this);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(III[B)V")
	public void method910(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) throws IOException {
		if (arg0 < 0 || arg0 > arg1.length) {
			throw new IOException();
		}
		synchronized (this) {
			if (this.anIOException1 != null) {
				throw new IOException(this.anIOException1.toString());
			}
			@Pc(56) int local56;
			if (this.anInt1103 >= this.anInt1105) {
				local56 = this.anInt1105 + this.anInt1104 - this.anInt1103 - 1;
			} else {
				local56 = this.anInt1105 - this.anInt1103 - 1;
			}
			if (local56 < arg0) {
				throw new IOException("");
			}
			if (this.anInt1103 + arg0 <= this.anInt1104) {
				Static596.method7719(arg1, 0, this.aByteArray5, this.anInt1103, arg0);
			} else {
				@Pc(104) int local104 = this.anInt1104 - this.anInt1103;
				Static596.method7719(arg1, 0, this.aByteArray5, this.anInt1103, local104);
				Static596.method7719(arg1, local104, this.aByteArray5, 0, arg0 - local104);
			}
			this.anInt1103 = (this.anInt1103 + arg0) % this.anInt1104;
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)V")
	public void method911() {
		synchronized (this) {
			if (this.anIOException1 == null) {
				this.anIOException1 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(35) InterruptedException local35) {
		}
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(B)V")
	public void method912() {
		this.anOutputStream1 = new OutputStream_Sub1();
	}

	@OriginalMember(owner = "client!cf", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(31) int local31;
			synchronized (this) {
				while (true) {
					if (this.anIOException1 != null) {
						return;
					}
					if (this.anInt1105 <= this.anInt1103) {
						local31 = this.anInt1103 - this.anInt1105;
					} else {
						local31 = this.anInt1103 + this.anInt1104 - this.anInt1105;
					}
					if (local31 > 0) {
						break;
					}
					try {
						this.wait();
					} catch (@Pc(49) InterruptedException local49) {
					}
				}
			}
			try {
				if (this.anInt1104 < local31 + this.anInt1105) {
					@Pc(75) int local75 = this.anInt1104 - this.anInt1105;
					this.anOutputStream1.write(this.aByteArray5, this.anInt1105, local75);
					this.anOutputStream1.write(this.aByteArray5, 0, local31 - local75);
				} else {
					this.anOutputStream1.write(this.aByteArray5, this.anInt1105, local31);
				}
			} catch (@Pc(104) IOException local104) {
				@Pc(104) IOException local104x = local104;
				synchronized (this) {
					this.anIOException1 = local104x;
					return;
				}
			}
			synchronized (this) {
				this.anInt1105 = (this.anInt1105 + local31) % this.anInt1104;
			}
		}
	}
}
