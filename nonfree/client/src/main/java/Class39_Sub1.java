import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ke")
public final class Class39_Sub1 extends Class39 {

	@OriginalMember(owner = "client!ke", name = "p", descriptor = "J")
	private long aLong64;

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "()V")
	public Class39_Sub1() {
		this.method2141();
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(III)I")
	@Override
	public int method2145(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) long local4 = (long) arg1 * 1000000L;
		@Pc(9) long local9 = this.aLong64 - System.nanoTime();
		if (local9 < local4) {
			local9 = local4;
		}
		Static126.method2277(local9 / 1000000L);
		@Pc(29) long local29 = System.nanoTime();
		@Pc(31) int local31 = 0;
		while (local31 < 10 && (local31 < 1 || this.aLong64 < local29)) {
			local31++;
			this.aLong64 += (long) arg0 * 1000000L;
		}
		if (local29 > this.aLong64) {
			this.aLong64 = local29;
		}
		return local31;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V")
	@Override
	public void method2141() {
		this.aLong64 = System.nanoTime();
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(B)V")
	@Override
	public void method2143() {
		this.method2141();
	}
}
