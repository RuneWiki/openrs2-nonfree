import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "Lclient!mo;")
	public static Class143 aClass143_16;

	@OriginalMember(owner = "client!bm", name = "d", descriptor = "J")
	public static long aLong17 = -1L;

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IZ)Lclient!nj;")
	public static Class151 method681(@OriginalArg(0) int arg0) {
		@Pc(10) Class151 local10 = (Class151) Static273.aClass11_117.method209((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static115.aClass143_57.method3745(29, arg0);
		local10 = new Class151();
		if (local20 != null) {
			local10.method3832(new Class14_Sub4(local20), arg0);
		}
		Static273.aClass11_117.method219((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIIIB)V")
	public static void method683(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < Static304.anInt5859; local7++) {
			@Pc(13) Rectangle local13 = Class14_Sub2_Sub17.aRectangleArray4[local7];
			if (local13.x + local13.width > arg2 && arg2 + arg3 > local13.x && arg0 < local13.y + local13.height && arg1 + arg0 > local13.y) {
				Static338.aBooleanArray29[local7] = true;
			}
		}
	}
}
