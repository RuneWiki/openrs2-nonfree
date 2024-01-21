import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eb")
public final class Class22 implements Runnable {

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "Z")
	public boolean aBoolean27 = true;

	@OriginalMember(owner = "client!eb", name = "f", descriptor = "Ljava/lang/Object;")
	public final Object anObject1 = new Object();

	@OriginalMember(owner = "client!eb", name = "n", descriptor = "[I")
	public final int[] anIntArray152 = new int[500];

	@OriginalMember(owner = "client!eb", name = "m", descriptor = "I")
	public int anInt747 = 0;

	@OriginalMember(owner = "client!eb", name = "o", descriptor = "[I")
	public final int[] anIntArray153 = new int[500];

	@OriginalMember(owner = "client!eb", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean27) {
			@Pc(10) Object local10 = this.anObject1;
			synchronized (this.anObject1) {
				if (this.anInt747 < 500) {
					this.anIntArray153[this.anInt747] = Static10.anInt264;
					this.anIntArray152[this.anInt747] = Static111.anInt2597;
					this.anInt747++;
				}
			}
			Static53.method1782(50L);
		}
	}
}
