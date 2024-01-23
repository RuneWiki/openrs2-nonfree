import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static175 {

	@OriginalMember(owner = "client!ol", name = "r", descriptor = "[I")
	public static int[] anIntArray302;

	@OriginalMember(owner = "client!ol", name = "t", descriptor = "[I")
	public static int[] anIntArray303 = new int[14];

	@OriginalMember(owner = "client!ol", name = "H", descriptor = "I")
	public static int anInt4027 = 0;

	@OriginalMember(owner = "client!ol", name = "K", descriptor = "I")
	public static int anInt4030 = 0;

	@OriginalMember(owner = "client!ol", name = "M", descriptor = "Ljava/lang/String;")
	public static String aString270 = "";

	@OriginalMember(owner = "client!ol", name = "N", descriptor = "I")
	public static int anInt4032 = 0;

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(III)I")
	public static int method3001(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = 0;
		while (arg1 > 0) {
			arg1--;
			local3 = arg0 & 0x1 | local3 << 1;
			arg0 >>>= 0x1;
		}
		return local3;
	}

	@OriginalMember(owner = "client!ol", name = "e", descriptor = "(I)V")
	public static void method3002() {
		while (true) {
			@Pc(6) Class1_Sub12 local6 = (Class1_Sub12) Static11.aClass3_2.method37();
			if (local6 == null) {
				return;
			}
			@Pc(29) Class9_Sub1 local29;
			@Pc(20) int local20;
			if (local6.anInt2240 < 0) {
				local20 = -local6.anInt2240 - 1;
				if (local20 == Static243.anInt5251) {
					local29 = Static83.aClass9_Sub1_Sub1_1;
				} else {
					local29 = Static147.aClass9_Sub1_Sub1Array1[local20];
				}
			} else {
				local20 = local6.anInt2240 - 1;
				local29 = Static36.aClass9_Sub1_Sub2Array2[local20];
			}
			if (local29 != null) {
				@Pc(53) Class31 local53 = Static77.method1518(local6.anInt2234);
				@Pc(67) int local67;
				@Pc(64) int local64;
				if (local6.anInt2237 == 1 || local6.anInt2237 == 3) {
					local64 = local53.anInt1321;
					local67 = local53.anInt1331;
				} else {
					local64 = local53.anInt1331;
					local67 = local53.anInt1321;
				}
				@Pc(84) int local84 = local6.anInt2236 + (local67 + 1 >> 1);
				@Pc(92) int local92 = local6.anInt2236 + (local67 >> 1);
				@Pc(101) int local101 = local6.anInt2233 + (local64 + 1 >> 1);
				@Pc(108) int local108 = (local64 >> 1) + local6.anInt2233;
				@Pc(112) int[][] local112 = Static38.anIntArrayArrayArray6[Static137.anInt3321];
				@Pc(139) int local139 = local112[local92][local101] + local112[local84][local108] + local112[local92][local108] + local112[local84][local101] >> 2;
				@Pc(144) int local144 = Static185.anIntArray313[local6.anInt2248];
				@Pc(146) Class9 local146 = null;
				if (local144 == 0) {
					@Pc(155) Class144 local155 = Static115.method2302(Static137.anInt3321, local6.anInt2236, local6.anInt2233);
					if (local155 != null) {
						local146 = local155.aClass9_8;
					}
				} else if (local144 == 1) {
					@Pc(173) Class85 local173 = Static182.method3131(Static137.anInt3321, local6.anInt2236, local6.anInt2233);
					if (local173 != null) {
						local146 = local173.aClass9_3;
					}
				} else if (local144 == 2) {
					@Pc(209) Class47 local209 = Static111.method2255(Static137.anInt3321, local6.anInt2236, local6.anInt2233);
					if (local209 != null) {
						local146 = local209.aClass9_1;
					}
				} else if (local144 == 3) {
					@Pc(196) Class148 local196 = Static16.method3759(Static137.anInt3321, local6.anInt2236, local6.anInt2233);
					if (local196 != null) {
						local146 = local196.aClass9_10;
					}
				}
				if (local146 != null) {
					Static132.method2480(local6.anInt2236, -1, 0, local6.anInt2244 + 1, local144, 0, Static137.anInt3321, local6.anInt2233, local6.anInt2243 + 1);
					local29.anInt411 = local64 * 64 + local6.anInt2233 * 128;
					local29.anInt473 = local6.anInt2244 + Static156.anInt3722;
					local29.anInt458 = local139;
					@Pc(258) int local258 = local6.anInt2238;
					local29.anInt441 = local6.anInt2243 + Static156.anInt3722;
					@Pc(267) int local267 = local6.anInt2239;
					@Pc(270) int local270 = local6.anInt2245;
					@Pc(273) int local273 = local6.anInt2247;
					@Pc(282) int local282;
					if (local273 < local270) {
						local282 = local270;
						local270 = local273;
						local273 = local282;
					}
					local29.anInt400 = local67 * 64 + local6.anInt2236 * 128;
					if (local267 < local258) {
						local282 = local258;
						local258 = local267;
						local267 = local282;
					}
					local29.anInt440 = local6.anInt2236 + local270;
					local29.anInt442 = local6.anInt2233 + local258;
					local29.anInt477 = local267 + local6.anInt2233;
					local29.anObject3 = local146;
					local29.anInt452 = local273 + local6.anInt2236;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIIII)V")
	public static void method3004(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 - arg3 >= Static167.anInt3907 && Static150.anInt3860 >= arg1 + arg3 && arg0 - arg3 >= Static202.anInt4469 && arg3 + arg0 <= Static94.anInt4237) {
			Static111.method2253(arg3, arg2, arg0, arg1);
		} else {
			Static182.method3133(arg1, arg2, arg3, arg0);
		}
	}

	@OriginalMember(owner = "client!ol", name = "g", descriptor = "(I)V")
	public static void method3005() {
		if (Static224.anInt4922 == 30) {
			Static168.method2918(25);
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "([Lclient!jb;ZI[BIZ)V")
	public static void method3006(@OriginalArg(0) Class65[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3) {
		@Pc(8) int local8 = -1;
		@Pc(13) Class1_Sub13 local13 = new Class1_Sub13(arg2);
		while (true) {
			@Pc(21) int local21 = local13.method1788();
			if (local21 == 0) {
				return;
			}
			local8 += local21;
			@Pc(32) int local32 = 0;
			while (true) {
				@Pc(36) int local36 = local13.method1780();
				if (local36 == 0) {
					break;
				}
				local32 += local36 - 1;
				@Pc(48) int local48 = local32 & 0x3F;
				@Pc(52) int local52 = local32 >> 12;
				@Pc(58) int local58 = local32 >> 6 & 0x3F;
				@Pc(62) int local62 = local13.method1772();
				@Pc(66) int local66 = local62 >> 2;
				@Pc(70) int local70 = arg3 + local58;
				@Pc(74) int local74 = local62 & 0x3;
				@Pc(78) int local78 = arg1 + local48;
				if (local70 > 0 && local78 > 0 && local70 < 103 && local78 < 103) {
					@Pc(95) Class65 local95 = null;
					@Pc(99) int local99 = local52;
					if ((Static145.aByteArrayArrayArray13[1][local70][local78] & 0x2) == 2) {
						local99 = local52 - 1;
					}
					if (local99 >= 0) {
						local95 = arg0[local99];
					}
					Static24.method482(true, local95, local78, local52, local66, local70, local52, local74, local8);
				}
			}
		}
	}
}
