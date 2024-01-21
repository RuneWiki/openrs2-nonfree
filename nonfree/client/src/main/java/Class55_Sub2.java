import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wc")
public final class Class55_Sub2 extends Class55 {

	@OriginalMember(owner = "client!wc", name = "o", descriptor = "J")
	private long aLong157;

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "()V")
	public Class55_Sub2() {
		this.method2208();
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(III)I")
	@Override
	public int method2211(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) long local4 = (long) arg0 * 1000000L;
		@Pc(9) long local9 = this.aLong157 - System.nanoTime();
		if (local4 > local9) {
			local9 = local4;
		}
		Static125.method2177(local9 / 1000000L);
		@Pc(32) long local32 = System.nanoTime();
		@Pc(34) int local34 = 0;
		while (local34 < 10 && (local34 < 1 || this.aLong157 < local32)) {
			local34++;
			this.aLong157 += (long) arg1 * 1000000L;
		}
		if (this.aLong157 < local32) {
			this.aLong157 = local32;
		}
		return local34;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Z)V")
	@Override
	public void method2209() {
		this.method2208();
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(I)V")
	@Override
	public void method2208() {
		this.aLong157 = System.nanoTime();
	}
}
