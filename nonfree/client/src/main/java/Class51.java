import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!la")
public final class Class51 implements Runnable {

	@OriginalMember(owner = "client!la", name = "c", descriptor = "Z")
	public boolean aBoolean88 = true;

	@OriginalMember(owner = "client!la", name = "h", descriptor = "Ljava/lang/Object;")
	public final Object anObject3 = new Object();

	@OriginalMember(owner = "client!la", name = "k", descriptor = "I")
	public int anInt2068 = 0;

	@OriginalMember(owner = "client!la", name = "m", descriptor = "[I")
	public final int[] anIntArray234 = new int[500];

	@OriginalMember(owner = "client!la", name = "l", descriptor = "[I")
	public final int[] anIntArray233 = new int[500];

	@OriginalMember(owner = "client!la", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean88) {
			@Pc(6) Object local6 = this.anObject3;
			synchronized (this.anObject3) {
				if (this.anInt2068 < 500) {
					this.anIntArray233[this.anInt2068] = Static36.anInt973;
					this.anIntArray234[this.anInt2068] = Static172.anInt3997;
					this.anInt2068++;
				}
			}
			Static133.method2259(50L);
		}
	}
}
