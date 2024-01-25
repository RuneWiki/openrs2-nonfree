import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public final class Class123_Sub1 extends Class123 {

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ZLclient!w;)Lclient!w;")
	@Override
	public Class6_Sub2_Sub2 method3318(@OriginalArg(1) Class6_Sub2_Sub2 arg0) {
		return new Class6_Sub2_Sub2_Sub2(arg0.anInterface5_3, arg0.method578());
	}
}
