import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public abstract class Class6_Sub2_Sub2 extends Class6_Sub2 {

	@OriginalMember(owner = "client!w", name = "v", descriptor = "Lclient!mc;")
	public final Interface5 anInterface5_3;

	@OriginalMember(owner = "client!w", name = "<init>", descriptor = "(Lclient!mc;)V")
	protected Class6_Sub2_Sub2(@OriginalArg(0) Interface5 arg0) {
		this.anInterface5_3 = arg0;
	}

	@OriginalMember(owner = "client!w", name = "e", descriptor = "(B)Z")
	public abstract boolean method577();

	@OriginalMember(owner = "client!w", name = "f", descriptor = "(B)Ljava/lang/Object;")
	public abstract Object method578();
}
