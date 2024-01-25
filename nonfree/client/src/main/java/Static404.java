import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static404 {

	@OriginalMember(owner = "client!nj", name = "f", descriptor = "I")
	public static int anInt7482;

	@OriginalMember(owner = "client!nj", name = "e", descriptor = "I")
	public static int anInt7481 = 0;

	@OriginalMember(owner = "client!nj", name = "l", descriptor = "[I")
	public static final int[] anIntArray362 = new int[2048];

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(III)Z")
	public static boolean method6624(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return false;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(BII)Z")
	public static boolean method6625(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!Static183.aBoolean305) {
			return false;
		}
		@Pc(21) int local21 = arg1 >> 16;
		@Pc(25) int local25 = arg1 & 0xFFFF;
		if (Static111.aClass357ArrayArray1[local21] == null || Static111.aClass357ArrayArray1[local21][local25] == null) {
			return false;
		}
		@Pc(43) Class357 local43 = Static111.aClass357ArrayArray1[local21][local25];
		@Pc(54) Class2_Sub1_Sub13 local54;
		if (arg0 == -1 && local43.anInt10430 == 0) {
			for (local54 = (Class2_Sub1_Sub13) Static61.aClass271_6.method7177(); local54 != null; local54 = (Class2_Sub1_Sub13) Static61.aClass271_6.method7175()) {
				if (local54.anInt6866 == 12 || local54.anInt6866 == 1001 || local54.anInt6866 == 57 || local54.anInt6866 == 15 || local54.anInt6866 == 53) {
					for (@Pc(144) Class357 local144 = Static647.method9532(local54.anInt6870); local144 != null; local144 = Static73.method1353(local144)) {
						if (local144.anInt10460 == local43.anInt10460) {
							return true;
						}
					}
				}
			}
		} else {
			for (local54 = (Class2_Sub1_Sub13) Static61.aClass271_6.method7177(); local54 != null; local54 = (Class2_Sub1_Sub13) Static61.aClass271_6.method7175()) {
				if (local54.anInt6873 == arg0 && local54.anInt6870 == local43.anInt10460 && (local54.anInt6866 == 12 || local54.anInt6866 == 1001 || local54.anInt6866 == 57 || local54.anInt6866 == 15 || local54.anInt6866 == 53)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIII)V")
	public static void method6630(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(17) Class2_Sub1_Sub5 local17 = Static653.method9595(11, (long) arg2);
		local17.method2486();
		local17.anInt2680 = arg0;
		local17.anInt2674 = arg1;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IBI)Z")
	public static boolean method6631(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x8000) != 0;
	}
}
