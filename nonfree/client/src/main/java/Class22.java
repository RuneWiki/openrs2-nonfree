import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fc")
public final class Class22 implements Runnable {

	@OriginalMember(owner = "client!fc", name = "h", descriptor = "Z")
	public boolean aBoolean27 = true;

	@OriginalMember(owner = "client!fc", name = "m", descriptor = "Ljava/lang/Object;")
	public final Object anObject1 = new Object();

	@OriginalMember(owner = "client!fc", name = "o", descriptor = "I")
	public int anInt917 = 0;

	@OriginalMember(owner = "client!fc", name = "p", descriptor = "[I")
	public final int[] anIntArray69 = new int[500];

	@OriginalMember(owner = "client!fc", name = "q", descriptor = "[I")
	public final int[] anIntArray70 = new int[500];

	@OriginalMember(owner = "client!fc", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean27) {
			@Pc(6) Object local6 = this.anObject1;
			synchronized (this.anObject1) {
				if (this.anInt917 < 500) {
					this.anIntArray70[this.anInt917] = Static82.anInt1962;
					this.anIntArray69[this.anInt917] = Static17.anInt452;
					this.anInt917++;
				}
			}
			Static13.method278(50L);
		}
	}
}
