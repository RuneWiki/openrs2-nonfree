import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!cb", name = "l", descriptor = "Lclient!rn;")
	public static final Class217 aClass217_20 = new Class217(42, 11);

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)Ljava/lang/String;")
	public static String method846() {
		@Pc(10) String local10 = "www";
		if (Static272.aClass182_9 == Static10.aClass182_1) {
			local10 = "www-wtrc";
		} else if (Static10.aClass182_1 == Static21.aClass182_2) {
			local10 = "www-wtqa";
		} else if (Static10.aClass182_1 == Static289.aClass182_8) {
			local10 = "www-wtwip";
		}
		@Pc(29) String local29 = "";
		if (Static152.aString21 != null) {
			local29 = "/p=" + Static152.aString21;
		}
		return "http://" + local10 + "." + Static57.aClass183_3.aString51 + ".com/l=" + Static53.anInt1454 + "/a=" + Static17.anInt475 + local29 + "/";
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(BLclient!ln;IIB)V")
	public static void method848(@OriginalArg(1) Class7_Sub2_Sub3_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = arg0.anIntArray287[0];
		@Pc(13) int local13 = arg0.anIntArray288[0];
		if (local8 < 0 || local8 >= Static40.anInt1089 || local13 < 0 || Static44.anInt7276 <= local13 || (arg1 < 0 || Static40.anInt1089 <= arg1 || arg2 < 0 || Static44.anInt7276 <= arg2)) {
			return;
		}
		@Pc(70) int local70 = Static140.method2190(-4, local8, true, arg1, 0, Static382.aClass29Array3[arg0.aByte77], 0, local13, arg2, arg0.method3499(), 0, Static92.anIntArray129, Static102.anIntArray136, 0);
		if (local70 >= 1 && local70 <= 3) {
			for (@Pc(87) int local87 = 0; local87 < local70 - 1; local87++) {
				arg0.method3520(Static92.anIntArray129[local87], (byte) 2, Static102.anIntArray136[local87]);
			}
		}
	}
}
