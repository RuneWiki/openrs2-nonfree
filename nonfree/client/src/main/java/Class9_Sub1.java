import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bd")
public final class Class9_Sub1 extends Class9 {

	@OriginalMember(owner = "client!bd", name = "s", descriptor = "J")
	private long aLong6;

	@OriginalMember(owner = "client!bd", name = "<init>", descriptor = "()V")
	public Class9_Sub1() {
		this.method811();
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(Z)V")
	@Override
	public void method810() {
		this.method811();
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(ZII)I")
	@Override
	public int method812(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) long local4 = (long) arg0 * 1000000L;
		@Pc(9) long local9 = this.aLong6 - System.nanoTime();
		if (local4 > local9) {
			local9 = local4;
		}
		Static51.method1782(local9 / 1000000L);
		@Pc(27) int local27 = 0;
		@Pc(35) long local35 = System.nanoTime();
		while (local27 < 10 && (local27 < 1 || local35 > this.aLong6)) {
			this.aLong6 += (long) arg1 * 1000000L;
			local27++;
		}
		if (this.aLong6 < local35) {
			this.aLong6 = local35;
		}
		return local27;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V")
	@Override
	public void method811() {
		this.aLong6 = System.nanoTime();
	}
}
