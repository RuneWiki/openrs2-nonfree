import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static540 {

	@OriginalMember(owner = "client!wq", name = "v", descriptor = "J")
	public static long aLong391 = 0L;

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(III)Z")
	public static boolean method7515(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!Static15.aBoolean16) {
			return false;
		}
		@Pc(21) int local21 = arg0 >> 16;
		@Pc(25) int local25 = arg0 & 0xFFFF;
		if (Static396.aClass156ArrayArray1[local21] == null || Static396.aClass156ArrayArray1[local21][local25] == null) {
			return false;
		}
		@Pc(43) Class156 local43 = Static396.aClass156ArrayArray1[local21][local25];
		@Pc(54) Class1_Sub24 local54;
		if (arg1 == -1 && local43.anInt4735 == 0) {
			for (local54 = (Class1_Sub24) Static248.aClass37_30.method977(); local54 != null; local54 = (Class1_Sub24) Static248.aClass37_30.method971()) {
				if (local54.anInt3161 == 2 || local54.anInt3161 == 1009 || local54.anInt3161 == 4 || local54.anInt3161 == 18 || local54.anInt3161 == 3) {
					for (@Pc(87) Class156 local87 = Static182.method2888(local54.anInt3164); local87 != null; local87 = Static189.method2934(local87)) {
						if (local87.anInt4677 == local43.anInt4677) {
							return true;
						}
					}
				}
			}
		} else {
			for (local54 = (Class1_Sub24) Static248.aClass37_30.method977(); local54 != null; local54 = (Class1_Sub24) Static248.aClass37_30.method971()) {
				if (local54.anInt3163 == arg1 && local43.anInt4677 == local54.anInt3164 && (local54.anInt3161 == 2 || local54.anInt3161 == 1009 || local54.anInt3161 == 4 || local54.anInt3161 == 18 || local54.anInt3161 == 3)) {
					return true;
				}
			}
		}
		return false;
	}
}
