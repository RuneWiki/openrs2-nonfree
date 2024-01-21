import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gf")
public final class Class7_Sub2 extends Class7 {

	@OriginalMember(owner = "client!gf", name = "s", descriptor = "J")
	private long aLong75 = System.nanoTime();

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IBI)I")
	@Override
	public int method1024(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) long local4 = this.aLong75 - System.nanoTime();
		@Pc(9) long local9 = (long) arg1 * 1000000L;
		if (local4 < local9) {
			local4 = local9;
		}
		@Pc(17) int local17 = 0;
		Static210.method739(local4 / 1000000L);
		@Pc(24) long local24 = System.nanoTime();
		while (local17 < 10 && (local17 < 1 || this.aLong75 < local24)) {
			this.aLong75 += (long) arg0 * 1000000L;
			local17++;
		}
		if (this.aLong75 < local24) {
			this.aLong75 = local24;
		}
		return local17;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)V")
	@Override
	public void method1026() {
		this.aLong75 = System.nanoTime();
	}
}
