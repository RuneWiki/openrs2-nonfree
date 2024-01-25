import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaa")
public final class Class155_Sub1 extends Class155 {

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(ILclient!fc;)Lclient!fc;")
	@Override
	public Class6_Sub2_Sub6 method4482(@OriginalArg(1) Class6_Sub2_Sub6 arg0) {
		return new Class6_Sub2_Sub6_Sub2(arg0.method4831(), arg0.anInt5401);
	}
}
