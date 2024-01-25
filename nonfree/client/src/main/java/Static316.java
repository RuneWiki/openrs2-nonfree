import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static316 {

	@OriginalMember(owner = "client!me", name = "h", descriptor = "F")
	public static float aFloat151;

	@OriginalMember(owner = "client!me", name = "l", descriptor = "Lclient!fc;")
	public static final Class98 aClass98_83 = new Class98(17, 2);

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Lclient!of;I)V")
	public static void method4918(@OriginalArg(0) Class230 arg0) {
		@Pc(14) int local14;
		@Pc(20) int local20;
		@Pc(24) int local24;
		@Pc(33) int local33;
		@Pc(37) int local37;
		@Pc(41) int local41;
		@Pc(45) int local45;
		@Pc(49) int local49;
		if (arg0 == Static283.aClass230_32) {
			local14 = Static429.aClass6_Sub12_Sub2_2.method6019();
			local20 = Static365.anInt6684 + (local14 & 0x7);
			local24 = Static154.anInt2878 + local20;
			local33 = Static362.anInt6663 + (local14 >> 4 & 0x7);
			local37 = Static150.anInt2792 + local33;
			local41 = Static429.aClass6_Sub12_Sub2_2.method6044();
			local45 = Static429.aClass6_Sub12_Sub2_2.method6044();
			local49 = Static429.aClass6_Sub12_Sub2_2.method6044();
			if (Static500.aClass234_44 != null) {
				@Pc(66) Class6_Sub30 local66 = (Class6_Sub30) Static500.aClass234_44.method5464((long) (local24 << 14 | Static504.anInt8760 << 28 | local37));
				if (local66 != null) {
					for (@Pc(74) Class6_Sub50 local74 = (Class6_Sub50) local66.aClass298_137.method6809(); local74 != null; local74 = (Class6_Sub50) local66.aClass298_137.method6821()) {
						if ((local41 & 0x7FFF) == local74.anInt9642 && local45 == local74.anInt9643) {
							local74.method7948();
							local74.anInt9643 = local49;
							Static470.method6540(local24, local74, local37, Static504.anInt8760);
							break;
						}
					}
					if (local33 >= 0 && local20 >= 0 && local33 < Static18.anInt5706 && local20 < Static80.anInt1367) {
						Static69.method969(local20, local33, Static504.anInt8760);
					}
				}
			}
			return;
		}
		@Pc(287) int local287;
		@Pc(205) int local205;
		@Pc(209) int local209;
		@Pc(215) int local215;
		@Pc(165) boolean local165;
		@Pc(191) int local191;
		@Pc(201) int local201;
		if (arg0 == Static564.aClass230_58) {
			local14 = Static429.aClass6_Sub12_Sub2_2.method6019();
			local20 = (local14 >> 4 & 0xF) + Static362.anInt6663 * 2;
			local24 = Static365.anInt6684 * 2 + (local14 & 0xF);
			local165 = Static429.aClass6_Sub12_Sub2_2.method6019() != 0;
			local37 = Static429.aClass6_Sub12_Sub2_2.method6049() + local20;
			local41 = Static429.aClass6_Sub12_Sub2_2.method6049() + local24;
			local45 = Static429.aClass6_Sub12_Sub2_2.method6023();
			local49 = Static429.aClass6_Sub12_Sub2_2.method6023();
			local191 = Static429.aClass6_Sub12_Sub2_2.method6044();
			@Pc(195) byte local195 = Static429.aClass6_Sub12_Sub2_2.method6049();
			local201 = Static429.aClass6_Sub12_Sub2_2.method6019() * 4;
			local205 = Static429.aClass6_Sub12_Sub2_2.method6044();
			local209 = Static429.aClass6_Sub12_Sub2_2.method6044();
			local215 = Static429.aClass6_Sub12_Sub2_2.method6019();
			if (local215 == 255) {
				local215 = -1;
			}
			@Pc(224) int local224 = Static429.aClass6_Sub12_Sub2_2.method6044();
			if (local20 >= 0 && local24 >= 0 && Static18.anInt5706 * 2 > local20 && local24 < Static18.anInt5706 * 2 && local37 >= 0 && local41 >= 0 && local37 < Static80.anInt1367 * 2 && local41 < Static80.anInt1367 * 2 && local191 != 65535) {
				local20 = local20 * 256;
				local201 <<= 0x2;
				local287 = local195 << 2;
				local37 = local37 * 256;
				local224 <<= 0x2;
				local24 = local24 * 256;
				local41 *= 256;
				if (local45 != 0) {
					@Pc(310) Class15_Sub2_Sub4 local310 = null;
					@Pc(326) int local326;
					@Pc(320) int local320;
					@Pc(330) int local330;
					if (local45 < 0) {
						local320 = -local45 - 1;
						local326 = local320 >> 11 & 0xF;
						local330 = local320 & 0x7FF;
						if (Static517.anInt8881 == local330) {
							local310 = Static461.aClass15_Sub2_Sub4_Sub2_2;
						} else {
							local310 = Static551.aClass15_Sub2_Sub4_Sub2Array1[local330];
						}
					} else {
						local320 = local45 - 1;
						local330 = local320 & 0x7FF;
						local326 = local320 >> 11 & 0xF;
						@Pc(366) Class6_Sub49 local366 = (Class6_Sub49) Static251.aClass234_29.method5464((long) local330);
						if (local366 != null) {
							local310 = local366.aClass15_Sub2_Sub4_Sub1_2;
						}
					}
					if (local310 != null) {
						@Pc(377) Class154 local377 = local310.method7131();
						if (local377.anIntArrayArray41 != null && local377.anIntArrayArray41[local326] != null) {
							local330 = local377.anIntArrayArray41[local326][0];
							@Pc(399) int local399 = local377.anIntArrayArray41[local326][2];
							@Pc(404) int local404 = local310.aClass218_7.method5310();
							@Pc(408) int local408 = Class22.anIntArray20[local404];
							@Pc(412) int local412 = Class22.anIntArray19[local404];
							@Pc(422) int local422 = local412 * local330 + local399 * local408 >> 14;
							@Pc(433) int local433 = local399 * local412 - local408 * local330 >> 14;
							local20 += local422;
							local287 -= local377.anIntArrayArray41[local326][1];
							local24 += local433;
						}
					}
				}
				@Pc(472) Class15_Sub2_Sub2 local472 = new Class15_Sub2_Sub2(local191, Static504.anInt8760, local20, local24, local287, local205 + Static363.anInt6671, Static363.anInt6671 + local209, local215, local224, local49, local201, local165);
				local472.method1667(local37, local41, Static37.method631(local41, local37, Static504.anInt8760) - local201, local205 - -Static363.anInt6671);
				Static237.aClass298_93.method6812(new Class6_Sub5_Sub7(local472));
			}
		} else if (Static178.aClass230_23 == arg0) {
			local14 = Static429.aClass6_Sub12_Sub2_2.method6019();
			local20 = Static365.anInt6684 + (local14 & 0x7);
			local24 = local20 + Static154.anInt2878;
			local33 = Static362.anInt6663 + (local14 >> 4 & 0x7);
			local37 = Static150.anInt2792 + local33;
			local41 = Static429.aClass6_Sub12_Sub2_2.method6044();
			@Pc(550) Class6_Sub30 local550 = (Class6_Sub30) Static500.aClass234_44.method5464((long) (Static504.anInt8760 << 28 | local24 << 14 | local37));
			if (local550 != null) {
				for (@Pc(558) Class6_Sub50 local558 = (Class6_Sub50) local550.aClass298_137.method6809(); local558 != null; local558 = (Class6_Sub50) local550.aClass298_137.method6821()) {
					if (local558.anInt9642 == (local41 & 0x7FFF)) {
						local558.method7948();
						break;
					}
				}
				if (local550.aClass298_137.method6813()) {
					local550.method7948();
				}
				if (local33 >= 0 && local20 >= 0 && local33 < Static18.anInt5706 && local20 < Static80.anInt1367) {
					Static69.method969(local20, local33, Static504.anInt8760);
				}
			}
		} else {
			@Pc(813) Class15_Sub2_Sub2 local813;
			if (arg0 == Static157.aClass230_42) {
				local14 = Static429.aClass6_Sub12_Sub2_2.method6019();
				@Pc(640) boolean local640 = (local14 & 0x80) != 0;
				local24 = Static362.anInt6663 + (local14 >> 3 & 0x7);
				local33 = Static365.anInt6684 + (local14 & 0x7);
				local37 = local24 + Static429.aClass6_Sub12_Sub2_2.method6049();
				local41 = local33 + Static429.aClass6_Sub12_Sub2_2.method6049();
				local45 = Static429.aClass6_Sub12_Sub2_2.method6023();
				local49 = Static429.aClass6_Sub12_Sub2_2.method6044();
				local191 = Static429.aClass6_Sub12_Sub2_2.method6019() * 4;
				local287 = Static429.aClass6_Sub12_Sub2_2.method6019() * 4;
				local201 = Static429.aClass6_Sub12_Sub2_2.method6044();
				local205 = Static429.aClass6_Sub12_Sub2_2.method6044();
				local209 = Static429.aClass6_Sub12_Sub2_2.method6019();
				local215 = Static429.aClass6_Sub12_Sub2_2.method6044();
				if (local209 == 255) {
					local209 = -1;
				}
				if (local24 >= 0 && local33 >= 0 && Static18.anInt5706 > local24 && local33 < Static80.anInt1367 && local37 >= 0 && local41 >= 0 && Static18.anInt5706 > local37 && Static80.anInt1367 > local41 && local49 != 65535) {
					local191 <<= 0x2;
					local37 = local37 * 512 + 256;
					local287 <<= 0x2;
					local215 <<= 0x2;
					local33 = local33 * 512 + 256;
					local41 = local41 * 512 + 256;
					local24 = local24 * 512 + 256;
					local813 = new Class15_Sub2_Sub2(local49, Static504.anInt8760, local24, local33, local191, Static363.anInt6671 + local201, local205 - -Static363.anInt6671, local209, local215, local45, local287, local640);
					local813.method1667(local37, local41, Static37.method631(local41, local37, Static504.anInt8760) - local287, local201 + Static363.anInt6671);
					Static237.aClass298_93.method6812(new Class6_Sub5_Sub7(local813));
				}
			} else if (arg0 == Static10.aClass230_1) {
				local14 = Static429.aClass6_Sub12_Sub2_2.method6044();
				local20 = Static429.aClass6_Sub12_Sub2_2.method6019();
				Static85.aClass27_1.method516(local14).method4581(local20);
			} else if (Static118.aClass230_59 == arg0) {
				local14 = Static429.aClass6_Sub12_Sub2_2.method6044();
				local20 = Static429.aClass6_Sub12_Sub2_2.method6055();
				local24 = Static429.aClass6_Sub12_Sub2_2.method6027();
				local33 = (local24 & 0x7) + Static365.anInt6684;
				local37 = Static154.anInt2878 + local33;
				local41 = (local24 >> 4 & 0x7) + Static362.anInt6663;
				local45 = Static150.anInt2792 + local41;
				@Pc(921) boolean local921 = local41 >= 0 && local33 >= 0 && Static18.anInt5706 > local41 && local33 < Static80.anInt1367;
				if (local921 || Static110.method1701(Static126.anInt2172)) {
					Static470.method6540(local37, new Class6_Sub50(local14, local20), local45, Static504.anInt8760);
					if (local921) {
						Static69.method969(local33, local41, Static504.anInt8760);
					}
				}
			} else if (arg0 == Static307.aClass230_34) {
				Static429.aClass6_Sub12_Sub2_2.method6019();
				local14 = Static429.aClass6_Sub12_Sub2_2.method6019();
				local20 = (local14 >> 4 & 0x7) + Static362.anInt6663;
				local24 = Static365.anInt6684 + (local14 & 0x7);
				local33 = Static429.aClass6_Sub12_Sub2_2.method6044();
				local37 = Static429.aClass6_Sub12_Sub2_2.method6019();
				local41 = Static429.aClass6_Sub12_Sub2_2.method6037();
				@Pc(988) String local988 = Static429.aClass6_Sub12_Sub2_2.method6040();
				Static507.method6975(local41, local37, local20, local33, Static504.anInt8760, local24, local988);
			} else if (Static176.aClass230_56 == arg0) {
				local14 = Static429.aClass6_Sub12_Sub2_2.method6055();
				local20 = Static429.aClass6_Sub12_Sub2_2.method6027();
				local24 = Static362.anInt6663 + (local20 >> 4 & 0x7);
				local33 = (local20 & 0x7) + Static365.anInt6684;
				@Pc(1027) byte local1027 = Static429.aClass6_Sub12_Sub2_2.method6007();
				@Pc(1031) byte local1031 = Static429.aClass6_Sub12_Sub2_2.method6007();
				local45 = Static429.aClass6_Sub12_Sub2_2.method6048();
				@Pc(1041) byte local1041 = Static429.aClass6_Sub12_Sub2_2.method6013();
				local191 = Static429.aClass6_Sub12_Sub2_2.method6011();
				local287 = local191 >> 2;
				local201 = local191 & 0x3;
				local205 = Static429.aClass6_Sub12_Sub2_2.method6057();
				@Pc(1061) byte local1061 = Static429.aClass6_Sub12_Sub2_2.method6007();
				local215 = Static429.aClass6_Sub12_Sub2_2.method6023();
				if (!Static554.aClass90_12.method7480()) {
					Static511.method7008(local205, local1031, local14, local45, local33, local1061, local287, local24, local201, local1041, local215, local1027, Static504.anInt8760);
				}
			} else if (Static153.aClass230_17 == arg0) {
				local14 = Static429.aClass6_Sub12_Sub2_2.method6019();
				local20 = Static362.anInt6663 + (local14 >> 4 & 0x7);
				local24 = Static365.anInt6684 + (local14 & 0x7);
				local33 = Static429.aClass6_Sub12_Sub2_2.method6044();
				if (local33 == 65535) {
					local33 = -1;
				}
				local37 = Static429.aClass6_Sub12_Sub2_2.method6019();
				local41 = local37 >> 4 & 0xF;
				local45 = local37 & 0x7;
				local49 = Static429.aClass6_Sub12_Sub2_2.method6019();
				local191 = Static429.aClass6_Sub12_Sub2_2.method6019();
				if (local20 >= 0 && local24 >= 0 && local20 < Static18.anInt5706 && local24 < Static80.anInt1367) {
					local287 = local41 + 1;
					if (local20 - local287 <= Static461.aClass15_Sub2_Sub4_Sub2_2.anIntArray638[0] && local20 + local287 >= Static461.aClass15_Sub2_Sub4_Sub2_2.anIntArray638[0] && Static461.aClass15_Sub2_Sub4_Sub2_2.anIntArray637[0] >= local24 - local287 && Static461.aClass15_Sub2_Sub4_Sub2_2.anIntArray637[0] <= local287 + local24) {
						Static90.method4177(local191, local45, local33, local41 + (Static504.anInt8760 << 24) + (local20 << 16) + (local24 << 8), local49);
					}
				}
			} else if (Static476.aClass230_48 == arg0) {
				local14 = Static429.aClass6_Sub12_Sub2_2.method6044();
				local20 = Static429.aClass6_Sub12_Sub2_2.method6011();
				local24 = Static362.anInt6663 + (local20 >> 4 & 0x7);
				local33 = (local20 & 0x7) + Static365.anInt6684;
				local37 = Static429.aClass6_Sub12_Sub2_2.method6011();
				local41 = local37 >> 2;
				local45 = local37 & 0x3;
				local49 = Static424.anIntArray537[local41];
				if (Static110.method1701(Static126.anInt2172) || local24 >= 0 && local33 >= 0 && local24 < Static18.anInt5706 && local33 < Static80.anInt1367) {
					Static416.method5924(local24, Static504.anInt8760, local41, local33, local49, local45, local14);
				}
			} else if (arg0 == Static493.aClass230_52) {
				local14 = Static429.aClass6_Sub12_Sub2_2.method6048();
				if (local14 == 65535) {
					local14 = -1;
				}
				local20 = Static429.aClass6_Sub12_Sub2_2.method6027();
				local24 = local20 >> 2;
				local33 = local20 & 0x3;
				local37 = Static424.anIntArray537[local24];
				local41 = Static429.aClass6_Sub12_Sub2_2.method6027();
				local45 = (local41 >> 4 & 0x7) + Static362.anInt6663;
				local49 = Static365.anInt6684 + (local41 & 0x7);
				Static269.method4024(local37, local24, Static504.anInt8760, local33, local49, local14, local45);
			} else if (arg0 == Static230.aClass230_27) {
				local14 = Static429.aClass6_Sub12_Sub2_2.method6027();
				local20 = Static362.anInt6663 + (local14 >> 4 & 0x7);
				local24 = (local14 & 0x7) + Static365.anInt6684;
				local33 = Static429.aClass6_Sub12_Sub2_2.method6019();
				local37 = local33 >> 2;
				local41 = local33 & 0x3;
				local45 = Static424.anIntArray537[local37];
				if (Static110.method1701(Static126.anInt2172) || local20 >= 0 && local24 >= 0 && Static18.anInt5706 > local20 && Static80.anInt1367 > local24) {
					Static416.method5924(local20, Static504.anInt8760, local37, local24, local45, local41, -1);
				}
			} else if (Static451.aClass230_46 == arg0) {
				local14 = Static429.aClass6_Sub12_Sub2_2.method6019();
				local20 = (local14 >> 4 & 0xF) + Static362.anInt6663 * 2;
				local24 = Static365.anInt6684 * 2 + (local14 & 0xF);
				local165 = Static429.aClass6_Sub12_Sub2_2.method6019() != 0;
				local37 = Static429.aClass6_Sub12_Sub2_2.method6049() + local20;
				local41 = local24 + Static429.aClass6_Sub12_Sub2_2.method6049();
				local45 = Static429.aClass6_Sub12_Sub2_2.method6023();
				local49 = Static429.aClass6_Sub12_Sub2_2.method6044();
				local191 = Static429.aClass6_Sub12_Sub2_2.method6019() * 4;
				local287 = Static429.aClass6_Sub12_Sub2_2.method6019() * 4;
				local201 = Static429.aClass6_Sub12_Sub2_2.method6044();
				local205 = Static429.aClass6_Sub12_Sub2_2.method6044();
				local209 = Static429.aClass6_Sub12_Sub2_2.method6019();
				local215 = Static429.aClass6_Sub12_Sub2_2.method6044();
				if (local209 == 255) {
					local209 = -1;
				}
				if (local20 >= 0 && local24 >= 0 && Static18.anInt5706 * 2 > local20 && local24 < Static18.anInt5706 * 2 && local37 >= 0 && local41 >= 0 && Static80.anInt1367 * 2 > local37 && local41 < Static80.anInt1367 * 2 && local49 != 65535) {
					local24 *= 256;
					local41 *= 256;
					local191 <<= 0x2;
					local37 *= 256;
					local215 <<= 0x2;
					local287 <<= 0x2;
					local20 *= 256;
					local813 = new Class15_Sub2_Sub2(local49, Static504.anInt8760, local20, local24, local191, local201 + Static363.anInt6671, local205 + Static363.anInt6671, local209, local215, local45, local287, local165);
					local813.method1667(local37, local41, Static37.method631(local41, local37, Static504.anInt8760) - local287, Static363.anInt6671 + local201);
					Static237.aClass298_93.method6812(new Class6_Sub5_Sub7(local813));
				}
			} else if (arg0 == Static327.aClass230_38) {
				local14 = Static429.aClass6_Sub12_Sub2_2.method6019();
				local20 = (local14 >> 4 & 0x7) + Static362.anInt6663;
				local24 = (local14 & 0x7) + Static365.anInt6684;
				local33 = Static429.aClass6_Sub12_Sub2_2.method6044();
				local37 = Static429.aClass6_Sub12_Sub2_2.method6019();
				local41 = Static429.aClass6_Sub12_Sub2_2.method6044();
				local45 = Static429.aClass6_Sub12_Sub2_2.method6019();
				if (local20 >= 0 && local24 >= 0 && local20 < Static18.anInt5706 && local24 < Static80.anInt1367) {
					local49 = local20 * 512 + 256;
					local191 = local24 * 512 + 256;
					local287 = Static504.anInt8760;
					if (local287 < 3 && Static77.method1114(local24, local20)) {
						local287++;
					}
					@Pc(1748) Class15_Sub2_Sub6 local1748 = new Class15_Sub2_Sub6(local33, local41, Static363.anInt6671, Static504.anInt8760, local287, local49, Static37.method631(local191, local49, Static504.anInt8760) - local37, local191, local20, local20, local24, local24, local45);
					Static432.aClass298_162.method6812(new Class6_Sub5_Sub17(local1748));
				}
			} else if (arg0 == Static315.aClass230_37) {
				local14 = Static429.aClass6_Sub12_Sub2_2.method6019();
				local20 = Static362.anInt6663 + (local14 >> 4 & 0x7);
				local24 = Static365.anInt6684 + (local14 & 0x7);
				local33 = Static429.aClass6_Sub12_Sub2_2.method6044();
				if (local33 == 65535) {
					local33 = -1;
				}
				local37 = Static429.aClass6_Sub12_Sub2_2.method6019();
				local41 = local37 >> 4 & 0xF;
				local45 = local37 & 0x7;
				local49 = Static429.aClass6_Sub12_Sub2_2.method6019();
				local191 = Static429.aClass6_Sub12_Sub2_2.method6019();
				if (local20 >= 0 && local24 >= 0 && Static18.anInt5706 > local20 && local24 < Static80.anInt1367) {
					local287 = local41 + 1;
					if (Static461.aClass15_Sub2_Sub4_Sub2_2.anIntArray638[0] >= local20 - local287 && Static461.aClass15_Sub2_Sub4_Sub2_2.anIntArray638[0] <= local287 + local20 && Static461.aClass15_Sub2_Sub4_Sub2_2.anIntArray637[0] >= local24 - local287 && Static461.aClass15_Sub2_Sub4_Sub2_2.anIntArray637[0] <= local24 + local287) {
						Static431.method6147(local49, local45, local191, local33, (Static504.anInt8760 << 24) + (local20 << 16) + (local24 << 8) + local41);
					}
				}
			} else if (arg0 == Static237.aClass230_29) {
				local14 = Static429.aClass6_Sub12_Sub2_2.method6055();
				local20 = Static429.aClass6_Sub12_Sub2_2.method6057();
				local24 = Static429.aClass6_Sub12_Sub2_2.method6019();
				local33 = Static365.anInt6684 + (local24 & 0x7);
				local37 = Static154.anInt2878 + local33;
				local41 = (local24 >> 4 & 0x7) + Static362.anInt6663;
				local45 = Static150.anInt2792 + local41;
				local49 = Static429.aClass6_Sub12_Sub2_2.method6048();
				if (local14 != Static517.anInt8881) {
					@Pc(1969) boolean local1969 = local41 >= 0 && local33 >= 0 && Static18.anInt5706 > local41 && Static80.anInt1367 > local33;
					if (local1969 || Static110.method1701(Static126.anInt2172)) {
						Static470.method6540(local37, new Class6_Sub50(local20, local49), local45, Static504.anInt8760);
						if (local1969) {
							Static69.method969(local33, local41, Static504.anInt8760);
						}
					}
				}
			} else {
				Static214.method5693("T3 - " + arg0, null);
				Static342.method5247(false);
			}
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IIII)V")
	public static void method4922(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(10) Class6_Sub5_Sub8 local10 = Static49.method760(9, arg2);
		local10.method3256();
		local10.anInt3739 = arg0;
		local10.anInt3740 = arg1;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IIZIFIIII)[[I")
	public static int[][] method4925(@OriginalArg(4) float arg0) {
		@Pc(9) int[][] local9 = new int[256][64];
		@Pc(13) Class6_Sub3_Sub4 local13 = new Class6_Sub3_Sub4();
		local13.anInt726 = (int) ((float) 4096 * arg0);
		local13.anInt731 = 3;
		local13.aBoolean49 = false;
		local13.anInt727 = 8;
		local13.anInt729 = 4;
		local13.method7957();
		Static171.method7158(64, 256);
		for (@Pc(43) int local43 = 0; local43 < 256; local43++) {
			local13.method634(local43, local9[local43]);
		}
		return local9;
	}
}
