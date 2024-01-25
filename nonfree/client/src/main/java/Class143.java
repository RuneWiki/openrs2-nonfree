import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public abstract class Class143 {

	@OriginalMember(owner = "client!np", name = "<init>", descriptor = "()V")
	protected Class143() {
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(B)V")
	public abstract void method4850();

	@OriginalMember(owner = "client!np", name = "b", descriptor = "(B)V")
	public abstract void method4851();

	@OriginalMember(owner = "client!np", name = "c", descriptor = "(B)Lclient!fn;")
	public abstract Class75 method4856();

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(II)Z")
	public abstract boolean method4857(@OriginalArg(0) int arg0);
}
