import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ad")
public final class Class3 implements Runnable {

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "Z")
	public boolean aBoolean17 = true;

	@OriginalMember(owner = "client!ad", name = "f", descriptor = "Ljava/lang/Object;")
	public Object anObject1 = new Object();

	@OriginalMember(owner = "client!ad", name = "h", descriptor = "I")
	public int anInt168 = 0;

	@OriginalMember(owner = "client!ad", name = "i", descriptor = "[I")
	public int[] anIntArray16 = new int[500];

	@OriginalMember(owner = "client!ad", name = "j", descriptor = "[I")
	public int[] anIntArray17 = new int[500];

	@OriginalMember(owner = "client!ad", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean17) {
			@Pc(12) Object local12 = this.anObject1;
			synchronized (this.anObject1) {
				if (this.anInt168 < 500) {
					this.anIntArray16[this.anInt168] = Static224.anInt4700;
					this.anIntArray17[this.anInt168] = Static293.anInt5833;
					this.anInt168++;
				}
			}
			Static275.method4233(50L);
		}
	}
}
