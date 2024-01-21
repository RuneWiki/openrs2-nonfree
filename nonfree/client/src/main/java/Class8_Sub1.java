import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qa")
public final class Class8_Sub1 extends Class8 {

	@OriginalMember(owner = "client!qa", name = "u", descriptor = "J")
	private long aLong78;

	@OriginalMember(owner = "client!qa", name = "<init>", descriptor = "()V")
	public Class8_Sub1() {
		this.method2117();
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(B)V")
	@Override
	public void method2113() {
		this.method2117();
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V")
	@Override
	public void method2117() {
		this.aLong78 = System.nanoTime();
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(III)I")
	@Override
	public int method2114(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) long local4 = (long) arg0 * 1000000L;
		@Pc(9) long local9 = this.aLong78 - System.nanoTime();
		if (local4 > local9) {
			local9 = local4;
		}
		Static13.method278(local9 / 1000000L);
		@Pc(23) long local23 = System.nanoTime();
		@Pc(25) int local25;
		for (local25 = 0; local25 < 10 && (local25 < 1 || local23 > this.aLong78); local25++) {
			this.aLong78 += (long) arg1 * 1000000L;
		}
		if (this.aLong78 < local23) {
			this.aLong78 = local23;
		}
		return local25;
	}
}
