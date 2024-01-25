import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static299 {

	@OriginalMember(owner = "client!ko", name = "d", descriptor = "Lclient!uu;")
	public static Class63 aClass63_2;

	@OriginalMember(owner = "client!ko", name = "e", descriptor = "[Lclient!s;")
	public static Class40[] aClass40Array1;

	@OriginalMember(owner = "client!ko", name = "i", descriptor = "I")
	public static int anInt4751;

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "Z")
	public static boolean aBoolean392 = false;

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "I")
	public static int anInt4748 = -1;

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIII[BII)Z")
	public static boolean method4346(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) byte[] arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		@Pc(9) int local9 = arg4 % 8;
		@Pc(24) int local24;
		if (local9 == 0) {
			local24 = 0;
		} else {
			local24 = 8 - local9;
		}
		@Pc(40) int local40 = -((arg0 + 8 - 1) / 8);
		@Pc(50) int local50 = -((arg4 + 8 - 1) / 8);
		for (@Pc(52) int local52 = local40; local52 < 0; local52++) {
			for (@Pc(56) int local56 = local50; local56 < 0; local56++) {
				if (arg2[arg3] == 0) {
					return true;
				}
				arg3 += 8;
			}
			arg3 -= local24;
			if (arg2[arg3 - 1] == 0) {
				return true;
			}
			arg3 += arg1;
		}
		return false;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(ILclient!ha;II)V")
	public static void method4347(@OriginalArg(0) int arg0, @OriginalArg(1) Class126 arg1, @OriginalArg(3) int arg2) {
		Static211.aClass248ArrayArray1 = new Class248[arg2][arg0];
		Static540.aClass126_21 = arg1;
		if (Static582.anIntArray753 != null) {
			Static489.aClass91_4 = Static577.method8148(Static582.anIntArray753[1], Static582.anIntArray753[3], Static582.anIntArray753[2], Static582.anIntArray753[5], Static582.anIntArray753[4], Static582.anIntArray753[0]);
		}
		Static235.aClass248_1 = new Class248();
		Static1.method5728();
	}
}
