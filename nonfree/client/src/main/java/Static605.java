import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static605 {

	@OriginalMember(owner = "client!ui", name = "g", descriptor = "Lclient!via;")
	public static Class370 aClass370_1;

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "I")
	public static int anInt10203 = -1;

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "Lclient!ok;")
	public static Class262 aClass262_69 = new Class262();

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIB)Z")
	public static boolean method8488(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!Static505.aBoolean629) {
			return false;
		}
		@Pc(21) int local21 = arg1 >> 16;
		@Pc(25) int local25 = arg1 & 0xFFFF;
		if (Static559.aClass230ArrayArray2[local21] == null || Static559.aClass230ArrayArray2[local21][local25] == null) {
			return false;
		}
		@Pc(43) Class230 local43 = Static559.aClass230ArrayArray2[local21][local25];
		@Pc(54) Class14_Sub3_Sub11 local54;
		if (arg0 == -1 && local43.anInt6660 == 0) {
			for (local54 = (Class14_Sub3_Sub11) Static16.aClass262_68.method6318(); local54 != null; local54 = (Class14_Sub3_Sub11) Static16.aClass262_68.method6311()) {
				if (local54.anInt4752 == 6 || local54.anInt4752 == 1004 || local54.anInt4752 == 5 || local54.anInt4752 == 30 || local54.anInt4752 == 3) {
					for (@Pc(83) Class230 local83 = Static655.method9094(local54.anInt4750); local83 != null; local83 = Static252.method3712(local83)) {
						if (local43.anInt6663 == local83.anInt6663) {
							return true;
						}
					}
				}
			}
		} else {
			for (local54 = (Class14_Sub3_Sub11) Static16.aClass262_68.method6318(); local54 != null; local54 = (Class14_Sub3_Sub11) Static16.aClass262_68.method6311()) {
				if (arg0 == local54.anInt4754 && local54.anInt4750 == local43.anInt6663 && (local54.anInt4752 == 6 || local54.anInt4752 == 1004 || local54.anInt4752 == 5 || local54.anInt4752 == 30 || local54.anInt4752 == 3)) {
					return true;
				}
			}
		}
		return false;
	}
}
