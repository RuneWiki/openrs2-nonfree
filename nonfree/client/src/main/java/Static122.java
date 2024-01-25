import java.awt.Canvas;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!hl", name = "F", descriptor = "Lclient!tq;")
	public static Class191 aClass191_148;

	@OriginalMember(owner = "client!hl", name = "K", descriptor = "I")
	public static int anInt4369;

	@OriginalMember(owner = "client!hl", name = "M", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray38;

	@OriginalMember(owner = "client!hl", name = "P", descriptor = "[[Lclient!js;")
	public static Class105[][] aClass105ArrayArray3;

	@OriginalMember(owner = "client!hl", name = "N", descriptor = "Lclient!lg;")
	public static final Class119 aClass119_139 = new Class119(10);

	@OriginalMember(owner = "client!hl", name = "O", descriptor = "I")
	public static int anInt4371 = 0;

	@OriginalMember(owner = "client!hl", name = "c", descriptor = "(B)V")
	public static void method3993() {
		@Pc(5) Class119 local5 = Static304.aClass119_185;
		synchronized (Static304.aClass119_185) {
			Static304.aClass119_185.method3312();
		}
		local5 = Static286.aClass119_172;
		synchronized (Static286.aClass119_172) {
			Static286.aClass119_172.method3312();
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IBIZZILclient!p;IIILclient!ae;II)V")
	public static void method3994(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class151 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class4 arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		if (!Static257.method4680() && !Static85.method1908(arg6, arg11, Static69.anInt1511, arg1)) {
			return;
		}
		if (arg6 < Static284.anInt5732) {
			Static284.anInt5732 = arg6;
		}
		@Pc(29) Class96 local29 = Static234.method4051(arg4);
		if (Static129.anInt2728 == 1 && local29.aBoolean281) {
			return;
		}
		@Pc(47) int local47;
		@Pc(50) int local50;
		if (arg10 == 1 || arg10 == 3) {
			local47 = local29.anInt3135;
			local50 = local29.anInt3120;
		} else {
			local47 = local29.anInt3120;
			local50 = local29.anInt3135;
		}
		@Pc(73) int local73;
		@Pc(71) int local71;
		if (Static95.anInt6381 < local47 + arg1) {
			local71 = arg1 + 1;
			local73 = arg1;
		} else {
			local73 = arg1 + (local47 >> 1);
			local71 = arg1 + (local47 + 1 >> 1);
		}
		@Pc(113) int local113;
		@Pc(107) int local107;
		if (Static237.anInt4532 >= local50 + arg11) {
			local107 = arg11 + (local50 + 1 >> 1);
			local113 = (local50 >> 1) + arg11;
		} else {
			local107 = arg11 + 1;
			local113 = arg11;
		}
		@Pc(125) Class73 local125 = Static301.aClass73Array31[arg8];
		@Pc(150) int local150 = local125.method4931(local73, local113) + local125.method4931(local71, local113) + local125.method4931(local73, local107) + local125.method4931(local71, local107) >> 2;
		@Pc(158) int local158 = (arg1 << 7) + (local47 << 6);
		@Pc(166) int local166 = (local50 << 6) + (arg11 << 7);
		@Pc(177) boolean local177 = arg2 && !arg3 && local29.aBoolean277;
		if (local29.method2939()) {
			Static52.method1200(null, arg6, local29, arg10, arg11, null, arg1);
		}
		@Pc(211) boolean local211 = arg7 == -1 && local29.lb == -1 && local29.anIntArray255 == null && local29.anIntArray259 == null && !local29.aBoolean274;
		if (Static220.aBoolean377 && local29.anInt3148 != 1) {
			return;
		}
		if (arg0 != 22) {
			@Pc(345) Class62_Sub1 local345;
			@Pc(307) Class62_Sub1_Sub5 local307;
			@Pc(341) int local341;
			@Pc(401) int local401;
			if (arg0 == 10 || arg0 == 11) {
				local307 = null;
				if (local211) {
					@Pc(337) Class62_Sub1_Sub5 local337 = new Class62_Sub1_Sub5(arg9, local29, arg6, arg8, local158, local150, local166, arg3, arg1, arg1 + local47 - 1, arg11, local50 + arg11 - 1, arg0, arg10, local177);
					local341 = local337.method4561();
					local307 = local337;
					local345 = local337;
				} else {
					local341 = 15;
					local345 = new Class62_Sub1_Sub1(arg9, local29, arg0, arg10, arg6, arg8, local158, local150, local166, arg3, arg1, arg1 + local47 - 1, arg11, arg11 + local50 - 1, arg7);
				}
				if (Static289.method5131(local345, false)) {
					if (local307 != null && local307.method5579()) {
						local307.method5584(arg9);
					}
					if (local29.aBoolean282 && arg2) {
						if (local341 > 30) {
							local341 = 30;
						}
						for (local401 = 0; local401 <= local47; local401++) {
							for (@Pc(405) int local405 = 0; local405 <= local50; local405++) {
								local125.method4940(arg1 + local401, arg11 + local405, local341);
							}
						}
					}
				}
				if (local29.anInt3117 != 0 && arg5 != null) {
					arg5.method4111(arg11, local29.aBoolean276, arg1, local50, !local29.aBoolean283, local47);
				}
			} else if (arg0 >= 12 && arg0 <= 17 || arg0 >= 18 && arg0 <= 21) {
				if (local211) {
					local307 = new Class62_Sub1_Sub5(arg9, local29, arg6, arg8, local158, local150, local166, arg3, arg1, arg1 + local47 - 1, arg11, local50 + arg11 - 1, arg0, arg10, local177);
					local345 = local307;
					if (local307.method5579()) {
						local307.method5584(arg9);
					}
				} else {
					local345 = new Class62_Sub1_Sub1(arg9, local29, arg0, arg10, arg6, arg8, local158, local150, local166, arg3, arg1, arg1 + local47 - 1, arg11, arg11 + local50 - 1, arg7);
				}
				Static289.method5131(local345, false);
				if (arg2 && !arg3 && arg0 >= 12 && arg0 <= 17 && arg0 != 13 && arg6 > 0 && local29.anInt3148 != 0) {
					Static272.aByteArrayArrayArray9[arg6][arg1][arg11] = (byte) (Static272.aByteArrayArrayArray9[arg6][arg1][arg11] | 0x4);
				}
				if (local29.anInt3117 != 0 && arg5 != null) {
					arg5.method4111(arg11, local29.aBoolean276, arg1, local50, !local29.aBoolean283, local47);
				}
			} else {
				@Pc(643) Class62_Sub4_Sub2 local643;
				@Pc(627) Class62_Sub4 local627;
				if (arg0 == 0) {
					if (local211) {
						local643 = new Class62_Sub4_Sub2(arg9, local29, arg8, local158, local150, local166, arg3, arg0, arg10, local177);
						local627 = local643;
						if (local643.method5579()) {
							local643.method5584(arg9);
						}
					} else {
						local627 = new Class62_Sub4_Sub1(arg9, local29, 0, arg10, arg6, arg8, local158, local150, local166, arg3, arg7);
					}
					Static193.method3476(arg6, arg1, arg11, local627, null);
					if (arg2) {
						if (arg10 == 0) {
							if (local29.aBoolean282) {
								local125.method4940(arg1, arg11, 50);
								local125.method4940(arg1, arg11 + 1, 50);
							}
							if (local29.anInt3148 == 1 && !arg3) {
								Static272.aByteArrayArrayArray9[arg6][arg1][arg11] = (byte) (Static272.aByteArrayArrayArray9[arg6][arg1][arg11] | 0x1);
							}
						} else if (arg10 == 1) {
							if (local29.aBoolean282) {
								local125.method4940(arg1, arg11 + 1, 50);
								local125.method4940(arg1 + 1, arg11 + 1, 50);
							}
							if (local29.anInt3148 == 1 && !arg3) {
								Static272.aByteArrayArrayArray9[arg6][arg1][arg11 + 1] = (byte) (Static272.aByteArrayArrayArray9[arg6][arg1][arg11 + 1] | 0x2);
							}
						} else if (arg10 == 2) {
							if (local29.aBoolean282) {
								local125.method4940(arg1 + 1, arg11, 50);
								local125.method4940(arg1 + 1, arg11 + 1, 50);
							}
							if (local29.anInt3148 == 1 && !arg3) {
								Static272.aByteArrayArrayArray9[arg6][arg1 + 1][arg11] = (byte) (Static272.aByteArrayArrayArray9[arg6][arg1 + 1][arg11] | 0x1);
							}
						} else if (arg10 == 3) {
							if (local29.aBoolean282) {
								local125.method4940(arg1, arg11, 50);
								local125.method4940(arg1 + 1, arg11, 50);
							}
							if (local29.anInt3148 == 1 && !arg3) {
								Static272.aByteArrayArrayArray9[arg6][arg1][arg11] = (byte) (Static272.aByteArrayArrayArray9[arg6][arg1][arg11] | 0x2);
							}
						}
					}
					if (local29.anInt3117 != 0 && arg5 != null) {
						arg5.method4095(arg10, arg0, arg1, local29.aBoolean276, !local29.aBoolean283, arg11);
					}
					if (local29.anInt3151 != 16) {
						Static306.method5410(arg6, arg1, arg11, local29.anInt3151);
					}
				} else if (arg0 == 1) {
					if (local211) {
						local643 = new Class62_Sub4_Sub2(arg9, local29, arg8, local158, local150, local166, arg3, arg0, arg10, local177);
						if (local643.method5579()) {
							local643.method5584(arg9);
						}
						local627 = local643;
					} else {
						local627 = new Class62_Sub4_Sub1(arg9, local29, 1, arg10, arg6, arg8, local158, local150, local166, arg3, arg7);
					}
					Static193.method3476(arg6, arg1, arg11, local627, null);
					if (local29.aBoolean282 && arg2) {
						if (arg10 == 0) {
							local125.method4940(arg1, arg11 + 1, 50);
						} else if (arg10 == 1) {
							local125.method4940(arg1 + 1, arg11 + 1, 50);
						} else if (arg10 == 2) {
							local125.method4940(arg1 + 1, arg11, 50);
						} else if (arg10 == 3) {
							local125.method4940(arg1, arg11, 50);
						}
					}
					if (local29.anInt3117 != 0 && arg5 != null) {
						arg5.method4095(arg10, arg0, arg1, local29.aBoolean276, !local29.aBoolean283, arg11);
					}
				} else if (arg0 == 2) {
					local341 = arg10 + 1 & 0x3;
					@Pc(1081) Class62_Sub4 local1081;
					if (local211) {
						@Pc(1047) Class62_Sub4_Sub2 local1047 = new Class62_Sub4_Sub2(arg9, local29, arg8, local158, local150, local166, arg3, arg0, arg10 + 4, local177);
						@Pc(1061) Class62_Sub4_Sub2 local1061 = new Class62_Sub4_Sub2(arg9, local29, arg8, local158, local150, local166, arg3, arg0, local341, local177);
						if (local1047.method5579()) {
							local1047.method5584(arg9);
						}
						local627 = local1047;
						if (local1061.method5579()) {
							local1061.method5584(arg9);
						}
						local1081 = local1061;
					} else {
						local627 = new Class62_Sub4_Sub1(arg9, local29, 2, arg10 + 4, arg6, arg8, local158, local150, local166, arg3, arg7);
						local1081 = new Class62_Sub4_Sub1(arg9, local29, 2, local341, arg6, arg8, local158, local150, local166, arg3, arg7);
					}
					Static193.method3476(arg6, arg1, arg11, local627, local1081);
					if (local29.anInt3148 == 1 && arg2 && !arg3) {
						if (arg10 == 0) {
							Static272.aByteArrayArrayArray9[arg6][arg1][arg11] = (byte) (Static272.aByteArrayArrayArray9[arg6][arg1][arg11] | 0x1);
							Static272.aByteArrayArrayArray9[arg6][arg1][arg11 + 1] = (byte) (Static272.aByteArrayArrayArray9[arg6][arg1][arg11 + 1] | 0x2);
						} else if (arg10 == 1) {
							Static272.aByteArrayArrayArray9[arg6][arg1][arg11 + 1] = (byte) (Static272.aByteArrayArrayArray9[arg6][arg1][arg11 + 1] | 0x2);
							Static272.aByteArrayArrayArray9[arg6][arg1 + 1][arg11] = (byte) (Static272.aByteArrayArrayArray9[arg6][arg1 + 1][arg11] | 0x1);
						} else if (arg10 == 2) {
							Static272.aByteArrayArrayArray9[arg6][arg1 + 1][arg11] = (byte) (Static272.aByteArrayArrayArray9[arg6][arg1 + 1][arg11] | 0x1);
							Static272.aByteArrayArrayArray9[arg6][arg1][arg11] = (byte) (Static272.aByteArrayArrayArray9[arg6][arg1][arg11] | 0x2);
						} else if (arg10 == 3) {
							Static272.aByteArrayArrayArray9[arg6][arg1][arg11] = (byte) (Static272.aByteArrayArrayArray9[arg6][arg1][arg11] | 0x2);
							Static272.aByteArrayArrayArray9[arg6][arg1][arg11] = (byte) (Static272.aByteArrayArrayArray9[arg6][arg1][arg11] | 0x1);
						}
					}
					if (local29.anInt3117 != 0 && arg5 != null) {
						arg5.method4095(arg10, arg0, arg1, local29.aBoolean276, !local29.aBoolean283, arg11);
					}
					if (local29.anInt3151 != 16) {
						Static306.method5410(arg6, arg1, arg11, local29.anInt3151);
					}
				} else if (arg0 == 3) {
					if (local211) {
						local643 = new Class62_Sub4_Sub2(arg9, local29, arg8, local158, local150, local166, arg3, arg0, arg10, local177);
						local627 = local643;
						if (local643.method5579()) {
							local643.method5584(arg9);
						}
					} else {
						local627 = new Class62_Sub4_Sub1(arg9, local29, 3, arg10, arg6, arg8, local158, local150, local166, arg3, arg7);
					}
					Static193.method3476(arg6, arg1, arg11, local627, null);
					if (local29.aBoolean282 && arg2) {
						if (arg10 == 0) {
							local125.method4940(arg1, arg11 + 1, 50);
						} else if (arg10 == 1) {
							local125.method4940(arg1 + 1, arg11 + 1, 50);
						} else if (arg10 == 2) {
							local125.method4940(arg1 + 1, arg11, 50);
						} else if (arg10 == 3) {
							local125.method4940(arg1, arg11, 50);
						}
					}
					if (local29.anInt3117 != 0 && arg5 != null) {
						arg5.method4095(arg10, arg0, arg1, local29.aBoolean276, !local29.aBoolean283, arg11);
					}
				} else if (arg0 == 9) {
					if (local211) {
						local307 = new Class62_Sub1_Sub5(arg9, local29, arg6, arg8, local158, local150, local166, arg3, arg1, arg1, arg11, arg11, arg0, arg10, local177);
						local345 = local307;
						if (local307.method5579()) {
							local307.method5584(arg9);
						}
					} else {
						local345 = new Class62_Sub1_Sub1(arg9, local29, arg0, arg10, arg6, arg8, local158, local150, local166, arg3, arg1, local47 + arg1 - 1, arg11, local50 + arg11 - 1, arg7);
					}
					Static289.method5131(local345, false);
					if (local29.anInt3117 != 0 && arg5 != null) {
						arg5.method4111(arg11, local29.aBoolean276, arg1, local50, !local29.aBoolean283, local47);
					}
					if (local29.anInt3151 != 16) {
						Static306.method5410(arg6, arg1, arg11, local29.anInt3151);
					}
				} else {
					@Pc(1592) Class62_Sub5 local1592;
					if (arg0 == 4) {
						if (local211) {
							@Pc(1610) Class62_Sub5_Sub2 local1610 = new Class62_Sub5_Sub2(arg9, local29, arg8, local158, local150, local166, arg3, 0, 0, 0, arg0, arg10);
							if (local1610.method5579()) {
								local1610.method5584(arg9);
							}
							local1592 = local1610;
						} else {
							local1592 = new Class62_Sub5_Sub1(arg9, local29, arg0, arg10, arg6, arg8, local158, local150, local166, arg3, 0, 0, 0, arg7);
						}
						Static112.method2426(arg6, arg1, arg11, local1592, null);
					} else {
						@Pc(1638) int local1638;
						@Pc(1644) Interface9 local1644;
						@Pc(1707) Class62_Sub5_Sub2 local1707;
						if (arg0 == 5) {
							local1638 = 16;
							local1644 = (Interface9) Static230.method4018(arg6, arg1, arg11);
							if (local1644 != null) {
								local1638 = Static234.method4051(local1644.method5583()).anInt3151;
							}
							if (local211) {
								local1707 = new Class62_Sub5_Sub2(arg9, local29, arg8, local158, local150, local166, arg3, 0, local1638 * Static89.anIntArray201[arg10], local1638 * Static53.anIntArray97[arg10], arg0, arg10);
								if (local1707.method5579()) {
									local1707.method5584(arg9);
								}
								local1592 = local1707;
							} else {
								local1592 = new Class62_Sub5_Sub1(arg9, local29, arg0, arg10, arg6, arg8, local158, local150, local166, arg3, 0, Static89.anIntArray201[arg10] * local1638, local1638 * Static53.anIntArray97[arg10], arg7);
							}
							Static112.method2426(arg6, arg1, arg11, local1592, null);
						} else if (arg0 == 6) {
							local1638 = 8;
							local1644 = (Interface9) Static230.method4018(arg6, arg1, arg11);
							if (local1644 != null) {
								local1638 = Static234.method4051(local1644.method5583()).anInt3151 / 2;
							}
							if (local211) {
								local1707 = new Class62_Sub5_Sub2(arg9, local29, arg8, local158, local150, local166, arg3, arg10, local1638 * Static89.anIntArray201[arg10], local1638 * Static53.anIntArray97[arg10], arg0, arg10 + 4);
								if (local1707.method5579()) {
									local1707.method5584(arg9);
								}
								local1592 = local1707;
							} else {
								local1592 = new Class62_Sub5_Sub1(arg9, local29, arg0, arg10 + 4, arg6, arg8, local158, local150, local166, arg3, arg10, local1638 * Static239.anIntArray364[arg10], Static255.anIntArray384[arg10] * local1638, arg7);
							}
							Static112.method2426(arg6, arg1, arg11, local1592, null);
						} else if (arg0 == 7) {
							local1638 = arg10 + 2 & 0x3;
							if (local211) {
								@Pc(1850) Class62_Sub5_Sub2 local1850 = new Class62_Sub5_Sub2(arg9, local29, arg8, local158, local150, local166, arg3, local1638, 0, 0, arg0, local1638 + 4);
								local1592 = local1850;
								if (local1850.method5579()) {
									local1850.method5584(arg9);
								}
							} else {
								local1592 = new Class62_Sub5_Sub1(arg9, local29, arg0, local1638 + 4, arg6, arg8, local158, local150, local166, arg3, local1638, 0, 0, arg7);
							}
							Static112.method2426(arg6, arg1, arg11, local1592, null);
						} else if (arg0 == 8) {
							local341 = arg10 + 2 & 0x3;
							local401 = 8;
							@Pc(1908) Interface9 local1908 = (Interface9) Static230.method4018(arg6, arg1, arg11);
							if (local1908 != null) {
								local401 = Static234.method4051(local1908.method5583()).anInt3151 / 2;
							}
							@Pc(1947) Class62_Sub5 local1947;
							@Pc(1965) Class62_Sub5 local1965;
							if (local211) {
								local1947 = new Class62_Sub5_Sub2(arg9, local29, arg8, local158, local150, local166, arg3, arg10, Static239.anIntArray364[arg10] * local401, local401 * Static255.anIntArray384[arg10], arg0, arg10 + 4);
								local1965 = new Class62_Sub5_Sub2(arg9, local29, arg8, local158, local150, local166, arg3, arg10, 0, 0, arg0, local341 + 4);
								if (local1947.method5579()) {
									local1947.method5584(arg9);
								}
								if (local1965.method5579()) {
									local1965.method5584(arg9);
								}
							} else {
								local1947 = new Class62_Sub5_Sub1(arg9, local29, arg0, arg10 + 4, arg6, arg8, local158, local150, local166, arg3, arg10, local401 * Static239.anIntArray364[arg10], Static255.anIntArray384[arg10] * local401, arg7);
								local1965 = new Class62_Sub5_Sub1(arg9, local29, arg0, local341 + 4, arg6, arg8, local158, local150, local166, arg3, arg10, 0, 0, arg7);
							}
							Static112.method2426(arg6, arg1, arg11, local1947, local1965);
						}
					}
				}
			}
		} else if (Static89.aBoolean169 || local29.anInt3115 != 0 || local29.anInt3117 == 1 || local29.aBoolean284) {
			@Pc(253) Class62_Sub3 local253;
			if (local211) {
				@Pc(268) Class62_Sub3_Sub2 local268 = new Class62_Sub3_Sub2(arg9, local29, arg8, local158, local150, local166, arg3, arg10, local177);
				if (local268.method5579()) {
					local268.method5584(arg9);
				}
				local253 = local268;
			} else {
				local253 = new Class62_Sub3_Sub1(arg9, local29, arg10, arg6, arg8, local158, local150, local166, arg3, arg7);
			}
			Static344.method5934(arg6, arg1, arg11, local253);
			if (local29.anInt3117 == 1 && arg5 != null) {
				arg5.method4104(arg11, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!hl", name = "g", descriptor = "(I)V")
	public static void method3996() {
		@Pc(5) Class119 local5 = Static153.aClass119_96;
		synchronized (Static153.aClass119_96) {
			Static153.aClass119_96.method3304();
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(Ljava/awt/Canvas;Lclient!ul;IIBLclient!rd;)Lclient!ae;")
	public static Class4 method3997(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface7 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class168 arg4) {
		try {
			@Pc(11) Class local11 = Class.forName("Class4_Sub1");
			@Pc(57) Constructor local57 = local11.getConstructor(Canvas.class, ul.class, Integer.TYPE, Integer.TYPE, rd.class);
			return (Class4) local57.newInstance(arg0, arg1, Integer.valueOf(arg3), new Integer(arg2), arg4);
		} catch (@Pc(90) Exception local90) {
			throw new RuntimeException();
		}
	}
}
