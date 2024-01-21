import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!hc", name = "e", descriptor = "[Lclient!e;")
	public static Class2_Sub1_Sub2_Sub2[] aClass2_Sub1_Sub2_Sub2Array7;

	@OriginalMember(owner = "client!hc", name = "o", descriptor = "I")
	public static int anInt1615;

	@OriginalMember(owner = "client!hc", name = "p", descriptor = "Lclient!a;")
	private static Class1 aClass1_1581 = Static94.method1596("Your account is already logged in)3");

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "Lclient!a;")
	public static Class1 aClass1_1577 = aClass1_1581;

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "Lclient!a;")
	private static Class1 aClass1_1578 = Static94.method1596("M");

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "[Lclient!ba;")
	public static Class2_Sub3[] aClass2_Sub3Array5 = new Class2_Sub3[2048];

	@OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
	public static int anInt1611 = 0;

	@OriginalMember(owner = "client!hc", name = "h", descriptor = "Lclient!a;")
	public static Class1 aClass1_1579 = Static94.method1596("Angreifen");

	@OriginalMember(owner = "client!hc", name = "k", descriptor = "Z")
	public static boolean aBoolean87 = false;

	@OriginalMember(owner = "client!hc", name = "l", descriptor = "Lclient!a;")
	public static Class1 aClass1_1580 = aClass1_1578;

	@OriginalMember(owner = "client!hc", name = "n", descriptor = "Z")
	public static boolean aBoolean88 = false;

	@OriginalMember(owner = "client!hc", name = "q", descriptor = "I")
	public static int anInt1616 = 0;

	@OriginalMember(owner = "client!hc", name = "r", descriptor = "[Z")
	public static boolean[] aBooleanArray11 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, true, false, false };

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V")
	public static void method1074() {
		aClass1_1581 = null;
		aClass1_1577 = null;
		aClass1_1579 = null;
		aClass2_Sub1_Sub2_Sub2Array7 = null;
		aClass2_Sub3Array5 = null;
		aClass1_1580 = null;
		aClass1_1578 = null;
		aBooleanArray11 = null;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(BI)V")
	public static void method1075(@OriginalArg(1) int arg0) {
		@Pc(8) int[] local8 = Static86.aClass2_Sub1_Sub2_Sub4_6.anIntArray170;
		@Pc(11) int local11 = local8.length;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			local8[local13] = 0;
		}
		@Pc(39) int local39;
		@Pc(41) int local41;
		for (@Pc(25) int local25 = 1; local25 < 103; local25++) {
			local39 = (52736 - local25 * 512) * 4 + 24628;
			for (local41 = 1; local41 < 103; local41++) {
				if ((Static29.aByteArrayArrayArray2[arg0][local41][local25] & 0x18) == 0) {
					Static109.aClass3_1.method128(local8, local39, arg0, local41, local25);
				}
				if (arg0 < 3 && (Static29.aByteArrayArrayArray2[arg0 + 1][local41][local25] & 0x8) != 0) {
					Static109.aClass3_1.method128(local8, local39, arg0 + 1, local41, local25);
				}
				local39 += 4;
			}
		}
		Static86.aClass2_Sub1_Sub2_Sub4_6.method1142();
		local39 = ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (((int) (Math.random() * 20.0D)) + 228 << 16) + (int) (Math.random() * 20.0D) + 238 - 10;
		local41 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		@Pc(154) int local154;
		for (@Pc(150) int local150 = 1; local150 < 103; local150++) {
			for (local154 = 1; local154 < 103; local154++) {
				if ((Static29.aByteArrayArrayArray2[arg0][local154][local150] & 0x18) == 0) {
					Static67.method1780(arg0, local154, local39, local41, local150);
				}
				if (arg0 < 3 && (Static29.aByteArrayArrayArray2[arg0 + 1][local154][local150] & 0x8) != 0) {
					Static67.method1780(arg0 + 1, local154, local39, local41, local150);
				}
			}
		}
		Static48.anInt1607 = 0;
		for (local154 = 0; local154 < 104; local154++) {
			for (@Pc(226) int local226 = 0; local226 < 104; local226++) {
				@Pc(234) int local234 = Static109.aClass3_1.method125(Static2.anInt287, local154, local226);
				if (local234 != 0) {
					local234 = local234 >> 14 & 0x7FFF;
					@Pc(247) int local247 = Static28.method739(local234).anInt1487;
					if (local247 >= 0) {
						@Pc(251) int local251 = local226;
						@Pc(253) int local253 = local154;
						if (local247 != 22 && local247 != 29 && local247 != 34 && local247 != 36 && local247 != 46 && local247 != 47 && local247 != 48) {
							@Pc(289) int[][] local289 = Static84.aClass5Array1[Static2.anInt287].anIntArrayArray3;
							for (@Pc(291) int local291 = 0; local291 < 10; local291++) {
								@Pc(298) int local298 = (int) (Math.random() * 4.0D);
								if (local298 == 0 && local253 > 0 && local253 > local154 - 3 && (local289[local253 - 1][local251] & 0x1280108) == 0) {
									local253--;
								}
								if (local298 == 1 && local253 < 103 && local253 < local154 + 3 && (local289[local253 + 1][local251] & 0x1280180) == 0) {
									local253++;
								}
								if (local298 == 2 && local251 > 0 && local251 > local226 - 3 && (local289[local253][local251 - 1] & 0x1280102) == 0) {
									local251--;
								}
								if (local298 == 3 && local251 < 103 && local226 + 3 > local251 && (local289[local253][local251 + 1] & 0x1280120) == 0) {
									local251++;
								}
							}
						}
						Static103.aClass2_Sub1_Sub2_Sub4Array12[Static48.anInt1607] = Static12.aClass2_Sub1_Sub2_Sub4Array13[local247];
						Static67.anIntArray345[Static48.anInt1607] = local253;
						Static76.anIntArray266[Static48.anInt1607] = local251;
						Static48.anInt1607++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(B)V")
	public static void method1081() {
		Static53.aClass4_40.method1527();
		Static73.aClass2_Sub1_Sub2_Sub2_19.method637(0, 0);
		Static8.anIntArray46 = Static24.method696(Static8.anIntArray46);
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!ba;II)Lclient!a;")
	public static Class1 method1083(@OriginalArg(0) Class2_Sub3 arg0) {
		try {
			@Pc(12) Class1 local12 = new Class1();
			local12.anInt23 = arg0.method825();
			if (local12.anInt23 > 32767) {
				local12.anInt23 = 32767;
			}
			local12.aByteArray1 = new byte[local12.anInt23];
			arg0.anInt1168 += Static79.aClass67_1.method1800(arg0.aByteArray7, local12.anInt23, 0, local12.aByteArray1, arg0.anInt1168);
			return local12;
		} catch (@Pc(53) Exception local53) {
			return Static60.aClass1_1849;
		}
	}

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "(I)V")
	public static void method1084() {
		Static1.method7(false, null, 0);
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(II)V")
	public static void method1085(@OriginalArg(1) int arg0) {
		Static42.anInt1435 = Static69.anInt2806;
		Static111.method1807();
		@Pc(14) int local14 = Static109.method1790(arg0).anInt2131;
		if (local14 == 0) {
			return;
		}
		@Pc(21) int local21 = Static94.anIntArray295[arg0];
		if (local14 == 1) {
			if (local21 == 1) {
				Static24.method699(0.9D);
				((Class38) Static24.anInterface4_1).method1313(0.9D);
			}
			if (local21 == 2) {
				Static24.method699(0.8D);
				((Class38) Static24.anInterface4_1).method1313(0.8D);
			}
			if (local21 == 3) {
				Static24.method699(0.7D);
				((Class38) Static24.anInterface4_1).method1313(0.7D);
			}
			if (local21 == 4) {
				Static24.method699(0.6D);
				((Class38) Static24.anInterface4_1).method1313(0.6D);
			}
			Static48.method1073();
			Static80.aBoolean119 = true;
		}
		if (local14 == 3) {
			@Pc(83) short local83 = 0;
			if (local21 == 0) {
				local83 = 255;
			}
			if (local21 == 1) {
				local83 = 192;
			}
			if (local21 == 2) {
				local83 = 128;
			}
			if (local21 == 3) {
				local83 = 64;
			}
			if (local21 == 4) {
				local83 = 0;
			}
			if (local83 != Static53.anInt1755) {
				if (Static53.anInt1755 == 0 && Static103.anInt2610 != -1) {
					Static60.method1287(0, Static103.anInt2610, local83, Static90.aClass8_Sub1_20);
					Static63.anInt1888 = 0;
				} else if (local83 == 0) {
					Static60.method1275();
					Static63.anInt1888 = 0;
				} else {
					Static69.method1819(local83);
				}
				Static53.anInt1755 = local83;
			}
		}
		if (local14 == 9) {
			Static72.anInt1977 = local21;
		}
		if (local14 == 10) {
			if (local21 == 0) {
				Static53.anInt1756 = 127;
			}
			if (local21 == 1) {
				Static53.anInt1756 = 96;
			}
			if (local21 == 2) {
				Static53.anInt1756 = 64;
			}
			if (local21 == 3) {
				Static53.anInt1756 = 32;
			}
			if (local21 == 4) {
				Static53.anInt1756 = 0;
			}
		}
		if (local14 == 8) {
			Static87.aBoolean137 = true;
			Static5.anInt403 = local21;
		}
		if (local14 == 4) {
			if (local21 == 0) {
				Static8.anInt510 = 127;
			}
			if (local21 == 1) {
				Static8.anInt510 = 96;
			}
			if (local21 == 2) {
				Static8.anInt510 = 64;
			}
			if (local21 == 3) {
				Static8.anInt510 = 32;
			}
			if (local21 == 4) {
				Static8.anInt510 = 0;
			}
		}
		if (local14 == 6) {
			Static14.anInt682 = local21;
		}
		if (local14 == 5) {
			Static113.anInt2241 = local21;
		}
	}
}
