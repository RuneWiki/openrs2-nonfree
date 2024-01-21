import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!IJIEJOTK")
public final class Class19 implements Runnable {

	@OriginalMember(owner = "client!IJIEJOTK", name = "a", descriptor = "I")
	public int anInt233;

	@OriginalMember(owner = "client!IJIEJOTK", name = "b", descriptor = "Z")
	public boolean aBoolean82 = true;

	@OriginalMember(owner = "client!IJIEJOTK", name = "c", descriptor = "[I")
	public int[] anIntArray51 = new int[500];

	@OriginalMember(owner = "client!IJIEJOTK", name = "e", descriptor = "[I")
	public int[] anIntArray52 = new int[500];

	@OriginalMember(owner = "client!IJIEJOTK", name = "f", descriptor = "Ljava/lang/Object;")
	public Object anObject1 = new Object();

	@OriginalMember(owner = "client!IJIEJOTK", name = "d", descriptor = "Lclient!client;")
	private client aClient1;

	@OriginalMember(owner = "client!IJIEJOTK", name = "<init>", descriptor = "(ILclient!client;)V")
	public Class19(@OriginalArg(0) int arg0, @OriginalArg(1) client arg1) {
		try {
			this.aClient1 = arg1;
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("61024, " + arg0 + ", " + arg1 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IJIEJOTK", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean82) {
			@Pc(4) Object local4 = this.anObject1;
			synchronized (this.anObject1) {
				if (this.anInt233 < 500) {
					this.anIntArray52[this.anInt233] = this.aClient1.anInt838;
					this.anIntArray51[this.anInt233] = this.aClient1.anInt839;
					this.anInt233++;
				}
			}
			try {
				Thread.sleep(50L);
			} catch (@Pc(42) Exception local42) {
			}
		}
	}
}
