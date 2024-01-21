import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wd")
public final class Class87 implements Runnable {

	@OriginalMember(owner = "client!wd", name = "i", descriptor = "Z")
	public boolean aBoolean167 = true;

	@OriginalMember(owner = "client!wd", name = "k", descriptor = "Ljava/lang/Object;")
	public final Object anObject4 = new Object();

	@OriginalMember(owner = "client!wd", name = "n", descriptor = "[I")
	public final int[] anIntArray420 = new int[500];

	@OriginalMember(owner = "client!wd", name = "o", descriptor = "I")
	public int anInt3791 = 0;

	@OriginalMember(owner = "client!wd", name = "m", descriptor = "[I")
	public final int[] anIntArray419 = new int[500];

	@OriginalMember(owner = "client!wd", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean167) {
			@Pc(6) Object local6 = this.anObject4;
			synchronized (this.anObject4) {
				if (this.anInt3791 < 500) {
					this.anIntArray420[this.anInt3791] = Static72.anInt1723;
					this.anIntArray419[this.anInt3791] = Static61.anInt3635;
					this.anInt3791++;
				}
			}
			Static50.method927(50L);
		}
	}
}
