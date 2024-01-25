import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sl")
public final class Class189 implements Runnable {

	@OriginalMember(owner = "client!sl", name = "f", descriptor = "Z")
	public boolean aBoolean487 = true;

	@OriginalMember(owner = "client!sl", name = "d", descriptor = "Ljava/lang/Object;")
	public final Object anObject7 = new Object();

	@OriginalMember(owner = "client!sl", name = "h", descriptor = "[I")
	public final int[] anIntArray700 = new int[500];

	@OriginalMember(owner = "client!sl", name = "j", descriptor = "I")
	public int anInt5570 = 0;

	@OriginalMember(owner = "client!sl", name = "i", descriptor = "[I")
	public final int[] anIntArray701 = new int[500];

	@OriginalMember(owner = "client!sl", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean487) {
			@Pc(10) Object local10 = this.anObject7;
			synchronized (this.anObject7) {
				if (this.anInt5570 < 500) {
					this.anIntArray701[this.anInt5570] = Static179.anInt3693;
					this.anIntArray700[this.anInt5570] = Static295.anInt5742;
					this.anInt5570++;
				}
			}
			Static134.method2598(50L);
		}
	}
}
