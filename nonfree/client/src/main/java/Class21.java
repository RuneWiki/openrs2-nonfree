import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!de")
public final class Class21 implements Runnable {

	@OriginalMember(owner = "client!de", name = "h", descriptor = "Z")
	public boolean aBoolean43 = true;

	@OriginalMember(owner = "client!de", name = "c", descriptor = "Ljava/lang/Object;")
	public Object anObject2 = new Object();

	@OriginalMember(owner = "client!de", name = "l", descriptor = "[I")
	public int[] anIntArray72 = new int[500];

	@OriginalMember(owner = "client!de", name = "k", descriptor = "[I")
	public int[] anIntArray71 = new int[500];

	@OriginalMember(owner = "client!de", name = "n", descriptor = "I")
	public int anInt878 = 0;

	@OriginalMember(owner = "client!de", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean43) {
			@Pc(6) Object local6 = this.anObject2;
			synchronized (this.anObject2) {
				if (this.anInt878 < 500) {
					this.anIntArray72[this.anInt878] = Static117.anInt2301;
					this.anIntArray71[this.anInt878] = Static110.anInt2205;
					this.anInt878++;
				}
			}
			Static204.method3250(50L);
		}
	}
}
