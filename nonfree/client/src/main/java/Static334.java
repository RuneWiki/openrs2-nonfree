import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static334 {

	@OriginalMember(owner = "client!vn", name = "f", descriptor = "I")
	public static int anInt6369;

	@OriginalMember(owner = "client!vn", name = "k", descriptor = "Lclient!qj;")
	public static Class165 aClass165_102;

	@OriginalMember(owner = "client!vn", name = "l", descriptor = "Lclient!qj;")
	public static Class165 aClass165_103;

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "I")
	public static int anInt6366 = -1;

	@OriginalMember(owner = "client!vn", name = "g", descriptor = "I")
	public static int anInt6370 = 0;

	@OriginalMember(owner = "client!vn", name = "h", descriptor = "Z")
	public static boolean aBoolean559 = false;

	@OriginalMember(owner = "client!vn", name = "j", descriptor = "[[S")
	public static final short[][] aShortArrayArray9 = new short[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 24, 44, 64, 84, 104, 304, 678, 698, 550, 934, 954, 6448, 6946, 6966, 2352, 2726, 2746, 10544, 10918, 10938, 10304, 10550, 10570, 14640, 15014, 15034, 19760, 20134, 20154, -29392, -29018, -28998, 31024, 31270, 31290, -24272, -23898, -23878, -19152, -18778, -18758, -14032, -13658, -13638, -6864, -6490, -6470, 516, 536, 6788, 6808, 11012, 11032, 14980, 15000, 21124, 21144, -28924, -28904, -22012, -21992, -12924, -12904 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10339, 10574, 10425, 10398, 10345, 7512, 8507, 7378, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 24, 44, 64, 84, 104, 304, 678, 698, 550, 934, 954, 6448, 6946, 6966, 2352, 2726, 2746, 10544, 10918, 10938, 10304, 10550, 10570, 14640, 15014, 15034, 19760, 20134, 20154, -29392, -29018, -28998, 31024, 31270, 31290, -24272, -23898, -23878, -19152, -18778, -18758, -14032, -13658, -13638, -6864, -6490, -6470, 516, 536, 6788, 6808, 11012, 11032, 14980, 15000, 21124, 21144, -28924, -28904, -22012, -21992, -12924, -12904 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 13753, 13737, 13719, 13883, 13863, 13974, 19643, 18601, 16532, 23993, 25121, 24980, 26944, 26921, 24854, 27191, 27171, 26130, 26941, 28696, 30100, 12477, 10407, 10388, 10685, 10665, 10646, 6711, 6693, 6674, 6965, 7073, 7056, 2361, 4387, 3346, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 24, 44, 64, 84, 104, 304, 678, 698, 550, 934, 954, 6448, 6946, 6966, 2352, 2726, 2746, 10544, 10918, 10938, 10304, 10550, 10570, 14640, 15014, 15034, 19760, 20134, 20154, -29392, -29018, -28998, 31024, 31270, 31290, -24272, -23898, -23878, -19152, -18778, -18758, -14032, -13658, -13638, -6864, -6490, -6470, 516, 536, 6788, 6808, 11012, 11032, 14980, 15000, 21124, 21144, -28924, -28904, -22012, -21992, -12924, -12904 } };

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(Lclient!jk;III)V")
	public static void method5570(@OriginalArg(0) Class82 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7 = Static116.anIntArrayArrayArray7[arg1][arg2][arg3];
		@Pc(9) int local9 = 0;
		arg0.anInt2459 = 0;
		@Pc(19) int local19;
		while (local9 <= 24) {
			local19 = local7 >> local9 & 0xFF;
			if (local19 <= 0) {
				break;
			}
			arg0.aClass1_Sub31_Sub1Array2[arg0.anInt2459++] = Static327.aClass1_Sub31_Sub1Array3[local19 - 1];
			local9 += 8;
		}
		for (local19 = arg0.anInt2459; local19 < 4; local19++) {
			arg0.aClass1_Sub31_Sub1Array2[local19] = null;
		}
	}

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "(I)V")
	public static void method5571() {
		for (@Pc(7) int local7 = 0; local7 < Static125.anInt2470; local7++) {
			@Pc(13) int local13 = Static320.anIntArray768[local7];
			@Pc(17) Class5_Sub3_Sub3_Sub2 local17 = Static169.aClass5_Sub3_Sub3_Sub2Array2[local13];
			@Pc(21) int local21 = Static232.aClass1_Sub7_Sub1_4.method3141();
			if ((local21 & 0x8) != 0) {
				local21 += Static232.aClass1_Sub7_Sub1_4.method3141() << 8;
			}
			if ((local21 & 0x2) != 0) {
				local17.anInt4964 = Static232.aClass1_Sub7_Sub1_4.method3101();
				if (local17.anInt4964 == 65535) {
					local17.anInt4964 = -1;
				}
			}
			@Pc(63) int local63;
			@Pc(80) int local80;
			if ((local21 & 0x100) != 0) {
				local63 = Static232.aClass1_Sub7_Sub1_4.method3094();
				@Pc(66) int[] local66 = new int[local63];
				@Pc(69) int[] local69 = new int[local63];
				@Pc(72) int[] local72 = new int[local63];
				for (@Pc(74) int local74 = 0; local74 < local63; local74++) {
					local80 = Static232.aClass1_Sub7_Sub1_4.method3115();
					if (local80 == 65535) {
						local80 = -1;
					}
					local66[local74] = local80;
					local69[local74] = Static232.aClass1_Sub7_Sub1_4.method3112();
					local72[local74] = Static232.aClass1_Sub7_Sub1_4.method3101();
				}
				Static81.method1558(local66, local69, local72, local17);
			}
			if ((local21 & 0x400) != 0) {
				local63 = Static232.aClass1_Sub7_Sub1_4.method3147();
				local17.anInt4943 = Static232.aClass1_Sub7_Sub1_4.method3100();
				local17.anInt4967 = Static232.aClass1_Sub7_Sub1_4.method3112();
				local17.anInt4974 = local63 & 0x7FFF;
				local17.aBoolean415 = (local63 & 0x8000) != 0;
				local17.anInt4917 = local17.anInt4974 + Static215.anInt4246 + local17.anInt4943;
			}
			@Pc(170) int local170;
			if ((local21 & 0x20) != 0) {
				local63 = Static232.aClass1_Sub7_Sub1_4.method3145();
				local170 = Static232.aClass1_Sub7_Sub1_4.method3112();
				local17.method4546(Static215.anInt4246, local170, local63);
				local17.anInt4926 = Static215.anInt4246 + 300;
				local17.anInt4962 = Static232.aClass1_Sub7_Sub1_4.method3100();
			}
			if ((local21 & 0x80) != 0) {
				local63 = Static232.aClass1_Sub7_Sub1_4.method3145();
				local170 = Static232.aClass1_Sub7_Sub1_4.method3094();
				local17.method4546(Static215.anInt4246, local170, local63);
			}
			if ((local21 & 0x10) != 0) {
				local17.aString199 = Static232.aClass1_Sub7_Sub1_4.method3134();
				local17.anInt4945 = 100;
			}
			if ((local21 & 0x200) != 0) {
				local17.anInt4968 = Static232.aClass1_Sub7_Sub1_4.method3147();
				local17.anInt4914 = Static232.aClass1_Sub7_Sub1_4.method3144();
			}
			if ((local21 & 0x1) != 0) {
				if (local17.aClass122_1.method3570()) {
					Static235.method4218(local17);
				}
				local17.method4549(Static232.method5539(Static232.aClass1_Sub7_Sub1_4.method3147()));
				local17.method4531(local17.aClass122_1.anInt3819);
				local17.anInt4935 = local17.aClass122_1.anInt3790 << 3;
				if (local17.aClass122_1.method3570()) {
					Static222.method4056(local17.anIntArray637[0], local17, Static285.anInt5511, 0, null, local17.anIntArray638[0], null);
				}
			}
			if ((local21 & 0x40) != 0) {
				local63 = Static232.aClass1_Sub7_Sub1_4.method3115();
				if (local63 == 65535) {
					local63 = -1;
				}
				local170 = Static232.aClass1_Sub7_Sub1_4.method3141();
				Static264.method4808(local17, local170, local63);
			}
			if ((local21 & 0x4) != 0) {
				local63 = Static232.aClass1_Sub7_Sub1_4.method3147();
				if (local63 == 65535) {
					local63 = -1;
				}
				local170 = Static232.aClass1_Sub7_Sub1_4.method3125();
				@Pc(344) boolean local344 = true;
				@Pc(412) Class121 local412;
				if (local63 != -1 && local17.anInt4934 != -1) {
					@Pc(359) Class125 local359;
					if (local63 == local17.anInt4934) {
						local359 = Static183.method3571(local63);
						if (local359.aBoolean335 && local359.anInt3913 != -1) {
							local412 = Static133.method2520(local359.anInt3913);
							local80 = local412.anInt3780;
							if (local80 == 0) {
								local344 = false;
							} else if (local80 == 1) {
								local344 = true;
							} else if (local80 == 2) {
								local17.anInt4922 = 0;
								local344 = false;
							}
						}
					} else {
						local359 = Static183.method3571(local63);
						@Pc(364) Class125 local364 = Static183.method3571(local17.anInt4934);
						if (local359.anInt3913 != -1 && local364.anInt3913 != -1) {
							@Pc(377) Class121 local377 = Static133.method2520(local359.anInt3913);
							@Pc(382) Class121 local382 = Static133.method2520(local364.anInt3913);
							if (local377.anInt3772 < local382.anInt3772) {
								local344 = false;
							}
						}
					}
				}
				if (local344) {
					local17.anInt4976 = 0;
					local17.anInt4934 = local63;
					local17.anInt4958 = local170 >> 16;
					local17.anInt4951 = (local170 & 0xFFFF) + Static215.anInt4246;
					local17.anInt4972 = 1;
					local17.anInt4979 = 0;
					if (Static215.anInt4246 < local17.anInt4951) {
						local17.anInt4979 = -1;
					}
					if (local17.anInt4934 != -1 && local17.anInt4951 == Static215.anInt4246) {
						@Pc(499) int local499 = Static183.method3571(local17.anInt4934).anInt3913;
						if (local499 != -1) {
							local412 = Static133.method2520(local499);
							if (local412 != null && local412.anIntArray446 != null) {
								Static131.method2490(false, local412, 0, local17.anInt5047, local17.anInt5050);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(B)V")
	public static void method5572() {
		if (Static325.anInt4689 != 0) {
			Static214.anInt4240 -= Static325.anInt4689 * 5;
			if (Static107.anInt2184 <= Static214.anInt4240) {
				Static214.anInt4240 = Static107.anInt2184 - 1;
			} else if (Static214.anInt4240 < 0) {
				Static214.anInt4240 = 0;
			}
			Static325.anInt4689 = 0;
		}
		if (Static29.anInt762 < 102) {
			Static29.anInt762 += 6;
		}
		@Pc(58) int local58;
		for (@Pc(52) int local52 = 0; local52 < Static184.anInt3829; local52++) {
			local58 = Static81.anIntArray185[local52];
			@Pc(63) char local63 = (char) Static184.anIntArray454[local52];
			if (local58 == 84) {
				Static234.method4209();
			} else if (Static220.aBooleanArray24[82] && local58 == 66) {
				if (Static43.aClipboard3 != null) {
					@Pc(356) String local356 = "";
					for (@Pc(361) int local361 = Static204.aStringArray29.length - 1; local361 >= 0; local361--) {
						if (Static204.aStringArray29[local361] != null && Static204.aStringArray29[local361].length() > 0) {
							local356 = local356 + Static204.aStringArray29[local361] + '\n';
						}
					}
					Static43.aClipboard3.setContents(new StringSelection(local356), null);
				}
			} else if (Static220.aBooleanArray24[82] && local58 == 67) {
				if (Static43.aClipboard3 != null) {
					@Pc(92) Transferable local92 = Static43.aClipboard3.getContents(null);
					if (local92 != null) {
						try {
							@Pc(99) String local99 = (String) local92.getTransferData(DataFlavor.stringFlavor);
							if (local99 != null) {
								@Pc(106) String[] local106 = Static62.method1317(local99, '\n');
								if (local106.length > 1) {
									for (@Pc(112) int local112 = 0; local112 < local106.length; local112++) {
										Static29.aString22 = local106[local112];
										Static234.method4209();
									}
								} else {
									Static29.aString22 = Static29.aString22 + local99;
								}
							}
						} catch (@Pc(142) Exception local142) {
						}
					}
				}
			} else if (local58 == 85 && Static157.anInt3135 > 0) {
				Static29.aString22 = Static29.aString22.substring(0, Static157.anInt3135 - 1) + Static29.aString22.substring(Static157.anInt3135);
				Static157.anInt3135--;
			} else if (local58 == 101 && Static157.anInt3135 < Static29.aString22.length()) {
				Static29.aString22 = Static29.aString22.substring(0, Static157.anInt3135) + Static29.aString22.substring(Static157.anInt3135 + 1);
			} else if (local58 == 96 && Static157.anInt3135 > 0) {
				Static157.anInt3135--;
			} else if (local58 == 97 && Static157.anInt3135 < Static29.aString22.length()) {
				Static157.anInt3135++;
			} else if (local58 == 102) {
				Static157.anInt3135 = 0;
			} else if (local58 == 103) {
				Static157.anInt3135 = Static29.aString22.length();
			} else if (local58 == 104 && Static204.aStringArray29.length > Static157.anInt3130) {
				Static157.anInt3130++;
				Static7.method244();
				Static157.anInt3135 = Static29.aString22.length();
			} else if (local58 == 105 && Static157.anInt3130 > 0) {
				Static157.anInt3130--;
				Static7.method244();
				Static157.anInt3135 = Static29.aString22.length();
			} else if (Static88.method1695(local63) || local63 == ':' || local63 == ',' || local63 == ' ' || local63 == '_' || local63 == '-' || local63 == '+') {
				Static29.aString22 = Static29.aString22.substring(0, Static157.anInt3135) + (char) Static184.anIntArray454[local52] + Static29.aString22.substring(Static157.anInt3135);
				Static157.anInt3135++;
			}
		}
		Static184.anInt3829 = 0;
		for (local58 = 0; local58 < 100; local58++) {
			@Pc(420) int local420;
			if (Static89.aBooleanArray6[local58]) {
				local420 = Static152.anIntArray351[local58]++;
				if (Static152.anIntArray351[local58] > 102) {
					Static89.aBooleanArray6[local58] = false;
				}
			} else {
				local420 = Static152.anIntArray351[local58]--;
				if (Static152.anIntArray351[local58] < 0) {
					Static177.anIntArray430[local58] = (int) (Math.random() * (double) Static11.anInt5389);
					Static79.anIntArray426[local58] = (int) (Math.random() * 350.0D);
					Static152.anIntArray351[local58] = 0;
					Static89.aBooleanArray6[local58] = true;
				}
			}
		}
		Static228.method4134();
	}

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "(B)V")
	public static void method5573() {
		@Pc(7) Class99 local7 = null;
		try {
			@Pc(16) Class134 local16 = Static180.aClass110_6.method3356();
			while (local16.anInt4033 == 0) {
				Static134.method2598(1L);
			}
			if (local16.anInt4033 == 1) {
				local7 = (Class99) local16.anObject6;
				@Pc(41) byte[] local41 = new byte[(int) local7.method2722()];
				@Pc(56) int local56;
				for (@Pc(43) int local43 = 0; local43 < local41.length; local43 += local56) {
					local56 = local7.method2724(local41, local43, local41.length - local43);
					if (local56 == -1) {
						throw new IOException("EOF");
					}
				}
				Static176.method3461(new Class1_Sub7(local41));
			}
		} catch (@Pc(84) Exception local84) {
		}
		try {
			if (local7 != null) {
				local7.method2725();
			}
		} catch (@Pc(91) Exception local91) {
		}
	}
}
