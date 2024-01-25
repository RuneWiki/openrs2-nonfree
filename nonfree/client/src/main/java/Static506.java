import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static506 {

	@OriginalMember(owner = "client!tg", name = "y", descriptor = "I")
	public static int anInt3161;

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIIBI)V")
	public static void method2842(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < Static68.anInt1112; local3++) {
			@Pc(9) Rectangle local9 = Class1_Sub4_Sub2_Sub3.aRectangleArray2[local3];
			if (local9.x + local9.width > arg2 && local9.x < arg3 + arg2 && arg0 < local9.height + local9.y && arg1 + arg0 > local9.y) {
				Static250.aBooleanArray13[local3] = true;
			}
		}
	}

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(III)Z")
	public static boolean method2843(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static92.method2101(arg1, arg0) | (arg1 & 0x60000) != 0 || Static420.method6570(arg1, arg0);
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIZIZI)V")
	public static void method2844(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg3 < 1) {
			arg3 = 1;
		}
		if (arg0 < 1) {
			arg0 = 1;
		}
		@Pc(21) int local21 = arg3 - 334;
		if (local21 < 0) {
			local21 = 0;
		} else if (local21 > 100) {
			local21 = 100;
		}
		@Pc(45) int local45 = local21 * (Static299.aShort76 - Static308.aShort77) / 100 + Static308.aShort77;
		if (Static130.aShort44 > local45) {
			local45 = Static130.aShort44;
		} else if (Static313.aShort59 < local45) {
			local45 = Static313.aShort59;
		}
		@Pc(67) int local67 = arg3 * 512 * local45 / (arg0 * 334);
		@Pc(108) int local108;
		@Pc(114) int local114;
		@Pc(79) short local79;
		if (Static231.aShort47 > local67) {
			local79 = Static231.aShort47;
			local45 = local79 * 334 * arg0 / (arg3 * 512);
			if (Static313.aShort59 < local45) {
				local45 = Static313.aShort59;
				local108 = local45 * 512 * arg3 / (local79 * 334);
				local114 = (arg0 - local108) / 2;
				if (arg2) {
					Static440.aClass44_12.JA();
					Static440.aClass44_12.method5006(arg4, local114, arg1, -16777216, arg3);
					Static440.aClass44_12.method5006(arg4 + arg0 - local114, local114, arg1, -16777216, arg3);
				}
				arg4 += local114;
				arg0 -= local114 * 2;
			}
		} else if (Static267.aShort64 < local67) {
			local79 = Static267.aShort64;
			local45 = local79 * 334 * arg0 / (arg3 * 512);
			if (local45 < Static130.aShort44) {
				local45 = Static130.aShort44;
				local108 = local79 * arg0 * 334 / (local45 * 512);
				local114 = (arg3 - local108) / 2;
				if (arg2) {
					Static440.aClass44_12.JA();
					Static440.aClass44_12.method5006(arg4, arg0, arg1, -16777216, local114);
					Static440.aClass44_12.method5006(arg4, arg0, arg1 + arg3 - local114, -16777216, local114);
				}
				arg1 += local114;
				arg3 -= local114 * 2;
			}
		}
		Static585.anInt9800 = local45 * arg3 / 334;
		Static4.anInt153 = arg4;
		Static231.anInt4191 = (short) arg0;
		Static136.anInt2911 = (short) arg3;
		Static366.anInt8690 = arg1;
	}
}
