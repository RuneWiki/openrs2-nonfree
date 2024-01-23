import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vc")
public final class Class92_Sub2 extends Class92 {

	@OriginalMember(owner = "client!vc", name = "e", descriptor = "J")
	private long aLong163 = System.nanoTime();

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(III)I")
	@Override
	public int method3384(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) long local4 = (long) arg1 * 1000000L;
		@Pc(9) long local9 = this.aLong163 - System.nanoTime();
		if (local9 < local4) {
			local9 = local4;
		}
		@Pc(21) int local21 = 0;
		Static204.method3250(local9 / 1000000L);
		@Pc(30) long local30 = System.nanoTime();
		while (local21 < 10 && (local21 < 1 || this.aLong163 < local30)) {
			local21++;
			this.aLong163 += (long) arg0 * 1000000L;
		}
		if (local30 > this.aLong163) {
			this.aLong163 = local30;
		}
		return local21;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V")
	@Override
	public void method3385() {
		this.aLong163 = System.nanoTime();
	}
}
