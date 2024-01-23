import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!ih", name = "U", descriptor = "[Lclient!rj;")
	public static Class2_Sub3_Sub1[] aClass2_Sub3_Sub1Array6;

	@OriginalMember(owner = "client!ih", name = "Z", descriptor = "I")
	public static int anInt2314;

	@OriginalMember(owner = "client!ih", name = "ab", descriptor = "I")
	public static int anInt2315;

	@OriginalMember(owner = "client!ih", name = "cb", descriptor = "I")
	public static int anInt2316;

	@OriginalMember(owner = "client!ih", name = "K", descriptor = "I")
	public static int anInt2305 = 0;

	@OriginalMember(owner = "client!ih", name = "M", descriptor = "Lclient!ec;")
	public static Class46 aClass46_15 = new Class46(30);

	@OriginalMember(owner = "client!ih", name = "bb", descriptor = "Ljava/lang/String;")
	public static String aString119 = "";

	@OriginalMember(owner = "client!ih", name = "db", descriptor = "Z")
	public static boolean aBoolean183 = true;

	@OriginalMember(owner = "client!ih", name = "eb", descriptor = "Ljava/lang/String;")
	public static String aString120 = "Opened title screen";

	@OriginalMember(owner = "client!ih", name = "fb", descriptor = "I")
	public static int anInt2317 = 2;

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(BLclient!jd;)V")
	public static void method1979(@OriginalArg(1) Class84 arg0) {
		Static215.aClass84_97 = arg0;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIII)I")
	public static int method1982(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = arg0 & 0x3;
		if (local8 == 0) {
			return arg1;
		} else if (local8 == 1) {
			return 7 - arg2;
		} else if (local8 == 2) {
			return 7 - arg1;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIIIIIIIIZI)V")
	public static void method1987(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6, @OriginalArg(10) boolean arg7, @OriginalArg(11) int arg8) {
		@Pc(9) int local9 = arg8 - arg1;
		@Pc(14) int local14 = arg3 - arg5;
		@Pc(16) int local16 = -1;
		if (Static77.anInt1651 > 0) {
			if (Static11.anInt297 <= 10) {
				local16 = Static11.anInt297 * 5;
			} else {
				local16 = 50 - (Static11.anInt297 - 10) * 5;
			}
		}
		@Pc(44) int local44 = 983040 / arg4;
		@Pc(48) int local48 = 983040 / arg0;
		for (@Pc(51) int local51 = -local44; local51 < local44 + local9; local51++) {
			@Pc(68) int local68 = arg4 * local51 >> 16;
			@Pc(79) int local79 = (local51 + 1) * arg4 >> 16;
			@Pc(84) int local84 = local79 - local68;
			if (local84 > 0) {
				@Pc(99) int local99 = local51 + arg1 >> 6;
				local68 += arg2;
				if (local99 >= 0 && local99 <= Static57.anIntArrayArrayArray2.length - 1) {
					@Pc(122) int[][] local122 = Static57.anIntArrayArrayArray2[local99];
					for (@Pc(125) int local125 = -local48; local125 < local48 + local14; local125++) {
						@Pc(138) int local138 = arg0 * local125 >> 16;
						@Pc(148) int local148 = arg0 * (local125 + 1) >> 16;
						@Pc(153) int local153 = local148 - local138;
						if (local153 > 0) {
							local138 += arg6;
							@Pc(169) int local169 = arg5 + local125 >> 6;
							if (local169 >= 0 && local169 <= local122.length - 1 && local122[local169] != null) {
								@Pc(208) int local208 = ((local125 + arg5 & 0x3F) << 6) + (local51 + arg1 & 0x3F);
								@Pc(214) int local214 = local122[local169][local208];
								if (local214 != 0) {
									@Pc(227) Class143 local227 = Static218.method3692(local214 - 1);
									if (!Static96.aBooleanArray10[local227.anInt4486]) {
										if (local16 != -1 && local227.anInt4486 == Static84.anInt827) {
											@Pc(263) Class2_Sub20 local263 = new Class2_Sub20();
											local263.anInt3927 = local227.anInt4486;
											local263.anInt3928 = local68;
											local263.anInt3924 = local138;
											Static103.aClass1_9.method11(local263);
										} else {
											Static297.aClass2_Sub3_Sub1_Sub1Array2[local227.anInt4486].method4367(local68 - 7, local138 + -7);
										}
									}
								}
							}
						}
					}
				}
			}
		}
		for (@Pc(290) Class2_Sub20 local290 = (Class2_Sub20) Static103.aClass1_9.method13(); local290 != null; local290 = (Class2_Sub20) Static103.aClass1_9.method9()) {
			Static160.method2785(local290.anInt3928, local290.anInt3924, 15, local16);
			Static160.method2785(local290.anInt3928, local290.anInt3924, 13, local16);
			Static160.method2785(local290.anInt3928, local290.anInt3924, 11, local16);
			Static160.method2785(local290.anInt3928, local290.anInt3924, 9, local16);
			Static297.aClass2_Sub3_Sub1_Sub1Array2[local290.anInt3927].method4367(local290.anInt3928 - 7, local290.anInt3924 + -7);
		}
		Static103.aClass1_9.method10();
	}
}
