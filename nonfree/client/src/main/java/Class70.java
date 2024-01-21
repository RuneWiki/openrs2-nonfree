import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sb")
public final class Class70 implements Runnable {

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "Z")
	public boolean aBoolean128 = true;

	@OriginalMember(owner = "client!sb", name = "m", descriptor = "Ljava/lang/Object;")
	public final Object anObject4 = new Object();

	@OriginalMember(owner = "client!sb", name = "u", descriptor = "[I")
	public final int[] anIntArray288 = new int[500];

	@OriginalMember(owner = "client!sb", name = "v", descriptor = "I")
	public int anInt2598 = 0;

	@OriginalMember(owner = "client!sb", name = "x", descriptor = "[I")
	public final int[] anIntArray289 = new int[500];

	@OriginalMember(owner = "client!sb", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean128) {
			@Pc(6) Object local6 = this.anObject4;
			synchronized (this.anObject4) {
				if (this.anInt2598 < 500) {
					this.anIntArray289[this.anInt2598] = Static88.anInt2198;
					this.anIntArray288[this.anInt2598] = Static73.anInt1769;
					this.anInt2598++;
				}
			}
			Static125.method2177(50L);
		}
	}
}
