import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jk")
public final class Class88 implements Runnable {

	@OriginalMember(owner = "client!jk", name = "h", descriptor = "Z")
	public boolean aBoolean217 = true;

	@OriginalMember(owner = "client!jk", name = "f", descriptor = "Ljava/lang/Object;")
	public Object anObject3 = new Object();

	@OriginalMember(owner = "client!jk", name = "o", descriptor = "[I")
	public int[] anIntArray312 = new int[500];

	@OriginalMember(owner = "client!jk", name = "m", descriptor = "[I")
	public int[] anIntArray311 = new int[500];

	@OriginalMember(owner = "client!jk", name = "l", descriptor = "I")
	public int anInt3091 = 0;

	@OriginalMember(owner = "client!jk", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean217) {
			@Pc(12) Object local12 = this.anObject3;
			synchronized (this.anObject3) {
				if (this.anInt3091 < 500) {
					this.anIntArray311[this.anInt3091] = Static131.anInt3016;
					this.anIntArray312[this.anInt3091] = Static281.anInt5551;
					this.anInt3091++;
				}
			}
			Static138.method2475(50L);
		}
	}
}
