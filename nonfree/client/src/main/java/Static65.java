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

public final class Static65 {

	@OriginalMember(owner = "client!gi", name = "w", descriptor = "I")
	public static int anInt1998;

	@OriginalMember(owner = "client!gi", name = "y", descriptor = "Lclient!t;")
	public static Class81 aClass81_1;

	@OriginalMember(owner = "client!gi", name = "D", descriptor = "Lclient!ca;")
	public static Class13_Sub1 aClass13_Sub1_8;

	@OriginalMember(owner = "client!gi", name = "F", descriptor = "[Z")
	public static boolean[] aBooleanArray9;

	@OriginalMember(owner = "client!gi", name = "x", descriptor = "Lclient!vc;")
	public static final Class89 aClass89_21 = new Class89(30);

	@OriginalMember(owner = "client!gi", name = "z", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_492 = Static158.method3034("auf einer freien Welt zu spielen)3");

	@OriginalMember(owner = "client!gi", name = "G", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_494 = Static158.method3034("go back to the main RuneScape webpage");

	@OriginalMember(owner = "client!gi", name = "E", descriptor = "Lclient!ob;")
	public static Class60 aClass60_493 = aClass60_494;

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(BILclient!ae;)V")
	public static void method1487(@OriginalArg(2) Class2_Sub3_Sub1 arg0) {
		while (true) {
			@Pc(14) Class2_Sub24 local14 = (Class2_Sub24) Static49.aClass67_3.method2848();
			if (local14 == null) {
				return;
			}
			@Pc(19) boolean local19 = false;
			for (@Pc(21) int local21 = 0; local21 < local14.anInt4556; local21++) {
				if (local14.aClass25Array1[local21] != null) {
					if (local14.aClass25Array1[local21].anInt1695 == 2) {
						local14.anIntArray496[local21] = -5;
					}
					if (local14.aClass25Array1[local21].anInt1695 == 0) {
						local19 = true;
					}
				}
				if (local14.aClass25Array2[local21] != null) {
					if (local14.aClass25Array2[local21].anInt1695 == 2) {
						local14.anIntArray496[local21] = -6;
					}
					if (local14.aClass25Array2[local21].anInt1695 == 0) {
						local19 = true;
					}
				}
			}
			if (local19) {
				return;
			}
			arg0.method244(99);
			arg0.method224(0);
			@Pc(102) int local102 = arg0.anInt273;
			arg0.method197(local14.anInt4560);
			for (@Pc(109) int local109 = 0; local109 < local14.anInt4556; local109++) {
				if (local14.anIntArray496[local109] == 0) {
					try {
						@Pc(132) int local132 = local14.anIntArray495[local109];
						@Pc(141) Field local141;
						@Pc(145) int local145;
						if (local132 == 0) {
							local141 = (Field) local14.aClass25Array1[local109].anObject2;
							local145 = local141.getInt(null);
							arg0.method224(0);
							arg0.method197(local145);
						} else if (local132 == 1) {
							local141 = (Field) local14.aClass25Array1[local109].anObject2;
							local141.setInt(null, local14.anIntArray494[local109]);
							arg0.method224(0);
						} else if (local132 == 2) {
							local141 = (Field) local14.aClass25Array1[local109].anObject2;
							local145 = local141.getModifiers();
							arg0.method224(0);
							arg0.method197(local145);
						}
						@Pc(222) Method local222;
						if (local132 == 3) {
							@Pc(215) byte[][] local215 = local14.aByteArrayArrayArray42[local109];
							local222 = (Method) local14.aClass25Array2[local109].anObject2;
							@Pc(226) Object[] local226 = new Object[local215.length];
							for (@Pc(228) int local228 = 0; local228 < local215.length; local228++) {
								@Pc(240) ObjectInputStream local240 = new ObjectInputStream(new ByteArrayInputStream(local215[local228]));
								local226[local228] = local240.readObject();
							}
							@Pc(255) Object local255 = local222.invoke(null, local226);
							if (local255 == null) {
								arg0.method224(0);
							} else if (local255 instanceof Number) {
								arg0.method224(1);
								arg0.method205(((Number) local255).longValue());
							} else if (local255 instanceof Class60) {
								arg0.method224(2);
								arg0.method226((Class60) local255);
							} else {
								arg0.method224(4);
							}
						} else if (local132 == 4) {
							local222 = (Method) local14.aClass25Array2[local109].anObject2;
							local145 = local222.getModifiers();
							arg0.method224(0);
							arg0.method197(local145);
						}
					} catch (@Pc(327) ClassNotFoundException local327) {
						arg0.method224(-10);
					} catch (@Pc(333) InvalidClassException local333) {
						arg0.method224(-11);
					} catch (@Pc(339) StreamCorruptedException local339) {
						arg0.method224(-12);
					} catch (@Pc(345) OptionalDataException local345) {
						arg0.method224(-13);
					} catch (@Pc(353) IllegalAccessException local353) {
						arg0.method224(-14);
					} catch (@Pc(361) IllegalArgumentException local361) {
						arg0.method224(-15);
					} catch (@Pc(367) InvocationTargetException local367) {
						arg0.method224(-16);
					} catch (@Pc(373) SecurityException local373) {
						arg0.method224(-17);
					} catch (@Pc(379) IOException local379) {
						arg0.method224(-18);
					} catch (@Pc(385) NullPointerException local385) {
						arg0.method224(-19);
					} catch (@Pc(391) Exception local391) {
						arg0.method224(-20);
					} catch (@Pc(399) Throwable local399) {
						arg0.method224(-21);
					}
				} else {
					arg0.method224(local14.anIntArray496[local109]);
				}
			}
			arg0.method220(local102);
			arg0.method200(arg0.anInt273 - local102);
			local14.method3556();
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(BLclient!na;)V")
	public static void method1488(@OriginalArg(1) Applet_Sub1 arg0) {
		if (Static80.aBoolean96) {
			Static48.method1098(arg0);
			return;
		}
		if (Static147.anInt3820 == 1 && Static74.anInt2294 >= 715 && Static174.anInt4254 >= 453) {
			Static125.aBoolean126 = !Static125.aBoolean126;
			if (Static125.aBoolean126) {
				Static168.method3119();
			} else {
				Static4.method71(Static53.anInt1685, Static142.aClass13_Sub1_20, 255);
			}
		}
		if (Static144.anInt3778 == 5) {
			return;
		}
		Static102.anInt2944++;
		if (Static144.anInt3778 != 10) {
			return;
		}
		if (Static128.anInt3498 != 2 && Static132.anInt3564 == 0) {
			if (Static147.anInt3820 == 1 && Static74.anInt2294 >= 5 && Static74.anInt2294 <= 105 && Static174.anInt4254 >= 463 && Static174.anInt4254 <= 498) {
				Static99.method2272();
				return;
			}
			if (Static21.aClass92_1 != null) {
				Static99.method2272();
			}
		}
		@Pc(116) int local116 = Static147.anInt3820;
		@Pc(118) int local118 = Static74.anInt2294;
		@Pc(120) int local120 = Static174.anInt4254;
		if (Static58.anInt1813 == 0) {
			if (local116 == 1 && local118 >= 227 && local118 <= 377 && local120 >= 271 && local120 <= 311) {
				Static58.anInt1813 = 3;
				Static190.anInt4541 = 0;
			}
			@Pc(534) boolean local534 = false;
			if (Static143.anInt3743 != 0) {
				while (Static142.method2877()) {
					if (Static74.anInt2295 == 84) {
						local534 = true;
						break;
					}
				}
			}
			if (local534 || local116 == 1 && local118 >= 387 && local118 <= 537 && local120 >= 271 && local120 <= 311) {
				Static95.aClass60_781 = Static168.aClass60_1136;
				Static190.anInt4541 = 0;
				Static95.aClass60_782 = Static183.aClass60_1243;
				Static95.aClass60_776 = Static183.aClass60_1258;
				Static58.anInt1813 = 2;
			}
		} else if (Static58.anInt1813 == 2) {
			@Pc(174) short local174 = 231;
			@Pc(175) int local175 = local174 + 30;
			if (local116 == 1 && local120 >= 246 && local120 < 261) {
				Static190.anInt4541 = 0;
			}
			local175 += 15;
			if (local116 == 1 && local120 >= 261 && local120 < 276) {
				Static190.anInt4541 = 1;
			}
			local175 += 15;
			if (local116 == 1 && local118 >= 227 && local118 <= 377 && local120 >= 301 && local120 <= 341) {
				Static95.aClass60_784 = Static95.aClass60_784.method2690().method2663();
				if (Static95.aClass60_784.method2673() == 0) {
					Static21.method473(Static183.aClass60_1233, Static183.aClass60_1257, Static102.aClass60_828);
				} else if (Static95.aClass60_778.method2673() == 0) {
					Static21.method473(Static183.aClass60_1251, Static183.aClass60_1246, Static59.aClass60_433);
				} else {
					Static21.method473(Static183.aClass60_1248, Static183.aClass60_1249, Static149.aClass60_1046);
					Static139.method2831(20);
				}
			} else {
				if (local116 == 1 && local118 >= 387 && local118 <= 537 && local120 >= 301 && local120 <= 341) {
					Static58.anInt1813 = 0;
					Static95.aClass60_778 = Static95.aClass60_777;
					Static95.aClass60_784 = Static95.aClass60_777;
				}
				while (true) {
					@Pc(323) boolean local323;
					label204: do {
						while (Static142.method2877()) {
							local323 = false;
							for (@Pc(325) int local325 = 0; local325 < Static122.aClass60_934.method2673(); local325++) {
								if (Static162.anInt4046 == Static122.aClass60_934.method2665(local325)) {
									local323 = true;
									break;
								}
							}
							if (Static190.anInt4541 != 0) {
								continue label204;
							}
							if (Static74.anInt2295 == 85 && Static95.aClass60_784.method2673() > 0) {
								Static95.aClass60_784 = Static95.aClass60_784.method2667(Static95.aClass60_784.method2673() - 1, 0);
							}
							if (Static74.anInt2295 == 84 || Static74.anInt2295 == 80) {
								Static190.anInt4541 = 1;
							}
							if (local323 && Static95.aClass60_784.method2673() < 12) {
								Static95.aClass60_784 = Static95.aClass60_784.method2677(Static162.anInt4046);
							}
						}
						return;
					} while (Static190.anInt4541 != 1);
					if (Static74.anInt2295 == 85 && Static95.aClass60_778.method2673() > 0) {
						Static95.aClass60_778 = Static95.aClass60_778.method2667(Static95.aClass60_778.method2673() - 1, 0);
					}
					if (Static74.anInt2295 == 84 || Static74.anInt2295 == 80) {
						Static190.anInt4541 = 0;
					}
					if (Static143.anInt3743 != 0 && Static74.anInt2295 == 84) {
						Static95.aClass60_784 = Static95.aClass60_784.method2690().method2663();
						if (Static95.aClass60_784.method2673() == 0) {
							Static21.method473(Static183.aClass60_1233, Static183.aClass60_1257, Static102.aClass60_828);
							return;
						}
						if (Static95.aClass60_778.method2673() == 0) {
							Static21.method473(Static183.aClass60_1251, Static183.aClass60_1246, Static59.aClass60_433);
							return;
						}
						Static21.method473(Static183.aClass60_1248, Static183.aClass60_1249, Static149.aClass60_1046);
						Static139.method2831(20);
						return;
					}
					if (local323 && Static95.aClass60_778.method2673() < 20) {
						Static95.aClass60_778 = Static95.aClass60_778.method2677(Static162.anInt4046);
					}
				}
			}
		} else if (Static58.anInt1813 == 3 && local116 == 1 && local118 >= 307 && local118 <= 457 && local120 >= 301 && local120 <= 341) {
			Static58.anInt1813 = 0;
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(BI)V")
	public static void method1489(@OriginalArg(1) int arg0) {
		Static117.method758();
		Static91.method2094();
		@Pc(14) int local14 = Static146.method2943(arg0).anInt3971;
		if (local14 == 0) {
			return;
		}
		@Pc(28) int local28 = Static163.anIntArray447[arg0];
		if (local14 == 1) {
			Static194.anInt4613 = local28;
			if (Static194.anInt4613 == 1) {
				Static45.method1041(0.9F);
			}
			if (Static194.anInt4613 == 2) {
				Static45.method1041(0.8F);
			}
			if (Static194.anInt4613 == 3) {
				Static45.method1041(0.7F);
			}
			if (Static194.anInt4613 == 4) {
				Static45.method1041(0.6F);
			}
			Static59.method1372();
		}
		if (local14 == 3) {
			@Pc(68) short local68 = 0;
			if (local28 == 0) {
				local68 = 255;
			}
			if (local28 == 1) {
				local68 = 192;
			}
			if (local28 == 2) {
				local68 = 128;
			}
			if (local28 == 3) {
				local68 = 64;
			}
			if (local28 == 4) {
				local68 = 0;
			}
			if (Static14.anInt485 != local68) {
				if (Static14.anInt485 == 0 && Static165.anInt4097 != -1) {
					Static4.method71(Static165.anInt4097, Static142.aClass13_Sub1_20, local68);
					Static107.aBoolean118 = false;
				} else if (local68 == 0) {
					Static168.method3119();
					Static107.aBoolean118 = false;
				} else {
					Static5.method120(local68);
				}
				Static14.anInt485 = local68;
			}
		}
		if (local14 == 4) {
			if (local28 == 0) {
				Static30.anInt901 = 127;
			}
			if (local28 == 1) {
				Static30.anInt901 = 96;
			}
			if (local28 == 2) {
				Static30.anInt901 = 64;
			}
			if (local28 == 3) {
				Static30.anInt901 = 32;
			}
			if (local28 == 4) {
				Static30.anInt901 = 0;
			}
		}
		if (local14 == 10) {
			if (local28 == 0) {
				Static148.anInt3846 = 127;
			}
			if (local28 == 1) {
				Static148.anInt3846 = 96;
			}
			if (local28 == 2) {
				Static148.anInt3846 = 64;
			}
			if (local28 == 3) {
				Static148.anInt3846 = 32;
			}
			if (local28 == 4) {
				Static148.anInt3846 = 0;
			}
		}
		if (local14 == 6) {
			Static86.anInt2552 = local28;
		}
		if (local14 == 9) {
			Static161.anInt4012 = local28;
		}
		if (local14 == 5) {
			Static131.anInt249 = local28;
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lclient!ob;ILclient!pe;Lclient!pe;Lclient!ob;)Lclient!i;")
	public static Class2_Sub1_Sub7_Sub3_Sub1 method1491(@OriginalArg(0) Class60 arg0, @OriginalArg(2) Class13 arg1, @OriginalArg(3) Class13 arg2, @OriginalArg(4) Class60 arg3) {
		@Pc(13) int local13 = arg2.method527(arg0);
		@Pc(19) int local19 = arg2.method514(local13, arg3);
		return Static193.method3537(arg2, arg1, local13, local19);
	}
}
