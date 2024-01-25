import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!il")
public abstract class Class67 {

	@OriginalMember(owner = "client!il", name = "c", descriptor = "(I)J")
	public abstract long method5453();

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(Z)V")
	public abstract void method5454();

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IJ)I")
	public final int method5455(@OriginalArg(1) long arg0) {
		@Pc(7) long local7 = this.method5457();
		if (local7 > 0L) {
			Static351.method5279(local7);
		}
		return this.method5460(arg0);
	}

	@OriginalMember(owner = "client!il", name = "b", descriptor = "(I)J")
	protected abstract long method5457();

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(ZJ)I")
	protected abstract int method5460(@OriginalArg(1) long arg0);
}
