import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "Lclient!vf;")
	public static Class1_Sub1_Sub8 aClass1_Sub1_Sub8_4;

	@OriginalMember(owner = "client!kk", name = "c", descriptor = "I")
	public static int anInt2280;

	@OriginalMember(owner = "client!kk", name = "o", descriptor = "Lclient!pa;")
	public static Class86 aClass86_41;

	@OriginalMember(owner = "client!kk", name = "s", descriptor = "[I")
	public static int[] anIntArray256;

	@OriginalMember(owner = "client!kk", name = "g", descriptor = "Lclient!hh;")
	private static Class50 aClass50_786 = Static186.method3527("Loading textures )2 ");

	@OriginalMember(owner = "client!kk", name = "m", descriptor = "Z")
	public static boolean aBoolean99 = false;

	@OriginalMember(owner = "client!kk", name = "p", descriptor = "[I")
	public static int[] anIntArray255 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!kk", name = "r", descriptor = "Lclient!hh;")
	public static Class50 aClass50_787 = aClass50_786;

	@OriginalMember(owner = "client!kk", name = "u", descriptor = "I")
	public static int anInt2289 = 0;

	@OriginalMember(owner = "client!kk", name = "v", descriptor = "I")
	public static int anInt2290 = 0;

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIIILclient!ta;JZ)V")
	public static void method1843(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class20 arg4, @OriginalArg(5) long arg5, @OriginalArg(6) boolean arg6) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class128 local6 = new Class128();
		local6.aClass20_10 = arg4;
		local6.anInt4422 = arg1 * 128 + 64;
		local6.anInt4418 = arg2 * 128 + 64;
		local6.anInt4419 = arg3;
		local6.aLong169 = arg5;
		if (Static56.aClass1_Sub11ArrayArrayArray3[arg0][arg1][arg2] == null) {
			Static56.aClass1_Sub11ArrayArrayArray3[arg0][arg1][arg2] = new Class1_Sub11(arg0, arg1, arg2);
		}
		Static56.aClass1_Sub11ArrayArrayArray3[arg0][arg1][arg2].aClass128_1 = local6;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(B)V")
	public static void method1844() {
		Static231.aBoolean215 = true;
		Static113.aClass21_1.anInt878 = 0;
		Static98.aBoolean89 = true;
		Static212.aLong161 = 0L;
		Static197.anInt4430 = 0;
		Static189.method3115();
		Static60.anInt1181 = -1;
		Static32.aClass1_Sub17_Sub1_1.anInt2656 = 0;
		Static134.anInt2778 = -1;
		Static157.anInt3267 = -1;
		Static97.aClass1_Sub17_Sub1_2.anInt2656 = 0;
		Static49.anInt1041 = -1;
		Static173.anInt3576 = 0;
		Static67.anInt1301 = 0;
		Static219.anInt2996 = 0;
		for (@Pc(3005) int local3005 = 0; local3005 < Static229.aClass64Array1.length; local3005++) {
			Static229.aClass64Array1[local3005] = null;
		}
		Static40.aBoolean44 = false;
		Static193.anInt3035 = 0;
		Static188.method3103(0);
		for (@Pc(3033) int local3033 = 0; local3033 < 100; local3033++) {
			Static8.aClass50Array12[local3033] = null;
		}
		Static199.anInt4000 = -1;
		Static214.anInt4249 = 0;
		Static68.anInt1303 = 0;
		Static234.aBoolean218 = false;
		Static223.anInt4341 = (int) (Math.random() * 120.0D) - 60;
		Static223.anInt4343 = 0;
		Static106.anInt2129 = (int) (Math.random() * 30.0D) - 20;
		Static74.anInt1501 = (int) (Math.random() * 80.0D) - 40;
		Static163.anInt3375 = 0;
		Static210.anInt4162 = (int) (Math.random() * 100.0D) - 50;
		Static66.anInt1298 = 0;
		Static13.anInt250 = 0;
		Static103.anInt2065 = 0;
		Static43.anInt929 = (int) (Math.random() * 110.0D) - 55;
		Static104.anInt2068 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
		Static123.anInt1750 = 0;
		for (@Pc(3109) int local3109 = 0; local3109 < 2048; local3109++) {
			Static232.aClass20_Sub3_Sub1Array1[local3109] = null;
			Static119.aClass1_Sub17Array1[local3109] = null;
		}
		for (@Pc(3127) int local3127 = 0; local3127 < 32768; local3127++) {
			Static78.aClass20_Sub3_Sub2Array1[local3127] = null;
		}
		Static230.aClass20_Sub3_Sub1_3 = Static232.aClass20_Sub3_Sub1Array1[2047] = new Class20_Sub3_Sub1();
		Static156.aClass75_16.method2243();
		Static40.aClass75_4.method2243();
		@Pc(3157) int local3157;
		for (@Pc(3153) int local3153 = 0; local3153 < 4; local3153++) {
			for (local3157 = 0; local3157 < 104; local3157++) {
				for (@Pc(3161) int local3161 = 0; local3161 < 104; local3161++) {
					Static182.aClass75ArrayArrayArray1[local3153][local3157][local3161] = null;
				}
			}
		}
		Static76.aClass75_9 = new Class75();
		Static56.anInt1096 = 0;
		Static21.anInt420 = 0;
		Static64.method986();
		Static157.method2603();
		Static43.anInt925 = 0;
		Static220.anInt4292 = 0;
		Static140.anInt2856 = 0;
		Static230.anInt3197 = 0;
		Static190.anInt3916 = 0;
		Static63.anInt1256 = 0;
		Static63.anInt1263 = 0;
		Static220.anInt4302 = 0;
		Static64.anInt1282 = 0;
		Static149.anInt3109 = 0;
		for (local3157 = 0; local3157 < Static63.anIntArray102.length; local3157++) {
			Static63.anIntArray102[local3157] = -1;
		}
		if (Static10.anInt204 != -1) {
			Static97.method1527(Static10.anInt204);
		}
		for (@Pc(3246) Class1_Sub13 local3246 = (Class1_Sub13) Static157.aClass90_19.method2823(); local3246 != null; local3246 = (Class1_Sub13) Static157.aClass90_19.method2821()) {
			Static203.method532(true, local3246);
		}
		Static10.anInt204 = -1;
		Static157.aClass90_19 = new Class90(8);
		Static193.anInt3035 = 0;
		Static199.aClass93_112 = null;
		Static40.aBoolean44 = false;
		Static16.aClass25_1.method769(false, new int[5], null, -1);
		for (@Pc(3282) int local3282 = 0; local3282 < 8; local3282++) {
			Static138.aClass50Array53[local3282] = null;
			Static47.aBooleanArray2[local3282] = false;
		}
		Static65.method3263();
		Static146.aBoolean129 = true;
		for (@Pc(3304) int local3304 = 0; local3304 < 100; local3304++) {
			Static98.aBooleanArray5[local3304] = true;
		}
		Static212.aClass1_Sub9Array1 = null;
		Static60.aClass50_422 = null;
		Static213.anInt4208 = 0;
		for (@Pc(3322) int local3322 = 0; local3322 < 6; local3322++) {
			Static35.aClass100Array1[local3322] = new Class100();
		}
		for (@Pc(3336) int local3336 = 0; local3336 < 25; local3336++) {
			Static143.anIntArray303[local3336] = 0;
			Static218.anIntArray385[local3336] = 0;
			Static140.anIntArray300[local3336] = 0;
		}
		Static53.aClass50_379 = Static175.aClass50_1196;
		Static150.aBoolean132 = false;
		Static12.aShortArray2 = Static194.aShortArray60 = Static173.aShortArray54 = Static163.aShortArray43 = new short[256];
		Static110.aBoolean98 = true;
		Static82.aClass75_10.method2243();
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(II)V")
	public static void method1848(@OriginalArg(0) int arg0) {
		if (!Static1.method31(arg0)) {
			return;
		}
		@Pc(14) Class93[] local14 = Static54.aClass93ArrayArray1[arg0];
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(22) Class93 local22 = local14[local16];
			if (local22 != null) {
				local22.anInt3636 = 0;
				local22.anInt3654 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIILclient!db;I)V")
	public static void method1849(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class18 arg3) {
		for (@Pc(15) Class1_Sub16 local15 = (Class1_Sub16) Static198.aClass75_20.method2239(); local15 != null; local15 = (Class1_Sub16) Static198.aClass75_20.method2238()) {
			if (arg0 == local15.anInt1905 && local15.anInt1901 == arg1 * 128 && arg2 * 128 == local15.anInt1908 && arg3.anInt790 == local15.aClass18_1.anInt790) {
				if (local15.aClass1_Sub12_Sub4_2 != null) {
					Static226.aClass1_Sub12_Sub1_2.method894(local15.aClass1_Sub12_Sub4_2);
					local15.aClass1_Sub12_Sub4_2 = null;
				}
				if (local15.aClass1_Sub12_Sub4_1 != null) {
					Static226.aClass1_Sub12_Sub1_2.method894(local15.aClass1_Sub12_Sub4_1);
					local15.aClass1_Sub12_Sub4_1 = null;
				}
				local15.method3525();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)Lclient!vf;")
	public static Class1_Sub1_Sub8 method1851() {
		@Pc(9) int local9 = Static101.anIntArray191[0] * Static8.anIntArray20[0];
		@Pc(16) int[] local16 = new int[local9];
		@Pc(20) byte[] local20 = Static191.aByteArrayArray11[0];
		for (@Pc(22) int local22 = 0; local22 < local9; local22++) {
			local16[local22] = Static78.anIntArray127[local20[local22] & 0xFF];
		}
		@Pc(61) Class1_Sub1_Sub8_Sub1 local61 = new Class1_Sub1_Sub8_Sub1(Static204.anInt4108, Static146.anInt3070, Static169.anIntArray370[0], Static228.anIntArray507[0], Static8.anIntArray20[0], Static101.anIntArray191[0], local16);
		Static216.method3375();
		return local61;
	}
}
