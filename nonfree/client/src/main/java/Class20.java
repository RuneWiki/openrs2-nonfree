import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!e")
public final class Class20 implements Runnable {

	@OriginalMember(owner = "client!e", name = "i", descriptor = "Z")
	public boolean aBoolean44 = true;

	@OriginalMember(owner = "client!e", name = "k", descriptor = "Ljava/lang/Object;")
	public final Object anObject3 = new Object();

	@OriginalMember(owner = "client!e", name = "t", descriptor = "[I")
	public final int[] anIntArray77 = new int[500];

	@OriginalMember(owner = "client!e", name = "u", descriptor = "I")
	public int anInt543 = 0;

	@OriginalMember(owner = "client!e", name = "v", descriptor = "[I")
	public final int[] anIntArray78 = new int[500];

	@OriginalMember(owner = "client!e", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean44) {
			@Pc(6) Object local6 = this.anObject3;
			synchronized (this.anObject3) {
				if (this.anInt543 < 500) {
					this.anIntArray77[this.anInt543] = Static2.anInt31;
					this.anIntArray78[this.anInt543] = Static126.anInt2734;
					this.anInt543++;
				}
			}
			Static6.method84(50L);
		}
	}
}
