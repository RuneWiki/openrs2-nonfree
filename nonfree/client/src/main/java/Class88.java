import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kc")
public final class Class88 implements Runnable {

	@OriginalMember(owner = "client!kc", name = "e", descriptor = "Z")
	public boolean aBoolean178 = true;

	@OriginalMember(owner = "client!kc", name = "h", descriptor = "Ljava/lang/Object;")
	public Object anObject3 = new Object();

	@OriginalMember(owner = "client!kc", name = "k", descriptor = "I")
	public int anInt2837 = 0;

	@OriginalMember(owner = "client!kc", name = "n", descriptor = "[I")
	public int[] anIntArray238 = new int[500];

	@OriginalMember(owner = "client!kc", name = "m", descriptor = "[I")
	public int[] anIntArray237 = new int[500];

	@OriginalMember(owner = "client!kc", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean178) {
			@Pc(8) Object local8 = this.anObject3;
			synchronized (this.anObject3) {
				if (this.anInt2837 < 500) {
					this.anIntArray237[this.anInt2837] = Static247.anInt4467;
					this.anIntArray238[this.anInt2837] = Static222.anInt4105;
					this.anInt2837++;
				}
			}
			Static282.method4345(50L);
		}
	}
}
