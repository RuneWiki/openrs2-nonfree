import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!te")
public final class Class29_Sub2 extends Class29 {

	@OriginalMember(owner = "client!te", name = "i", descriptor = "J")
	private long aLong138 = System.nanoTime();

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(B)V")
	@Override
	public void method3261() {
		this.aLong138 = System.nanoTime();
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(III)I")
	@Override
	public int method3259(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) long local4 = this.aLong138 - System.nanoTime();
		@Pc(6) int local6 = 0;
		@Pc(11) long local11 = (long) arg0 * 1000000L;
		if (local11 > local4) {
			local4 = local11;
		}
		Static85.method1993(local4 / 1000000L);
		@Pc(31) long local31 = System.nanoTime();
		while (local6 < 10 && (local6 < 1 || this.aLong138 < local31)) {
			this.aLong138 += (long) arg1 * 1000000L;
			local6++;
		}
		if (local31 > this.aLong138) {
			this.aLong138 = local31;
		}
		return local6;
	}
}
