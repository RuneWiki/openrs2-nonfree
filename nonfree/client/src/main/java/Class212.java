import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!maa")
public abstract class Class212 {

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(B)V")
	public abstract void method7746();

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(IJ)I")
	public final int method7748(@OriginalArg(1) long arg0) {
		@Pc(15) long local15 = this.method7750();
		if (local15 > 0L) {
			Static365.method3472(local15);
		}
		return this.method7751(arg0);
	}

	@OriginalMember(owner = "client!maa", name = "b", descriptor = "(B)J")
	public abstract long method7749();

	@OriginalMember(owner = "client!maa", name = "c", descriptor = "(B)J")
	protected abstract long method7750();

	@OriginalMember(owner = "client!maa", name = "b", descriptor = "(IJ)I")
	protected abstract int method7751(@OriginalArg(1) long arg0);
}
