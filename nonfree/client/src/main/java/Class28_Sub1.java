import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ga")
public final class Class28_Sub1 extends Class28 {

	@OriginalMember(owner = "client!ga", name = "k", descriptor = "J")
	private long aLong52 = System.nanoTime();

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(BII)I")
	@Override
	public int method2587(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) long local4 = (long) arg0 * 1000000L;
		@Pc(9) long local9 = this.aLong52 - System.nanoTime();
		if (local4 > local9) {
			local9 = local4;
		}
		Static35.method627(local9 / 1000000L);
		@Pc(27) int local27 = 0;
		@Pc(35) long local35 = System.nanoTime();
		while (local27 < 10 && (local27 < 1 || local35 > this.aLong52)) {
			this.aLong52 += (long) arg1 * 1000000L;
			local27++;
		}
		if (this.aLong52 < local35) {
			this.aLong52 = local35;
		}
		return local27;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V")
	@Override
	public void method2585() {
		this.aLong52 = System.nanoTime();
	}
}
