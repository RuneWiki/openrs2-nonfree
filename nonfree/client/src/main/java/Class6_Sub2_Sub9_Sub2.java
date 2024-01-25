import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public final class Class6_Sub2_Sub9_Sub2 extends Class6_Sub2_Sub9 {

	@OriginalMember(owner = "client!lp", name = "y", descriptor = "Ljava/lang/Object;")
	private final Object anObject7;

	@OriginalMember(owner = "client!lp", name = "<init>", descriptor = "(Lclient!sea;Ljava/lang/Object;I)V")
	public Class6_Sub2_Sub9_Sub2(@OriginalArg(0) Interface21 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.anObject7 = arg1;
	}

	@OriginalMember(owner = "client!lp", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method4705() {
		return false;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method4703() {
		return this.anObject7;
	}
}
