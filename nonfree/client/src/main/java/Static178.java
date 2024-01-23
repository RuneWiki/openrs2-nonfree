import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!r", name = "Z", descriptor = "I")
	public static int anInt3878;

	@OriginalMember(owner = "client!r", name = "eb", descriptor = "[Lclient!ka;")
	public static Class64_Sub1[] aClass64_Sub1Array6;

	@OriginalMember(owner = "client!r", name = "bb", descriptor = "Lclient!sc;")
	private static Class107 aClass107_1056 = Static231.method3737("green:");

	@OriginalMember(owner = "client!r", name = "db", descriptor = "[Lclient!sc;")
	public static Class107[] aClass107Array23 = new Class107[200];

	@OriginalMember(owner = "client!r", name = "gb", descriptor = "I")
	public static int anInt3882 = 0;

	@OriginalMember(owner = "client!r", name = "hb", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1057 = aClass107_1056;

	@OriginalMember(owner = "client!r", name = "jb", descriptor = "I")
	public static int anInt3884 = 0;

	@OriginalMember(owner = "client!r", name = "nb", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1058 = aClass107_1056;

	@OriginalMember(owner = "client!r", name = "d", descriptor = "(B)V")
	public static void method2832() {
		if (Static59.anInt1431 == -1 || Static127.anInt2766 == -1) {
			return;
		}
		@Pc(24) int local24 = Static65.anInt1533 + ((Static170.anInt3695 - Static65.anInt1533) * Static24.anInt448 >> 16);
		Static24.anInt448 += local24;
		if (Static24.anInt448 >= 65535) {
			Static24.anInt448 = 65535;
			if (Static120.aBoolean225) {
				Static227.aBoolean439 = false;
			} else {
				Static227.aBoolean439 = true;
			}
			Static120.aBoolean225 = true;
		} else {
			Static120.aBoolean225 = false;
			Static227.aBoolean439 = false;
		}
		@Pc(54) float local54 = (float) Static24.anInt448 / 65535.0F;
		@Pc(57) float[] local57 = new float[3];
		@Pc(61) int local61 = Static200.anInt3494 * 2;
		@Pc(87) int local87;
		@Pc(120) int local120;
		@Pc(128) int local128;
		@Pc(132) int local132;
		@Pc(141) int local141;
		@Pc(159) int local159;
		for (@Pc(63) int local63 = 0; local63 < 3; local63++) {
			@Pc(75) int local75 = Static174.anIntArrayArrayArray10[Static59.anInt1431][local61][local63] * 3;
			local87 = Static174.anIntArrayArrayArray10[Static59.anInt1431][local61 + 1][local63] * 3;
			local120 = (Static174.anIntArrayArrayArray10[Static59.anInt1431][local61 + 2][local63] + Static174.anIntArrayArrayArray10[Static59.anInt1431][local61 + 2][local63] - Static174.anIntArrayArrayArray10[Static59.anInt1431][local61 + 3][local63]) * 3;
			local128 = Static174.anIntArrayArrayArray10[Static59.anInt1431][local61][local63];
			local132 = local87 - local75;
			local141 = local120 + local75 - local87 * 2;
			local159 = local87 + Static174.anIntArrayArrayArray10[Static59.anInt1431][local61 + 2][local63] - local120 - local128;
			local57[local63] = (float) local128 + local54 * (local54 * ((float) local141 + local54 * (float) local159) + (float) local132);
		}
		@Pc(188) float[] local188 = new float[3];
		Static69.anInt1578 = (int) local57[1] * -1;
		if (Static36.anInt764 == 0 && Static152.anInt3377 == 0) {
			Static36.anInt764 = ((int) local57[0] >> 10) * 8 - 48;
			Static152.anInt3377 = ((int) local57[2] >> 10) * 8 - 48;
		}
		Static22.anInt435 = (int) local57[0] - Static36.anInt764 * 128;
		local87 = Static111.anInt2472 * 2;
		Static29.anInt577 = (int) local57[2] - Static152.anInt3377 * 128;
		for (local120 = 0; local120 < 3; local120++) {
			local128 = Static174.anIntArrayArrayArray10[Static127.anInt2766][local87][local120] * 3;
			local132 = Static174.anIntArrayArrayArray10[Static127.anInt2766][local87 + 1][local120] * 3;
			local141 = (Static174.anIntArrayArrayArray10[Static127.anInt2766][local87 + 2][local120] + Static174.anIntArrayArrayArray10[Static127.anInt2766][local87 + 2][local120] - Static174.anIntArrayArrayArray10[Static127.anInt2766][local87 + 3][local120]) * 3;
			@Pc(312) int local312 = local128 + local141 - local132 * 2;
			local159 = Static174.anIntArrayArrayArray10[Static127.anInt2766][local87][local120];
			@Pc(337) int local337 = Static174.anIntArrayArrayArray10[Static127.anInt2766][local87 + 2][local120] + local132 - local159 - local141;
			@Pc(342) int local342 = local132 - local128;
			local188[local120] = local54 * (local54 * (local54 * (float) local337 + (float) local312) + (float) local342) + (float) local159;
		}
		@Pc(375) float local375 = local188[0] - local57[0];
		@Pc(383) float local383 = local188[2] - local57[2];
		@Pc(393) float local393 = (local188[1] - local57[1]) * -1.0F;
		@Pc(403) double local403 = Math.sqrt((double) (local375 * local375 + local383 * local383));
		Static117.aFloat8 = (float) Math.atan2((double) local393, local403);
		Static58.aFloat5 = -((float) Math.atan2((double) local375, (double) local383));
		Static6.anInt2981 = (int) ((double) Static117.aFloat8 * 325.949D) & 0x7FF;
		Static122.anInt2671 = (int) ((double) Static58.aFloat5 * 325.949D) & 0x7FF;
	}

	@OriginalMember(owner = "client!r", name = "e", descriptor = "(III)Z")
	public static boolean method2833(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static29.anIntArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == -Static86.anInt1909) {
			return false;
		} else if (local7 == Static86.anInt1909) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << 7;
			@Pc(26) int local26 = arg2 << 7;
			if (Static152.method2504(local22 + 1, Static166.anIntArrayArrayArray11[arg0][arg1][arg2], local26 + 1) && Static152.method2504(local22 + 128 - 1, Static166.anIntArrayArrayArray11[arg0][arg1 + 1][arg2], local26 + 1) && Static152.method2504(local22 + 128 - 1, Static166.anIntArrayArrayArray11[arg0][arg1 + 1][arg2 + 1], local26 + 128 - 1) && Static152.method2504(local22 + 1, Static166.anIntArrayArrayArray11[arg0][arg1][arg2 + 1], local26 + 128 - 1)) {
				Static29.anIntArrayArrayArray2[arg0][arg1][arg2] = Static86.anInt1909;
				return true;
			} else {
				Static29.anIntArrayArrayArray2[arg0][arg1][arg2] = -Static86.anInt1909;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!r", name = "g", descriptor = "(I)V")
	public static void method2836() {
		Static61.aClass61_22.method1697();
		Static184.aClass61_71.method1697();
		Static122.aClass61_51.method1697();
		Static85.aClass61_29.method1697();
	}
}
