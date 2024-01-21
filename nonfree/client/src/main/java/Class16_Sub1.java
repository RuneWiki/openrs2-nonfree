import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dd")
public final class Class16_Sub1 extends Class16 {

	@OriginalMember(owner = "client!dd", name = "i", descriptor = "J")
	private long aLong38 = System.nanoTime();

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(III)I")
	@Override
	public int method1662(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) long local4 = (long) arg1 * 1000000L;
		@Pc(9) long local9 = this.aLong38 - System.nanoTime();
		if (local9 < local4) {
			local9 = local4;
		}
		@Pc(23) int local23 = 0;
		Static24.method517(local9 / 1000000L);
		@Pc(30) long local30 = System.nanoTime();
		while (local23 < 10 && (local23 < 1 || local30 > this.aLong38)) {
			this.aLong38 += (long) arg0 * 1000000L;
			local23++;
		}
		if (local30 > this.aLong38) {
			this.aLong38 = local30;
		}
		return local23;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V")
	@Override
	public void method1663() {
		this.aLong38 = System.nanoTime();
	}
}
