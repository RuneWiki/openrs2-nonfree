import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!ta", name = "D", descriptor = "Lclient!kb;")
	public static Class41 aClass41_28;

	@OriginalMember(owner = "client!ta", name = "J", descriptor = "Lclient!kc;")
	public static Class10 aClass10_2;

	@OriginalMember(owner = "client!ta", name = "P", descriptor = "Lclient!of;")
	public static Class1_Sub17 aClass1_Sub17_68;

	@OriginalMember(owner = "client!ta", name = "R", descriptor = "Lclient!kb;")
	public static Class41 aClass41_29;

	@OriginalMember(owner = "client!ta", name = "A", descriptor = "Lclient!af;")
	public static Class5 aClass5_1288 = Static45.method1937("Ihr Spielkonto wurde deaktiviert)3");

	@OriginalMember(owner = "client!ta", name = "B", descriptor = "Lclient!af;")
	private static Class5 aClass5_1289 = Static45.method1937("button near the top of that page)3");

	@OriginalMember(owner = "client!ta", name = "S", descriptor = "Lclient!af;")
	private static Class5 aClass5_1296 = Static45.method1937("shake:");

	@OriginalMember(owner = "client!ta", name = "C", descriptor = "Lclient!af;")
	public static Class5 aClass5_1290 = aClass5_1296;

	@OriginalMember(owner = "client!ta", name = "E", descriptor = "Lclient!af;")
	public static Class5 aClass5_1291 = aClass5_1296;

	@OriginalMember(owner = "client!ta", name = "F", descriptor = "[Z")
	public static boolean[] aBooleanArray25 = new boolean[100];

	@OriginalMember(owner = "client!ta", name = "G", descriptor = "Lclient!af;")
	public static Class5 aClass5_1292 = aClass5_1289;

	@OriginalMember(owner = "client!ta", name = "H", descriptor = "Z")
	public static volatile boolean aBoolean106 = false;

	@OriginalMember(owner = "client!ta", name = "I", descriptor = "Lclient!af;")
	public static Class5 aClass5_1293 = Static45.method1937("(U(Y");

	@OriginalMember(owner = "client!ta", name = "cb", descriptor = "Lclient!af;")
	private static Class5 aClass5_1297 = Static45.method1937("Walk here");

	@OriginalMember(owner = "client!ta", name = "K", descriptor = "Lclient!af;")
	public static Class5 aClass5_1294 = aClass5_1297;

	@OriginalMember(owner = "client!ta", name = "L", descriptor = "Lclient!af;")
	public static Class5 aClass5_1295 = Static45.method1937("Anmelde)2Limit -Uberschritten)3");

	@OriginalMember(owner = "client!ta", name = "O", descriptor = "I")
	public static int anInt2771 = 1;

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(III)Z")
	private static boolean method1946(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class1_Sub3_Sub10 local12 = Static131.method2263(arg1);
		if (arg0 == 11) {
			arg0 = 10;
		}
		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}
		return local12.method1258(arg0);
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(I)V")
	public static void method1947() {
		aClass5_1297 = null;
		aClass5_1291 = null;
		aClass5_1295 = null;
		aClass5_1293 = null;
		aClass5_1289 = null;
		aClass5_1292 = null;
		aClass1_Sub17_68 = null;
		aClass5_1294 = null;
		aClass41_28 = null;
		aClass10_2 = null;
		aClass41_29 = null;
		aClass5_1296 = null;
		aClass5_1288 = null;
		aBooleanArray25 = null;
		aClass5_1290 = null;
	}

	@OriginalMember(owner = "client!ta", name = "c", descriptor = "(B)V")
	public static void method1948() {
		for (@Pc(16) Class1_Sub22 local16 = (Class1_Sub22) Static66.aClass53_17.method1442(); local16 != null; local16 = (Class1_Sub22) Static66.aClass53_17.method1450()) {
			if (local16.anInt2727 > 0) {
				local16.anInt2727--;
			}
			if (local16.anInt2727 != 0) {
				if (local16.anInt2742 > 0) {
					local16.anInt2742--;
				}
				if (local16.anInt2742 == 0 && local16.anInt2743 >= 1 && local16.anInt2722 >= 1 && local16.anInt2743 <= 102 && local16.anInt2722 <= 102 && (local16.anInt2737 < 0 || method1946(local16.anInt2744, local16.anInt2737))) {
					Static120.method1341(local16.anInt2730, local16.anInt2744, local16.anInt2737, local16.anInt2738, local16.anInt2725, local16.anInt2722, local16.anInt2743);
					local16.anInt2742 = -1;
					if (local16.anInt2737 == local16.anInt2740 && local16.anInt2740 == -1) {
						local16.method2220();
					} else if (local16.anInt2737 == local16.anInt2740 && local16.anInt2738 == local16.anInt2726 && local16.anInt2744 == local16.anInt2731) {
						local16.method2220();
					}
				}
			} else if (local16.anInt2740 < 0 || method1946(local16.anInt2731, local16.anInt2740)) {
				Static120.method1341(local16.anInt2730, local16.anInt2731, local16.anInt2740, local16.anInt2726, local16.anInt2725, local16.anInt2722, local16.anInt2743);
				local16.method2220();
			}
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!cd;I)V")
	public static void method1949(@OriginalArg(0) Class1_Sub3_Sub4_Sub2 arg0) {
		if (arg0.anInt3056 == 0) {
			return;
		}
		@Pc(40) int local40;
		@Pc(34) int local34;
		if (arg0.anInt3039 != -1 && arg0.anInt3039 < 32768) {
			@Pc(25) Class1_Sub3_Sub4_Sub2_Sub2 local25 = Static104.aClass1_Sub3_Sub4_Sub2_Sub2Array1[arg0.anInt3039];
			if (local25 != null) {
				local34 = arg0.anInt3079 - local25.anInt3079;
				local40 = arg0.anInt3089 - local25.anInt3089;
				if (local40 != 0 || local34 != 0) {
					arg0.anInt3080 = (int) (Math.atan2((double) local40, (double) local34) * 325.949D) & 0x7FF;
				}
			}
		}
		@Pc(73) int local73;
		if (arg0.anInt3039 >= 32768) {
			local73 = arg0.anInt3039 - 32768;
			if (Static84.anInt2149 == local73) {
				local73 = 2047;
			}
			@Pc(86) Class1_Sub3_Sub4_Sub2_Sub1 local86 = Static17.aClass1_Sub3_Sub4_Sub2_Sub1Array1[local73];
			if (local86 != null) {
				local34 = arg0.anInt3089 - local86.anInt3089;
				@Pc(101) int local101 = arg0.anInt3079 - local86.anInt3079;
				if (local34 != 0 || local101 != 0) {
					arg0.anInt3080 = (int) (Math.atan2((double) local34, (double) local101) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.anInt3038 != 0 || arg0.anInt3081 != 0) && (arg0.anInt3047 == 0 || arg0.anInt3035 > 0)) {
			local73 = arg0.anInt3089 - (arg0.anInt3038 - Static129.anInt3262 - Static129.anInt3262) * 64;
			local40 = arg0.anInt3079 - (arg0.anInt3081 - Static32.anInt927 - Static32.anInt927) * 64;
			if (local73 != 0 || local40 != 0) {
				arg0.anInt3080 = (int) (Math.atan2((double) local73, (double) local40) * 325.949D) & 0x7FF;
			}
			arg0.anInt3038 = 0;
			arg0.anInt3081 = 0;
		}
		local73 = arg0.anInt3080 - arg0.anInt3073 & 0x7FF;
		if (local73 == 0) {
			arg0.anInt3086 = 0;
			return;
		}
		arg0.anInt3086++;
		@Pc(227) boolean local227;
		if (local73 > 1024) {
			arg0.anInt3073 -= arg0.anInt3056;
			local227 = true;
			if (arg0.anInt3056 > local73 || local73 > 2048 - arg0.anInt3056) {
				arg0.anInt3073 = arg0.anInt3080;
				local227 = false;
			}
			if (arg0.anInt3051 == arg0.anInt3087 && (arg0.anInt3086 > 25 || local227)) {
				if (arg0.anInt3050 == -1) {
					arg0.anInt3087 = arg0.anInt3046;
				} else {
					arg0.anInt3087 = arg0.anInt3050;
				}
			}
		} else {
			arg0.anInt3073 += arg0.anInt3056;
			local227 = true;
			if (local73 < arg0.anInt3056 || 2048 - arg0.anInt3056 < local73) {
				arg0.anInt3073 = arg0.anInt3080;
				local227 = false;
			}
			if (arg0.anInt3087 == arg0.anInt3051 && (arg0.anInt3086 > 25 || local227)) {
				if (arg0.anInt3062 == -1) {
					arg0.anInt3087 = arg0.anInt3046;
				} else {
					arg0.anInt3087 = arg0.anInt3062;
				}
			}
		}
		arg0.anInt3073 &= 0x7FF;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(JI)V")
	public static void method1950(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(12) int local12 = 0; local12 < Static20.anInt658; local12++) {
			if (arg0 == Static86.aLongArray3[local12]) {
				Static20.anInt658--;
				for (@Pc(35) int local35 = local12; local35 < Static20.anInt658; local35++) {
					Static9.aClass5Array2[local35] = Static9.aClass5Array2[local35 + 1];
					Static117.anIntArray458[local35] = Static117.anIntArray458[local35 + 1];
					Static86.aLongArray3[local35] = Static86.aLongArray3[local35 + 1];
					Static54.anIntArray214[local35] = Static54.anIntArray214[local35 + 1];
				}
				Static83.anInt2119 = Static60.anInt1441;
				Static44.aClass1_Sub20_Sub1_1.method2108(173);
				Static44.aClass1_Sub20_Sub1_1.method2078(arg0);
				return;
			}
		}
	}
}
