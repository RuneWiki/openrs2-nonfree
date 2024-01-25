import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!an", name = "b", descriptor = "Lclient!iu;")
	public static final Class150 aClass150_18 = new Class150(10, -1);

	@OriginalMember(owner = "client!an", name = "d", descriptor = "Lclient!iu;")
	public static final Class150 aClass150_19 = new Class150(23, 17);

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(IIIIII)V")
	public static void method596(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		for (@Pc(13) int local13 = arg4; local13 <= arg2; local13++) {
			Static321.method5153(arg0, arg3, Static352.anIntArrayArray51[local13], arg1);
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(BLjava/lang/String;)[B")
	public static byte[] method598(@OriginalArg(1) String arg0) {
		@Pc(11) int local11 = arg0.length();
		if (local11 == 0) {
			return new byte[0];
		}
		@Pc(22) int local22 = local11 + 3 & 0xFFFFFFFC;
		@Pc(28) int local28 = local22 / 4 * 3;
		if (local11 <= local22 - 2 || Static84.method1457(arg0.charAt(local22 - 2)) == -1) {
			local28 -= 2;
		} else if (local22 - 1 >= local11 || Static84.method1457(arg0.charAt(local22 - 1)) == -1) {
			local28--;
		}
		@Pc(63) byte[] local63 = new byte[local28];
		Static508.method6979(local63, 0, arg0);
		return local63;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(IIIIIIB)I")
	public static int method599(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = arg0 & 0x3;
		if ((arg3 & 0x1) == 1) {
			@Pc(10) int local10 = arg4;
			arg4 = arg5;
			arg5 = local10;
		}
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return arg2;
		} else if (local3 == 2) {
			return 1 + 7 - arg4 - arg1;
		} else {
			return 7 + 1 - arg2 - arg5;
		}
	}
}
