import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!af", name = "P", descriptor = "I")
	public static int anInt118;

	@OriginalMember(owner = "client!af", name = "K", descriptor = "I")
	public static int anInt114 = 0;

	@OriginalMember(owner = "client!af", name = "O", descriptor = "Ljava/lang/String;")
	public static String aString3 = "Checking for updates - ";

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IILclient!lf;)V")
	public static void method95(@OriginalArg(2) Class1_Sub14_Sub1 arg0) {
		while (true) {
			@Pc(15) Class1_Sub30 local15 = (Class1_Sub30) Static274.aClass24_27.method460();
			if (local15 == null) {
				return;
			}
			@Pc(21) boolean local21 = false;
			@Pc(23) int local23;
			for (local23 = 0; local23 < local15.anInt5643; local23++) {
				if (local15.aClass10Array1[local23] != null) {
					if (local15.aClass10Array1[local23].anInt151 == 2) {
						local15.anIntArray517[local23] = -5;
					}
					if (local15.aClass10Array1[local23].anInt151 == 0) {
						local21 = true;
					}
				}
				if (local15.aClass10Array2[local23] != null) {
					if (local15.aClass10Array2[local23].anInt151 == 2) {
						local15.anIntArray517[local23] = -6;
					}
					if (local15.aClass10Array2[local23].anInt151 == 0) {
						local21 = true;
					}
				}
			}
			if (local21) {
				return;
			}
			arg0.method2661(113);
			arg0.method2631(0);
			local23 = arg0.anInt3290;
			arg0.method2630(local15.anInt5642);
			for (@Pc(120) int local120 = 0; local120 < local15.anInt5643; local120++) {
				if (local15.anIntArray517[local120] == 0) {
					try {
						@Pc(148) int local148 = local15.anIntArray518[local120];
						@Pc(157) Field local157;
						@Pc(161) int local161;
						if (local148 == 0) {
							local157 = (Field) local15.aClass10Array1[local120].anObject1;
							local161 = local157.getInt(null);
							arg0.method2631(0);
							arg0.method2630(local161);
						} else if (local148 == 1) {
							local157 = (Field) local15.aClass10Array1[local120].anObject1;
							local157.setInt(null, local15.anIntArray516[local120]);
							arg0.method2631(0);
						} else if (local148 == 2) {
							local157 = (Field) local15.aClass10Array1[local120].anObject1;
							local161 = local157.getModifiers();
							arg0.method2631(0);
							arg0.method2630(local161);
						}
						@Pc(231) Method local231;
						if (local148 == 3) {
							local231 = (Method) local15.aClass10Array2[local120].anObject1;
							@Pc(256) byte[][] local256 = local15.aByteArrayArrayArray20[local120];
							@Pc(260) Object[] local260 = new Object[local256.length];
							for (@Pc(262) int local262 = 0; local262 < local256.length; local262++) {
								@Pc(276) ObjectInputStream local276 = new ObjectInputStream(new ByteArrayInputStream(local256[local262]));
								local260[local262] = local276.readObject();
							}
							@Pc(289) Object local289 = local231.invoke(null, local260);
							if (local289 == null) {
								arg0.method2631(0);
							} else if (local289 instanceof Number) {
								arg0.method2631(1);
								arg0.method2603(((Number) local289).longValue());
							} else if (local289 instanceof String) {
								arg0.method2631(2);
								arg0.method2619((String) local289);
							} else {
								arg0.method2631(4);
							}
						} else if (local148 == 4) {
							local231 = (Method) local15.aClass10Array2[local120].anObject1;
							local161 = local231.getModifiers();
							arg0.method2631(0);
							arg0.method2630(local161);
						}
					} catch (@Pc(333) ClassNotFoundException local333) {
						arg0.method2631(-10);
					} catch (@Pc(339) InvalidClassException local339) {
						arg0.method2631(-11);
					} catch (@Pc(345) StreamCorruptedException local345) {
						arg0.method2631(-12);
					} catch (@Pc(351) OptionalDataException local351) {
						arg0.method2631(-13);
					} catch (@Pc(357) IllegalAccessException local357) {
						arg0.method2631(-14);
					} catch (@Pc(363) IllegalArgumentException local363) {
						arg0.method2631(-15);
					} catch (@Pc(369) InvocationTargetException local369) {
						arg0.method2631(-16);
					} catch (@Pc(375) SecurityException local375) {
						arg0.method2631(-17);
					} catch (@Pc(381) IOException local381) {
						arg0.method2631(-18);
					} catch (@Pc(387) NullPointerException local387) {
						arg0.method2631(-19);
					} catch (@Pc(393) Exception local393) {
						arg0.method2631(-20);
					} catch (@Pc(399) Throwable local399) {
						arg0.method2631(-21);
					}
				} else {
					arg0.method2631(local15.anIntArray517[local120]);
				}
			}
			arg0.method2616(local23);
			arg0.method2650(arg0.anInt3290 - local23);
			local15.method4616();
		}
	}

	@OriginalMember(owner = "client!af", name = "e", descriptor = "(B)I")
	public static int method96() {
		try {
			if (Static130.anInt2576 == 0) {
				if (Static295.aLong207 > Static135.method2186() - 5000L) {
					return 0;
				}
				Static110.aClass10_5 = Static117.aClass117_3.method2996(Static122.anInt2459, Static121.aString88);
				Static141.aLong100 = Static135.method2186();
				Static130.anInt2576 = 1;
			}
			if (Static141.aLong100 + 30000L < Static135.method2186()) {
				return Static229.method3601(1000);
			}
			@Pc(91) int local91;
			@Pc(128) int local128;
			if (Static130.anInt2576 == 1) {
				if (Static110.aClass10_5.anInt151 == 2) {
					return Static229.method3601(1001);
				}
				if (Static110.aClass10_5.anInt151 != 1) {
					return -1;
				}
				Static81.aClass7_2 = new Class7((Socket) Static110.aClass10_5.anObject1, Static117.aClass117_3);
				Static110.aClass10_5 = null;
				Static137.aClass1_Sub14_Sub1_6.anInt3290 = 0;
				local91 = 0;
				if (Static156.aBoolean233) {
					local91 = Static253.anInt4752;
				}
				Static137.aClass1_Sub14_Sub1_6.method2631(23);
				Static137.aClass1_Sub14_Sub1_6.method2630(local91);
				Static81.aClass7_2.method108(Static137.aClass1_Sub14_Sub1_6.aByteArray34, Static137.aClass1_Sub14_Sub1_6.anInt3290);
				if (Static313.aClass101_2 != null) {
					Static313.aClass101_2.method2811();
				}
				if (Static199.aClass101_1 != null) {
					Static199.aClass101_1.method2811();
				}
				local128 = Static81.aClass7_2.method103();
				if (Static313.aClass101_2 != null) {
					Static313.aClass101_2.method2811();
				}
				if (Static199.aClass101_1 != null) {
					Static199.aClass101_1.method2811();
				}
				if (local128 != 0) {
					return Static229.method3601(local128);
				}
				Static130.anInt2576 = 2;
			}
			if (Static130.anInt2576 == 2) {
				if (Static81.aClass7_2.method104() < 2) {
					return -1;
				}
				Static288.anInt5482 = Static81.aClass7_2.method103();
				Static288.anInt5482 <<= 0x8;
				Static288.anInt5482 += Static81.aClass7_2.method103();
				Static218.aByteArray44 = new byte[Static288.anInt5482];
				Static72.anInt1376 = 0;
				Static130.anInt2576 = 3;
			}
			if (Static130.anInt2576 != 3) {
				return -1;
			}
			local91 = Static81.aClass7_2.method104();
			if (local91 < 1) {
				return -1;
			}
			if (local91 > Static288.anInt5482 - Static72.anInt1376) {
				local91 = Static288.anInt5482 - Static72.anInt1376;
			}
			Static81.aClass7_2.method102(Static218.aByteArray44, Static72.anInt1376, local91);
			Static72.anInt1376 += local91;
			if (Static72.anInt1376 < Static288.anInt5482) {
				return -1;
			} else if (Static173.method2889(Static218.aByteArray44)) {
				Static29.aClass182_Sub1Array1 = new Class182_Sub1[Static198.anInt3992];
				local128 = 0;
				for (@Pc(252) int local252 = Static110.anInt2186; local252 <= Static138.anInt2725; local252++) {
					@Pc(263) Class182_Sub1 local263 = Static40.method720(local252);
					if (local263 != null) {
						Static29.aClass182_Sub1Array1[local128++] = local263;
					}
				}
				Static81.aClass7_2.method105();
				Static233.anInt4689 = 0;
				Static81.aClass7_2 = null;
				Static218.aByteArray44 = null;
				Static130.anInt2576 = 0;
				Static295.aLong207 = Static135.method2186();
				return 0;
			} else {
				return Static229.method3601(1002);
			}
		} catch (@Pc(292) IOException local292) {
			return Static229.method3601(1003);
		}
	}

	@OriginalMember(owner = "client!af", name = "h", descriptor = "(I)Lclient!ed;")
	public static Class1_Sub1_Sub8 method97() {
		return Static58.aClass1_Sub1_Sub8_2;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(ILclient!ei;BIIIIII)V")
	public static void method98(@OriginalArg(0) int arg0, @OriginalArg(1) Class43 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(9) int local9 = arg2 & 0x3;
		@Pc(31) int local31;
		@Pc(28) int local28;
		if (local9 == 1 || local9 == 3) {
			local31 = arg1.anInt1153;
			local28 = arg1.anInt1185;
		} else {
			local28 = arg1.anInt1153;
			local31 = arg1.anInt1185;
		}
		@Pc(51) int local51;
		@Pc(60) int local60;
		if (local28 + arg3 <= 104) {
			local51 = arg3 + (local28 >> 1);
			local60 = arg3 + (local28 + 1 >> 1);
		} else {
			local60 = arg3 + 1;
			local51 = arg3;
		}
		@Pc(76) int local76 = (local31 << 6) + (arg4 << 7);
		@Pc(96) int local96;
		@Pc(90) int local90;
		if (local31 + arg4 <= 104) {
			local90 = arg4 + (local31 + 1 >> 1);
			local96 = (local31 >> 1) + arg4;
		} else {
			local90 = arg4 + 1;
			local96 = arg4;
		}
		@Pc(108) int[][] local108 = Static208.anIntArrayArrayArray11[arg0];
		@Pc(110) int local110 = 0;
		@Pc(136) int local136 = local108[local90][local60] + local108[local90][local51] + local108[local96][local51] + local108[local96][local60] >> 2;
		@Pc(145) int[][] local145;
		if (arg0 != 0) {
			local145 = Static208.anIntArrayArrayArray11[0];
			local110 = local136 - (local145[local96][local60] + local145[local96][local51] + local145[local90][local51] + local145[local90][local60] >> 2);
		}
		@Pc(184) int local184 = (arg3 << 7) + (local28 << 6);
		local145 = null;
		if (arg0 < 3) {
			local145 = Static208.anIntArrayArrayArray11[arg0 + 1];
		}
		@Pc(211) Class111 local211 = arg1.method1019(local145, local184, local76, arg2, true, false, null, local108, local136, arg7);
		Static174.method2901(local211.aClass103_Sub2_3, local76 - arg5, local110, local184 - arg6);
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIIIIIBII)V")
	public static void method99(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg3 == arg1 && arg2 == arg6 && arg4 == arg0 && arg5 == arg8) {
			Static304.method4531(arg0, arg5, arg1, arg6, arg7);
			return;
		}
		@Pc(29) int local29 = arg6;
		@Pc(31) int local31 = arg1;
		@Pc(35) int local35 = arg6 * 3;
		@Pc(39) int local39 = arg1 * 3;
		@Pc(43) int local43 = arg3 * 3;
		@Pc(47) int local47 = arg2 * 3;
		@Pc(51) int local51 = arg8 * 3;
		@Pc(55) int local55 = arg4 * 3;
		@Pc(64) int local64 = arg0 + local43 - local55 - arg1;
		@Pc(73) int local73 = arg5 + local47 - local51 - arg6;
		@Pc(83) int local83 = local39 + local55 - local43 - local43;
		@Pc(93) int local93 = local51 + local35 - local47 - local47;
		@Pc(98) int local98 = local43 - local39;
		@Pc(103) int local103 = local47 - local35;
		for (@Pc(105) int local105 = 128; local105 <= 4096; local105 += 128) {
			@Pc(116) int local116 = local105 * local105 >> 12;
			@Pc(122) int local122 = local105 * local116 >> 12;
			@Pc(126) int local126 = local64 * local122;
			@Pc(130) int local130 = local122 * local73;
			@Pc(134) int local134 = local83 * local116;
			@Pc(138) int local138 = local93 * local116;
			@Pc(142) int local142 = local105 * local98;
			@Pc(146) int local146 = local105 * local103;
			@Pc(156) int local156 = (local146 + local138 + local130 >> 12) + arg6;
			@Pc(166) int local166 = arg1 + (local134 + local126 + local142 >> 12);
			Static304.method4531(local166, local156, local31, local29, arg7);
			local29 = local156;
			local31 = local166;
		}
	}
}
