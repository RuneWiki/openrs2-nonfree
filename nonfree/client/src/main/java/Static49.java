import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "Lclient!jw;")
	public static final Class180 aClass180_15 = new Class180(124, 3);

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(B)[Lclient!pia;")
	public static Class270[] method1150() {
		if (Static475.aClass270Array1 == null) {
			@Pc(15) Class270[] local15 = Static148.method2893(Static247.aClass291_1);
			@Pc(19) Class270[] local19 = new Class270[local15.length];
			@Pc(21) int local21 = 0;
			@Pc(26) int local26 = Static24.aClass3_Sub22_4.aClass6_Sub24_1.method7991();
			@Pc(87) int local87;
			@Pc(93) Class270 local93;
			label70: for (@Pc(28) int local28 = 0; local28 < local15.length; local28++) {
				@Pc(34) Class270 local34 = local15[local28];
				if ((local34.anInt7593 <= 0 || local34.anInt7593 >= 24) && local34.anInt7595 >= 800 && local34.anInt7594 >= 600 && (local26 != 2 || local34.anInt7595 <= 800 && local34.anInt7594 <= 600) && (local26 != 1 || local34.anInt7595 <= 1024 && local34.anInt7594 <= 768)) {
					for (local87 = 0; local87 < local21; local87++) {
						local93 = local19[local87];
						if (local34.anInt7595 == local93.anInt7595 && local34.anInt7594 == local93.anInt7594) {
							if (local34.anInt7593 > local93.anInt7593) {
								local19[local87] = local34;
							}
							continue label70;
						}
					}
					local19[local21] = local34;
					local21++;
				}
			}
			Static475.aClass270Array1 = new Class270[local21];
			Static684.method5327(local19, 0, Static475.aClass270Array1, 0, local21);
			@Pc(141) int[] local141 = new int[Static475.aClass270Array1.length];
			for (local87 = 0; local87 < Static475.aClass270Array1.length; local87++) {
				local93 = Static475.aClass270Array1[local87];
				local141[local87] = local93.anInt7595 * local93.anInt7594;
			}
			Static441.method6274(local141, Static475.aClass270Array1);
		}
		return Static475.aClass270Array1;
	}
}
