import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!b", name = "e", descriptor = "I")
	public static int anInt409;

	@OriginalMember(owner = "client!b", name = "g", descriptor = "I")
	public static int anInt410;

	@OriginalMember(owner = "client!b", name = "j", descriptor = "[Lclient!bf;")
	public static Class1_Sub2_Sub2[] aClass1_Sub2_Sub2Array1;

	@OriginalMember(owner = "client!b", name = "m", descriptor = "Z")
	public static boolean aBoolean34;

	@OriginalMember(owner = "client!b", name = "a", descriptor = "I")
	public static int anInt406 = -1;

	@OriginalMember(owner = "client!b", name = "b", descriptor = "[S")
	public static short[] aShortArray2 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!b", name = "f", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray2 = new String[100];

	@OriginalMember(owner = "client!b", name = "k", descriptor = "[I")
	public static int[] anIntArray36 = new int[] { 4, 3, 0, 0, 6, 0, 6, 0, 7, -2, 0, 0, 0, 0, 14, 1, 0, 0, 28, 0, -1, -2, 0, 0, -1, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 10, 0, 0, 3, 0, 0, 0, 0, 2, 15, 0, 0, -2, 6, 8, 0, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, 0, -2, 0, 0, 8, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 6, 6, 0, 0, 2, 0, 0, 2, 6, 8, 0, -1, 0, 3, 0, 0, 0, 6, 12, 0, 5, 2, 0, 0, 0, -2, 0, 0, 0, 0, 0, 3, -2, 10, -2, 0, -2, 0, -2, 0, 0, 0, 0, 0, 0, 0, 2, 0, -1, 0, 0, 0, 3, 12, 2, 0, 0, 1, 0, 0, -1, 8, 0, 0, 3, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, -1, -2, 9, 0, 6, 7, 0, 12, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 7, 0, 8, 0, 0, 0, 0, 0, 0, 11, 3, -2, 8, 0, 10, -2, 0, 0, 0, 0, 0, 0, 0, -1, 20, 0, -1, 0, 0, 0, 0, -1, 0, 0, 0, 5, -1, 0, 0, 0, 4, 0, 0, 0, 6, 0, 0, 15, 1, 0, -2, 7, 1, 0, 14, 8, 0, -1, 0, 3, 1, 0, 5, -1, 2, 0, 0, 8, 0, 0, 12, 0, 4, 0, 0, 0, 17, 8 };

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(I)V")
	public static void method314() {
		if (!Static240.aBoolean369 || Static65.aBoolean104) {
			return;
		}
		@Pc(15) Class1_Sub19[][][] local15 = Static130.aClass1_Sub19ArrayArrayArray1;
		for (@Pc(17) int local17 = 0; local17 < local15.length; local17++) {
			@Pc(29) Class1_Sub19[][] local29 = local15[local17];
			for (@Pc(31) int local31 = 0; local31 < local29.length; local31++) {
				for (@Pc(37) int local37 = 0; local37 < local29[local31].length; local37++) {
					@Pc(49) Class1_Sub19 local49 = local29[local31][local37];
					if (local49 != null) {
						@Pc(66) Class6_Sub2_Sub2 local66;
						if (local49.aClass167_1 != null && local49.aClass167_1.aClass6_9 instanceof Class6_Sub2_Sub2) {
							local66 = (Class6_Sub2_Sub2) local49.aClass167_1.aClass6_9;
							if ((Long.MIN_VALUE & local49.aClass167_1.aLong178) == 0L) {
								local66.method2099(false, true, true, false, true, true);
							} else {
								local66.method2099(true, true, true, true, true, true);
							}
						}
						if (local49.aClass63_1 != null) {
							if (local49.aClass63_1.aClass6_4 instanceof Class6_Sub2_Sub2) {
								local66 = (Class6_Sub2_Sub2) local49.aClass63_1.aClass6_4;
								if ((Long.MIN_VALUE & local49.aClass63_1.aLong55) == 0L) {
									local66.method2099(false, true, true, false, true, true);
								} else {
									local66.method2099(true, true, true, true, true, true);
								}
							}
							if (local49.aClass63_1.aClass6_5 instanceof Class6_Sub2_Sub2) {
								local66 = (Class6_Sub2_Sub2) local49.aClass63_1.aClass6_5;
								if ((Long.MIN_VALUE & local49.aClass63_1.aLong55) == 0L) {
									local66.method2099(false, true, true, false, true, true);
								} else {
									local66.method2099(true, true, true, true, true, true);
								}
							}
						}
						if (local49.aClass125_1 != null) {
							if (local49.aClass125_1.aClass6_8 instanceof Class6_Sub2_Sub2) {
								local66 = (Class6_Sub2_Sub2) local49.aClass125_1.aClass6_8;
								if ((local49.aClass125_1.aLong118 & Long.MIN_VALUE) == 0L) {
									local66.method2099(false, true, true, false, true, true);
								} else {
									local66.method2099(true, true, true, true, true, true);
								}
							}
							if (local49.aClass125_1.aClass6_7 instanceof Class6_Sub2_Sub2) {
								local66 = (Class6_Sub2_Sub2) local49.aClass125_1.aClass6_7;
								if ((local49.aClass125_1.aLong118 & Long.MIN_VALUE) == 0L) {
									local66.method2099(false, true, true, false, true, true);
								} else {
									local66.method2099(true, true, true, true, true, true);
								}
							}
						}
						for (@Pc(264) int local264 = 0; local264 < local49.anInt2570; local264++) {
							if (local49.aClass124Array2[local264].aClass6_6 instanceof Class6_Sub2_Sub2) {
								@Pc(286) Class6_Sub2_Sub2 local286 = (Class6_Sub2_Sub2) local49.aClass124Array2[local264].aClass6_6;
								if ((local49.aClass124Array2[local264].aLong114 & Long.MIN_VALUE) == 0L) {
									local286.method2099(false, true, true, false, true, true);
								} else {
									local286.method2099(true, true, true, true, true, true);
								}
							}
						}
					}
				}
			}
		}
		Static65.aBoolean104 = true;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(II)V")
	public static void method315() {
		Static285.aClass31_44.method856(5);
		Static150.aClass31_24.method856(5);
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(ZI)Lclient!oc;")
	public static Class1_Sub2_Sub13 method316(@OriginalArg(1) int arg0) {
		return (Class1_Sub2_Sub13) Static45.aClass22_3.method633((long) arg0);
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(BS)Z")
	public static boolean method317(@OriginalArg(1) short arg0) {
		if (arg0 == 15 || arg0 == 2 || arg0 == 22 || arg0 == 26 || arg0 == 45 || arg0 == 31 || arg0 == 18 || arg0 == 49) {
			return true;
		} else if (arg0 == 29 || arg0 == 50 || arg0 == 1006 || arg0 == 1004) {
			return true;
		} else if (arg0 == 8 || arg0 == 10 || arg0 == 3 || arg0 == 57 || arg0 == 17) {
			return true;
		} else {
			return arg0 == 47 || arg0 == 46 || arg0 == 38 || arg0 == 43 || arg0 == 16 || arg0 == 13;
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Lclient!ak;ZILclient!ak;)V")
	public static void method318(@OriginalArg(0) Class7 arg0, @OriginalArg(3) Class7 arg1) {
		Static189.aClass7_154 = arg0;
		Static30.aClass7_34 = arg1;
		Static183.aBoolean435 = true;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Lclient!ak;BLclient!q;Lclient!ak;Z)V")
	public static void method319(@OriginalArg(0) Class7 arg0, @OriginalArg(2) Class1_Sub2_Sub12_Sub1 arg1, @OriginalArg(3) Class7 arg2) {
		Static2.aClass7_5 = arg2;
		Static98.aBoolean137 = true;
		Static11.aClass7_17 = arg0;
		@Pc(15) int local15 = Static2.aClass7_5.method257() - 1;
		Static54.anInt1155 = Static2.aClass7_5.method265(local15) + local15 * 256;
		Static105.aClass1_Sub2_Sub12_Sub1_1 = arg1;
		Static260.aStringArray30 = new String[] { null, null, Static260.aString176, null, null };
		Static32.aStringArray4 = new String[] { null, null, null, null, Static22.aString173 };
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(BI)V")
	public static void method320(@OriginalArg(1) int arg0) {
		if (arg0 == -1 || !Static228.method3502(arg0)) {
			return;
		}
		@Pc(18) Class127[] local18 = Static86.aClass127ArrayArray1[arg0];
		for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
			@Pc(34) Class127 local34 = local18[local20];
			if (local34.anObjectArray5 != null) {
				@Pc(42) Class1_Sub20 local42 = new Class1_Sub20();
				local42.anObjectArray2 = local34.anObjectArray5;
				local42.aClass127_9 = local34;
				Static137.method3045(2000000, local42);
			}
		}
	}
}
