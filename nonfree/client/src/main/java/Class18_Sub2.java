import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!q")
public final class Class18_Sub2 extends Class18 {

	@OriginalMember(owner = "client!q", name = "t", descriptor = "J")
	private long aLong117;

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(Z)V", line = 4)
	@Override
	public void method1275() {
		this.method1280();
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(BII)I", line = 17)
	@Override
	public int method1274(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) long local4 = (long) arg1 * 1000000L;
		@Pc(9) long local9 = this.aLong117 - System.nanoTime();
		@Pc(11) int local11 = 0;
		if (local4 > local9) {
			local9 = local4;
		}
		Static86.method1494(local9 / 1000000L);
		@Pc(24) long local24 = System.nanoTime();
		while (local11 < 10 && (local11 < 1 || this.aLong117 < local24)) {
			this.aLong117 += (long) arg0 * 1000000L;
			local11++;
		}
		if (this.aLong117 < local24) {
			this.aLong117 = local24;
		}
		return local11;
	}

	@OriginalMember(owner = "client!q", name = "<init>", descriptor = "()V", line = 44)
	public Class18_Sub2() {
		this.method1280();
	}

	@OriginalMember(owner = "client!q", name = "c", descriptor = "(I)V", line = 53)
	@Override
	public void method1280() {
		this.aLong117 = System.nanoTime();
	}
}
