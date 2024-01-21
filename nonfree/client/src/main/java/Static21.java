import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!ca", name = "I", descriptor = "Lclient!vb;")
	public static Class82 aClass82_9;

	@OriginalMember(owner = "client!ca", name = "J", descriptor = "Lclient!vb;")
	public static Class82 aClass82_10;

	@OriginalMember(owner = "client!ca", name = "R", descriptor = "I")
	public static int anInt535;

	@OriginalMember(owner = "client!ca", name = "S", descriptor = "Lclient!ag;")
	public static Class4 aClass4_1;

	@OriginalMember(owner = "client!ca", name = "A", descriptor = "I")
	public static int anInt525 = -1;

	@OriginalMember(owner = "client!ca", name = "B", descriptor = "[Lclient!ka;")
	public static Class1_Sub8[] aClass1_Sub8Array1 = new Class1_Sub8[2048];

	@OriginalMember(owner = "client!ca", name = "C", descriptor = "Lclient!tg;")
	public static Class81 aClass81_178 = Static120.method2057(":tradereq:");

	@OriginalMember(owner = "client!ca", name = "F", descriptor = "Lclient!bg;")
	public static Class1_Sub8_Sub1 aClass1_Sub8_Sub1_1 = new Class1_Sub8_Sub1(5000);

	@OriginalMember(owner = "client!ca", name = "Q", descriptor = "Lclient!tg;")
	public static Class81 aClass81_179 = Static120.method2057("Sie haben gerade eine andere Welt verlassen)3");

	@OriginalMember(owner = "client!ca", name = "T", descriptor = "I")
	public static int anInt536 = 0;

	@OriginalMember(owner = "client!ca", name = "U", descriptor = "[I")
	public static int[] anIntArray25 = new int[5];

	@OriginalMember(owner = "client!ca", name = "V", descriptor = "I")
	public static int anInt537 = 0;

	@OriginalMember(owner = "client!ca", name = "d", descriptor = "(B)V")
	public static void method418() {
		aClass81_178 = null;
		aClass82_9 = null;
		aClass1_Sub8_Sub1_1 = null;
		anIntArray25 = null;
		aClass4_1 = null;
		aClass81_179 = null;
		aClass82_10 = null;
		aClass1_Sub8Array1 = null;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(II)Lclient!fd;")
	public static Class1_Sub2_Sub6 method419(@OriginalArg(0) int arg0) {
		@Pc(15) Class1_Sub2_Sub6 local15 = (Class1_Sub2_Sub6) Static30.aClass59_5.method1970((long) arg0);
		if (local15 != null) {
			return local15;
		}
		local15 = Static170.method3008(Static132.aClass82_52, arg0, Static151.aClass82_63);
		if (local15 != null) {
			Static30.aClass59_5.method1973(local15, (long) arg0);
		}
		return local15;
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(III)J")
	public static long method421(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub17 local7 = Static167.aClass1_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass22_1 == null ? 0L : local7.aClass22_1.aLong37;
	}

	@OriginalMember(owner = "client!ca", name = "e", descriptor = "(B)V")
	public static void method422() {
		aClass1_Sub8_Sub1_1.method371();
		@Pc(15) int local15 = aClass1_Sub8_Sub1_1.method375(8);
		@Pc(20) int local20;
		if (local15 < Static35.anInt962) {
			for (local20 = local15; local20 < Static35.anInt962; local20++) {
				Static45.anIntArray94[Static158.anInt3590++] = Static85.anIntArray15[local20];
			}
		}
		if (local15 > Static35.anInt962) {
			throw new RuntimeException("gnpov1");
		}
		Static35.anInt962 = 0;
		for (local20 = 0; local20 < local15; local20++) {
			@Pc(58) int local58 = Static85.anIntArray15[local20];
			@Pc(62) Class1_Sub2_Sub1_Sub3_Sub2 local62 = Static48.aClass1_Sub2_Sub1_Sub3_Sub2Array11[local58];
			@Pc(69) int local69 = aClass1_Sub8_Sub1_1.method375(1);
			if (local69 == 0) {
				Static85.anIntArray15[Static35.anInt962++] = local58;
				local62.anInt3022 = Static142.anInt3104;
			} else {
				@Pc(89) int local89 = aClass1_Sub8_Sub1_1.method375(2);
				if (local89 == 0) {
					Static85.anIntArray15[Static35.anInt962++] = local58;
					local62.anInt3022 = Static142.anInt3104;
					Static90.anIntArray221[Static77.anInt1829++] = local58;
				} else {
					@Pc(134) int local134;
					@Pc(144) int local144;
					if (local89 == 1) {
						Static85.anIntArray15[Static35.anInt962++] = local58;
						local62.anInt3022 = Static142.anInt3104;
						local134 = aClass1_Sub8_Sub1_1.method375(3);
						local62.method2358(local134, false);
						local144 = aClass1_Sub8_Sub1_1.method375(1);
						if (local144 == 1) {
							Static90.anIntArray221[Static77.anInt1829++] = local58;
						}
					} else if (local89 == 2) {
						Static85.anIntArray15[Static35.anInt962++] = local58;
						local62.anInt3022 = Static142.anInt3104;
						local134 = aClass1_Sub8_Sub1_1.method375(3);
						local62.method2358(local134, true);
						local144 = aClass1_Sub8_Sub1_1.method375(3);
						local62.method2358(local144, true);
						@Pc(196) int local196 = aClass1_Sub8_Sub1_1.method375(1);
						if (local196 == 1) {
							Static90.anIntArray221[Static77.anInt1829++] = local58;
						}
					} else if (local89 == 3) {
						Static45.anIntArray94[Static158.anInt3590++] = local58;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ca", name = "f", descriptor = "(B)V")
	public static void method423() {
		Static157.aClass30_15 = new Class30();
	}
}
