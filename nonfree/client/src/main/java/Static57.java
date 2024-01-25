import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!co", name = "G", descriptor = "[B")
	public static byte[] aByteArray16;

	@OriginalMember(owner = "client!co", name = "P", descriptor = "I")
	public static int anInt1201;

	@OriginalMember(owner = "client!co", name = "B", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar1 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(CB)Z")
	public static boolean method1068(@OriginalArg(0) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method1069(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (Static41.anIntArrayArrayArray2[arg0][local16][local20] == -Static30.anInt498) {
						return false;
					}
				}
			}
			local20 = (arg1 << Static301.anInt2759) + 1;
			@Pc(142) int local142 = (arg3 << Static301.anInt2759) + 2;
			@Pc(151) int local151 = Static420.aClass84Array4[arg0].method5322(arg1, arg3) + arg5;
			if (!Static365.method3018(local20, local151, local142)) {
				return false;
			}
			@Pc(164) int local164 = (arg2 << Static301.anInt2759) - 1;
			if (!Static365.method3018(local164, local151, local142)) {
				return false;
			}
			@Pc(177) int local177 = (arg4 << Static301.anInt2759) - 1;
			if (!Static365.method3018(local20, local151, local177)) {
				return false;
			} else if (Static365.method3018(local164, local151, local177)) {
				return true;
			} else {
				return false;
			}
		} else if (Static275.method4186(arg0, arg1, arg3)) {
			local16 = arg1 << Static301.anInt2759;
			local20 = arg3 << Static301.anInt2759;
			return Static365.method3018(local16 + 1, Static420.aClass84Array4[arg0].method5322(arg1, arg3) + arg5, local20 + 1) && Static365.method3018(local16 + Static22.anInt397 - 1, Static420.aClass84Array4[arg0].method5322(arg1 + 1, arg3) + arg5, local20 + 1) && Static365.method3018(local16 + Static22.anInt397 - 1, Static420.aClass84Array4[arg0].method5322(arg1 + 1, arg3 + 1) + arg5, local20 + Static22.anInt397 - 1) && Static365.method3018(local16 + 1, Static420.aClass84Array4[arg0].method5322(arg1, arg3 + 1) + arg5, local20 + Static22.anInt397 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Lclient!qh;ILclient!uj;IIIZLclient!in;)V")
	public static void method1074(@OriginalArg(0) Class3_Sub3_Sub6_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub3_Sub6_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class118 arg6) {
		@Pc(12) Class6_Sub14 local12 = new Class6_Sub14();
		local12.anInt2366 = arg4;
		local12.anInt2370 = arg1 << 7;
		local12.anInt2369 = arg5 << 7;
		if (arg6 != null) {
			local12.aClass118_1 = arg6;
			@Pc(138) int local138 = arg6.anInt2997;
			@Pc(141) int local141 = arg6.anInt3025;
			if (arg3 == 1 || arg3 == 3) {
				local141 = arg6.anInt2997;
				local138 = arg6.anInt3025;
			}
			local12.anInt2360 = arg6.anInt3017 << 7;
			local12.anIntArray240 = arg6.anIntArray276;
			local12.anInt2371 = arg6.anInt2991;
			local12.anInt2361 = arg6.anInt2987;
			local12.anInt2364 = arg6.anInt2989;
			local12.anInt2363 = local141 + arg5 << 7;
			local12.anInt2368 = arg1 + local138 << 7;
			local12.anInt2373 = arg6.anInt2977;
			if (arg6.anIntArray273 != null) {
				local12.aBoolean179 = true;
				local12.method2180();
			}
			if (local12.anIntArray240 != null) {
				local12.anInt2374 = (int) ((double) (local12.anInt2371 - local12.anInt2364) * Math.random()) + local12.anInt2364;
			}
			Static329.aClass88_40.method1878(local12);
		} else if (arg2 != null) {
			local12.aClass3_Sub3_Sub6_Sub2_1 = arg2;
			@Pc(82) Class17 local82 = arg2.aClass17_1;
			if (local82.anIntArray26 != null) {
				local12.aBoolean179 = true;
				local82 = local82.method288(Static71.aClass126_1);
			}
			if (local82 != null) {
				local12.anInt2363 = arg5 + local82.anInt344 << 7;
				local12.anInt2368 = arg1 + local82.anInt344 << 7;
				local12.anInt2361 = Static402.method5467(arg2);
				local12.anInt2360 = local82.anInt335 << 7;
				local12.anInt2373 = local82.anInt330;
			}
			Static170.aClass88_18.method1878(local12);
		} else if (arg0 != null) {
			local12.aClass3_Sub3_Sub6_Sub1_2 = arg0;
			local12.anInt2368 = arg1 + arg0.method5512() << 7;
			local12.anInt2363 = arg0.method5512() + arg5 << 7;
			local12.anInt2361 = Static158.method2617(arg0);
			local12.anInt2373 = arg0.anInt5510;
			local12.anInt2360 = arg0.anInt5528 << 7;
			Static417.aClass137_35.method3179((long) arg0.anInt6731, local12);
			return;
		}
	}

	@OriginalMember(owner = "client!co", name = "f", descriptor = "(I)[Lclient!qi;")
	public static Class207[] method1075() {
		return new Class207[] { Static194.aClass207_8, Static162.aClass207_3, Static312.aClass207_7, Static388.aClass207_10, Static315.aClass207_5, Static383.aClass207_9 };
	}
}
