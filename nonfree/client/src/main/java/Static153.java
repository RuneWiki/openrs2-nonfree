import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!fo", name = "p", descriptor = "F")
	public static float aFloat87;

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(I)V")
	public static void method2892() {
		Static204.aClass347Array1 = new Class347[50];
		Static5.anInt118 = 0;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(BI)V")
	public static void method2893(@OriginalArg(1) int arg0) {
		if (arg0 != -1 && Static414.aBooleanArray22[arg0]) {
			Static527.aClass322_143.method6824(arg0);
			Static380.aClass361ArrayArray2[arg0] = null;
			Static259.aClass361ArrayArray1[arg0] = null;
			Static414.aBooleanArray22[arg0] = false;
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(IIIIII[B[BI)V")
	public static void method2894(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) byte[] arg5, @OriginalArg(7) byte[] arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg2 >> 2);
		@Pc(15) int local15 = -(arg2 & 0x3);
		for (@Pc(18) int local18 = -arg3; local18 < 0; local18++) {
			@Pc(26) int local26;
			for (@Pc(22) int local22 = local10; local22 < 0; local22++) {
				local26 = arg1++;
				arg5[local26] = (byte) (arg5[local26] - arg6[arg0++]);
				@Pc(39) int local39 = arg1++;
				arg5[local39] = (byte) (arg5[local39] - arg6[arg0++]);
				@Pc(52) int local52 = arg1++;
				arg5[local52] = (byte) (arg5[local52] - arg6[arg0++]);
				@Pc(65) int local65 = arg1++;
				arg5[local65] = (byte) (arg5[local65] - arg6[arg0++]);
			}
			for (@Pc(84) int local84 = local15; local84 < 0; local84++) {
				local26 = arg1++;
				arg5[local26] = (byte) (arg5[local26] - arg6[arg0++]);
			}
			arg0 += arg7;
			arg1 += arg4;
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "([BZ)Ljava/lang/String;")
	public static String method2895(@OriginalArg(0) byte[] arg0) {
		return Static468.method6473(0, arg0, arg0.length);
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(IILclient!wl;Lclient!kca;Lclient!r;I)Z")
	public static boolean method2896(@OriginalArg(2) Class3_Sub51 arg0, @OriginalArg(3) Class174 arg1, @OriginalArg(4) Class45 arg2) {
		@Pc(7) int local7 = Integer.MAX_VALUE;
		@Pc(9) int local9 = Integer.MIN_VALUE;
		@Pc(11) int local11 = Integer.MAX_VALUE;
		@Pc(13) int local13 = Integer.MIN_VALUE;
		if (arg1.anIntArray257 != null) {
			local9 = Static44.anInt9267 + (arg0.anInt9434 + arg1.anInt4765 - Static44.anInt9268) * (Static44.anInt9265 - Static44.anInt9267) / (Static44.anInt9264 - Static44.anInt9268);
			local13 = Static44.anInt9259 - (Static44.anInt9259 - Static44.anInt9260) * (arg0.anInt9427 + arg1.anInt4786 - Static44.anInt9266) / (Static44.anInt9262 - Static44.anInt9266);
			local11 = Static44.anInt9259 - (arg0.anInt9427 + arg1.anInt4770 - Static44.anInt9266) * (Static44.anInt9259 + -Static44.anInt9260) / (Static44.anInt9262 - Static44.anInt9266);
			local7 = (arg1.anInt4766 + arg0.anInt9434 - Static44.anInt9268) * (Static44.anInt9265 - Static44.anInt9267) / (Static44.anInt9264 - Static44.anInt9268) + Static44.anInt9267;
		}
		@Pc(102) Class14 local102 = null;
		@Pc(104) int local104 = 0;
		@Pc(106) int local106 = 0;
		@Pc(108) int local108 = 0;
		@Pc(110) int local110 = 0;
		if (arg1.anInt4772 != -1) {
			if (arg0.aBoolean732 && arg1.anInt4783 != -1) {
				local102 = arg1.method4118(true, arg2);
			} else {
				local102 = arg1.method4118(false, arg2);
			}
			if (local102 != null) {
				local104 = arg0.anInt9424 - (local102.A() + 1 >> 1);
				if (local104 < local7) {
					local7 = local104;
				}
				local106 = arg0.anInt9424 + (local102.A() + 1 >> 1);
				if (local106 > local9) {
					local9 = local106;
				}
				local108 = arg0.anInt9428 - (local102.ca() + 1 >> 1);
				if (local11 > local108) {
					local11 = local108;
				}
				local110 = arg0.anInt9428 + (local102.ca() + 1 >> 1);
				if (local110 > local13) {
					local13 = local110;
				}
			}
		}
		@Pc(214) Class96 local214 = null;
		@Pc(216) int local216 = 0;
		@Pc(218) int local218 = 0;
		@Pc(220) int local220 = 0;
		@Pc(222) int local222 = 0;
		@Pc(224) int local224 = 0;
		@Pc(226) int local226 = 0;
		@Pc(228) int local228 = 0;
		@Pc(278) int local278;
		@Pc(305) int local305;
		if (arg1.aString30 != null) {
			local214 = Static560.method7565(arg1.anInt4787);
			if (local214 != null) {
				local216 = Static2.aClass134_1.method3350(null, null, arg1.aString30, Static295.aStringArray19);
				local218 = arg0.anInt9428;
				if (local102 == null) {
					local218 -= local214.method2809() * local216 / 2;
				} else {
					local218 -= (local102.ca() >> 1) + (local214.method2810() * local216);
				}
				for (local278 = 0; local278 < local216; local278++) {
					@Pc(284) String local284 = Static295.aStringArray19[local278];
					if (local278 < local216 - 1) {
						local284 = local284.substring(0, local284.length() - 4);
					}
					local305 = local214.method2812(local284);
					if (local305 > local220) {
						local220 = local305;
					}
				}
				local222 = arg0.anInt9424 - local220 / 2;
				local224 = local220 / 2 + arg0.anInt9424;
				if (local7 > local222) {
					local7 = local222;
				}
				local226 = local218;
				if (local224 > local9) {
					local9 = local224;
				}
				if (local11 > local226) {
					local11 = local226;
				}
				local228 = local218 + local214.method2810() * local216;
				if (local13 < local228) {
					local13 = local228;
				}
			}
		}
		if (Static44.anInt9267 > local9 || Static44.anInt9265 < local7 || local13 < Static44.anInt9260 || local11 > Static44.anInt9259) {
			return true;
		}
		@Pc(418) int local418;
		if (arg1.anIntArray257 != null) {
			@Pc(416) int[] local416 = new int[arg1.anIntArray257.length];
			for (local418 = 0; local418 < local416.length / 2; local418++) {
				local305 = arg1.anIntArray257[local418 * 2] + arg0.anInt9434;
				@Pc(444) int local444 = arg1.anIntArray257[local418 * 2 + 1] + arg0.anInt9427;
				local416[local418 * 2] = (local305 - Static44.anInt9268) * (Static44.anInt9265 - Static44.anInt9267) / (Static44.anInt9264 - Static44.anInt9268) + Static44.anInt9267;
				local416[local418 * 2 + 1] = Static44.anInt9259 - (local444 - Static44.anInt9266) * (-Static44.anInt9260 + Static44.anInt9259) / (Static44.anInt9262 - Static44.anInt9266);
			}
			Static197.method3305(arg2, local416, arg1.anInt4758);
			for (local305 = 0; local305 < local416.length / 2 - 1; local305++) {
				arg2.method7388(local416[(local305 + 1) * 2], local416[local305 * 2 + 1], arg1.anInt4776, local416[local305 * 2], local416[(local305 + 1) * 2 + 1]);
			}
			arg2.method7388(local416[0], local416[local416.length - 1], arg1.anInt4776, local416[local416.length - 2], local416[1]);
		}
		if (local102 != null) {
			if (Static555.anInt8826 > 0 && (Static58.anInt1270 != -1 && Static58.anInt1270 == arg0.anInt9426 || Static65.anInt1511 != -1 && arg1.anInt4760 == Static65.anInt1511)) {
				if (Static369.anInt6362 > 50) {
					local278 = 200 - Static369.anInt6362 * 2;
				} else {
					local278 = Static369.anInt6362 * 2;
				}
				local418 = local278 << 24 | 0xFFFF00;
				arg2.method7412(arg0.anInt9424, local102.E() / 2 + 7, local418, arg0.anInt9428);
				arg2.method7412(arg0.anInt9424, local102.E() / 2 + 5, local418, arg0.anInt9428);
				arg2.method7412(arg0.anInt9424, local102.E() / 2 + 3, local418, arg0.anInt9428);
				arg2.method7412(arg0.anInt9424, local102.E() / 2 + 1, local418, arg0.anInt9428);
				arg2.method7412(arg0.anInt9424, local102.E() / 2, local418, arg0.anInt9428);
			}
			local102.method7680(arg0.anInt9424 - (local102.A() >> 1), arg0.anInt9428 - (local102.ca() >> 1));
		}
		if (arg1.aString30 != null && local214 != null) {
			Static140.method2714(arg0, local220, arg1, arg2, local218, local214, local216);
		}
		if (arg1.anInt4772 != -1 || arg1.aString30 != null) {
			@Pc(731) Class3_Sub14 local731 = new Class3_Sub14(arg0);
			local731.anInt2093 = local104;
			local731.anInt2088 = local224;
			local731.anInt2089 = local106;
			local731.anInt2091 = local226;
			local731.anInt2094 = local228;
			local731.anInt2085 = local222;
			local731.anInt2084 = local108;
			local731.anInt2087 = local110;
			Static565.aClass112_71.method3079(local731);
		}
		return false;
	}
}
