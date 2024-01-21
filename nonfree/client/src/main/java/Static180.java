import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!vg", name = "l", descriptor = "[[B")
	public static byte[][] aByteArrayArray10;

	@OriginalMember(owner = "client!vg", name = "x", descriptor = "Lclient!ag;")
	public static Class4 aClass4_101;

	@OriginalMember(owner = "client!vg", name = "n", descriptor = "I")
	public static int anInt4059 = 0;

	@OriginalMember(owner = "client!vg", name = "s", descriptor = "[I")
	public static int[] anIntArray447 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

	@OriginalMember(owner = "client!vg", name = "t", descriptor = "Lclient!dd;")
	private static Class13 aClass13_1405 = Static161.method2971("RuneScape has been updated(Q");

	@OriginalMember(owner = "client!vg", name = "y", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1406 = aClass13_1405;

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(I[IIB)I")
	public static int method2975(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		return arg1[0] * arg0 + arg2 * arg1[1];
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(II)Z")
	public static boolean method2976(@OriginalArg(0) int arg0) {
		return (arg0 >> 30 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "(I)V")
	public static void method2977() {
		anIntArray447 = null;
		aByteArrayArray10 = null;
		aClass13_1405 = null;
		aClass13_1406 = null;
		aClass4_101 = null;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "([BI)Lclient!ae;")
	public static Class1_Sub2_Sub1_Sub1_Sub1 method2978(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(18) Class1_Sub2_Sub1_Sub1_Sub1 local18 = new Class1_Sub2_Sub1_Sub1_Sub1(arg0, Static184.anIntArray449, Static130.anIntArray324, Static12.anIntArray51, Static106.anIntArray285, Static104.anIntArray268, aByteArrayArray10);
			Static111.method2163();
			return local18;
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "()V")
	public static void method2979() {
		@Pc(3) int local3 = Static125.anIntArray309[Static77.anInt2154];
		@Pc(7) Class35[] local7 = Static125.aClass35ArrayArray1[Static77.anInt2154];
		Static174.anInt1394 = 0;
		for (@Pc(11) int local11 = 0; local11 < local3; local11++) {
			@Pc(16) Class35 local16 = local7[local11];
			@Pc(27) int local27;
			@Pc(42) int local42;
			@Pc(53) int local53;
			@Pc(85) int local85;
			@Pc(64) boolean local64;
			if (local16.anInt1998 == 1) {
				local27 = local16.anInt1992 + Static103.anInt2867 - Static81.anInt2305;
				if (local27 >= 0 && local27 <= Static103.anInt2867 + Static103.anInt2867) {
					local42 = local16.anInt1989 + Static103.anInt2867 - Static40.anInt1276;
					if (local42 < 0) {
						local42 = 0;
					}
					local53 = local16.anInt1996 + Static103.anInt2867 - Static40.anInt1276;
					if (local53 > Static103.anInt2867 + Static103.anInt2867) {
						local53 = Static103.anInt2867 + Static103.anInt2867;
					}
					local64 = false;
					while (local42 <= local53) {
						if (Static89.aBooleanArrayArray1[local27][local42++]) {
							local64 = true;
							break;
						}
					}
					if (local64) {
						local85 = Static4.anInt122 - local16.anInt1999;
						if (local85 > 32) {
							local16.anInt2000 = 1;
						} else {
							if (local85 >= -32) {
								continue;
							}
							local16.anInt2000 = 2;
							local85 = -local85;
						}
						local16.anInt2006 = (local16.anInt2002 - Static24.anInt869 << 8) / local85;
						local16.anInt1991 = (local16.anInt2001 - Static24.anInt869 << 8) / local85;
						local16.anInt1997 = (local16.anInt1993 - Static2.anInt95 << 8) / local85;
						local16.anInt2003 = (local16.anInt1985 - Static2.anInt95 << 8) / local85;
						Static34.aClass35Array1[Static174.anInt1394++] = local16;
					}
				}
			} else if (local16.anInt1998 == 2) {
				local27 = local16.anInt1989 + Static103.anInt2867 - Static40.anInt1276;
				if (local27 >= 0 && local27 <= Static103.anInt2867 + Static103.anInt2867) {
					local42 = local16.anInt1992 + Static103.anInt2867 - Static81.anInt2305;
					if (local42 < 0) {
						local42 = 0;
					}
					local53 = local16.anInt2005 + Static103.anInt2867 - Static81.anInt2305;
					if (local53 > Static103.anInt2867 + Static103.anInt2867) {
						local53 = Static103.anInt2867 + Static103.anInt2867;
					}
					local64 = false;
					while (local42 <= local53) {
						if (Static89.aBooleanArrayArray1[local42++][local27]) {
							local64 = true;
							break;
						}
					}
					if (local64) {
						local85 = Static24.anInt869 - local16.anInt2002;
						if (local85 > 32) {
							local16.anInt2000 = 3;
						} else {
							if (local85 >= -32) {
								continue;
							}
							local16.anInt2000 = 4;
							local85 = -local85;
						}
						local16.anInt1988 = (local16.anInt1999 - Static4.anInt122 << 8) / local85;
						local16.anInt1990 = (local16.anInt1986 - Static4.anInt122 << 8) / local85;
						local16.anInt1997 = (local16.anInt1993 - Static2.anInt95 << 8) / local85;
						local16.anInt2003 = (local16.anInt1985 - Static2.anInt95 << 8) / local85;
						Static34.aClass35Array1[Static174.anInt1394++] = local16;
					}
				}
			} else if (local16.anInt1998 == 4) {
				local27 = local16.anInt1993 - Static2.anInt95;
				if (local27 > 128) {
					local42 = local16.anInt1989 + Static103.anInt2867 - Static40.anInt1276;
					if (local42 < 0) {
						local42 = 0;
					}
					local53 = local16.anInt1996 + Static103.anInt2867 - Static40.anInt1276;
					if (local53 > Static103.anInt2867 + Static103.anInt2867) {
						local53 = Static103.anInt2867 + Static103.anInt2867;
					}
					if (local42 <= local53) {
						@Pc(335) int local335 = local16.anInt1992 + Static103.anInt2867 - Static81.anInt2305;
						if (local335 < 0) {
							local335 = 0;
						}
						local85 = local16.anInt2005 + Static103.anInt2867 - Static81.anInt2305;
						if (local85 > Static103.anInt2867 + Static103.anInt2867) {
							local85 = Static103.anInt2867 + Static103.anInt2867;
						}
						@Pc(357) boolean local357 = false;
						label142: for (@Pc(359) int local359 = local335; local359 <= local85; local359++) {
							for (@Pc(362) int local362 = local42; local362 <= local53; local362++) {
								if (Static89.aBooleanArrayArray1[local359][local362]) {
									local357 = true;
									break label142;
								}
							}
						}
						if (local357) {
							local16.anInt2000 = 5;
							local16.anInt1988 = (local16.anInt1999 - Static4.anInt122 << 8) / local27;
							local16.anInt1990 = (local16.anInt1986 - Static4.anInt122 << 8) / local27;
							local16.anInt2006 = (local16.anInt2002 - Static24.anInt869 << 8) / local27;
							local16.anInt1991 = (local16.anInt2001 - Static24.anInt869 << 8) / local27;
							Static34.aClass35Array1[Static174.anInt1394++] = local16;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lclient!fd;I)Z")
	public static boolean method2980(@OriginalArg(0) Class20 arg0) {
		if (Static184.aBoolean317) {
			if (Static53.method1292(arg0) != 0) {
				return false;
			}
			if (arg0.anInt1619 == 0) {
				return false;
			}
		}
		return arg0.aBoolean124;
	}
}
