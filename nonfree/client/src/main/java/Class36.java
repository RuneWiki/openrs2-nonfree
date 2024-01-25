import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eb")
public abstract class Class36 {

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Z)J")
	protected abstract long method3801();

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)V")
	public abstract void method3803();

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "(B)J")
	public abstract long method3804();

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IJ)I")
	protected abstract int method3807(@OriginalArg(1) long arg0);

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(BJ)I")
	public final int method3809(@OriginalArg(1) long arg0) {
		@Pc(7) long local7 = this.method3801();
		if (local7 > 0L) {
			Static620.method7045(-4, local7);
		}
		return this.method3807(arg0);
	}
}
