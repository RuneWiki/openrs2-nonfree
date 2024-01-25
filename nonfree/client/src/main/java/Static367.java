import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static367 {

	@OriginalMember(owner = "client!sl", name = "z", descriptor = "F")
	public static float aFloat92;

	@OriginalMember(owner = "client!sl", name = "C", descriptor = "I")
	public static int anInt6036 = 0;

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(IILclient!ya;Lclient!ql;ILclient!kn;)Z")
	public static boolean method5047(@OriginalArg(2) Class39 arg0, @OriginalArg(3) Class202 arg1, @OriginalArg(5) Class1_Sub26 arg2) {
		@Pc(15) int local15 = Integer.MAX_VALUE;
		@Pc(17) int local17 = Integer.MIN_VALUE;
		@Pc(19) int local19 = Integer.MAX_VALUE;
		@Pc(21) int local21 = Integer.MIN_VALUE;
		if (arg1.anIntArray517 != null) {
			local17 = (Static168.anInt434 - Static168.anInt426) * ((arg1.anInt5593 + arg2.anInt3920) - Static168.anInt435) / (Static168.anInt429 - Static168.anInt435) + Static168.anInt426;
			local19 = Static168.anInt427 - (arg2.anInt3924 + arg1.anInt5566 - Static168.anInt428) * (Static168.anInt427 - Static168.anInt436) / (Static168.anInt425 - Static168.anInt428);
			local15 = (Static168.anInt434 - Static168.anInt426) * ((arg1.anInt5594 + arg2.anInt3920) - Static168.anInt435) / (Static168.anInt429 - Static168.anInt435) + Static168.anInt426;
			local21 = Static168.anInt427 - (Static168.anInt427 - Static168.anInt436) * (arg1.anInt5570 - -arg2.anInt3924 - Static168.anInt428) / (Static168.anInt425 - Static168.anInt428);
		}
		@Pc(109) Class143 local109 = null;
		@Pc(111) int local111 = 0;
		@Pc(113) int local113 = 0;
		@Pc(115) int local115 = 0;
		@Pc(117) int local117 = 0;
		if (arg1.anInt5576 != -1) {
			if (arg2.aBoolean279 && arg1.anInt5579 != -1) {
				local109 = arg1.method4658(arg0, true);
			} else {
				local109 = arg1.method4658(arg0, false);
			}
			if (local109 != null) {
				local111 = arg2.anInt3923 - (local109.j() + 1 >> 1);
				local113 = arg2.anInt3923 + (local109.j() + 1 >> 1);
				if (local111 < local15) {
					local15 = local111;
				}
				local115 = arg2.anInt3921 - (local109.T() + 1 >> 1);
				if (local17 < local113) {
					local17 = local113;
				}
				local117 = arg2.anInt3921 + (local109.T() + 1 >> 1);
				if (local19 > local115) {
					local19 = local115;
				}
				if (local117 > local21) {
					local21 = local117;
				}
			}
		}
		@Pc(220) Class271 local220 = null;
		@Pc(222) int local222 = 0;
		@Pc(224) int local224 = 0;
		@Pc(226) int local226 = 0;
		@Pc(228) int local228 = 0;
		@Pc(230) int local230 = 0;
		@Pc(232) int local232 = 0;
		@Pc(234) int local234 = 0;
		@Pc(284) int local284;
		@Pc(307) int local307;
		if (arg1.aString52 != null) {
			local220 = Static218.method3377(arg1.anInt5592);
			if (local220 != null) {
				local222 = Static51.aClass151_137.method3465(null, arg1.aString52, null, Static123.aStringArray18);
				local224 = arg2.anInt3921;
				if (local109 == null) {
					local224 -= local222 * local220.method6009() / 2;
				} else {
					local224 -= (local109.T() >> 1) + (local220.method6013() * local222);
				}
				for (local284 = 0; local284 < local222; local284++) {
					@Pc(290) String local290 = Static123.aStringArray18[local284];
					if (local284 < local222 - 1) {
						local290 = local290.substring(0, local290.length() - 4);
					}
					local307 = local220.method6007(local290);
					if (local226 < local307) {
						local226 = local307;
					}
				}
				local228 = arg2.anInt3923 - local226 / 2;
				local230 = arg2.anInt3923 + local226 / 2;
				if (local228 < local15) {
					local15 = local228;
				}
				local232 = local224;
				if (local17 < local230) {
					local17 = local230;
				}
				local234 = local222 * local220.method6013() + local224;
				if (local232 < local19) {
					local19 = local232;
				}
				if (local21 < local234) {
					local21 = local234;
				}
			}
		}
		if (Static168.anInt426 > local17 || local15 > Static168.anInt434 || Static168.anInt436 > local21 || local19 > Static168.anInt427) {
			return true;
		}
		@Pc(418) int local418;
		if (arg1.anIntArray517 != null) {
			@Pc(416) int[] local416 = new int[arg1.anIntArray517.length];
			for (local418 = 0; local418 < local416.length / 2; local418++) {
				local307 = arg1.anIntArray517[local418 * 2] + arg2.anInt3920;
				@Pc(442) int local442 = arg2.anInt3924 + arg1.anIntArray517[local418 * 2 + 1];
				local416[local418 * 2] = Static168.anInt426 + (Static168.anInt434 - Static168.anInt426) * (-Static168.anInt435 + local307) / (Static168.anInt429 - Static168.anInt435);
				local416[local418 * 2 + 1] = Static168.anInt427 - (local442 - Static168.anInt428) * (-Static168.anInt436 + Static168.anInt427) / (Static168.anInt425 - Static168.anInt428);
			}
			Static103.method1870(arg0, local416, arg1.anInt5591);
			for (local307 = 0; local307 < local416.length / 2 - 1; local307++) {
				arg0.method4529(local416[local307 * 2 + 1], local416[local307 * 2], local416[(local307 + 1) * 2 + 1], arg1.anInt5596, local416[local307 * 2 + 2]);
			}
			arg0.method4529(local416[local416.length - 1], local416[local416.length - 2], local416[1], arg1.anInt5596, local416[0]);
		}
		if (local109 != null) {
			if (Static440.anInt7076 > 0 && (Static304.anInt5263 != -1 && arg2.anInt3922 == Static304.anInt5263 || Static92.anInt1947 != -1 && Static92.anInt1947 == arg1.anInt5561)) {
				if (Static434.anInt7031 <= 50) {
					local284 = Static434.anInt7031 * 2;
				} else {
					local284 = 200 - Static434.anInt7031 * 2;
				}
				local418 = local284 << 24 | 0xFFFF00;
				arg0.method4509(arg2.anInt3923, arg2.anInt3921, local109.la() / 2 + 7, local418);
				arg0.method4509(arg2.anInt3923, arg2.anInt3921, local109.la() / 2 + 5, local418);
				arg0.method4509(arg2.anInt3923, arg2.anInt3921, local109.la() / 2 + 3, local418);
				arg0.method4509(arg2.anInt3923, arg2.anInt3921, local109.la() / 2 + 1, local418);
				arg0.method4509(arg2.anInt3923, arg2.anInt3921, local109.la() / 2, local418);
			}
			local109.method5723(arg2.anInt3923 - (local109.j() >> 1), arg2.anInt3921 + -(local109.T() >> 1));
		}
		if (arg1.aString52 != null && local220 != null) {
			Static140.method2345(local220, arg2, arg0, local226, local222, local224, arg1);
		}
		if (arg1.anInt5576 != -1 || arg1.aString52 != null) {
			@Pc(728) Class1_Sub13 local728 = new Class1_Sub13(arg2);
			local728.anInt1808 = local113;
			local728.anInt1812 = local115;
			local728.anInt1806 = local230;
			local728.anInt1813 = local111;
			local728.anInt1807 = local234;
			local728.anInt1814 = local228;
			local728.anInt1811 = local232;
			local728.anInt1805 = local117;
			Static137.aClass181_23.method4102(local728);
		}
		return false;
	}
}
