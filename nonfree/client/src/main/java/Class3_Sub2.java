import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hb")
public final class Class3_Sub2 extends Class3 {

	@OriginalMember(owner = "client!hb", name = "o", descriptor = "J")
	private long aLong41 = System.nanoTime();

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(III)I")
	@Override
	public int method635(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) long local9 = (long) arg1 * 1000000L;
		@Pc(14) long local14 = this.aLong41 - System.nanoTime();
		if (local9 > local14) {
			local14 = local9;
		}
		Static103.method1711(local14 / 1000000L);
		@Pc(28) int local28 = 0;
		@Pc(30) long local30 = System.nanoTime();
		while (local28 < 10 && (local28 < 1 || this.aLong41 < local30)) {
			this.aLong41 += (long) arg0 * 1000000L;
			local28++;
		}
		if (this.aLong41 < local30) {
			this.aLong41 = local30;
		}
		return local28;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(B)V")
	@Override
	public void method632() {
		this.aLong41 = System.nanoTime();
	}
}
