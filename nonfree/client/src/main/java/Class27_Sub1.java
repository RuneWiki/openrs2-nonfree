import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ia")
public final class Class27_Sub1 extends Class27 {

	@OriginalMember(owner = "client!ia", name = "z", descriptor = "J")
	private long aLong36;

	@OriginalMember(owner = "client!ia", name = "<init>", descriptor = "()V")
	public Class27_Sub1() {
		this.method1924();
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(I)V")
	@Override
	public void method1923() {
		this.method1924();
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(III)I")
	@Override
	public int method1921(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) long local4 = (long) arg1 * 1000000L;
		@Pc(15) long local15 = this.aLong36 - System.nanoTime();
		if (local15 < local4) {
			local15 = local4;
		}
		@Pc(28) int local28 = 0;
		Static68.method1173(local15 / 1000000L);
		@Pc(35) long local35 = System.nanoTime();
		while (local28 < 10 && (local28 < 1 || local35 > this.aLong36)) {
			local28++;
			this.aLong36 += (long) arg0 * 1000000L;
		}
		if (local35 > this.aLong36) {
			this.aLong36 = local35;
		}
		return local28;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V")
	@Override
	public void method1924() {
		this.aLong36 = System.nanoTime();
	}
}
