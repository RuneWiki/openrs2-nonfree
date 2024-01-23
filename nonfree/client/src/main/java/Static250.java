import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static250 {

	@OriginalMember(owner = "client!sb", name = "sb", descriptor = "Lclient!bo;")
	public static Class24 aClass24_19 = new Class24();

	@OriginalMember(owner = "client!sb", name = "wb", descriptor = "Ljava/lang/String;")
	public static String aString104 = "";

	@OriginalMember(owner = "client!sb", name = "zb", descriptor = "Z")
	public static boolean aBoolean231 = false;

	@OriginalMember(owner = "client!sb", name = "Fb", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray27 = new String[100];

	@OriginalMember(owner = "client!sb", name = "Hb", descriptor = "I")
	public static int anInt3291 = 0;

	@OriginalMember(owner = "client!sb", name = "h", descriptor = "(I)V")
	public static void method2591() {
		Static310.anInt1326 = 0;
		@Pc(13) int local13 = (Static229.aClass22_Sub3_Sub2_2.anInt4601 >> 7) + Static290.anInt5497;
		@Pc(20) int local20 = Static118.anInt2409 + (Static229.aClass22_Sub3_Sub2_2.anInt4623 >> 7);
		if (local13 >= 3053 && local13 <= 3156 && local20 >= 3056 && local20 <= 3136) {
			Static310.anInt1326 = 1;
		}
		if (local13 >= 3072 && local13 <= 3118 && local20 >= 9492 && local20 <= 9535) {
			Static310.anInt1326 = 1;
		}
		if (Static310.anInt1326 == 1 && local13 >= 3139 && local13 <= 3199 && local20 >= 3008 && local20 <= 3062) {
			Static310.anInt1326 = 0;
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Z)I")
	public static int method2599() {
		return Static224.anInt4349 == 0 ? 0 : Static278.anInterface2Array1[Static224.anInt4349].method3760();
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2601(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 < 0 || arg4 < 0 || arg0 >= 103 || arg4 >= 103) {
			return;
		}
		@Pc(50) int local50;
		if (arg3 == 0) {
			@Pc(38) Class61 local38 = Static47.method829(arg2, arg0, arg4);
			if (local38 != null) {
				local50 = Integer.MAX_VALUE & (int) (local38.aLong65 >>> 32);
				if (arg6 == 2) {
					local38.aClass22_2 = new Class22_Sub5(local50, 2, arg1 + 4, arg2, arg0, arg4, arg5, false, local38.aClass22_2);
					local38.aClass22_3 = new Class22_Sub5(local50, 2, arg1 + 1 & 0x3, arg2, arg0, arg4, arg5, false, local38.aClass22_3);
				} else {
					local38.aClass22_2 = new Class22_Sub5(local50, arg6, arg1, arg2, arg0, arg4, arg5, false, local38.aClass22_2);
				}
			}
		}
		if (arg3 == 1) {
			@Pc(117) Class102 local117 = Static144.method2292(arg2, arg0, arg4);
			if (local117 != null) {
				local50 = (int) (local117.aLong113 >>> 32) & Integer.MAX_VALUE;
				if (arg6 == 4 || arg6 == 5) {
					local117.aClass22_4 = new Class22_Sub5(local50, 4, arg1, arg2, arg0, arg4, arg5, false, local117.aClass22_4);
				} else if (arg6 == 6) {
					local117.aClass22_4 = new Class22_Sub5(local50, 4, arg1 + 4, arg2, arg0, arg4, arg5, false, local117.aClass22_4);
				} else if (arg6 == 7) {
					local117.aClass22_4 = new Class22_Sub5(local50, 4, (arg1 + 2 & 0x3) + 4, arg2, arg0, arg4, arg5, false, local117.aClass22_4);
				} else if (arg6 == 8) {
					local117.aClass22_4 = new Class22_Sub5(local50, 4, arg1 + 4, arg2, arg0, arg4, arg5, false, local117.aClass22_4);
					local117.aClass22_5 = new Class22_Sub5(local50, 4, (arg1 + 2 & 0x3) + 4, arg2, arg0, arg4, arg5, false, local117.aClass22_5);
				}
			}
		}
		if (arg3 == 2) {
			if (arg6 == 11) {
				arg6 = 10;
			}
			@Pc(259) Class60 local259 = Static31.method536(arg2, arg0, arg4);
			if (local259 != null) {
				local259.aClass22_1 = new Class22_Sub5((int) (local259.aLong64 >>> 32) & Integer.MAX_VALUE, arg6, arg1, arg2, arg0, arg4, arg5, false, local259.aClass22_1);
			}
		}
		if (arg3 == 3) {
			@Pc(293) Class171 local293 = Static158.method1622(arg2, arg0, arg4);
			if (local293 != null) {
				local293.aClass22_10 = new Class22_Sub5((int) (local293.aLong196 >>> 32) & Integer.MAX_VALUE, 22, arg1, arg2, arg0, arg4, arg5, false, local293.aClass22_10);
			}
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!ph;I)V")
	public static void method2609(@OriginalArg(0) Class138 arg0) {
		Static105.aClass1_Sub1_Sub3Array7 = Static297.method4448(arg0, Static255.anInt4978);
		Static236.aClass1_Sub1_Sub3Array16 = Static297.method4448(arg0, Static274.anInt5246);
		Static119.aClass1_Sub1_Sub3Array19 = Static297.method4448(arg0, Static91.anInt1744);
		Static188.aClass1_Sub1_Sub3Array13 = Static297.method4448(arg0, Static164.anInt3445);
		Static56.aClass1_Sub1_Sub3Array5 = Static297.method4448(arg0, Static247.anInt4897);
		Static297.aClass1_Sub1_Sub3Array17 = Static297.method4448(arg0, Static110.anInt2183);
		Static309.aClass1_Sub1_Sub3Array18 = Static119.method4633(Static297.anInt5627, arg0);
		Static63.aClass1_Sub1_Sub3Array6 = Static119.method4633(Static207.anInt4077, arg0);
		Static276.aClass1_Sub1_Sub3Array12 = Static119.method4633(Static199.anInt4004, arg0);
		Static231.aClass103Array4 = Static90.method3653(arg0, Static55.anInt1098);
		Static197.aClass103Array3 = Static90.method3653(arg0, Static242.anInt4865);
		Static289.aClass1_Sub1_Sub12_4.method4423(Static197.aClass103Array3, null);
		Static233.aClass1_Sub1_Sub12_3.method4423(Static197.aClass103Array3, null);
		Static245.aClass1_Sub1_Sub12_2.method4423(Static197.aClass103Array3, null);
		if (Static291.aBoolean404) {
			Static174.aClass103_Sub2Array2 = Static132.method2153(Static200.anInt5632, arg0);
			for (@Pc(93) int local93 = 0; local93 < Static174.aClass103_Sub2Array2.length; local93++) {
				Static174.aClass103_Sub2Array2[local93].method4606();
			}
		}
		@Pc(110) Class1_Sub1_Sub3_Sub2 local110 = Static210.method3325(arg0, Static191.anInt3920, 0);
		local110.method3475();
		if (Static291.aBoolean404) {
			Static152.aClass1_Sub1_Sub3_5 = new Class1_Sub1_Sub3_Sub1(local110);
		} else {
			Static152.aClass1_Sub1_Sub3_5 = local110;
		}
		@Pc(129) Class1_Sub1_Sub3_Sub2[] local129 = Static114.method1829(Static39.anInt792, arg0);
		@Pc(131) int local131;
		for (local131 = 0; local131 < local129.length; local131++) {
			local129[local131].method3475();
		}
		if (Static291.aBoolean404) {
			Static119.aClass1_Sub1_Sub3Array20 = new Class1_Sub1_Sub3[local129.length];
			for (local131 = 0; local131 < local129.length; local131++) {
				Static119.aClass1_Sub1_Sub3Array20[local131] = new Class1_Sub1_Sub3_Sub1(local129[local131]);
			}
		} else {
			Static119.aClass1_Sub1_Sub3Array20 = local129;
		}
	}
}
