import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public abstract class Class6_Sub2_Sub3 extends Class6_Sub2 {

	@OriginalMember(owner = "client!bs", name = "t", descriptor = "I")
	public final int anInt5478;

	@OriginalMember(owner = "client!bs", name = "<init>", descriptor = "(I)V")
	protected Class6_Sub2_Sub3(@OriginalArg(0) int arg0) {
		this.anInt5478 = arg0;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(I)Z")
	public abstract boolean method4998();

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(B)Ljava/lang/Object;")
	public abstract Object method4999();
}
