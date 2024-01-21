import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aa")
public final class Class2_Sub1 extends Class2 {

	@OriginalMember(owner = "client!aa", name = "B", descriptor = "J")
	private long aLong4;

	@OriginalMember(owner = "client!aa", name = "<init>", descriptor = "()V")
	public Class2_Sub1() {
		this.method678();
	}

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(III)I")
	@Override
	public int method673(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) long local4 = (long) arg0 * 1000000L;
		@Pc(15) int local15 = 0;
		@Pc(20) long local20 = this.aLong4 - System.nanoTime();
		if (local4 > local20) {
			local20 = local4;
		}
		Static117.method2058(local20 / 1000000L);
		@Pc(34) long local34 = System.nanoTime();
		while (local15 < 10 && (local15 < 1 || this.aLong4 < local34)) {
			local15++;
			this.aLong4 += (long) arg1 * 1000000L;
		}
		if (this.aLong4 < local34) {
			this.aLong4 = local34;
		}
		return local15;
	}

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "(I)V")
	@Override
	public void method676() {
		this.method678();
	}

	@OriginalMember(owner = "client!aa", name = "e", descriptor = "(I)V")
	@Override
	public void method678() {
		this.aLong4 = System.nanoTime();
	}
}
