import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public final class Class4_Sub6_Sub1_Sub1 extends Class4_Sub6_Sub1 {

	@OriginalMember(owner = "client!cg", name = "N", descriptor = "Ljava/lang/Object;")
	private final Object anObject21;

	@OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(Lclient!er;Ljava/lang/Object;I)V")
	public Class4_Sub6_Sub1_Sub1(@OriginalArg(0) Interface5 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.anObject21 = arg1;
	}

	@OriginalMember(owner = "client!cg", name = "d", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method6875() {
		return this.anObject21;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method6872() {
		return false;
	}
}
