import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public final class Class15 implements Runnable {

	@OriginalMember(owner = "client!da", name = "c", descriptor = "Z")
	public boolean aBoolean21 = true;

	@OriginalMember(owner = "client!da", name = "g", descriptor = "Ljava/lang/Object;")
	public final Object anObject3 = new Object();

	@OriginalMember(owner = "client!da", name = "i", descriptor = "[I")
	public final int[] anIntArray118 = new int[500];

	@OriginalMember(owner = "client!da", name = "j", descriptor = "I")
	public int anInt643 = 0;

	@OriginalMember(owner = "client!da", name = "k", descriptor = "[I")
	public final int[] anIntArray119 = new int[500];

	@OriginalMember(owner = "client!da", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean21) {
			@Pc(6) Object local6 = this.anObject3;
			synchronized (this.anObject3) {
				if (this.anInt643 < 500) {
					this.anIntArray119[this.anInt643] = Static30.anInt917;
					this.anIntArray118[this.anInt643] = Static40.anInt1073;
					this.anInt643++;
				}
			}
			Static118.method1893(50L);
		}
	}
}
