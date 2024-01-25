import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static283 {

	@OriginalMember(owner = "client!lq", name = "t", descriptor = "F")
	public static float aFloat106;

	@OriginalMember(owner = "client!lq", name = "z", descriptor = "[S")
	public static short[] aShortArray93;

	@OriginalMember(owner = "client!lq", name = "n", descriptor = "Lclient!im;")
	public static final Class140 aClass140_78 = new Class140(15, 8);

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(I)Z")
	public static boolean method4573() {
		try {
			return Static447.method6376();
		} catch (@Pc(14) IOException local14) {
			Static214.method1853();
			return true;
		} catch (@Pc(19) Exception local19) {
			@Pc(77) String local77 = "T2 - " + (Static193.aClass140_112 == null ? -1 : Static193.aClass140_112.method3563()) + "," + (Static544.aClass140_152 == null ? -1 : Static544.aClass140_152.method3563()) + "," + (Static320.aClass140_86 == null ? -1 : Static320.aClass140_86.method3563()) + " - " + Static405.anInt9105 + "," + (Static470.anInt7897 + Static63.aClass49_Sub2_Sub2_Sub1_1.anIntArray428[0]) + "," + (Static63.aClass49_Sub2_Sub2_Sub1_1.anIntArray427[0] + Static534.anInt9007) + " - ";
			for (@Pc(79) int local79 = 0; Static405.anInt9105 > local79 && local79 < 50; local79++) {
				local77 = local77 + Static97.aClass1_Sub6_Sub2_1.aByteArray66[local79] + ",";
			}
			Static234.method4051(local19, local77);
			Static123.method2107(false);
			return true;
		}
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lclient!qa;I)V")
	public static void method4574(@OriginalArg(0) Class122 arg0) {
		@Pc(7) int local7 = Static13.anInt305;
		@Pc(15) int local15 = Static188.anInt3359;
		@Pc(17) int local17 = Static541.anInt9145;
		@Pc(21) int local21 = Static260.anInt5040 - 3;
		if (Static114.aClass2_13 == null || Static457.aClass2_45 == null) {
			if (Static543.aClass171_154.method4327(Static437.anInt7563) && Static543.aClass171_154.method4327(Static292.anInt8891)) {
				Static114.aClass2_13 = arg0.method7220(Static552.method3541(Static543.aClass171_154, Static437.anInt7563, 0));
				@Pc(50) Class136 local50 = Static552.method3541(Static543.aClass171_154, Static292.anInt8891, 0);
				Static457.aClass2_45 = arg0.method7220(local50);
				local50.method3550();
				Static350.aClass2_36 = arg0.method7220(local50);
			} else {
				arg0.f(local7, local15, local17, 20, 255 - Static208.anInt4064 << 24 | Static410.anInt7286, 1);
			}
		}
		@Pc(96) int local96;
		@Pc(94) int local94;
		if (Static114.aClass2_13 != null && Static457.aClass2_45 != null) {
			local94 = (local17 - Static457.aClass2_45.c() * 2) / Static114.aClass2_13.c();
			for (local96 = 0; local96 < local94; local96++) {
				Static114.aClass2_13.method7364(local7 + Static457.aClass2_45.c() + local96 * Static114.aClass2_13.c(), local15);
			}
			Static457.aClass2_45.method7364(local7, local15);
			Static350.aClass2_36.method7364(local17 + local7 - Static350.aClass2_36.c(), local15);
		}
		Static296.aClass67_9.method7498(-1, Static179.aClass306_39.method7165(Static179.anInt3168), Static193.anInt7227 | 0xFF000000, local15 + 14, local7 - -3);
		arg0.f(local7, local15 + 20, local17, local21 - 20, Static410.anInt7286 | -Static208.anInt4064 + 255 << 24, 1);
		local94 = Static498.aClass5_1.method7052();
		local96 = Static498.aClass5_1.method7042();
		@Pc(180) int local180 = 0;
		@Pc(202) int local202;
		for (@Pc(185) Class1_Sub24 local185 = (Class1_Sub24) Static248.aClass37_30.method977(); local185 != null; local185 = (Class1_Sub24) Static248.aClass37_30.method971()) {
			local202 = (Static16.anInt415 - local180 - 1) * 16 + local15 + 20 + 13;
			if (local94 > local7 && local94 < local7 + local17 && local202 - 13 < local96 && local96 < local202 + 4 && local185.aBoolean218) {
				arg0.f(local7, local202 - 12, local17, 16, Static392.anInt7065 | 255 - Static517.anInt8701 << 24, 1);
			}
			local180++;
		}
		if ((Static113.aClass2_12 == null || Static266.aClass2_50 == null || Static133.aClass2_16 == null) && Static543.aClass171_154.method4327(Static511.anInt8620) && Static543.aClass171_154.method4327(Static129.anInt2570) && Static543.aClass171_154.method4327(Static97.anInt1966)) {
			@Pc(282) Class136 local282 = Static552.method3541(Static543.aClass171_154, Static129.anInt2570, 0);
			Static266.aClass2_50 = arg0.method7220(local282);
			local282.method3550();
			Static357.aClass2_37 = arg0.method7220(local282);
			Static113.aClass2_12 = arg0.method7220(Static552.method3541(Static543.aClass171_154, Static511.anInt8620, 0));
			@Pc(307) Class136 local307 = Static552.method3541(Static543.aClass171_154, Static97.anInt1966, 0);
			Static133.aClass2_16 = arg0.method7220(local307);
			local307.method3550();
			Static545.aClass2_51 = arg0.method7220(local307);
		}
		local180 = 0;
		@Pc(380) int local380;
		@Pc(340) int local340;
		if (Static113.aClass2_12 != null && Static266.aClass2_50 != null && Static133.aClass2_16 != null) {
			local202 = (local17 - Static133.aClass2_16.c() * 2) / Static113.aClass2_12.c();
			for (local340 = 0; local340 < local202; local340++) {
				Static113.aClass2_12.method7364(Static133.aClass2_16.c() + local7 + Static113.aClass2_12.c() * local340, -Static113.aClass2_12.la() + local15 + local21);
			}
			local380 = (local21 - Static133.aClass2_16.la() - 20) / Static266.aClass2_50.la();
			for (@Pc(382) int local382 = 0; local382 < local380; local382++) {
				Static266.aClass2_50.method7364(local7, local15 + Static266.aClass2_50.la() * local382 + 20);
				Static357.aClass2_37.method7364(local17 + local7 - Static357.aClass2_37.c(), local382 * Static266.aClass2_50.la() + local15 + 20);
			}
			Static133.aClass2_16.method7364(local7, local21 + local15 - Static133.aClass2_16.la());
			Static545.aClass2_51.method7364(local17 + local7 - Static133.aClass2_16.c(), local21 + local15 - Static133.aClass2_16.la());
		}
		for (@Pc(445) Class1_Sub24 local445 = (Class1_Sub24) Static248.aClass37_30.method977(); local445 != null; local445 = (Class1_Sub24) Static248.aClass37_30.method971()) {
			local340 = (Static16.anInt415 - local180 - 1) * 16 + local15 + 13 + 20;
			local380 = Static193.anInt7227 | 0xFF000000;
			if (local7 < local94 && local7 + local17 > local94 && local340 - 13 < local96 && local96 < local340 + 4 && local445.aBoolean218) {
				local380 = Static419.anInt7360 | 0xFF000000;
			}
			@Pc(498) int[] local498 = null;
			if (Static268.method4415(local445.anInt3161)) {
				local498 = Static342.aClass250_2.method5980((int) local445.aLong150).anIntArray335;
			} else if (local445.anInt3166 != -1) {
				local498 = Static342.aClass250_2.method5980(local445.anInt3166).anIntArray335;
			} else if (Static295.method4713(local445.anInt3161)) {
				@Pc(567) Class1_Sub17 local567 = (Class1_Sub17) Static380.aClass17_29.method738((long) local445.aLong150);
				if (local567 != null) {
					@Pc(572) Class49_Sub2_Sub2_Sub2 local572 = local567.aClass49_Sub2_Sub2_Sub2_2;
					@Pc(575) Class196 local575 = local572.aClass196_1;
					if (local575.anIntArray570 != null) {
						local575 = local575.method4855(Static251.aClass119_1);
					}
					if (local575 != null) {
						local498 = local575.anIntArray571;
					}
				}
			} else if (Static174.method2615(local445.anInt3161)) {
				@Pc(536) Class36 local536;
				if (local445.anInt3161 == 1012) {
					local536 = Static308.aClass96_4.method2274((int) local445.aLong150);
				} else {
					local536 = Static308.aClass96_4.method2274((int) (local445.aLong150 >>> 32 & 0x7FFFFFFFL));
				}
				if (local536.anIntArray127 != null) {
					local536 = local536.method954(Static251.aClass119_1);
				}
				if (local536 != null) {
					local498 = local536.anIntArray126;
				}
			}
			@Pc(609) String local609 = Static224.method3889(local445);
			if (local498 != null) {
				local609 = local609 + Static228.method3983(local498);
			}
			Static296.aClass67_9.method7491(local7 + 3, local340, local380, Static204.anIntArray341, local609, Static72.aClass2Array2);
			local180++;
			if (local445.aBoolean217) {
				Static475.aClass2_35.method7364(local7 + Static381.aClass232_6.method5432(local609) + 5, local340 + -12);
			}
		}
		Static40.method897(Static260.anInt5040, Static13.anInt305, Static541.anInt9145, Static188.anInt3359);
	}

	@OriginalMember(owner = "client!lq", name = "b", descriptor = "(I)V")
	public static void method4575() {
		Static539.aBoolean635 = true;
	}
}
