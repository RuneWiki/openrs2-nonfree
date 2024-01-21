import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sh")
public final class Class91 implements Runnable {

	@OriginalMember(owner = "client!sh", name = "c", descriptor = "Z")
	public boolean aBoolean165 = true;

	@OriginalMember(owner = "client!sh", name = "h", descriptor = "Ljava/lang/Object;")
	public final Object anObject4 = new Object();

	@OriginalMember(owner = "client!sh", name = "m", descriptor = "[I")
	public final int[] anIntArray331 = new int[500];

	@OriginalMember(owner = "client!sh", name = "k", descriptor = "[I")
	public final int[] anIntArray330 = new int[500];

	@OriginalMember(owner = "client!sh", name = "p", descriptor = "I")
	public int anInt3780 = 0;

	@OriginalMember(owner = "client!sh", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean165) {
			@Pc(6) Object local6 = this.anObject4;
			synchronized (this.anObject4) {
				if (this.anInt3780 < 500) {
					this.anIntArray331[this.anInt3780] = Static163.anInt3446;
					this.anIntArray330[this.anInt3780] = Static32.anInt773;
					this.anInt3780++;
				}
			}
			Static117.method1813(50L);
		}
	}
}
