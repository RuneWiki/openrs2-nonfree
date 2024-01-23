import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!ag", name = "g", descriptor = "Lclient!dg;")
	public static Class28_Sub1 aClass28_Sub1_10;

	@OriginalMember(owner = "client!ag", name = "k", descriptor = "I")
	public static int anInt242;

	@OriginalMember(owner = "client!ag", name = "l", descriptor = "[I")
	public static int[] anIntArray16;

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "Lclient!jd;")
	public static Class61 aClass61_9 = new Class61(64);

	@OriginalMember(owner = "client!ag", name = "f", descriptor = "Lclient!sc;")
	public static Class107 aClass107_103 = Static231.method3737("<col=00ff00>");

	@OriginalMember(owner = "client!ag", name = "i", descriptor = "Lclient!sc;")
	public static Class107 aClass107_104 = Static231.method3737(")4a=");

	@OriginalMember(owner = "client!ag", name = "j", descriptor = "Lclient!sc;")
	public static Class107 aClass107_105 = Static231.method3737("(U");

	@OriginalMember(owner = "client!ag", name = "m", descriptor = "[I")
	public static int[] anIntArray17 = new int[128];

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(B)V")
	public static void method238() {
		Static194.aClass1_Sub26_Sub1_3.method3004();
		@Pc(12) int local12 = Static194.aClass1_Sub26_Sub1_3.method3007(1);
		if (local12 == 0) {
			return;
		}
		@Pc(27) int local27 = Static194.aClass1_Sub26_Sub1_3.method3007(2);
		if (local27 == 0) {
			Static12.anIntArray35[Static189.anInt4167++] = 2047;
			return;
		}
		@Pc(49) int local49;
		@Pc(59) int local59;
		if (local27 == 1) {
			local49 = Static194.aClass1_Sub26_Sub1_3.method3007(3);
			Static204.aClass5_Sub5_Sub1_2.method2306(false, local49);
			local59 = Static194.aClass1_Sub26_Sub1_3.method3007(1);
			if (local59 == 1) {
				Static12.anIntArray35[Static189.anInt4167++] = 2047;
			}
			return;
		}
		@Pc(101) int local101;
		if (local27 == 2) {
			local49 = Static194.aClass1_Sub26_Sub1_3.method3007(3);
			Static204.aClass5_Sub5_Sub1_2.method2306(true, local49);
			local59 = Static194.aClass1_Sub26_Sub1_3.method3007(3);
			Static204.aClass5_Sub5_Sub1_2.method2306(true, local59);
			local101 = Static194.aClass1_Sub26_Sub1_3.method3007(1);
			if (local101 == 1) {
				Static12.anIntArray35[Static189.anInt4167++] = 2047;
			}
		} else if (local27 == 3) {
			local49 = Static194.aClass1_Sub26_Sub1_3.method3007(7);
			local59 = Static194.aClass1_Sub26_Sub1_3.method3007(1);
			if (local59 == 1) {
				Static12.anIntArray35[Static189.anInt4167++] = 2047;
			}
			local101 = Static194.aClass1_Sub26_Sub1_3.method3007(7);
			@Pc(153) int local153 = Static194.aClass1_Sub26_Sub1_3.method3007(1);
			Static191.anInt4237 = Static194.aClass1_Sub26_Sub1_3.method3007(2);
			Static204.aClass5_Sub5_Sub1_2.method2311(local101, local153 == 1, local49);
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lclient!vf;Z)Lclient!ea;")
	public static Class3_Sub1 method239(@OriginalArg(0) Class1_Sub26 arg0) {
		return new Class3_Sub1(arg0.method2944(), arg0.method2944(), arg0.method2944(), arg0.method2944(), arg0.method2944(), arg0.method2944(), arg0.method2944(), arg0.method2944(), arg0.method2937(), arg0.method2945());
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method240(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		for (@Pc(3) int local3 = 0; local3 < Static83.aClass119_2.anInt4555; local3++) {
			@Pc(12) int local12 = Static83.aClass119_2.aShortArray52[local3] - Static101.anInt2179;
			@Pc(24) int local24 = Static152.anInt3375 + Static64.anInt1525 - Static83.aClass119_2.aShortArray51[local3] - 1;
			@Pc(39) int local39 = (local24 - arg1) * (arg4 - arg2) / (arg7 - arg1) + arg2;
			@Pc(44) int local44 = Static83.aClass119_2.method3412(local3);
			@Pc(46) int local46 = 16777215;
			@Pc(63) int local63 = (local12 - arg5) * (arg3 - arg6) / (arg0 - arg5) + arg6;
			@Pc(65) Class27 local65 = null;
			if (local44 == 0) {
				if ((double) Static4.aFloat10 == 3.0D) {
					local65 = Static117.aClass27_4;
				}
				if ((double) Static4.aFloat10 == 4.0D) {
					local65 = Static155.aClass27_2;
				}
				if ((double) Static4.aFloat10 == 6.0D) {
					local65 = Static29.aClass27_3;
				}
				if ((double) Static4.aFloat10 == 8.0D) {
					local65 = Static141.aClass27_5;
				}
			}
			if (local44 == 1) {
				if ((double) Static4.aFloat10 == 3.0D) {
					local65 = Static29.aClass27_3;
				}
				if ((double) Static4.aFloat10 == 4.0D) {
					local65 = Static141.aClass27_5;
				}
				if ((double) Static4.aFloat10 == 6.0D) {
					local65 = Static176.aClass27_8;
				}
				if ((double) Static4.aFloat10 == 8.0D) {
					local65 = Static147.aClass27_6;
				}
			}
			if (local44 == 2) {
				local46 = 16755200;
				if ((double) Static4.aFloat10 == 3.0D) {
					local65 = Static176.aClass27_8;
				}
				if ((double) Static4.aFloat10 == 4.0D) {
					local65 = Static147.aClass27_6;
				}
				if ((double) Static4.aFloat10 == 6.0D) {
					local65 = Static196.aClass27_9;
				}
				if ((double) Static4.aFloat10 == 8.0D) {
					local65 = Static153.aClass27_7;
				}
			}
			if (Static83.aClass119_2.anIntArray367[local3] != -1) {
				local46 = Static83.aClass119_2.anIntArray367[local3];
			}
			if (local65 != null) {
				@Pc(186) Class107[] local186 = new Class107[Static83.aClass119_2.aClass107Array29[local3].method3074() + 1];
				Static64.aClass1_Sub2_Sub15_2.method3348(Static83.aClass119_2.aClass107Array29[local3], null, local186);
				@Pc(198) int local198 = local186.length;
				local39 -= local65.method778() * (local198 - 1) / 2;
				local39 += local65.method776() / 2;
				for (@Pc(218) int local218 = 0; local218 < local198; local218++) {
					@Pc(247) Class107 local247 = local198 - 1 == local218 ? local186[local218] : local186[local218].method3104(0, local186[local218].method3095() - 4);
					local65.method781(local247, local63, local39, local46);
					local39 += local65.method778();
				}
			}
		}
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(B)Z")
	public static boolean method241() {
		@Pc(10) long local10 = Static209.method3309();
		@Pc(20) int local20 = (int) (local10 - Static161.aLong130);
		Static161.aLong130 = local10;
		if (local20 > 200) {
			local20 = 200;
		}
		Static118.anInt2613 += local20;
		if (Static215.anInt4674 == 0 && Static79.anInt1742 == 0 && Static19.anInt399 == 0 && Static76.anInt1703 == 0) {
			return true;
		} else if (Static137.aClass82_2 == null) {
			return false;
		} else {
			try {
				if (Static118.anInt2613 > 30000) {
					throw new IOException();
				}
				@Pc(65) Class1_Sub2_Sub12 local65;
				@Pc(70) Class1_Sub26 local70;
				while (Static79.anInt1742 < 20 && Static76.anInt1703 > 0) {
					local65 = (Class1_Sub2_Sub12) Static83.aClass50_12.method1358();
					local70 = new Class1_Sub26(4);
					local70.method2967(1);
					local70.method2976((int) local65.aLong177);
					Static137.aClass82_2.method2399(4, local70.aByteArray52);
					Static195.aClass50_25.method1362(local65.aLong177, local65);
					Static76.anInt1703--;
					Static79.anInt1742++;
				}
				while (Static215.anInt4674 < 20 && Static19.anInt399 > 0) {
					local65 = (Class1_Sub2_Sub12) Static25.aClass85_2.method2425();
					local70 = new Class1_Sub26(4);
					local70.method2967(0);
					local70.method2976((int) local65.aLong177);
					Static137.aClass82_2.method2399(4, local70.aByteArray52);
					local65.method3682();
					Static106.aClass50_16.method1362(local65.aLong177, local65);
					Static215.anInt4674++;
					Static19.anInt399--;
				}
				for (@Pc(159) int local159 = 0; local159 < 100; local159++) {
					@Pc(165) int local165 = Static137.aClass82_2.method2397();
					if (local165 < 0) {
						throw new IOException();
					}
					if (local165 == 0) {
						break;
					}
					@Pc(178) byte local178 = 0;
					Static118.anInt2613 = 0;
					if (Static191.aClass1_Sub2_Sub12_1 == null) {
						local178 = 8;
					} else if (Static141.anInt3122 == 0) {
						local178 = 1;
					}
					@Pc(203) int local203;
					@Pc(208) int local208;
					@Pc(241) int local241;
					@Pc(382) int local382;
					if (local178 <= 0) {
						local203 = Static158.aClass1_Sub26_4.aByteArray52.length - Static191.aClass1_Sub2_Sub12_1.aByte10;
						local208 = 512 - Static141.anInt3122;
						if (local203 - Static158.aClass1_Sub26_4.anInt4021 < local208) {
							local208 = local203 - Static158.aClass1_Sub26_4.anInt4021;
						}
						if (local165 < local208) {
							local208 = local165;
						}
						Static137.aClass82_2.method2398(Static158.aClass1_Sub26_4.anInt4021, Static158.aClass1_Sub26_4.aByteArray52, local208);
						if (Static191.aByte16 != 0) {
							for (local241 = 0; local241 < local208; local241++) {
								Static158.aClass1_Sub26_4.aByteArray52[Static158.aClass1_Sub26_4.anInt4021 + local241] = (byte) (Static158.aClass1_Sub26_4.aByteArray52[Static158.aClass1_Sub26_4.anInt4021 + local241] ^ Static191.aByte16);
							}
						}
						Static158.aClass1_Sub26_4.anInt4021 += local208;
						Static141.anInt3122 += local208;
						if (Static158.aClass1_Sub26_4.anInt4021 == local203) {
							if (Static191.aClass1_Sub2_Sub12_1.aLong177 == 16711935L) {
								Static90.aClass1_Sub26_2 = Static158.aClass1_Sub26_4;
								for (local241 = 0; local241 < 256; local241++) {
									@Pc(369) Class28_Sub1 local369 = Static214.aClass28_Sub1Array1[local241];
									if (local369 != null) {
										Static90.aClass1_Sub26_2.anInt4021 = local241 * 8 + 5;
										local382 = Static90.aClass1_Sub26_2.method2958();
										@Pc(386) int local386 = Static90.aClass1_Sub26_2.method2958();
										local369.method850(local382, local386);
									}
								}
							} else {
								Static120.aCRC32_3.reset();
								Static120.aCRC32_3.update(Static158.aClass1_Sub26_4.aByteArray52, 0, local203);
								local241 = (int) Static120.aCRC32_3.getValue();
								if (Static191.aClass1_Sub2_Sub12_1.anInt2836 != local241) {
									try {
										Static137.aClass82_2.method2395();
									} catch (@Pc(313) Exception local313) {
									}
									Static18.anInt378++;
									Static191.aByte16 = (byte) (Math.random() * 255.0D + 1.0D);
									Static137.aClass82_2 = null;
									return false;
								}
								Static171.anInt3714 = 0;
								Static18.anInt378 = 0;
								Static191.aClass1_Sub2_Sub12_1.aClass28_Sub1_76.method853((int) (Static191.aClass1_Sub2_Sub12_1.aLong177 & 0xFFFFL), Static158.aClass1_Sub26_4.aByteArray52, Static39.aBoolean76, (Static191.aClass1_Sub2_Sub12_1.aLong177 & 0xFF0000L) == 16711680L);
							}
							Static191.aClass1_Sub2_Sub12_1.method3735();
							Static158.aClass1_Sub26_4 = null;
							Static191.aClass1_Sub2_Sub12_1 = null;
							Static141.anInt3122 = 0;
							if (Static39.aBoolean76) {
								Static79.anInt1742--;
							} else {
								Static215.anInt4674--;
							}
						} else {
							if (Static141.anInt3122 != 512) {
								break;
							}
							Static141.anInt3122 = 0;
						}
					} else {
						local203 = local178 - Static169.aClass1_Sub26_5.anInt4021;
						if (local203 > local165) {
							local203 = local165;
						}
						Static137.aClass82_2.method2398(Static169.aClass1_Sub26_5.anInt4021, Static169.aClass1_Sub26_5.aByteArray52, local203);
						if (Static191.aByte16 != 0) {
							for (local208 = 0; local208 < local203; local208++) {
								Static169.aClass1_Sub26_5.aByteArray52[Static169.aClass1_Sub26_5.anInt4021 + local208] = (byte) (Static169.aClass1_Sub26_5.aByteArray52[Static169.aClass1_Sub26_5.anInt4021 + local208] ^ Static191.aByte16);
							}
						}
						Static169.aClass1_Sub26_5.anInt4021 += local203;
						if (local178 > Static169.aClass1_Sub26_5.anInt4021) {
							break;
						}
						if (Static191.aClass1_Sub2_Sub12_1 == null) {
							Static169.aClass1_Sub26_5.anInt4021 = 0;
							local208 = Static169.aClass1_Sub26_5.method2945();
							local241 = Static169.aClass1_Sub26_5.method2964();
							@Pc(501) int local501 = Static169.aClass1_Sub26_5.method2945();
							@Pc(508) long local508 = (long) (local241 + (local208 << 16));
							local382 = Static169.aClass1_Sub26_5.method2958();
							@Pc(518) Class1_Sub2_Sub12 local518 = (Class1_Sub2_Sub12) Static195.aClass50_25.method1364(local508);
							Static39.aBoolean76 = true;
							if (local518 == null) {
								local518 = (Class1_Sub2_Sub12) Static106.aClass50_16.method1364(local508);
								Static39.aBoolean76 = false;
							}
							if (local518 == null) {
								throw new IOException();
							}
							Static191.aClass1_Sub2_Sub12_1 = local518;
							@Pc(547) int local547 = local501 == 0 ? 5 : 9;
							Static158.aClass1_Sub26_4 = new Class1_Sub26(local382 + local547 + Static191.aClass1_Sub2_Sub12_1.aByte10);
							Static158.aClass1_Sub26_4.method2967(local501);
							Static158.aClass1_Sub26_4.method2973(local382);
							Static169.aClass1_Sub26_5.anInt4021 = 0;
							Static141.anInt3122 = 8;
						} else if (Static141.anInt3122 == 0) {
							if (Static169.aClass1_Sub26_5.aByteArray52[0] == -1) {
								Static169.aClass1_Sub26_5.anInt4021 = 0;
								Static141.anInt3122 = 1;
							} else {
								Static191.aClass1_Sub2_Sub12_1 = null;
							}
						}
					}
				}
				return true;
			} catch (@Pc(600) IOException local600) {
				try {
					Static137.aClass82_2.method2395();
				} catch (@Pc(605) Exception local605) {
				}
				Static137.aClass82_2 = null;
				Static171.anInt3714++;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(ZIBI)Lclient!sc;")
	public static Class107 method243(@OriginalArg(0) boolean arg0, @OriginalArg(3) int arg1) {
		@Pc(24) int local24 = 1;
		@Pc(28) int local28 = arg1 / 10;
		while (local28 != 0) {
			local28 /= 10;
			local24++;
		}
		@Pc(42) int local42 = local24;
		if (arg1 < 0 || arg0) {
			local42 = local24 + 1;
		}
		@Pc(58) byte[] local58 = new byte[local42];
		if (arg1 < 0) {
			local58[0] = 45;
		} else if (arg0) {
			local58[0] = 43;
		}
		for (@Pc(77) int local77 = 0; local77 < local24; local77++) {
			@Pc(83) int local83 = arg1 % 10;
			if (local83 < 0) {
				local83 = -local83;
			}
			if (local83 > 9) {
				local83 += 39;
			}
			local58[local42 - local77 - 1] = (byte) (local83 + 48);
			arg1 /= 10;
		}
		@Pc(118) Class107 local118 = new Class107();
		local118.anInt4186 = local42;
		local118.aByteArray55 = local58;
		return local118;
	}
}
