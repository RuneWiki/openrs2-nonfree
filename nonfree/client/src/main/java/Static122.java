import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!hl", name = "i", descriptor = "Lclient!fl;")
	public static Class5_Sub16_Sub1 aClass5_Sub16_Sub1_2;

	@OriginalMember(owner = "client!hl", name = "r", descriptor = "[I")
	public static final int[] anIntArray221 = new int[14];

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IILclient!sm;)V")
	public static void method2138(@OriginalArg(2) Class5_Sub12_Sub2 arg0) {
		while (true) {
			@Pc(18) Class5_Sub39 local18 = (Class5_Sub39) Static338.aClass103_164.method2756();
			if (local18 == null) {
				return;
			}
			@Pc(23) boolean local23 = false;
			for (@Pc(25) int local25 = 0; local25 < local18.anInt5905; local25++) {
				if (local18.aClass16Array2[local25] != null) {
					if (local18.aClass16Array2[local25].anInt381 == 2) {
						local18.anIntArray572[local25] = -5;
					}
					if (local18.aClass16Array2[local25].anInt381 == 0) {
						local23 = true;
					}
				}
				if (local18.aClass16Array1[local25] != null) {
					if (local18.aClass16Array1[local25].anInt381 == 2) {
						local18.anIntArray572[local25] = -6;
					}
					if (local18.aClass16Array1[local25].anInt381 == 0) {
						local23 = true;
					}
				}
			}
			if (local23) {
				return;
			}
			arg0.method5125(128);
			arg0.method5089(0);
			@Pc(106) int local106 = arg0.anInt5731;
			arg0.method5070(local18.anInt5903);
			for (@Pc(113) int local113 = 0; local113 < local18.anInt5905; local113++) {
				if (local18.anIntArray572[local113] == 0) {
					try {
						@Pc(137) int local137 = local18.anIntArray574[local113];
						@Pc(146) Field local146;
						@Pc(150) int local150;
						if (local137 == 0) {
							local146 = (Field) local18.aClass16Array2[local113].anObject1;
							local150 = local146.getInt(null);
							arg0.method5089(0);
							arg0.method5070(local150);
						} else if (local137 == 1) {
							local146 = (Field) local18.aClass16Array2[local113].anObject1;
							local146.setInt(null, local18.anIntArray573[local113]);
							arg0.method5089(0);
						} else if (local137 == 2) {
							local146 = (Field) local18.aClass16Array2[local113].anObject1;
							local150 = local146.getModifiers();
							arg0.method5089(0);
							arg0.method5070(local150);
						}
						@Pc(223) Method local223;
						if (local137 == 3) {
							local223 = (Method) local18.aClass16Array1[local113].anObject1;
							@Pc(248) byte[][] local248 = local18.aByteArrayArrayArray14[local113];
							@Pc(252) Object[] local252 = new Object[local248.length];
							for (@Pc(254) int local254 = 0; local254 < local248.length; local254++) {
								@Pc(266) ObjectInputStream local266 = new ObjectInputStream(new ByteArrayInputStream(local248[local254]));
								local252[local254] = local266.readObject();
							}
							@Pc(281) Object local281 = local223.invoke(null, local252);
							if (local281 == null) {
								arg0.method5089(0);
							} else if (local281 instanceof Number) {
								arg0.method5089(1);
								arg0.method5065(((Number) local281).longValue());
							} else if (local281 instanceof String) {
								arg0.method5089(2);
								arg0.method5094((String) local281);
							} else {
								arg0.method5089(4);
							}
						} else if (local137 == 4) {
							local223 = (Method) local18.aClass16Array1[local113].anObject1;
							local150 = local223.getModifiers();
							arg0.method5089(0);
							arg0.method5070(local150);
						}
					} catch (@Pc(324) ClassNotFoundException local324) {
						arg0.method5089(-10);
					} catch (@Pc(330) InvalidClassException local330) {
						arg0.method5089(-11);
					} catch (@Pc(336) StreamCorruptedException local336) {
						arg0.method5089(-12);
					} catch (@Pc(342) OptionalDataException local342) {
						arg0.method5089(-13);
					} catch (@Pc(348) IllegalAccessException local348) {
						arg0.method5089(-14);
					} catch (@Pc(354) IllegalArgumentException local354) {
						arg0.method5089(-15);
					} catch (@Pc(360) InvocationTargetException local360) {
						arg0.method5089(-16);
					} catch (@Pc(366) SecurityException local366) {
						arg0.method5089(-17);
					} catch (@Pc(372) IOException local372) {
						arg0.method5089(-18);
					} catch (@Pc(378) NullPointerException local378) {
						arg0.method5089(-19);
					} catch (@Pc(384) Exception local384) {
						arg0.method5089(-20);
					} catch (@Pc(390) Throwable local390) {
						arg0.method5089(-21);
					}
				} else {
					arg0.method5089(local18.anIntArray572[local113]);
				}
			}
			arg0.method5083(local106);
			arg0.method5111(arg0.anInt5731 - local106);
			local18.method6005();
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIIIBII)I")
	public static int method2142(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(8) int local8 = arg3 & 0x3;
		if ((arg0 & 0x1) == 1) {
			@Pc(19) int local19 = arg5;
			arg5 = arg2;
			arg2 = local19;
		}
		if (local8 == 0) {
			return arg4;
		} else if (local8 == 1) {
			return 1 + 7 - arg5 - arg1;
		} else if (local8 == 2) {
			return 1 + 7 - arg2 - arg4;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(ZILjava/lang/String;)V")
	public static void method2146(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1) {
		if (Static351.anInt6735 == 0 && Static262.anInt5151 < 2) {
			return;
		}
		if (arg1.equalsIgnoreCase("errortest")) {
			throw new RuntimeException();
		}
		try {
			if (arg1.equalsIgnoreCase("fpson")) {
				Static320.aBoolean515 = true;
			}
			if (arg1.equalsIgnoreCase("fpsoff")) {
				Static320.aBoolean515 = false;
			}
			if (arg1.equalsIgnoreCase("cls")) {
				Static247.anInt4947 = 0;
				Static175.anInt2812 = 0;
			}
			if (arg1.equalsIgnoreCase("cleartext")) {
				Static155.aClass39_4.method802();
			}
			@Pc(60) int local60;
			@Pc(70) Runtime local70;
			@Pc(80) int local80;
			if (arg1.equalsIgnoreCase("gc")) {
				Static141.method2507();
				for (local60 = 0; local60 < 10; local60++) {
					System.gc();
				}
				local70 = Runtime.getRuntime();
				local80 = (int) ((local70.totalMemory() - local70.freeMemory()) / 1024L);
				Static219.method4009("mem=" + local80 + "k");
			}
			if (arg1.equalsIgnoreCase("compact")) {
				Static141.method2507();
				for (local60 = 0; local60 < 10; local60++) {
					System.gc();
				}
				local70 = Runtime.getRuntime();
				local80 = (int) ((local70.totalMemory() - local70.freeMemory()) / 1024L);
				Static219.method4009("Memory before cleanup=" + local80 + "k");
				Static338.method6004();
				Static141.method2507();
				for (@Pc(135) int local135 = 0; local135 < 10; local135++) {
					System.gc();
				}
				local80 = (int) ((local70.totalMemory() - local70.freeMemory()) / 1024L);
				Static219.method4009("Memory after cleanup=" + local80 + "k");
			}
			if (arg1.equalsIgnoreCase("pcachesize")) {
				Static219.method4009("Number of player models in cache:" + Static124.method2197());
			}
			if (arg1.equalsIgnoreCase("clientdrop")) {
				if (Static278.anInt5495 == 30) {
					Static345.method5915();
				} else if (Static278.anInt5495 == 25) {
					Static76.aBoolean101 = true;
				}
			}
			if (arg1.equalsIgnoreCase("clientjs5drop")) {
				Static170.aClass162_2.method4444();
			}
			if (arg1.equalsIgnoreCase("serverjs5drop")) {
				Static170.aClass162_2.method4452();
			}
			if (arg1.equalsIgnoreCase("breakcon")) {
				Static182.aClass139_5.method3879();
				Static155.aClass41_18.method824();
				Static170.aClass162_2.method4443();
			}
			if (arg1.equalsIgnoreCase("rebuild")) {
				Static300.method5273();
				Static309.method5417();
			}
			if (arg1.equalsIgnoreCase("wm1")) {
				Static198.method3483(-1, false, -1, 1);
			}
			if (arg1.equalsIgnoreCase("wm2")) {
				Static198.method3483(-1, false, -1, 2);
			}
			if (arg1.equalsIgnoreCase("::wm3")) {
				Static198.method3483(768, false, 1024, 3);
			}
			if (arg1.equalsIgnoreCase("tk0")) {
				Static144.method2633(0);
				Static254.anInt5030 = 0;
				Static72.method1328(Static182.aClass139_5);
				Static157.aBoolean232 = false;
			}
			if (arg1.equalsIgnoreCase("tk1")) {
				Static144.method2633(1);
				Static254.anInt5030 = 1;
				Static72.method1328(Static182.aClass139_5);
				Static157.aBoolean232 = false;
			}
			if (arg1.equalsIgnoreCase("tk2")) {
				Static144.method2633(2);
				Static254.anInt5030 = 2;
				Static72.method1328(Static182.aClass139_5);
				Static157.aBoolean232 = false;
			}
			if (arg1.equalsIgnoreCase("tk3")) {
				Static144.method2633(3);
			}
			if (arg1.equalsIgnoreCase("ot")) {
				Static306.aBoolean497 = !Static306.aBoolean497;
				Static72.method1328(Static182.aClass139_5);
				Static157.aBoolean232 = false;
				Static300.method5273();
			}
			if (arg1.equalsIgnoreCase("gb")) {
				Static326.aBoolean530 = !Static326.aBoolean530;
				Static72.method1328(Static182.aClass139_5);
				Static157.aBoolean232 = false;
				Static300.method5273();
			}
			if (arg1.startsWith("shadows ")) {
				Static95.anInt1828 = Static36.method580(arg1.substring(8));
				Static72.method1328(Static182.aClass139_5);
				Static157.aBoolean232 = false;
				Static300.method5273();
			}
			if (arg1.startsWith("setba")) {
				Static161.anInt3186 = Static36.method580(arg1.substring(6));
				Static72.method1328(Static182.aClass139_5);
				Static157.aBoolean232 = false;
			}
			if (arg1.startsWith("setparticles")) {
				Static229.method4132(Static36.method580(arg1.substring(13)));
				Static72.method1328(Static182.aClass139_5);
				Static157.aBoolean232 = false;
			}
			if (arg1.startsWith("fps ") && Static351.anInt6735 != 0) {
				Static95.method1733(Static36.method580(arg1.substring(4)));
			}
			if (arg1.startsWith("rect_debug")) {
				Static159.anInt3164 = Static36.method580(arg1.substring(10).trim());
				Static219.method4009("rect_debug=" + Static159.anInt3164);
			}
			if (arg1.equalsIgnoreCase("qa_op_test")) {
				Static346.aBoolean577 = true;
			}
			if (arg1.equalsIgnoreCase("clipcomponents")) {
				Static166.aBoolean259 = !Static166.aBoolean259;
				Static219.method4009("clipcomponents=" + Static166.aBoolean259);
			}
			if (arg1.startsWith("bloom")) {
				@Pc(470) boolean local470 = Static236.aClass55_9.method5247();
				if (!Static32.method558(!local470)) {
					Static219.method4009("Failed to enable bloom");
				} else if (local470) {
					Static219.method4009("Bloom disabled");
				} else {
					Static219.method4009("Bloom enabled");
				}
			}
			if (arg1.equalsIgnoreCase("tween")) {
				if (Static85.aBoolean108) {
					Static85.aBoolean108 = false;
					Static219.method4009("Forced tweening disabled.");
				} else {
					Static85.aBoolean108 = true;
					Static219.method4009("Forced tweening ENABLED!");
				}
			}
			if (arg1.equalsIgnoreCase("shiftclick")) {
				if (Static317.aBoolean513) {
					Static219.method4009("Shift-click disabled.");
					Static317.aBoolean513 = false;
				} else {
					Static219.method4009("Shift-click ENABLED!");
					Static317.aBoolean513 = true;
				}
			}
			if (arg1.equalsIgnoreCase("getcgcoord")) {
				Static219.method4009("x:" + (Static192.aClass4_Sub5_Sub2_Sub1_2.anInt6631 >> 7) + " z:" + (Static192.aClass4_Sub5_Sub2_Sub1_2.anInt6632 >> 7));
			}
			if (arg1.equalsIgnoreCase("getheight")) {
				Static219.method4009("Height: " + Static8.aClass51Array1[Static239.anInt4811].method1856(Static192.aClass4_Sub5_Sub2_Sub1_2.anInt6631 >> 7, Static192.aClass4_Sub5_Sub2_Sub1_2.anInt6632 >> 7));
			}
			if (arg1.equalsIgnoreCase("resetminimap")) {
				Static244.aClass93_93.method2412();
				Static244.aClass93_93.method2396();
				Static37.method584();
				Static309.method5417();
			}
			if (arg1.startsWith("mc")) {
				if (Static236.aClass55_9.method5193()) {
					local60 = Integer.parseInt(arg1.substring(3));
					if (local60 < 1) {
						local60 = 1;
					} else if (local60 > 4) {
						local60 = 4;
					}
					Static79.anInt1486 = local60;
					Static236.aClass55_9.method5233(Static79.anInt1486);
					Static236.aClass55_9.method5255(0);
					Static219.method4009("Render cores now: " + Static79.anInt1486);
				} else {
					Static219.method4009("Current toolkit doesn't support multiple cores");
				}
			}
			if (arg1.startsWith("cachespace")) {
				Static219.method4009("I(s): " + Static44.aClass109_15.method2854() + "/" + Static44.aClass109_15.method2853());
				Static219.method4009("I(m): " + Static143.aClass109_33.method2854() + "/" + Static143.aClass109_33.method2853());
				Static219.method4009("O(s): " + Static311.aClass120_2.method3172() + "/" + Static311.aClass120_2.method3166());
			}
			if (arg1.equalsIgnoreCase("getcamerapos")) {
				Static219.method4009("Pos: " + Static239.anInt4811 + "," + (Static172.anInt4394 + (Static271.anInt5301 >> 7) >> 6) + "," + (Static12.anInt3797 + (Static21.anInt466 >> 7) >> 6) + "," + (Static172.anInt4394 + (Static271.anInt5301 >> 7) & 0x3F) + "," + (Static12.anInt3797 + (Static21.anInt466 >> 7) & 0x3F) + " Height: " + (Static208.method3804(Static239.anInt4811, Static271.anInt5301, Static21.anInt466) - Static102.anInt1934));
				Static219.method4009("Look: " + Static239.anInt4811 + "," + (Static103.anInt5457 + Static172.anInt4394 >> 6) + "," + (Static12.anInt3797 + Static120.anInt2266 >> 6) + "," + (Static172.anInt4394 + Static103.anInt5457 & 0x3F) + "," + (Static12.anInt3797 + Static120.anInt2266 & 0x3F) + " Height: " + (Static208.method3804(Static239.anInt4811, Static103.anInt5457, Static120.anInt2266) - Static323.anInt6231));
			}
			if (arg1.equals("showocc")) {
				Static113.aBoolean160 = !Static113.aBoolean160;
				Static300.method5273();
			}
			if (arg1.equals("renderprofile") || arg1.equals("rp")) {
				Static73.aBoolean95 = !Static73.aBoolean95;
				Static236.aClass55_9.method5237(Static73.aBoolean95);
				Static194.method3442();
			}
			if (arg1.equals("nonpcs")) {
				Static133.aBoolean202 = !Static133.aBoolean202;
			}
			if (arg1.equals("autoworld")) {
				Static14.method280();
			}
			if (arg1.equals("heap")) {
				Static219.method4009("Heap: " + Static345.anInt6645 + "MB");
			}
			if (arg1.equals("savevarcs")) {
				Static246.method4391();
			}
			if (arg1.equals("scramblevarcs")) {
				for (local60 = 0; local60 < Static234.anIntArray427.length; local60++) {
					if (Static346.aBooleanArray25[local60]) {
						Static234.anIntArray427[local60] = (int) (Math.random() * 99999.0D);
						if (Math.random() > 0.5D) {
							Static234.anIntArray427[local60] *= -1;
						}
					}
				}
				Static246.method4391();
			}
			if (arg1.equals("showcolmap")) {
				Static230.aBoolean378 = true;
				Static309.method5417();
			}
			if (arg1.equals("hidecolmap")) {
				Static230.aBoolean378 = false;
				Static309.method5417();
			}
			if (arg1.equals("resetcache")) {
				Static166.method3025();
			}
			if (arg1.equals("profilecpu")) {
				Static219.method4009(Static183.method3325() + "ms");
			}
			if (arg1.startsWith("cpuusage")) {
				local60 = Integer.parseInt(arg1.substring(9));
				if (local60 >= 0 && local60 <= 4) {
					Static344.anInt6622 = local60;
				}
			}
			if (Static278.anInt5495 == 30) {
				Static125.aClass5_Sub12_Sub2_3.method5125(6);
				Static125.aClass5_Sub12_Sub2_3.method5089(arg1.length() + 2);
				Static125.aClass5_Sub12_Sub2_3.method5089(arg0 ? 1 : 0);
				Static125.aClass5_Sub12_Sub2_3.method5094(arg1);
				return;
			}
		} catch (@Pc(1010) Exception local1010) {
			Static219.method4009("Whoops, something went wrong.");
			return;
		}
	}

	@OriginalMember(owner = "client!hl", name = "d", descriptor = "(I)V")
	public static void method2147() {
		@Pc(1) Class109 local1 = Static291.aClass109_53;
		synchronized (Static291.aClass109_53) {
			Static291.aClass109_53.method2858();
		}
	}
}
