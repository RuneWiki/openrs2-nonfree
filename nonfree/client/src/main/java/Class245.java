import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tu")
public abstract class Class245 {

	@OriginalMember(owner = "client!tu", name = "<init>", descriptor = "()V")
	protected Class245() {
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(I)V")
	public abstract void method5904();

	@OriginalMember(owner = "client!tu", name = "c", descriptor = "(I)Lclient!ab;")
	public abstract Class3 method5906();

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(II)Z")
	public abstract boolean method5907(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!tu", name = "d", descriptor = "(I)V")
	public abstract void method5908();
}
