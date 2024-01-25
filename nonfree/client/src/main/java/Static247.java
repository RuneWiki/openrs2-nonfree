import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static247 {

	@OriginalMember(owner = "client!ok", name = "h", descriptor = "[I")
	public static int[] anIntArray395;

	@OriginalMember(owner = "client!ok", name = "c", descriptor = "Lclient!sd;")
	public static final Class208 aClass208_136 = new Class208(34, 12);

	@OriginalMember(owner = "client!ok", name = "d", descriptor = "Lclient!tl;")
	public static final Class2_Sub37 aClass2_Sub37_1 = new Class2_Sub37(0, 0);

	@OriginalMember(owner = "client!ok", name = "e", descriptor = "Lclient!ss;")
	public static final Class213 aClass213_11 = new Class213(3, 14);

	@OriginalMember(owner = "client!ok", name = "g", descriptor = "Lclient!pn;")
	public static final Class183 aClass183_73 = new Class183(61, 2);

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(BI)V")
	public static void method4312(@OriginalArg(0) byte arg0) {
		if (Static116.aByteArrayArrayArray2 == null) {
			Static116.aByteArrayArrayArray2 = new byte[4][Static89.anInt1891][Static85.anInt1839];
		}
		for (@Pc(14) int local14 = 0; local14 < 4; local14++) {
			for (@Pc(18) int local18 = 0; local18 < Static89.anInt1891; local18++) {
				for (@Pc(22) int local22 = 0; local22 < Static85.anInt1839; local22++) {
					Static116.aByteArrayArrayArray2[local14][local18][local22] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(ZLclient!oj;)V")
	public static void method4313(@OriginalArg(1) Class48 arg0) {
		@Pc(7) int local7 = Static30.anInt453;
		@Pc(9) int local9 = Static92.anInt1974;
		@Pc(11) int local11 = Static392.anInt7142;
		@Pc(15) int local15 = Static10.anInt6517 - 3;
		if (Static76.aClass27_9 == null || Static65.aClass27_6 == null) {
			if (Static324.aClass83_116.method1958(Static212.anInt4289) && Static324.aClass83_116.method1958(Static159.anInt3286)) {
				Static76.aClass27_9 = arg0.method2527(Static399.method3370(Static324.aClass83_116, Static212.anInt4289, 0));
				@Pc(49) Class128 local49 = Static399.method3370(Static324.aClass83_116, Static159.anInt3286, 0);
				Static65.aClass27_6 = arg0.method2527(local49);
				local49.method3378();
				Static350.aClass27_22 = arg0.method2527(local49);
			} else {
				arg0.method2470(local7, local9, local11, 20, 255 - Static240.anInt4746 << 24 | Static336.anInt6211, 1);
			}
		}
		@Pc(95) int local95;
		@Pc(93) int local93;
		if (Static76.aClass27_9 != null && Static65.aClass27_6 != null) {
			local93 = (local11 - Static65.aClass27_6.method5320() * 2) / Static76.aClass27_9.method5320();
			for (local95 = 0; local95 < local93; local95++) {
				Static76.aClass27_9.method5318(Static65.aClass27_6.method5320() + local7 + local95 * Static76.aClass27_9.method5320(), local9);
			}
			Static65.aClass27_6.method5318(local7, local9);
			Static350.aClass27_22.method5318(local7 + local11 - Static350.aClass27_22.method5320(), local9);
		}
		Static180.aClass44_4.method4652(-1, local9 + 14, local7 - -3, Static279.anInt5189 | 0xFF000000, Static148.aClass62_108.method1389(Static200.anInt4144));
		arg0.method2470(local7, local9 + 20, local11, local15 - 20, -Static240.anInt4746 + 255 << 24 | Static336.anInt6211, 1);
		local93 = Static136.aClass91_2.method5223();
		local95 = Static136.aClass91_2.method5224();
		@Pc(174) int local174 = 0;
		@Pc(197) int local197;
		for (@Pc(179) Class2_Sub43 local179 = (Class2_Sub43) Static262.aClass238_29.method5795(); local179 != null; local179 = (Class2_Sub43) Static262.aClass238_29.method5799()) {
			local197 = local9 + (-local174 + -1 + Static233.anInt4642) * 16 + 33;
			local174++;
			if (local7 < local93 && local7 + local11 > local93 && local95 > local197 - 13 && local95 < local197 + 4 && local179.aBoolean509) {
				arg0.method2470(local7, local197 - 12, local11, 16, Static94.anInt2020 | 255 - Static167.anInt3449 << 24, 1);
			}
		}
		if ((Static51.aClass27_2 == null || Static137.aClass27_4 == null || Static248.aClass27_20 == null) && Static324.aClass83_116.method1958(Static276.anInt7134) && Static324.aClass83_116.method1958(Static251.anInt4861) && Static324.aClass83_116.method1958(Static33.anInt215)) {
			@Pc(285) Class128 local285 = Static399.method3370(Static324.aClass83_116, Static251.anInt4861, 0);
			Static137.aClass27_4 = arg0.method2527(local285);
			local285.method3378();
			Static152.aClass27_18 = arg0.method2527(local285);
			Static51.aClass27_2 = arg0.method2527(Static399.method3370(Static324.aClass83_116, Static276.anInt7134, 0));
			@Pc(310) Class128 local310 = Static399.method3370(Static324.aClass83_116, Static33.anInt215, 0);
			Static248.aClass27_20 = arg0.method2527(local310);
			local310.method3378();
			Static24.aClass27_1 = arg0.method2527(local310);
		}
		local174 = 0;
		@Pc(383) int local383;
		@Pc(343) int local343;
		if (Static51.aClass27_2 != null && Static137.aClass27_4 != null && Static248.aClass27_20 != null) {
			local197 = (local11 - Static248.aClass27_20.method5320() * 2) / Static51.aClass27_2.method5320();
			for (local343 = 0; local343 < local197; local343++) {
				Static51.aClass27_2.method5318(Static248.aClass27_20.method5320() + local7 + Static51.aClass27_2.method5320() * local343, local15 + (local9 - Static51.aClass27_2.method5327()));
			}
			local383 = (local15 - Static248.aClass27_20.method5327() - 20) / Static137.aClass27_4.method5327();
			for (@Pc(385) int local385 = 0; local385 < local383; local385++) {
				Static137.aClass27_4.method5318(local7, local385 * Static137.aClass27_4.method5327() + local9 + 20);
				Static152.aClass27_18.method5318(local7 + local11 - Static152.aClass27_18.method5320(), local385 * Static137.aClass27_4.method5327() + local9 - -20);
			}
			Static248.aClass27_20.method5318(local7, local15 + local9 - Static248.aClass27_20.method5327());
			Static24.aClass27_1.method5318(local11 + local7 - Static248.aClass27_20.method5320(), local9 - (-local15 - -Static248.aClass27_20.method5327()));
		}
		for (@Pc(455) Class2_Sub43 local455 = (Class2_Sub43) Static262.aClass238_29.method5795(); local455 != null; local455 = (Class2_Sub43) Static262.aClass238_29.method5799()) {
			local343 = (Static233.anInt4642 - local174 - 1) * 16 + local9 + 20 + 13;
			local383 = Static279.anInt5189 | 0xFF000000;
			if (local7 < local93 && local93 < local7 + local11 && local343 - 13 < local95 && local95 < local343 + 4 && local455.aBoolean509) {
				local383 = Static373.anInt6859 | 0xFF000000;
			}
			@Pc(512) int[] local512 = null;
			if (Static102.method1833(local455.anInt7126)) {
				local512 = Static57.aClass196_1.method4827((int) local455.aLong212).anIntArray314;
			} else if (local455.anInt7124 != -1) {
				local512 = Static57.aClass196_1.method4827(local455.anInt7124).anIntArray314;
			} else if (Static379.method5976(local455.anInt7126)) {
				@Pc(541) Class1_Sub2_Sub1_Sub2 local541 = Static223.aClass1_Sub2_Sub1_Sub2Array1[(int) local455.aLong212];
				if (local541 != null) {
					@Pc(546) Class197 local546 = local541.aClass197_1;
					if (local546.anIntArray468 != null) {
						local546 = local546.method4832(Static179.aClass115_1);
					}
					if (local546 != null) {
						local512 = local546.anIntArray467;
					}
				}
			} else if (Static54.method845(local455.anInt7126)) {
				@Pc(582) Class47 local582;
				if (local455.anInt7126 == 1004) {
					local582 = Static230.aClass96_4.method2303((int) local455.aLong212);
				} else {
					local582 = Static230.aClass96_4.method2303((int) (local455.aLong212 >>> 32 & 0x7FFFFFFFL));
				}
				if (local582.anIntArray95 != null) {
					local582 = local582.method903(Static179.aClass115_1);
				}
				if (local582 != null) {
					local512 = local582.anIntArray93;
				}
			}
			@Pc(615) String local615 = Static264.method3357(local455);
			if (local512 != null) {
				local615 = local615 + Static350.method5582(local512);
			}
			Static180.aClass44_4.method4658(Static315.aClass27Array51, local615, local383, local7 + 3, local343, Static2.anIntArray588);
			if (local455.aBoolean510) {
				Static62.aClass27_19.method5318(Static121.aClass24_10.method325(local615) + local7 + 5, local343 + -12);
			}
			local174++;
		}
		Static108.method1962(Static392.anInt7142, Static92.anInt1974, Static10.anInt6517, Static30.anInt453);
	}
}
