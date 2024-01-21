import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!t")
public final class Class70 implements Runnable {

	@OriginalMember(owner = "client!t", name = "c", descriptor = "Z")
	public boolean aBoolean243 = true;

	@OriginalMember(owner = "client!t", name = "d", descriptor = "Ljava/lang/Object;")
	public final Object anObject4 = new Object();

	@OriginalMember(owner = "client!t", name = "i", descriptor = "I")
	public int anInt2732 = 0;

	@OriginalMember(owner = "client!t", name = "h", descriptor = "[I")
	public final int[] anIntArray301 = new int[500];

	@OriginalMember(owner = "client!t", name = "k", descriptor = "[I")
	public final int[] anIntArray302 = new int[500];

	@OriginalMember(owner = "client!t", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean243) {
			@Pc(10) Object local10 = this.anObject4;
			synchronized (this.anObject4) {
				if (this.anInt2732 < 500) {
					this.anIntArray301[this.anInt2732] = Static72.anInt1914;
					this.anIntArray302[this.anInt2732] = Static117.anInt2876;
					this.anInt2732++;
				}
			}
			Static46.method889(50L);
		}
	}
}
