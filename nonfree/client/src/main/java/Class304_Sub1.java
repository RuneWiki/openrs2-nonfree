import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public final class Class304_Sub1 extends Class304 {

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(ILclient!caa;)Lclient!caa;")
	@Override
	public Class3_Sub6_Sub3 method8670(@OriginalArg(1) Class3_Sub6_Sub3 arg0) {
		return new Class3_Sub6_Sub3_Sub1(arg0.method7027(), arg0.anInt8306);
	}
}
