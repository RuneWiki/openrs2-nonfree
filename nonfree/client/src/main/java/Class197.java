import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!u")
public final class Class197 implements Runnable {

	@OriginalMember(owner = "client!u", name = "e", descriptor = "Z")
	public boolean aBoolean419 = true;

	@OriginalMember(owner = "client!u", name = "c", descriptor = "Ljava/lang/Object;")
	public final Object anObject6 = new Object();

	@OriginalMember(owner = "client!u", name = "f", descriptor = "I")
	public int anInt6047 = 0;

	@OriginalMember(owner = "client!u", name = "h", descriptor = "[I")
	public final int[] anIntArray540 = new int[500];

	@OriginalMember(owner = "client!u", name = "g", descriptor = "[I")
	public final int[] anIntArray539 = new int[500];

	@OriginalMember(owner = "client!u", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean419) {
			@Pc(6) Object local6 = this.anObject6;
			synchronized (this.anObject6) {
				if (this.anInt6047 < 500) {
					this.anIntArray540[this.anInt6047] = Static63.anInt1529;
					this.anIntArray539[this.anInt6047] = Static328.anInt6333;
					this.anInt6047++;
				}
			}
			Static15.method5425(50L);
		}
	}
}
