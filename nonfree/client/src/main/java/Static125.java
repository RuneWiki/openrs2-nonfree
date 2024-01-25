import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!ii", name = "e", descriptor = "Lclient!pj;")
	public static Class163 aClass163_1;

	@OriginalMember(owner = "client!ii", name = "f", descriptor = "I")
	public static int anInt2817;

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "Z")
	public static boolean aBoolean268 = true;

	@OriginalMember(owner = "client!ii", name = "g", descriptor = "I")
	public static int anInt2818 = 0;

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(ILclient!aq;Lclient!uo;Lclient!em;IBIII)V")
	public static void method2609(@OriginalArg(0) int arg0, @OriginalArg(1) Class12 arg1, @OriginalArg(2) Class32 arg2, @OriginalArg(3) Class52 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(9) Class139 local9 = Static255.method4606(arg6);
		if (local9 == null || !local9.aBoolean393 || !local9.method3810()) {
			return;
		}
		@Pc(28) int local28;
		if (local9.anIntArray381 != null) {
			@Pc(26) int[] local26 = new int[local9.anIntArray381.length];
			@Pc(40) int local40;
			for (local28 = 0; local28 < local26.length / 2; local28++) {
				if (Static147.anInt3204 == 4) {
					local40 = (int) Static75.aFloat13 & 0x3FFF;
				} else {
					local40 = Static337.anInt6461 + (int) Static75.aFloat13 & 0x3FFF;
				}
				@Pc(53) int local53 = Class1_Sub3_Sub8.anIntArray159[local40];
				@Pc(57) int local57 = Class1_Sub3_Sub8.anIntArray156[local40];
				if (Static147.anInt3204 != 4) {
					local53 = local53 * 256 / (Static287.anInt5748 + 256);
					local57 = local57 * 256 / (Static287.anInt5748 + 256);
				}
				local26[local28 * 2] = arg1.lb / 2 + arg0 + ((local9.anIntArray381[local28 * 2 + 1] * 4 + arg4) * local53 - -((arg7 - -(local9.anIntArray381[local28 * 2] * 4)) * local57) >> 15);
				local26[local28 * 2 + 1] = arg5 + arg1.anInt446 / 2 - (local57 * (local9.anIntArray381[local28 * 2 + 1] * 4 + arg4) - (arg7 + local9.anIntArray381[local28 * 2] * 4) * local53 >> 15);
			}
			Static217.method4132(arg2, local26, local9.anInt4235, arg1.anIntArray46, arg1.anIntArray47);
			for (local40 = 0; local40 < local26.length / 2 - 1; local40++) {
				arg2.method2154(local26[local40 * 2], local26[local40 * 2 + 1], local26[local40 * 2 + 2], local26[(local40 + 1) * 2 + 1], local9.anInt4215, arg3, arg0, arg5);
			}
			arg2.method2154(local26[local26.length - 2], local26[local26.length - 1], local26[0], local26[1], local9.anInt4215, arg3, arg0, arg5);
		}
		@Pc(261) Class5 local261 = null;
		if (local9.anInt4245 != -1) {
			local261 = local9.method3818(false, arg2);
			if (local261 != null) {
				Static120.method2555(arg5, arg1, arg0, arg7, local261, arg3, arg4);
			}
		}
		if (local9.aString37 == null) {
			return;
		}
		local28 = 0;
		if (local261 != null) {
			local28 = local261.method3623();
		}
		@Pc(295) Class9 local295 = Static56.aClass9_2;
		@Pc(297) Class63 local297 = Static26.aClass63_2;
		if (local9.anInt4233 == 1) {
			local295 = Static212.aClass9_3;
			local297 = Static195.aClass63_5;
		}
		if (local9.anInt4233 == 2) {
			local297 = Static90.aClass63_3;
			local295 = Static49.aClass9_1;
		}
		Static326.method2150(local9.aString37, arg7, arg0, local295, arg5, local297, local9.anInt4239, arg3, local28, arg1, arg4);
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IBI)Ljava/lang/String;")
	public static String method2610(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = arg0 - arg1;
		if (local13 < -9) {
			return "<col=ff0000>";
		} else if (local13 < -6) {
			return "<col=ff3000>";
		} else if (local13 < -3) {
			return "<col=ff7000>";
		} else if (local13 < 0) {
			return "<col=ffb000>";
		} else if (local13 > 9) {
			return "<col=00ff00>";
		} else if (local13 > 6) {
			return "<col=40ff00>";
		} else if (local13 > 3) {
			return "<col=80ff00>";
		} else if (local13 > 0) {
			return "<col=c0ff00>";
		} else {
			return "<col=ffff00>";
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIB)V")
	public static void method2611(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static133.aClass87_27 = new Class87(arg0);
		Static237.aClass87_41 = new Class87(arg1);
	}
}
