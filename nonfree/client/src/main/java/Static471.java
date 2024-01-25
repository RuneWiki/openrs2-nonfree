import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static471 {

	@OriginalMember(owner = "client!qp", name = "O", descriptor = "Lclient!is;")
	public static Class166 aClass166_1;

	@OriginalMember(owner = "client!qp", name = "P", descriptor = "I")
	public static int anInt8063;

	@OriginalMember(owner = "client!qp", name = "Q", descriptor = "I")
	public static int anInt8064;

	@OriginalMember(owner = "client!qp", name = "S", descriptor = "I")
	public static int anInt8065;

	@OriginalMember(owner = "client!qp", name = "T", descriptor = "I")
	public static int anInt8066;

	@OriginalMember(owner = "client!qp", name = "L", descriptor = "Lclient!kr;")
	public static final Class194 aClass194_257 = new Class194(114, 2);

	@OriginalMember(owner = "client!qp", name = "R", descriptor = "Z")
	public static boolean aBoolean575 = false;

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(ILclient!ha;Lclient!jo;IILclient!to;)Z")
	public static boolean method6965(@OriginalArg(1) Class82 arg0, @OriginalArg(2) Class179 arg1, @OriginalArg(5) Class3_Sub47 arg2) {
		@Pc(7) int local7 = Integer.MAX_VALUE;
		@Pc(9) int local9 = Integer.MIN_VALUE;
		@Pc(11) int local11 = Integer.MAX_VALUE;
		@Pc(13) int local13 = Integer.MIN_VALUE;
		if (arg1.anIntArray294 != null) {
			local7 = Static598.anInt2999 + (Static598.anInt2996 - Static598.anInt2999) * (arg1.anInt5338 + arg2.anInt9168 - Static598.anInt3001) / (Static598.anInt2993 - Static598.anInt3001);
			local13 = Static598.anInt2991 - (arg1.anInt5337 + arg2.anInt9165 - Static598.anInt2990) * (-Static598.anInt3000 + Static598.anInt2991) / (Static598.anInt2997 - Static598.anInt2990);
			local9 = Static598.anInt2999 + (arg1.anInt5333 + arg2.anInt9168 - Static598.anInt3001) * (Static598.anInt2996 + -Static598.anInt2999) / (Static598.anInt2993 - Static598.anInt3001);
			local11 = Static598.anInt2991 - (Static598.anInt2991 - Static598.anInt3000) * (arg2.anInt9165 + arg1.anInt5345 + -Static598.anInt2990) / (Static598.anInt2997 - Static598.anInt2990);
		}
		@Pc(104) Class103 local104 = null;
		@Pc(106) int local106 = 0;
		@Pc(108) int local108 = 0;
		@Pc(110) int local110 = 0;
		@Pc(112) int local112 = 0;
		if (arg1.anInt5340 != -1) {
			if (arg2.aBoolean678 && arg1.anInt5318 != -1) {
				local104 = arg1.method4533(arg0, true);
			} else {
				local104 = arg1.method4533(arg0, false);
			}
			if (local104 != null) {
				local106 = arg2.anInt9166 - (local104.method7454() + 1 >> 1);
				local108 = arg2.anInt9166 + (local104.method7454() + 1 >> 1);
				if (local106 < local7) {
					local7 = local106;
				}
				if (local108 > local9) {
					local9 = local108;
				}
				local110 = arg2.anInt9167 - (local104.method7451() + 1 >> 1);
				local112 = arg2.anInt9167 + (local104.method7451() + 1 >> 1);
				if (local11 > local110) {
					local11 = local110;
				}
				if (local13 < local112) {
					local13 = local112;
				}
			}
		}
		@Pc(212) Class61 local212 = null;
		@Pc(214) int local214 = 0;
		@Pc(216) int local216 = 0;
		@Pc(218) int local218 = 0;
		@Pc(220) int local220 = 0;
		@Pc(222) int local222 = 0;
		@Pc(224) int local224 = 0;
		@Pc(226) int local226 = 0;
		@Pc(228) int local228 = 0;
		@Pc(308) int local308;
		if (arg1.aString42 != null) {
			local212 = Static179.method2953(arg1.anInt5332);
			if (local212 != null) {
				local214 = Static323.aClass93_7.method2311(arg1.aString42, Static282.aStringArray42, (Class103[]) null, (int[]) null);
				local216 = arg2.anInt9166 + arg1.anInt5339 * (Static598.anInt2996 - Static598.anInt2999) / (Static598.anInt2993 - Static598.anInt3001);
				local218 = arg2.anInt9167 - arg1.anInt5343 * (Static598.anInt2991 - Static598.anInt3000) / (Static598.anInt2997 - Static598.anInt2990);
				if (local104 == null) {
					local218 -= local214 * local212.method1410() / 2;
				} else {
					local218 -= (local104.method7451() >> 1) + (local212.method1409() * local214);
				}
				for (local308 = 0; local308 < local214; local308++) {
					@Pc(314) String local314 = Static282.aStringArray42[local308];
					if (local308 < local214 - 1) {
						local314 = local314.substring(0, local314.length() - 4);
					}
					@Pc(335) int local335 = local212.method1411(local314);
					if (local335 > local220) {
						local220 = local335;
					}
				}
				local222 = local216 - local220 / 2;
				local224 = local220 / 2 + local216;
				if (local222 < local7) {
					local7 = local222;
				}
				local226 = local218;
				if (local224 > local9) {
					local9 = local224;
				}
				local228 = local214 * local212.method1409() + local218;
				if (local11 > local226) {
					local11 = local226;
				}
				if (local228 > local13) {
					local13 = local228;
				}
			}
		}
		if (local9 < Static598.anInt2999 || local7 > Static598.anInt2996 || Static598.anInt3000 > local13 || local11 > Static598.anInt2991) {
			return true;
		}
		Static598.method2530(arg0, arg2, arg1);
		if (local104 != null) {
			if (Static476.anInt8998 > 0 && (Static475.anInt8130 != -1 && arg2.anInt9169 == Static475.anInt8130 || Static464.anInt7910 != -1 && Static464.anInt7910 == arg1.anInt5334)) {
				if (Static156.anInt3180 <= 50) {
					local308 = Static156.anInt3180 * 2;
				} else {
					local308 = 200 - Static156.anInt3180 * 2;
				}
				@Pc(486) int local486 = local308 << 24 | 0xFFFF00;
				arg0.method6151(local104.method7445() / 2 + 7, arg2.anInt9167, arg2.anInt9166, local486);
				arg0.method6151(local104.method7445() / 2 + 5, arg2.anInt9167, arg2.anInt9166, local486);
				arg0.method6151(local104.method7445() / 2 + 3, arg2.anInt9167, arg2.anInt9166, local486);
				arg0.method6151(local104.method7445() / 2 + 1, arg2.anInt9167, arg2.anInt9166, local486);
				arg0.method6151(local104.method7445() / 2, arg2.anInt9167, arg2.anInt9166, local486);
			}
			local104.method7462(arg2.anInt9166 - (local104.method7454() >> 1), arg2.anInt9167 - (local104.method7451() >> 1));
		}
		if (arg1.aString42 != null && local212 != null) {
			Static260.method4362(local214, arg0, local220, arg1, local216, arg2, local212, local218);
		}
		if (arg1.anInt5340 != -1 || arg1.aString42 != null) {
			@Pc(601) Class3_Sub49 local601 = new Class3_Sub49(arg2);
			local601.anInt9420 = local108;
			local601.anInt9437 = local112;
			local601.anInt9422 = local106;
			local601.anInt9429 = local226;
			local601.anInt9432 = local228;
			local601.anInt9424 = local224;
			local601.anInt9427 = local222;
			local601.anInt9428 = local110;
			Static181.aClass216_30.method5449(local601);
		}
		return false;
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(ZIILclient!uu;IZ)V")
	public static void method6966(@OriginalArg(2) int arg0, @OriginalArg(3) Class343 arg1, @OriginalArg(4) int arg2) {
		Static602.method8298(arg0, arg2, arg1, 0L);
	}

	@OriginalMember(owner = "client!qp", name = "c", descriptor = "(III)Z")
	public static boolean method6967(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(Lclient!cea;Z)I")
	public static int method6968(@OriginalArg(0) Class9_Sub2_Sub1_Sub2_Sub1 arg0) {
		@Pc(19) int local19 = arg0.anInt1312;
		@Pc(23) Class176 local23 = arg0.method8633();
		if (arg0.anInt10211 == -1 || arg0.aBoolean773) {
			local19 = arg0.anInt1322;
		} else if (arg0.anInt10211 == local23.anInt5222 || arg0.anInt10211 == local23.anInt5188 || arg0.anInt10211 == local23.anInt5204 || arg0.anInt10211 == local23.anInt5217) {
			local19 = arg0.anInt1286;
		} else if (local23.anInt5210 == arg0.anInt10211 || arg0.anInt10211 == local23.anInt5218 || local23.anInt5221 == arg0.anInt10211 || local23.anInt5223 == arg0.anInt10211) {
			local19 = arg0.anInt1319;
		}
		return local19;
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(IBI)Z")
	public static boolean method6969(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0xC580) != 0;
	}
}
