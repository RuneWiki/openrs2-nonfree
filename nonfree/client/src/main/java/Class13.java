import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cd")
public final class Class13 implements Runnable {

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "Z")
	public boolean aBoolean18 = true;

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "Ljava/lang/Object;")
	public final Object anObject1 = new Object();

	@OriginalMember(owner = "client!cd", name = "l", descriptor = "I")
	public int anInt490 = 0;

	@OriginalMember(owner = "client!cd", name = "o", descriptor = "[I")
	public final int[] anIntArray62 = new int[500];

	@OriginalMember(owner = "client!cd", name = "j", descriptor = "[I")
	public final int[] anIntArray61 = new int[500];

	@OriginalMember(owner = "client!cd", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean18) {
			@Pc(10) Object local10 = this.anObject1;
			synchronized (this.anObject1) {
				if (this.anInt490 < 500) {
					this.anIntArray61[this.anInt490] = Static107.anInt2563;
					this.anIntArray62[this.anInt490] = Static26.anInt1440;
					this.anInt490++;
				}
			}
			Static23.method546(50L);
		}
	}
}
