import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!j")
public final class Class14_Sub2 extends Class14 {

	@OriginalMember(owner = "client!j", name = "w", descriptor = "J")
	private long aLong37 = System.nanoTime();

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(BII)I")
	@Override
	public int method892(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) long local4 = (long) arg1 * 1000000L;
		@Pc(17) long local17 = this.aLong37 - System.nanoTime();
		if (local17 < local4) {
			local17 = local4;
		}
		@Pc(30) int local30 = 0;
		Static85.method1582(local17 / 1000000L);
		@Pc(37) long local37 = System.nanoTime();
		while (local30 < 10 && (local30 < 1 || local37 > this.aLong37)) {
			local30++;
			this.aLong37 += (long) arg0 * 1000000L;
		}
		if (local37 > this.aLong37) {
			this.aLong37 = local37;
		}
		return local30;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(I)V")
	@Override
	public void method897() {
		this.aLong37 = System.nanoTime();
	}
}
