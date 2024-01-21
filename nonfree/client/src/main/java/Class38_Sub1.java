import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!id")
public final class Class38_Sub1 extends Class38 {

	@OriginalMember(owner = "client!id", name = "l", descriptor = "J")
	private long aLong57 = System.nanoTime();

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(III)I")
	@Override
	public int method1879(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) long local4 = (long) arg1 * 1000000L;
		@Pc(15) long local15 = this.aLong57 - System.nanoTime();
		if (local4 > local15) {
			local15 = local4;
		}
		@Pc(27) int local27 = 0;
		Static50.method927(local15 / 1000000L);
		@Pc(34) long local34 = System.nanoTime();
		while (local27 < 10 && (local27 < 1 || this.aLong57 < local34)) {
			this.aLong57 += (long) arg0 * 1000000L;
			local27++;
		}
		if (local34 > this.aLong57) {
			this.aLong57 = local34;
		}
		return local27;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(B)V")
	@Override
	public void method1878() {
		this.aLong57 = System.nanoTime();
	}
}
