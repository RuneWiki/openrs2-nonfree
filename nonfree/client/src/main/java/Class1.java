import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vg")
public abstract class Class1 {

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(ZJ)I")
	protected abstract int method6834(@OriginalArg(1) long arg0);

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(JI)I")
	public final int method6836(@OriginalArg(0) long arg0) {
		@Pc(12) long local12 = this.method6840();
		if (local12 > 0L) {
			Static213.method3465(local12);
		}
		return this.method6834(arg0);
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(Z)V")
	public abstract void method6838();

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)J")
	public abstract long method6839();

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "(I)J")
	protected abstract long method6840();
}
