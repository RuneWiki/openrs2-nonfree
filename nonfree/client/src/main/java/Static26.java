import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!c", name = "sc", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!c", name = "Sc", descriptor = "I")
	public static int anInt738;

	@OriginalMember(owner = "client!c", name = "Nc", descriptor = "[I")
	public static int[] anIntArray72 = new int[32];

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIIBII)V")
	public static void method499(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg4 < 1 || arg6 < 1 || arg4 > 102 || arg6 > 102) {
			return;
		}
		@Pc(36) int local36;
		if (!Static40.method1450() && (Static126.aByteArrayArrayArray24[0][arg4][arg6] & 0x2) == 0) {
			local36 = arg3;
			if ((Static126.aByteArrayArrayArray24[arg3][arg4][arg6] & 0x8) != 0) {
				local36 = 0;
			}
			if (Static228.anInt5022 != local36) {
				return;
			}
		}
		local36 = arg3;
		if (arg3 < 3 && (Static126.aByteArrayArrayArray24[1][arg4][arg6] & 0x2) == 2) {
			local36 = arg3 + 1;
		}
		Static254.method4236(arg4, arg3, local36, Static213.aClass36Array1[arg3], arg6, arg0);
		if (arg2 >= 0) {
			@Pc(93) boolean local93 = Static135.aBoolean157;
			Static135.aBoolean157 = true;
			Static272.method4541(arg3, local36, Static213.aClass36Array1[arg3], arg5, arg4, false, false, arg1, arg2, arg6);
			Static135.aBoolean157 = local93;
		}
	}

	@OriginalMember(owner = "client!c", name = "g", descriptor = "(B)V")
	public static void method500() {
		Static11.aClass155_26.method4362();
	}
}
