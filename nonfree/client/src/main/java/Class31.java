import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gg")
public final class Class31 implements Runnable {

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "Z")
	public boolean aBoolean80 = true;

	@OriginalMember(owner = "client!gg", name = "f", descriptor = "Ljava/lang/Object;")
	public final Object anObject3 = new Object();

	@OriginalMember(owner = "client!gg", name = "v", descriptor = "[I")
	public final int[] anIntArray179 = new int[500];

	@OriginalMember(owner = "client!gg", name = "x", descriptor = "I")
	public int anInt1933 = 0;

	@OriginalMember(owner = "client!gg", name = "y", descriptor = "[I")
	public final int[] anIntArray180 = new int[500];

	@OriginalMember(owner = "client!gg", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean80) {
			@Pc(6) Object local6 = this.anObject3;
			synchronized (this.anObject3) {
				if (this.anInt1933 < 500) {
					this.anIntArray180[this.anInt1933] = Static131.anInt215;
					this.anIntArray179[this.anInt1933] = Static157.anInt3985;
					this.anInt1933++;
				}
			}
			Static85.method1993(50L);
		}
	}
}
