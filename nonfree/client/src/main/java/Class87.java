import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jf")
public final class Class87 implements Runnable {

	@OriginalMember(owner = "client!jf", name = "n", descriptor = "Z")
	public boolean aBoolean212 = true;

	@OriginalMember(owner = "client!jf", name = "m", descriptor = "Ljava/lang/Object;")
	public Object anObject1 = new Object();

	@OriginalMember(owner = "client!jf", name = "q", descriptor = "[I")
	public int[] anIntArray196 = new int[500];

	@OriginalMember(owner = "client!jf", name = "p", descriptor = "[I")
	public int[] anIntArray195 = new int[500];

	@OriginalMember(owner = "client!jf", name = "s", descriptor = "I")
	public int anInt2481 = 0;

	@OriginalMember(owner = "client!jf", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean212) {
			@Pc(8) Object local8 = this.anObject1;
			synchronized (this.anObject1) {
				if (this.anInt2481 < 500) {
					this.anIntArray196[this.anInt2481] = Static182.anInt3572;
					this.anIntArray195[this.anInt2481] = Static106.anInt2198;
					this.anInt2481++;
				}
			}
			Static162.method2645(50L);
		}
	}
}
