import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static547 {

	@OriginalMember(owner = "client!tga", name = "k", descriptor = "I")
	public static int anInt8826;

	@OriginalMember(owner = "client!tga", name = "v", descriptor = "[Lclient!ua;")
	public static Class342[] aClass342Array1;

	@OriginalMember(owner = "client!tga", name = "q", descriptor = "I")
	public static int anInt8830 = 0;

	@OriginalMember(owner = "client!tga", name = "b", descriptor = "(III)Lclient!kv;")
	public static Class16_Sub1_Sub5 method7568(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class84 local7 = Static348.aClass84ArrayArrayArray5[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class16_Sub1_Sub5 local14 = local7.aClass16_Sub1_Sub5_1;
			local7.aClass16_Sub1_Sub5_1 = null;
			Static43.method1103(local14);
			return local14;
		}
	}

	@OriginalMember(owner = "client!tga", name = "c", descriptor = "(III)Z")
	public static boolean method7569(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method7570(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(12) int local12 = arg2; local12 <= arg1; local12++) {
			for (@Pc(16) int local16 = arg3; local16 <= arg0; local16++) {
				if (arg4 == Static219.anIntArrayArray43[local12][local16] && Static133.anIntArrayArray27[local12][local16] <= 1) {
					return true;
				}
			}
		}
		return false;
	}
}
