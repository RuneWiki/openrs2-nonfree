import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!b")
public final class Class9_Sub1 extends Class9 {

	@OriginalMember(owner = "client!b", name = "o", descriptor = "J")
	private long aLong10 = System.nanoTime();

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(I)V")
	@Override
	public void method3007() {
		this.aLong10 = System.nanoTime();
	}

	@OriginalMember(owner = "client!b", name = "c", descriptor = "(III)I")
	@Override
	public int method3010(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) long local10 = (long) arg1 * 1000000L;
		@Pc(15) long local15 = this.aLong10 - System.nanoTime();
		if (local15 < local10) {
			local15 = local10;
		}
		@Pc(24) int local24 = 0;
		Static65.method1574(local15 / 1000000L);
		@Pc(31) long local31 = System.nanoTime();
		while (local24 < 10 && (local24 < 1 || local31 > this.aLong10)) {
			this.aLong10 += (long) arg0 * 1000000L;
			local24++;
		}
		if (this.aLong10 < local31) {
			this.aLong10 = local31;
		}
		return local24;
	}
}
