import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sf")
public final class Class69_Sub1 extends Class69 {

	@OriginalMember(owner = "client!sf", name = "f", descriptor = "J")
	private long aLong156 = System.nanoTime();

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)V")
	@Override
	public void method2512() {
		this.aLong156 = System.nanoTime();
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(III)I")
	@Override
	public int method2514(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) long local4 = this.aLong156 - System.nanoTime();
		@Pc(9) long local9 = (long) arg1 * 1000000L;
		if (local4 < local9) {
			local4 = local9;
		}
		Static166.method2609(local4 / 1000000L);
		@Pc(26) long local26 = System.nanoTime();
		@Pc(28) int local28;
		for (local28 = 0; local28 < 10 && (local28 < 1 || this.aLong156 < local26); local28++) {
			this.aLong156 += (long) arg0 * 1000000L;
		}
		if (local26 > this.aLong156) {
			this.aLong156 = local26;
		}
		return local28;
	}
}
