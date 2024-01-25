import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static498 {

	@OriginalMember(owner = "client!qo", name = "s", descriptor = "I")
	public static int anInt10142;

	@OriginalMember(owner = "client!qo", name = "u", descriptor = "I")
	public static int anInt10143;

	@OriginalMember(owner = "client!qo", name = "v", descriptor = "I")
	public static int anInt10144;

	@OriginalMember(owner = "client!qo", name = "q", descriptor = "I")
	public static int anInt10141 = -2;

	@OriginalMember(owner = "client!qo", name = "r", descriptor = "Lclient!mga;")
	public static final Class218 aClass218_151 = new Class218(66, 3);

	@OriginalMember(owner = "client!qo", name = "t", descriptor = "Z")
	public static boolean aBoolean768 = false;

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(ZIILjava/lang/String;I)V")
	public static void method8887(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class260 local8 = Static245.method4101(arg1, arg0);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray9 != null) {
			@Pc(18) Class3_Sub17 local18 = new Class3_Sub17();
			local18.anInt1769 = arg3;
			local18.aClass260_6 = local8;
			local18.aString15 = arg2;
			local18.anObjectArray2 = local8.anObjectArray9;
			Static565.method8015(local18);
		}
		if (Static406.anInt6454 != 10 || !Static79.method1526(local8).method7070(arg3 - 1)) {
			return;
		}
		@Pc(65) Class3_Sub34 local65;
		if (arg3 == 1) {
			local65 = Static172.method3123(Static163.aClass375_1, Static649.aClass218_153);
			Static615.method8698(local8.anInt6964, arg1, local65, arg0);
			Static441.method6275(local65);
		}
		if (arg3 == 2) {
			local65 = Static172.method3123(Static163.aClass375_1, Static577.aClass218_159);
			Static615.method8698(local8.anInt6964, arg1, local65, arg0);
			Static441.method6275(local65);
		}
		if (arg3 == 3) {
			local65 = Static172.method3123(Static163.aClass375_1, Static425.aClass218_103);
			Static615.method8698(local8.anInt6964, arg1, local65, arg0);
			Static441.method6275(local65);
		}
		if (arg3 == 4) {
			local65 = Static172.method3123(Static163.aClass375_1, Static327.aClass218_79);
			Static615.method8698(local8.anInt6964, arg1, local65, arg0);
			Static441.method6275(local65);
		}
		if (arg3 == 5) {
			local65 = Static172.method3123(Static163.aClass375_1, Static190.aClass218_51);
			Static615.method8698(local8.anInt6964, arg1, local65, arg0);
			Static441.method6275(local65);
		}
		if (arg3 == 6) {
			local65 = Static172.method3123(Static163.aClass375_1, Static549.aClass218_130);
			Static615.method8698(local8.anInt6964, arg1, local65, arg0);
			Static441.method6275(local65);
		}
		if (arg3 == 7) {
			local65 = Static172.method3123(Static163.aClass375_1, Static205.aClass218_56);
			Static615.method8698(local8.anInt6964, arg1, local65, arg0);
			Static441.method6275(local65);
		}
		if (arg3 == 8) {
			local65 = Static172.method3123(Static163.aClass375_1, Static394.aClass218_92);
			Static615.method8698(local8.anInt6964, arg1, local65, arg0);
			Static441.method6275(local65);
		}
		if (arg3 == 9) {
			local65 = Static172.method3123(Static163.aClass375_1, Static330.aClass218_81);
			Static615.method8698(local8.anInt6964, arg1, local65, arg0);
			Static441.method6275(local65);
		}
		if (arg3 == 10) {
			local65 = Static172.method3123(Static163.aClass375_1, Static159.aClass218_40);
			Static615.method8698(local8.anInt6964, arg1, local65, arg0);
			Static441.method6275(local65);
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lclient!qn;Lclient!jp;BI)V")
	public static void method8889(@OriginalArg(0) Class291 arg0, @OriginalArg(1) Class3_Sub25 arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class3_Sub21 local9 = new Class3_Sub21();
		local9.anInt2595 = arg1.method8632();
		local9.anInt2594 = arg1.method8618();
		local9.anIntArray223 = new int[local9.anInt2595];
		local9.aClass81Array1 = new Class81[local9.anInt2595];
		local9.anIntArray221 = new int[local9.anInt2595];
		local9.aByteArrayArrayArray15 = new byte[local9.anInt2595][][];
		local9.aClass81Array2 = new Class81[local9.anInt2595];
		local9.anIntArray222 = new int[local9.anInt2595];
		for (@Pc(51) int local51 = 0; local51 < local9.anInt2595; local51++) {
			try {
				@Pc(57) int local57 = arg1.method8632();
				@Pc(80) String local80;
				@Pc(84) String local84;
				@Pc(88) int local88;
				if (local57 == 0 || local57 == 1 || local57 == 2) {
					local80 = arg1.method8613();
					local84 = arg1.method8613();
					local88 = 0;
					if (local57 == 1) {
						local88 = arg1.method8618();
					}
					local9.anIntArray222[local51] = local57;
					local9.anIntArray223[local51] = local88;
					local9.aClass81Array1[local51] = arg0.method7124(Static243.method7722(local80), local84);
				} else if (local57 == 3 || local57 == 4) {
					local80 = arg1.method8613();
					local84 = arg1.method8613();
					local88 = arg1.method8632();
					@Pc(91) String[] local91 = new String[local88];
					for (@Pc(93) int local93 = 0; local93 < local88; local93++) {
						local91[local93] = arg1.method8613();
					}
					@Pc(108) byte[][] local108 = new byte[local88][];
					@Pc(119) int local119;
					if (local57 == 3) {
						for (@Pc(113) int local113 = 0; local113 < local88; local113++) {
							local119 = arg1.method8618();
							local108[local113] = new byte[local119];
							arg1.method8623(0, local119, local108[local113]);
						}
					}
					local9.anIntArray222[local51] = local57;
					@Pc(144) Class[] local144 = new Class[local88];
					for (local119 = 0; local119 < local88; local119++) {
						local144[local119] = Static243.method7722(local91[local119]);
					}
					local9.aClass81Array2[local51] = arg0.method7138(local84, local144, Static243.method7722(local80));
					local9.aByteArrayArrayArray15[local51] = local108;
				}
			} catch (@Pc(225) ClassNotFoundException local225) {
				local9.anIntArray221[local51] = -1;
			} catch (@Pc(232) SecurityException local232) {
				local9.anIntArray221[local51] = -2;
			} catch (@Pc(239) NullPointerException local239) {
				local9.anIntArray221[local51] = -3;
			} catch (@Pc(246) Exception local246) {
				local9.anIntArray221[local51] = -4;
			} catch (@Pc(253) Throwable local253) {
				local9.anIntArray221[local51] = -5;
			}
		}
		Static274.aClass338_121.method8171(local9);
	}

	@OriginalMember(owner = "client!qo", name = "d", descriptor = "(B)Z")
	public static boolean method8890() {
		try {
			return Static648.method8988();
		} catch (@Pc(17) IOException local17) {
			Static663.method9152();
			return true;
		} catch (@Pc(22) Exception local22) {
			@Pc(80) String local80 = "T2 - " + (Static175.aClass180_68 == null ? -1 : Static175.aClass180_68.method4564()) + "," + (Static345.aClass180_125 == null ? -1 : Static345.aClass180_125.method4564()) + "," + (Static254.aClass180_101 == null ? -1 : Static254.aClass180_101.method4564()) + " - " + Static467.anInt7682 + "," + (Static287.anInt4910 + Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.anIntArray956[0]) + "," + (Static72.anInt1361 + Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.anIntArray955[0]) + " - ";
			for (@Pc(82) int local82 = 0; local82 < Static467.anInt7682 && local82 < 50; local82++) {
				local80 = local80 + Static210.aClass3_Sub25_Sub1_3.aByteArray106[local82] + ",";
			}
			Static503.method7153(local80, local22);
			Static67.method1352(false);
			return true;
		}
	}
}
