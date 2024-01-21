import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nb")
public final class Class40 implements Runnable {

	@OriginalMember(owner = "client!nb", name = "x", descriptor = "Z")
	public boolean aBoolean97 = true;

	@OriginalMember(owner = "client!nb", name = "r", descriptor = "Ljava/lang/Object;")
	public final Object anObject2 = new Object();

	@OriginalMember(owner = "client!nb", name = "C", descriptor = "[I")
	public final int[] anIntArray228 = new int[500];

	@OriginalMember(owner = "client!nb", name = "D", descriptor = "[I")
	public final int[] anIntArray229 = new int[500];

	@OriginalMember(owner = "client!nb", name = "E", descriptor = "I")
	public int anInt1944 = 0;

	@OriginalMember(owner = "client!nb", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean97) {
			@Pc(6) Object local6 = this.anObject2;
			synchronized (this.anObject2) {
				if (this.anInt1944 < 500) {
					this.anIntArray229[this.anInt1944] = Static32.anInt1007;
					this.anIntArray228[this.anInt1944] = Static110.anInt2872;
					this.anInt1944++;
				}
			}
			Static39.method862(50L);
		}
	}
}
