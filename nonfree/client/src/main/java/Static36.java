import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!cd", name = "i", descriptor = "Lclient!hq;")
	public static Class94 aClass94_9;

	@OriginalMember(owner = "client!cd", name = "j", descriptor = "Lclient!rk;")
	public static Class180 aClass180_9;

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "[I")
	public static final int[] anIntArray152 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!cd", name = "d", descriptor = "[C")
	public static final char[] aCharArray1 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "client!cd", name = "g", descriptor = "Z")
	public static volatile boolean aBoolean79 = false;

	@OriginalMember(owner = "client!cd", name = "k", descriptor = "Ljava/lang/String;")
	public static final String aString81 = "glow2:";

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILclient!tj;Lclient!oo;Lclient!pe;II)Z")
	public static boolean method826(@OriginalArg(1) Class7_Sub37 arg0, @OriginalArg(2) Class155 arg1, @OriginalArg(3) Class89 arg2) {
		@Pc(5) int local5 = Integer.MAX_VALUE;
		@Pc(7) int local7 = Integer.MIN_VALUE;
		@Pc(9) int local9 = Integer.MAX_VALUE;
		@Pc(16) int local16 = Integer.MIN_VALUE;
		if (arg1.anIntArray625 != null) {
			local16 = Static306.anInt3323 - (Static306.anInt3323 - Static306.anInt3328) * (arg0.anInt5840 + arg1.anInt4667 - Static306.anInt3320) / (Static306.anInt3324 - Static306.anInt3320);
			local7 = (Static306.anInt3321 - Static306.anInt3322) * (arg1.anInt4690 + arg0.anInt5844 - Static306.anInt3331) / (Static306.anInt3330 - Static306.anInt3331) + Static306.anInt3322;
			local5 = (arg0.anInt5844 + arg1.anInt4676 - Static306.anInt3331) * (Static306.anInt3321 - Static306.anInt3322) / (Static306.anInt3330 - Static306.anInt3331) + Static306.anInt3322;
			local9 = Static306.anInt3323 - (Static306.anInt3323 - Static306.anInt3328) * (arg1.anInt4684 + (arg0.anInt5840 - Static306.anInt3320)) / (Static306.anInt3324 - Static306.anInt3320);
		}
		@Pc(104) Class52 local104 = null;
		@Pc(106) int local106 = 0;
		@Pc(108) int local108 = 0;
		@Pc(110) int local110 = 0;
		@Pc(112) int local112 = 0;
		if (arg1.anInt4673 != -1) {
			if (arg0.aBoolean426 && arg1.anInt4671 != -1) {
				local104 = arg1.method4080(arg2, true);
			} else {
				local104 = arg1.method4080(arg2, false);
			}
			if (local104 != null) {
				local106 = arg0.anInt5842 - (local104.method4141() + 1 >> 1);
				local108 = arg0.anInt5842 + (local104.method4141() + 1 >> 1);
				if (local5 > local106) {
					local5 = local106;
				}
				local110 = arg0.anInt5836 - (local104.method4140() + 1 >> 1);
				if (local108 > local7) {
					local7 = local108;
				}
				local112 = arg0.anInt5836 + (local104.method4140() + 1 >> 1);
				if (local9 > local110) {
					local9 = local110;
				}
				if (local16 < local112) {
					local16 = local112;
				}
			}
		}
		@Pc(214) Class4 local214 = null;
		@Pc(216) int local216 = 0;
		@Pc(218) int local218 = 0;
		@Pc(220) int local220 = 0;
		@Pc(222) int local222 = 0;
		@Pc(224) int local224 = 0;
		@Pc(226) int local226 = 0;
		@Pc(228) int local228 = 0;
		@Pc(277) int local277;
		@Pc(299) int local299;
		if (arg1.aString294 != null) {
			local214 = Static34.method720(arg1.anInt4663);
			if (local214 != null) {
				local216 = Static226.aClass208_6.method5373(arg1.aString294, Static96.aStringArray25, null, null);
				local218 = arg0.anInt5836;
				if (local104 == null) {
					local218 -= local214.method54() * local216 / 2;
				} else {
					local218 -= (local104.method4140() >> 1) + (local214.method52() * local216);
				}
				for (local277 = 0; local277 < local216; local277++) {
					@Pc(282) String local282 = Static96.aStringArray25[local277];
					if (local216 - 1 > local277) {
						local282 = local282.substring(0, local282.length() - 4);
					}
					local299 = local214.method56(local282);
					if (local220 < local299) {
						local220 = local299;
					}
				}
				local222 = arg0.anInt5842 - local220 / 2;
				if (local5 > local222) {
					local5 = local222;
				}
				local224 = arg0.anInt5842 + local220 / 2;
				local226 = local218;
				if (local7 < local224) {
					local7 = local224;
				}
				local228 = local218 + local216 * local214.method52();
				if (local9 > local226) {
					local9 = local226;
				}
				if (local228 > local16) {
					local16 = local228;
				}
			}
		}
		if (local7 < Static306.anInt3322 || Static306.anInt3321 < local5 || local16 < Static306.anInt3328 || local9 > Static306.anInt3323) {
			return true;
		}
		@Pc(408) int local408;
		if (arg1.anIntArray625 != null) {
			@Pc(406) int[] local406 = new int[arg1.anIntArray625.length];
			for (local408 = 0; local408 < local406.length / 2; local408++) {
				local299 = arg0.anInt5844 + arg1.anIntArray625[local408 * 2];
				@Pc(431) int local431 = arg0.anInt5840 + arg1.anIntArray625[local408 * 2 + 1];
				local406[local408 * 2] = Static306.anInt3322 + (Static306.anInt3321 - Static306.anInt3322) * (local299 - Static306.anInt3331) / (Static306.anInt3330 - Static306.anInt3331);
				local406[local408 * 2 + 1] = Static306.anInt3323 - (local431 - Static306.anInt3320) * (-Static306.anInt3328 + Static306.anInt3323) / (Static306.anInt3324 - Static306.anInt3320);
			}
			Static167.method3191(arg2, local406, arg1.anInt4674);
			for (local299 = 0; local299 < local406.length / 2 - 1; local299++) {
				arg2.method5398(local406[local299 * 2], local406[local299 * 2 + 2 + 1], local406[(local299 + 1) * 2], arg1.anInt4669, local406[local299 * 2 + 1]);
			}
			arg2.method5398(local406[local406.length - 2], local406[1], local406[0], arg1.anInt4669, local406[local406.length - 1]);
		}
		if (local104 != null) {
			if (Static242.anInt3402 > 0 && (Static268.anInt5281 != -1 && Static268.anInt5281 == arg0.anInt5839 || Static100.anInt2435 != -1 && arg1.anInt4683 == Static100.anInt2435)) {
				if (Static320.anInt6132 > 50) {
					local277 = (100 - Static320.anInt6132) * 2;
				} else {
					local277 = Static320.anInt6132 * 2;
				}
				local408 = local277 << 24 | 0xFFFF00;
				arg2.method5403(local408, local104.method4124() / 2 + 7, arg0.anInt5836, arg0.anInt5842);
				arg2.method5403(local408, local104.method4124() / 2 + 5, arg0.anInt5836, arg0.anInt5842);
				arg2.method5403(local408, local104.method4124() / 2 + 3, arg0.anInt5836, arg0.anInt5842);
				arg2.method5403(local408, local104.method4124() / 2 + 1, arg0.anInt5836, arg0.anInt5842);
				arg2.method5403(local408, local104.method4124() / 2, arg0.anInt5836, arg0.anInt5842);
			}
			local104.method4123(arg0.anInt5842 - (local104.method4141() >> 1), arg0.anInt5836 - (local104.method4140() >> 1));
		}
		if (arg1.aString294 != null && local214 != null) {
			Static307.method4978(local218, arg2, local216, local214, arg0, arg1, local220);
		}
		if (arg1.anInt4673 != -1 || arg1.aString294 != null) {
			@Pc(717) Class7_Sub2 local717 = new Class7_Sub2(arg0);
			local717.anInt165 = local106;
			local717.anInt164 = local224;
			local717.anInt170 = local222;
			local717.anInt173 = local226;
			local717.anInt174 = local110;
			local717.anInt166 = local108;
			local717.anInt167 = local112;
			local717.anInt168 = local228;
			Static10.aClass74_2.method1802(local717);
		}
		return false;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(BII)V")
	public static void method829(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static29.aClass7_Sub3_Sub2_1.method2799(196);
		Static29.aClass7_Sub3_Sub2_1.method2733(arg1);
		Static29.aClass7_Sub3_Sub2_1.method2785(arg0);
	}
}
