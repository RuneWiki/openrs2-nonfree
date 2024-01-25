import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ud")
public final class Class198 implements Runnable {

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "Z")
	public boolean aBoolean452 = true;

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "Ljava/lang/Object;")
	public final Object anObject7 = new Object();

	@OriginalMember(owner = "client!ud", name = "g", descriptor = "[I")
	public final int[] anIntArray513 = new int[500];

	@OriginalMember(owner = "client!ud", name = "h", descriptor = "I")
	public int anInt6025 = 0;

	@OriginalMember(owner = "client!ud", name = "i", descriptor = "[I")
	public final int[] anIntArray514 = new int[500];

	@OriginalMember(owner = "client!ud", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean452) {
			@Pc(10) Object local10 = this.anObject7;
			synchronized (this.anObject7) {
				if (this.anInt6025 < 500) {
					this.anIntArray513[this.anInt6025] = Static270.anInt5171;
					this.anIntArray514[this.anInt6025] = Static274.anInt5378;
					this.anInt6025++;
				}
			}
			Static105.method2138(50L);
		}
	}
}
