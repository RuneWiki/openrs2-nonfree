import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!df")
public final class Class20 implements Runnable {

	@OriginalMember(owner = "client!df", name = "d", descriptor = "Z")
	public boolean aBoolean45 = true;

	@OriginalMember(owner = "client!df", name = "b", descriptor = "Ljava/lang/Object;")
	public final Object anObject3 = new Object();

	@OriginalMember(owner = "client!df", name = "m", descriptor = "[I")
	public final int[] anIntArray86 = new int[500];

	@OriginalMember(owner = "client!df", name = "q", descriptor = "[I")
	public final int[] anIntArray87 = new int[500];

	@OriginalMember(owner = "client!df", name = "s", descriptor = "I")
	public int anInt678 = 0;

	@OriginalMember(owner = "client!df", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean45) {
			@Pc(10) Object local10 = this.anObject3;
			synchronized (this.anObject3) {
				if (this.anInt678 < 500) {
					this.anIntArray87[this.anInt678] = Static81.anInt1404;
					this.anIntArray86[this.anInt678] = Static63.anInt1474;
					this.anInt678++;
				}
			}
			Static117.method2058(50L);
		}
	}
}
