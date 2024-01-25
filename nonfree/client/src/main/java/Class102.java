import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ev")
public abstract class Class102 {

	@OriginalMember(owner = "client!ev", name = "<init>", descriptor = "()V")
	protected Class102() {
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(I)Lclient!waa;")
	public abstract Interface26 method4307();

	@OriginalMember(owner = "client!ev", name = "b", descriptor = "(B)V")
	public abstract void method4310();

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(II)Z")
	public abstract boolean method4311(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ev", name = "b", descriptor = "(I)V")
	public abstract void method4312();
}
