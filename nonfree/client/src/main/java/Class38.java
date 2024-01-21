import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ib")
public final class Class38 implements Runnable {

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "Z")
	public boolean aBoolean76 = true;

	@OriginalMember(owner = "client!ib", name = "i", descriptor = "Ljava/lang/Object;")
	public final Object anObject4 = new Object();

	@OriginalMember(owner = "client!ib", name = "k", descriptor = "[I")
	public final int[] anIntArray213 = new int[500];

	@OriginalMember(owner = "client!ib", name = "l", descriptor = "[I")
	public final int[] anIntArray214 = new int[500];

	@OriginalMember(owner = "client!ib", name = "n", descriptor = "I")
	public int anInt2252 = 0;

	@OriginalMember(owner = "client!ib", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean76) {
			@Pc(6) Object local6 = this.anObject4;
			synchronized (this.anObject4) {
				if (this.anInt2252 < 500) {
					this.anIntArray214[this.anInt2252] = Static21.anInt591;
					this.anIntArray213[this.anInt2252] = Static70.anInt2156;
					this.anInt2252++;
				}
			}
			Static24.method517(50L);
		}
	}
}
