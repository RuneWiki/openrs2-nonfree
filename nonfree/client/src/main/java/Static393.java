import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static393 {

	@OriginalMember(owner = "client!tp", name = "j", descriptor = "[Lclient!nl;")
	public static final Class178[] aClass178Array1 = new Class178[8];

	@OriginalMember(owner = "client!tp", name = "k", descriptor = "Lclient!dw;")
	public static final Class65 aClass65_10 = new Class65("", 10);

	@OriginalMember(owner = "client!tp", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString62 = null;

	@OriginalMember(owner = "client!tp", name = "m", descriptor = "Lclient!jc;")
	public static final Class126 aClass126_12 = new Class126(6, 16);

	@OriginalMember(owner = "client!tp", name = "b", descriptor = "(I)V")
	public static void method5439() {
		Static76.method1407(Static12.aClass34_Sub1_1.anInt7165);
		@Pc(15) int local15 = (Static278.anInt5374 >> 3) + (Static378.anInt6885 >> 10);
		Static426.anInt1486 = Static429.aClass30_Sub1_Sub1_Sub2_2.aByte102 = 0;
		@Pc(28) int local28 = (Static78.anInt1973 >> 10) + (Static380.anInt6896 >> 3);
		Static429.aClass30_Sub1_Sub1_Sub2_2.method958(8, 8);
		Static257.anIntArray473 = new int[18];
		Static106.aByteArrayArray8 = new byte[18][];
		Static299.aByteArrayArray5 = new byte[18][];
		Static237.aByteArrayArray15 = new byte[18][];
		Static155.anIntArray345 = new int[18];
		Static135.anIntArray311 = new int[18];
		Static168.anIntArray147 = new int[18];
		Static243.anIntArray443 = new int[18];
		Static337.anIntArrayArray48 = new int[18][4];
		Static339.aByteArrayArray20 = new byte[18][];
		Static225.anIntArray431 = new int[18];
		Static311.aByteArrayArray18 = new byte[18][];
		@Pc(80) int local80 = 0;
		@Pc(98) int local98;
		for (@Pc(89) int local89 = (local15 - (Static209.anInt4283 >> 4)) / 8; local89 <= ((Static209.anInt4283 >> 4) + local15) / 8; local89++) {
			for (local98 = (local28 - (Static211.anInt4295 >> 4)) / 8; local98 <= ((Static211.anInt4295 >> 4) + local28) / 8; local98++) {
				@Pc(105) int local105 = (local89 << 8) + local98;
				Static168.anIntArray147[local80] = local105;
				Static155.anIntArray345[local80] = Static136.aClass211_36.method4759("m" + local89 + "_" + local98);
				Static257.anIntArray473[local80] = Static136.aClass211_36.method4759("l" + local89 + "_" + local98);
				Static225.anIntArray431[local80] = Static136.aClass211_36.method4759("n" + local89 + "_" + local98);
				Static243.anIntArray443[local80] = Static136.aClass211_36.method4759("um" + local89 + "_" + local98);
				Static135.anIntArray311[local80] = Static136.aClass211_36.method4759("ul" + local89 + "_" + local98);
				if (Static225.anIntArray431[local80] == -1) {
					Static155.anIntArray345[local80] = -1;
					Static257.anIntArray473[local80] = -1;
					Static243.anIntArray443[local80] = -1;
					Static135.anIntArray311[local80] = -1;
				}
				local80++;
			}
		}
		for (local98 = local80; local98 < Static225.anIntArray431.length; local98++) {
			Static225.anIntArray431[local98] = -1;
			Static155.anIntArray345[local98] = -1;
			Static257.anIntArray473[local98] = -1;
			Static243.anIntArray443[local98] = -1;
			Static135.anIntArray311[local98] = -1;
		}
		@Pc(283) byte local283;
		if (Static170.anInt3494 == 1 || Static170.anInt3494 == 2) {
			local283 = 3;
		} else {
			local283 = 7;
		}
		Static149.method2372(local283, false, local28, local15);
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(IJ)V")
	public static void method5440(@OriginalArg(1) long arg0) {
		if (Static67.aClass252ArrayArrayArray2 != null) {
			if (Static21.anInt6762 == 1 || Static21.anInt6762 == 5) {
				Static243.method3643(arg0);
			} else if (Static21.anInt6762 == 4) {
				Static32.method675(arg0);
			}
		}
		Static296.method4296((long) Static187.anInt3975, Static30.aClass106_3);
		if (Static456.anInt1594 != -1) {
			Static117.method1922(Static456.anInt1594);
		}
		for (@Pc(41) int local41 = 0; local41 < Static316.anInt5918; local41++) {
			if (Static58.aBooleanArray8[local41]) {
				Static55.aBooleanArray7[local41] = true;
			}
			Static69.aBooleanArray10[local41] = Static58.aBooleanArray8[local41];
			Static58.aBooleanArray8[local41] = false;
		}
		Static124.anInt2755 = Static187.anInt3975;
		if (Static30.aClass106_3.method5975()) {
			Static456.aBoolean105 = true;
		}
		if (Static456.anInt1594 != -1) {
			Static316.anInt5918 = 0;
			Static421.method5713();
		}
		Static30.aClass106_3.va();
		method5442(Static30.aClass106_3);
		@Pc(91) int local91 = Static188.method3083();
		if (local91 == -1) {
			local91 = Static49.anInt1209;
		}
		if (local91 == -1) {
			local91 = Static19.anInt523;
		}
		Static78.method1441(local91);
		Static253.method3768(Static429.aClass30_Sub1_Sub1_Sub2_2.anInt7488, Static234.anInt4630, Static429.aClass30_Sub1_Sub1_Sub2_2.aByte102, Static429.aClass30_Sub1_Sub1_Sub2_2.anInt7490);
		Static234.anInt4630 = 0;
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method5441(@OriginalArg(0) String arg0) {
		if (!arg0.equals("")) {
			Static32.method677(Static434.aClass177_106);
			Static433.aClass1_Sub3_Sub1_11.method1208(Static146.method2347(arg0));
			Static433.aClass1_Sub3_Sub1_11.method1190(arg0);
		}
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(Lclient!za;Z)V")
	public static void method5442(@OriginalArg(0) Class106 arg0) {
		if (Static96.aBoolean151) {
			Static47.method5364(arg0);
		} else {
			Static233.method3558(arg0);
		}
	}
}
