import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ld")
public final class Class45 implements Runnable {

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "Z")
	public boolean aBoolean106 = true;

	@OriginalMember(owner = "client!ld", name = "e", descriptor = "Ljava/lang/Object;")
	public final Object anObject3 = new Object();

	@OriginalMember(owner = "client!ld", name = "o", descriptor = "[I")
	public final int[] anIntArray226 = new int[500];

	@OriginalMember(owner = "client!ld", name = "p", descriptor = "I")
	public int anInt2010 = 0;

	@OriginalMember(owner = "client!ld", name = "q", descriptor = "[I")
	public final int[] anIntArray227 = new int[500];

	@OriginalMember(owner = "client!ld", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean106) {
			@Pc(10) Object local10 = this.anObject3;
			synchronized (this.anObject3) {
				if (this.anInt2010 < 500) {
					this.anIntArray226[this.anInt2010] = Static102.anInt2823;
					this.anIntArray227[this.anInt2010] = Static59.anInt1768;
					this.anInt2010++;
				}
			}
			Static53.method2063(50L);
		}
	}
}
