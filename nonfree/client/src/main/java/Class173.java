import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vj")
public final class Class173 implements Runnable {

	@OriginalMember(owner = "client!vj", name = "f", descriptor = "Z")
	public boolean aBoolean423 = true;

	@OriginalMember(owner = "client!vj", name = "d", descriptor = "Ljava/lang/Object;")
	public Object anObject7 = new Object();

	@OriginalMember(owner = "client!vj", name = "l", descriptor = "[I")
	public int[] anIntArray536 = new int[500];

	@OriginalMember(owner = "client!vj", name = "k", descriptor = "[I")
	public int[] anIntArray535 = new int[500];

	@OriginalMember(owner = "client!vj", name = "m", descriptor = "I")
	public int anInt5393 = 0;

	@OriginalMember(owner = "client!vj", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean423) {
			@Pc(8) Object local8 = this.anObject7;
			synchronized (this.anObject7) {
				if (this.anInt5393 < 500) {
					this.anIntArray535[this.anInt5393] = Static224.anInt4445;
					this.anIntArray536[this.anInt5393] = Static8.anInt226;
					this.anInt5393++;
				}
			}
			Static48.method934(50L);
		}
	}
}
