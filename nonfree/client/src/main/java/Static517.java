import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static517 {

	@OriginalMember(owner = "client!sg", name = "l", descriptor = "I")
	public static int anInt8961 = 0;

	@OriginalMember(owner = "client!sg", name = "m", descriptor = "Lclient!qp;")
	public static final Class280 aClass280_42 = new Class280(16);

	@OriginalMember(owner = "client!sg", name = "r", descriptor = "Lclient!lc;")
	public static final Class200 aClass200_129 = new Class200(101, 0);

	@OriginalMember(owner = "client!sg", name = "t", descriptor = "I")
	public static int anInt8967 = 0;

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIILclient!ip;)V")
	public static void method7721(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class3_Sub4_Sub13 arg2) {
		if (arg2 == null || Static464.aClass223_49.aClass3_188 == arg2) {
			return;
		}
		@Pc(15) int local15 = arg2.anInt4574;
		@Pc(26) int local26 = arg2.anInt4579;
		@Pc(29) int local29 = arg2.anInt4577;
		@Pc(33) int local33 = (int) arg2.aLong136;
		if (local29 >= 2000) {
			local29 -= 2000;
		}
		@Pc(40) long local40 = arg2.aLong136;
		@Pc(62) Class3_Sub14 local62;
		if (local29 == 15) {
			Static52.anInt1497 = arg0;
			Static215.anInt4075 = 0;
			Static501.anInt8621 = 2;
			Static525.anInt4723 = arg1;
			local62 = Static139.method2308(Static479.aClass130_67, Static24.aClass233_1);
			local62.aClass3_Sub3_Sub2_2.method4201((int) (local40 >>> 32) & Integer.MAX_VALUE);
			local62.aClass3_Sub3_Sub2_2.method4220(Static339.aClass163_1.method4104(82) ? 1 : 0);
			local62.aClass3_Sub3_Sub2_2.method4202(local15 + Static299.anInt5307);
			local62.aClass3_Sub3_Sub2_2.method4253(local26 + Static171.anInt3340);
			Static562.method8096(local62);
			Static216.method3633(local40, local26, local15);
		}
		if (local29 == 18) {
			if (Static302.anInt5364 > 0 && Static339.aClass163_1.method4104(82) && Static339.aClass163_1.method4104(81)) {
				Static94.method2090(Static171.anInt3340 + local26, Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.aByte123, Static299.anInt5307 + local15);
			} else {
				Static52.anInt1497 = arg0;
				Static501.anInt8621 = 1;
				Static525.anInt4723 = arg1;
				Static215.anInt4075 = 0;
				local62 = Static139.method2308(Static344.aClass130_93, Static24.aClass233_1);
				local62.aClass3_Sub3_Sub2_2.method4202(Static299.anInt5307 + local15);
				local62.aClass3_Sub3_Sub2_2.method4226(local26 + Static171.anInt3340);
				Static562.method8096(local62);
			}
		}
		@Pc(202) Class3_Sub14 local202;
		@Pc(183) Class4_Sub1_Sub2_Sub1_Sub2 local183;
		if (local29 == 9) {
			local183 = Static42.aClass4_Sub1_Sub2_Sub1_Sub2Array1[local33];
			if (local183 != null) {
				Static525.anInt4723 = arg1;
				Static215.anInt4075 = 0;
				Static501.anInt8621 = 2;
				Static52.anInt1497 = arg0;
				local202 = Static139.method2308(Static48.aClass130_21, Static24.aClass233_1);
				local202.aClass3_Sub3_Sub2_2.method4226(local33);
				local202.aClass3_Sub3_Sub2_2.method4203(Static339.aClass163_1.method4104(82) ? 1 : 0);
				Static562.method8096(local202);
				Static396.method5709(local183.method5059(), 0, -2, local183.method5059(), local183.anIntArray309[0], local183.anIntArray310[0], 0, true);
			}
		}
		if (local29 == 11) {
			Static215.anInt4075 = 0;
			Static52.anInt1497 = arg0;
			Static501.anInt8621 = 2;
			Static525.anInt4723 = arg1;
			local62 = Static139.method2308(Static295.aClass130_83, Static24.aClass233_1);
			local62.aClass3_Sub3_Sub2_2.method4226(Static171.anInt3340 + local26);
			local62.aClass3_Sub3_Sub2_2.method4202(local15 + Static299.anInt5307);
			local62.aClass3_Sub3_Sub2_2.method4220(Static339.aClass163_1.method4104(82) ? 1 : 0);
			local62.aClass3_Sub3_Sub2_2.method4253(local33);
			Static562.method8096(local62);
			Static240.method8602(local15, local26);
		}
		if (local29 == 47) {
			Static501.anInt8621 = 1;
			Static52.anInt1497 = arg0;
			Static215.anInt4075 = 0;
			Static525.anInt4723 = arg1;
			local62 = Static139.method2308(Static520.aClass130_126, Static24.aClass233_1);
			local62.aClass3_Sub3_Sub2_2.method4226(Static235.anInt4449);
			local62.aClass3_Sub3_Sub2_2.method4226(Static171.anInt3340 + local26);
			local62.aClass3_Sub3_Sub2_2.method4202(Static299.anInt5307 + local15);
			local62.aClass3_Sub3_Sub2_2.method4266(Static161.anInt3179);
			local62.aClass3_Sub3_Sub2_2.method4226(Static433.anInt7818);
			Static562.method8096(local62);
			Static396.method5709(1, 0, -4, 1, local26, local15, 0, true);
		}
		if (local29 == 21) {
			local183 = Static42.aClass4_Sub1_Sub2_Sub1_Sub2Array1[local33];
			if (local183 != null) {
				Static215.anInt4075 = 0;
				Static501.anInt8621 = 2;
				Static525.anInt4723 = arg1;
				Static52.anInt1497 = arg0;
				local202 = Static139.method2308(Static544.aClass130_122, Static24.aClass233_1);
				local202.aClass3_Sub3_Sub2_2.method4240(Static339.aClass163_1.method4104(82) ? 1 : 0);
				local202.aClass3_Sub3_Sub2_2.method4253(local33);
				Static562.method8096(local202);
				Static396.method5709(local183.method5059(), 0, -2, local183.method5059(), local183.anIntArray309[0], local183.anIntArray310[0], 0, true);
			}
		}
		if (local29 == 17) {
			local183 = Static42.aClass4_Sub1_Sub2_Sub1_Sub2Array1[local33];
			if (local183 != null) {
				Static52.anInt1497 = arg0;
				Static215.anInt4075 = 0;
				Static525.anInt4723 = arg1;
				Static501.anInt8621 = 2;
				local202 = Static139.method2308(Static146.aClass130_44, Static24.aClass233_1);
				local202.aClass3_Sub3_Sub2_2.method4216(Static339.aClass163_1.method4104(82) ? 1 : 0);
				local202.aClass3_Sub3_Sub2_2.method4226(local33);
				Static562.method8096(local202);
				Static396.method5709(local183.method5059(), 0, -2, local183.method5059(), local183.anIntArray309[0], local183.anIntArray310[0], 0, true);
			}
		}
		if (local29 == 3) {
			local183 = Static42.aClass4_Sub1_Sub2_Sub1_Sub2Array1[local33];
			if (local183 != null) {
				Static525.anInt4723 = arg1;
				Static501.anInt8621 = 2;
				Static215.anInt4075 = 0;
				Static52.anInt1497 = arg0;
				local202 = Static139.method2308(Static104.aClass130_39, Static24.aClass233_1);
				local202.aClass3_Sub3_Sub2_2.method4226(local33);
				local202.aClass3_Sub3_Sub2_2.method4216(Static339.aClass163_1.method4104(82) ? 1 : 0);
				Static562.method8096(local202);
				Static396.method5709(local183.method5059(), 0, -2, local183.method5059(), local183.anIntArray309[0], local183.anIntArray310[0], 0, true);
			}
		}
		if (local29 == 44) {
			Static52.anInt1497 = arg0;
			Static525.anInt4723 = arg1;
			Static501.anInt8621 = 2;
			Static215.anInt4075 = 0;
			local62 = Static139.method2308(Static530.aClass130_119, Static24.aClass233_1);
			local62.aClass3_Sub3_Sub2_2.method4253((int) (local40 >>> 32) & Integer.MAX_VALUE);
			local62.aClass3_Sub3_Sub2_2.method4240(Static339.aClass163_1.method4104(82) ? 1 : 0);
			local62.aClass3_Sub3_Sub2_2.method4226(Static171.anInt3340 + local26);
			local62.aClass3_Sub3_Sub2_2.method4202(local15 + Static299.anInt5307);
			Static562.method8096(local62);
			Static216.method3633(local40, local26, local15);
		}
		if (local29 == 23) {
			Static501.anInt8621 = 2;
			Static52.anInt1497 = arg0;
			Static525.anInt4723 = arg1;
			Static215.anInt4075 = 0;
			local62 = Static139.method2308(Static549.aClass130_124, Static24.aClass233_1);
			local62.aClass3_Sub3_Sub2_2.method4226(Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.anInt5759);
			local62.aClass3_Sub3_Sub2_2.method4253(Static235.anInt4449);
			local62.aClass3_Sub3_Sub2_2.method4266(Static161.anInt3179);
			local62.aClass3_Sub3_Sub2_2.method4216(Static339.aClass163_1.method4104(82) ? 1 : 0);
			local62.aClass3_Sub3_Sub2_2.method4253(Static433.anInt7818);
			Static562.method8096(local62);
		}
		if (local29 == 1011) {
			Static501.anInt8621 = 2;
			Static52.anInt1497 = arg0;
			Static525.anInt4723 = arg1;
			Static215.anInt4075 = 0;
			local62 = Static139.method2308(Static181.aClass130_56, Static24.aClass233_1);
			local62.aClass3_Sub3_Sub2_2.method4201(local33);
			Static562.method8096(local62);
		}
		@Pc(757) Class3_Sub14 local757;
		@Pc(752) Class4_Sub1_Sub2_Sub1_Sub1 local752;
		@Pc(735) Class3_Sub28 local735;
		if (local29 == 20) {
			local735 = (Class3_Sub28) Static551.aClass280_43.method7107((long) local33);
			if (local735 != null) {
				Static52.anInt1497 = arg0;
				Static215.anInt4075 = 0;
				Static525.anInt4723 = arg1;
				Static501.anInt8621 = 2;
				local752 = local735.aClass4_Sub1_Sub2_Sub1_Sub1_2;
				local757 = Static139.method2308(Static395.aClass130_101, Static24.aClass233_1);
				local757.aClass3_Sub3_Sub2_2.method4201(local33);
				local757.aClass3_Sub3_Sub2_2.method4240(Static339.aClass163_1.method4104(82) ? 1 : 0);
				Static562.method8096(local757);
				Static396.method5709(local752.method5059(), 0, -2, local752.method5059(), local752.anIntArray309[0], local752.anIntArray310[0], 0, true);
			}
		}
		if (local29 == 2) {
			Static52.anInt1497 = arg0;
			Static215.anInt4075 = 0;
			Static525.anInt4723 = arg1;
			Static501.anInt8621 = 2;
			local62 = Static139.method2308(Static552.aClass130_125, Static24.aClass233_1);
			local62.aClass3_Sub3_Sub2_2.method4226(local33);
			local62.aClass3_Sub3_Sub2_2.method4201(local15 + Static299.anInt5307);
			local62.aClass3_Sub3_Sub2_2.method4240(Static339.aClass163_1.method4104(82) ? 1 : 0);
			local62.aClass3_Sub3_Sub2_2.method4201(Static171.anInt3340 + local26);
			Static562.method8096(local62);
			Static240.method8602(local15, local26);
		}
		if (local29 == 13) {
			local735 = (Class3_Sub28) Static551.aClass280_43.method7107((long) local33);
			if (local735 != null) {
				Static525.anInt4723 = arg1;
				Static215.anInt4075 = 0;
				Static501.anInt8621 = 2;
				local752 = local735.aClass4_Sub1_Sub2_Sub1_Sub1_2;
				Static52.anInt1497 = arg0;
				local757 = Static139.method2308(Static121.aClass130_40, Static24.aClass233_1);
				local757.aClass3_Sub3_Sub2_2.method4201(Static235.anInt4449);
				local757.aClass3_Sub3_Sub2_2.method4253(Static433.anInt7818);
				local757.aClass3_Sub3_Sub2_2.method4203(Static339.aClass163_1.method4104(82) ? 1 : 0);
				local757.aClass3_Sub3_Sub2_2.method4227(Static161.anInt3179);
				local757.aClass3_Sub3_Sub2_2.method4201(local33);
				Static562.method8096(local757);
				Static396.method5709(local752.method5059(), 0, -2, local752.method5059(), local752.anIntArray309[0], local752.anIntArray310[0], 0, true);
			}
		}
		if (local29 == 30) {
			Static215.anInt4075 = 0;
			Static525.anInt4723 = arg1;
			Static501.anInt8621 = 2;
			Static52.anInt1497 = arg0;
			local62 = Static139.method2308(Static50.aClass130_22, Static24.aClass233_1);
			local62.aClass3_Sub3_Sub2_2.method4240(Static339.aClass163_1.method4104(82) ? 1 : 0);
			local62.aClass3_Sub3_Sub2_2.method4226(Integer.MAX_VALUE & (int) (local40 >>> 32));
			local62.aClass3_Sub3_Sub2_2.method4201(local26 + Static171.anInt3340);
			local62.aClass3_Sub3_Sub2_2.method4253(Static299.anInt5307 + local15);
			Static562.method8096(local62);
			Static216.method3633(local40, local26, local15);
		}
		if (local29 == 1006 || local29 == 1008 || local29 == 1001 || local29 == 1007 || local29 == 1010) {
			Static461.method7016(local15, local29, local33);
		}
		if (local29 == 6) {
			Static501.anInt8621 = 2;
			Static52.anInt1497 = arg0;
			Static215.anInt4075 = 0;
			Static525.anInt4723 = arg1;
			local62 = Static139.method2308(Static199.aClass130_59, Static24.aClass233_1);
			local62.aClass3_Sub3_Sub2_2.method4240(Static339.aClass163_1.method4104(82) ? 1 : 0);
			local62.aClass3_Sub3_Sub2_2.method4201(Static299.anInt5307 + local15);
			local62.aClass3_Sub3_Sub2_2.method4202(Static171.anInt3340 + local26);
			local62.aClass3_Sub3_Sub2_2.method4253(Integer.MAX_VALUE & (int) (local40 >>> 32));
			Static562.method8096(local62);
			Static216.method3633(local40, local26, local15);
		}
		if (local29 == 10) {
			local183 = Static42.aClass4_Sub1_Sub2_Sub1_Sub2Array1[local33];
			if (local183 != null) {
				Static215.anInt4075 = 0;
				Static501.anInt8621 = 2;
				Static525.anInt4723 = arg1;
				Static52.anInt1497 = arg0;
				local202 = Static139.method2308(Static454.aClass130_111, Static24.aClass233_1);
				local202.aClass3_Sub3_Sub2_2.method4253(local33);
				local202.aClass3_Sub3_Sub2_2.method4216(Static339.aClass163_1.method4104(82) ? 1 : 0);
				Static562.method8096(local202);
				Static396.method5709(local183.method5059(), 0, -2, local183.method5059(), local183.anIntArray309[0], local183.anIntArray310[0], 0, true);
			}
		}
		if (local29 == 1004) {
			Static525.anInt4723 = arg1;
			Static215.anInt4075 = 0;
			Static52.anInt1497 = arg0;
			Static501.anInt8621 = 2;
			local735 = (Class3_Sub28) Static551.aClass280_43.method7107((long) local33);
			if (local735 != null) {
				local752 = local735.aClass4_Sub1_Sub2_Sub1_Sub1_2;
				@Pc(1200) Class109 local1200 = local752.aClass109_1;
				if (local1200.anIntArray147 != null) {
					local1200 = local1200.method2813(Static373.aClass150_1);
				}
				if (local1200 != null) {
					@Pc(1219) Class3_Sub14 local1219 = Static139.method2308(Static533.aClass130_120, Static24.aClass233_1);
					local1219.aClass3_Sub3_Sub2_2.method4201(local1200.anInt3055);
					Static562.method8096(local1219);
				}
			}
		}
		if (local29 == 48) {
			Static525.anInt4723 = arg1;
			Static215.anInt4075 = 0;
			Static501.anInt8621 = 2;
			Static52.anInt1497 = arg0;
			local62 = Static139.method2308(Static443.aClass130_109, Static24.aClass233_1);
			local62.aClass3_Sub3_Sub2_2.method4202(local26 + Static171.anInt3340);
			local62.aClass3_Sub3_Sub2_2.method4226(local33);
			local62.aClass3_Sub3_Sub2_2.method4216(Static339.aClass163_1.method4104(82) ? 1 : 0);
			local62.aClass3_Sub3_Sub2_2.method4202(local15 + Static299.anInt5307);
			Static562.method8096(local62);
			Static240.method8602(local15, local26);
		}
		if (local29 == 5) {
			if (Static302.anInt5364 > 0 && Static339.aClass163_1.method4104(82) && Static339.aClass163_1.method4104(81)) {
				Static94.method2090(local26 + Static171.anInt3340, Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.aByte123, local15 + Static299.anInt5307);
			} else {
				local62 = Static126.method2498(local33, local26, local15);
				if (local33 == 1) {
					local62.aClass3_Sub3_Sub2_2.method4220(-1);
					local62.aClass3_Sub3_Sub2_2.method4220(-1);
					local62.aClass3_Sub3_Sub2_2.method4201((int) Static401.aFloat165);
					local62.aClass3_Sub3_Sub2_2.method4220(57);
					local62.aClass3_Sub3_Sub2_2.method4220(Static226.anInt1879);
					local62.aClass3_Sub3_Sub2_2.method4220(anInt8961);
					local62.aClass3_Sub3_Sub2_2.method4220(89);
					local62.aClass3_Sub3_Sub2_2.method4201(Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.anInt8916);
					local62.aClass3_Sub3_Sub2_2.method4201(Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.anInt8911);
					local62.aClass3_Sub3_Sub2_2.method4220(63);
				} else {
					Static525.anInt4723 = arg1;
					Static52.anInt1497 = arg0;
					Static501.anInt8621 = 1;
					Static215.anInt4075 = 0;
				}
				Static562.method8096(local62);
				Static396.method5709(1, 0, -4, 1, local26, local15, 0, true);
			}
		}
		if (local29 == 8) {
			Static501.anInt8621 = 2;
			Static525.anInt4723 = arg1;
			Static52.anInt1497 = arg0;
			Static215.anInt4075 = 0;
			local62 = Static139.method2308(Static233.aClass130_70, Static24.aClass233_1);
			local62.aClass3_Sub3_Sub2_2.method4253(Static433.anInt7818);
			local62.aClass3_Sub3_Sub2_2.method4240(Static339.aClass163_1.method4104(82) ? 1 : 0);
			local62.aClass3_Sub3_Sub2_2.method4202(Integer.MAX_VALUE & (int) (local40 >>> 32));
			local62.aClass3_Sub3_Sub2_2.method4202(Static299.anInt5307 + local15);
			local62.aClass3_Sub3_Sub2_2.method4253(Static235.anInt4449);
			local62.aClass3_Sub3_Sub2_2.method4226(Static171.anInt3340 + local26);
			local62.aClass3_Sub3_Sub2_2.method4266(Static161.anInt3179);
			Static562.method8096(local62);
			Static216.method3633(local40, local26, local15);
		}
		if (local29 == 60) {
			Static525.anInt4723 = arg1;
			Static501.anInt8621 = 2;
			Static215.anInt4075 = 0;
			Static52.anInt1497 = arg0;
			local62 = Static139.method2308(Static634.aClass130_136, Static24.aClass233_1);
			local62.aClass3_Sub3_Sub2_2.method4202(Static299.anInt5307 + local15);
			local62.aClass3_Sub3_Sub2_2.method4201(local26 + Static171.anInt3340);
			local62.aClass3_Sub3_Sub2_2.method4220(Static339.aClass163_1.method4104(82) ? 1 : 0);
			local62.aClass3_Sub3_Sub2_2.method4201(local33);
			Static562.method8096(local62);
			Static240.method8602(local15, local26);
		}
		if (local29 == 12) {
			local735 = (Class3_Sub28) Static551.aClass280_43.method7107((long) local33);
			if (local735 != null) {
				local752 = local735.aClass4_Sub1_Sub2_Sub1_Sub1_2;
				Static501.anInt8621 = 2;
				Static215.anInt4075 = 0;
				Static52.anInt1497 = arg0;
				Static525.anInt4723 = arg1;
				local757 = Static139.method2308(Static475.aClass130_112, Static24.aClass233_1);
				local757.aClass3_Sub3_Sub2_2.method4240(Static339.aClass163_1.method4104(82) ? 1 : 0);
				local757.aClass3_Sub3_Sub2_2.method4201(local33);
				Static562.method8096(local757);
				Static396.method5709(local752.method5059(), 0, -2, local752.method5059(), local752.anIntArray309[0], local752.anIntArray310[0], 0, true);
			}
		}
		if (local29 == 1012) {
			Static52.anInt1497 = arg0;
			Static501.anInt8621 = 2;
			Static525.anInt4723 = arg1;
			Static215.anInt4075 = 0;
			local62 = Static139.method2308(Static343.aClass130_92, Static24.aClass233_1);
			local62.aClass3_Sub3_Sub2_2.method4240(Static339.aClass163_1.method4104(82) ? 1 : 0);
			local62.aClass3_Sub3_Sub2_2.method4226((int) (local40 >>> 32) & Integer.MAX_VALUE);
			local62.aClass3_Sub3_Sub2_2.method4201(Static171.anInt3340 + local26);
			local62.aClass3_Sub3_Sub2_2.method4253(Static299.anInt5307 + local15);
			Static562.method8096(local62);
			Static216.method3633(local40, local26, local15);
		}
		if (local29 == 59) {
			local735 = (Class3_Sub28) Static551.aClass280_43.method7107((long) local33);
			if (local735 != null) {
				Static52.anInt1497 = arg0;
				Static525.anInt4723 = arg1;
				Static501.anInt8621 = 2;
				Static215.anInt4075 = 0;
				local752 = local735.aClass4_Sub1_Sub2_Sub1_Sub1_2;
				local757 = Static139.method2308(Static391.aClass130_100, Static24.aClass233_1);
				local757.aClass3_Sub3_Sub2_2.method4220(Static339.aClass163_1.method4104(82) ? 1 : 0);
				local757.aClass3_Sub3_Sub2_2.method4226(local33);
				Static562.method8096(local757);
				Static396.method5709(local752.method5059(), 0, -2, local752.method5059(), local752.anIntArray309[0], local752.anIntArray310[0], 0, true);
			}
		}
		if (local29 == 57) {
			Static525.anInt4723 = arg1;
			Static501.anInt8621 = 2;
			Static215.anInt4075 = 0;
			Static52.anInt1497 = arg0;
			local62 = Static139.method2308(Static121.aClass130_41, Static24.aClass233_1);
			local62.aClass3_Sub3_Sub2_2.method4253(Static433.anInt7818);
			local62.aClass3_Sub3_Sub2_2.method4253(local33);
			local62.aClass3_Sub3_Sub2_2.method4201(Static171.anInt3340 + local26);
			local62.aClass3_Sub3_Sub2_2.method4226(Static235.anInt4449);
			local62.aClass3_Sub3_Sub2_2.method4203(Static339.aClass163_1.method4104(82) ? 1 : 0);
			local62.aClass3_Sub3_Sub2_2.method4201(local15 + Static299.anInt5307);
			local62.aClass3_Sub3_Sub2_2.method4244(Static161.anInt3179);
			Static562.method8096(local62);
			Static240.method8602(local15, local26);
		}
		if (local29 == 22) {
			local183 = Static42.aClass4_Sub1_Sub2_Sub1_Sub2Array1[local33];
			if (local183 != null) {
				Static52.anInt1497 = arg0;
				Static501.anInt8621 = 2;
				Static215.anInt4075 = 0;
				Static525.anInt4723 = arg1;
				local202 = Static139.method2308(Static549.aClass130_124, Static24.aClass233_1);
				local202.aClass3_Sub3_Sub2_2.method4226(local33);
				local202.aClass3_Sub3_Sub2_2.method4253(Static235.anInt4449);
				local202.aClass3_Sub3_Sub2_2.method4266(Static161.anInt3179);
				local202.aClass3_Sub3_Sub2_2.method4216(Static339.aClass163_1.method4104(82) ? 1 : 0);
				local202.aClass3_Sub3_Sub2_2.method4253(Static433.anInt7818);
				Static562.method8096(local202);
				Static396.method5709(local183.method5059(), 0, -2, local183.method5059(), local183.anIntArray309[0], local183.anIntArray310[0], 0, true);
			}
		}
		if (local29 == 19) {
			local735 = (Class3_Sub28) Static551.aClass280_43.method7107((long) local33);
			if (local735 != null) {
				Static501.anInt8621 = 2;
				Static215.anInt4075 = 0;
				Static52.anInt1497 = arg0;
				local752 = local735.aClass4_Sub1_Sub2_Sub1_Sub1_2;
				Static525.anInt4723 = arg1;
				local757 = Static139.method2308(Static591.aClass130_132, Static24.aClass233_1);
				local757.aClass3_Sub3_Sub2_2.method4240(Static339.aClass163_1.method4104(82) ? 1 : 0);
				local757.aClass3_Sub3_Sub2_2.method4202(local33);
				Static562.method8096(local757);
				Static396.method5709(local752.method5059(), 0, -2, local752.method5059(), local752.anIntArray309[0], local752.anIntArray310[0], 0, true);
			}
		}
		if (local29 == 46) {
			local183 = Static42.aClass4_Sub1_Sub2_Sub1_Sub2Array1[local33];
			if (local183 != null) {
				Static215.anInt4075 = 0;
				Static525.anInt4723 = arg1;
				Static52.anInt1497 = arg0;
				Static501.anInt8621 = 2;
				local202 = Static139.method2308(Static159.aClass130_48, Static24.aClass233_1);
				local202.aClass3_Sub3_Sub2_2.method4220(Static339.aClass163_1.method4104(82) ? 1 : 0);
				local202.aClass3_Sub3_Sub2_2.method4253(local33);
				Static562.method8096(local202);
				Static396.method5709(local183.method5059(), 0, -2, local183.method5059(), local183.anIntArray309[0], local183.anIntArray310[0], 0, true);
			}
		}
		if (local29 == 4 && Static25.aClass279_13 == null) {
			Static352.method5822(local15, local26);
			Static25.aClass279_13 = Static406.method6473(local26, local15);
			Static482.method7193(Static25.aClass279_13);
		}
		if (local29 == 51) {
			Static52.anInt1497 = arg0;
			Static215.anInt4075 = 0;
			Static525.anInt4723 = arg1;
			Static501.anInt8621 = 2;
			local62 = Static139.method2308(Static73.aClass130_33, Static24.aClass233_1);
			local62.aClass3_Sub3_Sub2_2.method4253(local33);
			local62.aClass3_Sub3_Sub2_2.method4203(Static339.aClass163_1.method4104(82) ? 1 : 0);
			local62.aClass3_Sub3_Sub2_2.method4253(Static299.anInt5307 + local15);
			local62.aClass3_Sub3_Sub2_2.method4201(Static171.anInt3340 + local26);
			Static562.method8096(local62);
			Static240.method8602(local15, local26);
		}
		if (local29 == 50) {
			local183 = Static42.aClass4_Sub1_Sub2_Sub1_Sub2Array1[local33];
			if (local183 != null) {
				Static52.anInt1497 = arg0;
				Static215.anInt4075 = 0;
				Static525.anInt4723 = arg1;
				Static501.anInt8621 = 2;
				local202 = Static139.method2308(Static625.aClass130_138, Static24.aClass233_1);
				local202.aClass3_Sub3_Sub2_2.method4203(Static339.aClass163_1.method4104(82) ? 1 : 0);
				local202.aClass3_Sub3_Sub2_2.method4226(local33);
				Static562.method8096(local202);
				Static396.method5709(local183.method5059(), 0, -2, local183.method5059(), local183.anIntArray309[0], local183.anIntArray310[0], 0, true);
			}
		}
		if (local29 == 45 || local29 == 1002) {
			Static641.method8741(arg2.aString55, local33, local15, local26);
		}
		if (local29 == 58) {
			local183 = Static42.aClass4_Sub1_Sub2_Sub1_Sub2Array1[local33];
			if (local183 != null) {
				Static501.anInt8621 = 2;
				Static215.anInt4075 = 0;
				Static52.anInt1497 = arg0;
				Static525.anInt4723 = arg1;
				local202 = Static139.method2308(Static226.aClass130_35, Static24.aClass233_1);
				local202.aClass3_Sub3_Sub2_2.method4240(Static339.aClass163_1.method4104(82) ? 1 : 0);
				local202.aClass3_Sub3_Sub2_2.method4201(local33);
				Static562.method8096(local202);
				Static396.method5709(local183.method5059(), 0, -2, local183.method5059(), local183.anIntArray309[0], local183.anIntArray310[0], 0, true);
			}
		}
		@Pc(2292) Class279 local2292;
		if (local29 == 16) {
			local2292 = Static406.method6473(local26, local15);
			if (local2292 != null) {
				Static282.method4549();
				@Pc(2299) Class3_Sub15 local2299 = Static76.method1833(local2292);
				Static93.method2084(local2299.anInt2463, local2292, local2299.method2322());
				Static136.aString18 = Static203.method3500(local2292);
				if (Static136.aString18 == null) {
					Static136.aString18 = "Null";
				}
				Static11.aString107 = local2292.aString91 + "<col=ffffff>";
			}
			return;
		}
		if (local29 == 25) {
			local2292 = Static406.method6473(local26, local15);
			if (local2292 != null) {
				Static396.method5706(local2292);
			}
		}
		if (local29 == 1009) {
			Static52.anInt1497 = arg0;
			Static525.anInt4723 = arg1;
			Static215.anInt4075 = 0;
			Static501.anInt8621 = 2;
			local62 = Static139.method2308(Static307.aClass130_86, Static24.aClass233_1);
			local62.aClass3_Sub3_Sub2_2.method4201(local33);
			Static562.method8096(local62);
		}
		if (local29 == 49) {
			local735 = (Class3_Sub28) Static551.aClass280_43.method7107((long) local33);
			if (local735 != null) {
				Static525.anInt4723 = arg1;
				Static501.anInt8621 = 2;
				local752 = local735.aClass4_Sub1_Sub2_Sub1_Sub1_2;
				Static52.anInt1497 = arg0;
				Static215.anInt4075 = 0;
				local757 = Static139.method2308(Static246.aClass130_72, Static24.aClass233_1);
				local757.aClass3_Sub3_Sub2_2.method4226(local33);
				local757.aClass3_Sub3_Sub2_2.method4203(Static339.aClass163_1.method4104(82) ? 1 : 0);
				Static562.method8096(local757);
				Static396.method5709(local752.method5059(), 0, -2, local752.method5059(), local752.anIntArray309[0], local752.anIntArray310[0], 0, true);
			}
		}
		if (Static190.aBoolean232) {
			Static282.method4549();
		}
		if (Static77.aClass279_2 != null && Static368.anInt6960 == 0) {
			Static482.method7193(Static77.aClass279_2);
		}
	}
}
