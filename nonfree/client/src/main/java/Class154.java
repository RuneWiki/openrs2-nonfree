import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public abstract class Class154 {

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "()V")
	protected Class154() {
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Z)Lclient!bi;")
	public abstract Interface2 method3565();

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(Z)V")
	public abstract void method3566();

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(I)V")
	public abstract void method3568();

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(II)Z")
	public abstract boolean method3569(@OriginalArg(1) int arg0);
}
