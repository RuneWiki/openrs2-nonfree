import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ua")
public final class Class26_Sub2 extends Class26 {

	@OriginalMember(owner = "client!ua", name = "h", descriptor = "J")
	private long aLong131 = System.nanoTime();

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V")
	@Override
	public void method3055() {
		this.aLong131 = System.nanoTime();
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(III)I")
	@Override
	public int method3054(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) long local9 = this.aLong131 - System.nanoTime();
		@Pc(14) long local14 = (long) arg0 * 1000000L;
		@Pc(16) int local16 = 0;
		if (local9 < local14) {
			local9 = local14;
		}
		Static146.method2494(local9 / 1000000L);
		@Pc(34) long local34 = System.nanoTime();
		while (local16 < 10 && (local16 < 1 || local34 > this.aLong131)) {
			local16++;
			this.aLong131 += (long) arg1 * 1000000L;
		}
		if (this.aLong131 < local34) {
			this.aLong131 = local34;
		}
		return local16;
	}
}
