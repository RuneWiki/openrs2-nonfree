import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ts")
public abstract class Class86 {

	@OriginalMember(owner = "client!ts", name = "<init>", descriptor = "()V")
	protected Class86() {
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(I)V")
	public abstract void method1865();

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(B)V")
	public abstract void method1866();

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(II)Z")
	public abstract boolean method1867(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ts", name = "b", descriptor = "(B)Lclient!pg;")
	public abstract Class139 method1868();
}
