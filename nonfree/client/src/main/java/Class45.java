import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ig")
public final class Class45 implements Runnable {

	@OriginalMember(owner = "client!ig", name = "h", descriptor = "Z")
	public boolean aBoolean94 = true;

	@OriginalMember(owner = "client!ig", name = "c", descriptor = "Ljava/lang/Object;")
	public final Object anObject3 = new Object();

	@OriginalMember(owner = "client!ig", name = "n", descriptor = "[I")
	public final int[] anIntArray172 = new int[500];

	@OriginalMember(owner = "client!ig", name = "p", descriptor = "I")
	public int anInt1791 = 0;

	@OriginalMember(owner = "client!ig", name = "r", descriptor = "[I")
	public final int[] anIntArray173 = new int[500];

	@OriginalMember(owner = "client!ig", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean94) {
			@Pc(10) Object local10 = this.anObject3;
			synchronized (this.anObject3) {
				if (this.anInt1791 < 500) {
					this.anIntArray172[this.anInt1791] = Static4.anInt95;
					this.anIntArray173[this.anInt1791] = Static121.anInt2740;
					this.anInt1791++;
				}
			}
			Static119.method2069(50L);
		}
	}
}
