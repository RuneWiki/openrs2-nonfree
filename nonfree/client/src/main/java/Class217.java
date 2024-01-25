import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!np")
public final class Class217 implements Runnable {

	@OriginalMember(owner = "client!np", name = "q", descriptor = "Ljava/io/IOException;")
	private IOException anIOException2;

	@OriginalMember(owner = "client!np", name = "j", descriptor = "I")
	private int anInt6031 = 0;

	@OriginalMember(owner = "client!np", name = "e", descriptor = "I")
	private int anInt6027 = 0;

	@OriginalMember(owner = "client!np", name = "h", descriptor = "I")
	private final int anInt6029;

	@OriginalMember(owner = "client!np", name = "c", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!np", name = "n", descriptor = "[B")
	private final byte[] aByteArray72;

	@OriginalMember(owner = "client!np", name = "g", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread5;

	@OriginalMember(owner = "client!np", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V")
	public Class217(@OriginalArg(0) InputStream arg0, @OriginalArg(1) int arg1) {
		this.anInt6029 = arg1 + 1;
		this.anInputStream2 = arg0;
		this.aByteArray72 = new byte[this.anInt6029];
		this.aThread5 = new Thread(this);
		this.aThread5.setDaemon(true);
		this.aThread5.start();
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(I)V")
	public void method5135() {
		synchronized (this) {
			if (this.anIOException2 == null) {
				this.anIOException2 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread5.join();
		} catch (@Pc(37) InterruptedException local37) {
		}
	}

	@OriginalMember(owner = "client!np", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(26) int local26;
			synchronized (this) {
				while (true) {
					if (this.anIOException2 != null) {
						return;
					}
					if (this.anInt6031 == 0) {
						local26 = this.anInt6029 - this.anInt6027 - 1;
					} else if (this.anInt6027 > this.anInt6031) {
						local26 = this.anInt6029 - this.anInt6027;
					} else {
						local26 = this.anInt6031 - this.anInt6027 - 1;
					}
					if (local26 > 0) {
						break;
					}
					try {
						this.wait();
					} catch (@Pc(59) InterruptedException local59) {
					}
				}
			}
			@Pc(76) int local76;
			try {
				local76 = this.anInputStream2.read(this.aByteArray72, this.anInt6027, local26);
				if (local76 == -1) {
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
				this.anInt6027 = (this.anInt6027 + local76) % this.anInt6029;
			}
		}
	}

	@OriginalMember(owner = "client!np", name = "b", descriptor = "(I)V")
	public void method5137() {
		this.anInputStream2 = new InputStream_Sub2();
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(III[B)I")
	public int method5139(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (arg1 < 0 || arg0 < 0 || arg1 + arg0 > arg2.length) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(41) int local41;
			if (this.anInt6031 <= this.anInt6027) {
				local41 = this.anInt6027 - this.anInt6031;
			} else {
				local41 = this.anInt6027 + this.anInt6029 - this.anInt6031;
			}
			if (arg1 > local41) {
				arg1 = local41;
			}
			if (arg1 == 0 && this.anIOException2 != null) {
				throw new IOException(this.anIOException2.toString());
			}
			if (this.anInt6031 + arg1 <= this.anInt6029) {
				Static585.method3080(this.aByteArray72, this.anInt6031, arg2, arg0, arg1);
			} else {
				@Pc(98) int local98 = this.anInt6029 - this.anInt6031;
				Static585.method3080(this.aByteArray72, this.anInt6031, arg2, arg0, local98);
				Static585.method3080(this.aByteArray72, 0, arg2, local98 + arg0, -local98 + arg1);
			}
			this.anInt6031 = (arg1 + this.anInt6031) % this.anInt6029;
			this.notifyAll();
			return arg1;
		}
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(ZI)Z")
	public boolean method5140(@OriginalArg(1) int arg0) throws IOException {
		if (arg0 <= 0 || arg0 >= this.anInt6029) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(47) int local47;
			if (this.anInt6027 < this.anInt6031) {
				local47 = this.anInt6029 + this.anInt6027 - this.anInt6031;
			} else {
				local47 = this.anInt6027 - this.anInt6031;
			}
			if (arg0 <= local47) {
				return true;
			} else if (this.anIOException2 == null) {
				return false;
			} else {
				throw new IOException(this.anIOException2.toString());
			}
		}
	}
}
