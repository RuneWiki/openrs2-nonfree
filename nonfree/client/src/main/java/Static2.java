import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aa", name = "m", descriptor = "Lclient!lg;")
	public static Class102 aClass102_1;

	@OriginalMember(owner = "client!aa", name = "n", descriptor = "I")
	public static int anInt7;

	@OriginalMember(owner = "client!aa", name = "p", descriptor = "I")
	public static int anInt8;

	@OriginalMember(owner = "client!aa", name = "h", descriptor = "S")
	public static short aShort1 = 205;

	@OriginalMember(owner = "client!aa", name = "u", descriptor = "I")
	public static int anInt12 = 0;

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIII)I")
	public static int method4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return arg1 < arg2 ? arg2 : arg1 > arg0 ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "([Ljava/lang/Object;III[I)V")
	public static void method5(@OriginalArg(0) Object[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int[] arg3) {
		if (arg2 <= arg1) {
			return;
		}
		@Pc(15) int local15 = arg1;
		@Pc(21) int local21 = (arg2 + arg1) / 2;
		@Pc(25) int local25 = arg3[local21];
		arg3[local21] = arg3[arg2];
		arg3[arg2] = local25;
		@Pc(39) Object local39 = arg0[local21];
		arg0[local21] = arg0[arg2];
		arg0[arg2] = local39;
		for (@Pc(51) int local51 = arg1; local51 < arg2; local51++) {
			if (local25 + (local51 & 0x1) > arg3[local51]) {
				@Pc(77) int local77 = arg3[local51];
				arg3[local51] = arg3[local15];
				arg3[local15] = local77;
				@Pc(91) Object local91 = arg0[local51];
				arg0[local51] = arg0[local15];
				arg0[local15++] = local91;
			}
		}
		arg3[arg2] = arg3[local15];
		arg3[local15] = local25;
		arg0[arg2] = arg0[local15];
		arg0[local15] = local39;
		method5(arg0, arg1, local15 - 1, arg3);
		method5(arg0, local15 + 1, arg2, arg3);
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(ZI)V")
	public static void method6(@OriginalArg(1) int arg0) {
		if (!Static81.aBoolean129) {
			arg0 = -1;
		}
		if (arg0 == Static297.anInt5704) {
			return;
		}
		if (arg0 != -1) {
			@Pc(24) Class20 local24 = Static295.method2905(arg0);
			@Pc(28) Class8_Sub1_Sub7_Sub1 local28 = local24.method505();
			if (local28 == null) {
				arg0 = -1;
			} else {
				Static199.aClass17_3.method442(new Point(local24.anInt732, local24.anInt731), local28.anInt3611, local28.method1646(), local28.anInt3610, Static39.aCanvas1);
				Static297.anInt5704 = arg0;
			}
		}
		if (arg0 == -1 && Static297.anInt5704 != -1) {
			Static199.aClass17_3.method442(new Point(), -1, null, -1, Static39.aCanvas1);
			Static297.anInt5704 = -1;
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)V")
	public static void method7(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = Static61.anInt1336;
		if (arg0 == 0) {
			local7 = 1;
		}
		@Pc(17) int local17;
		@Pc(37) Class36_Sub3_Sub1 local37;
		@Pc(132) int local132;
		@Pc(138) int local138;
		@Pc(158) int local158;
		@Pc(171) int local171;
		@Pc(176) int local176;
		@Pc(185) int local185;
		for (local17 = 0; local17 < local7; local17++) {
			if (arg0 == 0) {
				local37 = Static21.aClass36_Sub3_Sub1_1;
			} else {
				local37 = Static230.aClass36_Sub3_Sub1Array1[Static85.anIntArray123[local17]];
			}
			if (local37 != null && local37.method3112()) {
				@Pc(52) int local52 = local37.method3110();
				if (arg0 == 0 || arg0 == local52) {
					@Pc(122) int local122;
					if (local52 == 1) {
						if ((local37.anInt4117 & 0x7F) == 64 && (local37.anInt4118 & 0x7F) == 64) {
							local122 = local37.anInt4117 >> 7;
							local132 = local37.anInt4118 >> 7;
							if (local122 >= 0 && local122 < 104 && local132 >= 0 && local132 < 104) {
								local185 = Static82.anIntArrayArray7[local122][local132]++;
							}
						}
					} else if (((local52 & 0x1) != 0 || (local37.anInt4117 & 0x7F) == 0 && (local37.anInt4118 & 0x7F) == 0) && ((local52 & 0x1) != 1 || (local37.anInt4117 & 0x7F) == 64 && (local37.anInt4118 & 0x7F) == 64)) {
						local122 = local37.anInt4117 - local52 * 64 >> 7;
						local132 = local37.anInt4118 - local52 * 64 >> 7;
						local138 = local122 + local37.method3110();
						if (local122 < 0) {
							local122 = 0;
						}
						if (local138 > 104) {
							local138 = 104;
						}
						local158 = local37.method3110() + local132;
						if (local132 < 0) {
							local132 = 0;
						}
						if (local158 > 104) {
							local158 = 104;
						}
						for (local171 = local122; local171 < local138; local171++) {
							for (local176 = local132; local176 < local158; local176++) {
								local185 = Static82.anIntArrayArray7[local171][local176]++;
							}
						}
					}
				}
			}
		}
		label224: for (local17 = 0; local17 < local7; local17++) {
			@Pc(267) long local267;
			if (arg0 == 0) {
				local267 = 8791798054912L;
				local37 = Static21.aClass36_Sub3_Sub1_1;
			} else {
				local267 = (long) Static85.anIntArray123[local17] << 32;
				local37 = Static230.aClass36_Sub3_Sub1Array1[Static85.anIntArray123[local17]];
			}
			if (local37 != null && local37.method3112()) {
				local132 = local37.method3110();
				if (arg0 == 0 || arg0 == local132) {
					local37.aBoolean332 = true;
					local37.aBoolean326 = false;
					if ((Static153.aBoolean257 && Static61.anInt1336 > 200 || Static61.anInt1336 > 50) && arg0 != 0 && local37.anInt4067 == local37.method3105().anInt423) {
						local37.aBoolean326 = true;
					}
					if (local132 == 1) {
						if ((local37.anInt4117 & 0x7F) == 64 && (local37.anInt4118 & 0x7F) == 64) {
							local138 = local37.anInt4117 >> 7;
							local158 = local37.anInt4118 >> 7;
							if (local138 < 0 || local138 >= 104 || local158 < 0 || local158 >= 104) {
								continue;
							}
							if (Static82.anIntArrayArray7[local138][local158] > 1) {
								local185 = Static82.anIntArrayArray7[local138][local158]--;
								continue;
							}
						}
					} else if ((local132 & 0x1) == 0 && (local37.anInt4117 & 0x7F) == 0 && (local37.anInt4118 & 0x7F) == 0 || (local132 & 0x1) == 1 && (local37.anInt4117 & 0x7F) == 64 && (local37.anInt4118 & 0x7F) == 0) {
						local138 = local37.anInt4117 - local132 * 64 >> 7;
						local158 = local37.anInt4118 - local132 * 64 >> 7;
						local171 = local132 + local138;
						local176 = local132 + local158;
						@Pc(409) boolean local409 = true;
						if (local176 > 104) {
							local176 = 104;
						}
						if (local138 < 0) {
							local138 = 0;
						}
						if (local158 < 0) {
							local158 = 0;
						}
						if (local171 > 104) {
							local171 = 104;
						}
						@Pc(434) int local434;
						@Pc(443) int local443;
						for (local434 = local138; local434 < local171; local434++) {
							for (local443 = local158; local443 < local176; local443++) {
								if (Static82.anIntArrayArray7[local434][local443] <= 1) {
									local409 = false;
									break;
								}
							}
						}
						if (local409) {
							local434 = local138;
							while (true) {
								if (local171 <= local434) {
									continue label224;
								}
								for (local443 = local158; local443 < local176; local443++) {
									local185 = Static82.anIntArrayArray7[local434][local443]--;
								}
								local434++;
							}
						}
					}
					if (local37.anObject4 == null || Static183.anInt3590 < local37.anInt4108 || Static183.anInt3590 >= local37.anInt4071) {
						local37.aBoolean332 = false;
						local37.anInt4086 = Static59.method927(local37.anInt4117, local37.anInt4118, Static34.anInt770);
						Static37.method3011(Static34.anInt770, local37.anInt4117, local37.anInt4118, local37.anInt4086, local132 * 64 + 60 - 64, local37, local37.anInt4128, local267, local37.aBoolean330);
					} else {
						local37.aBoolean332 = false;
						local37.aBoolean326 = false;
						local37.anInt4086 = Static59.method927(local37.anInt4117, local37.anInt4118, Static34.anInt770);
						Static214.method3348(Static34.anInt770, local37.anInt4117, local37.anInt4118, local37.anInt4086, local37, local37.anInt4128, local267, local37.anInt4109, local37.anInt4075, local37.anInt4140, local37.anInt4080);
					}
				}
			}
		}
	}
}
