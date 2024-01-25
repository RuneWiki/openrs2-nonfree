import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public final class Class4_Sub5_Sub8 extends Class4_Sub5 {

	@OriginalMember(owner = "client!gg", name = "v", descriptor = "Lclient!bd;")
	public final Class3_Sub1_Sub2_Sub1 aClass3_Sub1_Sub2_Sub1_1;

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(Lclient!bd;)V")
	public Class4_Sub5_Sub8(@OriginalArg(0) Class3_Sub1_Sub2_Sub1 arg0) {
		this.aClass3_Sub1_Sub2_Sub1_1 = arg0;
	}
}
