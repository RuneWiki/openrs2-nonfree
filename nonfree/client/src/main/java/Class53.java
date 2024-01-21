import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!of")
public final class Class53 implements Runnable {

	@OriginalMember(owner = "client!of", name = "e", descriptor = "Z")
	public boolean aBoolean135 = true;

	@OriginalMember(owner = "client!of", name = "t", descriptor = "Ljava/lang/Object;")
	public final Object anObject4 = new Object();

	@OriginalMember(owner = "client!of", name = "v", descriptor = "[I")
	public final int[] anIntArray293 = new int[500];

	@OriginalMember(owner = "client!of", name = "x", descriptor = "[I")
	public final int[] anIntArray294 = new int[500];

	@OriginalMember(owner = "client!of", name = "w", descriptor = "I")
	public int anInt2452 = 0;

	@OriginalMember(owner = "client!of", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean135) {
			@Pc(6) Object local6 = this.anObject4;
			synchronized (this.anObject4) {
				if (this.anInt2452 < 500) {
					this.anIntArray294[this.anInt2452] = Static59.anInt1807;
					this.anIntArray293[this.anInt2452] = Static7.anInt187;
					this.anInt2452++;
				}
			}
			Static40.method783(50L);
		}
	}
}
