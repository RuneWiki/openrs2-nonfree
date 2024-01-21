import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!p")
public final class Class56 implements Runnable {

	@OriginalMember(owner = "client!p", name = "i", descriptor = "Z")
	public boolean aBoolean144 = true;

	@OriginalMember(owner = "client!p", name = "j", descriptor = "Ljava/lang/Object;")
	public final Object anObject4 = new Object();

	@OriginalMember(owner = "client!p", name = "p", descriptor = "I")
	public int anInt3314 = 0;

	@OriginalMember(owner = "client!p", name = "o", descriptor = "[I")
	public final int[] anIntArray290 = new int[500];

	@OriginalMember(owner = "client!p", name = "q", descriptor = "[I")
	public final int[] anIntArray291 = new int[500];

	@OriginalMember(owner = "client!p", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean144) {
			@Pc(6) Object local6 = this.anObject4;
			synchronized (this.anObject4) {
				if (this.anInt3314 < 500) {
					this.anIntArray290[this.anInt3314] = Static154.anInt4252;
					this.anIntArray291[this.anInt3314] = Static9.anInt293;
					this.anInt3314++;
				}
			}
			Static114.method2304(50L);
		}
	}
}
