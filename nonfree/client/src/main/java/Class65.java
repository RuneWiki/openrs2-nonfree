import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!n")
public final class Class65 implements Runnable {

	@OriginalMember(owner = "client!n", name = "h", descriptor = "Z")
	public boolean aBoolean138 = true;

	@OriginalMember(owner = "client!n", name = "e", descriptor = "Ljava/lang/Object;")
	public Object anObject4 = new Object();

	@OriginalMember(owner = "client!n", name = "l", descriptor = "[I")
	public int[] anIntArray505 = new int[500];

	@OriginalMember(owner = "client!n", name = "m", descriptor = "[I")
	public int[] anIntArray506 = new int[500];

	@OriginalMember(owner = "client!n", name = "k", descriptor = "I")
	public int anInt3089 = 0;

	@OriginalMember(owner = "client!n", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean138) {
			@Pc(6) Object local6 = this.anObject4;
			synchronized (this.anObject4) {
				if (this.anInt3089 < 500) {
					this.anIntArray505[this.anInt3089] = Static44.anInt806;
					this.anIntArray506[this.anInt3089] = Static81.anInt1744;
					this.anInt3089++;
				}
			}
			Static156.method2805(50L);
		}
	}
}
