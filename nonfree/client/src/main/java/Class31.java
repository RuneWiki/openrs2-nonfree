import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bv")
public abstract class Class31 {

	@OriginalMember(owner = "client!bv", name = "<init>", descriptor = "()V")
	protected Class31() {
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(I)Lclient!mn;")
	public abstract Class143 method3796();

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(II)Z")
	public abstract boolean method3798(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!bv", name = "b", descriptor = "(I)V")
	public abstract void method3799();

	@OriginalMember(owner = "client!bv", name = "c", descriptor = "(I)V")
	public abstract void method3802();
}
