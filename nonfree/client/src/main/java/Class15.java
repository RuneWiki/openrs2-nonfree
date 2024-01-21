import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dc")
public final class Class15 implements Runnable {

	@OriginalMember(owner = "client!dc", name = "h", descriptor = "Z")
	public boolean aBoolean34 = true;

	@OriginalMember(owner = "client!dc", name = "v", descriptor = "Ljava/lang/Object;")
	public final Object anObject1 = new Object();

	@OriginalMember(owner = "client!dc", name = "x", descriptor = "[I")
	public final int[] anIntArray67 = new int[500];

	@OriginalMember(owner = "client!dc", name = "y", descriptor = "I")
	public int anInt589 = 0;

	@OriginalMember(owner = "client!dc", name = "w", descriptor = "[I")
	public final int[] anIntArray66 = new int[500];

	@OriginalMember(owner = "client!dc", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean34) {
			@Pc(10) Object local10 = this.anObject1;
			synchronized (this.anObject1) {
				if (this.anInt589 < 500) {
					this.anIntArray67[this.anInt589] = Static80.anInt2188;
					this.anIntArray66[this.anInt589] = Static45.anInt1237;
					this.anInt589++;
				}
			}
			Static51.method1782(50L);
		}
	}
}
