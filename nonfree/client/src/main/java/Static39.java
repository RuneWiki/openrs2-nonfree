import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!ic", name = "j", descriptor = "I")
	public static int anInt1694;

	@OriginalMember(owner = "client!ic", name = "o", descriptor = "[Lclient!eb;")
	public static Class6_Sub2_Sub2_Sub2[] aClass6_Sub2_Sub2_Sub2Array8;

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "Lclient!rc;")
	public static Class55 aClass55_652 = Static34.method846("Anmelde)2Limit -Uberschritten)3");

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "[Lclient!rc;")
	public static Class55[] aClass55Array12 = new Class55[1000];

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "Lclient!rc;")
	private static Class55 aClass55_653 = Static34.method846("Examine");

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "I")
	public static int anInt1691 = -1;

	@OriginalMember(owner = "client!ic", name = "e", descriptor = "Lclient!rc;")
	public static Class55 aClass55_654 = Static34.method846("Spiel)2Fenster geladen)3");

	@OriginalMember(owner = "client!ic", name = "m", descriptor = "Lclient!rc;")
	private static Class55 aClass55_658 = Static34.method846("Loaded wordpack");

	@OriginalMember(owner = "client!ic", name = "f", descriptor = "Lclient!rc;")
	public static Class55 aClass55_655 = aClass55_658;

	@OriginalMember(owner = "client!ic", name = "g", descriptor = "Lclient!rc;")
	public static Class55 aClass55_656 = Static34.method846("Fertigkeit)2");

	@OriginalMember(owner = "client!ic", name = "p", descriptor = "Lclient!rc;")
	private static Class55 aClass55_659 = Static34.method846("Loaded title screen");

	@OriginalMember(owner = "client!ic", name = "k", descriptor = "Lclient!rc;")
	public static Class55 aClass55_657 = aClass55_659;

	@OriginalMember(owner = "client!ic", name = "q", descriptor = "Lclient!rc;")
	public static Class55 aClass55_660 = aClass55_653;

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V")
	public static void method1165() {
		Static13.aClass6_Sub1_Sub1_2.method1524();
		@Pc(13) int local13 = Static13.aClass6_Sub1_Sub1_2.method1519(8);
		@Pc(22) int local22;
		if (Static111.anInt3173 > local13) {
			for (local22 = local13; local22 < Static111.anInt3173; local22++) {
				Static56.anIntArray163[Static44.anInt2716++] = Static19.anIntArray60[local22];
			}
		}
		if (Static111.anInt3173 < local13) {
			throw new RuntimeException("gnpov1");
		}
		Static111.anInt3173 = 0;
		for (local22 = 0; local22 < local13; local22++) {
			@Pc(60) int local60 = Static19.anIntArray60[local22];
			@Pc(64) Class6_Sub2_Sub3_Sub1_Sub2 local64 = Static15.aClass6_Sub2_Sub3_Sub1_Sub2Array1[local60];
			@Pc(69) int local69 = Static13.aClass6_Sub1_Sub1_2.method1519(1);
			if (local69 == 0) {
				Static19.anIntArray60[Static111.anInt3173++] = local60;
				local64.anInt2739 = Static85.anInt2389;
			} else {
				@Pc(89) int local89 = Static13.aClass6_Sub1_Sub1_2.method1519(2);
				if (local89 == 0) {
					Static19.anIntArray60[Static111.anInt3173++] = local60;
					local64.anInt2739 = Static85.anInt2389;
					Static102.anIntArray288[Static59.anInt1826++] = local60;
				} else {
					@Pc(133) int local133;
					@Pc(143) int local143;
					if (local89 == 1) {
						Static19.anIntArray60[Static111.anInt3173++] = local60;
						local64.anInt2739 = Static85.anInt2389;
						local133 = Static13.aClass6_Sub1_Sub1_2.method1519(3);
						local64.method1831(local133, false);
						local143 = Static13.aClass6_Sub1_Sub1_2.method1519(1);
						if (local143 == 1) {
							Static102.anIntArray288[Static59.anInt1826++] = local60;
						}
					} else if (local89 == 2) {
						Static19.anIntArray60[Static111.anInt3173++] = local60;
						local64.anInt2739 = Static85.anInt2389;
						local133 = Static13.aClass6_Sub1_Sub1_2.method1519(3);
						local64.method1831(local133, true);
						local143 = Static13.aClass6_Sub1_Sub1_2.method1519(3);
						local64.method1831(local143, true);
						@Pc(201) int local201 = Static13.aClass6_Sub1_Sub1_2.method1519(1);
						if (local201 == 1) {
							Static102.anIntArray288[Static59.anInt1826++] = local60;
						}
					} else if (local89 == 3) {
						Static56.anIntArray163[Static44.anInt2716++] = local60;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILclient!pb;Ljava/awt/Component;Lclient!pb;)V")
	public static void method1166(@OriginalArg(1) Class40 arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) Class40 arg2) {
		if (Static12.aBoolean31) {
			return;
		}
		Static35.aClass21_10 = Static68.method1376(265, 128, arg1);
		Static53.method1279();
		Static111.aClass21_27 = Static68.method1376(265, 128, arg1);
		Static53.method1279();
		Static29.aClass21_8 = Static68.method1376(171, 509, arg1);
		Static53.method1279();
		Static103.aClass21_22 = Static68.method1376(132, 360, arg1);
		Static53.method1279();
		Static45.aClass21_12 = Static68.method1376(200, 360, arg1);
		Static53.method1279();
		Static107.aClass21_25 = Static68.method1376(238, 202, arg1);
		Static53.method1279();
		Static29.aClass21_7 = Static68.method1376(238, 203, arg1);
		Static53.method1279();
		Static77.aClass21_18 = Static68.method1376(94, 74, arg1);
		Static53.method1279();
		Static7.aClass21_3 = Static68.method1376(94, 75, arg1);
		Static53.method1279();
		@Pc(79) byte[] local79 = arg2.method1246(Static93.aClass55_1118, Static29.aClass55_431);
		@Pc(85) Class6_Sub2_Sub2_Sub2 local85 = new Class6_Sub2_Sub2_Sub2(local79, arg1);
		Static35.aClass21_10.method1445();
		local85.method645(0, 0);
		Static111.aClass21_27.method1445();
		local85.method645(-637, 0);
		Static29.aClass21_8.method1445();
		local85.method645(-128, 0);
		Static103.aClass21_22.method1445();
		local85.method645(-202, -371);
		Static45.aClass21_12.method1445();
		local85.method645(-202, -171);
		Static107.aClass21_25.method1445();
		local85.method645(0, -265);
		Static29.aClass21_7.method1445();
		local85.method645(-562, -265);
		Static77.aClass21_18.method1445();
		local85.method645(-128, -171);
		Static7.aClass21_3.method1445();
		local85.method645(-562, -171);
		@Pc(160) int[] local160 = new int[local85.anInt994];
		@Pc(166) int local166;
		@Pc(193) int local193;
		for (@Pc(162) int local162 = 0; local162 < local85.anInt991; local162++) {
			for (local166 = 0; local166 < local85.anInt994; local166++) {
				local160[local166] = local85.anIntArray62[local85.anInt994 * local162 + local85.anInt994 - local166 - 1];
			}
			for (local193 = 0; local193 < local85.anInt994; local193++) {
				local85.anIntArray62[local162 * local85.anInt994 + local193] = local160[local193];
			}
		}
		Static35.aClass21_10.method1445();
		local85.method645(382, 0);
		Static111.aClass21_27.method1445();
		local85.method645(-255, 0);
		Static29.aClass21_8.method1445();
		local85.method645(254, 0);
		Static103.aClass21_22.method1445();
		local85.method645(180, -371);
		Static45.aClass21_12.method1445();
		local85.method645(180, -171);
		Static107.aClass21_25.method1445();
		local85.method645(382, -265);
		Static29.aClass21_7.method1445();
		local85.method645(-180, -265);
		Static77.aClass21_18.method1445();
		local85.method645(254, -171);
		Static7.aClass21_3.method1445();
		local85.method645(-180, -171);
		local85 = Static70.method1402(Static29.aClass55_431, arg0, Static19.aClass55_335);
		Static29.aClass21_8.method1445();
		local85.method646(254 - local85.anInt994 / 2, 18);
		Static4.aClass6_Sub2_Sub2_Sub1_20 = Static67.method1365(Static21.aClass55_362, Static29.aClass55_431, arg0);
		Static15.aClass6_Sub2_Sub2_Sub1_5 = Static67.method1365(Static91.aClass55_1056, Static29.aClass55_431, arg0);
		Static50.aClass6_Sub2_Sub2_Sub1Array52 = Static47.method1016(arg0, Static29.aClass55_431, Static111.aClass55_1328);
		Static74.aClass6_Sub2_Sub2_Sub2_11 = new Class6_Sub2_Sub2_Sub2(128, 265);
		Static27.aClass6_Sub2_Sub2_Sub2_6 = new Class6_Sub2_Sub2_Sub2(128, 265);
		for (local166 = 0; local166 < 33920; local166++) {
			Static74.aClass6_Sub2_Sub2_Sub2_11.anIntArray62[local166] = Static35.aClass21_10.anIntArray212[local166];
		}
		for (local193 = 0; local193 < 33920; local193++) {
			Static27.aClass6_Sub2_Sub2_Sub2_6.anIntArray62[local193] = Static111.aClass21_27.anIntArray212[local193];
		}
		Static59.anIntArray179 = new int[256];
		for (@Pc(382) int local382 = 0; local382 < 64; local382++) {
			Static59.anIntArray179[local382] = local382 * 262144;
		}
		for (@Pc(398) int local398 = 0; local398 < 64; local398++) {
			Static59.anIntArray179[local398 + 64] = local398 * 1024 + 16711680;
		}
		for (@Pc(418) int local418 = 0; local418 < 64; local418++) {
			Static59.anIntArray179[local418 + 128] = local418 * 4 + 16776960;
		}
		for (@Pc(438) int local438 = 0; local438 < 64; local438++) {
			Static59.anIntArray179[local438 + 192] = 16777215;
		}
		Static57.anIntArray165 = new int[256];
		for (@Pc(457) int local457 = 0; local457 < 64; local457++) {
			Static57.anIntArray165[local457] = local457 * 1024;
		}
		for (@Pc(473) int local473 = 0; local473 < 64; local473++) {
			Static57.anIntArray165[local473 + 64] = local473 * 4 + 65280;
		}
		for (@Pc(491) int local491 = 0; local491 < 64; local491++) {
			Static57.anIntArray165[local491 + 128] = local491 * 262144 + 65535;
		}
		for (@Pc(511) int local511 = 0; local511 < 64; local511++) {
			Static57.anIntArray165[local511 + 192] = 16777215;
		}
		Static54.anIntArray162 = new int[256];
		for (@Pc(528) int local528 = 0; local528 < 64; local528++) {
			Static54.anIntArray162[local528] = local528 * 4;
		}
		for (@Pc(542) int local542 = 0; local542 < 64; local542++) {
			Static54.anIntArray162[local542 + 64] = local542 * 262144 + 255;
		}
		for (@Pc(560) int local560 = 0; local560 < 64; local560++) {
			Static54.anIntArray162[local560 + 128] = local560 * 1024 + 16711935;
		}
		for (@Pc(580) int local580 = 0; local580 < 64; local580++) {
			Static54.anIntArray162[local580 + 192] = 16777215;
		}
		Static92.anIntArray245 = new int[256];
		Static78.anIntArray218 = new int[32768];
		Static22.anIntArray64 = new int[32768];
		Static88.method2090(null);
		Static29.aClass55_429 = Static29.aClass55_431;
		Static29.aClass55_425 = Static29.aClass55_431;
		Static6.anInt267 = 0;
		Static32.anIntArray79 = new int[32768];
		Static106.anIntArray234 = new int[32768];
		if (Static96.anInt2811 == 0 || Static90.aBoolean119) {
			Static77.method1536();
		} else {
			Static77.method1534(Static44.aClass55_1148, Static29.aClass55_431, Static96.anInt2811, Static43.aClass40_Sub1_19);
		}
		Static32.method801(false);
		Static12.aBoolean31 = true;
		Static52.aBoolean74 = true;
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(I)V")
	public static void method1167() {
		aClass55_659 = null;
		aClass55_656 = null;
		aClass55_655 = null;
		aClass55_660 = null;
		aClass55_657 = null;
		aClass55_658 = null;
		aClass55_654 = null;
		aClass55_653 = null;
		aClass55_652 = null;
		aClass6_Sub2_Sub2_Sub2Array8 = null;
		aClass55Array12 = null;
	}
}
