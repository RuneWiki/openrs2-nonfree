import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static546 {

	@OriginalMember(owner = "client!tm", name = "c", descriptor = "Lclient!la;")
	public static Class207 aClass207_114;

	@OriginalMember(owner = "client!tm", name = "i", descriptor = "[I")
	public static int[] anIntArray507 = new int[1];

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(II)Z")
	public static boolean method7972(@OriginalArg(1) int arg0) {
		return arg0 >= 4 && arg0 <= 8;
	}

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "(II)I")
	public static int method7973(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(BF)F")
	public static float method7974(@OriginalArg(1) float arg0) {
		return arg0 * arg0 * arg0 * ((arg0 * 6.0F - 15.0F) * arg0 + 10.0F);
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(BII)Z")
	public static boolean method7975(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!Static142.aBoolean190) {
			return false;
		}
		@Pc(13) int local13 = arg0 >> 16;
		@Pc(17) int local17 = arg0 & 0xFFFF;
		if (Static519.aClass295ArrayArray2[local13] == null || Static519.aClass295ArrayArray2[local13][local17] == null) {
			return false;
		}
		@Pc(40) Class295 local40 = Static519.aClass295ArrayArray2[local13][local17];
		@Pc(54) Class5_Sub5_Sub15 local54;
		if (arg1 == -1 && local40.anInt8001 == 0) {
			for (local54 = (Class5_Sub5_Sub15) Static84.aClass330_6.method7908(); local54 != null; local54 = (Class5_Sub5_Sub15) Static84.aClass330_6.method7914()) {
				if (local54.anInt6765 == 10 || local54.anInt6765 == 1001 || local54.anInt6765 == 8 || local54.anInt6765 == 46 || local54.anInt6765 == 3) {
					for (@Pc(87) Class295 local87 = Static107.method9049(local54.anInt6759); local87 != null; local87 = Static201.method3543(local87)) {
						if (local40.anInt8022 == local87.anInt8022) {
							return true;
						}
					}
				}
			}
		} else {
			for (local54 = (Class5_Sub5_Sub15) Static84.aClass330_6.method7908(); local54 != null; local54 = (Class5_Sub5_Sub15) Static84.aClass330_6.method7914()) {
				if (arg1 == local54.anInt6762 && local40.anInt8022 == local54.anInt6759 && (local54.anInt6765 == 10 || local54.anInt6765 == 1001 || local54.anInt6765 == 8 || local54.anInt6765 == 46 || local54.anInt6765 == 3)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(IBIIILclient!ha;I)Lclient!ka;")
	public static Class187 method7978(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class133 arg4, @OriginalArg(6) int arg5) {
		@Pc(11) long local11 = (long) arg0;
		@Pc(17) Class187 local17 = (Class187) Static461.aClass87_191.method1805(local11);
		if (local17 == null) {
			@Pc(27) Class26 local27 = Static623.method8839(Static348.aClass207_69, arg0);
			if (local27 == null) {
				return null;
			}
			if (local27.anInt393 < 13) {
				local27.method335();
			}
			local17 = arg4.method7256(local27, 2055, Static438.anInt10554, 64, 768);
			Static461.aClass87_191.method1792(local11, local17);
		}
		local17 = local17.method8656((byte) 2, 2055, true);
		if (arg2 != 0) {
			local17.a(arg2);
		}
		if (arg3 != 0) {
			local17.FA(arg3);
		}
		if (arg5 != 0) {
			local17.VA(arg5);
		}
		if (arg1 != 0) {
			local17.H(0, arg1, 0);
		}
		return local17;
	}
}
