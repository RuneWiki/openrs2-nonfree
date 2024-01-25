import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!f")
public abstract class Class93 {

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(BJ)I")
	protected abstract int method7549(@OriginalArg(1) long arg0);

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(I)V")
	public abstract void method7550();

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(B)J")
	public abstract long method7551();

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IJ)I")
	public final int method7552(@OriginalArg(1) long arg0) {
		@Pc(7) long local7 = this.method7554();
		if (local7 > 0L) {
			Static265.method3147(local7);
		}
		return this.method7549(arg0);
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(I)J")
	protected abstract long method7554();
}
