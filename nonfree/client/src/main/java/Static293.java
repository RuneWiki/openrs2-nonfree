import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static293 {

	@OriginalMember(owner = "client!ob", name = "r", descriptor = "Lclient!za;")
	public static Class200 aClass200_5;

	@OriginalMember(owner = "client!ob", name = "t", descriptor = "I")
	public static int anInt4611;

	@OriginalMember(owner = "client!ob", name = "v", descriptor = "Lclient!jq;")
	public static Class5_Sub22_Sub1 aClass5_Sub22_Sub1_2;

	@OriginalMember(owner = "client!ob", name = "p", descriptor = "Lclient!nj;")
	public static final Class172 aClass172_3 = new Class172("LIVE", 0);

	@OriginalMember(owner = "client!ob", name = "w", descriptor = "Lclient!nv;")
	public static final Class177 aClass177_29 = new Class177();

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(ZB)V")
	public static void method3665(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Static199.anInt3319 != -1) {
				Static326.method4003(Static199.anInt3319);
			}
			for (@Pc(14) Class5_Sub44 local14 = (Class5_Sub44) Static151.aClass252_42.method5660(); local14 != null; local14 = (Class5_Sub44) Static151.aClass252_42.method5666()) {
				if (!local14.method6005()) {
					local14 = (Class5_Sub44) Static151.aClass252_42.method5660();
					if (local14 == null) {
						break;
					}
				}
				Static456.method5988(true, false, local14);
			}
			Static199.anInt3319 = -1;
			Static151.aClass252_42 = new Class252(8);
			Static241.method3137();
			Static199.anInt3319 = Static433.anInt7212;
			Static330.method4011(false);
			Static251.method3223();
			Static181.method2474(Static199.anInt3319);
		}
		Static151.aBoolean500 = false;
		Static390.aString67 = "";
		Static342.aString60 = "";
		Static262.method3352();
		Static333.anInt5333 = -1;
		Static390.method5094(Static449.anInt7378);
		Static220.aClass2_Sub1_Sub3_Sub2_1 = new Class2_Sub1_Sub3_Sub2();
		Static220.aClass2_Sub1_Sub3_Sub2_1.anInt7502 = Static418.anInt6969 * 128 / 2;
		Static220.aClass2_Sub1_Sub3_Sub2_1.anIntArray434[0] = Static433.anInt7210 / 2;
		Static220.aClass2_Sub1_Sub3_Sub2_1.anInt7500 = Static433.anInt7210 * 128 / 2;
		Static393.anInt4184 = 0;
		Static116.anInt1977 = 0;
		Static220.aClass2_Sub1_Sub3_Sub2_1.anIntArray433[0] = Static418.anInt6969 / 2;
		if (Static449.anInt7379 == 2) {
			Static116.anInt1977 = Static278.anInt4347 << 7;
			Static393.anInt4184 = Static299.anInt4672 << 7;
		} else {
			Static143.method2067();
		}
		Static454.method5952();
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method3666(@OriginalArg(0) String arg0) {
		if (!Static423.aBoolean478) {
			return;
		}
		@Pc(10) boolean local10 = false;
		@Pc(20) int local20 = Static31.anInt622;
		@Pc(22) int[] local22 = Static334.anIntArray387;
		for (@Pc(24) int local24 = 0; local24 < local20; local24++) {
			@Pc(32) Class2_Sub1_Sub3_Sub2 local32 = Static359.aClass2_Sub1_Sub3_Sub2Array1[local22[local24]];
			if (local32 != null && local32 != Static220.aClass2_Sub1_Sub3_Sub2_1 && local32.aString65 != null && local32.aString65.equalsIgnoreCase(arg0)) {
				Static288.method3576(Static198.aClass194_53);
				Static281.aClass5_Sub15_Sub2_13.method5602(0);
				Static281.aClass5_Sub15_Sub2_13.method5550(Static143.anInt2595);
				Static281.aClass5_Sub15_Sub2_13.method5566(Static127.anInt2221);
				Static281.aClass5_Sub15_Sub2_13.method5588(Static374.anInt6237);
				Static281.aClass5_Sub15_Sub2_13.method5566(local22[local24]);
				local10 = true;
				Static159.method2246(-2, local32.method4913(), 0, local32.anIntArray434[0], local32.method4913(), true, local32.anIntArray433[0], 0);
				break;
			}
		}
		if (!local10) {
			Static411.method5422(Static59.aClass198_18.method4012(Static38.anInt4834) + arg0);
		}
		if (Static423.aBoolean478) {
			Static289.method3586();
		}
	}
}
