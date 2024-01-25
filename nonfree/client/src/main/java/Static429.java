import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static429 {

	@OriginalMember(owner = "client!pia", name = "d", descriptor = "I")
	public static int anInt8032;

	@OriginalMember(owner = "client!pia", name = "f", descriptor = "Lclient!vaa;")
	public static Class322_Sub1 aClass322_Sub1_2;

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(IIIIBIII)V")
	public static void method6857(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static161.anInt7734 <= arg2 && arg5 <= Static38.anInt823 && arg1 >= Static380.anInt7421 && Static237.anInt5159 >= arg6) {
			Static252.method4679(arg3, arg6, arg1, arg5, arg0, arg4, arg2);
		} else {
			Static465.method7206(arg6, arg5, arg1, arg0, arg4, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(ZI)V")
	public static void method6858(@OriginalArg(0) boolean arg0) {
		if (Static251.aClass8_1 == null) {
			Static289.method5237();
		}
		if (arg0) {
			Static251.aClass8_1.method179();
		}
	}

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(ILclient!ha;)V")
	public static void method6860(@OriginalArg(1) Class20 arg0) {
		Static478.aClass95Array1 = new Class95[Static2.anIntArray229.length];
		for (@Pc(16) int local16 = 0; local16 < Static2.anIntArray229.length; local16++) {
			@Pc(22) int local22 = Static2.anIntArray229[local16];
			@Pc(27) Class239 local27 = Static392.method6465(local22, Static502.aClass157_259);
			@Pc(35) Class68 local35 = arg0.method7289(local27, Static652.method7585(Static238.aClass157_118, local22));
			Static478.aClass95Array1[local16] = new Class95(local35, local27);
		}
	}

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(BLclient!cea;)Lclient!jca;")
	public static Class162 method6861(@OriginalArg(1) Class2_Sub11 arg0) {
		@Pc(7) int local7 = arg0.method8381();
		return new Class162(local7);
	}

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(I)V")
	public static void method6864() {
		if (Static578.aClass240_12 == null) {
			return;
		}
		if (Static578.aClass240_12.anInt7566 == 1) {
			Static578.aClass240_12 = null;
			return;
		}
		if (Static578.aClass240_12.anInt7566 == 2) {
			Static336.method5804(Static471.aClass370_4, Static461.aString90, 2);
			Static578.aClass240_12 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(IBI)Z")
	public static boolean method6866(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static618.method9021(arg0, arg1) | (arg1 & 0x70000) != 0 || Static573.method8544(arg1, arg0);
	}

	@OriginalMember(owner = "client!pia", name = "b", descriptor = "(I)V")
	public static void method6867() {
		for (@Pc(8) int local8 = 0; local8 < Static33.anInt5425; local8++) {
			@Pc(14) int local14 = Static18.anIntArray18[local8];
			@Pc(22) Class3_Sub1_Sub3_Sub3_Sub1 local22 = ((Class2_Sub33) Static600.aClass99_79.method3056((long) local14)).aClass3_Sub1_Sub3_Sub3_Sub1_2;
			@Pc(26) int local26 = Static627.aClass2_Sub11_Sub2_6.method8383();
			if ((local26 & 0x10) != 0) {
				local26 += Static627.aClass2_Sub11_Sub2_6.method8383() << 8;
			}
			if ((local26 & 0x2) != 0) {
				if (local22.aClass27_1.method726()) {
					Static189.method9237(local22);
				}
				local22.method3406(Static462.aClass355_2.method8744(Static627.aClass2_Sub11_Sub2_6.method8351()));
				local22.method5212(local22.aClass27_1.anInt666);
				local22.anInt6097 = local22.aClass27_1.anInt627 << 3;
				if (local22.aClass27_1.method726()) {
					Static5.method117(local22, local22.aByte132, local22.anIntArray357[0], local22.anIntArray358[0], null, null, 0);
				}
			}
			@Pc(112) int local112;
			@Pc(139) int local139;
			if ((local26 & 0x8) != 0) {
				@Pc(110) int[] local110 = new int[4];
				for (local112 = 0; local112 < 4; local112++) {
					local110[local112] = Static627.aClass2_Sub11_Sub2_6.method8326();
					if (local110[local112] == 65535) {
						local110[local112] = -1;
					}
				}
				local139 = Static627.aClass2_Sub11_Sub2_6.method8338();
				Static259.method4752(local139, local110, local22);
			}
			@Pc(171) int local171;
			@Pc(177) int local177;
			@Pc(152) int local152;
			if ((local26 & 0x20) != 0) {
				local152 = Static627.aClass2_Sub11_Sub2_6.method8369();
				local112 = Static627.aClass2_Sub11_Sub2_6.method8339();
				if (local152 == 65535) {
					local152 = -1;
				}
				local139 = Static627.aClass2_Sub11_Sub2_6.method8383();
				local171 = local139 & 0x7;
				local177 = local139 >> 3 & 0xF;
				if (local177 == 15) {
					local177 = -1;
				}
				local22.method5215(local171, local152, local177, false, local112);
			}
			@Pc(219) int local219;
			@Pc(205) int[] local205;
			@Pc(208) int[] local208;
			if ((local26 & 0x4000) != 0) {
				local152 = Static627.aClass2_Sub11_Sub2_6.method8325();
				local205 = new int[local152];
				local208 = new int[local152];
				@Pc(211) int[] local211 = new int[local152];
				for (local177 = 0; local177 < local152; local177++) {
					local219 = Static627.aClass2_Sub11_Sub2_6.method8326();
					if (local219 == 65535) {
						local219 = -1;
					}
					local205[local177] = local219;
					local208[local177] = Static627.aClass2_Sub11_Sub2_6.method8325();
					local211[local177] = Static627.aClass2_Sub11_Sub2_6.method8354();
				}
				Static299.method5337(local22, local211, local205, local208);
			}
			if ((local26 & 0x200) != 0) {
				local152 = Static627.aClass2_Sub11_Sub2_6.method8338();
				local205 = new int[local152];
				local208 = new int[local152];
				for (local171 = 0; local171 < local152; local171++) {
					local177 = Static627.aClass2_Sub11_Sub2_6.method8351();
					if ((local177 & 0xC000) == 49152) {
						local219 = Static627.aClass2_Sub11_Sub2_6.method8326();
						local205[local171] = local219 | local177 << 16;
					} else {
						local205[local171] = local177;
					}
					local208[local171] = Static627.aClass2_Sub11_Sub2_6.method8326();
				}
				local22.method5208(local208, local205);
			}
			if ((local26 & 0x4) != 0) {
				local22.anInt3863 = Static627.aClass2_Sub11_Sub2_6.method8351();
				local22.anInt3875 = Static627.aClass2_Sub11_Sub2_6.method8369();
			}
			if ((local26 & 0x1000) != 0) {
				local22.anInt6085 = Static627.aClass2_Sub11_Sub2_6.method8341();
				local22.anInt6101 = Static627.aClass2_Sub11_Sub2_6.method8341();
				local22.anInt6044 = Static627.aClass2_Sub11_Sub2_6.method8384();
				local22.anInt6081 = Static627.aClass2_Sub11_Sub2_6.method8341();
				local22.anInt6042 = Static627.aClass2_Sub11_Sub2_6.method8369() + Static407.anInt7704;
				local22.anInt6091 = Static627.aClass2_Sub11_Sub2_6.method8351() + Static407.anInt7704;
				local22.anInt6036 = Static627.aClass2_Sub11_Sub2_6.method8338();
				local22.anInt6101 += local22.anIntArray357[0];
				local22.anInt6103 = 0;
				local22.anInt6081 += local22.anIntArray357[0];
				local22.anInt6085 += local22.anIntArray358[0];
				local22.anInt6044 += local22.anIntArray358[0];
				local22.anInt6102 = 1;
			}
			if ((local26 & 0x2000) != 0) {
				local22.aByte96 = Static627.aClass2_Sub11_Sub2_6.method8357();
				local22.aByte94 = Static627.aClass2_Sub11_Sub2_6.method8341();
				local22.aByte97 = Static627.aClass2_Sub11_Sub2_6.method8357();
				local22.aByte98 = (byte) Static627.aClass2_Sub11_Sub2_6.method8383();
				local22.anInt6049 = Static407.anInt7704 + Static627.aClass2_Sub11_Sub2_6.method8326();
				local22.anInt6051 = Static407.anInt7704 + Static627.aClass2_Sub11_Sub2_6.method8326();
			}
			if ((local26 & 0x40) != 0) {
				local152 = Static627.aClass2_Sub11_Sub2_6.method8338();
				if (local152 > 0) {
					for (local112 = 0; local112 < local152; local112++) {
						local171 = -1;
						local177 = -1;
						local219 = -1;
						local139 = Static627.aClass2_Sub11_Sub2_6.method8378();
						if (local139 == 32767) {
							local139 = Static627.aClass2_Sub11_Sub2_6.method8378();
							local177 = Static627.aClass2_Sub11_Sub2_6.method8378();
							local171 = Static627.aClass2_Sub11_Sub2_6.method8378();
							local219 = Static627.aClass2_Sub11_Sub2_6.method8378();
						} else if (local139 == 32766) {
							local139 = -1;
						} else {
							local177 = Static627.aClass2_Sub11_Sub2_6.method8378();
						}
						@Pc(530) int local530 = Static627.aClass2_Sub11_Sub2_6.method8378();
						@Pc(534) int local534 = Static627.aClass2_Sub11_Sub2_6.method8383();
						local22.method5216(local177, Static407.anInt7704, local139, local219, local171, local530, local534);
					}
				}
			}
			if ((local26 & 0x80) != 0) {
				local22.anInt6070 = Static627.aClass2_Sub11_Sub2_6.method8326();
				if (local22.anInt6070 == 65535) {
					local22.anInt6070 = -1;
				}
			}
			if ((local26 & 0x1) != 0) {
				local22.aString62 = Static627.aClass2_Sub11_Sub2_6.method8373();
				local22.anInt6061 = 100;
			}
			if ((local26 & 0x800) != 0) {
				local152 = Static627.aClass2_Sub11_Sub2_6.method8326();
				local22.anInt6033 = Static627.aClass2_Sub11_Sub2_6.method8338();
				local22.anInt6066 = Static627.aClass2_Sub11_Sub2_6.method8338();
				local22.anInt6023 = local152 & 0x7FFF;
				local22.aBoolean452 = (local152 & 0x8000) != 0;
				local22.anInt6080 = local22.anInt6033 + Static407.anInt7704 + local22.anInt6023;
			}
			if ((local26 & 0x400) != 0) {
				local152 = Static627.aClass2_Sub11_Sub2_6.method8369();
				local112 = Static627.aClass2_Sub11_Sub2_6.method8360();
				if (local152 == 65535) {
					local152 = -1;
				}
				local139 = Static627.aClass2_Sub11_Sub2_6.method8338();
				local171 = local139 & 0x7;
				local177 = local139 >> 3 & 0xF;
				if (local177 == 15) {
					local177 = -1;
				}
				local22.method5215(local171, local152, local177, true, local112);
			}
		}
	}
}
