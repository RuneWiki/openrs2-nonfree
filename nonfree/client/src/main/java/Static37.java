import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!fb", name = "n", descriptor = "[Lclient!bf;")
	public static Class9[] aClass9Array1;

	@OriginalMember(owner = "client!fb", name = "o", descriptor = "[Lclient!af;")
	public static Class5[] aClass5Array7;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "[Lclient!r;")
	public static Class41_Sub1[] aClass41_Sub1Array1 = new Class41_Sub1[256];

	@OriginalMember(owner = "client!fb", name = "j", descriptor = "Lclient!af;")
	private static Class5 aClass5_450 = Static45.method1937("wave:");

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "Lclient!af;")
	public static Class5 aClass5_444 = aClass5_450;

	@OriginalMember(owner = "client!fb", name = "d", descriptor = "[I")
	public static int[] anIntArray165 = new int[50];

	@OriginalMember(owner = "client!fb", name = "e", descriptor = "Lclient!af;")
	private static Class5 aClass5_445 = Static45.method1937("yellow:");

	@OriginalMember(owner = "client!fb", name = "f", descriptor = "Lclient!af;")
	public static Class5 aClass5_446 = aClass5_450;

	@OriginalMember(owner = "client!fb", name = "g", descriptor = "Lclient!af;")
	public static Class5 aClass5_447 = Static45.method1937("Bitte warten Sie)3)3)3");

	@OriginalMember(owner = "client!fb", name = "h", descriptor = "Lclient!af;")
	public static Class5 aClass5_448 = aClass5_445;

	@OriginalMember(owner = "client!fb", name = "i", descriptor = "Lclient!af;")
	public static Class5 aClass5_449 = aClass5_445;

	@OriginalMember(owner = "client!fb", name = "k", descriptor = "Lclient!af;")
	public static Class5 aClass5_451 = Static45.method1937("welle2:");

	@OriginalMember(owner = "client!fb", name = "m", descriptor = "Lclient!af;")
	public static Class5 aClass5_452 = Static45.method1937(" )2> <col=00ffff>");

	@OriginalMember(owner = "client!fb", name = "p", descriptor = "I")
	public static int anInt962 = 0;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lclient!cd;B)V")
	public static void method683(@OriginalArg(0) Class1_Sub3_Sub4_Sub2 arg0) {
		if (arg0.anInt3074 == Static131.anInt3270 || arg0.anInt3068 == -1 || arg0.anInt3048 != 0 || arg0.anInt3053 + 1 > Static77.method1316(arg0.anInt3068).anIntArray318[arg0.anInt3075]) {
			@Pc(41) int local41 = arg0.anInt3074 - arg0.anInt3072;
			@Pc(47) int local47 = Static131.anInt3270 - arg0.anInt3072;
			@Pc(58) int local58 = arg0.anInt3071 * 128 + arg0.anInt3063 * 64;
			@Pc(68) int local68 = arg0.anInt3063 * 64 + arg0.anInt3090 * 128;
			@Pc(79) int local79 = arg0.anInt3040 * 128 + arg0.anInt3063 * 64;
			@Pc(89) int local89 = arg0.anInt3052 * 128 + arg0.anInt3063 * 64;
			arg0.anInt3089 = (local89 * local47 + local58 * (local41 - local47)) / local41;
			arg0.anInt3079 = (local79 * local47 + local68 * (local41 - local47)) / local41;
		}
		if (arg0.anInt3069 == 0) {
			arg0.anInt3080 = 1024;
		}
		if (arg0.anInt3069 == 1) {
			arg0.anInt3080 = 1536;
		}
		arg0.anInt3035 = 0;
		if (arg0.anInt3069 == 2) {
			arg0.anInt3080 = 0;
		}
		if (arg0.anInt3069 == 3) {
			arg0.anInt3080 = 512;
		}
		arg0.anInt3073 = arg0.anInt3080;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V")
	public static void method684() {
		aClass5_445 = null;
		aClass5_451 = null;
		aClass9Array1 = null;
		aClass5_447 = null;
		aClass5Array7 = null;
		aClass41_Sub1Array1 = null;
		aClass5_449 = null;
		aClass5_450 = null;
		aClass5_444 = null;
		anIntArray165 = null;
		aClass5_446 = null;
		aClass5_448 = null;
		aClass5_452 = null;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "([Lclient!of;II)V")
	public static void method685(@OriginalArg(0) Class1_Sub17[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(15) Class1_Sub17 local15 = arg0[local7];
			if (local15 != null && local15.anInt2292 == arg1 && (!local15.aBoolean89 || !Static24.method540(local15))) {
				if (local15.anInt2271 == 0) {
					if (!local15.aBoolean89 && Static24.method540(local15) && local15 != Static68.aClass1_Sub17_43) {
						continue;
					}
					method685(arg0, local15.anInt2248);
					if (local15.aClass1_Sub17Array1 != null) {
						method685(local15.aClass1_Sub17Array1, local15.anInt2248);
					}
					@Pc(66) Class1_Sub5 local66 = (Class1_Sub5) Static66.aClass7_14.method287((long) local15.anInt2248);
					if (local66 != null) {
						Static123.method2177(local66.anInt862);
					}
				}
				if (local15.anInt2271 == 6) {
					@Pc(94) int local94;
					if (local15.anInt2314 != -1 || local15.anInt2275 != -1) {
						@Pc(89) boolean local89 = Static84.method1490(local15);
						if (local89) {
							local94 = local15.anInt2275;
						} else {
							local94 = local15.anInt2314;
						}
						if (local94 != -1) {
							@Pc(107) Class1_Sub3_Sub11 local107 = Static77.method1316(local94);
							local15.anInt2268 += Static95.anInt2359;
							while (local15.anInt2268 > local107.anIntArray318[local15.anInt2258]) {
								local15.anInt2268 -= local107.anIntArray318[local15.anInt2258];
								local15.anInt2258++;
								if (local107.anIntArray315.length <= local15.anInt2258) {
									local15.anInt2258 -= local107.anInt2051;
									if (local15.anInt2258 < 0 || local15.anInt2258 >= local107.anIntArray315.length) {
										local15.anInt2258 = 0;
									}
								}
								Static119.method2161(local15);
							}
						}
					}
					if (local15.anInt2265 != 0 && !local15.aBoolean89) {
						@Pc(184) int local184 = local15.anInt2265 >> 16;
						@Pc(188) int local188 = local184 * Static95.anInt2359;
						local15.anInt2242 = local15.anInt2242 + local188 & 0x7FF;
						local94 = local15.anInt2265 << 16 >> 16;
						local94 *= Static95.anInt2359;
						local15.anInt2304 = local94 + local15.anInt2304 & 0x7FF;
						Static119.method2161(local15);
					}
				}
			}
		}
	}
}
