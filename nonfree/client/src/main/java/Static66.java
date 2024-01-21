import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!ib", name = "R", descriptor = "Lclient!gb;")
	public static Class2_Sub2_Sub8 aClass2_Sub2_Sub8_1;

	@OriginalMember(owner = "client!ib", name = "Q", descriptor = "I")
	public static int anInt1833 = 0;

	@OriginalMember(owner = "client!ib", name = "T", descriptor = "Lclient!sg;")
	private static Class77 aClass77_729 = Static146.method2172("Sorry invited players only)3");

	@OriginalMember(owner = "client!ib", name = "V", descriptor = "Lclient!sg;")
	public static Class77 aClass77_730 = aClass77_729;

	@OriginalMember(owner = "client!ib", name = "Y", descriptor = "Lclient!sg;")
	public static Class77 aClass77_731 = Static146.method2172("Fehler bei der Verbindung zum Server)3");

	@OriginalMember(owner = "client!ib", name = "f", descriptor = "(I)V")
	public static void method1325() {
		aClass77_730 = null;
		aClass77_729 = null;
		aClass2_Sub2_Sub8_1 = null;
		aClass77_731 = null;
	}

	@OriginalMember(owner = "client!ib", name = "g", descriptor = "(I)V")
	public static void method1326() {
		Static78.anIntArray345 = new int[33];
		Static25.anIntArray99 = new int[151];
		Static171.anIntArray604 = new int[33];
		Static114.anIntArray432 = new int[151];
		@Pc(23) int local23;
		@Pc(25) int local25;
		@Pc(27) int local27;
		for (@Pc(19) int local19 = 0; local19 < 33; local19++) {
			local23 = 999;
			local25 = 0;
			for (local27 = 0; local27 < 34; local27++) {
				if (Static100.aClass2_Sub2_Sub3_Sub3_2.aByteArray24[local19 * Static100.aClass2_Sub2_Sub3_Sub3_2.anInt1451 + local27] == 0) {
					if (local23 == 999) {
						local23 = local27;
					}
				} else if (local23 != 999) {
					local25 = local27;
					break;
				}
			}
			Static78.anIntArray345[local19] = local23;
			Static171.anIntArray604[local19] = local25 - local23;
		}
		for (local23 = 5; local23 < 156; local23++) {
			local25 = 999;
			local27 = 0;
			for (@Pc(89) int local89 = 25; local89 < 172; local89++) {
				if (Static100.aClass2_Sub2_Sub3_Sub3_2.aByteArray24[local23 * Static100.aClass2_Sub2_Sub3_Sub3_2.anInt1451 + local89] == 0 && (local89 > 34 || local23 > 34)) {
					if (local25 == 999) {
						local25 = local89;
					}
				} else if (local25 != 999) {
					local27 = local89;
					break;
				}
			}
			Static25.anIntArray99[local23 - 5] = local25 - 25;
			Static114.anIntArray432[local23 - 5] = local27 - local25;
		}
	}
}
