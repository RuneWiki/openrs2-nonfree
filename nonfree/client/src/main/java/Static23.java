import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(I)V")
	public static void method608() {
		Static419.method6760();
		Static197.method3974(Static74.aClass2_Sub13_5.aClass14_Sub13_1.method5249() == 1);
		Static538.aClass33_45 = Static469.method7404(22050, Static268.aClass370_3, Static639.aCanvas10, 0);
		Static263.method4857(Static433.method6890(null));
		Static470.aClass33_31 = Static469.method7404(2048, Static268.aClass370_3, Static639.aCanvas10, 1);
		Static470.aClass33_31.method7218(Static614.aClass2_Sub8_Sub4_2);
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(III)I")
	public static int method609(@OriginalArg(2) int arg0) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			return 96;
		} else {
			@Pc(42) int local42 = (arg0 & 0x7F) * 96 >> 7;
			if (local42 < 2) {
				local42 = 2;
			} else if (local42 > 126) {
				local42 = 126;
			}
			return local42 + (arg0 & 0xFF80);
		}
	}
}
