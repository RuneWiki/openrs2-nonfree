import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jv")
public abstract class Class130 {

	@OriginalMember(owner = "client!jv", name = "<init>", descriptor = "()V")
	protected Class130() {
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(Z)V")
	public abstract void method5064();

	@OriginalMember(owner = "client!jv", name = "b", descriptor = "(I)V")
	public abstract void method5066();

	@OriginalMember(owner = "client!jv", name = "b", descriptor = "(Z)Lclient!as;")
	public abstract Class16 method5067();

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(IZ)Z")
	public abstract boolean method5069(@OriginalArg(0) int arg0);
}
