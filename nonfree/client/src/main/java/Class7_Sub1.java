import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bc")
public final class Class7_Sub1 extends Class7 {

	@OriginalMember(owner = "client!bc", name = "t", descriptor = "J")
	private long aLong9;

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "()V")
	public Class7_Sub1() {
		this.method682();
	}

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "(I)V")
	@Override
	public void method684() {
		this.method682();
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(I)V")
	@Override
	public void method682() {
		this.aLong9 = System.nanoTime();
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(III)I")
	@Override
	public int method683(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) long local4 = (long) arg0 * 1000000L;
		@Pc(9) long local9 = this.aLong9 - System.nanoTime();
		if (local4 > local9) {
			local9 = local4;
		}
		Static41.method888(local9 / 1000000L);
		@Pc(22) long local22 = System.nanoTime();
		@Pc(24) int local24 = 0;
		while (local24 < 10 && (local24 < 1 || local22 > this.aLong9)) {
			local24++;
			this.aLong9 += (long) arg1 * 1000000L;
		}
		if (this.aLong9 < local22) {
			this.aLong9 = local22;
		}
		return local24;
	}
}
