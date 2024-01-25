import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static357 {

	@OriginalMember(owner = "client!nw", name = "G", descriptor = "I")
	public static int anInt6870;

	@OriginalMember(owner = "client!nw", name = "H", descriptor = "Lclient!kaa;")
	public static Class174 aClass174_32;

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(IILclient!ep;)I")
	public static int method5789(@OriginalArg(1) int arg0, @OriginalArg(2) Class93 arg1) {
		if (!Static69.method1454(arg1).method7360(arg0) && arg1.anObjectArray5 == null) {
			return -1;
		} else if (arg1.anIntArray209 == null || arg1.anIntArray209.length <= arg0) {
			return -1;
		} else {
			return arg1.anIntArray209[arg0];
		}
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(III[BIII)Z")
	public static boolean method5791(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(13) int local13 = arg1 % 8;
		@Pc(23) int local23;
		if (local13 == 0) {
			local23 = 0;
		} else {
			local23 = 8 - local13;
		}
		@Pc(37) int local37 = -((arg4 + 8 - 1) / 8);
		@Pc(46) int local46 = -((arg1 + 7) / 8);
		for (@Pc(48) int local48 = local37; local48 < 0; local48++) {
			for (@Pc(52) int local52 = local46; local52 < 0; local52++) {
				if (arg2[arg0] == 0) {
					return true;
				}
				arg0 += 8;
			}
			arg0 -= local23;
			if (arg2[arg0 - 1] == 0) {
				return true;
			}
			arg0 += arg3;
		}
		return false;
	}
}
