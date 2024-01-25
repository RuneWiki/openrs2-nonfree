import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public abstract class Class150 {

	@OriginalMember(owner = "client!nk", name = "<init>", descriptor = "()V")
	protected Class150() {
	}

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "(I)Lclient!wda;")
	public abstract Interface24 method2629();

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(B)V")
	public abstract void method2630();

	@OriginalMember(owner = "client!nk", name = "c", descriptor = "(I)V")
	public abstract void method2631();

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(II)Z")
	public abstract boolean method2632(@OriginalArg(0) int arg0);
}
