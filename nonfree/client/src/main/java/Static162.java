import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!tb", name = "U", descriptor = "I")
	public static int anInt3811;

	@OriginalMember(owner = "client!tb", name = "P", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1311 = Static161.method2971("Regeln versto-8en hat)3");

	@OriginalMember(owner = "client!tb", name = "Q", descriptor = "[I")
	public static int[] anIntArray427 = new int[200];

	@OriginalMember(owner = "client!tb", name = "R", descriptor = "Z")
	public static boolean aBoolean293 = false;

	@OriginalMember(owner = "client!tb", name = "T", descriptor = "Lclient!fd;")
	public static Class20 aClass20_11 = null;

	@OriginalMember(owner = "client!tb", name = "W", descriptor = "Z")
	public static boolean aBoolean294 = false;

	@OriginalMember(owner = "client!tb", name = "ab", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1312 = Static161.method2971("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

	@OriginalMember(owner = "client!tb", name = "cb", descriptor = "I")
	public static int anInt3817 = 0;

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "(III)V")
	public static void method2776() {
		for (@Pc(1) int local1 = 0; local1 < Static4.anInt118; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static101.anInt2832; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static90.anInt2623; local7++) {
					@Pc(16) Class1_Sub10 local16 = Static170.aClass1_Sub10ArrayArrayArray35[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class7 local21 = local16.aClass7_1;
						if (local21 != null && local21.aClass1_Sub2_Sub2_2 instanceof Class1_Sub2_Sub2_Sub1) {
							@Pc(31) Class1_Sub2_Sub2_Sub1 local31 = (Class1_Sub2_Sub2_Sub1) local21.aClass1_Sub2_Sub2_2;
							Static181.method2986(local31, local1, local4, local7, 1, 1);
							if (local21.aClass1_Sub2_Sub2_1 instanceof Class1_Sub2_Sub2_Sub1) {
								@Pc(46) Class1_Sub2_Sub2_Sub1 local46 = (Class1_Sub2_Sub2_Sub1) local21.aClass1_Sub2_Sub2_1;
								Static181.method2986(local46, local1, local4, local7, 1, 1);
								Static13.method495(local31, local46, 0, 0, 0, false);
								local21.aClass1_Sub2_Sub2_1 = local46.method511(local46.aShort4, local46.aShort7, -50, -10, -50, false);
							}
							local21.aClass1_Sub2_Sub2_2 = local31.method511(local31.aShort4, local31.aShort7, -50, -10, -50, false);
						}
						@Pc(104) Class1_Sub2_Sub2_Sub1 local104;
						for (@Pc(88) int local88 = 0; local88 < local16.anInt1544; local88++) {
							@Pc(94) Class59 local94 = local16.aClass59Array4[local88];
							if (local94 != null && local94.aClass1_Sub2_Sub2_7 instanceof Class1_Sub2_Sub2_Sub1) {
								local104 = (Class1_Sub2_Sub2_Sub1) local94.aClass1_Sub2_Sub2_7;
								Static181.method2986(local104, local1, local4, local7, local94.anInt3142 + 1 - local94.anInt3133, local94.anInt3143 - local94.anInt3130 + 1);
								local94.aClass1_Sub2_Sub2_7 = local104.method511(local104.aShort4, local104.aShort7, -50, -10, -50, false);
							}
						}
						@Pc(144) Class56 local144 = local16.aClass56_1;
						if (local144 != null && local144.aClass1_Sub2_Sub2_6 instanceof Class1_Sub2_Sub2_Sub1) {
							local104 = (Class1_Sub2_Sub2_Sub1) local144.aClass1_Sub2_Sub2_6;
							Static89.method1862(local104, local1, local4, local7);
							local144.aClass1_Sub2_Sub2_6 = local104.method511(local104.aShort4, local104.aShort7, -50, -10, -50, false);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(Z)V")
	public static void method2777() {
		aClass20_11 = null;
		anIntArray427 = null;
		aClass13_1312 = null;
		aClass13_1311 = null;
	}

	@OriginalMember(owner = "client!tb", name = "d", descriptor = "(III)V")
	public static void method2778(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) Class82 local11 = Static131.aClass82ArrayArrayArray1[Static156.anInt3696][arg1][arg0];
		if (local11 == null) {
			Static49.method1237(Static156.anInt3696, arg1, arg0);
			return;
		}
		@Pc(20) int local20 = -99999999;
		@Pc(30) Class1_Sub2_Sub2_Sub7 local30 = (Class1_Sub2_Sub2_Sub7) local11.method2849();
		@Pc(32) Class1_Sub2_Sub2_Sub7 local32 = null;
		while (local30 != null) {
			@Pc(38) Class1_Sub2_Sub6 local38 = Static184.method2994(local30.anInt3717);
			@Pc(41) int local41 = local38.anInt1320;
			if (local38.anInt1287 == 1) {
				local41 *= local30.anInt3719 + 1;
			}
			if (local20 < local41) {
				local20 = local41;
				local32 = local30;
			}
			local30 = (Class1_Sub2_Sub2_Sub7) local11.method2855();
		}
		if (local32 == null) {
			Static49.method1237(Static156.anInt3696, arg1, arg0);
			return;
		}
		local11.method2856(local32);
		@Pc(85) Class1_Sub2_Sub2_Sub7 local85 = null;
		local30 = (Class1_Sub2_Sub2_Sub7) local11.method2849();
		@Pc(99) long local99 = (long) ((arg0 << 7) + arg1 + 1610612736);
		@Pc(101) Class1_Sub2_Sub2_Sub7 local101 = null;
		while (local30 != null) {
			if (local32.anInt3717 != local30.anInt3717) {
				if (local101 == null) {
					local101 = local30;
				}
				if (local30.anInt3717 != local101.anInt3717 && local85 == null) {
					local85 = local30;
				}
			}
			local30 = (Class1_Sub2_Sub2_Sub7) local11.method2855();
		}
		Static167.method2854(Static156.anInt3696, arg1, arg0, Static66.method1449(Static156.anInt3696, arg0 * 128 + 64, arg1 * 128 + 64), local32, local99, local101, local85);
	}

	@OriginalMember(owner = "client!tb", name = "e", descriptor = "(I)V")
	public static void method2779() {
		if (Static25.aClass62_2 != null) {
			Static25.aClass62_2.method2277();
		}
	}

	@OriginalMember(owner = "client!tb", name = "f", descriptor = "(I)V")
	public static void method2780() {
		for (@Pc(14) Class1_Sub7 local14 = (Class1_Sub7) Static124.aClass82_9.method2849(); local14 != null; local14 = (Class1_Sub7) Static124.aClass82_9.method2855()) {
			if (local14.anInt712 == -1) {
				local14.anInt719 = 0;
				Static28.method840(local14);
			} else {
				local14.method3056();
			}
		}
	}

	@OriginalMember(owner = "client!tb", name = "g", descriptor = "(I)V")
	public static void method2781(@OriginalArg(0) int arg0) {
		Static77.anInt2157 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static101.anInt2832; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static90.anInt2623; local6++) {
				if (Static170.aClass1_Sub10ArrayArrayArray35[arg0][local3][local6] == null) {
					Static170.aClass1_Sub10ArrayArrayArray35[arg0][local3][local6] = new Class1_Sub10(arg0, local3, local6);
				}
			}
		}
	}
}
