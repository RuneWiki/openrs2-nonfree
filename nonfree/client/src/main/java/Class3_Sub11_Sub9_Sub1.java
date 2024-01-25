import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public final class Class3_Sub11_Sub9_Sub1 extends Class3_Sub11_Sub9 {

	@OriginalMember(owner = "client!hk", name = "G", descriptor = "Ljava/lang/Object;")
	private final Object anObject8;

	@OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(Lclient!pj;Ljava/lang/Object;I)V")
	public Class3_Sub11_Sub9_Sub1(@OriginalArg(0) Interface23 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.anObject8 = arg1;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method4007() {
		return false;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Z)Ljava/lang/Object;")
	@Override
	public Object method4006() {
		return this.anObject8;
	}
}
