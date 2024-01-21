import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ia")
public final class Class37 implements Runnable {

	@OriginalMember(owner = "client!ia", name = "n", descriptor = "Z")
	public boolean aBoolean82 = true;

	@OriginalMember(owner = "client!ia", name = "j", descriptor = "Ljava/lang/Object;")
	public final Object anObject1 = new Object();

	@OriginalMember(owner = "client!ia", name = "q", descriptor = "[I")
	public final int[] anIntArray160 = new int[500];

	@OriginalMember(owner = "client!ia", name = "t", descriptor = "I")
	public int anInt1165 = 0;

	@OriginalMember(owner = "client!ia", name = "s", descriptor = "[I")
	public final int[] anIntArray161 = new int[500];

	@OriginalMember(owner = "client!ia", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean82) {
			@Pc(10) Object local10 = this.anObject1;
			synchronized (this.anObject1) {
				if (this.anInt1165 < 500) {
					this.anIntArray160[this.anInt1165] = Static22.anInt496;
					this.anIntArray161[this.anInt1165] = Static78.anInt420;
					this.anInt1165++;
				}
			}
			Static104.method1701(50L);
		}
	}
}
