import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!fi", name = "ab", descriptor = "Lclient!u;")
	public static Class357 aClass357_1;

	@OriginalMember(owner = "client!fi", name = "Z", descriptor = "Lclient!qh;")
	public static Class300 aClass300_1 = new Class300(8);

	@OriginalMember(owner = "client!fi", name = "Q", descriptor = "I")
	public static int anInt2535 = 0;

	@OriginalMember(owner = "client!fi", name = "S", descriptor = "I")
	public static int anInt2537 = 0;

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IZII)Z")
	public static boolean method2366(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (!Static413.aBoolean501 || !Static434.aBoolean515) {
			return false;
		} else if (Static241.anInt4621 < 100) {
			return false;
		} else {
			@Pc(28) int local28 = Static354.anIntArrayArrayArray16[arg2][arg1][arg0];
			if (local28 == -Static559.anInt9354) {
				return false;
			} else if (Static559.anInt9354 == local28) {
				return true;
			} else if (Static346.aClass159Array2 == Static258.aClass159Array1) {
				return false;
			} else {
				@Pc(55) int local55 = arg1 << Static110.anInt1858;
				@Pc(59) int local59 = arg0 << Static110.anInt1858;
				if (Static485.method7311(Static258.aClass159Array1[arg2].method8207(arg0 + 1, arg1 - -1), local59 + 1, Static258.aClass159Array1[arg2].method8207(arg0, arg1), local55 + 1, Static391.anInt6813 + -1 + local59, Static258.aClass159Array1[arg2].method8207(arg0 + 1, arg1), local59 + Static391.anInt6813 - 1, Static391.anInt6813 + local55 + -1, local55 + 1) && Static485.method7311(Static258.aClass159Array1[arg2].method8207(arg0, arg1 + 1), local59 + 1, Static258.aClass159Array1[arg2].method8207(arg0, arg1), local55 + 1, Static391.anInt6813 + -1 + local59, Static258.aClass159Array1[arg2].method8207(arg0 + 1, arg1 + 1), local59 + 1, Static391.anInt6813 + local55 + -1, Static391.anInt6813 + local55 - 1)) {
					Static108.anInt1853++;
					Static354.anIntArrayArrayArray16[arg2][arg1][arg0] = Static559.anInt9354;
					return true;
				} else {
					Static354.anIntArrayArrayArray16[arg2][arg1][arg0] = -Static559.anInt9354;
					return false;
				}
			}
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIIILclient!aa;IILclient!qga;Lclient!ha;)V")
	public static void method2367(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class299 arg6, @OriginalArg(8) Class144 arg7) {
		@Pc(10) Class152 local10 = Static690.aClass274_7.method6614(arg1);
		if (local10 == null || !local10.aBoolean328 || !local10.method3796(Static188.aClass238_1)) {
			return;
		}
		@Pc(36) int local36;
		if (local10.anIntArray221 != null) {
			@Pc(34) int[] local34 = new int[local10.anIntArray221.length];
			@Pc(62) int local62;
			@Pc(66) int local66;
			for (local36 = 0; local36 < local34.length / 2; local36++) {
				@Pc(51) int local51;
				if (Static304.anInt5410 == 4) {
					local51 = (int) Static139.aFloat16 & 0x3FFF;
				} else {
					local51 = (int) Static139.aFloat16 + Static405.anInt7023 & 0x3FFF;
				}
				local62 = Class141.anIntArray207[local51];
				local66 = Class141.anIntArray208[local51];
				if (Static304.anInt5410 != 4) {
					local66 = local66 * 256 / (Static195.anInt3404 + 256);
					local62 = local62 * 256 / (Static195.anInt3404 + 256);
				}
				local34[local36 * 2] = arg5 + arg6.anInt8573 / 2 + (local62 * (arg2 - -(local10.anIntArray221[local36 * 2 + 1] * 4)) - -((local10.anIntArray221[local36 * 2] * 4 + arg0) * local66) >> 14);
				local34[local36 * 2 + 1] = arg6.anInt8547 / 2 + arg3 - (local66 * (local10.anIntArray221[local36 * 2 + 1] * 4 + arg2) - (local10.anIntArray221[local36 * 2] * 4 + arg0) * local62 >> 14);
			}
			@Pc(185) Class31 local185 = arg6.method7439(arg7);
			if (local185 != null) {
				Static409.method6147(arg7, local34, local10.anInt4295, local185.anIntArray28, local185.anIntArray29);
			}
			if (local10.anInt4323 > 0) {
				@Pc(224) int local224;
				@Pc(232) int local232;
				@Pc(242) int local242;
				@Pc(265) int local265;
				@Pc(275) int local275;
				for (local62 = 0; local62 < local34.length / 2 - 1; local62++) {
					local66 = local34[local62 * 2];
					local224 = local34[local62 * 2 + 1];
					local232 = local34[local62 * 2 + 2];
					local242 = local34[local62 * 2 + 2 + 1];
					if (local232 < local66) {
						local265 = local66;
						local275 = local224;
						local66 = local232;
						local224 = local242;
						local232 = local265;
						local242 = local275;
					} else if (local232 == local66 && local224 > local242) {
						local265 = local224;
						local224 = local242;
						local242 = local265;
					}
					arg7.method6947(local66, local224, local232, local242, local10.anIntArray222[local10.aByteArray52[local62] & 0xFF], arg4, arg5, arg3, local10.anInt4323, local10.anInt4306, local10.anInt4325);
				}
				local66 = local34[local34.length - 2];
				local224 = local34[local34.length - 1];
				local232 = local34[0];
				local242 = local34[1];
				if (local66 > local232) {
					local265 = local66;
					local66 = local232;
					local275 = local224;
					local224 = local242;
					local232 = local265;
					local242 = local275;
				} else if (local232 == local66 && local242 < local224) {
					local265 = local224;
					local224 = local242;
					local242 = local265;
				}
				arg7.method6947(local66, local224, local232, local242, local10.anIntArray222[local10.aByteArray52[local10.aByteArray52.length - 1] & 0xFF], arg4, arg5, arg3, local10.anInt4323, local10.anInt4306, local10.anInt4325);
			} else {
				for (local62 = 0; local62 < local34.length / 2 - 1; local62++) {
					arg7.method6912(local34[local62 * 2], local34[local62 * 2 + 1], local34[(local62 + 1) * 2], local34[local62 * 2 + 3], local10.anIntArray222[local10.aByteArray52[local62] & 0xFF], arg4, arg5, arg3);
				}
				arg7.method6912(local34[local34.length - 2], local34[local34.length - 1], local34[0], local34[1], local10.anIntArray222[local10.aByteArray52[local10.aByteArray52.length - 1] & 0xFF], arg4, arg5, arg3);
			}
		}
		@Pc(512) Class45 local512 = null;
		if (local10.anInt4322 != -1) {
			local512 = local10.method3805(arg7, false);
			if (local512 != null) {
				Static23.method336(arg3, arg2, arg6, arg4, arg0, local512, arg5);
			}
		}
		if (local10.aString43 == null) {
			return;
		}
		local36 = 0;
		if (local512 != null) {
			local36 = local512.method7501();
		}
		@Pc(548) Class68 local548 = Static474.aClass68_9;
		@Pc(550) Class350 local550 = Static343.aClass350_4;
		if (local10.anInt4318 == 1) {
			local550 = Static372.aClass350_5;
			local548 = Static446.aClass68_8;
		}
		if (local10.anInt4318 == 2) {
			local550 = Static497.aClass350_9;
			local548 = Static255.aClass68_4;
		}
		Static571.method8153(local550, local10.anInt4291, arg6, local36, arg0, local548, local10.aString43, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(II)V")
	public static void method2368(@OriginalArg(0) int arg0) {
		Static674.anInt11000 = arg0;
		Static605.aClass317_37.method7873();
	}
}
