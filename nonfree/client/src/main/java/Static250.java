import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static250 {

	@OriginalMember(owner = "client!mk", name = "i", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray3;

	@OriginalMember(owner = "client!mk", name = "m", descriptor = "I")
	public static int anInt4486 = 0;

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIIII)V")
	public static void method3676(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(12) int local12 = -arg0;
		@Pc(14) int local14 = -1;
		@Pc(22) int local22 = Static85.method1427(Static221.anInt4001, arg0 + arg3, Static83.anInt7380);
		@Pc(31) int local31 = Static85.method1427(Static221.anInt4001, arg3 - arg0, Static83.anInt7380);
		Static217.method3280(Static59.anIntArrayArray34[arg2], local31, arg1, local22);
		while (local9 > local7) {
			local14 += 2;
			local12 += local14;
			@Pc(60) int local60;
			@Pc(64) int local64;
			@Pc(83) int local83;
			@Pc(92) int local92;
			if (local12 > 0) {
				local9--;
				local12 -= local9 << 1;
				local60 = arg2 - local9;
				local64 = local9 + arg2;
				if (local64 >= Static305.anInt5429 && Static212.anInt452 >= local60) {
					local83 = Static85.method1427(Static221.anInt4001, arg3 + local7, Static83.anInt7380);
					local92 = Static85.method1427(Static221.anInt4001, arg3 - local7, Static83.anInt7380);
					if (Static212.anInt452 >= local64) {
						Static217.method3280(Static59.anIntArrayArray34[local64], local92, arg1, local83);
					}
					if (Static305.anInt5429 <= local60) {
						Static217.method3280(Static59.anIntArrayArray34[local60], local92, arg1, local83);
					}
				}
			}
			local7++;
			local60 = arg2 - local7;
			local64 = arg2 + local7;
			if (Static305.anInt5429 <= local64 && Static212.anInt452 >= local60) {
				local83 = Static85.method1427(Static221.anInt4001, local9 + arg3, Static83.anInt7380);
				local92 = Static85.method1427(Static221.anInt4001, arg3 - local9, Static83.anInt7380);
				if (Static212.anInt452 >= local64) {
					Static217.method3280(Static59.anIntArrayArray34[local64], local92, arg1, local83);
				}
				if (local60 >= Static305.anInt5429) {
					Static217.method3280(Static59.anIntArrayArray34[local60], local92, arg1, local83);
				}
			}
		}
	}
}
