import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static206 {

	@OriginalMember(owner = "client!na", name = "j", descriptor = "I")
	public static int anInt4324;

	@OriginalMember(owner = "client!na", name = "c", descriptor = "I")
	public static int anInt4319 = 0;

	@OriginalMember(owner = "client!na", name = "f", descriptor = "I")
	public static int anInt4321 = -1;

	@OriginalMember(owner = "client!na", name = "g", descriptor = "I")
	public static int anInt4322 = -1;

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIIZI)V")
	public static void method3874(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		Static324.anInt6210 = arg2;
		Static74.anInt1924 = arg3;
		Static237.anInt6655 = arg1;
		Static161.anInt3461 = arg0;
		Static12.anInt271 = arg5;
		if (arg4 && Static12.anInt271 >= 100) {
			Static240.anInt4829 = Static237.anInt6655 * 128 + 64;
			Static129.anInt3039 = Static74.anInt1924 * 128 + 64;
			Static112.anInt2705 = Static81.method2010(Static12.anInt267, Static129.anInt3039, Static240.anInt4829) - Static324.anInt6210;
		}
		Static353.anInt2640 = 2;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(I)V")
	public static void method3875() {
		for (@Pc(7) int local7 = 0; local7 < Static123.anInt2950; local7++) {
			@Pc(13) Class80 local13 = Static334.method3562(local7);
			if (local13 != null && local13.anInt2657 == 0) {
				Static341.anIntArray9[local7] = 0;
				Static328.anIntArray485[local7] = 0;
			}
		}
		Static108.aClass43_13 = new Class43(128);
	}
}
