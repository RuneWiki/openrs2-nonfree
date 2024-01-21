import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pf")
public final class Class68_Sub1 extends Class68 {

	@OriginalMember(owner = "client!pf", name = "j", descriptor = "J")
	private long aLong113 = System.nanoTime();

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)V")
	@Override
	public void method2974() {
		this.aLong113 = System.nanoTime();
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IBI)I")
	@Override
	public int method2973(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) long local4 = (long) arg1 * 1000000L;
		@Pc(18) long local18 = this.aLong113 - System.nanoTime();
		if (local4 > local18) {
			local18 = local4;
		}
		Static181.method2982(local18 / 1000000L);
		@Pc(32) long local32 = System.nanoTime();
		@Pc(34) int local34 = 0;
		while (local34 < 10 && (local34 < 1 || local32 > this.aLong113)) {
			local34++;
			this.aLong113 += (long) arg0 * 1000000L;
		}
		if (local32 > this.aLong113) {
			this.aLong113 = local32;
		}
		return local34;
	}
}
