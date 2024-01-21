import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aj")
public final class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!aj", name = "j", descriptor = "J")
	private long aLong11 = System.nanoTime();

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(B)V")
	@Override
	public void method1313() {
		this.aLong11 = System.nanoTime();
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIZ)I")
	@Override
	public int method1310(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) long local4 = this.aLong11 - System.nanoTime();
		@Pc(6) int local6 = 0;
		@Pc(15) long local15 = (long) arg0 * 1000000L;
		if (local4 < local15) {
			local4 = local15;
		}
		Static119.method1720(local4 / 1000000L);
		@Pc(28) long local28 = System.nanoTime();
		while (local6 < 10 && (local6 < 1 || local28 > this.aLong11)) {
			this.aLong11 += (long) arg1 * 1000000L;
			local6++;
		}
		if (local28 > this.aLong11) {
			this.aLong11 = local28;
		}
		return local6;
	}
}
