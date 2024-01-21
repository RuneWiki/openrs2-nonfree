import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!le")
public final class Class6_Sub2 extends Class6 {

	@OriginalMember(owner = "client!le", name = "t", descriptor = "J")
	private long aLong83 = System.nanoTime();

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(III)I")
	@Override
	public int method1721(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) long local4 = this.aLong83 - System.nanoTime();
		@Pc(12) int local12 = 0;
		@Pc(17) long local17 = (long) arg0 * 1000000L;
		if (local17 > local4) {
			local4 = local17;
		}
		Static117.method1813(local4 / 1000000L);
		@Pc(30) long local30 = System.nanoTime();
		while (local12 < 10 && (local12 < 1 || this.aLong83 < local30)) {
			local12++;
			this.aLong83 += (long) arg1 * 1000000L;
		}
		if (local30 > this.aLong83) {
			this.aLong83 = local30;
		}
		return local12;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(B)V")
	@Override
	public void method1719() {
		this.aLong83 = System.nanoTime();
	}
}
