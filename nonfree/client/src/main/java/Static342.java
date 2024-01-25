import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static342 {

	@OriginalMember(owner = "client!lha", name = "C", descriptor = "Lclient!dn;")
	public static Class35 aClass35_2;

	@OriginalMember(owner = "client!lha", name = "G", descriptor = "Ljava/lang/String;")
	public static String aString58 = "";

	@OriginalMember(owner = "client!lha", name = "b", descriptor = "(I)V")
	public static void method5130() {
		@Pc(15) int local15 = Static24.aClass3_Sub22_4.aClass6_Sub25_2.method8119();
		if (local15 == 0) {
			Static302.aByteArrayArrayArray18 = null;
			Static199.method3583(0);
		} else if (local15 == 1) {
			Static448.method6560((byte) 0);
			Static199.method3583(512);
			if (Static90.aByteArrayArrayArray25 != null) {
				Static456.method8140();
			}
		} else {
			Static448.method6560((byte) (Static58.anInt1217 - 4 & 0xFF));
			Static199.method3583(2);
		}
		Static202.anInt3393 = Static309.anInt5138;
	}

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "(Lclient!jp;Z)Lclient!paa;")
	public static Class106 method5131(@OriginalArg(0) Class3_Sub25 arg0) {
		@Pc(10) Class356 local10 = Static126.method2369()[arg0.method8632()];
		@Pc(22) Class56 local22 = Static398.method5612()[arg0.method8632()];
		@Pc(26) int local26 = arg0.method8589();
		@Pc(30) int local30 = arg0.method8589();
		@Pc(34) int local34 = arg0.method8593();
		@Pc(38) int local38 = arg0.method8593();
		@Pc(42) int local42 = arg0.method8589();
		@Pc(46) int local46 = arg0.method8618();
		@Pc(50) int local50 = arg0.method8618();
		return new Class106(local10, local22, local26, local30, local34, local38, local42, local46, local50);
	}

	@OriginalMember(owner = "client!lha", name = "b", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method5133(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			@Pc(18) char local18 = arg0.charAt(local12);
			if (local18 == '<' || local18 == '>') {
				local10 += 3;
			}
		}
		@Pc(38) StringBuffer local38 = new StringBuffer(local10 + local8);
		for (@Pc(40) int local40 = 0; local40 < local8; local40++) {
			@Pc(51) char local51 = arg0.charAt(local40);
			if (local51 == '<') {
				local38.append("<lt>");
			} else if (local51 == '>') {
				local38.append("<gt>");
			} else {
				local38.append(local51);
			}
		}
		return local38.toString();
	}

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "(ZLclient!wp;B)V")
	public static void method5135(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class28_Sub1_Sub1_Sub1_Sub2 arg1) {
		if (Static450.anInt7444 >= 400) {
			return;
		}
		@Pc(14) Class300 local14 = arg1.aClass300_1;
		@Pc(17) String local17 = arg1.aString126;
		if (local14.anIntArray696 != null) {
			local14 = local14.method7258(Static131.aClass66_1);
			if (local14 == null) {
				return;
			}
			local17 = local14.aString101;
		}
		if (!local14.aBoolean631) {
			return;
		}
		if (arg1.anInt10835 != 0) {
			@Pc(51) String local51 = Static55.aClass118_2 == Static68.aClass118_3 ? Static601.aClass346_32.method8440(Static609.anInt9834) : Static601.aClass346_30.method8440(Static609.anInt9834);
			local17 = local17 + Static76.method1428(Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.anInt10514, arg1.anInt10835) + " (" + local51 + arg1.anInt10835 + ")";
		}
		if (Static624.aBoolean698 && !arg0) {
			@Pc(88) Class322 local88 = Static311.anInt5146 == -1 ? null : Static467.aClass367_1.method8812(Static311.anInt5146);
			if ((Static173.anInt3449 & 0x2) != 0 && (local88 == null || local14.method7261(Static311.anInt5146, local88.anInt9033) != local88.anInt9033)) {
				Static303.method4660(false, Static90.aString119, false, -1, Static103.aString17 + " -> <col=ffff00>" + local17, true, 0, 5, (long) arg1.anInt10762, 0, Static463.anInt7620, (long) arg1.anInt10762);
			}
		}
		if (!arg0) {
			@Pc(142) String[] local142 = local14.aStringArray23;
			if (Static491.aBoolean614) {
				local142 = Static11.method188(local142);
			}
			@Pc(152) int local152;
			if (local142 != null) {
				for (local152 = 4; local152 >= 0; local152--) {
					if (local142[local152] != null && (local14.aByte121 == 0 || !local142[local152].equalsIgnoreCase(Static601.aClass346_25.method8440(Static609.anInt9834)))) {
						@Pc(172) byte local172 = 0;
						if (local152 == 0) {
							local172 = 12;
						}
						@Pc(178) int local178 = Static209.anInt4029;
						if (local152 == 1) {
							local172 = 45;
						}
						if (local152 == 2) {
							local172 = 50;
						}
						if (local152 == 3) {
							local172 = 9;
						}
						if (local152 == local14.anInt8326) {
							local178 = local14.anInt8328;
						}
						if (local152 == 4) {
							local172 = 25;
						}
						if (local152 == local14.anInt8293) {
							local178 = local14.anInt8307;
						}
						Static303.method4660(false, local142[local152], false, -1, "<col=ffff00>" + local17, true, 0, local172, (long) arg1.anInt10762, 0, local142[local152].equalsIgnoreCase(Static601.aClass346_25.method8440(Static609.anInt9834)) ? local14.anInt8331 : local178, (long) arg1.anInt10762);
					}
				}
			}
			if (local14.aByte121 == 1 && local142 != null) {
				for (local152 = 4; local152 >= 0; local152--) {
					if (local142[local152] != null && local142[local152].equalsIgnoreCase(Static601.aClass346_25.method8440(Static609.anInt9834))) {
						@Pc(290) short local290 = 0;
						if (Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.anInt10514 < arg1.anInt10835) {
							local290 = 2000;
						}
						@Pc(303) short local303 = 0;
						if (local152 == 0) {
							local303 = 12;
						}
						if (local152 == 1) {
							local303 = 45;
						}
						if (local152 == 2) {
							local303 = 50;
						}
						if (local152 == 3) {
							local303 = 9;
						}
						if (local152 == 4) {
							local303 = 25;
						}
						if (local303 != 0) {
							local303 += local290;
						}
						Static303.method4660(false, local142[local152], false, -1, "<col=ffff00>" + local17, true, 0, local303, (long) arg1.anInt10762, 0, local14.anInt8331, (long) arg1.anInt10762);
					}
				}
			}
		}
		Static303.method4660(arg0, Static601.aClass346_24.method8440(Static609.anInt9834), false, -1, "<col=ffff00>" + local17, true, 0, 1009, (long) arg1.anInt10762, 0, Static116.anInt2402, (long) arg1.anInt10762);
	}

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "(IIIII)V")
	public static void method5136(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 <= arg1) {
			Static483.method7014(Static392.anIntArrayArray39[arg3], arg0, arg1, arg2);
		} else {
			Static483.method7014(Static392.anIntArrayArray39[arg3], arg1, arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "(ILclient!ha;)V")
	public static void method5137(@OriginalArg(1) Class13 arg0) {
		Static400.aClass69_9 = Static611.method8673(arg0, true, Static35.anInt818);
		Static595.aClass88_20 = Static521.method6955(Static35.anInt818, arg0);
		Static504.aClass69_11 = Static611.method8673(arg0, true, Static540.anInt8898);
		Static253.aClass88_19 = Static521.method6955(Static540.anInt8898, arg0);
		Static303.aClass69_6 = Static611.method8673(arg0, true, Static75.anInt1398);
		Static59.aClass88_1 = Static521.method6955(Static75.anInt1398, arg0);
	}
}
