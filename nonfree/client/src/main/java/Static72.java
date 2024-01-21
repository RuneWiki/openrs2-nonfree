import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!jd", name = "Z", descriptor = "Lclient!pg;")
	public static Class59 aClass59_34 = new Class59();

	@OriginalMember(owner = "client!jd", name = "db", descriptor = "I")
	public static int anInt2200 = 0;

	@OriginalMember(owner = "client!jd", name = "ib", descriptor = "I")
	public static int anInt2205 = 0;

	@OriginalMember(owner = "client!jd", name = "lb", descriptor = "I")
	public static int anInt2208 = 0;

	@OriginalMember(owner = "client!jd", name = "mb", descriptor = "[I")
	public static int[] anIntArray196 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IB)V")
	public static void method1548(@OriginalArg(0) int arg0) {
		@Pc(4) int[] local4 = Static86.aClass1_Sub1_Sub8_Sub3_2.anIntArray203;
		@Pc(11) int local11 = local4.length;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			local4[local13] = 0;
		}
		@Pc(46) int local46;
		@Pc(48) int local48;
		for (@Pc(34) int local34 = 1; local34 < 103; local34++) {
			local46 = (52736 - local34 * 512) * 4 + 24628;
			for (local48 = 1; local48 < 103; local48++) {
				if ((Static2.aByteArrayArrayArray1[arg0][local48][local34] & 0x18) == 0) {
					Static87.aClass68_1.method2634(local4, local46, arg0, local48, local34);
				}
				if (arg0 < 3 && (Static2.aByteArrayArrayArray1[arg0 + 1][local48][local34] & 0x8) != 0) {
					Static87.aClass68_1.method2634(local4, local46, arg0 + 1, local48, local34);
				}
				local46 += 4;
			}
		}
		local46 = ((int) (Math.random() * 20.0D) + 228 << 8) + (((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D)) + 238 - 10);
		Static86.aClass1_Sub1_Sub8_Sub3_2.method1647();
		local48 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		@Pc(156) int local156;
		for (@Pc(152) int local152 = 1; local152 < 103; local152++) {
			for (local156 = 1; local156 < 103; local156++) {
				if ((Static2.aByteArrayArrayArray1[arg0][local156][local152] & 0x18) == 0) {
					Static161.method2990(local46, local48, local152, local156, arg0);
				}
				if (arg0 < 3 && (Static2.aByteArrayArrayArray1[arg0 + 1][local156][local152] & 0x8) != 0) {
					Static161.method2990(local46, local48, local152, local156, arg0 + 1);
				}
			}
		}
		Static59.anInt819 = 0;
		for (local156 = 0; local156 < 104; local156++) {
			for (@Pc(225) int local225 = 0; local225 < 104; local225++) {
				@Pc(233) int local233 = Static87.aClass68_1.method2617(Static9.anInt295, local156, local225);
				if (local233 != 0) {
					local233 = local233 >> 14 & 0x7FFF;
					@Pc(246) int local246 = Static62.method1274(local233).anInt2794;
					if (local246 >= 0) {
						@Pc(250) int local250 = local225;
						@Pc(252) int local252 = local156;
						if (local246 != 22 && local246 != 29 && local246 != 34 && local246 != 36 && local246 != 46 && local246 != 47 && local246 != 48) {
							@Pc(288) int[][] local288 = Static141.aClass22Array2[Static9.anInt295].anIntArrayArray45;
							for (@Pc(290) int local290 = 0; local290 < 10; local290++) {
								@Pc(297) int local297 = (int) (Math.random() * 4.0D);
								if (local297 == 0 && local252 > 0 && local252 > local156 - 3 && (local288[local252 - 1][local250] & 0x12C0108) == 0) {
									local252--;
								}
								if (local297 == 1 && local252 < 103 && local156 + 3 > local252 && (local288[local252 + 1][local250] & 0x12C0180) == 0) {
									local252++;
								}
								if (local297 == 2 && local250 > 0 && local225 - 3 < local250 && (local288[local252][local250 - 1] & 0x12C0102) == 0) {
									local250--;
								}
								if (local297 == 3 && local250 < 103 && local225 + 3 > local250 && (local288[local252][local250 + 1] & 0x12C0120) == 0) {
									local250++;
								}
							}
						}
						Static54.aClass1_Sub1_Sub8_Sub3Array3[Static59.anInt819] = Static121.aClass1_Sub1_Sub8_Sub3Array6[local246];
						Static157.anIntArray396[Static59.anInt819] = local252;
						Static163.anIntArray404[Static59.anInt819] = local250;
						Static59.anInt819++;
					}
				}
			}
		}
		Static52.aClass17_1.method1251();
	}

	@OriginalMember(owner = "client!jd", name = "i", descriptor = "(I)V")
	public static void method1549() {
		Static80.anInt2478 = 0;
		Static144.anInt4001 = -1;
		Static94.anInt2924 = -1;
		Static104.anInt3065 = -1;
		Static100.anInt2938 = -1;
		Static86.anInt2621 = 0;
		Static12.anInt4661 = 0;
		Static151.anInt4183 = 0;
		Static95.aClass1_Sub6_Sub1_1.anInt839 = 0;
		Static167.aClass1_Sub6_Sub1_3.anInt839 = 0;
		Static169.anInt4604 = 0;
		Static149.aBoolean185 = false;
		Static161.anInt4393 = 0;
		for (@Pc(39) int local39 = 0; local39 < Static153.aClass1_Sub1_Sub5_Sub1_Sub2Array1.length; local39++) {
			if (Static153.aClass1_Sub1_Sub5_Sub1_Sub2Array1[local39] != null) {
				Static153.aClass1_Sub1_Sub5_Sub1_Sub2Array1[local39].anInt3566 = -1;
			}
		}
		for (@Pc(57) int local57 = 0; local57 < Static91.aClass1_Sub1_Sub5_Sub1_Sub1Array1.length; local57++) {
			if (Static91.aClass1_Sub1_Sub5_Sub1_Sub1Array1[local57] != null) {
				Static91.aClass1_Sub1_Sub5_Sub1_Sub1Array1[local57].anInt3566 = -1;
			}
		}
		Static175.method3160();
		Static6.method107(30);
		for (@Pc(86) int local86 = 0; local86 < 100; local86++) {
			Static88.aBooleanArray8[local86] = true;
		}
	}

	@OriginalMember(owner = "client!jd", name = "j", descriptor = "(I)V")
	public static void method1550() {
		try {
			if (Static46.aClass24_38 == null) {
				Static46.aClass24_38 = new Class24(Static162.aClass53_4, Static144.method2735(new Class18[] { Static93.aClass18_729, Static62.aClass18_474, Static38.aClass18_289 }).method753());
			} else {
				@Pc(13) byte[] local13 = Static46.aClass24_38.method1135();
				if (local13 != null) {
					@Pc(20) Class1_Sub6 local20 = new Class1_Sub6(local13);
					Static98.anInt3023 = local20.method546();
					Static43.aClass57Array1 = new Class57[Static98.anInt3023];
					for (@Pc(31) int local31 = 0; local31 < Static98.anInt3023; local31++) {
						@Pc(41) Class57 local41 = Static43.aClass57Array1[local31] = new Class57();
						@Pc(45) int local45 = local20.method546();
						local41.aBoolean148 = (local45 & 0x8000) != 0;
						local41.anInt3376 = local45 & 0x7FFF;
						local41.aClass18_855 = local20.method510();
						local41.anInt3379 = local20.method497();
						local41.anInt3375 = local31;
						local41.anInt3377 = Static82.method1798(local41.aClass18_855);
					}
					Static149.method2809(Static65.anIntArray167, Static175.anIntArray427, 0, Static43.aClass57Array1.length - 1, Static43.aClass57Array1);
					Static46.aClass24_38 = null;
					Static124.aBoolean154 = true;
				}
			}
		} catch (@Pc(129) Exception local129) {
			local129.printStackTrace();
			Static46.aClass24_38 = null;
		}
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(B)V")
	public static void method1551() {
		aClass59_34 = null;
		anIntArray196 = null;
	}

	@OriginalMember(owner = "client!jd", name = "k", descriptor = "(I)Z")
	public static boolean method1552() {
		@Pc(13) long local13 = Static146.method2771();
		@Pc(19) int local19 = (int) (local13 - Static127.aLong106);
		Static127.aLong106 = local13;
		if (local19 > 200) {
			local19 = 200;
		}
		Static126.anInt3633 += local19;
		if (Static100.anInt2935 == 0 && Static78.anInt2403 == 0 && Static143.anInt3960 == 0 && Static88.anInt2735 == 0) {
			return true;
		} else if (Static97.aClass21_4 == null) {
			return false;
		} else {
			try {
				if (Static126.anInt3633 > 30000) {
					throw new IOException();
				}
				@Pc(64) Class1_Sub1_Sub13 local64;
				@Pc(69) Class1_Sub6 local69;
				while (Static78.anInt2403 < 20 && Static88.anInt2735 > 0) {
					local64 = (Class1_Sub1_Sub13) Static16.aClass14_1.method563();
					local69 = new Class1_Sub6(4);
					local69.method530(1);
					local69.method496((int) local64.aLong139);
					Static97.aClass21_4.method1024(local69.aByteArray3, 4);
					Static37.aClass14_3.method570(local64, local64.aLong139);
					Static88.anInt2735--;
					Static78.anInt2403++;
				}
				while (Static100.anInt2935 < 20 && Static143.anInt3960 > 0) {
					local64 = (Class1_Sub1_Sub13) Static10.aClass77_1.method2929();
					local69 = new Class1_Sub6(4);
					local69.method530(0);
					local69.method496((int) local64.aLong139);
					Static97.aClass21_4.method1024(local69.aByteArray3, 4);
					local64.method3147();
					Static114.aClass14_6.method570(local64, local64.aLong139);
					Static143.anInt3960--;
					Static100.anInt2935++;
				}
				for (@Pc(165) int local165 = 0; local165 < 100; local165++) {
					@Pc(171) int local171 = Static97.aClass21_4.method1026();
					if (local171 < 0) {
						throw new IOException();
					}
					if (local171 == 0) {
						break;
					}
					@Pc(184) byte local184 = 0;
					Static126.anInt3633 = 0;
					if (Static127.aClass1_Sub1_Sub13_1 == null) {
						local184 = 8;
					} else if (Static46.anInt4762 == 0) {
						local184 = 1;
					}
					@Pc(214) int local214;
					@Pc(206) int local206;
					@Pc(243) int local243;
					@Pc(320) int local320;
					if (local184 <= 0) {
						local206 = 512 - Static46.anInt4762;
						local214 = Static109.aClass1_Sub6_4.aByteArray3.length - Static127.aClass1_Sub1_Sub13_1.aByte5;
						if (local206 > local214 - Static109.aClass1_Sub6_4.anInt839) {
							local206 = local214 - Static109.aClass1_Sub6_4.anInt839;
						}
						if (local171 < local206) {
							local206 = local171;
						}
						Static97.aClass21_4.method1028(local206, Static109.aClass1_Sub6_4.anInt839, Static109.aClass1_Sub6_4.aByteArray3);
						if (Static153.aByte7 != 0) {
							for (local243 = 0; local243 < local206; local243++) {
								Static109.aClass1_Sub6_4.aByteArray3[local243 + Static109.aClass1_Sub6_4.anInt839] ^= Static153.aByte7;
							}
						}
						Static109.aClass1_Sub6_4.anInt839 += local206;
						Static46.anInt4762 += local206;
						if (local214 == Static109.aClass1_Sub6_4.anInt839) {
							if (Static127.aClass1_Sub1_Sub13_1.aLong139 == 16711935L) {
								Static144.aClass1_Sub6_5 = Static109.aClass1_Sub6_4;
								for (local243 = 0; local243 < 256; local243++) {
									@Pc(305) Class16_Sub1 local305 = Static21.aClass16_Sub1Array1[local243];
									if (local305 != null) {
										Static144.aClass1_Sub6_5.anInt839 = local243 * 8 + 5;
										local320 = Static144.aClass1_Sub6_5.method499();
										@Pc(324) int local324 = Static144.aClass1_Sub6_5.method499();
										local305.method2262(local320, local324);
									}
								}
							} else {
								Static21.aCRC32_1.reset();
								Static21.aCRC32_1.update(Static109.aClass1_Sub6_4.aByteArray3, 0, local214);
								local243 = (int) Static21.aCRC32_1.getValue();
								if (local243 != Static127.aClass1_Sub1_Sub13_1.anInt3516) {
									try {
										Static97.aClass21_4.method1029();
									} catch (@Pc(356) Exception local356) {
									}
									Static153.aByte7 = (byte) (Math.random() * 255.0D + 1.0D);
									Static178.anInt4739++;
									Static97.aClass21_4 = null;
									return false;
								}
								Static178.anInt4739 = 0;
								Static122.anInt3468 = 0;
								Static127.aClass1_Sub1_Sub13_1.aClass16_Sub1_39.method2260((int) (Static127.aClass1_Sub1_Sub13_1.aLong139 & 0xFFFFL), Static109.aClass1_Sub6_4.aByteArray3, (Static127.aClass1_Sub1_Sub13_1.aLong139 & 0xFF0000L) == 16711680L, Static45.aBoolean58);
							}
							Static127.aClass1_Sub1_Sub13_1.method3198();
							if (Static45.aBoolean58) {
								Static78.anInt2403--;
							} else {
								Static100.anInt2935--;
							}
							Static127.aClass1_Sub1_Sub13_1 = null;
							Static109.aClass1_Sub6_4 = null;
							Static46.anInt4762 = 0;
						} else {
							if (Static46.anInt4762 != 512) {
								break;
							}
							Static46.anInt4762 = 0;
						}
					} else {
						local214 = local184 - Static94.aClass1_Sub6_3.anInt839;
						if (local214 > local171) {
							local214 = local171;
						}
						Static97.aClass21_4.method1028(local214, Static94.aClass1_Sub6_3.anInt839, Static94.aClass1_Sub6_3.aByteArray3);
						if (Static153.aByte7 != 0) {
							for (local206 = 0; local206 < local214; local206++) {
								Static94.aClass1_Sub6_3.aByteArray3[local206 + Static94.aClass1_Sub6_3.anInt839] ^= Static153.aByte7;
							}
						}
						Static94.aClass1_Sub6_3.anInt839 += local214;
						if (local184 > Static94.aClass1_Sub6_3.anInt839) {
							break;
						}
						if (Static127.aClass1_Sub1_Sub13_1 == null) {
							Static94.aClass1_Sub6_3.anInt839 = 0;
							local206 = Static94.aClass1_Sub6_3.method544();
							local243 = Static94.aClass1_Sub6_3.method546();
							@Pc(514) int local514 = Static94.aClass1_Sub6_3.method544();
							@Pc(521) long local521 = (long) ((local206 << 16) + local243);
							local320 = Static94.aClass1_Sub6_3.method499();
							@Pc(531) Class1_Sub1_Sub13 local531 = (Class1_Sub1_Sub13) Static37.aClass14_3.method569(local521);
							Static45.aBoolean58 = true;
							if (local531 == null) {
								local531 = (Class1_Sub1_Sub13) Static114.aClass14_6.method569(local521);
								Static45.aBoolean58 = false;
							}
							if (local531 == null) {
								throw new IOException();
							}
							Static127.aClass1_Sub1_Sub13_1 = local531;
							@Pc(560) int local560 = local514 == 0 ? 5 : 9;
							Static109.aClass1_Sub6_4 = new Class1_Sub6(Static127.aClass1_Sub1_Sub13_1.aByte5 + local320 + local560);
							Static109.aClass1_Sub6_4.method530(local514);
							Static109.aClass1_Sub6_4.method513(local320);
							Static46.anInt4762 = 8;
							Static94.aClass1_Sub6_3.anInt839 = 0;
						} else if (Static46.anInt4762 == 0) {
							if (Static94.aClass1_Sub6_3.aByteArray3[0] == -1) {
								Static94.aClass1_Sub6_3.anInt839 = 0;
								Static46.anInt4762 = 1;
							} else {
								Static127.aClass1_Sub1_Sub13_1 = null;
							}
						}
					}
				}
				return true;
			} catch (@Pc(615) IOException local615) {
				try {
					Static97.aClass21_4.method1029();
				} catch (@Pc(620) Exception local620) {
				}
				Static97.aClass21_4 = null;
				Static122.anInt3468++;
				return false;
			}
		}
	}
}
