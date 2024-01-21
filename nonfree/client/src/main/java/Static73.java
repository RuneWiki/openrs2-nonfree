import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!hg", name = "z", descriptor = "[Lclient!ji;")
	public static Class5_Sub2_Sub10[] aClass5_Sub2_Sub10Array7;

	@OriginalMember(owner = "client!hg", name = "s", descriptor = "Lclient!qb;")
	public static final Class84 aClass84_12 = new Class84(30);

	@OriginalMember(owner = "client!hg", name = "w", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_533 = Static161.method2452("Loading)3)3)3");

	@OriginalMember(owner = "client!hg", name = "t", descriptor = "Lclient!dc;")
	public static Class20 aClass20_532 = aClass20_533;

	@OriginalMember(owner = "client!hg", name = "B", descriptor = "[J")
	public static final long[] aLongArray19 = new long[32];

	@OriginalMember(owner = "client!hg", name = "C", descriptor = "[I")
	public static final int[] anIntArray144 = new int[5];

	@OriginalMember(owner = "client!hg", name = "D", descriptor = "I")
	public static int anInt1586 = 3;

	@OriginalMember(owner = "client!hg", name = "E", descriptor = "[Lclient!dc;")
	public static final Class20[] aClass20Array8 = new Class20[100];

	@OriginalMember(owner = "client!hg", name = "F", descriptor = "I")
	public static int anInt1587 = -1;

	@OriginalMember(owner = "client!hg", name = "G", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_534 = Static161.method2452("Stufe)2");

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(III)V")
	public static void method1189(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int[] local4 = new int[4];
		local4[0] = arg1;
		@Pc(10) int local10 = 1;
		@Pc(22) int[] local22 = new int[4];
		local22[0] = arg0;
		for (@Pc(28) int local28 = 0; local28 < 4; local28++) {
			if (arg1 != Static173.anIntArray366[local28]) {
				local4[local10] = Static173.anIntArray366[local28];
				local22[local10] = Static123.anIntArray289[local28];
				local10++;
			}
		}
		Static173.anIntArray366 = local4;
		Static123.anIntArray289 = local22;
		Static161.method2456(0, Static4.aClass85Array1, Static4.aClass85Array1.length - 1);
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIIIBI)V")
	public static void method1191(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(15) int local15 = arg4 - arg0;
		@Pc(19) int local19 = arg1 - arg3;
		if (local15 == 0) {
			if (local19 != 0) {
				Static131.method2031(arg2, arg1, arg3, arg0);
			}
		} else if (local19 == 0) {
			Static107.method1726(arg2, arg4, arg0, arg3);
		} else {
			if (local15 < 0) {
				local15 = -local15;
			}
			if (local19 < 0) {
				local19 = -local19;
			}
			@Pc(66) boolean local66 = local15 < local19;
			@Pc(70) int local70;
			@Pc(72) int local72;
			if (local66) {
				local70 = arg0;
				local72 = arg4;
				arg4 = arg1;
				arg1 = local72;
				arg0 = arg3;
				arg3 = local70;
			}
			if (arg4 < arg0) {
				local70 = arg0;
				arg0 = arg4;
				local72 = arg3;
				arg4 = local70;
				arg3 = arg1;
				arg1 = local72;
			}
			local70 = arg3;
			local72 = arg4 - arg0;
			@Pc(106) int local106 = arg1 - arg3;
			if (local106 < 0) {
				local106 = -local106;
			}
			@Pc(119) int local119 = -(local72 >> 1);
			@Pc(126) int local126 = arg3 < arg1 ? 1 : -1;
			@Pc(130) int local130;
			if (local66) {
				for (local130 = arg0; local130 <= arg4; local130++) {
					Static9.anIntArrayArray1[local130][local70] = arg2;
					local119 += local106;
					if (local119 > 0) {
						local70 += local126;
						local119 -= local72;
					}
				}
			} else {
				for (local130 = arg0; local130 <= arg4; local130++) {
					local119 += local106;
					Static9.anIntArrayArray1[local70][local130] = arg2;
					if (local119 > 0) {
						local70 += local126;
						local119 -= local72;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIIIIII)V")
	public static void method1192(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(19) int local19 = Static171.method2627(Static173.anInt3464, arg2, Static174.anInt3493);
		@Pc(25) int local25 = Static171.method2627(Static173.anInt3464, arg4, Static174.anInt3493);
		@Pc(31) int local31 = Static171.method2627(Static27.anInt493, arg0, Static72.anInt1572);
		@Pc(37) int local37 = Static171.method2627(Static27.anInt493, arg5, Static72.anInt1572);
		@Pc(46) int local46 = Static171.method2627(Static173.anInt3464, arg2 + arg3, Static174.anInt3493);
		@Pc(55) int local55 = Static171.method2627(Static173.anInt3464, arg4 - arg3, Static174.anInt3493);
		for (@Pc(57) int local57 = local19; local57 < local46; local57++) {
			Static27.method409(local37, arg1, Static9.anIntArrayArray1[local57], local31);
		}
		for (@Pc(77) int local77 = local25; local77 > local55; local77--) {
			Static27.method409(local37, arg1, Static9.anIntArrayArray1[local77], local31);
		}
		@Pc(99) int local99 = Static171.method2627(Static27.anInt493, arg3 + arg0, Static72.anInt1572);
		@Pc(108) int local108 = Static171.method2627(Static27.anInt493, arg5 - arg3, Static72.anInt1572);
		for (@Pc(110) int local110 = local46; local110 <= local55; local110++) {
			@Pc(116) int[] local116 = Static9.anIntArrayArray1[local110];
			Static27.method409(local99, arg1, local116, local31);
			Static27.method409(local37, arg1, local116, local108);
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lclient!ci;IILclient!dj;)V")
	public static void method1193(@OriginalArg(0) Class17 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class23_Sub1 arg2) {
		@Pc(7) byte[] local7 = null;
		@Pc(9) Class91 local9 = Static140.aClass91_11;
		synchronized (Static140.aClass91_11) {
			for (@Pc(21) Class5_Sub14 local21 = (Class5_Sub14) Static140.aClass91_11.method2684(); local21 != null; local21 = (Class5_Sub14) Static140.aClass91_11.method2678()) {
				if (local21.aLong253 == (long) arg1 && local21.aClass17_3 == arg0 && local21.anInt1584 == 0) {
					local7 = local21.aByteArray20;
					break;
				}
			}
		}
		if (local7 == null) {
			@Pc(68) byte[] local68 = arg0.method457(arg1);
			arg2.method763(true, arg1, arg0, local68);
		} else {
			arg2.method763(true, arg1, arg0, local7);
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(ILclient!wa;Lclient!wa;)I")
	public static int method1194(@OriginalArg(1) Class23 arg0, @OriginalArg(2) Class23 arg1) {
		@Pc(5) int local5 = 0;
		if (arg1.method743(Static65.anInt1421)) {
			local5++;
		}
		if (arg0.method743(anInt1587)) {
			local5++;
		}
		if (arg0.method743(Static4.anInt108)) {
			local5++;
		}
		if (arg0.method743(Static55.anInt1159)) {
			local5++;
		}
		if (arg0.method743(Static98.anInt2103)) {
			local5++;
		}
		if (arg0.method743(Static123.anInt2609)) {
			local5++;
		}
		arg0.method743(Static4.anInt107);
		arg0.method743(Static211.anInt4105);
		arg0.method743(Static82.anInt1813);
		arg0.method743(Static138.anInt3856);
		arg0.method743(Static113.anInt2385);
		return local5;
	}
}
