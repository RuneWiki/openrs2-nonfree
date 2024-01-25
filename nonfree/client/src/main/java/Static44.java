import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!bk", name = "s", descriptor = "I")
	public static int anInt898;

	@OriginalMember(owner = "client!bk", name = "n", descriptor = "Lclient!tja;")
	public static final Class352 aClass352_3 = new Class352(3000000, 200);

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IILclient!iia;III)V")
	public static void method813(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4_Sub23 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2.anInt4145 == -1 && arg2.anIntArray302 == null) {
			return;
		}
		@Pc(15) int local15 = 0;
		@Pc(27) int local27 = arg2.anInt4148 * Static124.aClass4_Sub20_4.aClass8_Sub22_3.method7414() >> 8;
		if (arg2.anInt4142 < arg4) {
			local15 = arg4 - arg2.anInt4142;
		} else if (arg4 < arg2.anInt4135) {
			local15 = arg2.anInt4135 - arg4;
		}
		if (arg2.anInt4143 < arg3) {
			local15 += arg3 - arg2.anInt4143;
		} else if (arg3 < arg2.anInt4140) {
			local15 += arg2.anInt4140 - arg3;
		}
		if (arg2.anInt4137 == 0 || local15 - 256 > arg2.anInt4137 || Static124.aClass4_Sub20_4.aClass8_Sub22_3.method7414() == 0 || arg1 != arg2.anInt4134) {
			if (arg2.aClass4_Sub3_Sub3_2 != null) {
				Static162.aClass4_Sub3_Sub5_3.method7723(arg2.aClass4_Sub3_Sub3_2);
				arg2.aClass4_Sub3_Sub3_2 = null;
				arg2.aClass4_Sub16_3 = null;
				arg2.aClass4_Sub4_Sub1_3 = null;
			}
			if (arg2.aClass4_Sub3_Sub3_3 != null) {
				Static162.aClass4_Sub3_Sub5_3.method7723(arg2.aClass4_Sub3_Sub3_3);
				arg2.aClass4_Sub3_Sub3_3 = null;
				arg2.aClass4_Sub16_2 = null;
				arg2.aClass4_Sub4_Sub1_2 = null;
			}
			return;
		}
		local15 -= 256;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(163) int local163 = arg2.anInt4137 - arg2.anInt4150;
		if (local163 < 0) {
			local163 = arg2.anInt4137;
		}
		@Pc(173) int local173 = local27;
		@Pc(179) int local179 = local15 - arg2.anInt4150;
		if (local179 > 0 && local163 > 0) {
			local173 = (local163 - local179) * local27 / local163;
		}
		Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.method8514();
		@Pc(202) int local202 = 8192;
		@Pc(214) int local214 = (arg2.anInt4142 + arg2.anInt4135) / 2 - arg4;
		@Pc(225) int local225 = (arg2.anInt4140 + arg2.anInt4143) / 2 - arg3;
		@Pc(252) int local252;
		@Pc(269) int local269;
		if (local214 != 0 || local225 != 0) {
			local252 = -Static226.anInt3586 - (int) (Math.atan2((double) local214, (double) local225) * 2607.5945876176133D) - 4096 & 0x3FFF;
			if (local252 > 8192) {
				local252 = 16384 - local252;
			}
			if (local15 <= 0) {
				local269 = 8192;
			} else if (local15 < 4096) {
				local269 = local15 * 8192 / 4096 + 8192;
			} else {
				local269 = 16384;
			}
			local202 = local252 * local269 / 8192 + (16384 - local269 >> 1);
		}
		@Pc(400) Class4_Sub3_Sub3 local400;
		if (arg2.aClass4_Sub3_Sub3_2 != null) {
			arg2.aClass4_Sub3_Sub3_2.method5999(local173);
			arg2.aClass4_Sub3_Sub3_2.method5996(local202);
		} else if (arg2.anInt4145 >= 0) {
			local252 = arg2.anInt4133 == 256 && arg2.anInt4130 == 256 ? 256 : Static84.method1756(arg2.anInt4133, arg2.anInt4130);
			if (arg2.aBoolean306) {
				if (arg2.aClass4_Sub16_3 == null) {
					arg2.aClass4_Sub16_3 = Static113.method2135(Static400.aClass34_84, arg2.anInt4145);
				}
				if (arg2.aClass4_Sub16_3 != null) {
					if (arg2.aClass4_Sub4_Sub1_3 == null) {
						arg2.aClass4_Sub4_Sub1_3 = arg2.aClass4_Sub16_3.method2131(new int[] { 22050 });
					}
					if (arg2.aClass4_Sub4_Sub1_3 != null) {
						local400 = Static683.method5994(arg2.aClass4_Sub4_Sub1_3, local252, local173 << 6, local202);
						local400.method6015(-1);
						Static162.aClass4_Sub3_Sub5_3.method7724(local400);
						arg2.aClass4_Sub3_Sub3_2 = local400;
					}
				}
			} else {
				@Pc(336) Class341 local336 = Static687.method7487(Static42.aClass34_6, arg2.anInt4145, 0);
				if (local336 != null) {
					@Pc(343) Class4_Sub4_Sub1 local343 = local336.method7490().method240(Static228.aClass391_1);
					@Pc(351) Class4_Sub3_Sub3 local351 = Static683.method5994(local343, local252, local173 << 6, local202);
					local351.method6015(-1);
					Static162.aClass4_Sub3_Sub5_3.method7724(local351);
					arg2.aClass4_Sub3_Sub3_2 = local351;
				}
			}
		}
		if (arg2.aClass4_Sub3_Sub3_3 != null) {
			arg2.aClass4_Sub3_Sub3_3.method5999(local173);
			arg2.aClass4_Sub3_Sub3_3.method5996(local202);
			if (!arg2.aClass4_Sub3_Sub3_3.method9002()) {
				arg2.aClass4_Sub16_2 = null;
				arg2.aClass4_Sub4_Sub1_2 = null;
				arg2.aClass4_Sub3_Sub3_3 = null;
			}
		} else if (arg2.anIntArray302 != null && (arg2.anInt4147 -= arg0) <= 0) {
			local252 = arg2.anInt4133 == 256 && arg2.anInt4130 == 256 ? 256 : arg2.anInt4130 + (int) (Math.random() * (double) (arg2.anInt4133 - arg2.anInt4130));
			if (!arg2.aBoolean307) {
				local269 = (int) (Math.random() * (double) arg2.anIntArray302.length);
				@Pc(506) Class341 local506 = Static687.method7487(Static42.aClass34_6, arg2.anIntArray302[local269], 0);
				if (local506 != null) {
					@Pc(513) Class4_Sub4_Sub1 local513 = local506.method7490().method240(Static228.aClass391_1);
					@Pc(521) Class4_Sub3_Sub3 local521 = Static683.method5994(local513, local252, local173 << 6, local202);
					local521.method6015(0);
					Static162.aClass4_Sub3_Sub5_3.method7724(local521);
					arg2.aClass4_Sub3_Sub3_3 = local521;
					arg2.anInt4147 = arg2.anInt4141 + (int) ((double) (arg2.anInt4136 - arg2.anInt4141) * Math.random());
					return;
				}
				return;
			}
			if (arg2.aClass4_Sub16_2 == null) {
				local269 = (int) (Math.random() * (double) arg2.anIntArray302.length);
				arg2.aClass4_Sub16_2 = Static113.method2135(Static400.aClass34_84, arg2.anIntArray302[local269]);
			}
			if (arg2.aClass4_Sub16_2 != null) {
				if (arg2.aClass4_Sub4_Sub1_2 == null) {
					arg2.aClass4_Sub4_Sub1_2 = arg2.aClass4_Sub16_2.method2131(new int[] { 22050 });
				}
				if (arg2.aClass4_Sub4_Sub1_2 != null) {
					local400 = Static683.method5994(arg2.aClass4_Sub4_Sub1_2, local252, local173 << 6, local202);
					local400.method6015(0);
					Static162.aClass4_Sub3_Sub5_3.method7724(local400);
					arg2.aClass4_Sub3_Sub3_3 = local400;
					arg2.anInt4147 = (int) ((double) (arg2.anInt4136 - arg2.anInt4141) * Math.random()) + arg2.anInt4141;
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!bk", name = "d", descriptor = "(I)V")
	public static void method820() {
		Static54.anInt1255 = -2;
		Static85.anInt1771 = -2;
		Static618.anInt9708 = 0;
	}
}
