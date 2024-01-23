import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static193 {

	@OriginalMember(owner = "client!ok", name = "W", descriptor = "I")
	public static int anInt4317;

	@OriginalMember(owner = "client!ok", name = "qb", descriptor = "Lclient!df;")
	public static Class1_Sub3_Sub2 aClass1_Sub3_Sub2_3;

	@OriginalMember(owner = "client!ok", name = "hd", descriptor = "I")
	public static int anInt4370;

	@OriginalMember(owner = "client!ok", name = "A", descriptor = "I")
	public static int anInt4302 = -1;

	@OriginalMember(owner = "client!ok", name = "ic", descriptor = "Ljava/lang/String;")
	public static String aString134 = "cyan:";

	@OriginalMember(owner = "client!ok", name = "Xc", descriptor = "I")
	public static int anInt4364 = 0;

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIZI)Ljava/lang/String;")
	public static String method3424(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return Integer.toString(arg0, 10);
		}
		@Pc(39) int local39 = arg0 / 10;
		@Pc(41) int local41 = 2;
		while (local39 != 0) {
			local41++;
			local39 /= 10;
		}
		@Pc(62) char[] local62 = new char[local41];
		local62[0] = '+';
		for (@Pc(70) int local70 = local41 - 1; local70 > 0; local70--) {
			@Pc(75) int local75 = arg0;
			arg0 /= 10;
			@Pc(85) int local85 = local75 - arg0 * 10;
			if (local85 < 10) {
				local62[local70] = (char) (local85 + 48);
			} else {
				local62[local70] = (char) (local85 + 87);
			}
		}
		return new String(local62);
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(I[BI)I")
	public static int method3429(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		return Static238.method4101(0, arg1, arg0);
	}

	@OriginalMember(owner = "client!ok", name = "d", descriptor = "(B)V")
	public static void method3434() {
		if (!Static296.aBoolean335 || Static90.aBoolean113) {
			return;
		}
		@Pc(13) Class1_Sub14[][][] local13 = Static132.aClass1_Sub14ArrayArrayArray2;
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			@Pc(23) Class1_Sub14[][] local23 = local13[local15];
			for (@Pc(25) int local25 = 0; local25 < local23.length; local25++) {
				for (@Pc(35) int local35 = 0; local35 < local23[local25].length; local35++) {
					@Pc(47) Class1_Sub14 local47 = local23[local25][local35];
					if (local47 != null) {
						@Pc(64) Class25_Sub2_Sub1 local64;
						if (local47.aClass162_1 != null && local47.aClass162_1.aClass25_7 instanceof Class25_Sub2_Sub1) {
							local64 = (Class25_Sub2_Sub1) local47.aClass162_1.aClass25_7;
							if ((Long.MIN_VALUE & local47.aClass162_1.aLong192) == 0L) {
								local64.method656(false, true, true, false, true, true);
							} else {
								local64.method656(true, true, true, true, true, true);
							}
						}
						if (local47.aClass101_1 != null) {
							if (local47.aClass101_1.aClass25_3 instanceof Class25_Sub2_Sub1) {
								local64 = (Class25_Sub2_Sub1) local47.aClass101_1.aClass25_3;
								if ((Long.MIN_VALUE & local47.aClass101_1.aLong131) == 0L) {
									local64.method656(false, true, true, false, true, true);
								} else {
									local64.method656(true, true, true, true, true, true);
								}
							}
							if (local47.aClass101_1.aClass25_2 instanceof Class25_Sub2_Sub1) {
								local64 = (Class25_Sub2_Sub1) local47.aClass101_1.aClass25_2;
								if ((local47.aClass101_1.aLong131 & Long.MIN_VALUE) == 0L) {
									local64.method656(false, true, true, false, true, true);
								} else {
									local64.method656(true, true, true, true, true, true);
								}
							}
						}
						if (local47.aClass133_1 != null) {
							if (local47.aClass133_1.aClass25_4 instanceof Class25_Sub2_Sub1) {
								local64 = (Class25_Sub2_Sub1) local47.aClass133_1.aClass25_4;
								if ((local47.aClass133_1.aLong160 & Long.MIN_VALUE) == 0L) {
									local64.method656(false, true, true, false, true, true);
								} else {
									local64.method656(true, true, true, true, true, true);
								}
							}
							if (local47.aClass133_1.aClass25_5 instanceof Class25_Sub2_Sub1) {
								local64 = (Class25_Sub2_Sub1) local47.aClass133_1.aClass25_5;
								if ((local47.aClass133_1.aLong160 & Long.MIN_VALUE) == 0L) {
									local64.method656(false, true, true, false, true, true);
								} else {
									local64.method656(true, true, true, true, true, true);
								}
							}
						}
						for (@Pc(261) int local261 = 0; local261 < local47.anInt2332; local261++) {
							if (local47.aClass152Array1[local261].aClass25_6 instanceof Class25_Sub2_Sub1) {
								@Pc(279) Class25_Sub2_Sub1 local279 = (Class25_Sub2_Sub1) local47.aClass152Array1[local261].aClass25_6;
								if ((Long.MIN_VALUE & local47.aClass152Array1[local261].aLong181) == 0L) {
									local279.method656(false, true, true, false, true, true);
								} else {
									local279.method656(true, true, true, true, true, true);
								}
							}
						}
					}
				}
			}
		}
		Static90.aBoolean113 = true;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IB)Lclient!bm;")
	public static Class23 method3435(@OriginalArg(0) int arg0) {
		@Pc(15) Class23 local15 = (Class23) Static262.aClass155_42.method4358((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(26) byte[] local26 = Static181.aClass83_125.method2306(16, arg0);
		local15 = new Class23();
		if (local26 != null) {
			local15.method404(new Class1_Sub16(local26));
		}
		Static262.aClass155_42.method4360((long) arg0, local15);
		return local15;
	}
}
