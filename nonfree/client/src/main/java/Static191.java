import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!gq", name = "o", descriptor = "I")
	public static int anInt3612;

	@OriginalMember(owner = "client!gq", name = "w", descriptor = "Lclient!lc;")
	public static Class200 aClass200_47;

	@OriginalMember(owner = "client!gq", name = "x", descriptor = "Z")
	public static boolean aBoolean236 = false;

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(ZZ)Z")
	public static boolean method3256(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(BIIII)I")
	public static int method3257(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = arg2 & 0xF;
		@Pc(19) int local19 = local7 >= 8 ? arg3 : arg1;
		@Pc(36) int local36 = local7 < 4 ? arg3 : local7 == 12 || local7 == 14 ? arg1 : arg0;
		return ((local7 & 0x2) == 0 ? local36 : -local36) + ((local7 & 0x1) == 0 ? local19 : -local19);
	}

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "(II)I")
	public static int method3261(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static503.aShortArrayArray15 == null ? 0 : Static503.aShortArrayArray15[arg0][arg1] & 0xFFFF;
	}
}
