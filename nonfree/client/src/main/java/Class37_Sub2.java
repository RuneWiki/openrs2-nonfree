import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!td")
public final class Class37_Sub2 extends Class37 {

	@OriginalMember(owner = "client!td", name = "z", descriptor = "J")
	private long aLong76;

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "()V")
	public Class37_Sub2() {
		this.method1695();
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(I)V")
	@Override
	public void method1691() {
		this.method1695();
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(B)V")
	@Override
	public void method1695() {
		this.aLong76 = System.nanoTime();
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(III)I")
	@Override
	public int method1696(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) long local4 = this.aLong76 - System.nanoTime();
		@Pc(9) long local9 = (long) arg0 * 1000000L;
		@Pc(17) int local17 = 0;
		if (local9 > local4) {
			local4 = local9;
		}
		Static74.method1220(local4 / 1000000L);
		@Pc(32) long local32 = System.nanoTime();
		while (local17 < 10 && (local17 < 1 || this.aLong76 < local32)) {
			this.aLong76 += (long) arg1 * 1000000L;
			local17++;
		}
		if (local32 > this.aLong76) {
			this.aLong76 = local32;
		}
		return local17;
	}
}
