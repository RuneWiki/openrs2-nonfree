import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jf")
public final class Class51 implements Runnable {

	@OriginalMember(owner = "client!jf", name = "k", descriptor = "Z")
	public boolean aBoolean116 = true;

	@OriginalMember(owner = "client!jf", name = "l", descriptor = "Ljava/lang/Object;")
	public final Object anObject2 = new Object();

	@OriginalMember(owner = "client!jf", name = "q", descriptor = "I")
	public int anInt1978 = 0;

	@OriginalMember(owner = "client!jf", name = "r", descriptor = "[I")
	public final int[] anIntArray163 = new int[500];

	@OriginalMember(owner = "client!jf", name = "p", descriptor = "[I")
	public final int[] anIntArray162 = new int[500];

	@OriginalMember(owner = "client!jf", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean116) {
			@Pc(6) Object local6 = this.anObject2;
			synchronized (this.anObject2) {
				if (this.anInt1978 < 500) {
					this.anIntArray162[this.anInt1978] = Static85.anInt1855;
					this.anIntArray163[this.anInt1978] = Static126.anInt2633;
					this.anInt1978++;
				}
			}
			Static199.method3292(50L);
		}
	}
}
