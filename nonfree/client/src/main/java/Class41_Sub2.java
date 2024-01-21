import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jg")
public final class Class41_Sub2 extends Class41 {

	@OriginalMember(owner = "client!jg", name = "h", descriptor = "J")
	private long aLong67 = System.nanoTime();

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(III)I")
	@Override
	public int method1581(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) long local4 = (long) arg1 * 1000000L;
		@Pc(9) long local9 = this.aLong67 - System.nanoTime();
		@Pc(11) int local11 = 0;
		if (local4 > local9) {
			local9 = local4;
		}
		Static119.method2069(local9 / 1000000L);
		@Pc(24) long local24 = System.nanoTime();
		while (local11 < 10 && (local11 < 1 || local24 > this.aLong67)) {
			this.aLong67 += (long) arg0 * 1000000L;
			local11++;
		}
		if (local24 > this.aLong67) {
			this.aLong67 = local24;
		}
		return local11;
	}

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(I)V")
	@Override
	public void method1580() {
		this.aLong67 = System.nanoTime();
	}
}
