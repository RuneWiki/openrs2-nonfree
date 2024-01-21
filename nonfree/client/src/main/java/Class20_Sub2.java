import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jf")
public final class Class20_Sub2 extends Class20 {

	@OriginalMember(owner = "client!jf", name = "l", descriptor = "J")
	private long aLong59 = System.nanoTime();

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V")
	@Override
	public void method1226() {
		this.aLong59 = System.nanoTime();
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(ZII)I")
	@Override
	public int method1229(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) long local4 = (long) arg1 * 1000000L;
		@Pc(9) long local9 = this.aLong59 - System.nanoTime();
		if (local4 > local9) {
			local9 = local4;
		}
		Static135.method2059(local9 / 1000000L);
		@Pc(23) int local23 = 0;
		@Pc(25) long local25 = System.nanoTime();
		while (local23 < 10 && (local23 < 1 || this.aLong59 < local25)) {
			this.aLong59 += (long) arg0 * 1000000L;
			local23++;
		}
		if (local25 > this.aLong59) {
			this.aLong59 = local25;
		}
		return local23;
	}
}
