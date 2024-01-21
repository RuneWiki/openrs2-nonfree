import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ud")
public final class Class11_Sub2 extends Class11 {

	@OriginalMember(owner = "client!ud", name = "B", descriptor = "J")
	private long aLong148 = System.nanoTime();

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(B)V")
	@Override
	public void method1913() {
		this.aLong148 = System.nanoTime();
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(III)I")
	@Override
	public int method1912(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) long local10 = (long) arg1 * 1000000L;
		@Pc(15) long local15 = this.aLong148 - System.nanoTime();
		@Pc(17) int local17 = 0;
		if (local15 < local10) {
			local15 = local10;
		}
		Static109.method2037(local15 / 1000000L);
		@Pc(34) long local34 = System.nanoTime();
		while (local17 < 10 && (local17 < 1 || this.aLong148 < local34)) {
			this.aLong148 += (long) arg0 * 1000000L;
			local17++;
		}
		if (this.aLong148 < local34) {
			this.aLong148 = local34;
		}
		return local17;
	}
}
