import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static155 {

	@OriginalMember(owner = "client!jq", name = "J", descriptor = "[Lclient!wb;")
	public static Class211[] aClass211Array1;

	@OriginalMember(owner = "client!jq", name = "S", descriptor = "Lclient!cq;")
	public static Class35 aClass35_2;

	@OriginalMember(owner = "client!jq", name = "U", descriptor = "I")
	public static int anInt3304;

	@OriginalMember(owner = "client!jq", name = "ab", descriptor = "I")
	public static int anInt3309;

	@OriginalMember(owner = "client!jq", name = "eb", descriptor = "I")
	public static int anInt3312;

	@OriginalMember(owner = "client!jq", name = "Z", descriptor = "Ljava/lang/String;")
	public static final String aString120 = "glow2:";

	@OriginalMember(owner = "client!jq", name = "f", descriptor = "(I)V")
	public static void method3045() {
		if (Static324.anInt6226 == -1) {
			return;
		}
		@Pc(15) int local15 = Static63.anInt1529;
		@Pc(17) int local17 = Static328.anInt6333;
		if (Static68.anInt1636 != 0) {
			local17 = Static321.anInt6195;
			local15 = Static272.anInt5167;
		}
		Static69.method1704(0, 0, Static324.anInt6226, local17, Static46.anInt1173, 0, Static294.anInt5659, local15, 0);
		if (Static206.aClass146_60 != null) {
			Static215.method3865(local17, local15);
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(Lclient!jr;)V")
	public static void method3046(@OriginalArg(0) Class10_Sub3 arg0) {
		for (@Pc(2) int local2 = arg0.aShort83; local2 <= arg0.aShort80; local2++) {
			for (@Pc(6) int local6 = arg0.aShort82; local6 <= arg0.aShort81; local6++) {
				@Pc(16) Class213 local16 = Static98.aClass213ArrayArrayArray2[arg0.aByte64][local2][local6];
				if (local16 != null) {
					@Pc(21) Class81 local21 = local16.aClass81_4;
					@Pc(23) Class81 local23 = null;
					while (local21 != null) {
						if (local21.aClass10_Sub3_1 == arg0) {
							if (local23 == null) {
								local16.aClass81_4 = local21.aClass81_3;
							} else {
								local23.aClass81_3 = local21.aClass81_3;
							}
							local21.method2352();
							break;
						}
						local23 = local21;
						local21 = local21.aClass81_3;
					}
					local16.aByte72 = 0;
					for (@Pc(56) Class81 local56 = local16.aClass81_4; local56 != null; local56 = local56.aClass81_3) {
						local16.aByte72 = (byte) (local16.aByte72 | local56.anInt2432);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "(IB)V")
	public static void method3047(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			Static79.method1959();
		} else if (arg0 == 2) {
			Static61.method1352();
		} else if (arg0 == 3) {
			Static2.method104();
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "(Z)V")
	public static void method3048() {
		if (Static213.anInt4255 != -1) {
			Static283.method4782(Static213.anInt4255, -1, false, -1);
			Static213.anInt4255 = -1;
		}
	}

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "(BI)V")
	public static void method3049() {
		@Pc(1) Class11 local1 = Static93.aClass11_50;
		synchronized (Static93.aClass11_50) {
			Static93.aClass11_50.method215(5);
		}
		local1 = Static259.aClass11_113;
		synchronized (Static259.aClass11_113) {
			Static259.aClass11_113.method215(5);
		}
	}

	@OriginalMember(owner = "client!jq", name = "f", descriptor = "(B)V")
	public static void method3052() {
		@Pc(1) Class11 local1 = Static95.aClass11_52;
		synchronized (Static95.aClass11_52) {
			Static95.aClass11_52.method213();
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(II)V")
	public static void method3053(@OriginalArg(1) int arg0) {
		Static4.anInt113 = 1000 / arg0;
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "([II[I[ILclient!sd;)V")
	public static void method3054(@OriginalArg(0) int[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) Class10_Sub3_Sub3_Sub1 arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg2.length; local7++) {
			@Pc(13) int local13 = arg2[local7];
			@Pc(17) int local17 = arg1[local7];
			@Pc(21) int local21 = arg0[local7];
			@Pc(23) int local23 = 0;
			while (local17 != 0 && arg3.aClass3Array3.length > local23) {
				if ((local17 & 0x1) != 0) {
					if (local13 == -1) {
						arg3.aClass3Array3[local23] = null;
					} else {
						@Pc(38) Class79 local38 = Static233.method4080(local13);
						@Pc(41) int local41 = local38.anInt2361;
						@Pc(46) Class3 local46 = arg3.aClass3Array3[local23];
						if (local46 != null) {
							if (local13 == local46.anInt103) {
								if (local41 == 0) {
									local46 = arg3.aClass3Array3[local23] = null;
								} else if (local41 == 1) {
									local46.anInt98 = 0;
									local46.anInt95 = local21;
									local46.anInt101 = 0;
									local46.anInt97 = 0;
									local46.anInt102 = 1;
									Static273.method4631(arg3.anInt5908, 0, arg3.anInt5910, false, local38);
								} else if (local41 == 2) {
									local46.anInt101 = 0;
								}
							} else if (local38.anInt2357 >= Static233.method4080(local46.anInt103).anInt2357) {
								local46 = arg3.aClass3Array3[local23] = null;
							}
						}
						if (local46 == null) {
							local46 = arg3.aClass3Array3[local23] = new Class3();
							local46.anInt101 = 0;
							local46.anInt95 = local21;
							local46.anInt102 = 1;
							local46.anInt98 = 0;
							local46.anInt97 = 0;
							local46.anInt103 = local13;
							Static273.method4631(arg3.anInt5908, 0, arg3.anInt5910, false, local38);
						}
					}
				}
				local23++;
				local17 >>>= 0x1;
			}
		}
	}
}
