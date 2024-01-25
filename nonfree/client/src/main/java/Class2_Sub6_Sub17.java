import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public final class Class2_Sub6_Sub17 extends Class2_Sub6 {

	@OriginalMember(owner = "client!nk", name = "z", descriptor = "Lclient!lf;")
	public final Class3_Sub1_Sub3_Sub4 aClass3_Sub1_Sub3_Sub4_1;

	@OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(Lclient!lf;)V")
	public Class2_Sub6_Sub17(@OriginalArg(0) Class3_Sub1_Sub3_Sub4 arg0) {
		this.aClass3_Sub1_Sub3_Sub4_1 = arg0;
	}
}
