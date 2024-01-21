import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ge")
public final class Class20_Sub2 extends Class20 {

	@OriginalMember(owner = "client!ge", name = "k", descriptor = "J")
	private long aLong50 = System.nanoTime();

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(III)I")
	@Override
	public int method1111(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) long local4 = this.aLong50 - System.nanoTime();
		@Pc(6) int local6 = 0;
		@Pc(11) long local11 = (long) arg0 * 1000000L;
		if (local11 > local4) {
			local4 = local11;
		}
		Static135.method2569(local4 / 1000000L);
		@Pc(35) long local35 = System.nanoTime();
		while (local6 < 10 && (local6 < 1 || local35 > this.aLong50)) {
			this.aLong50 += (long) arg1 * 1000000L;
			local6++;
		}
		if (this.aLong50 < local35) {
			this.aLong50 = local35;
		}
		return local6;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)V")
	@Override
	public void method1108() {
		this.aLong50 = System.nanoTime();
	}
}
