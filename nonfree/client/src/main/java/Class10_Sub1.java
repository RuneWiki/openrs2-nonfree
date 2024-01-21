import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!c")
public final class Class10_Sub1 extends Class10 {

	@OriginalMember(owner = "client!c", name = "s", descriptor = "J")
	private long aLong18 = System.nanoTime();

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(III)I")
	@Override
	public int method543(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) long local4 = (long) arg1 * 1000000L;
		@Pc(15) long local15 = this.aLong18 - System.nanoTime();
		if (local4 > local15) {
			local15 = local4;
		}
		Static13.method399(local15 / 1000000L);
		@Pc(29) int local29 = 0;
		@Pc(31) long local31 = System.nanoTime();
		while (local29 < 10 && (local29 < 1 || local31 > this.aLong18)) {
			this.aLong18 += (long) arg0 * 1000000L;
			local29++;
		}
		if (local31 > this.aLong18) {
			this.aLong18 = local31;
		}
		return local29;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Z)V")
	@Override
	public void method539() {
		this.aLong18 = System.nanoTime();
	}
}
