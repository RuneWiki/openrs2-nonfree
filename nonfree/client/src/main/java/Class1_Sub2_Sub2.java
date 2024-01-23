import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public abstract class Class1_Sub2_Sub2 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ah", name = "<init>", descriptor = "()V")
	protected Class1_Sub2_Sub2() {
	}

	@OriginalMember(owner = "client!ah", name = "d", descriptor = "(I)Z")
	public abstract boolean method1802();

	@OriginalMember(owner = "client!ah", name = "d", descriptor = "(B)Ljava/lang/Object;")
	public abstract Object method1808();
}
