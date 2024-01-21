import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mf")
public final class Class54 implements Runnable {

	@OriginalMember(owner = "client!mf", name = "f", descriptor = "Z")
	public boolean aBoolean152 = true;

	@OriginalMember(owner = "client!mf", name = "n", descriptor = "Ljava/lang/Object;")
	public final Object anObject4 = new Object();

	@OriginalMember(owner = "client!mf", name = "o", descriptor = "[I")
	public final int[] anIntArray231 = new int[500];

	@OriginalMember(owner = "client!mf", name = "p", descriptor = "[I")
	public final int[] anIntArray232 = new int[500];

	@OriginalMember(owner = "client!mf", name = "q", descriptor = "I")
	public int anInt2296 = 0;

	@OriginalMember(owner = "client!mf", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean152) {
			@Pc(6) Object local6 = this.anObject4;
			synchronized (this.anObject4) {
				if (this.anInt2296 < 500) {
					this.anIntArray231[this.anInt2296] = Static37.anInt899;
					this.anIntArray232[this.anInt2296] = Static5.anInt107;
					this.anInt2296++;
				}
			}
			Static166.method2609(50L);
		}
	}
}
