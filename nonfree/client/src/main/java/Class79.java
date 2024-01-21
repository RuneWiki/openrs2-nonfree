import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wa")
public final class Class79 implements Runnable {

	@OriginalMember(owner = "client!wa", name = "f", descriptor = "Z")
	public boolean aBoolean122 = true;

	@OriginalMember(owner = "client!wa", name = "s", descriptor = "Ljava/lang/Object;")
	public final Object anObject4 = new Object();

	@OriginalMember(owner = "client!wa", name = "z", descriptor = "[I")
	public final int[] anIntArray463 = new int[500];

	@OriginalMember(owner = "client!wa", name = "B", descriptor = "[I")
	public final int[] anIntArray464 = new int[500];

	@OriginalMember(owner = "client!wa", name = "A", descriptor = "I")
	public int anInt3253 = 0;

	@OriginalMember(owner = "client!wa", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean122) {
			@Pc(6) Object local6 = this.anObject4;
			synchronized (this.anObject4) {
				if (this.anInt3253 < 500) {
					this.anIntArray464[this.anInt3253] = Static98.anInt2407;
					this.anIntArray463[this.anInt3253] = Static97.anInt2395;
					this.anInt3253++;
				}
			}
			Static70.method1226(50L);
		}
	}
}
