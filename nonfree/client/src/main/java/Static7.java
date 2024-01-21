import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!ag", name = "g", descriptor = "I")
	public static int anInt3156;

	@OriginalMember(owner = "client!ag", name = "h", descriptor = "I")
	public static int anInt3157;

	@OriginalMember(owner = "client!ag", name = "X", descriptor = "Lclient!k;")
	public static Class43 aClass43_2;

	@OriginalMember(owner = "client!ag", name = "Y", descriptor = "I")
	public static int anInt3185;

	@OriginalMember(owner = "client!ag", name = "c", descriptor = "Z")
	public static final boolean aBoolean235 = false;

	@OriginalMember(owner = "client!ag", name = "e", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1055 = Static161.method2971("W-=hlen Sie eine Option");

	@OriginalMember(owner = "client!ag", name = "x", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1056 = Static161.method2971(":clan:");

	@OriginalMember(owner = "client!ag", name = "z", descriptor = "I")
	public static int anInt3168 = 0;

	@OriginalMember(owner = "client!ag", name = "G", descriptor = "[Lclient!ne;")
	public static Class58[] aClass58Array2 = new Class58[6];

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)V")
	public static void method2240() {
		for (@Pc(3) int local3 = 0; local3 < Static175.anInt3994; local3++) {
			@Pc(9) int local9 = Static70.anIntArray212[local3]--;
			if (Static70.anIntArray212[local3] >= -10) {
				@Pc(82) Class83 local82 = Static114.aClass83Array1[local3];
				if (local82 == null) {
					local82 = Static194.method2882(Static51.aClass4_Sub1_24, Static156.anIntArray383[local3], 0);
					if (local82 == null) {
						continue;
					}
					Static70.anIntArray212[local3] += local82.method2883();
					Static114.aClass83Array1[local3] = local82;
				}
				if (Static70.anIntArray212[local3] < 0) {
					@Pc(122) int local122;
					if (Static167.anIntArray434[local3] == 0) {
						local122 = Static174.anInt1393;
					} else {
						@Pc(132) int local132 = Static167.anIntArray434[local3] >> 16 & 0xFF;
						@Pc(142) int local142 = local132 * 128 + 64 - Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anInt2596;
						@Pc(150) int local150 = (Static167.anIntArray434[local3] & 0xFF) * 128;
						@Pc(158) int local158 = Static167.anIntArray434[local3] >> 8 & 0xFF;
						if (local142 < 0) {
							local142 = -local142;
						}
						@Pc(176) int local176 = local158 * 128 + 64 - Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anInt2606;
						if (local176 < 0) {
							local176 = -local176;
						}
						@Pc(190) int local190 = local176 + local142 - 128;
						if (local150 < local190) {
							Static70.anIntArray212[local3] = -100;
							continue;
						}
						if (local190 < 0) {
							local190 = 0;
						}
						local122 = Static21.anInt786 * (local150 - local190) / local150;
					}
					if (local122 > 0) {
						@Pc(222) Class1_Sub4_Sub1 local222 = local82.method2884().method319(aClass43_2);
						@Pc(227) Class1_Sub12_Sub1 local227 = Static192.method1754(local222, local122);
						local227.method1760(Static17.anIntArray100[local3] - 1);
						Static77.aClass1_Sub12_Sub2_1.method2357(local227);
					}
					Static70.anIntArray212[local3] = -100;
				}
			} else {
				Static175.anInt3994--;
				for (@Pc(25) int local25 = local3; local25 < Static175.anInt3994; local25++) {
					Static156.anIntArray383[local25] = Static156.anIntArray383[local25 + 1];
					Static114.aClass83Array1[local25] = Static114.aClass83Array1[local25 + 1];
					Static17.anIntArray100[local25] = Static17.anIntArray100[local25 + 1];
					Static70.anIntArray212[local25] = Static70.anIntArray212[local25 + 1];
					Static167.anIntArray434[local25] = Static167.anIntArray434[local25 + 1];
				}
				local3--;
			}
		}
		if (Static162.aBoolean294 && !Static10.method442()) {
			if (Static62.anInt2602 != 0 && Static182.anInt918 != -1) {
				Static15.method630(Static144.aClass4_Sub1_47, Static182.anInt918, Static62.anInt2602);
			}
			Static162.aBoolean294 = false;
		} else if (Static62.anInt2602 != 0 && Static182.anInt918 != -1 && !Static10.method442()) {
			Static1.aClass1_Sub8_Sub1_1.method1654(227);
			Static1.aClass1_Sub8_Sub1_1.method1635(Static182.anInt918);
			Static182.anInt918 = -1;
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(B)V")
	public static void method2258() {
		aClass13_1056 = null;
		aClass58Array2 = null;
		aClass43_2 = null;
		aClass13_1055 = null;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IILclient!pb;III)V")
	public static void method2259(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub2_Sub14 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class1_Sub5 local7 = new Class1_Sub5();
		local7.anInt405 = arg3;
		local7.anInt406 = arg2.anInt3301;
		local7.anInt404 = arg2.anInt3333 * 128;
		local7.anInt409 = arg0 * 128;
		local7.anInt407 = arg1 * 128;
		local7.anInt401 = arg2.anInt3322;
		local7.anIntArray49 = arg2.anIntArray329;
		local7.anInt412 = arg2.anInt3324;
		@Pc(50) int local50 = arg2.anInt3302;
		@Pc(53) int local53 = arg2.anInt3314;
		if (arg4 == 1 || arg4 == 3) {
			local50 = arg2.anInt3314;
			local53 = arg2.anInt3302;
		}
		local7.anInt402 = (arg0 + local53) * 128;
		local7.anInt400 = (local50 + arg1) * 128;
		if (arg2.anIntArray326 != null) {
			local7.aClass1_Sub2_Sub14_1 = arg2;
			local7.method451();
		}
		Static149.aClass82_14.method2853(local7);
		if (local7.anIntArray49 != null) {
			local7.anInt408 = local7.anInt401 + (int) (Math.random() * (double) (local7.anInt406 - local7.anInt401));
		}
	}
}
