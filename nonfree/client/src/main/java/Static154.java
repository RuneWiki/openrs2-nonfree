import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!qg", name = "Q", descriptor = "[I")
	public static int[] anIntArray423;

	@OriginalMember(owner = "client!qg", name = "U", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!qg", name = "eb", descriptor = "Lclient!nd;")
	public static Class60_Sub1 aClass60_Sub1_133;

	@OriginalMember(owner = "client!qg", name = "L", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_2038 = Static118.method2249("Unable to connect)3");

	@OriginalMember(owner = "client!qg", name = "M", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_2039 = Static118.method2249("(Y");

	@OriginalMember(owner = "client!qg", name = "N", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_2040 = Static118.method2249("Ihr Spielkonto wird bereits benutzt)3");

	@OriginalMember(owner = "client!qg", name = "P", descriptor = "Lclient!oc;")
	public static Class65 aClass65_2041 = aClass65_2038;

	@OriginalMember(owner = "client!qg", name = "W", descriptor = "Lclient!oc;")
	public static Class65 aClass65_2042 = aClass65_2038;

	@OriginalMember(owner = "client!qg", name = "X", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_2043 = Static118.method2249("Diese Welt ist voll)3");

	@OriginalMember(owner = "client!qg", name = "Y", descriptor = "I")
	public static int anInt3548 = 0;

	@OriginalMember(owner = "client!qg", name = "bb", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_2044 = Static118.method2249(" has logged in)3");

	@OriginalMember(owner = "client!qg", name = "db", descriptor = "Lclient!oc;")
	public static Class65 aClass65_2045 = aClass65_2044;

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIIII)V")
	public static void method2689(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(13) int local13 = arg1 * arg1;
		Static51.method893(arg4, Static40.anIntArrayArray11[arg0], arg3 + arg1, arg3 - arg1);
		@Pc(28) int local28 = arg2;
		@Pc(30) int local30 = 0;
		@Pc(34) int local34 = local13 << 1;
		@Pc(38) int local38 = arg2 << 1;
		@Pc(42) int local42 = local13 << 2;
		@Pc(46) int local46 = arg2 * arg2;
		@Pc(52) int local52 = (arg2 - 1) * local42;
		@Pc(56) int local56 = local46 << 1;
		@Pc(64) int local64 = local56 * 3;
		@Pc(73) int local73 = (1 - local38) * local13 + local56;
		@Pc(81) int local81 = local34 * ((arg2 << 1) - 3);
		@Pc(85) int local85 = local46 << 2;
		@Pc(94) int local94 = local46 - (local38 - 1) * local34;
		@Pc(100) int local100 = local85;
		while (local28 > 0) {
			local28--;
			if (local73 < 0) {
				while (local73 < 0) {
					local94 += local100;
					local100 += local85;
					local73 += local64;
					local64 += local85;
					local30++;
				}
			}
			if (local94 < 0) {
				local30++;
				local73 += local64;
				local94 += local100;
				local100 += local85;
				local64 += local85;
			}
			@Pc(158) int local158 = local28 + arg0;
			local73 += -local52;
			@Pc(168) int local168 = arg3 + local30;
			local52 -= local42;
			@Pc(176) int local176 = arg0 - local28;
			@Pc(180) int local180 = arg3 - local30;
			local94 += -local81;
			Static51.method893(arg4, Static40.anIntArrayArray11[local176], local168, local180);
			Static51.method893(arg4, Static40.anIntArrayArray11[local158], local168, local180);
			local81 -= local42;
		}
	}

	@OriginalMember(owner = "client!qg", name = "c", descriptor = "(II)Lclient!wd;")
	public static Class97 method2691(@OriginalArg(1) int arg0) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(16) int local16 = arg0 & 0xFFFF;
		if (Static99.aClass97ArrayArray1[local3] == null || Static99.aClass97ArrayArray1[local3][local16] == null) {
			@Pc(32) boolean local32 = Static173.method2925(local3);
			if (!local32) {
				return null;
			}
		}
		return Static99.aClass97ArrayArray1[local3][local16];
	}

	@OriginalMember(owner = "client!qg", name = "c", descriptor = "(I)V")
	public static void method2693() {
		try {
			if (Static191.anInt4167 == 1) {
				@Pc(16) int local16 = Static63.aClass1_Sub6_Sub2_1.method2047();
				if (local16 > 0 && Static63.aClass1_Sub6_Sub2_1.method2077()) {
					local16 -= Static16.anInt446;
					if (local16 < 0) {
						local16 = 0;
					}
					Static63.aClass1_Sub6_Sub2_1.method2070(local16);
				} else {
					Static63.aClass1_Sub6_Sub2_1.method2048();
					Static63.aClass1_Sub6_Sub2_1.method2068();
					if (Static62.aClass60_14 == null) {
						Static191.anInt4167 = 0;
					} else {
						Static191.anInt4167 = 2;
					}
					Static16.aClass1_Sub11_1 = null;
					Static31.aClass50_1 = null;
				}
			}
		} catch (@Pc(61) Exception local61) {
			local61.printStackTrace();
			Static63.aClass1_Sub6_Sub2_1.method2048();
			Static191.anInt4167 = 0;
			Static16.aClass1_Sub11_1 = null;
			Static62.aClass60_14 = null;
			Static31.aClass50_1 = null;
		}
	}

	@OriginalMember(owner = "client!qg", name = "d", descriptor = "(II)I")
	public static int method2694(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IB)Lclient!qg;")
	public static Class1_Sub2_Sub20 method2695(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub2_Sub20 local10 = (Class1_Sub2_Sub20) Static13.aClass87_16.method3062((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static31.aClass60_5.method2340(arg0, 5);
		local10 = new Class1_Sub2_Sub20();
		if (local25 != null) {
			local10.method2692(new Class1_Sub14(local25));
		}
		Static13.aClass87_16.method3068(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "(IB)V")
	public static void method2697(@OriginalArg(0) int arg0) {
		if (Static173.method2925(arg0)) {
			Static83.method1442(-1, Static99.aClass97ArrayArray1[arg0]);
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZI)Lclient!oc;")
	public static Class65 method2698(@OriginalArg(1) int arg0) {
		return arg0 < 999999999 ? Static118.method2250(arg0) : Static57.aClass65_946;
	}
}
