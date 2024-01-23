import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public abstract class Class1_Sub2_Sub3 extends Class1_Sub2 {

	@OriginalMember(owner = "client!wl", name = "<init>", descriptor = "()V")
	protected Class1_Sub2_Sub3() {
	}

	@OriginalMember(owner = "client!wl", name = "d", descriptor = "(B)Z")
	public abstract boolean method2573();

	@OriginalMember(owner = "client!wl", name = "f", descriptor = "(B)Ljava/lang/Object;")
	public abstract Object method2576();
}
