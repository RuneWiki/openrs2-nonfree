import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static219 {

	@OriginalMember(owner = "client!nk", name = "H", descriptor = "Lclient!ki;")
	public static Class125 aClass125_1;

	@OriginalMember(owner = "client!nk", name = "Ec", descriptor = "I")
	public static int anInt4302;

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lclient!r;Lclient!r;Lclient!wm;I)V", line = 78)
	public static void method4103(@OriginalArg(0) Class197 arg0, @OriginalArg(1) Class197 arg1, @OriginalArg(2) Class19 arg2) {
		Static49.aClass239_1 = Static94.method2167(Static171.anInt80, arg1);
		Static187.aClass130_3 = arg2.method2859(Static49.aClass239_1, Static372.method1690(arg0, Static171.anInt80));
		Static155.aClass239_3 = Static94.method2167(Static346.anInt7001, arg1);
		Static253.aClass130_4 = arg2.method2859(Static155.aClass239_3, Static372.method1690(arg0, Static346.anInt7001));
		Static106.aClass239_2 = Static94.method2167(Static76.anInt6666, arg1);
		Static49.aClass130_1 = arg2.method2859(Static106.aClass239_2, Static372.method1690(arg0, Static76.anInt6666));
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIII)V", line = 144)
	public static void method4105(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		Static334.aByteArrayArrayArray16 = new byte[4][arg0][arg1];
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)V", line = 991)
	public static void method4113() {
		for (@Pc(7) int local7 = 0; local7 < Class226.anInt6378; local7++) {
			@Pc(21) int local21 = Class187.anIntArray361[local7];
			@Pc(25) Class11_Sub5_Sub2_Sub2 local25 = Class2_Sub40.aClass11_Sub5_Sub2_Sub2Array1[local21];
			@Pc(29) int local29 = Class150.aClass2_Sub4_Sub2_3.method4816();
			if ((local29 & 0x40) != 0) {
				local29 += Class150.aClass2_Sub4_Sub2_3.method4816() << 8;
			}
			@Pc(55) int local55;
			if ((local29 & 0x400) != 0) {
				local55 = Class150.aClass2_Sub4_Sub2_3.method4807();
				local25.anInt4570 = Class150.aClass2_Sub4_Sub2_3.method4812();
				local25.anInt4583 = Class150.aClass2_Sub4_Sub2_3.method4812();
				local25.anInt4614 = local55 & 0x7FFF;
				local25.aBoolean319 = (local55 & 0x8000) != 0;
				local25.anInt4612 = Class83.anInt2345 + local25.anInt4614 + local25.anInt4570;
			}
			@Pc(107) int local107;
			if ((local29 & 0x2) != 0) {
				local55 = Class150.aClass2_Sub4_Sub2_3.method4818();
				local107 = Class150.aClass2_Sub4_Sub2_3.method4805();
				local25.method4335(local107, local55, Class83.anInt2345);
				local25.anInt4598 = Class83.anInt2345 + 300;
				local25.anInt4622 = Class150.aClass2_Sub4_Sub2_3.method4816();
			}
			if ((local29 & 0x8) != 0) {
				local55 = Class150.aClass2_Sub4_Sub2_3.method4830();
				if (local55 == 65535) {
					local55 = -1;
				}
				local107 = Class150.aClass2_Sub4_Sub2_3.method4812();
				Static284.method5257(local55, local25, local107);
			}
			if ((local29 & 0x80) != 0) {
				local25.aString50 = Class150.aClass2_Sub4_Sub2_3.method4810();
				local25.anInt4627 = 100;
			}
			@Pc(224) int local224;
			if ((local29 & 0x4) != 0) {
				local55 = Class150.aClass2_Sub4_Sub2_3.method4854();
				local107 = Class150.aClass2_Sub4_Sub2_3.method4845();
				if (local55 == 65535) {
					local55 = -1;
				}
				@Pc(186) boolean local186 = true;
				@Pc(221) Class157 local221;
				if (local55 != -1 && local25.anInt4586 != -1) {
					@Pc(207) Class91 local207;
					if (local55 == local25.anInt4586) {
						local207 = Static299.aClass211_2.method5408(local55);
						if (local207.aBoolean177 && local207.anInt2445 != -1) {
							local221 = Static37.aClass85_1.method2373(local207.anInt2445);
							local224 = local221.anInt4017;
							if (local224 == 0) {
								local186 = false;
							} else if (local224 == 1) {
								local186 = true;
							} else if (local224 == 2) {
								local25.anInt4590 = 0;
								local186 = false;
							}
						}
					} else {
						local207 = Static299.aClass211_2.method5408(local55);
						@Pc(262) Class91 local262 = Static299.aClass211_2.method5408(local25.anInt4586);
						if (local207.anInt2445 != -1 && local262.anInt2445 != -1) {
							@Pc(277) Class157 local277 = Static37.aClass85_1.method2373(local207.anInt2445);
							@Pc(283) Class157 local283 = Static37.aClass85_1.method2373(local262.anInt2445);
							if (local277.anInt4018 < local283.anInt4018) {
								local186 = false;
							}
						}
					}
				}
				if (local186) {
					local25.anInt4611 = 0;
					local25.anInt4586 = local55;
					local25.anInt4574 = 0;
					local25.anInt4630 = local107 >> 16;
					local25.anInt4603 = 1;
					local25.anInt4587 = Class83.anInt2345 + (local107 & 0xFFFF);
					if (Class83.anInt2345 < local25.anInt4587) {
						local25.anInt4574 = -1;
					}
					if (local25.anInt4586 != -1 && Class83.anInt2345 == local25.anInt4587) {
						@Pc(340) int local340 = Static299.aClass211_2.method5408(local25.anInt4586).anInt2445;
						if (local340 != -1) {
							local221 = Static37.aClass85_1.method2373(local340);
							if (local221 != null && local221.anIntArray262 != null) {
								Static1.method4(local221, false, local25.aByte78, local25.anInt6768, local25.anInt6770, 0);
							}
						}
					}
				}
			}
			if ((local29 & 0x20) != 0) {
				local25.anInt4602 = Class150.aClass2_Sub4_Sub2_3.method4830();
				if (local25.anInt4602 == 65535) {
					local25.anInt4602 = -1;
				}
			}
			if ((local29 & 0x1) != 0) {
				local55 = Class150.aClass2_Sub4_Sub2_3.method4818();
				local107 = Class150.aClass2_Sub4_Sub2_3.method4805();
				local25.method4335(local107, local55, Class83.anInt2345);
			}
			if ((local29 & 0x100) != 0) {
				local55 = Class150.aClass2_Sub4_Sub2_3.method4812();
				@Pc(411) int[] local411 = new int[local55];
				@Pc(414) int[] local414 = new int[local55];
				@Pc(417) int[] local417 = new int[local55];
				for (@Pc(419) int local419 = 0; local419 < local55; local419++) {
					local224 = Class150.aClass2_Sub4_Sub2_3.method4807();
					if (local224 == 65535) {
						local224 = -1;
					}
					local411[local419] = local224;
					local414[local419] = Class150.aClass2_Sub4_Sub2_3.method4805();
					local417[local419] = Class150.aClass2_Sub4_Sub2_3.method4830();
				}
				Static86.method1968(local411, local417, local25, local414);
			}
			if ((local29 & 0x200) != 0) {
				local25.anInt4654 = Class150.aClass2_Sub4_Sub2_3.method4830();
				local25.anInt4648 = Class150.aClass2_Sub4_Sub2_3.method4804();
			}
			if ((local29 & 0x10) != 0) {
				if (local25.aClass71_1.method2101()) {
					Static145.method2783(local25);
				}
				local25.method4343(Static6.aClass219_1.method5571(Class150.aClass2_Sub4_Sub2_3.method4804()));
				local25.method4323(local25.aClass71_1.anInt2038);
				local25.anInt4596 = local25.aClass71_1.anInt2041 << 3;
				if (local25.aClass71_1.method2101()) {
					Static197.method3725(null, local25.anIntArray317[0], 0, null, local25, local25.anIntArray316[0], local25.aByte78);
				}
			}
		}
	}
}
