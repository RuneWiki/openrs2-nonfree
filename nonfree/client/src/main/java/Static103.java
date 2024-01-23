import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!k", name = "N", descriptor = "Lclient!mb;")
	public static Class70 aClass70_46;

	@OriginalMember(owner = "client!k", name = "W", descriptor = "I")
	public static int anInt4829;

	@OriginalMember(owner = "client!k", name = "jb", descriptor = "Lclient!vb;")
	public static Class70_Sub1 aClass70_Sub1_70;

	@OriginalMember(owner = "client!k", name = "Bb", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray13;

	@OriginalMember(owner = "client!k", name = "Nb", descriptor = "Lclient!vb;")
	public static Class70_Sub1 aClass70_Sub1_71;

	@OriginalMember(owner = "client!k", name = "w", descriptor = "I")
	public static volatile int anInt4807 = -1;

	@OriginalMember(owner = "client!k", name = "O", descriptor = "Lclient!i;")
	public static Class50 aClass50_2 = new Class50();

	@OriginalMember(owner = "client!k", name = "ab", descriptor = "[J")
	public static long[] aLongArray13 = new long[1000];

	@OriginalMember(owner = "client!k", name = "cb", descriptor = "I")
	public static int anInt4834 = 3353893;

	@OriginalMember(owner = "client!k", name = "db", descriptor = "Z")
	public static boolean aBoolean214 = true;

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Z)V")
	public static void method3776() {
		Static226.anInt4738 = 0;
		Static37.anInt896 = 0;
		Static200.method3301();
		Static95.method1606();
		Static7.method101();
		Static193.method3242();
		@Pc(25) int local25;
		for (@Pc(19) int local19 = 0; local19 < Static37.anInt896; local19++) {
			local25 = Static61.anIntArray91[local19];
			if (Static191.aClass5_Sub1_Sub1Array1[local25].anInt3627 != Static109.anInt2430) {
				if (Static191.aClass5_Sub1_Sub1Array1[local25].anInt1950 > 0) {
					Static100.method1676(Static191.aClass5_Sub1_Sub1Array1[local25]);
				}
				Static191.aClass5_Sub1_Sub1Array1[local25] = null;
			}
		}
		if (Static142.anInt3128 != Static225.aClass1_Sub16_Sub1_4.anInt4860) {
			throw new RuntimeException("gpp1 pos:" + Static225.aClass1_Sub16_Sub1_4.anInt4860 + " psize:" + Static142.anInt3128);
		}
		for (local25 = 0; local25 < Static118.anInt2542; local25++) {
			if (Static191.aClass5_Sub1_Sub1Array1[Static79.anIntArray111[local25]] == null) {
				throw new RuntimeException("gpp2 pos:" + local25 + " size:" + Static118.anInt2542);
			}
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(III)V")
	public static void method3798(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int[] local4 = new int[4];
		local4[0] = arg0;
		@Pc(20) int[] local20 = new int[4];
		local20[0] = arg1;
		@Pc(26) int local26 = 1;
		for (@Pc(28) int local28 = 0; local28 < 4; local28++) {
			if (Static81.anIntArray113[local28] != arg0) {
				local4[local26] = Static81.anIntArray113[local28];
				local20[local26] = Static127.anIntArray188[local28];
				local26++;
			}
		}
		Static127.anIntArray188 = local20;
		Static81.anIntArray113 = local4;
		Static181.method3049(0, Static48.aClass48Array1.length - 1, Static48.aClass48Array1);
	}

	@OriginalMember(owner = "client!k", name = "b", descriptor = "(IZ)Lclient!vi;")
	public static Class122 method3801(@OriginalArg(0) int arg0) {
		@Pc(6) Class122 local6 = (Class122) Static135.aClass53_21.method1501((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(29) byte[] local29 = Static211.aClass70_42.method3509(Static209.method3456(arg0), Static95.method1605(arg0));
		local6 = new Class122();
		local6.anInt4610 = arg0;
		if (local29 != null) {
			local6.method3606(new Class1_Sub16(local29));
		}
		Static135.aClass53_21.method1497(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IIIIII)V")
	public static void method3803(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(5) int local5 = arg4 - arg1;
		@Pc(14) int local14 = arg0 - arg2;
		if (local5 == 0) {
			if (local14 != 0) {
				Static3.method64(arg1, arg2, arg3, arg0);
			}
		} else if (local14 == 0) {
			Static183.method3094(arg1, arg2, arg3, arg4);
		} else {
			if (local5 < 0) {
				local5 = -local5;
			}
			if (local14 < 0) {
				local14 = -local14;
			}
			@Pc(68) boolean local68 = local14 > local5;
			@Pc(78) int local78;
			@Pc(72) int local72;
			if (local68) {
				local72 = arg4;
				arg4 = arg0;
				arg0 = local72;
				local78 = arg1;
				arg1 = arg2;
				arg2 = local78;
			}
			if (arg4 < arg1) {
				local72 = arg2;
				arg2 = arg0;
				arg0 = local72;
				local78 = arg1;
				arg1 = arg4;
				arg4 = local78;
			}
			local72 = arg4 - arg1;
			local78 = arg2;
			@Pc(109) int local109 = arg0 - arg2;
			if (local109 < 0) {
				local109 = -local109;
			}
			@Pc(119) int local119 = -(local72 >> 1);
			@Pc(130) int local130 = arg2 >= arg0 ? -1 : 1;
			@Pc(134) int local134;
			if (local68) {
				for (local134 = arg1; local134 <= arg4; local134++) {
					local119 += local109;
					Static113.anIntArrayArray10[local134][local78] = arg3;
					if (local119 > 0) {
						local78 += local130;
						local119 -= local72;
					}
				}
			} else {
				for (local134 = arg1; local134 <= arg4; local134++) {
					Static113.anIntArrayArray10[local78][local134] = arg3;
					local119 += local109;
					if (local119 > 0) {
						local119 -= local72;
						local78 += local130;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(II[B[IIIIIII)V")
	public static void method3818(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(10) int local10 = -(arg5 >> 2);
		@Pc(15) int local15 = -(arg5 & 0x3);
		for (@Pc(18) int local18 = -arg7; local18 < 0; local18++) {
			for (@Pc(22) int local22 = local10; local22 < 0; local22++) {
				if (arg1[arg6++] == 0) {
					arg4++;
				} else {
					arg2[arg4++] = arg3;
				}
				if (arg1[arg6++] == 0) {
					arg4++;
				} else {
					arg2[arg4++] = arg3;
				}
				if (arg1[arg6++] == 0) {
					arg4++;
				} else {
					arg2[arg4++] = arg3;
				}
				if (arg1[arg6++] == 0) {
					arg4++;
				} else {
					arg2[arg4++] = arg3;
				}
			}
			for (@Pc(90) int local90 = local15; local90 < 0; local90++) {
				if (arg1[arg6++] == 0) {
					arg4++;
				} else {
					arg2[arg4++] = arg3;
				}
			}
			arg4 += arg0;
			arg6 += arg8;
		}
	}
}
