import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static258 {

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(III)Z", line = 1285)
	public static boolean method4786(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!Class243.aBoolean477) {
			return false;
		}
		@Pc(13) int local13 = arg1 >> 16;
		@Pc(17) int local17 = arg1 & 0xFFFF;
		if (Static25.aClass161ArrayArray1[local13] == null || Static25.aClass161ArrayArray1[local13][local17] == null) {
			return false;
		}
		@Pc(35) Class161 local35 = Static25.aClass161ArrayArray1[local13][local17];
		@Pc(51) Class2_Sub5 local51;
		if (arg0 == -1 && local35.anInt4265 == 0) {
			for (local51 = (Class2_Sub5) Class92.aClass135_19.method3552(); local51 != null; local51 = (Class2_Sub5) Class92.aClass135_19.method3553()) {
				if (local51.anInt1004 == 11 || local51.anInt1004 == 1011 || local51.anInt1004 == 49 || local51.anInt1004 == 45 || local51.anInt1004 == 30) {
					for (@Pc(133) Class161 local133 = Static6.method140(local51.anInt1008); local133 != null; local133 = Static7.method6466(local133)) {
						if (local35.anInt4310 == local133.anInt4310) {
							return true;
						}
					}
				}
			}
		} else {
			for (local51 = (Class2_Sub5) Class92.aClass135_19.method3552(); local51 != null; local51 = (Class2_Sub5) Class92.aClass135_19.method3553()) {
				if (local51.anInt1005 == arg0 && local35.anInt4310 == local51.anInt1008 && (local51.anInt1004 == 11 || local51.anInt1004 == 1011 || local51.anInt1004 == 49 || local51.anInt1004 == 45 || local51.anInt1004 == 30)) {
					return true;
				}
			}
		}
		return false;
	}
}
