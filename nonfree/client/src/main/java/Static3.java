import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ac", name = "y", descriptor = "Lclient!kl;")
	public static Class2_Sub2_Sub11 aClass2_Sub2_Sub11_1;

	@OriginalMember(owner = "client!ac", name = "D", descriptor = "[[[Lclient!ht;")
	public static Class113[][][] aClass113ArrayArrayArray1;

	@OriginalMember(owner = "client!ac", name = "B", descriptor = "Lclient!ff;")
	public static final Class81 aClass81_3 = new Class81(76, -2);

	@OriginalMember(owner = "client!ac", name = "C", descriptor = "Lclient!vj;")
	public static final Class256 aClass256_3 = new Class256("Starting 3d Library", "Starte 3D-Softwarebibliothek.", "Démarrage de la librairie 3D", "Iniciando biblioteca 3D");

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(III)Lclient!jv;")
	public static Class4_Sub5 method90(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class113 local7 = Static176.aClass113ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class4_Sub5 local14 = local7.aClass4_Sub5_1;
			local7.aClass4_Sub5_1 = null;
			return local14;
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZILclient!tk;Lclient!qa;Lclient!fh;I)Z")
	public static boolean method91(@OriginalArg(2) Class2_Sub38 arg0, @OriginalArg(3) Class26 arg1, @OriginalArg(4) Class83 arg2) {
		@Pc(7) int local7 = Integer.MAX_VALUE;
		@Pc(9) int local9 = Integer.MIN_VALUE;
		@Pc(16) int local16 = Integer.MAX_VALUE;
		@Pc(18) int local18 = Integer.MIN_VALUE;
		if (arg2.anIntArray133 != null) {
			local9 = Static169.anInt3166 + (Static169.anInt3165 - Static169.anInt3166) * (-Static169.anInt3164 + (arg2.anInt2333 - -arg0.anInt6767)) / (Static169.anInt3169 - Static169.anInt3164);
			local16 = Static169.anInt3163 - (arg0.anInt6760 + arg2.anInt2317 - Static169.anInt3167) * (-Static169.anInt3170 + Static169.anInt3163) / (Static169.anInt3162 - Static169.anInt3167);
			local7 = (arg2.anInt2305 + arg0.anInt6767 - Static169.anInt3164) * (Static169.anInt3165 - Static169.anInt3166) / (Static169.anInt3169 - Static169.anInt3164) + Static169.anInt3166;
			local18 = Static169.anInt3163 - (Static169.anInt3163 - Static169.anInt3170) * (arg2.anInt2308 - (-arg0.anInt6760 - -Static169.anInt3167)) / (Static169.anInt3162 - Static169.anInt3167);
		}
		@Pc(111) Class76 local111 = null;
		@Pc(113) int local113 = 0;
		@Pc(115) int local115 = 0;
		@Pc(117) int local117 = 0;
		@Pc(119) int local119 = 0;
		if (arg2.anInt2339 != -1) {
			if (arg0.aBoolean577 && arg2.anInt2320 != -1) {
				local111 = arg2.method1701(arg1, true);
			} else {
				local111 = arg2.method1701(arg1, false);
			}
			if (local111 != null) {
				local113 = arg0.anInt6766 - (local111.ja() + 1 >> 1);
				if (local7 > local113) {
					local7 = local113;
				}
				local115 = arg0.anInt6766 + (local111.ja() + 1 >> 1);
				if (local9 < local115) {
					local9 = local115;
				}
				local117 = arg0.anInt6771 - (local111.JA() + 1 >> 1);
				local119 = arg0.anInt6771 + (local111.JA() + 1 >> 1);
				if (local16 > local117) {
					local16 = local117;
				}
				if (local119 > local18) {
					local18 = local119;
				}
			}
		}
		@Pc(219) Class49 local219 = null;
		@Pc(221) int local221 = 0;
		@Pc(223) int local223 = 0;
		@Pc(225) int local225 = 0;
		@Pc(227) int local227 = 0;
		@Pc(229) int local229 = 0;
		@Pc(231) int local231 = 0;
		@Pc(233) int local233 = 0;
		@Pc(283) int local283;
		@Pc(306) int local306;
		if (arg2.aString18 != null) {
			local219 = Static195.method3038(arg2.anInt2312);
			if (local219 != null) {
				local221 = Static434.aClass210_10.method4756(Static238.aStringArray22, arg2.aString18, null, null);
				local223 = arg0.anInt6771;
				if (local111 == null) {
					local223 -= local221 * local219.method1278() / 2;
				} else {
					local223 -= (local111.JA() >> 1) + (local219.method1276() * local221);
				}
				for (local283 = 0; local283 < local221; local283++) {
					@Pc(289) String local289 = Static238.aStringArray22[local283];
					if (local283 < local221 - 1) {
						local289 = local289.substring(0, local289.length() - 4);
					}
					local306 = local219.method1275(local289);
					if (local225 < local306) {
						local225 = local306;
					}
				}
				local227 = arg0.anInt6766 - local225 / 2;
				local229 = local225 / 2 + arg0.anInt6766;
				if (local7 > local227) {
					local7 = local227;
				}
				local231 = local223;
				if (local9 < local229) {
					local9 = local229;
				}
				local233 = local223 + local219.method1276() * local221;
				if (local231 < local16) {
					local16 = local231;
				}
				if (local233 > local18) {
					local18 = local233;
				}
			}
		}
		if (local9 < Static169.anInt3166 || local7 > Static169.anInt3165 || Static169.anInt3170 > local18 || Static169.anInt3163 < local16) {
			return true;
		}
		@Pc(414) int local414;
		if (arg2.anIntArray133 != null) {
			@Pc(412) int[] local412 = new int[arg2.anIntArray133.length];
			for (local414 = 0; local414 < local412.length / 2; local414++) {
				local306 = arg2.anIntArray133[local414 * 2] + arg0.anInt6767;
				@Pc(439) int local439 = arg0.anInt6760 + arg2.anIntArray133[local414 * 2 + 1];
				local412[local414 * 2] = (Static169.anInt3165 - Static169.anInt3166) * (local306 + -Static169.anInt3164) / (Static169.anInt3169 - Static169.anInt3164) + Static169.anInt3166;
				local412[local414 * 2 + 1] = Static169.anInt3163 - (Static169.anInt3163 - Static169.anInt3170) * (-Static169.anInt3167 + local439) / (Static169.anInt3162 - Static169.anInt3167);
			}
			Static247.method3815(arg1, local412, arg2.anInt2309);
			for (local306 = 0; local306 < local412.length / 2 - 1; local306++) {
				arg1.method2266(local412[local306 * 2 + 1], arg2.anInt2332, local412[local306 * 2], local412[local306 * 2 + 3], local412[(local306 + 1) * 2]);
			}
			arg1.method2266(local412[local412.length - 1], arg2.anInt2332, local412[local412.length - 2], local412[1], local412[0]);
		}
		if (local111 != null) {
			if (Static176.anInt3420 > 0 && (Static401.anInt6978 != -1 && Static401.anInt6978 == arg0.anInt6772 || Static167.anInt3227 != -1 && arg2.anInt2313 == Static167.anInt3227)) {
				if (Static303.anInt5385 > 50) {
					local283 = (100 - Static303.anInt5385) * 2;
				} else {
					local283 = Static303.anInt5385 * 2;
				}
				local414 = local283 << 24 | 0xFFFF00;
				arg1.method2236(arg0.anInt6771, local111.UA() / 2 + 7, arg0.anInt6766, local414);
				arg1.method2236(arg0.anInt6771, local111.UA() / 2 + 5, arg0.anInt6766, local414);
				arg1.method2236(arg0.anInt6771, local111.UA() / 2 + 3, arg0.anInt6766, local414);
				arg1.method2236(arg0.anInt6771, local111.UA() / 2 + 1, arg0.anInt6766, local414);
				arg1.method2236(arg0.anInt6771, local111.UA() / 2, arg0.anInt6766, local414);
			}
			local111.method6088(arg0.anInt6766 - (local111.ja() >> 1), arg0.anInt6771 - (local111.JA() >> 1));
		}
		if (arg2.aString18 != null && local219 != null) {
			Static400.method5466(local221, arg0, local225, local223, arg1, arg2, local219);
		}
		if (arg2.anInt2339 != -1 || arg2.aString18 != null) {
			@Pc(725) Class2_Sub43 local725 = new Class2_Sub43(arg0);
			local725.anInt7447 = local229;
			local725.anInt7454 = local233;
			local725.anInt7451 = local227;
			local725.anInt7453 = local113;
			local725.anInt7446 = local231;
			local725.anInt7449 = local117;
			local725.anInt7448 = local115;
			local725.anInt7457 = local119;
			Static128.aClass265_20.method5999(local725);
		}
		return false;
	}
}
