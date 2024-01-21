import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vd")
public final class Class79 implements Runnable {

	@OriginalMember(owner = "client!vd", name = "i", descriptor = "Z")
	public boolean aBoolean123 = true;

	@OriginalMember(owner = "client!vd", name = "k", descriptor = "Ljava/lang/Object;")
	public final Object anObject4 = new Object();

	@OriginalMember(owner = "client!vd", name = "y", descriptor = "[I")
	public final int[] anIntArray383 = new int[500];

	@OriginalMember(owner = "client!vd", name = "x", descriptor = "[I")
	public final int[] anIntArray382 = new int[500];

	@OriginalMember(owner = "client!vd", name = "z", descriptor = "I")
	public int anInt3385 = 0;

	@OriginalMember(owner = "client!vd", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean123) {
			@Pc(6) Object local6 = this.anObject4;
			synchronized (this.anObject4) {
				if (this.anInt3385 < 500) {
					this.anIntArray383[this.anInt3385] = Static122.anInt720;
					this.anIntArray382[this.anInt3385] = Static12.anInt374;
					this.anInt3385++;
				}
			}
			Static126.method2277(50L);
		}
	}
}
