import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static434 {

	@OriginalMember(owner = "client!w", name = "j", descriptor = "F")
	public static float aFloat102;

	@OriginalMember(owner = "client!w", name = "g", descriptor = "I")
	public static int anInt7172 = 0;

	@OriginalMember(owner = "client!w", name = "i", descriptor = "[I")
	public static int[] anIntArray604 = new int[2];

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!ba;III[Z)Z")
	public static boolean method5668(@OriginalArg(0) Class2_Sub5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (Static58.aClass64Array1 != Static440.aClass64Array3) {
			@Pc(11) int local11 = Static263.aClass64Array2[arg1].a(arg2, arg3);
			for (@Pc(13) int local13 = 0; local13 <= arg1; local13++) {
				@Pc(18) Class64 local18 = Static263.aClass64Array2[local13];
				if (local18 != null) {
					@Pc(27) int local27 = local11 - local18.a(arg2, arg3);
					if (arg4 != null) {
						arg4[local13] = local18.method2352(arg0, arg2, local27, arg3);
						if (!arg4[local13]) {
							continue;
						}
					}
					local18.b(arg0, arg2, local27, arg3, 0, false);
					local1 = true;
				}
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIII)I")
	public static int method5669(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static227.aByteArrayArrayArray8[arg2][arg0][arg1] & 0x8) == 0) {
			return arg2 <= 0 || (Static227.aByteArrayArrayArray8[1][arg0][arg1] & 0x2) == 0 ? arg2 : arg2 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(III)Z")
	public static boolean method5671(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x70000) != 0 | Static135.method2303(arg0, arg1) || Static58.method1145(arg0, arg1);
	}
}
