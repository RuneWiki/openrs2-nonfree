import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!d")
public final class Class30 implements Runnable {

	@OriginalMember(owner = "client!d", name = "b", descriptor = "Z")
	public boolean aBoolean97 = true;

	@OriginalMember(owner = "client!d", name = "g", descriptor = "Ljava/lang/Object;")
	public Object anObject1 = new Object();

	@OriginalMember(owner = "client!d", name = "i", descriptor = "[I")
	public int[] anIntArray80 = new int[500];

	@OriginalMember(owner = "client!d", name = "j", descriptor = "[I")
	public int[] anIntArray81 = new int[500];

	@OriginalMember(owner = "client!d", name = "k", descriptor = "I")
	public int anInt1042 = 0;

	@OriginalMember(owner = "client!d", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean97) {
			@Pc(8) Object local8 = this.anObject1;
			synchronized (this.anObject1) {
				if (this.anInt1042 < 500) {
					this.anIntArray81[this.anInt1042] = Static89.anInt1899;
					this.anIntArray80[this.anInt1042] = Static14.anInt309;
					this.anInt1042++;
				}
			}
			Static16.method242(50L);
		}
	}
}
