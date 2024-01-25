import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eo")
public final class Class67 implements Runnable {

	@OriginalMember(owner = "client!eo", name = "i", descriptor = "Z")
	public boolean aBoolean130 = true;

	@OriginalMember(owner = "client!eo", name = "g", descriptor = "Ljava/lang/Object;")
	public final Object anObject3 = new Object();

	@OriginalMember(owner = "client!eo", name = "r", descriptor = "[I")
	public final int[] anIntArray171 = new int[500];

	@OriginalMember(owner = "client!eo", name = "p", descriptor = "[I")
	public final int[] anIntArray170 = new int[500];

	@OriginalMember(owner = "client!eo", name = "o", descriptor = "I")
	public int anInt1691 = 0;

	@OriginalMember(owner = "client!eo", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean130) {
			@Pc(6) Object local6 = this.anObject3;
			synchronized (this.anObject3) {
				if (this.anInt1691 < 500) {
					this.anIntArray170[this.anInt1691] = Static38.anInt830;
					this.anIntArray171[this.anInt1691] = Static184.anInt4055;
					this.anInt1691++;
				}
			}
			Static270.method5481(50L);
		}
	}
}
