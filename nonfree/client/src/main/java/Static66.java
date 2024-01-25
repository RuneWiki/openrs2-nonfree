import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!cga", name = "o", descriptor = "I")
	public static int anInt1530 = 0;

	@OriginalMember(owner = "client!cga", name = "p", descriptor = "I")
	public static int anInt1531 = 503;

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(II)I")
	public static int method1438(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static15.anIntArrayArray6 == null ? 0 : Static15.anIntArrayArray6[arg0][arg1] & 0xFFFFFF;
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(IZ)V")
	public static void method1439(@OriginalArg(1) boolean arg0) {
		if (Static274.aString32.length() == 0) {
			return;
		}
		Static359.method5539("--> " + Static274.aString32);
		Static237.method3663(false, arg0, Static274.aString32);
		Static274.aString32 = "";
		Static252.anInt4476 = 0;
		Static35.anInt639 = 0;
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "([FIFIIIIIIIFFI)V")
	public static void method1440(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) float arg9, @OriginalArg(11) float arg10, @OriginalArg(12) int arg11) {
		@Pc(5) int local5 = arg3 - arg4;
		@Pc(9) int local9 = arg6 - arg1;
		@Pc(13) int local13 = arg11 - arg5;
		@Pc(38) float local38 = arg0[1] * (float) local13 + (float) local5 * arg0[0] + arg0[2] * (float) local9;
		@Pc(59) float local59 = arg0[5] * (float) local9 + arg0[4] * (float) local13 + arg0[3] * (float) local5;
		@Pc(80) float local80 = (float) local9 * arg0[8] + arg0[6] * (float) local5 + arg0[7] * (float) local13;
		@Pc(100) float local100;
		@Pc(107) float local107;
		if (arg7 == 0) {
			local107 = arg9 + 0.5F - local80;
			local100 = arg10 + local38 + 0.5F;
		} else if (arg7 == 1) {
			local100 = local38 + arg10 + 0.5F;
			local107 = arg9 + local80 + 0.5F;
		} else if (arg7 == 2) {
			local100 = arg10 + 0.5F - local38;
			local107 = arg2 + 0.5F - local59;
		} else if (arg7 == 3) {
			local100 = local38 + arg10 + 0.5F;
			local107 = arg2 + 0.5F - local59;
		} else if (arg7 == 4) {
			local100 = arg9 + local80 + 0.5F;
			local107 = arg2 + 0.5F - local59;
		} else {
			local107 = arg2 + 0.5F - local59;
			local100 = arg9 + 0.5F - local80;
		}
		@Pc(197) float local197;
		if (arg8 == 1) {
			local197 = local100;
			local100 = -local107;
			local107 = local197;
		} else if (arg8 == 2) {
			local107 = -local107;
			local100 = -local100;
		} else if (arg8 == 3) {
			local197 = local100;
			local100 = local107;
			local107 = -local197;
		}
		Static448.aFloat180 = local107;
		Static141.aFloat85 = local100;
	}

	@OriginalMember(owner = "client!cga", name = "b", descriptor = "(B)V")
	public static void method1441() {
		Static288.aClass45_9.method7405(Static462.aFloat146, Static465.aFloat149, Static156.aFloat88);
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(III)V")
	public static void method1442(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class3_Sub7_Sub18 local8 = Static543.method7218(16, arg1);
		local8.method7326();
		local8.anInt8802 = arg0;
	}

	@OriginalMember(owner = "client!cga", name = "b", descriptor = "(II)Lclient!uca;")
	public static Class334 method1443(@OriginalArg(1) int arg0) {
		@Pc(10) Class334 local10 = (Class334) Static260.aClass6_28.method92((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(28) byte[] local28 = Static318.aClass322_97.method6802(1, arg0);
		local10 = new Class334();
		local10.anInt8431 = arg0;
		if (local28 != null) {
			local10.method7019(new Class3_Sub11(local28));
		}
		local10.method7018();
		if (local10.anInt8424 == 2 && Static495.aClass354_38.method7689((long) arg0) == null) {
			Static495.aClass354_38.method7691(new Class3_Sub17(Static94.anInt1935), (long) arg0);
			Static422.aClass334Array5[Static94.anInt1935++] = local10;
		}
		Static260.aClass6_28.method106((long) arg0, local10);
		return local10;
	}
}
