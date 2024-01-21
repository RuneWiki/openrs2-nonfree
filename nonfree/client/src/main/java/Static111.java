import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!md", name = "f", descriptor = "Lclient!pe;")
	public static Class13 aClass13_25;

	@OriginalMember(owner = "client!md", name = "w", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_874 = Static158.method3034("yellow:");

	@OriginalMember(owner = "client!md", name = "a", descriptor = "Lclient!ob;")
	public static Class60 aClass60_870 = aClass60_874;

	@OriginalMember(owner = "client!md", name = "e", descriptor = "Ljava/lang/Object;")
	public static final Object anObject4 = new Object();

	@OriginalMember(owner = "client!md", name = "g", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_871 = Static158.method3034("gelb:");

	@OriginalMember(owner = "client!md", name = "h", descriptor = "I")
	public static volatile int anInt3123 = 0;

	@OriginalMember(owner = "client!md", name = "n", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_872 = aClass60_874;

	@OriginalMember(owner = "client!md", name = "s", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_873 = Static158.method3034("blinken2:");

	@OriginalMember(owner = "client!md", name = "x", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_875 = Static158.method3034("<col=ffb000>");

	@OriginalMember(owner = "client!md", name = "z", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_876 = Static158.method3034("title_mute");

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(BI)I")
	public static int method2460(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IIBIII)V")
	public static void method2461(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg4 == Static30.anInt898 && Static160.anInt1995 == arg1 && (Static53.anInt1670 == arg0 || !Static8.aBoolean3)) {
			return;
		}
		Static160.anInt1995 = arg1;
		Static30.anInt898 = arg4;
		Static53.anInt1670 = arg0;
		if (!Static8.aBoolean3) {
			Static53.anInt1670 = 0;
		}
		Static139.method2831(25);
		Static52.method1233(true, Static165.aClass60_1119);
		@Pc(36) int local36 = Static76.anInt2317;
		Static76.anInt2317 = arg1 * 8 - 48;
		@Pc(44) int local44 = Static76.anInt2319;
		Static76.anInt2319 = arg4 * 8 - 48;
		@Pc(54) int local54 = Static76.anInt2319 - local44;
		@Pc(61) int local61 = Static76.anInt2317 - local36;
		for (@Pc(65) int local65 = 0; local65 < 32768; local65++) {
			@Pc(71) Class2_Sub1_Sub1_Sub3_Sub2 local71 = Static10.aClass2_Sub1_Sub1_Sub3_Sub2Array1[local65];
			if (local71 != null) {
				for (@Pc(75) int local75 = 0; local75 < 10; local75++) {
					local71.anIntArray369[local75] -= local54;
					local71.anIntArray371[local75] -= local61;
				}
				local71.anInt3302 -= local54 * 128;
				local71.anInt3273 -= local61 * 128;
			}
		}
		for (@Pc(119) int local119 = 0; local119 < 2048; local119++) {
			@Pc(125) Class2_Sub1_Sub1_Sub3_Sub1 local125 = Static105.aClass2_Sub1_Sub1_Sub3_Sub1Array3[local119];
			if (local125 != null) {
				for (@Pc(129) int local129 = 0; local129 < 10; local129++) {
					local125.anIntArray369[local129] -= local54;
					local125.anIntArray371[local129] -= local61;
				}
				local125.anInt3302 -= local54 * 128;
				local125.anInt3273 -= local61 * 128;
			}
		}
		@Pc(177) byte local177 = 0;
		@Pc(179) byte local179 = 104;
		Static62.anInt1923 = arg0;
		@Pc(183) byte local183 = 0;
		@Pc(185) byte local185 = 104;
		@Pc(187) byte local187 = 1;
		if (local54 < 0) {
			local177 = 103;
			local187 = -1;
			local179 = -1;
		}
		Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.method2555(arg2, arg3, false);
		@Pc(203) byte local203 = 1;
		if (local61 < 0) {
			local185 = -1;
			local183 = 103;
			local203 = -1;
		}
		for (@Pc(216) int local216 = local177; local216 != local179; local216 += local187) {
			for (@Pc(220) int local220 = local183; local220 != local185; local220 += local203) {
				@Pc(226) int local226 = local61 + local220;
				@Pc(231) int local231 = local216 + local54;
				for (@Pc(233) int local233 = 0; local233 < 4; local233++) {
					if (local231 >= 0 && local226 >= 0 && local231 < 104 && local226 < 104) {
						Static70.aClass67ArrayArrayArray1[local233][local216][local220] = Static70.aClass67ArrayArrayArray1[local233][local231][local226];
					} else {
						Static70.aClass67ArrayArrayArray1[local233][local216][local220] = null;
					}
				}
			}
		}
		for (@Pc(305) Class2_Sub6 local305 = (Class2_Sub6) Static190.aClass67_14.method2848(); local305 != null; local305 = (Class2_Sub6) Static190.aClass67_14.method2851()) {
			local305.anInt1926 -= local61;
			local305.anInt1921 -= local54;
			if (local305.anInt1921 < 0 || local305.anInt1926 < 0 || local305.anInt1921 >= 104 || local305.anInt1926 >= 104) {
				local305.method3556();
			}
		}
		Static160.anInt1996 = -1;
		Static40.anInt1296 = 0;
		if (Static197.anInt4656 != 0) {
			Static197.anInt4656 -= local54;
			Static194.anInt4620 -= local61;
		}
		Static31.aBoolean40 = false;
		Static122.aClass67_7.method2847();
		Static30.aClass67_1.method2847();
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IJII)Z")
	public static boolean method2464(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1, @OriginalArg(3) int arg2) {
		@Pc(17) int local17 = (int) arg1 >> 20 & 0x3;
		@Pc(24) int local24 = (int) arg1 >> 14 & 0x1F;
		@Pc(31) int local31 = Integer.MAX_VALUE & (int) (arg1 >>> 32);
		if (local24 == 10 || local24 == 11 || local24 == 22) {
			@Pc(71) Class2_Sub1_Sub9 local71 = Static158.method3037(local31);
			@Pc(84) int local84;
			@Pc(87) int local87;
			if (local17 == 0 || local17 == 2) {
				local84 = local71.anInt1688;
				local87 = local71.anInt1683;
			} else {
				local84 = local71.anInt1683;
				local87 = local71.anInt1688;
			}
			@Pc(97) int local97 = local71.anInt1677;
			if (local17 != 0) {
				local97 = (local97 << local17 & 0xF) + (local97 >> 4 - local17);
			}
			Static145.method2926(2, local87, arg0, arg2, true, Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anIntArray369[0], local97, 0, 0, Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anIntArray371[0], local84);
		} else {
			Static145.method2926(2, 0, arg0, arg2, true, Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anIntArray369[0], 0, local17, local24 + 1, Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anIntArray371[0], 0);
		}
		Static10.anInt346 = 0;
		Static7.anInt4637 = Static174.anInt4254;
		Static84.anInt2513 = 2;
		Static89.anInt2602 = Static74.anInt2294;
		return true;
	}
}
