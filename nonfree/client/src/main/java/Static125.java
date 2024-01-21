import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!vd", name = "E", descriptor = "I")
	public static int anInt3203;

	@OriginalMember(owner = "client!vd", name = "X", descriptor = "Lclient!n;")
	public static Class51 aClass51_10;

	@OriginalMember(owner = "client!vd", name = "x", descriptor = "I")
	public static int anInt3198 = 0;

	@OriginalMember(owner = "client!vd", name = "C", descriptor = "Lclient!gd;")
	public static Class28 aClass28_85 = new Class28(64);

	@OriginalMember(owner = "client!vd", name = "D", descriptor = "Lclient!af;")
	public static Class5 aClass5_1414 = Static45.method1937("Untersuchen");

	@OriginalMember(owner = "client!vd", name = "K", descriptor = "Lclient!af;")
	public static Class5 aClass5_1415 = Static45.method1937("sl_button");

	@OriginalMember(owner = "client!vd", name = "T", descriptor = "Lclient!af;")
	private static Class5 aClass5_1422 = Static45.method1937("red:");

	@OriginalMember(owner = "client!vd", name = "L", descriptor = "Lclient!af;")
	public static Class5 aClass5_1416 = aClass5_1422;

	@OriginalMember(owner = "client!vd", name = "M", descriptor = "Lclient!af;")
	private static Class5 aClass5_1417 = Static45.method1937("This computers address has been blocked");

	@OriginalMember(owner = "client!vd", name = "O", descriptor = "Lclient!af;")
	public static Class5 aClass5_1418 = aClass5_1417;

	@OriginalMember(owner = "client!vd", name = "P", descriptor = "Lclient!af;")
	public static Class5 aClass5_1419 = Static45.method1937("Fps:");

	@OriginalMember(owner = "client!vd", name = "Q", descriptor = "Lclient!af;")
	public static Class5 aClass5_1420 = aClass5_1422;

	@OriginalMember(owner = "client!vd", name = "R", descriptor = "Lclient!af;")
	public static Class5 aClass5_1421 = Static45.method1937("Lade Texturen )2 ");

	@OriginalMember(owner = "client!vd", name = "W", descriptor = "Lclient!af;")
	public static Class5 aClass5_1423 = Static45.method1937("Bitte benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "(I)V")
	public static void method2215() {
		Static59.aClass7_6 = new Class7(32);
	}

	@OriginalMember(owner = "client!vd", name = "d", descriptor = "(I)V")
	public static void method2216() {
		aClass28_85.method792();
	}

	@OriginalMember(owner = "client!vd", name = "e", descriptor = "(I)V")
	public static void method2217() {
		for (@Pc(11) int local11 = 0; local11 < Static39.anInt1036; local11++) {
			@Pc(17) int local17 = Static24.anIntArray87[local11]--;
			if (Static24.anIntArray87[local11] >= -10) {
				@Pc(84) Class37 local84 = Static83.aClass37Array1[local11];
				if (local84 == null) {
					local84 = Static134.method1005(Static38.aClass41_Sub1_5, Static115.anIntArray431[local11], 0);
					if (local84 == null) {
						continue;
					}
					Static24.anIntArray87[local11] += local84.method1008();
					Static83.aClass37Array1[local11] = local84;
				}
				if (Static24.anIntArray87[local11] < 0) {
					@Pc(204) int local204;
					if (Static37.anIntArray165[local11] == 0) {
						local204 = Static69.anInt1605;
					} else {
						@Pc(127) int local127 = Static37.anIntArray165[local11] >> 16 & 0xFF;
						@Pc(135) int local135 = (Static37.anIntArray165[local11] & 0xFF) * 128;
						@Pc(145) int local145 = local127 * 128 + 64 - Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anInt3089;
						@Pc(153) int local153 = Static37.anIntArray165[local11] >> 8 & 0xFF;
						if (local145 < 0) {
							local145 = -local145;
						}
						@Pc(171) int local171 = local153 * 128 + 64 - Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anInt3079;
						if (local171 < 0) {
							local171 = -local171;
						}
						@Pc(182) int local182 = local171 + local145 - 128;
						if (local182 > local135) {
							Static24.anIntArray87[local11] = -100;
							continue;
						}
						if (local182 < 0) {
							local182 = 0;
						}
						local204 = (local135 - local182) * Static27.anInt844 / local135;
					}
					if (local204 > 0) {
						@Pc(218) Class1_Sub9_Sub1 local218 = local84.method1007().method2191(Static104.aClass4_1);
						@Pc(223) Class1_Sub1_Sub2 local223 = Static133.method988(local218, local204);
						local223.method980(Static76.anIntArray297[local11] - 1);
						Static122.aClass1_Sub1_Sub1_2.method38(local223);
					}
					Static24.anIntArray87[local11] = -100;
				}
			} else {
				Static39.anInt1036--;
				for (@Pc(31) int local31 = local11; local31 < Static39.anInt1036; local31++) {
					Static115.anIntArray431[local31] = Static115.anIntArray431[local31 + 1];
					Static83.aClass37Array1[local31] = Static83.aClass37Array1[local31 + 1];
					Static76.anIntArray297[local31] = Static76.anIntArray297[local31 + 1];
					Static24.anIntArray87[local31] = Static24.anIntArray87[local31 + 1];
					Static37.anIntArray165[local31] = Static37.anIntArray165[local31 + 1];
				}
				local11--;
			}
		}
		if (Static18.aBoolean117 && !Static70.method1220()) {
			if (Static82.anInt2065 != 0 && Static108.anInt2659 != -1) {
				Static21.method528(Static82.anInt2065, 0, Static108.anInt2659, Static98.aClass41_Sub1_16);
			}
			Static18.aBoolean117 = false;
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIILclient!kb;)[Lclient!fd;")
	public static Class1_Sub3_Sub1_Sub2[] method2218(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class41 arg2) {
		return Static58.method1055(arg0, arg1, arg2) ? Static13.method300() : null;
	}

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "(B)V")
	public static void method2219() {
		aClass28_85 = null;
		aClass5_1418 = null;
		aClass5_1415 = null;
		aClass5_1419 = null;
		aClass5_1417 = null;
		aClass5_1414 = null;
		aClass5_1416 = null;
		aClass5_1422 = null;
		aClass51_10 = null;
		aClass5_1420 = null;
		aClass5_1423 = null;
		aClass5_1421 = null;
	}
}
