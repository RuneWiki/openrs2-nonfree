import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fe")
public final class Class4_Sub2 extends Class4 {

	@OriginalMember(owner = "client!fe", name = "r", descriptor = "J")
	private long aLong32;

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "()V")
	public Class4_Sub2() {
		this.method708();
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)V")
	@Override
	public void method706() {
		this.method708();
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Z)V")
	@Override
	public void method708() {
		this.aLong32 = System.nanoTime();
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IZI)I")
	@Override
	public int method707(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) long local4 = (long) arg0 * 1000000L;
		@Pc(9) long local9 = this.aLong32 - System.nanoTime();
		if (local4 > local9) {
			local9 = local4;
		}
		Static23.method546(local9 / 1000000L);
		@Pc(26) int local26 = 0;
		@Pc(28) long local28 = System.nanoTime();
		while (local26 < 10 && (local26 < 1 || local28 > this.aLong32)) {
			this.aLong32 += (long) arg1 * 1000000L;
			local26++;
		}
		if (local28 > this.aLong32) {
			this.aLong32 = local28;
		}
		return local26;
	}
}
