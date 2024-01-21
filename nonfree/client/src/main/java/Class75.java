import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!v")
public final class Class75 implements Runnable {

	@OriginalMember(owner = "client!v", name = "b", descriptor = "Z")
	public boolean aBoolean236 = true;

	@OriginalMember(owner = "client!v", name = "e", descriptor = "Ljava/lang/Object;")
	public final Object anObject4 = new Object();

	@OriginalMember(owner = "client!v", name = "x", descriptor = "[I")
	public final int[] anIntArray465 = new int[500];

	@OriginalMember(owner = "client!v", name = "z", descriptor = "I")
	public int anInt2970 = 0;

	@OriginalMember(owner = "client!v", name = "v", descriptor = "[I")
	public final int[] anIntArray464 = new int[500];

	@OriginalMember(owner = "client!v", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean236) {
			@Pc(10) Object local10 = this.anObject4;
			synchronized (this.anObject4) {
				if (this.anInt2970 < 500) {
					this.anIntArray464[this.anInt2970] = Static29.anInt971;
					this.anIntArray465[this.anInt2970] = Static3.anInt150;
					this.anInt2970++;
				}
			}
			Static96.method1616(50L);
		}
	}
}
