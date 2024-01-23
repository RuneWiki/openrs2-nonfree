import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static279 {

	@OriginalMember(owner = "client!to", name = "e", descriptor = "Lclient!ln;")
	public static Class1_Sub1_Sub3_Sub2 aClass1_Sub1_Sub3_Sub2_3;

	@OriginalMember(owner = "client!to", name = "k", descriptor = "F")
	public static float aFloat52;

	@OriginalMember(owner = "client!to", name = "l", descriptor = "[I")
	public static int[] anIntArray488 = new int[5];

	@OriginalMember(owner = "client!to", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString174 = "wave:";

	@OriginalMember(owner = "client!to", name = "o", descriptor = "I")
	public static int anInt5297 = 0;

	@OriginalMember(owner = "client!to", name = "p", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray44 = new String[200];

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(II)I")
	public static int method4122(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(IIZZIII)V")
	public static void method4124(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg2) {
			Static291.method4309();
		}
		if (Static75.aFrame1 != null && (arg4 != 3 || Static191.anInt3925 != arg5 || Static63.anInt1285 != arg3)) {
			Static194.method3152(Static117.aClass117_3, Static75.aFrame1);
			Static75.aFrame1 = null;
		}
		if (arg4 == 3 && Static75.aFrame1 == null) {
			Static75.aFrame1 = Static207.method3279(0, Static117.aClass117_3, arg5, arg3);
			if (Static75.aFrame1 != null) {
				Static63.anInt1285 = arg3;
				Static191.anInt3925 = arg5;
				Static80.method1224(Static117.aClass117_3);
			}
		}
		if (arg4 == 3 && Static75.aFrame1 == null) {
			method4124(arg0, true, true, -1, Static247.anInt4901, -1);
			return;
		}
		@Pc(87) Container local87;
		if (Static75.aFrame1 != null) {
			local87 = Static75.aFrame1;
		} else if (Static78.aFrame2 == null) {
			local87 = Static117.aClass117_3.anApplet1;
		} else {
			local87 = Static78.aFrame2;
		}
		Static21.anInt417 = local87.getSize().width;
		Static302.anInt5720 = local87.getSize().height;
		@Pc(110) Insets local110;
		if (local87 == Static78.aFrame2) {
			local110 = Static78.aFrame2.getInsets();
			Static302.anInt5720 -= local110.top + local110.bottom;
			Static21.anInt417 -= local110.left + local110.right;
		}
		if (arg4 < 2) {
			Static60.anInt1203 = 0;
			Static159.anInt3348 = 765;
			Static109.anInt2179 = (Static21.anInt417 - 765) / 2;
			Static136.anInt2696 = 503;
		} else {
			Static136.anInt2696 = Static302.anInt5720;
			Static109.anInt2179 = 0;
			Static60.anInt1203 = 0;
			Static159.anInt3348 = Static21.anInt417;
		}
		if (arg1) {
			Static76.method1202(Static304.aCanvas1);
			Static62.method1050(Static304.aCanvas1);
			if (Static81.aClass129_1 != null) {
				Static81.aClass129_1.method4453(Static304.aCanvas1);
			}
			Static265.aClient1.method632();
			Static91.method1359(Static304.aCanvas1);
			Static228.method621(Static304.aCanvas1);
			if (Static81.aClass129_1 != null) {
				Static81.aClass129_1.method4450(Static304.aCanvas1);
			}
		} else {
			if (Static291.aBoolean404) {
				Static291.method4314(Static159.anInt3348, Static136.anInt2696);
			}
			Static304.aCanvas1.setSize(Static159.anInt3348, Static136.anInt2696);
			if (Static78.aFrame2 == local87) {
				local110 = Static78.aFrame2.getInsets();
				Static304.aCanvas1.setLocation(local110.left + Static109.anInt2179, local110.top - -Static60.anInt1203);
			} else {
				Static304.aCanvas1.setLocation(Static109.anInt2179, Static60.anInt1203);
			}
		}
		if (arg4 == 0 && arg0 > 0) {
			Static291.method4324(Static304.aCanvas1);
		}
		if (arg2 && arg4 > 0) {
			Static304.aCanvas1.setIgnoreRepaint(true);
			if (!Static39.aBoolean64) {
				Static260.method3909();
				Static242.aClass62_1 = null;
				Static242.aClass62_1 = Static207.method3283(Static159.anInt3348, Static136.anInt2696, Static304.aCanvas1);
				Static41.method751();
				if (Static258.anInt5016 == 5) {
					Static94.method1385(true, Static245.aClass1_Sub1_Sub12_2);
				} else {
					Static312.method4593(Static165.aString106, false);
				}
				try {
					@Pc(272) Graphics local272 = Static304.aCanvas1.getGraphics();
					Static242.aClass62_1.method4466(local272);
				} catch (@Pc(280) Exception local280) {
				}
				Static231.method3665();
				if (arg0 == 0) {
					Static242.aClass62_1 = Static207.method3283(765, 503, Static304.aCanvas1);
				} else {
					Static242.aClass62_1 = null;
				}
				@Pc(300) Class10 local300 = Static117.aClass117_3.method2992(Static265.aClient1.getClass());
				while (local300.anInt151 == 0) {
					Static202.method3246(100L);
				}
				if (local300.anInt151 == 1) {
					Static39.aBoolean64 = true;
				}
			}
			if (Static39.aBoolean64) {
				Static291.method4304(Static304.aCanvas1, Static37.anInt756 * 2);
			}
		}
		if (!Static291.aBoolean404 && arg4 > 0) {
			method4124(arg0, true, true, -1, 0, -1);
			return;
		}
		if (arg4 > 0 && arg0 == 0) {
			Static51.aThread2.setPriority(5);
			Static242.aClass62_1 = null;
			Static227.method3591();
			((Class74_Sub1) Static18.anInterface1_1).method1646(200);
			if (Static302.aBoolean419) {
				Static18.method317(0.7F);
			}
			if (Static20.aClass135ArrayArray1 == null) {
				Static20.aClass135ArrayArray1 = new Class135[13][13];
			}
			Static294.method4353();
			Static174.method2905();
			Static54.method941();
		} else if (arg4 == 0 && arg0 > 0) {
			Static51.aThread2.setPriority(1);
			Static242.aClass62_1 = Static207.method3283(765, 503, Static304.aCanvas1);
			Static227.method3592();
			Static149.method2415();
			((Class74_Sub1) Static18.anInterface1_1).method1646(20);
			if (Static302.aBoolean419) {
				if (Static287.anInt5449 == 1) {
					Static18.method317(0.9F);
				}
				if (Static287.anInt5449 == 2) {
					Static18.method317(0.8F);
				}
				if (Static287.anInt5449 == 3) {
					Static18.method317(0.7F);
				}
				if (Static287.anInt5449 == 4) {
					Static18.method317(0.6F);
				}
			}
			Static186.method3048();
			Static54.method941();
		}
		Static67.aBoolean110 = !Static62.method1046();
		Static149.method2403(Static159.anInt3348, Static136.anInt2696);
		if (arg2) {
			Static299.method4483();
		}
		if (arg4 >= 2) {
			Static128.aBoolean191 = true;
		} else {
			Static128.aBoolean191 = false;
		}
		if (Static287.anInt5450 != -1) {
			Static118.method1924(true);
		}
		if (Static81.aClass7_2 != null && (Static258.anInt5016 == 30 || Static258.anInt5016 == 25)) {
			Static237.method2934();
		}
		for (@Pc(485) int local485 = 0; local485 < 100; local485++) {
			Static132.aBooleanArray25[local485] = true;
		}
		Static311.aBoolean426 = true;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method4125(@OriginalArg(1) String arg0) {
		if (Static208.aClass31Array1 != null) {
			Static137.aClass1_Sub14_Sub1_6.method2661(33);
			Static137.aClass1_Sub14_Sub1_6.method2631(Static255.method3873(arg0));
			Static137.aClass1_Sub14_Sub1_6.method2619(arg0);
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(BI)V")
	public static void method4126(@OriginalArg(1) int arg0) {
		@Pc(16) Class1_Sub1_Sub2 local16 = Static46.method824(12, arg0);
		local16.method299();
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(I[III[I)V")
	public static void method4127(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		if (arg2 >= arg1) {
			return;
		}
		@Pc(15) int local15 = (arg1 + arg2) / 2;
		@Pc(17) int local17 = arg2;
		@Pc(21) int local21 = arg0[local15];
		arg0[local15] = arg0[arg1];
		arg0[arg1] = local21;
		@Pc(35) int local35 = arg3[local15];
		arg3[local15] = arg3[arg1];
		arg3[arg1] = local35;
		for (@Pc(47) int local47 = arg2; local47 < arg1; local47++) {
			if (local21 + (local47 & 0x1) < arg0[local47]) {
				@Pc(71) int local71 = arg0[local47];
				arg0[local47] = arg0[local17];
				arg0[local17] = local71;
				@Pc(85) int local85 = arg3[local47];
				arg3[local47] = arg3[local17];
				arg3[local17++] = local85;
			}
		}
		arg0[arg1] = arg0[local17];
		arg0[local17] = local21;
		arg3[arg1] = arg3[local17];
		arg3[local17] = local35;
		method4127(arg0, local17 - 1, arg2, arg3);
		method4127(arg0, arg1, local17 + 1, arg3);
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(IIIII)V")
	public static void method4128(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(4) Class1_Sub1_Sub2 local4 = Static46.method824(10, arg1);
		local4.method294();
		local4.anInt296 = arg0;
		local4.anInt294 = arg2;
		local4.anInt293 = arg3;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(IIII)Lclient!vn;")
	public static Class1_Sub32 method4129(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class1_Sub32 local9 = new Class1_Sub32();
		local9.anInt5722 = arg2;
		local9.anInt5716 = arg1;
		Static69.aClass156_6.method3816((long) arg0, local9);
		Static87.method1295(arg2);
		@Pc(28) Class146 local28 = Static259.method3908(arg0);
		if (local28 != null) {
			Static237.method2927(local28);
		}
		if (Static92.aClass146_7 != null) {
			Static237.method2927(Static92.aClass146_7);
			Static92.aClass146_7 = null;
		}
		@Pc(45) int local45 = Static316.anInt5941;
		@Pc(53) int local53;
		for (local53 = 0; local53 < local45; local53++) {
			if (method4132(Static241.aShortArray76[local53])) {
				Static109.method1790(local53);
			}
		}
		if (Static316.anInt5941 == 1) {
			Static108.aBoolean161 = false;
			Static94.method1387(Static78.anInt1455, Static143.anInt2824, Static44.anInt848, Static66.anInt1303);
		} else {
			Static94.method1387(Static78.anInt1455, Static143.anInt2824, Static44.anInt848, Static66.anInt1303);
			local53 = Static245.aClass1_Sub1_Sub12_2.method4438(Static143.aString98);
			for (@Pc(91) int local91 = 0; local91 < Static316.anInt5941; local91++) {
				@Pc(104) int local104 = Static245.aClass1_Sub1_Sub12_2.method4438(Static190.method3114(local91));
				if (local53 < local104) {
					local53 = local104;
				}
			}
			Static66.anInt1303 = (Static37.aBoolean62 ? 26 : 22) + Static316.anInt5941 * 15;
			Static44.anInt848 = local53 + 8;
		}
		if (local28 != null) {
			Static45.method813(false, local28);
		}
		Static55.method966(arg2);
		if (Static287.anInt5450 != -1) {
			Static86.method1270(1, Static287.anInt5450);
		}
		return local9;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method4130(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + Static15.method208("\n", "%0a", arg0));
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "([[I[[B[[F[[B[[B[[B[[F[[FB[[I[[[BI)[Lclient!nk;")
	public static Class1_Sub20[] method4131(@OriginalArg(0) int[][] arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) float[][] arg2, @OriginalArg(3) byte[][] arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) byte[][] arg5, @OriginalArg(6) float[][] arg6, @OriginalArg(7) float[][] arg7, @OriginalArg(9) int[][] arg8, @OriginalArg(10) byte[][][] arg9, @OriginalArg(11) int arg10) {
		@Pc(10) Class156 local10 = new Class156(128);
		@Pc(12) int local12;
		@Pc(17) int local17;
		@Pc(28) int local28;
		@Pc(36) int local36;
		@Pc(130) int local130;
		@Pc(134) int local134;
		@Pc(144) int local144;
		@Pc(154) int local154;
		@Pc(164) int local164;
		@Pc(198) int local198;
		@Pc(176) int local176;
		@Pc(188) int local188;
		@Pc(222) int local222;
		@Pc(210) int local210;
		@Pc(260) byte local260;
		@Pc(282) int local282;
		@Pc(308) int local308;
		@Pc(123) int local123;
		@Pc(132) int local132;
		@Pc(771) int local771;
		@Pc(1023) int local1023;
		@Pc(1056) boolean[] local1056;
		@Pc(1078) boolean[] local1078;
		@Pc(1069) boolean[] local1069;
		for (local12 = 1; local12 <= 102; local12++) {
			for (local17 = 1; local17 <= 102; local17++) {
				local28 = arg5[local12][local17] & 0xFF;
				local36 = arg4[local12][local17] & 0xFF;
				if (local36 != 0) {
					@Pc(48) Class59 local48 = Static229.method3600(local36 - 1);
					if (local48.anInt1520 == -1) {
						continue;
					}
					@Pc(61) Class1_Sub20 local61 = Static124.method2001(local48, local10);
					@Pc(67) byte local67 = arg1[local12][local17];
					@Pc(71) int[] local71 = Static114.anIntArrayArray14[local67];
					local61.anInt3742 += local71.length / 2;
					local61.anInt3737++;
					if (local48.aBoolean119 && local28 != 0) {
						local61.anInt3742 += Static316.anIntArray537[local67];
					}
				}
				if ((arg5[local12][local17] & 0xFF) != 0 || local36 != 0 && arg1[local12][local17] == 0) {
					local123 = 0;
					@Pc(126) int[] local126 = new int[8];
					@Pc(128) int local128 = 0;
					local130 = 0;
					local132 = 0;
					local134 = 0;
					local144 = arg4[local12][local17 + 1] & 0xFF;
					local154 = arg4[local12 - 1][local17] & 0xFF;
					local164 = arg4[local12][local17 - 1] & 0xFF;
					local176 = arg4[local12 - 1][local17 + 1] & 0xFF;
					local188 = arg4[local12 - 1][local17 - 1] & 0xFF;
					local198 = arg4[local12 + 1][local17] & 0xFF;
					local210 = arg4[local12 + 1][local17 + 1] & 0xFF;
					local222 = arg4[local12 + 1][local17 - 1] & 0xFF;
					@Pc(241) Class59 local241;
					@Pc(270) byte local270;
					@Pc(294) int local294;
					if (local176 != 0 && local36 != local176) {
						local241 = Static229.method3600(local176 - 1);
						if (local241.aBoolean119 && local241.anInt1520 != -1) {
							local260 = arg1[local12 - 1][local17 + 1];
							local270 = arg3[local12 - 1][local17 + 1];
							local282 = Static68.anIntArray109[local260 * 4 + (local270 + 3 & 0x3)];
							local294 = Static68.anIntArray109[(local270 + 2 & 0x3) + local260 * 4];
							if (!Static93.aBooleanArrayArray2[local282][1] || !Static93.aBooleanArrayArray2[local294][0]) {
								for (local308 = 0; local308 < 8; local308++) {
									if (local308 == 0) {
										local123++;
										local126[0] = local176;
										break;
									}
									if (local176 == local126[local308]) {
										break;
									}
								}
							}
						}
					}
					if (local188 != 0 && local36 != local188) {
						local241 = Static229.method3600(local188 - 1);
						if (local241.aBoolean119 && local241.anInt1520 != -1) {
							local270 = arg3[local12 - 1][local17 - 1];
							local260 = arg1[local12 - 1][local17 - 1];
							local294 = Static68.anIntArray109[local260 * 4 + (local270 & 0x3)];
							local282 = Static68.anIntArray109[local260 * 4 + (local270 + 3 & 0x3)];
							if (!Static93.aBooleanArrayArray2[local294][1] || !Static93.aBooleanArrayArray2[local282][0]) {
								for (local308 = 0; local308 < 8; local308++) {
									if (local308 == local123) {
										local126[local123++] = local188;
										break;
									}
									if (local126[local308] == local188) {
										break;
									}
								}
							}
						}
					}
					if (local222 != 0 && local36 != local222) {
						local241 = Static229.method3600(local222 - 1);
						if (local241.aBoolean119 && local241.anInt1520 != -1) {
							local270 = arg3[local12 + 1][local17 - 1];
							local260 = arg1[local12 + 1][local17 - 1];
							local282 = Static68.anIntArray109[local260 * 4 + (local270 + 1 & 0x3)];
							local294 = Static68.anIntArray109[local260 * 4 + (local270 & 0x3)];
							if (!Static93.aBooleanArrayArray2[local282][1] || !Static93.aBooleanArrayArray2[local294][0]) {
								for (local308 = 0; local308 < 8; local308++) {
									if (local308 == local123) {
										local126[local123++] = local222;
										break;
									}
									if (local126[local308] == local222) {
										break;
									}
								}
							}
						}
					}
					if (local210 != 0 && local210 != local36) {
						local241 = Static229.method3600(local210 - 1);
						if (local241.aBoolean119 && local241.anInt1520 != -1) {
							local270 = arg3[local12 + 1][local17 + 1];
							local260 = arg1[local12 + 1][local17 + 1];
							local282 = Static68.anIntArray109[(local270 + 1 & 0x3) + local260 * 4];
							local294 = Static68.anIntArray109[(local270 + 2 & 0x3) + local260 * 4];
							if (!Static93.aBooleanArrayArray2[local294][1] || !Static93.aBooleanArrayArray2[local282][0]) {
								for (local308 = 0; local308 < 8; local308++) {
									if (local308 == local123) {
										local126[local123++] = local210;
										break;
									}
									if (local210 == local126[local308]) {
										break;
									}
								}
							}
						}
					}
					if (local144 != 0 && local36 != local144) {
						local241 = Static229.method3600(local144 - 1);
						if (local241.aBoolean119 && local241.anInt1520 != -1) {
							local128 = Static68.anIntArray109[arg1[local12][local17 + 1] * 4 + (arg3[local12][local17 + 1] + 2 & 0x3)];
							for (local771 = 0; local771 < 8; local771++) {
								if (local771 == local123) {
									local126[local123++] = local144;
									break;
								}
								if (local126[local771] == local144) {
									break;
								}
							}
						}
					}
					if (local154 != 0 && local154 != local36) {
						local241 = Static229.method3600(local154 - 1);
						if (local241.aBoolean119 && local241.anInt1520 != -1) {
							local132 = Static68.anIntArray109[(arg3[local12 - 1][local17] + 3 & 0x3) + arg1[local12 - 1][local17] * 4];
							for (local771 = 0; local771 < 8; local771++) {
								if (local123 == local771) {
									local126[local123++] = local154;
									break;
								}
								if (local154 == local126[local771]) {
									break;
								}
							}
						}
					}
					if (local164 != 0 && local36 != local164) {
						local241 = Static229.method3600(local164 - 1);
						if (local241.aBoolean119 && local241.anInt1520 != -1) {
							local130 = Static68.anIntArray109[arg1[local12][local17 - 1] * 4 + (arg3[local12][local17 - 1] & 0x3)];
							for (local771 = 0; local771 < 8; local771++) {
								if (local123 == local771) {
									local126[local123++] = local164;
									break;
								}
								if (local164 == local126[local771]) {
									break;
								}
							}
						}
					}
					if (local198 != 0 && local198 != local36) {
						local241 = Static229.method3600(local198 - 1);
						if (local241.aBoolean119 && local241.anInt1520 != -1) {
							local134 = Static68.anIntArray109[(arg3[local12 + 1][local17] + 1 & 0x3) + arg1[local12 + 1][local17] * 4];
							for (local771 = 0; local771 < 8; local771++) {
								if (local123 == local771) {
									local126[local123++] = local198;
									break;
								}
								if (local126[local771] == local198) {
									break;
								}
							}
						}
					}
					for (local1023 = 0; local1023 < local123; local1023++) {
						local771 = local126[local1023];
						@Pc(1043) boolean[] local1043 = Static93.aBooleanArrayArray2[local771 == local144 ? local128 : 0];
						local1056 = Static93.aBooleanArrayArray2[local771 == local154 ? local132 : 0];
						local1069 = Static93.aBooleanArrayArray2[local198 == local771 ? local134 : 0];
						local1078 = Static93.aBooleanArrayArray2[local771 == local164 ? local130 : 0];
						@Pc(1086) Class59 local1086 = Static229.method3600(local771 - 1);
						@Pc(1091) Class1_Sub20 local1091 = Static124.method2001(local1086, local10);
						local1091.anInt3742 += 5;
						local1091.anInt3742 += local1043.length - 2;
						local1091.anInt3742 += local1056.length - 2;
						local1091.anInt3742 += local1078.length - 2;
						local1091.anInt3742 += local1069.length - 2;
						local1091.anInt3737++;
					}
				}
			}
		}
		@Pc(1153) Class1_Sub20 local1153;
		for (local1153 = (Class1_Sub20) local10.method3822(); local1153 != null; local1153 = (Class1_Sub20) local10.method3820()) {
			local1153.method3050();
		}
		for (local12 = 1; local12 <= 102; local12++) {
			for (local17 = 1; local17 <= 102; local17++) {
				local36 = arg5[local12][local17] & 0xFF;
				if ((arg9[arg10][local12][local17] & 0x8) != 0) {
					local28 = 0;
				} else if ((arg9[1][local12][local17] & 0x2) == 2 && arg10 > 0) {
					local28 = arg10 - 1;
				} else {
					local28 = arg10;
				}
				local123 = arg4[local12][local17] & 0xFF;
				if (local123 != 0) {
					@Pc(1247) Class59 local1247 = Static229.method3600(local123 - 1);
					if (local1247.anInt1520 == -1) {
						continue;
					}
					@Pc(1258) Class1_Sub20 local1258 = Static124.method2001(local1247, local10);
					@Pc(1264) byte local1264 = arg1[local12][local17];
					@Pc(1270) byte local1270 = arg3[local12][local17];
					local134 = Static90.method3656(local1247.anInt1520, arg8[local12][local17], local1247.anInt1514);
					local144 = Static90.method3656(local1247.anInt1520, arg8[local12 + 1][local17], local1247.anInt1514);
					local154 = Static90.method3656(local1247.anInt1520, arg8[local12 + 1][local17 + 1], local1247.anInt1514);
					local164 = Static90.method3656(local1247.anInt1520, arg8[local12][local17 + 1], local1247.anInt1514);
					Static30.method527(local164, local36 != 0 && local1247.aBoolean119, local1258, local28, local134, local154, arg2, local1270, arg7, local1264, arg0, local144, arg6, local12, local17);
				}
				if ((arg5[local12][local17] & 0xFF) != 0 || local123 != 0 && arg1[local12][local17] == 0) {
					@Pc(1374) int local1374 = 0;
					@Pc(1377) int[] local1377 = new int[8];
					local132 = 0;
					local130 = 0;
					local144 = 0;
					local154 = arg4[local12][local17 + 1] & 0xFF;
					local134 = 0;
					local176 = arg4[local12 + 1][local17] & 0xFF;
					local164 = arg4[local12 - 1][local17] & 0xFF;
					local188 = arg4[local12 - 1][local17 + 1] & 0xFF;
					local198 = arg4[local12][local17 - 1] & 0xFF;
					local222 = arg4[local12 - 1][local17 - 1] & 0xFF;
					local210 = arg4[local12 + 1][local17 - 1] & 0xFF;
					local1023 = arg4[local12 + 1][local17 + 1] & 0xFF;
					@Pc(1503) byte local1503;
					@Pc(1484) Class59 local1484;
					@Pc(1552) int local1552;
					if (local188 == 0 || local123 == local188) {
						local188 = 0;
					} else {
						local1484 = Static229.method3600(local188 - 1);
						if (local1484.aBoolean119 && local1484.anInt1520 != -1) {
							local1503 = arg1[local12 - 1][local17 + 1];
							local260 = arg3[local12 - 1][local17 + 1];
							local308 = Static68.anIntArray109[local1503 * 4 + (local260 + 3 & 0x3)];
							local282 = Static68.anIntArray109[(local260 + 2 & 0x3) + local1503 * 4];
							if (Static93.aBooleanArrayArray2[local308][1] && Static93.aBooleanArrayArray2[local282][0]) {
								local188 = 0;
							} else {
								for (local1552 = 0; local1552 < 8; local1552++) {
									if (local1552 == 0) {
										local1374++;
										local1377[0] = local188;
										break;
									}
									if (local1377[local1552] == local188) {
										break;
									}
								}
							}
						} else {
							local188 = 0;
						}
					}
					if (local222 == 0 || local123 == local222) {
						local222 = 0;
					} else {
						local1484 = Static229.method3600(local222 - 1);
						if (local1484.aBoolean119 && local1484.anInt1520 != -1) {
							local260 = arg3[local12 - 1][local17 - 1];
							local1503 = arg1[local12 - 1][local17 - 1];
							local282 = Static68.anIntArray109[local1503 * 4 + (local260 & 0x3)];
							local308 = Static68.anIntArray109[(local260 + 3 & 0x3) + local1503 * 4];
							if (Static93.aBooleanArrayArray2[local282][1] && Static93.aBooleanArrayArray2[local308][0]) {
								local222 = 0;
							} else {
								for (local1552 = 0; local1552 < 8; local1552++) {
									if (local1552 == local1374) {
										local1377[local1374++] = local222;
										break;
									}
									if (local222 == local1377[local1552]) {
										break;
									}
								}
							}
						} else {
							local222 = 0;
						}
					}
					if (local210 == 0 || local210 == local123) {
						local210 = 0;
					} else {
						local1484 = Static229.method3600(local210 - 1);
						if (local1484.aBoolean119 && local1484.anInt1520 != -1) {
							local1503 = arg1[local12 + 1][local17 - 1];
							local260 = arg3[local12 + 1][local17 - 1];
							local282 = Static68.anIntArray109[(local260 & 0x3) + local1503 * 4];
							local308 = Static68.anIntArray109[(local260 + 1 & 0x3) + local1503 * 4];
							if (Static93.aBooleanArrayArray2[local308][1] && Static93.aBooleanArrayArray2[local282][0]) {
								local210 = 0;
							} else {
								for (local1552 = 0; local1552 < 8; local1552++) {
									if (local1552 == local1374) {
										local1377[local1374++] = local210;
										break;
									}
									if (local1377[local1552] == local210) {
										break;
									}
								}
							}
						} else {
							local210 = 0;
						}
					}
					if (local1023 == 0 || local1023 == local123) {
						local1023 = 0;
					} else {
						local1484 = Static229.method3600(local1023 - 1);
						if (local1484.aBoolean119 && local1484.anInt1520 != -1) {
							local260 = arg3[local12 + 1][local17 + 1];
							local1503 = arg1[local12 + 1][local17 + 1];
							local282 = Static68.anIntArray109[(local260 + 2 & 0x3) + local1503 * 4];
							local308 = Static68.anIntArray109[(local260 + 1 & 0x3) + local1503 * 4];
							if (Static93.aBooleanArrayArray2[local282][1] && Static93.aBooleanArrayArray2[local308][0]) {
								local1023 = 0;
							} else {
								for (local1552 = 0; local1552 < 8; local1552++) {
									if (local1552 == local1374) {
										local1377[local1374++] = local1023;
										break;
									}
									if (local1023 == local1377[local1552]) {
										break;
									}
								}
							}
						} else {
							local1023 = 0;
						}
					}
					@Pc(1997) int local1997;
					if (local154 != 0 && local154 != local123) {
						local1484 = Static229.method3600(local154 - 1);
						if (local1484.aBoolean119 && local1484.anInt1520 != -1) {
							local132 = Static68.anIntArray109[(arg3[local12][local17 + 1] + 2 & 0x3) + arg1[local12][local17 + 1] * 4];
							for (local1997 = 0; local1997 < 8; local1997++) {
								if (local1997 == local1374) {
									local1377[local1374++] = local154;
									break;
								}
								if (local154 == local1377[local1997]) {
									break;
								}
							}
						}
					}
					if (local164 != 0 && local164 != local123) {
						local1484 = Static229.method3600(local164 - 1);
						if (local1484.aBoolean119 && local1484.anInt1520 != -1) {
							local130 = Static68.anIntArray109[(arg3[local12 - 1][local17] + 3 & 0x3) + arg1[local12 - 1][local17] * 4];
							for (local1997 = 0; local1997 < 8; local1997++) {
								if (local1374 == local1997) {
									local1377[local1374++] = local164;
									break;
								}
								if (local164 == local1377[local1997]) {
									break;
								}
							}
						}
					}
					if (local198 != 0 && local123 != local198) {
						local1484 = Static229.method3600(local198 - 1);
						if (local1484.aBoolean119 && local1484.anInt1520 != -1) {
							local134 = Static68.anIntArray109[(arg3[local12][local17 - 1] & 0x3) + arg1[local12][local17 - 1] * 4];
							for (local1997 = 0; local1997 < 8; local1997++) {
								if (local1374 == local1997) {
									local1377[local1374++] = local198;
									break;
								}
								if (local1377[local1997] == local198) {
									break;
								}
							}
						}
					}
					if (local176 != 0 && local123 != local176) {
						local1484 = Static229.method3600(local176 - 1);
						if (local1484.aBoolean119 && local1484.anInt1520 != -1) {
							local144 = Static68.anIntArray109[(arg3[local12 + 1][local17] + 1 & 0x3) + arg1[local12 + 1][local17] * 4];
							for (local1997 = 0; local1997 < 8; local1997++) {
								if (local1374 == local1997) {
									local1377[local1374++] = local176;
									break;
								}
								if (local176 == local1377[local1997]) {
									break;
								}
							}
						}
					}
					for (local771 = 0; local771 < local1374; local771++) {
						local1997 = local1377[local771];
						local1056 = Static93.aBooleanArrayArray2[local1997 == local154 ? local132 : 0];
						local1078 = Static93.aBooleanArrayArray2[local164 == local1997 ? local130 : 0];
						@Pc(2299) boolean[] local2299 = Static93.aBooleanArrayArray2[local176 == local1997 ? local144 : 0];
						local1069 = Static93.aBooleanArrayArray2[local198 == local1997 ? local134 : 0];
						@Pc(2314) Class59 local2314 = Static229.method3600(local1997 - 1);
						@Pc(2321) Class1_Sub20 local2321 = Static124.method2001(local2314, local10);
						@Pc(2337) int local2337 = Static90.method3656(local2314.anInt1520, arg8[local12][local17], local2314.anInt1514) << 8 | 0xFF;
						@Pc(2355) int local2355 = Static90.method3656(local2314.anInt1520, arg8[local12 + 1][local17], local2314.anInt1514) << 8 | 0xFF;
						@Pc(2375) int local2375 = Static90.method3656(local2314.anInt1520, arg8[local12 + 1][local17 + 1], local2314.anInt1514) << 8 | 0xFF;
						@Pc(2393) int local2393 = Static90.method3656(local2314.anInt1520, arg8[local12][local17 + 1], local2314.anInt1514) << 8 | 0xFF;
						@Pc(2402) int local2402 = local1056.length + 6 - 2;
						@Pc(2409) int local2409 = local2402 + local1078.length - 2;
						@Pc(2424) boolean local2424 = local188 != local1997 && local1078[0] && local1056[1];
						@Pc(2443) boolean local2443 = local222 != local1997 && local1069[0] && local1078[1];
						@Pc(2462) boolean local2462 = local1023 != local1997 && local1056[0] && local2299[1];
						@Pc(2477) boolean local2477 = local210 != local1997 && local2299[0] && local1069[1];
						@Pc(2484) int local2484 = local2409 + local1069.length - 2;
						@Pc(2491) int local2491 = local2484 + local2299.length - 2;
						@Pc(2512) int local2512 = Static97.method1399(0, true, arg7, arg2, 0.0F, local2321, arg6, local2393, arg0, local17, 64, null, 64, local2375, local2337, local2355, local12);
						@Pc(2515) int[] local2515 = new int[local2491];
						@Pc(2536) int local2536 = Static97.method1399(0, local2424, arg7, arg2, 0.0F, local2321, arg6, local2393, arg0, local17, 0, null, 128, local2375, local2337, local2355, local12);
						@Pc(2538) byte local2538 = 0;
						@Pc(2559) int local2559 = Static97.method1399(0, local2462, arg7, arg2, 0.0F, local2321, arg6, local2393, arg0, local17, 128, null, 128, local2375, local2337, local2355, local12);
						@Pc(2580) int local2580 = Static97.method1399(0, local2443, arg7, arg2, 0.0F, local2321, arg6, local2393, arg0, local17, 0, null, 0, local2375, local2337, local2355, local12);
						@Pc(2601) int local2601 = Static97.method1399(0, local2477, arg7, arg2, 0.0F, local2321, arg6, local2393, arg0, local17, 128, null, 0, local2375, local2337, local2355, local12);
						@Pc(2604) int local2604 = local2538 + 1;
						local2515[0] = local2512;
						@Pc(2609) int local2609 = local2604 + 1;
						local2515[1] = local2559;
						if (local1056.length > 2) {
							local2609++;
							local2515[2] = Static97.method1399(0, local1056[2], arg7, arg2, 0.0F, local2321, arg6, local2393, arg0, local17, 64, null, 128, local2375, local2337, local2355, local12);
						}
						local2515[local2609++] = local2536;
						if (local1078.length > 2) {
							local2515[local2609++] = Static97.method1399(0, local1078[2], arg7, arg2, 0.0F, local2321, arg6, local2393, arg0, local17, 0, null, 64, local2375, local2337, local2355, local12);
						}
						local2515[local2609++] = local2580;
						if (local1069.length > 2) {
							local2515[local2609++] = Static97.method1399(0, local1069[2], arg7, arg2, 0.0F, local2321, arg6, local2393, arg0, local17, 64, null, 0, local2375, local2337, local2355, local12);
						}
						local2515[local2609++] = local2601;
						if (local2299.length > 2) {
							local2515[local2609++] = Static97.method1399(0, local2299[2], arg7, arg2, 0.0F, local2321, arg6, local2393, arg0, local17, 128, null, 64, local2375, local2337, local2355, local12);
						}
						local2515[local2609++] = local2559;
						local2321.method3046(local28, local12, local17, local2515, null, true);
					}
				}
			}
		}
		for (local1153 = (Class1_Sub20) local10.method3822(); local1153 != null; local1153 = (Class1_Sub20) local10.method3820()) {
			if (local1153.anInt3739 == 0) {
				local1153.method4616();
			} else {
				local1153.method3047();
			}
		}
		local12 = local10.method3825();
		@Pc(2809) long[] local2809 = new long[local12];
		@Pc(2812) Class1_Sub20[] local2812 = new Class1_Sub20[local12];
		local10.method3819(local2812);
		for (local36 = 0; local36 < local12; local36++) {
			local2809[local36] = local2812[local36].aLong223;
		}
		Static201.method3239(local2812, local2809);
		return local2812;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(SB)Z")
	public static boolean method4132(@OriginalArg(0) short arg0) {
		if (arg0 == 2 || arg0 == 34 || arg0 == 22 || arg0 == 17 || arg0 == 58 || arg0 == 50 || arg0 == 8 || arg0 == 7) {
			return true;
		} else if (arg0 == 19 || arg0 == 49 || arg0 == 1008 || arg0 == 1004) {
			return true;
		} else if (arg0 == 21 || arg0 == 20 || arg0 == 26 || arg0 == 45 || arg0 == 35) {
			return true;
		} else {
			return arg0 == 1 || arg0 == 37 || arg0 == 46 || arg0 == 60 || arg0 == 42 || arg0 == 47;
		}
	}
}
