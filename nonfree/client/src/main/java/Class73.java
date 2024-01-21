import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!re")
public final class Class73 implements Runnable {

	@OriginalMember(owner = "client!re", name = "l", descriptor = "Z")
	public boolean aBoolean184 = true;

	@OriginalMember(owner = "client!re", name = "i", descriptor = "Ljava/lang/Object;")
	public final Object anObject4 = new Object();

	@OriginalMember(owner = "client!re", name = "m", descriptor = "[I")
	public final int[] anIntArray478 = new int[500];

	@OriginalMember(owner = "client!re", name = "o", descriptor = "[I")
	public final int[] anIntArray479 = new int[500];

	@OriginalMember(owner = "client!re", name = "n", descriptor = "I")
	public int anInt3608 = 0;

	@OriginalMember(owner = "client!re", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean184) {
			@Pc(6) Object local6 = this.anObject4;
			synchronized (this.anObject4) {
				if (this.anInt3608 < 500) {
					this.anIntArray478[this.anInt3608] = Static163.anInt4014;
					this.anIntArray479[this.anInt3608] = Static96.anInt2484;
					this.anInt3608++;
				}
			}
			Static35.method583(50L);
		}
	}
}
