import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public final class Class6_Sub1_Sub7 extends Class6_Sub1 {

	@OriginalMember(owner = "client!gd", name = "u", descriptor = "Lclient!pu;")
	public final Class3_Sub3_Sub5 aClass3_Sub3_Sub5_1;

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Lclient!pu;)V")
	public Class6_Sub1_Sub7(@OriginalArg(0) Class3_Sub3_Sub5 arg0) {
		this.aClass3_Sub3_Sub5_1 = arg0;
	}
}
