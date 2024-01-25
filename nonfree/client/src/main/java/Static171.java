import java.awt.Container;
import java.awt.Insets;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!kn", name = "c", descriptor = "Lclient!ir;")
	public static Class100 aClass100_73;

	@OriginalMember(owner = "client!kn", name = "i", descriptor = "I")
	public static int anInt3583;

	@OriginalMember(owner = "client!kn", name = "m", descriptor = "I")
	public static int anInt3586;

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIIIIBII)V")
	public static void method2835(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static149.method2419(arg3)) {
			Static47.method831(Static311.aClass181ArrayArray1[arg3], -1, arg2, arg6, arg5, arg1, arg4, arg0);
		}
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(ZIII)I")
	public static int method2836(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class3_Sub43 local12 = (Class3_Sub43) Static24.aClass24_29.method609((long) arg2);
		if (local12 == null) {
			return 0;
		}
		@Pc(23) int local23 = 0;
		for (@Pc(25) int local25 = 0; local25 < local12.anIntArray560.length; local25++) {
			if (local12.anIntArray560[local25] >= 0 && Static106.anInt2240 > local12.anIntArray560[local25]) {
				@Pc(45) Class41 local45 = Static230.method5537(local12.anIntArray560[local25]);
				@Pc(54) int local54 = local45.method926(arg1, Static11.method177(arg1).anInt808);
				if (arg0) {
					local23 += local12.anIntArray559[local25] * local54;
				} else {
					local23 += local54;
				}
			}
		}
		return local23;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(ILclient!da;)V")
	public static void method2837(@OriginalArg(0) int arg0, @OriginalArg(1) Class22 arg1) {
		Static69.aClass22Array1[arg0] = arg1;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(IZIIII)V")
	public static void method2839(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1) {
			Static340.method5565();
		}
		if (Static67.aFrame1 != null && (arg2 != 3 || arg3 != Static175.anInt3635 || Static321.anInt6220 != arg4)) {
			Static296.method5022(Static67.aFrame1, Static353.aClass42_5);
			Static67.aFrame1 = null;
		}
		if (arg2 == 3 && Static67.aFrame1 == null) {
			Static67.aFrame1 = Static277.method4641(Static353.aClass42_5, arg3, arg4, 0);
			if (Static67.aFrame1 != null) {
				Static175.anInt3635 = arg3;
				Static321.anInt6220 = arg4;
				Static261.method4409(Static353.aClass42_5);
			}
		}
		if (arg2 == 3 && Static67.aFrame1 == null) {
			method2839(arg0, true, Static37.anInt6452, -1, -1);
			return;
		}
		@Pc(71) Container local71;
		@Pc(82) Insets local82;
		if (Static67.aFrame1 != null) {
			local71 = Static67.aFrame1;
			Static56.anInt1236 = arg3;
			Static165.anInt3205 = arg4;
		} else if (Static176.aFrame4 == null) {
			local71 = Static353.aClass42_5.anApplet1;
			Static56.anInt1236 = local71.getSize().width;
			Static165.anInt3205 = local71.getSize().height;
		} else {
			local82 = Static176.aFrame4.getInsets();
			Static56.anInt1236 = Static176.aFrame4.getSize().width - local82.right - local82.left;
			@Pc(102) int local102 = local82.bottom + local82.top;
			Static165.anInt3205 = Static176.aFrame4.getSize().height - local102;
			local71 = Static176.aFrame4;
		}
		@Pc(151) int local151;
		if (arg2 == 1) {
			anInt3583 = 503;
			Static264.anInt5293 = 0;
			Static298.anInt5944 = 765;
			Static34.anInt781 = (Static56.anInt1236 - 765) / 2;
		} else if (Static26.anInt699 < 96 && Static352.anInt6827 == 0) {
			local151 = Static56.anInt1236 <= 1024 ? Static56.anInt1236 : 1024;
			Static34.anInt781 = (Static56.anInt1236 - local151) / 2;
			Static298.anInt5944 = local151;
			@Pc(167) int local167 = Static165.anInt3205 <= 768 ? Static165.anInt3205 : 768;
			Static264.anInt5293 = 0;
			anInt3583 = local167;
		} else {
			Static264.anInt5293 = 0;
			Static34.anInt781 = 0;
			Static298.anInt5944 = Static56.anInt1236;
			anInt3583 = Static165.anInt3205;
		}
		if (Static113.anInt6411 != 0) {
			@Pc(201) boolean local201;
			if (Static298.anInt5944 < 1024 && anInt3583 < 768) {
				local201 = true;
			} else {
				local201 = false;
			}
		}
		if (arg1) {
			Static276.method4628(Static352.anInt6827);
		} else {
			Static295.aCanvas4.setSize(Static298.anInt5944, anInt3583);
			if (Static212.aClass122_2 != null) {
				Static212.aClass122_2.method4802();
			}
			if (Static176.aFrame4 == local71) {
				local82 = Static176.aFrame4.getInsets();
				Static295.aCanvas4.setLocation(Static34.anInt781 + local82.left, local82.top - -Static264.anInt5293);
			} else {
				Static295.aCanvas4.setLocation(Static34.anInt781, Static264.anInt5293);
			}
		}
		if (arg2 >= 2) {
			Static327.aBoolean429 = true;
		} else {
			Static327.aBoolean429 = false;
		}
		if (Static191.anInt3991 != -1) {
			Static30.method596(true);
		}
		if (Static76.aClass16_2 != null && (Static266.anInt5370 == 30 || Static266.anInt5370 == 25)) {
			Static227.method3951();
		}
		for (local151 = 0; local151 < 100; local151++) {
			Static159.aBooleanArray13[local151] = true;
		}
		Static266.aBoolean335 = true;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIII)V")
	public static void method2841(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class45 local7 = Static256.aClass45ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class5_Sub1 local13 = local7.aClass5_Sub1_1;
		@Pc(16) Class5_Sub1 local16 = local7.aClass5_Sub1_2;
		if (local13 != null) {
			local13.anInt3101 = local13.anInt3101 * arg3 / 16;
			local13.anInt3099 = local13.anInt3099 * arg3 / 16;
		}
		if (local16 != null) {
			local16.anInt3101 = local16.anInt3101 * arg3 / 16;
			local16.anInt3099 = local16.anInt3099 * arg3 / 16;
		}
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(IBIII)V")
	public static void method2843(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(15) int local15 = 0; local15 < Static312.anInt6281; local15++) {
			@Pc(21) Rectangle local21 = Class3.aRectangleArray122[local15];
			if (arg3 < local21.width + local21.x && arg1 + arg3 > local21.x && arg2 < local21.height + local21.y && local21.y < arg0 + arg2) {
				Static159.aBooleanArray13[local15] = true;
			}
		}
	}

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "(I)V")
	public static void method2844() {
		Static8.method153();
		Static58.aClass184ArrayArray1 = null;
		Static235.aClass122_9 = null;
		Static228.aClass113_2 = null;
		Static295.aClass113_4 = null;
		Static112.aClass113_1 = null;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(Lclient!tj;IIILclient!bd;Lclient!w;)Z")
	public static boolean method2845(@OriginalArg(0) Class122 arg0, @OriginalArg(4) Class3_Sub5 arg1, @OriginalArg(5) Class211 arg2) {
		@Pc(7) int local7 = Integer.MAX_VALUE;
		@Pc(9) int local9 = Integer.MIN_VALUE;
		@Pc(11) int local11 = Integer.MAX_VALUE;
		@Pc(13) int local13 = Integer.MIN_VALUE;
		if (arg2.anIntArray555 != null) {
			local9 = (Static193.anInt2355 - Static193.anInt2350) * (arg2.anInt6620 + arg1.anInt545 - Static193.anInt2346) / (Static193.anInt2348 - Static193.anInt2346) + Static193.anInt2350;
			local7 = Static193.anInt2350 + (arg2.anInt6586 + arg1.anInt545 - Static193.anInt2346) * (Static193.anInt2355 - Static193.anInt2350) / (Static193.anInt2348 - Static193.anInt2346);
			local13 = Static193.anInt2353 - (arg2.anInt6587 + arg1.anInt548 - Static193.anInt2351) * (-Static193.anInt2356 + Static193.anInt2353) / (Static193.anInt2352 - Static193.anInt2351);
			local11 = Static193.anInt2353 - (arg1.anInt548 + arg2.anInt6615 - Static193.anInt2351) * (Static193.anInt2353 - Static193.anInt2356) / (Static193.anInt2352 - Static193.anInt2351);
		}
		@Pc(101) Class57 local101 = null;
		@Pc(103) int local103 = 0;
		@Pc(105) int local105 = 0;
		@Pc(107) int local107 = 0;
		@Pc(109) int local109 = 0;
		if (arg2.anInt6612 != -1) {
			if (arg1.aBoolean28 && arg2.anInt6610 != -1) {
				local101 = arg2.method5567(true, arg0);
			} else {
				local101 = arg2.method5567(false, arg0);
			}
			if (local101 != null) {
				local103 = arg1.anInt541 - (local101.method5433() + 1 >> 1);
				if (local7 > local103) {
					local7 = local103;
				}
				local105 = arg1.anInt541 + (local101.method5433() + 1 >> 1);
				local107 = arg1.anInt551 - (local101.method5441() + 1 >> 1);
				if (local9 < local105) {
					local9 = local105;
				}
				if (local11 > local107) {
					local11 = local107;
				}
				local109 = arg1.anInt551 + (local101.method5441() + 1 >> 1);
				if (local109 > local13) {
					local13 = local109;
				}
			}
		}
		@Pc(210) Class201 local210 = null;
		@Pc(212) int local212 = 0;
		@Pc(214) int local214 = 0;
		@Pc(216) int local216 = 0;
		@Pc(218) int local218 = 0;
		@Pc(220) int local220 = 0;
		@Pc(222) int local222 = 0;
		@Pc(224) int local224 = 0;
		@Pc(273) int local273;
		@Pc(300) int local300;
		if (arg2.aString250 != null) {
			local210 = Static311.method5224(arg2.anInt6593);
			if (local210 != null) {
				local212 = Static82.aClass209_1.method5505(null, arg2.aString250, Static290.aStringArray39, null);
				local214 = arg1.anInt551;
				if (local101 == null) {
					local214 -= local212 * local210.method5259() / 2;
				} else {
					local214 -= (local101.method5441() >> 1) + local210.method5263() * local212;
				}
				for (local273 = 0; local273 < local212; local273++) {
					@Pc(279) String local279 = Static290.aStringArray39[local273];
					if (local212 - 1 > local273) {
						local279 = local279.substring(0, local279.length() - 4);
					}
					local300 = local210.method5260(local279);
					if (local216 < local300) {
						local216 = local300;
					}
				}
				local218 = arg1.anInt541 - local216 / 2;
				if (local7 > local218) {
					local7 = local218;
				}
				local220 = local216 / 2 + arg1.anInt541;
				if (local220 > local9) {
					local9 = local220;
				}
				local222 = local214;
				local224 = local212 * local210.method5263() + local214;
				if (local222 < local11) {
					local11 = local222;
				}
				if (local224 > local13) {
					local13 = local224;
				}
			}
		}
		if (Static193.anInt2350 > local9 || Static193.anInt2355 < local7 || Static193.anInt2356 > local13 || Static193.anInt2353 < local11) {
			return true;
		}
		@Pc(406) int local406;
		if (arg2.anIntArray555 != null) {
			@Pc(404) int[] local404 = new int[arg2.anIntArray555.length];
			for (local406 = 0; local406 < local404.length / 2; local406++) {
				local300 = arg2.anIntArray555[local406 * 2] + arg1.anInt545;
				@Pc(430) int local430 = arg1.anInt548 + arg2.anIntArray555[local406 * 2 + 1];
				local404[local406 * 2] = Static193.anInt2350 + (Static193.anInt2355 - Static193.anInt2350) * (-Static193.anInt2346 + local300) / (Static193.anInt2348 - Static193.anInt2346);
				local404[local406 * 2 + 1] = Static193.anInt2353 - (Static193.anInt2353 - Static193.anInt2356) * (-Static193.anInt2351 + local430) / (Static193.anInt2352 - Static193.anInt2351);
			}
			Static326.method5325(arg0, local404, arg2.anInt6606);
			for (local300 = 0; local300 < local404.length / 2 - 1; local300++) {
				arg0.method4793(local404[local300 * 2 + 2], local404[local300 * 2 + 1 + 2], local404[local300 * 2], local404[local300 * 2 + 1], arg2.anInt6611);
			}
			arg0.method4793(local404[0], local404[1], local404[local404.length - 2], local404[local404.length - 1], arg2.anInt6611);
		}
		if (local101 != null) {
			if (Static13.anInt346 > 0 && (Static276.anInt5510 != -1 && arg1.anInt544 == Static276.anInt5510 || Static309.anInt6134 != -1 && Static309.anInt6134 == arg2.anInt6589)) {
				if (Static277.anInt5533 <= 50) {
					local273 = Static277.anInt5533 * 2;
				} else {
					local273 = (100 - Static277.anInt5533) * 2;
				}
				local406 = local273 << 24 | 0xFFFF00;
				arg0.method4724(arg1.anInt541, arg1.anInt551, local101.method5440() / 2 + 7, local406);
				arg0.method4724(arg1.anInt541, arg1.anInt551, local101.method5440() / 2 + 5, local406);
				arg0.method4724(arg1.anInt541, arg1.anInt551, local101.method5440() / 2 + 3, local406);
				arg0.method4724(arg1.anInt541, arg1.anInt551, local101.method5440() / 2 + 1, local406);
				arg0.method4724(arg1.anInt541, arg1.anInt551, local101.method5440() / 2, local406);
			}
			local101.method5448(arg1.anInt541 - (local101.method5433() >> 1), arg1.anInt551 - (local101.method5441() >> 1));
		}
		if (arg2.aString250 != null && local210 != null) {
			Static292.method4972(local214, local212, arg1, local216, local210, arg2, arg0);
		}
		if (arg2.anInt6612 != -1 || arg2.aString250 != null) {
			@Pc(716) Class3_Sub14 local716 = new Class3_Sub14(arg1);
			local716.anInt1446 = local105;
			local716.anInt1448 = local220;
			local716.anInt1443 = local109;
			local716.anInt1445 = local224;
			local716.anInt1434 = local218;
			local716.anInt1438 = local103;
			local716.anInt1440 = local107;
			local716.anInt1437 = local222;
			Static293.aClass127_40.method3387(local716);
		}
		return false;
	}
}
