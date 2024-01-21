import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!b")
public final class Class7_Sub1 extends Class7 {

	@OriginalMember(owner = "client!b", name = "n", descriptor = "J")
	private long aLong4;

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "()V")
	public Class7_Sub1() {
		this.method242();
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(III)I")
	@Override
	public int method241(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) long local4 = (long) arg0 * 1000000L;
		@Pc(15) long local15 = this.aLong4 - System.nanoTime();
		@Pc(17) int local17 = 0;
		if (local15 < local4) {
			local15 = local4;
		}
		Static93.method1123(local15 / 1000000L);
		@Pc(35) long local35 = System.nanoTime();
		while (local17 < 10 && (local17 < 1 || local35 > this.aLong4)) {
			local17++;
			this.aLong4 += (long) arg1 * 1000000L;
		}
		if (local35 > this.aLong4) {
			this.aLong4 = local35;
		}
		return local17;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Z)V")
	@Override
	public void method242() {
		this.aLong4 = System.nanoTime();
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(B)V")
	@Override
	public void method244() {
		this.method242();
	}
}
