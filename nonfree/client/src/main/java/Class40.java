import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!je")
public final class Class40 implements Runnable {

	@OriginalMember(owner = "client!je", name = "j", descriptor = "Z")
	public boolean aBoolean89 = true;

	@OriginalMember(owner = "client!je", name = "e", descriptor = "Ljava/lang/Object;")
	public final Object anObject2 = new Object();

	@OriginalMember(owner = "client!je", name = "r", descriptor = "[I")
	public final int[] anIntArray331 = new int[500];

	@OriginalMember(owner = "client!je", name = "p", descriptor = "I")
	public int anInt1983 = 0;

	@OriginalMember(owner = "client!je", name = "s", descriptor = "[I")
	public final int[] anIntArray332 = new int[500];

	@OriginalMember(owner = "client!je", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean89) {
			@Pc(10) Object local10 = this.anObject2;
			synchronized (this.anObject2) {
				if (this.anInt1983 < 500) {
					this.anIntArray331[this.anInt1983] = Static20.anInt631;
					this.anIntArray332[this.anInt1983] = Static132.anInt3185;
					this.anInt1983++;
				}
			}
			Static27.method564(50L);
		}
	}
}
