import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!hs", name = "j", descriptor = "Lclient!oi;")
	public static Class185 aClass185_110;

	@OriginalMember(owner = "client!hs", name = "m", descriptor = "I")
	public static int anInt6557;

	@OriginalMember(owner = "client!hs", name = "i", descriptor = "Z")
	public static boolean aBoolean572 = false;

	@OriginalMember(owner = "client!hs", name = "k", descriptor = "Lclient!kn;")
	public static final Class142 aClass142_105 = new Class142("Take", "Nehmen", "Prendre", "Pegar");

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(IIIIIIII)V")
	public static void method5258(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg5 - 334;
		if (local7 < 0) {
			local7 = 0;
		} else if (local7 > 100) {
			local7 = 100;
		}
		@Pc(33) int local33 = Static204.aShort59 + local7 * (Static65.aShort27 - Static204.aShort59) / 100;
		@Pc(39) int local39 = arg2 * local33 >> 8;
		@Pc(51) int local51 = 16384 - arg4 & 0x3FFF;
		@Pc(58) int local58 = 16384 - arg6 & 0x3FFF;
		@Pc(60) int local60 = 0;
		@Pc(62) int local62 = 0;
		@Pc(64) int local64 = local39;
		if (local51 != 0) {
			local62 = Class1_Sub29.anIntArray537[local51] * -local39 >> 15;
			local64 = Class1_Sub29.anIntArray536[local51] * local39 >> 15;
		}
		if (local58 != 0) {
			local60 = local64 * Class1_Sub29.anIntArray537[local58] >> 15;
			local64 = local64 * Class1_Sub29.anIntArray536[local58] >> 15;
		}
		Static80.anInt1106 = arg0 - local64;
		Static398.anInt6386 = arg6;
		Static375.anInt6055 = arg1 - local62;
		Static386.anInt7155 = arg3 - local60;
		Static39.anInt573 = 0;
		Static129.anInt1972 = arg4;
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(I)V")
	public static void method5259() {
		if (Static372.anInt5995 == 0 || Static372.anInt5995 == 6) {
			return;
		}
		try {
			if (++Static63.anInt982 > 2000) {
				if (Static337.aClass110_2 != null) {
					Static337.aClass110_2.method3781();
					Static337.aClass110_2 = null;
				}
				if (Static392.anInt6309 >= 1) {
					Static372.anInt5995 = 0;
					Static447.method5752(-5);
					return;
				}
				Static372.anInt5995 = 1;
				if (Static436.anInt6898 == 2 || Static436.anInt6898 == 3) {
					Static440.aClass112_6.aBoolean272 = !Static440.aClass112_6.aBoolean272;
				} else {
					Static335.aClass112_9.aBoolean272 = !Static335.aClass112_9.aBoolean272;
				}
				Static392.anInt6309++;
				Static63.anInt982 = 0;
			}
			if (Static372.anInt5995 == 1) {
				if (Static436.anInt6898 == 2 || Static436.anInt6898 == 3) {
					Static462.aClass253_8 = Static259.aClass177_2.method3841(Static440.aClass112_6.method2164(), Static440.aClass112_6.aString28);
				} else {
					Static462.aClass253_8 = Static259.aClass177_2.method3841(Static335.aClass112_9.method2164(), Static335.aClass112_9.aString28);
				}
				Static372.anInt5995 = 2;
			}
			if (Static372.anInt5995 == 2) {
				if (Static462.aClass253_8.anInt6669 == 2) {
					throw new IOException();
				}
				if (Static462.aClass253_8.anInt6669 != 1) {
					return;
				}
				Static337.aClass110_2 = Static397.method5141((Socket) Static462.aClass253_8.anObject9);
				Static462.aClass253_8 = null;
				@Pc(157) long local157 = Static233.aLong137 = Static114.method1409(Static99.aString14);
				@Pc(164) int local164 = (int) (local157 >> 16 & 0x1FL);
				Static426.aClass1_Sub19_Sub2_2.anInt3698 = 0;
				Static426.aClass1_Sub19_Sub2_2.method2934(Static67.aClass210_61.anInt5528);
				Static426.aClass1_Sub19_Sub2_2.method2934(local164);
				Static337.aClass110_2.method3778(Static426.aClass1_Sub19_Sub2_2.aByteArray38, 2);
				Static372.anInt5995 = 3;
			}
			@Pc(209) int local209;
			if (Static372.anInt5995 == 3) {
				if (!Static337.aClass110_2.method3777(1)) {
					return;
				}
				Static337.aClass110_2.method3779(0, Static413.aClass1_Sub19_Sub2_1.aByteArray38, 1);
				local209 = Static413.aClass1_Sub19_Sub2_1.aByteArray38[0] & 0xFF;
				if (local209 != 0) {
					Static372.anInt5995 = 0;
					Static447.method5752(local209);
					Static337.aClass110_2.method3781();
					Static337.aClass110_2 = null;
					Static384.method4938();
					return;
				}
				Static372.anInt5995 = 4;
			}
			if (Static372.anInt5995 == 4) {
				if (!Static337.aClass110_2.method3777(8)) {
					return;
				}
				Static337.aClass110_2.method3779(0, Static413.aClass1_Sub19_Sub2_1.aByteArray38, 8);
				Static413.aClass1_Sub19_Sub2_1.anInt3698 = 0;
				Static117.aLong59 = Static413.aClass1_Sub19_Sub2_1.method2909();
				@Pc(257) Class1_Sub19 local257 = new Class1_Sub19(70);
				@Pc(260) int[] local260 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static117.aLong59 >> 32), (int) Static117.aLong59 };
				local257.method2934(10);
				local257.method2912(local260[0]);
				local257.method2912(local260[1]);
				local257.method2912(local260[2]);
				local257.method2912(local260[3]);
				local257.method2916(Static114.method1409(Static99.aString14));
				local257.method2935(Static88.aString13);
				local257.method2922(Static251.aBigInteger1, Static417.aBigInteger2);
				@Pc(331) Class1_Sub19_Sub2 local331 = Static426.aClass1_Sub19_Sub2_2;
				local331.anInt3698 = 0;
				@Pc(364) int local364;
				if (Static436.anInt6898 == 2 || Static436.anInt6898 == 3) {
					if (Static135.anInt2114 == 12) {
						local331.method2934(Static67.aClass210_65.anInt5528);
					} else {
						local331.method2934(Static67.aClass210_63.anInt5528);
					}
					local331.method2930(0);
					local364 = local331.anInt3698;
					local331.method2912(601);
					local331.method2934(Static212.anInt3924);
					local331.method2934(Static208.method3017());
					local331.method2930(Static192.anInt3532);
					local331.method2930(Static40.anInt597);
					local331.method2934(Static126.aClass19_Sub1_1.anInt4218);
					Static188.method2695(local331);
					local331.method2935(Static448.aString68);
					local331.method2912(Static209.anInt3892);
					@Pc(405) Class1_Sub19 local405 = Static126.aClass19_Sub1_1.method3345();
					local331.method2934(local405.anInt3698);
					local331.method2921(local405.aByteArray38, local405.anInt3698);
					Static355.aBoolean515 = true;
					local331.method2930(Static45.anInt669);
					local331.method2930(Static382.anInt4998);
					Static177.method2572();
					local331.method2921(local257.aByteArray38, local257.anInt3698);
					local331.method2905(local331.anInt3698 - local364);
				} else {
					local331.method2934(Static67.aClass210_66.anInt5528);
					local331.method2930(0);
					local364 = local331.anInt3698;
					local331.method2912(601);
					local331.method2934(Static94.aClass148_3.anInt4191);
					local331.method2934(Static63.anInt981);
					Static188.method2695(local331);
					local331.method2935(Static448.aString68);
					local331.method2912(Static209.anInt3892);
					Static177.method2572();
					local331.method2921(local257.aByteArray38, local257.anInt3698);
					local331.method2905(local331.anInt3698 - local364);
				}
				Static337.aClass110_2.method3778(local331.aByteArray38, local331.anInt3698);
				local331.method2945(local260);
				for (local364 = 0; local364 < 4; local364++) {
					local260[local364] += 50;
				}
				Static413.aClass1_Sub19_Sub2_1.method2945(local260);
				Static372.anInt5995 = 5;
			}
			if (Static372.anInt5995 == 5) {
				if (!Static337.aClass110_2.method3777(1)) {
					return;
				}
				Static337.aClass110_2.method3779(0, Static413.aClass1_Sub19_Sub2_1.aByteArray38, 1);
				local209 = Static413.aClass1_Sub19_Sub2_1.aByteArray38[0] & 0xFF;
				if (local209 == 21) {
					Static372.anInt5995 = 8;
				} else if (local209 == 29) {
					Static372.anInt5995 = 14;
				} else if (local209 == 1) {
					Static372.anInt5995 = 6;
					Static447.method5752(local209);
					return;
				} else if (local209 == 2) {
					Static372.anInt5995 = 9;
				} else if (local209 == 15) {
					Static372.anInt5995 = 15;
					Static379.anInt119 = -2;
				} else if (local209 == 23 && Static392.anInt6309 < 1) {
					Static392.anInt6309++;
					Static372.anInt5995 = 1;
					Static63.anInt982 = 0;
					Static337.aClass110_2.method3781();
					Static337.aClass110_2 = null;
					return;
				} else {
					Static372.anInt5995 = 0;
					Static447.method5752(local209);
					Static337.aClass110_2.method3781();
					Static337.aClass110_2 = null;
					Static384.method4938();
					return;
				}
			}
			if (Static372.anInt5995 == 7) {
				Static426.aClass1_Sub19_Sub2_2.anInt3698 = 0;
				Static426.aClass1_Sub19_Sub2_2.method2949(Static67.aClass210_64.anInt5528);
				Static337.aClass110_2.method3778(Static426.aClass1_Sub19_Sub2_2.aByteArray38, Static426.aClass1_Sub19_Sub2_2.anInt3698);
				Static372.anInt5995 = 5;
			} else if (Static372.anInt5995 == 8) {
				if (Static337.aClass110_2.method3777(1)) {
					Static337.aClass110_2.method3779(0, Static413.aClass1_Sub19_Sub2_1.aByteArray38, 1);
					local209 = Static413.aClass1_Sub19_Sub2_1.aByteArray38[0] & 0xFF;
					Static372.anInt5995 = 0;
					Static3.anInt42 = (local209 + 3) * 60;
					Static447.method5752(21);
					Static337.aClass110_2.method3781();
					Static337.aClass110_2 = null;
					Static384.method4938();
				}
			} else if (Static372.anInt5995 == 14) {
				if (Static337.aClass110_2.method3777(1)) {
					Static337.aClass110_2.method3779(0, Static413.aClass1_Sub19_Sub2_1.aByteArray38, 1);
					Static372.anInt5995 = 0;
					Static188.anInt3433 = Static413.aClass1_Sub19_Sub2_1.aByteArray38[0] & 0xFF;
					Static447.method5752(29);
					Static337.aClass110_2.method3781();
					Static337.aClass110_2 = null;
					Static384.method4938();
				}
			} else if (Static372.anInt5995 != 9) {
				@Pc(774) Class1_Sub19_Sub2 local774;
				if (Static372.anInt5995 == 10) {
					local774 = Static413.aClass1_Sub19_Sub2_1;
					if (Static436.anInt6898 == 3) {
						Static318.aBoolean473 = true;
					} else {
						Static318.aBoolean473 = false;
					}
					if (Static436.anInt6898 == 2 || Static436.anInt6898 == 3) {
						if (!Static337.aClass110_2.method3777(Static169.anInt5160)) {
							return;
						}
						Static337.aClass110_2.method3779(0, local774.aByteArray38, Static169.anInt5160);
						local774.anInt3698 = 0;
						Static435.anInt6026 = local774.method2915();
						Static362.anInt5840 = local774.method2915();
						Static10.aBoolean463 = local774.method2915() == 1;
						Static67.aBoolean619 = local774.method2915() == 1;
						Static446.aBoolean613 = local774.method2915() == 1;
						Static299.aBoolean459 = local774.method2915() == 1;
						Static220.anInt4038 = local774.method2896();
						Static396.aBoolean555 = local774.method2915() == 1;
						Static246.anInt4399 = local774.method2904();
						Static422.aBoolean591 = local774.method2915() == 1;
						if (Static436.anInt6898 == 3) {
							@Pc(898) boolean local898 = local774.method2915() == 1;
							if (local898) {
								@Pc(904) long local904 = local774.method2909();
								@Pc(908) String local908 = Static396.method5137(local904);
								@Pc(912) int local912 = local774.method2915();
								@Pc(915) byte[] local915 = new byte[local912];
								local774.method2947(local915, local912);
								@Pc(925) String local925 = Static100.method1176(local915);
								@Pc(927) Class235 local927 = null;
								try {
									@Pc(933) Class253 local933 = Static259.aClass177_2.method3832(false, "3");
									while (local933.anInt6669 == 0) {
										Static331.method4343(1L);
									}
									if (local933.anInt6669 == 1) {
										local927 = (Class235) local933.anObject9;
										@Pc(963) int local963 = local908.length() + local925.length() + 6 + 3;
										if (local963 > 50) {
											throw new RuntimeException(">50");
										}
										@Pc(978) Class1_Sub19 local978 = new Class1_Sub19(local963 + 1);
										local978.method2934(local963);
										local978.method2934(0);
										local978.method2906(local908);
										local978.method2906(local925);
										local978.method2932();
										local927.method4943(0, local978.anInt3698, local978.aByteArray38);
									}
								} catch (@Pc(1008) Exception local1008) {
								}
								try {
									if (local927 != null) {
										local927.method4942();
									}
								} catch (@Pc(1015) Exception local1015) {
								}
							}
						}
						Static86.aClass248_7.method5253(Static422.aBoolean591);
						Static285.aClass226_2.method4791(Static422.aBoolean591);
						Static428.aClass196_1.method4170(Static422.aBoolean591);
					} else if (Static337.aClass110_2.method3777(Static169.anInt5160)) {
						Static337.aClass110_2.method3779(0, local774.aByteArray38, Static169.anInt5160);
						local774.anInt3698 = 0;
						Static435.anInt6026 = local774.method2915();
						Static362.anInt5840 = local774.method2915();
						Static10.aBoolean463 = local774.method2915() == 1;
						Static67.aBoolean619 = local774.method2915() == 1;
						Static446.aBoolean613 = local774.method2915() == 1;
						Static62.anInt966 = local774.method2896();
						Static396.aBoolean555 = Static62.anInt966 > 0;
						Static83.anInt1147 = local774.method2896();
						Static152.anInt2374 = local774.method2896();
						Static372.anInt5998 = local774.method2896();
						Static94.anInt1263 = local774.method2877();
						Static90.aClass253_2 = Static259.aClass177_2.method3842(Static94.anInt1263);
						Static423.anInt6812 = local774.method2915();
						Static401.anInt6449 = local774.method2896();
						Static462.anInt7410 = local774.method2896();
						Static410.aBoolean571 = local774.method2915() == 1;
						Static94.aClass11_Sub1_Sub3_Sub2_1.aString32 = Static94.aClass11_Sub1_Sub3_Sub2_1.aString33 = local774.method2925();
						Static61.aClass112_11 = new Class112();
						Static61.aClass112_11.anInt2708 = local774.method2896();
						if (Static61.aClass112_11.anInt2708 == 65535) {
							Static61.aClass112_11.anInt2708 = -1;
						}
						Static61.aClass112_11.aString28 = local774.method2925();
						if (Static268.aClass170_5 != Static254.aClass170_4) {
							Static61.aClass112_11.anInt2711 = Static61.aClass112_11.anInt2708 + 50000;
							Static61.aClass112_11.anInt2710 = Static61.aClass112_11.anInt2708 + 40000;
						}
						if (Static293.aClass170_6 != Static254.aClass170_4 && (Static440.aClass112_6.method2162(Static208.aClass112_7) || Static440.aClass112_6.method2162(Static68.aClass112_3))) {
							Static440.aClass112_6 = Static61.aClass112_11;
						}
					} else {
						return;
					}
					if (Static10.aBoolean463 && !Static446.aBoolean613 || Static396.aBoolean555) {
						try {
							Static466.method42("zap", Static259.aClass177_2.anApplet1);
						} catch (@Pc(1223) Throwable local1223) {
							if (Static439.aBoolean601) {
								try {
									Static259.aClass177_2.anApplet1.getAppletContext().showDocument(new URL(Static259.aClass177_2.anApplet1.getCodeBase(), "blank.ws"), "tbi");
								} catch (@Pc(1239) Exception local1239) {
								}
							}
						}
					} else {
						try {
							Static466.method42("unzap", Static259.aClass177_2.anApplet1);
						} catch (@Pc(1213) Throwable local1213) {
						}
					}
					if (Static268.aClass170_5 == Static254.aClass170_4) {
						try {
							Static466.method42("loggedin", Static259.aClass177_2.anApplet1);
						} catch (@Pc(1251) Throwable local1251) {
						}
					}
					if (Static436.anInt6898 != 2 && Static436.anInt6898 != 3) {
						Static372.anInt5995 = 0;
						Static447.method5752(2);
						Static290.method3879();
						Static154.method1923(6);
						Static425.aClass67_257 = null;
						return;
					}
					Static372.anInt5995 = 12;
				}
				if (Static372.anInt5995 == 12) {
					if (!Static337.aClass110_2.method3777(3)) {
						return;
					}
					Static337.aClass110_2.method3779(0, Static413.aClass1_Sub19_Sub2_1.aByteArray38, 3);
					Static372.anInt5995 = 13;
				}
				if (Static372.anInt5995 == 13) {
					local774 = Static413.aClass1_Sub19_Sub2_1;
					local774.anInt3698 = 0;
					if (local774.method2942()) {
						if (!Static337.aClass110_2.method3777(1)) {
							return;
						}
						Static337.aClass110_2.method3779(3, local774.aByteArray38, 1);
					}
					Static425.aClass67_257 = Static136.method1743()[local774.method2944()];
					Static379.anInt119 = local774.method2896();
					Static372.anInt5995 = 11;
				}
				if (Static372.anInt5995 == 11) {
					if (Static337.aClass110_2.method3777(Static379.anInt119)) {
						Static337.aClass110_2.method3779(0, Static413.aClass1_Sub19_Sub2_1.aByteArray38, Static379.anInt119);
						Static413.aClass1_Sub19_Sub2_1.anInt3698 = 0;
						local209 = Static379.anInt119;
						Static372.anInt5995 = 0;
						Static447.method5752(2);
						Static311.method4111();
						Static348.method4537(Static413.aClass1_Sub19_Sub2_1);
						Static122.anInt1849 = -1;
						Static422.method5394();
						if (local209 != Static413.aClass1_Sub19_Sub2_1.anInt3698) {
							throw new RuntimeException("lswp pos:" + Static413.aClass1_Sub19_Sub2_1.anInt3698 + " psize:" + local209);
						}
						Static425.aClass67_257 = null;
					}
				} else if (Static372.anInt5995 == 15) {
					if (Static379.anInt119 == -2) {
						if (!Static337.aClass110_2.method3777(2)) {
							return;
						}
						Static337.aClass110_2.method3779(0, Static413.aClass1_Sub19_Sub2_1.aByteArray38, 2);
						Static413.aClass1_Sub19_Sub2_1.anInt3698 = 0;
						Static379.anInt119 = Static413.aClass1_Sub19_Sub2_1.method2896();
					}
					if (Static337.aClass110_2.method3777(Static379.anInt119)) {
						Static337.aClass110_2.method3779(0, Static413.aClass1_Sub19_Sub2_1.aByteArray38, Static379.anInt119);
						Static413.aClass1_Sub19_Sub2_1.anInt3698 = 0;
						local209 = Static379.anInt119;
						Static372.anInt5995 = 0;
						Static447.method5752(15);
						Static82.method1008();
						Static348.method4537(Static413.aClass1_Sub19_Sub2_1);
						if (local209 != Static413.aClass1_Sub19_Sub2_1.anInt3698) {
							throw new RuntimeException("lswpr pos:" + Static413.aClass1_Sub19_Sub2_1.anInt3698 + " psize:" + local209);
						}
						Static425.aClass67_257 = null;
					}
				}
			} else if (Static337.aClass110_2.method3777(1)) {
				Static337.aClass110_2.method3779(0, Static413.aClass1_Sub19_Sub2_1.aByteArray38, 1);
				Static372.anInt5995 = 10;
				Static169.anInt5160 = Static413.aClass1_Sub19_Sub2_1.aByteArray38[0] & 0xFF;
			}
		} catch (@Pc(1480) IOException local1480) {
			if (Static337.aClass110_2 != null) {
				Static337.aClass110_2.method3781();
				Static337.aClass110_2 = null;
			}
			if (Static392.anInt6309 >= 1) {
				Static372.anInt5995 = 0;
				Static447.method5752(-4);
				Static384.method4938();
			} else {
				if (Static436.anInt6898 == 2 || Static436.anInt6898 == 3) {
					Static440.aClass112_6.aBoolean272 = !Static440.aClass112_6.aBoolean272;
				} else {
					Static335.aClass112_9.aBoolean272 = !Static335.aClass112_9.aBoolean272;
				}
				Static372.anInt5995 = 1;
				Static392.anInt6309++;
				Static63.anInt982 = 0;
			}
		}
	}
}
