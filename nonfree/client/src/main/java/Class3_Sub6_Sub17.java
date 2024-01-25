import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public final class Class3_Sub6_Sub17 extends Class3_Sub6 {

	@OriginalMember(owner = "client!pd", name = "v", descriptor = "Lclient!pia;")
	public final Class23_Sub2_Sub1_Sub5 aClass23_Sub2_Sub1_Sub5_1;

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(Lclient!pia;)V")
	public Class3_Sub6_Sub17(@OriginalArg(0) Class23_Sub2_Sub1_Sub5 arg0) {
		this.aClass23_Sub2_Sub1_Sub5_1 = arg0;
	}
}
