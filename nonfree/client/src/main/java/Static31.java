import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "Lclient!pb;")
	public static Class31 aClass31_31;

	@OriginalMember(owner = "client!ga", name = "d", descriptor = "I")
	public static int anInt2249;

	@OriginalMember(owner = "client!ga", name = "g", descriptor = "Lclient!ge;")
	public static Class28 aClass28_5;

	@OriginalMember(owner = "client!ga", name = "h", descriptor = "Lclient!pb;")
	public static Class31 aClass31_32;

	@OriginalMember(owner = "client!ga", name = "t", descriptor = "I")
	public static int anInt2257;

	@OriginalMember(owner = "client!ga", name = "e", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1208 = Static23.method501("gr-Un:");

	@OriginalMember(owner = "client!ga", name = "j", descriptor = "I")
	public static int anInt2252 = 0;

	@OriginalMember(owner = "client!ga", name = "n", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1209 = Static23.method501("invback");

	@OriginalMember(owner = "client!ga", name = "w", descriptor = "Lclient!mc;")
	private static Class42 aClass42_1214 = Static23.method501("Loaded config");

	@OriginalMember(owner = "client!ga", name = "o", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1210 = aClass42_1214;

	@OriginalMember(owner = "client!ga", name = "q", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1211 = Static23.method501("@gr3@");

	@OriginalMember(owner = "client!ga", name = "r", descriptor = "[I")
	public static int[] anIntArray347 = new int[500];

	@OriginalMember(owner = "client!ga", name = "s", descriptor = "Lclient!mc;")
	private static Class42 aClass42_1212 = Static23.method501("Loaded sprites");

	@OriginalMember(owner = "client!ga", name = "u", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1213 = Static23.method501("Duell akzeptieren");

	@OriginalMember(owner = "client!ga", name = "y", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1215 = aClass42_1212;

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Z)V")
	public static void method1553() {
		Static45.aClass31_26.method996();
		Static62.aClass1_Sub1_Sub1_Sub4_15.method1147(0, 0);
		Static82.anIntArray335 = Static41.method689(Static82.anIntArray335);
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lclient!oe;I)V")
	public static synchronized void method1555(@OriginalArg(0) Class1_Sub12 arg0) {
		Static53.aClass1_Sub12_9 = arg0;
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(Z)V")
	public static void method1556() {
		aClass42_1209 = null;
		aClass42_1211 = null;
		aClass28_5 = null;
		aClass42_1215 = null;
		aClass42_1208 = null;
		anIntArray347 = null;
		aClass42_1213 = null;
		aClass31_32 = null;
		aClass31_31 = null;
		aClass42_1214 = null;
		aClass42_1210 = null;
		aClass42_1212 = null;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)Z")
	public static boolean method1557() {
		@Pc(3) long local3 = System.currentTimeMillis();
		@Pc(13) int local13 = (int) (local3 - Static48.aLong36);
		Static48.aLong36 = local3;
		if (local13 > 200) {
			local13 = 200;
		}
		Static8.anInt240 += local13;
		if (Static65.anInt1578 == 0 && Static37.anInt909 == 0 && Static11.anInt357 == 0 && Static9.anInt253 == 0) {
			return true;
		} else if (Static97.aClass47_29 == null) {
			return false;
		} else {
			try {
				if (Static8.anInt240 > 30000) {
					throw new IOException();
				}
				@Pc(64) Class1_Sub1_Sub13 local64;
				@Pc(69) Class1_Sub8 local69;
				while (Static37.anInt909 < 20 && Static9.anInt253 > 0) {
					local64 = (Class1_Sub1_Sub13) Static83.aClass41_5.method1024();
					local69 = new Class1_Sub8(4);
					local69.method1185(1);
					local69.method1225((int) local64.aLong83);
					Static97.aClass47_29.method1343(4, local69.aByteArray24);
					Static25.aClass41_3.method1019(local64.aLong83, local64);
					Static9.anInt253--;
					Static37.anInt909++;
				}
				while (Static65.anInt1578 < 20 && Static11.anInt357 > 0) {
					local64 = (Class1_Sub1_Sub13) Static13.aClass5_1.method106();
					local69 = new Class1_Sub8(4);
					local69.method1185(0);
					local69.method1225((int) local64.aLong83);
					Static97.aClass47_29.method1343(4, local69.aByteArray24);
					local64.method1828();
					Static19.aClass41_2.method1019(local64.aLong83, local64);
					Static11.anInt357--;
					Static65.anInt1578++;
				}
				for (@Pc(167) int local167 = 0; local167 < 100; local167++) {
					@Pc(173) int local173 = Static97.aClass47_29.method1335();
					if (local173 < 0) {
						throw new IOException();
					}
					if (local173 == 0) {
						break;
					}
					Static8.anInt240 = 0;
					@Pc(188) byte local188 = 0;
					if (Static5.aClass1_Sub1_Sub13_1 == null) {
						local188 = 8;
					} else if (Static27.anInt775 == 0) {
						local188 = 1;
					}
					@Pc(214) int local214;
					@Pc(219) int local219;
					@Pc(251) int local251;
					@Pc(322) int local322;
					if (local188 <= 0) {
						local214 = Static90.aClass1_Sub8_5.aByteArray24.length - Static5.aClass1_Sub1_Sub13_1.aByte3;
						local219 = 512 - Static27.anInt775;
						if (local219 > local214 - Static90.aClass1_Sub8_5.anInt1692) {
							local219 = local214 - Static90.aClass1_Sub8_5.anInt1692;
						}
						if (local219 > local173) {
							local219 = local173;
						}
						Static97.aClass47_29.method1342(Static90.aClass1_Sub8_5.anInt1692, Static90.aClass1_Sub8_5.aByteArray24, local219);
						if (Static34.aByte2 != 0) {
							for (local251 = 0; local251 < local219; local251++) {
								Static90.aClass1_Sub8_5.aByteArray24[local251 + Static90.aClass1_Sub8_5.anInt1692] ^= Static34.aByte2;
							}
						}
						Static90.aClass1_Sub8_5.anInt1692 += local219;
						Static27.anInt775 += local219;
						if (local214 == Static90.aClass1_Sub8_5.anInt1692) {
							if (Static5.aClass1_Sub1_Sub13_1.aLong83 == 16711935L) {
								Static67.aClass1_Sub8_1 = Static90.aClass1_Sub8_5;
								for (local251 = 0; local251 < 256; local251++) {
									@Pc(309) Class33_Sub1 local309 = Static15.aClass33_Sub1Array1[local251];
									if (local309 != null) {
										Static67.aClass1_Sub8_1.anInt1692 = local251 * 4 + 5;
										local322 = Static67.aClass1_Sub8_1.method1188();
										local309.method1327(local322);
									}
								}
							} else {
								Static65.aCRC32_4.reset();
								Static65.aCRC32_4.update(Static90.aClass1_Sub8_5.aByteArray24, 0, local214);
								local251 = (int) Static65.aCRC32_4.getValue();
								if (local251 != Static5.aClass1_Sub1_Sub13_1.anInt2239) {
									try {
										Static97.aClass47_29.method1338();
									} catch (@Pc(357) Exception local357) {
									}
									Static34.aByte2 = (byte) (Math.random() * 255.0D + 1.0D);
									Static5.anInt129++;
									Static97.aClass47_29 = null;
									return false;
								}
								Static5.anInt129 = 0;
								Static58.anInt1442 = 0;
								Static5.aClass1_Sub1_Sub13_1.aClass33_Sub1_17.method1333((Static5.aClass1_Sub1_Sub13_1.aLong83 & 0xFF0000L) == 16711680L, Static90.aClass1_Sub8_5.aByteArray24, (int) (Static5.aClass1_Sub1_Sub13_1.aLong83 & 0xFFFFL), Static63.aBoolean89);
							}
							Static5.aClass1_Sub1_Sub13_1.method1825();
							Static90.aClass1_Sub8_5 = null;
							Static5.aClass1_Sub1_Sub13_1 = null;
							Static27.anInt775 = 0;
							if (Static63.aBoolean89) {
								Static37.anInt909--;
							} else {
								Static65.anInt1578--;
							}
						} else {
							if (Static27.anInt775 != 512) {
								break;
							}
							Static27.anInt775 = 0;
						}
					} else {
						local214 = local188 - Static87.aClass1_Sub8_4.anInt1692;
						if (local214 > local173) {
							local214 = local173;
						}
						Static97.aClass47_29.method1342(Static87.aClass1_Sub8_4.anInt1692, Static87.aClass1_Sub8_4.aByteArray24, local214);
						if (Static34.aByte2 != 0) {
							for (local219 = 0; local219 < local214; local219++) {
								Static87.aClass1_Sub8_4.aByteArray24[local219 + Static87.aClass1_Sub8_4.anInt1692] ^= Static34.aByte2;
							}
						}
						Static87.aClass1_Sub8_4.anInt1692 += local214;
						if (Static87.aClass1_Sub8_4.anInt1692 < local188) {
							break;
						}
						if (Static5.aClass1_Sub1_Sub13_1 == null) {
							Static87.aClass1_Sub8_4.anInt1692 = 0;
							local219 = Static87.aClass1_Sub8_4.method1186();
							local251 = Static87.aClass1_Sub8_4.method1199();
							@Pc(516) long local516 = (long) ((local219 << 16) + local251);
							@Pc(520) int local520 = Static87.aClass1_Sub8_4.method1186();
							local322 = Static87.aClass1_Sub8_4.method1188();
							@Pc(532) Class1_Sub1_Sub13 local532 = (Class1_Sub1_Sub13) Static25.aClass41_3.method1020(local516);
							Static63.aBoolean89 = true;
							if (local532 == null) {
								local532 = (Class1_Sub1_Sub13) Static19.aClass41_2.method1020(local516);
								Static63.aBoolean89 = false;
							}
							if (local532 == null) {
								throw new IOException();
							}
							Static5.aClass1_Sub1_Sub13_1 = local532;
							@Pc(563) int local563 = local520 == 0 ? 5 : 9;
							Static90.aClass1_Sub8_5 = new Class1_Sub8(Static5.aClass1_Sub1_Sub13_1.aByte3 + local563 + local322);
							Static90.aClass1_Sub8_5.method1185(local520);
							Static90.aClass1_Sub8_5.method1218(local322);
							Static27.anInt775 = 8;
							Static87.aClass1_Sub8_4.anInt1692 = 0;
						} else if (Static27.anInt775 == 0) {
							if (Static87.aClass1_Sub8_4.aByteArray24[0] == -1) {
								Static27.anInt775 = 1;
								Static87.aClass1_Sub8_4.anInt1692 = 0;
							} else {
								Static5.aClass1_Sub1_Sub13_1 = null;
							}
						}
					}
				}
				return true;
			} catch (@Pc(613) IOException local613) {
				try {
					Static97.aClass47_29.method1338();
				} catch (@Pc(620) Exception local620) {
				}
				Static58.anInt1442++;
				Static97.aClass47_29 = null;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(ZLclient!ka;)Lclient!mc;")
	public static Class42 method1558(@OriginalArg(1) Class1_Sub8 arg0) {
		return Static7.method163(arg0);
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(II)V")
	public static synchronized void method1560() {
		if (Static53.aClass1_Sub12_9 != null) {
			Static53.aClass1_Sub12_9.method1785(256);
		}
		Static10.method248(256);
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(I)V")
	public static void method1561() {
		@Pc(16) int local16 = Static80.aClass1_Sub8_Sub1_2.method1238(8);
		@Pc(25) int local25;
		if (Static27.anInt770 > local16) {
			for (local25 = local16; local25 < Static27.anInt770; local25++) {
				Static64.anIntArray224[Static93.anInt2456++] = Static68.anIntArray240[local25];
			}
		}
		if (Static27.anInt770 < local16) {
			throw new RuntimeException("gppov1");
		}
		Static27.anInt770 = 0;
		for (local25 = 0; local25 < local16; local25++) {
			@Pc(57) int local57 = Static68.anIntArray240[local25];
			@Pc(61) Class1_Sub1_Sub8_Sub1_Sub2 local61 = Static33.aClass1_Sub1_Sub8_Sub1_Sub2Array1[local57];
			@Pc(68) int local68 = Static80.aClass1_Sub8_Sub1_2.method1238(1);
			if (local68 == 0) {
				Static68.anIntArray240[Static27.anInt770++] = local57;
				local61.anInt2559 = Static27.anInt768;
			} else {
				@Pc(87) int local87 = Static80.aClass1_Sub8_Sub1_2.method1238(2);
				if (local87 == 0) {
					Static68.anIntArray240[Static27.anInt770++] = local57;
					local61.anInt2559 = Static27.anInt768;
					Static77.anIntArray313[Static63.anInt1520++] = local57;
				} else {
					@Pc(130) int local130;
					@Pc(140) int local140;
					if (local87 == 1) {
						Static68.anIntArray240[Static27.anInt770++] = local57;
						local61.anInt2559 = Static27.anInt768;
						local130 = Static80.aClass1_Sub8_Sub1_2.method1238(3);
						local61.method1758(local130, false);
						local140 = Static80.aClass1_Sub8_Sub1_2.method1238(1);
						if (local140 == 1) {
							Static77.anIntArray313[Static63.anInt1520++] = local57;
						}
					} else if (local87 == 2) {
						Static68.anIntArray240[Static27.anInt770++] = local57;
						local61.anInt2559 = Static27.anInt768;
						local130 = Static80.aClass1_Sub8_Sub1_2.method1238(3);
						local61.method1758(local130, true);
						local140 = Static80.aClass1_Sub8_Sub1_2.method1238(3);
						local61.method1758(local140, true);
						@Pc(197) int local197 = Static80.aClass1_Sub8_Sub1_2.method1238(1);
						if (local197 == 1) {
							Static77.anIntArray313[Static63.anInt1520++] = local57;
						}
					} else if (local87 == 3) {
						Static64.anIntArray224[Static93.anInt2456++] = local57;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "([II)V")
	public static synchronized void method1562(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(2) int local2 = arg1 - 7;
		while (local1 < local2) {
			arg0[local1++] = 0;
			arg0[local1++] = 0;
			arg0[local1++] = 0;
			arg0[local1++] = 0;
			arg0[local1++] = 0;
			arg0[local1++] = 0;
			arg0[local1++] = 0;
			arg0[local1++] = 0;
		}
		local2 += 7;
		while (local1 < local2) {
			arg0[local1++] = 0;
		}
		if (Static53.aClass1_Sub12_9 != null) {
			Static53.aClass1_Sub12_9.method1786(arg0, 0, local2);
		}
		Static10.method248(local2);
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(BI)V")
	public static void method1563(@OriginalArg(1) int arg0) {
		@Pc(4) int[] local4 = Static89.aClass1_Sub1_Sub1_Sub1_12.anIntArray12;
		@Pc(7) int local7 = local4.length;
		for (@Pc(9) int local9 = 0; local9 < local7; local9++) {
			local4[local9] = 0;
		}
		@Pc(33) int local33;
		@Pc(35) int local35;
		for (@Pc(21) int local21 = 1; local21 < 103; local21++) {
			local33 = (52736 - local21 * 512) * 4 + 24628;
			for (local35 = 1; local35 < 103; local35++) {
				if ((Static61.aByteArrayArrayArray7[arg0][local35][local21] & 0x18) == 0) {
					Static88.aClass20_1.method468(local4, local33, arg0, local35, local21);
				}
				if (arg0 < 3 && (Static61.aByteArrayArrayArray7[arg0 + 1][local35][local21] & 0x8) != 0) {
					Static88.aClass20_1.method468(local4, local33, arg0 + 1, local35, local21);
				}
				local33 += 4;
			}
		}
		Static89.aClass1_Sub1_Sub1_Sub1_12.method85();
		local33 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + -10 + 238 << 16) + ((int) (Math.random() * 20.0D) + -10 + 238 << 8) + 238 - 10;
		local35 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		@Pc(156) int local156;
		for (@Pc(152) int local152 = 1; local152 < 103; local152++) {
			for (local156 = 1; local156 < 103; local156++) {
				if ((Static61.aByteArrayArrayArray7[arg0][local156][local152] & 0x18) == 0) {
					Static30.method570(local35, arg0, local156, local152, local33);
				}
				if (arg0 < 3 && (Static61.aByteArrayArrayArray7[arg0 + 1][local156][local152] & 0x8) != 0) {
					Static30.method570(local35, arg0 + 1, local156, local152, local33);
				}
			}
		}
		Static91.anInt2399 = 0;
		for (local156 = 0; local156 < 104; local156++) {
			for (@Pc(220) int local220 = 0; local220 < 104; local220++) {
				@Pc(228) int local228 = Static88.aClass20_1.method481(Static82.anInt2165, local156, local220);
				if (local228 != 0) {
					local228 = local228 >> 14 & 0x7FFF;
					@Pc(241) int local241 = Static42.method1755(local228).anInt1270;
					if (local241 >= 0) {
						@Pc(245) int local245 = local220;
						@Pc(247) int local247 = local156;
						if (local241 != 22 && local241 != 29 && local241 != 34 && local241 != 36 && local241 != 46 && local241 != 47 && local241 != 48) {
							@Pc(279) int[][] local279 = Static91.aClass6Array1[Static82.anInt2165].anIntArrayArray1;
							for (@Pc(281) int local281 = 0; local281 < 10; local281++) {
								@Pc(288) int local288 = (int) (Math.random() * 4.0D);
								if (local288 == 0 && local247 > 0 && local156 - 3 < local247 && (local279[local247 - 1][local245] & 0x1280108) == 0) {
									local247--;
								}
								if (local288 == 1 && local247 < 103 && local247 < local156 + 3 && (local279[local247 + 1][local245] & 0x1280180) == 0) {
									local247++;
								}
								if (local288 == 2 && local245 > 0 && local245 > local220 - 3 && (local279[local247][local245 - 1] & 0x1280102) == 0) {
									local245--;
								}
								if (local288 == 3 && local245 < 103 && local245 < local220 + 3 && (local279[local247][local245 + 1] & 0x1280120) == 0) {
									local245++;
								}
							}
						}
						Static15.aClass1_Sub1_Sub1_Sub1Array7[Static91.anInt2399] = Static108.aClass1_Sub1_Sub1_Sub1Array47[local241];
						Static57.anIntArray400[Static91.anInt2399] = local247;
						Static27.anIntArray89[Static91.anInt2399] = local245;
						Static91.anInt2399++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "(I)Lclient!jc;")
	public static Class7 method1564() {
		try {
			return (Class7) Class.forName("Class7_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(15) Throwable local15) {
			return new Class7_Sub2();
		}
	}
}
