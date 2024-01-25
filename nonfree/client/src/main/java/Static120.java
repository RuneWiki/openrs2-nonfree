import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!eca", name = "g", descriptor = "[[[Z")
	public static boolean[][][] aBooleanArrayArrayArray1;

	@OriginalMember(owner = "client!eca", name = "h", descriptor = "Lclient!cs;")
	public static Class6_Sub2_Sub4 aClass6_Sub2_Sub4_1;

	@OriginalMember(owner = "client!eca", name = "b", descriptor = "[I")
	public static final int[] anIntArray158 = new int[8];

	@OriginalMember(owner = "client!eca", name = "c", descriptor = "I")
	public static int anInt2349 = 0;

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(ZI)V")
	public static void method1982(@OriginalArg(0) boolean arg0) {
		for (@Pc(6) Class6_Sub49 local6 = (Class6_Sub49) Static550.aClass8_63.method149(); local6 != null; local6 = (Class6_Sub49) Static550.aClass8_63.method155()) {
			if (local6.aClass6_Sub3_Sub3_4 != null) {
				Static196.aClass6_Sub3_Sub1_1.method270(local6.aClass6_Sub3_Sub3_4);
				local6.aClass6_Sub3_Sub3_4 = null;
			}
			if (local6.aClass6_Sub3_Sub3_3 != null) {
				Static196.aClass6_Sub3_Sub1_1.method270(local6.aClass6_Sub3_Sub3_3);
				local6.aClass6_Sub3_Sub3_3 = null;
			}
			local6.method9043();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(55) Class6_Sub49 local55 = (Class6_Sub49) Static23.aClass8_21.method149(); local55 != null; local55 = (Class6_Sub49) Static23.aClass8_21.method155()) {
			if (local55.aClass6_Sub3_Sub3_4 != null) {
				Static196.aClass6_Sub3_Sub1_1.method270(local55.aClass6_Sub3_Sub3_4);
				local55.aClass6_Sub3_Sub3_4 = null;
			}
			local55.method9043();
		}
		for (@Pc(82) Class6_Sub49 local82 = (Class6_Sub49) Static554.aClass128_8.method3556(); local82 != null; local82 = (Class6_Sub49) Static554.aClass128_8.method3555()) {
			if (local82.aClass6_Sub3_Sub3_4 != null) {
				Static196.aClass6_Sub3_Sub1_1.method270(local82.aClass6_Sub3_Sub3_4);
				local82.aClass6_Sub3_Sub3_4 = null;
			}
			local82.method9043();
		}
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(Lclient!uf;IIIBI)V")
	public static void method1984(@OriginalArg(0) Class6_Sub49 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0.anInt9629 == -1 && arg0.anIntArray582 == null) {
			return;
		}
		@Pc(16) int local16 = 0;
		@Pc(26) int local26 = arg0.anInt9635 * Static348.aClass6_Sub22_19.lb.method5678() >> 8;
		if (arg0.anInt9634 < arg1) {
			local16 = arg1 - arg0.anInt9634;
		} else if (arg0.anInt9625 > arg1) {
			local16 = arg0.anInt9625 - arg1;
		}
		if (arg0.anInt9638 < arg2) {
			local16 += arg2 - arg0.anInt9638;
		} else if (arg2 < arg0.anInt9626) {
			local16 += arg0.anInt9626 - arg2;
		}
		if (arg0.anInt9622 == 0 || arg0.anInt9622 < local16 - 256 || Static348.aClass6_Sub22_19.lb.method5678() == 0 || arg0.anInt9627 != arg4) {
			if (arg0.aClass6_Sub3_Sub3_4 != null) {
				Static196.aClass6_Sub3_Sub1_1.method270(arg0.aClass6_Sub3_Sub3_4);
				arg0.aClass6_Sub7_2 = null;
				arg0.aClass6_Sub37_Sub1_3 = null;
				arg0.aClass6_Sub3_Sub3_4 = null;
			}
			if (arg0.aClass6_Sub3_Sub3_3 != null) {
				Static196.aClass6_Sub3_Sub1_1.method270(arg0.aClass6_Sub3_Sub3_3);
				arg0.aClass6_Sub7_3 = null;
				arg0.aClass6_Sub3_Sub3_3 = null;
				arg0.aClass6_Sub37_Sub1_4 = null;
			}
			return;
		}
		local16 -= 256;
		if (local16 < 0) {
			local16 = 0;
		}
		@Pc(159) int local159 = arg0.anInt9622 - arg0.anInt9632;
		if (local159 < 0) {
			local159 = arg0.anInt9622;
		}
		@Pc(166) int local166 = local26;
		@Pc(172) int local172 = local16 - arg0.anInt9632;
		if (local172 > 0 && local159 > 0) {
			local166 = local26 * (local159 - local172) / local159;
		}
		Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.method4913();
		@Pc(194) int local194 = 8192;
		@Pc(205) int local205 = (arg0.anInt9625 + arg0.anInt9634) / 2 - arg1;
		@Pc(215) int local215 = (arg0.anInt9626 + arg0.anInt9638) / 2 - arg2;
		@Pc(235) int local235;
		@Pc(249) int local249;
		if (local205 != 0 || local215 != 0) {
			local235 = -Static470.anInt8261 - (int) (Math.atan2((double) local205, (double) local215) * 2607.5945876176133D) - 4096 & 0x3FFF;
			if (local235 > 8192) {
				local235 = 16384 - local235;
			}
			if (local16 <= 0) {
				local249 = 8192;
			} else if (local16 >= 4096) {
				local249 = 16384;
			} else {
				local249 = local16 * 8192 / 4096 + 8192;
			}
			local194 = (16384 - local249 >> 1) + local249 * local235 / 8192;
		}
		@Pc(361) Class6_Sub3_Sub3 local361;
		if (arg0.aClass6_Sub3_Sub3_4 != null) {
			arg0.aClass6_Sub3_Sub3_4.method3856(local166);
			arg0.aClass6_Sub3_Sub3_4.method3843(local194);
		} else if (arg0.anInt9629 >= 0) {
			local235 = arg0.anInt9624 == 256 && arg0.anInt9633 == 256 ? 256 : Static134.method2186(arg0.anInt9624, arg0.anInt9633);
			if (arg0.aBoolean662) {
				if (arg0.aClass6_Sub7_2 == null) {
					arg0.aClass6_Sub7_2 = Static63.method1143(Static237.aClass353_44, arg0.anInt9629);
				}
				if (arg0.aClass6_Sub7_2 != null) {
					if (arg0.aClass6_Sub37_Sub1_3 == null) {
						arg0.aClass6_Sub37_Sub1_3 = arg0.aClass6_Sub7_2.method1142(new int[] { 22050 });
					}
					if (arg0.aClass6_Sub37_Sub1_3 != null) {
						local361 = Static653.method3866(arg0.aClass6_Sub37_Sub1_3, local235, local166 << 6, local194);
						local361.method3841(-1);
						Static196.aClass6_Sub3_Sub1_1.method271(local361);
						arg0.aClass6_Sub3_Sub3_4 = local361;
					}
				}
			} else {
				@Pc(378) Class258 local378 = Static656.method6812(Static323.aClass353_55, arg0.anInt9629, 0);
				if (local378 != null) {
					@Pc(385) Class6_Sub37_Sub1 local385 = local378.method6813().method8306(Static17.aClass194_1);
					@Pc(393) Class6_Sub3_Sub3 local393 = Static653.method3866(local385, local235, local166 << 6, local194);
					local393.method3841(-1);
					Static196.aClass6_Sub3_Sub1_1.method271(local393);
					arg0.aClass6_Sub3_Sub3_4 = local393;
				}
			}
		}
		if (arg0.aClass6_Sub3_Sub3_3 != null) {
			arg0.aClass6_Sub3_Sub3_3.method3856(local166);
			arg0.aClass6_Sub3_Sub3_3.method3843(local194);
			if (!arg0.aClass6_Sub3_Sub3_3.method9042()) {
				arg0.aClass6_Sub7_3 = null;
				arg0.aClass6_Sub37_Sub1_4 = null;
				arg0.aClass6_Sub3_Sub3_3 = null;
			}
		} else if (arg0.anIntArray582 != null && (arg0.anInt9631 -= arg3) <= 0) {
			local235 = arg0.anInt9624 == 256 && arg0.anInt9633 == 256 ? 256 : arg0.anInt9633 + (int) ((double) (arg0.anInt9624 - arg0.anInt9633) * Math.random());
			if (arg0.aBoolean664) {
				if (arg0.aClass6_Sub7_3 == null) {
					local249 = (int) (Math.random() * (double) arg0.anIntArray582.length);
					arg0.aClass6_Sub7_3 = Static63.method1143(Static237.aClass353_44, arg0.anIntArray582[local249]);
				}
				if (arg0.aClass6_Sub7_3 != null) {
					if (arg0.aClass6_Sub37_Sub1_4 == null) {
						arg0.aClass6_Sub37_Sub1_4 = arg0.aClass6_Sub7_3.method1142(new int[] { 22050 });
					}
					if (arg0.aClass6_Sub37_Sub1_4 != null) {
						local361 = Static653.method3866(arg0.aClass6_Sub37_Sub1_4, local235, local166 << 6, local194);
						local361.method3841(0);
						Static196.aClass6_Sub3_Sub1_1.method271(local361);
						arg0.anInt9631 = arg0.anInt9630 + (int) ((double) (arg0.anInt9636 - arg0.anInt9630) * Math.random());
						arg0.aClass6_Sub3_Sub3_3 = local361;
					}
				}
			} else {
				local249 = (int) (Math.random() * (double) arg0.anIntArray582.length);
				@Pc(560) Class258 local560 = Static656.method6812(Static323.aClass353_55, arg0.anIntArray582[local249], 0);
				if (local560 != null) {
					@Pc(567) Class6_Sub37_Sub1 local567 = local560.method6813().method8306(Static17.aClass194_1);
					@Pc(575) Class6_Sub3_Sub3 local575 = Static653.method3866(local567, local235, local166 << 6, local194);
					local575.method3841(0);
					Static196.aClass6_Sub3_Sub1_1.method271(local575);
					arg0.anInt9631 = arg0.anInt9630 + (int) (Math.random() * (double) (arg0.anInt9636 - arg0.anInt9630));
					arg0.aClass6_Sub3_Sub3_3 = local575;
				}
			}
		}
	}
}
