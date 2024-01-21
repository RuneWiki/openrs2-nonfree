import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!i", name = "e", descriptor = "I")
	public static int anInt1207;

	@OriginalMember(owner = "client!i", name = "g", descriptor = "[I")
	public static int[] anIntArray121;

	@OriginalMember(owner = "client!i", name = "m", descriptor = "[I")
	public static int[] anIntArray123;

	@OriginalMember(owner = "client!i", name = "a", descriptor = "Lclient!od;")
	public static Class60 aClass60_457 = Static41.method597("Geben Sie Ihren Benutzernamen");

	@OriginalMember(owner = "client!i", name = "b", descriptor = "I")
	public static int anInt1204 = -1;

	@OriginalMember(owner = "client!i", name = "d", descriptor = "I")
	public static int anInt1206 = 0;

	@OriginalMember(owner = "client!i", name = "f", descriptor = "Lclient!cb;")
	public static Class12 aClass12_9 = new Class12(64);

	@OriginalMember(owner = "client!i", name = "h", descriptor = "[I")
	public static int[] anIntArray122 = new int[5];

	@OriginalMember(owner = "client!i", name = "i", descriptor = "Lclient!od;")
	public static Class60 aClass60_458 = Static41.method597("::fpsoff");

	@OriginalMember(owner = "client!i", name = "j", descriptor = "Lclient!od;")
	public static Class60 aClass60_459 = Static41.method597("Fehler bei der Verbindung zum Server)3");

	@OriginalMember(owner = "client!i", name = "k", descriptor = "Lclient!od;")
	public static Class60 aClass60_460 = Static41.method597("Freie Welt");

	@OriginalMember(owner = "client!i", name = "l", descriptor = "Lclient!od;")
	public static Class60 aClass60_461 = Static41.method597(" <col=ffff00>");

	@OriginalMember(owner = "client!i", name = "n", descriptor = "Lclient!od;")
	public static Class60 aClass60_462 = Static41.method597("mn");

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(B)V")
	public static void method683() {
		for (@Pc(3) int local3 = 0; local3 < Static118.anInt2731; local3++) {
			@Pc(9) int local9 = Static123.anIntArray339[local3]--;
			if (Static123.anIntArray339[local3] >= -10) {
				@Pc(82) Class9 local82 = Static40.aClass9Array1[local3];
				if (local82 == null) {
					local82 = Static135.method224(Static116.aClass10_Sub1_19, Static98.anIntArray295[local3], 0);
					if (local82 == null) {
						continue;
					}
					Static123.anIntArray339[local3] += local82.method222();
					Static40.aClass9Array1[local3] = local82;
				}
				if (Static123.anIntArray339[local3] < 0) {
					@Pc(117) int local117;
					if (Static67.anIntArray191[local3] == 0) {
						local117 = Static46.anInt1147;
					} else {
						@Pc(127) int local127 = (Static67.anIntArray191[local3] & 0xFF) * 128;
						@Pc(135) int local135 = Static67.anIntArray191[local3] >> 16 & 0xFF;
						@Pc(145) int local145 = local135 * 128 + 64 - Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anInt1440;
						if (local145 < 0) {
							local145 = -local145;
						}
						@Pc(161) int local161 = Static67.anIntArray191[local3] >> 8 & 0xFF;
						@Pc(171) int local171 = local161 * 128 + 64 - Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anInt1407;
						if (local171 < 0) {
							local171 = -local171;
						}
						@Pc(182) int local182 = local171 + local145 - 128;
						if (local127 < local182) {
							Static123.anIntArray339[local3] = -100;
							continue;
						}
						if (local182 < 0) {
							local182 = 0;
						}
						local117 = (local127 - local182) * Static120.anInt2754 / local127;
					}
					if (local117 > 0) {
						@Pc(221) Class4_Sub6_Sub1 local221 = local82.method225().method1638(Static40.aClass63_1);
						@Pc(226) Class4_Sub1_Sub2 local226 = Static137.method937(local221, local117);
						local226.method899(Static11.anIntArray40[local3] - 1);
						Static109.aClass4_Sub1_Sub3_1.method967(local226);
					}
					Static123.anIntArray339[local3] = -100;
				}
			} else {
				Static118.anInt2731--;
				for (@Pc(25) int local25 = local3; local25 < Static118.anInt2731; local25++) {
					Static98.anIntArray295[local25] = Static98.anIntArray295[local25 + 1];
					Static40.aClass9Array1[local25] = Static40.aClass9Array1[local25 + 1];
					Static11.anIntArray40[local25] = Static11.anIntArray40[local25 + 1];
					Static123.anIntArray339[local25] = Static123.anIntArray339[local25 + 1];
					Static67.anIntArray191[local25] = Static67.anIntArray191[local25 + 1];
				}
				local3--;
			}
		}
		if (Static130.aBoolean126 && !Static39.method582()) {
			if (Static63.anInt1593 != 0 && Static23.anInt808 != -1) {
				Static6.method57(Static23.anInt808, 0, Static10.aClass10_Sub1_3, Static63.anInt1593);
			}
			Static130.aBoolean126 = false;
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
	public static void method684() {
		aClass12_9 = null;
		anIntArray123 = null;
		aClass60_458 = null;
		aClass60_457 = null;
		aClass60_459 = null;
		aClass60_462 = null;
		aClass60_461 = null;
		aClass60_460 = null;
		anIntArray121 = null;
		anIntArray122 = null;
	}
}
