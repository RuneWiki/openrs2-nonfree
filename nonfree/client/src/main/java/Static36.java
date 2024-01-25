import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!bo", name = "h", descriptor = "Ljava/lang/Object;")
	public static Object anObject2;

	@OriginalMember(owner = "client!bo", name = "i", descriptor = "Lclient!c;")
	public static Class29 aClass29_1;

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "Lclient!pn;")
	public static final Class194 aClass194_10 = new Class194(35, -1);

	@OriginalMember(owner = "client!bo", name = "e", descriptor = "I")
	public static int anInt723 = 0;

	@OriginalMember(owner = "client!bo", name = "f", descriptor = "I")
	public static int anInt724 = 765;

	@OriginalMember(owner = "client!bo", name = "g", descriptor = "[I")
	public static final int[] anIntArray33 = new int[14];

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(ZIIII)V")
	public static void method615(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!arg0 && Static345.anInt5641 == arg3 && Static375.anInt6241 == arg2 && (Static6.anInt131 == Static123.anInt2187 || Static216.aClass1_Sub1_1.method3587(Static146.anInt2644))) {
			return;
		}
		Static375.anInt6241 = arg2;
		Static345.anInt5641 = arg3;
		Static123.anInt2187 = Static6.anInt131;
		if (Static216.aClass1_Sub1_1.method3587(Static146.anInt2644)) {
			Static123.anInt2187 = 0;
		}
		Static407.method5394(arg1);
		Static255.method3305(Static428.aClass23_4, Static427.aClass198_118.method4012(Static38.anInt4834), true);
		@Pc(59) int local59 = Static31.anInt618;
		@Pc(61) int local61 = Static226.anInt3768;
		Static31.anInt618 = (Static345.anInt5641 - (Static433.anInt7210 >> 4)) * 8;
		Static226.anInt3768 = (Static375.anInt6241 - (Static418.anInt6969 >> 4)) * 8;
		Static164.aClass5_Sub2_Sub18_3 = Static98.method2664(Static345.anInt5641 * 8, Static375.anInt6241 * 8);
		Static161.aClass153_2 = null;
		@Pc(93) int local93 = Static31.anInt618 - local59;
		@Pc(98) int local98 = Static226.anInt3768 - local61;
		@Pc(103) int local103;
		@Pc(116) int local116;
		@Pc(245) int local245;
		@Pc(180) int local180;
		if (arg1 == 10) {
			for (local103 = 0; local103 < Static111.anInt1879; local103++) {
				@Pc(109) Class5_Sub7 local109 = Static277.aClass5_Sub7Array1[local103];
				if (local109 != null) {
					@Pc(114) Class2_Sub1_Sub3_Sub1 local114 = local109.aClass2_Sub1_Sub3_Sub1_1;
					for (local116 = 0; local116 < 10; local116++) {
						local114.anIntArray434[local116] -= local93;
						local114.anIntArray433[local116] -= local98;
					}
					local114.anInt7500 -= local93 * 128;
					local114.anInt7502 -= local98 * 128;
				}
			}
		} else {
			@Pc(166) boolean local166 = false;
			Static424.anInt7114 = 0;
			@Pc(174) int local174 = Static433.anInt7210 * 128 - 128;
			local180 = (Static418.anInt6969 - 1) * 128;
			for (local116 = 0; local116 < Static111.anInt1879; local116++) {
				@Pc(188) Class5_Sub7 local188 = Static277.aClass5_Sub7Array1[local116];
				if (local188 != null) {
					@Pc(193) Class2_Sub1_Sub3_Sub1 local193 = local188.aClass2_Sub1_Sub3_Sub1_1;
					local193.anInt7500 -= local93 * 128;
					local193.anInt7502 -= local98 * 128;
					if (local193.anInt7500 >= 0 && local193.anInt7500 <= local174 && local193.anInt7502 >= 0 && local193.anInt7502 <= local180) {
						@Pc(243) boolean local243 = true;
						for (local245 = 0; local245 < 10; local245++) {
							local193.anIntArray434[local245] -= local93;
							local193.anIntArray433[local245] -= local98;
							if (local193.anIntArray434[local245] < 0 || local193.anIntArray434[local245] >= Static433.anInt7210 || local193.anIntArray433[local245] < 0 || local193.anIntArray433[local245] >= Static418.anInt6969) {
								local243 = false;
							}
						}
						if (local243) {
							Static218.anIntArray351[Static424.anInt7114++] = local193.anInt6126;
						} else {
							local193.method4091(null);
							local166 = true;
							local188.method6003();
						}
					} else {
						local193.method4091(null);
						local188.method6003();
						local166 = true;
					}
				}
			}
			if (local166) {
				Static111.anInt1879 = Static380.aClass252_36.method5665();
				Static380.aClass252_36.method5662(Static277.aClass5_Sub7Array1);
			}
		}
		for (local103 = 0; local103 < 2048; local103++) {
			@Pc(345) Class2_Sub1_Sub3_Sub2 local345 = Static359.aClass2_Sub1_Sub3_Sub2Array1[local103];
			if (local345 != null) {
				for (local180 = 0; local180 < 10; local180++) {
					local345.anIntArray434[local180] -= local93;
					local345.anIntArray433[local180] -= local98;
				}
				local345.anInt7502 -= local98 * 128;
				local345.anInt7500 -= local93 * 128;
			}
		}
		@Pc(395) Class266[] local395 = Static186.aClass266Array1;
		for (local180 = 0; local180 < local395.length; local180++) {
			@Pc(403) Class266 local403 = local395[local180];
			if (local403 != null) {
				local403.anInt7413 -= local98 * 128;
				local403.anInt7410 -= local93 * 128;
			}
		}
		for (@Pc(435) Class5_Sub3 local435 = (Class5_Sub3) Static242.aClass177_24.method3618(); local435 != null; local435 = (Class5_Sub3) Static242.aClass177_24.method3619()) {
			local435.anInt336 -= local98;
			local435.anInt338 -= local93;
			if (Static148.anInt2668 != 4 && (local435.anInt338 < 0 || local435.anInt336 < 0 || Static433.anInt7210 <= local435.anInt338 || local435.anInt336 >= Static418.anInt6969)) {
				local435.method6003();
			}
		}
		if (Static148.anInt2668 != 4) {
			for (@Pc(491) Class5_Sub24 local491 = (Class5_Sub24) Static400.aClass252_38.method5660(); local491 != null; local491 = (Class5_Sub24) Static400.aClass252_38.method5666()) {
				@Pc(499) int local499 = (int) (local491.aLong234 & 0x3FFFL);
				@Pc(504) int local504 = local499 - Static31.anInt618;
				local245 = (int) (local491.aLong234 >> 14 & 0x3FFFL);
				@Pc(516) int local516 = local245 - Static226.anInt3768;
				if (local504 < 0 || local516 < 0 || local504 >= Static433.anInt7210 || Static418.anInt6969 <= local516) {
					local491.method6003();
				}
			}
		}
		if (Static453.anInt6195 != 0) {
			Static453.anInt6195 -= local93;
			Static209.anInt3498 -= local98;
		}
		Static358.method4639();
		if (arg1 != 10) {
			Static278.anInt4347 -= local93;
			Static299.anInt4672 -= local98;
			Static118.anInt2132 -= local98;
			Static116.anInt1977 -= local93 * 128;
			Static393.anInt4184 -= local98 * 128;
			Static6.anInt110 -= local93;
			if (Math.abs(local93) > Static433.anInt7210 || Math.abs(local98) > Static418.anInt6969) {
				Static454.method5952();
			}
		} else if (Static449.anInt7379 == 4) {
			Static300.anInt4681 -= local93 * 128;
			Static45.anInt41 -= local98 * 128;
			Static423.anInt7090 -= local93 * 128;
			Static21.anInt449 -= local98 * 128;
		} else {
			Static449.anInt7379 = 1;
		}
		Static48.method784();
		Static157.method2216();
		Static311.aClass177_31.method3614();
		Static64.aClass177_3.method3614();
		Static107.aClass107_4.method2329();
		Static71.method6001();
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(I[BI)I")
	public static int method616(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		return Static27.method445(arg1, arg0, 0);
	}
}
