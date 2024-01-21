import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!ga", name = "v", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!ga", name = "w", descriptor = "I")
	public static int anInt917 = 0;

	@OriginalMember(owner = "client!ga", name = "H", descriptor = "Lclient!u;")
	public static Class74 aClass74_673 = Static72.method1077("Wen m-Ochten Sie entfernen?");

	@OriginalMember(owner = "client!ga", name = "J", descriptor = "I")
	public static int anInt929 = 0;

	@OriginalMember(owner = "client!ga", name = "O", descriptor = "I")
	public static int anInt934 = -1;

	@OriginalMember(owner = "client!ga", name = "P", descriptor = "Lclient!u;")
	private static Class74 aClass74_674 = Static72.method1077("Error loading your profile)3");

	@OriginalMember(owner = "client!ga", name = "Q", descriptor = "Lclient!u;")
	public static Class74 aClass74_675 = aClass74_674;

	@OriginalMember(owner = "client!ga", name = "R", descriptor = "Lclient!u;")
	private static Class74 aClass74_676 = Static72.method1077("skill)2");

	@OriginalMember(owner = "client!ga", name = "T", descriptor = "I")
	public static int anInt936 = 0;

	@OriginalMember(owner = "client!ga", name = "U", descriptor = "Z")
	public static boolean aBoolean33 = false;

	@OriginalMember(owner = "client!ga", name = "V", descriptor = "Lclient!u;")
	public static Class74 aClass74_677 = aClass74_676;

	@OriginalMember(owner = "client!ga", name = "W", descriptor = "Z")
	public static boolean aBoolean34 = false;

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "(I)V")
	public static void method650() {
		aClass74_676 = null;
		aByteArrayArrayArray2 = null;
		aClass74_677 = null;
		aClass74_674 = null;
		aClass74_675 = null;
		aClass74_673 = null;
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(B)V")
	public static void method651() {
		Static65.aClass7_1.method925();
		for (@Pc(15) int local15 = 0; local15 < 32; local15++) {
			Static123.aLongArray15[local15] = 0L;
		}
		for (@Pc(27) int local27 = 0; local27 < 32; local27++) {
			Static17.aLongArray7[local27] = 0L;
		}
		Static99.anInt2122 = 0;
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(II)V")
	public static void method652(@OriginalArg(0) int arg0) {
		if (!Static77.method1209(arg0)) {
			return;
		}
		@Pc(14) Class2_Sub2_Sub17[] local14 = Static89.aClass2_Sub2_Sub17ArrayArray1[arg0];
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(22) Class2_Sub2_Sub17 local22 = local14[local16];
			if (local22 != null) {
				local22.anInt2776 = 0;
				local22.anInt2805 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IZ)Lclient!cd;")
	public static Class2_Sub2_Sub4 method653(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub2_Sub4 local10 = (Class2_Sub2_Sub4) Static70.aClass16_57.method490((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static101.aClass26_27.method1358(arg0, 13);
		local10 = new Class2_Sub2_Sub4();
		local10.anInt412 = arg0;
		if (local20 != null) {
			local10.method337(new Class2_Sub10(local20));
		}
		Static70.aClass16_57.method492(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(ZLclient!g;Lclient!g;)I")
	public static int method655(@OriginalArg(1) Class26 arg0, @OriginalArg(2) Class26 arg1) {
		@Pc(5) int local5 = 0;
		if (arg1.method1372(Static49.aClass74_843, Static68.aClass74_1047)) {
			local5++;
		}
		if (arg0.method1372(Static49.aClass74_843, Static7.aClass74_1659)) {
			local5++;
		}
		if (arg0.method1372(Static49.aClass74_843, Static67.aClass74_1033)) {
			local5++;
		}
		if (arg0.method1372(Static49.aClass74_843, Static116.aClass74_1555)) {
			local5++;
		}
		if (arg0.method1372(Static49.aClass74_843, Static101.aClass74_1456)) {
			local5++;
		}
		if (arg0.method1372(Static49.aClass74_843, Static70.aClass74_1092)) {
			local5++;
		}
		arg0.method1372(Static49.aClass74_843, Static119.aClass74_1592);
		arg0.method1372(Static49.aClass74_843, Static39.aClass74_683);
		arg0.method1372(Static49.aClass74_843, Static93.aClass74_1327);
		arg0.method1372(Static49.aClass74_843, Static24.aClass74_515);
		arg0.method1372(Static49.aClass74_843, Static106.aClass74_1492);
		return local5;
	}

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "(B)V")
	public static void method656() {
		while (true) {
			if (Static19.aClass2_Sub10_Sub1_1.method1535(Static16.anInt463) >= 27) {
				@Pc(16) int local16 = Static19.aClass2_Sub10_Sub1_1.method1538(15);
				if (local16 != 32767) {
					@Pc(23) boolean local23 = false;
					if (Static80.aClass2_Sub2_Sub2_Sub1_Sub1Array1[local16] == null) {
						local23 = true;
						Static80.aClass2_Sub2_Sub2_Sub1_Sub1Array1[local16] = new Class2_Sub2_Sub2_Sub1_Sub1();
					}
					@Pc(39) Class2_Sub2_Sub2_Sub1_Sub1 local39 = Static80.aClass2_Sub2_Sub2_Sub1_Sub1Array1[local16];
					Static40.anIntArray110[Static29.anInt686++] = local16;
					local39.anInt2681 = Static107.anInt2338;
					@Pc(55) int local55 = Static19.aClass2_Sub10_Sub1_1.method1538(1);
					@Pc(62) int local62 = Static120.anIntArray369[Static19.aClass2_Sub10_Sub1_1.method1538(3)];
					if (local23) {
						local39.anInt2720 = local62;
					}
					local39.aClass2_Sub2_Sub9_1 = Static8.method168(Static19.aClass2_Sub10_Sub1_1.method1538(13));
					@Pc(80) int local80 = Static19.aClass2_Sub10_Sub1_1.method1538(1);
					if (local80 == 1) {
						Static81.anIntArray255[Static107.anInt2342++] = local16;
					}
					@Pc(98) int local98 = Static19.aClass2_Sub10_Sub1_1.method1538(5);
					@Pc(103) int local103 = Static19.aClass2_Sub10_Sub1_1.method1538(5);
					local39.anInt2697 = local39.aClass2_Sub2_Sub9_1.anInt1078;
					local39.anInt2722 = local39.aClass2_Sub2_Sub9_1.anInt1110;
					if (local103 > 15) {
						local103 -= 32;
					}
					local39.anInt2682 = local39.aClass2_Sub2_Sub9_1.anInt1095;
					local39.anInt2707 = local39.aClass2_Sub2_Sub9_1.anInt1087;
					local39.anInt2693 = local39.aClass2_Sub2_Sub9_1.anInt1100;
					local39.anInt2688 = local39.aClass2_Sub2_Sub9_1.anInt1101;
					if (local98 > 15) {
						local98 -= 32;
					}
					local39.anInt2708 = local39.aClass2_Sub2_Sub9_1.anInt1080;
					if (local39.anInt2707 == 0) {
						local39.anInt2720 = 0;
					}
					local39.anInt2692 = local39.aClass2_Sub2_Sub9_1.anInt1082;
					local39.anInt2703 = local39.aClass2_Sub2_Sub9_1.anInt1103;
					local39.method1867(local55 == 1, local103 + Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anIntArray394[0], local98 + Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anIntArray393[0]);
					continue;
				}
			}
			Static19.aClass2_Sub10_Sub1_1.method1537();
			return;
		}
	}
}
