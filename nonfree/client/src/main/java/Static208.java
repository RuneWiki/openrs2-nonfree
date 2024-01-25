import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static208 {

	@OriginalMember(owner = "client!ha", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString118;

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "Lclient!wca;")
	public static Class5_Sub53 aClass5_Sub53_9;

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!d;IIIIILclient!la;Ljava/awt/Canvas;)Lclient!ha;")
	public static synchronized Class57 method7677(@OriginalArg(0) Interface1 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class208 arg5, @OriginalArg(7) Canvas arg6) {
		if (arg1 == 0) {
			return Static107.method1560(arg0, arg3, arg6, arg2);
		} else if (arg1 == 2) {
			return Static474.method6910(arg6, arg3, arg2, arg0);
		} else if (arg1 == 1) {
			return Static462.method6759(arg6, arg4, arg0);
		} else if (arg1 == 5) {
			return Static69.method1120(arg6, arg5, arg0, arg4);
		} else if (arg1 == 3) {
			return Static687.method5218(arg4, arg6, arg5, arg0);
		} else {
			throw new IllegalArgumentException("UM");
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!la;Lclient!la;Lclient!la;ILclient!jq;Lclient!ot;)Z")
	public static boolean method7682(@OriginalArg(0) Class208 arg0, @OriginalArg(1) Class208 arg1, @OriginalArg(2) Class208 arg2, @OriginalArg(4) Class175 arg3, @OriginalArg(5) Class5_Sub16_Sub4 arg4) {
		Static328.aClass208_72 = arg2;
		Static104.aClass208_17 = arg0;
		Static59.aClass208_11 = arg1;
		Static363.aClass175_2 = arg3;
		Static28.aClass5_Sub16_Sub4_6 = arg4;
		Static625.anIntArray567 = new int[16];
		for (@Pc(28) int local28 = 0; local28 < 16; local28++) {
			Static625.anIntArray567[local28] = 255;
		}
		return true;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(III)Z")
	public static boolean method7683(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!ec;I)V")
	public static void method7695(@OriginalArg(0) Class8_Sub1_Sub3_Sub2 arg0) {
		@Pc(8) int local8 = arg0.anInt7032 - Static44.anInt740;
		@Pc(33) int local33 = arg0.anInt7025 * 512 + arg0.method5993() * 256;
		@Pc(45) int local45 = arg0.anInt6982 * 512 + arg0.method5993() * 256;
		arg0.anInt10363 += (local45 - arg0.anInt10363) / local8;
		arg0.anInt7052 = 0;
		arg0.anInt10355 += (local33 - arg0.anInt10355) / local8;
		if (arg0.anInt7036 == 0) {
			arg0.method5989(8192);
		}
		if (arg0.anInt7036 == 1) {
			arg0.method5989(12288);
		}
		if (arg0.anInt7036 == 2) {
			arg0.method5989(0);
		}
		if (arg0.anInt7036 == 3) {
			arg0.method5989(4096);
		}
	}

	@OriginalMember(owner = "client!ha", name = "h", descriptor = "(I)V")
	public static void method7710() {
		@Pc(15) boolean local15 = Static515.aClass5_Sub23_Sub2_1.method8500() == 1;
		@Pc(19) int local19 = Static515.aClass5_Sub23_Sub2_1.method8515();
		Static452.anInt7483 = Static515.aClass5_Sub23_Sub2_1.method8529();
		@Pc(27) int local27 = Static515.aClass5_Sub23_Sub2_1.method8506();
		@Pc(33) int local33 = Static515.aClass5_Sub23_Sub2_1.method8483();
		Static523.method7573();
		Static518.method7510(local33);
		Static515.aClass5_Sub23_Sub2_1.method8549();
		@Pc(53) int local53;
		@Pc(57) int local57;
		@Pc(66) int local66;
		for (@Pc(47) int local47 = 0; local47 < 4; local47++) {
			for (local53 = 0; local53 < Static544.anInt9261 >> 3; local53++) {
				for (local57 = 0; local57 < Static282.anInt4887 >> 3; local57++) {
					local66 = Static515.aClass5_Sub23_Sub2_1.method8550(1);
					if (local66 == 1) {
						Static107.anIntArrayArrayArray7[local47][local53][local57] = Static515.aClass5_Sub23_Sub2_1.method8550(26);
					} else {
						Static107.anIntArrayArrayArray7[local47][local53][local57] = -1;
					}
				}
			}
		}
		Static515.aClass5_Sub23_Sub2_1.method8548();
		if (8 != 8) {
			aString118 = null;
		}
		local53 = (Static327.anInt5853 - Static515.aClass5_Sub23_Sub2_1.anInt9869) / 16;
		Static261.anIntArrayArray30 = new int[local53][4];
		for (local57 = 0; local57 < local53; local57++) {
			for (local66 = 0; local66 < 4; local66++) {
				Static261.anIntArrayArray30[local57][local66] = Static515.aClass5_Sub23_Sub2_1.method8527();
			}
		}
		Static379.anIntArray374 = new int[local53];
		Static411.aByteArrayArray21 = new byte[local53][];
		Static672.anIntArray621 = new int[local53];
		Static401.anIntArray398 = new int[local53];
		Static494.aByteArrayArray27 = null;
		Static445.aByteArrayArray24 = new byte[local53][];
		Static444.aByteArrayArray23 = new byte[local53][];
		Static13.anIntArray18 = new int[local53];
		Static293.anIntArray287 = null;
		Static319.aByteArrayArray13 = new byte[local53][];
		Static617.anIntArray562 = new int[local53];
		local53 = 0;
		for (local66 = 0; local66 < 4; local66++) {
			for (@Pc(229) int local229 = 0; local229 < Static544.anInt9261 >> 3; local229++) {
				for (@Pc(233) int local233 = 0; local233 < Static282.anInt4887 >> 3; local233++) {
					@Pc(243) int local243 = Static107.anIntArrayArrayArray7[local66][local229][local233];
					if (local243 != -1) {
						@Pc(252) int local252 = local243 >> 14 & 0x3FF;
						@Pc(258) int local258 = local243 >> 3 & 0x7FF;
						@Pc(268) int local268 = (local252 / 8 << 8) + local258 / 8;
						for (@Pc(270) int local270 = 0; local270 < local53; local270++) {
							if (Static672.anIntArray621[local270] == local268) {
								local268 = -1;
								break;
							}
						}
						if (local268 != -1) {
							Static672.anIntArray621[local53] = local268;
							@Pc(307) int local307 = local268 >> 8 & 0xFF;
							@Pc(311) int local311 = local268 & 0xFF;
							Static13.anIntArray18[local53] = Static609.aClass208_137.method4986("m" + local307 + "_" + local311, -115);
							Static617.anIntArray562[local53] = Static609.aClass208_137.method4986("l" + local307 + "_" + local311, -87);
							Static401.anIntArray398[local53] = Static609.aClass208_137.method4986("um" + local307 + "_" + local311, -82);
							Static379.anIntArray374[local53] = Static609.aClass208_137.method4986("ul" + local307 + "_" + local311, -102);
							local53++;
						}
					}
				}
			}
		}
		Static286.method4303(local19, local15, 11, local27);
	}
}
