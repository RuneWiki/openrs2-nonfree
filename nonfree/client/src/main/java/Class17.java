import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!d")
public final class Class17 implements Runnable {

	@OriginalMember(owner = "client!d", name = "c", descriptor = "Z")
	public boolean aBoolean52 = true;

	@OriginalMember(owner = "client!d", name = "e", descriptor = "Ljava/lang/Object;")
	public Object anObject1 = new Object();

	@OriginalMember(owner = "client!d", name = "l", descriptor = "[I")
	public int[] anIntArray114 = new int[500];

	@OriginalMember(owner = "client!d", name = "i", descriptor = "[I")
	public int[] anIntArray111 = new int[500];

	@OriginalMember(owner = "client!d", name = "m", descriptor = "I")
	public int anInt815 = 0;

	@OriginalMember(owner = "client!d", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean52) {
			@Pc(10) Object local10 = this.anObject1;
			synchronized (this.anObject1) {
				if (this.anInt815 < 500) {
					this.anIntArray114[this.anInt815] = Static122.anInt2732;
					this.anIntArray111[this.anInt815] = Static176.anInt768;
					this.anInt815++;
				}
			}
			Static146.method2494(50L);
		}
	}
}
