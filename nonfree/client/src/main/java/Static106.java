import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!me", name = "Y", descriptor = "I")
	public static int anInt2331;

	@OriginalMember(owner = "client!me", name = "cb", descriptor = "Lclient!vb;")
	public static Class82 aClass82_38;

	@OriginalMember(owner = "client!me", name = "U", descriptor = "Lclient!ka;")
	public static Class1_Sub8 aClass1_Sub8_4 = new Class1_Sub8(8);

	@OriginalMember(owner = "client!me", name = "X", descriptor = "I")
	public static int anInt2330 = 0;

	@OriginalMember(owner = "client!me", name = "Z", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray3 = new int[4][13][13];

	@OriginalMember(owner = "client!me", name = "ab", descriptor = "Lclient!tg;")
	public static Class81 aClass81_821 = Static120.method2057("Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q");

	@OriginalMember(owner = "client!me", name = "bb", descriptor = "Lclient!tg;")
	private static Class81 aClass81_822 = Static120.method2057("Location");

	@OriginalMember(owner = "client!me", name = "db", descriptor = "Lclient!tg;")
	public static Class81 aClass81_823 = aClass81_822;

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(IBI)I")
	public static int method1749(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(6) Class1_Sub12 local6 = (Class1_Sub12) Static157.aClass5_11.method134((long) arg0);
		if (local6 == null) {
			return -1;
		} else if (arg1 >= 0 && local6.anIntArray73.length > arg1) {
			return local6.anIntArray73[arg1];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(IB)Z")
	public static boolean method1750(@OriginalArg(0) int arg0) {
		return (arg0 >> 28 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(JI)Lclient!tg;")
	public static Class81 method1751(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % (long) 37 == 0L) {
			return null;
		} else {
			@Pc(30) int local30 = 0;
			@Pc(32) long local32 = arg0;
			while (local32 != 0L) {
				local32 /= 37L;
				local30++;
			}
			@Pc(46) byte[] local46 = new byte[local30];
			while (arg0 != 0L) {
				@Pc(50) long local50 = arg0;
				arg0 /= 37L;
				local30--;
				local46[local30] = Static80.aByteArray11[(int) (local50 - arg0 * 37L)];
			}
			@Pc(77) Class81 local77 = new Class81();
			local77.aByteArray41 = local46;
			local77.anInt3691 = local46.length;
			return local77;
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(B[S[Lclient!tg;)V")
	public static void method1752(@OriginalArg(1) short[] arg0, @OriginalArg(2) Class81[] arg1) {
		Static41.method806(arg0, 0, arg1, arg1.length - 1);
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IIII)Z")
	public static boolean method1753(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static112.method1974(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(10) int local10 = arg1 << 7;
		@Pc(14) int local14 = arg2 << 7;
		@Pc(24) int local24 = Static116.anIntArrayArrayArray4[arg0][arg1][arg2] - 1;
		@Pc(28) int local28 = local24 - 120;
		@Pc(32) int local32 = local24 - 230;
		@Pc(36) int local36 = local24 - 238;
		if (arg3 < 16) {
			if (arg3 == 1) {
				if (local10 > Static122.anInt2747) {
					if (!Static112.method1963(local10, local24, local14)) {
						return false;
					}
					if (!Static112.method1963(local10, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static112.method1963(local10, local28, local14)) {
						return false;
					}
					if (!Static112.method1963(local10, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static112.method1963(local10, local32, local14)) {
					return false;
				}
				if (!Static112.method1963(local10, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (local14 < Static184.anInt4119) {
					if (!Static112.method1963(local10, local24, local14 + 128)) {
						return false;
					}
					if (!Static112.method1963(local10 + 128, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static112.method1963(local10, local28, local14 + 128)) {
						return false;
					}
					if (!Static112.method1963(local10 + 128, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static112.method1963(local10, local32, local14 + 128)) {
					return false;
				}
				if (!Static112.method1963(local10 + 128, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (local10 < Static122.anInt2747) {
					if (!Static112.method1963(local10 + 128, local24, local14)) {
						return false;
					}
					if (!Static112.method1963(local10 + 128, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static112.method1963(local10 + 128, local28, local14)) {
						return false;
					}
					if (!Static112.method1963(local10 + 128, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static112.method1963(local10 + 128, local32, local14)) {
					return false;
				}
				if (!Static112.method1963(local10 + 128, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (local14 > Static184.anInt4119) {
					if (!Static112.method1963(local10, local24, local14)) {
						return false;
					}
					if (!Static112.method1963(local10 + 128, local24, local14)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static112.method1963(local10, local28, local14)) {
						return false;
					}
					if (!Static112.method1963(local10 + 128, local28, local14)) {
						return false;
					}
				}
				if (!Static112.method1963(local10, local32, local14)) {
					return false;
				}
				if (!Static112.method1963(local10 + 128, local32, local14)) {
					return false;
				}
				return true;
			}
		}
		if (!Static112.method1963(local10 + 64, local36, local14 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return Static112.method1963(local10, local32, local14 + 128);
		} else if (arg3 == 32) {
			return Static112.method1963(local10 + 128, local32, local14 + 128);
		} else if (arg3 == 64) {
			return Static112.method1963(local10 + 128, local32, local14);
		} else if (arg3 == 128) {
			return Static112.method1963(local10, local32, local14);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IIIB)V")
	public static void method1754(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class77 local8 = Static166.method2908(arg0, arg1);
		if (local8 != null && local8.anObjectArray7 != null) {
			@Pc(21) Class1_Sub3 local21 = new Class1_Sub3();
			local21.aClass77_1 = local8;
			local21.anObjectArray1 = local8.anObjectArray7;
			Static49.method870(local21);
		}
		Static184.aBoolean172 = true;
		Static93.anInt2064 = arg2;
		Static151.anInt3423 = arg0;
		Static70.anInt1714 = arg1;
		Static51.method913(local8);
	}

	@OriginalMember(owner = "client!me", name = "f", descriptor = "(I)V")
	public static void method1755() {
		aClass81_821 = null;
		aClass81_822 = null;
		aClass82_38 = null;
		anIntArrayArrayArray3 = null;
		aClass81_823 = null;
		aClass1_Sub8_4 = null;
	}
}
