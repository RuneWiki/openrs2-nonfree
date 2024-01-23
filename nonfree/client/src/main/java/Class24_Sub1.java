import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gf")
public final class Class24_Sub1 extends Class24 {

	@OriginalMember(owner = "client!gf", name = "p", descriptor = "J")
	private long aLong53 = System.nanoTime();

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)V")
	@Override
	public void method1678() {
		this.aLong53 = System.nanoTime();
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(III)I")
	@Override
	public int method1679(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) long local4 = this.aLong53 - System.nanoTime();
		@Pc(9) long local9 = (long) arg0 * 1000000L;
		if (local4 < local9) {
			local4 = local9;
		}
		Static186.method3115(local4 / 1000000L);
		@Pc(27) long local27 = System.nanoTime();
		@Pc(29) int local29;
		for (local29 = 0; local29 < 10 && (local29 < 1 || local27 > this.aLong53); local29++) {
			this.aLong53 += (long) arg1 * 1000000L;
		}
		if (local27 > this.aLong53) {
			this.aLong53 = local27;
		}
		return local29;
	}
}
