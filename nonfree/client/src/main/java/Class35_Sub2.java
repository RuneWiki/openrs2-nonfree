import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sf")
public final class Class35_Sub2 extends Class35 {

	@OriginalMember(owner = "client!sf", name = "j", descriptor = "J")
	private long aLong197 = System.nanoTime();

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)V")
	@Override
	public void method2689() {
		this.aLong197 = System.nanoTime();
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIB)I")
	@Override
	public int method2687(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) long local4 = (long) arg0 * 1000000L;
		@Pc(9) long local9 = this.aLong197 - System.nanoTime();
		if (local4 > local9) {
			local9 = local4;
		}
		Static199.method3292(local9 / 1000000L);
		@Pc(23) long local23 = System.nanoTime();
		@Pc(25) int local25;
		for (local25 = 0; local25 < 10 && (local25 < 1 || local23 > this.aLong197); local25++) {
			this.aLong197 += (long) arg1 * 1000000L;
		}
		if (local23 > this.aLong197) {
			this.aLong197 = local23;
		}
		return local25;
	}
}
