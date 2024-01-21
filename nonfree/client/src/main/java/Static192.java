import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static192 {

	@OriginalMember(owner = "client!ui", name = "o", descriptor = "I")
	public static int anInt4179;

	@OriginalMember(owner = "client!ui", name = "q", descriptor = "I")
	public static int anInt4180;

	@OriginalMember(owner = "client!ui", name = "s", descriptor = "I")
	public static int anInt4181;

	@OriginalMember(owner = "client!ui", name = "e", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_1958 = Static187.method3089("Loading textures )2 ");

	@OriginalMember(owner = "client!ui", name = "d", descriptor = "Lclient!vd;")
	public static Class92 aClass92_1957 = aClass92_1958;

	@OriginalMember(owner = "client!ui", name = "m", descriptor = "Lclient!wd;")
	public static Class97 aClass97_22 = new Class97(512);

	@OriginalMember(owner = "client!ui", name = "p", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1959 = Static187.method3089("T");

	@OriginalMember(owner = "client!ui", name = "r", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1960 = Static187.method3089(" ");

	@OriginalMember(owner = "client!ui", name = "t", descriptor = "[Z")
	public static final boolean[] aBooleanArray17 = new boolean[8];

	@OriginalMember(owner = "client!ui", name = "u", descriptor = "Z")
	public static boolean aBoolean230 = false;

	@OriginalMember(owner = "client!ui", name = "v", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1961 = Static187.method3089("Verbindung mit Update)2Server)3)3)3");

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(II)I")
	public static int method3134(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIIII)V")
	public static void method3135(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(3) int local3 = arg0; local3 <= arg2; local3++) {
			Static74.method1123(arg4, arg1, Static142.anIntArrayArray25[local3], arg3);
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(B)V")
	public static void method3136() {
		Static18.aClass1_Sub14_Sub1_2.method3063();
		@Pc(18) int local18 = Static18.aClass1_Sub14_Sub1_2.method3070(8);
		@Pc(23) int local23;
		if (local18 < Static153.anInt3186) {
			for (local23 = local18; local23 < Static153.anInt3186; local23++) {
				Static38.anIntArray80[Static158.anInt3294++] = Static103.anIntArray167[local23];
			}
		}
		if (local18 > Static153.anInt3186) {
			throw new RuntimeException("gnpov1");
		}
		Static153.anInt3186 = 0;
		for (local23 = 0; local23 < local18; local23++) {
			@Pc(61) int local61 = Static103.anIntArray167[local23];
			@Pc(65) Class8_Sub3_Sub2 local65 = Static177.aClass8_Sub3_Sub2Array1[local61];
			@Pc(70) int local70 = Static18.aClass1_Sub14_Sub1_2.method3070(1);
			if (local70 == 0) {
				Static103.anIntArray167[Static153.anInt3186++] = local61;
				local65.anInt3595 = Static155.anInt2981;
			} else {
				@Pc(93) int local93 = Static18.aClass1_Sub14_Sub1_2.method3070(2);
				if (local93 == 0) {
					Static103.anIntArray167[Static153.anInt3186++] = local61;
					local65.anInt3595 = Static155.anInt2981;
					Static111.anIntArray183[Static147.anInt2991++] = local61;
				} else {
					@Pc(140) int local140;
					@Pc(150) int local150;
					if (local93 == 1) {
						Static103.anIntArray167[Static153.anInt3186++] = local61;
						local65.anInt3595 = Static155.anInt2981;
						local140 = Static18.aClass1_Sub14_Sub1_2.method3070(3);
						local65.method2677(false, local140);
						local150 = Static18.aClass1_Sub14_Sub1_2.method3070(1);
						if (local150 == 1) {
							Static111.anIntArray183[Static147.anInt2991++] = local61;
						}
					} else if (local93 == 2) {
						Static103.anIntArray167[Static153.anInt3186++] = local61;
						local65.anInt3595 = Static155.anInt2981;
						local140 = Static18.aClass1_Sub14_Sub1_2.method3070(3);
						local65.method2677(true, local140);
						local150 = Static18.aClass1_Sub14_Sub1_2.method3070(3);
						local65.method2677(true, local150);
						@Pc(206) int local206 = Static18.aClass1_Sub14_Sub1_2.method3070(1);
						if (local206 == 1) {
							Static111.anIntArray183[Static147.anInt2991++] = local61;
						}
					} else if (local93 == 3) {
						Static38.anIntArray80[Static158.anInt3294++] = local61;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(BI)I")
	public static int method3137(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIIIII)V")
	public static void method3138(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) int local10 = 2048 - arg0 & 0x7FF;
		@Pc(17) int local17 = 0;
		@Pc(24) int local24 = 2048 - arg4 & 0x7FF;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = arg3;
		@Pc(37) int local37;
		@Pc(41) int local41;
		@Pc(52) int local52;
		if (local24 != 0) {
			local37 = Class1_Sub3_Sub1_Sub4.anIntArray320[local24];
			local41 = Class1_Sub3_Sub1_Sub4.anIntArray317[local24];
			local52 = local41 * 0 - local37 * arg3 >> 16;
			local28 = arg3 * local41 + local37 * 0 >> 16;
			local26 = local52;
		}
		if (local10 != 0) {
			local41 = Class1_Sub3_Sub1_Sub4.anIntArray317[local10];
			local37 = Class1_Sub3_Sub1_Sub4.anIntArray320[local10];
			local52 = local41 * 0 + local28 * local37 >> 16;
			local28 = local28 * local41 - local37 * 0 >> 16;
			local17 = local52;
		}
		Static100.anInt2140 = arg2 - local28;
		Static186.anInt4074 = arg5 - local17;
		Static10.anInt243 = arg4;
		Static107.anInt2320 = arg1 - local26;
		Static47.anInt1197 = arg0;
	}

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "(BI)V")
	public static void method3139(@OriginalArg(1) int arg0) {
		@Pc(8) int[] local8 = Static141.aClass1_Sub3_Sub1_Sub1_4.anIntArray44;
		@Pc(11) int local11 = local8.length;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			local8[local13] = 1;
		}
		@Pc(39) int local39;
		@Pc(41) int local41;
		for (@Pc(25) int local25 = 1; local25 < 103; local25++) {
			local39 = (52736 - local25 * 512) * 4 + 24628;
			for (local41 = 1; local41 < 103; local41++) {
				if ((Static146.aByteArrayArrayArray33[arg0][local41][local25] & 0x18) == 0) {
					Static147.method2193(local8, local39, arg0, local41, local25);
				}
				if (arg0 < 3 && (Static146.aByteArrayArrayArray33[arg0 + 1][local41][local25] & 0x8) != 0) {
					Static147.method2193(local8, local39, arg0 + 1, local41, local25);
				}
				local39 += 4;
			}
		}
		local39 = ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (((int) (Math.random() * 20.0D)) + 228 << 16) + (int) (Math.random() * 20.0D) + 228;
		local41 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		Static141.aClass1_Sub3_Sub1_Sub1_4.method368();
		@Pc(158) int local158;
		for (@Pc(154) int local154 = 1; local154 < 103; local154++) {
			for (local158 = 1; local158 < 103; local158++) {
				if ((Static146.aByteArrayArrayArray33[arg0][local158][local154] & 0x18) == 0) {
					Static34.method620(local154, arg0, local158, local39, local41);
				}
				if (arg0 < 3 && (Static146.aByteArrayArrayArray33[arg0 + 1][local158][local154] & 0x8) != 0) {
					Static34.method620(local154, arg0 + 1, local158, local39, local41);
				}
			}
		}
		Static74.anInt1651 = 0;
		for (local158 = 0; local158 < 104; local158++) {
			for (@Pc(226) int local226 = 0; local226 < 104; local226++) {
				@Pc(233) long local233 = Static85.method1283(anInt4180, local158, local226);
				if (local233 != 0L) {
					@Pc(246) Class1_Sub3_Sub5 local246 = Static154.method2362((int) (local233 >>> 32) & Integer.MAX_VALUE);
					@Pc(249) int local249 = local246.anInt1412;
					if (local249 >= 0) {
						@Pc(256) int local256 = local158;
						@Pc(258) int local258 = local226;
						if (local249 != 22 && local249 != 29 && local249 != 34 && local249 != 36 && local249 != 46 && local249 != 47 && local249 != 48) {
							@Pc(290) int[][] local290 = Static98.aClass7Array1[anInt4180].anIntArrayArray4;
							for (@Pc(292) int local292 = 0; local292 < 10; local292++) {
								@Pc(299) int local299 = (int) (Math.random() * 4.0D);
								if (local299 == 0 && local256 > 0 && local158 - 3 < local256 && (local290[local256 - 1][local258] & 0x12C0108) == 0) {
									local256--;
								}
								if (local299 == 1 && local256 < 103 && local256 < local158 + 3 && (local290[local256 + 1][local258] & 0x12C0180) == 0) {
									local256++;
								}
								if (local299 == 2 && local258 > 0 && local226 - 3 < local258 && (local290[local256][local258 - 1] & 0x12C0102) == 0) {
									local258--;
								}
								if (local299 == 3 && local258 < 103 && local226 + 3 > local258 && (local290[local256][local258 + 1] & 0x12C0120) == 0) {
									local258++;
								}
							}
						}
						Static203.anIntArray362[Static74.anInt1651] = local246.anInt1389;
						Static10.anIntArray21[Static74.anInt1651] = local256;
						Static52.anIntArray92[Static74.anInt1651] = local258;
						Static74.anInt1651++;
					}
				}
			}
		}
		Static84.aClass22_1.method1659();
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3140(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg5 < 1 || arg4 < 1 || arg5 > 102 || arg4 > 102) {
			return;
		}
		if (Static111.aBoolean141 && anInt4180 != arg3) {
			return;
		}
		@Pc(29) int local29 = arg3;
		if (arg3 < 3 && (Static146.aByteArrayArrayArray33[1][arg5][arg4] & 0x2) == 2) {
			local29 = arg3 + 1;
		}
		Static153.method2348(arg4, local29, arg2, Static98.aClass7Array1[arg3], arg3, arg5);
		if (arg0 >= 0) {
			Static98.method1435(arg4, arg6, arg1, arg5, false, arg0, local29, Static98.aClass7Array1[arg3], arg3, false);
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IILjava/util/Random;)I")
	public static int method3141(@OriginalArg(1) int arg0, @OriginalArg(2) Random arg1) {
		if (arg0 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static138.method2069(arg0)) {
			return (int) (((long) arg1.nextInt() & 0xFFFFFFFFL) * (long) arg0 >> 32);
		} else {
			@Pc(33) int local33 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg0);
			@Pc(36) int local36;
			do {
				local36 = arg1.nextInt();
			} while (local36 >= local33);
			return Static72.method1108(arg0, local36);
		}
	}
}
