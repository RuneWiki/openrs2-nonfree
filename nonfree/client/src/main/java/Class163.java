import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public abstract class Class163 {

	@OriginalMember(owner = "client!oo", name = "<init>", descriptor = "()V")
	protected Class163() {
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(B)Lclient!bd;")
	public abstract Class21 method3805();

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(I)V")
	public abstract void method3806();

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(II)Z")
	public abstract boolean method3809(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(Z)V")
	public abstract void method3810();
}
