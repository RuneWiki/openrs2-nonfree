import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!mh", name = "h", descriptor = "Lclient!hc;")
	public static Class51 aClass51_50;

	@OriginalMember(owner = "client!mh", name = "m", descriptor = "[[B")
	public static byte[][] aByteArrayArray7;

	@OriginalMember(owner = "client!mh", name = "v", descriptor = "I")
	public static int anInt3575;

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "I")
	public static int anInt3559 = 0;

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "I")
	public static int anInt3560 = 0;

	@OriginalMember(owner = "client!mh", name = "d", descriptor = "[Lclient!ai;")
	public static Class9_Sub1_Sub1[] aClass9_Sub1_Sub1Array1 = new Class9_Sub1_Sub1[2048];

	@OriginalMember(owner = "client!mh", name = "g", descriptor = "I")
	public static int anInt3563 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!mh", name = "w", descriptor = "I")
	public static int anInt3576 = -1;

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Z)V")
	public static void method2673() {
		Static255.anIntArray465 = null;
		Static25.aByteArrayArrayArray2 = null;
		Static79.anIntArrayArrayArray7 = null;
		Static102.aByteArrayArrayArray7 = null;
		Static25.aByteArrayArrayArray3 = null;
		Static201.anIntArray341 = null;
		Static119.aByteArrayArrayArray9 = null;
		Static172.anIntArray300 = null;
		Static39.aByteArrayArrayArray4 = null;
		Static54.anIntArray113 = null;
		Static118.anIntArray222 = null;
		Static8.anIntArray18 = null;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(I[BIZILjava/lang/String;)I")
	public static int method2674(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) String arg3) {
		@Pc(6) int local6 = arg2;
		for (@Pc(12) int local12 = 0; local12 < local6; local12++) {
			@Pc(27) char local27 = arg3.charAt(local12);
			if (local27 > '\u0000' && local27 < '\u0080' || !(local27 < ' ' || local27 > 'ÿ')) {
				arg1[arg0 + local12] = (byte) local27;
			} else if (local27 == '€') {
				arg1[arg0 + local12] = -128;
			} else if (local27 == '‚') {
				arg1[local12 + arg0] = -126;
			} else if (local27 == 'ƒ') {
				arg1[arg0 + local12] = -125;
			} else if (local27 == '„') {
				arg1[arg0 + local12] = -124;
			} else if (local27 == '…') {
				arg1[arg0 + local12] = -123;
			} else if (local27 == '†') {
				arg1[arg0 + local12] = -122;
			} else if (local27 == '‡') {
				arg1[arg0 + local12] = -121;
			} else if (local27 == 'ˆ') {
				arg1[local12 + arg0] = -120;
			} else if (local27 == '‰') {
				arg1[local12 + arg0] = -119;
			} else if (local27 == 'Š') {
				arg1[local12 + arg0] = -118;
			} else if (local27 == '‹') {
				arg1[local12 + arg0] = -117;
			} else if (local27 == 'Œ') {
				arg1[local12 + arg0] = -116;
			} else if (local27 == 'Ž') {
				arg1[arg0 + local12] = -114;
			} else if (local27 == '‘') {
				arg1[local12 + arg0] = -111;
			} else if (local27 == '’') {
				arg1[arg0 + local12] = -110;
			} else if (local27 == '“') {
				arg1[local12 + arg0] = -109;
			} else if (local27 == '”') {
				arg1[local12 + arg0] = -108;
			} else if (local27 == '•') {
				arg1[local12 + arg0] = -107;
			} else if (local27 == '–') {
				arg1[local12 + arg0] = -106;
			} else if (local27 == '—') {
				arg1[arg0 + local12] = -105;
			} else if (local27 == '˜') {
				arg1[arg0 + local12] = -104;
			} else if (local27 == '™') {
				arg1[arg0 + local12] = -103;
			} else if (local27 == 'š') {
				arg1[arg0 + local12] = -102;
			} else if (local27 == '›') {
				arg1[arg0 + local12] = -101;
			} else if (local27 == 'œ') {
				arg1[arg0 + local12] = -100;
			} else if (local27 == 'ž') {
				arg1[arg0 + local12] = -98;
			} else if (local27 == 'Ÿ') {
				arg1[arg0 + local12] = -97;
			} else {
				arg1[local12 + arg0] = 63;
			}
		}
		return local6;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IZLclient!se;)V")
	public static void method2678(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class122 arg1) {
		@Pc(19) int local19 = arg1.anInt4725 == 0 ? arg1.anInt4695 : arg1.anInt4725;
		@Pc(35) int local35 = arg1.anInt4715 == 0 ? arg1.anInt4726 : arg1.anInt4715;
		Static198.method3473(local35, arg1.anInt4686, Static80.aClass122ArrayArray1[arg1.anInt4686 >> 16], local19, arg0);
		if (arg1.aClass122Array2 != null) {
			Static198.method3473(local35, arg1.anInt4686, arg1.aClass122Array2, local19, arg0);
		}
		@Pc(68) Class1_Sub5 local68 = (Class1_Sub5) Static204.aClass140_13.method4014((long) arg1.anInt4686);
		if (local68 != null) {
			Static81.method1635(local68.anInt1358, arg0, local35, local19);
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method2679(@OriginalArg(0) int arg0) {
		return arg0 < 999999999 ? Integer.toString(arg0) : "*";
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(I[IIII)V")
	public static void method2681(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) int local3 = arg3 - 1;
		@Pc(6) int local6 = local3 - 7;
		arg2--;
		while (local6 > arg2) {
			@Pc(15) int local15 = arg2 + 1;
			arg0[local15] = arg1;
			@Pc(20) int local20 = local15 + 1;
			arg0[local20] = arg1;
			@Pc(25) int local25 = local20 + 1;
			arg0[local25] = arg1;
			@Pc(30) int local30 = local25 + 1;
			arg0[local30] = arg1;
			@Pc(35) int local35 = local30 + 1;
			arg0[local35] = arg1;
			@Pc(40) int local40 = local35 + 1;
			arg0[local40] = arg1;
			@Pc(45) int local45 = local40 + 1;
			arg0[local45] = arg1;
			arg2 = local45 + 1;
			arg0[arg2] = arg1;
		}
		while (local3 > arg2) {
			arg2++;
			arg0[arg2] = arg1;
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIII)Z")
	public static boolean method2682(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static127.method2420(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(10) int local10 = arg1 << 7;
		@Pc(14) int local14 = arg2 << 7;
		@Pc(24) int local24 = Static38.anIntArrayArrayArray6[arg0][arg1][arg2] - 1;
		@Pc(28) int local28 = local24 - 120;
		@Pc(32) int local32 = local24 - 230;
		@Pc(36) int local36 = local24 - 238;
		if (arg3 < 16) {
			if (arg3 == 1) {
				if (local10 > Static68.anInt1403) {
					if (!Static252.method4076(local10, local24, local14)) {
						return false;
					}
					if (!Static252.method4076(local10, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static252.method4076(local10, local28, local14)) {
						return false;
					}
					if (!Static252.method4076(local10, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static252.method4076(local10, local32, local14)) {
					return false;
				}
				if (!Static252.method4076(local10, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (local14 < Static112.anInt2954) {
					if (!Static252.method4076(local10, local24, local14 + 128)) {
						return false;
					}
					if (!Static252.method4076(local10 + 128, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static252.method4076(local10, local28, local14 + 128)) {
						return false;
					}
					if (!Static252.method4076(local10 + 128, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static252.method4076(local10, local32, local14 + 128)) {
					return false;
				}
				if (!Static252.method4076(local10 + 128, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (local10 < Static68.anInt1403) {
					if (!Static252.method4076(local10 + 128, local24, local14)) {
						return false;
					}
					if (!Static252.method4076(local10 + 128, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static252.method4076(local10 + 128, local28, local14)) {
						return false;
					}
					if (!Static252.method4076(local10 + 128, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static252.method4076(local10 + 128, local32, local14)) {
					return false;
				}
				if (!Static252.method4076(local10 + 128, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (local14 > Static112.anInt2954) {
					if (!Static252.method4076(local10, local24, local14)) {
						return false;
					}
					if (!Static252.method4076(local10 + 128, local24, local14)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static252.method4076(local10, local28, local14)) {
						return false;
					}
					if (!Static252.method4076(local10 + 128, local28, local14)) {
						return false;
					}
				}
				if (!Static252.method4076(local10, local32, local14)) {
					return false;
				}
				if (!Static252.method4076(local10 + 128, local32, local14)) {
					return false;
				}
				return true;
			}
		}
		if (!Static252.method4076(local10 + 64, local36, local14 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return Static252.method4076(local10, local32, local14 + 128);
		} else if (arg3 == 32) {
			return Static252.method4076(local10 + 128, local32, local14 + 128);
		} else if (arg3 == 64) {
			return Static252.method4076(local10 + 128, local32, local14);
		} else if (arg3 == 128) {
			return Static252.method4076(local10, local32, local14);
		} else {
			return true;
		}
	}
}
