import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!j")
public final class Class36 implements Runnable {

	@OriginalMember(owner = "client!j", name = "i", descriptor = "Z")
	public boolean aBoolean65 = true;

	@OriginalMember(owner = "client!j", name = "c", descriptor = "Ljava/lang/Object;")
	public final Object anObject1 = new Object();

	@OriginalMember(owner = "client!j", name = "q", descriptor = "[I")
	public final int[] anIntArray104 = new int[500];

	@OriginalMember(owner = "client!j", name = "s", descriptor = "[I")
	public final int[] anIntArray105 = new int[500];

	@OriginalMember(owner = "client!j", name = "r", descriptor = "I")
	public int anInt1503 = 0;

	@OriginalMember(owner = "client!j", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean65) {
			@Pc(6) Object local6 = this.anObject1;
			synchronized (this.anObject1) {
				if (this.anInt1503 < 500) {
					this.anIntArray105[this.anInt1503] = Static36.anInt1021;
					this.anIntArray104[this.anInt1503] = Static102.anInt3222;
					this.anInt1503++;
				}
			}
			Static68.method1266(50L);
		}
	}
}
