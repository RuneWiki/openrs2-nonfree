import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hv")
public abstract class Class115 {

	@OriginalMember(owner = "client!hv", name = "<init>", descriptor = "()V")
	protected Class115() {
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(I)V")
	public abstract void method2371();

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(B)V")
	public abstract void method2372();

	@OriginalMember(owner = "client!hv", name = "b", descriptor = "(I)Lclient!ct;")
	public abstract Interface2 method2373();

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(II)Z")
	public abstract boolean method2374(@OriginalArg(0) int arg0);
}
