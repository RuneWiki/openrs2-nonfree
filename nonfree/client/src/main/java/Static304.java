import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static304 {

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "I")
	public static int anInt5996 = 0;

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "Lclient!l;")
	public static Class98 aClass98_46 = new Class98(64);

	@OriginalMember(owner = "client!wa", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString227 = "shake:";

	@OriginalMember(owner = "client!wa", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString228 = "Take";

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(ILclient!ec;Lclient!vo;)V")
	public static void method4910(@OriginalArg(1) Class40 arg0, @OriginalArg(2) Class3_Sub4_Sub23 arg1) {
		@Pc(9) Class81_Sub2 local9 = arg0.method982();
		if (local9 == null) {
			return;
		}
		@Pc(16) int local16 = local9.anInt2797;
		@Pc(19) int local19 = arg1.anInt5967;
		if (local9.anInt2797 < local9.anInt2796) {
			local16 = local9.anInt2796;
		}
		@Pc(34) int local34 = arg1.anInt5969;
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(40) int local40 = 0;
		@Pc(53) int local53;
		@Pc(81) int local81;
		if (arg0.aString48 != null) {
			local36 = Static25.aClass3_Sub4_Sub2_4.method3687(arg0.aString48, null, Static75.aStringArray14);
			for (local53 = 0; local53 < local36; local53++) {
				@Pc(64) String local64 = Static75.aStringArray14[local53];
				if (local53 < local36 - 1) {
					local64 = local64.substring(0, local64.length() - 4);
				}
				local81 = Static301.aClass78_8.method1880(local64);
				if (local81 > local38) {
					local38 = local81;
				}
			}
			local40 = (local36 - 1) * Static301.aClass78_8.method1882() + Static301.aClass78_8.method1889() / 2;
		}
		local53 = arg1.anInt5967;
		if (Static228.anInt1443 + local16 > local19) {
			local53 = local16 / 2 + Static228.anInt1443 + local16 + local38 / 2 + 5;
			local19 = Static228.anInt1443 + local16;
		} else if (Static228.anInt1441 - local16 < local19) {
			local19 = Static228.anInt1441 - local16;
			local53 = Static228.anInt1441 - local16 - local16 / 2 - local38 / 2 - 5;
		}
		@Pc(176) int local176 = arg1.anInt5969 - local40 / 2;
		if (local34 < local16 + Static228.anInt1439) {
			local34 = local16 + Static228.anInt1439;
			local176 = local16 / 2 + local16 + Static228.anInt1439 + Static301.aClass78_8.method1882();
		} else if (Static228.anInt1438 - local16 < local34) {
			local34 = Static228.anInt1438 - local16;
			local176 = Static228.anInt1438 - local16 / 2 - local16 - local40;
		}
		local16 >>= 0x1;
		@Pc(237) int local237 = -2;
		@Pc(239) int local239 = -2;
		local81 = (int) (Math.atan2((double) (local19 - arg1.anInt5967), (double) (local34 - arg1.anInt5969)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		@Pc(262) int local262 = -2;
		local9.method2507(local9.anInt2802 << 3, local9.anInt2795 << 3, local16 + (local19 << 4), (local34 << 4) - -local16, local81);
		@Pc(287) int local287 = -2;
		if (arg0.aString48 != null) {
			local287 = local176 - Static301.aClass78_8.method1889() - 3;
			local237 = local53 - local38 / 2 - 5;
			local239 = local237 + local38 + 10;
			local262 = local287 + local36 * Static301.aClass78_8.method1882();
			if (arg0.anInt1146 != 0) {
				Static143.method2452(local237, local287, local239 - local237, -local287 + local262, arg0.anInt1146, arg0.anInt1146 >>> 24);
			}
			if (arg0.anInt1158 != 0) {
				Static143.method2445(local237, local287, local239 - local237, local262 + -local287, arg0.anInt1158, arg0.anInt1158 >>> 24);
			}
			for (@Pc(370) int local370 = 0; local370 < local36; local370++) {
				@Pc(377) String local377 = Static75.aStringArray14[local370];
				if (local36 - 1 > local370) {
					local377 = local377.substring(0, local377.length() - 4);
				}
				Static301.aClass78_8.method1883(local377, local53, local176, arg0.anInt1173);
				local176 += Static301.aClass78_8.method1882();
			}
		}
		if ((local19 - local16 >= Static167.anInt3153 || Static167.anInt3153 >= local16 + local19 || Static153.anInt2892 <= local34 - local16 || local34 + local16 <= Static153.anInt2892) && (Static167.anInt3153 <= local237 || local239 <= Static167.anInt3153 || local287 >= Static153.anInt2892 || Static153.anInt2892 >= local262)) {
			return;
		}
		if (arg0.aStringArray11[4] != null) {
			Static167.method2784((short) 1005, arg0.aString49, 0, -1, arg0.aStringArray11[4], (long) arg1.anInt5971, 0);
		}
		if (arg0.aStringArray11[3] != null) {
			Static167.method2784((short) 1003, arg0.aString49, 0, -1, arg0.aStringArray11[3], (long) arg1.anInt5971, 0);
		}
		if (arg0.aStringArray11[2] != null) {
			Static167.method2784((short) 1002, arg0.aString49, 0, -1, arg0.aStringArray11[2], (long) arg1.anInt5971, 0);
		}
		if (arg0.aStringArray11[1] != null) {
			Static167.method2784((short) 1004, arg0.aString49, 0, -1, arg0.aStringArray11[1], (long) arg1.anInt5971, 0);
		}
		if (arg0.aStringArray11[0] != null) {
			Static167.method2784((short) 1008, arg0.aString49, 0, -1, arg0.aStringArray11[0], (long) arg1.anInt5971, 0);
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Z)V")
	public static void method4911() {
		Static175.aClass98_26.method2572();
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lclient!jn;Lclient!qa;[[F[I[[I[[FBIII[[F)V")
	public static void method4912(@OriginalArg(0) Class90 arg0, @OriginalArg(1) Class142 arg1, @OriginalArg(2) float[][] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[][] arg4, @OriginalArg(5) float[][] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) float[][] arg9) {
		@Pc(11) int[] local11 = new int[arg3.length / 2];
		for (@Pc(21) int local21 = 0; local21 < local11.length; local21++) {
			@Pc(35) int local35 = arg3[local21 + local21];
			@Pc(43) int local43 = arg3[local21 + local21 + 1];
			@Pc(50) int local50;
			if (arg6 == 1) {
				local50 = local35;
				local35 = local43;
				local43 = 128 - local50;
			} else if (arg6 == 2) {
				local43 = 128 - local43;
				local35 = 128 - local35;
			} else if (arg6 == 3) {
				local50 = local35;
				local35 = 128 - local43;
				local43 = local50;
			}
			@Pc(108) float local108;
			@Pc(116) float local116;
			@Pc(124) float local124;
			if (local35 == 0 && local43 == 0) {
				local108 = arg5[arg8][arg7];
				local116 = arg2[arg8][arg7];
				local124 = arg9[arg8][arg7];
			} else if (local35 == 128 && local43 == 0) {
				local108 = arg5[arg8 + 1][arg7];
				local116 = arg2[arg8 + 1][arg7];
				local124 = arg9[arg8 + 1][arg7];
			} else if (local35 == 128 && local43 == 128) {
				local116 = arg2[arg8 + 1][arg7 + 1];
				local124 = arg9[arg8 + 1][arg7 + 1];
				local108 = arg5[arg8 + 1][arg7 + 1];
			} else if (local35 == 0 && local43 == 128) {
				local124 = arg9[arg8][arg7 + 1];
				local108 = arg5[arg8][arg7 + 1];
				local116 = arg2[arg8][arg7 + 1];
			} else {
				local116 = arg2[arg8][arg7];
				local108 = arg5[arg8][arg7];
				@Pc(183) float local183 = (float) local35 / 128.0F;
				@Pc(198) float local198 = local116 + (arg2[arg8 + 1][arg7] - local116) * local183;
				@Pc(212) float local212 = local108 + local183 * (arg5[arg8 + 1][arg7] - local108);
				@Pc(220) float local220 = arg9[arg8][arg7 + 1];
				@Pc(236) float local236 = local220 + local183 * (arg9[arg8 + 1][arg7 + 1] - local220);
				@Pc(244) float local244 = arg5[arg8][arg7 + 1];
				@Pc(249) float local249 = (float) local43 / 128.0F;
				@Pc(266) float local266 = local244 + (arg5[arg8 + 1][arg7 + 1] - local244) * local183;
				local108 = local212 + local249 * (local266 - local212);
				local124 = arg9[arg8][arg7];
				@Pc(289) float local289 = arg2[arg8][arg7 + 1];
				@Pc(304) float local304 = local124 + local183 * (arg9[arg8 + 1][arg7] - local124);
				@Pc(321) float local321 = local289 + (arg2[arg8 + 1][arg7 + 1] - local289) * local183;
				local116 = local198 + (local321 - local198) * local249;
				local124 = local304 + local249 * (local236 - local304);
			}
			@Pc(396) int local396 = (arg8 << 7) + local35;
			@Pc(404) int local404 = Static285.method4733(arg8, local35, local43, arg7, arg4);
			@Pc(410) int local410 = local43 + (arg7 << 7);
			local11[local21] = arg1.method3610(arg0, local396, local404, local410, local124, local108, local116);
		}
		arg1.method3611(local11);
	}
}
