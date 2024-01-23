import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public abstract class Class1_Sub2_Sub2 extends Class1_Sub2 {

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "()V")
	protected Class1_Sub2_Sub2() {
	}

	@OriginalMember(owner = "client!bb", name = "h", descriptor = "(I)Z")
	public abstract boolean method3754();

	@OriginalMember(owner = "client!bb", name = "j", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method3756();
}
