import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fe")
public final class Class28_Sub1 extends Class28 {

	@OriginalMember(owner = "client!fe", name = "o", descriptor = "J")
	private long aLong43 = System.nanoTime();

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(ZII)I")
	@Override
	public int method3135(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(6) long local6 = (long) arg0 * 1000000L;
		@Pc(11) long local11 = this.aLong43 - System.nanoTime();
		if (local11 < local6) {
			local11 = local6;
		}
		Static52.method1025(local11 / 1000000L);
		@Pc(24) long local24 = System.nanoTime();
		while (local1 < 10 && (local1 < 1 || local24 > this.aLong43)) {
			local1++;
			this.aLong43 += (long) arg1 * 1000000L;
		}
		if (this.aLong43 < local24) {
			this.aLong43 = local24;
		}
		return local1;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V")
	@Override
	public void method3131() {
		this.aLong43 = System.nanoTime();
	}
}
