import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ika")
public final class Class4_Sub5_Sub10 extends Class4_Sub5 {

	@OriginalMember(owner = "client!ika", name = "y", descriptor = "Lclient!pa;")
	public final Class3_Sub1_Sub2_Sub5 aClass3_Sub1_Sub2_Sub5_1;

	@OriginalMember(owner = "client!ika", name = "<init>", descriptor = "(Lclient!pa;)V")
	public Class4_Sub5_Sub10(@OriginalArg(0) Class3_Sub1_Sub2_Sub5 arg0) {
		this.aClass3_Sub1_Sub2_Sub5_1 = arg0;
	}
}
