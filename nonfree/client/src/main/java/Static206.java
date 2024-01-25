import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static206 {

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(Lclient!oa;I)V")
	public static void method3379(@OriginalArg(0) Class90 arg0) {
		@Pc(7) int local7 = Static420.anInt8173;
		@Pc(9) int local9 = Static308.anInt5670;
		@Pc(11) int local11 = Static237.anInt4304;
		@Pc(15) int local15 = Static415.anInt7406 - 3;
		if (Static526.aClass71_57 == null || Static469.aClass71_49 == null) {
			if (Static114.aClass248_20.method5804(Static576.anInt9883) && Static114.aClass248_20.method5804(Static388.anInt7097)) {
				Static526.aClass71_57 = arg0.method7522(Static593.method4148(Static114.aClass248_20, Static576.anInt9883, 0));
				@Pc(61) Class177 local61 = Static593.method4148(Static114.aClass248_20, Static388.anInt7097, 0);
				Static469.aClass71_49 = arg0.method7522(local61);
				local61.method4146();
				Static147.aClass71_14 = arg0.method7522(local61);
			} else {
				arg0.C(local7, local9, local11, 20, Static321.anInt6143 | 255 - Static54.anInt962 << 24, 1);
			}
		}
		@Pc(88) int local88;
		if (Static526.aClass71_57 != null && Static469.aClass71_49 != null) {
			local88 = (local11 - Static469.aClass71_49.QA() * 2) / Static526.aClass71_57.QA();
			for (@Pc(90) int local90 = 0; local90 < local88; local90++) {
				Static526.aClass71_57.method7775(local7 + Static469.aClass71_49.QA() + local90 * Static526.aClass71_57.QA(), local9);
			}
			Static469.aClass71_49.method7775(local7, local9);
			Static147.aClass71_14.method7775(local11 + local7 - Static147.aClass71_14.QA(), local9);
		}
		Static264.aClass82_3.method7875(local9 + 14, -1, -16777216 | Static17.anInt233, Static146.aClass103_71.method2355(Static188.anInt28), local7 + 3);
		arg0.C(local7, local9 + 20, local11, local15 - 20, -Static54.anInt962 + 255 << 24 | Static321.anInt6143, 1);
		local88 = Static9.aClass29_1.method2946();
		@Pc(180) int local180 = Static9.aClass29_1.method2942();
		@Pc(182) int local182 = 0;
		@Pc(204) int local204;
		for (@Pc(187) Class6_Sub26 local187 = (Class6_Sub26) Static408.aClass298_154.method6809(); local187 != null; local187 = (Class6_Sub26) Static408.aClass298_154.method6821()) {
			local204 = (Static384.anInt7048 - local182 - 1) * 16 + local9 + 13 + 20;
			local182++;
			if (local7 < local88 && local11 + local7 > local88 && local204 - 13 < local180 && local180 < local204 + 4 && local187.aBoolean381) {
				arg0.C(local7, local204 - 12, local11, 16, Static379.anInt6947 | 255 - Static568.anInt9837 << 24, 1);
			}
		}
		if ((Static31.aClass71_5 == null || Static40.aClass71_56 == null || Static507.aClass71_53 == null) && Static114.aClass248_20.method5804(Static504.anInt8759) && Static114.aClass248_20.method5804(Static353.anInt6592) && Static114.aClass248_20.method5804(Static57.anInt991)) {
			@Pc(292) Class177 local292 = Static593.method4148(Static114.aClass248_20, Static353.anInt6592, 0);
			Static40.aClass71_56 = arg0.method7522(local292);
			local292.method4146();
			Static217.aClass71_23 = arg0.method7522(local292);
			Static31.aClass71_5 = arg0.method7522(Static593.method4148(Static114.aClass248_20, Static504.anInt8759, 0));
			@Pc(317) Class177 local317 = Static593.method4148(Static114.aClass248_20, Static57.anInt991, 0);
			Static507.aClass71_53 = arg0.method7522(local317);
			local317.method4146();
			Static571.aClass71_58 = arg0.method7522(local317);
		}
		@Pc(384) int local384;
		@Pc(348) int local348;
		if (Static31.aClass71_5 != null && Static40.aClass71_56 != null && Static507.aClass71_53 != null) {
			local204 = (local11 - Static507.aClass71_53.QA() * 2) / Static31.aClass71_5.QA();
			for (local348 = 0; local348 < local204; local348++) {
				Static31.aClass71_5.method7775(local7 + Static507.aClass71_53.QA() + local348 * Static31.aClass71_5.QA(), local15 + local9 - Static31.aClass71_5.b());
			}
			local384 = (local15 - Static507.aClass71_53.b() - 20) / Static40.aClass71_56.b();
			for (@Pc(386) int local386 = 0; local386 < local384; local386++) {
				Static40.aClass71_56.method7775(local7, local9 + local386 * Static40.aClass71_56.b() + 20);
				Static217.aClass71_23.method7775(local11 + local7 - Static217.aClass71_23.QA(), local386 * Static40.aClass71_56.b() + 20 + local9);
			}
			Static507.aClass71_53.method7775(local7, local9 + local15 - Static507.aClass71_53.b());
			Static571.aClass71_58.method7775(local11 + local7 - Static507.aClass71_53.QA(), local9 - (-local15 + Static507.aClass71_53.b()));
		}
		local182 = 0;
		for (@Pc(458) Class6_Sub26 local458 = (Class6_Sub26) Static408.aClass298_154.method6809(); local458 != null; local458 = (Class6_Sub26) Static408.aClass298_154.method6821()) {
			local348 = (Static384.anInt7048 - local182 - 1) * 16 + local9 + 33;
			local384 = Static17.anInt233 | 0xFF000000;
			if (local88 > local7 && local88 < local7 + local11 && local348 - 13 < local180 && local180 < local348 + 4 && local458.aBoolean381) {
				local384 = Static415.anInt7404 | 0xFF000000;
			}
			@Pc(515) int[] local515 = null;
			if (Static452.method6341(local458.anInt5472)) {
				local515 = Static119.aClass244_4.method5726((int) local458.aLong126).anIntArray482;
			} else if (local458.anInt5470 != -1) {
				local515 = Static119.aClass244_4.method5726(local458.anInt5470).anIntArray482;
			} else if (Static543.method7377(local458.anInt5472)) {
				@Pc(555) Class6_Sub49 local555 = (Class6_Sub49) Static251.aClass234_29.method5464((long) local458.aLong126);
				if (local555 != null) {
					@Pc(560) Class15_Sub2_Sub4_Sub1 local560 = local555.aClass15_Sub2_Sub4_Sub1_2;
					@Pc(563) Class88 local563 = local560.aClass88_1;
					if (local563.anIntArray182 != null) {
						local563 = local563.method1940(Static65.aClass51_1);
					}
					if (local563 != null) {
						local515 = local563.anIntArray184;
					}
				}
			} else if (Static252.method3929(local458.anInt5472)) {
				@Pc(599) Class192 local599;
				if (local458.anInt5472 == 1007) {
					local599 = Static85.aClass27_1.method516((int) local458.aLong126);
				} else {
					local599 = Static85.aClass27_1.method516((int) (local458.aLong126 >>> 32 & 0x7FFFFFFFL));
				}
				if (local599.lb != null) {
					local599 = local599.method4585(Static65.aClass51_1);
				}
				if (local599 != null) {
					local515 = local599.anIntArray426;
				}
			}
			@Pc(624) String local624 = Static378.method5557(local458);
			if (local515 != null) {
				local624 = local624 + Static96.method6297(local515);
			}
			Static264.aClass82_3.method7880(local384, local624, Static154.anIntArray283, local348, local7 + 3, Static241.aClass71Array29);
			if (local458.aBoolean380) {
				Static449.aClass71_48.method7775(Static479.aClass202_13.method4970(local624) + local7 + 5, local348 - 12);
			}
			local182++;
		}
		Static482.method6777(Static308.anInt5670, Static237.anInt4304, Static420.anInt8173, Static415.anInt7406);
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(I)Z")
	public static boolean method3380() throws IOException {
		if (Static354.aClass1_1 == null) {
			return false;
		}
		@Pc(73) int local73;
		if (Static144.aClass98_147 == null) {
			if (Static317.aBoolean440) {
				if (!Static354.aClass1_1.method49(1)) {
					return false;
				}
				Static354.aClass1_1.method52(1, 0, Static429.aClass6_Sub12_Sub2_2.aByteArray97);
				Static317.aBoolean440 = false;
				Static221.anInt4092 = 0;
				Static203.anInt3864++;
			}
			Static429.aClass6_Sub12_Sub2_2.anInt7556 = 0;
			if (Static429.aClass6_Sub12_Sub2_2.method6060()) {
				if (!Static354.aClass1_1.method49(1)) {
					return false;
				}
				Static354.aClass1_1.method52(1, 1, Static429.aClass6_Sub12_Sub2_2.aByteArray97);
				Static221.anInt4092 = 0;
				Static203.anInt3864++;
			}
			Static317.aBoolean440 = true;
			@Pc(69) Class98[] local69 = Static315.method4916();
			local73 = Static429.aClass6_Sub12_Sub2_2.method6063();
			if (local73 < 0 || local73 >= local69.length) {
				throw new IOException("invo:" + local73 + " ip:" + Static429.aClass6_Sub12_Sub2_2.anInt7556);
			}
			Static144.aClass98_147 = local69[local73];
			Static207.anInt3929 = Static144.aClass98_147.anInt2737;
		}
		if (Static207.anInt3929 == -1) {
			if (!Static354.aClass1_1.method49(1)) {
				return false;
			}
			Static354.aClass1_1.method52(1, 0, Static429.aClass6_Sub12_Sub2_2.aByteArray97);
			Static207.anInt3929 = Static429.aClass6_Sub12_Sub2_2.aByteArray97[0] & 0xFF;
			Static221.anInt4092 = 0;
			Static203.anInt3864++;
		}
		if (Static207.anInt3929 == -2) {
			if (!Static354.aClass1_1.method49(2)) {
				return false;
			}
			Static354.aClass1_1.method52(2, 0, Static429.aClass6_Sub12_Sub2_2.aByteArray97);
			Static429.aClass6_Sub12_Sub2_2.anInt7556 = 0;
			Static207.anInt3929 = Static429.aClass6_Sub12_Sub2_2.method6044();
			Static221.anInt4092 = 0;
			Static203.anInt3864 += 2;
		}
		if (Static207.anInt3929 > 0) {
			if (!Static354.aClass1_1.method49(Static207.anInt3929)) {
				return false;
			}
			Static429.aClass6_Sub12_Sub2_2.anInt7556 = 0;
			Static354.aClass1_1.method52(Static207.anInt3929, 0, Static429.aClass6_Sub12_Sub2_2.aByteArray97);
			Static203.anInt3864 += Static207.anInt3929;
			Static221.anInt4092 = 0;
		}
		Static446.aClass98_124 = Static111.aClass98_28;
		Static111.aClass98_28 = Static84.aClass98_23;
		Static84.aClass98_23 = Static144.aClass98_147;
		if (Static262.aClass98_68 == Static144.aClass98_147) {
			Static316.method4918(Static307.aClass230_34);
			Static144.aClass98_147 = null;
			return true;
		}
		@Pc(244) String local244;
		if (Static222.aClass98_57 == Static144.aClass98_147) {
			if (Static85.aFrame1 != null) {
				Static192.method3260(Static58.aClass6_Sub17_Sub1_1.anInt9294, false, -1, -1);
			}
			@Pc(232) byte[] local232 = new byte[Static207.anInt3929];
			Static429.aClass6_Sub12_Sub2_2.method6066(local232, Static207.anInt3929);
			local244 = Static497.method6882(0, Static207.anInt3929, local232);
			Static283.method4315(true, local244, Static79.anInt2700 == 1, Static174.aClass313_24);
			Static144.aClass98_147 = null;
			return true;
		}
		@Pc(284) int local284;
		@Pc(268) int local268;
		@Pc(278) int local278;
		@Pc(290) int local290;
		@Pc(296) int local296;
		if (Static566.aClass98_153 == Static144.aClass98_147) {
			local268 = Static429.aClass6_Sub12_Sub2_2.method6044();
			local73 = Static429.aClass6_Sub12_Sub2_2.method6019();
			local278 = Static429.aClass6_Sub12_Sub2_2.method6019();
			local284 = Static429.aClass6_Sub12_Sub2_2.method6044() << 2;
			local290 = Static429.aClass6_Sub12_Sub2_2.method6019();
			local296 = Static429.aClass6_Sub12_Sub2_2.method6019();
			if (Static498.method6894(local268)) {
				Static130.method2064(true, local290, local278, local296, local284, local73);
			}
			Static144.aClass98_147 = null;
			return true;
		} else if (Static298.aClass98_78 == Static144.aClass98_147) {
			local268 = Static429.aClass6_Sub12_Sub2_2.method5998();
			local73 = Static429.aClass6_Sub12_Sub2_2.method6000();
			local278 = Static429.aClass6_Sub12_Sub2_2.method6055();
			if (Static498.method6894(local278)) {
				Static453.method6343(local73, local268);
			}
			Static144.aClass98_147 = null;
			return true;
		} else {
			@Pc(399) int local399;
			@Pc(496) int local496;
			@Pc(359) boolean local359;
			@Pc(457) String local457;
			@Pc(379) boolean local379;
			@Pc(486) int local486;
			@Pc(461) Class264 local461;
			@Pc(348) String local348;
			if (Static144.aClass98_147 == Static450.aClass98_129) {
				local348 = Static429.aClass6_Sub12_Sub2_2.method6040();
				local359 = Static429.aClass6_Sub12_Sub2_2.method6019() == 1;
				if (local359) {
					local244 = Static429.aClass6_Sub12_Sub2_2.method6040();
				} else {
					local244 = local348;
				}
				local284 = Static429.aClass6_Sub12_Sub2_2.method6044();
				@Pc(377) byte local377 = Static429.aClass6_Sub12_Sub2_2.method6049();
				local379 = false;
				if (local377 == -128) {
					local379 = true;
				}
				if (local379) {
					if (Static181.anInt3476 == 0) {
						Static144.aClass98_147 = null;
						return true;
					}
					for (local399 = 0; Static181.anInt3476 > local399 && (!Static175.aClass264Array1[local399].aString61.equals(local244) || local284 != Static175.aClass264Array1[local399].anInt7490); local399++) {
					}
					if (local399 < Static181.anInt3476) {
						while (local399 < Static181.anInt3476 - 1) {
							Static175.aClass264Array1[local399] = Static175.aClass264Array1[local399 + 1];
							local399++;
						}
						Static181.anInt3476--;
						Static175.aClass264Array1[Static181.anInt3476] = null;
					}
				} else {
					local457 = Static429.aClass6_Sub12_Sub2_2.method6040();
					local461 = new Class264();
					local461.aString62 = local348;
					local461.aString61 = local244;
					local461.aString59 = Static83.method1161(local461.aString61);
					local461.aString60 = local457;
					local461.anInt7490 = local284;
					local461.aByte85 = local377;
					for (local486 = Static181.anInt3476 - 1; local486 >= 0; local486--) {
						local496 = Static175.aClass264Array1[local486].aString59.compareTo(local461.aString59);
						if (local496 == 0) {
							Static175.aClass264Array1[local486].anInt7490 = local284;
							Static175.aClass264Array1[local486].aByte85 = local377;
							Static175.aClass264Array1[local486].aString60 = local457;
							if (local244.equals(Static461.aClass15_Sub2_Sub4_Sub2_2.aString82)) {
								Static76.aByte10 = local377;
							}
							Static451.anInt7959 = Static124.anInt2133;
							Static144.aClass98_147 = null;
							return true;
						}
						if (local496 < 0) {
							break;
						}
					}
					if (Static175.aClass264Array1.length <= Static181.anInt3476) {
						Static144.aClass98_147 = null;
						return true;
					}
					for (local496 = Static181.anInt3476 - 1; local496 > local486; local496--) {
						Static175.aClass264Array1[local496 + 1] = Static175.aClass264Array1[local496];
					}
					if (Static181.anInt3476 == 0) {
						Static175.aClass264Array1 = new Class264[100];
					}
					Static175.aClass264Array1[local486 + 1] = local461;
					Static181.anInt3476++;
					if (local244.equals(Static461.aClass15_Sub2_Sub4_Sub2_2.aString82)) {
						Static76.aByte10 = local377;
					}
				}
				Static144.aClass98_147 = null;
				Static451.anInt7959 = Static124.anInt2133;
				return true;
			} else if (Static66.aClass98_18 == Static144.aClass98_147) {
				Static78.method1115(false);
				Static144.aClass98_147 = null;
				return true;
			} else if (Static241.aClass98_60 == Static144.aClass98_147) {
				local348 = Static429.aClass6_Sub12_Sub2_2.method6040();
				local244 = Static344.method5254(Static197.method3310(Static429.aClass6_Sub12_Sub2_2));
				Static170.method2697(local348, local348, local348, 6, local244, 0);
				Static144.aClass98_147 = null;
				return true;
			} else if (Static512.aClass98_143 == Static144.aClass98_147) {
				Static205.anInt3900 = Static429.aClass6_Sub12_Sub2_2.method6019();
				Static144.aClass98_147 = null;
				Static390.anInt7115 = Static124.anInt2133;
				return true;
			} else {
				@Pc(667) String local667;
				if (Static144.aClass98_147 == Static114.aClass98_30) {
					local348 = Static429.aClass6_Sub12_Sub2_2.method6040();
					local73 = Static429.aClass6_Sub12_Sub2_2.method6044();
					local667 = Static186.aClass266_1.method5987(local73).method5749(Static429.aClass6_Sub12_Sub2_2);
					Static49.method762(local348, local667, local348, 19, null, local348, local73, 0);
					Static144.aClass98_147 = null;
					return true;
				} else if (Static493.aClass98_139 == Static144.aClass98_147) {
					Static316.method4918(Static157.aClass230_42);
					Static144.aClass98_147 = null;
					return true;
				} else if (Static374.aClass98_103 == Static144.aClass98_147) {
					local268 = Static429.aClass6_Sub12_Sub2_2.method6044();
					local73 = Static429.aClass6_Sub12_Sub2_2.method6019();
					local278 = Static429.aClass6_Sub12_Sub2_2.method6019();
					local284 = Static429.aClass6_Sub12_Sub2_2.method6044() << 2;
					local290 = Static429.aClass6_Sub12_Sub2_2.method6019();
					local296 = Static429.aClass6_Sub12_Sub2_2.method6019();
					if (Static498.method6894(local268)) {
						Static88.method1369(local290, local73, local284, local278, local296);
					}
					Static144.aClass98_147 = null;
					return true;
				} else if (Static144.aClass98_147 == Static105.aClass98_27) {
					local268 = Static429.aClass6_Sub12_Sub2_2.method6055();
					local73 = Static429.aClass6_Sub12_Sub2_2.method6055();
					local278 = Static429.aClass6_Sub12_Sub2_2.method6015();
					if (Static498.method6894(local268)) {
						Static205.method3376(local73, local278);
					}
					Static144.aClass98_147 = null;
					return true;
				} else if (Static255.aClass98_62 == Static144.aClass98_147) {
					Static316.method4918(Static476.aClass230_48);
					Static144.aClass98_147 = null;
					return true;
				} else if (Static261.aClass98_67 == Static144.aClass98_147) {
					if (Static355.method5330(Static375.anInt9162)) {
						Static503.anInt8751 = (int) ((float) Static429.aClass6_Sub12_Sub2_2.method6044() * 2.5F);
					} else {
						Static503.anInt8751 = Static429.aClass6_Sub12_Sub2_2.method6044() * 30;
					}
					Static144.aClass98_147 = null;
					Static390.anInt7115 = Static124.anInt2133;
					return true;
				} else {
					@Pc(819) boolean local819;
					if (Static144.aClass98_147 == Static202.aClass98_51) {
						local819 = Static429.aClass6_Sub12_Sub2_2.method6019() == 1;
						@Pc(824) byte[] local824 = new byte[Static207.anInt3929 - 1];
						Static429.aClass6_Sub12_Sub2_2.method6020(local824, Static207.anInt3929 - 1);
						Static23.method344(local824, local819);
						Static144.aClass98_147 = null;
						return true;
					}
					@Pc(882) String local882;
					@Pc(886) String local886;
					@Pc(870) String local870;
					if (Static144.aClass98_147 == Static86.aClass98_156) {
						local268 = Static429.aClass6_Sub12_Sub2_2.method6019();
						@Pc(860) boolean local860 = (local268 & 0x1) == 1;
						local667 = Static429.aClass6_Sub12_Sub2_2.method6040();
						local870 = Static429.aClass6_Sub12_Sub2_2.method6040();
						if (local870.equals("")) {
							local870 = local667;
						}
						local882 = Static429.aClass6_Sub12_Sub2_2.method6040();
						local886 = Static429.aClass6_Sub12_Sub2_2.method6040();
						if (local886.equals("")) {
							local886 = local882;
						}
						if (local860) {
							for (local399 = 0; local399 < Static244.anInt4491; local399++) {
								if (Static328.aStringArray27[local399].equals(local886)) {
									Static74.aStringArray5[local399] = local667;
									Static328.aStringArray27[local399] = local870;
									Static41.aStringArray4[local399] = local882;
									Static140.aStringArray12[local399] = local886;
									break;
								}
							}
						} else {
							Static74.aStringArray5[Static244.anInt4491] = local667;
							Static328.aStringArray27[Static244.anInt4491] = local870;
							Static41.aStringArray4[Static244.anInt4491] = local882;
							Static140.aStringArray12[Static244.anInt4491] = local886;
							Static300.aBooleanArray19[Static244.anInt4491] = (local268 & 0x2) == 2;
							Static244.anInt4491++;
						}
						Static83.anInt1400 = Static124.anInt2133;
						Static144.aClass98_147 = null;
						return true;
					} else if (Static545.aClass98_150 == Static144.aClass98_147) {
						local268 = Static429.aClass6_Sub12_Sub2_2.method6048();
						local73 = Static429.aClass6_Sub12_Sub2_2.method6044();
						local278 = Static429.aClass6_Sub12_Sub2_2.method6019();
						@Pc(993) Class6_Sub49 local993 = (Class6_Sub49) Static251.aClass234_29.method5464((long) local73);
						if (local993 != null) {
							Static498.method6895(local278, local268, local993.aClass15_Sub2_Sub4_Sub1_2);
						}
						Static144.aClass98_147 = null;
						return true;
					} else if (Static144.aClass98_147 == Static190.aClass98_128) {
						Static319.anInt3808 = Static429.aClass6_Sub12_Sub2_2.method6014();
						Static12.anInt191 = Static429.aClass6_Sub12_Sub2_2.method6019();
						Static144.aClass98_147 = null;
						return true;
					} else if (Static144.aClass98_147 == Static72.aClass98_19) {
						local268 = Static429.aClass6_Sub12_Sub2_2.method6027();
						local73 = Static429.aClass6_Sub12_Sub2_2.method6011();
						local278 = Static429.aClass6_Sub12_Sub2_2.method6048();
						if (local278 == 65535) {
							local278 = -1;
						}
						Static151.method2393(local278, local73, local268);
						Static144.aClass98_147 = null;
						return true;
					} else if (Static92.aClass98_24 == Static144.aClass98_147) {
						local268 = Static429.aClass6_Sub12_Sub2_2.method6044();
						if (local268 == 65535) {
							local268 = -1;
						}
						local73 = Static429.aClass6_Sub12_Sub2_2.method6037();
						local278 = Static429.aClass6_Sub12_Sub2_2.method6011();
						Static62.method894(local268, local73, local278);
						Static144.aClass98_147 = null;
						return true;
					} else if (Static144.aClass98_147 == Static157.aClass98_97) {
						local268 = Static429.aClass6_Sub12_Sub2_2.method6027();
						local73 = Static429.aClass6_Sub12_Sub2_2.method6055();
						local359 = (local268 & 0x1) == 1;
						Static78.method1117(local359, local73);
						Static205.anIntArray339[Static350.anInt6572++ & 0x1F] = local73;
						Static144.aClass98_147 = null;
						return true;
					} else if (Static117.aClass98_31 == Static144.aClass98_147) {
						local268 = Static429.aClass6_Sub12_Sub2_2.method6044();
						local244 = Static429.aClass6_Sub12_Sub2_2.method6040();
						@Pc(1141) Object[] local1141 = new Object[local244.length() + 1];
						for (local284 = local244.length() - 1; local284 >= 0; local284--) {
							if (local244.charAt(local284) == 's') {
								local1141[local284 + 1] = Static429.aClass6_Sub12_Sub2_2.method6040();
							} else {
								local1141[local284 + 1] = Integer.valueOf(Static429.aClass6_Sub12_Sub2_2.method6015());
							}
						}
						local1141[0] = Integer.valueOf(Static429.aClass6_Sub12_Sub2_2.method6015());
						if (Static498.method6894(local268)) {
							@Pc(1198) Class6_Sub1 local1198 = new Class6_Sub1();
							local1198.anObjectArray1 = local1141;
							Static199.method3316(local1198);
						}
						Static144.aClass98_147 = null;
						return true;
					} else if (Static144.aClass98_147 == Static375.aClass98_148) {
						local268 = Static429.aClass6_Sub12_Sub2_2.method6019();
						local73 = local268 >> 5;
						local278 = local268 & 0x1F;
						if (local278 == 0) {
							Static168.aClass279Array1[local73] = null;
							Static144.aClass98_147 = null;
							return true;
						}
						@Pc(1236) Class279 local1236 = new Class279();
						local1236.anInt7966 = local278;
						local1236.anInt7965 = Static429.aClass6_Sub12_Sub2_2.method6019();
						if (local1236.anInt7965 >= 0 && local1236.anInt7965 < Static544.aClass71Array44.length) {
							if (local1236.anInt7966 == 1 || local1236.anInt7966 == 10) {
								local1236.anInt7964 = Static429.aClass6_Sub12_Sub2_2.method6044();
								Static429.aClass6_Sub12_Sub2_2.anInt7556 += 6;
							} else if (local1236.anInt7966 >= 2 && local1236.anInt7966 <= 6) {
								if (local1236.anInt7966 == 2) {
									local1236.anInt7971 = 256;
									local1236.anInt7961 = 256;
								}
								if (local1236.anInt7966 == 3) {
									local1236.anInt7971 = 0;
									local1236.anInt7961 = 256;
								}
								if (local1236.anInt7966 == 4) {
									local1236.anInt7971 = 512;
									local1236.anInt7961 = 256;
								}
								if (local1236.anInt7966 == 5) {
									local1236.anInt7961 = 0;
									local1236.anInt7971 = 256;
								}
								if (local1236.anInt7966 == 6) {
									local1236.anInt7971 = 256;
									local1236.anInt7961 = 512;
								}
								local1236.anInt7966 = 2;
								local1236.anInt7960 = Static429.aClass6_Sub12_Sub2_2.method6019();
								local1236.anInt7971 += Static429.aClass6_Sub12_Sub2_2.method6044() - Static150.anInt2792 << 9;
								local1236.anInt7961 += Static429.aClass6_Sub12_Sub2_2.method6044() - Static154.anInt2878 << 9;
								local1236.anInt7969 = Static429.aClass6_Sub12_Sub2_2.method6019() << 2;
								local1236.anInt7970 = Static429.aClass6_Sub12_Sub2_2.method6044();
							}
							local1236.anInt7968 = Static429.aClass6_Sub12_Sub2_2.method6044();
							if (local1236.anInt7968 == 65535) {
								local1236.anInt7968 = -1;
							}
							Static168.aClass279Array1[local73] = local1236;
						}
						Static144.aClass98_147 = null;
						return true;
					} else if (Static144.aClass98_147 == Static502.aClass98_140) {
						Static316.method4918(Static176.aClass230_56);
						Static144.aClass98_147 = null;
						return true;
					} else if (Static114.aClass98_29 == Static144.aClass98_147) {
						local268 = Static429.aClass6_Sub12_Sub2_2.method6044();
						local73 = Static429.aClass6_Sub12_Sub2_2.method6019();
						local278 = Static429.aClass6_Sub12_Sub2_2.method6019();
						local284 = Static429.aClass6_Sub12_Sub2_2.method6019();
						local290 = Static429.aClass6_Sub12_Sub2_2.method6019();
						local296 = Static429.aClass6_Sub12_Sub2_2.method6044();
						if (Static498.method6894(local268)) {
							Static297.aBooleanArray18[local73] = true;
							Static348.anIntArray459[local73] = local278;
							Static10.anIntArray7[local73] = local284;
							Static134.anIntArray559[local73] = local290;
							Static12.anIntArray11[local73] = local296;
						}
						Static144.aClass98_147 = null;
						return true;
					} else if (Static147.aClass98_36 == Static144.aClass98_147) {
						local268 = Static429.aClass6_Sub12_Sub2_2.method6044();
						local73 = Static429.aClass6_Sub12_Sub2_2.method6004();
						Static65.aClass51_1.method966(local268, local73);
						Static144.aClass98_147 = null;
						return true;
					} else if (Static144.aClass98_147 == Static109.aClass98_42) {
						Static342.method5247(Static31.aBoolean30);
						Static144.aClass98_147 = null;
						return false;
					} else if (Static144.aClass98_147 == Static175.aClass98_41) {
						local268 = Static429.aClass6_Sub12_Sub2_2.method6015();
						Static154.aClass224_5 = Static174.aClass313_24.method6979(local268);
						Static144.aClass98_147 = null;
						return true;
					} else if (Static144.aClass98_147 == Static105.aClass98_26) {
						local268 = Static429.aClass6_Sub12_Sub2_2.method6048();
						local73 = Static429.aClass6_Sub12_Sub2_2.method6008();
						if (Static498.method6894(local268)) {
							Static527.method7227(local73, -1, -1, 3);
						}
						Static144.aClass98_147 = null;
						return true;
					} else if (Static448.aClass98_126 == Static144.aClass98_147) {
						Static316.method4918(Static451.aClass230_46);
						Static144.aClass98_147 = null;
						return true;
					} else if (Static144.aClass98_147 == Static58.aClass98_13) {
						local268 = Static429.aClass6_Sub12_Sub2_2.method6044();
						local73 = Static429.aClass6_Sub12_Sub2_2.method6015();
						if (Static498.method6894(local268)) {
							@Pc(1588) Class6_Sub43 local1588 = (Class6_Sub43) Static162.aClass234_23.method5464((long) local73);
							if (local1588 != null) {
								Static536.method7299(false, true, local1588);
							}
							if (Static200.aClass97_11 != null) {
								Static479.method6666(Static200.aClass97_11);
								Static200.aClass97_11 = null;
							}
						}
						Static144.aClass98_147 = null;
						return true;
					} else if (Static144.aClass98_147 == Static27.aClass98_7) {
						local268 = Static429.aClass6_Sub12_Sub2_2.method6048();
						@Pc(1619) byte local1619 = Static429.aClass6_Sub12_Sub2_2.method6051();
						Static65.aClass51_1.method962(local1619, local268);
						Static144.aClass98_147 = null;
						return true;
					} else if (Static421.aClass98_119 == Static144.aClass98_147) {
						local268 = Static429.aClass6_Sub12_Sub2_2.method6048();
						local73 = Static429.aClass6_Sub12_Sub2_2.method6004();
						local278 = Static429.aClass6_Sub12_Sub2_2.method6019();
						if (Static498.method6894(local268)) {
							Static245.method3826(local278, local73);
						}
						Static144.aClass98_147 = null;
						return true;
					} else if (Static144.aClass98_147 == Static432.aClass98_121) {
						Static362.anInt6663 = Static429.aClass6_Sub12_Sub2_2.method6049() << 3;
						Static504.anInt8760 = Static429.aClass6_Sub12_Sub2_2.method6011();
						Static365.anInt6684 = Static429.aClass6_Sub12_Sub2_2.method6051() << 3;
						Static144.aClass98_147 = null;
						return true;
					} else if (Static283.aClass98_73 == Static144.aClass98_147) {
						Static244.anInt4491 = Static429.aClass6_Sub12_Sub2_2.method6019();
						for (local268 = 0; local268 < Static244.anInt4491; local268++) {
							Static74.aStringArray5[local268] = Static429.aClass6_Sub12_Sub2_2.method6040();
							Static328.aStringArray27[local268] = Static429.aClass6_Sub12_Sub2_2.method6040();
							if (Static328.aStringArray27[local268].equals("")) {
								Static328.aStringArray27[local268] = Static74.aStringArray5[local268];
							}
							Static41.aStringArray4[local268] = Static429.aClass6_Sub12_Sub2_2.method6040();
							Static140.aStringArray12[local268] = Static429.aClass6_Sub12_Sub2_2.method6040();
							if (Static140.aStringArray12[local268].equals("")) {
								Static140.aStringArray12[local268] = Static41.aStringArray4[local268];
							}
							Static300.aBooleanArray19[local268] = false;
						}
						Static83.anInt1400 = Static124.anInt2133;
						Static144.aClass98_147 = null;
						return true;
					} else if (Static144.aClass98_147 == Static368.aClass98_99) {
						Static374.method5490();
						Static144.aClass98_147 = null;
						return true;
					} else {
						@Pc(1803) long local1803;
						@Pc(1808) long local1808;
						@Pc(1814) int local1814;
						@Pc(1829) int local1829;
						if (Static528.aClass98_146 == Static144.aClass98_147) {
							local819 = Static429.aClass6_Sub12_Sub2_2.method6019() == 1;
							local244 = Static429.aClass6_Sub12_Sub2_2.method6040();
							local667 = local244;
							if (local819) {
								local667 = Static429.aClass6_Sub12_Sub2_2.method6040();
							}
							local1803 = Static429.aClass6_Sub12_Sub2_2.method6044();
							local1808 = Static429.aClass6_Sub12_Sub2_2.method6037();
							local1814 = Static429.aClass6_Sub12_Sub2_2.method6019();
							local486 = Static429.aClass6_Sub12_Sub2_2.method6044();
							@Pc(1825) long local1825 = (local1803 << 32) + local1808;
							@Pc(1827) boolean local1827 = false;
							local1829 = 0;
							while (true) {
								if (local1829 >= 100) {
									if (local1814 <= 1 && Static170.method2693(local667)) {
										local1827 = true;
									}
									break;
								}
								if (Static242.aLongArray13[local1829] == local1825) {
									local1827 = true;
									break;
								}
								local1829++;
							}
							if (!local1827 && Static67.anInt1146 == 0) {
								Static242.aLongArray13[Static70.anInt1180] = local1825;
								Static70.anInt1180 = (Static70.anInt1180 + 1) % 100;
								@Pc(1882) String local1882 = Static186.aClass266_1.method5987(local486).method5749(Static429.aClass6_Sub12_Sub2_2);
								if (local1814 == 2) {
									Static49.method762(local244, local1882, "<img=1>" + local667, 18, null, "<img=1>" + local244, local486, 0);
								} else if (local1814 == 1) {
									Static49.method762(local244, local1882, "<img=0>" + local667, 18, null, "<img=0>" + local244, local486, 0);
								} else {
									Static49.method762(local244, local1882, local667, 18, null, local244, local486, 0);
								}
							}
							Static144.aClass98_147 = null;
							return true;
						}
						@Pc(2049) boolean local2049;
						@Pc(1990) boolean local1990;
						if (Static230.aClass98_59 == Static144.aClass98_147) {
							while (Static429.aClass6_Sub12_Sub2_2.anInt7556 < Static207.anInt3929) {
								local819 = Static429.aClass6_Sub12_Sub2_2.method6019() == 1;
								local244 = Static429.aClass6_Sub12_Sub2_2.method6040();
								local667 = Static429.aClass6_Sub12_Sub2_2.method6040();
								local284 = Static429.aClass6_Sub12_Sub2_2.method6044();
								local290 = Static429.aClass6_Sub12_Sub2_2.method6019();
								local886 = "";
								local1990 = false;
								if (local284 > 0) {
									local886 = Static429.aClass6_Sub12_Sub2_2.method6040();
									local1990 = Static429.aClass6_Sub12_Sub2_2.method6019() == 1;
								}
								for (local1814 = 0; local1814 < Static569.anInt9840; local1814++) {
									if (local819) {
										if (local667.equals(Static326.aStringArray26[local1814])) {
											Static326.aStringArray26[local1814] = local244;
											local244 = null;
											Static114.aStringArray8[local1814] = local667;
											break;
										}
									} else if (local244.equals(Static326.aStringArray26[local1814])) {
										if (Static392.anIntArray501[local1814] != local284) {
											local2049 = true;
											for (@Pc(2054) Class60_Sub1_Sub2 local2054 = (Class60_Sub1_Sub2) Static308.aClass349_10.method7890(); local2054 != null; local2054 = (Class60_Sub1_Sub2) Static308.aClass349_10.method7896()) {
												if (local2054.aString37.equals(local244)) {
													if (local284 != 0 && local2054.aShort71 == 0) {
														local2054.method7802();
														local2049 = false;
													} else if (local284 == 0 && local2054.aShort71 != 0) {
														local2049 = false;
														local2054.method7802();
													}
												}
											}
											if (local2049) {
												Static308.aClass349_10.method7893(new Class60_Sub1_Sub2(local244, local284));
											}
											Static392.anIntArray501[local1814] = local284;
										}
										Static114.aStringArray8[local1814] = local667;
										Static125.aStringArray9[local1814] = local886;
										Static250.anIntArray378[local1814] = local290;
										Static173.aBooleanArray13[local1814] = local1990;
										local244 = null;
										break;
									}
								}
								if (local244 != null && Static569.anInt9840 < 200) {
									Static326.aStringArray26[Static569.anInt9840] = local244;
									Static114.aStringArray8[Static569.anInt9840] = local667;
									Static392.anIntArray501[Static569.anInt9840] = local284;
									Static125.aStringArray9[Static569.anInt9840] = local886;
									Static250.anIntArray378[Static569.anInt9840] = local290;
									Static173.aBooleanArray13[Static569.anInt9840] = local1990;
									Static569.anInt9840++;
								}
							}
							Static83.anInt1400 = Static124.anInt2133;
							Static212.anInt9970 = 2;
							local73 = Static569.anInt9840;
							while (local73 > 0) {
								local73--;
								local819 = true;
								for (local278 = 0; local278 < local73; local278++) {
									if (Static65.aClass297_1.anInt8579 != Static392.anIntArray501[local278] && Static65.aClass297_1.anInt8579 == Static392.anIntArray501[local278 + 1] || Static392.anIntArray501[local278] == 0 && Static392.anIntArray501[local278 + 1] != 0) {
										local284 = Static392.anIntArray501[local278];
										Static392.anIntArray501[local278] = Static392.anIntArray501[local278 + 1];
										Static392.anIntArray501[local278 + 1] = local284;
										local882 = Static125.aStringArray9[local278];
										Static125.aStringArray9[local278] = Static125.aStringArray9[local278 + 1];
										Static125.aStringArray9[local278 + 1] = local882;
										local886 = Static326.aStringArray26[local278];
										Static326.aStringArray26[local278] = Static326.aStringArray26[local278 + 1];
										Static326.aStringArray26[local278 + 1] = local886;
										local457 = Static114.aStringArray8[local278];
										Static114.aStringArray8[local278] = Static114.aStringArray8[local278 + 1];
										Static114.aStringArray8[local278 + 1] = local457;
										local1814 = Static250.anIntArray378[local278];
										Static250.anIntArray378[local278] = Static250.anIntArray378[local278 + 1];
										Static250.anIntArray378[local278 + 1] = local1814;
										local2049 = Static173.aBooleanArray13[local278];
										Static173.aBooleanArray13[local278] = Static173.aBooleanArray13[local278 + 1];
										local819 = false;
										Static173.aBooleanArray13[local278 + 1] = local2049;
									}
								}
								if (local819) {
									break;
								}
							}
							Static144.aClass98_147 = null;
							return true;
						} else if (Static144.aClass98_147 == Static454.aClass98_132) {
							Static144.aClass98_147 = null;
							Static83.anInt1400 = Static124.anInt2133;
							Static212.anInt9970 = 1;
							return true;
						} else if (Static144.aClass98_147 == Static31.aClass98_8) {
							Static451.anInt7959 = Static124.anInt2133;
							if (Static207.anInt3929 == 0) {
								Static175.aClass264Array1 = null;
								Static422.aString58 = null;
								Static486.aString71 = null;
								Static144.aClass98_147 = null;
								Static181.anInt3476 = 0;
								return true;
							}
							Static422.aString58 = Static429.aClass6_Sub12_Sub2_2.method6040();
							local819 = Static429.aClass6_Sub12_Sub2_2.method6019() == 1;
							if (local819) {
								Static429.aClass6_Sub12_Sub2_2.method6040();
							}
							@Pc(2406) long local2406 = Static429.aClass6_Sub12_Sub2_2.method6016();
							Static486.aString71 = Static383.method5604(local2406);
							Static397.aByte83 = Static429.aClass6_Sub12_Sub2_2.method6049();
							local284 = Static429.aClass6_Sub12_Sub2_2.method6019();
							if (local284 == 255) {
								Static144.aClass98_147 = null;
								return true;
							}
							Static181.anInt3476 = local284;
							@Pc(2434) Class264[] local2434 = new Class264[100];
							for (local296 = 0; local296 < Static181.anInt3476; local296++) {
								local2434[local296] = new Class264();
								local2434[local296].aString62 = Static429.aClass6_Sub12_Sub2_2.method6040();
								local819 = Static429.aClass6_Sub12_Sub2_2.method6019() == 1;
								if (local819) {
									local2434[local296].aString61 = Static429.aClass6_Sub12_Sub2_2.method6040();
								} else {
									local2434[local296].aString61 = local2434[local296].aString62;
								}
								local2434[local296].aString59 = Static83.method1161(local2434[local296].aString61);
								local2434[local296].anInt7490 = Static429.aClass6_Sub12_Sub2_2.method6044();
								local2434[local296].aByte85 = Static429.aClass6_Sub12_Sub2_2.method6049();
								local2434[local296].aString60 = Static429.aClass6_Sub12_Sub2_2.method6040();
								if (local2434[local296].aString61.equals(Static461.aClass15_Sub2_Sub4_Sub2_2.aString82)) {
									Static76.aByte10 = local2434[local296].aByte85;
								}
							}
							local486 = Static181.anInt3476;
							while (local486 > 0) {
								local486--;
								local1990 = true;
								for (local496 = 0; local496 < local486; local496++) {
									if (local2434[local496].aString59.compareTo(local2434[local496 + 1].aString59) > 0) {
										local461 = local2434[local496];
										local2434[local496] = local2434[local496 + 1];
										local1990 = false;
										local2434[local496 + 1] = local461;
									}
								}
								if (local1990) {
									break;
								}
							}
							Static144.aClass98_147 = null;
							Static175.aClass264Array1 = local2434;
							return true;
						} else if (Static193.aClass98_46 == Static144.aClass98_147) {
							Static316.method4918(Static283.aClass230_32);
							Static144.aClass98_147 = null;
							return true;
						} else if (Static144.aClass98_147 == Static5.aClass98_3) {
							local268 = Static429.aClass6_Sub12_Sub2_2.method5998();
							local73 = Static429.aClass6_Sub12_Sub2_2.method6057();
							local278 = Static429.aClass6_Sub12_Sub2_2.method6004();
							local284 = Static429.aClass6_Sub12_Sub2_2.method6057();
							if (Static498.method6894(local73)) {
								Static527.method7227(local278, local284, local268, 5);
							}
							Static144.aClass98_147 = null;
							return true;
						} else if (Static144.aClass98_147 == Static452.aClass98_131) {
							local268 = Static429.aClass6_Sub12_Sub2_2.method5998();
							local73 = Static429.aClass6_Sub12_Sub2_2.method6048();
							if (Static498.method6894(local73)) {
								Static527.method7227(local268, Static517.anInt8881, 0, 5);
							}
							Static144.aClass98_147 = null;
							return true;
						} else if (Static144.aClass98_147 == Static133.aClass98_32) {
							local268 = Static429.aClass6_Sub12_Sub2_2.method6057();
							local73 = Static429.aClass6_Sub12_Sub2_2.method6044();
							if (local73 == 65535) {
								local73 = -1;
							}
							local278 = Static429.aClass6_Sub12_Sub2_2.method6015();
							if (Static498.method6894(local268)) {
								Static442.method6263(local278, local73);
							}
							Static144.aClass98_147 = null;
							return true;
						} else if (Static163.aClass98_40 == Static144.aClass98_147) {
							local268 = Static429.aClass6_Sub12_Sub2_2.method6019();
							if (Static429.aClass6_Sub12_Sub2_2.method6019() == 0) {
								Static580.aClass99Array1[local268] = new Class99();
							} else {
								Static429.aClass6_Sub12_Sub2_2.anInt7556--;
								Static580.aClass99Array1[local268] = new Class99(Static429.aClass6_Sub12_Sub2_2);
							}
							Static144.aClass98_147 = null;
							Static237.anInt4305 = Static124.anInt2133;
							return true;
						} else if (Static144.aClass98_147 == Static256.aClass98_63) {
							local268 = Static429.aClass6_Sub12_Sub2_2.method6011();
							local73 = local268 >> 2;
							local278 = local268 & 0x3;
							local284 = Static424.anIntArray537[local73];
							local290 = Static429.aClass6_Sub12_Sub2_2.method6008();
							local296 = local290 >> 28 & 0x3;
							local399 = local290 >> 14 & 0x3FFF;
							local1814 = local290 & 0x3FFF;
							local486 = Static429.aClass6_Sub12_Sub2_2.method6055();
							local1814 -= Static154.anInt2878;
							local399 -= Static150.anInt2792;
							if (local486 == 65535) {
								local486 = -1;
							}
							Static269.method4024(local284, local73, local296, local278, local1814, local486, local399);
							Static144.aClass98_147 = null;
							return true;
						} else if (Static195.aClass98_47 == Static144.aClass98_147) {
							Static65.aClass51_1.method959();
							Static383.anInt7015 += 32;
							Static144.aClass98_147 = null;
							return true;
						} else if (Static144.aClass98_147 == Static243.aClass98_61) {
							local819 = Static429.aClass6_Sub12_Sub2_2.method6019() == 1;
							local244 = Static429.aClass6_Sub12_Sub2_2.method6040();
							local667 = local244;
							if (local819) {
								local667 = Static429.aClass6_Sub12_Sub2_2.method6040();
							}
							local284 = Static429.aClass6_Sub12_Sub2_2.method6019();
							local290 = Static429.aClass6_Sub12_Sub2_2.method6044();
							local379 = false;
							if (local284 <= 1 && Static170.method2693(local667)) {
								local379 = true;
							}
							if (!local379 && Static67.anInt1146 == 0) {
								local457 = Static186.aClass266_1.method5987(local290).method5749(Static429.aClass6_Sub12_Sub2_2);
								if (local284 == 2) {
									Static49.method762(local244, local457, "<img=1>" + local667, 25, null, "<img=1>" + local244, local290, 0);
								} else if (local284 == 1) {
									Static49.method762(local244, local457, "<img=0>" + local667, 25, null, "<img=0>" + local244, local290, 0);
								} else {
									Static49.method762(local244, local457, local667, 25, null, local244, local290, 0);
								}
							}
							Static144.aClass98_147 = null;
							return true;
						} else if (Static577.aClass98_154 == Static144.aClass98_147) {
							for (local268 = 0; local268 < Static551.aClass15_Sub2_Sub4_Sub2Array1.length; local268++) {
								if (Static551.aClass15_Sub2_Sub4_Sub2Array1[local268] != null) {
									Static551.aClass15_Sub2_Sub4_Sub2Array1[local268].anInt8932 = -1;
								}
							}
							for (local73 = 0; local73 < Static192.anInt3744; local73++) {
								Static324.aClass6_Sub49Array1[local73].aClass15_Sub2_Sub4_Sub1_2.anInt8932 = -1;
							}
							Static144.aClass98_147 = null;
							return true;
						} else if (Static144.aClass98_147 == Static551.aClass98_151) {
							Static581.anInt9937 = Static429.aClass6_Sub12_Sub2_2.method6023();
							Static144.aClass98_147 = null;
							Static390.anInt7115 = Static124.anInt2133;
							return true;
						} else if (Static144.aClass98_147 == Static373.aClass98_102) {
							local268 = Static429.aClass6_Sub12_Sub2_2.method6044();
							local73 = Static429.aClass6_Sub12_Sub2_2.method6044();
							local278 = Static429.aClass6_Sub12_Sub2_2.method6044();
							local284 = Static429.aClass6_Sub12_Sub2_2.method6044();
							if (Static498.method6894(local268) && Static360.aClass97ArrayArray2[local73] != null) {
								for (local290 = local278; local290 < local284; local290++) {
									local296 = Static429.aClass6_Sub12_Sub2_2.method6037();
									if (local290 < Static360.aClass97ArrayArray2[local73].length && Static360.aClass97ArrayArray2[local73][local290] != null) {
										Static360.aClass97ArrayArray2[local73][local290].anInt2605 = local296;
									}
								}
							}
							Static144.aClass98_147 = null;
							return true;
						} else if (Static144.aClass98_147 == Static467.aClass98_137) {
							Static316.method4918(Static237.aClass230_29);
							Static144.aClass98_147 = null;
							return true;
						} else if (Static338.aClass98_93 == Static144.aClass98_147) {
							Static123.method1919(Static429.aClass6_Sub12_Sub2_2.method6040());
							Static144.aClass98_147 = null;
							return true;
						} else if (Static144.aClass98_147 == Static310.aClass98_81) {
							Static10.anInt138 = Static429.aClass6_Sub12_Sub2_2.method6054();
							Static352.aBoolean457 = Static429.aClass6_Sub12_Sub2_2.method6019() == 1;
							Static144.aClass98_147 = null;
							return true;
						} else if (Static144.aClass98_147 == Static3.aClass98_109) {
							local348 = Static429.aClass6_Sub12_Sub2_2.method6040();
							local73 = Static429.aClass6_Sub12_Sub2_2.method6057();
							local278 = Static429.aClass6_Sub12_Sub2_2.method6055();
							if (Static498.method6894(local73)) {
								Static44.method721(local278, local348);
							}
							Static144.aClass98_147 = null;
							return true;
						} else {
							@Pc(3198) long local3198;
							@Pc(3206) int local3206;
							if (Static284.aClass98_74 == Static144.aClass98_147) {
								local819 = Static429.aClass6_Sub12_Sub2_2.method6019() == 1;
								local244 = Static429.aClass6_Sub12_Sub2_2.method6040();
								local667 = local244;
								if (local819) {
									local667 = Static429.aClass6_Sub12_Sub2_2.method6040();
								}
								local1803 = Static429.aClass6_Sub12_Sub2_2.method6016();
								local1808 = Static429.aClass6_Sub12_Sub2_2.method6044();
								local3198 = Static429.aClass6_Sub12_Sub2_2.method6037();
								local496 = Static429.aClass6_Sub12_Sub2_2.method6019();
								local3206 = Static429.aClass6_Sub12_Sub2_2.method6044();
								@Pc(3212) long local3212 = (local1808 << 32) + local3198;
								@Pc(3214) boolean local3214 = false;
								@Pc(3216) int local3216 = 0;
								while (true) {
									if (local3216 >= 100) {
										if (local496 <= 1 && Static170.method2693(local667)) {
											local3214 = true;
										}
										break;
									}
									if (local3212 == Static242.aLongArray13[local3216]) {
										local3214 = true;
										break;
									}
									local3216++;
								}
								if (!local3214 && Static67.anInt1146 == 0) {
									Static242.aLongArray13[Static70.anInt1180] = local3212;
									Static70.anInt1180 = (Static70.anInt1180 + 1) % 100;
									@Pc(3270) String local3270 = Static186.aClass266_1.method5987(local3206).method5749(Static429.aClass6_Sub12_Sub2_2);
									if (local496 == 2) {
										Static49.method762(local244, local3270, "<img=1>" + local667, 20, Static320.method4968(local1803), "<img=1>" + local244, local3206, 0);
									} else if (local496 == 1) {
										Static49.method762(local244, local3270, "<img=0>" + local667, 20, Static320.method4968(local1803), "<img=0>" + local244, local3206, 0);
									} else {
										Static49.method762(local244, local3270, local667, 20, Static320.method4968(local1803), local244, local3206, 0);
									}
								}
								Static144.aClass98_147 = null;
								return true;
							} else if (Static144.aClass98_147 == Static184.aClass98_43) {
								local268 = Static429.aClass6_Sub12_Sub2_2.method6057();
								local73 = Static429.aClass6_Sub12_Sub2_2.method6048();
								local278 = Static429.aClass6_Sub12_Sub2_2.method6008();
								if (Static498.method6894(local268)) {
									Static148.method2369(local73, local278);
								}
								Static144.aClass98_147 = null;
								return true;
							} else if (Static144.aClass98_147 == Static259.aClass98_65) {
								local268 = Static429.aClass6_Sub12_Sub2_2.method6015();
								local244 = Static429.aClass6_Sub12_Sub2_2.method6040();
								local278 = Static429.aClass6_Sub12_Sub2_2.method6044();
								if (Static498.method6894(local278)) {
									Static146.method2356(local268, local244);
								}
								Static144.aClass98_147 = null;
								return true;
							} else {
								@Pc(3438) Class6_Sub43 local3438;
								if (Static144.aClass98_147 == Static155.aClass98_37) {
									local268 = Static429.aClass6_Sub12_Sub2_2.method6048();
									local73 = Static429.aClass6_Sub12_Sub2_2.method6004();
									local278 = Static429.aClass6_Sub12_Sub2_2.method6055();
									local284 = Static429.aClass6_Sub12_Sub2_2.method6014();
									if (Static498.method6894(local278)) {
										local3438 = (Class6_Sub43) Static162.aClass234_23.method5464((long) local73);
										if (local3438 != null) {
											Static536.method7299(false, local3438.anInt8192 != local268, local3438);
										}
										Static287.method4366(local73, false, local284, local268);
									}
									Static144.aClass98_147 = null;
									return true;
								} else if (Static349.aClass98_96 == Static144.aClass98_147) {
									Static144.aClass98_147 = null;
									return false;
								} else if (Static144.aClass98_147 == Static348.aClass98_95) {
									Static316.method4918(Static178.aClass230_23);
									Static144.aClass98_147 = null;
									return true;
								} else if (Static144.aClass98_147 == Static319.aClass98_49) {
									Static257.aClass275_9 = Static71.method984(Static429.aClass6_Sub12_Sub2_2.method6019());
									Static144.aClass98_147 = null;
									return true;
								} else if (Static282.aClass98_72 == Static144.aClass98_147) {
									local268 = Static429.aClass6_Sub12_Sub2_2.method6015();
									local73 = Static429.aClass6_Sub12_Sub2_2.method6044();
									local278 = Static429.aClass6_Sub12_Sub2_2.method6057();
									if (Static498.method6894(local73)) {
										Static394.method7813(local268, local278);
									}
									Static144.aClass98_147 = null;
									return true;
								} else if (Static144.aClass98_147 == Static279.aClass98_69) {
									Static202.method3337();
									Static144.aClass98_147 = null;
									return false;
								} else if (Static144.aClass98_147 == Static303.aClass98_80) {
									local268 = Static429.aClass6_Sub12_Sub2_2.method6055();
									local73 = Static429.aClass6_Sub12_Sub2_2.method6048();
									if (local73 == 65535) {
										local73 = -1;
									}
									local278 = Static429.aClass6_Sub12_Sub2_2.method6008();
									if (Static498.method6894(local268)) {
										Static527.method7227(local278, local73, -1, 1);
									}
									Static144.aClass98_147 = null;
									return true;
								} else {
									@Pc(3629) long local3629;
									@Pc(3635) Class6_Sub39 local3635;
									@Pc(3647) Class6_Sub39 local3647;
									if (Static144.aClass98_147 == Static493.aClass98_138) {
										local268 = Static429.aClass6_Sub12_Sub2_2.method6044();
										local73 = Static429.aClass6_Sub12_Sub2_2.method6048();
										local278 = Static429.aClass6_Sub12_Sub2_2.method6048();
										if (local278 == 65535) {
											local278 = -1;
										}
										local284 = Static429.aClass6_Sub12_Sub2_2.method6004();
										local290 = Static429.aClass6_Sub12_Sub2_2.method6044();
										if (local290 == 65535) {
											local290 = -1;
										}
										if (Static498.method6894(local73)) {
											for (local296 = local278; local296 <= local290; local296++) {
												local3629 = (long) local296 + ((long) local284 << 32);
												local3635 = (Class6_Sub39) Static474.aClass234_40.method5464(local3629);
												if (local3635 != null) {
													local3647 = new Class6_Sub39(local3635.anInt7305, local268);
													local3635.method7948();
												} else if (local296 == -1) {
													local3647 = new Class6_Sub39(Static495.method7281(local284).aClass6_Sub39_1.anInt7305, local268);
												} else {
													local3647 = new Class6_Sub39(0, local268);
												}
												Static474.aClass234_40.method5466(local3629, local3647);
											}
										}
										Static144.aClass98_147 = null;
										return true;
									} else if (Static440.aClass98_123 == Static144.aClass98_147) {
										local268 = Static429.aClass6_Sub12_Sub2_2.method6044();
										if (local268 == 65535) {
											local268 = -1;
										}
										local73 = Static429.aClass6_Sub12_Sub2_2.method6019();
										local278 = Static429.aClass6_Sub12_Sub2_2.method6044();
										local284 = Static429.aClass6_Sub12_Sub2_2.method6019();
										Static541.method7364(local284, local73, true, local278, local268);
										Static144.aClass98_147 = null;
										return true;
									} else if (Static6.aClass98_4 == Static144.aClass98_147) {
										local268 = Static429.aClass6_Sub12_Sub2_2.method5998();
										local73 = Static429.aClass6_Sub12_Sub2_2.method6057();
										local278 = Static429.aClass6_Sub12_Sub2_2.method6004();
										if (Static498.method6894(local73)) {
											@Pc(3753) Class6_Sub43 local3753 = (Class6_Sub43) Static162.aClass234_23.method5464((long) local268);
											local3438 = (Class6_Sub43) Static162.aClass234_23.method5464((long) local278);
											if (local3438 != null) {
												Static536.method7299(false, local3753 == null || local3753.anInt8192 != local3438.anInt8192, local3438);
											}
											if (local3753 != null) {
												local3753.method7948();
												Static162.aClass234_23.method5466((long) local278, local3753);
											}
											@Pc(3801) Class97 local3801 = Static495.method7281(local268);
											if (local3801 != null) {
												Static479.method6666(local3801);
											}
											local3801 = Static495.method7281(local278);
											if (local3801 != null) {
												Static479.method6666(local3801);
												Static465.method6499(local3801, true);
											}
											if (Static152.anInt1936 != -1) {
												Static398.method5756(Static152.anInt1936, 1);
											}
										}
										Static144.aClass98_147 = null;
										return true;
									} else if (Static161.aClass98_39 == Static144.aClass98_147) {
										local268 = Static429.aClass6_Sub12_Sub2_2.method6055();
										if (local268 == 65535) {
											local268 = -1;
										}
										local73 = Static429.aClass6_Sub12_Sub2_2.method6055();
										local278 = Static429.aClass6_Sub12_Sub2_2.method6015();
										local284 = Static429.aClass6_Sub12_Sub2_2.method6057();
										if (local284 == 65535) {
											local284 = -1;
										}
										local290 = Static429.aClass6_Sub12_Sub2_2.method6008();
										if (Static498.method6894(local73)) {
											for (local296 = local284; local296 <= local268; local296++) {
												local3629 = ((long) local278 << 32) + (long) local296;
												local3635 = (Class6_Sub39) Static474.aClass234_40.method5464(local3629);
												if (local3635 != null) {
													local3647 = new Class6_Sub39(local290, local3635.anInt7309);
													local3635.method7948();
												} else if (local296 == -1) {
													local3647 = new Class6_Sub39(local290, Static495.method7281(local278).aClass6_Sub39_1.anInt7309);
												} else {
													local3647 = new Class6_Sub39(local290, -1);
												}
												Static474.aClass234_40.method5466(local3629, local3647);
											}
										}
										Static144.aClass98_147 = null;
										return true;
									} else if (Static260.aClass98_66 == Static144.aClass98_147) {
										Static265.method4011(Static207.anInt3929, Static429.aClass6_Sub12_Sub2_2);
										Static144.aClass98_147 = null;
										return true;
									} else if (Static380.aClass98_106 == Static144.aClass98_147) {
										Static394.method7812();
										Static144.aClass98_147 = null;
										return false;
									} else if (Static102.aClass98_25 == Static144.aClass98_147) {
										local268 = Static429.aClass6_Sub12_Sub2_2.method6008();
										local73 = Static429.aClass6_Sub12_Sub2_2.method6055();
										Static65.aClass51_1.method962(local268, local73);
										Static144.aClass98_147 = null;
										return true;
									} else if (Static144.aClass98_147 == Static373.aClass98_101) {
										local268 = Static429.aClass6_Sub12_Sub2_2.method6044();
										local73 = Static429.aClass6_Sub12_Sub2_2.method6044();
										local278 = Static429.aClass6_Sub12_Sub2_2.method6057();
										local284 = Static429.aClass6_Sub12_Sub2_2.method6048();
										local290 = Static429.aClass6_Sub12_Sub2_2.method5998();
										if (Static498.method6894(local73)) {
											Static527.method7227(local290, local278 << 16 | local268, local284, 7);
										}
										Static144.aClass98_147 = null;
										return true;
									} else if (Static144.aClass98_147 == Static288.aClass98_133) {
										Static429.aClass6_Sub12_Sub2_2.anInt7556 += 28;
										if (Static429.aClass6_Sub12_Sub2_2.method6018()) {
											Static196.method3306(Static429.aClass6_Sub12_Sub2_2, Static429.aClass6_Sub12_Sub2_2.anInt7556 - 28);
										}
										Static144.aClass98_147 = null;
										return true;
									} else if (Static328.aClass98_89 == Static144.aClass98_147) {
										Static316.method4918(Static493.aClass230_52);
										Static144.aClass98_147 = null;
										return true;
									} else if (Static503.aClass98_141 == Static144.aClass98_147) {
										Static316.method4918(Static118.aClass230_59);
										Static144.aClass98_147 = null;
										return true;
									} else if (Static415.aClass98_116 == Static144.aClass98_147) {
										local268 = Static429.aClass6_Sub12_Sub2_2.method6044();
										local73 = Static429.aClass6_Sub12_Sub2_2.method6019();
										local359 = (local73 & 0x1) == 1;
										Static196.method3307(local268, local359);
										local284 = Static429.aClass6_Sub12_Sub2_2.method6044();
										for (local290 = 0; local290 < local284; local290++) {
											local296 = Static429.aClass6_Sub12_Sub2_2.method6011();
											if (local296 == 255) {
												local296 = Static429.aClass6_Sub12_Sub2_2.method6008();
											}
											local399 = Static429.aClass6_Sub12_Sub2_2.method6057();
											Static516.method7068(local399 - 1, local290, local359, local296, local268);
										}
										Static205.anIntArray339[Static350.anInt6572++ & 0x1F] = local268;
										Static144.aClass98_147 = null;
										return true;
									} else if (Static321.aClass98_86 == Static144.aClass98_147) {
										local268 = Static429.aClass6_Sub12_Sub2_2.method6014();
										local73 = Static429.aClass6_Sub12_Sub2_2.method6014();
										local278 = Static429.aClass6_Sub12_Sub2_2.method6015();
										Static113.anIntArray166[local73] = local278;
										Static108.anIntArray154[local73] = local268;
										Static47.anIntArray37[local73] = 1;
										local284 = Static9.anIntArray6[local73] - 1;
										for (local290 = 0; local290 < local284; local290++) {
											if (local278 >= Class6_Sub11.anIntArray132[local290]) {
												Static47.anIntArray37[local73] = local290 + 2;
											}
										}
										Static377.anIntArray486[Static569.anInt9839++ & 0x1F] = local73;
										Static144.aClass98_147 = null;
										return true;
									} else if (Static144.aClass98_147 == Static418.aClass98_117) {
										Static154.anInt2875 = Static429.aClass6_Sub12_Sub2_2.method6019();
										Static144.aClass98_147 = null;
										return true;
									} else {
										@Pc(4285) boolean local4285;
										if (Static144.aClass98_147 == Static228.aClass98_58) {
											local268 = Static429.aClass6_Sub12_Sub2_2.method6044();
											@Pc(4256) Class15_Sub2_Sub4_Sub2 local4256;
											if (local268 == Static517.anInt8881) {
												local4256 = Static461.aClass15_Sub2_Sub4_Sub2_2;
											} else {
												local4256 = Static551.aClass15_Sub2_Sub4_Sub2Array1[local268];
											}
											if (local4256 == null) {
												Static144.aClass98_147 = null;
												return true;
											}
											local278 = Static429.aClass6_Sub12_Sub2_2.method6044();
											local284 = Static429.aClass6_Sub12_Sub2_2.method6019();
											local4285 = (local278 & 0x8000) != 0;
											if (local4256.aString82 != null && local4256.aClass212_1 != null) {
												local379 = false;
												if (local284 <= 1) {
													if (!local4285 && (Static352.aBoolean457 && !Static135.aBoolean192 || Static255.aBoolean345)) {
														local379 = true;
													} else if (Static170.method2693(local4256.aString82)) {
														local379 = true;
													}
												}
												if (!local379 && Static67.anInt1146 == 0) {
													local1814 = -1;
													if (local4285) {
														local278 &= 0x7FFF;
														@Pc(4334) Class129 local4334 = Static425.method5992(Static429.aClass6_Sub12_Sub2_2);
														local1814 = local4334.anInt3817;
														local457 = local4334.aClass6_Sub5_Sub14_1.method5749(Static429.aClass6_Sub12_Sub2_2);
													} else {
														local457 = Static344.method5254(Static197.method3310(Static429.aClass6_Sub12_Sub2_2));
													}
													local4256.aString81 = local457.trim();
													local4256.anInt8960 = local278 >> 8;
													local4256.anInt8994 = 150;
													local4256.anInt8953 = local278 & 0xFF;
													if (local284 == 1 || local284 == 2) {
														local486 = local4285 ? 17 : 1;
													} else {
														local486 = local4285 ? 17 : 2;
													}
													if (local284 == 2) {
														Static49.method762(local4256.aString83, local457, "<img=1>" + local4256.method7148(), local486, null, "<img=1>" + local4256.method7145(), local1814, 0);
													} else if (local284 == 1) {
														Static49.method762(local4256.aString83, local457, "<img=0>" + local4256.method7148(), local486, null, "<img=0>" + local4256.method7145(), local1814, 0);
													} else {
														Static49.method762(local4256.aString83, local457, local4256.method7148(), local486, null, local4256.method7145(), local1814, 0);
													}
												}
											}
											Static144.aClass98_147 = null;
											return true;
										} else if (Static316.aClass98_83 == Static144.aClass98_147) {
											local268 = Static429.aClass6_Sub12_Sub2_2.method6011();
											local73 = Static429.aClass6_Sub12_Sub2_2.method6019();
											if (local268 == 255) {
												local73 = -1;
												local268 = -1;
											}
											Static287.method4367(local73, local268);
											Static144.aClass98_147 = null;
											return true;
										} else if (Static327.aClass98_88 == Static144.aClass98_147) {
											local268 = Static429.aClass6_Sub12_Sub2_2.method6044();
											if (local268 == 65535) {
												local268 = -1;
											}
											local73 = Static429.aClass6_Sub12_Sub2_2.method6019();
											local278 = Static429.aClass6_Sub12_Sub2_2.method6044();
											local284 = Static429.aClass6_Sub12_Sub2_2.method6019();
											Static541.method7364(local284, local73, false, local278, local268);
											Static144.aClass98_147 = null;
											return true;
										} else if (Static144.aClass98_147 == Static321.aClass98_85) {
											Static316.method4918(Static564.aClass230_58);
											Static144.aClass98_147 = null;
											return true;
										} else if (Static560.aClass98_152 == Static144.aClass98_147) {
											Static362.anInt6663 = Static429.aClass6_Sub12_Sub2_2.method6007() << 3;
											Static504.anInt8760 = Static429.aClass6_Sub12_Sub2_2.method6014();
											Static365.anInt6684 = Static429.aClass6_Sub12_Sub2_2.method6013() << 3;
											while (Static207.anInt3929 > Static429.aClass6_Sub12_Sub2_2.anInt7556) {
												@Pc(4590) Class230 local4590 = Static161.method2577()[Static429.aClass6_Sub12_Sub2_2.method6019()];
												Static316.method4918(local4590);
											}
											Static144.aClass98_147 = null;
											return true;
										} else if (Static396.aClass98_113 == Static144.aClass98_147) {
											Static410.method5896(Static174.aClass313_24, Static207.anInt3929, Static429.aClass6_Sub12_Sub2_2);
											Static144.aClass98_147 = null;
											return true;
										} else {
											@Pc(4667) int local4667;
											if (Static144.aClass98_147 == Static451.aClass98_130) {
												local819 = Static429.aClass6_Sub12_Sub2_2.method6019() == 1;
												local244 = Static429.aClass6_Sub12_Sub2_2.method6040();
												local667 = local244;
												if (local819) {
													local667 = Static429.aClass6_Sub12_Sub2_2.method6040();
												}
												local1803 = Static429.aClass6_Sub12_Sub2_2.method6044();
												local1808 = Static429.aClass6_Sub12_Sub2_2.method6037();
												local1814 = Static429.aClass6_Sub12_Sub2_2.method6019();
												@Pc(4663) long local4663 = local1808 + (local1803 << 32);
												@Pc(4665) boolean local4665 = false;
												local4667 = 0;
												while (true) {
													if (local4667 >= 100) {
														if (local1814 <= 1) {
															if (Static352.aBoolean457 && !Static135.aBoolean192 || Static255.aBoolean345) {
																local4665 = true;
															} else if (Static170.method2693(local667)) {
																local4665 = true;
															}
														}
														break;
													}
													if (local4663 == Static242.aLongArray13[local4667]) {
														local4665 = true;
														break;
													}
													local4667++;
												}
												if (!local4665 && Static67.anInt1146 == 0) {
													Static242.aLongArray13[Static70.anInt1180] = local4663;
													Static70.anInt1180 = (Static70.anInt1180 + 1) % 100;
													@Pc(4733) String local4733 = Static344.method5254(Static197.method3310(Static429.aClass6_Sub12_Sub2_2));
													if (local1814 == 2) {
														Static49.method762(local244, local4733, "<img=1>" + local667, 7, null, "<img=1>" + local244, -1, 0);
													} else if (local1814 == 1) {
														Static49.method762(local244, local4733, "<img=0>" + local667, 7, null, "<img=0>" + local244, -1, 0);
													} else {
														Static49.method762(local244, local4733, local667, 3, null, local244, -1, 0);
													}
												}
												Static144.aClass98_147 = null;
												return true;
											} else if (Static144.aClass98_147 == Static303.aClass98_79) {
												local268 = Static429.aClass6_Sub12_Sub2_2.method6048();
												local73 = Static429.aClass6_Sub12_Sub2_2.method6055();
												local278 = Static429.aClass6_Sub12_Sub2_2.method6004();
												local284 = Static429.aClass6_Sub12_Sub2_2.method6057();
												local290 = Static429.aClass6_Sub12_Sub2_2.method6044();
												if (Static498.method6894(local268)) {
													Static241.method3750(local290, local278, local73, local284);
												}
												Static144.aClass98_147 = null;
												return true;
											} else if (Static144.aClass98_147 == Static61.aClass98_17) {
												local268 = Static429.aClass6_Sub12_Sub2_2.method6055();
												if (local268 == 65535) {
													local268 = -1;
												}
												local73 = Static429.aClass6_Sub12_Sub2_2.method6048();
												local278 = Static429.aClass6_Sub12_Sub2_2.method5998();
												local284 = Static429.aClass6_Sub12_Sub2_2.method6008();
												if (Static498.method6894(local73)) {
													Static316.method4922(local278, local268, local284);
													@Pc(4886) Class236 local4886 = Static119.aClass244_4.method5726(local268);
													Static241.method3750(local4886.anInt6826, local284, local4886.anInt6822, local4886.anInt6819);
													Static355.method5331(local4886.anInt6825, local4886.anInt6766, local284, local4886.anInt6770);
												}
												Static144.aClass98_147 = null;
												return true;
											} else if (Static295.aClass98_77 == Static144.aClass98_147) {
												local268 = Static429.aClass6_Sub12_Sub2_2.method6055();
												local73 = Static429.aClass6_Sub12_Sub2_2.method6048();
												local278 = Static429.aClass6_Sub12_Sub2_2.method5998();
												local284 = Static429.aClass6_Sub12_Sub2_2.method6057();
												if (Static498.method6894(local268)) {
													Static227.method3566(local278, (local284 << 16) + local73);
												}
												Static144.aClass98_147 = null;
												return true;
											} else if (Static221.aClass98_56 == Static144.aClass98_147) {
												local268 = Static429.aClass6_Sub12_Sub2_2.method6048();
												local73 = Static429.aClass6_Sub12_Sub2_2.method6055();
												local278 = Static429.aClass6_Sub12_Sub2_2.method6019();
												if (Static498.method6894(local268)) {
													if (local278 == 2) {
														Static282.method4299();
													}
													Static152.anInt1936 = local73;
													Static586.method7962(local73);
													Static20.method306(false);
													Static199.method3320(Static152.anInt1936);
													for (local284 = 0; local284 < 100; local284++) {
														Static543.aBooleanArray30[local284] = true;
													}
												}
												Static144.aClass98_147 = null;
												return true;
											} else if (Static200.aClass98_50 == Static144.aClass98_147) {
												local268 = Static429.aClass6_Sub12_Sub2_2.method6044();
												if (Static498.method6894(local268)) {
													Static49.method761();
												}
												Static144.aClass98_147 = null;
												return true;
											} else if (Static215.aClass98_55 == Static144.aClass98_147) {
												Static316.method4918(Static10.aClass230_1);
												Static144.aClass98_147 = null;
												return true;
											} else {
												@Pc(5170) int local5170;
												if (Static144.aClass98_147 == Static403.aClass98_114) {
													local268 = Static429.aClass6_Sub12_Sub2_2.method6044();
													local73 = Static429.aClass6_Sub12_Sub2_2.method6048();
													local278 = Static429.aClass6_Sub12_Sub2_2.method6011();
													local284 = Static429.aClass6_Sub12_Sub2_2.method6008();
													local290 = Static429.aClass6_Sub12_Sub2_2.method6055();
													local379 = (local278 & 0x80) != 0;
													if (local284 >> 30 == 0) {
														@Pc(5110) Class239 local5110;
														@Pc(5167) Class63 local5167;
														@Pc(5130) Class63 local5130;
														if (local284 >> 29 != 0) {
															local399 = local284 & 0xFFFF;
															@Pc(5075) Class6_Sub49 local5075 = (Class6_Sub49) Static251.aClass234_29.method5464((long) local399);
															if (local5075 != null) {
																@Pc(5080) Class15_Sub2_Sub4_Sub1 local5080 = local5075.aClass15_Sub2_Sub4_Sub1_2;
																if (local73 == 65535) {
																	local73 = -1;
																}
																@Pc(5087) boolean local5087 = true;
																local3206 = local379 ? local5080.anInt8968 : local5080.anInt8947;
																if (local73 != -1 && local3206 != -1) {
																	if (local73 == local3206) {
																		local5110 = Static475.aClass291_2.method6548(local73);
																		if (local5110.aBoolean477 && local5110.anInt6960 != -1) {
																			local5167 = Static388.aClass324_2.method7265(local5110.anInt6960);
																			local5170 = local5167.anInt1379;
																			if (local5170 == 0 || local5170 == 2) {
																				local5087 = false;
																			} else if (local5170 == 1) {
																				local5087 = true;
																			}
																		}
																	} else {
																		local5110 = Static475.aClass291_2.method6548(local73);
																		@Pc(5115) Class239 local5115 = Static475.aClass291_2.method6548(local3206);
																		if (local5110.anInt6960 != -1 && local5115.anInt6960 != -1) {
																			local5130 = Static388.aClass324_2.method7265(local5110.anInt6960);
																			@Pc(5136) Class63 local5136 = Static388.aClass324_2.method7265(local5115.anInt6960);
																			if (local5130.anInt1377 < local5136.anInt1377) {
																				local5087 = false;
																			}
																		}
																	}
																}
																if (local5087) {
																	if (local379) {
																		local5080.anInt8959 = 1;
																		local5080.anInt8970 = 0;
																		local5080.anInt8921 = local290;
																		local5080.anInt8973 = 0;
																		local5080.anInt8982 = Static363.anInt6671 + local268;
																		local5080.anInt8922 = local278 & 0x7;
																		local5080.anInt8968 = local73;
																		if (Static363.anInt6671 < local5080.anInt8982) {
																			local5080.anInt8970 = -1;
																		}
																		if (local5080.anInt8968 != -1 && local5080.anInt8982 == Static363.anInt6671) {
																			local4667 = Static475.aClass291_2.method6548(local5080.anInt8968).anInt6960;
																			if (local4667 != -1) {
																				local5167 = Static388.aClass324_2.method7265(local4667);
																				if (local5167 != null && local5167.anIntArray127 != null) {
																					Static32.method514(false, local5080.anInt8911, local5080.aByte98, local5167, local5080.anInt8913, 0);
																				}
																			}
																		}
																	} else {
																		local5080.anInt8952 = Static363.anInt6671 + local268;
																		local5080.anInt8946 = local278 & 0x7;
																		local5080.anInt8936 = local290;
																		local5080.anInt8951 = 0;
																		local5080.anInt8972 = 0;
																		local5080.anInt8947 = local73;
																		local5080.anInt8928 = 1;
																		if (local5080.anInt8952 > Static363.anInt6671) {
																			local5080.anInt8951 = -1;
																		}
																		if (local5080.anInt8947 != -1 && Static363.anInt6671 == local5080.anInt8952) {
																			local4667 = Static475.aClass291_2.method6548(local5080.anInt8947).anInt6960;
																			if (local4667 != -1) {
																				local5167 = Static388.aClass324_2.method7265(local4667);
																				if (local5167 != null && local5167.anIntArray127 != null) {
																					Static32.method514(false, local5080.anInt8911, local5080.aByte98, local5167, local5080.anInt8913, 0);
																				}
																			}
																		}
																	}
																}
															}
														} else if (local284 >> 28 != 0) {
															local399 = local284 & 0xFFFF;
															@Pc(5365) Class15_Sub2_Sub4_Sub2 local5365;
															if (Static517.anInt8881 == local399) {
																local5365 = Static461.aClass15_Sub2_Sub4_Sub2_2;
															} else {
																local5365 = Static551.aClass15_Sub2_Sub4_Sub2Array1[local399];
															}
															if (local5365 != null) {
																if (local73 == 65535) {
																	local73 = -1;
																}
																local2049 = true;
																local496 = local379 ? local5365.anInt8968 : local5365.anInt8947;
																@Pc(5461) Class63 local5461;
																if (local73 != -1 && local496 != -1) {
																	@Pc(5406) Class239 local5406;
																	if (local73 == local496) {
																		local5406 = Static475.aClass291_2.method6548(local73);
																		if (local5406.aBoolean477 && local5406.anInt6960 != -1) {
																			local5461 = Static388.aClass324_2.method7265(local5406.anInt6960);
																			local1829 = local5461.anInt1379;
																			if (local1829 == 0 || local1829 == 2) {
																				local2049 = false;
																			} else if (local1829 == 1) {
																				local2049 = true;
																			}
																		}
																	} else {
																		local5406 = Static475.aClass291_2.method6548(local73);
																		local5110 = Static475.aClass291_2.method6548(local496);
																		if (local5406.anInt6960 != -1 && local5110.anInt6960 != -1) {
																			local5167 = Static388.aClass324_2.method7265(local5406.anInt6960);
																			local5130 = Static388.aClass324_2.method7265(local5110.anInt6960);
																			if (local5130.anInt1377 > local5167.anInt1377) {
																				local2049 = false;
																			}
																		}
																	}
																}
																if (local2049) {
																	if (local379) {
																		local5365.anInt8970 = 0;
																		local5365.anInt8973 = 0;
																		local5365.anInt8921 = local290;
																		local5365.anInt8922 = local278 & 0x7;
																		local5365.anInt8968 = local73;
																		local5365.anInt8982 = local268 + Static363.anInt6671;
																		local5365.anInt8959 = 1;
																		if (local5365.anInt8982 > Static363.anInt6671) {
																			local5365.anInt8970 = -1;
																		}
																		if (local5365.anInt8968 == 65535) {
																			local5365.anInt8968 = -1;
																		}
																		if (local5365.anInt8968 != -1 && local5365.anInt8982 == Static363.anInt6671) {
																			local3206 = Static475.aClass291_2.method6548(local5365.anInt8968).anInt6960;
																			if (local3206 != -1) {
																				local5461 = Static388.aClass324_2.method7265(local3206);
																				if (local5461 != null && local5461.anIntArray127 != null) {
																					Static32.method514(local5365 == Static461.aClass15_Sub2_Sub4_Sub2_2, local5365.anInt8911, local5365.aByte98, local5461, local5365.anInt8913, 0);
																				}
																			}
																		}
																	} else {
																		local5365.anInt8936 = local290;
																		local5365.anInt8947 = local73;
																		local5365.anInt8928 = 1;
																		local5365.anInt8946 = local278 & 0x7;
																		local5365.anInt8951 = 0;
																		local5365.anInt8952 = local268 + Static363.anInt6671;
																		local5365.anInt8972 = 0;
																		if (local5365.anInt8947 == 65535) {
																			local5365.anInt8947 = -1;
																		}
																		if (local5365.anInt8952 > Static363.anInt6671) {
																			local5365.anInt8951 = -1;
																		}
																		if (local5365.anInt8947 != -1 && local5365.anInt8952 == Static363.anInt6671) {
																			local3206 = Static475.aClass291_2.method6548(local5365.anInt8947).anInt6960;
																			if (local3206 != -1) {
																				local5461 = Static388.aClass324_2.method7265(local3206);
																				if (local5461 != null && local5461.anIntArray127 != null) {
																					Static32.method514(Static461.aClass15_Sub2_Sub4_Sub2_2 == local5365, local5365.anInt8911, local5365.aByte98, local5461, local5365.anInt8913, 0);
																				}
																			}
																		}
																	}
																}
															}
														}
													} else {
														local399 = local284 >> 28 & 0x3;
														local1814 = (local284 >> 14 & 0x3FFF) - Static150.anInt2792;
														local486 = (local284 & 0x3FFF) - Static154.anInt2878;
														if (local1814 >= 0 && local486 >= 0 && local1814 < Static18.anInt5706 && local486 < Static80.anInt1367) {
															local496 = local1814 * 512 + 256;
															local3206 = local486 * 512 + 256;
															local4667 = local399;
															if (local399 < 3 && Static77.method1114(local486, local1814)) {
																local4667 = local399 + 1;
															}
															@Pc(5759) Class15_Sub2_Sub6 local5759 = new Class15_Sub2_Sub6(local73, 0, Static363.anInt6671, local399, local4667, local496, Static37.method631(local3206, local496, local399) - local290, local3206, local1814, local1814, local486, local486, local278 & 0x7);
															Static432.aClass298_162.method6812(new Class6_Sub5_Sub17(local5759));
														}
													}
													Static144.aClass98_147 = null;
													return true;
												} else if (Static40.aClass98_145 == Static144.aClass98_147) {
													if (Static152.anInt1936 != -1) {
														Static398.method5756(Static152.anInt1936, 0);
													}
													Static144.aClass98_147 = null;
													return true;
												} else if (Static461.aClass98_135 == Static144.aClass98_147) {
													Static316.method4918(Static315.aClass230_37);
													Static144.aClass98_147 = null;
													return true;
												} else if (Static538.aClass98_149 == Static144.aClass98_147) {
													Static504.anInt8760 = Static429.aClass6_Sub12_Sub2_2.method6019();
													Static362.anInt6663 = Static429.aClass6_Sub12_Sub2_2.method6013() << 3;
													Static365.anInt6684 = Static429.aClass6_Sub12_Sub2_2.method6049() << 3;
													for (@Pc(5820) Class6_Sub30 local5820 = (Class6_Sub30) Static500.aClass234_44.method5469(); local5820 != null; local5820 = (Class6_Sub30) Static500.aClass234_44.method5465()) {
														local73 = (int) (local5820.aLong245 >> 28 & 0x3L);
														local278 = (int) (local5820.aLong245 & 0x3FFFL);
														local284 = local278 - Static150.anInt2792;
														local290 = (int) (local5820.aLong245 >> 14 & 0x3FFFL);
														local296 = local290 - Static154.anInt2878;
														if (Static504.anInt8760 == local73 && local284 >= Static362.anInt6663 && Static362.anInt6663 + 8 > local284 && Static365.anInt6684 <= local296 && Static365.anInt6684 + 8 > local296) {
															local5820.method7948();
															if (local284 >= 0 && local296 >= 0 && Static18.anInt5706 > local284 && Static80.anInt1367 > local296) {
																Static69.method969(local296, local284, Static504.anInt8760);
															}
														}
													}
													for (@Pc(5929) Class6_Sub44 local5929 = (Class6_Sub44) Static24.aClass298_14.method6809(); local5929 != null; local5929 = (Class6_Sub44) Static24.aClass298_14.method6821()) {
														if (Static362.anInt6663 <= local5929.anInt8222 && Static362.anInt6663 + 8 > local5929.anInt8222 && local5929.anInt8228 >= Static365.anInt6684 && local5929.anInt8228 < Static365.anInt6684 + 8 && local5929.anInt8227 == Static504.anInt8760) {
															local5929.anInt8221 = 0;
														}
													}
													Static144.aClass98_147 = null;
													return true;
												} else if (Static144.aClass98_147 == Static577.aClass98_155) {
													local268 = Static429.aClass6_Sub12_Sub2_2.method6044();
													if (Static498.method6894(local268)) {
														Static212.method7945();
													}
													Static144.aClass98_147 = null;
													return true;
												} else if (Static144.aClass98_147 == Static339.aClass98_94) {
													local819 = Static429.aClass6_Sub12_Sub2_2.method6019() == 1;
													local244 = Static429.aClass6_Sub12_Sub2_2.method6040();
													local667 = local244;
													if (local819) {
														local667 = Static429.aClass6_Sub12_Sub2_2.method6040();
													}
													local1803 = Static429.aClass6_Sub12_Sub2_2.method6016();
													local1808 = Static429.aClass6_Sub12_Sub2_2.method6044();
													local3198 = Static429.aClass6_Sub12_Sub2_2.method6037();
													local496 = Static429.aClass6_Sub12_Sub2_2.method6019();
													@Pc(6046) long local6046 = (local1808 << 32) + local3198;
													@Pc(6048) boolean local6048 = false;
													local5170 = 0;
													while (true) {
														if (local5170 >= 100) {
															if (local496 <= 1) {
																if (Static352.aBoolean457 && !Static135.aBoolean192 || Static255.aBoolean345) {
																	local6048 = true;
																} else if (Static170.method2693(local667)) {
																	local6048 = true;
																}
															}
															break;
														}
														if (local6046 == Static242.aLongArray13[local5170]) {
															local6048 = true;
															break;
														}
														local5170++;
													}
													if (!local6048 && Static67.anInt1146 == 0) {
														Static242.aLongArray13[Static70.anInt1180] = local6046;
														Static70.anInt1180 = (Static70.anInt1180 + 1) % 100;
														@Pc(6111) String local6111 = Static344.method5254(Static197.method3310(Static429.aClass6_Sub12_Sub2_2));
														if (local496 == 2 || local496 == 3) {
															Static49.method762(local244, local6111, "<img=1>" + local667, 9, Static320.method4968(local1803), "<img=1>" + local244, -1, 0);
														} else if (local496 == 1) {
															Static49.method762(local244, local6111, "<img=0>" + local667, 9, Static320.method4968(local1803), "<img=0>" + local244, -1, 0);
														} else {
															Static49.method762(local244, local6111, local667, 9, Static320.method4968(local1803), local244, -1, 0);
														}
													}
													Static144.aClass98_147 = null;
													return true;
												} else if (Static144.aClass98_147 == Static21.aClass98_6) {
													Static342.method5247(false);
													Static144.aClass98_147 = null;
													return false;
												} else if (Static406.aClass98_115 == Static144.aClass98_147) {
													local268 = Static429.aClass6_Sub12_Sub2_2.method6044();
													if (local268 == 65535) {
														local268 = -1;
													}
													local73 = Static429.aClass6_Sub12_Sub2_2.method6019();
													local278 = Static429.aClass6_Sub12_Sub2_2.method6044();
													local284 = Static429.aClass6_Sub12_Sub2_2.method6019();
													Static264.method4005(local268, local73, local284, local278);
													Static144.aClass98_147 = null;
													return true;
												} else if (Static144.aClass98_147 == Static328.aClass98_90) {
													local268 = Static429.aClass6_Sub12_Sub2_2.method6011();
													local73 = Static429.aClass6_Sub12_Sub2_2.method6044();
													Static65.aClass51_1.method966(local73, local268);
													Static144.aClass98_147 = null;
													return true;
												} else if (Static141.aClass98_34 == Static144.aClass98_147) {
													local268 = Static429.aClass6_Sub12_Sub2_2.method6048();
													local73 = Static429.aClass6_Sub12_Sub2_2.method6057();
													local278 = Static429.aClass6_Sub12_Sub2_2.method6044();
													if (Static498.method6894(local73)) {
														Static284.method4343(local268, local278);
													}
													Static144.aClass98_147 = null;
													return true;
												} else if (Static52.aClass98_20 == Static144.aClass98_147) {
													Static316.method4918(Static230.aClass230_27);
													Static144.aClass98_147 = null;
													return true;
												} else if (Static213.aClass98_54 == Static144.aClass98_147) {
													local268 = Static429.aClass6_Sub12_Sub2_2.method6008();
													local73 = Static429.aClass6_Sub12_Sub2_2.method6055();
													local278 = Static429.aClass6_Sub12_Sub2_2.method6057();
													if (Static498.method6894(local73)) {
														Static502.method6951(local278, local268);
													}
													Static144.aClass98_147 = null;
													return true;
												} else if (Static144.aClass98_147 == Static371.aClass98_134) {
													local268 = Static429.aClass6_Sub12_Sub2_2.method5998();
													local73 = Static429.aClass6_Sub12_Sub2_2.method6055();
													local278 = Static429.aClass6_Sub12_Sub2_2.method6000();
													local284 = Static429.aClass6_Sub12_Sub2_2.method6023();
													if (Static498.method6894(local73)) {
														Static90.method4173(local278, local284, local268);
													}
													Static144.aClass98_147 = null;
													return true;
												} else if (Static5.aClass98_2 == Static144.aClass98_147) {
													Static78.method1115(true);
													Static144.aClass98_147 = null;
													return true;
												} else if (Static361.aClass98_98 == Static144.aClass98_147) {
													local268 = Static429.aClass6_Sub12_Sub2_2.method6011();
													local73 = Static429.aClass6_Sub12_Sub2_2.method6044();
													if (Static498.method6894(local73)) {
														Static460.anInt8096 = local268;
													}
													Static144.aClass98_147 = null;
													return true;
												} else if (Static511.aClass98_142 == Static144.aClass98_147) {
													local268 = Static429.aClass6_Sub12_Sub2_2.method6057();
													local73 = Static429.aClass6_Sub12_Sub2_2.method6008();
													local278 = Static429.aClass6_Sub12_Sub2_2.method6055();
													if (local278 == 65535) {
														local278 = -1;
													}
													if (Static498.method6894(local268)) {
														Static527.method7227(local73, local278, -1, 2);
													}
													Static144.aClass98_147 = null;
													return true;
												} else if (Static144.aClass98_147 == Static141.aClass98_33) {
													local819 = Static429.aClass6_Sub12_Sub2_2.method6019() == 1;
													local244 = Static429.aClass6_Sub12_Sub2_2.method6040();
													local667 = local244;
													if (local819) {
														local667 = Static429.aClass6_Sub12_Sub2_2.method6040();
													}
													local284 = Static429.aClass6_Sub12_Sub2_2.method6019();
													local4285 = false;
													if (local284 <= 1) {
														if (Static352.aBoolean457 && !Static135.aBoolean192 || Static255.aBoolean345) {
															local4285 = true;
														} else if (local284 <= 1 && Static170.method2693(local667)) {
															local4285 = true;
														}
													}
													if (!local4285 && Static67.anInt1146 == 0) {
														local886 = Static344.method5254(Static197.method3310(Static429.aClass6_Sub12_Sub2_2));
														if (local284 == 2) {
															Static49.method762(local244, local886, "<img=1>" + local667, 24, null, "<img=1>" + local244, -1, 0);
														} else if (local284 == 1) {
															Static49.method762(local244, local886, "<img=0>" + local667, 24, null, "<img=0>" + local244, -1, 0);
														} else {
															Static49.method762(local244, local886, local667, 24, null, local244, -1, 0);
														}
													}
													Static144.aClass98_147 = null;
													return true;
												} else if (Static144.aClass98_147 == Static420.aClass98_136) {
													Static263.aString38 = Static207.anInt3929 <= 2 ? Static146.aClass103_73.method2355(Static188.anInt28) : Static429.aClass6_Sub12_Sub2_2.method6040();
													Static568.anInt9829 = Static207.anInt3929 > 0 ? Static429.aClass6_Sub12_Sub2_2.method6044() : -1;
													Static144.aClass98_147 = null;
													if (Static568.anInt9829 == 65535) {
														Static568.anInt9829 = -1;
													}
													return true;
												} else if (Static144.aClass98_147 == Static336.aClass98_92) {
													local268 = Static429.aClass6_Sub12_Sub2_2.method6044();
													local73 = Static429.aClass6_Sub12_Sub2_2.method6019();
													local359 = (local73 & 0x1) == 1;
													while (Static207.anInt3929 > Static429.aClass6_Sub12_Sub2_2.anInt7556) {
														local284 = Static429.aClass6_Sub12_Sub2_2.method6034();
														local290 = Static429.aClass6_Sub12_Sub2_2.method6044();
														local296 = 0;
														if (local290 != 0) {
															local296 = Static429.aClass6_Sub12_Sub2_2.method6019();
															if (local296 == 255) {
																local296 = Static429.aClass6_Sub12_Sub2_2.method6015();
															}
														}
														Static516.method7068(local290 - 1, local284, local359, local296, local268);
													}
													Static205.anIntArray339[Static350.anInt6572++ & 0x1F] = local268;
													Static144.aClass98_147 = null;
													return true;
												} else if (Static540.aClass98_144 == Static144.aClass98_147) {
													Static316.method4918(Static327.aClass230_38);
													Static144.aClass98_147 = null;
													return true;
												} else if (Static144.aClass98_147 == Static437.aClass98_122) {
													local268 = Static429.aClass6_Sub12_Sub2_2.method6034();
													local73 = Static429.aClass6_Sub12_Sub2_2.method6015();
													local278 = Static429.aClass6_Sub12_Sub2_2.method6019();
													local870 = "";
													local882 = local870;
													if ((local278 & 0x1) != 0) {
														local870 = Static429.aClass6_Sub12_Sub2_2.method6040();
														if ((local278 & 0x2) == 0) {
															local882 = local870;
														} else {
															local882 = Static429.aClass6_Sub12_Sub2_2.method6040();
														}
													}
													local886 = Static429.aClass6_Sub12_Sub2_2.method6040();
													if (local268 == 99) {
														Static257.method5660(local886);
													} else if (local882.equals("") || !Static170.method2693(local882)) {
														Static170.method2697(local870, local882, local870, local268, local886, local73);
													} else {
														Static144.aClass98_147 = null;
														return true;
													}
													Static144.aClass98_147 = null;
													return true;
												} else if (Static144.aClass98_147 == Static313.aClass98_82) {
													local268 = Static429.aClass6_Sub12_Sub2_2.method6044();
													local73 = Static429.aClass6_Sub12_Sub2_2.method6057();
													local667 = Static429.aClass6_Sub12_Sub2_2.method6040();
													if (Static498.method6894(local268)) {
														Static44.method721(local73, local667);
													}
													Static144.aClass98_147 = null;
													return true;
												} else if (Static144.aClass98_147 == Static216.aClass98_22) {
													Static316.method4918(Static153.aClass230_17);
													Static144.aClass98_147 = null;
													return true;
												} else if (Static389.aClass98_110 == Static144.aClass98_147) {
													local268 = Static429.aClass6_Sub12_Sub2_2.method6027();
													local73 = Static429.aClass6_Sub12_Sub2_2.method6044();
													if (local73 == 65535) {
														local73 = -1;
													}
													local667 = Static429.aClass6_Sub12_Sub2_2.method6040();
													local284 = Static429.aClass6_Sub12_Sub2_2.method6019();
													if (local284 >= 1 && local284 <= 8) {
														if (local667.equalsIgnoreCase("null")) {
															local667 = null;
														}
														Static423.aStringArray34[local284 - 1] = local667;
														Static76.anIntArray114[local284 - 1] = local73;
														Static353.aBooleanArray21[local284 - 1] = local268 == 0;
													}
													Static144.aClass98_147 = null;
													return true;
												} else if (Static17.aClass98_5 == Static144.aClass98_147) {
													local268 = Static429.aClass6_Sub12_Sub2_2.method6055();
													local73 = Static429.aClass6_Sub12_Sub2_2.method6044();
													@Pc(6900) byte local6900 = Static429.aClass6_Sub12_Sub2_2.method6007();
													if (Static498.method6894(local73)) {
														Static502.method6951(local268, local6900);
													}
													Static144.aClass98_147 = null;
													return true;
												} else {
													Static214.method5693("T1 - " + (Static144.aClass98_147 == null ? -1 : Static144.aClass98_147.method2336()) + "," + (Static111.aClass98_28 == null ? -1 : Static111.aClass98_28.method2336()) + "," + (Static446.aClass98_124 == null ? -1 : Static446.aClass98_124.method2336()) + " - " + Static207.anInt3929, null);
													Static342.method5247(false);
													return true;
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(III)Z")
	public static boolean method3381(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x8000) != 0;
	}
}
