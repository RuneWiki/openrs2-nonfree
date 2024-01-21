import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!j")
public final class Class34 implements Runnable {

	@OriginalMember(owner = "client!j", name = "h", descriptor = "Z")
	public boolean aBoolean64 = true;

	@OriginalMember(owner = "client!j", name = "o", descriptor = "Ljava/lang/Object;")
	public final Object anObject2 = new Object();

	@OriginalMember(owner = "client!j", name = "q", descriptor = "I")
	public int anInt1307 = 0;

	@OriginalMember(owner = "client!j", name = "r", descriptor = "[I")
	public final int[] anIntArray151 = new int[500];

	@OriginalMember(owner = "client!j", name = "A", descriptor = "[I")
	public final int[] anIntArray152 = new int[500];

	@OriginalMember(owner = "client!j", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean64) {
			@Pc(6) Object local6 = this.anObject2;
			synchronized (this.anObject2) {
				if (this.anInt1307 < 500) {
					this.anIntArray152[this.anInt1307] = Static100.anInt2512;
					this.anIntArray151[this.anInt1307] = Static49.anInt1325;
					this.anInt1307++;
				}
			}
			Static74.method1220(50L);
		}
	}
}
