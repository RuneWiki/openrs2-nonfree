import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jca")
public abstract class Class173 {

	@OriginalMember(owner = "client!jca", name = "<init>", descriptor = "()V")
	protected Class173() {
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(II)Z")
	public abstract boolean method6259(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(B)Lclient!vc;")
	public abstract Interface24 method6260();

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(I)V")
	public abstract void method6261();

	@OriginalMember(owner = "client!jca", name = "b", descriptor = "(I)V")
	public abstract void method6262();
}
