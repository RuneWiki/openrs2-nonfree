import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static421 {

	@OriginalMember(owner = "client!nf", name = "d", descriptor = "[I")
	public static int[] anIntArray484;

	@OriginalMember(owner = "client!nf", name = "j", descriptor = "I")
	public static int anInt6854 = -2;

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lclient!qo;IIIB)V")
	public static void method6145(@OriginalArg(0) Class2_Sub48 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) long local16 = (long) (arg3 << 14 | arg2 << 28 | arg1);
		@Pc(22) Class2_Sub53 local22 = (Class2_Sub53) Static596.aClass218_41.method5095(local16, 0);
		if (local22 == null) {
			local22 = new Class2_Sub53();
			Static596.aClass218_41.method5099(local22, local16);
			local22.aClass60_217.method1233(arg0);
			return;
		}
		@Pc(50) Class203 local50 = Static543.aClass37_2.method605(arg0.anInt8383);
		@Pc(53) int local53 = local50.anInt4890;
		if (local50.anInt4835 == 1) {
			local53 *= arg0.anInt8384 + 1;
		}
		for (@Pc(70) Class2_Sub48 local70 = (Class2_Sub48) local22.aClass60_217.method1226(7); local70 != null; local70 = (Class2_Sub48) local22.aClass60_217.method1228()) {
			local50 = Static543.aClass37_2.method605(local70.anInt8383);
			@Pc(81) int local81 = local50.anInt4890;
			if (local50.anInt4835 == 1) {
				local81 *= local70.anInt8384 + 1;
			}
			if (local53 > local81) {
				Static202.method2861(arg0, local70);
				return;
			}
		}
		local22.aClass60_217.method1233(arg0);
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(ILclient!nja;BILclient!sh;Lclient!ha;)Z")
	public static boolean method6147(@OriginalArg(1) Class259 arg0, @OriginalArg(4) Class2_Sub51 arg1, @OriginalArg(5) Class145 arg2) {
		@Pc(7) int local7 = Integer.MAX_VALUE;
		@Pc(9) int local9 = Integer.MIN_VALUE;
		@Pc(11) int local11 = Integer.MAX_VALUE;
		@Pc(13) int local13 = Integer.MIN_VALUE;
		if (arg0.anIntArray497 != null) {
			local9 = Static90.anInt3354 + (arg1.anInt9165 + arg0.anInt6969 - Static90.anInt3351) * (-Static90.anInt3354 + Static90.anInt3356) / (Static90.anInt3346 - Static90.anInt3351);
			local11 = Static90.anInt3357 - (Static90.anInt3357 - Static90.anInt3347) * (arg1.anInt9167 + arg0.anInt6957 - Static90.anInt3352) / (Static90.anInt3355 - Static90.anInt3352);
			local13 = Static90.anInt3357 - (arg0.anInt6982 + arg1.anInt9167 - Static90.anInt3352) * (Static90.anInt3357 - Static90.anInt3347) / (Static90.anInt3355 - Static90.anInt3352);
			local7 = Static90.anInt3354 + (arg0.anInt6973 + arg1.anInt9165 - Static90.anInt3351) * (Static90.anInt3356 - Static90.anInt3354) / (Static90.anInt3346 - Static90.anInt3351);
		}
		@Pc(103) Class43 local103 = null;
		@Pc(105) int local105 = 0;
		@Pc(107) int local107 = 0;
		@Pc(109) int local109 = 0;
		@Pc(111) int local111 = 0;
		if (arg0.anInt6954 != -1) {
			if (arg1.aBoolean786 && arg0.anInt6964 != -1) {
				local103 = arg0.method6256(arg2, true);
			} else {
				local103 = arg0.method6256(arg2, false);
			}
			if (local103 != null) {
				local105 = arg1.anInt9157 - (local103.method9587() + 1 >> 1);
				local107 = arg1.anInt9157 + (local103.method9587() + 1 >> 1);
				if (local105 < local7) {
					local7 = local105;
				}
				if (local9 < local107) {
					local9 = local107;
				}
				local109 = arg1.anInt9163 - (local103.method9600() + 1 >> 1);
				if (local11 > local109) {
					local11 = local109;
				}
				local111 = arg1.anInt9163 + (local103.method9600() + 1 >> 1);
				if (local13 < local111) {
					local13 = local111;
				}
			}
		}
		@Pc(214) Class76 local214 = null;
		@Pc(216) int local216 = 0;
		@Pc(218) int local218 = 0;
		@Pc(220) int local220 = 0;
		@Pc(222) int local222 = 0;
		@Pc(224) int local224 = 0;
		@Pc(226) int local226 = 0;
		@Pc(228) int local228 = 0;
		@Pc(230) int local230 = 0;
		@Pc(311) int local311;
		if (arg0.aString75 != null) {
			local214 = Static338.method4700(arg0.anInt6983);
			if (local214 != null) {
				local216 = Static607.aClass289_17.method6931(arg0.aString75, (int[]) null, Static512.aStringArray36, (Class43[]) null);
				local220 = arg1.anInt9163 - arg0.anInt6952 * (Static90.anInt3357 - Static90.anInt3347) / (Static90.anInt3355 - Static90.anInt3352);
				local218 = arg1.anInt9157 + (Static90.anInt3356 - Static90.anInt3354) * arg0.anInt6977 / (Static90.anInt3346 - Static90.anInt3351);
				if (local103 == null) {
					local220 -= local214.method1560() * local216 / 2;
				} else {
					local220 -= (local103.method9600() >> 1) + (local214.method1561() * local216);
				}
				for (local311 = 0; local311 < local216; local311++) {
					@Pc(317) String local317 = Static512.aStringArray36[local311];
					if (local311 < local216 - 1) {
						local317 = local317.substring(0, local317.length() - 4);
					}
					@Pc(338) int local338 = local214.method1558(local317);
					if (local222 < local338) {
						local222 = local338;
					}
				}
				local224 = local218 - local222 / 2;
				local226 = local218 + local222 / 2;
				if (local224 < local7) {
					local7 = local224;
				}
				local228 = local220;
				if (local226 > local9) {
					local9 = local226;
				}
				if (local11 > local228) {
					local11 = local228;
				}
				local230 = local220 + local214.method1561() * local216;
				if (local13 < local230) {
					local13 = local230;
				}
			}
		}
		if (local9 < Static90.anInt3354 || local7 > Static90.anInt3356 || Static90.anInt3347 > local13 || local11 > Static90.anInt3357) {
			return true;
		}
		Static90.method2917(arg2, arg1, arg0);
		if (local103 != null) {
			if (Static181.anInt3030 > 0 && (Static368.anInt5903 != -1 && Static368.anInt5903 == arg1.anInt9158 || Static444.anInt7209 != -1 && Static444.anInt7209 == arg0.anInt6981)) {
				if (Static482.anInt7725 > 50) {
					local311 = 200 - Static482.anInt7725 * 2;
				} else {
					local311 = Static482.anInt7725 * 2;
				}
				@Pc(501) int local501 = local311 << 24 | 0xFFFF00;
				arg2.method9680(arg1.anInt9163, local103.method9601() / 2 + 7, local501, arg1.anInt9157);
				arg2.method9680(arg1.anInt9163, local103.method9601() / 2 + 5, local501, arg1.anInt9157);
				arg2.method9680(arg1.anInt9163, local103.method9601() / 2 + 3, local501, arg1.anInt9157);
				arg2.method9680(arg1.anInt9163, local103.method9601() / 2 + 1, local501, arg1.anInt9157);
				arg2.method9680(arg1.anInt9163, local103.method9601() / 2, local501, arg1.anInt9157);
			}
			local103.method9588(arg1.anInt9157 - (local103.method9587() >> 1), arg1.anInt9163 + -(local103.method9600() >> 1));
		}
		if (arg0.aString75 != null && local214 != null) {
			Static18.method249(local218, arg2, local216, local214, local222, arg0, arg1, local220);
		}
		if (arg0.anInt6954 != -1 || arg0.aString75 != null) {
			@Pc(626) Class2_Sub41 local626 = new Class2_Sub41(arg1);
			local626.anInt6586 = local109;
			local626.anInt6581 = local226;
			local626.anInt6589 = local107;
			local626.anInt6591 = local105;
			local626.anInt6584 = local224;
			local626.anInt6587 = local111;
			local626.anInt6585 = local230;
			local626.anInt6588 = local228;
			Static127.aClass60_40.method1233(local626);
		}
		return false;
	}
}
