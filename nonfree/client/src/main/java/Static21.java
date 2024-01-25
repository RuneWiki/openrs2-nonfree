import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!ao", name = "q", descriptor = "I")
	public static int anInt292;

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIII)V")
	public static void method280(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) int local9 = Static116.anInt2543;
		@Pc(11) int local11 = Static337.anInt6295;
		if (Static80.aBoolean118) {
			local9 += Static211.method3297();
			local11 += Static551.method7856();
		}
		@Pc(36) Class103 local36;
		if (Static64.anInt1105 == 1) {
			local36 = Static319.aClass103Array13[Static351.anInt6517 / 100];
			local36.method7462(local9 - 8, local11 - 8);
			Static304.method7235(local36.method7454() + local9 - 8, local11 - -local36.method7451() + -8, local9 - 8, local11 + -8);
		}
		if (Static64.anInt1105 == 2) {
			local36 = Static319.aClass103Array13[Static351.anInt6517 / 100 + 4];
			local36.method7462(local9 - 8, local11 + -8);
			Static304.method7235(local9 + local36.method7454() - 8, local36.method7451() + local11 + -8, local9 - 8, local11 + -8);
		}
		Static245.method4135();
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IILjava/lang/String;BZ)V")
	public static void method281(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(4) boolean arg3) {
		Static514.method7502(arg3, false, arg2, arg1, (String) null, arg0);
	}
}
