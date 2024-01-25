import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static429 {

	@OriginalMember(owner = "client!vj", name = "sb", descriptor = "I")
	public static int anInt7144;

	@OriginalMember(owner = "client!vj", name = "y", descriptor = "I")
	public static int anInt7121 = -1;

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(ZILjava/lang/String;)V")
	public static void method5398(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(7) int local7 = Static31.anInt624;
		@Pc(9) int[] local9 = Static363.anIntArray373;
		@Pc(11) boolean local11 = false;
		for (@Pc(13) int local13 = 0; local13 < local7; local13++) {
			@Pc(21) Class20_Sub3_Sub3_Sub1 local21 = Static73.aClass20_Sub3_Sub3_Sub1Array1[local9[local13]];
			if (local21 != null && local21 != Static239.aClass20_Sub3_Sub3_Sub1_1 && local21.aString48 != null && local21.aString48.equalsIgnoreCase(arg1)) {
				local11 = true;
				if (arg0 == 1) {
					Static5.method94(Static214.aClass137_267);
					Static75.aClass1_Sub11_Sub1_1.method4464(local9[local13]);
					Static75.aClass1_Sub11_Sub1_1.method4443(0);
				} else if (arg0 == 4) {
					Static5.method94(Static351.aClass137_217);
					Static75.aClass1_Sub11_Sub1_1.method4445(0);
					Static75.aClass1_Sub11_Sub1_1.method4464(local9[local13]);
				} else if (arg0 == 5) {
					Static5.method94(Static324.aClass137_204);
					Static75.aClass1_Sub11_Sub1_1.method4445(0);
					Static75.aClass1_Sub11_Sub1_1.method4474(local9[local13]);
				} else if (arg0 == 6) {
					Static5.method94(Static356.aClass137_221);
					Static75.aClass1_Sub11_Sub1_1.method4502(0);
					Static75.aClass1_Sub11_Sub1_1.method4472(local9[local13]);
				} else if (arg0 == 7) {
					Static5.method94(Static197.aClass137_134);
					Static75.aClass1_Sub11_Sub1_1.method4443(0);
					Static75.aClass1_Sub11_Sub1_1.method4474(local9[local13]);
				}
				break;
			}
		}
		if (!local11) {
			Static360.method4660(Static214.aClass151_224.method3122(Static188.anInt3028) + arg1);
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lclient!rb;III)V")
	public static void method5401(@OriginalArg(0) Class210 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static167.aClass210ArrayArray1[arg1][arg2] = arg0;
	}
}
