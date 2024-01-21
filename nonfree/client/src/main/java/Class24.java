import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eb")
public final class Class24 implements Runnable {

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "Z")
	public boolean aBoolean54 = true;

	@OriginalMember(owner = "client!eb", name = "e", descriptor = "Ljava/lang/Object;")
	public final Object anObject2 = new Object();

	@OriginalMember(owner = "client!eb", name = "m", descriptor = "[I")
	public final int[] anIntArray190 = new int[500];

	@OriginalMember(owner = "client!eb", name = "p", descriptor = "[I")
	public final int[] anIntArray191 = new int[500];

	@OriginalMember(owner = "client!eb", name = "l", descriptor = "I")
	public int anInt1053 = 0;

	@OriginalMember(owner = "client!eb", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean54) {
			@Pc(10) Object local10 = this.anObject2;
			synchronized (this.anObject2) {
				if (this.anInt1053 < 500) {
					this.anIntArray191[this.anInt1053] = Static73.anInt2181;
					this.anIntArray190[this.anInt1053] = Static35.anInt1049;
					this.anInt1053++;
				}
			}
			Static65.method1574(50L);
		}
	}
}
