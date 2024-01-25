import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static168 {

	@OriginalMember(owner = "client!km", name = "j", descriptor = "I")
	public static int anInt6696;

	@OriginalMember(owner = "client!km", name = "a", descriptor = "I")
	public static int anInt6689 = 0;

	@OriginalMember(owner = "client!km", name = "d", descriptor = "I")
	public static int anInt6692 = 0;

	@OriginalMember(owner = "client!km", name = "f", descriptor = "Lclient!ub;")
	public static Class198 aClass198_247 = new Class198(128);

	@OriginalMember(owner = "client!km", name = "h", descriptor = "F")
	public static float aFloat98 = 0.0F;

	@OriginalMember(owner = "client!km", name = "i", descriptor = "I")
	public static int anInt6695 = 0;

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(IIIIZ)V")
	public static void method5617(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < Static67.anInt1778; local7++) {
			@Pc(18) Rectangle local18 = Class13.aRectangleArray1[local7];
			if (local18.width + local18.x > arg2 && local18.x < arg2 + arg3 && local18.y + local18.height > arg1 && local18.y < arg1 + arg0) {
				Static172.aBooleanArray19[local7] = true;
			}
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(IIIIIIII)V")
	public static void method5619(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg1 - 334;
		if (local7 < 0) {
			local7 = 0;
		} else if (local7 > 100) {
			local7 = 100;
		}
		@Pc(29) int local29 = Static190.aShort63 + local7 * (Static237.aShort95 - Static190.aShort63) / 100;
		@Pc(35) int local35 = arg6 * local29 >> 8;
		@Pc(42) int local42 = 16384 - arg3 & 0x3FFF;
		@Pc(49) int local49 = 16384 - arg2 & 0x3FFF;
		@Pc(51) int local51 = 0;
		@Pc(53) int local53 = 0;
		@Pc(55) int local55 = local35;
		if (local42 != 0) {
			local53 = -local35 * Class118_Sub1.anIntArray314[local42] >> 15;
			local55 = local35 * Class118_Sub1.anIntArray317[local42] >> 15;
		}
		if (local49 != 0) {
			local51 = local55 * Class118_Sub1.anIntArray314[local49] >> 15;
			local55 = Class118_Sub1.anIntArray317[local49] * local55 >> 15;
		}
		Static112.anInt2705 = arg5 - local53;
		Static80.anInt2124 = 0;
		Static217.anInt4437 = arg2;
		Static337.anInt6445 = arg3;
		Static240.anInt4829 = arg4 - local51;
		Static129.anInt3039 = arg0 - local55;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method5620(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(11) int local11 = 0; local11 < Static202.anInt4162; local11++) {
			if (arg0.equalsIgnoreCase(Static73.aStringArray21[local11])) {
				return local11;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(IILclient!br;)Ljava/lang/String;")
	public static String method5626(@OriginalArg(1) int arg0, @OriginalArg(2) Class21 arg1) {
		if (!Static44.method877(arg1).method1028(arg0) && arg1.anObjectArray9 == null) {
			return null;
		} else if (arg1.aStringArray6 == null || arg0 >= arg1.aStringArray6.length || arg1.aStringArray6[arg0] == null || arg1.aStringArray6[arg0].trim().length() == 0) {
			return Static189.aBoolean306 ? "Hidden-" + arg0 : null;
		} else {
			return arg1.aStringArray6[arg0];
		}
	}
}
