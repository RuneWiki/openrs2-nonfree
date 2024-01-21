import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!pe", name = "r", descriptor = "I")
	public static int anInt2959;

	@OriginalMember(owner = "client!pe", name = "w", descriptor = "Lclient!na;")
	public static Class3_Sub2_Sub3_Sub2 aClass3_Sub2_Sub3_Sub2_4;

	@OriginalMember(owner = "client!pe", name = "B", descriptor = "I")
	public static int anInt2967;

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "Lclient!kb;")
	private static Class46 aClass46_1019 = Static65.method1172("Free world");

	@OriginalMember(owner = "client!pe", name = "g", descriptor = "Lclient!kb;")
	private static Class46 aClass46_1020 = Static65.method1172("Loaded config");

	@OriginalMember(owner = "client!pe", name = "j", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1021 = aClass46_1019;

	@OriginalMember(owner = "client!pe", name = "n", descriptor = "I")
	public static int anInt2956 = 0;

	@OriginalMember(owner = "client!pe", name = "G", descriptor = "Lclient!kb;")
	private static Class46 aClass46_1026 = Static65.method1172("glow3:");

	@OriginalMember(owner = "client!pe", name = "q", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1022 = aClass46_1026;

	@OriginalMember(owner = "client!pe", name = "x", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1023 = Static65.method1172("Anmelde)2Zeitlimit -Uberschritten)3");

	@OriginalMember(owner = "client!pe", name = "y", descriptor = "I")
	public static int anInt2964 = 0;

	@OriginalMember(owner = "client!pe", name = "D", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1024 = aClass46_1020;

	@OriginalMember(owner = "client!pe", name = "E", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1025 = aClass46_1026;

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lclient!rd;IILclient!qd;)V")
	public static void method2111(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class68 arg2) {
		@Pc(9) Class3_Sub6 local9 = new Class3_Sub6();
		local9.anInt612 = arg0.method191();
		local9.anInt608 = arg0.method213();
		local9.anIntArray42 = new int[local9.anInt612];
		local9.aClass14Array1 = new Class14[local9.anInt612];
		local9.anIntArray43 = new int[local9.anInt612];
		local9.aByteArrayArrayArray1 = new byte[local9.anInt612][][];
		local9.anIntArray44 = new int[local9.anInt612];
		local9.aClass14Array2 = new Class14[local9.anInt612];
		for (@Pc(59) int local59 = 0; local59 < local9.anInt612; local59++) {
			try {
				@Pc(65) int local65 = arg0.method191();
				@Pc(94) String local94;
				@Pc(105) String local105;
				@Pc(109) int local109;
				if (local65 == 0 || local65 == 1 || local65 == 2) {
					local94 = new String(arg0.method172().method1349());
					local105 = new String(arg0.method172().method1349());
					local109 = 0;
					if (local65 == 1) {
						local109 = arg0.method213();
					}
					local9.anIntArray42[local59] = local65;
					local9.anIntArray44[local59] = local109;
					local9.aClass14Array2[local59] = arg2.method2196(local105, Static116.method1960(local94));
				} else if (local65 == 3 || local65 == 4) {
					local94 = new String(arg0.method172().method1349());
					local105 = new String(arg0.method172().method1349());
					local109 = arg0.method191();
					@Pc(112) String[] local112 = new String[local109];
					for (@Pc(114) int local114 = 0; local114 < local109; local114++) {
						local112[local114] = new String(arg0.method172().method1349());
					}
					@Pc(134) byte[][] local134 = new byte[local109][];
					@Pc(147) int local147;
					if (local65 == 3) {
						for (@Pc(141) int local141 = 0; local141 < local109; local141++) {
							local147 = arg0.method213();
							local134[local141] = new byte[local147];
							arg0.method178(local147, local134[local141]);
						}
					}
					local9.anIntArray42[local59] = local65;
					@Pc(176) Class[] local176 = new Class[local109];
					for (local147 = 0; local147 < local109; local147++) {
						local176[local147] = Static116.method1960(local112[local147]);
					}
					local9.aClass14Array1[local59] = arg2.method2198(local176, local105, Static116.method1960(local94));
					local9.aByteArrayArrayArray1[local59] = local134;
				}
			} catch (@Pc(269) ClassNotFoundException local269) {
				local9.anIntArray43[local59] = -1;
			} catch (@Pc(276) SecurityException local276) {
				local9.anIntArray43[local59] = -2;
			} catch (@Pc(283) NullPointerException local283) {
				local9.anIntArray43[local59] = -3;
			} catch (@Pc(290) Exception local290) {
				local9.anIntArray43[local59] = -4;
			} catch (@Pc(297) Throwable local297) {
				local9.anIntArray43[local59] = -5;
			}
		}
		Static145.aClass59_8.method1730(local9);
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/Throwable;)V")
	public static void method2117(@OriginalArg(1) String arg0, @OriginalArg(2) Throwable arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg1 != null) {
				local7 = Static57.method1067(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg0;
			}
			System.out.println("Error: " + local7);
			local7 = local7.replace(':', '.');
			local7 = local7.replace('@', '_');
			local7 = local7.replace('&', '_');
			local7 = local7.replace('#', '_');
			if (Static26.aClass68_2.anApplet1 != null) {
				@Pc(101) Class14 local101 = Static26.aClass68_2.method2195(new URL(Static26.aClass68_2.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static136.anInt3193 + "&u=" + Static40.aLong43 + "&v1=" + Static131.aString3 + "&v2=" + Static131.aString5 + "&e=" + local7));
				while (local101.anInt516 == 0) {
					Static35.method627(1L);
				}
				if (local101.anInt516 == 1) {
					@Pc(124) DataInputStream local124 = (DataInputStream) local101.anObject1;
					local124.read();
					local124.close();
				}
			}
		} catch (@Pc(131) Exception local131) {
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(II[B)I")
	public static int method2119(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		return Static27.method446(arg1, arg0, 0);
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(I)V")
	public static void method2123() {
		aClass46_1026 = null;
		aClass3_Sub2_Sub3_Sub2_4 = null;
		aClass46_1020 = null;
		aClass46_1022 = null;
		aClass46_1021 = null;
		aClass46_1025 = null;
		aClass46_1024 = null;
		aClass46_1019 = null;
		aClass46_1023 = null;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)V")
	public static void method2124(@OriginalArg(0) int arg0) {
		Static83.method1399();
		Static125.method2146();
		@Pc(21) int local21 = Static114.method1918(arg0).anInt3952;
		if (local21 == 0) {
			return;
		}
		@Pc(28) int local28 = Static41.anIntArray419[arg0];
		if (local21 == 1) {
			if (local28 == 1) {
				Static132.method2235(0.9F);
			}
			if (local28 == 2) {
				Static132.method2235(0.8F);
			}
			if (local28 == 3) {
				Static132.method2235(0.7F);
			}
			if (local28 == 4) {
				Static132.method2235(0.6F);
			}
			Static21.method2162();
		}
		if (local21 == 3) {
			@Pc(66) short local66 = 0;
			if (local28 == 0) {
				local66 = 255;
			}
			if (local28 == 1) {
				local66 = 192;
			}
			if (local28 == 2) {
				local66 = 128;
			}
			if (local28 == 3) {
				local66 = 64;
			}
			if (local28 == 4) {
				local66 = 0;
			}
			if (Static68.anInt1768 != local66) {
				if (Static68.anInt1768 == 0 && Static170.anInt3767 != -1) {
					Static40.method845(local66, 0, Static170.anInt3767, Static53.aClass44_Sub1_5);
					Static150.aBoolean146 = false;
				} else if (local66 == 0) {
					Static4.method2684();
					Static150.aBoolean146 = false;
				} else {
					Static175.method2757(local66);
				}
				Static68.anInt1768 = local66;
			}
		}
		if (local21 == 6) {
			Static158.anInt3511 = local28;
		}
		if (local21 == 10) {
			if (local28 == 0) {
				Static147.anInt3353 = 127;
			}
			if (local28 == 1) {
				Static147.anInt3353 = 96;
			}
			if (local28 == 2) {
				Static147.anInt3353 = 64;
			}
			if (local28 == 3) {
				Static147.anInt3353 = 32;
			}
			if (local28 == 4) {
				Static147.anInt3353 = 0;
			}
		}
		if (local21 == 9) {
			Static127.anInt3020 = local28;
		}
		if (local21 == 4) {
			if (local28 == 0) {
				Static59.anInt1602 = 127;
			}
			if (local28 == 1) {
				Static59.anInt1602 = 96;
			}
			if (local28 == 2) {
				Static59.anInt1602 = 64;
			}
			if (local28 == 3) {
				Static59.anInt1602 = 32;
			}
			if (local28 == 4) {
				Static59.anInt1602 = 0;
			}
		}
		if (local21 == 5) {
			Static167.anInt734 = local28;
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lclient!jg;BLclient!jg;)I")
	public static int method2125(@OriginalArg(0) Class44 arg0, @OriginalArg(2) Class44 arg1) {
		@Pc(11) int local11 = 0;
		if (arg0.method1613(Static129.aClass46_1053, Static130.aClass46_1067)) {
			local11++;
		}
		if (arg1.method1613(Static14.aClass46_97, Static130.aClass46_1067)) {
			local11++;
		}
		if (arg1.method1613(Static177.aClass46_1395, Static130.aClass46_1067)) {
			local11++;
		}
		if (arg1.method1613(Static72.aClass46_633, Static130.aClass46_1067)) {
			local11++;
		}
		if (arg1.method1613(Static74.aClass46_648, Static130.aClass46_1067)) {
			local11++;
		}
		if (arg1.method1613(Static96.aClass46_786, Static130.aClass46_1067)) {
			local11++;
		}
		arg1.method1613(Static56.aClass46_499, Static130.aClass46_1067);
		arg1.method1613(Static29.aClass46_169, Static130.aClass46_1067);
		arg1.method1613(Static116.aClass46_954, Static130.aClass46_1067);
		arg1.method1613(Static180.aClass46_1434, Static130.aClass46_1067);
		arg1.method1613(Static175.aClass46_1381, Static130.aClass46_1067);
		return local11;
	}
}
