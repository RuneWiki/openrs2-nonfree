import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!b")
public final class Class7_Sub1 extends Class7 {

	@OriginalMember(owner = "client!b", name = "j", descriptor = "J")
	private long aLong11 = System.nanoTime();

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(III)I")
	@Override
	public int method577(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) long local4 = (long) arg1 * 1000000L;
		@Pc(9) long local9 = this.aLong11 - System.nanoTime();
		if (local4 > local9) {
			local9 = local4;
		}
		Static35.method583(local9 / 1000000L);
		@Pc(22) int local22 = 0;
		@Pc(24) long local24 = System.nanoTime();
		while (local22 < 10 && (local22 < 1 || local24 > this.aLong11)) {
			local22++;
			this.aLong11 += (long) arg0 * 1000000L;
		}
		if (local24 > this.aLong11) {
			this.aLong11 = local24;
		}
		return local22;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(I)V")
	@Override
	public void method578() {
		this.aLong11 = System.nanoTime();
	}
}
