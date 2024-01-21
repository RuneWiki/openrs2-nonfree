import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!fc", name = "X", descriptor = "Lclient!ef;")
	public static Class16 aClass16_45;

	@OriginalMember(owner = "client!fc", name = "ib", descriptor = "I")
	public static int anInt1052;

	@OriginalMember(owner = "client!fc", name = "I", descriptor = "[I")
	public static int[] anIntArray106 = new int[50];

	@OriginalMember(owner = "client!fc", name = "K", descriptor = "Lclient!he;")
	public static Class26 aClass26_514 = Static6.method100("swe");

	@OriginalMember(owner = "client!fc", name = "L", descriptor = "I")
	public static int anInt1043 = 99;

	@OriginalMember(owner = "client!fc", name = "O", descriptor = "[I")
	public static int[] anIntArray108 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 67, 68, 69, 70, 71, 72, 75, 79, 80, 81, 82, 87, 88, 89, 90, 77, 96, 98, 99, 100, 101, 102, 250, 251, 109, 110, 111, 112, 117, 252, 167, 126, 127, 128, 129, 130, 131, 132, 135, 139, 140, 141, 142, 147, 148, 149, 150, 137, 156, 158, 159, 160, 161, 162, 253, 254, 170, 171, 172, 173, 178, 255, 179 };

	@OriginalMember(owner = "client!fc", name = "P", descriptor = "Z")
	public static boolean aBoolean59 = false;

	@OriginalMember(owner = "client!fc", name = "V", descriptor = "Lclient!he;")
	public static Class26 aClass26_515 = Static6.method100("Spieler");

	@OriginalMember(owner = "client!fc", name = "Z", descriptor = "I")
	public static int anInt1048 = -1;

	@OriginalMember(owner = "client!fc", name = "gb", descriptor = "Lclient!he;")
	private static Class26 aClass26_519 = Static6.method100("Take");

	@OriginalMember(owner = "client!fc", name = "ab", descriptor = "Lclient!he;")
	public static Class26 aClass26_516 = aClass26_519;

	@OriginalMember(owner = "client!fc", name = "bb", descriptor = "Lclient!he;")
	private static Class26 aClass26_517 = Static6.method100("Connection timed out)3");

	@OriginalMember(owner = "client!fc", name = "fb", descriptor = "Lclient!he;")
	public static Class26 aClass26_518 = Static6.method100("Ung-Ultiges Anmelde)2Paket)3");

	@OriginalMember(owner = "client!fc", name = "jb", descriptor = "Lclient!he;")
	public static Class26 aClass26_520 = aClass26_517;

	@OriginalMember(owner = "client!fc", name = "kb", descriptor = "Lclient!he;")
	public static Class26 aClass26_521 = Static6.method100("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)I")
	public static int method627() {
		@Pc(7) int local7 = 3;
		if (Static81.anInt2248 < 310) {
			@Pc(16) int local16 = Static10.anInt282 >> 7;
			@Pc(20) int local20 = Static54.anInt1624 >> 7;
			if ((Static74.aByteArrayArrayArray5[Static132.anInt3270][local16][local20] & 0x4) != 0) {
				local7 = Static132.anInt3270;
			}
			@Pc(40) int local40 = Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anInt2731 >> 7;
			@Pc(45) int local45 = Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anInt2733 >> 7;
			@Pc(52) int local52;
			if (local16 >= local45) {
				local52 = local16 - local45;
			} else {
				local52 = local45 - local16;
			}
			@Pc(67) int local67;
			if (local40 <= local20) {
				local67 = local20 - local40;
			} else {
				local67 = local40 - local20;
			}
			@Pc(87) int local87;
			@Pc(89) int local89;
			if (local67 < local52) {
				local87 = local67 * 65536 / local52;
				local89 = 32768;
				while (local45 != local16) {
					if (local45 > local16) {
						local16++;
					} else if (local45 < local16) {
						local16--;
					}
					local89 += local87;
					if ((Static74.aByteArrayArrayArray5[Static132.anInt3270][local16][local20] & 0x4) != 0) {
						local7 = Static132.anInt3270;
					}
					if (local89 >= 65536) {
						local89 -= 65536;
						if (local20 < local40) {
							local20++;
						} else if (local40 < local20) {
							local20--;
						}
						if ((Static74.aByteArrayArrayArray5[Static132.anInt3270][local16][local20] & 0x4) != 0) {
							local7 = Static132.anInt3270;
						}
					}
				}
			} else {
				local89 = 32768;
				local87 = local52 * 65536 / local67;
				while (local20 != local40) {
					local89 += local87;
					if (local40 > local20) {
						local20++;
					} else if (local40 < local20) {
						local20--;
					}
					if ((Static74.aByteArrayArrayArray5[Static132.anInt3270][local16][local20] & 0x4) != 0) {
						local7 = Static132.anInt3270;
					}
					if (local89 >= 65536) {
						if (local45 > local16) {
							local16++;
						} else if (local45 < local16) {
							local16--;
						}
						if ((Static74.aByteArrayArrayArray5[Static132.anInt3270][local16][local20] & 0x4) != 0) {
							local7 = Static132.anInt3270;
						}
						local89 -= 65536;
					}
				}
			}
		}
		if ((Static74.aByteArrayArrayArray5[Static132.anInt3270][Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anInt2733 >> 7][Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anInt2731 >> 7] & 0x4) != 0) {
			local7 = Static132.anInt3270;
		}
		return local7;
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(B)V")
	public static void method628() {
		anIntArray108 = null;
		aClass26_521 = null;
		aClass26_515 = null;
		aClass26_517 = null;
		aClass26_518 = null;
		aClass26_520 = null;
		anIntArray106 = null;
		aClass16_45 = null;
		aClass26_519 = null;
		aClass26_516 = null;
		aClass26_514 = null;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(II[BLclient!cb;)V")
	public static void method629(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) Class12 arg2) {
		@Pc(12) Class3_Sub13 local12 = new Class3_Sub13();
		local12.anInt2070 = 0;
		local12.aByteArray21 = arg1;
		local12.aClass12_4 = arg2;
		local12.aLong100 = arg0;
		@Pc(27) Class65 local27 = Static59.aClass65_45;
		synchronized (Static59.aClass65_45) {
			Static59.aClass65_45.method1955(local12);
		}
		Static105.method1950();
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(III)I")
	public static int method630(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class3_Sub2 local15 = (Class3_Sub2) Static52.aClass17_8.method599((long) arg0);
		if (local15 == null) {
			return 0;
		} else if (arg1 >= 0 && local15.anIntArray15.length > arg1) {
			return local15.anIntArray15[arg1];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IB)Lclient!kf;")
	public static Class3_Sub1_Sub10 method631(@OriginalArg(0) int arg0) {
		@Pc(10) Class3_Sub1_Sub10 local10 = (Class3_Sub1_Sub10) Static107.aClass66_24.method1970((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static1.aClass16_1.method566(4, arg0);
		local10 = new Class3_Sub1_Sub10();
		if (local20 != null) {
			local10.method1248(arg0, new Class3_Sub11(local20));
		}
		local10.method1252();
		Static107.aClass66_24.method1969((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIBI)I")
	public static int method632(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = arg1 & 0x3;
		if (local12 == 0) {
			return arg0;
		} else if (local12 == 1) {
			return 7 - arg2;
		} else if (local12 == 2) {
			return 7 - arg0;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(JI)V")
	public static void method633(@OriginalArg(0) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(3) InterruptedException local3) {
		}
	}
}
