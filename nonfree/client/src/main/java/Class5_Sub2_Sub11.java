import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mca")
public final class Class5_Sub2_Sub11 extends Class5_Sub2 {

	@OriginalMember(owner = "client!mca", name = "v", descriptor = "Lclient!cga;")
	public final Class41_Sub1_Sub1_Sub2 aClass41_Sub1_Sub1_Sub2_1;

	@OriginalMember(owner = "client!mca", name = "<init>", descriptor = "(Lclient!cga;)V")
	public Class5_Sub2_Sub11(@OriginalArg(0) Class41_Sub1_Sub1_Sub2 arg0) {
		this.aClass41_Sub1_Sub1_Sub2_1 = arg0;
	}
}
