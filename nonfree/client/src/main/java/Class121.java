import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ve")
public final class Class121 implements Runnable {

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "Z")
	public boolean aBoolean430 = true;

	@OriginalMember(owner = "client!ve", name = "h", descriptor = "Ljava/lang/Object;")
	public Object anObject5 = new Object();

	@OriginalMember(owner = "client!ve", name = "i", descriptor = "[I")
	public int[] anIntArray371 = new int[500];

	@OriginalMember(owner = "client!ve", name = "j", descriptor = "I")
	public int anInt4831 = 0;

	@OriginalMember(owner = "client!ve", name = "k", descriptor = "[I")
	public int[] anIntArray372 = new int[500];

	@OriginalMember(owner = "client!ve", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean430) {
			@Pc(10) Object local10 = this.anObject5;
			synchronized (this.anObject5) {
				if (this.anInt4831 < 500) {
					this.anIntArray371[this.anInt4831] = Static220.anInt4822;
					this.anIntArray372[this.anInt4831] = Static181.anInt4311;
					this.anInt4831++;
				}
			}
			Static148.method2431(50L);
		}
	}
}
