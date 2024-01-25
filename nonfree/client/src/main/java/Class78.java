import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dv")
public abstract class Class78 {

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(IJ)I")
	public final int method6571(@OriginalArg(1) long arg0) {
		@Pc(12) long local12 = this.method6573();
		if (local12 > 0L) {
			Static566.method8004(local12);
		}
		return this.method6576(arg0);
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(Z)J")
	protected abstract long method6573();

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(B)J")
	public abstract long method6575();

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(BJ)I")
	protected abstract int method6576(@OriginalArg(1) long arg0);

	@OriginalMember(owner = "client!dv", name = "b", descriptor = "(Z)V")
	public abstract void method6582();
}
