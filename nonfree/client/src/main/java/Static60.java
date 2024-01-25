import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!cv", name = "b", descriptor = "Lclient!nn;")
	public static final Class172 aClass172_1 = new Class172();

	@OriginalMember(owner = "client!cv", name = "d", descriptor = "Z")
	public static boolean aBoolean90 = false;

	@OriginalMember(owner = "client!cv", name = "g", descriptor = "Lclient!ri;")
	public static final Class214 aClass214_45 = new Class214(102, 7);

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(IIII)V")
	public static void method950(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class82 local7 = Static159.aClass82ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class20_Sub4 local13 = local7.aClass20_Sub4_1;
		@Pc(16) Class20_Sub4 local16 = local7.aClass20_Sub4_2;
		if (local13 != null) {
			local13.anInt6653 = local13.anInt6653 * arg3 / (0x10 << Static384.anInt6381 - 7);
			local13.anInt6662 = local13.anInt6662 * arg3 / (0x10 << Static384.anInt6381 - 7);
		}
		if (local16 != null) {
			local16.anInt6653 = local16.anInt6653 * arg3 / (0x10 << Static384.anInt6381 - 7);
			local16.anInt6662 = local16.anInt6662 * arg3 / (0x10 << Static384.anInt6381 - 7);
		}
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(Lclient!vg;IIILclient!qa;)V")
	public static void method952(@OriginalArg(0) Class250 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class128 arg3) {
		@Pc(19) Class59 local19 = arg0.method5342(arg3);
		if (local19 == null) {
			return;
		}
		arg3.pa(arg1, arg2, arg1 + arg0.anInt7041, arg0.anInt6997 + arg2);
		if (Static345.anInt5644 == 2 || Static345.anInt5644 == 5 || Static96.aClass49_7 == null) {
			arg3.j(-16777216, local19, arg1, arg2);
			return;
		}
		@Pc(68) int local68;
		@Pc(65) int local65;
		@Pc(62) int local62;
		@Pc(75) int local75;
		if (Static100.anInt1781 == 4) {
			local65 = Static317.anInt5271;
			local62 = (int) -Static95.aFloat27 & 0x3FFF;
			local75 = 4096;
			local68 = Static446.anInt7388;
		} else {
			local62 = Static171.anInt2824 + (int) -Static95.aFloat27 & 0x3FFF;
			local65 = Static239.aClass20_Sub3_Sub3_Sub1_1.anInt6616;
			local68 = Static239.aClass20_Sub3_Sub3_Sub1_1.anInt6613;
			local75 = 4096 - Static305.anInt5082 * 16;
		}
		@Pc(102) int local102 = local68 / 32 + 48 - (Static425.anInt6922 - 104) * 2;
		@Pc(121) int local121 = Static251.anInt4072 * 4 + 48 + 208 - local65 / 32 - Static251.anInt4072 * 2;
		Static96.aClass49_7.method5644((float) arg1 + (float) arg0.anInt7041 / 2.0F, (float) arg2 + (float) arg0.anInt6997 / 2.0F, (float) local102, (float) local121, local75, local62 << 2, local19, arg1, arg2);
		@Pc(172) int local172;
		@Pc(182) int local182;
		@Pc(192) int local192;
		@Pc(202) int local202;
		for (@Pc(155) Class1_Sub6 local155 = (Class1_Sub6) Static283.aClass254_36.method5437(); local155 != null; local155 = (Class1_Sub6) Static283.aClass254_36.method5433()) {
			@Pc(160) int local160 = local155.anInt796;
			local172 = (Static403.aClass22_2.anIntArray29[local160] >> 14 & 0x3FFF) - Static101.anInt6646;
			local182 = (Static403.aClass22_2.anIntArray29[local160] & 0x3FFF) - Static278.anInt4392;
			local192 = local172 * 4 + 2 - local68 / 32;
			local202 = local182 * 4 + 2 - local65 / 32;
			Static172.method2335(local202, arg2, local192, arg0, local19, arg1, Static403.aClass22_2.anIntArray27[local160], arg3);
		}
		for (local172 = 0; local172 < Static264.anInt4203; local172++) {
			local182 = Static377.anIntArray385[local172] * 4 + 2 - local68 / 32;
			local192 = Static348.anIntArray342[local172] * 4 + 2 - local65 / 32;
			@Pc(259) Class141 local259 = Static259.aClass95_3.method1821(Static404.anIntArray405[local172]);
			if (local259.anIntArray184 != null) {
				local259 = local259.method2832(Static364.aClass259_1);
				if (local259 == null || local259.anInt3415 == -1) {
					continue;
				}
			}
			Static172.method2335(local192, arg2, local182, arg0, local19, arg1, local259.anInt3415, arg3);
		}
		for (@Pc(296) Class1_Sub19 local296 = (Class1_Sub19) Static194.aClass257_13.method5506(); local296 != null; local296 = (Class1_Sub19) Static194.aClass257_13.method5501()) {
			local192 = (int) (local296.aLong226 >> 28 & 0x3L);
			if (local192 == Static313.anInt5202) {
				local202 = (int) (local296.aLong226 & 0x3FFFL) * 4 + 2 - local68 / 32;
				@Pc(344) int local344 = (int) (local296.aLong226 >> 14 & 0x3FFFL) * 4 + 2 - local65 / 32;
				Static87.method1274(local19, local202, arg2, local344, arg1, arg0, Static133.aClass49Array50[0]);
			}
		}
		@Pc(413) int local413;
		for (local192 = 0; local192 < Static411.anInt6695; local192++) {
			@Pc(372) Class20_Sub3_Sub3_Sub2 local372 = Static98.aClass20_Sub3_Sub3_Sub2Array1[Static220.anIntArray193[local192]];
			if (local372 != null && local372.method4693() && local372.aByte89 == Static239.aClass20_Sub3_Sub3_Sub1_1.aByte89) {
				@Pc(386) Class246 local386 = local372.aClass246_1;
				if (local386 != null && local386.anIntArray459 != null) {
					local386 = local386.method5255(Static364.aClass259_1);
				}
				if (local386 != null && local386.aBoolean560 && local386.aBoolean563) {
					local413 = local372.anInt6613 / 32 - local68 / 32;
					@Pc(422) int local422 = local372.anInt6616 / 32 - local65 / 32;
					if (local386.anInt6822 == -1) {
						Static87.method1274(local19, local413, arg2, local422, arg1, arg0, Static133.aClass49Array50[1]);
					} else {
						Static172.method2335(local422, arg2, local413, arg0, local19, arg1, local386.anInt6822, arg3);
					}
				}
			}
		}
		local202 = Static31.anInt624;
		@Pc(458) int[] local458 = Static363.anIntArray373;
		@Pc(496) int local496;
		@Pc(506) int local506;
		@Pc(510) int local510;
		for (local413 = 0; local413 < local202; local413++) {
			@Pc(468) Class20_Sub3_Sub3_Sub1 local468 = Static73.aClass20_Sub3_Sub3_Sub1Array1[local458[local413]];
			if (local468 != null && local468.method3879() && Static239.aClass20_Sub3_Sub3_Sub1_1 != local468 && Static239.aClass20_Sub3_Sub3_Sub1_1.aByte89 == local468.aByte89) {
				local496 = local468.anInt6613 / 32 - local68 / 32;
				local506 = local468.anInt6616 / 32 - local65 / 32;
				@Pc(508) boolean local508 = false;
				for (local510 = 0; local510 < Static145.anInt2445; local510++) {
					if (local468.aString48.equals(Static108.aStringArray17[local510]) && Static163.anIntArray137[local510] != 0) {
						local508 = true;
						break;
					}
				}
				@Pc(533) boolean local533 = false;
				for (@Pc(535) int local535 = 0; local535 < Static73.anInt1389; local535++) {
					if (local468.aString48.equals(Static401.aClass76Array2[local535].aString16)) {
						local533 = true;
						break;
					}
				}
				@Pc(559) boolean local559 = false;
				if (Static239.aClass20_Sub3_Sub3_Sub1_1.anInt4942 != 0 && local468.anInt4942 != 0 && local468.anInt4942 == Static239.aClass20_Sub3_Sub3_Sub1_1.anInt4942) {
					local559 = true;
				}
				if (local468.aBoolean395) {
					Static87.method1274(local19, local496, arg2, local506, arg1, arg0, Static133.aClass49Array50[6]);
				} else if (local508) {
					Static87.method1274(local19, local496, arg2, local506, arg1, arg0, Static133.aClass49Array50[3]);
				} else if (local533) {
					Static87.method1274(local19, local496, arg2, local506, arg1, arg0, Static133.aClass49Array50[5]);
				} else if (local559) {
					Static87.method1274(local19, local496, arg2, local506, arg1, arg0, Static133.aClass49Array50[4]);
				} else {
					Static87.method1274(local19, local496, arg2, local506, arg1, arg0, Static133.aClass49Array50[2]);
				}
			}
		}
		@Pc(654) Class209[] local654 = Static162.aClass209Array1;
		@Pc(742) int local742;
		for (local496 = 0; local496 < local654.length; local496++) {
			@Pc(662) Class209 local662 = local654[local496];
			if (local662 != null && local662.anInt5510 != 0 && Static368.anInt6250 % 20 < 10) {
				@Pc(715) int local715;
				if (local662.anInt5510 == 1 && local662.anInt5517 >= 0 && local662.anInt5517 < Static98.aClass20_Sub3_Sub3_Sub2Array1.length) {
					@Pc(693) Class20_Sub3_Sub3_Sub2 local693 = Static98.aClass20_Sub3_Sub3_Sub2Array1[local662.anInt5517];
					if (local693 != null) {
						local510 = local693.anInt6613 / 32 - local68 / 32;
						local715 = local693.anInt6616 / 32 - local65 / 32;
						Static359.method4648(local19, arg2, 360000L, local510, arg1, arg0, local662.anInt5509, local715);
					}
				}
				if (local662.anInt5510 == 2) {
					local742 = local662.anInt5502 / 32 - local68 / 32;
					local510 = local662.anInt5507 / 32 - local65 / 32;
					@Pc(758) long local758 = (long) (local662.anInt5505 << 5);
					@Pc(762) long local762 = local758 * local758;
					Static359.method4648(local19, arg2, local762, local742, arg1, arg0, local662.anInt5509, local510);
				}
				if (local662.anInt5510 == 10 && local662.anInt5517 >= 0 && local662.anInt5517 < Static73.aClass20_Sub3_Sub3_Sub1Array1.length) {
					@Pc(790) Class20_Sub3_Sub3_Sub1 local790 = Static73.aClass20_Sub3_Sub3_Sub1Array1[local662.anInt5517];
					if (local790 != null) {
						local510 = local790.anInt6613 / 32 - local68 / 32;
						local715 = local790.anInt6616 / 32 - local65 / 32;
						Static359.method4648(local19, arg2, 360000L, local510, arg1, arg0, local662.anInt5509, local715);
					}
				}
			}
		}
		if (Static100.anInt1781 == 4) {
			return;
		}
		if (Static174.anInt2859 != 0) {
			local506 = Static174.anInt2859 * 4 + Static239.aClass20_Sub3_Sub3_Sub1_1.method4678() * 2 + 2 - local68 / 32 - 2;
			local742 = Static313.anInt5206 * 4 + Static239.aClass20_Sub3_Sub3_Sub1_1.method4678() * 2 + 2 - local65 / 32 - 2;
			Static87.method1274(local19, local506, arg2, local742, arg1, arg0, Static296.aClass49Array101[Static18.aBoolean29 ? 1 : 0]);
		}
		arg3.method3580(arg2 + arg0.anInt6997 / 2 - 1, arg0.anInt7041 / 2 + -1 + arg1, 3, -1, 3);
	}
}
