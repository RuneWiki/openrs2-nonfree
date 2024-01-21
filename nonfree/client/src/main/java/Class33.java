import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kb")
public final class Class33 implements Runnable {

	@OriginalMember(owner = "client!kb", name = "f", descriptor = "Z")
	public boolean aBoolean73 = true;

	@OriginalMember(owner = "client!kb", name = "j", descriptor = "Ljava/lang/Object;")
	public final Object anObject4 = new Object();

	@OriginalMember(owner = "client!kb", name = "u", descriptor = "[I")
	public final int[] anIntArray235 = new int[500];

	@OriginalMember(owner = "client!kb", name = "x", descriptor = "[I")
	public final int[] anIntArray236 = new int[500];

	@OriginalMember(owner = "client!kb", name = "w", descriptor = "I")
	public int anInt1426 = 0;

	@OriginalMember(owner = "client!kb", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean73) {
			@Pc(10) Object local10 = this.anObject4;
			synchronized (this.anObject4) {
				if (this.anInt1426 < 500) {
					this.anIntArray235[this.anInt1426] = Static85.anInt2297;
					this.anIntArray236[this.anInt1426] = Static93.anInt2546;
					this.anInt1426++;
				}
			}
			Static41.method888(50L);
		}
	}
}
