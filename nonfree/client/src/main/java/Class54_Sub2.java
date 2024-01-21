import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ud")
public final class Class54_Sub2 extends Class54 {

	@OriginalMember(owner = "client!ud", name = "h", descriptor = "J")
	private long aLong146 = System.nanoTime();

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIB)I")
	@Override
	public int method2770(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) long local4 = (long) arg1 * 1000000L;
		@Pc(9) long local9 = this.aLong146 - System.nanoTime();
		if (local4 > local9) {
			local9 = local4;
		}
		@Pc(18) int local18 = 0;
		Static50.method901(local9 / 1000000L);
		@Pc(25) long local25 = System.nanoTime();
		while (local18 < 10 && (local18 < 1 || local25 > this.aLong146)) {
			local18++;
			this.aLong146 += (long) arg0 * 1000000L;
		}
		if (local25 > this.aLong146) {
			this.aLong146 = local25;
		}
		return local18;
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)V")
	@Override
	public void method2772() {
		this.aLong146 = System.nanoTime();
	}
}
