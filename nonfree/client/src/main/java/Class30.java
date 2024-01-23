import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!db")
public final class Class30 implements Runnable {

	@OriginalMember(owner = "client!db", name = "d", descriptor = "Z")
	public boolean aBoolean64 = true;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "Ljava/lang/Object;")
	public Object anObject1 = new Object();

	@OriginalMember(owner = "client!db", name = "m", descriptor = "I")
	public int anInt1047 = 0;

	@OriginalMember(owner = "client!db", name = "l", descriptor = "[I")
	public int[] anIntArray112 = new int[500];

	@OriginalMember(owner = "client!db", name = "n", descriptor = "[I")
	public int[] anIntArray113 = new int[500];

	@OriginalMember(owner = "client!db", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean64) {
			@Pc(8) Object local8 = this.anObject1;
			synchronized (this.anObject1) {
				if (this.anInt1047 < 500) {
					this.anIntArray112[this.anInt1047] = Static79.anInt1661;
					this.anIntArray113[this.anInt1047] = Static178.anInt3603;
					this.anInt1047++;
				}
			}
			Static193.method3169(50L);
		}
	}
}
