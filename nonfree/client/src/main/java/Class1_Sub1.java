import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jd")
public final class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!jd", name = "h", descriptor = "J")
	private long aLong73 = System.nanoTime();

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(III)I")
	@Override
	public int method2040(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) long local4 = (long) arg0 * 1000000L;
		@Pc(6) int local6 = 0;
		@Pc(16) long local16 = this.aLong73 - System.nanoTime();
		if (local4 > local16) {
			local16 = local4;
		}
		Static176.method2744(local16 / 1000000L);
		@Pc(29) long local29 = System.nanoTime();
		while (local6 < 10 && (local6 < 1 || local29 > this.aLong73)) {
			this.aLong73 += (long) arg1 * 1000000L;
			local6++;
		}
		if (local29 > this.aLong73) {
			this.aLong73 = local29;
		}
		return local6;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)V")
	@Override
	public void method2037() {
		this.aLong73 = System.nanoTime();
	}
}
