import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!h")
public final class Class33 implements Runnable {

	@OriginalMember(owner = "client!h", name = "e", descriptor = "Z")
	public boolean aBoolean37 = true;

	@OriginalMember(owner = "client!h", name = "g", descriptor = "Ljava/lang/Object;")
	public final Object anObject19 = new Object();

	@OriginalMember(owner = "client!h", name = "h", descriptor = "I")
	public int anInt845 = 0;

	@OriginalMember(owner = "client!h", name = "v", descriptor = "[I")
	public final int[] anIntArray101 = new int[500];

	@OriginalMember(owner = "client!h", name = "x", descriptor = "[I")
	public final int[] anIntArray102 = new int[500];

	@OriginalMember(owner = "client!h", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean37) {
			@Pc(10) Object local10 = this.anObject19;
			synchronized (this.anObject19) {
				if (this.anInt845 < 500) {
					this.anIntArray102[this.anInt845] = Static66.anInt1586;
					this.anIntArray101[this.anInt845] = Static39.anInt837;
					this.anInt845++;
				}
			}
			Static81.method1325(50L);
		}
	}
}
