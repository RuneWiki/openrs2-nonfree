import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static411 {

	@OriginalMember(owner = "client!um", name = "j", descriptor = "I")
	public static int anInt6947;

	@OriginalMember(owner = "client!um", name = "i", descriptor = "I")
	public static int anInt6946 = -1;

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method5578(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static284.anInt4659; local11++) {
			if (arg0.equalsIgnoreCase(Static322.aStringArray36[local11])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(Static401.aClass8_Sub3_Sub1_Sub1_2.aString60);
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(ZII)I")
	public static int method5579(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 4 || arg0 == 5 ? Static414.anIntArray527[arg1 & 0x3] : 256;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(III)Lclient!ah;")
	public static Class8_Sub1 method5584(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class75 local7 = Static432.aClass75ArrayArrayArray6[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class8_Sub1 local14 = local7.aClass8_Sub1_1;
			local7.aClass8_Sub1_1 = null;
			return local14;
		}
	}
}
