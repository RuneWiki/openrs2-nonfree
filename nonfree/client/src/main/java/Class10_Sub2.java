import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public final class Class10_Sub2 extends Class10 {

	@OriginalMember(owner = "client!uc", name = "t", descriptor = "J")
	private long aLong87 = System.nanoTime();

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Z)V")
	@Override
	public void method1861() {
		this.aLong87 = System.nanoTime();
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(III)I")
	@Override
	public int method1863(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) long local4 = this.aLong87 - System.nanoTime();
		@Pc(6) int local6 = 0;
		@Pc(17) long local17 = (long) arg1 * 1000000L;
		if (local4 < local17) {
			local4 = local17;
		}
		Static81.method1325(local4 / 1000000L);
		@Pc(34) long local34 = System.nanoTime();
		while (local6 < 10 && (local6 < 1 || local34 > this.aLong87)) {
			local6++;
			this.aLong87 += (long) arg0 * 1000000L;
		}
		if (local34 > this.aLong87) {
			this.aLong87 = local34;
		}
		return local6;
	}
}
