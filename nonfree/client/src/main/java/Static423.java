import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static423 {

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "Lclient!wf;")
	public static Class196 aClass196_1;

	@OriginalMember(owner = "client!qp", name = "d", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray18;

	@OriginalMember(owner = "client!qp", name = "b", descriptor = "I")
	public static int anInt7841 = 0;

	@OriginalMember(owner = "client!qp", name = "c", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray8 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(II)V")
	public static void method6545() {
		@Pc(6) Class245 local6 = Static551.aClass245_66;
		synchronized (Static551.aClass245_66) {
			Static551.aClass245_66.method6083(5);
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(ILclient!hk;Lclient!oa;Lclient!bv;II)Z")
	public static boolean method6546(@OriginalArg(1) Class137 arg0, @OriginalArg(2) Class9 arg1, @OriginalArg(3) Class6_Sub7 arg2) {
		@Pc(7) int local7 = Integer.MAX_VALUE;
		@Pc(9) int local9 = Integer.MIN_VALUE;
		@Pc(11) int local11 = Integer.MAX_VALUE;
		@Pc(13) int local13 = Integer.MIN_VALUE;
		if (arg0.anIntArray278 != null) {
			local13 = Static461.anInt55 - (arg2.anInt1366 + arg0.anInt4309 - Static461.anInt54) * (-Static461.anInt56 + Static461.anInt55) / (Static461.anInt59 - Static461.anInt54);
			local9 = Static461.anInt51 + (arg2.anInt1361 + arg0.anInt4325 - Static461.anInt60) * (Static461.anInt61 - Static461.anInt51) / (Static461.anInt50 - Static461.anInt60);
			local11 = Static461.anInt55 - (arg0.anInt4337 + arg2.anInt1366 - Static461.anInt54) * (-Static461.anInt56 + Static461.anInt55) / (Static461.anInt59 - Static461.anInt54);
			local7 = (arg2.anInt1361 + arg0.anInt4315 - Static461.anInt60) * (Static461.anInt61 - Static461.anInt51) / (Static461.anInt50 - Static461.anInt60) + Static461.anInt51;
		}
		@Pc(105) Class66 local105 = null;
		@Pc(107) int local107 = 0;
		@Pc(109) int local109 = 0;
		@Pc(111) int local111 = 0;
		@Pc(113) int local113 = 0;
		if (arg0.anInt4328 != -1) {
			if (arg2.aBoolean146 && arg0.anInt4307 != -1) {
				local105 = arg0.method3764(true, arg1);
			} else {
				local105 = arg0.method3764(false, arg1);
			}
			if (local105 != null) {
				local107 = arg2.anInt1367 - (local105.AA() + 1 >> 1);
				local109 = arg2.anInt1367 + (local105.AA() + 1 >> 1);
				if (local7 > local107) {
					local7 = local107;
				}
				local111 = arg2.anInt1364 - (local105.a() + 1 >> 1);
				if (local109 > local9) {
					local9 = local109;
				}
				if (local111 < local11) {
					local11 = local111;
				}
				local113 = arg2.anInt1364 + (local105.a() + 1 >> 1);
				if (local13 < local113) {
					local13 = local113;
				}
			}
		}
		@Pc(214) Class269 local214 = null;
		@Pc(216) int local216 = 0;
		@Pc(218) int local218 = 0;
		@Pc(220) int local220 = 0;
		@Pc(222) int local222 = 0;
		@Pc(224) int local224 = 0;
		@Pc(231) int local231 = 0;
		@Pc(233) int local233 = 0;
		@Pc(283) int local283;
		@Pc(310) int local310;
		if (arg0.aString46 != null) {
			local214 = Static508.method7547(arg0.anInt4313);
			if (local214 != null) {
				local216 = Static309.aClass82_6.method2291(arg0.aString46, null, Static175.aStringArray21, null);
				local218 = arg2.anInt1364;
				if (local105 == null) {
					local218 -= local216 * local214.method6549() / 2;
				} else {
					local218 -= (local105.a() >> 1) + (local216 * local214.method6548());
				}
				for (local283 = 0; local283 < local216; local283++) {
					@Pc(289) String local289 = Static175.aStringArray21[local283];
					if (local216 - 1 > local283) {
						local289 = local289.substring(0, local289.length() - 4);
					}
					local310 = local214.method6552(local289);
					if (local220 < local310) {
						local220 = local310;
					}
				}
				local222 = arg2.anInt1367 - local220 / 2;
				if (local7 > local222) {
					local7 = local222;
				}
				local224 = arg2.anInt1367 + local220 / 2;
				local231 = local218;
				if (local9 < local224) {
					local9 = local224;
				}
				if (local231 < local11) {
					local11 = local231;
				}
				local233 = local218 + local216 * local214.method6548();
				if (local233 > local13) {
					local13 = local233;
				}
			}
		}
		if (Static461.anInt51 > local9 || local7 > Static461.anInt61 || Static461.anInt56 > local13 || Static461.anInt55 < local11) {
			return true;
		}
		@Pc(412) int local412;
		if (arg0.anIntArray278 != null) {
			@Pc(410) int[] local410 = new int[arg0.anIntArray278.length];
			for (local412 = 0; local412 < local410.length / 2; local412++) {
				local310 = arg2.anInt1361 + arg0.anIntArray278[local412 * 2];
				@Pc(436) int local436 = arg2.anInt1366 + arg0.anIntArray278[local412 * 2 + 1];
				local410[local412 * 2] = Static461.anInt51 + (local310 - Static461.anInt60) * (-Static461.anInt51 + Static461.anInt61) / (Static461.anInt50 - Static461.anInt60);
				local410[local412 * 2 + 1] = Static461.anInt55 - (local436 - Static461.anInt54) * (-Static461.anInt56 + Static461.anInt55) / (Static461.anInt59 - Static461.anInt54);
			}
			Static182.method3580(arg1, local410, arg0.anInt4329);
			for (local310 = 0; local310 < local410.length / 2 - 1; local310++) {
				arg1.method5434(arg0.anInt4310, local410[local310 * 2 + 2], local410[local310 * 2], local410[(local310 + 1) * 2 + 1], local410[local310 * 2 + 1]);
			}
			arg1.method5434(arg0.anInt4310, local410[0], local410[local410.length - 2], local410[1], local410[local410.length - 1]);
		}
		if (local105 != null) {
			if (Static137.anInt2914 > 0 && (Static221.anInt4650 != -1 && arg2.anInt1365 == Static221.anInt4650 || Static339.anInt6292 != -1 && arg0.anInt4326 == Static339.anInt6292)) {
				if (Static447.anInt8208 <= 50) {
					local283 = Static447.anInt8208 * 2;
				} else {
					local283 = (100 - Static447.anInt8208) * 2;
				}
				local412 = local283 << 24 | 0xFFFF00;
				arg1.method5425(arg2.anInt1367, local412, local105.QA() / 2 + 7, arg2.anInt1364);
				arg1.method5425(arg2.anInt1367, local412, local105.QA() / 2 + 5, arg2.anInt1364);
				arg1.method5425(arg2.anInt1367, local412, local105.QA() / 2 + 3, arg2.anInt1364);
				arg1.method5425(arg2.anInt1367, local412, local105.QA() / 2 + 1, arg2.anInt1364);
				arg1.method5425(arg2.anInt1367, local412, local105.QA() / 2, arg2.anInt1364);
			}
			local105.method8066(arg2.anInt1367 - (local105.AA() >> 1), arg2.anInt1364 + -(local105.a() >> 1));
		}
		if (arg0.aString46 != null && local214 != null) {
			Static498.method7459(arg0, local214, arg1, local216, local220, arg2, local218);
		}
		if (arg0.anInt4328 != -1 || arg0.aString46 != null) {
			@Pc(725) Class6_Sub22 local725 = new Class6_Sub22(arg2);
			local725.anInt3917 = local111;
			local725.anInt3911 = local224;
			local725.anInt3919 = local107;
			local725.anInt3913 = local233;
			local725.anInt3924 = local222;
			local725.anInt3921 = local231;
			local725.anInt3914 = local109;
			local725.anInt3916 = local113;
			Static305.aClass211_44.method5173(local725);
		}
		return false;
	}
}
