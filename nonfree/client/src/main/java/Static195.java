import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "Lclient!ha;")
	public static Class1_Sub13_Sub1 aClass1_Sub13_Sub1_78 = new Class1_Sub13_Sub1(5000);

	@OriginalMember(owner = "client!oe", name = "e", descriptor = "Z")
	public static boolean aBoolean339 = false;

	@OriginalMember(owner = "client!oe", name = "i", descriptor = "J")
	public static volatile long aLong144 = 0L;

	@OriginalMember(owner = "client!oe", name = "m", descriptor = "I")
	public static int anInt3889 = 0;

	@OriginalMember(owner = "client!oe", name = "n", descriptor = "[I")
	public static int[] anIntArray409 = new int[500];

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "([BI)[B")
	public static byte[] method3366(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		@Pc(9) byte[] local9 = new byte[local6];
		Static317.method1049(arg0, 0, local9, 0, local6);
		return local9;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIIIII)V")
	public static void method3368(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) int local10 = arg1 - arg4;
		if (local10 < 0) {
			local10 = 0;
		}
		@Pc(16) int local16 = 0;
		Static299.method4478(arg1);
		@Pc(22) int local22 = -arg1;
		@Pc(25) int local25 = -local10;
		@Pc(27) int local27 = arg1;
		@Pc(29) int local29 = local10;
		@Pc(52) int local52;
		@Pc(62) int local62;
		@Pc(71) int local71;
		@Pc(79) int local79;
		if (arg0 >= Static231.anInt4333 && arg0 <= Static218.anInt4086) {
			@Pc(43) int[] local43 = Static40.anIntArrayArray6[arg0];
			local52 = Static306.method4566(arg5 - arg1, Static188.anInt3598, Static289.anInt5245);
			local62 = Static306.method4566(arg1 + arg5, Static188.anInt3598, Static289.anInt5245);
			local71 = Static306.method4566(arg5 - local10, Static188.anInt3598, Static289.anInt5245);
			local79 = Static306.method4566(local10 + arg5, Static188.anInt3598, Static289.anInt5245);
			Static103.method1978(arg3, local71, local52, local43);
			Static103.method1978(arg2, local79, local71, local43);
			Static103.method1978(arg3, local62, local79, local43);
		}
		@Pc(103) int local103 = -1;
		@Pc(105) int local105 = -1;
		while (local16 < local27) {
			local103 += 2;
			local105 += 2;
			local25 += local105;
			if (local25 >= 0 && local29 >= 1) {
				local29--;
				Static22.anIntArray49[local29] = local16;
				local25 -= local29 << 1;
			}
			local22 += local103;
			local16++;
			@Pc(259) int local259;
			@Pc(268) int local268;
			@Pc(276) int[] local276;
			@Pc(155) int local155;
			if (local22 >= 0) {
				local27--;
				local155 = arg0 - local27;
				local52 = arg0 + local27;
				local22 -= local27 << 1;
				if (local52 >= Static231.anInt4333 && local155 <= Static218.anInt4086) {
					if (local27 >= local10) {
						local62 = Static306.method4566(local16 + arg5, Static188.anInt3598, Static289.anInt5245);
						local71 = Static306.method4566(arg5 - local16, Static188.anInt3598, Static289.anInt5245);
						if (Static218.anInt4086 >= local52) {
							Static103.method1978(arg3, local62, local71, Static40.anIntArrayArray6[local52]);
						}
						if (Static231.anInt4333 <= local155) {
							Static103.method1978(arg3, local62, local71, Static40.anIntArrayArray6[local155]);
						}
					} else {
						local62 = Static22.anIntArray49[local27];
						local71 = Static306.method4566(arg5 + local16, Static188.anInt3598, Static289.anInt5245);
						local79 = Static306.method4566(arg5 - local16, Static188.anInt3598, Static289.anInt5245);
						local259 = Static306.method4566(local62 + arg5, Static188.anInt3598, Static289.anInt5245);
						local268 = Static306.method4566(arg5 - local62, Static188.anInt3598, Static289.anInt5245);
						if (local52 <= Static218.anInt4086) {
							local276 = Static40.anIntArrayArray6[local52];
							Static103.method1978(arg3, local268, local79, local276);
							Static103.method1978(arg2, local259, local268, local276);
							Static103.method1978(arg3, local71, local259, local276);
						}
						if (local155 >= Static231.anInt4333) {
							local276 = Static40.anIntArrayArray6[local155];
							Static103.method1978(arg3, local268, local79, local276);
							Static103.method1978(arg2, local259, local268, local276);
							Static103.method1978(arg3, local71, local259, local276);
						}
					}
				}
			}
			local52 = local16 + arg0;
			local155 = arg0 - local16;
			if (local52 >= Static231.anInt4333 && local155 <= Static218.anInt4086) {
				local62 = local27 + arg5;
				local71 = arg5 - local27;
				if (Static188.anInt3598 <= local62 && local71 <= Static289.anInt5245) {
					local62 = Static306.method4566(local62, Static188.anInt3598, Static289.anInt5245);
					local71 = Static306.method4566(local71, Static188.anInt3598, Static289.anInt5245);
					if (local10 <= local16) {
						if (local52 <= Static218.anInt4086) {
							Static103.method1978(arg3, local62, local71, Static40.anIntArrayArray6[local52]);
						}
						if (Static231.anInt4333 <= local155) {
							Static103.method1978(arg3, local62, local71, Static40.anIntArrayArray6[local155]);
						}
					} else {
						local79 = local29 >= local16 ? local29 : Static22.anIntArray49[local16];
						local259 = Static306.method4566(local79 + arg5, Static188.anInt3598, Static289.anInt5245);
						local268 = Static306.method4566(arg5 - local79, Static188.anInt3598, Static289.anInt5245);
						if (Static218.anInt4086 >= local52) {
							local276 = Static40.anIntArrayArray6[local52];
							Static103.method1978(arg3, local268, local71, local276);
							Static103.method1978(arg2, local259, local268, local276);
							Static103.method1978(arg3, local62, local259, local276);
						}
						if (local155 >= Static231.anInt4333) {
							local276 = Static40.anIntArrayArray6[local155];
							Static103.method1978(arg3, local268, local71, local276);
							Static103.method1978(arg2, local259, local268, local276);
							Static103.method1978(arg3, local62, local259, local276);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;")
	public static Class method3369(@OriginalArg(1) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}
}
