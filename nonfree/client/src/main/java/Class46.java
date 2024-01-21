import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!j")
public final class Class46 implements Runnable {

	@OriginalMember(owner = "client!j", name = "a", descriptor = "Z")
	public boolean aBoolean101 = true;

	@OriginalMember(owner = "client!j", name = "e", descriptor = "Ljava/lang/Object;")
	public final Object anObject4 = new Object();

	@OriginalMember(owner = "client!j", name = "l", descriptor = "I")
	public int anInt1967 = 0;

	@OriginalMember(owner = "client!j", name = "m", descriptor = "[I")
	public final int[] anIntArray109 = new int[500];

	@OriginalMember(owner = "client!j", name = "n", descriptor = "[I")
	public final int[] anIntArray110 = new int[500];

	@OriginalMember(owner = "client!j", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean101) {
			@Pc(6) Object local6 = this.anObject4;
			synchronized (this.anObject4) {
				if (this.anInt1967 < 500) {
					this.anIntArray109[this.anInt1967] = Static8.anInt187;
					this.anIntArray110[this.anInt1967] = Static167.anInt3403;
					this.anInt1967++;
				}
			}
			Static119.method1720(50L);
		}
	}
}
