import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public final class Class64 implements Runnable {

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "Z")
	public boolean aBoolean130 = true;

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "Ljava/lang/Object;")
	public final Object anObject3 = new Object();

	@OriginalMember(owner = "client!oa", name = "m", descriptor = "[I")
	public final int[] anIntArray365 = new int[500];

	@OriginalMember(owner = "client!oa", name = "n", descriptor = "[I")
	public final int[] anIntArray366 = new int[500];

	@OriginalMember(owner = "client!oa", name = "o", descriptor = "I")
	public int anInt3158 = 0;

	@OriginalMember(owner = "client!oa", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean130) {
			@Pc(6) Object local6 = this.anObject3;
			synchronized (this.anObject3) {
				if (this.anInt3158 < 500) {
					this.anIntArray366[this.anInt3158] = Static53.anInt1441;
					this.anIntArray365[this.anInt3158] = Static38.anInt1051;
					this.anInt3158++;
				}
			}
			Static135.method2569(50L);
		}
	}
}
