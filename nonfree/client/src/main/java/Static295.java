import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static295 {

	@OriginalMember(owner = "client!le", name = "d", descriptor = "Lclient!tg;")
	public static Class310 aClass310_1;

	@OriginalMember(owner = "client!le", name = "a", descriptor = "I")
	public static int anInt6020 = 0;

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(ILclient!ufa;Ljava/lang/String;I)Lclient!dn;")
	public static Class66 method4985(@OriginalArg(0) int arg0, @OriginalArg(1) Class326 arg1, @OriginalArg(2) String arg2) {
		if (arg0 == 0) {
			return arg1.method7789(arg2);
		}
		@Pc(37) Class66 local37;
		if (arg0 == 1) {
			try {
				Static603.method4979(new Object[] { (new URL(Static253.anApplet3.getCodeBase(), arg2)).toString() }, "openjs", Static253.anApplet3);
				local37 = new Class66();
				local37.anInt2308 = 1;
				return local37;
			} catch (@Pc(43) Throwable local43) {
				local37 = new Class66();
				local37.anInt2308 = 2;
				return local37;
			}
		} else if (arg0 == 2) {
			try {
				Static253.anApplet3.getAppletContext().showDocument(new URL(Static253.anApplet3.getCodeBase(), arg2), "_blank");
				local37 = new Class66();
				local37.anInt2308 = 1;
				return local37;
			} catch (@Pc(75) Exception local75) {
				local37 = new Class66();
				local37.anInt2308 = 2;
				return local37;
			}
		} else if (arg0 == 3) {
			try {
				Static603.method4977("loggedout", Static253.anApplet3);
			} catch (@Pc(105) Throwable local105) {
			}
			try {
				Static253.anApplet3.getAppletContext().showDocument(new URL(Static253.anApplet3.getCodeBase(), arg2), "_top");
				local37 = new Class66();
				local37.anInt2308 = 1;
				return local37;
			} catch (@Pc(125) Exception local125) {
				local37 = new Class66();
				local37.anInt2308 = 2;
				return local37;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIZIII)V")
	public static void method4986(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg3 < 1) {
			arg3 = 1;
		}
		if (arg2 < 1) {
			arg2 = 1;
		}
		@Pc(19) int local19 = arg2 - 334;
		if (local19 < 0) {
			local19 = 0;
		} else if (local19 > 100) {
			local19 = 100;
		}
		@Pc(42) int local42 = local19 * (Static146.aShort126 - Static304.aShort61) / 100 + Static304.aShort61;
		if (local42 < Static94.aShort28) {
			local42 = Static94.aShort28;
		} else if (local42 > Static157.aShort43) {
			local42 = Static157.aShort43;
		}
		@Pc(67) int local67 = arg2 * 512 * local42 / (arg3 * 334);
		@Pc(101) int local101;
		@Pc(108) int local108;
		@Pc(72) short local72;
		if (local67 < Static412.aShort97) {
			local72 = Static412.aShort97;
			local42 = arg3 * local72 * 334 / (arg2 * 512);
			if (local42 > Static157.aShort43) {
				local42 = Static157.aShort43;
				local101 = local42 * arg2 * 512 / (local72 * 334);
				local108 = (arg3 - local101) / 2;
				if (arg1) {
					Static546.aClass15_16.F();
					Static546.aClass15_16.method5341(-16777216, arg4, arg2, local108, arg0);
					Static546.aClass15_16.method5341(-16777216, arg4 + arg3 - local108, arg2, local108, arg0);
				}
				arg3 -= local108 * 2;
				arg4 += local108;
			}
		} else if (Static462.aShort104 < local67) {
			local72 = Static462.aShort104;
			local42 = local72 * arg3 * 334 / (arg2 * 512);
			if (Static94.aShort28 > local42) {
				local42 = Static94.aShort28;
				local101 = arg3 * local72 * 334 / (local42 * 512);
				local108 = (arg2 - local101) / 2;
				if (arg1) {
					Static546.aClass15_16.F();
					Static546.aClass15_16.method5341(-16777216, arg4, local108, arg3, arg0);
					Static546.aClass15_16.method5341(-16777216, arg4, local108, arg3, arg2 + arg0 - local108);
				}
				arg2 -= local108 * 2;
				arg0 += local108;
			}
		}
		Static166.anInt3528 = arg0;
		Static580.anInt10224 = arg4;
		Static333.anInt6933 = arg2 * local42 / 334;
		Static304.anInt6088 = (short) arg2;
		Static548.anInt9853 = (short) arg3;
	}
}
