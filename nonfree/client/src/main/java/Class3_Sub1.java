import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ug")
public final class Class3_Sub1 extends Class3 {

	@OriginalMember(owner = "client!ug", name = "l", descriptor = "J")
	private long aLong136 = System.nanoTime();

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(BII)I")
	@Override
	public int method3512(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) long local4 = this.aLong136 - System.nanoTime();
		@Pc(9) long local9 = (long) arg1 * 1000000L;
		@Pc(11) int local11 = 0;
		if (local4 < local9) {
			local4 = local9;
		}
		Static75.method3577(local4 / 1000000L);
		@Pc(24) long local24 = System.nanoTime();
		while (local11 < 10 && (local11 < 1 || local24 > this.aLong136)) {
			local11++;
			this.aLong136 += (long) arg0 * 1000000L;
		}
		if (this.aLong136 < local24) {
			this.aLong136 = local24;
		}
		return local11;
	}

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(I)V")
	@Override
	public void method3515() {
		this.aLong136 = System.nanoTime();
	}
}
