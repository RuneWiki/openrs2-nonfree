import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public abstract class Class48 {

	@OriginalMember(owner = "client!ws", name = "<init>", descriptor = "()V")
	protected Class48() {
	}

	@OriginalMember(owner = "client!ws", name = "b", descriptor = "(I)V")
	public abstract void method1117();

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(B)Lclient!hu;")
	public abstract Class113 method1118();

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(II)Z")
	public abstract boolean method1119(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(Z)V")
	public abstract void method1121();
}
