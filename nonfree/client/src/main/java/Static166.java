import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!fg", name = "b", descriptor = "Ljava/lang/Class;")
	private static Class aClass8;

	// $FF: synthetic field
	@OriginalMember(owner = "client!fg", name = "d", descriptor = "Ljava/lang/Class;")
	private static Class aClass9;

	@OriginalMember(owner = "client!fg", name = "f", descriptor = "[I")
	public static final int[] anIntArray148 = new int[5];

	@OriginalMember(owner = "client!fg", name = "g", descriptor = "[I")
	public static final int[] anIntArray149 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lclient!ic;ILclient!ub;II)V")
	public static void method2389(@OriginalArg(0) Class8_Sub1_Sub3_Sub2_Sub1 arg0, @OriginalArg(2) Class5_Sub23_Sub2 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) byte local7 = -1;
		@Pc(18) int local18;
		if ((arg2 & 0x100) != 0) {
			local18 = arg1.method8506();
			arg0.anInt7034 = arg1.method8505();
			arg0.anInt7007 = arg1.method8529();
			arg0.aBoolean542 = (local18 & 0x8000) != 0;
			arg0.anInt6985 = local18 & 0x7FFF;
			arg0.anInt6983 = arg0.anInt7034 + Static44.anInt740 + arg0.anInt6985;
		}
		if ((arg2 & 0x1000) != 0) {
			local7 = arg1.method8521();
		}
		if ((arg2 & 0x200) != 0) {
			arg0.anInt7025 = arg1.method8508();
			arg0.anInt6982 = arg1.method8536();
			arg0.anInt7003 = arg1.method8508();
			arg0.anInt7001 = arg1.method8488();
			arg0.anInt7032 = arg1.method8519() + Static44.anInt740;
			arg0.anInt7037 = arg1.method8515() + Static44.anInt740;
			arg0.anInt7036 = arg1.method8500();
			arg0.anInt7049 = 0;
			if (arg0.aBoolean329) {
				arg0.anInt7025 += arg0.anInt4187;
				arg0.anInt7003 += arg0.anInt4187;
				arg0.anInt6982 += arg0.anInt4214;
				arg0.anInt7050 = 0;
				arg0.anInt7001 += arg0.anInt4214;
			} else {
				arg0.anInt7025 += arg0.anIntArray414[0];
				arg0.anInt6982 += arg0.anIntArray415[0];
				arg0.anInt7050 = 1;
				arg0.anInt7003 += arg0.anIntArray414[0];
				arg0.anInt7001 += arg0.anIntArray415[0];
			}
		}
		if ((arg2 & 0x800) != 0) {
			arg0.aBoolean328 = arg1.method8505() == 1;
		}
		if ((arg2 & 0x1) != 0) {
			arg0.anInt4199 = arg1.method8518();
			if (arg0.anInt7050 == 0) {
				arg0.method5989(arg0.anInt4199);
				arg0.anInt4199 = -1;
			}
		}
		@Pc(261) int local261;
		@Pc(275) int local275;
		@Pc(265) int local265;
		@Pc(267) int local267;
		@Pc(269) int local269;
		if ((arg2 & 0x20) != 0) {
			local18 = arg1.method8529();
			if (local18 > 0) {
				for (local261 = 0; local261 < local18; local261++) {
					local265 = -1;
					local267 = -1;
					local269 = -1;
					local275 = arg1.method8499();
					if (local275 == 32767) {
						local275 = arg1.method8499();
						local267 = arg1.method8499();
						local265 = arg1.method8499();
						local269 = arg1.method8499();
					} else if (local275 == 32766) {
						local275 = -1;
					} else {
						local267 = arg1.method8499();
					}
					@Pc(315) int local315 = arg1.method8499();
					@Pc(319) int local319 = arg1.method8483();
					arg0.method6001(local267, local315, local319, local269, local265, local275, Static44.anInt740);
				}
			}
		}
		if ((arg2 & 0x10) != 0) {
			Static10.aByteArray1[arg3] = arg1.method8521();
		}
		if ((arg2 & 0x80) != 0) {
			local18 = arg1.method8506();
			if (local18 == 65535) {
				local18 = -1;
			}
			local261 = arg1.method8527();
			local275 = arg1.method8529();
			local265 = local275 & 0x7;
			local267 = local275 >> 3 & 0xF;
			if (local267 == 15) {
				local267 = -1;
			}
			arg0.method5999(local18, local267, local265, 0, local261);
		}
		@Pc(418) int[] local418;
		@Pc(421) int[] local421;
		if ((arg2 & 0x4000) != 0) {
			local18 = arg1.method8505();
			local418 = new int[local18];
			local421 = new int[local18];
			@Pc(424) int[] local424 = new int[local18];
			for (local267 = 0; local267 < local18; local267++) {
				local269 = arg1.method8519();
				if (local269 == 65535) {
					local269 = -1;
				}
				local418[local267] = local269;
				local421[local267] = arg1.method8529();
				local424[local267] = arg1.method8506();
			}
			Static569.method8191(arg0, local418, local421, local424);
		}
		if ((arg2 & 0x8000) != 0) {
			local18 = arg1.method8519();
			if (local18 == 65535) {
				local18 = -1;
			}
			local261 = arg1.method8523();
			local275 = arg1.method8500();
			local265 = local275 & 0x7;
			local267 = local275 >> 3 & 0xF;
			if (local267 == 15) {
				local267 = -1;
			}
			arg0.method5999(local18, local267, local265, 1, local261);
		}
		if ((arg2 & 0x400) != 0) {
			arg0.aString92 = arg1.method8497();
			if (arg0.aString92.charAt(0) == '~') {
				arg0.aString92 = arg0.aString92.substring(1);
				Static177.method2584(arg0.method3599(), arg0.aString92, arg0.aString61, 0, 2, arg0.method3608());
			} else if (Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1 == arg0) {
				Static177.method2584(arg0.method3599(), arg0.aString92, arg0.aString61, 0, 2, arg0.method3608());
			}
			arg0.anInt7015 = 0;
			arg0.anInt6990 = 0;
			arg0.anInt7022 = 150;
		}
		if ((arg2 & 0x20000) != 0) {
			arg0.aByte120 = arg1.method8508();
			arg0.aByte121 = arg1.method8508();
			arg0.aByte119 = arg1.method8521();
			arg0.aByte118 = (byte) arg1.method8483();
			arg0.anInt7013 = Static44.anInt740 + arg1.method8515();
			arg0.anInt7029 = Static44.anInt740 + arg1.method8506();
		}
		if ((arg2 & 0x80000) != 0) {
			local18 = arg1.method8500();
			local418 = new int[local18];
			local421 = new int[local18];
			for (local265 = 0; local265 < local18; local265++) {
				local267 = arg1.method8519();
				if ((local267 & 0xC000) == 49152) {
					local269 = arg1.method8519();
					local418[local265] = local267 << 16 | local269;
				} else {
					local418[local265] = local267;
				}
				local421[local265] = arg1.method8519();
			}
			arg0.method5988(101, local421, local418);
		}
		if ((arg2 & 0x2) != 0) {
			local18 = arg1.method8529();
			@Pc(733) byte[] local733 = new byte[local18];
			@Pc(738) Class5_Sub23 local738 = new Class5_Sub23(local733);
			arg1.method8477(local733, local18);
			Static526.aClass5_Sub23Array1[arg3] = local738;
			arg0.method3604(local738);
		}
		if ((arg2 & 0x8) != 0) {
			@Pc(759) int[] local759 = new int[4];
			for (local261 = 0; local261 < 4; local261++) {
				local759[local261] = arg1.method8515();
				if (local759[local261] == 65535) {
					local759[local261] = -1;
				}
			}
			local275 = arg1.method8483();
			Static16.method289(arg0, local275, local759);
		}
		if ((arg2 & 0x40000) != 0) {
			arg0.aBoolean325 = arg1.method8529() == 1;
		}
		if ((arg2 & 0x10000) != 0) {
			local18 = arg1.method8515();
			local261 = arg1.method8523();
			if (local18 == 65535) {
				local18 = -1;
			}
			local275 = arg1.method8483();
			local265 = local275 & 0x7;
			local267 = local275 >> 3 & 0xF;
			if (local267 == 15) {
				local267 = -1;
			}
			arg0.method5999(local18, local267, local265, 2, local261);
		}
		if ((arg2 & 0x40) != 0) {
			local18 = arg1.method8515();
			if (local18 == 65535) {
				local18 = -1;
			}
			arg0.anInt7041 = local18;
		}
		if (!arg0.aBoolean329) {
			return;
		}
		if (local7 == 127) {
			arg0.method3606(arg0.anInt4187, arg0.anInt4214);
			return;
		}
		@Pc(911) byte local911;
		if (local7 == -1) {
			local911 = Static10.aByteArray1[arg3];
		} else {
			local911 = local7;
		}
		Static28.method7935(arg0, local911);
		arg0.method3601(local911, arg0.anInt4214, arg0.anInt4187);
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;ZLclient!mca;Z)V")
	public static void method2390(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) String arg2, @OriginalArg(4) Class230 arg3, @OriginalArg(5) boolean arg4) {
		if (!arg1) {
			Static76.method1197(arg3, 3, arg0);
			return;
		}
		@Pc(38) String local38;
		if (Static359.aString85.startsWith("win") && arg3.aBoolean471) {
			local38 = null;
			if (Static492.anApplet2 != null) {
				local38 = Static492.anApplet2.getParameter("haveie6");
			}
			if (local38 == null || !local38.equals("1")) {
				@Pc(60) Class366 local60 = Static76.method1197(arg3, 0, arg0);
				Static677.aClass230_6 = arg3;
				Static123.aClass366_1 = local60;
				Static208.aString118 = arg0;
				return;
			}
		}
		if (Static359.aString85.startsWith("mac")) {
			local38 = null;
			if (Static492.anApplet2 != null) {
				local38 = Static492.anApplet2.getParameter("havefirefox");
			}
			if (local38 != null && local38.equals("1") && arg4) {
				Static606.method8454(arg0, arg3, 1, arg2);
				return;
			}
		}
		Static76.method1197(arg3, 2, arg0);
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)V")
	public static synchronized void method2391() {
		if (Static25.anObject1 != null) {
			return;
		}
		try {
			@Pc(19) Class local19 = Class.forName("java.lang.management.ManagementFactory");
			@Pc(26) Method local26 = local19.getDeclaredMethod("getPlatformMBeanServer", (Class[]) null);
			@Pc(31) Object local31 = local26.invoke((Object) null, (Object[]) null);
			@Pc(74) Method local74 = local19.getMethod("newPlatformMXBeanProxy", Class.forName("javax.management.MBeanServerConnection"), aClass8 == null ? (aClass8 = Class124.a("java.lang.String")) : aClass8, aClass9 == null ? (aClass9 = Class124.a("java.lang.Class")) : aClass9);
			Static25.anObject1 = local74.invoke((Object) null, local31, "com.sun.management:type=HotSpotDiagnostic", Class.forName("com.sun.management.HotSpotDiagnosticMXBean"));
		} catch (@Pc(99) Exception local99) {
			System.out.println("HeapDump setup error:");
			local99.printStackTrace();
		}
	}
}
