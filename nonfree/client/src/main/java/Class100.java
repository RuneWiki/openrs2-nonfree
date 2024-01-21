import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public final class Class100 implements Runnable {

	@OriginalMember(owner = "client!uc", name = "i", descriptor = "Z")
	public boolean aBoolean172 = true;

	@OriginalMember(owner = "client!uc", name = "f", descriptor = "Ljava/lang/Object;")
	public final Object anObject4 = new Object();

	@OriginalMember(owner = "client!uc", name = "l", descriptor = "I")
	public int anInt3791 = 0;

	@OriginalMember(owner = "client!uc", name = "k", descriptor = "[I")
	public final int[] anIntArray403 = new int[500];

	@OriginalMember(owner = "client!uc", name = "n", descriptor = "[I")
	public final int[] anIntArray404 = new int[500];

	@OriginalMember(owner = "client!uc", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean172) {
			@Pc(6) Object local6 = this.anObject4;
			synchronized (this.anObject4) {
				if (this.anInt3791 < 500) {
					this.anIntArray403[this.anInt3791] = Static70.anInt1549;
					this.anIntArray404[this.anInt3791] = Static207.anInt4069;
					this.anInt3791++;
				}
			}
			Static210.method739(50L);
		}
	}
}
