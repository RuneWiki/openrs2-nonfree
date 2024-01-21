import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ia")
public final class Class36_Sub1 extends Class36 {

	@OriginalMember(owner = "client!ia", name = "f", descriptor = "J")
	private long aLong60 = System.nanoTime();

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(B)V")
	@Override
	public void method2681() {
		this.aLong60 = System.nanoTime();
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(BII)I")
	@Override
	public int method2684(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) long local4 = this.aLong60 - System.nanoTime();
		@Pc(6) int local6 = 0;
		@Pc(11) long local11 = (long) arg1 * 1000000L;
		if (local4 < local11) {
			local4 = local11;
		}
		Static133.method2259(local4 / 1000000L);
		@Pc(28) long local28 = System.nanoTime();
		while (local6 < 10 && (local6 < 1 || this.aLong60 < local28)) {
			this.aLong60 += (long) arg0 * 1000000L;
			local6++;
		}
		if (this.aLong60 < local28) {
			this.aLong60 = local28;
		}
		return local6;
	}
}
