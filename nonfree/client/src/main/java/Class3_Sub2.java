import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!re")
public final class Class3_Sub2 extends Class3 {

	@OriginalMember(owner = "client!re", name = "m", descriptor = "J")
	private long aLong81 = System.nanoTime();

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(III)I")
	@Override
	public int method1485(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) long local4 = this.aLong81 - System.nanoTime();
		@Pc(9) long local9 = (long) arg0 * 1000000L;
		if (local4 < local9) {
			local4 = local9;
		}
		Static107.method1511(local4 / 1000000L);
		@Pc(23) int local23 = 0;
		@Pc(25) long local25 = System.nanoTime();
		while (local23 < 10 && (local23 < 1 || this.aLong81 < local25)) {
			this.aLong81 += (long) arg1 * 1000000L;
			local23++;
		}
		if (this.aLong81 < local25) {
			this.aLong81 = local25;
		}
		return local23;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V")
	@Override
	public void method1484() {
		this.aLong81 = System.nanoTime();
	}
}
