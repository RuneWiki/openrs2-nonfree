import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static244 {

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "I")
	public static int anInt4751;

	@OriginalMember(owner = "client!pf", name = "d", descriptor = "I")
	public static int anInt4754 = 0;

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(B)V")
	public static void method4281() {
		while (true) {
			if (Static30.aClass14_Sub4_Sub2_1.method2562(Static327.anInt6307) >= 27) {
				@Pc(21) int local21 = Static30.aClass14_Sub4_Sub2_1.method2558(15);
				if (local21 != 32767) {
					@Pc(26) boolean local26 = false;
					if (Static266.aClass10_Sub3_Sub3_Sub1Array1[local21] == null) {
						Static266.aClass10_Sub3_Sub3_Sub1Array1[local21] = new Class10_Sub3_Sub3_Sub1();
						local26 = true;
						Static266.aClass10_Sub3_Sub3_Sub1Array1[local21].anInt5954 = local21;
					}
					@Pc(47) Class10_Sub3_Sub3_Sub1 local47 = Static266.aClass10_Sub3_Sub3_Sub1Array1[local21];
					Static98.anIntArray205[Static315.anInt6456++] = local21;
					local47.anInt5927 = Static153.anInt3257;
					if (local47.aClass192_1 != null && local47.aClass192_1.method5286()) {
						Static261.method3791(local47);
					}
					@Pc(74) int local74 = Static30.aClass14_Sub4_Sub2_1.method2558(1);
					@Pc(79) int local79 = Static30.aClass14_Sub4_Sub2_1.method2558(5);
					if (local79 > 15) {
						local79 -= 32;
					}
					@Pc(88) int local88 = Static30.aClass14_Sub4_Sub2_1.method2558(1);
					if (local88 == 1) {
						Static116.anIntArray227[Static222.anInt4457++] = local21;
					}
					local47.method4957(Static267.method4561(Static30.aClass14_Sub4_Sub2_1.method2558(14)));
					@Pc(115) int local115 = Static199.anIntArray345[Static30.aClass14_Sub4_Sub2_1.method2558(3)];
					@Pc(120) int local120 = Static30.aClass14_Sub4_Sub2_1.method2558(5);
					local47.method5362(local47.aClass192_1.anInt5798);
					if (local120 > 15) {
						local120 -= 32;
					}
					local47.anInt5922 = local47.aClass192_1.anInt5784 << 3;
					if (local47.anInt5922 == 0) {
						local47.method5366(0);
					} else if (local26) {
						local47.method5366(local115);
					}
					local47.method5352(Static219.anInt4400, Static173.aClass10_Sub3_Sub3_Sub2_1.anIntArray535[0] + local120, local74 == 1, local47.method5353(), Static173.aClass10_Sub3_Sub3_Sub2_1.anIntArray536[0] + local79);
					if (local47.aClass192_1.method5286()) {
						Static117.method4693(local47.anIntArray535[0], null, Static219.anInt4400, 0, local47, null, local47.anIntArray536[0]);
					}
					continue;
				}
			}
			Static30.aClass14_Sub4_Sub2_1.method2559();
			return;
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(III)I")
	public static int method4282(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(40) int local40 = Static295.method5038(4, arg0 + 45365, arg1 - -91923) + (Static295.method5038(2, arg0 - -10294, arg1 - -37821) + -128 >> 1) + (Static295.method5038(1, arg0, arg1) + -128 >> 2) - 128;
		local40 = (int) ((double) local40 * 0.3D) + 35;
		if (local40 < 10) {
			local40 = 10;
		} else if (local40 > 60) {
			local40 = 60;
		}
		return local40;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)V")
	public static void method4283() {
		Static167.method4776();
		Static199.method3713();
		Static355.method6008();
		Static327.method5623();
		Static343.method5858();
		Static323.method980();
		Static166.method3292();
		Static347.method5909();
		Static303.method5985();
		Static201.method3728();
		Static303.method5987();
		Static338.method5821();
		Static180.method3494();
		Static338.method5820();
		Static184.method3542();
		Static167.method4777();
		Static159.method3096();
		Static290.method4971();
		Static252.method4373();
		Static92.method2162();
		Static141.method2821();
		Static215.method3862();
		if (Static131.anInt1769 != 0) {
			for (@Pc(68) int local68 = 0; local68 < Static192.aByteArrayArray12.length; local68++) {
				Static192.aByteArrayArray12[local68] = null;
			}
			Static196.anInt3993 = 0;
		}
		Static181.method3500();
		Static60.method1351();
		Static273.method4629();
		Static50.method1218();
		Static279.method4725();
		Static10.aClass11_3.method213();
		Static218.aClass46_5.method5086();
		Static44.aClass178_3.method4769();
		Static247.method4309();
		Static346.aClass143_116.method3748();
		Static237.aClass143_89.method3748();
		Static185.aClass143_75.method3748();
		Static92.aClass143_51.method3748();
		Static54.aClass143_38.method3748();
		Static231.aClass143_85.method3748();
		Static304.aClass143_106.method3748();
		Static338.aClass143_114.method3748();
		Static348.aClass143_98.method3748();
		Static302.aClass143_105.method3748();
		Static86.aClass143_49.method3748();
		Static69.aClass143_42.method3748();
		Static9.aClass143_8.method3748();
		Static332.aClass143_111.method3748();
		Static233.aClass143_86.method3748();
		Static80.aClass143_48.method3748();
		Static213.aClass143_80.method3748();
		Static99.aClass143_53.method3748();
		Static39.aClass143_25.method3748();
		Static272.aClass143_96.method3748();
		Static192.aClass143_77.method3748();
		Static127.aClass143_59.method3748();
		Static44.aClass143_30.method3748();
		Static53.aClass143_37.method3748();
		Static202.aClass143_79.method3748();
		Static46.aClass143_32.method3748();
		Static277.aClass143_97.method3748();
		Static48.aClass143_34.method3748();
		Static27.aClass143_18.method3748();
		Static124.aClass11_61.method213();
		Static321.aClass11_136.method213();
		Static47.aClass11_25.method213();
		Static234.aClass11_98.method213();
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(BLclient!jd;)V")
	public static void method4284(@OriginalArg(1) Class10_Sub3_Sub3 arg0) {
		@Pc(5) boolean local5 = false;
		if (arg0.anInt5971 == Static153.anInt3257 || arg0.anInt5961 == -1 || arg0.anInt5963 != 0) {
			local5 = true;
		} else {
			@Pc(25) Class79 local25 = Static233.method4080(arg0.anInt5961);
			if (local25.aBoolean164 || local25.anIntArray215[arg0.anInt5933] < arg0.anInt5968 + 1) {
				local5 = true;
			}
		}
		if (local5) {
			@Pc(57) int local57 = arg0.anInt5971 - arg0.anInt5928;
			@Pc(63) int local63 = Static153.anInt3257 - arg0.anInt5928;
			@Pc(74) int local74 = arg0.anInt5930 * 128 + arg0.method5353() * 64;
			@Pc(85) int local85 = arg0.anInt5974 * 128 + arg0.method5353() * 64;
			@Pc(96) int local96 = arg0.anInt5972 * 128 + arg0.method5353() * 64;
			@Pc(108) int local108 = arg0.anInt5965 * 128 + arg0.method5353() * 64;
			arg0.anInt5910 = (local63 * local96 + local74 * (local57 - local63)) / local57;
			arg0.anInt5908 = (local63 * local108 + (local57 - local63) * local85) / local57;
		}
		arg0.anInt5983 = 0;
		if (arg0.anInt5977 == 0) {
			arg0.method5366(8192);
		}
		if (arg0.anInt5977 == 1) {
			arg0.method5366(12288);
		}
		if (arg0.anInt5977 == 2) {
			arg0.method5366(0);
		}
		if (arg0.anInt5977 == 3) {
			arg0.method5366(4096);
		}
	}
}
