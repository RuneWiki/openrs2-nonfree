import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!ed", name = "z", descriptor = "Lclient!nd;")
	public static Class57 aClass57_2;

	@OriginalMember(owner = "client!ed", name = "l", descriptor = "Lclient!lf;")
	public static Class49 aClass49_505 = Static32.method683("(Udns");

	@OriginalMember(owner = "client!ed", name = "t", descriptor = "Lclient!rc;")
	public static Class74 aClass74_31 = new Class74(100);

	@OriginalMember(owner = "client!ed", name = "v", descriptor = "I")
	public static volatile int anInt1001 = 0;

	@OriginalMember(owner = "client!ed", name = "x", descriptor = "Lclient!lf;")
	public static Class49 aClass49_506 = Static32.method683("mod_icons");

	@OriginalMember(owner = "client!ed", name = "B", descriptor = "Lclient!lf;")
	private static Class49 aClass49_509 = Static32.method683("Create a free account");

	@OriginalMember(owner = "client!ed", name = "y", descriptor = "Lclient!lf;")
	public static Class49 aClass49_507 = aClass49_509;

	@OriginalMember(owner = "client!ed", name = "A", descriptor = "Lclient!lf;")
	public static Class49 aClass49_508 = Static32.method683("Benutzen Sie bitte eine andere Welt)3");

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!oe;IIIII)V")
	public static void method792(@OriginalArg(0) Class2_Sub2_Sub3_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != Static40.anInt978) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static91.anInt1931) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static59.anInt1256 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg3 && local23 != arg2)) {
								@Pc(62) Class2_Sub1 local62 = Static72.aClass2_Sub1ArrayArrayArray1[local17][local23][local32];
								if (local62 != null) {
									@Pc(148) int local148 = (Static27.anIntArrayArrayArray2[local17][local23][local32] + Static27.anIntArrayArrayArray2[local17][local23 + 1][local32] + Static27.anIntArrayArrayArray2[local17][local23][local32 + 1] + Static27.anIntArrayArrayArray2[local17][local23 + 1][local32 + 1]) / 4 - (Static27.anIntArrayArrayArray2[arg1][arg2][arg3] + Static27.anIntArrayArrayArray2[arg1][arg2 + 1][arg3] + Static27.anIntArrayArrayArray2[arg1][arg2][arg3 + 1] + Static27.anIntArrayArrayArray2[arg1][arg2 + 1][arg3 + 1]) / 4;
									@Pc(151) Class7 local151 = local62.aClass7_1;
									if (local151 != null) {
										@Pc(161) Class2_Sub2_Sub3_Sub6 local161;
										if (local151.aClass2_Sub2_Sub3_1 instanceof Class2_Sub2_Sub3_Sub6) {
											local161 = (Class2_Sub2_Sub3_Sub6) local151.aClass2_Sub2_Sub3_1;
											Static119.method2019(arg0, local161, (local23 - arg2) * 128 + (1 - arg4) * 64, local148, (local32 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
										if (local151.aClass2_Sub2_Sub3_2 instanceof Class2_Sub2_Sub3_Sub6) {
											local161 = (Class2_Sub2_Sub3_Sub6) local151.aClass2_Sub2_Sub3_2;
											Static119.method2019(arg0, local161, (local23 - arg2) * 128 + (1 - arg4) * 64, local148, (local32 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
									}
									for (@Pc(225) int local225 = 0; local225 < local62.anInt15; local225++) {
										@Pc(231) Class22 local231 = local62.aClass22Array1[local225];
										if (local231 != null && local231.aClass2_Sub2_Sub3_6 instanceof Class2_Sub2_Sub3_Sub6) {
											@Pc(241) Class2_Sub2_Sub3_Sub6 local241 = (Class2_Sub2_Sub3_Sub6) local231.aClass2_Sub2_Sub3_6;
											@Pc(249) int local249 = local231.anInt983 + 1 - local231.anInt1000;
											@Pc(257) int local257 = local231.anInt999 + 1 - local231.anInt988;
											Static119.method2019(arg0, local241, (local231.anInt1000 - arg2) * 128 + (local249 - arg4) * 64, local148, (local231.anInt988 - arg3) * 128 + (local257 - arg5) * 64, local1);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)V")
	public static void method793() {
		Static72.aClass74_51.method2347();
		Static77.aClass74_54.method2347();
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!bg;II)Z")
	public static boolean method794(@OriginalArg(0) Class11 arg0, @OriginalArg(2) int arg1) {
		@Pc(16) byte[] local16 = arg0.method2075(arg1);
		if (local16 == null) {
			return false;
		} else {
			Static5.method96(local16);
			return true;
		}
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(B)V")
	public static void method795() {
		aClass49_507 = null;
		aClass57_2 = null;
		aClass49_505 = null;
		aClass49_506 = null;
		aClass49_508 = null;
		aClass74_31 = null;
		aClass49_509 = null;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIIBIII)V")
	public static void method796(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static163.method531(arg3)) {
			Static129.aClass85Array1 = null;
			Static152.method2524(arg5, -1, arg7, arg2, arg0, arg6, arg1, Static149.aClass85ArrayArray1[arg3], arg4);
			if (Static129.aClass85Array1 != null) {
				Static152.method2524(arg5, -1412584499, arg7, arg2, Static102.anInt2158, Static20.anInt442, arg1, Static129.aClass85Array1, arg4);
				Static129.aClass85Array1 = null;
			}
		} else if (arg2 == -1) {
			for (@Pc(14) int local14 = 0; local14 < 100; local14++) {
				Static171.aBooleanArray18[local14] = true;
			}
		} else {
			Static171.aBooleanArray18[arg2] = true;
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIIII)I")
	public static int method797(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg1 & 0x1) == 1) {
			@Pc(6) int local6 = arg5;
			arg5 = arg0;
			arg0 = local6;
		}
		@Pc(18) int local18 = arg3 & 0x3;
		if (local18 == 0) {
			return arg2;
		} else if (local18 == 1) {
			return 7 + 1 - arg4 - arg5;
		} else if (local18 == 2) {
			return 7 + 1 - arg2 - arg0;
		} else {
			return arg4;
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V")
	public static void method798() {
		Static182.aClass81_15 = new Class81();
	}
}
