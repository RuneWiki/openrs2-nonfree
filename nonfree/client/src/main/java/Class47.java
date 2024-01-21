import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!YIKMTKBL")
public final class Class47 implements Runnable {

	@OriginalMember(owner = "client!YIKMTKBL", name = "f", descriptor = "I")
	public int anInt794;

	@OriginalMember(owner = "client!YIKMTKBL", name = "a", descriptor = "Ljava/lang/Object;")
	public Object anObject1 = new Object();

	@OriginalMember(owner = "client!YIKMTKBL", name = "b", descriptor = "[I")
	public int[] anIntArray202 = new int[500];

	@OriginalMember(owner = "client!YIKMTKBL", name = "c", descriptor = "Z")
	public boolean aBoolean189 = true;

	@OriginalMember(owner = "client!YIKMTKBL", name = "e", descriptor = "[I")
	public int[] anIntArray203 = new int[500];

	@OriginalMember(owner = "client!YIKMTKBL", name = "d", descriptor = "Lclient!client;")
	private client aClient4;

	@OriginalMember(owner = "client!YIKMTKBL", name = "<init>", descriptor = "(ILclient!client;)V")
	public Class47(@OriginalArg(0) int arg0, @OriginalArg(1) client arg1) {
		try {
			if (arg0 >= 0) {
				throw new NullPointerException();
			}
			this.aClient4 = arg1;
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("94361, " + arg0 + ", " + arg1 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YIKMTKBL", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean189) {
			@Pc(4) Object local4 = this.anObject1;
			synchronized (this.anObject1) {
				if (this.anInt794 < 500) {
					this.anIntArray203[this.anInt794] = this.aClient4.anInt847;
					this.anIntArray202[this.anInt794] = this.aClient4.anInt848;
					this.anInt794++;
				}
			}
			try {
				Thread.sleep(50L);
			} catch (@Pc(42) Exception local42) {
			}
		}
	}
}
