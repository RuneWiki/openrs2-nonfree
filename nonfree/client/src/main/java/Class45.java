import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gg")
public abstract class Class45 {

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(B)J")
	protected abstract long method7465();

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)V")
	public abstract void method7468();

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IJ)I")
	protected abstract int method7469(@OriginalArg(1) long arg0);

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(JI)I")
	public final int method7471(@OriginalArg(0) long arg0) {
		@Pc(15) long local15 = this.method7465();
		if (local15 > 0L) {
			Static391.method5400(local15);
		}
		return this.method7469(arg0);
	}

	@OriginalMember(owner = "client!gg", name = "c", descriptor = "(I)J")
	public abstract long method7472();
}
