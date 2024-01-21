import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qe")
public final class Class58 implements Runnable {

	@OriginalMember(owner = "client!qe", name = "e", descriptor = "Z")
	public boolean aBoolean102 = true;

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "Ljava/lang/Object;")
	public final Object anObject5 = new Object();

	@OriginalMember(owner = "client!qe", name = "p", descriptor = "[I")
	public final int[] anIntArray405 = new int[500];

	@OriginalMember(owner = "client!qe", name = "k", descriptor = "[I")
	public final int[] anIntArray404 = new int[500];

	@OriginalMember(owner = "client!qe", name = "r", descriptor = "I")
	public int anInt2402 = 0;

	@OriginalMember(owner = "client!qe", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean102) {
			@Pc(10) Object local10 = this.anObject5;
			synchronized (this.anObject5) {
				if (this.anInt2402 < 500) {
					this.anIntArray405[this.anInt2402] = Static50.anInt1542;
					this.anIntArray404[this.anInt2402] = Static13.anInt462;
					this.anInt2402++;
				}
			}
			Static13.method399(50L);
		}
	}
}
