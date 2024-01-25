import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static426 {

	@OriginalMember(owner = "client!nj", name = "x", descriptor = "F")
	public static float aFloat114;

	@OriginalMember(owner = "client!nj", name = "y", descriptor = "I")
	public static int anInt6943;

	@OriginalMember(owner = "client!nj", name = "I", descriptor = "Lclient!lba;")
	public static final Class218 aClass218_29 = new Class218(4);

	@OriginalMember(owner = "client!nj", name = "G", descriptor = "Lclient!gja;")
	public static final Class139 aClass139_2 = new Class139(1);

	@OriginalMember(owner = "client!nj", name = "H", descriptor = "Lclient!tda;")
	public static final Class349 aClass349_97 = new Class349(29, 11);

	@OriginalMember(owner = "client!nj", name = "M", descriptor = "I")
	public static int anInt6942 = 104;

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(I[B)V")
	public static void method6242(@OriginalArg(1) byte[] arg0) {
		@Pc(15) Class2_Sub20 local15 = new Class2_Sub20(arg0);
		while (true) {
			@Pc(19) int local19 = local15.method8581(-17416);
			if (local19 == 0) {
				return;
			}
			if (local19 == 1) {
				@Pc(28) int local28 = local15.method8575();
				if (Static37.anInt9263 == -1) {
					Static37.anInt9263 = local28;
				}
			}
		}
	}

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "(Z)V")
	public static void method6243() {
		if (Static391.anInt6484 == 0 || Static391.anInt6484 == 10) {
			return;
		}
		try {
			@Pc(18) short local18;
			if (Static395.anInt6513 == 0) {
				local18 = 250;
			} else {
				local18 = 2000;
			}
			if (Static25.anInt319 != 2 || Static391.anInt6484 != 20 && Static214.anInt3419 != 42) {
				Static479.anInt7695++;
			}
			if (Static390.aBoolean547 && Static391.anInt6484 >= 6) {
				local18 = 6000;
			}
			if (local18 < Static479.anInt7695) {
				Static560.aClass221_3.method5170();
				if (Static395.anInt6513 >= 3) {
					Static391.anInt6484 = 0;
					Static223.method7019(-5);
					return;
				}
				if (Static25.anInt319 == 2) {
					Static548.aClass176_3.method3776();
				} else {
					Static470.aClass176_2.method3776();
				}
				Static391.anInt6484 = 1;
				Static395.anInt6513++;
				Static479.anInt7695 = 0;
			}
			if (Static391.anInt6484 == 1) {
				if (Static25.anInt319 == 2) {
					Static560.aClass221_3.aClass163_4 = Static548.aClass176_3.method3777(Static135.aClass389_2);
				} else {
					Static560.aClass221_3.aClass163_4 = Static470.aClass176_2.method3777(Static135.aClass389_2);
				}
				Static391.anInt6484 = 2;
			}
			@Pc(171) Class2_Sub33 local171;
			@Pc(198) int local198;
			@Pc(245) int local245;
			if (Static391.anInt6484 == 2) {
				if (Static560.aClass221_3.aClass163_4.anInt3843 == 2) {
					throw new IOException();
				}
				if (Static560.aClass221_3.aClass163_4.anInt3843 != 1) {
					return;
				}
				Static560.aClass221_3.aClass5_2 = Static166.method2508((Socket) Static560.aClass221_3.aClass163_4.anObject5);
				Static560.aClass221_3.aClass163_4 = null;
				Static560.aClass221_3.method5174();
				local171 = Static522.method7382();
				if (Static390.aBoolean547) {
					local171.aClass2_Sub20_Sub2_1.method8584(Static630.aClass396_12.anInt10768);
					local171.aClass2_Sub20_Sub2_1.method8551(0);
					local198 = local171.aClass2_Sub20_Sub2_1.anInt9723;
					local171.aClass2_Sub20_Sub2_1.method8577(664);
					if (Static25.anInt319 == 2) {
						local171.aClass2_Sub20_Sub2_1.method8584(Static357.anInt5722 == 14 ? 1 : 0);
					}
					@Pc(224) Class2_Sub20 local224 = Static38.method550();
					local224.method8584(Static233.anInt3710);
					local224.method8551((int) (Math.random() * 9.9999999E7D));
					local224.method8584(Static414.anInt9485);
					local224.method8577(Static175.anInt10800);
					for (local245 = 0; local245 < 6; local245++) {
						local224.method8577((int) (Math.random() * 9.9999999E7D));
					}
					local224.method8580(Static4.aLong4);
					local224.method8584(Static249.aClass150_6.anInt3649);
					local224.method8584((int) (Math.random() * 9.9999999E7D));
					local224.method8546(Static354.aBigInteger13, Static610.aBigInteger31);
					local171.aClass2_Sub20_Sub2_1.method8565(local224.aByteArray111, 0, local224.anInt9723);
					local171.aClass2_Sub20_Sub2_1.method8564(local171.aClass2_Sub20_Sub2_1.anInt9723 - local198);
				} else {
					local171.aClass2_Sub20_Sub2_1.method8584(Static630.aClass396_1.anInt10768);
				}
				Static560.aClass221_3.method5173(local171);
				Static560.aClass221_3.method5171((byte) 109);
				Static391.anInt6484 = 3;
			}
			@Pc(344) int local344;
			if (Static391.anInt6484 == 3) {
				if (!Static560.aClass221_3.aClass5_2.method106(1)) {
					return;
				}
				Static560.aClass221_3.aClass5_2.method109(0, Static560.aClass221_3.aClass2_Sub20_Sub2_2.aByteArray111, 1);
				local344 = Static560.aClass221_3.aClass2_Sub20_Sub2_2.aByteArray111[0] & 0xFF;
				if (local344 != 0) {
					Static391.anInt6484 = 0;
					Static223.method7019(local344);
					Static560.aClass221_3.method5170();
					Static3.method48(15234);
					return;
				}
				if (Static390.aBoolean547) {
					Static391.anInt6484 = 4;
				} else {
					Static391.anInt6484 = 8;
				}
			}
			if (Static391.anInt6484 == 4) {
				if (!Static560.aClass221_3.aClass5_2.method106(2)) {
					return;
				}
				Static560.aClass221_3.aClass5_2.method109(0, Static560.aClass221_3.aClass2_Sub20_Sub2_2.aByteArray111, 2);
				Static560.aClass221_3.aClass2_Sub20_Sub2_2.anInt9723 = 0;
				Static560.aClass221_3.aClass2_Sub20_Sub2_2.anInt9723 = Static560.aClass221_3.aClass2_Sub20_Sub2_2.method8575();
				Static391.anInt6484 = 5;
			}
			if (Static391.anInt6484 == 5) {
				if (!Static560.aClass221_3.aClass5_2.method106(Static560.aClass221_3.aClass2_Sub20_Sub2_2.anInt9723)) {
					return;
				}
				Static560.aClass221_3.aClass5_2.method109(0, Static560.aClass221_3.aClass2_Sub20_Sub2_2.aByteArray111, Static560.aClass221_3.aClass2_Sub20_Sub2_2.anInt9723);
				Static560.aClass221_3.aClass2_Sub20_Sub2_2.method8534(-37, Static515.anIntArray587);
				Static560.aClass221_3.aClass2_Sub20_Sub2_2.anInt9723 = 0;
				@Pc(449) String local449 = Static560.aClass221_3.aClass2_Sub20_Sub2_2.method8537();
				Static560.aClass221_3.aClass2_Sub20_Sub2_2.anInt9723 = 0;
				@Pc(457) String local457 = "opensn";
				if (!Static396.aBoolean553 || Static514.method7280(1, local457, Static135.aClass389_2, local449).anInt3843 == 2) {
					Static496.method7086(local449, Static135.aClass389_2, local457, true, Static650.aClass2_Sub30_29.aClass11_Sub20_2.method4863() == 1);
				}
				Static391.anInt6484 = 6;
			}
			if (Static391.anInt6484 == 6) {
				if (!Static560.aClass221_3.aClass5_2.method106(1)) {
					return;
				}
				Static560.aClass221_3.aClass5_2.method109(0, Static560.aClass221_3.aClass2_Sub20_Sub2_2.aByteArray111, 1);
				if ((Static560.aClass221_3.aClass2_Sub20_Sub2_2.aByteArray111[0] & 0xFF) == 1) {
					Static391.anInt6484 = 7;
				}
			}
			if (Static391.anInt6484 == 7) {
				if (!Static560.aClass221_3.aClass5_2.method106(16)) {
					return;
				}
				Static560.aClass221_3.aClass5_2.method109(0, Static560.aClass221_3.aClass2_Sub20_Sub2_2.aByteArray111, 16);
				Static560.aClass221_3.aClass2_Sub20_Sub2_2.anInt9723 = 16;
				Static560.aClass221_3.aClass2_Sub20_Sub2_2.method8534(-54, Static515.anIntArray587);
				Static560.aClass221_3.aClass2_Sub20_Sub2_2.anInt9723 = 0;
				Static376.aString64 = Static465.aString87 = Static580.method8080(Static560.aClass221_3.aClass2_Sub20_Sub2_2.method8590());
				Static219.aLong120 = Static560.aClass221_3.aClass2_Sub20_Sub2_2.method8590();
				Static391.anInt6484 = 8;
			}
			@Pc(596) Class2_Sub20_Sub2 local596;
			if (Static391.anInt6484 == 8) {
				Static560.aClass221_3.aClass2_Sub20_Sub2_2.anInt9723 = 0;
				Static560.aClass221_3.method5174();
				local171 = Static522.method7382();
				local596 = local171.aClass2_Sub20_Sub2_1;
				@Pc(626) int local626;
				@Pc(635) Class2_Sub20 local635;
				@Pc(607) Class396 local607;
				if (Static25.anInt319 == 2) {
					if (Static390.aBoolean547) {
						local607 = Static630.aClass396_13;
					} else {
						local607 = Static630.aClass396_3;
					}
					local596.method8584(local607.anInt10768);
					local596.method8551(0);
					local245 = local596.anInt9723;
					local626 = local596.anInt9723;
					if (!Static390.aBoolean547) {
						local596.method8577(664);
						local596.method8584(Static357.anInt5722 == 14 ? 1 : 0);
						local626 = local596.anInt9723;
						local635 = Static504.method7144();
						local596.method8565(local635.aByteArray111, 0, local635.anInt9723);
						local626 = local596.anInt9723;
						local596.method8541(Static376.aString64);
					}
					local596.method8584(Static690.anInt10620);
					local596.method8584(Static193.method2756());
					local596.method8551(Static151.anInt7983);
					local596.method8551(Static295.anInt4558);
					local596.method8584(Static650.aClass2_Sub30_29.aClass11_Sub18_1.method4563());
					Static602.method9219(local596);
					local596.method8541(Static601.aString103);
					local596.method8577(Static175.anInt10800);
					local635 = Static650.aClass2_Sub30_29.method2989();
					local596.method8584(local635.anInt9723);
					local596.method8565(local635.aByteArray111, 0, local635.anInt9723);
					Static492.aBoolean688 = true;
					@Pc(821) Class2_Sub20 local821 = new Class2_Sub20(Static604.aClass2_Sub45_1.method6591());
					Static604.aClass2_Sub45_1.method6593(local821);
					local596.method8565(local821.aByteArray111, 0, local821.aByteArray111.length);
					local596.method8577(Static84.anInt1420);
					local596.method8580(Static170.aLong103);
					local596.method8584(Static425.aString72 == null ? 0 : 1);
					if (Static425.aString72 != null) {
						local596.method8541(Static425.aString72);
					}
					local596.method8584(Static140.method2067("jagtheora") ? 1 : 0);
					local596.method8584(Static396.aBoolean553 ? 1 : 0);
					Static723.method9628(local596);
					local596.method8544(local626, local596.anInt9723, Static515.anIntArray587);
					local596.method8564(local596.anInt9723 - local245);
				} else {
					if (Static390.aBoolean547) {
						local607 = Static630.aClass396_13;
					} else {
						local607 = Static630.aClass396_5;
					}
					local596.method8584(local607.anInt10768);
					local596.method8551(0);
					local245 = local596.anInt9723;
					local626 = local596.anInt9723;
					if (!Static390.aBoolean547) {
						local596.method8577(664);
						local635 = Static504.method7144();
						local596.method8565(local635.aByteArray111, 0, local635.anInt9723);
						local626 = local596.anInt9723;
						local596.method8541(Static376.aString64);
					}
					local596.method8584(Static249.aClass150_6.anInt3649);
					local596.method8584(Static414.anInt9485);
					Static602.method9219(local596);
					local596.method8541(Static601.aString103);
					local596.method8577(Static175.anInt10800);
					Static723.method9628(local596);
					local596.method8544(local626, local596.anInt9723, Static515.anIntArray587);
					local596.method8564(local596.anInt9723 - local245);
				}
				Static560.aClass221_3.method5173(local171);
				Static560.aClass221_3.method5171((byte) 115);
				Static560.aClass221_3.aClass48_1 = new Class48(Static515.anIntArray587);
				for (@Pc(914) int local914 = 0; local914 < 4; local914++) {
					Static515.anIntArray587[local914] += 50;
				}
				Static560.aClass221_3.aClass2_Sub20_Sub2_2.method8609(Static515.anIntArray587);
				Static391.anInt6484 = 9;
				Static515.anIntArray587 = null;
			}
			if (Static391.anInt6484 == 9) {
				if (!Static560.aClass221_3.aClass5_2.method106(1)) {
					return;
				}
				Static560.aClass221_3.aClass5_2.method109(0, Static560.aClass221_3.aClass2_Sub20_Sub2_2.aByteArray111, 1);
				local344 = Static560.aClass221_3.aClass2_Sub20_Sub2_2.aByteArray111[0] & 0xFF;
				if (local344 == 21) {
					Static391.anInt6484 = 12;
				} else if (local344 == 29 || local344 == 45) {
					Static464.anInt7546 = local344;
					Static391.anInt6484 = 18;
				} else if (local344 == 1) {
					Static391.anInt6484 = 10;
					Static223.method7019(local344);
					return;
				} else if (local344 == 2) {
					Static391.anInt6484 = 13;
				} else if (local344 == 15) {
					Static391.anInt6484 = 19;
					Static560.aClass221_3.anInt5773 = -2;
				} else if (local344 == 23 && Static395.anInt6513 < 3) {
					Static391.anInt6484 = 1;
					Static479.anInt7695 = 0;
					Static395.anInt6513++;
					Static560.aClass221_3.aClass5_2.method108();
					Static560.aClass221_3.aClass5_2 = null;
					return;
				} else if (local344 == 42) {
					Static391.anInt6484 = 20;
					Static223.method7019(local344);
					return;
				} else if (!Static449.aBoolean616 || Static390.aBoolean547 || Static233.anInt3710 == -1 || local344 != 35) {
					Static391.anInt6484 = 0;
					Static223.method7019(local344);
					Static560.aClass221_3.aClass5_2.method108();
					Static560.aClass221_3.aClass5_2 = null;
					Static3.method48(15234);
					return;
				} else {
					Static391.anInt6484 = 1;
					Static479.anInt7695 = 0;
					Static390.aBoolean547 = true;
					Static560.aClass221_3.aClass5_2.method108();
					Static560.aClass221_3.aClass5_2 = null;
					return;
				}
			}
			if (Static391.anInt6484 == 11) {
				Static560.aClass221_3.method5174();
				local171 = Static522.method7382();
				local596 = local171.aClass2_Sub20_Sub2_1;
				local596.method8601(Static560.aClass221_3.aClass48_1);
				local596.method8606(Static630.aClass396_9.anInt10768);
				Static560.aClass221_3.method5173(local171);
				Static560.aClass221_3.method5171((byte) 122);
				Static391.anInt6484 = 9;
			} else if (Static391.anInt6484 == 12) {
				if (Static560.aClass221_3.aClass5_2.method106(1)) {
					Static560.aClass221_3.aClass5_2.method109(0, Static560.aClass221_3.aClass2_Sub20_Sub2_2.aByteArray111, 1);
					local344 = Static560.aClass221_3.aClass2_Sub20_Sub2_2.aByteArray111[0] & 0xFF;
					Static391.anInt6484 = 0;
					Static368.anInt5884 = local344 * 50;
					Static223.method7019(21);
					Static560.aClass221_3.aClass5_2.method108();
					Static560.aClass221_3.aClass5_2 = null;
					Static3.method48(15234);
				}
			} else if (Static391.anInt6484 == 20) {
				if (Static560.aClass221_3.aClass5_2.method106(2)) {
					Static560.aClass221_3.aClass5_2.method109(0, Static560.aClass221_3.aClass2_Sub20_Sub2_2.aByteArray111, 2);
					Static391.anInt6484 = 9;
					Static615.anInt3802 = (Static560.aClass221_3.aClass2_Sub20_Sub2_2.aByteArray111[1] & 0xFF) + ((Static560.aClass221_3.aClass2_Sub20_Sub2_2.aByteArray111[0] & 0xFF) << 8);
				}
			} else if (Static391.anInt6484 == 18) {
				if (Static464.anInt7546 == 29) {
					if (!Static560.aClass221_3.aClass5_2.method106(1)) {
						return;
					}
					Static560.aClass221_3.aClass5_2.method109(0, Static560.aClass221_3.aClass2_Sub20_Sub2_2.aByteArray111, 1);
					Static78.anInt1361 = Static560.aClass221_3.aClass2_Sub20_Sub2_2.aByteArray111[0] & 0xFF;
				} else if (Static464.anInt7546 == 45) {
					if (!Static560.aClass221_3.aClass5_2.method106(3)) {
						return;
					}
					Static560.aClass221_3.aClass5_2.method109(0, Static560.aClass221_3.aClass2_Sub20_Sub2_2.aByteArray111, 3);
					Static78.anInt1361 = Static560.aClass221_3.aClass2_Sub20_Sub2_2.aByteArray111[0] & 0xFF;
					Static580.anInt9159 = ((Static560.aClass221_3.aClass2_Sub20_Sub2_2.aByteArray111[1] & 0xFF) << 8) + (Static560.aClass221_3.aClass2_Sub20_Sub2_2.aByteArray111[2] & 0xFF);
				} else {
					throw new IllegalStateException("Login step 18 not valid for pendingResponse=" + Static464.anInt7546);
				}
				Static391.anInt6484 = 0;
				Static223.method7019(Static464.anInt7546);
				Static560.aClass221_3.aClass5_2.method108();
				Static560.aClass221_3.aClass5_2 = null;
				Static3.method48(15234);
			} else if (Static391.anInt6484 != 13) {
				@Pc(1419) Class2_Sub20_Sub2 local1419;
				if (Static391.anInt6484 == 14) {
					local1419 = Static560.aClass221_3.aClass2_Sub20_Sub2_2;
					if (Static25.anInt319 == 2) {
						if (!Static560.aClass221_3.aClass5_2.method106(Static511.anInt8128)) {
							return;
						}
						Static560.aClass221_3.aClass5_2.method109(0, local1419.aByteArray111, Static511.anInt8128);
						local1419.anInt9723 = 0;
						Static565.anInt8888 = local1419.method8581(-17416);
						Static65.anInt1141 = local1419.method8581(-17416);
						Static70.aBoolean137 = local1419.method8581(-17416) == 1;
						Static337.aBoolean443 = local1419.method8581(-17416) == 1;
						Static29.aBoolean63 = local1419.method8581(-17416) == 1;
						Static329.aBoolean429 = local1419.method8581(-17416) == 1;
						Class4_Sub2_Sub1_Sub2.lb = local1419.method8575();
						Static566.aBoolean755 = local1419.method8581(-17416) == 1;
						Static126.anInt2110 = local1419.method8595();
						Static102.aBoolean202 = local1419.method8581(-17416) == 1;
						Static382.aString66 = local1419.method8553();
						Static148.aClass153_3.method3341(Static102.aBoolean202);
						Static543.aClass37_2.method599(Static102.aBoolean202);
						Static192.aClass41_1.method750(Static102.aBoolean202);
					} else if (Static560.aClass221_3.aClass5_2.method106(Static511.anInt8128)) {
						Static560.aClass221_3.aClass5_2.method109(0, local1419.aByteArray111, Static511.anInt8128);
						local1419.anInt9723 = 0;
						Static565.anInt8888 = local1419.method8581(-17416);
						Static65.anInt1141 = local1419.method8581(-17416);
						Static70.aBoolean137 = local1419.method8581(-17416) == 1;
						Static337.aBoolean443 = local1419.method8581(-17416) == 1;
						Static29.aBoolean63 = local1419.method8581(-17416) == 1;
						Static77.aLong51 = local1419.method8590();
						Static650.aLong317 = Static77.aLong51 - Static567.method7863() - local1419.method8531();
						local198 = local1419.method8581(-17416);
						Static622.aBoolean820 = (local198 & 0x2) != 0;
						Static566.aBoolean755 = (local198 & 0x1) != 0;
						Static65.anInt1136 = local1419.method8555(-9372);
						Static68.aBoolean134 = local1419.method8581(-17416) == 1;
						Static171.anInt2930 = local1419.method8555(-9372);
						Static166.anInt2880 = local1419.method8575();
						Static382.anInt6085 = local1419.method8575();
						Static119.anInt1991 = local1419.method8575();
						Static473.anInt7599 = local1419.method8555(-9372);
						Static525.aClass163_5 = Static135.aClass389_2.method9273(Static473.anInt7599);
						Static249.anInt3854 = local1419.method8581(-17416);
						Static390.anInt6475 = local1419.method8575();
						Static305.anInt2216 = local1419.method8575();
						Static352.aBoolean459 = local1419.method8581(-17416) == 1;
						Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.aString4 = Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.aString3 = Static247.aString47 = local1419.method8537();
						Static547.anInt8631 = local1419.method8581(-17416);
						Static565.anInt8887 = local1419.method8555(-9372);
						Static284.aBoolean385 = local1419.method8581(-17416) == 1;
						Static614.aClass176_5 = new Class176();
						Static614.aClass176_5.anInt4157 = local1419.method8575();
						if (Static614.aClass176_5.anInt4157 == 65535) {
							Static614.aClass176_5.anInt4157 = -1;
						}
						Static614.aClass176_5.aString48 = local1419.method8537();
						if (Static661.aClass386_10 != Static229.aClass386_6) {
							Static614.aClass176_5.anInt4154 = Static614.aClass176_5.anInt4157 + 40000;
							Static614.aClass176_5.anInt4161 = Static614.aClass176_5.anInt4157 + 50000;
						}
						if (Static229.aClass386_6 != Static501.aClass386_8 && (Static114.aClass386_5 != Static229.aClass386_6 || Static565.anInt8888 < 2) && Static548.aClass176_3.method3772(Static550.aClass176_4)) {
							Static699.method9384();
						}
					} else {
						return;
					}
					if (Static70.aBoolean137 && !Static29.aBoolean63 || Static566.aBoolean755) {
						try {
							Static736.method7134(Static214.anApplet1, "zap");
						} catch (@Pc(1819) Throwable local1819) {
							if (Static435.aBoolean600) {
								try {
									Static214.anApplet1.getAppletContext().showDocument(new URL(Static214.anApplet1.getCodeBase(), "blank.ws"), "tbi");
								} catch (@Pc(1837) Exception local1837) {
								}
							}
						}
					} else {
						try {
							Static736.method7134(Static214.anApplet1, "unzap");
						} catch (@Pc(1848) Throwable local1848) {
						}
					}
					if (Static661.aClass386_10 == Static229.aClass386_6) {
						try {
							Static736.method7134(Static214.anApplet1, "loggedin");
						} catch (@Pc(1861) Throwable local1861) {
						}
					}
					if (Static25.anInt319 != 2) {
						Static391.anInt6484 = 0;
						Static223.method7019(2);
						Static413.method6067();
						Static261.method9374(-61, 7);
						Static560.aClass221_3.aClass225_108 = null;
						return;
					}
					Static391.anInt6484 = 16;
				}
				if (Static391.anInt6484 == 16) {
					if (!Static560.aClass221_3.aClass5_2.method106(3)) {
						return;
					}
					Static560.aClass221_3.aClass5_2.method109(0, Static560.aClass221_3.aClass2_Sub20_Sub2_2.aByteArray111, 3);
					Static391.anInt6484 = 17;
				}
				if (Static391.anInt6484 == 17) {
					local1419 = Static560.aClass221_3.aClass2_Sub20_Sub2_2;
					local1419.anInt9723 = 0;
					if (local1419.method8600()) {
						if (!Static560.aClass221_3.aClass5_2.method106(1)) {
							return;
						}
						Static560.aClass221_3.aClass5_2.method109(3, local1419.aByteArray111, 1);
					}
					Static560.aClass221_3.aClass225_108 = Static62.method943()[local1419.method8604()];
					Static560.aClass221_3.anInt5773 = local1419.method8575();
					Static391.anInt6484 = 15;
				}
				if (Static391.anInt6484 == 15) {
					if (Static560.aClass221_3.aClass5_2.method106(Static560.aClass221_3.anInt5773)) {
						Static560.aClass221_3.aClass5_2.method109(0, Static560.aClass221_3.aClass2_Sub20_Sub2_2.aByteArray111, Static560.aClass221_3.anInt5773);
						Static560.aClass221_3.aClass2_Sub20_Sub2_2.anInt9723 = 0;
						Static391.anInt6484 = 0;
						local344 = Static560.aClass221_3.anInt5773;
						Static223.method7019(2);
						Static54.method756();
						Static673.method9173(Static560.aClass221_3.aClass2_Sub20_Sub2_2);
						Static719.anInt10965 = -1;
						if (Static704.aClass225_205 == Static560.aClass221_3.aClass225_108) {
							Static276.method7839((byte) 110);
						} else {
							Static456.method6634();
						}
						if (Static560.aClass221_3.aClass2_Sub20_Sub2_2.anInt9723 != local344) {
							throw new RuntimeException("lswp pos:" + Static560.aClass221_3.aClass2_Sub20_Sub2_2.anInt9723 + " psize:" + local344);
						}
						Static560.aClass221_3.aClass225_108 = null;
					}
				} else if (Static391.anInt6484 == 19) {
					if (Static560.aClass221_3.anInt5773 == -2) {
						if (!Static560.aClass221_3.aClass5_2.method106(2)) {
							return;
						}
						Static560.aClass221_3.aClass5_2.method109(0, Static560.aClass221_3.aClass2_Sub20_Sub2_2.aByteArray111, 2);
						Static560.aClass221_3.aClass2_Sub20_Sub2_2.anInt9723 = 0;
						Static560.aClass221_3.anInt5773 = Static560.aClass221_3.aClass2_Sub20_Sub2_2.method8575();
					}
					if (Static560.aClass221_3.aClass5_2.method106(Static560.aClass221_3.anInt5773)) {
						Static560.aClass221_3.aClass5_2.method109(0, Static560.aClass221_3.aClass2_Sub20_Sub2_2.aByteArray111, Static560.aClass221_3.anInt5773);
						Static560.aClass221_3.aClass2_Sub20_Sub2_2.anInt9723 = 0;
						Static391.anInt6484 = 0;
						local344 = Static560.aClass221_3.anInt5773;
						Static223.method7019(15);
						Static560.method7804();
						Static673.method9173(Static560.aClass221_3.aClass2_Sub20_Sub2_2);
						if (Static560.aClass221_3.aClass2_Sub20_Sub2_2.anInt9723 != local344) {
							throw new RuntimeException("lswpr pos:" + Static560.aClass221_3.aClass2_Sub20_Sub2_2.anInt9723 + " psize:" + local344);
						}
						Static560.aClass221_3.aClass225_108 = null;
					}
				}
			} else if (Static560.aClass221_3.aClass5_2.method106(1)) {
				Static560.aClass221_3.aClass5_2.method109(0, Static560.aClass221_3.aClass2_Sub20_Sub2_2.aByteArray111, 1);
				Static391.anInt6484 = 14;
				Static511.anInt8128 = Static560.aClass221_3.aClass2_Sub20_Sub2_2.aByteArray111[0] & 0xFF;
			}
		} catch (@Pc(2166) IOException local2166) {
			Static560.aClass221_3.method5170();
			if (Static395.anInt6513 >= 3) {
				Static391.anInt6484 = 0;
				Static223.method7019(-4);
				Static3.method48(15234);
			} else {
				if (Static25.anInt319 == 2) {
					Static548.aClass176_3.method3776();
				} else {
					Static470.aClass176_2.method3776();
				}
				Static479.anInt7695 = 0;
				Static395.anInt6513++;
				Static391.anInt6484 = 1;
			}
		}
	}
}
