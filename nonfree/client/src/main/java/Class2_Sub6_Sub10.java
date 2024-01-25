import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public final class Class2_Sub6_Sub10 extends Class2_Sub6 {

	@OriginalMember(owner = "client!jh", name = "x", descriptor = "Lclient!to;")
	public final Class3_Sub1_Sub3_Sub5 aClass3_Sub1_Sub3_Sub5_1;

	@OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(Lclient!to;)V")
	public Class2_Sub6_Sub10(@OriginalArg(0) Class3_Sub1_Sub3_Sub5 arg0) {
		this.aClass3_Sub1_Sub3_Sub5_1 = arg0;
	}
}
