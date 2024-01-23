import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jj")
public final class Class88 implements Runnable {

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "Z")
	public boolean aBoolean187 = true;

	@OriginalMember(owner = "client!jj", name = "d", descriptor = "Ljava/lang/Object;")
	public Object anObject6 = new Object();

	@OriginalMember(owner = "client!jj", name = "i", descriptor = "[I")
	public int[] anIntArray287 = new int[500];

	@OriginalMember(owner = "client!jj", name = "j", descriptor = "I")
	public int anInt3055 = 0;

	@OriginalMember(owner = "client!jj", name = "k", descriptor = "[I")
	public int[] anIntArray288 = new int[500];

	@OriginalMember(owner = "client!jj", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean187) {
			@Pc(8) Object local8 = this.anObject6;
			synchronized (this.anObject6) {
				if (this.anInt3055 < 500) {
					this.anIntArray288[this.anInt3055] = Static89.anInt5974;
					this.anIntArray287[this.anInt3055] = Static289.anInt5816;
					this.anInt3055++;
				}
			}
			Static312.method4734(50L);
		}
	}
}
