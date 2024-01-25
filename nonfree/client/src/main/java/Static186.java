import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static186 {

	@OriginalMember(owner = "client!jk", name = "E", descriptor = "I")
	public static int anInt3374;

	@OriginalMember(owner = "client!jk", name = "C", descriptor = "Z")
	public static boolean aBoolean202 = false;

	@OriginalMember(owner = "client!jk", name = "H", descriptor = "[I")
	public static final int[] anIntArray299 = new int[2048];

	@OriginalMember(owner = "client!jk", name = "I", descriptor = "I")
	public static int anInt3377 = 2;

	@OriginalMember(owner = "client!jk", name = "L", descriptor = "Lclient!ob;")
	public static final Class179 aClass179_45 = new Class179(49, -1);

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lclient!tr;I)V")
	public static void method2933(@OriginalArg(0) Class237 arg0) {
		@Pc(16) int local16;
		@Pc(24) int local24;
		@Pc(30) int local30;
		@Pc(34) int local34;
		@Pc(38) int local38;
		@Pc(42) int local42;
		if (Static428.aClass237_18 == arg0) {
			local16 = Static206.aClass1_Sub5_Sub1_2.method5411();
			local24 = (local16 >> 4 & 0x7) + Static359.anInt5924;
			local30 = Static395.anInt6348 + (local16 & 0x7);
			local34 = Static206.aClass1_Sub5_Sub1_2.method5363();
			local38 = Static206.aClass1_Sub5_Sub1_2.method5398();
			local42 = Static206.aClass1_Sub5_Sub1_2.method5398();
			if (local24 >= 0 && local30 >= 0 && local24 < Static195.anInt3537 && Static118.anInt2419 > local30 && local38 != Static102.anInt2165) {
				Static411.method5514(Static232.anInt4212, new Class1_Sub22(local42, local34), local30, local24);
				Static150.method2455(local30, Static232.anInt4212, local24);
			}
			return;
		}
		@Pc(121) int local121;
		if (arg0 == Static378.aClass237_10) {
			local16 = Static206.aClass1_Sub5_Sub1_2.method5366();
			local24 = (local16 >> 4 & 0x7) + Static359.anInt5924;
			local30 = Static395.anInt6348 + (local16 & 0x7);
			local34 = Static206.aClass1_Sub5_Sub1_2.method5383();
			local38 = local34 >> 2;
			local42 = local34 & 0x3;
			local121 = Static58.anIntArray93[local38];
			if (Static384.method5199(Static23.anInt5194) || local24 >= 0 && local30 >= 0 && Static195.anInt3537 > local24 && Static118.anInt2419 > local30) {
				Static53.method908(local30, local24, local42, Static232.anInt4212, -1, local121, local38);
			}
			return;
		}
		@Pc(211) int local211;
		@Pc(217) int local217;
		@Pc(219) int local219;
		if (arg0 == Static276.aClass237_12) {
			local16 = Static206.aClass1_Sub5_Sub1_2.method5366();
			local24 = (local16 >> 4 & 0x7) + Static359.anInt5924;
			local30 = (local16 & 0x7) + Static395.anInt6348;
			local34 = Static206.aClass1_Sub5_Sub1_2.method5362();
			local38 = Static206.aClass1_Sub5_Sub1_2.method5366();
			local42 = Static206.aClass1_Sub5_Sub1_2.method5362();
			local121 = Static206.aClass1_Sub5_Sub1_2.method5366();
			if (local24 >= 0 && local30 >= 0 && Static195.anInt3537 > local24 && local30 < Static118.anInt2419) {
				local211 = local24 * 128 + 64;
				local217 = local30 * 128 + 64;
				local219 = Static232.anInt4212;
				if (local219 < 3 && Static87.method1622(local24, local30)) {
					local219++;
				}
				@Pc(251) Class31_Sub2_Sub2 local251 = new Class31_Sub2_Sub2(local34, local42, Static378.anInt4244, Static232.anInt4212, local219, local211, Static301.method4312(Static232.anInt4212, local211, local217) - local38, local217, local24, local24, local30, local30, local121);
				Static64.aClass181_13.method4102(new Class1_Sub2_Sub12(local251));
			}
			return;
		}
		@Pc(332) int local332;
		@Pc(336) int local336;
		@Pc(340) int local340;
		@Pc(344) int local344;
		@Pc(444) Class31_Sub2_Sub6 local444;
		@Pc(293) boolean local293;
		if (Static193.aClass237_9 == arg0) {
			local16 = Static206.aClass1_Sub5_Sub1_2.method5366();
			local24 = Static359.anInt5924 * 2 + (local16 >> 4 & 0xF);
			local30 = Static395.anInt6348 * 2 + (local16 & 0xF);
			local293 = Static206.aClass1_Sub5_Sub1_2.method5366() != 0;
			local38 = local24 + Static206.aClass1_Sub5_Sub1_2.method5416();
			local42 = local30 + Static206.aClass1_Sub5_Sub1_2.method5416();
			local121 = Static206.aClass1_Sub5_Sub1_2.method5380();
			local211 = Static206.aClass1_Sub5_Sub1_2.method5362();
			local217 = Static206.aClass1_Sub5_Sub1_2.method5366() * 4;
			local219 = Static206.aClass1_Sub5_Sub1_2.method5366() * 4;
			local332 = Static206.aClass1_Sub5_Sub1_2.method5362();
			local336 = Static206.aClass1_Sub5_Sub1_2.method5362();
			local340 = Static206.aClass1_Sub5_Sub1_2.method5366();
			local344 = Static206.aClass1_Sub5_Sub1_2.method5366();
			if (local340 == 255) {
				local340 = -1;
			}
			if (local24 >= 0 && local30 >= 0 && local24 < Static195.anInt3537 * 2 && Static195.anInt3537 * 2 > local30 && local38 >= 0 && local42 >= 0 && Static118.anInt2419 * 2 > local38 && local42 < Static118.anInt2419 * 2 && local211 != 65535) {
				local24 *= 64;
				local219 <<= 0x0;
				local30 *= 64;
				local38 = local38 * 64;
				local42 = local42 * 64;
				local217 <<= 0x0;
				local444 = new Class31_Sub2_Sub6(local211, Static232.anInt4212, local24, local30, local217, Static378.anInt4244 + local332, local336 - -Static378.anInt4244, local340, local344, local121, local219, local293);
				local444.method5601(local332 + Static378.anInt4244, local42, Static301.method4312(Static232.anInt4212, local38, local42) - local219, local38);
				Static261.aClass181_48.method4102(new Class1_Sub2_Sub18(local444));
			}
		} else if (arg0 == Static240.aClass237_11) {
			local16 = Static206.aClass1_Sub5_Sub1_2.method5383();
			local24 = Static359.anInt5924 + (local16 >> 4 & 0x7);
			local30 = (local16 & 0x7) + Static395.anInt6348;
			@Pc(493) byte local493 = Static206.aClass1_Sub5_Sub1_2.method5416();
			local38 = Static206.aClass1_Sub5_Sub1_2.method5363();
			@Pc(501) byte local501 = Static206.aClass1_Sub5_Sub1_2.method5414();
			@Pc(505) byte local505 = Static206.aClass1_Sub5_Sub1_2.method5354();
			local211 = Static206.aClass1_Sub5_Sub1_2.method5411();
			local217 = local211 >> 2;
			local219 = local211 & 0x3;
			local332 = Static206.aClass1_Sub5_Sub1_2.method5398();
			@Pc(525) byte local525 = Static206.aClass1_Sub5_Sub1_2.method5416();
			local340 = Static206.aClass1_Sub5_Sub1_2.method5389();
			local344 = Static206.aClass1_Sub5_Sub1_2.method5363();
			if (!Static415.aClass39_11.method4551()) {
				Static407.method5468(local24, local219, local30, local217, local493, Static232.anInt4212, local525, local501, local332, local505, local340, local38, local344);
			}
		} else if (Static387.aClass237_15 == arg0) {
			local16 = Static206.aClass1_Sub5_Sub1_2.method5366();
			local24 = (local16 >> 4 & 0xF) + Static359.anInt5924 * 2;
			local30 = (local16 & 0xF) + Static395.anInt6348 * 2;
			local293 = Static206.aClass1_Sub5_Sub1_2.method5366() != 0;
			local38 = local24 + Static206.aClass1_Sub5_Sub1_2.method5416();
			local42 = Static206.aClass1_Sub5_Sub1_2.method5416() + local30;
			local121 = Static206.aClass1_Sub5_Sub1_2.method5380();
			local211 = Static206.aClass1_Sub5_Sub1_2.method5380();
			local217 = Static206.aClass1_Sub5_Sub1_2.method5362();
			@Pc(616) byte local616 = Static206.aClass1_Sub5_Sub1_2.method5416();
			local332 = Static206.aClass1_Sub5_Sub1_2.method5366() * 4;
			local336 = Static206.aClass1_Sub5_Sub1_2.method5362();
			local340 = Static206.aClass1_Sub5_Sub1_2.method5362();
			local344 = Static206.aClass1_Sub5_Sub1_2.method5366();
			@Pc(640) int local640 = Static206.aClass1_Sub5_Sub1_2.method5366();
			if (local344 == 255) {
				local344 = -1;
			}
			if (local24 >= 0 && local30 >= 0 && local24 < Static195.anInt3537 * 2 && local30 < Static195.anInt3537 * 2 && local38 >= 0 && local42 >= 0 && Static118.anInt2419 * 2 > local38 && local42 < Static118.anInt2419 * 2 && local217 != 65535) {
				local38 *= 64;
				local42 = local42 * 64;
				local219 = local616 << 0;
				local24 = local24 * 64;
				local30 = local30 * 64;
				local332 <<= 0x0;
				if (local121 != 0) {
					@Pc(730) int local730;
					@Pc(738) Class31_Sub2_Sub1 local738;
					@Pc(724) int local724;
					@Pc(734) int local734;
					if (local121 >= 0) {
						local724 = local121 - 1;
						local730 = local724 >> 11 & 0xF;
						local734 = local724 & 0x7FF;
						local738 = Static98.aClass31_Sub2_Sub1_Sub2Array1[local734];
					} else {
						local724 = -local121 - 1;
						local734 = local724 & 0x7FF;
						local730 = local724 >> 11 & 0xF;
						if (local734 == Static102.anInt2165) {
							local738 = Static452.aClass31_Sub2_Sub1_Sub1_2;
						} else {
							local738 = Static458.aClass31_Sub2_Sub1_Sub1Array1[local734];
						}
					}
					if (local738 != null) {
						@Pc(776) Class21 local776 = local738.method5982();
						if (local776.anIntArrayArray5 != null && local776.anIntArrayArray5[local730] != null) {
							local734 = local776.anIntArrayArray5[local730][0];
							@Pc(798) int local798 = local776.anIntArrayArray5[local730][2];
							@Pc(803) int local803 = local738.aClass98_7.method2351();
							@Pc(807) int local807 = Class183.anIntArray433[local803];
							@Pc(811) int local811 = Class183.anIntArray434[local803];
							@Pc(821) int local821 = local811 * local734 + local807 * local798 >> 15;
							@Pc(832) int local832 = local798 * local811 - local807 * local734 >> 15;
							local30 += local832;
							local24 += local821;
							local219 -= local776.anIntArrayArray5[local730][1];
						}
					}
				}
				@Pc(871) Class31_Sub2_Sub6 local871 = new Class31_Sub2_Sub6(local217, Static232.anInt4212, local24, local30, local219, local336 + Static378.anInt4244, Static378.anInt4244 + local340, local344, local640, local211, local332, local293);
				local871.method5601(Static378.anInt4244 + local336, local42, Static301.method4312(Static232.anInt4212, local38, local42) - local332, local38);
				Static261.aClass181_48.method4102(new Class1_Sub2_Sub18(local871));
			}
		} else if (Static55.aClass237_19 == arg0) {
			local16 = Static206.aClass1_Sub5_Sub1_2.method5362();
			local24 = Static206.aClass1_Sub5_Sub1_2.method5366();
			Static349.aClass115_4.method2766(local16).method3018(local24);
		} else if (arg0 == Static386.aClass237_14) {
			Static206.aClass1_Sub5_Sub1_2.method5366();
			local16 = Static206.aClass1_Sub5_Sub1_2.method5366();
			local24 = (local16 >> 4 & 0x7) + Static359.anInt5924;
			local30 = Static395.anInt6348 + (local16 & 0x7);
			local34 = Static206.aClass1_Sub5_Sub1_2.method5362();
			local38 = Static206.aClass1_Sub5_Sub1_2.method5366();
			local42 = Static206.aClass1_Sub5_Sub1_2.method5399();
			@Pc(960) String local960 = Static206.aClass1_Sub5_Sub1_2.method5401();
			Static162.method2633(local960, local24, local42, Static232.anInt4212, local30, local34, local38);
		} else if (arg0 == Static180.aClass237_17) {
			local16 = Static206.aClass1_Sub5_Sub1_2.method5366();
			local24 = (local16 >> 4 & 0x7) + Static359.anInt5924;
			local30 = (local16 & 0x7) + Static395.anInt6348;
			local34 = Static206.aClass1_Sub5_Sub1_2.method5362();
			local38 = Static206.aClass1_Sub5_Sub1_2.method5362();
			local42 = Static206.aClass1_Sub5_Sub1_2.method5362();
			if (Static129.aClass96_24 != null && local24 >= 0 && local30 >= 0 && local24 < Static195.anInt3537 && local30 < Static118.anInt2419) {
				@Pc(1040) Class1_Sub25 local1040 = (Class1_Sub25) Static129.aClass96_24.method2335((long) (local30 << 14 | Static232.anInt4212 << 28 | local24));
				if (local1040 != null) {
					for (@Pc(1048) Class1_Sub22 local1048 = (Class1_Sub22) local1040.aClass181_29.method4112(); local1048 != null; local1048 = (Class1_Sub22) local1040.aClass181_29.method4104()) {
						if ((local34 & 0x7FFF) == local1048.anInt3023 && local38 == local1048.anInt3025) {
							local1048.method6020();
							local1048.anInt3025 = local42;
							Static411.method5514(Static232.anInt4212, local1048, local30, local24);
							break;
						}
					}
					Static150.method2455(local30, Static232.anInt4212, local24);
				}
			}
		} else if (arg0 == Static118.aClass237_7) {
			local16 = Static206.aClass1_Sub5_Sub1_2.method5374();
			local24 = local16 >> 2;
			local30 = local16 & 0x3;
			local34 = Static58.anIntArray93[local24];
			local38 = Static206.aClass1_Sub5_Sub1_2.method5383();
			local42 = (local38 >> 4 & 0x7) + Static359.anInt5924;
			local121 = Static395.anInt6348 + (local38 & 0x7);
			local211 = Static206.aClass1_Sub5_Sub1_2.method5400();
			if (Static384.method5199(Static23.anInt5194) || local42 >= 0 && local121 >= 0 && local42 < Static195.anInt3537 && local121 < Static118.anInt2419) {
				Static53.method908(local121, local42, local30, Static232.anInt4212, local211, local34, local24);
			}
		} else if (arg0 == Static416.aClass237_16) {
			local16 = Static206.aClass1_Sub5_Sub1_2.method5366();
			local24 = Static359.anInt5924 + (local16 >> 4 & 0x7);
			local30 = Static395.anInt6348 + (local16 & 0x7);
			local34 = Static206.aClass1_Sub5_Sub1_2.method5400();
			local38 = Static206.aClass1_Sub5_Sub1_2.method5398();
			if (local24 >= 0 && local30 >= 0 && local24 < Static195.anInt3537 && Static118.anInt2419 > local30) {
				Static411.method5514(Static232.anInt4212, new Class1_Sub22(local34, local38), local30, local24);
				Static150.method2455(local30, Static232.anInt4212, local24);
			}
		} else if (Static432.aClass237_20 == arg0) {
			local16 = Static206.aClass1_Sub5_Sub1_2.method5366();
			@Pc(1243) boolean local1243 = (local16 & 0x80) != 0;
			local30 = (local16 >> 3 & 0x7) + Static359.anInt5924;
			local34 = (local16 & 0x7) + Static395.anInt6348;
			local38 = Static206.aClass1_Sub5_Sub1_2.method5416() + local30;
			local42 = local34 + Static206.aClass1_Sub5_Sub1_2.method5416();
			local121 = Static206.aClass1_Sub5_Sub1_2.method5380();
			local211 = Static206.aClass1_Sub5_Sub1_2.method5362();
			local217 = Static206.aClass1_Sub5_Sub1_2.method5366() * 4;
			local219 = Static206.aClass1_Sub5_Sub1_2.method5366() * 4;
			local332 = Static206.aClass1_Sub5_Sub1_2.method5362();
			local336 = Static206.aClass1_Sub5_Sub1_2.method5362();
			local340 = Static206.aClass1_Sub5_Sub1_2.method5366();
			local344 = Static206.aClass1_Sub5_Sub1_2.method5366();
			if (local340 == 255) {
				local340 = -1;
			}
			if (local30 >= 0 && local34 >= 0 && Static195.anInt3537 > local30 && local34 < Static118.anInt2419 && local38 >= 0 && local42 >= 0 && local38 < Static195.anInt3537 && Static118.anInt2419 > local42 && local211 != 65535) {
				local30 = local30 * 128 + 64;
				local219 <<= 0x0;
				local38 = local38 * 128 + 64;
				local217 <<= 0x0;
				local42 = local42 * 128 + 64;
				local34 = local34 * 128 + 64;
				local444 = new Class31_Sub2_Sub6(local211, Static232.anInt4212, local30, local34, local217, local332 + Static378.anInt4244, Static378.anInt4244 + local336, local340, local344, local121, local219, local1243);
				local444.method5601(local332 + Static378.anInt4244, local42, Static301.method4312(Static232.anInt4212, local38, local42) - local219, local38);
				Static261.aClass181_48.method4102(new Class1_Sub2_Sub18(local444));
			}
		} else if (Static456.aClass237_21 == arg0) {
			local16 = Static206.aClass1_Sub5_Sub1_2.method5411();
			local24 = local16 >> 2;
			local30 = local16 & 0x3;
			local34 = Static58.anIntArray93[local24];
			local38 = Static206.aClass1_Sub5_Sub1_2.method5366();
			local42 = Static359.anInt5924 + (local38 >> 4 & 0x7);
			local121 = Static395.anInt6348 + (local38 & 0x7);
			local211 = Static206.aClass1_Sub5_Sub1_2.method5398();
			if (local211 == 65535) {
				local211 = -1;
			}
			Static241.method3636(Static232.anInt4212, local211, local30, local24, local34, local42, local121);
		} else if (arg0 == Static8.aClass237_1) {
			local16 = Static206.aClass1_Sub5_Sub1_2.method5362();
			local24 = Static206.aClass1_Sub5_Sub1_2.method5374();
			local30 = (local24 >> 4 & 0x7) + Static359.anInt5924;
			local34 = Static395.anInt6348 + (local24 & 0x7);
			if (local30 >= 0 && local34 >= 0 && local30 < Static195.anInt3537 && local34 < Static118.anInt2419) {
				@Pc(1544) Class1_Sub25 local1544 = (Class1_Sub25) Static129.aClass96_24.method2335((long) (local34 << 14 | Static232.anInt4212 << 28 | local30));
				if (local1544 != null) {
					for (@Pc(1552) Class1_Sub22 local1552 = (Class1_Sub22) local1544.aClass181_29.method4112(); local1552 != null; local1552 = (Class1_Sub22) local1544.aClass181_29.method4104()) {
						if (local1552.anInt3023 == (local16 & 0x7FFF)) {
							local1552.method6020();
							break;
						}
					}
					if (local1544.aClass181_29.method4113()) {
						local1544.method6020();
					}
					Static150.method2455(local34, Static232.anInt4212, local30);
				}
			}
		} else if (Static340.aClass237_13 == arg0) {
			local16 = Static206.aClass1_Sub5_Sub1_2.method5366();
			local24 = (local16 >> 4 & 0x7) + Static359.anInt5924;
			local30 = (local16 & 0x7) + Static395.anInt6348;
			local34 = Static206.aClass1_Sub5_Sub1_2.method5362();
			if (local34 == 65535) {
				local34 = -1;
			}
			local38 = Static206.aClass1_Sub5_Sub1_2.method5366();
			local42 = local38 >> 4 & 0xF;
			local121 = local38 & 0x7;
			local211 = Static206.aClass1_Sub5_Sub1_2.method5366();
			local217 = Static206.aClass1_Sub5_Sub1_2.method5366();
			if (local24 >= 0 && local30 >= 0 && Static195.anInt3537 > local24 && Static118.anInt2419 > local30) {
				local219 = local42 + 1;
				if (Static452.aClass31_Sub2_Sub1_Sub1_2.anIntArray658[0] >= local24 - local219 && Static452.aClass31_Sub2_Sub1_Sub1_2.anIntArray658[0] <= local219 + local24 && Static452.aClass31_Sub2_Sub1_Sub1_2.anIntArray657[0] >= local30 - local219 && Static452.aClass31_Sub2_Sub1_Sub1_2.anIntArray657[0] <= local219 + local30) {
					Static187.method2938(local217, local121, local34, local42 + (local24 << 16) + (Static232.anInt4212 << 24) + (local30 << 8), local211);
				}
			}
		} else {
			Static158.method2570(null, "T3 - " + arg0);
			Static225.method3455(false);
		}
	}

	@OriginalMember(owner = "client!jk", name = "j", descriptor = "(I)V")
	public static void method2934() {
		for (@Pc(18) Class1_Sub2_Sub18 local18 = (Class1_Sub2_Sub18) Static261.aClass181_48.method4112(); local18 != null; local18 = (Class1_Sub2_Sub18) Static261.aClass181_48.method4104()) {
			@Pc(23) Class31_Sub2_Sub6 local23 = local18.aClass31_Sub2_Sub6_1;
			if (local23.aByte100 != Static357.anInt5881 || Static378.anInt4244 > local23.anInt6796) {
				local18.method6020();
				local23.method5603();
			} else if (local23.anInt6798 <= Static378.anInt4244) {
				if (local23.lb > 0) {
					@Pc(53) Class31_Sub2_Sub1_Sub2 local53 = Static98.aClass31_Sub2_Sub1_Sub2Array1[local23.lb - 1];
					if (local53 != null && local53.anInt7300 >= 0 && local53.anInt7300 < Static195.anInt3537 * 128 && local53.anInt7298 >= 0 && local53.anInt7298 < Static118.anInt2419 * 128) {
						local23.method5601(Static378.anInt4244, local53.anInt7298, Static301.method4312(local23.aByte100, local53.anInt7300, local53.anInt7298) - local23.anInt6799, local53.anInt7300);
					}
				}
				if (local23.lb < 0) {
					@Pc(105) int local105 = -local23.lb - 1;
					@Pc(110) Class31_Sub2_Sub1_Sub1 local110;
					if (Static102.anInt2165 == local105) {
						local110 = Static452.aClass31_Sub2_Sub1_Sub1_2;
					} else {
						local110 = Static458.aClass31_Sub2_Sub1_Sub1Array1[local105];
					}
					if (local110 != null && local110.anInt7300 >= 0 && Static195.anInt3537 * 128 > local110.anInt7300 && local110.anInt7298 >= 0 && local110.anInt7298 < Static118.anInt2419 * 128) {
						local23.method5601(Static378.anInt4244, local110.anInt7298, Static301.method4312(local23.aByte100, local110.anInt7300, local110.anInt7298) - local23.anInt6799, local110.anInt7300);
					}
				}
				local23.method5604(Static4.anInt115);
				Static162.method2630(local23, true);
			}
		}
	}
}
