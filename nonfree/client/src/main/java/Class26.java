import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gh")
public final class Class26 implements Runnable {

	@OriginalMember(owner = "client!gh", name = "d", descriptor = "Z")
	public boolean aBoolean148 = true;

	@OriginalMember(owner = "client!gh", name = "j", descriptor = "Ljava/lang/Object;")
	public final Object anObject1 = new Object();

	@OriginalMember(owner = "client!gh", name = "n", descriptor = "I")
	public int anInt1893 = 0;

	@OriginalMember(owner = "client!gh", name = "r", descriptor = "[I")
	public final int[] anIntArray194 = new int[500];

	@OriginalMember(owner = "client!gh", name = "q", descriptor = "[I")
	public final int[] anIntArray193 = new int[500];

	@OriginalMember(owner = "client!gh", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean148) {
			@Pc(6) Object local6 = this.anObject1;
			synchronized (this.anObject1) {
				if (this.anInt1893 < 500) {
					this.anIntArray193[this.anInt1893] = Static14.anInt481;
					this.anIntArray194[this.anInt1893] = Static86.anInt2447;
					this.anInt1893++;
				}
			}
			Static181.method2982(50L);
		}
	}
}
