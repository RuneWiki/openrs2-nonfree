import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "[I")
	public static final int[] anIntArray187 = new int[13];

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(IIZII)V")
	public static void method1762(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(10) int local10 = 0; local10 < Static88.anInt1187; local10++) {
			@Pc(16) Rectangle local16 = Class1_Sub29.aRectangleArray4[local10];
			if (arg1 < local16.x + local16.width && arg1 + arg3 > local16.x && arg2 < local16.height + local16.y && local16.y < arg0 + arg2) {
				Static150.aBooleanArray107[local10] = true;
			}
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(IIIII)Z")
	public static boolean method1765(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if ((Static278.aByteArrayArrayArray16[0][arg1][arg2] & 0x2) != 0) {
			return true;
		} else if ((Static278.aByteArrayArrayArray16[arg3][arg1][arg2] & 0x10) == 0) {
			return arg0 == Static51.method682(arg2, arg1, arg3);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(CB)Z")
	public static boolean method1767(@OriginalArg(0) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static328.method4317(arg0)) {
			return true;
		} else {
			@Pc(26) char[] local26 = Static455.aCharArray6;
			for (@Pc(28) int local28 = 0; local28 < local26.length; local28++) {
				@Pc(34) char local34 = local26[local28];
				if (local34 == arg0) {
					return true;
				}
			}
			@Pc(54) char[] local54 = Static364.aCharArray5;
			for (@Pc(56) int local56 = 0; local56 < local54.length; local56++) {
				@Pc(62) char local62 = local54[local56];
				if (local62 == arg0) {
					return true;
				}
			}
			return false;
		}
	}
}
