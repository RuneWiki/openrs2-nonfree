import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!baa")
public final class Class2_Sub6 extends Class2 {

	@OriginalMember(owner = "client!baa", name = "s", descriptor = "Lclient!gh;")
	public final Class15_Sub3_Sub3_Sub1_Sub2 aClass15_Sub3_Sub3_Sub1_Sub2_1;

	@OriginalMember(owner = "client!baa", name = "<init>", descriptor = "(Lclient!gh;)V")
	public Class2_Sub6(@OriginalArg(0) Class15_Sub3_Sub3_Sub1_Sub2 arg0) {
		this.aClass15_Sub3_Sub3_Sub1_Sub2_1 = arg0;
	}
}
