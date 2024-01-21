import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!gd", name = "S", descriptor = "[Z")
	public static boolean[] aBooleanArray21;

	@OriginalMember(owner = "client!gd", name = "W", descriptor = "I")
	public static int anInt2763;

	@OriginalMember(owner = "client!gd", name = "Y", descriptor = "I")
	public static int anInt2765;

	@OriginalMember(owner = "client!gd", name = "T", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1258 = Static56.method972("@whi@");

	@OriginalMember(owner = "client!gd", name = "V", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1259 = Static56.method972("Benutzen Sie die (WPasswort -=ndern(W Option");

	@OriginalMember(owner = "client!gd", name = "X", descriptor = "I")
	public static int anInt2764 = 0;

	@OriginalMember(owner = "client!gd", name = "ab", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1260 = Static56.method972("Lade Eingabe)2Steuerungsprogramm)3)3)3");

	@OriginalMember(owner = "client!gd", name = "bb", descriptor = "[I")
	public static int[] anIntArray320 = new int[32768];

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "(Z)V")
	public static void method1790() {
		@Pc(15) int local15 = (Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anInt1543 >> 7) + Static52.anInt1378;
		@Pc(22) int local22 = (Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anInt1567 >> 7) + Static109.anInt2875;
		Static54.anInt1413 = 0;
		if (local22 >= 3053 && local22 <= 3156 && local15 >= 3056 && local15 <= 3136) {
			Static54.anInt1413 = 1;
		}
		if (local22 >= 3072 && local22 <= 3118 && local15 >= 9492 && local15 <= 9535) {
			Static54.anInt1413 = 1;
		}
		if (Static54.anInt1413 == 1 && local22 >= 3139 && local22 <= 3199 && local15 >= 3008 && local15 <= 3062) {
			Static54.anInt1413 = 0;
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Ljava/awt/Component;Lclient!bf;ILclient!bf;)V")
	public static void method1793(@OriginalArg(0) Component arg0, @OriginalArg(1) Class11 arg1, @OriginalArg(3) Class11 arg2) {
		if (Static103.aBoolean143) {
			return;
		}
		Static47.aClass2_9 = Static92.method1544(arg0, 128, 265);
		Static66.method1850();
		Static113.aClass2_26 = Static92.method1544(arg0, 128, 265);
		Static66.method1850();
		Static37.aClass2_6 = Static92.method1544(arg0, 509, 171);
		Static66.method1850();
		Static102.aClass2_22 = Static92.method1544(arg0, 360, 132);
		Static66.method1850();
		Static110.aClass2_24 = Static92.method1544(arg0, 360, 200);
		Static66.method1850();
		Static16.aClass2_3 = Static92.method1544(arg0, 202, 238);
		Static66.method1850();
		Static57.aClass2_13 = Static92.method1544(arg0, 203, 238);
		Static66.method1850();
		Static15.aClass2_2 = Static92.method1544(arg0, 74, 94);
		Static66.method1850();
		Static48.aClass2_10 = Static92.method1544(arg0, 75, 94);
		Static66.method1850();
		@Pc(77) byte[] local77 = arg2.method1884(Static5.aClass5_110, Static88.aClass5_1020);
		@Pc(83) Class3_Sub1_Sub2_Sub3 local83 = new Class3_Sub1_Sub2_Sub3(local77, arg0);
		Static47.aClass2_9.method1318();
		local83.method1444(0, 0);
		Static113.aClass2_26.method1318();
		local83.method1444(-637, 0);
		Static37.aClass2_6.method1318();
		local83.method1444(-128, 0);
		Static102.aClass2_22.method1318();
		local83.method1444(-202, -371);
		Static110.aClass2_24.method1318();
		local83.method1444(-202, -171);
		Static16.aClass2_3.method1318();
		local83.method1444(0, -265);
		Static57.aClass2_13.method1318();
		local83.method1444(-562, -265);
		Static15.aClass2_2.method1318();
		local83.method1444(-128, -171);
		Static48.aClass2_10.method1318();
		local83.method1444(-562, -171);
		@Pc(154) int[] local154 = new int[local83.anInt2172];
		@Pc(160) int local160;
		@Pc(187) int local187;
		for (@Pc(156) int local156 = 0; local156 < local83.anInt2169; local156++) {
			for (local160 = 0; local160 < local83.anInt2172; local160++) {
				local154[local160] = local83.anIntArray237[local156 * local83.anInt2172 + local83.anInt2172 - local160 - 1];
			}
			for (local187 = 0; local187 < local83.anInt2172; local187++) {
				local83.anIntArray237[local187 + local156 * local83.anInt2172] = local154[local187];
			}
		}
		Static47.aClass2_9.method1318();
		local83.method1444(382, 0);
		Static113.aClass2_26.method1318();
		local83.method1444(-255, 0);
		Static37.aClass2_6.method1318();
		local83.method1444(254, 0);
		Static102.aClass2_22.method1318();
		local83.method1444(180, -371);
		Static110.aClass2_24.method1318();
		local83.method1444(180, -171);
		Static16.aClass2_3.method1318();
		local83.method1444(382, -265);
		Static57.aClass2_13.method1318();
		local83.method1444(-180, -265);
		Static15.aClass2_2.method1318();
		local83.method1444(254, -171);
		Static48.aClass2_10.method1318();
		local83.method1444(-180, -171);
		local83 = Static56.method965(Static89.aClass5_1045, Static88.aClass5_1020, arg1);
		Static37.aClass2_6.method1318();
		local83.method1437(382 - local83.anInt2172 / 2 - 128, 18);
		Static93.aClass3_Sub1_Sub2_Sub4_12 = Static85.method1369(arg1, Static32.aClass5_420, Static88.aClass5_1020);
		Static106.aClass3_Sub1_Sub2_Sub4_16 = Static85.method1369(arg1, Static106.aClass5_1236, Static88.aClass5_1020);
		Static96.aClass3_Sub1_Sub2_Sub4Array4 = Static80.method1296(arg1, Static88.aClass5_1020, Static18.aClass5_287);
		Static82.aClass3_Sub1_Sub2_Sub3_4 = new Class3_Sub1_Sub2_Sub3(128, 265);
		Static100.aClass3_Sub1_Sub2_Sub3_5 = new Class3_Sub1_Sub2_Sub3(128, 265);
		for (local160 = 0; local160 < 33920; local160++) {
			Static82.aClass3_Sub1_Sub2_Sub3_4.anIntArray237[local160] = Static47.aClass2_9.anIntArray228[local160];
		}
		for (local187 = 0; local187 < 33920; local187++) {
			Static100.aClass3_Sub1_Sub2_Sub3_5.anIntArray237[local187] = Static113.aClass2_26.anIntArray228[local187];
		}
		Static22.anIntArray90 = new int[256];
		for (@Pc(378) int local378 = 0; local378 < 64; local378++) {
			Static22.anIntArray90[local378] = local378 * 262144;
		}
		for (@Pc(394) int local394 = 0; local394 < 64; local394++) {
			Static22.anIntArray90[local394 + 64] = local394 * 1024 + 16711680;
		}
		for (@Pc(412) int local412 = 0; local412 < 64; local412++) {
			Static22.anIntArray90[local412 + 128] = local412 * 4 + 16776960;
		}
		for (@Pc(430) int local430 = 0; local430 < 64; local430++) {
			Static22.anIntArray90[local430 + 192] = 16777215;
		}
		Static32.anIntArray117 = new int[256];
		for (@Pc(449) int local449 = 0; local449 < 64; local449++) {
			Static32.anIntArray117[local449] = local449 * 1024;
		}
		for (@Pc(463) int local463 = 0; local463 < 64; local463++) {
			Static32.anIntArray117[local463 + 64] = local463 * 4 + 65280;
		}
		for (@Pc(481) int local481 = 0; local481 < 64; local481++) {
			Static32.anIntArray117[local481 + 128] = local481 * 262144 + 65535;
		}
		for (@Pc(506) int local506 = 0; local506 < 64; local506++) {
			Static32.anIntArray117[local506 + 192] = 16777215;
		}
		Static42.anIntArray141 = new int[256];
		for (@Pc(523) int local523 = 0; local523 < 64; local523++) {
			Static42.anIntArray141[local523] = local523 * 4;
		}
		for (@Pc(537) int local537 = 0; local537 < 64; local537++) {
			Static42.anIntArray141[local537 + 64] = local537 * 262144 + 255;
		}
		for (@Pc(555) int local555 = 0; local555 < 64; local555++) {
			Static42.anIntArray141[local555 + 128] = local555 * 1024 + 16711935;
		}
		for (@Pc(573) int local573 = 0; local573 < 64; local573++) {
			Static42.anIntArray141[local573 + 192] = 16777215;
		}
		Static42.anIntArray140 = new int[256];
		Static23.anIntArray92 = new int[32768];
		Static9.anIntArray51 = new int[32768];
		Static99.method1661(null);
		Static88.aClass5_1019 = Static88.aClass5_1020;
		Static91.anIntArray267 = new int[32768];
		Static11.anInt464 = 0;
		Static115.anIntArray381 = new int[32768];
		Static88.aClass5_1015 = Static88.aClass5_1020;
		if (Static68.anInt1575 == 0 || Static74.aBoolean91) {
			Static62.method1082();
		} else {
			Static62.method1081(Static68.anInt1575, Static57.aClass5_764, Static88.aClass5_1020, Static34.aClass11_Sub1_34);
		}
		Static105.method1750(false);
		Static103.aBoolean143 = true;
		Static27.aBoolean42 = true;
	}

	@OriginalMember(owner = "client!gd", name = "f", descriptor = "(I)V")
	public static void method1794() {
		aClass5_1258 = null;
		aClass5_1259 = null;
		aClass5_1260 = null;
		anIntArray320 = null;
		aBooleanArray21 = null;
	}
}
