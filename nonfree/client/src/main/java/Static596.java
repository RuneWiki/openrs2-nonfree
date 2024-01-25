import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static596 {

	@OriginalMember(owner = "client!vea", name = "g", descriptor = "I")
	public static int anInt9746;

	@OriginalMember(owner = "client!vea", name = "l", descriptor = "I")
	public static int anInt9751;

	@OriginalMember(owner = "client!vea", name = "s", descriptor = "I")
	public static int anInt9756;

	@OriginalMember(owner = "client!vea", name = "v", descriptor = "I")
	public static int anInt9759;

	@OriginalMember(owner = "client!vea", name = "d", descriptor = "I")
	public static int anInt9743 = 13156520;

	@OriginalMember(owner = "client!vea", name = "u", descriptor = "I")
	public static int anInt9758 = 0;

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(BII)V")
	public static void method8349(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static110.aFloat80 > Static110.aFloat79) {
			Static110.aFloat79 = (float) ((double) Static110.aFloat79 + (double) Static110.aFloat79 / 30.0D);
			if (Static110.aFloat79 > Static110.aFloat80) {
				Static110.aFloat79 = Static110.aFloat80;
			}
			Static509.method7605();
			Static110.anInt3009 = (int) Static110.aFloat79 >> 1;
			Static110.aByteArrayArrayArray15 = Static327.method5316(Static110.anInt3009);
		} else if (Static110.aFloat80 < Static110.aFloat79) {
			Static110.aFloat79 = (float) ((double) Static110.aFloat79 - (double) Static110.aFloat79 / 30.0D);
			if (Static110.aFloat80 > Static110.aFloat79) {
				Static110.aFloat79 = Static110.aFloat80;
			}
			Static509.method7605();
			Static110.anInt3009 = (int) Static110.aFloat79 >> 1;
			Static110.aByteArrayArrayArray15 = Static327.method5316(Static110.anInt3009);
		}
		if (Static380.anInt7101 != -1 && Static632.anInt10105 != -1) {
			@Pc(81) int local81 = Static380.anInt7101 - Static365.anInt6941;
			if (local81 < 2 || local81 > 2) {
				local81 /= 8;
			}
			@Pc(96) int local96 = Static632.anInt10105 - Static561.anInt9391;
			if (local96 < 2 || local96 > 2) {
				local96 /= 8;
			}
			Static365.anInt6941 += local81;
			Static561.anInt9391 += local96;
			if (local81 == 0 && local96 == 0) {
				Static380.anInt7101 = -1;
				Static632.anInt10105 = -1;
			}
			Static509.method7605();
		}
		if (Static238.anInt4463 > 0) {
			Static165.anInt3234--;
			if (Static165.anInt3234 == 0) {
				Static238.anInt4463--;
				Static165.anInt3234 = 100;
			}
		} else {
			Static619.anInt10018 = -1;
			Static109.anInt2368 = -1;
		}
		if (!Static362.aBoolean497 || Static566.aClass223_60 == null) {
			return;
		}
		for (@Pc(155) Class3_Sub33 local155 = (Class3_Sub33) Static566.aClass223_60.method5874(); local155 != null; local155 = (Class3_Sub33) Static566.aClass223_60.method5870()) {
			@Pc(164) Class36 local164 = Static110.aClass335_4.method8125(local155.aClass3_Sub49_1.anInt9434);
			if (local155.method4612(arg0, arg1)) {
				if (local164.aStringArray1 != null) {
					if (local164.aStringArray1[4] != null) {
						Static582.method8234(local164.aStringArray1[4], true, 0, false, local164.aString4, local164.anInt1351, (long) local155.aClass3_Sub49_1.anInt9434, -1, (long) local155.aClass3_Sub49_1.anInt9434, 1010, -1, false);
					}
					if (local164.aStringArray1[3] != null) {
						Static582.method8234(local164.aStringArray1[3], true, 0, false, local164.aString4, local164.anInt1351, (long) local155.aClass3_Sub49_1.anInt9434, -1, (long) local155.aClass3_Sub49_1.anInt9434, 1007, -1, false);
					}
					if (local164.aStringArray1[2] != null) {
						Static582.method8234(local164.aStringArray1[2], true, 0, false, local164.aString4, local164.anInt1351, (long) local155.aClass3_Sub49_1.anInt9434, -1, (long) local155.aClass3_Sub49_1.anInt9434, 1001, -1, false);
					}
					if (local164.aStringArray1[1] != null) {
						Static582.method8234(local164.aStringArray1[1], true, 0, false, local164.aString4, local164.anInt1351, (long) local155.aClass3_Sub49_1.anInt9434, -1, (long) local155.aClass3_Sub49_1.anInt9434, 1008, -1, false);
					}
					if (local164.aStringArray1[0] != null) {
						Static582.method8234(local164.aStringArray1[0], true, 0, false, local164.aString4, local164.anInt1351, (long) local155.aClass3_Sub49_1.anInt9434, -1, (long) local155.aClass3_Sub49_1.anInt9434, 1006, -1, false);
					}
				}
				if (!local155.aClass3_Sub49_1.aBoolean675) {
					local155.aClass3_Sub49_1.aBoolean675 = true;
					Static304.method4842(Static555.aClass311_13, local155.aClass3_Sub49_1.anInt9434, local164.anInt1351);
				}
				if (local155.aClass3_Sub49_1.aBoolean675) {
					Static304.method4842(Static638.aClass311_15, local155.aClass3_Sub49_1.anInt9434, local164.anInt1351);
				}
			} else if (local155.aClass3_Sub49_1.aBoolean675) {
				local155.aClass3_Sub49_1.aBoolean675 = false;
				Static304.method4842(Static401.aClass311_9, local155.aClass3_Sub49_1.anInt9434, local164.anInt1351);
			}
		}
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(BLclient!sl;)Lclient!dw;")
	public static Class6_Sub3 method8352(@OriginalArg(1) Class3_Sub3 arg0) {
		@Pc(7) Class6 local7 = Static10.method672(arg0);
		@Pc(19) int local19 = arg0.method4207();
		@Pc(23) int local23 = arg0.method4207();
		return new Class6_Sub3(local7.aClass83_8, local7.aClass50_7, local7.anInt2442, local7.anInt2443, local7.anInt2440, local7.anInt2436, local7.anInt2437, local7.anInt2439, local7.anInt2444, local19, local23);
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(Lclient!eg;I)Lclient!eg;")
	public static Class3_Sub7_Sub2 method8353(@OriginalArg(0) Class3_Sub7_Sub2 arg0) {
		@Pc(19) Class3_Sub7_Sub2 local19 = arg0 == null ? new Class3_Sub7_Sub2() : new Class3_Sub7_Sub2(arg0);
		local19.method2471();
		return local19;
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(III)Z")
	public static boolean method8354(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(ILclient!ha;)V")
	public static void method8355(@OriginalArg(1) Class5 arg0) {
		if (Static43.aClass223_6.method5866() == 0) {
			return;
		}
		@Pc(26) Class3_Sub50 local26;
		if (Static262.aClass3_Sub27_12.aClass21_Sub1_1.method1025() == 0) {
			for (local26 = (Class3_Sub50) Static43.aClass223_6.method5874(); local26 != null; local26 = (Class3_Sub50) Static43.aClass223_6.method5870()) {
				Static320.aClass53_2.method1774(Static557.aClass62_12, local26.anInt9621, local26.anInt9615, local26.anInt9622, local26.anInt9617, local26.aBoolean691 ? Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.aClass178_1 : null, arg0, arg0, false, local26.anInt9619, false);
				local26.method8769();
			}
			Static40.method1343();
			return;
		}
		if (Static71.aClass5_17 == null) {
			@Pc(76) Canvas local76 = new Canvas();
			local76.setSize(36, 32);
			Static71.aClass5_17 = Static109.method2235(0, 0, Static56.aClass196_17, local76, Static473.anInterface7_14);
			Static292.aClass62_10 = Static71.aClass5_17.method7515(Static218.method3657(Static429.aClass196_84, Static336.anInt6308), Static645.method2767(Static474.aClass196_98, Static336.anInt6308));
		}
		for (local26 = (Class3_Sub50) Static43.aClass223_6.method5874(); local26 != null; local26 = (Class3_Sub50) Static43.aClass223_6.method5870()) {
			Static320.aClass53_2.method1774(Static292.aClass62_10, local26.anInt9621, local26.anInt9615, local26.anInt9622, local26.anInt9617, local26.aBoolean691 ? Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.aClass178_1 : null, Static71.aClass5_17, arg0, false, local26.anInt9619, false);
			local26.method8769();
		}
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(IBI)V")
	public static void method8356(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static219.method3673(arg1)) {
			Static112.method2305(arg0, Static92.aClass279ArrayArray1[arg1]);
		}
	}

	@OriginalMember(owner = "client!vea", name = "b", descriptor = "(II)Lclient!nca;")
	public static Class228 method8357(@OriginalArg(0) int arg0) {
		@Pc(13) Class228[] local13 = Static330.method5392();
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			@Pc(21) Class228 local21 = local13[local15];
			if (arg0 == local21.anInt6952) {
				return local21;
			}
		}
		return null;
	}
}
