import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public final class Class5_Sub3_Sub6_Sub2 extends Class5_Sub3_Sub6 {

	@OriginalMember(owner = "client!ud", name = "C", descriptor = "Ljava/lang/Object;")
	private final Object anObject22;

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lclient!ofa;Ljava/lang/Object;I)V")
	public Class5_Sub3_Sub6_Sub2(@OriginalArg(0) Interface20 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.anObject22 = arg1;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8109() {
		return false;
	}

	@OriginalMember(owner = "client!ud", name = "e", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method8111() {
		return this.anObject22;
	}
}
