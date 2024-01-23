import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cl")
public final class Class27 implements Runnable {

	@OriginalMember(owner = "client!cl", name = "k", descriptor = "Z")
	public boolean aBoolean55 = true;

	@OriginalMember(owner = "client!cl", name = "i", descriptor = "Ljava/lang/Object;")
	public Object anObject4 = new Object();

	@OriginalMember(owner = "client!cl", name = "n", descriptor = "[I")
	public int[] anIntArray80 = new int[500];

	@OriginalMember(owner = "client!cl", name = "m", descriptor = "I")
	public int anInt1017 = 0;

	@OriginalMember(owner = "client!cl", name = "l", descriptor = "[I")
	public int[] anIntArray79 = new int[500];

	@OriginalMember(owner = "client!cl", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean55) {
			@Pc(6) Object local6 = this.anObject4;
			synchronized (this.anObject4) {
				if (this.anInt1017 < 500) {
					this.anIntArray79[this.anInt1017] = Static71.anInt1930;
					this.anIntArray80[this.anInt1017] = Static240.anInt5167;
					this.anInt1017++;
				}
			}
			Static30.method587(50L);
		}
	}
}
