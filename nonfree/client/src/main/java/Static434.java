import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static434 {

	@OriginalMember(owner = "client!pia", name = "p", descriptor = "B")
	public static byte aByte106;

	@OriginalMember(owner = "client!pia", name = "o", descriptor = "Lclient!fba;")
	public static final Class102 aClass102_45 = new Class102(4);

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(III)V")
	public static void method6781(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static398.aClass5_13 == null) {
			return;
		}
		@Pc(10) int local10 = Static330.anInt6169;
		@Pc(12) int local12 = Static592.anInt9706;
		Static223.method3722(arg0, arg1);
		if (Static234.anInt4427 == 0) {
			Static613.anInterface8_1 = null;
			Static613.anInterface8_1 = Static398.aClass5_13.method7512(Static398.aClass5_13.method7511(Static476.anInt8315, Static430.anInt7728), Static398.aClass5_13.method7488(Static476.anInt8315, Static430.anInt7728));
		} else if (Static234.anInt4427 == 1 && (Static440.anInterface8Array1 == null || Static330.anInt6169 != local10 || local12 != Static592.anInt9706)) {
			Static440.anInterface8Array1 = new Interface8[Static330.anInt6169 * Static592.anInt9706];
			for (@Pc(37) int local37 = 0; local37 < Static440.anInterface8Array1.length; local37++) {
				Static440.anInterface8Array1[local37] = Static398.aClass5_13.method7512(Static398.aClass5_13.method7511(Static153.anInt3029, Static159.anInt3138), Static398.aClass5_13.method7488(Static153.anInt3029, Static159.anInt3138));
			}
			Static576.anInt9495 = 1;
			Static194.anIntArray198 = new int[Static592.anInt9706 * Static330.anInt6169];
		}
		Static585.aBoolean690 = true;
	}
}
