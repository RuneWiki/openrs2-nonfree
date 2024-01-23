import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!id")
public final class Class4_Sub2 extends Class4 {

	@OriginalMember(owner = "client!id", name = "k", descriptor = "J")
	private long aLong78 = System.nanoTime();

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(III)I")
	@Override
	public int method1605(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) long local10 = this.aLong78 - System.nanoTime();
		@Pc(12) int local12 = 0;
		@Pc(17) long local17 = (long) arg1 * 1000000L;
		if (local17 > local10) {
			local10 = local17;
		}
		Static156.method2805(local10 / 1000000L);
		@Pc(32) long local32 = System.nanoTime();
		while (local12 < 10 && (local12 < 1 || local32 > this.aLong78)) {
			this.aLong78 += (long) arg0 * 1000000L;
			local12++;
		}
		if (local32 > this.aLong78) {
			this.aLong78 = local32;
		}
		return local12;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(B)V")
	@Override
	public void method1603() {
		this.aLong78 = System.nanoTime();
	}
}
