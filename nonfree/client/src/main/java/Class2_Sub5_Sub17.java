import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public final class Class2_Sub5_Sub17 extends Class2_Sub5 {

	@OriginalMember(owner = "client!te", name = "x", descriptor = "Lclient!lg;")
	public final Class3_Sub2_Sub3 aClass3_Sub2_Sub3_1;

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Lclient!lg;)V")
	public Class2_Sub5_Sub17(@OriginalArg(0) Class3_Sub2_Sub3 arg0) {
		this.aClass3_Sub2_Sub3_1 = arg0;
	}
}
