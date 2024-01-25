import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!un")
public abstract class Class43 {

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(B)V")
	public abstract void method3556();

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(I)J")
	public abstract long method3557();

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(JI)I")
	protected abstract int method3558(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(Z)J")
	protected abstract long method3561();

	@OriginalMember(owner = "client!un", name = "b", descriptor = "(JI)I")
	public final int method3562(@OriginalArg(0) long arg0) {
		@Pc(7) long local7 = this.method3561();
		if ((long) 0 < local7) {
			Static318.method4952(local7);
		}
		return this.method3558(arg0);
	}
}
