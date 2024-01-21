import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ud")
public final class Class73 implements Runnable {

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "Z")
	public boolean aBoolean217 = true;

	@OriginalMember(owner = "client!ud", name = "e", descriptor = "Ljava/lang/Object;")
	public final Object anObject4 = new Object();

	@OriginalMember(owner = "client!ud", name = "o", descriptor = "[I")
	public final int[] anIntArray384 = new int[500];

	@OriginalMember(owner = "client!ud", name = "s", descriptor = "[I")
	public final int[] anIntArray385 = new int[500];

	@OriginalMember(owner = "client!ud", name = "q", descriptor = "I")
	public int anInt2947 = 0;

	@OriginalMember(owner = "client!ud", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean217) {
			@Pc(6) Object local6 = this.anObject4;
			synchronized (this.anObject4) {
				if (this.anInt2947 < 500) {
					this.anIntArray384[this.anInt2947] = Static93.anInt2398;
					this.anIntArray385[this.anInt2947] = Static95.anInt2430;
					this.anInt2947++;
				}
			}
			Static62.method1070(50L);
		}
	}
}
