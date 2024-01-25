import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tu")
public abstract class Class123 {

	@OriginalMember(owner = "client!tu", name = "<init>", descriptor = "()V")
	protected Class123() {
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(II)Z")
	public abstract boolean method2750(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(I)Lclient!jv;")
	public abstract Class128 method2751();

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(B)V")
	public abstract void method2755();

	@OriginalMember(owner = "client!tu", name = "b", descriptor = "(I)V")
	public abstract void method2757();
}
