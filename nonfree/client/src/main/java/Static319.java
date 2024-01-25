import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static319 {

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(Lclient!oa;IIZLclient!qa;IZ)V")
	public static void method4117(@OriginalArg(0) Class16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class128 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		if (arg5) {
			Static57.aClass49_4.method5636((Static126.anInt2202 - Static57.aClass49_4.ja()) / 2, (Static92.anInt1618 - Static57.aClass49_4.JA()) / 2);
			Static301.aClass49_17.method5636((Static126.anInt2202 - Static301.aClass49_17.ja()) / 2, 18);
		}
		arg0.method5495(arg1, -1, Static126.anInt2202 / 2, Static92.anInt1618 / 2 - 26, (Static455.aClass6_5 == Static357.aClass6_4 ? Static76.aClass151_48 : Static298.aClass151_152).method3122(Static188.anInt3028));
		@Pc(61) int local61 = Static92.anInt1618 / 2 - 18;
		arg3.method3593(Static126.anInt2202 / 2 - 152, local61, 304, 34, arg2, 0);
		arg3.method3593(Static126.anInt2202 / 2 - 151, local61 - -1, 302, 32, 0, 0);
		arg3.NA(Static126.anInt2202 / 2 - 150, local61 + 2, Static388.anInt891 * 3, 30, arg4, 0);
		arg3.NA(Static126.anInt2202 / 2 + Static388.anInt891 * 3 - 150, local61 + 2, 300 - Static388.anInt891 * 3, 30, 0, 0);
		arg0.method5495(arg1, -1, Static126.anInt2202 / 2, Static92.anInt1618 / 2 + 4, Class106_Sub1.lb);
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(Lclient!me;B)V")
	public static void method4118(@OriginalArg(0) Class20_Sub3_Sub3 arg0) {
		if (arg0 instanceof Class20_Sub3_Sub3_Sub2) {
			@Pc(17) Class20_Sub3_Sub3_Sub2 local17 = (Class20_Sub3_Sub3_Sub2) arg0;
			if (local17.aClass246_1 != null) {
				Static212.method2831(local17.aByte89 != Static239.aClass20_Sub3_Sub3_Sub1_1.aByte89, local17);
				return;
			}
		} else if (arg0 instanceof Class20_Sub3_Sub3_Sub1) {
			@Pc(42) Class20_Sub3_Sub3_Sub1 local42 = (Class20_Sub3_Sub3_Sub1) arg0;
			Static184.method2457(local42, Static239.aClass20_Sub3_Sub3_Sub1_1.aByte89 != local42.aByte89);
		} else {
			return;
		}
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(IIIII)V")
	public static void method4119(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < Static193.anInt7328; local3++) {
			@Pc(9) Rectangle local9 = Class138.aRectangleArray5[local3];
			if (local9.width + local9.x > arg3 && arg3 + arg2 > local9.x && arg1 < local9.y + local9.height && local9.y < arg0 + arg1) {
				Static308.aBooleanArray24[local3] = true;
			}
		}
	}
}
