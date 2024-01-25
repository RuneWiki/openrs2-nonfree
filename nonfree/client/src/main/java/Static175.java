import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static175 {

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "I")
	public static int anInt3256;

	@OriginalMember(owner = "client!gs", name = "c", descriptor = "Lclient!mu;")
	public static Class228 aClass228_2;

	@OriginalMember(owner = "client!gs", name = "b", descriptor = "Lclient!gca;")
	public static final Class111 aClass111_15 = new Class111();

	@OriginalMember(owner = "client!gs", name = "e", descriptor = "I")
	public static int anInt3258 = 0;

	@OriginalMember(owner = "client!gs", name = "h", descriptor = "Lclient!tb;")
	public static final Class316 aClass316_4 = new Class316();

	@OriginalMember(owner = "client!gs", name = "i", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray4 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	@OriginalMember(owner = "client!gs", name = "j", descriptor = "I")
	public static int anInt3261 = 0;

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(ILclient!r;ILclient!vda;Lclient!wp;Z)Z")
	public static boolean method2777(@OriginalArg(1) Class78 arg0, @OriginalArg(3) Class345 arg1, @OriginalArg(4) Class1_Sub51 arg2) {
		@Pc(7) int local7 = Integer.MAX_VALUE;
		@Pc(9) int local9 = Integer.MIN_VALUE;
		@Pc(11) int local11 = Integer.MAX_VALUE;
		@Pc(13) int local13 = Integer.MIN_VALUE;
		if (arg1.anIntArray580 != null) {
			local13 = Static287.anInt3864 - (Static287.anInt3864 - Static287.anInt3858) * (arg2.anInt9679 + arg1.anInt9194 - Static287.anInt3856) / (Static287.anInt3857 - Static287.anInt3856);
			local11 = Static287.anInt3864 - (arg2.anInt9679 + arg1.anInt9181 - Static287.anInt3856) * (Static287.anInt3864 - Static287.anInt3858) / (Static287.anInt3857 - Static287.anInt3856);
			local7 = (arg2.anInt9680 + arg1.anInt9174 - Static287.anInt3853) * (Static287.anInt3854 - Static287.anInt3855) / (Static287.anInt3860 - Static287.anInt3853) + Static287.anInt3855;
			local9 = (Static287.anInt3854 - Static287.anInt3855) * (arg1.anInt9200 + arg2.anInt9680 - Static287.anInt3853) / (Static287.anInt3860 - Static287.anInt3853) + Static287.anInt3855;
		}
		@Pc(101) Class5 local101 = null;
		@Pc(103) int local103 = 0;
		@Pc(105) int local105 = 0;
		@Pc(107) int local107 = 0;
		@Pc(109) int local109 = 0;
		if (arg1.anInt9195 != -1) {
			if (arg2.aBoolean715 && arg1.anInt9188 != -1) {
				local101 = arg1.method7481(true, arg0);
			} else {
				local101 = arg1.method7481(false, arg0);
			}
			if (local101 != null) {
				local103 = arg2.anInt9676 - (local101.A() + 1 >> 1);
				local105 = arg2.anInt9676 + (local101.A() + 1 >> 1);
				if (local7 > local103) {
					local7 = local103;
				}
				if (local105 > local9) {
					local9 = local105;
				}
				local107 = arg2.anInt9677 - (local101.ca() + 1 >> 1);
				local109 = arg2.anInt9677 + (local101.ca() + 1 >> 1);
				if (local11 > local107) {
					local11 = local107;
				}
				if (local13 < local109) {
					local13 = local109;
				}
			}
		}
		@Pc(211) Class204 local211 = null;
		@Pc(218) int local218 = 0;
		@Pc(220) int local220 = 0;
		@Pc(222) int local222 = 0;
		@Pc(224) int local224 = 0;
		@Pc(226) int local226 = 0;
		@Pc(228) int local228 = 0;
		@Pc(230) int local230 = 0;
		@Pc(280) int local280;
		@Pc(307) int local307;
		if (arg1.aString101 != null) {
			local211 = Static332.method4903(arg1.anInt9173);
			if (local211 != null) {
				local218 = Static439.aClass352_23.method7575(null, null, Static218.aStringArray8, arg1.aString101);
				local220 = arg2.anInt9677;
				if (local101 == null) {
					local220 -= local218 * local211.method4354() / 2;
				} else {
					local220 -= (local101.ca() >> 1) + (local211.method4356() * local218);
				}
				for (local280 = 0; local280 < local218; local280++) {
					@Pc(286) String local286 = Static218.aStringArray8[local280];
					if (local218 - 1 > local280) {
						local286 = local286.substring(0, local286.length() - 4);
					}
					local307 = local211.method4353(local286);
					if (local222 < local307) {
						local222 = local307;
					}
				}
				local224 = arg2.anInt9676 - local222 / 2;
				if (local224 < local7) {
					local7 = local224;
				}
				local226 = arg2.anInt9676 + local222 / 2;
				if (local9 < local226) {
					local9 = local226;
				}
				local228 = local220;
				if (local228 < local11) {
					local11 = local228;
				}
				local230 = local211.method4356() * local218 + local220;
				if (local13 < local230) {
					local13 = local230;
				}
			}
		}
		if (local9 < Static287.anInt3855 || Static287.anInt3854 < local7 || Static287.anInt3858 > local13 || local11 > Static287.anInt3864) {
			return true;
		}
		@Pc(416) int local416;
		if (arg1.anIntArray580 != null) {
			@Pc(414) int[] local414 = new int[arg1.anIntArray580.length];
			for (local416 = 0; local416 < local414.length / 2; local416++) {
				local307 = arg1.anIntArray580[local416 * 2] + arg2.anInt9680;
				@Pc(441) int local441 = arg2.anInt9679 + arg1.anIntArray580[local416 * 2 + 1];
				local414[local416 * 2] = Static287.anInt3855 + (local307 - Static287.anInt3853) * (-Static287.anInt3855 + Static287.anInt3854) / (Static287.anInt3860 - Static287.anInt3853);
				local414[local416 * 2 + 1] = Static287.anInt3864 - (Static287.anInt3864 - Static287.anInt3858) * (-Static287.anInt3856 + local441) / (Static287.anInt3857 - Static287.anInt3856);
			}
			Static261.method3784(arg0, local414, arg1.anInt9176);
			for (local307 = 0; local307 < local414.length / 2 - 1; local307++) {
				arg0.method6835(local414[local307 * 2 + 1], arg1.anInt9165, local414[local307 * 2], local414[local307 * 2 + 2], local414[(local307 + 1) * 2 + 1]);
			}
			arg0.method6835(local414[local414.length - 1], arg1.anInt9165, local414[local414.length - 2], local414[0], local414[1]);
		}
		if (local101 != null) {
			if (Static413.anInt7319 > 0 && (Static514.anInt8865 != -1 && arg2.anInt9675 == Static514.anInt8865 || Static69.anInt1339 != -1 && arg1.anInt9198 == Static69.anInt1339)) {
				if (Static24.anInt582 <= 50) {
					local280 = Static24.anInt582 * 2;
				} else {
					local280 = 200 - Static24.anInt582 * 2;
				}
				local416 = local280 << 24 | 0xFFFF00;
				arg0.method6830(local416, local101.E() / 2 + 7, arg2.anInt9677, arg2.anInt9676);
				arg0.method6830(local416, local101.E() / 2 + 5, arg2.anInt9677, arg2.anInt9676);
				arg0.method6830(local416, local101.E() / 2 + 3, arg2.anInt9677, arg2.anInt9676);
				arg0.method6830(local416, local101.E() / 2 + 1, arg2.anInt9677, arg2.anInt9676);
				arg0.method6830(local416, local101.E() / 2, arg2.anInt9677, arg2.anInt9676);
			}
			local101.method7795(arg2.anInt9676 - (local101.A() >> 1), arg2.anInt9677 + -(local101.ca() >> 1));
		}
		if (arg1.aString101 != null && local211 != null) {
			Static260.method3775(arg2, arg1, local220, local222, local218, local211, arg0);
		}
		if (arg1.anInt9195 != -1 || arg1.aString101 != null) {
			@Pc(738) Class1_Sub39 local738 = new Class1_Sub39(arg2);
			local738.anInt7783 = local224;
			local738.anInt7788 = local103;
			local738.anInt7784 = local107;
			local738.anInt7789 = local228;
			local738.anInt7787 = local230;
			local738.anInt7791 = local226;
			local738.anInt7786 = local105;
			local738.anInt7790 = local109;
			Static49.aClass111_4.method2552(local738);
		}
		return false;
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(B[[I)V")
	public static void method2778(@OriginalArg(1) int[][] arg0) {
		Static280.anIntArrayArray25 = arg0;
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(BC)Z")
	public static boolean method2779(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(III)Lclient!ml;")
	public static Class11_Sub1_Sub5 method2781(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class360 local7 = Static568.aClass360ArrayArrayArray22[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass11_Sub1_Sub5_2;
	}
}
