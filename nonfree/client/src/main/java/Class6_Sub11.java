import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public final class Class6_Sub11 extends Class6 {

	@OriginalMember(owner = "client!cj", name = "l", descriptor = "Lclient!ih;")
	public final Class60_Sub1_Sub1_Sub3_Sub2 aClass60_Sub1_Sub1_Sub3_Sub2_1;

	@OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(Lclient!ih;)V")
	public Class6_Sub11(@OriginalArg(0) Class60_Sub1_Sub1_Sub3_Sub2 arg0) {
		this.aClass60_Sub1_Sub1_Sub3_Sub2_1 = arg0;
	}
}
