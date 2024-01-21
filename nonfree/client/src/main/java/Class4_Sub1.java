import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ae")
public final class Class4_Sub1 extends Class4 {

	@OriginalMember(owner = "client!ae", name = "u", descriptor = "J")
	private long aLong10;

	@OriginalMember(owner = "client!ae", name = "<init>", descriptor = "()V")
	public Class4_Sub1() {
		this.method1908();
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IZI)I")
	@Override
	public int method1913(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) long local4 = (long) arg0 * 1000000L;
		@Pc(9) long local9 = this.aLong10 - System.nanoTime();
		if (local9 < local4) {
			local9 = local4;
		}
		Static40.method822(local9 / 1000000L);
		@Pc(26) long local26 = System.nanoTime();
		@Pc(28) int local28 = 0;
		while (local28 < 10 && (local28 < 1 || local26 > this.aLong10)) {
			local28++;
			this.aLong10 += (long) arg1 * 1000000L;
		}
		if (this.aLong10 < local26) {
			this.aLong10 = local26;
		}
		return local28;
	}

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "(I)V")
	@Override
	public void method1910() {
		this.method1908();
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V")
	@Override
	public void method1908() {
		this.aLong10 = System.nanoTime();
	}
}
