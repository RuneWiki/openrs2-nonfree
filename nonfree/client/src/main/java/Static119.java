import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!dka", name = "f", descriptor = "I")
	public static int anInt1991;

	@OriginalMember(owner = "client!dka", name = "j", descriptor = "Lclient!kga;")
	public static Class209 aClass209_1;

	@OriginalMember(owner = "client!dka", name = "r", descriptor = "I")
	public static int anInt2000 = 0;

	@OriginalMember(owner = "client!dka", name = "a", descriptor = "(IIIZII)V")
	public static void method1744(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		if (Static632.aClass311ArrayArrayArray3 == null) {
			Static396.aClass145_6.method9637(arg2, arg0, arg4, -16777216, arg1);
			return;
		}
		@Pc(19) boolean local19 = false;
		if (Static166.anInt2884 == 0) {
			if (Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.anInt10229 < 0 || Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.anInt10229 >= Static426.anInt6942 * 512 || Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.anInt10228 < 0 || Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.anInt10228 >= Static280.anInt6752 * 512) {
				local19 = true;
			}
		} else if (!Static337.aBoolean444) {
			local19 = true;
		}
		if (local19) {
			Static396.aClass145_6.method9637(arg2, arg0, arg4, -16777216, arg1);
			return;
		}
		Static68.anInt1174++;
		if (Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2 != null && Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.anInt10229 + 256 - Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.method2046() * 256 >> 9 == Static392.anInt6487 && Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.anInt10228 + 256 - Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.method2046() * 256 >> 9 == Static371.anInt5924) {
			Static392.anInt6487 = -1;
			Static371.anInt5924 = -1;
			Static566.method7859();
		}
		Static525.method7391();
		if (!arg3) {
			Static488.method7011((byte) 48);
		}
		Static501.method5233(arg4, arg1, arg2, true, arg0);
		@Pc(140) int local140 = Static630.anInt9743;
		Static96.anInt1733 = Static96.anInt1730;
		@Pc(144) int local144 = Static537.anInt5294;
		@Pc(146) int local146 = Static395.anInt6514;
		@Pc(148) int local148 = Static345.anInt5346;
		@Pc(163) int local163;
		@Pc(200) int local200;
		if (Static60.anInt1040 == 1) {
			local163 = (int) Static356.aFloat90;
			if (local163 < Static303.anInt4644 >> 8) {
				local163 = Static303.anInt4644 >> 8;
			}
			if (Static144.aBooleanArray12[4] && local163 < Static431.anIntArray506[4] + 128) {
				local163 = Static431.anIntArray506[4] + 128;
			}
			local200 = (int) Static213.aFloat46 + Static405.anInt6686 & 0x3FFF;
			Static575.method7989(Static324.method4554(Static684.anInt10516, Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.anInt10229, Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.anInt10228) - 200, local200, Static506.anInt8028, local144, Static682.anInt11014, (local163 >> 3) * 3 + 600 << 2, local163);
		} else if (Static60.anInt1040 == 4) {
			local163 = (int) Static356.aFloat90;
			if (Static303.anInt4644 >> 8 > local163) {
				local163 = Static303.anInt4644 >> 8;
			}
			if (Static144.aBooleanArray12[4] && Static431.anIntArray506[4] + 128 > local163) {
				local163 = Static431.anIntArray506[4] + 128;
			}
			local200 = (int) Static213.aFloat46 & 0x3FFF;
			Static575.method7989(Static324.method4554(Static684.anInt10516, Static670.anInt10429, Static712.anInt10863) - 200, local200, Static506.anInt8028, local144, Static682.anInt11014, (local163 >> 3) * 3 + 600 << 2, local163);
		} else if (Static60.anInt1040 == 5) {
			Static611.method8337(local144);
		}
		local163 = Static430.anInt7002;
		local200 = Static411.anInt6731;
		@Pc(313) int local313 = Static218.anInt3475;
		@Pc(315) int local315 = Static583.anInt2354;
		@Pc(317) int local317 = Static611.anInt9456;
		@Pc(363) int local363;
		for (@Pc(319) int local319 = 0; local319 < 5; local319++) {
			if (Static144.aBooleanArray12[local319]) {
				local363 = (int) ((double) -Static651.anIntArray720[local319] + (double) (Static651.anIntArray720[local319] * 2 + 1) * Math.random() + Math.sin((double) Static629.anIntArray702[local319] * ((double) Static291.anIntArray327[local319] / 100.0D)) * (double) Static431.anIntArray506[local319]);
				if (local319 == 3) {
					Static611.anInt9456 = Static611.anInt9456 + local363 & 0x3FFF;
				}
				if (local319 == 0) {
					Static430.anInt7002 += local363 << 2;
				}
				if (local319 == 2) {
					Static218.anInt3475 += local363 << 2;
				}
				if (local319 == 4) {
					Static583.anInt2354 += local363;
					if (Static583.anInt2354 < 1024) {
						Static583.anInt2354 = 1024;
					} else if (Static583.anInt2354 > 3072) {
						Static583.anInt2354 = 3072;
					}
				}
				if (local319 == 1) {
					Static411.anInt6731 += local363 << 2;
				}
			}
		}
		if (Static430.anInt7002 < 0) {
			Static430.anInt7002 = 0;
		}
		if (Static430.anInt7002 > (Static372.anInt5930 << 9) - 1) {
			Static430.anInt7002 = (Static372.anInt5930 << 9) - 1;
		}
		if (Static218.anInt3475 < 0) {
			Static218.anInt3475 = 0;
		}
		if ((Static545.anInt8590 << 9) - 1 < Static218.anInt3475) {
			Static218.anInt3475 = (Static545.anInt8590 << 9) - 1;
		}
		Static593.method8175((byte) 74);
		Static396.aClass145_6.KA(local148, local140, local148 + local146, local144 + local140);
		Static721.method9621(true);
		local363 = Static366.anInt5876;
		Static359.aClass86_2.method7021(Static430.anInt7002, Static411.anInt6731, Static218.anInt3475, -Static583.anInt2354 & 0x3FFF, -Static611.anInt9456 & 0x3FFF, -Static322.anInt4929 & 0x3FFF);
		Static396.aClass145_6.method9656(Static359.aClass86_2);
		Static396.aClass145_6.DA(local146 / 2 + local148, local144 / 2 + local140, Static497.anInt7958 << 1, Static497.anInt7958 << 1);
		if (Static392.aBoolean549) {
			Static154.method2201(Static366.anInt5876);
			if (Static96.anInt1733 != Static215.anInt3427) {
				Static415.aBoolean615 = true;
			}
			Static215.anInt3427 = Static96.anInt1733;
			Static396.aClass145_6.GA(local363);
			Static396.aClass145_6.ya();
		} else if (Static315.aClass358_20 == null) {
			Static396.aClass145_6.GA(local363);
			Static396.aClass145_6.ya();
		} else {
			Static396.aClass145_6.xa(1.0F);
			Static396.aClass145_6.ZA(16777215, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
			Static315.aClass358_20.method8430(local146, local140, Static322.anInt4929, local363, Static611.anInt9456, Static583.anInt2354, Static437.anInt7121 << 3, local144, Static396.aClass145_6, local148);
		}
		Static165.method2505();
		Static375.method5331(local146 / 2 + local148, Static497.anInt7958 << 1, Static497.anInt7958 << 1, local144 / 2 + local140);
		Static515.method7315(-Static322.anInt4929 & 0x3FFF, Static218.anInt3475, -Static611.anInt9456 & 0x3FFF, -Static583.anInt2354 & 0x3FFF, Static430.anInt7002, Static411.anInt6731, false);
		Static134.method1977();
		@Pc(689) byte local689 = Static650.aClass2_Sub30_29.aClass11_Sub27_1.method8752() == 2 ? (byte) Static68.anInt1174 : 1;
		if (Static392.aBoolean549) {
			Static345.method4786(-Static322.anInt4929 & 0x3FFF, -Static583.anInt2354 & 0x3FFF, -Static611.anInt9456 & 0x3FFF);
			Static175.method9431(local689, Static430.anInt7002, Static411.anInt6731, Static528.anInt8386, Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.aByte133 + 1, Static133.anIntArray166, Static73.anIntArray109, Static495.anIntArray566, Static218.anInt3475, Static693.anIntArray741, Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.anInt10229 >> 9, Static64.anIntArray100, Static650.aClass2_Sub30_29.aClass11_Sub1_1.method238() == 0, Static96.anInt1733, Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.anInt10228 >> 9, Static481.aByteArrayArrayArray17);
		} else {
			Static661.method9038(Static528.anInt8386, Static430.anInt7002, Static411.anInt6731, Static218.anInt3475, Static481.aByteArrayArrayArray17, Static693.anIntArray741, Static64.anIntArray100, Static73.anIntArray109, Static495.anIntArray566, Static133.anIntArray166, Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.aByte133 + 1, local689, Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.anInt10229 >> 9, Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.anInt10228 >> 9, Static650.aClass2_Sub30_29.aClass11_Sub1_1.method238() == 0, Static591.aBoolean812 ? Static96.anInt1733 : -1, 0, false);
		}
		Static165.method2505();
		if (Static357.anInt5722 == 11) {
			Static104.method1551(local148, local146, local144, local140);
			Static364.method5228(local140, local148, local144, local146);
			Static48.method624(local148, local140, local144, local146);
			Static363.method5219(local146, local140, local148, local144);
		}
		Static702.method9409();
		Static583.anInt2354 = local315;
		Static218.anInt3475 = local313;
		Static430.anInt7002 = local163;
		Static411.anInt6731 = local200;
		Static611.anInt9456 = local317;
		Static166.aBoolean283 = false;
		if (Static85.aBoolean155 && Static190.aClass309_1.method7261() == 0) {
			Static85.aBoolean155 = false;
		}
		if (Static85.aBoolean155) {
			Static396.aClass145_6.method9637(local146, local144, local140, -16777216, local148);
			Static271.method3803(Static289.aClass191_12.method4067(Static414.anInt9485), false, Static396.aClass145_6, Static61.aClass68_1, Static175.aClass289_18);
		}
		Static721.method9621(false);
	}

	@OriginalMember(owner = "client!dka", name = "a", descriptor = "(IIIILclient!jr;I)V")
	public static void method1747(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class202 arg3, @OriginalArg(5) int arg4) {
		@Pc(12) Class2_Sub46 local12 = null;
		for (@Pc(17) Class2_Sub46 local17 = (Class2_Sub46) Static556.aClass60_180.method1226(7); local17 != null; local17 = (Class2_Sub46) Static556.aClass60_180.method1228()) {
			if (arg4 == local17.anInt7506 && arg0 == local17.anInt7501 && local17.anInt7498 == arg2 && local17.anInt7508 == arg1) {
				local12 = local17;
				break;
			}
		}
		if (local12 == null) {
			local12 = new Class2_Sub46();
			local12.anInt7501 = arg0;
			local12.anInt7506 = arg4;
			local12.anInt7498 = arg2;
			local12.anInt7508 = arg1;
			Static556.aClass60_180.method1233(local12);
		}
		local12.aClass202_1 = arg3;
		local12.aBoolean653 = true;
		local12.aBoolean652 = false;
	}
}
