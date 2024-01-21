import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vc")
public final class Class84 implements Runnable {

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "Z")
	public boolean aBoolean161 = true;

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "Ljava/lang/Object;")
	public final Object anObject4 = new Object();

	@OriginalMember(owner = "client!vc", name = "o", descriptor = "[I")
	public final int[] anIntArray422 = new int[500];

	@OriginalMember(owner = "client!vc", name = "q", descriptor = "[I")
	public final int[] anIntArray423 = new int[500];

	@OriginalMember(owner = "client!vc", name = "p", descriptor = "I")
	public int anInt3779 = 0;

	@OriginalMember(owner = "client!vc", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean161) {
			@Pc(6) Object local6 = this.anObject4;
			synchronized (this.anObject4) {
				if (this.anInt3779 < 500) {
					this.anIntArray422[this.anInt3779] = Static85.anInt676;
					this.anIntArray423[this.anInt3779] = Static149.anInt3582;
					this.anInt3779++;
				}
			}
			Static35.method627(50L);
		}
	}
}
