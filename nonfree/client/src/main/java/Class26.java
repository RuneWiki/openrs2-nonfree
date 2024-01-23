import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dh")
public final class Class26 implements Runnable {

	@OriginalMember(owner = "client!dh", name = "i", descriptor = "Z")
	public boolean aBoolean53 = true;

	@OriginalMember(owner = "client!dh", name = "g", descriptor = "Ljava/lang/Object;")
	public Object anObject2 = new Object();

	@OriginalMember(owner = "client!dh", name = "j", descriptor = "I")
	public int anInt1028 = 0;

	@OriginalMember(owner = "client!dh", name = "k", descriptor = "[I")
	public int[] anIntArray88 = new int[500];

	@OriginalMember(owner = "client!dh", name = "l", descriptor = "[I")
	public int[] anIntArray89 = new int[500];

	@OriginalMember(owner = "client!dh", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean53) {
			@Pc(6) Object local6 = this.anObject2;
			synchronized (this.anObject2) {
				if (this.anInt1028 < 500) {
					this.anIntArray89[this.anInt1028] = Static26.anInt663;
					this.anIntArray88[this.anInt1028] = Static212.anInt4711;
					this.anInt1028++;
				}
			}
			Static19.method344(50L);
		}
	}
}
