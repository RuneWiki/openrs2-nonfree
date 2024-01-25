import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!c", name = "f", descriptor = "I")
	public static int anInt1266;

	@OriginalMember(owner = "client!c", name = "g", descriptor = "Z")
	public static boolean aBoolean84 = false;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IJ)V")
	public static void method1300(@OriginalArg(1) long arg0) {
		Static33.aCalendar24.setTime(new Date(arg0));
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIZII)V")
	public static void method1301(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg3;
		@Pc(12) int local12 = -arg3;
		@Pc(14) int local14 = -1;
		@Pc(23) int local23 = Static385.method4989(Static472.anInt7503, arg1 + arg3, Static257.anInt4172);
		@Pc(32) int local32 = Static385.method4989(Static472.anInt7503, arg1 - arg3, Static257.anInt4172);
		Static559.method7424(arg0, Static172.anIntArrayArray17[arg2], local23, local32);
		while (local7 < local9) {
			local14 += 2;
			local12 += local14;
			@Pc(61) int local61;
			@Pc(65) int local65;
			@Pc(83) int local83;
			@Pc(92) int local92;
			if (local12 > 0) {
				local9--;
				local12 -= local9 << 1;
				local61 = arg2 - local9;
				local65 = local9 + arg2;
				if (local65 >= Static73.anInt1542 && local61 <= Static527.anInt8177) {
					local83 = Static385.method4989(Static472.anInt7503, arg1 + local7, Static257.anInt4172);
					local92 = Static385.method4989(Static472.anInt7503, arg1 - local7, Static257.anInt4172);
					if (local65 <= Static527.anInt8177) {
						Static559.method7424(arg0, Static172.anIntArrayArray17[local65], local83, local92);
					}
					if (local61 >= Static73.anInt1542) {
						Static559.method7424(arg0, Static172.anIntArrayArray17[local61], local83, local92);
					}
				}
			}
			local7++;
			local61 = arg2 - local7;
			local65 = local7 + arg2;
			if (local65 >= Static73.anInt1542 && Static527.anInt8177 >= local61) {
				local83 = Static385.method4989(Static472.anInt7503, local9 + arg1, Static257.anInt4172);
				local92 = Static385.method4989(Static472.anInt7503, arg1 - local9, Static257.anInt4172);
				if (local65 <= Static527.anInt8177) {
					Static559.method7424(arg0, Static172.anIntArrayArray17[local65], local83, local92);
				}
				if (Static73.anInt1542 <= local61) {
					Static559.method7424(arg0, Static172.anIntArrayArray17[local61], local83, local92);
				}
			}
		}
	}
}
