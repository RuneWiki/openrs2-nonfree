import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qa")
public final class Class51 implements Runnable {

	@OriginalMember(owner = "client!qa", name = "p", descriptor = "Z")
	public boolean aBoolean104 = true;

	@OriginalMember(owner = "client!qa", name = "h", descriptor = "Ljava/lang/Object;")
	public final Object anObject4 = new Object();

	@OriginalMember(owner = "client!qa", name = "u", descriptor = "[I")
	public final int[] anIntArray219 = new int[500];

	@OriginalMember(owner = "client!qa", name = "v", descriptor = "[I")
	public final int[] anIntArray220 = new int[500];

	@OriginalMember(owner = "client!qa", name = "w", descriptor = "I")
	public int anInt2245 = 0;

	@OriginalMember(owner = "client!qa", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean104) {
			@Pc(10) Object local10 = this.anObject4;
			synchronized (this.anObject4) {
				if (this.anInt2245 < 500) {
					this.anIntArray219[this.anInt2245] = Static58.anInt1741;
					this.anIntArray220[this.anInt2245] = Static27.anInt1358;
					this.anInt2245++;
				}
			}
			Static58.method1193(50L);
		}
	}
}
