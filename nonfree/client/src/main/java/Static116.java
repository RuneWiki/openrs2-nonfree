import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!ic", name = "K", descriptor = "Lclient!wd;")
	public static Class1_Sub24_Sub4 aClass1_Sub24_Sub4_1;

	@OriginalMember(owner = "client!ic", name = "db", descriptor = "I")
	public static int anInt2464;

	@OriginalMember(owner = "client!ic", name = "fb", descriptor = "I")
	public static int anInt2465;

	@OriginalMember(owner = "client!ic", name = "Q", descriptor = "[Z")
	public static boolean[] aBooleanArray8 = new boolean[100];

	@OriginalMember(owner = "client!ic", name = "bb", descriptor = "Lclient!am;")
	public static Class11 aClass11_1 = new Class11();

	@OriginalMember(owner = "client!ic", name = "cb", descriptor = "Lclient!nf;")
	public static Class1_Sub22 aClass1_Sub22_2 = new Class1_Sub22(0, -1);

	@OriginalMember(owner = "client!ic", name = "eb", descriptor = "Ljava/lang/String;")
	public static String aString139 = "Discard";

	@OriginalMember(owner = "client!ic", name = "gb", descriptor = "Lclient!vh;")
	public static Class187 aClass187_68 = new Class187(20);

	@OriginalMember(owner = "client!ic", name = "f", descriptor = "(B)V")
	public static void method2093() {
		if (Static35.aBoolean269) {
			return;
		}
		Static35.aBoolean269 = true;
		if (Static73.aBoolean87) {
			Static49.aFloat32 = (int) Static49.aFloat32 + 191 & 0xFFFFFF80;
		} else {
			Static85.aFloat56 += (24.0F - Static85.aFloat56) / 2.0F;
		}
		Static114.aBoolean142 = true;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!nk;Lclient!nk;B)V")
	public static void method2094(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class121 arg1) {
		Static69.aClass121_122 = arg1;
		Static194.aClass121_86 = arg0;
		Static69.aClass121_122.method3125(36);
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIII)V")
	public static void method2095(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static127.aClass1_Sub14_Sub1_3.anInt1480 = 0;
		Static127.aClass1_Sub14_Sub1_3.method1390(20);
		Static127.aClass1_Sub14_Sub1_3.method1390(arg0);
		Static127.aClass1_Sub14_Sub1_3.method1390(arg3);
		Static127.aClass1_Sub14_Sub1_3.method1338(arg1);
		Static127.aClass1_Sub14_Sub1_3.method1338(arg2);
		Static314.anInt864 = 0;
		Static280.anInt5073 = 0;
		Static178.anInt3427 = -3;
		Static227.anInt4177 = 1;
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(IB)V")
	public static void method2096(@OriginalArg(0) int arg0) {
		@Pc(8) Class1_Sub2_Sub11 local8 = Static5.method35(arg0, 8);
		local8.method2873();
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(IIII)I")
	public static int method2097(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg2 / arg1;
		@Pc(13) int local13 = arg1 - 1 & arg2;
		@Pc(17) int local17 = arg0 / arg1;
		@Pc(23) int local23 = arg0 & arg1 - 1;
		@Pc(28) int local28 = Static97.method1799(local17, local3);
		@Pc(35) int local35 = Static97.method1799(local17, local3 + 1);
		@Pc(44) int local44 = Static97.method1799(local17 + 1, local3);
		@Pc(53) int local53 = Static97.method1799(local17 + 1, local3 - -1);
		@Pc(60) int local60 = Static104.method1889(local28, local35, local13, arg1);
		@Pc(67) int local67 = Static104.method1889(local44, local53, local13, arg1);
		return Static104.method1889(local60, local67, local23, arg1);
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(III)V")
	public static void method2098(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static132.anInt3684 = Static109.anInt4232 + Static109.anInt4231 - arg1 - 1;
		Static61.anInt1168 = arg0 - Static109.anInt4229;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIBI)V")
	public static void method2099(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) int local5 = arg2 * Static182.anInt3491 >> 8;
		if (local5 != 0 && arg0 != -1) {
			Static189.method3084(local5, arg0, Static32.aClass121_68);
			Static152.aBoolean36 = true;
		}
	}

	@OriginalMember(owner = "client!ic", name = "e", descriptor = "(I)V")
	public static void method2100() {
		Static295.method4500(Static27.anInt478);
		@Pc(17) int local17 = (Static192.anInt3637 >> 3) + (Static233.anInt4252 >> 10);
		@Pc(26) int local26 = (Static94.anInt3434 >> 10) + (Static199.anInt3817 >> 3);
		Static222.anIntArray345 = new int[18];
		Static129.anIntArray224 = new int[18];
		Static47.anIntArray59 = new int[18];
		Static130.anIntArray225 = new int[18];
		Static224.anIntArray348 = new int[18];
		Static168.anIntArray280 = new int[18];
		Static54.aByteArrayArray2 = new byte[18][];
		Static309.aByteArrayArray18 = new byte[18][];
		Static115.aByteArrayArray5 = new byte[18][];
		Static306.aByteArrayArray17 = new byte[18][];
		Static175.aByteArrayArray8 = new byte[18][];
		Static281.anIntArrayArray42 = new int[18][4];
		@Pc(82) int local82 = 0;
		@Pc(88) int local88;
		for (local88 = (local26 - 6) / 8; local88 <= (local26 + 6) / 8; local88++) {
			for (@Pc(105) int local105 = (local17 - 6) / 8; local105 <= (local17 + 6) / 8; local105++) {
				@Pc(118) int local118 = local105 + (local88 << 8);
				Static224.anIntArray348[local82] = local118;
				Static47.anIntArray59[local82] = Static313.aClass121_73.method3108("m" + local88 + "_" + local105);
				Static130.anIntArray225[local82] = Static313.aClass121_73.method3108("l" + local88 + "_" + local105);
				Static222.anIntArray345[local82] = Static313.aClass121_73.method3108("n" + local88 + "_" + local105);
				Static168.anIntArray280[local82] = Static313.aClass121_73.method3108("um" + local88 + "_" + local105);
				Static129.anIntArray224[local82] = Static313.aClass121_73.method3108("ul" + local88 + "_" + local105);
				if (Static222.anIntArray345[local82] == -1) {
					Static47.anIntArray59[local82] = -1;
					Static130.anIntArray225[local82] = -1;
					Static168.anIntArray280[local82] = -1;
					Static129.anIntArray224[local82] = -1;
				}
				local82++;
			}
		}
		for (local88 = local82; local88 < Static222.anIntArray345.length; local88++) {
			Static222.anIntArray345[local88] = -1;
			Static47.anIntArray59[local88] = -1;
			Static130.anIntArray225[local88] = -1;
			Static168.anIntArray280[local88] = -1;
			Static129.anIntArray224[local88] = -1;
		}
		Static204.method3259(false, 8, local17, 8, local26, true, 0);
	}
}
