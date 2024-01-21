import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pd")
public final class Class7_Sub2 extends Class7 {

	@OriginalMember(owner = "client!pd", name = "l", descriptor = "J")
	private long aLong75 = System.nanoTime();

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(III)I")
	@Override
	public int method1574(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) long local4 = this.aLong75 - System.nanoTime();
		@Pc(15) long local15 = (long) arg1 * 1000000L;
		if (local4 < local15) {
			local4 = local15;
		}
		Static46.method889(local4 / 1000000L);
		@Pc(33) long local33 = System.nanoTime();
		@Pc(35) int local35 = 0;
		while (local35 < 10 && (local35 < 1 || local33 > this.aLong75)) {
			local35++;
			this.aLong75 += (long) arg0 * 1000000L;
		}
		if (local33 > this.aLong75) {
			this.aLong75 = local33;
		}
		return local35;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V")
	@Override
	public void method1573() {
		this.aLong75 = System.nanoTime();
	}
}
