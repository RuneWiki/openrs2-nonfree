import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public final class Class3_Sub11 extends Class3 {

	@OriginalMember(owner = "client!cp", name = "i", descriptor = "Lclient!wda;")
	public final Class23_Sub2_Sub1_Sub2_Sub2 aClass23_Sub2_Sub1_Sub2_Sub2_1;

	@OriginalMember(owner = "client!cp", name = "<init>", descriptor = "(Lclient!wda;)V")
	public Class3_Sub11(@OriginalArg(0) Class23_Sub2_Sub1_Sub2_Sub2 arg0) {
		this.aClass23_Sub2_Sub1_Sub2_Sub2_1 = arg0;
	}
}
