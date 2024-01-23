import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oi")
public final class Class115 implements Runnable {

	@OriginalMember(owner = "client!oi", name = "m", descriptor = "Z")
	public boolean aBoolean213 = true;

	@OriginalMember(owner = "client!oi", name = "k", descriptor = "Ljava/lang/Object;")
	public Object anObject6 = new Object();

	@OriginalMember(owner = "client!oi", name = "s", descriptor = "[I")
	public int[] anIntArray385 = new int[500];

	@OriginalMember(owner = "client!oi", name = "t", descriptor = "I")
	public int anInt4252 = 0;

	@OriginalMember(owner = "client!oi", name = "r", descriptor = "[I")
	public int[] anIntArray384 = new int[500];

	@OriginalMember(owner = "client!oi", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean213) {
			@Pc(8) Object local8 = this.anObject6;
			synchronized (this.anObject6) {
				if (this.anInt4252 < 500) {
					this.anIntArray385[this.anInt4252] = Static84.anInt1989;
					this.anIntArray384[this.anInt4252] = Static212.anInt4711;
					this.anInt4252++;
				}
			}
			Static230.method4022(50L);
		}
	}
}
