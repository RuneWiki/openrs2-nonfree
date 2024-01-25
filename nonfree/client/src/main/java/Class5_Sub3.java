import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public final class Class5_Sub3 extends Class5 {

	@OriginalMember(owner = "client!am", name = "n", descriptor = "Lclient!cca;")
	public final Class4_Sub2_Sub1_Sub1_Sub2 aClass4_Sub2_Sub1_Sub1_Sub2_1;

	@OriginalMember(owner = "client!am", name = "<init>", descriptor = "(Lclient!cca;)V")
	public Class5_Sub3(@OriginalArg(0) Class4_Sub2_Sub1_Sub1_Sub2 arg0) {
		this.aClass4_Sub2_Sub1_Sub1_Sub2_1 = arg0;
	}
}
