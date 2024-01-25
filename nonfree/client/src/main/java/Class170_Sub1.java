import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public final class Class170_Sub1 extends Class170 {

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lclient!me;I)Lclient!me;")
	@Override
	public Class3_Sub3_Sub6 method5416(@OriginalArg(0) Class3_Sub3_Sub6 arg0) {
		return new Class3_Sub3_Sub6_Sub2(arg0.method4737(), arg0.anInt5706);
	}
}
