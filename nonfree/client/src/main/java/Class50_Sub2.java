import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public final class Class50_Sub2 extends Class50 {

	@OriginalMember(owner = "client!uc", name = "j", descriptor = "J")
	private long aLong126 = System.nanoTime();

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IBI)I")
	@Override
	public int method2979(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) long local4 = (long) arg0 * 1000000L;
		@Pc(9) long local9 = this.aLong126 - System.nanoTime();
		@Pc(11) int local11 = 0;
		if (local9 < local4) {
			local9 = local4;
		}
		Static114.method2304(local9 / 1000000L);
		@Pc(34) long local34 = System.nanoTime();
		while (local11 < 10 && (local11 < 1 || local34 > this.aLong126)) {
			local11++;
			this.aLong126 += (long) arg1 * 1000000L;
		}
		if (local34 > this.aLong126) {
			this.aLong126 = local34;
		}
		return local11;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V")
	@Override
	public void method2977() {
		this.aLong126 = System.nanoTime();
	}
}
