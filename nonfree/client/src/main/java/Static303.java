import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static303 {

	@OriginalMember(owner = "client!kd", name = "q", descriptor = "F")
	public static float aFloat112;

	@OriginalMember(owner = "client!kd", name = "u", descriptor = "I")
	public static int anInt4789;

	@OriginalMember(owner = "client!kd", name = "w", descriptor = "I")
	public static int anInt4791;

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(I[BI)I")
	public static int method4270(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		return Static633.method8385(arg1, 0, arg0);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method4272(@OriginalArg(0) String arg0) {
		if (!arg0.equals("")) {
			@Pc(17) Class4_Sub48 local17 = Static335.method4615(Static58.aClass216_16, Static669.aClass196_2);
			local17.aClass4_Sub11_Sub1_2.method8822(Static115.method2143(arg0));
			local17.aClass4_Sub11_Sub1_2.method8857(arg0);
			Static410.method5170(local17);
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIB)I")
	public static int method4273(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = 1;
		while (arg1 > 1) {
			if ((arg1 & 0x1) != 0) {
				local12 *= arg0;
			}
			arg1 >>= 0x1;
			arg0 *= arg0;
		}
		if (arg1 == 1) {
			return arg0 * local12;
		} else {
			return local12;
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IZIIIII)V")
	public static void method4274(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(6) int arg3) {
		@Pc(7) Class82[] local7 = Static9.aClass82Array41;
		for (@Pc(9) int local9 = 0; local9 < local7.length; local9++) {
			@Pc(15) Class82 local15 = local7[local9];
			if (local15 != null && local15.anInt2225 == 2) {
				Static28.method643(local15.anInt2227, local15.anInt2226 * 2, local15.anInt2233, local15.anInt2231, arg3 >> 1, arg0 >> 1);
				if (Static519.anIntArray552[0] > -1 && Static177.anInt3088 % 20 < 10) {
					@Pc(60) Class17 local60 = Static384.aClass17Array12[local15.anInt2230];
					@Pc(69) int local69 = arg1 + Static519.anIntArray552[0] - 12;
					@Pc(77) int local77 = Static519.anIntArray552[1] + arg2 - 28;
					local60.method5246(local69, local77);
					Static100.method2025(local77, local69 + local60.method5256(), local69, local77 + local60.method5251());
				}
			}
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(BIII)Z")
	public static boolean method4275(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static300.aClass92_4.method3862(arg0, arg1, arg2, Static552.anIntArray586);
		@Pc(13) int local13 = Static552.anIntArray586[2];
		if (local13 < 50) {
			return false;
		} else {
			Static552.anIntArray586[0] = Static19.anInt441 + Static596.anInt9158 * Static552.anIntArray586[0] / local13;
			Static552.anIntArray586[1] = Static623.anInt9774 + Static552.anIntArray586[1] * Static497.anInt7749 / local13;
			Static552.anIntArray586[2] = local13;
			return true;
		}
	}
}
