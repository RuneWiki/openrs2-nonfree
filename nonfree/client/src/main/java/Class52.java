import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rd")
public final class Class52 implements Runnable {

	@OriginalMember(owner = "client!rd", name = "f", descriptor = "Z")
	public boolean aBoolean157 = true;

	@OriginalMember(owner = "client!rd", name = "o", descriptor = "Ljava/lang/Object;")
	public final Object anObject5 = new Object();

	@OriginalMember(owner = "client!rd", name = "r", descriptor = "[I")
	public final int[] anIntArray432 = new int[500];

	@OriginalMember(owner = "client!rd", name = "t", descriptor = "[I")
	public final int[] anIntArray433 = new int[500];

	@OriginalMember(owner = "client!rd", name = "q", descriptor = "I")
	public int anInt1982 = 0;

	@OriginalMember(owner = "client!rd", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean157) {
			@Pc(6) Object local6 = this.anObject5;
			synchronized (this.anObject5) {
				if (this.anInt1982 < 500) {
					this.anIntArray432[this.anInt1982] = Static32.anInt742;
					this.anIntArray433[this.anInt1982] = Static100.anInt2394;
					this.anInt1982++;
				}
			}
			Static94.method1494(50L);
		}
	}
}
