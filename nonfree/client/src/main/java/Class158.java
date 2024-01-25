import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!or")
public final class Class158 implements Runnable {

	@OriginalMember(owner = "client!or", name = "c", descriptor = "Z")
	public boolean aBoolean350 = true;

	@OriginalMember(owner = "client!or", name = "h", descriptor = "Ljava/lang/Object;")
	public final Object anObject7 = new Object();

	@OriginalMember(owner = "client!or", name = "m", descriptor = "[I")
	public final int[] anIntArray627 = new int[500];

	@OriginalMember(owner = "client!or", name = "o", descriptor = "[I")
	public final int[] anIntArray628 = new int[500];

	@OriginalMember(owner = "client!or", name = "n", descriptor = "I")
	public int anInt4704 = 0;

	@OriginalMember(owner = "client!or", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean350) {
			@Pc(10) Object local10 = this.anObject7;
			synchronized (this.anObject7) {
				if (this.anInt4704 < 500) {
					this.anIntArray628[this.anInt4704] = Static240.anInt6396;
					this.anIntArray627[this.anInt4704] = Static100.anInt2436;
					this.anInt4704++;
				}
			}
			Static129.method2634(50L);
		}
	}
}
