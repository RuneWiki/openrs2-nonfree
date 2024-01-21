import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!n")
public final class Class14_Sub1 extends Class14 {

	@OriginalMember(owner = "client!n", name = "j", descriptor = "J")
	private long aLong55;

	@OriginalMember(owner = "client!n", name = "<init>", descriptor = "()V")
	public Class14_Sub1() {
		this.method1810();
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(III)I")
	@Override
	public int method1811(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) long local4 = (long) arg0 * 1000000L;
		@Pc(14) int local14 = 0;
		@Pc(19) long local19 = this.aLong55 - System.nanoTime();
		if (local4 > local19) {
			local19 = local4;
		}
		Static96.method1616(local19 / 1000000L);
		@Pc(37) long local37 = System.nanoTime();
		while (local14 < 10 && (local14 < 1 || this.aLong55 < local37)) {
			this.aLong55 += (long) arg1 * 1000000L;
			local14++;
		}
		if (this.aLong55 < local37) {
			this.aLong55 = local37;
		}
		return local14;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V")
	@Override
	public void method1809() {
		this.method1810();
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "(I)V")
	@Override
	public void method1810() {
		this.aLong55 = System.nanoTime();
	}
}
