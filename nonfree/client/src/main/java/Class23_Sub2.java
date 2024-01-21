import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!la")
public final class Class23_Sub2 extends Class23 {

	@OriginalMember(owner = "client!la", name = "o", descriptor = "J")
	private long aLong79 = System.nanoTime();

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(III)I")
	@Override
	public int method1620(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) long local9 = this.aLong79 - System.nanoTime();
		@Pc(14) long local14 = (long) arg1 * 1000000L;
		if (local14 > local9) {
			local9 = local14;
		}
		Static27.method564(local9 / 1000000L);
		@Pc(27) int local27 = 0;
		@Pc(29) long local29 = System.nanoTime();
		while (local27 < 10 && (local27 < 1 || this.aLong79 < local29)) {
			local27++;
			this.aLong79 += (long) arg0 * 1000000L;
		}
		if (local29 > this.aLong79) {
			this.aLong79 = local29;
		}
		return local27;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V")
	@Override
	public void method1618() {
		this.aLong79 = System.nanoTime();
	}
}
