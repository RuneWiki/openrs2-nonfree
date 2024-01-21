import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nc")
public final class Class2_Sub2 extends Class2 {

	@OriginalMember(owner = "client!nc", name = "q", descriptor = "J")
	private long aLong63 = System.nanoTime();

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Z)V")
	@Override
	public void method1399() {
		this.aLong63 = System.nanoTime();
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIB)I")
	@Override
	public int method1398(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(6) long local6 = this.aLong63 - System.nanoTime();
		@Pc(11) long local11 = (long) arg1 * 1000000L;
		if (local11 > local6) {
			local6 = local11;
		}
		Static6.method84(local6 / 1000000L);
		@Pc(30) long local30 = System.nanoTime();
		while (local1 < 10 && (local1 < 1 || local30 > this.aLong63)) {
			this.aLong63 += (long) arg0 * 1000000L;
			local1++;
		}
		if (local30 > this.aLong63) {
			this.aLong63 = local30;
		}
		return local1;
	}
}
