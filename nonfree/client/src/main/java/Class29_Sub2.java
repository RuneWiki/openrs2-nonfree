import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sb")
public final class Class29_Sub2 extends Class29 {

	@OriginalMember(owner = "client!sb", name = "r", descriptor = "J")
	private long aLong76;

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "()V")
	public Class29_Sub2() {
		this.method1590();
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)V")
	@Override
	public void method1591() {
		this.method1590();
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V")
	@Override
	public void method1590() {
		this.aLong76 = System.nanoTime();
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(III)I")
	@Override
	public int method1589(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) long local4 = (long) arg1 * 1000000L;
		@Pc(9) long local9 = this.aLong76 - System.nanoTime();
		if (local9 < local4) {
			local9 = local4;
		}
		Static72.method1367(local9 / 1000000L);
		@Pc(32) long local32 = System.nanoTime();
		@Pc(34) int local34;
		for (local34 = 0; local34 < 10 && (local34 < 1 || this.aLong76 < local32); local34++) {
			this.aLong76 += (long) arg0 * 1000000L;
		}
		if (this.aLong76 < local32) {
			this.aLong76 = local32;
		}
		return local34;
	}
}
