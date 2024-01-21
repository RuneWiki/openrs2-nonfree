import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!db")
public final class Class7_Sub2 extends Class7 {

	@OriginalMember(owner = "client!db", name = "n", descriptor = "J")
	private long aLong22;

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "()V")
	public Class7_Sub2() {
		this.method475();
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(I)V")
	@Override
	public void method474() {
		this.method475();
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(BII)I")
	@Override
	public int method473(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) long local4 = this.aLong22 - System.nanoTime();
		@Pc(15) long local15 = (long) arg1 * 1000000L;
		if (local4 < local15) {
			local4 = local15;
		}
		Static91.method1548(local4 / 1000000L);
		@Pc(32) long local32 = System.nanoTime();
		@Pc(34) int local34;
		for (local34 = 0; local34 < 10 && (local34 < 1 || local32 > this.aLong22); local34++) {
			this.aLong22 += (long) arg0 * 1000000L;
		}
		if (local32 > this.aLong22) {
			this.aLong22 = local32;
		}
		return local34;
	}

	@OriginalMember(owner = "client!db", name = "c", descriptor = "(I)V")
	private void method475() {
		this.aLong22 = System.nanoTime();
	}
}
