import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mr")
public final class Class139 implements Runnable {

	@OriginalMember(owner = "client!mr", name = "f", descriptor = "Z")
	public boolean aBoolean285 = true;

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "Ljava/lang/Object;")
	public final Object anObject3 = new Object();

	@OriginalMember(owner = "client!mr", name = "j", descriptor = "[I")
	public final int[] anIntArray437 = new int[500];

	@OriginalMember(owner = "client!mr", name = "i", descriptor = "[I")
	public final int[] anIntArray436 = new int[500];

	@OriginalMember(owner = "client!mr", name = "h", descriptor = "I")
	public int anInt3718 = 0;

	@OriginalMember(owner = "client!mr", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean285) {
			@Pc(10) Object local10 = this.anObject3;
			synchronized (this.anObject3) {
				if (this.anInt3718 < 500) {
					this.anIntArray437[this.anInt3718] = Static7.anInt149;
					this.anIntArray436[this.anInt3718] = Static79.anInt1449;
					this.anInt3718++;
				}
			}
			Static278.method5283(50L);
		}
	}
}
