import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ac")
public final class Class4_Sub1 extends Class4 {

	@OriginalMember(owner = "client!ac", name = "r", descriptor = "J")
	private long aLong7;

	@OriginalMember(owner = "client!ac", name = "<init>", descriptor = "()V")
	public Class4_Sub1() {
		this.method1695();
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Z)V")
	@Override
	public void method1691() {
		this.method1695();
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(III)I")
	@Override
	public int method1692(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) long local4 = (long) arg0 * 1000000L;
		@Pc(9) long local9 = this.aLong7 - System.nanoTime();
		if (local9 < local4) {
			local9 = local4;
		}
		Static17.method318(local9 / 1000000L);
		@Pc(27) int local27 = 0;
		@Pc(29) long local29 = System.nanoTime();
		while (local27 < 10 && (local27 < 1 || this.aLong7 < local29)) {
			local27++;
			this.aLong7 += (long) arg1 * 1000000L;
		}
		if (this.aLong7 < local29) {
			this.aLong7 = local29;
		}
		return local27;
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(B)V")
	@Override
	public void method1695() {
		this.aLong7 = System.nanoTime();
	}
}
