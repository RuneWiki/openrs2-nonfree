import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lj")
public final class Class68_Sub2 extends Class68 {

	@OriginalMember(owner = "client!lj", name = "n", descriptor = "J")
	private long aLong108 = System.nanoTime();

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(B)V")
	@Override
	public void method2540() {
		this.aLong108 = System.nanoTime();
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IBI)I")
	@Override
	public int method2537(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) long local4 = (long) arg0 * 1000000L;
		@Pc(6) int local6 = 0;
		@Pc(20) long local20 = this.aLong108 - System.nanoTime();
		if (local20 < local4) {
			local20 = local4;
		}
		Static30.method587(local20 / 1000000L);
		@Pc(37) long local37 = System.nanoTime();
		while (local6 < 10 && (local6 < 1 || local37 > this.aLong108)) {
			local6++;
			this.aLong108 += (long) arg1 * 1000000L;
		}
		if (local37 > this.aLong108) {
			this.aLong108 = local37;
		}
		return local6;
	}
}
