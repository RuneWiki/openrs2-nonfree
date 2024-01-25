import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static314 {

	@OriginalMember(owner = "client!mn", name = "I", descriptor = "Lclient!cb;")
	public static final Class40 aClass40_131 = new Class40(89, 8);

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(IZI)Z")
	public static boolean method4887(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!Static330.aBoolean415) {
			return false;
		}
		@Pc(13) int local13 = arg1 >> 16;
		@Pc(17) int local17 = arg1 & 0xFFFF;
		if (Static375.aClass97ArrayArray1[local13] == null || Static375.aClass97ArrayArray1[local13][local17] == null) {
			return false;
		}
		@Pc(40) Class97 local40 = Static375.aClass97ArrayArray1[local13][local17];
		@Pc(54) Class6_Sub48 local54;
		if (arg0 == -1 && local40.anInt2264 == 0) {
			for (local54 = (Class6_Sub48) Static445.aClass275_162.method6366(); local54 != null; local54 = (Class6_Sub48) Static445.aClass275_162.method6364()) {
				if (local54.anInt8333 == 48 || local54.anInt8333 == 1009 || local54.anInt8333 == 4 || local54.anInt8333 == 22 || local54.anInt8333 == 5) {
					for (@Pc(140) Class97 local140 = Static133.method4068(local54.anInt8336); local140 != null; local140 = Static299.method4155(local140)) {
						if (local40.anInt2311 == local140.anInt2311) {
							return true;
						}
					}
				}
			}
		} else {
			for (local54 = (Class6_Sub48) Static445.aClass275_162.method6366(); local54 != null; local54 = (Class6_Sub48) Static445.aClass275_162.method6364()) {
				if (local54.anInt8335 == arg0 && local54.anInt8336 == local40.anInt2311 && (local54.anInt8333 == 48 || local54.anInt8333 == 1009 || local54.anInt8333 == 4 || local54.anInt8333 == 22 || local54.anInt8333 == 5)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(III)I")
	public static int method4889(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 = arg0 * (arg1 & 0x7F) >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return (arg1 & 0xFF80) + arg0;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(IIII)Lclient!rq;")
	public static Class29_Sub2_Sub1 method4894(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) Class9 local11 = Static208.aClass9ArrayArrayArray3[arg1][arg0][arg2];
		if (local11 == null) {
			return null;
		}
		@Pc(17) Class29_Sub2_Sub1 local17 = null;
		@Pc(19) int local19 = -1;
		for (@Pc(22) Class66 local22 = local11.aClass66_1; local22 != null; local22 = local22.aClass66_2) {
			@Pc(26) Class29_Sub2 local26 = local22.aClass29_Sub2_1;
			if (local26 instanceof Class29_Sub2_Sub1) {
				@Pc(32) Class29_Sub2_Sub1 local32 = (Class29_Sub2_Sub1) local26;
				@Pc(42) int local42 = (local32.method7008() - 1) * 256 + 252;
				@Pc(50) int local50 = local32.anInt9222 - local42 >> 9;
				@Pc(57) int local57 = local32.anInt9218 - local42 >> 9;
				@Pc(65) int local65 = local32.anInt9222 + local42 >> 9;
				@Pc(73) int local73 = local32.anInt9218 + local42 >> 9;
				if (arg0 >= local50 && local57 <= arg2 && arg0 <= local65 && local73 >= arg2) {
					@Pc(103) int local103 = (local73 + 1 - arg2) * (-arg0 + local65 + 1);
					if (local103 > local19) {
						local17 = local32;
						local19 = local103;
					}
				}
			}
		}
		return local17;
	}
}
