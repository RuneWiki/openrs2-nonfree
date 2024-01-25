import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vv")
public final class Class194_Sub1 extends Class194 {

	@OriginalMember(owner = "client!vv", name = "<init>", descriptor = "()V")
	private Class194_Sub1() {
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(Lclient!bs;I)Lclient!bs;")
	@Override
	public Class6_Sub2_Sub3 method8798(@OriginalArg(0) Class6_Sub2_Sub3 arg0) {
		return new Class6_Sub2_Sub3_Sub2(arg0.method4999(), arg0.anInt5478);
	}
}
