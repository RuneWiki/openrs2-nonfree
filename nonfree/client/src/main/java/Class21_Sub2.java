import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qh")
public final class Class21_Sub2 extends Class21 {

	@OriginalMember(owner = "client!qh", name = "j", descriptor = "J")
	private long aLong117 = System.nanoTime();

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(III)I")
	@Override
	public int method2630(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) long local4 = (long) arg0 * 1000000L;
		@Pc(9) long local9 = this.aLong117 - System.nanoTime();
		@Pc(11) int local11 = 0;
		if (local9 < local4) {
			local9 = local4;
		}
		Static19.method344(local9 / 1000000L);
		@Pc(32) long local32 = System.nanoTime();
		while (local11 < 10 && (local11 < 1 || this.aLong117 < local32)) {
			local11++;
			this.aLong117 += (long) arg1 * 1000000L;
		}
		if (local32 > this.aLong117) {
			this.aLong117 = local32;
		}
		return local11;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(B)V")
	@Override
	public void method2629() {
		this.aLong117 = System.nanoTime();
	}
}
