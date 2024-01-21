import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lc")
public final class Class43 implements Runnable {

	@OriginalMember(owner = "client!lc", name = "f", descriptor = "Z")
	public boolean aBoolean56 = true;

	@OriginalMember(owner = "client!lc", name = "i", descriptor = "Ljava/lang/Object;")
	public final Object anObject4 = new Object();

	@OriginalMember(owner = "client!lc", name = "m", descriptor = "[I")
	public final int[] anIntArray176 = new int[500];

	@OriginalMember(owner = "client!lc", name = "n", descriptor = "[I")
	public final int[] anIntArray177 = new int[500];

	@OriginalMember(owner = "client!lc", name = "l", descriptor = "I")
	public int anInt1448 = 0;

	@OriginalMember(owner = "client!lc", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean56) {
			@Pc(6) Object local6 = this.anObject4;
			synchronized (this.anObject4) {
				if (this.anInt1448 < 500) {
					this.anIntArray176[this.anInt1448] = Static46.anInt1062;
					this.anIntArray177[this.anInt1448] = Static62.anInt1414;
					this.anInt1448++;
				}
			}
			Static80.method1260(50L);
		}
	}
}
