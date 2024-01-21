import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qh")
public final class Class72 implements Runnable {

	@OriginalMember(owner = "client!qh", name = "h", descriptor = "Z")
	public boolean aBoolean124 = true;

	@OriginalMember(owner = "client!qh", name = "f", descriptor = "Ljava/lang/Object;")
	public final Object anObject3 = new Object();

	@OriginalMember(owner = "client!qh", name = "o", descriptor = "[I")
	public final int[] anIntArray278 = new int[500];

	@OriginalMember(owner = "client!qh", name = "p", descriptor = "I")
	public int anInt2941 = 0;

	@OriginalMember(owner = "client!qh", name = "q", descriptor = "[I")
	public final int[] anIntArray279 = new int[500];

	@OriginalMember(owner = "client!qh", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean124) {
			@Pc(6) Object local6 = this.anObject3;
			synchronized (this.anObject3) {
				if (this.anInt2941 < 500) {
					this.anIntArray279[this.anInt2941] = Static20.anInt449;
					this.anIntArray278[this.anInt2941] = Static96.anInt2022;
					this.anInt2941++;
				}
			}
			Static50.method901(50L);
		}
	}
}
