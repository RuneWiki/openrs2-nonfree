import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static507 {

	@OriginalMember(owner = "client!po", name = "i", descriptor = "I")
	public static int anInt8070;

	// $FF: synthetic field
	@OriginalMember(owner = "client!po", name = "a", descriptor = "Ljava/lang/Class;")
	private static Class aClass22;

	// $FF: synthetic field
	@OriginalMember(owner = "client!po", name = "k", descriptor = "Ljava/lang/Class;")
	private static Class aClass23;

	@OriginalMember(owner = "client!po", name = "b", descriptor = "Lclient!sla;")
	public static final Class344 aClass344_11 = new Class344(7, -1);

	@OriginalMember(owner = "client!po", name = "e", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_135 = new Class397(112, 6);

	@OriginalMember(owner = "client!po", name = "l", descriptor = "I")
	public static int anInt8071 = 0;

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(IB)I")
	public static int method6896(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!po", name = "b", descriptor = "(IIB)Z")
	public static boolean method6897(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static66.method1493(arg1, arg0) & Static289.method4043(arg0, arg1);
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(IIB)Z")
	public static boolean method6898(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class247 local8 = Static216.aClass53_3.method1523(arg1);
		if (arg0 == 11) {
			arg0 = 10;
		}
		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}
		return local8.method5429(arg0);
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(ZLclient!ika;)Lclient!en;")
	public static Class3_Sub1 method6899(@OriginalArg(1) Class3_Sub2 arg0) {
		arg0.method2048(255);
		@Pc(13) int local13 = arg0.method2048(255);
		@Pc(17) Class3_Sub1 local17 = Static403.method5431(local13);
		local17.anInt11242 = arg0.method2048(255);
		@Pc(26) int local26 = arg0.method2048(255);
		for (@Pc(28) int local28 = 0; local28 < local26; local28++) {
			@Pc(36) int local36 = arg0.method2048(255);
			local17.method9582(local36, arg0);
		}
		local17.method9578();
		if (false) {
			method6905(112, 88);
		}
		return local17;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(Lclient!mga;Z)Z")
	public static boolean method6900(@OriginalArg(0) Class9_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(7) boolean local7 = Static477.aClass259Array3 == Static378.aClass259Array2;
		@Pc(9) int local9 = 0;
		@Pc(11) short local11 = 0;
		@Pc(13) byte local13 = 0;
		arg0.method9097();
		if (arg0.aShort123 < 0 || arg0.aShort120 < 0 || arg0.aShort122 >= Static128.anInt2531 || arg0.aShort121 >= Static448.anInt6835) {
			return false;
		}
		@Pc(41) short local41 = 0;
		@Pc(48) int local48;
		for (@Pc(44) int local44 = arg0.aShort123; local44 <= arg0.aShort122; local44++) {
			for (local48 = arg0.aShort120; local48 <= arg0.aShort121; local48++) {
				@Pc(55) Class364 local55 = Static309.method4578(arg0.aByte139, local44, local48);
				if (local55 != null) {
					@Pc(61) Class181 local61 = Static23.method657(arg0);
					@Pc(64) Class181 local64 = local55.aClass181_3;
					if (local64 == null) {
						local55.aClass181_3 = local61;
					} else {
						while (local64.aClass181_2 != null) {
							local64 = local64.aClass181_2;
						}
						local64.aClass181_2 = local61;
					}
					if (local7 && (Static723.anIntArrayArray72[local44][local48] & 0xFF000000) != 0) {
						local9 = Static723.anIntArrayArray72[local44][local48];
						local11 = Static329.aShortArrayArray2[local44][local48];
						local13 = Static393.aByteArrayArray8[local44][local48];
					}
					if (!arg1 && local55.aClass9_Sub1_Sub4_1 != null && local55.aClass9_Sub1_Sub4_1.aShort97 > local41) {
						local41 = local55.aClass9_Sub1_Sub4_1.aShort97;
					}
				}
			}
		}
		if (local7 && (local9 & 0xFF000000) != 0) {
			for (local48 = arg0.aShort123; local48 <= arg0.aShort122; local48++) {
				for (@Pc(159) int local159 = arg0.aShort120; local159 <= arg0.aShort121; local159++) {
					if ((Static723.anIntArrayArray72[local48][local159] & 0xFF000000) == 0) {
						Static723.anIntArrayArray72[local48][local159] = local9;
						Static329.aShortArrayArray2[local48][local159] = local11;
						Static393.aByteArrayArray8[local48][local159] = local13;
					}
				}
			}
		}
		if (arg1) {
			Static656.aClass9_Sub1_Sub1Array1[Static101.anInt2152++] = arg0;
		} else {
			local48 = Static477.aClass259Array3 == Static378.aClass259Array2 ? 1 : 0;
			if (!arg0.method9093()) {
				arg0.aClass9_Sub1_24 = Static52.aClass9_Sub1Array1[local48];
				Static52.aClass9_Sub1Array1[local48] = arg0;
			} else if (arg0.method9084()) {
				arg0.aClass9_Sub1_24 = Static120.aClass9_Sub1Array2[local48];
				Static120.aClass9_Sub1Array2[local48] = arg0;
			} else {
				arg0.aClass9_Sub1_24 = Static356.aClass9_Sub1Array4[local48];
				Static356.aClass9_Sub1Array4[local48] = arg0;
				Static632.aBoolean653 = true;
			}
		}
		if (arg1) {
			arg0.anInt10690 -= local41;
		}
		return true;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(Lclient!gs;Lclient!eca;I)Lclient!id;")
	public static Class3_Sub29 method6901(@OriginalArg(0) Class144 arg0, @OriginalArg(1) Class88 arg1) {
		@Pc(8) Class3_Sub29 local8 = Static426.method5676();
		local8.anInt4152 = arg0.anInt3624;
		local8.aClass144_44 = arg0;
		if (local8.anInt4152 == -1) {
			local8.aClass3_Sub2_Sub1_1 = new Class3_Sub2_Sub1(260);
		} else if (local8.anInt4152 == -2) {
			local8.aClass3_Sub2_Sub1_1 = new Class3_Sub2_Sub1(10000);
		} else if (local8.anInt4152 <= 18) {
			local8.aClass3_Sub2_Sub1_1 = new Class3_Sub2_Sub1(20);
		} else if (local8.anInt4152 <= 98) {
			local8.aClass3_Sub2_Sub1_1 = new Class3_Sub2_Sub1(100);
		} else {
			local8.aClass3_Sub2_Sub1_1 = new Class3_Sub2_Sub1(260);
		}
		local8.aClass3_Sub2_Sub1_1.method221(arg1);
		local8.aClass3_Sub2_Sub1_1.method220(local8.aClass144_44.method3286());
		local8.anInt4151 = 0;
		return local8;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(I)V")
	public static synchronized void method6903() {
		if (Static276.anObject9 != null) {
			return;
		}
		try {
			@Pc(20) Class local20 = Class.forName("java.lang.management.ManagementFactory");
			@Pc(27) Method local27 = local20.getDeclaredMethod("getPlatformMBeanServer", (Class[]) null);
			@Pc(32) Object local32 = local27.invoke((Object) null, (Object[]) null);
			@Pc(75) Method local75 = local20.getMethod("newPlatformMXBeanProxy", Class.forName("javax.management.MBeanServerConnection"), aClass22 == null ? (aClass22 = Class294.a("java.lang.String")) : aClass22, aClass23 == null ? (aClass23 = Class294.a("java.lang.Class")) : aClass23);
			Static276.anObject9 = local75.invoke((Object) null, local32, "com.sun.management:type=HotSpotDiagnostic", Class.forName("com.sun.management.HotSpotDiagnosticMXBean"));
		} catch (@Pc(100) Exception local100) {
			System.out.println("HeapDump setup error:");
			local100.printStackTrace();
		}
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(BII)I")
	public static int method6904(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 1;
		while (arg0 > 1) {
			if ((arg0 & 0x1) != 0) {
				local7 *= arg1;
			}
			arg0 >>= 0x1;
			arg1 *= arg1;
		}
		if (-9 != -9) {
			return 58;
		} else if (arg0 == 1) {
			return arg1 * local7;
		} else {
			return local7;
		}
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(II)V")
	public static void method6905(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static531.anInt8269 = -1;
		if (arg0 >= -33) {
			return;
		}
		if (arg1 == 37) {
			Static327.aFloat31 = 3.0F;
		} else if (arg1 == 50) {
			Static327.aFloat31 = 4.0F;
		} else if (arg1 == 75) {
			Static327.aFloat31 = 6.0F;
		} else if (arg1 == 100) {
			Static327.aFloat31 = 8.0F;
		} else if (arg1 == 200) {
			Static327.aFloat31 = 16.0F;
		}
		Static531.anInt8269 = -1;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(ILclient!id;)[I")
	public static int[] method6906(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub29 arg1) {
		@Pc(10) Class3_Sub2 local10 = new Class3_Sub2(518);
		@Pc(13) int[] local13 = new int[4];
		for (@Pc(15) int local15 = 0; local15 < 4; local15++) {
			local13[local15] = (int) (Math.random() * 9.9999999E7D);
		}
		local10.method2065(10);
		local10.method2018(local13[0]);
		local10.method2018(local13[1]);
		local10.method2018(local13[2]);
		if (arg0 <= 12) {
			method6903();
		}
		local10.method2018(local13[3]);
		for (@Pc(71) int local71 = 0; local71 < 10; local71++) {
			local10.method2018((int) (Math.random() * 9.9999999E7D));
		}
		local10.method2032((int) (Math.random() * 9.9999999E7D));
		local10.method2040(Static242.aBigInteger3, Static473.aBigInteger5);
		arg1.aClass3_Sub2_Sub1_1.method2068(0, local10.anInt2178, local10.aByteArray20);
		return local13;
	}
}
