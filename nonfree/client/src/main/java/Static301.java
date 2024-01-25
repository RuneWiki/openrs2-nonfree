import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static301 {

	@OriginalMember(owner = "client!tf", name = "d", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!tf", name = "e", descriptor = "I")
	public static int anInt5782;

	@OriginalMember(owner = "client!tf", name = "j", descriptor = "Z")
	public static boolean aBoolean425;

	@OriginalMember(owner = "client!tf", name = "g", descriptor = "I")
	public static int anInt5784 = 0;

	@OriginalMember(owner = "client!tf", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString368 = "";

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIIZZ)V")
	public static void method4874(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) boolean arg4) {
		Static346.anInt6536 = arg0;
		Static174.anInt3604 = arg1;
		Static52.anInt1395 = arg2;
		Static252.aClass49ArrayArrayArray7 = new Class49[4][Static346.anInt6536][Static174.anInt3604];
		Static136.aClass8Array3 = new Class8[4];
		if (arg3) {
			Static289.aClass49ArrayArrayArray5 = new Class49[1][Static346.anInt6536][Static174.anInt3604];
			Static20.anIntArrayArray5 = new int[Static346.anInt6536][Static174.anInt3604];
			Static251.aClass8Array6 = new Class8[1];
		} else {
			Static289.aClass49ArrayArrayArray5 = null;
			Static20.anIntArrayArray5 = null;
			Static251.aClass8Array6 = null;
		}
		if (arg4) {
			Static142.anIntArrayArrayArray11 = new int[4][arg0][arg1];
			Static116.aClass7_Sub16_Sub1Array1 = new Class7_Sub16_Sub1[255];
			Static42.aBooleanArray9 = new boolean[255];
			Static105.anInt6014 = 0;
		} else {
			Static142.anIntArrayArrayArray11 = null;
			Static116.aClass7_Sub16_Sub1Array1 = null;
			Static42.aBooleanArray9 = null;
			Static105.anInt6014 = 0;
		}
		Static143.method3640(false);
		Static125.aClass142Array2 = new Class142[500];
		Static140.anInt3044 = 0;
		Static77.aClass142Array1 = new Class142[500];
		Static309.anInt5902 = 0;
		Static285.anIntArrayArrayArray14 = new int[4][Static346.anInt6536 + 1][Static174.anInt3604 + 1];
		Static282.aClass22_Sub2Array3 = new Class22_Sub2[5000];
		Static2.anInt9 = 0;
		Static65.aBooleanArrayArray1 = new boolean[Static52.anInt1395 + Static52.anInt1395 + 1][Static52.anInt1395 + Static52.anInt1395 + 1];
		Static86.aBooleanArrayArray2 = new boolean[Static52.anInt1395 + Static52.anInt1395 + 2][Static52.anInt1395 + Static52.anInt1395 + 2];
		Static220.aClass11_1 = null;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(III)V")
	public static void method4875(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static183.anIntArray506[arg1] = arg0;
		@Pc(20) Class7_Sub12 local20 = (Class7_Sub12) Static118.aClass10_52.method163((long) arg1);
		if (local20 == null) {
			local20 = new Class7_Sub12(4611686018427387905L);
			Static118.aClass10_52.method161((long) arg1, local20);
		} else if (local20.aLong93 != 4611686018427387905L) {
			local20.aLong93 = Static335.method5308() + 500L | 0x4000000000000000L;
		}
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(B)V")
	public static void method4876() {
		Static341.aClass74_37.method1803();
		for (@Pc(11) Class7_Sub32 local11 = (Class7_Sub32) Static76.aClass74_8.method1793(); local11 != null; local11 = (Class7_Sub32) Static76.aClass74_8.method1798()) {
			if (local11.anInt5229 < 1000) {
				local11.method5648();
				Static341.aClass74_37.method1802(local11);
			}
		}
		Static341.aClass74_37.method1789(Static76.aClass74_8);
		if (Static169.aClass26_20 != null || (Static60.aClass26_13 != null || Static108.anInt1313 > 0)) {
			return;
		}
		@Pc(57) int local57 = Static354.anInt6682;
		@Pc(66) int local66;
		if (!Static169.aBoolean260) {
			if (local57 == 1 && Static33.anInt735 > 0) {
				local66 = ((Class7_Sub32) Static76.aClass74_8.aClass7_72.aClass7_248).anInt5229;
				if (local66 == 21 || local66 == 40 || local66 == 34 || local66 == 1 || local66 == 18 || local66 == 10 || local66 == 13 || local66 == 49 || local66 == 5 || local66 == 16 || local66 == 31 || local66 == 1006) {
					@Pc(327) Class7_Sub32 local327 = (Class7_Sub32) Static76.aClass74_8.aClass7_72.aClass7_248;
					@Pc(334) Class26 local334 = Static245.method4231(local327.anInt5225);
					@Pc(337) Class7_Sub27 local337 = Static45.method1034(local334);
					if (local337.method3766()) {
						Static97.aBoolean164 = false;
						Static197.anInt3885 = 0;
						if (Static169.aClass26_20 != null) {
							Static245.method4226(Static169.aClass26_20);
						}
						Static169.aClass26_20 = Static245.method4231(local327.anInt5225);
						Static354.anInt6688 = Static108.anInt1312;
						Static226.anInt4551 = Static169.anInt3518;
						Static69.anInt1714 = local327.anInt5226;
						Static245.method4226(Static169.aClass26_20);
						return;
					}
				}
			}
			if (local57 <= 0 && Static291.anInt5670 > 0) {
				local57 = Static291.anInt5670;
			}
			Static291.anInt5670 = 0;
			if (local57 == 1 && (Static214.anInt4265 == 1 && Static33.anInt735 > 2 || Static46.method1057())) {
				local57 = 2;
			}
			if (local57 == 2 && Static33.anInt735 > 0) {
				Static73.method1453();
			}
			if (local57 != 1 || Static33.anInt735 <= 0) {
				return;
			}
			Static330.method5267();
			return;
		}
		@Pc(68) int local68;
		if (local57 != 1) {
			local66 = Static240.anInt6396;
			local68 = Static100.anInt2436;
			if (Static279.anInt6648 - 10 > local66 || Static279.anInt6648 + Static220.anInt4389 + 10 < local66 || local68 < Static263.anInt5172 - 10 || local68 > Static343.anInt6507 + Static263.anInt5172 + 10) {
				Static169.aBoolean260 = false;
				Static352.method5647(Static263.anInt5172, Static279.anInt6648, Static220.anInt4389, Static343.anInt6507);
			}
		}
		if (local57 != 1) {
			return;
		}
		local66 = Static279.anInt6648;
		local68 = Static263.anInt5172;
		@Pc(120) int local120 = Static220.anInt4389;
		@Pc(122) int local122 = Static169.anInt3518;
		@Pc(124) int local124 = Static108.anInt1312;
		@Pc(126) int local126 = -1;
		@Pc(144) int local144;
		for (@Pc(128) int local128 = 0; local128 < Static33.anInt735; local128++) {
			if (Static274.aBoolean403) {
				local144 = (Static33.anInt735 - local128 - 1) * 16 + local68 + 33;
				if (local122 > local66 && local122 < local66 + local120 && local124 > local144 - 13 && local124 < local144 + 3) {
					local126 = local128;
				}
			} else {
				local144 = (Static33.anInt735 - local128 - 1) * 16 + local68 + 31;
				if (local66 < local122 && local120 + local66 > local122 && local124 > local144 - 13 && local124 < local144 + 3) {
					local126 = local128;
				}
			}
		}
		if (local126 != -1) {
			local144 = 0;
			@Pc(224) Class166 local224 = new Class166(Static76.aClass74_8);
			for (@Pc(229) Class7_Sub32 local229 = (Class7_Sub32) local224.method4263(); local229 != null; local229 = (Class7_Sub32) local224.method4266()) {
				if (local144 == local126) {
					Static68.method1365(local229);
				}
				local144++;
			}
		}
		Static169.aBoolean260 = false;
		Static352.method5647(Static263.anInt5172, Static279.anInt6648, Static220.anInt4389, Static343.anInt6507);
		return;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IZI)B")
	public static byte method4877(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Z)V")
	public static void method4878() {
		for (@Pc(12) int local12 = 0; local12 < Static85.anInt2209; local12++) {
			@Pc(18) int local18 = Static71.anIntArray241[local12];
			@Pc(22) Class22_Sub2_Sub1_Sub2 local22 = Static69.aClass22_Sub2_Sub1_Sub2Array1[local18];
			@Pc(26) int local26 = Static200.aClass7_Sub3_Sub2_3.method2772();
			if ((local26 & 0x10) != 0) {
				local26 += Static200.aClass7_Sub3_Sub2_3.method2772() << 8;
			}
			if ((local26 & 0x400) != 0) {
				local22.anInt5078 = Static200.aClass7_Sub3_Sub2_3.method2784();
				local22.anInt5091 = Static200.aClass7_Sub3_Sub2_3.method2784();
			}
			@Pc(66) int local66;
			@Pc(70) int local70;
			if ((local26 & 0x2) != 0) {
				local66 = Static200.aClass7_Sub3_Sub2_3.method2732();
				local70 = Static200.aClass7_Sub3_Sub2_3.method2740();
				local22.method4404(local66, local70, Static212.anInt4234);
			}
			@Pc(104) int local104;
			if ((local26 & 0x200) != 0) {
				local66 = Static200.aClass7_Sub3_Sub2_3.method2740();
				@Pc(90) int[] local90 = new int[local66];
				@Pc(93) int[] local93 = new int[local66];
				@Pc(96) int[] local96 = new int[local66];
				for (@Pc(98) int local98 = 0; local98 < local66; local98++) {
					local104 = Static200.aClass7_Sub3_Sub2_3.method2784();
					if (local104 == 65535) {
						local104 = -1;
					}
					local90[local98] = local104;
					local93[local98] = Static200.aClass7_Sub3_Sub2_3.method2740();
					local96[local98] = Static200.aClass7_Sub3_Sub2_3.method2784();
				}
				Static128.method2628(local90, local96, local22, local93);
			}
			if ((local26 & 0x20) != 0) {
				local66 = Static200.aClass7_Sub3_Sub2_3.method2764();
				local70 = Static200.aClass7_Sub3_Sub2_3.method2743();
				if (local66 == 65535) {
					local66 = -1;
				}
				@Pc(165) boolean local165 = true;
				@Pc(237) Class170 local237;
				if (local66 != -1 && local22.anInt5129 != -1) {
					@Pc(184) Class197 local184;
					if (local66 == local22.anInt5129) {
						local184 = Static10.method162(local66);
						if (local184.aBoolean442 && local184.anInt6076 != -1) {
							local237 = Static261.method4379(local184.anInt6076);
							local104 = local237.anInt4968;
							if (local104 == 0) {
								local165 = false;
							} else if (local104 == 1) {
								local165 = true;
							} else if (local104 == 2) {
								local165 = false;
								local22.anInt5120 = 0;
							}
						}
					} else {
						local184 = Static10.method162(local66);
						@Pc(189) Class197 local189 = Static10.method162(local22.anInt5129);
						if (local184.anInt6076 != -1 && local189.anInt6076 != -1) {
							@Pc(202) Class170 local202 = Static261.method4379(local184.anInt6076);
							@Pc(207) Class170 local207 = Static261.method4379(local189.anInt6076);
							if (local202.anInt4963 < local207.anInt4963) {
								local165 = false;
							}
						}
					}
				}
				if (local165) {
					local22.anInt5090 = local70 >> 16;
					local22.anInt5127 = 0;
					local22.anInt5092 = Static212.anInt4234 + (local70 & 0xFFFF);
					local22.anInt5129 = local66;
					local22.anInt5123 = 0;
					local22.anInt5131 = 1;
					if (Static212.anInt4234 < local22.anInt5092) {
						local22.anInt5123 = -1;
					}
					if (local22.anInt5129 != -1 && Static212.anInt4234 == local22.anInt5092) {
						@Pc(322) int local322 = Static10.method162(local22.anInt5129).anInt6076;
						if (local322 != -1) {
							local237 = Static261.method4379(local322);
							if (local237 != null && local237.anIntArray652 != null) {
								Static219.method3870(local237, local22.anInt5967, false, 0, local22.anInt5973);
							}
						}
					}
				}
			}
			if ((local26 & 0x1) != 0) {
				local22.anInt5140 = Static200.aClass7_Sub3_Sub2_3.method2736();
				if (local22.anInt5140 == 65535) {
					local22.anInt5140 = -1;
				}
			}
			if ((local26 & 0x4) != 0) {
				local66 = Static200.aClass7_Sub3_Sub2_3.method2784();
				if (local66 == 65535) {
					local66 = -1;
				}
				local70 = Static200.aClass7_Sub3_Sub2_3.method2763();
				Static103.method2049(local22, local70, local66);
			}
			if ((local26 & 0x100) != 0) {
				local66 = Static200.aClass7_Sub3_Sub2_3.method2784();
				local22.anInt5102 = Static200.aClass7_Sub3_Sub2_3.method2751();
				local22.anInt5089 = Static200.aClass7_Sub3_Sub2_3.method2772();
				local22.aBoolean375 = (local66 & 0x8000) != 0;
				local22.anInt5108 = local66 & 0x7FFF;
				local22.anInt5112 = Static212.anInt4234 + local22.anInt5108 + local22.anInt5102;
			}
			if ((local26 & 0x8) != 0) {
				if (local22.aClass174_1.method4440()) {
					Static62.method1296(local22);
				}
				local22.method4426(Static132.method2664(Static200.aClass7_Sub3_Sub2_3.method2739()));
				local22.method4420(local22.aClass174_1.anInt5191);
				local22.anInt5111 = local22.aClass174_1.anInt5178 << 3;
				if (local22.aClass174_1.method4440()) {
					Static339.method5516(local22, local22.anIntArray666[0], Static168.anInt3508, null, null, local22.anIntArray665[0], 0);
				}
			}
			if ((local26 & 0x80) != 0) {
				local22.aString325 = Static200.aClass7_Sub3_Sub2_3.method2782();
				local22.anInt5125 = 100;
			}
			if ((local26 & 0x40) != 0) {
				local66 = Static200.aClass7_Sub3_Sub2_3.method2732();
				local70 = Static200.aClass7_Sub3_Sub2_3.method2751();
				local22.method4404(local66, local70, Static212.anInt4234);
				local22.anInt5094 = Static212.anInt4234 + 300;
				local22.anInt5109 = Static200.aClass7_Sub3_Sub2_3.method2740();
			}
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V")
	public static void method4879() {
		Static216.aClass103_41.method2678();
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IBIILclient!pe;Lclient!kk;)V")
	public static void method4880(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class89 arg3, @OriginalArg(5) Class122 arg4) {
		@Pc(8) Class83 local8 = Static171.method3241(arg4.anInt3536);
		if (local8.anInt2442 == -1) {
			return;
		}
		if (arg4.aBoolean265) {
			@Pc(24) int local24 = arg1 + arg4.anInt3543;
			arg1 = local24 & 0x3;
		} else {
			arg1 = 0;
		}
		@Pc(36) Class52 local36 = local8.method2035(arg4.aBoolean269, arg1, arg3);
		if (local36 == null) {
			return;
		}
		@Pc(42) int local42 = arg4.anInt3562;
		@Pc(45) int local45 = arg4.anInt3527;
		if ((arg1 & 0x1) == 1) {
			local42 = arg4.anInt3527;
			local45 = arg4.anInt3562;
		}
		@Pc(59) int local59 = local36.method4141();
		@Pc(62) int local62 = local36.method4140();
		if (local8.aBoolean169) {
			local59 = local42 * 4;
			local62 = local45 * 4;
		}
		if (local8.anInt2446 == 0) {
			local36.method4130(arg0, arg2 + 4 - local45 * 4, local59, local62);
		} else {
			local36.method4127(arg0, arg2 + 4 - local45 * 4, local59, local62, 1, local8.anInt2446 | 0xFF000000, 1);
		}
	}
}
