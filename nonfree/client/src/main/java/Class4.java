import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aba")
public abstract class Class4 {

	@OriginalMember(owner = "client!aba", name = "<init>", descriptor = "()V")
	protected Class4() {
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(I)V")
	public abstract void method1021();

	@OriginalMember(owner = "client!aba", name = "b", descriptor = "(I)V")
	public abstract void method1023();

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(II)Z")
	public abstract boolean method1024(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!aba", name = "b", descriptor = "(B)Lclient!oj;")
	public abstract Interface20 method1025();
}
