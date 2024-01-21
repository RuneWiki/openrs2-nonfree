import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!te")
public final class Class56_Sub2 extends Class56 {

	@OriginalMember(owner = "client!te", name = "q", descriptor = "J")
	private long aLong84;

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "()V")
	public Class56_Sub2() {
		this.method2004();
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V")
	@Override
	public void method2004() {
		this.aLong84 = System.nanoTime();
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(BII)I")
	@Override
	public int method2002(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) long local10 = this.aLong84 - System.nanoTime();
		@Pc(15) long local15 = (long) arg0 * 1000000L;
		if (local10 < local15) {
			local10 = local15;
		}
		Static53.method2063(local10 / 1000000L);
		@Pc(32) long local32 = System.nanoTime();
		@Pc(34) int local34 = 0;
		while (local34 < 10 && (local34 < 1 || local32 > this.aLong84)) {
			local34++;
			this.aLong84 += (long) arg1 * 1000000L;
		}
		if (this.aLong84 < local32) {
			this.aLong84 = local32;
		}
		return local34;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Z)V")
	@Override
	public void method2001() {
		this.method2004();
	}
}
