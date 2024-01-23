import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rc")
public final class Class2_Sub2 extends Class2 {

	@OriginalMember(owner = "client!rc", name = "j", descriptor = "J")
	private long aLong144 = System.nanoTime();

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(III)I")
	@Override
	public int method2858(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) long local4 = (long) arg0 * 1000000L;
		@Pc(9) long local9 = this.aLong144 - System.nanoTime();
		if (local4 > local9) {
			local9 = local4;
		}
		@Pc(17) int local17 = 0;
		Static148.method2431(local9 / 1000000L);
		@Pc(32) long local32 = System.nanoTime();
		while (local17 < 10 && (local17 < 1 || local32 > this.aLong144)) {
			this.aLong144 += (long) arg1 * 1000000L;
			local17++;
		}
		if (local32 > this.aLong144) {
			this.aLong144 = local32;
		}
		return local17;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)V")
	@Override
	public void method2852() {
		this.aLong144 = System.nanoTime();
	}
}
