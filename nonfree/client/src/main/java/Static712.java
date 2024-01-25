import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static712 {

	@OriginalMember(owner = "client!wh", name = "c", descriptor = "I")
	public static int anInt2538 = 0;

	@OriginalMember(owner = "client!wh", name = "d", descriptor = "Lclient!nt;")
	public static Class270 aClass270_5 = null;

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lclient!rv;BLclient!rv;)V")
	public static void method2314(@OriginalArg(0) Class3_Sub7 arg0, @OriginalArg(2) Class3_Sub7 arg1) {
		if (arg1.aClass3_Sub7_66 != null) {
			arg1.method9251();
		}
		arg1.aClass3_Sub7_67 = arg0;
		arg1.aClass3_Sub7_66 = arg0.aClass3_Sub7_66;
		arg1.aClass3_Sub7_66.aClass3_Sub7_67 = arg1;
		arg1.aClass3_Sub7_67.aClass3_Sub7_66 = arg1;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(B)Ljava/lang/String;")
	public static String method2316() {
		if (Static530.aBoolean556 || Static585.aClass3_Sub7_Sub10_3 == null) {
			return "";
		} else if ((Static585.aClass3_Sub7_Sub10_3.aString58 == null || Static585.aClass3_Sub7_Sub10_3.aString58.length() == 0) && Static585.aClass3_Sub7_Sub10_3.aString57 != null && Static585.aClass3_Sub7_Sub10_3.aString57.length() > 0) {
			return Static585.aClass3_Sub7_Sub10_3.aString57;
		} else {
			return Static585.aClass3_Sub7_Sub10_3.aString58;
		}
	}
}
