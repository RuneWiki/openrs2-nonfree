import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qe")
public final class Class145 implements Runnable {

	@OriginalMember(owner = "client!qe", name = "e", descriptor = "Z")
	public boolean aBoolean296 = true;

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "Ljava/lang/Object;")
	public Object anObject6 = new Object();

	@OriginalMember(owner = "client!qe", name = "k", descriptor = "I")
	public int anInt4336 = 0;

	@OriginalMember(owner = "client!qe", name = "j", descriptor = "[I")
	public int[] anIntArray350 = new int[500];

	@OriginalMember(owner = "client!qe", name = "l", descriptor = "[I")
	public int[] anIntArray351 = new int[500];

	@OriginalMember(owner = "client!qe", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean296) {
			@Pc(8) Object local8 = this.anObject6;
			synchronized (this.anObject6) {
				if (this.anInt4336 < 500) {
					this.anIntArray351[this.anInt4336] = Static152.anInt3132;
					this.anIntArray350[this.anInt4336] = Static300.anInt5678;
					this.anInt4336++;
				}
			}
			Static202.method3246(50L);
		}
	}
}
