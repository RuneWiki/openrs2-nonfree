import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uh")
public final class Class83 implements Runnable {

	@OriginalMember(owner = "client!uh", name = "e", descriptor = "Z")
	public boolean aBoolean164 = true;

	@OriginalMember(owner = "client!uh", name = "f", descriptor = "Ljava/lang/Object;")
	public final Object anObject4 = new Object();

	@OriginalMember(owner = "client!uh", name = "h", descriptor = "I")
	public int anInt3797 = 0;

	@OriginalMember(owner = "client!uh", name = "i", descriptor = "[I")
	public final int[] anIntArray355 = new int[500];

	@OriginalMember(owner = "client!uh", name = "n", descriptor = "[I")
	public final int[] anIntArray356 = new int[500];

	@OriginalMember(owner = "client!uh", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean164) {
			@Pc(6) Object local6 = this.anObject4;
			synchronized (this.anObject4) {
				if (this.anInt3797 < 500) {
					this.anIntArray356[this.anInt3797] = Static93.anInt2353;
					this.anIntArray355[this.anInt3797] = Static169.anInt3798;
					this.anInt3797++;
				}
			}
			Static176.method2744(50L);
		}
	}
}
