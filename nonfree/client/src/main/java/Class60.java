import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!re")
public final class Class60 implements Runnable {

	@OriginalMember(owner = "client!re", name = "p", descriptor = "Z")
	public boolean aBoolean106 = true;

	@OriginalMember(owner = "client!re", name = "f", descriptor = "Ljava/lang/Object;")
	public final Object anObject4 = new Object();

	@OriginalMember(owner = "client!re", name = "r", descriptor = "I")
	public int anInt2366 = 0;

	@OriginalMember(owner = "client!re", name = "u", descriptor = "[I")
	public final int[] anIntArray283 = new int[500];

	@OriginalMember(owner = "client!re", name = "t", descriptor = "[I")
	public final int[] anIntArray282 = new int[500];

	@OriginalMember(owner = "client!re", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean106) {
			@Pc(10) Object local10 = this.anObject4;
			synchronized (this.anObject4) {
				if (this.anInt2366 < 500) {
					this.anIntArray283[this.anInt2366] = Static115.anInt1789;
					this.anIntArray282[this.anInt2366] = Static64.anInt1640;
					this.anInt2366++;
				}
			}
			Static68.method1173(50L);
		}
	}
}
