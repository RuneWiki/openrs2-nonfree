import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static233 {

	@OriginalMember(owner = "client!hq", name = "l", descriptor = "I")
	public static int anInt4655;

	@OriginalMember(owner = "client!hq", name = "n", descriptor = "Lclient!gga;")
	public static Class124 aClass124_52;

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "I")
	public static int anInt4648 = -1;

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IBII)V")
	public static void method4203(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == 1011) {
			Static518.method8030(Static194.aClass340_7, arg1, arg2);
		} else if (arg0 == 1003) {
			Static518.method8030(Static561.aClass340_11, arg1, arg2);
		} else if (arg0 == 1012) {
			Static518.method8030(Static472.aClass340_10, arg1, arg2);
		} else if (arg0 == 1004) {
			Static518.method8030(Static639.aClass340_13, arg1, arg2);
		} else if (arg0 == 1010) {
			Static518.method8030(Static603.aClass340_12, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(ILjava/io/File;I)[B")
	public static byte[] method4205(@OriginalArg(0) int arg0, @OriginalArg(1) File arg1) {
		try {
			@Pc(11) byte[] local11 = new byte[arg0];
			Static588.method8874(local11, arg0, arg1);
			return local11;
		} catch (@Pc(19) IOException local19) {
			return null;
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(B)V")
	public static void method4206() {
		Static2.method58(Static230.aClass2_Sub54_15.aClass4_Sub13_1.method3956() == 1);
		Static451.aClass34_2 = Static102.method1768(22050, 0, Static96.aClass48_5, Static641.aCanvas13);
		Static640.method9476(Static198.method3806((Class2_Sub26_Sub3) null));
		Static330.aClass34_1 = Static102.method1768(2048, 1, Static96.aClass48_5, Static641.aCanvas13);
		Static270.aClass2_Sub26_Sub4_2 = new Class2_Sub26_Sub4();
		Static330.aClass34_1.method6325(Static270.aClass2_Sub26_Sub4_2);
		Static471.aClass269_2 = new Class269(22050, Static237.anInt4718);
		Static451.method7283();
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(Z)V")
	public static void method4207() {
		Static200.anInt4201 = Static648.aClass324_12.anInt9271 + Static648.aClass324_12.anInt9272 + 2;
		Static494.anInt8820 = Static455.aClass324_11.anInt9272 + Static455.aClass324_11.anInt9271 + 2;
		Static244.aStringArray82 = new String[500];
		for (@Pc(29) int local29 = 0; local29 < Static244.aStringArray82.length; local29++) {
			Static244.aStringArray82[local29] = "";
		}
		Static455.method7295(Static205.aClass134_1.method3906(Static204.anInt8130));
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IIZILclient!uf;)V")
	public static void method4208(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) Class357 arg3) {
		@Pc(8) int local8 = arg3.anInt10395;
		if (arg3.aByte136 == 0) {
			arg3.anInt10395 = arg3.anInt10417;
		} else if (arg3.aByte136 == 1) {
			arg3.anInt10395 = arg0 - arg3.anInt10417;
		} else if (arg3.aByte136 == 2) {
			arg3.anInt10395 = arg0 * arg3.anInt10417 >> 14;
		}
		@Pc(49) int local49 = arg3.anInt10465;
		if (arg3.aByte137 == 0) {
			arg3.anInt10465 = arg3.anInt10486;
		} else if (arg3.aByte137 == 1) {
			arg3.anInt10465 = arg1 - arg3.anInt10486;
		} else if (arg3.aByte137 == 2) {
			arg3.anInt10465 = arg1 * arg3.anInt10486 >> 14;
		}
		if (arg3.aByte136 == 4) {
			arg3.anInt10395 = arg3.anInt10401 * arg3.anInt10465 / arg3.anInt10463;
		}
		if (arg3.aByte137 == 4) {
			arg3.anInt10465 = arg3.anInt10395 * arg3.anInt10463 / arg3.anInt10401;
		}
		if (Static214.aBoolean351 && (Static85.method1469(arg3).anInt1168 != 0 || arg3.anInt10430 == 0)) {
			if (arg3.anInt10465 < 5 && arg3.anInt10395 < 5) {
				arg3.anInt10465 = 5;
				arg3.anInt10395 = 5;
			} else {
				if (arg3.anInt10395 <= 0) {
					arg3.anInt10395 = 5;
				}
				if (arg3.anInt10465 <= 0) {
					arg3.anInt10465 = 5;
				}
			}
		}
		if (arg3.anInt10454 == Static496.anInt8843) {
			Static615.aClass357_163 = arg3;
		}
		if (arg2 && arg3.anObjectArray9 != null && (local8 != arg3.anInt10395 || local49 != arg3.anInt10465)) {
			@Pc(185) Class2_Sub45 local185 = new Class2_Sub45();
			local185.anObjectArray2 = arg3.anObjectArray9;
			local185.aClass357_131 = arg3;
			Static507.aClass271_51.method7174(local185);
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IBILclient!kja;Lclient!ea;)V")
	public static void method4209(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2_Sub8_Sub2 arg2, @OriginalArg(4) Class15_Sub3_Sub3_Sub1_Sub1 arg3) {
		@Pc(7) byte local7 = -1;
		@Pc(18) int local18;
		@Pc(21) int[] local21;
		@Pc(24) int[] local24;
		@Pc(26) int local26;
		@Pc(32) int local32;
		@Pc(43) int local43;
		if ((arg1 & 0x40000) != 0) {
			local18 = arg2.method5203();
			local21 = new int[local18];
			local24 = new int[local18];
			for (local26 = 0; local26 < local18; local26++) {
				local32 = arg2.method5226();
				if ((local32 & 0xC000) == 49152) {
					local43 = arg2.method5214();
					local21[local26] = local32 << 16 | local43;
				} else {
					local21[local26] = local32;
				}
				local24[local26] = arg2.method5214();
			}
			arg3.method3679(local21, local24);
		}
		if ((arg1 & 0x4000) != 0) {
			arg3.anInt3994 = arg2.method5190();
			arg3.anInt3989 = arg2.method5190();
			arg3.anInt4014 = arg2.method5227();
			arg3.lb = arg2.method5227();
			arg3.anInt4008 = arg2.method5226() + Static62.anInt1184;
			arg3.anInt3982 = arg2.method5211() + Static62.anInt1184;
			arg3.anInt3970 = arg2.method5207();
			arg3.anInt4038 = 0;
			if (arg3.aBoolean174) {
				arg3.anInt4014 += arg3.anInt2375;
				arg3.lb += arg3.anInt2401;
				arg3.anInt3989 += arg3.anInt2401;
				arg3.anInt4039 = 0;
				arg3.anInt3994 += arg3.anInt2375;
			} else {
				arg3.anInt3989 += arg3.anIntArray188[0];
				arg3.anInt4039 = 1;
				arg3.anInt3994 += arg3.anIntArray189[0];
				arg3.lb += arg3.anIntArray188[0];
				arg3.anInt4014 += arg3.anIntArray189[0];
			}
		}
		if ((arg1 & 0x8) != 0) {
			local18 = arg2.method5207();
			@Pc(212) byte[] local212 = new byte[local18];
			@Pc(217) Class2_Sub8 local217 = new Class2_Sub8(local212);
			arg2.method5196(local18, local212);
			Static510.aClass2_Sub8Array1[arg0] = local217;
			arg3.method2225(local217);
		}
		if ((arg1 & 0x80000) != 0) {
			arg3.aByte55 = arg2.method5190();
			arg3.aByte57 = arg2.method5227();
			arg3.aByte56 = arg2.method5165();
			arg3.aByte54 = (byte) arg2.method5207();
			arg3.anInt4003 = Static62.anInt1184 + arg2.method5214();
			arg3.anInt4027 = Static62.anInt1184 + arg2.method5214();
		}
		if ((arg1 & 0x1000) != 0) {
			arg3.aString45 = arg2.method5178();
			if (arg3.aString45.charAt(0) == '~') {
				arg3.aString45 = arg3.aString45.substring(1);
				Static159.method3207(arg3.method2222(), arg3.aString45, 2, arg3.aString30, arg3.method2231(), 0);
			} else if (arg3 == Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2) {
				Static159.method3207(arg3.method2222(), arg3.aString45, 2, arg3.aString30, arg3.method2231(), 0);
			}
			arg3.anInt4002 = 0;
			arg3.anInt4011 = 150;
			arg3.anInt4025 = 0;
		}
		if ((arg1 & 0x100) != 0) {
			local18 = arg2.method5206();
			local21 = new int[local18];
			local24 = new int[local18];
			@Pc(354) int[] local354 = new int[local18];
			for (local32 = 0; local32 < local18; local32++) {
				local43 = arg2.method5222();
				if (local43 == 65535) {
					local43 = -1;
				}
				local21[local32] = local43;
				local24[local32] = arg2.method5206();
				local354[local32] = arg2.method5214();
			}
			Static367.method6218(arg3, local24, local21, local354);
		}
		if ((arg1 & 0x20000) != 0) {
			arg3.aBoolean173 = arg2.method5203() == 1;
		}
		@Pc(429) int local429;
		@Pc(433) int local433;
		if ((arg1 & 0x8000) != 0) {
			local18 = arg2.method5214();
			if (local18 == 65535) {
				local18 = -1;
			}
			local429 = arg2.method5172();
			local433 = arg2.method5207();
			local26 = local433 & 0x7;
			local32 = local433 >> 3 & 0xF;
			if (local32 == 15) {
				local32 = -1;
			}
			arg3.method3692(1, local32, local429, local18, local26);
		}
		if ((arg1 & 0x40) != 0) {
			arg3.anInt2376 = arg2.method5214();
			if (arg3.anInt4039 == 0) {
				arg3.method3681(arg3.anInt2376);
				arg3.anInt2376 = -1;
			}
		}
		if ((arg1 & 0x2000) != 0) {
			local18 = arg2.method5211();
			arg3.anInt4020 = arg2.method5203();
			arg3.anInt4023 = arg2.method5201();
			arg3.aBoolean313 = (local18 & 0x8000) != 0;
			arg3.anInt3992 = local18 & 0x7FFF;
			arg3.anInt4012 = Static62.anInt1184 + arg3.anInt3992 + arg3.anInt4020;
		}
		if ((arg1 & 0x10000) != 0) {
			local18 = arg2.method5226();
			local429 = arg2.method5172();
			if (local18 == 65535) {
				local18 = -1;
			}
			local433 = arg2.method5203();
			local26 = local433 & 0x7;
			local32 = local433 >> 3 & 0xF;
			if (local32 == 15) {
				local32 = -1;
			}
			arg3.method3692(2, local32, local429, local18, local26);
		}
		if ((arg1 & 0x800) != 0) {
			arg3.aBoolean172 = arg2.method5201() == 1;
		}
		if ((arg1 & 0x4) != 0) {
			local18 = arg2.method5201();
			if (local18 > 0) {
				for (local429 = 0; local429 < local18; local429++) {
					local26 = -1;
					local32 = -1;
					local433 = arg2.method5173();
					local43 = -1;
					if (local433 == 32767) {
						local433 = arg2.method5173();
						local32 = arg2.method5173();
						local26 = arg2.method5173();
						local43 = arg2.method5173();
					} else if (local433 == 32766) {
						local433 = -1;
					} else {
						local32 = arg2.method5173();
					}
					@Pc(651) int local651 = arg2.method5173();
					@Pc(655) int local655 = arg2.method5203();
					arg3.method3684(local26, local655, local32, Static62.anInt1184, local433, local651, local43);
				}
			}
		}
		if ((arg1 & 0x10) != 0) {
			@Pc(680) int[] local680 = new int[4];
			for (local429 = 0; local429 < 4; local429++) {
				local680[local429] = arg2.method5222();
				if (local680[local429] == 65535) {
					local680[local429] = -1;
				}
			}
			local433 = arg2.method5201();
			Static106.method1933(local680, local433, arg3);
		}
		if ((arg1 & 0x400) != 0) {
			local7 = arg2.method5165();
		}
		if ((arg1 & 0x2) != 0) {
			local18 = arg2.method5226();
			if (local18 == 65535) {
				local18 = -1;
			}
			arg3.anInt3979 = local18;
		}
		if ((arg1 & 0x1) != 0) {
			local18 = arg2.method5211();
			local429 = arg2.method5223();
			if (local18 == 65535) {
				local18 = -1;
			}
			local433 = arg2.method5206();
			local26 = local433 & 0x7;
			local32 = local433 >> 3 & 0xF;
			if (local32 == 15) {
				local32 = -1;
			}
			arg3.method3692(0, local32, local429, local18, local26);
		}
		if ((arg1 & 0x80) != 0) {
			Static15.aByteArray6[arg0] = arg2.method5175();
		}
		if (!arg3.aBoolean174) {
			return;
		}
		if (local7 == 127) {
			arg3.method2221(arg3.anInt2375, arg3.anInt2401);
			return;
		}
		@Pc(818) byte local818;
		if (local7 == -1) {
			local818 = Static15.aByteArray6[arg0];
		} else {
			local818 = local7;
		}
		Static629.method9337(arg3, local818);
		arg3.method2220(arg3.anInt2401, local818, arg3.anInt2375);
	}
}
