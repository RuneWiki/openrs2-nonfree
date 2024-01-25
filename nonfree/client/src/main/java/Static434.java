import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static434 {

	@OriginalMember(owner = "client!se", name = "d", descriptor = "(I)V")
	public static void method7674() {
		@Pc(7) int local7 = 0;
		for (@Pc(17) int local17 = 0; local17 < Static363.anInt1158; local17++) {
			for (@Pc(21) int local21 = 0; local21 < Static511.anInt8889; local21++) {
				if (Static140.method2476(local17, local7, Static399.aClass262ArrayArrayArray2, true, local21)) {
					local7++;
				}
				if (local7 >= 512) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(III)Z")
	public static boolean method7678(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static230.method3625(arg0, arg1) | (arg1 & 0x800) != 0 || Static269.method4299(arg1, arg0);
	}

	@OriginalMember(owner = "client!se", name = "c", descriptor = "(B)V")
	public static void method7679() {
		Static544.method7789();
	}
}
