import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!w")
public final class Class8_Sub2 extends Class8 {

	@OriginalMember(owner = "client!w", name = "u", descriptor = "J")
	private long aLong96;

	@OriginalMember(owner = "client!w", name = "<init>", descriptor = "()V")
	public Class8_Sub2() {
		this.method2240();
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(I)V")
	@Override
	public void method2245() {
		this.method2240();
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(B)V")
	@Override
	public void method2240() {
		this.aLong96 = System.nanoTime();
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IBI)I")
	@Override
	public int method2242(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) long local4 = (long) arg1 * 1000000L;
		@Pc(14) long local14 = this.aLong96 - System.nanoTime();
		if (local4 > local14) {
			local14 = local4;
		}
		@Pc(22) int local22 = 0;
		Static70.method1226(local14 / 1000000L);
		@Pc(29) long local29 = System.nanoTime();
		while (local22 < 10 && (local22 < 1 || local29 > this.aLong96)) {
			local22++;
			this.aLong96 += (long) arg0 * 1000000L;
		}
		if (local29 > this.aLong96) {
			this.aLong96 = local29;
		}
		return local22;
	}
}
