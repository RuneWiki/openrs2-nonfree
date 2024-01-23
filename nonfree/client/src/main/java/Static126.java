import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!je", name = "a", descriptor = "[Lclient!n;")
	public static Class4_Sub2_Sub4_Sub2[] aClass4_Sub2_Sub4_Sub2Array2;

	@OriginalMember(owner = "client!je", name = "g", descriptor = "I")
	public static int anInt2525;

	@OriginalMember(owner = "client!je", name = "b", descriptor = "F")
	public static float aFloat73 = 0.0F;

	@OriginalMember(owner = "client!je", name = "p", descriptor = "I")
	public static int anInt2531 = 0;

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(III)V")
	public static void method2046(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 8) {
			arg1 = 4;
		}
		if (arg1 == 4 && !Static304.aBoolean404) {
			arg0 = 2;
			arg1 = 2;
		}
		if (arg1 != Static108.anInt2152) {
			if (Static43.aBoolean58) {
				return;
			}
			if (Static108.anInt2152 != 0) {
				Static133.anInterface2Array1[Static108.anInt2152].method4568();
			}
			if (arg1 != 0) {
				@Pc(60) Interface2 local60 = Static133.anInterface2Array1[arg1];
				local60.method4566();
				local60.method4567(arg0);
			}
			Static108.anInt2152 = arg1;
			Static100.anInt1978 = arg0;
		} else if (arg1 != 0 && arg0 != Static100.anInt1978) {
			Static133.anInterface2Array1[arg1].method4567(arg0);
			Static100.anInt1978 = arg0;
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIILclient!uk;Lclient!uk;IIIIJ)V")
	public static void method2047(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class13 arg4, @OriginalArg(5) Class13 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) long arg10) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class35 local6 = new Class35();
		local6.aLong48 = arg10;
		local6.anInt1244 = arg1 * 128 + 64;
		local6.anInt1249 = arg2 * 128 + 64;
		local6.anInt1246 = arg3;
		local6.aClass13_2 = arg4;
		local6.aClass13_1 = arg5;
		local6.anInt1242 = arg6;
		local6.anInt1247 = arg7;
		local6.anInt1240 = arg8;
		local6.anInt1248 = arg9;
		for (@Pc(46) int local46 = arg0; local46 >= 0; local46--) {
			if (Static261.aClass4_Sub21ArrayArrayArray4[local46][arg1][arg2] == null) {
				Static261.aClass4_Sub21ArrayArrayArray4[local46][arg1][arg2] = new Class4_Sub21(local46, arg1, arg2);
			}
		}
		Static261.aClass4_Sub21ArrayArrayArray4[arg0][arg1][arg2].aClass35_1 = local6;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IC)Z")
	public static boolean method2048(@OriginalArg(1) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(B)V")
	public static void method2051() {
		Static105.anInt2109 = 0;
		Static291.anInt5649 = 0;
		Static261.method4052();
		Static60.method1142();
		Static262.method4056();
		@Pc(25) int local25;
		for (local25 = 0; local25 < Static105.anInt2109; local25++) {
			@Pc(32) int local32 = Static3.anIntArray3[local25];
			if (Static260.aClass13_Sub5_Sub2Array114[local32].anInt5329 != Static50.anInt1118) {
				if (Static260.aClass13_Sub5_Sub2Array114[local32].aClass185_1.method4663()) {
					Static65.method4576(Static260.aClass13_Sub5_Sub2Array114[local32]);
				}
				Static260.aClass13_Sub5_Sub2Array114[local32].method4230(null);
				Static260.aClass13_Sub5_Sub2Array114[local32] = null;
			}
		}
		if (Static31.anInt653 != Static256.aClass4_Sub24_Sub1_3.anInt3822) {
			throw new RuntimeException("gnp1 pos:" + Static256.aClass4_Sub24_Sub1_3.anInt3822 + " psize:" + Static31.anInt653);
		}
		for (local25 = 0; local25 < Static99.anInt1950; local25++) {
			if (Static260.aClass13_Sub5_Sub2Array114[Static123.anIntArray214[local25]] == null) {
				throw new RuntimeException("gnp2 pos:" + local25 + " size:" + Static99.anInt1950);
			}
		}
	}
}
