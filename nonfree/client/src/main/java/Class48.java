import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dm")
public final class Class48 implements Runnable {

	@OriginalMember(owner = "client!dm", name = "f", descriptor = "Z")
	public boolean aBoolean94 = true;

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "Ljava/lang/Object;")
	public final Object anObject1 = new Object();

	@OriginalMember(owner = "client!dm", name = "o", descriptor = "I")
	public int anInt1354 = 0;

	@OriginalMember(owner = "client!dm", name = "n", descriptor = "[I")
	public final int[] anIntArray96 = new int[500];

	@OriginalMember(owner = "client!dm", name = "q", descriptor = "[I")
	public final int[] anIntArray97 = new int[500];

	@OriginalMember(owner = "client!dm", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean94) {
			@Pc(6) Object local6 = this.anObject1;
			synchronized (this.anObject1) {
				if (this.anInt1354 < 500) {
					this.anIntArray97[this.anInt1354] = Static208.anInt4358;
					this.anIntArray96[this.anInt1354] = Static28.anInt538;
					this.anInt1354++;
				}
			}
			Static163.method2863(50L);
		}
	}
}
