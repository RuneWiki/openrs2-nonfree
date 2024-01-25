import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static472 {

	@OriginalMember(owner = "client!ru", name = "d", descriptor = "Lclient!q;")
	public static Class11 aClass11_6;

	@OriginalMember(owner = "client!ru", name = "r", descriptor = "I")
	public static int anInt7818;

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "[I")
	public static final int[] anIntArray499 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

	@OriginalMember(owner = "client!ru", name = "j", descriptor = "Z")
	public static boolean aBoolean612 = false;

	@OriginalMember(owner = "client!ru", name = "q", descriptor = "Z")
	public static boolean aBoolean613 = true;

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(BLclient!np;)Lclient!aea;")
	public static Class9 method6504(@OriginalArg(1) Class3_Sub11 arg0) {
		@Pc(7) int local7 = arg0.method5198();
		@Pc(14) Class63 local14 = Static407.method5865()[arg0.method5175()];
		@Pc(21) Class249 local21 = Static448.method7373()[arg0.method5175()];
		@Pc(30) int local30 = arg0.method5231();
		@Pc(34) int local34 = arg0.method5231();
		return new Class9(local7, local14, local21, local30, local34);
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(IIIIIBI)V")
	public static void method6505(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		Static384.method5687(arg0);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg0 - arg3;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(29) int local29 = arg0;
		@Pc(32) int local32 = -arg0;
		@Pc(34) int local34 = local15;
		@Pc(37) int local37 = -local15;
		@Pc(39) int local39 = -1;
		@Pc(66) int local66;
		@Pc(74) int local74;
		@Pc(82) int local82;
		@Pc(91) int local91;
		if (arg4 >= Static395.anInt6904 && Static561.anInt2703 >= arg4) {
			@Pc(57) int[] local57 = Static158.anIntArrayArray66[arg4];
			local66 = Static554.method7333(Static469.anInt4270, Static325.anInt5516, arg1 - arg0);
			local74 = Static554.method7333(Static469.anInt4270, Static325.anInt5516, arg1 + arg0);
			local82 = Static554.method7333(Static469.anInt4270, Static325.anInt5516, arg1 - local15);
			local91 = Static554.method7333(Static469.anInt4270, Static325.anInt5516, arg1 + local15);
			Static583.method7816(local57, arg2, local66, local82);
			Static583.method7816(local57, arg5, local82, local91);
			Static583.method7816(local57, arg2, local91, local74);
		}
		@Pc(111) int local111 = -1;
		while (local10 < local29) {
			local39 += 2;
			local111 += 2;
			local32 += local39;
			local37 += local111;
			if (local37 >= 0 && local34 >= 1) {
				local34--;
				Static11.anIntArray13[local34] = local10;
				local37 -= local34 << 1;
			}
			local10++;
			@Pc(255) int local255;
			@Pc(264) int local264;
			@Pc(271) int[] local271;
			@Pc(160) int local160;
			if (local32 >= 0) {
				local29--;
				local32 -= local29 << 1;
				local160 = arg4 - local29;
				local66 = arg4 + local29;
				if (local66 >= Static395.anInt6904 && local160 <= Static561.anInt2703) {
					if (local15 <= local29) {
						local74 = Static554.method7333(Static469.anInt4270, Static325.anInt5516, local10 + arg1);
						local82 = Static554.method7333(Static469.anInt4270, Static325.anInt5516, arg1 - local10);
						if (Static561.anInt2703 >= local66) {
							Static583.method7816(Static158.anIntArrayArray66[local66], arg2, local82, local74);
						}
						if (Static395.anInt6904 <= local160) {
							Static583.method7816(Static158.anIntArrayArray66[local160], arg2, local82, local74);
						}
					} else {
						local74 = Static11.anIntArray13[local29];
						local82 = Static554.method7333(Static469.anInt4270, Static325.anInt5516, local10 + arg1);
						local91 = Static554.method7333(Static469.anInt4270, Static325.anInt5516, arg1 - local10);
						local255 = Static554.method7333(Static469.anInt4270, Static325.anInt5516, local74 + arg1);
						local264 = Static554.method7333(Static469.anInt4270, Static325.anInt5516, arg1 - local74);
						if (local66 <= Static561.anInt2703) {
							local271 = Static158.anIntArrayArray66[local66];
							Static583.method7816(local271, arg2, local91, local264);
							Static583.method7816(local271, arg5, local264, local255);
							Static583.method7816(local271, arg2, local255, local82);
						}
						if (local160 >= Static395.anInt6904) {
							local271 = Static158.anIntArrayArray66[local160];
							Static583.method7816(local271, arg2, local91, local264);
							Static583.method7816(local271, arg5, local264, local255);
							Static583.method7816(local271, arg2, local255, local82);
						}
					}
				}
			}
			local160 = arg4 - local10;
			local66 = local10 + arg4;
			if (local66 >= Static395.anInt6904 && Static561.anInt2703 >= local160) {
				local74 = local29 + arg1;
				local82 = arg1 - local29;
				if (Static469.anInt4270 <= local74 && local82 <= Static325.anInt5516) {
					local74 = Static554.method7333(Static469.anInt4270, Static325.anInt5516, local74);
					local82 = Static554.method7333(Static469.anInt4270, Static325.anInt5516, local82);
					if (local10 >= local15) {
						if (local66 <= Static561.anInt2703) {
							Static583.method7816(Static158.anIntArrayArray66[local66], arg2, local82, local74);
						}
						if (local160 >= Static395.anInt6904) {
							Static583.method7816(Static158.anIntArrayArray66[local160], arg2, local82, local74);
						}
					} else {
						local91 = local34 < local10 ? Static11.anIntArray13[local10] : local34;
						local255 = Static554.method7333(Static469.anInt4270, Static325.anInt5516, local91 + arg1);
						local264 = Static554.method7333(Static469.anInt4270, Static325.anInt5516, arg1 - local91);
						if (local66 <= Static561.anInt2703) {
							local271 = Static158.anIntArrayArray66[local66];
							Static583.method7816(local271, arg2, local82, local264);
							Static583.method7816(local271, arg5, local264, local255);
							Static583.method7816(local271, arg2, local255, local74);
						}
						if (Static395.anInt6904 <= local160) {
							local271 = Static158.anIntArrayArray66[local160];
							Static583.method7816(local271, arg2, local82, local264);
							Static583.method7816(local271, arg5, local264, local255);
							Static583.method7816(local271, arg2, local255, local74);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(IILjava/lang/String;IIIILclient!ho;Lclient!wp;Lclient!la;Lclient!ua;I)V")
	public static void method6507(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class134 arg6, @OriginalArg(8) Class361 arg7, @OriginalArg(9) Class54 arg8, @OriginalArg(10) Class81 arg9, @OriginalArg(11) int arg10) {
		@Pc(13) int local13;
		if (Static379.anInt6482 == 4) {
			local13 = (int) Static43.aFloat20 & 0x3FFF;
		} else {
			local13 = Static244.anInt4328 + (int) Static43.aFloat20 & 0x3FFF;
		}
		@Pc(34) int local34 = Math.max(arg7.anInt9668 / 2, arg7.anInt9650 / 2) + 10;
		@Pc(50) int local50 = arg2 * arg2 + arg3 * arg3;
		if (local50 > local34 * local34) {
			return;
		}
		@Pc(60) int local60 = Class356.anIntArray597[local13];
		@Pc(64) int local64 = Class356.anIntArray598[local13];
		if (Static379.anInt6482 != 4) {
			local64 = local64 * 256 / (Static41.anInt765 + 256);
			local60 = local60 * 256 / (Static41.anInt765 + 256);
		}
		@Pc(95) int local95 = arg2 * local60 + arg3 * local64 >> 14;
		@Pc(106) int local106 = arg2 * local64 - local60 * arg3 >> 14;
		@Pc(113) int local113 = arg6.method3355(arg1, null, 100);
		@Pc(121) int local121 = arg6.method3351(100, 0, arg1, null);
		@Pc(127) int local127 = local95 - local113 / 2;
		if (local127 >= -arg7.anInt9668 && arg7.anInt9668 >= local127 && -arg7.anInt9650 <= local106 && arg7.anInt9650 >= local106) {
			arg8.method7790(null, arg9, arg5, 1, 0, local113, arg7.anInt9650 / 2 + arg5 - local121 - local106 - arg0, 50, 0, 0, arg4, local127 + arg10 + arg7.anInt9668 / 2, arg1, arg10, null);
		}
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(I)V")
	public static void method6508() {
		if (Static9.aClass8_3 != null) {
			Static9.aClass8_3.method5524();
		}
		if (Static241.aClass8_2 != null) {
			Static241.aClass8_2.method5524();
		}
	}
}
