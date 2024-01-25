import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static327 {

	@OriginalMember(owner = "client!up", name = "n", descriptor = "Lclient!wo;")
	public static Class216 aClass216_94;

	@OriginalMember(owner = "client!up", name = "r", descriptor = "Z")
	public static boolean aBoolean607;

	@OriginalMember(owner = "client!up", name = "s", descriptor = "I")
	public static int anInt6282;

	@OriginalMember(owner = "client!up", name = "w", descriptor = "[[I")
	public static int[][] anIntArrayArray61;

	@OriginalMember(owner = "client!up", name = "m", descriptor = "Lclient!bb;")
	public static final Class16 aClass16_39 = new Class16();

	@OriginalMember(owner = "client!up", name = "p", descriptor = "I")
	public static int anInt6280 = 2;

	@OriginalMember(owner = "client!up", name = "t", descriptor = "[I")
	public static final int[] anIntArray509 = new int[1000];

	@OriginalMember(owner = "client!up", name = "u", descriptor = "I")
	public static int anInt6283 = 0;

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(IIBLclient!uo;)V")
	public static void method5304(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class32 arg2) {
		Static324.aClass32_14 = arg2;
		Static37.aClass165ArrayArray1 = new Class165[arg1][arg0];
		if (Static97.anIntArray466 != null) {
			Static176.aClass114_2 = Static167.method3361(Static97.anIntArray466[1], Static97.anIntArray466[3], Static97.anIntArray466[5], Static97.anIntArray466[2], Static97.anIntArray466[0], Static97.anIntArray466[4]);
		}
		Static86.aClass165_1 = new Class165();
		Static122.method2570();
	}

	@OriginalMember(owner = "client!up", name = "b", descriptor = "(Z)Z")
	public static boolean method5306(@OriginalArg(0) boolean arg0) {
		for (@Pc(1) int local1 = Static73.anInt1934; local1 < Static113.anInt2651; local1++) {
			@Pc(6) Class194[][] local6 = Static77.aClass194ArrayArrayArray1[local1];
			for (@Pc(9) int local9 = -Static77.anInt2009; local9 <= 0; local9++) {
				@Pc(14) int local14 = Static318.anInt6137 + local9;
				@Pc(18) int local18 = Static318.anInt6137 - local9;
				if (local14 >= Static326.anInt2473 || local18 < Static92.anInt3571) {
					for (@Pc(27) int local27 = -Static77.anInt2009; local27 <= 0; local27++) {
						@Pc(32) int local32 = Static204.anInt4305 + local27;
						@Pc(36) int local36 = Static204.anInt4305 - local27;
						@Pc(48) Class194 local48;
						if (local14 >= Static326.anInt2473) {
							if (local32 >= anInt6282) {
								local48 = local6[local14][local32];
								if (local48 != null && local48.aBoolean563) {
									Static81.aBoolean498 = arg0;
									Static231.aClass42_1.method2030(local48);
									Static231.aClass42_1.method2031();
								}
							}
							if (local36 < Static70.anInt1848) {
								local48 = local6[local14][local36];
								if (local48 != null && local48.aBoolean563) {
									Static81.aBoolean498 = arg0;
									Static231.aClass42_1.method2030(local48);
									Static231.aClass42_1.method2031();
								}
							}
						}
						if (local18 < Static92.anInt3571) {
							if (local32 >= anInt6282) {
								local48 = local6[local18][local32];
								if (local48 != null && local48.aBoolean563) {
									Static81.aBoolean498 = arg0;
									Static231.aClass42_1.method2030(local48);
									Static231.aClass42_1.method2031();
								}
							}
							if (local36 < Static70.anInt1848) {
								local48 = local6[local18][local36];
								if (local48 != null && local48.aBoolean563) {
									Static81.aBoolean498 = arg0;
									Static231.aClass42_1.method2030(local48);
									Static231.aClass42_1.method2031();
								}
							}
						}
						if (Static134.anInt2972 == 0) {
							if (Static328.aBoolean612) {
								Static231.aClass42_1.method2035(24);
							}
							return true;
						}
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(II)V")
	public static void method5307(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static144.aBooleanArray12[arg0]) {
			return;
		}
		Static117.aClass216_36.method5669(arg0);
		if (Static348.aClass12ArrayArray1[arg0] == null) {
			return;
		}
		@Pc(25) boolean local25 = true;
		for (@Pc(27) int local27 = 0; local27 < Static348.aClass12ArrayArray1[arg0].length; local27++) {
			if (Static348.aClass12ArrayArray1[arg0][local27] != null) {
				if (Static348.aClass12ArrayArray1[arg0][local27].anInt416 == 2) {
					local25 = false;
				} else {
					Static348.aClass12ArrayArray1[arg0][local27] = null;
				}
			}
		}
		if (local25) {
			Static348.aClass12ArrayArray1[arg0] = null;
		}
		Static144.aBooleanArray12[arg0] = false;
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(BI)V")
	public static void method5308(@OriginalArg(0) byte arg0) {
		if (Static304.aByteArrayArrayArray10 == null) {
			Static304.aByteArrayArrayArray10 = new byte[4][Static233.anInt5573][Static134.anInt2971];
		}
		for (@Pc(14) int local14 = 0; local14 < 4; local14++) {
			for (@Pc(18) int local18 = 0; local18 < Static233.anInt5573; local18++) {
				for (@Pc(22) int local22 = 0; local22 < Static134.anInt2971; local22++) {
					Static304.aByteArrayArrayArray10[local14][local18][local22] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(Lclient!wo;ILclient!uo;)V")
	public static void method5309(@OriginalArg(0) Class216 arg0, @OriginalArg(2) Class32 arg1) {
		@Pc(10) Class99[] local10 = Static366.method2659(arg0, Static232.anInt4766);
		Static58.aClass5Array9 = new Class5[local10.length];
		for (@Pc(16) int local16 = 0; local16 < local10.length; local16++) {
			Static58.aClass5Array9[local16] = arg1.method2149(local10[local16]);
		}
		local10 = Static366.method2659(arg0, Static228.anInt4739);
		Static81.aClass5Array21 = new Class5[local10.length];
		for (@Pc(43) int local43 = 0; local43 < local10.length; local43++) {
			Static81.aClass5Array21[local43] = arg1.method2149(local10[local43]);
		}
		local10 = Static366.method2659(arg0, Static325.anInt6269);
		Static86.aClass5Array10 = new Class5[local10.length];
		for (@Pc(70) int local70 = 0; local70 < local10.length; local70++) {
			Static86.aClass5Array10[local70] = arg1.method2149(local10[local70]);
		}
		local10 = Static366.method2659(arg0, Static276.anInt5648);
		Static18.aClass5Array3 = new Class5[local10.length];
		for (@Pc(97) int local97 = 0; local97 < local10.length; local97++) {
			Static18.aClass5Array3[local97] = arg1.method2149(local10[local97]);
		}
		local10 = Static366.method2659(arg0, Static260.anInt5589);
		Static261.aClass5Array8 = new Class5[local10.length];
		for (@Pc(124) int local124 = 0; local124 < local10.length; local124++) {
			Static261.aClass5Array8[local124] = arg1.method2149(local10[local124]);
		}
		local10 = Static366.method2659(arg0, Static236.anInt2456);
		Static228.aClass5Array17 = new Class5[local10.length];
		for (@Pc(151) int local151 = 0; local151 < local10.length; local151++) {
			Static228.aClass5Array17[local151] = arg1.method2149(local10[local151]);
		}
		local10 = Static366.method2659(arg0, Static194.anInt4147);
		Static314.aClass5Array24 = new Class5[local10.length];
		for (@Pc(178) int local178 = 0; local178 < local10.length; local178++) {
			Static314.aClass5Array24[local178] = arg1.method2149(local10[local178]);
		}
		local10 = Static366.method2659(arg0, Static8.anInt5857);
		Static300.aClass5Array23 = new Class5[local10.length];
		for (@Pc(213) int local213 = 0; local213 < local10.length; local213++) {
			Static300.aClass5Array23[local213] = arg1.method2149(local10[local213]);
		}
		local10 = Static366.method2659(arg0, Static297.anInt5824);
		Static17.aClass5Array2 = new Class5[local10.length];
		for (@Pc(244) int local244 = 0; local244 < local10.length; local244++) {
			Static17.aClass5Array2[local244] = arg1.method2149(local10[local244]);
		}
		local10 = Static366.method2659(arg0, Static1.anInt24);
		Static166.aClass5Array14 = new Class5[local10.length];
		for (@Pc(275) int local275 = 0; local275 < local10.length; local275++) {
			Static166.aClass5Array14[local275] = arg1.method2149(local10[local275]);
		}
		local10 = Static366.method2659(arg0, Static290.anInt5759);
		Static149.aClass5Array12 = new Class5[local10.length];
		for (@Pc(306) int local306 = 0; local306 < local10.length; local306++) {
			Static149.aClass5Array12[local306] = arg1.method2149(local10[local306]);
		}
		local10 = Static366.method2659(arg0, Static292.anInt4643);
		Static163.aClass5Array13 = new Class5[local10.length];
		for (@Pc(337) int local337 = 0; local337 < local10.length; local337++) {
			Static163.aClass5Array13[local337] = arg1.method2149(local10[local337]);
		}
		local10 = Static366.method2659(arg0, Static27.anInt1009);
		Static9.aClass5Array1 = new Class5[local10.length];
		for (@Pc(364) int local364 = 0; local364 < local10.length; local364++) {
			Static9.aClass5Array1[local364] = arg1.method2149(local10[local364]);
		}
		Static137.aClass5_15 = arg1.method2149(Static366.method2655(arg0, Static139.anInt4699, 0));
	}
}
