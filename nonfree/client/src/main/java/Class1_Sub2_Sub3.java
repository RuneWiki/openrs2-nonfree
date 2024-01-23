import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public abstract class Class1_Sub2_Sub3 extends Class1_Sub2 {

	@OriginalMember(owner = "client!bg", name = "<init>", descriptor = "()V")
	protected Class1_Sub2_Sub3() {
	}

	@OriginalMember(owner = "client!bg", name = "d", descriptor = "(I)Z")
	public abstract boolean method4489();

	@OriginalMember(owner = "client!bg", name = "d", descriptor = "(B)Ljava/lang/Object;")
	public abstract Object method4492();
}
