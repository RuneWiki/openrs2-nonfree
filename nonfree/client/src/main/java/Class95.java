import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ik")
public final class Class95 implements Runnable {

	@OriginalMember(owner = "client!ik", name = "g", descriptor = "Z")
	public boolean aBoolean155 = true;

	@OriginalMember(owner = "client!ik", name = "d", descriptor = "Ljava/lang/Object;")
	public final Object anObject5 = new Object();

	@OriginalMember(owner = "client!ik", name = "i", descriptor = "I")
	public int anInt2770 = 0;

	@OriginalMember(owner = "client!ik", name = "k", descriptor = "[I")
	public final int[] anIntArray185 = new int[500];

	@OriginalMember(owner = "client!ik", name = "j", descriptor = "[I")
	public final int[] anIntArray184 = new int[500];

	@OriginalMember(owner = "client!ik", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean155) {
			@Pc(10) Object local10 = this.anObject5;
			synchronized (this.anObject5) {
				if (this.anInt2770 < 500) {
					this.anIntArray185[this.anInt2770] = Static192.anInt4000;
					this.anIntArray184[this.anInt2770] = Static221.anInt4562;
					this.anInt2770++;
				}
			}
			Static134.method2241(50L);
		}
	}
}
