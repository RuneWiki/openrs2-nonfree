import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!ff", name = "Mb", descriptor = "Lclient!n;")
	public static Class56 aClass56_5 = new Class56();

	@OriginalMember(owner = "client!ff", name = "Tb", descriptor = "Lclient!ed;")
	public static Class23 aClass23_514 = Static169.method2903(":");

	@OriginalMember(owner = "client!ff", name = "Wb", descriptor = "I")
	public static int anInt1423 = 0;

	@OriginalMember(owner = "client!ff", name = "Xb", descriptor = "Z")
	public static final boolean aBoolean59 = false;

	@OriginalMember(owner = "client!ff", name = "ec", descriptor = "Lclient!ed;")
	private static Class23 aClass23_517 = Static169.method2903("Connecting to update server");

	@OriginalMember(owner = "client!ff", name = "Zb", descriptor = "Lclient!ed;")
	public static Class23 aClass23_515 = aClass23_517;

	@OriginalMember(owner = "client!ff", name = "ac", descriptor = "[I")
	public static int[] anIntArray159 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 67, 68, 69, 70, 71, 72, 75, 79, 80, 81, 82, 87, 88, 89, 90, 77, 96, 98, 99, 100, 101, 102, 250, 251, 109, 110, 111, 112, 117, 252, 167, 126, 127, 128, 129, 130, 131, 132, 135, 139, 140, 141, 142, 147, 148, 149, 150, 137, 156, 158, 159, 160, 161, 162, 253, 254, 170, 171, 172, 173, 178, 255, 179 };

	@OriginalMember(owner = "client!ff", name = "bc", descriptor = "[I")
	public static int[] anIntArray160 = new int[32];

	@OriginalMember(owner = "client!ff", name = "cc", descriptor = "Lclient!ed;")
	public static Class23 aClass23_516 = Static169.method2903(":duelfriend:");

	@OriginalMember(owner = "client!ff", name = "dc", descriptor = "[S")
	public static short[] aShortArray20 = new short[] { 960, 957, -21568, -21571, 22464 };

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIII[Lclient!qh;I[BILclient!te;BI)V")
	public static void method906(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class69[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class80 arg8, @OriginalArg(10) int arg9) {
		@Pc(10) Class1_Sub8 local10 = new Class1_Sub8(arg6);
		@Pc(20) int local20 = -1;
		while (true) {
			@Pc(24) int local24 = local10.method856();
			if (local24 == 0) {
				return;
			}
			local20 += local24;
			@Pc(32) int local32 = 0;
			while (true) {
				@Pc(36) int local36 = local10.method856();
				if (local36 == 0) {
					break;
				}
				local32 += local36 - 1;
				@Pc(51) int local51 = local32 & 0x3F;
				@Pc(57) int local57 = local32 >> 6 & 0x3F;
				@Pc(61) int local61 = local10.method861();
				@Pc(65) int local65 = local32 >> 12;
				@Pc(69) int local69 = local61 >> 2;
				@Pc(73) int local73 = local61 & 0x3;
				if (arg9 == local65 && arg5 <= local57 && local57 < arg5 + 8 && arg3 <= local51 && arg3 + 8 > local51) {
					@Pc(108) Class1_Sub1_Sub3 local108 = Static84.method3155(local20);
					@Pc(126) int local126 = arg7 + Static14.method262(local51 & 0x7, local108.anInt657, local73, local108.anInt656, local57 & 0x7, arg0);
					@Pc(143) int local143 = Static6.method163(local73, local108.anInt657, local108.anInt656, arg0, local57 & 0x7, local51 & 0x7) + arg2;
					if (local126 > 0 && local143 > 0 && local126 < 103 && local143 < 103) {
						@Pc(157) int local157 = arg1;
						if ((Static12.aByteArrayArrayArray11[1][local126][local143] & 0x2) == 2) {
							local157 = arg1 - 1;
						}
						@Pc(171) Class69 local171 = null;
						if (local157 >= 0) {
							local171 = arg4[local157];
						}
						Static180.method3105(local126, local171, local73 + arg0 & 0x3, local143, local69, arg8, arg1, local20);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IZ)V")
	public static void method908(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static13.aBooleanArray4[arg0]) {
			return;
		}
		Static100.aClass30_35.method1283(arg0);
		if (Static9.aClass60ArrayArray1[arg0] == null) {
			return;
		}
		@Pc(26) boolean local26 = true;
		for (@Pc(28) int local28 = 0; local28 < Static9.aClass60ArrayArray1[arg0].length; local28++) {
			if (Static9.aClass60ArrayArray1[arg0][local28] != null) {
				if (Static9.aClass60ArrayArray1[arg0][local28].anInt3032 == 2) {
					local26 = false;
				} else {
					Static9.aClass60ArrayArray1[arg0][local28] = null;
				}
			}
		}
		if (local26) {
			Static9.aClass60ArrayArray1[arg0] = null;
		}
		Static13.aBooleanArray4[arg0] = false;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(III)V")
	public static void method909(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static107.anInt2752 != 0 && Static107.anInt2752 != 3 || Static163.anInt4012 != 1) {
			return;
		}
		@Pc(26) int local26 = Static165.anInt4054 - arg1 - 5;
		@Pc(32) int local32 = Static38.anInt1049 - arg0 - 25;
		if (local32 < 0 || local26 < 0 || local32 >= 146 || local26 >= 151) {
			return;
		}
		@Pc(52) int local52 = Static127.anInt3355 + Static179.anInt4264 & 0x7FF;
		@Pc(56) int local56 = Class1_Sub1_Sub12_Sub2.anIntArray416[local52];
		@Pc(64) int local64 = (anInt1423 + 256) * local56 >> 8;
		local26 -= 75;
		local32 -= 73;
		@Pc(70) int local70 = Class1_Sub1_Sub12_Sub2.anIntArray417[local52];
		@Pc(78) int local78 = local70 * (anInt1423 + 256) >> 8;
		@Pc(88) int local88 = local32 * local78 + local26 * local64 >> 11;
		@Pc(99) int local99 = local26 * local78 - local64 * local32 >> 11;
		@Pc(106) int local106 = Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anInt1825 - local99 >> 7;
		@Pc(113) int local113 = local88 + Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anInt1838 >> 7;
		@Pc(133) boolean local133 = Static95.method1631(0, Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anIntArray248[0], local106, local113, 0, Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anIntArray250[0], 0, true, 1, 0, 0);
		if (!local133) {
			return;
		}
		Static25.aClass1_Sub8_Sub1_1.method862(local32);
		Static25.aClass1_Sub8_Sub1_1.method862(local26);
		Static25.aClass1_Sub8_Sub1_1.method869(Static127.anInt3355);
		Static25.aClass1_Sub8_Sub1_1.method862(57);
		Static25.aClass1_Sub8_Sub1_1.method862(Static179.anInt4264);
		Static25.aClass1_Sub8_Sub1_1.method862(anInt1423);
		Static25.aClass1_Sub8_Sub1_1.method862(89);
		Static25.aClass1_Sub8_Sub1_1.method869(Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anInt1838);
		Static25.aClass1_Sub8_Sub1_1.method869(Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anInt1825);
		Static25.aClass1_Sub8_Sub1_1.method862(Static18.anInt567);
		Static25.aClass1_Sub8_Sub1_1.method862(63);
		return;
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(III)V")
	public static void method912(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) long local7 = (long) ((arg1 << 16) + arg0);
		@Pc(19) Class1_Sub1_Sub14 local19 = (Class1_Sub1_Sub14) Static113.aClass10_9.method256(local7);
		if (local19 != null) {
			Static149.aClass53_1.method1715(local19);
		}
	}

	@OriginalMember(owner = "client!ff", name = "k", descriptor = "(B)V")
	public static void method913() {
		if (Static157.anInt3834 > 0) {
			Static80.method1423();
		} else {
			Static32.method567(40);
			Static106.aClass44_6 = Static43.aClass44_4;
			Static43.aClass44_4 = null;
		}
	}

	@OriginalMember(owner = "client!ff", name = "q", descriptor = "(I)V")
	public static void method914() {
		aClass23_517 = null;
		aShortArray20 = null;
		anIntArray160 = null;
		aClass23_516 = null;
		aClass23_515 = null;
		aClass56_5 = null;
		aClass23_514 = null;
		anIntArray159 = null;
	}

	@OriginalMember(owner = "client!ff", name = "k", descriptor = "(II)Z")
	public static boolean method916(@OriginalArg(1) int arg0) {
		if (Static13.aBooleanArray4[arg0]) {
			return true;
		} else if (Static100.aClass30_35.method1292(arg0)) {
			@Pc(23) int local23 = Static100.aClass30_35.method1278(arg0);
			if (local23 == 0) {
				Static13.aBooleanArray4[arg0] = true;
				return true;
			}
			if (Static9.aClass60ArrayArray1[arg0] == null) {
				Static9.aClass60ArrayArray1[arg0] = new Class60[local23];
			}
			for (@Pc(49) int local49 = 0; local49 < local23; local49++) {
				if (Static9.aClass60ArrayArray1[arg0][local49] == null) {
					@Pc(63) byte[] local63 = Static100.aClass30_35.method1301(arg0, local49);
					if (local63 != null) {
						Static9.aClass60ArrayArray1[arg0][local49] = new Class60();
						Static9.aClass60ArrayArray1[arg0][local49].anInt3019 = local49 + (arg0 << 16);
						if (local63[0] == -1) {
							Static9.aClass60ArrayArray1[arg0][local49].method2050(new Class1_Sub8(local63));
						} else {
							Static9.aClass60ArrayArray1[arg0][local49].method2054(new Class1_Sub8(local63));
						}
					}
				}
			}
			Static13.aBooleanArray4[arg0] = true;
			return true;
		} else {
			return false;
		}
	}
}
