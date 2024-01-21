import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ae")
public final class Class5 implements Runnable {

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "Z")
	public boolean aBoolean14 = true;

	@OriginalMember(owner = "client!ae", name = "f", descriptor = "Ljava/lang/Object;")
	public final Object anObject1 = new Object();

	@OriginalMember(owner = "client!ae", name = "o", descriptor = "[I")
	public final int[] anIntArray22 = new int[500];

	@OriginalMember(owner = "client!ae", name = "k", descriptor = "I")
	public int anInt224 = 0;

	@OriginalMember(owner = "client!ae", name = "p", descriptor = "[I")
	public final int[] anIntArray23 = new int[500];

	@OriginalMember(owner = "client!ae", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean14) {
			@Pc(10) Object local10 = this.anObject1;
			synchronized (this.anObject1) {
				if (this.anInt224 < 500) {
					this.anIntArray23[this.anInt224] = Static25.anInt620;
					this.anIntArray22[this.anInt224] = Static169.anInt3778;
					this.anInt224++;
				}
			}
			Static52.method1025(50L);
		}
	}
}
