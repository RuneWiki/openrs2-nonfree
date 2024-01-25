import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static254 {

	@OriginalMember(owner = "client!qh", name = "Q", descriptor = "I")
	public static int anInt5036;

	@OriginalMember(owner = "client!qh", name = "I", descriptor = "Lclient!m;")
	public static Class127 aClass127_26 = new Class127();

	@OriginalMember(owner = "client!qh", name = "O", descriptor = "[Lclient!kg;")
	public static final Class5_Sub4_Sub4_Sub1[] aClass5_Sub4_Sub4_Sub1Array1 = new Class5_Sub4_Sub4_Sub1[2048];

	@OriginalMember(owner = "client!qh", name = "P", descriptor = "Lclient!m;")
	public static final Class127 aClass127_27 = new Class127();

	@OriginalMember(owner = "client!qh", name = "R", descriptor = "Z")
	public static boolean aBoolean288 = false;

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lclient!sj;III)V")
	public static void method4264(@OriginalArg(0) Class181 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg0.aByte65 == 0) {
			arg0.anInt5687 = arg0.anInt5740;
		} else if (arg0.aByte65 == 1) {
			arg0.anInt5687 = arg0.anInt5740 + (arg1 - arg0.anInt5704) / 2;
		} else if (arg0.aByte65 == 2) {
			arg0.anInt5687 = arg1 - arg0.anInt5740 - arg0.anInt5704;
		} else if (arg0.aByte65 == 3) {
			arg0.anInt5687 = arg0.anInt5740 * arg1 >> 14;
		} else if (arg0.aByte65 == 4) {
			arg0.anInt5687 = (arg0.anInt5740 * arg1 >> 14) + (arg1 - arg0.anInt5704) / 2;
		} else {
			arg0.anInt5687 = arg1 - (arg1 * arg0.anInt5740 >> 14) - arg0.anInt5704;
		}
		if (arg0.aByte66 == 0) {
			arg0.anInt5690 = arg0.anInt5691;
		} else if (arg0.aByte66 == 1) {
			arg0.anInt5690 = (arg2 - arg0.anInt5721) / 2 + arg0.anInt5691;
		} else if (arg0.aByte66 == 2) {
			arg0.anInt5690 = arg2 - arg0.anInt5691 - arg0.anInt5721;
		} else if (arg0.aByte66 == 3) {
			arg0.anInt5690 = arg2 * arg0.anInt5691 >> 14;
		} else if (arg0.aByte66 == 4) {
			arg0.anInt5690 = (arg0.anInt5691 * arg2 >> 14) + (arg2 - arg0.anInt5721) / 2;
		} else {
			arg0.anInt5690 = arg2 - (arg2 * arg0.anInt5691 >> 14) - arg0.anInt5721;
		}
		if (!Static212.aBoolean98) {
			return;
		}
		if (Static47.method819(arg0).anInt1455 == 0 && arg0.anInt5715 != 0) {
			return;
		}
		if (arg0.anInt5690 < 0) {
			arg0.anInt5690 = 0;
		} else if (arg0.anInt5721 + arg0.anInt5690 > arg2) {
			arg0.anInt5690 = arg2 - arg0.anInt5721;
		}
		if (arg0.anInt5687 < 0) {
			arg0.anInt5687 = 0;
			return;
		}
		if (arg1 < arg0.anInt5704 + arg0.anInt5687) {
			arg0.anInt5687 = arg1 - arg0.anInt5704;
			return;
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "()V")
	public static void method4266() {
		for (@Pc(1) int local1 = 0; local1 < Static321.anInt6217; local1++) {
			if (!Static33.aBooleanArray4[local1]) {
				@Pc(10) Class3_Sub13_Sub1 local10 = Static13.aClass3_Sub13_Sub1Array3[local1];
				@Pc(13) int local13 = local10.anInt6672;
				@Pc(18) int local18 = local10.anInt6661 - 64;
				@Pc(26) int local26 = (local18 * 2 >> 7) + 1;
				@Pc(28) int local28 = 0;
				@Pc(33) int[] local33 = new int[local26 * local26];
				@Pc(40) int local40 = local10.anInt6662 - local18 >> 7;
				@Pc(47) int local47 = local10.anInt6666 - local18 >> 7;
				@Pc(54) int local54 = local10.anInt6666 + local18 >> 7;
				if (local47 < 0) {
					local28 = -local47;
					local47 = 0;
				}
				if (local54 >= Static116.anInt2499) {
					local54 = Static116.anInt2499 - 1;
				}
				for (@Pc(71) int local71 = local47; local71 <= local54; local71++) {
					@Pc(77) short local77 = local10.aShortArray112[local28];
					@Pc(81) int local81 = local77 >>> 8;
					@Pc(87) int local87 = local28 * local26 + local81;
					@Pc(93) int local93 = local40 + (local77 >>> 8);
					@Pc(101) int local101 = local93 + (local77 & 0xFF) - 1;
					if (local93 < 0) {
						local87 -= local93;
						local93 = 0;
					}
					if (local101 >= Static103.anInt2156) {
						local101 = Static103.anInt2156 - 1;
					}
					for (@Pc(118) int local118 = local93; local118 <= local101; local118++) {
						@Pc(121) byte local121 = 1;
						@Pc(134) Class5_Sub4 local134 = Static134.method2239(local13, local118, local71, ro.class);
						if (local134 != null && local134.aByte68 != 0) {
							@Pc(152) boolean local152;
							@Pc(161) boolean local161;
							@Pc(175) short local175;
							@Pc(181) int local181;
							@Pc(187) int local187;
							if (local134.aByte68 == 1) {
								local152 = local118 - 1 >= local93;
								local161 = local118 + 1 <= local101;
								if (!local152 && local71 + 1 <= local54) {
									local175 = local10.aShortArray112[local28 + 1];
									local181 = local40 + (local175 >>> 8);
									local187 = local181 + (local175 & 0xFF);
									local152 = local118 > local181 && local118 < local187;
								}
								if (!local161 && local71 - 1 >= local47) {
									local175 = local10.aShortArray112[local28 - 1];
									local181 = local40 + (local175 >>> 8);
									local187 = local181 + (local175 & 0xFF);
									local161 = local118 > local181 && local118 < local187;
								}
								if (local152 && !local161) {
									local121 = 4;
								} else if (local161 && !local152) {
									local121 = 2;
								}
							} else {
								local152 = local118 - 1 >= local93;
								local161 = local118 + 1 <= local101;
								if (!local152 && local71 - 1 >= local47) {
									local175 = local10.aShortArray112[local28 - 1];
									local181 = local40 + (local175 >>> 8);
									local187 = local181 + (local175 & 0xFF);
									local152 = local118 > local181 && local118 < local187;
								}
								if (!local161 && local71 + 1 <= local54) {
									local175 = local10.aShortArray112[local28 + 1];
									local181 = local40 + (local175 >>> 8);
									local187 = local181 + (local175 & 0xFF);
									local161 = local118 > local181 && local118 < local187;
								}
								if (local152 && !local161) {
									local121 = 3;
								} else if (local161 && !local152) {
									local121 = 5;
								}
							}
						}
						local33[local87++] = local121;
					}
					local28++;
				}
				Static33.aBooleanArray4[local1] = true;
				Static69.aClass22Array1[local13].method4680(local10, local33);
			}
		}
	}
}
