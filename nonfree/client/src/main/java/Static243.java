import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static243 {

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Lclient!mv;B)V")
	public static void method4675(@OriginalArg(0) Class1_Sub11_Sub1 arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static405.anInt6543; local7++) {
			@Pc(13) int local13 = Static382.anIntArray393[local7];
			@Pc(17) Class20_Sub3_Sub3_Sub1 local17 = Static73.aClass20_Sub3_Sub3_Sub1Array1[local13];
			@Pc(21) int local21 = arg0.method4463();
			if ((local21 & 0x80) != 0) {
				local21 += arg0.method4463() << 8;
			}
			if ((local21 & 0x200) != 0) {
				local21 += arg0.method4463() << 16;
			}
			Static308.method4008(local21, arg0, local17, local13);
		}
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(I)V")
	public static void method4677() {
		if (Static411.aString55.length() == 0) {
			return;
		}
		Static382.method4881("--> " + Static411.aString55);
		Static26.method483(false, Static411.aString55);
		Static128.anInt2234 = 0;
		Static9.anInt192 = 0;
		Static411.aString55 = "";
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(BZ)V")
	public static void method4692() {
		Static5.method94(Static240.aClass137_165);
		for (@Pc(21) Class1_Sub26 local21 = (Class1_Sub26) Static304.aClass257_21.method5506(); local21 != null; local21 = (Class1_Sub26) Static304.aClass257_21.method5501()) {
			if (!local21.method5618()) {
				local21 = (Class1_Sub26) Static304.aClass257_21.method5506();
				if (local21 == null) {
					break;
				}
			}
			if (local21.anInt3846 == 0) {
				Static454.method5610(true, true, local21);
			}
		}
		if (Static394.aClass250_13 != null) {
			Static94.method1357(Static394.aClass250_13);
			Static394.aClass250_13 = null;
		}
	}
}
