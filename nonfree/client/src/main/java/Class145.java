import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jw")
public abstract class Class145 {

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(B)V")
	public abstract void method8779();

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(I)J")
	public abstract long method8780();

	@OriginalMember(owner = "client!jw", name = "b", descriptor = "(I)J")
	protected abstract long method8781();

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(BJ)I")
	public final int method8782(@OriginalArg(1) long arg0) {
		@Pc(7) long local7 = this.method8781();
		if (local7 > 0L) {
			Static452.method7478(local7);
		}
		return this.method8784(arg0);
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(JI)I")
	protected abstract int method8784(@OriginalArg(0) long arg0);
}
