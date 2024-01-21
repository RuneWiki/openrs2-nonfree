import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!je")
public final class Class37 implements Runnable {

	@OriginalMember(owner = "client!je", name = "i", descriptor = "Z")
	public boolean aBoolean77 = true;

	@OriginalMember(owner = "client!je", name = "f", descriptor = "Ljava/lang/Object;")
	public final Object anObject1 = new Object();

	@OriginalMember(owner = "client!je", name = "q", descriptor = "[I")
	public final int[] anIntArray112 = new int[500];

	@OriginalMember(owner = "client!je", name = "s", descriptor = "[I")
	public final int[] anIntArray113 = new int[500];

	@OriginalMember(owner = "client!je", name = "p", descriptor = "I")
	public int anInt1386 = 0;

	@OriginalMember(owner = "client!je", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean77) {
			@Pc(6) Object local6 = this.anObject1;
			synchronized (this.anObject1) {
				if (this.anInt1386 < 500) {
					this.anIntArray113[this.anInt1386] = Static6.anInt208;
					this.anIntArray112[this.anInt1386] = Static61.anInt1672;
					this.anInt1386++;
				}
			}
			Static24.method505(50L);
		}
	}
}
