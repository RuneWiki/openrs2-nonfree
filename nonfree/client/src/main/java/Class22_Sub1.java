import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ga")
public final class Class22_Sub1 extends Class22 {

	@OriginalMember(owner = "client!ga", name = "p", descriptor = "J")
	private long aLong22;

	@OriginalMember(owner = "client!ga", name = "<init>", descriptor = "()V")
	public Class22_Sub1() {
		this.method900();
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(III)I")
	@Override
	public int method898(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) long local4 = (long) arg1 * 1000000L;
		@Pc(17) long local17 = this.aLong22 - System.nanoTime();
		if (local4 > local17) {
			local17 = local4;
		}
		@Pc(26) int local26 = 0;
		Static39.method862(local17 / 1000000L);
		@Pc(33) long local33 = System.nanoTime();
		while (local26 < 10 && (local26 < 1 || this.aLong22 < local33)) {
			this.aLong22 += (long) arg0 * 1000000L;
			local26++;
		}
		if (local33 > this.aLong22) {
			this.aLong22 = local33;
		}
		return local26;
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(Z)V")
	@Override
	public void method901() {
		this.method900();
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(I)V")
	@Override
	public void method900() {
		this.aLong22 = System.nanoTime();
	}
}
