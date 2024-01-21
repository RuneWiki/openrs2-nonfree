import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ga")
public final class Class25 implements Runnable {

	@OriginalMember(owner = "client!ga", name = "e", descriptor = "Z")
	public boolean aBoolean40 = true;

	@OriginalMember(owner = "client!ga", name = "n", descriptor = "Ljava/lang/Object;")
	public final Object anObject1 = new Object();

	@OriginalMember(owner = "client!ga", name = "p", descriptor = "I")
	public int anInt1061 = 0;

	@OriginalMember(owner = "client!ga", name = "t", descriptor = "[I")
	public final int[] anIntArray110 = new int[500];

	@OriginalMember(owner = "client!ga", name = "v", descriptor = "[I")
	public final int[] anIntArray111 = new int[500];

	@OriginalMember(owner = "client!ga", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean40) {
			@Pc(10) Object local10 = this.anObject1;
			synchronized (this.anObject1) {
				if (this.anInt1061 < 500) {
					this.anIntArray111[this.anInt1061] = Static36.anInt1006;
					this.anIntArray110[this.anInt1061] = Static85.anInt2015;
					this.anInt1061++;
				}
			}
			Static103.method1711(50L);
		}
	}
}
