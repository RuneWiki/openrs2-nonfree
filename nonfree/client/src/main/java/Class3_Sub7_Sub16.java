import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public final class Class3_Sub7_Sub16 extends Class3_Sub7 {

	@OriginalMember(owner = "client!ne", name = "s", descriptor = "Lclient!si;")
	public final Class9_Sub2_Sub1_Sub5 aClass9_Sub2_Sub1_Sub5_1;

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(Lclient!si;)V")
	public Class3_Sub7_Sub16(@OriginalArg(0) Class9_Sub2_Sub1_Sub5 arg0) {
		this.aClass9_Sub2_Sub1_Sub5_1 = arg0;
	}
}
