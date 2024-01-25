import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static187 {

	@OriginalMember(owner = "client!hca", name = "j", descriptor = "I")
	public static final int anInt8846 = 1;

	@OriginalMember(owner = "client!hca", name = "k", descriptor = "I")
	public static int anInt8847 = 0;

	@OriginalMember(owner = "client!hca", name = "l", descriptor = "I")
	public static int anInt8848 = 0;

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(Lclient!oa;B)V")
	public static void method7274(@OriginalArg(0) Class66 arg0) {
		@Pc(7) int local7 = Static473.anInt7981;
		@Pc(9) int local9 = Static333.anInt5926;
		@Pc(11) int local11 = Static100.anInt9640;
		@Pc(15) int local15 = Static35.anInt711 - 3;
		if (Static331.aClass13_18 == null || Static32.aClass13_3 == null) {
			if (Static360.aClass31_78.method679(Static25.anInt460) && Static360.aClass31_78.method679(Static141.anInt3160)) {
				Static331.aClass13_18 = arg0.method6799(Static607.method5872(Static360.aClass31_78, Static25.anInt460, 0), true);
				@Pc(48) Class268 local48 = Static607.method5872(Static360.aClass31_78, Static141.anInt3160, 0);
				Static32.aClass13_3 = arg0.method6799(local48, true);
				local48.method5877();
				Static267.aClass13_17 = arg0.method6799(local48, true);
			} else {
				arg0.C(local7, local9, local11, 20, Static474.anInt4413 | 255 - Static433.anInt7416 << 24, 1);
			}
		}
		@Pc(93) int local93;
		@Pc(91) int local91;
		if (Static331.aClass13_18 != null && Static32.aClass13_3 != null) {
			local91 = (local11 - Static32.aClass13_3.QA() * 2) / Static331.aClass13_18.QA();
			for (local93 = 0; local93 < local91; local93++) {
				Static331.aClass13_18.method8019(Static32.aClass13_3.QA() + local7 + local93 * Static331.aClass13_18.QA(), local9);
			}
			Static32.aClass13_3.method8019(local7, local9);
			Static267.aClass13_17.method8019(local11 + local7 - Static267.aClass13_17.QA(), local9);
		}
		Static65.aClass91_4.method7451(local7 + 3, Static119.anInt2754 | 0xFF000000, -1, Static275.aClass198_23.method4407(Static56.anInt953), local9 + 14);
		arg0.C(local7, local9 + 20, local11, local15 - 20, Static474.anInt4413 | 255 - Static433.anInt7416 << 24, 1);
		local91 = Static86.aClass50_1.method7100();
		local93 = Static86.aClass50_1.method7102();
		@Pc(172) int local172 = 0;
		@Pc(195) int local195;
		for (@Pc(177) Class4_Sub18 local177 = (Class4_Sub18) Static354.aClass124_32.method3267(); local177 != null; local177 = (Class4_Sub18) Static354.aClass124_32.method3273()) {
			local195 = local9 + (Static300.anInt5730 - local172 - 1) * 16 + 33;
			local172++;
			if (local7 < local91 && local11 + local7 > local91 && local93 > local195 - 13 && local93 < local195 + 4 && local177.aBoolean249) {
				arg0.C(local7, local195 - 12, local11, 16, Static292.anInt5391 | 255 - Static542.anInt9149 << 24, 1);
			}
		}
		if ((Static18.aClass13_6 == null || Static487.aClass13_20 == null || Static551.aClass13_36 == null) && Static360.aClass31_78.method679(Static121.anInt7255) && Static360.aClass31_78.method679(Static463.anInt7840) && Static360.aClass31_78.method679(Static431.anInt7394)) {
			@Pc(276) Class268 local276 = Static607.method5872(Static360.aClass31_78, Static463.anInt7840, 0);
			Static487.aClass13_20 = arg0.method6799(local276, true);
			local276.method5877();
			Static423.aClass13_30 = arg0.method6799(local276, true);
			Static18.aClass13_6 = arg0.method6799(Static607.method5872(Static360.aClass31_78, Static121.anInt7255, 0), true);
			@Pc(301) Class268 local301 = Static607.method5872(Static360.aClass31_78, Static431.anInt7394, 0);
			Static551.aClass13_36 = arg0.method6799(local301, true);
			local301.method5877();
			Static545.aClass13_34 = arg0.method6799(local301, true);
		}
		local172 = 0;
		@Pc(370) int local370;
		@Pc(333) int local333;
		if (Static18.aClass13_6 != null && Static487.aClass13_20 != null && Static551.aClass13_36 != null) {
			local195 = (local11 - Static551.aClass13_36.QA() * 2) / Static18.aClass13_6.QA();
			for (local333 = 0; local333 < local195; local333++) {
				Static18.aClass13_6.method8019(local7 + Static551.aClass13_36.QA() + local333 * Static18.aClass13_6.QA(), -Static18.aClass13_6.b() + local15 + local9);
			}
			local370 = (local15 - Static551.aClass13_36.b() - 20) / Static487.aClass13_20.b();
			for (@Pc(372) int local372 = 0; local372 < local370; local372++) {
				Static487.aClass13_20.method8019(local7, local9 + local372 * Static487.aClass13_20.b() + 20);
				Static423.aClass13_30.method8019(local7 + local11 - Static423.aClass13_30.QA(), local9 + (20 - -(local372 * Static487.aClass13_20.b())));
			}
			Static551.aClass13_36.method8019(local7, local9 + local15 - Static551.aClass13_36.b());
			Static545.aClass13_34.method8019(local11 + local7 - Static551.aClass13_36.QA(), local9 - -local15 + -Static551.aClass13_36.b());
		}
		for (@Pc(451) Class4_Sub18 local451 = (Class4_Sub18) Static354.aClass124_32.method3267(); local451 != null; local451 = (Class4_Sub18) Static354.aClass124_32.method3273()) {
			local333 = local9 + (Static300.anInt5730 - local172 - 1) * 16 + 20 + 13;
			local370 = Static119.anInt2754 | 0xFF000000;
			if (local91 > local7 && local11 + local7 > local91 && local333 - 13 < local93 && local93 < local333 + 4 && local451.aBoolean249) {
				local370 = Static257.anInt5045 | 0xFF000000;
			}
			@Pc(508) int[] local508 = null;
			if (Static165.method3185(local451.anInt3158)) {
				local508 = Static195.aClass99_1.method2798((int) local451.aLong74).anIntArray476;
			} else if (local451.anInt3157 != -1) {
				local508 = Static195.aClass99_1.method2798(local451.anInt3157).anIntArray476;
			} else if (Static543.method7528(local451.anInt3158)) {
				@Pc(578) Class4_Sub50 local578 = (Class4_Sub50) Static106.aClass183_8.method4289((long) local451.aLong74);
				if (local578 != null) {
					@Pc(583) Class10_Sub1_Sub2_Sub1 local583 = local578.aClass10_Sub1_Sub2_Sub1_1;
					@Pc(586) Class54 local586 = local583.aClass54_1;
					if (local586.anIntArray150 != null) {
						local586 = local586.method1118(Static511.aClass335_2);
					}
					if (local586 != null) {
						local508 = local586.anIntArray152;
					}
				}
			} else if (Static226.method3959(local451.anInt3158)) {
				@Pc(547) Class25 local547;
				if (local451.anInt3158 == 1010) {
					local547 = Static553.aClass288_4.method6419((int) local451.aLong74);
				} else {
					local547 = Static553.aClass288_4.method6419((int) (local451.aLong74 >>> 32 & 0x7FFFFFFFL));
				}
				if (local547.anIntArray115 != null) {
					local547 = local547.method578(Static511.aClass335_2);
				}
				if (local547 != null) {
					local508 = local547.anIntArray113;
				}
			}
			@Pc(620) String local620 = Static23.method438(local451);
			if (local508 != null) {
				local620 = local620 + Static315.method4804(local508);
			}
			Static65.aClass91_4.method7464(local333, local7 + 3, Static367.aClass13Array24, Static23.anIntArray106, local620, local370);
			if (local451.aBoolean248) {
				Static399.aClass13_29.method8019(Static195.aClass196_5.method4386(local620) + local7 + 5, local333 + -12);
			}
			local172++;
		}
		Static428.method6114(Static100.anInt9640, Static333.anInt5926, Static473.anInt7981, Static35.anInt711);
	}
}
