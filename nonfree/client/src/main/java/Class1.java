import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!a")
public final class Class1 implements Runnable {

	@OriginalMember(owner = "client!a", name = "l", descriptor = "Z")
	public boolean aBoolean1 = true;

	@OriginalMember(owner = "client!a", name = "s", descriptor = "Ljava/lang/Object;")
	public final Object anObject1 = new Object();

	@OriginalMember(owner = "client!a", name = "A", descriptor = "[I")
	public final int[] anIntArray4 = new int[500];

	@OriginalMember(owner = "client!a", name = "z", descriptor = "[I")
	public final int[] anIntArray3 = new int[500];

	@OriginalMember(owner = "client!a", name = "B", descriptor = "I")
	public int anInt13 = 0;

	@OriginalMember(owner = "client!a", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean1) {
			@Pc(10) Object local10 = this.anObject1;
			synchronized (this.anObject1) {
				if (this.anInt13 < 500) {
					this.anIntArray4[this.anInt13] = Static14.anInt425;
					this.anIntArray3[this.anInt13] = Static47.anInt1354;
					this.anInt13++;
				}
			}
			Static17.method318(50L);
		}
	}
}
