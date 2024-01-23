import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public abstract class Class1_Sub2_Sub3 extends Class1_Sub2 {

	@OriginalMember(owner = "client!th", name = "<init>", descriptor = "()V")
	protected Class1_Sub2_Sub3() {
	}

	@OriginalMember(owner = "client!th", name = "d", descriptor = "(B)Z")
	public abstract boolean method4237();

	@OriginalMember(owner = "client!th", name = "f", descriptor = "(B)Ljava/lang/Object;")
	public abstract Object method4241();
}
