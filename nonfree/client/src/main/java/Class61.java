import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qd")
public final class Class61 implements Runnable {

	@OriginalMember(owner = "client!qd", name = "i", descriptor = "Z")
	public boolean aBoolean191 = true;

	@OriginalMember(owner = "client!qd", name = "d", descriptor = "Ljava/lang/Object;")
	public final Object anObject5 = new Object();

	@OriginalMember(owner = "client!qd", name = "l", descriptor = "I")
	public int anInt2402 = 0;

	@OriginalMember(owner = "client!qd", name = "k", descriptor = "[I")
	public final int[] anIntArray261 = new int[500];

	@OriginalMember(owner = "client!qd", name = "n", descriptor = "[I")
	public final int[] anIntArray262 = new int[500];

	@OriginalMember(owner = "client!qd", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean191) {
			@Pc(6) Object local6 = this.anObject5;
			synchronized (this.anObject5) {
				if (this.anInt2402 < 500) {
					this.anIntArray261[this.anInt2402] = Static112.anInt2616;
					this.anIntArray262[this.anInt2402] = Static85.anInt2261;
					this.anInt2402++;
				}
			}
			Static85.method1582(50L);
		}
	}
}
