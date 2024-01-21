import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fa")
public final class Class19_Sub1 extends Class19 {

	@OriginalMember(owner = "client!fa", name = "r", descriptor = "J")
	private long aLong39;

	@OriginalMember(owner = "client!fa", name = "<init>", descriptor = "()V")
	public Class19_Sub1() {
		this.method1168();
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(III)I")
	@Override
	public int method1163(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) long local4 = (long) arg1 * 1000000L;
		@Pc(15) int local15 = 0;
		@Pc(20) long local20 = this.aLong39 - System.nanoTime();
		if (local20 < local4) {
			local20 = local4;
		}
		Static58.method1193(local20 / 1000000L);
		@Pc(37) long local37 = System.nanoTime();
		while (local15 < 10 && (local15 < 1 || this.aLong39 < local37)) {
			this.aLong39 += (long) arg0 * 1000000L;
			local15++;
		}
		if (this.aLong39 < local37) {
			this.aLong39 = local37;
		}
		return local15;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(B)V")
	@Override
	public void method1164() {
		this.method1168();
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(B)V")
	@Override
	public void method1168() {
		this.aLong39 = System.nanoTime();
	}
}
