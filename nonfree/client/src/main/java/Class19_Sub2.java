import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sa")
public final class Class19_Sub2 extends Class19 {

	@OriginalMember(owner = "client!sa", name = "j", descriptor = "J")
	private long aLong150;

	@OriginalMember(owner = "client!sa", name = "<init>", descriptor = "()V")
	public Class19_Sub2() {
		this.method1737();
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(III)I")
	@Override
	public int method1736(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) long local4 = (long) arg1 * 1000000L;
		@Pc(9) long local9 = this.aLong150 - System.nanoTime();
		if (local4 > local9) {
			local9 = local4;
		}
		Static53.method1782(local9 / 1000000L);
		@Pc(27) long local27 = System.nanoTime();
		@Pc(29) int local29 = 0;
		while (local29 < 10 && (local29 < 1 || local27 > this.aLong150)) {
			local29++;
			this.aLong150 += (long) arg0 * 1000000L;
		}
		if (local27 > this.aLong150) {
			this.aLong150 = local27;
		}
		return local29;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)V")
	@Override
	public void method1734() {
		this.method1737();
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(I)V")
	@Override
	public void method1737() {
		this.aLong150 = System.nanoTime();
	}
}
