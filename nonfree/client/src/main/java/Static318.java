import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static318 {

	@OriginalMember(owner = "client!kr", name = "E", descriptor = "I")
	public static int anInt5395;

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(IIIIIIIIIIIZ)V")
	public static void method4576(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		if (!Static506.method7223(arg10)) {
			return;
		}
		if (Static202.aClass321ArrayArray2[arg10] == null) {
			Static83.method1459(Static109.aClass321ArrayArray1[arg10], -1, arg1, arg4, arg3, arg5, arg0, arg8, arg7, arg2, arg6, arg9);
		} else {
			Static83.method1459(Static202.aClass321ArrayArray2[arg10], -1, arg1, arg4, arg3, arg5, arg0, arg8, arg7, arg2, arg6, arg9);
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(IIII)V")
	public static void method4577(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class351 local7 = Static441.aClass351ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class2_Sub1_Sub4 local13 = local7.aClass2_Sub1_Sub4_2;
		@Pc(16) Class2_Sub1_Sub4 local16 = local7.aClass2_Sub1_Sub4_1;
		if (local13 != null) {
			local13.aShort112 = (short) (local13.aShort112 * arg3 / (0x10 << Static185.anInt3178 - 7));
			local13.aShort111 = (short) (local13.aShort111 * arg3 / (0x10 << Static185.anInt3178 - 7));
		}
		if (local16 != null) {
			local16.aShort112 = (short) (local16.aShort112 * arg3 / (0x10 << Static185.anInt3178 - 7));
			local16.aShort111 = (short) (local16.aShort111 * arg3 / (0x10 << Static185.anInt3178 - 7));
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(FFIF)I")
	public static int method4578(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		@Pc(12) float local12 = arg1 < 0.0F ? -arg1 : arg1;
		@Pc(30) float local30 = arg2 < 0.0F ? -arg2 : arg2;
		@Pc(39) float local39 = arg0 < 0.0F ? -arg0 : arg0;
		if (local12 < local30 && local30 > local39) {
			return arg2 > 0.0F ? 0 : 1;
		} else if (local12 < local39 && local30 < local39) {
			return arg0 > 0.0F ? 2 : 3;
		} else if (arg1 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}
}
