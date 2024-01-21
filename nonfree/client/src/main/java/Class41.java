import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nc")
public final class Class41 implements Runnable {

	@OriginalMember(owner = "client!nc", name = "p", descriptor = "Z")
	public boolean aBoolean106 = true;

	@OriginalMember(owner = "client!nc", name = "h", descriptor = "Ljava/lang/Object;")
	public final Object anObject4 = new Object();

	@OriginalMember(owner = "client!nc", name = "x", descriptor = "I")
	public int anInt1948 = 0;

	@OriginalMember(owner = "client!nc", name = "w", descriptor = "[I")
	public final int[] anIntArray205 = new int[500];

	@OriginalMember(owner = "client!nc", name = "y", descriptor = "[I")
	public final int[] anIntArray206 = new int[500];

	@OriginalMember(owner = "client!nc", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean106) {
			@Pc(10) Object local10 = this.anObject4;
			synchronized (this.anObject4) {
				if (this.anInt1948 < 500) {
					this.anIntArray206[this.anInt1948] = Static22.anInt930;
					this.anIntArray205[this.anInt1948] = Static84.anInt2248;
					this.anInt1948++;
				}
			}
			Static72.method1367(50L);
		}
	}
}
