import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static199 {

	@OriginalMember(owner = "client!kd", name = "e", descriptor = "I")
	public static int anInt3572;

	@OriginalMember(owner = "client!kd", name = "p", descriptor = "Lclient!qn;")
	public static Class211 aClass211_54;

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "I")
	public static final int anInt3568 = 1;

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIB)V")
	public static void method2849(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static131.method1881(arg0)) {
			Static82.method1308(Static412.aClass110ArrayArray2[arg0], arg1);
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIZIBI)V")
	public static void method2851(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 < 1) {
			arg1 = 1;
		}
		if (arg4 < 1) {
			arg4 = 1;
		}
		@Pc(21) int local21 = arg4 - 334;
		if (local21 < 0) {
			local21 = 0;
		} else if (local21 > 100) {
			local21 = 100;
		}
		@Pc(43) int local43 = Static276.aShort68 + (Static448.aShort102 - Static276.aShort68) * local21 / 100;
		if (Static45.aShort17 > local43) {
			local43 = Static45.aShort17;
		} else if (local43 > Static157.aShort51) {
			local43 = Static157.aShort51;
		}
		@Pc(65) int local65 = arg4 * 512 * local43 / (arg1 * 334);
		@Pc(106) int local106;
		@Pc(113) int local113;
		@Pc(77) short local77;
		if (local65 < Static306.aShort70) {
			local77 = Static306.aShort70;
			local43 = local77 * arg1 * 334 / (arg4 * 512);
			if (Static157.aShort51 < local43) {
				local43 = Static157.aShort51;
				local106 = local43 * 512 * arg4 / (local77 * 334);
				local113 = (arg1 - local106) / 2;
				if (arg2) {
					Static39.aClass135_1.e();
					Static39.aClass135_1.method5394(local113, arg0, arg4, arg3, -16777216);
					Static39.aClass135_1.method5394(local113, arg0 + arg1 - local113, arg4, arg3, -16777216);
				}
				arg0 += local113;
				arg1 -= local113 * 2;
			}
		} else if (Static21.aShort2 < local65) {
			local77 = Static21.aShort2;
			local43 = arg1 * local77 * 334 / (arg4 * 512);
			if (local43 < Static45.aShort17) {
				local43 = Static45.aShort17;
				local106 = local77 * arg1 * 334 / (local43 * 512);
				local113 = (arg4 - local106) / 2;
				if (arg2) {
					Static39.aClass135_1.e();
					Static39.aClass135_1.method5394(arg1, arg0, local113, arg3, -16777216);
					Static39.aClass135_1.method5394(arg1, arg0, local113, arg3 + arg4 - local113, -16777216);
				}
				arg4 -= local113 * 2;
				arg3 += local113;
			}
		}
		Static335.anInt5464 = arg0;
		Static178.anInt3232 = (short) arg4;
		Static37.anInt613 = (short) arg1;
		Static100.anInt1832 = arg3;
		Static329.anInt5333 = arg4 * local43 / 334;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!qn;I)V")
	public static void method2852(@OriginalArg(0) Class211 arg0) {
		Static94.anInt5461 = 0;
		Static126.anInt2199 = 0;
		Static73.aClass248_3 = new Class248();
		Static331.aClass20_Sub1_Sub1_Sub1Array2 = new Class20_Sub1_Sub1_Sub1[1024];
		Static107.method1607(arg0);
		Static441.method5869(arg0);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIILclient!hd;)V")
	public static void method2853(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class110 arg2) {
		Static286.aClass110_13 = arg2;
		Static175.anInt3189 = arg0;
		Static246.anInt4070 = arg1;
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)V")
	public static void method2854() {
		if (Static354.aBoolean417) {
			return;
		}
		Static333.aBoolean386 = true;
		Static354.aBoolean417 = true;
		if (Static413.aClass49_Sub1_1.aBoolean230) {
			Static109.aFloat75 = (int) Static109.aFloat75 + 191 & 0xFFFFFF80;
		} else {
			Static33.aFloat7 += (24.0F - Static33.aFloat7) / 2.0F;
		}
	}
}
