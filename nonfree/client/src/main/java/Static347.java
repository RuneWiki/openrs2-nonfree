import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static347 {

	@OriginalMember(owner = "client!lm", name = "p", descriptor = "I")
	public static int anInt10656;

	@OriginalMember(owner = "client!lm", name = "u", descriptor = "Lclient!oo;")
	public static Class207 aClass207_39;

	@OriginalMember(owner = "client!lm", name = "m", descriptor = "Lclient!qk;")
	private static final Class289 aClass289_153 = new Class289(47, 3);

	@OriginalMember(owner = "client!lm", name = "q", descriptor = "I")
	public static int anInt10657 = 100;

	@OriginalMember(owner = "client!lm", name = "v", descriptor = "[I")
	public static final int[] anIntArray709 = new int[1000];

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lclient!qd;IZ)V")
	public static void method9039(@OriginalArg(0) Class6_Sub45 arg0, @OriginalArg(2) boolean arg1) {
		if (arg0.aBoolean558) {
			if (arg0.anInt8106 < 0 || Static360.method8250(arg0.anInt8106, arg0.anInt8105)) {
				if (arg1) {
					Static13.method9171((Class18) null, arg0.anInt8112, arg0.anInt8113, arg0.anInt8116, arg0.anInt8107);
				} else {
					Static175.method2479(arg0.anInt8113, arg0.anInt8116, arg0.anInt8111, arg0.anInt8106, arg0.anInt8112, -1, arg0.anInt8107, arg0.anInt8105);
				}
				arg0.method9174();
			}
		} else if (arg0.aBoolean559 && arg0.anInt8112 >= 1 && arg0.anInt8113 >= 1 && Static491.anInt9856 - 2 >= arg0.anInt8112 && Static393.anInt6574 - 2 >= arg0.anInt8113 && (arg0.anInt8110 < 0 || Static360.method8250(arg0.anInt8110, arg0.anInt8109))) {
			if (arg1) {
				Static13.method9171(arg0.aClass18_1, arg0.anInt8112, arg0.anInt8113, arg0.anInt8116, arg0.anInt8107);
			} else {
				Static175.method2479(arg0.anInt8113, arg0.anInt8116, arg0.anInt8115, arg0.anInt8110, arg0.anInt8112, -1, arg0.anInt8107, arg0.anInt8109);
			}
			arg0.aBoolean559 = false;
			if (!arg1 && arg0.anInt8106 == arg0.anInt8110 && arg0.anInt8106 == -1) {
				arg0.method9174();
			} else if (!arg1 && arg0.anInt8110 == arg0.anInt8106 && arg0.anInt8115 == arg0.anInt8111 && arg0.anInt8105 == arg0.anInt8109) {
				arg0.method9174();
			}
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IBLclient!pja;I)V")
	public static void method9040(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub4_Sub12 arg1, @OriginalArg(3) int arg2) {
		if (arg1 == null || arg1 == Static31.aClass362_3.aClass6_312) {
			return;
		}
		@Pc(15) int local15 = arg1.anInt7579;
		@Pc(18) int local18 = arg1.anInt7581;
		@Pc(21) int local21 = arg1.anInt7577;
		@Pc(25) int local25 = (int) arg1.aLong224;
		@Pc(28) long local28 = arg1.aLong224;
		if (local21 >= 2000) {
			local21 -= 2000;
		}
		@Pc(54) Class6_Sub26 local54;
		if (local21 == 5) {
			Static424.anInt7322 = arg2;
			Static642.anInt10379 = 2;
			Static349.anInt5939 = 0;
			Static630.anInt6211 = arg0;
			local54 = Static268.method3981(Static377.aClass15_2, Static129.aClass289_40);
			local54.aClass6_Sub23_Sub1_2.method8342((int) (local28 >>> 32) & Integer.MAX_VALUE);
			local54.aClass6_Sub23_Sub1_2.method8338(local18 + Static234.anInt4239);
			local54.aClass6_Sub23_Sub1_2.method8349(Static170.aClass4_1.method1024(82) ? 1 : 0);
			local54.aClass6_Sub23_Sub1_2.method8347(Static534.anInt8753 + local15);
			Static670.method9077(local54);
			Static477.method6984(local15, local18, local28);
		}
		if (local21 == 20 || local21 == 1008) {
			Static488.method7083(local15, local18, arg1.aString98, local25);
		}
		@Pc(133) Class2_Sub1_Sub1_Sub3_Sub2 local133;
		@Pc(148) Class6_Sub26 local148;
		@Pc(126) Class6_Sub44 local126;
		if (local21 == 58) {
			local126 = (Class6_Sub44) Static349.aClass209_32.method5038((long) local25);
			if (local126 != null) {
				Static424.anInt7322 = arg2;
				local133 = local126.aClass2_Sub1_Sub1_Sub3_Sub2_2;
				Static642.anInt10379 = 2;
				Static349.anInt5939 = 0;
				Static630.anInt6211 = arg0;
				local148 = Static268.method3981(Static377.aClass15_2, Static3.aClass289_19);
				local148.aClass6_Sub23_Sub1_2.method8362(Static170.aClass4_1.method1024(82) ? 1 : 0);
				local148.aClass6_Sub23_Sub1_2.method8338(local25);
				Static670.method9077(local148);
				Static508.method8438(true, 0, local133.method4326(), -2, local133.anIntArray301[0], 0, local133.method4326(), local133.anIntArray302[0]);
			}
		}
		if (local21 == 1012 || local21 == 1002 || local21 == 1007 || local21 == 1009 || local21 == 1006) {
			Static231.method3391(local25, local15, local21);
		}
		if (local21 == 11 && Static590.aClass321_53 == null) {
			Static561.method7896(local18, local15);
			Static590.aClass321_53 = Static640.method8748(local18, local15);
			Static293.method4206(Static590.aClass321_53);
		}
		if (local21 == 23) {
			local126 = (Class6_Sub44) Static349.aClass209_32.method5038((long) local25);
			if (local126 != null) {
				Static349.anInt5939 = 0;
				Static630.anInt6211 = arg0;
				local133 = local126.aClass2_Sub1_Sub1_Sub3_Sub2_2;
				Static424.anInt7322 = arg2;
				Static642.anInt10379 = 2;
				local148 = Static268.method3981(Static377.aClass15_2, Static551.aClass289_124);
				local148.aClass6_Sub23_Sub1_2.method8338(local25);
				local148.aClass6_Sub23_Sub1_2.method8362(Static170.aClass4_1.method1024(82) ? 1 : 0);
				Static670.method9077(local148);
				Static508.method8438(true, 0, local133.method4326(), -2, local133.anIntArray301[0], 0, local133.method4326(), local133.anIntArray302[0]);
			}
		}
		@Pc(312) Class2_Sub1_Sub1_Sub3_Sub1 local312;
		@Pc(331) Class6_Sub26 local331;
		if (local21 == 2) {
			local312 = Static20.aClass2_Sub1_Sub1_Sub3_Sub1Array1[local25];
			if (local312 != null) {
				Static424.anInt7322 = arg2;
				Static349.anInt5939 = 0;
				Static630.anInt6211 = arg0;
				Static642.anInt10379 = 2;
				local331 = Static268.method3981(Static377.aClass15_2, aClass289_153);
				local331.aClass6_Sub23_Sub1_2.method8366(Static170.aClass4_1.method1024(82) ? 1 : 0);
				local331.aClass6_Sub23_Sub1_2.method8342(local25);
				Static670.method9077(local331);
				Static508.method8438(true, 0, local312.method4326(), -2, local312.anIntArray301[0], 0, local312.method4326(), local312.anIntArray302[0]);
			}
		}
		if (local21 == 52) {
			local312 = Static20.aClass2_Sub1_Sub1_Sub3_Sub1Array1[local25];
			if (local312 != null) {
				Static642.anInt10379 = 2;
				Static349.anInt5939 = 0;
				Static630.anInt6211 = arg0;
				Static424.anInt7322 = arg2;
				local331 = Static268.method3981(Static377.aClass15_2, Static221.aClass289_55);
				local331.aClass6_Sub23_Sub1_2.method8338(local25);
				local331.aClass6_Sub23_Sub1_2.method8362(Static170.aClass4_1.method1024(82) ? 1 : 0);
				Static670.method9077(local331);
				Static508.method8438(true, 0, local312.method4326(), -2, local312.anIntArray301[0], 0, local312.method4326(), local312.anIntArray302[0]);
			}
		}
		if (local21 == 1003) {
			Static424.anInt7322 = arg2;
			Static630.anInt6211 = arg0;
			Static642.anInt10379 = 2;
			Static349.anInt5939 = 0;
			local54 = Static268.method3981(Static377.aClass15_2, Static390.aClass289_95);
			local54.aClass6_Sub23_Sub1_2.method8347(local25);
			Static670.method9077(local54);
		}
		if (local21 == 44) {
			Static630.anInt6211 = arg0;
			Static642.anInt10379 = 2;
			Static349.anInt5939 = 0;
			Static424.anInt7322 = arg2;
			local54 = Static268.method3981(Static377.aClass15_2, Static438.aClass289_47);
			local54.aClass6_Sub23_Sub1_2.method8347(Integer.MAX_VALUE & (int) (local28 >>> 32));
			local54.aClass6_Sub23_Sub1_2.method8338(Static534.anInt8753 + local15);
			local54.aClass6_Sub23_Sub1_2.method8342(local18 + Static234.anInt4239);
			local54.aClass6_Sub23_Sub1_2.method8396(Static170.aClass4_1.method1024(82) ? 1 : 0);
			Static670.method9077(local54);
			Static477.method6984(local15, local18, local28);
		}
		if (local21 == 1001) {
			Static642.anInt10379 = 2;
			Static630.anInt6211 = arg0;
			Static349.anInt5939 = 0;
			Static424.anInt7322 = arg2;
			local54 = Static268.method3981(Static377.aClass15_2, Static313.aClass289_79);
			local54.aClass6_Sub23_Sub1_2.method8338((int) (local28 >>> 32) & Integer.MAX_VALUE);
			local54.aClass6_Sub23_Sub1_2.method8349(Static170.aClass4_1.method1024(82) ? 1 : 0);
			local54.aClass6_Sub23_Sub1_2.method8347(local15 + Static534.anInt8753);
			local54.aClass6_Sub23_Sub1_2.method8347(local18 + Static234.anInt4239);
			Static670.method9077(local54);
			Static477.method6984(local15, local18, local28);
		}
		if (local21 == 8) {
			local312 = Static20.aClass2_Sub1_Sub1_Sub3_Sub1Array1[local25];
			if (local312 != null) {
				Static642.anInt10379 = 2;
				Static424.anInt7322 = arg2;
				Static349.anInt5939 = 0;
				Static630.anInt6211 = arg0;
				local331 = Static268.method3981(Static377.aClass15_2, Static474.aClass289_104);
				local331.aClass6_Sub23_Sub1_2.method8349(Static170.aClass4_1.method1024(82) ? 1 : 0);
				local331.aClass6_Sub23_Sub1_2.method8338(local25);
				local331.aClass6_Sub23_Sub1_2.method8364(Static663.anInt9822);
				local331.aClass6_Sub23_Sub1_2.method8347(Static489.anInt8324);
				local331.aClass6_Sub23_Sub1_2.method8338(Static672.anInt10372);
				Static670.method9077(local331);
				Static508.method8438(true, 0, local312.method4326(), -2, local312.anIntArray301[0], 0, local312.method4326(), local312.anIntArray302[0]);
			}
		}
		if (local21 == 3) {
			local312 = Static20.aClass2_Sub1_Sub1_Sub3_Sub1Array1[local25];
			if (local312 != null) {
				Static424.anInt7322 = arg2;
				Static349.anInt5939 = 0;
				Static642.anInt10379 = 2;
				Static630.anInt6211 = arg0;
				local331 = Static268.method3981(Static377.aClass15_2, Static663.aClass289_144);
				local331.aClass6_Sub23_Sub1_2.method8366(Static170.aClass4_1.method1024(82) ? 1 : 0);
				local331.aClass6_Sub23_Sub1_2.method8338(local25);
				Static670.method9077(local331);
				Static508.method8438(true, 0, local312.method4326(), -2, local312.anIntArray301[0], 0, local312.method4326(), local312.anIntArray302[0]);
			}
		}
		if (local21 == 13) {
			local126 = (Class6_Sub44) Static349.aClass209_32.method5038((long) local25);
			if (local126 != null) {
				Static642.anInt10379 = 2;
				local133 = local126.aClass2_Sub1_Sub1_Sub3_Sub2_2;
				Static424.anInt7322 = arg2;
				Static630.anInt6211 = arg0;
				Static349.anInt5939 = 0;
				local148 = Static268.method3981(Static377.aClass15_2, Static29.aClass289_99);
				local148.aClass6_Sub23_Sub1_2.method8366(Static170.aClass4_1.method1024(82) ? 1 : 0);
				local148.aClass6_Sub23_Sub1_2.method8347(local25);
				Static670.method9077(local148);
				Static508.method8438(true, 0, local133.method4326(), -2, local133.anIntArray301[0], 0, local133.method4326(), local133.anIntArray302[0]);
			}
		}
		if (local21 == 60) {
			Static630.anInt6211 = arg0;
			Static424.anInt7322 = arg2;
			Static642.anInt10379 = 2;
			Static349.anInt5939 = 0;
			local54 = Static268.method3981(Static377.aClass15_2, Static399.aClass289_100);
			local54.aClass6_Sub23_Sub1_2.method8342(local18 + Static234.anInt4239);
			local54.aClass6_Sub23_Sub1_2.method8347((int) (local28 >>> 32) & Integer.MAX_VALUE);
			local54.aClass6_Sub23_Sub1_2.method8338(Static534.anInt8753 + local15);
			local54.aClass6_Sub23_Sub1_2.method8362(Static170.aClass4_1.method1024(82) ? 1 : 0);
			Static670.method9077(local54);
			Static477.method6984(local15, local18, local28);
		}
		if (local21 == 46) {
			Static349.anInt5939 = 0;
			Static642.anInt10379 = 2;
			Static630.anInt6211 = arg0;
			Static424.anInt7322 = arg2;
			local54 = Static268.method3981(Static377.aClass15_2, Static276.aClass289_68);
			local54.aClass6_Sub23_Sub1_2.method8338(local25);
			local54.aClass6_Sub23_Sub1_2.method8338(Static672.anInt10372);
			local54.aClass6_Sub23_Sub1_2.method8352(Static663.anInt9822);
			local54.aClass6_Sub23_Sub1_2.method8347(Static489.anInt8324);
			local54.aClass6_Sub23_Sub1_2.method8362(Static170.aClass4_1.method1024(82) ? 1 : 0);
			local54.aClass6_Sub23_Sub1_2.method8342(local15 + Static534.anInt8753);
			local54.aClass6_Sub23_Sub1_2.method8405(local18 + Static234.anInt4239);
			Static670.method9077(local54);
			Static621.method8564(local15, local18);
		}
		if (local21 == 1011) {
			Static424.anInt7322 = arg2;
			Static642.anInt10379 = 2;
			Static630.anInt6211 = arg0;
			Static349.anInt5939 = 0;
			local54 = Static268.method3981(Static377.aClass15_2, Static436.aClass289_105);
			local54.aClass6_Sub23_Sub1_2.method8347(local25);
			Static670.method9077(local54);
		}
		if (local21 == 47) {
			local126 = (Class6_Sub44) Static349.aClass209_32.method5038((long) local25);
			if (local126 != null) {
				Static349.anInt5939 = 0;
				local133 = local126.aClass2_Sub1_Sub1_Sub3_Sub2_2;
				Static630.anInt6211 = arg0;
				Static424.anInt7322 = arg2;
				Static642.anInt10379 = 2;
				local148 = Static268.method3981(Static377.aClass15_2, Static635.aClass289_147);
				local148.aClass6_Sub23_Sub1_2.method8342(Static672.anInt10372);
				local148.aClass6_Sub23_Sub1_2.method8357(Static663.anInt9822);
				local148.aClass6_Sub23_Sub1_2.method8405(local25);
				local148.aClass6_Sub23_Sub1_2.method8347(Static489.anInt8324);
				local148.aClass6_Sub23_Sub1_2.method8349(Static170.aClass4_1.method1024(82) ? 1 : 0);
				Static670.method9077(local148);
				Static508.method8438(true, 0, local133.method4326(), -2, local133.anIntArray301[0], 0, local133.method4326(), local133.anIntArray302[0]);
			}
		}
		@Pc(1096) Class321 local1096;
		if (local21 == 22) {
			local1096 = Static640.method8748(local18, local15);
			if (local1096 != null) {
				Static173.method2468(local1096);
			}
		}
		if (local21 == 53) {
			local312 = Static20.aClass2_Sub1_Sub1_Sub3_Sub1Array1[local25];
			if (local312 != null) {
				Static424.anInt7322 = arg2;
				Static642.anInt10379 = 2;
				Static630.anInt6211 = arg0;
				Static349.anInt5939 = 0;
				local331 = Static268.method3981(Static377.aClass15_2, Static650.aClass289_150);
				local331.aClass6_Sub23_Sub1_2.method8366(Static170.aClass4_1.method1024(82) ? 1 : 0);
				local331.aClass6_Sub23_Sub1_2.method8405(local25);
				Static670.method9077(local331);
				Static508.method8438(true, 0, local312.method4326(), -2, local312.anIntArray301[0], 0, local312.method4326(), local312.anIntArray302[0]);
			}
		}
		if (local21 == 48) {
			local312 = Static20.aClass2_Sub1_Sub1_Sub3_Sub1Array1[local25];
			if (local312 != null) {
				Static349.anInt5939 = 0;
				Static630.anInt6211 = arg0;
				Static642.anInt10379 = 2;
				Static424.anInt7322 = arg2;
				local331 = Static268.method3981(Static377.aClass15_2, Static441.aClass289_107);
				local331.aClass6_Sub23_Sub1_2.method8366(Static170.aClass4_1.method1024(82) ? 1 : 0);
				local331.aClass6_Sub23_Sub1_2.method8405(local25);
				Static670.method9077(local331);
				Static508.method8438(true, 0, local312.method4326(), -2, local312.anIntArray301[0], 0, local312.method4326(), local312.anIntArray302[0]);
			}
		}
		if (local21 == 51) {
			local126 = (Class6_Sub44) Static349.aClass209_32.method5038((long) local25);
			if (local126 != null) {
				Static630.anInt6211 = arg0;
				Static349.anInt5939 = 0;
				Static642.anInt10379 = 2;
				Static424.anInt7322 = arg2;
				local133 = local126.aClass2_Sub1_Sub1_Sub3_Sub2_2;
				local148 = Static268.method3981(Static377.aClass15_2, Static538.aClass289_34);
				local148.aClass6_Sub23_Sub1_2.method8362(Static170.aClass4_1.method1024(82) ? 1 : 0);
				local148.aClass6_Sub23_Sub1_2.method8338(local25);
				Static670.method9077(local148);
				Static508.method8438(true, 0, local133.method4326(), -2, local133.anIntArray301[0], 0, local133.method4326(), local133.anIntArray302[0]);
			}
		}
		if (local21 == 16) {
			Static642.anInt10379 = 2;
			Static424.anInt7322 = arg2;
			Static349.anInt5939 = 0;
			Static630.anInt6211 = arg0;
			local54 = Static268.method3981(Static377.aClass15_2, Static33.aClass289_13);
			local54.aClass6_Sub23_Sub1_2.method8338(local15 + Static534.anInt8753);
			local54.aClass6_Sub23_Sub1_2.method8338(Static234.anInt4239 + local18);
			local54.aClass6_Sub23_Sub1_2.method8396(Static170.aClass4_1.method1024(82) ? 1 : 0);
			local54.aClass6_Sub23_Sub1_2.method8338(local25);
			Static670.method9077(local54);
			Static621.method8564(local15, local18);
		}
		if (local21 == 50) {
			Static349.anInt5939 = 0;
			Static642.anInt10379 = 2;
			Static630.anInt6211 = arg0;
			Static424.anInt7322 = arg2;
			local54 = Static268.method3981(Static377.aClass15_2, Static41.aClass289_16);
			local54.aClass6_Sub23_Sub1_2.method8338(local18 + Static234.anInt4239);
			local54.aClass6_Sub23_Sub1_2.method8362(Static170.aClass4_1.method1024(82) ? 1 : 0);
			local54.aClass6_Sub23_Sub1_2.method8338(Static534.anInt8753 + local15);
			local54.aClass6_Sub23_Sub1_2.method8338(Integer.MAX_VALUE & (int) (local28 >>> 32));
			Static670.method9077(local54);
			Static477.method6984(local15, local18, local28);
		}
		if (local21 == 57) {
			local1096 = Static640.method8748(local18, local15);
			if (local1096 != null) {
				Static221.method3209();
				@Pc(1455) Class6_Sub42 local1455 = Static83.method1453(local1096);
				Static31.method715(local1096, local1455.anInt6749, local1455.method5790());
				Static355.aString75 = Static674.method8277(local1096);
				if (Static355.aString75 == null) {
					Static355.aString75 = "Null";
				}
				Static172.aString32 = local1096.aString123 + "<col=ffffff>";
			}
			return;
		}
		if (local21 == 12) {
			Static630.anInt6211 = arg0;
			Static424.anInt7322 = arg2;
			Static642.anInt10379 = 2;
			Static349.anInt5939 = 0;
			local54 = Static268.method3981(Static377.aClass15_2, Static562.aClass289_134);
			local54.aClass6_Sub23_Sub1_2.method8405(Static234.anInt4239 + local18);
			local54.aClass6_Sub23_Sub1_2.method8366(Static170.aClass4_1.method1024(82) ? 1 : 0);
			local54.aClass6_Sub23_Sub1_2.method8386(Static663.anInt9822);
			local54.aClass6_Sub23_Sub1_2.method8338(Static672.anInt10372);
			local54.aClass6_Sub23_Sub1_2.method8405(Static534.anInt8753 + local15);
			local54.aClass6_Sub23_Sub1_2.method8347(Static489.anInt8324);
			local54.aClass6_Sub23_Sub1_2.method8342((int) (local28 >>> 32) & Integer.MAX_VALUE);
			Static670.method9077(local54);
			Static477.method6984(local15, local18, local28);
		}
		if (local21 == 10) {
			Static630.anInt6211 = arg0;
			Static349.anInt5939 = 0;
			Static424.anInt7322 = arg2;
			Static642.anInt10379 = 2;
			local54 = Static268.method3981(Static377.aClass15_2, Static630.aClass289_87);
			local54.aClass6_Sub23_Sub1_2.method8405(local25);
			local54.aClass6_Sub23_Sub1_2.method8342(Static234.anInt4239 + local18);
			local54.aClass6_Sub23_Sub1_2.method8396(Static170.aClass4_1.method1024(82) ? 1 : 0);
			local54.aClass6_Sub23_Sub1_2.method8347(Static534.anInt8753 + local15);
			Static670.method9077(local54);
			Static621.method8564(local15, local18);
		}
		if (local21 == 25) {
			local312 = Static20.aClass2_Sub1_Sub1_Sub3_Sub1Array1[local25];
			if (local312 != null) {
				Static630.anInt6211 = arg0;
				Static642.anInt10379 = 2;
				Static424.anInt7322 = arg2;
				Static349.anInt5939 = 0;
				local331 = Static268.method3981(Static377.aClass15_2, Static197.aClass289_54);
				local331.aClass6_Sub23_Sub1_2.method8396(Static170.aClass4_1.method1024(82) ? 1 : 0);
				local331.aClass6_Sub23_Sub1_2.method8338(local25);
				Static670.method9077(local331);
				Static508.method8438(true, 0, local312.method4326(), -2, local312.anIntArray301[0], 0, local312.method4326(), local312.anIntArray302[0]);
			}
		}
		if (local21 == 18) {
			Static642.anInt10379 = 2;
			Static630.anInt6211 = arg0;
			Static349.anInt5939 = 0;
			Static424.anInt7322 = arg2;
			local54 = Static268.method3981(Static377.aClass15_2, Static578.aClass289_141);
			local54.aClass6_Sub23_Sub1_2.method8338(local18 + Static234.anInt4239);
			local54.aClass6_Sub23_Sub1_2.method8347(local25);
			local54.aClass6_Sub23_Sub1_2.method8338(local15 + Static534.anInt8753);
			local54.aClass6_Sub23_Sub1_2.method8349(Static170.aClass4_1.method1024(82) ? 1 : 0);
			Static670.method9077(local54);
			Static621.method8564(local15, local18);
		}
		if (local21 == 19) {
			local312 = Static20.aClass2_Sub1_Sub1_Sub3_Sub1Array1[local25];
			if (local312 != null) {
				Static349.anInt5939 = 0;
				Static630.anInt6211 = arg0;
				Static424.anInt7322 = arg2;
				Static642.anInt10379 = 2;
				local331 = Static268.method3981(Static377.aClass15_2, Static441.aClass289_108);
				local331.aClass6_Sub23_Sub1_2.method8396(Static170.aClass4_1.method1024(82) ? 1 : 0);
				local331.aClass6_Sub23_Sub1_2.method8405(local25);
				Static670.method9077(local331);
				Static508.method8438(true, 0, local312.method4326(), -2, local312.anIntArray301[0], 0, local312.method4326(), local312.anIntArray302[0]);
			}
		}
		if (local21 == 6) {
			Static630.anInt6211 = arg0;
			Static424.anInt7322 = arg2;
			Static349.anInt5939 = 0;
			Static642.anInt10379 = 2;
			local54 = Static268.method3981(Static377.aClass15_2, Static474.aClass289_104);
			local54.aClass6_Sub23_Sub1_2.method8349(Static170.aClass4_1.method1024(82) ? 1 : 0);
			local54.aClass6_Sub23_Sub1_2.method8338(Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.anInt5103);
			local54.aClass6_Sub23_Sub1_2.method8364(Static663.anInt9822);
			local54.aClass6_Sub23_Sub1_2.method8347(Static489.anInt8324);
			local54.aClass6_Sub23_Sub1_2.method8338(Static672.anInt10372);
			Static670.method9077(local54);
		}
		if (local21 == 21) {
			Static349.anInt5939 = 0;
			Static630.anInt6211 = arg0;
			Static424.anInt7322 = arg2;
			Static642.anInt10379 = 2;
			local54 = Static268.method3981(Static377.aClass15_2, Static113.aClass289_36);
			local54.aClass6_Sub23_Sub1_2.method8405(local15 + Static534.anInt8753);
			local54.aClass6_Sub23_Sub1_2.method8405(local18 + Static234.anInt4239);
			local54.aClass6_Sub23_Sub1_2.method8338(local25);
			local54.aClass6_Sub23_Sub1_2.method8362(Static170.aClass4_1.method1024(82) ? 1 : 0);
			Static670.method9077(local54);
			Static621.method8564(local15, local18);
		}
		if (local21 == 4) {
			local126 = (Class6_Sub44) Static349.aClass209_32.method5038((long) local25);
			if (local126 != null) {
				Static424.anInt7322 = arg2;
				Static642.anInt10379 = 2;
				Static630.anInt6211 = arg0;
				local133 = local126.aClass2_Sub1_Sub1_Sub3_Sub2_2;
				Static349.anInt5939 = 0;
				local148 = Static268.method3981(Static377.aClass15_2, Static456.aClass289_113);
				local148.aClass6_Sub23_Sub1_2.method8366(Static170.aClass4_1.method1024(82) ? 1 : 0);
				local148.aClass6_Sub23_Sub1_2.method8405(local25);
				Static670.method9077(local148);
				Static508.method8438(true, 0, local133.method4326(), -2, local133.anIntArray301[0], 0, local133.method4326(), local133.anIntArray302[0]);
			}
		}
		if (local21 == 49) {
			local312 = Static20.aClass2_Sub1_Sub1_Sub3_Sub1Array1[local25];
			if (local312 != null) {
				Static630.anInt6211 = arg0;
				Static424.anInt7322 = arg2;
				Static349.anInt5939 = 0;
				Static642.anInt10379 = 2;
				local331 = Static268.method3981(Static377.aClass15_2, Static540.aClass289_129);
				local331.aClass6_Sub23_Sub1_2.method8342(local25);
				local331.aClass6_Sub23_Sub1_2.method8396(Static170.aClass4_1.method1024(82) ? 1 : 0);
				Static670.method9077(local331);
				Static508.method8438(true, 0, local312.method4326(), -2, local312.anIntArray301[0], 0, local312.method4326(), local312.anIntArray302[0]);
			}
		}
		if (local21 == 17) {
			local312 = Static20.aClass2_Sub1_Sub1_Sub3_Sub1Array1[local25];
			if (local312 != null) {
				Static642.anInt10379 = 2;
				Static424.anInt7322 = arg2;
				Static349.anInt5939 = 0;
				Static630.anInt6211 = arg0;
				local331 = Static268.method3981(Static377.aClass15_2, Static372.aClass289_88);
				local331.aClass6_Sub23_Sub1_2.method8347(local25);
				local331.aClass6_Sub23_Sub1_2.method8396(Static170.aClass4_1.method1024(82) ? 1 : 0);
				Static670.method9077(local331);
				Static508.method8438(true, 0, local312.method4326(), -2, local312.anIntArray301[0], 0, local312.method4326(), local312.anIntArray302[0]);
			}
		}
		if (local21 == 30) {
			local312 = Static20.aClass2_Sub1_Sub1_Sub3_Sub1Array1[local25];
			if (local312 != null) {
				Static349.anInt5939 = 0;
				Static630.anInt6211 = arg0;
				Static642.anInt10379 = 2;
				Static424.anInt7322 = arg2;
				local331 = Static268.method3981(Static377.aClass15_2, Static565.aClass289_136);
				local331.aClass6_Sub23_Sub1_2.method8338(local25);
				local331.aClass6_Sub23_Sub1_2.method8349(Static170.aClass4_1.method1024(82) ? 1 : 0);
				Static670.method9077(local331);
				Static508.method8438(true, 0, local312.method4326(), -2, local312.anIntArray301[0], 0, local312.method4326(), local312.anIntArray302[0]);
			}
		}
		if (local21 == 15) {
			Static424.anInt7322 = arg2;
			Static642.anInt10379 = 1;
			Static630.anInt6211 = arg0;
			Static349.anInt5939 = 0;
			local54 = Static268.method3981(Static377.aClass15_2, Static458.aClass289_114);
			local54.aClass6_Sub23_Sub1_2.method8342(Static234.anInt4239 + local18);
			local54.aClass6_Sub23_Sub1_2.method8338(Static489.anInt8324);
			local54.aClass6_Sub23_Sub1_2.method8352(Static663.anInt9822);
			local54.aClass6_Sub23_Sub1_2.method8405(local15 + Static534.anInt8753);
			local54.aClass6_Sub23_Sub1_2.method8405(Static672.anInt10372);
			Static670.method9077(local54);
			Static508.method8438(true, 0, 1, -4, local18, 0, 1, local15);
		}
		if (local21 == 1004) {
			Static630.anInt6211 = arg0;
			Static642.anInt10379 = 2;
			Static424.anInt7322 = arg2;
			Static349.anInt5939 = 0;
			local126 = (Class6_Sub44) Static349.aClass209_32.method5038((long) local25);
			if (local126 != null) {
				local133 = local126.aClass2_Sub1_Sub1_Sub3_Sub2_2;
				@Pc(2300) Class91 local2300 = local133.aClass91_1;
				if (local2300.anIntArray140 != null) {
					local2300 = local2300.method2036(Static659.aClass363_3);
				}
				if (local2300 != null) {
					@Pc(2319) Class6_Sub26 local2319 = Static268.method3981(Static377.aClass15_2, Static515.aClass289_126);
					local2319.aClass6_Sub23_Sub1_2.method8347(local2300.anInt2361);
					Static670.method9077(local2319);
				}
			}
		}
		if (local21 == 45) {
			if (Static26.anInt609 > 0 && Static170.aClass4_1.method1024(82) && Static170.aClass4_1.method1024(81)) {
				Static48.method964(local15 + Static534.anInt8753, Static234.anInt4239 - -local18, Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.aByte140);
			} else {
				local54 = Static234.method3563(local25, local18, local15);
				if (local25 == 1) {
					local54.aClass6_Sub23_Sub1_2.method8366(-1);
					local54.aClass6_Sub23_Sub1_2.method8366(-1);
					local54.aClass6_Sub23_Sub1_2.method8347((int) Static228.aFloat26);
					local54.aClass6_Sub23_Sub1_2.method8366(57);
					local54.aClass6_Sub23_Sub1_2.method8366(Static553.anInt9285);
					local54.aClass6_Sub23_Sub1_2.method8366(Static605.anInt9842);
					local54.aClass6_Sub23_Sub1_2.method8366(89);
					local54.aClass6_Sub23_Sub1_2.method8347(Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.anInt10006);
					local54.aClass6_Sub23_Sub1_2.method8347(Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.anInt10001);
					local54.aClass6_Sub23_Sub1_2.method8366(63);
				} else {
					Static424.anInt7322 = arg2;
					Static630.anInt6211 = arg0;
					Static642.anInt10379 = 1;
					Static349.anInt5939 = 0;
				}
				Static670.method9077(local54);
				Static508.method8438(true, 0, 1, -4, local18, 0, 1, local15);
			}
		}
		if (local21 == 59) {
			if (Static26.anInt609 > 0 && Static170.aClass4_1.method1024(82) && Static170.aClass4_1.method1024(81)) {
				Static48.method964(local15 + Static534.anInt8753, Static234.anInt4239 - -local18, Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.aByte140);
			} else {
				Static349.anInt5939 = 0;
				Static642.anInt10379 = 1;
				Static630.anInt6211 = arg0;
				Static424.anInt7322 = arg2;
				local54 = Static268.method3981(Static377.aClass15_2, Static86.aClass289_28);
				local54.aClass6_Sub23_Sub1_2.method8405(local15 + Static534.anInt8753);
				local54.aClass6_Sub23_Sub1_2.method8338(Static234.anInt4239 + local18);
				Static670.method9077(local54);
			}
		}
		if (local21 == 9) {
			Static642.anInt10379 = 2;
			Static630.anInt6211 = arg0;
			Static424.anInt7322 = arg2;
			Static349.anInt5939 = 0;
			local54 = Static268.method3981(Static377.aClass15_2, Static74.aClass289_24);
			local54.aClass6_Sub23_Sub1_2.method8342(local18 + Static234.anInt4239);
			local54.aClass6_Sub23_Sub1_2.method8342(local15 + Static534.anInt8753);
			local54.aClass6_Sub23_Sub1_2.method8338(local25);
			local54.aClass6_Sub23_Sub1_2.method8362(Static170.aClass4_1.method1024(82) ? 1 : 0);
			Static670.method9077(local54);
			Static621.method8564(local15, local18);
		}
		if (Static291.aBoolean314) {
			Static221.method3209();
		}
		if (Static472.aClass321_37 != null && Static33.anInt810 == 0) {
			Static293.method4206(Static472.aClass321_37);
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IZIII)V")
	public static void method9041(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static506.method7223(arg3)) {
			Static70.method1235(arg1, arg2, -1, arg0, Static109.aClass321ArrayArray1[arg3]);
		}
	}
}
