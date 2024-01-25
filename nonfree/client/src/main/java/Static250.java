import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static250 {

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "Lclient!iv;")
	public static final Class119 aClass119_103 = new Class119(61, 6);

	@OriginalMember(owner = "client!mm", name = "c", descriptor = "I")
	public static int anInt4743 = -1;

	@OriginalMember(owner = "client!mm", name = "d", descriptor = "Lclient!pi;")
	public static final Class189 aClass189_151 = new Class189("flash1:", "blinken1:", "clignotant1:", "flash1:");

	@OriginalMember(owner = "client!mm", name = "e", descriptor = "Lclient!pi;")
	public static final Class189 aClass189_152 = new Class189("Loaded interface scripts", "Interface-Skripte geladen", "Interfaces chargées", "Interfaces carregadas");

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIIZI)V")
	public static void method3739(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(12) int local12 = -arg0;
		@Pc(14) int local14 = -1;
		@Pc(22) int local22 = Static108.method1849(Static452.anInt7626, arg1 + arg0, Static82.anInt3956);
		@Pc(30) int local30 = Static108.method1849(Static452.anInt7626, arg1 - arg0, Static82.anInt3956);
		Static412.method5293(Static262.anIntArrayArray31[arg3], arg2, local30, local22);
		while (local7 < local9) {
			local14 += 2;
			local12 += local14;
			@Pc(61) int local61;
			@Pc(65) int local65;
			@Pc(79) int local79;
			@Pc(88) int local88;
			if (local12 > 0) {
				local9--;
				local12 -= local9 << 1;
				local61 = arg3 - local9;
				local65 = arg3 + local9;
				if (local65 >= Static341.anInt5789 && local61 <= Static309.anInt5495) {
					local79 = Static108.method1849(Static452.anInt7626, local7 + arg1, Static82.anInt3956);
					local88 = Static108.method1849(Static452.anInt7626, arg1 - local7, Static82.anInt3956);
					if (local65 <= Static309.anInt5495) {
						Static412.method5293(Static262.anIntArrayArray31[local65], arg2, local88, local79);
					}
					if (local61 >= Static341.anInt5789) {
						Static412.method5293(Static262.anIntArrayArray31[local61], arg2, local88, local79);
					}
				}
			}
			local7++;
			local61 = arg3 - local7;
			local65 = local7 + arg3;
			if (Static341.anInt5789 <= local65 && local61 <= Static309.anInt5495) {
				local79 = Static108.method1849(Static452.anInt7626, local9 + arg1, Static82.anInt3956);
				local88 = Static108.method1849(Static452.anInt7626, arg1 - local9, Static82.anInt3956);
				if (Static309.anInt5495 >= local65) {
					Static412.method5293(Static262.anIntArrayArray31[local65], arg2, local88, local79);
				}
				if (local61 >= Static341.anInt5789) {
					Static412.method5293(Static262.anIntArrayArray31[local61], arg2, local88, local79);
				}
			}
		}
	}
}
