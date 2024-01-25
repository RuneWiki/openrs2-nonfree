import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static638 {

	@OriginalMember(owner = "client!uca", name = "H", descriptor = "Z")
	public static boolean aBoolean748 = false;

	@OriginalMember(owner = "client!uca", name = "E", descriptor = "I")
	public static final int anInt10345 = 1400;

	@OriginalMember(owner = "client!uca", name = "c", descriptor = "(Z)V")
	public static void method8656() {
		@Pc(8) int local8 = Static551.aByteArrayArray18.length;
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			if (Static551.aByteArrayArray18[local10] != null) {
				@Pc(22) int local22 = -1;
				for (@Pc(24) int local24 = 0; local24 < Static448.anInt7900; local24++) {
					if (Static514.anIntArray479[local24] == Static46.anIntArray54[local10]) {
						local22 = local24;
						break;
					}
				}
				if (local22 == -1) {
					Static514.anIntArray479[Static448.anInt7900] = Static46.anIntArray54[local10];
					local22 = Static448.anInt7900++;
				}
				@Pc(71) Class3_Sub28 local71 = new Class3_Sub28(Static551.aByteArrayArray18[local10]);
				@Pc(73) int local73 = 0;
				while (local71.anInt6241 < Static551.aByteArrayArray18[local10].length && local73 < 511 && Static337.anInt5854 < 1023) {
					@Pc(94) int local94 = local73++ << 6 | local22;
					@Pc(98) int local98 = local71.method5272();
					@Pc(102) int local102 = local98 >> 14;
					@Pc(108) int local108 = local98 >> 7 & 0x3F;
					@Pc(112) int local112 = local98 & 0x3F;
					@Pc(124) int local124 = local108 + (Static46.anIntArray54[local10] >> 8) * 64 - Static714.anInt11156;
					@Pc(137) int local137 = (Static46.anIntArray54[local10] & 0xFF) * 64 + local112 - Static339.anInt5859;
					@Pc(144) Class18 local144 = Static631.aClass85_2.method2214(local71.method5272());
					@Pc(151) Class3_Sub13 local151 = (Class3_Sub13) Static612.aClass136_44.method3503((long) local94);
					if (local151 == null && (local144.aByte9 & 0x1) > 0 && Static715.anInt7793 == local102 && local124 >= 0 && local124 + local144.anInt437 < Static362.anInt8653 && local137 >= 0 && local137 + local144.anInt437 < Static206.anInt11291) {
						@Pc(209) Class19_Sub1_Sub3_Sub2_Sub1 local209 = new Class19_Sub1_Sub3_Sub2_Sub1();
						local209.anInt7796 = local94;
						@Pc(217) Class3_Sub13 local217 = new Class3_Sub13(local209);
						Static612.aClass136_44.method3508((long) local94, local217);
						Static95.aClass3_Sub13Array1[Static32.anInt518++] = local217;
						Static101.anIntArray95[Static337.anInt5854++] = local94;
						local209.anInt7815 = Static269.anInt4883;
						local209.method3434(local144);
						local209.method6599(local209.aClass18_1.anInt437);
						local209.anInt7818 = local209.aClass18_1.anInt464 << 3;
						local209.method6597(local209.aClass18_1.aByte8 + 4 << 11 & 0x3E4E, true);
						local209.method3441(local124, local102, local137, local209.method6592(), true);
					}
				}
			}
		}
		if (false) {
			aBoolean748 = false;
		}
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(IB)V")
	public static void method8657(@OriginalArg(0) int arg0) {
		if (Static178.anInt3225 == arg0) {
			return;
		}
		if (arg0 == 14 || arg0 == 15) {
			Static436.method6382();
		}
		if (arg0 != 14 && Static90.aClass255_1 != null) {
			Static90.aClass255_1.method6265();
			Static90.aClass255_1 = null;
		}
		if (arg0 == 3) {
			Static312.method4705(Static224.aClass84_1.anInt2473 != Static633.anInt3426);
		}
		if (arg0 == 7) {
			Static691.method9068(Static633.anInt3426 != Static224.aClass84_1.anInt2475);
		}
		if (arg0 == 5 || arg0 == 13) {
			Static671.method8896();
		} else if (arg0 == 6 || arg0 == 9 && Static178.anInt3225 != 10) {
			Static436.method6382();
		}
		if (Static87.method1179(Static178.anInt3225)) {
			Static450.aClass221_121.anInt5968 = 2;
			Static372.aClass221_104.anInt5968 = 2;
			Static5.aClass221_1.anInt5968 = 2;
			Static264.aClass221_73.anInt5968 = 2;
			Static412.aClass221_119.anInt5968 = 2;
			Static650.aClass221_155.anInt5968 = 2;
			Static332.aClass221_95.anInt5968 = 2;
		}
		if (Static87.method1179(arg0)) {
			Static553.anInt9240 = 0;
			Static400.anInt7156 = 0;
			Static234.anInt4458 = 1;
			Static260.anInt4804 = 1;
			Static339.anInt5858 = 0;
			Static650.method8735(true);
			Static450.aClass221_121.anInt5968 = 1;
			Static372.aClass221_104.anInt5968 = 1;
			Static5.aClass221_1.anInt5968 = 1;
			Static264.aClass221_73.anInt5968 = 1;
			Static412.aClass221_119.anInt5968 = 1;
			Static650.aClass221_155.anInt5968 = 1;
			Static332.aClass221_95.anInt5968 = 1;
		}
		if (arg0 == 12 || arg0 == 3) {
			Static470.method6954();
		}
		@Pc(214) boolean local214 = arg0 == 2 || Static645.method8716(arg0) || Static549.method7771(arg0);
		@Pc(241) boolean local241 = Static178.anInt3225 == 2 || Static645.method8716(Static178.anInt3225) || Static549.method7771(Static178.anInt3225);
		if (local241 != local214) {
			if (local214) {
				Static491.anInt8476 = Static183.anInt3251;
				if (Static713.aClass3_Sub55_31.aClass15_Sub8_3.method2888() == 0) {
					Static503.method7214();
				} else {
					Static158.method2531(Static713.aClass3_Sub55_31.aClass15_Sub8_3.method2888(), Static191.aClass221_51, Static183.anInt3251);
					Static203.method3017();
				}
				Static406.aClass153_2.method3740(false);
			} else {
				Static503.method7214();
				Static406.aClass153_2.method3740(true);
			}
		}
		if (Static87.method1179(arg0) || arg0 == 14 || arg0 == 15) {
			Static488.aClass67_12.method7663();
		}
		Static178.anInt3225 = arg0;
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(Lclient!lk;I)I")
	public static int method8658(@OriginalArg(0) Class3_Sub28_Sub2 arg0) {
		@Pc(10) int local10 = arg0.method5344(2);
		@Pc(25) int local25;
		if (local10 == 0) {
			local25 = 0;
		} else if (local10 == 1) {
			local25 = arg0.method5344(5);
		} else if (local10 == 2) {
			local25 = arg0.method5344(8);
		} else {
			local25 = arg0.method5344(11);
		}
		return local25;
	}
}
