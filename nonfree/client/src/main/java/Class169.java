import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ub")
public final class Class169 implements Runnable {

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "Z")
	private boolean aBoolean330 = true;

	@OriginalMember(owner = "client!ub", name = "m", descriptor = "Ljava/lang/Object;")
	public Object anObject7 = new Object();

	@OriginalMember(owner = "client!ub", name = "p", descriptor = "[I")
	public int[] anIntArray445 = new int[500];

	@OriginalMember(owner = "client!ub", name = "q", descriptor = "[I")
	public int[] anIntArray446 = new int[500];

	@OriginalMember(owner = "client!ub", name = "r", descriptor = "I")
	public int anInt4990 = 0;

	@OriginalMember(owner = "client!ub", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean330) {
			@Pc(8) Object local8 = this.anObject7;
			synchronized (this.anObject7) {
				if (this.anInt4990 < 500) {
					this.anIntArray446[this.anInt4990] = Static72.anInt1326;
					this.anIntArray445[this.anInt4990] = Static117.anInt2589;
					this.anInt4990++;
				}
			}
			Static122.method2061(50L);
		}
	}
}
