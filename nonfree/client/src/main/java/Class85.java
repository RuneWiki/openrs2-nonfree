import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rg")
public final class Class85 implements Runnable {

	@OriginalMember(owner = "client!rg", name = "l", descriptor = "Z")
	public boolean aBoolean169 = true;

	@OriginalMember(owner = "client!rg", name = "c", descriptor = "Ljava/lang/Object;")
	public final Object anObject4 = new Object();

	@OriginalMember(owner = "client!rg", name = "p", descriptor = "[I")
	public final int[] anIntArray300 = new int[500];

	@OriginalMember(owner = "client!rg", name = "q", descriptor = "[I")
	public final int[] anIntArray301 = new int[500];

	@OriginalMember(owner = "client!rg", name = "r", descriptor = "I")
	public int anInt3582 = 0;

	@OriginalMember(owner = "client!rg", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean169) {
			@Pc(6) Object local6 = this.anObject4;
			synchronized (this.anObject4) {
				if (this.anInt3582 < 500) {
					this.anIntArray300[this.anInt3582] = Static24.anInt661;
					this.anIntArray301[this.anInt3582] = Static7.anInt174;
					this.anInt3582++;
				}
			}
			Static75.method3577(50L);
		}
	}
}
