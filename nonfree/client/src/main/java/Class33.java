import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ia")
public final class Class33 implements Runnable {

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "Z")
	public boolean aBoolean54 = true;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "Ljava/lang/Object;")
	public final Object anObject3 = new Object();

	@OriginalMember(owner = "client!ia", name = "q", descriptor = "I")
	public int anInt1373 = 0;

	@OriginalMember(owner = "client!ia", name = "p", descriptor = "[I")
	public final int[] anIntArray173 = new int[500];

	@OriginalMember(owner = "client!ia", name = "n", descriptor = "[I")
	public final int[] anIntArray172 = new int[500];

	@OriginalMember(owner = "client!ia", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean54) {
			@Pc(10) Object local10 = this.anObject3;
			synchronized (this.anObject3) {
				if (this.anInt1373 < 500) {
					this.anIntArray172[this.anInt1373] = Static14.anInt366;
					this.anIntArray173[this.anInt1373] = Static121.anInt2909;
					this.anInt1373++;
				}
			}
			Static107.method1511(50L);
		}
	}
}
