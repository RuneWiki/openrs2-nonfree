import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pe")
public final class Class136 implements Runnable {

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "Z")
	public boolean aBoolean294 = true;

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "Ljava/lang/Object;")
	public Object anObject3 = new Object();

	@OriginalMember(owner = "client!pe", name = "f", descriptor = "[I")
	public int[] anIntArray459 = new int[500];

	@OriginalMember(owner = "client!pe", name = "g", descriptor = "I")
	public int anInt4153 = 0;

	@OriginalMember(owner = "client!pe", name = "h", descriptor = "[I")
	public int[] anIntArray460 = new int[500];

	@OriginalMember(owner = "client!pe", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean294) {
			@Pc(12) Object local12 = this.anObject3;
			synchronized (this.anObject3) {
				if (this.anInt4153 < 500) {
					this.anIntArray459[this.anInt4153] = Static167.anInt3153;
					this.anIntArray460[this.anInt4153] = Static153.anInt2892;
					this.anInt4153++;
				}
			}
			Static150.method2552(50L);
		}
	}
}
