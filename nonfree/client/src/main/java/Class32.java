import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hd")
public final class Class32 implements Runnable {

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "Z")
	public boolean aBoolean43 = true;

	@OriginalMember(owner = "client!hd", name = "j", descriptor = "Ljava/lang/Object;")
	public final Object anObject3 = new Object();

	@OriginalMember(owner = "client!hd", name = "s", descriptor = "[I")
	public final int[] anIntArray145 = new int[500];

	@OriginalMember(owner = "client!hd", name = "n", descriptor = "[I")
	public final int[] anIntArray144 = new int[500];

	@OriginalMember(owner = "client!hd", name = "w", descriptor = "I")
	public int anInt1222 = 0;

	@OriginalMember(owner = "client!hd", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean43) {
			@Pc(6) Object local6 = this.anObject3;
			synchronized (this.anObject3) {
				if (this.anInt1222 < 500) {
					this.anIntArray145[this.anInt1222] = Static99.anInt2348;
					this.anIntArray144[this.anInt1222] = Static105.anInt2433;
					this.anInt1222++;
				}
			}
			Static40.method822(50L);
		}
	}
}
