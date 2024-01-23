import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static155 {

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "Lclient!em;")
	public static Interface1 anInterface1_113;

	@OriginalMember(owner = "client!ma", name = "d", descriptor = "[[B")
	public static byte[][] aByteArrayArray126;

	@OriginalMember(owner = "client!ma", name = "p", descriptor = "[Lclient!hk;")
	public static Class71_Sub1[] aClass71_Sub1Array114;

	@OriginalMember(owner = "client!ma", name = "q", descriptor = "Z")
	public static boolean aBoolean491;

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "I")
	public static int anInt6184 = 0;

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "I")
	public static int anInt6185 = 0;

	@OriginalMember(owner = "client!ma", name = "j", descriptor = "J")
	public static volatile long aLong316 = 0L;

	@OriginalMember(owner = "client!ma", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString301 = "Hidden";

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(III)V")
	public static void method4925(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(20) int local20;
		if (arg0 != Static114.anInt1359) {
			Static281.anIntArray506 = new int[arg0];
			for (local20 = 0; local20 < arg0; local20++) {
				Static281.anIntArray506[local20] = (local20 << 12) / arg0;
			}
			Static31.anInt572 = arg0 * 32;
			Static114.anInt1359 = arg0;
			Static129.anInt2676 = arg0 - 1;
		}
		if (arg1 == Static199.anInt4143) {
			return;
		}
		if (Static114.anInt1359 == arg1) {
			Static234.anIntArray435 = Static281.anIntArray506;
		} else {
			Static234.anIntArray435 = new int[arg1];
			for (local20 = 0; local20 < arg1; local20++) {
				Static234.anIntArray435[local20] = (local20 << 12) / arg1;
			}
		}
		Static39.anInt939 = arg1 - 1;
		Static199.anInt4143 = arg1;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(ZLclient!jd;)V")
	public static void method4928(@OriginalArg(1) Class84 arg0) {
		aClass71_Sub1Array114 = Static156.method4439(arg0, Static102.anInt2236);
		Static163.anIntArray259 = new int[256];
		@Pc(15) int local15;
		for (local15 = 0; local15 < 3; local15++) {
			@Pc(31) float local31 = (float) (Static201.anIntArray348[local15] >> 16 & 0xFF);
			@Pc(41) int local41 = Static201.anIntArray348[local15 + 1] >> 16 & 0xFF;
			@Pc(51) int local51 = Static201.anIntArray348[local15 + 1] >> 8 & 0xFF;
			@Pc(59) float local59 = ((float) local41 - local31) / 64.0F;
			@Pc(66) float local66 = (float) (Static201.anIntArray348[local15] & 0xFF);
			@Pc(75) float local75 = (float) (Static201.anIntArray348[local15] >> 8 & 0xFF);
			@Pc(83) float local83 = ((float) local51 - local75) / 64.0F;
			@Pc(91) int local91 = Static201.anIntArray348[local15 + 1] & 0xFF;
			@Pc(99) float local99 = ((float) local91 - local66) / 64.0F;
			for (@Pc(101) int local101 = 0; local101 < 64; local101++) {
				Static163.anIntArray259[local15 * 64 + local101] = (int) local66 | (int) local31 << 16 | (int) local75 << 8;
				local66 += local99;
				local31 += local59;
				local75 += local83;
			}
		}
		for (local15 = 192; local15 < 255; local15++) {
			Static163.anIntArray259[local15] = Static201.anIntArray348[3];
		}
		Static121.anIntArray171 = new int[32768];
		Static298.anIntArray473 = new int[32768];
		Static288.method4788(null);
		Static22.anIntArray20 = new int[32768];
		Static127.anIntArray173 = new int[32768];
		Static212.aClass2_Sub3_Sub1_Sub1_5 = new Class2_Sub3_Sub1_Sub1(128, 254);
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "()V")
	public static void method4930() {
		for (@Pc(1) int local1 = 0; local1 < Static288.anInt5982; local1++) {
			@Pc(8) Class34 local8 = Static292.aClass34Array3[local1];
			Static206.method3482(local8);
			Static292.aClass34Array3[local1] = null;
		}
		Static288.anInt5982 = 0;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(CI)C")
	public static char method4931(@OriginalArg(0) char arg0) {
		return arg0 == 'µ' || arg0 == 'ƒ' ? arg0 : Character.toTitleCase(arg0);
	}

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "(I)V")
	public static void method4932() {
		Static219.aClass115ArrayArray1 = new Class115[Static277.aClass84_118.method2118()][];
		Static116.aBooleanArray12 = new boolean[Static277.aClass84_118.method2118()];
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(B)V")
	public static void method4933() {
		try {
			if (Static131.anInt2692 == 1) {
				@Pc(13) int local13 = Static2.aClass2_Sub5_Sub3_4.method2762();
				if (local13 > 0 && Static2.aClass2_Sub5_Sub3_4.method2737()) {
					local13 -= Static154.anInt3284;
					if (local13 < 0) {
						local13 = 0;
					}
					Static2.aClass2_Sub5_Sub3_4.method2761(local13);
					return;
				}
				Static2.aClass2_Sub5_Sub3_4.method2758();
				Static2.aClass2_Sub5_Sub3_4.method2749();
				Static8.aClass2_Sub24_1 = null;
				Static236.aClass47_1 = null;
				if (Static101.aClass84_127 == null) {
					Static131.anInt2692 = 0;
				} else {
					Static131.anInt2692 = 2;
				}
			}
		} catch (@Pc(60) Exception local60) {
			local60.printStackTrace();
			Static2.aClass2_Sub5_Sub3_4.method2758();
			Static131.anInt2692 = 0;
			Static8.aClass2_Sub24_1 = null;
			Static236.aClass47_1 = null;
			Static101.aClass84_127 = null;
		}
	}
}
