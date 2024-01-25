import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vw")
public abstract class Class209 {

	@OriginalMember(owner = "client!vw", name = "<init>", descriptor = "()V")
	protected Class209() {
	}

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(Z)V")
	public abstract void method5481();

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(IB)Z")
	public abstract boolean method5482(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!vw", name = "b", descriptor = "(I)Lclient!q;")
	public abstract Interface21 method5486();

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(B)V")
	public abstract void method5487();
}
