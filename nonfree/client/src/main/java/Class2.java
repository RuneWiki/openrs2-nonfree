import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ab")
public final class Class2 implements Runnable {

	@OriginalMember(owner = "client!ab", name = "k", descriptor = "Z")
	public boolean aBoolean7 = true;

	@OriginalMember(owner = "client!ab", name = "e", descriptor = "Ljava/lang/Object;")
	public final Object anObject1 = new Object();

	@OriginalMember(owner = "client!ab", name = "n", descriptor = "I")
	public int anInt89 = 0;

	@OriginalMember(owner = "client!ab", name = "p", descriptor = "[I")
	public final int[] anIntArray14 = new int[500];

	@OriginalMember(owner = "client!ab", name = "o", descriptor = "[I")
	public final int[] anIntArray13 = new int[500];

	@OriginalMember(owner = "client!ab", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean7) {
			@Pc(6) Object local6 = this.anObject1;
			synchronized (this.anObject1) {
				if (this.anInt89 < 500) {
					this.anIntArray14[this.anInt89] = Static190.anInt4379;
					this.anIntArray13[this.anInt89] = Static3.anInt153;
					this.anInt89++;
				}
			}
			Static135.method2059(50L);
		}
	}
}
