import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static381 {

	@OriginalMember(owner = "client!ns", name = "c", descriptor = "Lclient!mu;")
	public static final Class215 aClass215_151 = new Class215(84, 7);

	@OriginalMember(owner = "client!ns", name = "d", descriptor = "Z")
	public static boolean aBoolean540 = false;

	@OriginalMember(owner = "client!ns", name = "f", descriptor = "Lclient!mu;")
	public static final Class215 aClass215_152 = new Class215(20, -2);

	@OriginalMember(owner = "client!ns", name = "g", descriptor = "[[B")
	public static final byte[][] aByteArrayArray18 = new byte[250][];

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "(I)V")
	public static void method6295() {
		Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub7_1, 1);
		Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub7_2, 1);
		Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub21_1, 2);
		Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.lb, 2);
		Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub12_1, 1);
		Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub17_1, 1);
		Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub20_1, 1);
		Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub1_1, 1);
		Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub28_1, 1);
		Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub4_1, 1);
		Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub15_1, 2);
		Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub8_1, 1);
		Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub25_1, 2);
		Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub23_1, 1);
		Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub27_1, 0);
		Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub27_2, 0);
		Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub22_1, 2);
		Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub14_1, 0);
		Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub2_1, 0);
		Static524.method8703();
		Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub3_1, 0);
		Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub9_1, 4);
		Static538.method9146();
		Static305.method5400();
		Static291.aBoolean463 = true;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(Lclient!ua;IIILclient!ke;)V")
	public static void method6296(@OriginalArg(0) Class2_Sub11_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class3_Sub1_Sub3_Sub3_Sub2 arg3) {
		@Pc(11) byte local11 = -1;
		@Pc(22) int local22;
		if ((arg2 & 0x1) != 0) {
			local22 = arg0.method8326();
			if (local22 == 65535) {
				local22 = -1;
			}
			arg3.anInt6070 = local22;
		}
		@Pc(46) int[] local46;
		@Pc(49) int[] local49;
		@Pc(51) int local51;
		@Pc(57) int local57;
		@Pc(68) int local68;
		if ((arg2 & 0x10000) != 0) {
			local22 = arg0.method8383();
			local46 = new int[local22];
			local49 = new int[local22];
			for (local51 = 0; local51 < local22; local51++) {
				local57 = arg0.method8354();
				if ((local57 & 0xC000) == 49152) {
					local68 = arg0.method8369();
					local46[local51] = local57 << 16 | local68;
				} else {
					local46[local51] = local57;
				}
				local49[local51] = arg0.method8369();
			}
			arg3.method5208(local49, local46);
		}
		if ((arg2 & 0x400) != 0) {
			local22 = arg0.method8369();
			arg3.anInt6033 = arg0.method8338();
			arg3.anInt6066 = arg0.method8338();
			arg3.anInt6023 = local22 & 0x7FFF;
			arg3.aBoolean452 = (local22 & 0x8000) != 0;
			arg3.anInt6080 = arg3.anInt6023 + Static407.anInt7704 + arg3.anInt6033;
		}
		if ((arg2 & 0x1000) != 0) {
			arg3.aString62 = arg0.method8373();
			if (arg3.aString62.charAt(0) == '~') {
				arg3.aString62 = arg3.aString62.substring(1);
				Static101.method2658(arg3.method5220(), 2, 0, arg3.aString62, arg3.method5226(), arg3.aString63);
			} else if (Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2 == arg3) {
				Static101.method2658(arg3.method5220(), 2, 0, arg3.aString62, arg3.method5226(), arg3.aString63);
			}
			arg3.anInt6061 = 150;
			arg3.anInt6039 = 0;
			arg3.anInt6017 = 0;
		}
		@Pc(226) int local226;
		@Pc(236) int local236;
		if ((arg2 & 0x4) != 0) {
			local22 = arg0.method8325();
			if (local22 > 0) {
				for (local226 = 0; local226 < local22; local226++) {
					local51 = -1;
					local57 = -1;
					local236 = arg0.method8378();
					local68 = -1;
					if (local236 == 32767) {
						local236 = arg0.method8378();
						local57 = arg0.method8378();
						local51 = arg0.method8378();
						local68 = arg0.method8378();
					} else if (local236 == 32766) {
						local236 = -1;
					} else {
						local57 = arg0.method8378();
					}
					@Pc(276) int local276 = arg0.method8378();
					@Pc(280) int local280 = arg0.method8389();
					arg3.method5216(local57, Static407.anInt7704, local236, local68, local51, local276, local280);
				}
			}
		}
		if ((arg2 & 0x2) != 0) {
			arg3.anInt6112 = arg0.method8326();
			if (arg3.anInt6102 == 0) {
				arg3.method5218(arg3.anInt6112);
				arg3.anInt6112 = -1;
			}
		}
		if ((arg2 & 0x8000) != 0) {
			arg3.aBoolean461 = arg0.method8389() == 1;
		}
		if ((arg2 & 0x100) != 0) {
			local22 = arg0.method8325();
			local46 = new int[local22];
			local49 = new int[local22];
			@Pc(351) int[] local351 = new int[local22];
			for (local57 = 0; local57 < local22; local57++) {
				local68 = arg0.method8326();
				if (local68 == 65535) {
					local68 = -1;
				}
				local46[local57] = local68;
				local49[local57] = arg0.method8325();
				local351[local57] = arg0.method8326();
			}
			Static425.method6834(arg3, local351, local46, local49);
		}
		if ((arg2 & 0x2000) != 0) {
			arg3.anInt6085 = arg0.method8384();
			arg3.anInt6101 = arg0.method8341();
			arg3.anInt6044 = arg0.method8357();
			arg3.anInt6081 = arg0.method8357();
			arg3.anInt6042 = arg0.method8354() + Static407.anInt7704;
			arg3.anInt6091 = arg0.method8351() + Static407.anInt7704;
			arg3.anInt6036 = arg0.method8383();
			arg3.anInt6103 = 0;
			if (arg3.aBoolean459) {
				arg3.anInt6081 += arg3.anInt6119;
				arg3.anInt6085 += arg3.anInt6132;
				arg3.anInt6101 += arg3.anInt6119;
				arg3.anInt6044 += arg3.anInt6132;
				arg3.anInt6102 = 0;
			} else {
				arg3.anInt6044 += arg3.anIntArray358[0];
				arg3.anInt6081 += arg3.anIntArray357[0];
				arg3.anInt6102 = 1;
				arg3.anInt6101 += arg3.anIntArray357[0];
				arg3.anInt6085 += arg3.anIntArray358[0];
			}
		}
		if ((arg2 & 0x200) != 0) {
			local22 = arg0.method8354();
			if (local22 == 65535) {
				local22 = -1;
			}
			local226 = arg0.method8360();
			local236 = arg0.method8338();
			local51 = local236 & 0x7;
			local57 = local236 >> 3 & 0xF;
			if (local57 == 15) {
				local57 = -1;
			}
			arg3.method5215(local51, local22, local57, true, local226);
		}
		if ((arg2 & 0x40000) != 0) {
			arg3.aByte96 = arg0.method8357();
			arg3.aByte94 = arg0.method8384();
			arg3.aByte97 = arg0.method8384();
			arg3.aByte98 = (byte) arg0.method8383();
			arg3.anInt6049 = Static407.anInt7704 + arg0.method8354();
			arg3.anInt6051 = Static407.anInt7704 + arg0.method8351();
		}
		if ((arg2 & 0x80) != 0) {
			Static566.aByteArray130[arg1] = arg0.method8341();
		}
		if ((arg2 & 0x20) != 0) {
			local22 = arg0.method8354();
			if (local22 == 65535) {
				local22 = -1;
			}
			local226 = arg0.method8342();
			local236 = arg0.method8389();
			local51 = local236 & 0x7;
			local57 = local236 >> 3 & 0xF;
			if (local57 == 15) {
				local57 = -1;
			}
			arg3.method5215(local51, local22, local57, false, local226);
		}
		if ((arg2 & 0x8) != 0) {
			@Pc(675) int[] local675 = new int[4];
			for (local226 = 0; local226 < 4; local226++) {
				local675[local226] = arg0.method8351();
				if (local675[local226] == 65535) {
					local675[local226] = -1;
				}
			}
			local236 = arg0.method8389();
			Static506.method7810(local675, local236, arg3);
		}
		if ((arg2 & 0x10) != 0) {
			local22 = arg0.method8383();
			@Pc(725) byte[] local725 = new byte[local22];
			@Pc(730) Class2_Sub11 local730 = new Class2_Sub11(local725);
			arg0.method8343(local725, local22);
			Static405.aClass2_Sub11Array1[arg1] = local730;
			arg3.method5222(local730);
		}
		if ((arg2 & 0x800) != 0) {
			local11 = arg0.method8357();
		}
		if (!arg3.aBoolean459) {
			return;
		}
		if (local11 == 127) {
			arg3.method5219(arg3.anInt6119, arg3.anInt6132);
			return;
		}
		@Pc(763) byte local763;
		if (local11 == -1) {
			local763 = Static566.aByteArray130[arg1];
		} else {
			local763 = local11;
		}
		Static83.method2401(arg3, local763);
		arg3.method5225(arg3.anInt6119, local763, arg3.anInt6132);
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(B)V")
	public static synchronized void method6297() {
		if (Static50.anObject8 != null) {
			return;
		}
		try {
			@Pc(9) Class local9 = Class.forName("java.lang.management.ManagementFactory");
			@Pc(14) Method local14 = local9.getDeclaredMethod("getPlatformMBeanServer", null);
			@Pc(19) Object local19 = local14.invoke(null, (Object[]) null);
			@Pc(56) Method local56 = local9.getMethod("newPlatformMXBeanProxy", Class.forName("javax.management.MBeanServerConnection"), String.class, Class.class);
			Static50.anObject8 = local56.invoke(null, local19, "com.sun.management:type=HotSpotDiagnostic", Class.forName("com.sun.management.HotSpotDiagnosticMXBean"));
		} catch (@Pc(77) Exception local77) {
			System.out.println("HeapDump setup error:");
			local77.printStackTrace();
		}
	}
}
