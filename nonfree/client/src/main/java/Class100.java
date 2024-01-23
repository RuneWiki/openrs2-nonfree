import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jm")
public final class Class100 implements Runnable {

	@OriginalMember(owner = "client!jm", name = "k", descriptor = "Z")
	public boolean aBoolean185 = true;

	@OriginalMember(owner = "client!jm", name = "j", descriptor = "Ljava/lang/Object;")
	public Object anObject4 = new Object();

	@OriginalMember(owner = "client!jm", name = "o", descriptor = "[I")
	public int[] anIntArray236 = new int[500];

	@OriginalMember(owner = "client!jm", name = "n", descriptor = "[I")
	public int[] anIntArray235 = new int[500];

	@OriginalMember(owner = "client!jm", name = "m", descriptor = "I")
	public int anInt2670 = 0;

	@OriginalMember(owner = "client!jm", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean185) {
			@Pc(8) Object local8 = this.anObject4;
			synchronized (this.anObject4) {
				if (this.anInt2670 < 500) {
					this.anIntArray236[this.anInt2670] = Static286.anInt5358;
					this.anIntArray235[this.anInt2670] = Static312.anInt6042;
					this.anInt2670++;
				}
			}
			Static303.method4677(50L);
		}
	}
}
