import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fe")
public final class Class54 implements Runnable {

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "Z")
	public boolean aBoolean125 = true;

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "Ljava/lang/Object;")
	public Object anObject3 = new Object();

	@OriginalMember(owner = "client!fe", name = "g", descriptor = "[I")
	public int[] anIntArray113 = new int[500];

	@OriginalMember(owner = "client!fe", name = "h", descriptor = "I")
	public int anInt1512 = 0;

	@OriginalMember(owner = "client!fe", name = "f", descriptor = "[I")
	public int[] anIntArray112 = new int[500];

	@OriginalMember(owner = "client!fe", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean125) {
			@Pc(12) Object local12 = this.anObject3;
			synchronized (this.anObject3) {
				if (this.anInt1512 < 500) {
					this.anIntArray112[this.anInt1512] = Static86.anInt1911;
					this.anIntArray113[this.anInt1512] = Static238.anInt4852;
					this.anInt1512++;
				}
			}
			Static134.method2329(50L);
		}
	}
}
