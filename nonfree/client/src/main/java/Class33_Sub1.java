import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mb")
public final class Class33_Sub1 extends Class33 {

	@OriginalMember(owner = "client!mb", name = "r", descriptor = "J")
	private long aLong52;

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "()V")
	public Class33_Sub1() {
		this.method1517();
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(III)I")
	@Override
	public int method1520(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) long local4 = (long) arg0 * 1000000L;
		@Pc(9) long local9 = this.aLong52 - System.nanoTime();
		@Pc(11) int local11 = 0;
		if (local9 < local4) {
			local9 = local4;
		}
		Static68.method1266(local9 / 1000000L);
		@Pc(34) long local34 = System.nanoTime();
		while (local11 < 10 && (local11 < 1 || local34 > this.aLong52)) {
			this.aLong52 += (long) arg1 * 1000000L;
			local11++;
		}
		if (this.aLong52 < local34) {
			this.aLong52 = local34;
		}
		return local11;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(B)V")
	@Override
	public void method1516() {
		this.method1517();
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)V")
	@Override
	public void method1517() {
		this.aLong52 = System.nanoTime();
	}
}
