import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!va", name = "b", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!va", name = "e", descriptor = "Lclient!lc;")
	public static Class40 aClass40_87;

	@OriginalMember(owner = "client!va", name = "a", descriptor = "I")
	public static int anInt2916 = 0;

	@OriginalMember(owner = "client!va", name = "c", descriptor = "Z")
	public static boolean aBoolean119 = false;

	@OriginalMember(owner = "client!va", name = "g", descriptor = "Lclient!qc;")
	public static Class60 aClass60_1167 = Static121.method2047("<)4col> x");

	@OriginalMember(owner = "client!va", name = "j", descriptor = "Lclient!qc;")
	public static Class60 aClass60_1168 = Static121.method2047("Regeln versto-8en hat)3");

	@OriginalMember(owner = "client!va", name = "l", descriptor = "Lclient!qc;")
	public static Class60 aClass60_1169 = Static121.method2047("Wordpack geladen)3");

	@OriginalMember(owner = "client!va", name = "m", descriptor = "Ljava/util/Calendar;")
	public static Calendar aCalendar1 = Calendar.getInstance();

	@OriginalMember(owner = "client!va", name = "n", descriptor = "I")
	public static int anInt2922 = 0;

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(B)V")
	public static void method2061() {
		Static105.aClass4_Sub13_Sub1_3.method1263();
		@Pc(17) int local17 = Static105.aClass4_Sub13_Sub1_3.method1260(8);
		@Pc(22) int local22;
		if (local17 < Static114.anInt2750) {
			for (local22 = local17; local22 < Static114.anInt2750; local22++) {
				Static73.anIntArray190[Static128.anInt2631++] = Static38.anIntArray72[local22];
			}
		}
		if (Static114.anInt2750 < local17) {
			throw new RuntimeException("gnpov1");
		}
		Static114.anInt2750 = 0;
		for (local22 = 0; local22 < local17; local22++) {
			@Pc(64) int local64 = Static38.anIntArray72[local22];
			@Pc(68) Class4_Sub4_Sub1_Sub2_Sub1 local68 = Static120.aClass4_Sub4_Sub1_Sub2_Sub1Array2[local64];
			@Pc(73) int local73 = Static105.aClass4_Sub13_Sub1_3.method1260(1);
			if (local73 == 0) {
				Static38.anIntArray72[Static114.anInt2750++] = local64;
				local68.anInt2592 = Static81.anInt1944;
			} else {
				@Pc(96) int local96 = Static105.aClass4_Sub13_Sub1_3.method1260(2);
				if (local96 == 0) {
					Static38.anIntArray72[Static114.anInt2750++] = local64;
					local68.anInt2592 = Static81.anInt1944;
					Static35.anIntArray68[Static85.anInt2030++] = local64;
				} else {
					@Pc(143) int local143;
					@Pc(153) int local153;
					if (local96 == 1) {
						Static38.anIntArray72[Static114.anInt2750++] = local64;
						local68.anInt2592 = Static81.anInt1944;
						local143 = Static105.aClass4_Sub13_Sub1_3.method1260(3);
						local68.method1875(false, local143);
						local153 = Static105.aClass4_Sub13_Sub1_3.method1260(1);
						if (local153 == 1) {
							Static35.anIntArray68[Static85.anInt2030++] = local64;
						}
					} else if (local96 == 2) {
						Static38.anIntArray72[Static114.anInt2750++] = local64;
						local68.anInt2592 = Static81.anInt1944;
						local143 = Static105.aClass4_Sub13_Sub1_3.method1260(3);
						local68.method1875(true, local143);
						local153 = Static105.aClass4_Sub13_Sub1_3.method1260(3);
						local68.method1875(true, local153);
						@Pc(207) int local207 = Static105.aClass4_Sub13_Sub1_3.method1260(1);
						if (local207 == 1) {
							Static35.anIntArray68[Static85.anInt2030++] = local64;
						}
					} else if (local96 == 3) {
						Static73.anIntArray190[Static128.anInt2631++] = local64;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(B)V")
	public static void method2062() {
		anIntArrayArrayArray7 = null;
		aClass60_1167 = null;
		aCalendar1 = null;
		aClass60_1169 = null;
		aClass60_1168 = null;
		aClass40_87 = null;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(III)V")
	public static void method2063(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) long local6 = (long) (arg0 + (arg1 << 16));
		@Pc(16) Class4_Sub4_Sub15 local16 = (Class4_Sub4_Sub15) Static60.aClass66_8.method1834(local6);
		if (local16 != null) {
			Static126.aClass13_2.method291(local16);
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(II)Z")
	public static boolean method2064(@OriginalArg(1) int arg0) {
		return (arg0 >> 30 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(I)V")
	public static void method2065() {
		Static105.aClass4_Sub13_Sub1_3.method1263();
		@Pc(11) int local11 = Static105.aClass4_Sub13_Sub1_3.method1260(1);
		if (local11 == 0) {
			return;
		}
		@Pc(19) int local19 = Static105.aClass4_Sub13_Sub1_3.method1260(2);
		if (local19 == 0) {
			Static35.anIntArray68[Static85.anInt2030++] = 2047;
			return;
		}
		@Pc(38) int local38;
		@Pc(48) int local48;
		if (local19 == 1) {
			local38 = Static105.aClass4_Sub13_Sub1_3.method1260(3);
			Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.method1875(false, local38);
			local48 = Static105.aClass4_Sub13_Sub1_3.method1260(1);
			if (local48 == 1) {
				Static35.anIntArray68[Static85.anInt2030++] = 2047;
			}
			return;
		}
		@Pc(92) int local92;
		if (local19 == 2) {
			local38 = Static105.aClass4_Sub13_Sub1_3.method1260(3);
			Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.method1875(true, local38);
			local48 = Static105.aClass4_Sub13_Sub1_3.method1260(3);
			Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.method1875(true, local48);
			local92 = Static105.aClass4_Sub13_Sub1_3.method1260(1);
			if (local92 == 1) {
				Static35.anIntArray68[Static85.anInt2030++] = 2047;
			}
		} else if (local19 == 3) {
			local38 = Static105.aClass4_Sub13_Sub1_3.method1260(1);
			Static129.anInt3003 = Static105.aClass4_Sub13_Sub1_3.method1260(2);
			local48 = Static105.aClass4_Sub13_Sub1_3.method1260(7);
			local92 = Static105.aClass4_Sub13_Sub1_3.method1260(1);
			if (local92 == 1) {
				Static35.anIntArray68[Static85.anInt2030++] = 2047;
			}
			@Pc(145) int local145 = Static105.aClass4_Sub13_Sub1_3.method1260(7);
			Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.method1880(local48, local38 == 1, local145);
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(ILclient!lc;Lclient!qc;Lclient!qc;)Lclient!da;")
	public static Class4_Sub4_Sub3_Sub1 method2066(@OriginalArg(1) Class40 arg0, @OriginalArg(2) Class60 arg1, @OriginalArg(3) Class60 arg2) {
		@Pc(4) int local4 = arg0.method1107(arg1);
		@Pc(16) int local16 = arg0.method1100(local4, arg2);
		return Static75.method1405(local16, arg0, local4);
	}
}
