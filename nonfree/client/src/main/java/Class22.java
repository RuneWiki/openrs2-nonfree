import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fd")
public final class Class22 implements Runnable {

	@OriginalMember(owner = "client!fd", name = "j", descriptor = "Z")
	public boolean aBoolean40 = true;

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "Ljava/lang/Object;")
	public final Object anObject3 = new Object();

	@OriginalMember(owner = "client!fd", name = "r", descriptor = "I")
	public int anInt898 = 0;

	@OriginalMember(owner = "client!fd", name = "s", descriptor = "[I")
	public final int[] anIntArray97 = new int[500];

	@OriginalMember(owner = "client!fd", name = "t", descriptor = "[I")
	public final int[] anIntArray98 = new int[500];

	@OriginalMember(owner = "client!fd", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean40) {
			@Pc(10) Object local10 = this.anObject3;
			synchronized (this.anObject3) {
				if (this.anInt898 < 500) {
					this.anIntArray98[this.anInt898] = Static28.anInt889;
					this.anIntArray97[this.anInt898] = Static17.anInt597;
					this.anInt898++;
				}
			}
			Static93.method1123(50L);
		}
	}
}
