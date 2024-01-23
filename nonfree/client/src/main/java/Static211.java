import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static211 {

	@OriginalMember(owner = "client!pi", name = "yb", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray12;

	@OriginalMember(owner = "client!pi", name = "Bb", descriptor = "Lclient!g;")
	public static Class55 aClass55_5;

	@OriginalMember(owner = "client!pi", name = "ub", descriptor = "Lclient!ul;")
	public static Class172 aClass172_36 = new Class172(200);

	@OriginalMember(owner = "client!pi", name = "zb", descriptor = "Ljava/lang/String;")
	public static String aString130 = "glow2:";

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIB)I")
	public static int method3061(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) int local16 = arg1 - 1 & arg0 >> 31;
		return ((arg0 >>> 31) + arg0) % arg1 + local16;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method3083(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(5) Class4_Sub20 local5 = null;
		for (@Pc(10) Class4_Sub20 local10 = (Class4_Sub20) Static46.aClass17_5.method613(); local10 != null; local10 = (Class4_Sub20) Static46.aClass17_5.method607()) {
			if (arg6 == local10.anInt2631 && arg3 == local10.anInt2629 && local10.anInt2619 == arg4 && local10.anInt2628 == arg1) {
				local5 = local10;
				break;
			}
		}
		if (local5 == null) {
			local5 = new Class4_Sub20();
			local5.anInt2629 = arg3;
			local5.anInt2619 = arg4;
			local5.anInt2631 = arg6;
			local5.anInt2628 = arg1;
			Static104.method1787(local5);
			Static46.aClass17_5.method619(local5);
		}
		local5.anInt2632 = arg2;
		local5.anInt2621 = arg0;
		local5.anInt2617 = arg8;
		local5.anInt2630 = arg7;
		local5.anInt2618 = arg5;
	}
}
