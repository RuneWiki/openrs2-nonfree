import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static326 {

	@OriginalMember(owner = "client!ju", name = "G", descriptor = "Lclient!qh;")
	public static final Class309 aClass309_5 = new Class309("runescape", "RuneScape", 0);

	@OriginalMember(owner = "client!ju", name = "C", descriptor = "I")
	public static final int anInt5315 = 4;

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(IIIZI)V")
	public static void method4755(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		if (Static103.anInt2245 == 4) {
			Static238.anInt3790 = -1;
			Static103.anInt2245 = 0;
		}
		if (!arg2 && Static67.anInt1612 == arg0 && arg1 == Static654.anInt10061 && (Static606.anInt9196 == Static723.anInt11225 || Static580.aClass3_Sub22_24.aClass21_Sub15_2.method5064() == 1)) {
			return;
		}
		Static67.anInt1612 = arg0;
		Static654.anInt10061 = arg1;
		Static606.anInt9196 = Static723.anInt11225;
		if (Static580.aClass3_Sub22_24.aClass21_Sub15_2.method5064() == 1) {
			Static606.anInt9196 = 0;
		}
		Static336.method4832(arg3);
		Static472.method6430(Static153.aClass22_4, true, Static480.aClass57_9, Static52.aClass169_1, Static430.aClass257_12.method5699(Static456.anInt7118));
		@Pc(86) int local86 = Static291.anInt4448;
		Static291.anInt4448 = (Static67.anInt1612 - (Static497.anInt7926 >> 4)) * 8;
		@Pc(96) int local96 = Static189.anInt3243;
		Static189.anInt3243 = (Static654.anInt10061 - (Static646.anInt9979 >> 4)) * 8;
		Static336.aClass3_Sub7_Sub18_3 = Static327.method1007(Static67.anInt1612 * 8, Static654.anInt10061 * 8);
		Static242.aClass377_3 = null;
		@Pc(120) int local120 = Static291.anInt4448 - local86;
		@Pc(124) int local124 = Static189.anInt3243 - local96;
		@Pc(129) int local129;
		@Pc(142) int local142;
		@Pc(276) int local276;
		@Pc(216) int local216;
		if (arg3 == 12) {
			for (local129 = 0; local129 < Static568.anInt8629; local129++) {
				@Pc(135) Class3_Sub52 local135 = Static169.aClass3_Sub52Array1[local129];
				if (local135 != null) {
					@Pc(140) Class9_Sub1_Sub1_Sub2_Sub2 local140 = local135.aClass9_Sub1_Sub1_Sub2_Sub2_2;
					for (local142 = 0; local142 < local140.anIntArray644.length; local142++) {
						local140.anIntArray644[local142] -= local120;
						local140.anIntArray643[local142] -= local124;
					}
					local140.anInt10695 -= local124 * 512;
					local140.anInt10694 -= local120 * 512;
				}
			}
		} else {
			Static28.anInt1087 = 0;
			@Pc(204) boolean local204 = false;
			@Pc(210) int local210 = Static497.anInt7926 * 512 - 512;
			local216 = Static646.anInt9979 * 512 - 512;
			for (local142 = 0; local142 < Static568.anInt8629; local142++) {
				@Pc(224) Class3_Sub52 local224 = Static169.aClass3_Sub52Array1[local142];
				if (local224 != null) {
					@Pc(229) Class9_Sub1_Sub1_Sub2_Sub2 local229 = local224.aClass9_Sub1_Sub1_Sub2_Sub2_2;
					local229.anInt10695 -= local124 * 512;
					local229.anInt10694 -= local120 * 512;
					if (local229.anInt10694 >= 0 && local229.anInt10694 <= local210 && local229.anInt10695 >= 0 && local216 >= local229.anInt10695) {
						@Pc(274) boolean local274 = true;
						for (local276 = 0; local276 < local229.anIntArray644.length; local276++) {
							local229.anIntArray644[local276] -= local120;
							local229.anIntArray643[local276] -= local124;
							if (local229.anIntArray644[local276] < 0 || local229.anIntArray644[local276] >= Static497.anInt7926 || local229.anIntArray643[local276] < 0 || local229.anIntArray643[local276] >= Static646.anInt9979) {
								local274 = false;
							}
						}
						if (local274) {
							Static633.anIntArray705[Static28.anInt1087++] = local229.anInt8783;
						} else {
							local229.method7509((Class219) null);
							local204 = true;
							local224.method9596();
						}
					} else {
						local229.method7509((Class219) null);
						local224.method9596();
						local204 = true;
					}
				}
			}
			if (local204) {
				Static568.anInt8629 = Static94.aClass313_8.method7108();
				Static94.aClass313_8.method7105(Static169.aClass3_Sub52Array1);
			}
		}
		for (local129 = 0; local129 < 2048; local129++) {
			@Pc(405) Class9_Sub1_Sub1_Sub2_Sub1 local405 = Static19.aClass9_Sub1_Sub1_Sub2_Sub1Array1[local129];
			if (local405 != null) {
				for (local216 = 0; local216 < local405.anIntArray644.length; local216++) {
					local405.anIntArray644[local216] -= local120;
					local405.anIntArray643[local216] -= local124;
				}
				local405.anInt10695 -= local124 * 512;
				local405.anInt10694 -= local120 * 512;
			}
		}
		@Pc(467) Class197[] local467 = Static110.aClass197Array1;
		for (local216 = 0; local216 < local467.length; local216++) {
			@Pc(475) Class197 local475 = local467[local216];
			if (local475 != null) {
				local475.anInt5074 -= local124 * 512;
				local475.anInt5081 -= local120 * 512;
			}
		}
		@Pc(505) Class3_Sub57 local505;
		for (local505 = (Class3_Sub57) Static629.aClass342_76.method7644(); local505 != null; local505 = (Class3_Sub57) Static629.aClass342_76.method7650()) {
			local505.anInt10805 -= local124;
			local505.anInt10797 -= local120;
			if (Static49.anInt1325 != 4 && (local505.anInt10797 < 0 || local505.anInt10805 < 0 || local505.anInt10797 >= Static497.anInt7926 || Static646.anInt9979 <= local505.anInt10805)) {
				local505.method9596();
			}
		}
		for (local505 = (Class3_Sub57) Static226.aClass342_35.method7644(); local505 != null; local505 = (Class3_Sub57) Static226.aClass342_35.method7650()) {
			local505.anInt10797 -= local120;
			local505.anInt10805 -= local124;
			if (Static49.anInt1325 != 4 && (local505.anInt10797 < 0 || local505.anInt10805 < 0 || local505.anInt10797 >= Static497.anInt7926 || Static646.anInt9979 <= local505.anInt10805)) {
				local505.method9596();
			}
		}
		if (Static49.anInt1325 != 4) {
			for (@Pc(655) Class3_Sub28 local655 = (Class3_Sub28) Static113.aClass313_9.method7103(); local655 != null; local655 = (Class3_Sub28) Static113.aClass313_9.method7110()) {
				@Pc(663) int local663 = (int) (local655.aLong345 & 0x3FFFL);
				@Pc(668) int local668 = local663 - Static291.anInt4448;
				local276 = (int) (local655.aLong345 >> 14 & 0x3FFFL);
				@Pc(681) int local681 = local276 - Static189.anInt3243;
				if (local668 < 0 || local681 < 0 || local668 >= Static497.anInt7926 || Static646.anInt9979 <= local681) {
					local655.method9596();
				}
			}
		}
		if (Static681.anInt10651 != 0) {
			Static517.anInt8136 -= local124;
			Static681.anInt10651 -= local120;
		}
		Static383.method5140();
		if (arg3 != 12) {
			Static453.anInt6956 -= local120;
			Static528.anInt8244 -= local124;
			Static183.anInt3174 -= local124;
			Static263.anInt4101 -= local124 * 512;
			Static114.anInt2375 -= local120;
			Static305.anInt4908 -= local120 * 512;
			if (Math.abs(local120) > Static497.anInt7926 || Math.abs(local124) > Static646.anInt9979) {
				Static509.method6646();
			}
		} else if (Static262.anInt4081 == 4) {
			Static690.anInt10754 -= local120 * 512;
			Static13.anInt566 -= local120 * 512;
			Static504.anInt8040 -= local124 * 512;
			Static78.anInt1842 -= local124 * 512;
		} else {
			Static358.anInt5640 = -1;
			Static494.anInt7853 = -1;
			Static262.anInt4081 = 1;
		}
		Static338.method4844();
		Static527.method7039();
		Static53.aClass313_6.method7101();
		Static355.aClass342_94.method7655();
		Static291.aClass319_4.method7192();
		Static115.method2192();
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(ICB)C")
	public static char method4757(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1) {
		if (arg1 >= 'À' && arg1 <= 'ÿ') {
			if (arg1 >= 'À' && arg1 <= 'Æ') {
				return 'A';
			}
			if (arg1 == 'Ç') {
				return 'C';
			}
			if (arg1 >= 'È' && arg1 <= 'Ë') {
				return 'E';
			}
			if (arg1 >= 'Ì' && arg1 <= 'Ï') {
				return 'I';
			}
			if (arg1 >= 'Ò' && arg1 <= 'Ö') {
				return 'O';
			}
			if (arg1 >= 'Ù' && arg1 <= 'Ü') {
				return 'U';
			}
			if (arg1 == 'Ý') {
				return 'Y';
			}
			if (arg1 == 'ß') {
				return 's';
			}
			if (arg1 >= 'à' && arg1 <= 'æ') {
				return 'a';
			}
			if (arg1 == 'ç') {
				return 'c';
			}
			if (arg1 >= 'è' && arg1 <= 'ë') {
				return 'e';
			}
			if (arg1 >= 'ì' && arg1 <= 'ï') {
				return 'i';
			}
			if (arg1 >= 'ò' && arg1 <= 'ö') {
				return 'o';
			}
			if (arg1 >= 'ù' && arg1 <= 'ü') {
				return 'u';
			}
			if (arg1 == 'ý' || arg1 == 'ÿ') {
				return 'y';
			}
		}
		if (arg1 == 'Œ') {
			return 'O';
		} else if (arg1 == 'œ') {
			return 'o';
		} else if (arg1 == 'Ÿ') {
			return 'Y';
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!ju", name = "e", descriptor = "(I)Z")
	public static boolean method4758() {
		@Pc(10) Class3_Sub31 local10 = (Class3_Sub31) Static256.aClass342_26.method7644();
		if (local10 == null) {
			return false;
		}
		for (@Pc(17) int local17 = 0; local17 < local10.anInt4860; local17++) {
			if (local10.aClass338Array2[local17] != null && local10.aClass338Array2[local17].anInt8934 == 0) {
				return false;
			}
			if (local10.aClass338Array1[local17] != null && local10.aClass338Array1[local17].anInt8934 == 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(I)V")
	public static void method4759() {
		Static258.method3587();
		Static445.method5895();
	}
}
