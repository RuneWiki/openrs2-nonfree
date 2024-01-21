import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!ih", name = "ab", descriptor = "I")
	public static int anInt2016 = 0;

	@OriginalMember(owner = "client!ih", name = "ib", descriptor = "[Lclient!ed;")
	public static Class23[] aClass23Array8 = new Class23[1000];

	@OriginalMember(owner = "client!ih", name = "jb", descriptor = "[S")
	public static short[] aShortArray29 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!ih", name = "lb", descriptor = "I")
	public static int anInt2024 = 0;

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lclient!ga;III)[Lclient!tg;")
	public static Class1_Sub1_Sub12_Sub4[] method1333(@OriginalArg(0) Class30 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return Static162.method2822(arg1, arg2, arg0) ? Static88.method1546() : null;
	}

	@OriginalMember(owner = "client!ih", name = "e", descriptor = "(I)V")
	public static void method1334() {
		aClass23Array8 = null;
		aShortArray29 = null;
	}

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "(B)V")
	public static void method1335() {
		Static25.aClass1_Sub8_Sub1_1.method919(129);
		for (@Pc(18) Class1_Sub16 local18 = (Class1_Sub16) Static12.aClass10_1.method257(); local18 != null; local18 = (Class1_Sub16) Static12.aClass10_1.method260()) {
			if (local18.anInt3202 == 0) {
				Static27.method495(local18, true);
			}
		}
		if (Static98.aClass60_5 != null) {
			Static39.method659(Static98.aClass60_5);
			Static98.aClass60_5 = null;
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(ZI)V")
	public static void method1336(@OriginalArg(0) boolean arg0) {
		for (@Pc(11) int local11 = 0; local11 < Static86.anInt2307; local11++) {
			@Pc(19) Class1_Sub1_Sub1_Sub1_Sub2 local19 = Static154.aClass1_Sub1_Sub1_Sub1_Sub2Array1[Static141.anIntArray476[local11]];
			@Pc(27) int local27 = (Static141.anIntArray476[local11] << 14) + 536870912;
			if (local19 != null && local19.method1222() && arg0 == local19.aClass1_Sub1_Sub9_1.aBoolean69 && local19.aClass1_Sub1_Sub9_1.method987()) {
				@Pc(52) int local52 = local19.anInt1825 >> 7;
				@Pc(57) int local57 = local19.anInt1838 >> 7;
				if (local57 >= 0 && local57 < 104 && local52 >= 0 && local52 < 104) {
					if (local19.anInt1824 == 1 && (local19.anInt1838 & 0x7F) == 64 && (local19.anInt1825 & 0x7F) == 64) {
						if (Static104.anInt2667 == Static53.anIntArrayArray12[local57][local52]) {
							continue;
						}
						Static53.anIntArrayArray12[local57][local52] = Static104.anInt2667;
					}
					if (!local19.aClass1_Sub1_Sub9_1.aBoolean66) {
						local27 += Integer.MIN_VALUE;
					}
					local19.anInt1832 = Static99.method1680((local19.anInt1824 - 1) * 64 + local19.anInt1825, local19.anInt1838 - -((local19.anInt1824 + -1) * 64), Static85.anInt2267);
					Static123.aClass80_1.method2705(Static85.anInt2267, local19.anInt1838, local19.anInt1825, local19.anInt1832, local19.anInt1824 * 64 + 60 - 64, local19, local19.anInt1843, local27, local19.aBoolean93);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(ZLclient!wf;IIII)V")
	public static void method1337(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class1_Sub1_Sub18 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static33.anInt948 >= 50 || (arg1.anIntArray599 == null || arg1.anIntArray599.length <= arg2)) {
			return;
		}
		@Pc(27) int local27 = arg1.anIntArray599[arg2];
		if (local27 == 0) {
			return;
		}
		@Pc(37) int local37 = local27 >> 8;
		@Pc(41) int local41 = local27 & 0xF;
		@Pc(47) int local47 = local27 >> 4 & 0x7;
		if (local41 == 0) {
			if (arg0) {
				Static167.method2885(0, local47, local37);
			}
		} else if (Static105.anInt2708 != 0) {
			Static17.anIntArray74[Static33.anInt948] = local37;
			Static139.anIntArray473[Static33.anInt948] = local47;
			@Pc(81) int local81 = (arg3 - 64) / 128;
			Static68.anIntArray241[Static33.anInt948] = 0;
			Static44.aClass6Array1[Static33.anInt948] = null;
			@Pc(95) int local95 = (arg4 - 64) / 128;
			Static8.anIntArray48[Static33.anInt948] = local41 + (local81 << 16) + (local95 << 8);
			Static33.anInt948++;
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(BI)Z")
	public static boolean method1338(@OriginalArg(1) int arg0) {
		return arg0 == (-arg0 & arg0);
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lclient!ed;Lclient!ed;IB)V")
	public static void method1339(@OriginalArg(0) Class23 arg0, @OriginalArg(1) Class23 arg1, @OriginalArg(2) int arg2) {
		Static26.method483(arg0, arg1, arg2, null);
	}

	@OriginalMember(owner = "client!ih", name = "f", descriptor = "(I)V")
	public static void method1340() {
		for (@Pc(17) Class1_Sub17 local17 = (Class1_Sub17) Static158.aClass56_15.method1853(); local17 != null; local17 = (Class1_Sub17) Static158.aClass56_15.method1855()) {
			if (local17.anInt3226 == -1) {
				local17.anInt3224 = 0;
				Static125.method2228(local17);
			} else {
				local17.method3141();
			}
		}
	}
}
