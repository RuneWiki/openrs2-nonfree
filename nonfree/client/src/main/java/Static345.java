import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static345 {

	@OriginalMember(owner = "client!re", name = "T", descriptor = "Lclient!iv;")
	public static final Class119 aClass119_153 = new Class119(13, -2);

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IIII)I")
	public static int method5807(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if ((Static9.aByteArrayArrayArray1[arg1][arg2][arg0] & 0x8) == 0) {
			return arg1 <= 0 || (Static9.aByteArrayArrayArray1[1][arg2][arg0] & 0x2) == 0 ? arg1 : arg1 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIII[BI)Z")
	public static boolean method5808(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(7) int local7 = arg3 % 8;
		@Pc(11) int local11;
		if (local7 == 0) {
			local11 = 0;
		} else {
			local11 = 8 - local7;
		}
		@Pc(25) int local25 = -((arg0 + 7) / 8);
		@Pc(34) int local34 = -((arg3 + 8 - 1) / 8);
		for (@Pc(41) int local41 = local25; local41 < 0; local41++) {
			for (@Pc(44) int local44 = local34; local44 < 0; local44++) {
				if (arg4[arg2] == 0) {
					return true;
				}
				arg2 += 8;
			}
			arg2 -= local11;
			if (arg4[arg2 - 1] == 0) {
				return true;
			}
			arg2 += arg1;
		}
		return false;
	}

	@OriginalMember(owner = "client!re", name = "f", descriptor = "(B)V")
	public static void method5809() {
		Static258.aClass8_19 = null;
		Static156.aClass8_11 = null;
		Static8.aClass8_23 = null;
		Static64.aClass8_4 = null;
		Static355.aClass8_24 = null;
		Static302.aClass8_22 = null;
		Static405.aClass8_26 = null;
		Static335.aClass8_10 = null;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(BI)V")
	public static void method5811(@OriginalArg(1) int arg0) {
		@Pc(13) Class3_Sub4_Sub12 local13 = Static393.method5080(arg0, 11);
		local13.method3244();
	}
}
