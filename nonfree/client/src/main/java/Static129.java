import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!ge", name = "N", descriptor = "I")
	public static int anInt2880;

	@OriginalMember(owner = "client!ge", name = "R", descriptor = "I")
	public static int anInt2884;

	@OriginalMember(owner = "client!ge", name = "M", descriptor = "[I")
	public static final int[] anIntArray302 = new int[] { 104, 120, 136, 168 };

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILclient!qs;Lclient!qs;)V")
	public static void method2124(@OriginalArg(1) Class211 arg0, @OriginalArg(2) Class211 arg1) {
		Static34.aClass211_11 = arg1;
		Static381.aClass211_84 = arg0;
	}

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(II)Z")
	public static boolean method2126(@OriginalArg(1) int arg0) {
		return arg0 == 2 || arg0 == 3 || arg0 == 4 || arg0 == 5;
	}

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(B)V")
	public static void method2127() {
		Static354.aClass38_33.method774();
		Static223.aClass262_3.method5875();
		Static445.aClass262_12.method5875();
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(BIIII)I")
	public static int method2128(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = arg2 & 0xF;
		@Pc(16) int local16 = local7 < 8 ? arg3 : arg0;
		@Pc(38) int local38 = local7 >= 4 ? (local7 == 12 || local7 == 14 ? arg3 : arg1) : arg0;
		return ((local7 & 0x2) == 0 ? local38 : -local38) + ((local7 & 0x1) == 0 ? local16 : -local16);
	}
}
