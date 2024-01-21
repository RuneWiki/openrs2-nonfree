import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jd")
public final class Class7_Sub2 extends Class7 {

	@OriginalMember(owner = "client!jd", name = "o", descriptor = "J")
	private long aLong52;

	@OriginalMember(owner = "client!jd", name = "<init>", descriptor = "()V")
	public Class7_Sub2() {
		this.method925();
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(III)I")
	@Override
	public int method922(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) long local4 = (long) arg0 * 1000000L;
		@Pc(9) long local9 = this.aLong52 - System.nanoTime();
		if (local9 < local4) {
			local9 = local4;
		}
		Static80.method1260(local9 / 1000000L);
		@Pc(29) long local29 = System.nanoTime();
		@Pc(31) int local31 = 0;
		while (local31 < 10 && (local31 < 1 || local29 > this.aLong52)) {
			local31++;
			this.aLong52 += (long) arg1 * 1000000L;
		}
		if (local29 > this.aLong52) {
			this.aLong52 = local29;
		}
		return local31;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)V")
	@Override
	public void method925() {
		this.aLong52 = System.nanoTime();
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V")
	@Override
	public void method923() {
		this.method925();
	}
}
