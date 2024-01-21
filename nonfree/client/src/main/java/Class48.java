import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qa")
public final class Class48 implements Runnable {

	@OriginalMember(owner = "client!qa", name = "i", descriptor = "Z")
	public boolean aBoolean119 = true;

	@OriginalMember(owner = "client!qa", name = "g", descriptor = "Ljava/lang/Object;")
	public final Object anObject3 = new Object();

	@OriginalMember(owner = "client!qa", name = "n", descriptor = "[I")
	public final int[] anIntArray327 = new int[500];

	@OriginalMember(owner = "client!qa", name = "o", descriptor = "[I")
	public final int[] anIntArray328 = new int[500];

	@OriginalMember(owner = "client!qa", name = "p", descriptor = "I")
	public int anInt2310 = 0;

	@OriginalMember(owner = "client!qa", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean119) {
			@Pc(10) Object local10 = this.anObject3;
			synchronized (this.anObject3) {
				if (this.anInt2310 < 500) {
					this.anIntArray327[this.anInt2310] = Static85.anInt2508;
					this.anIntArray328[this.anInt2310] = Static61.anInt2102;
					this.anInt2310++;
				}
			}
			Static91.method1548(50L);
		}
	}
}
