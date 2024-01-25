import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static398 {

	@OriginalMember(owner = "client!tu", name = "d", descriptor = "F")
	public static float aFloat40;

	@OriginalMember(owner = "client!tu", name = "e", descriptor = "I")
	public static int anInt3313;

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method2752(@OriginalArg(0) String arg0) {
		System.exit(1);
	}

	@OriginalMember(owner = "client!tu", name = "b", descriptor = "(II)Z")
	public static boolean method2753(@OriginalArg(1) int arg0) {
		return arg0 == 0 || arg0 == 1;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(I[BI)[B")
	public static byte[] method2754(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(14) byte[] local14 = new byte[arg0];
		Static468.method5036(arg1, 0, local14, 0, arg0);
		return local14;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lclient!za;I)V")
	public static void method2756(@OriginalArg(0) Class34 arg0) {
		arg0.ba(0, 0, Static69.anInt1304, 350);
		arg0.P(0, 0, Static69.anInt1304, 350, Static61.anInt1467 << 24 | 0x332277, 1);
		@Pc(34) int local34 = 350 / Static278.anInt4928;
		@Pc(43) int local43;
		if (Static188.anInt3240 > 0) {
			local43 = 346 - Static278.anInt4928 - 4;
			@Pc(53) int local53 = local43 * local34 / (Static188.anInt3240 + local34 - 1);
			@Pc(55) int local55 = 4;
			if (Static188.anInt3240 > 1) {
				local55 = (local43 - local53) * (Static188.anInt3240 + -1 - Static119.anInt2216) / (Static188.anInt3240 - 1) + 4;
			}
			arg0.P(Static69.anInt1304 - 16, local55, 12, local53, Static61.anInt1467 << 24 | 0x332277, 2);
			for (@Pc(92) int local92 = Static119.anInt2216; local92 < local34 + Static119.anInt2216 && local92 < Static188.anInt3240; local92++) {
				@Pc(101) String[] local101 = Static192.method2761('\b', Static54.aStringArray8[local92]);
				@Pc(110) int local110 = (Static69.anInt1304 - 16 - 8) / local101.length;
				for (@Pc(112) int local112 = 0; local112 < local101.length; local112++) {
					@Pc(120) int local120 = local112 * local110 + 8;
					arg0.ba(local120, 0, local120 + local110 - 8, 350);
					Static437.aClass76_4.method4587(-16777216, 350 - Static278.anInt4928 * (local92 - Static119.anInt2216) - Static3.anInt5811 - Static414.aClass89_9.anInt2311 - 2, local101[local112], -1, local120);
				}
			}
		}
		arg0.ba(0, 0, Static69.anInt1304, 350);
		arg0.method5731(0, Static69.anInt1304, 350 - Static3.anInt5811, -1);
		Static121.aClass76_2.method4587(-16777216, 350 - Static451.aClass89_10.anInt2311 - 1, "--> " + Static335.aString64, -1, 10);
		local43 = -1;
		if (Static236.anInt4213 % 30 > 15) {
			local43 = 16777215;
		}
		arg0.method5753(12, Static451.aClass89_10.method1995("--> " + Static335.aString64.substring(0, Static373.anInt6278)) + 10, local43, 350 - Static451.aClass89_10.anInt2311 - 11);
	}
}
