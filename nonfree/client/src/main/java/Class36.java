import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ja")
public final class Class36 implements Runnable {

	@OriginalMember(owner = "client!ja", name = "r", descriptor = "Z")
	public boolean aBoolean89 = true;

	@OriginalMember(owner = "client!ja", name = "q", descriptor = "Ljava/lang/Object;")
	public final Object anObject2 = new Object();

	@OriginalMember(owner = "client!ja", name = "t", descriptor = "I")
	public int anInt1626 = 0;

	@OriginalMember(owner = "client!ja", name = "s", descriptor = "[I")
	public final int[] anIntArray172 = new int[500];

	@OriginalMember(owner = "client!ja", name = "u", descriptor = "[I")
	public final int[] anIntArray173 = new int[500];

	@OriginalMember(owner = "client!ja", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean89) {
			@Pc(6) Object local6 = this.anObject2;
			synchronized (this.anObject2) {
				if (this.anInt1626 < 500) {
					this.anIntArray173[this.anInt1626] = Static39.anInt1143;
					this.anIntArray172[this.anInt1626] = Static19.anInt658;
					this.anInt1626++;
				}
			}
			Static109.method2037(50L);
		}
	}
}
