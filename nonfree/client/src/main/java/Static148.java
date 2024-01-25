import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!fg", name = "c", descriptor = "I")
	public static int anInt2785 = 0;

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(B)V")
	public static void method2368() {
		@Pc(7) int local7 = 0;
		for (@Pc(14) int local14 = 0; local14 < Static18.anInt5706; local14++) {
			for (@Pc(18) int local18 = 0; local18 < Static80.anInt1367; local18++) {
				if (Static173.method2707(local18, Static113.aClass133ArrayArrayArray1, true, local14, local7)) {
					local7++;
				}
				if (local7 >= 512) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IBI)V")
	public static void method2369(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class6_Sub5_Sub8 local10 = Static49.method760(6, arg1);
		local10.method3256();
		local10.anInt3740 = arg0;
	}
}
