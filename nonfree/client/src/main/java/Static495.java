import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static495 {

	@OriginalMember(owner = "client!sw", name = "o", descriptor = "Z")
	public static boolean aBoolean622 = false;

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(Lclient!lk;B)Ljava/lang/String;")
	public static String method6684(@OriginalArg(0) Class203 arg0) {
		if (Static69.method1651(arg0).method571() == 0) {
			return null;
		} else if (arg0.aString73 == null || arg0.aString73.trim().length() == 0) {
			return Static393.aBoolean543 ? "Hidden-use" : null;
		} else {
			return arg0.aString73;
		}
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(ILclient!ea;IIBI)V")
	public static void method6685(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub17 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg1.anInt2498 == -1 && arg1.anIntArray176 == null) {
			return;
		}
		@Pc(20) int local20 = 0;
		@Pc(28) int local28 = Static278.aClass3_Sub13_Sub1_1.anInt5139 * arg1.anInt2499 >> 8;
		if (arg4 > arg1.anInt2490) {
			local20 = arg4 - arg1.anInt2490;
		} else if (arg1.anInt2500 > arg4) {
			local20 = arg1.anInt2500 - arg4;
		}
		if (arg0 > arg1.anInt2489) {
			local20 += arg0 - arg1.anInt2489;
		} else if (arg0 < arg1.anInt2497) {
			local20 += arg1.anInt2497 - arg0;
		}
		if (arg1.anInt2493 == 0 || arg1.anInt2493 < local20 - 256 || Static278.aClass3_Sub13_Sub1_1.anInt5139 == 0 || arg1.anInt2487 != arg2) {
			if (arg1.aClass3_Sub6_Sub2_2 != null) {
				Static164.aClass3_Sub6_Sub1_1.method291(arg1.aClass3_Sub6_Sub2_2);
				arg1.aClass3_Sub6_Sub2_2 = null;
				arg1.aClass3_Sub20_Sub1_3 = null;
				arg1.aClass3_Sub36_1 = null;
			}
			if (arg1.aClass3_Sub6_Sub2_3 != null) {
				Static164.aClass3_Sub6_Sub1_1.method291(arg1.aClass3_Sub6_Sub2_3);
				arg1.aClass3_Sub6_Sub2_3 = null;
				arg1.aClass3_Sub36_2 = null;
				arg1.aClass3_Sub20_Sub1_2 = null;
			}
			return;
		}
		local20 -= 256;
		if (local20 < 0) {
			local20 = 0;
		}
		@Pc(163) int local163 = local28 * (arg1.anInt2493 - local20) / arg1.anInt2493;
		@Pc(239) Class3_Sub6_Sub2 local239;
		if (arg1.aClass3_Sub6_Sub2_2 != null) {
			arg1.aClass3_Sub6_Sub2_2.method1586(local163);
		} else if (arg1.anInt2498 >= 0) {
			if (arg1.aBoolean205) {
				if (arg1.aClass3_Sub36_1 == null) {
					arg1.aClass3_Sub36_1 = Static362.method5453(Static437.aClass246_205, arg1.anInt2498);
				}
				if (arg1.aClass3_Sub36_1 != null) {
					if (arg1.aClass3_Sub20_Sub1_3 == null) {
						arg1.aClass3_Sub20_Sub1_3 = arg1.aClass3_Sub36_1.method5442(new int[] { 22050 });
					}
					if (arg1.aClass3_Sub20_Sub1_3 != null) {
						local239 = Static598.method1588(arg1.aClass3_Sub20_Sub1_3, local163);
						local239.method1582(-1);
						Static164.aClass3_Sub6_Sub1_1.method285(local239);
						arg1.aClass3_Sub6_Sub2_2 = local239;
					}
				}
			} else {
				@Pc(181) Class358 local181 = Static607.method7640(Static35.aClass246_28, arg1.anInt2498, 0);
				if (local181 != null) {
					@Pc(188) Class3_Sub20_Sub1 local188 = local181.method7641().method2362(Static568.aClass154_1);
					@Pc(193) Class3_Sub6_Sub2 local193 = Static598.method1588(local188, local163);
					local193.method1582(-1);
					Static164.aClass3_Sub6_Sub1_1.method285(local193);
					arg1.aClass3_Sub6_Sub2_2 = local193;
				}
			}
		}
		if (arg1.aClass3_Sub6_Sub2_3 != null) {
			arg1.aClass3_Sub6_Sub2_3.method1586(local163);
			if (arg1.aClass3_Sub6_Sub2_3.method7813()) {
				return;
			}
			arg1.aClass3_Sub20_Sub1_2 = null;
			arg1.aClass3_Sub36_2 = null;
			arg1.aClass3_Sub6_Sub2_3 = null;
		} else if (arg1.anIntArray176 != null && (arg1.anInt2494 -= arg3) <= 0) {
			@Pc(285) int local285;
			if (arg1.aBoolean204) {
				if (arg1.aClass3_Sub36_2 == null) {
					local285 = (int) (Math.random() * (double) arg1.anIntArray176.length);
					arg1.aClass3_Sub36_2 = Static362.method5453(Static437.aClass246_205, arg1.anIntArray176[local285]);
				}
				if (arg1.aClass3_Sub36_2 != null) {
					if (arg1.aClass3_Sub20_Sub1_2 == null) {
						arg1.aClass3_Sub20_Sub1_2 = arg1.aClass3_Sub36_2.method5442(new int[] { 22050 });
					}
					if (arg1.aClass3_Sub20_Sub1_2 != null) {
						local239 = Static598.method1588(arg1.aClass3_Sub20_Sub1_2, local163);
						local239.method1582(0);
						Static164.aClass3_Sub6_Sub1_1.method285(local239);
						arg1.anInt2494 = arg1.anInt2496 + (int) ((double) (arg1.anInt2491 - arg1.anInt2496) * Math.random());
						arg1.aClass3_Sub6_Sub2_3 = local239;
						return;
					}
				}
				return;
			}
			local285 = (int) (Math.random() * (double) arg1.anIntArray176.length);
			@Pc(361) Class358 local361 = Static607.method7640(Static35.aClass246_28, arg1.anIntArray176[local285], 0);
			if (local361 != null) {
				@Pc(368) Class3_Sub20_Sub1 local368 = local361.method7641().method2362(Static568.aClass154_1);
				@Pc(373) Class3_Sub6_Sub2 local373 = Static598.method1588(local368, local163);
				local373.method1582(0);
				Static164.aClass3_Sub6_Sub1_1.method285(local373);
				arg1.aClass3_Sub6_Sub2_3 = local373;
				arg1.anInt2494 = arg1.anInt2496 + (int) (Math.random() * (double) (arg1.anInt2491 - arg1.anInt2496));
				return;
			}
		}
	}
}
