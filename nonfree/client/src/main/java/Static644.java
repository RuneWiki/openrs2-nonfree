import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static644 {

	@OriginalMember(owner = "client!za", name = "h", descriptor = "F")
	public static float aFloat225;

	@OriginalMember(owner = "client!za", name = "j", descriptor = "Lclient!eq;")
	public static Class97 aClass97_154;

	@OriginalMember(owner = "client!za", name = "k", descriptor = "I")
	public static int anInt10296;

	@OriginalMember(owner = "client!za", name = "m", descriptor = "[I")
	public static final int[] anIntArray756 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(IIIIIIILclient!ha;I)V")
	public static void method8603(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class87 arg7) {
		@Pc(11) Interface27 local11 = (Interface27) Static468.method6746(arg3, arg2, arg6);
		@Pc(20) Class350 local20;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(37) int local37;
		if (local11 != null) {
			local20 = Static619.aClass281_4.method6734(local11.method8326());
			local26 = local11.method8328() & 0x3;
			local30 = local11.method8329();
			if (local20.anInt9637 == -1) {
				local37 = arg1;
				if (local20.anInt9624 > 0) {
					local37 = arg4;
				}
				if (local30 == 0 || local30 == 2) {
					if (local26 == 0) {
						arg7.method7921(arg0, local37, arg5, 4);
					} else if (local26 == 1) {
						arg7.method7888(arg5, 4, local37, arg0);
					} else if (local26 == 2) {
						arg7.method7921(arg0 + 3, local37, arg5, 4);
					} else if (local26 == 3) {
						arg7.method7888(arg5 + 3, 4, local37, arg0);
					}
				}
				if (local30 == 3) {
					if (local26 == 0) {
						arg7.method7898(1, 1, local37, arg5, arg0);
					} else if (local26 == 1) {
						arg7.method7898(1, 1, local37, arg5, arg0 + 3);
					} else if (local26 == 2) {
						arg7.method7898(1, 1, local37, arg5 + 3, arg0 + 3);
					} else if (local26 == 3) {
						arg7.method7898(1, 1, local37, arg5 + 3, arg0);
					}
				}
				if (local30 == 2) {
					if (local26 == 0) {
						arg7.method7888(arg5, 4, local37, arg0);
					} else if (local26 == 1) {
						arg7.method7921(arg0 + 3, local37, arg5, 4);
					} else if (local26 == 2) {
						arg7.method7888(arg5 + 3, 4, local37, arg0);
					} else if (local26 == 3) {
						arg7.method7921(arg0, local37, arg5, 4);
					}
				}
			} else {
				Static428.method6427(arg0, local26, arg5, arg7, local20);
			}
		}
		local11 = (Interface27) Static383.method5768(arg3, arg2, arg6, wk.class);
		if (local11 != null) {
			local20 = Static619.aClass281_4.method6734(local11.method8326());
			local26 = local11.method8328() & 0x3;
			local30 = local11.method8329();
			if (local20.anInt9637 != -1) {
				Static428.method6427(arg0, local26, arg5, arg7, local20);
			} else if (local30 == 9) {
				local37 = -1118482;
				if (local20.anInt9624 > 0) {
					local37 = -1179648;
				}
				if (local26 == 0 || local26 == 2) {
					arg7.method7964(arg5, arg0 + 3, arg0, local37, arg5 + 3);
				} else {
					arg7.method7964(arg5 + 3, arg0 + 3, arg0, local37, arg5);
				}
			}
		}
		local11 = (Interface27) Static263.method4286(arg3, arg2, arg6);
		if (local11 == null) {
			return;
		}
		local20 = Static619.aClass281_4.method6734(local11.method8326());
		local26 = local11.method8328() & 0x3;
		if (local20.anInt9637 != -1) {
			Static428.method6427(arg0, local26, arg5, arg7, local20);
			return;
		}
	}

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(I)V")
	public static void method8604() {
		Static586.method8086(Static404.aClass2_Sub13_2.aClass33_Sub16_1.method5227());
		@Pc(20) int local20 = (Static53.anInt1153 >> 12) + (Static451.anInt7933 >> 3);
		Static16.anInt308 = Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.aByte124 = 0;
		@Pc(34) int local34 = (Static395.anInt3530 >> 12) + (Static470.anInt8063 >> 3);
		Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.method424(8, 8);
		Static501.aByteArrayArray19 = new byte[18][];
		Static502.anIntArray283 = new int[18];
		Static564.anIntArrayArray73 = new int[18][4];
		Static478.aByteArrayArray18 = new byte[18][];
		Static349.anIntArray395 = new int[18];
		Static350.anIntArray421 = new int[18];
		Static516.anIntArray595 = new int[18];
		Static19.aByteArrayArray10 = new byte[18][];
		Static440.anIntArray533 = new int[18];
		Static501.aByteArrayArray20 = new byte[18][];
		Static633.anIntArray729 = new int[18];
		Static237.aByteArrayArray12 = new byte[18][];
		@Pc(80) int local80 = 0;
		@Pc(98) int local98;
		for (@Pc(88) int local88 = (local20 - (Static3.anInt46 >> 4)) / 8; local88 <= (local20 + (Static3.anInt46 >> 4)) / 8; local88++) {
			for (local98 = (local34 - (Static270.anInt5194 >> 4)) / 8; local98 <= (local34 + (Static270.anInt5194 >> 4)) / 8; local98++) {
				@Pc(106) int local106 = (local88 << 8) + local98;
				Static349.anIntArray395[local80] = local106;
				Static633.anIntArray729[local80] = Static48.aClass97_6.method2574("m" + local88 + "_" + local98);
				Static516.anIntArray595[local80] = Static48.aClass97_6.method2574("l" + local88 + "_" + local98);
				Static350.anIntArray421[local80] = Static48.aClass97_6.method2574("n" + local88 + "_" + local98);
				Static440.anIntArray533[local80] = Static48.aClass97_6.method2574("um" + local88 + "_" + local98);
				Static502.anIntArray283[local80] = Static48.aClass97_6.method2574("ul" + local88 + "_" + local98);
				if (Static350.anIntArray421[local80] == -1) {
					Static633.anIntArray729[local80] = -1;
					Static516.anIntArray595[local80] = -1;
					Static440.anIntArray533[local80] = -1;
					Static502.anIntArray283[local80] = -1;
				}
				local80++;
			}
		}
		for (local98 = local80; local98 < Static350.anIntArray421.length; local98++) {
			Static350.anIntArray421[local98] = -1;
			Static633.anIntArray729[local98] = -1;
			Static516.anIntArray595[local98] = -1;
			Static440.anIntArray533[local98] = -1;
			Static502.anIntArray283[local98] = -1;
		}
		@Pc(283) byte local283;
		if (Static538.anInt8985 == 3) {
			local283 = 4;
		} else {
			local283 = 8;
		}
		Static516.method7251(false, local20, local283, local34);
	}
}
