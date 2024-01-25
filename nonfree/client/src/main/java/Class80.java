import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tu")
public abstract class Class80 {

	@OriginalMember(owner = "client!tu", name = "<init>", descriptor = "()V")
	protected Class80() {
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(II)Z")
	public abstract boolean method1723(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!tu", name = "b", descriptor = "(I)Lclient!md;")
	public abstract Interface10 method1725();

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(B)V")
	public abstract void method1726();

	@OriginalMember(owner = "client!tu", name = "b", descriptor = "(B)V")
	public abstract void method1729();
}
