import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ld")
public final class Class52 implements Runnable {

	@OriginalMember(owner = "client!ld", name = "j", descriptor = "Z")
	public boolean aBoolean87 = true;

	@OriginalMember(owner = "client!ld", name = "f", descriptor = "Ljava/lang/Object;")
	public final Object anObject3 = new Object();

	@OriginalMember(owner = "client!ld", name = "s", descriptor = "I")
	public int anInt2292 = 0;

	@OriginalMember(owner = "client!ld", name = "t", descriptor = "[I")
	public final int[] anIntArray171 = new int[500];

	@OriginalMember(owner = "client!ld", name = "u", descriptor = "[I")
	public final int[] anIntArray172 = new int[500];

	@OriginalMember(owner = "client!ld", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean87) {
			@Pc(10) Object local10 = this.anObject3;
			synchronized (this.anObject3) {
				if (this.anInt2292 < 500) {
					this.anIntArray172[this.anInt2292] = Static69.anInt1736;
					this.anIntArray171[this.anInt2292] = Static77.anInt1906;
					this.anInt2292++;
				}
			}
			Static155.method2675(50L);
		}
	}
}
