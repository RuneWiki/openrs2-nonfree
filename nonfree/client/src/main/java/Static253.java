import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static253 {

	@OriginalMember(owner = "client!kg", name = "r", descriptor = "I")
	public static int anInt5213;

	@OriginalMember(owner = "client!kg", name = "s", descriptor = "[Lclient!ha;")
	public static Class84[] aClass84Array8;

	@OriginalMember(owner = "client!kg", name = "v", descriptor = "I")
	public static int anInt5215 = -1;

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIIZ)V")
	public static void method4365(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3) {
		if (!arg3 && Static248.anInt5103 == arg2 && Static492.anInt8088 == arg0 && (Static56.anInt1418 == Static415.anInt3783 || Static208.aClass12_Sub10_Sub1_1.method2057(Static148.anInt6867))) {
			return;
		}
		Static415.anInt3783 = Static56.anInt1418;
		Static248.anInt5103 = arg2;
		Static492.anInt8088 = arg0;
		if (Static208.aClass12_Sub10_Sub1_1.method2057(Static148.anInt6867)) {
			Static415.anInt3783 = 0;
		}
		Static9.method278(arg1);
		Static178.method3537(Static53.aClass88_34.method2391(Static345.anInt6495), true, Static56.aClass80_2);
		@Pc(56) int local56 = Static61.anInt1459;
		Static61.anInt1459 = (Static248.anInt5103 - (Static37.anInt7512 >> 4)) * 8;
		@Pc(67) int local67 = Static203.anInt4534;
		Static203.anInt4534 = (Static492.anInt8088 - (Static329.anInt6247 >> 4)) * 8;
		Static447.aClass12_Sub4_Sub7_3 = Static2.method4937(Static248.anInt5103 * 8, Static492.anInt8088 * 8);
		Static119.aClass159_2 = null;
		@Pc(90) int local90 = Static61.anInt1459 - local56;
		@Pc(95) int local95 = Static203.anInt4534 - local67;
		@Pc(116) int local116;
		@Pc(118) int local118;
		@Pc(170) int local170;
		@Pc(288) int local288;
		if (arg1 == 10) {
			for (local288 = 0; local288 < Static328.anInt6238; local288++) {
				@Pc(294) Class12_Sub41 local294 = Static352.aClass12_Sub41Array1[local288];
				if (local294 != null) {
					@Pc(299) Class30_Sub1_Sub1_Sub2 local299 = local294.aClass30_Sub1_Sub1_Sub2_2;
					for (local118 = 0; local118 < 10; local118++) {
						local299.anIntArray316[local118] -= local90;
						local299.anIntArray317[local118] -= local95;
					}
					local299.anInt9416 -= local95 * 128;
					local299.anInt9418 -= local90 * 128;
				}
			}
		} else {
			Static451.anInt4553 = 0;
			@Pc(104) boolean local104 = false;
			@Pc(110) int local110 = Static37.anInt7512 * 128 - 128;
			local116 = Static329.anInt6247 * 128 - 128;
			for (local118 = 0; local118 < Static328.anInt6238; local118++) {
				@Pc(124) Class12_Sub41 local124 = Static352.aClass12_Sub41Array1[local118];
				if (local124 != null) {
					@Pc(129) Class30_Sub1_Sub1_Sub2 local129 = local124.aClass30_Sub1_Sub1_Sub2_2;
					local129.anInt9416 -= local95 * 128;
					local129.anInt9418 -= local90 * 128;
					if (local129.anInt9418 >= 0 && local129.anInt9418 <= local110 && local129.anInt9416 >= 0 && local116 >= local129.anInt9416) {
						@Pc(168) boolean local168 = true;
						for (local170 = 0; local170 < 10; local170++) {
							local129.anIntArray316[local170] -= local90;
							local129.anIntArray317[local170] -= local95;
							if (local129.anIntArray316[local170] < 0 || Static37.anInt7512 <= local129.anIntArray316[local170] || local129.anIntArray317[local170] < 0 || Static329.anInt6247 <= local129.anIntArray317[local170]) {
								local168 = false;
							}
						}
						if (local168) {
							Static11.anIntArray16[Static451.anInt4553++] = local129.anInt4197;
						} else {
							local129.method3609(null);
							local124.method7967();
							local104 = true;
						}
					} else {
						local129.method3609(null);
						local104 = true;
						local124.method7967();
					}
				}
			}
			if (local104) {
				Static328.anInt6238 = Static29.aClass68_7.method1925();
				Static29.aClass68_7.method1921(Static352.aClass12_Sub41Array1);
			}
		}
		for (local288 = 0; local288 < 2048; local288++) {
			@Pc(351) Class30_Sub1_Sub1_Sub1 local351 = Static90.aClass30_Sub1_Sub1_Sub1Array1[local288];
			if (local351 != null) {
				for (local116 = 0; local116 < 10; local116++) {
					local351.anIntArray316[local116] -= local90;
					local351.anIntArray317[local116] -= local95;
				}
				local351.anInt9418 -= local90 * 128;
				local351.anInt9416 -= local95 * 128;
			}
		}
		@Pc(406) Class76[] local406 = Static22.aClass76Array28;
		for (local116 = 0; local116 < local406.length; local116++) {
			@Pc(414) Class76 local414 = local406[local116];
			if (local414 != null) {
				local414.anInt2313 -= local90 * 128;
				local414.anInt2317 -= local95 * 128;
			}
		}
		for (@Pc(442) Class12_Sub17 local442 = (Class12_Sub17) Static179.aClass73_31.method2005(); local442 != null; local442 = (Class12_Sub17) Static179.aClass73_31.method2009()) {
			local442.anInt3846 -= local90;
			local442.anInt3840 -= local95;
			if (Static184.anInt4228 != 4 && (local442.anInt3846 < 0 || local442.anInt3840 < 0 || local442.anInt3846 >= Static37.anInt7512 || local442.anInt3840 >= Static329.anInt6247)) {
				local442.method7967();
			}
		}
		if (Static184.anInt4228 != 4) {
			for (@Pc(497) Class12_Sub28 local497 = (Class12_Sub28) Static295.aClass68_45.method1923(); local497 != null; local497 = (Class12_Sub28) Static295.aClass68_45.method1920()) {
				@Pc(505) int local505 = (int) (local497.aLong248 & 0x3FFFL);
				@Pc(509) int local509 = local505 - Static61.anInt1459;
				local170 = (int) (local497.aLong248 >> 14 & 0x3FFFL);
				@Pc(522) int local522 = local170 - Static203.anInt4534;
				if (local509 < 0 || local522 < 0 || Static37.anInt7512 <= local509 || Static329.anInt6247 <= local522) {
					local497.method7967();
				}
			}
		}
		if (Static273.anInt5444 != 0) {
			Static273.anInt5444 -= local90;
			Static141.anInt3151 -= local95;
		}
		Static237.method4162();
		if (arg1 != 10) {
			Static368.anInt6832 -= local90 * 128;
			Static180.anInt4075 -= local95;
			Static241.anInt9538 -= local95;
			Static6.anInt95 -= local90;
			Static405.anInt7612 -= local90;
			Static6.anInt93 -= local95 * 128;
			if (Math.abs(local90) > Static37.anInt7512 || Math.abs(local95) > Static329.anInt6247) {
				Static299.method4822();
			}
		} else if (Static242.anInt4993 == 4) {
			Static112.anInt2594 -= local95 * 128;
			Static357.anInt6674 -= local95 * 128;
			Static247.anInt5092 -= local90 * 128;
			Static401.anInt7550 -= local90 * 128;
		} else {
			Static242.anInt4993 = 1;
		}
		Static415.method3337();
		Static38.method804();
		Static376.aClass73_77.method2014();
		Static475.aClass73_69.method2014();
		Static259.aClass149_4.method3983();
		Static217.method3994();
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(CB)B")
	public static byte method4366(@OriginalArg(0) char arg0) {
		@Pc(26) byte local26;
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			local26 = (byte) arg0;
		} else if (arg0 == '€') {
			local26 = -128;
		} else if (arg0 == '‚') {
			local26 = -126;
		} else if (arg0 == 'ƒ') {
			local26 = -125;
		} else if (arg0 == '„') {
			local26 = -124;
		} else if (arg0 == '…') {
			local26 = -123;
		} else if (arg0 == '†') {
			local26 = -122;
		} else if (arg0 == '‡') {
			local26 = -121;
		} else if (arg0 == 'ˆ') {
			local26 = -120;
		} else if (arg0 == '‰') {
			local26 = -119;
		} else if (arg0 == 'Š') {
			local26 = -118;
		} else if (arg0 == '‹') {
			local26 = -117;
		} else if (arg0 == 'Œ') {
			local26 = -116;
		} else if (arg0 == 'Ž') {
			local26 = -114;
		} else if (arg0 == '‘') {
			local26 = -111;
		} else if (arg0 == '’') {
			local26 = -110;
		} else if (arg0 == '“') {
			local26 = -109;
		} else if (arg0 == '”') {
			local26 = -108;
		} else if (arg0 == '•') {
			local26 = -107;
		} else if (arg0 == '–') {
			local26 = -106;
		} else if (arg0 == '—') {
			local26 = -105;
		} else if (arg0 == '˜') {
			local26 = -104;
		} else if (arg0 == '™') {
			local26 = -103;
		} else if (arg0 == 'š') {
			local26 = -102;
		} else if (arg0 == '›') {
			local26 = -101;
		} else if (arg0 == 'œ') {
			local26 = -100;
		} else if (arg0 == 'ž') {
			local26 = -98;
		} else if (arg0 == 'Ÿ') {
			local26 = -97;
		} else {
			local26 = 63;
		}
		return local26;
	}
}
