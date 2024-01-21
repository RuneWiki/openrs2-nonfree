import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mc")
public final class Class47_Sub2 extends Class47 {

	@OriginalMember(owner = "client!mc", name = "o", descriptor = "J")
	private long aLong66 = System.nanoTime();

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIB)I")
	@Override
	public int method1288(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) long local4 = this.aLong66 - System.nanoTime();
		@Pc(9) long local9 = (long) arg1 * 1000000L;
		if (local4 < local9) {
			local4 = local9;
		}
		@Pc(18) int local18 = 0;
		Static118.method1893(local4 / 1000000L);
		@Pc(30) long local30 = System.nanoTime();
		while (local18 < 10 && (local18 < 1 || this.aLong66 < local30)) {
			this.aLong66 += (long) arg0 * 1000000L;
			local18++;
		}
		if (this.aLong66 < local30) {
			this.aLong66 = local30;
		}
		return local18;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V")
	@Override
	public void method1290() {
		this.aLong66 = System.nanoTime();
	}
}
