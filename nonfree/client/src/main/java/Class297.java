import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public abstract class Class297 {

	@OriginalMember(owner = "client!wi", name = "<init>", descriptor = "()V")
	protected Class297() {
	}

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "(I)Lclient!om;")
	public abstract Interface23 method6733();

	@OriginalMember(owner = "client!wi", name = "d", descriptor = "(I)V")
	public abstract void method6734();

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)V")
	public abstract void method6735();

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(II)Z")
	public abstract boolean method6737(@OriginalArg(0) int arg0);
}
