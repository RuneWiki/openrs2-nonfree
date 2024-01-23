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

public final class Static296 {

	@OriginalMember(owner = "client!vg", name = "j", descriptor = "Lclient!nk;")
	public static Class121 aClass121_130;

	@OriginalMember(owner = "client!vg", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString319 = "skill: ";

	@OriginalMember(owner = "client!vg", name = "h", descriptor = "I")
	public static int anInt5310 = -1;

	@OriginalMember(owner = "client!vg", name = "i", descriptor = "Lclient!vh;")
	public static Class187 aClass187_148 = new Class187(64);

	@OriginalMember(owner = "client!vg", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString320 = "Examine";

	@OriginalMember(owner = "client!vg", name = "l", descriptor = "[I")
	public static int[] anIntArray469 = new int[4096];

	@OriginalMember(owner = "client!vg", name = "m", descriptor = "I")
	public static int anInt5311 = 0;

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "([[FB[[I[[BII[[B[[F[[B[Lclient!h;[[F[[B)V")
	public static void method4520(@OriginalArg(0) float[][] arg0, @OriginalArg(2) int[][] arg1, @OriginalArg(3) byte[][] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte[][] arg5, @OriginalArg(7) float[][] arg6, @OriginalArg(8) byte[][] arg7, @OriginalArg(9) Class61[] arg8, @OriginalArg(10) float[][] arg9, @OriginalArg(11) byte[][] arg10) {
		for (@Pc(3) int local3 = 0; local3 < arg3; local3++) {
			@Pc(10) Class61 local10 = arg8[local3];
			if (local10.anInt1999 == arg4) {
				@Pc(22) Class26 local22 = new Class26();
				@Pc(24) int local24 = 0;
				@Pc(33) int local33 = (local10.anInt2004 >> 7) - local10.anInt2002;
				@Pc(41) int local41 = (local10.anInt2006 >> 7) - local10.anInt2002;
				if (local41 < 0) {
					local24 = -local41;
					local41 = 0;
				}
				@Pc(58) int local58 = local10.anInt2002 + (local10.anInt2006 >> 7);
				if (local58 > 103) {
					local58 = 103;
				}
				@Pc(66) int local66;
				@Pc(78) short local78;
				@Pc(84) int local84;
				@Pc(92) int local92;
				@Pc(109) int local109;
				@Pc(128) int local128;
				@Pc(313) boolean local313;
				@Pc(344) int local344;
				for (local66 = local41; local66 <= local58; local66++) {
					local78 = local10.aShortArray36[local24];
					local84 = local33 + (local78 >> 8);
					local92 = (local78 & 0xFF) + local84 - 1;
					if (local92 > 103) {
						local92 = 103;
					}
					if (local84 < 0) {
						local84 = 0;
					}
					for (local109 = local84; local109 <= local92; local109++) {
						@Pc(120) int local120 = arg5[local109][local66] & 0xFF;
						local128 = arg10[local109][local66] & 0xFF;
						@Pc(130) boolean local130 = false;
						@Pc(146) Class128 local146;
						@Pc(169) int[] local169;
						@Pc(223) int[] local223;
						if (local120 == 0) {
							if (local128 == 0) {
								continue;
							}
							local146 = Static185.method3030(local128 - 1);
							if (local146.anInt3878 == -1) {
								continue;
							}
							if (arg2[local109][local66] != 0) {
								local169 = Static169.anIntArrayArray25[arg2[local109][local66]];
								local22.anInt635 += ((local169.length >> 1) - 2) * 3;
								local22.anInt636 += local169.length >> 1;
								continue;
							}
						} else if (local128 != 0) {
							local146 = Static185.method3030(local128 - 1);
							@Pc(217) byte local217;
							if (local146.anInt3878 == -1) {
								local217 = arg2[local109][local66];
								if (local217 != 0) {
									local223 = Static244.anIntArrayArray36[local217];
									local22.anInt635 += ((local223.length >> 1) - 2) * 3;
									local22.anInt636 += local223.length >> 1;
								}
								continue;
							}
							local217 = arg2[local109][local66];
							if (local217 != 0) {
								local130 = true;
							}
						}
						@Pc(262) Class161 local262 = Static178.method2963(arg4, local109, local66);
						if (local262 != null) {
							@Pc(273) int local273 = (int) (local262.aLong171 >> 14) & 0x3F;
							if (local273 == 9) {
								local223 = null;
								@Pc(286) int local286 = (int) (local262.aLong171 >> 20) & 0x3;
								@Pc(300) boolean local300;
								@Pc(332) short local332;
								@Pc(338) int local338;
								if ((local286 & 0x1) == 0) {
									local300 = local109 - 1 >= local84;
									local313 = local92 >= local109 + 1;
									if (!local300 && local66 + 1 <= local58) {
										local332 = local10.aShortArray36[local24 + 1];
										local338 = (local332 >> 8) + local33;
										local344 = (local332 & 0xFF) + local338;
										local300 = local109 > local338 && local109 < local344;
									}
									if (!local313 && local41 <= local66 - 1) {
										local332 = local10.aShortArray36[local24 - 1];
										local338 = (local332 >> 8) + local33;
										local344 = (local332 & 0xFF) + local338;
										local313 = local338 < local109 && local109 < local344;
									}
									if (local300 && local313) {
										local223 = Static169.anIntArrayArray25[0];
									} else if (local300) {
										local223 = Static169.anIntArrayArray25[1];
									} else if (local313) {
										local223 = Static169.anIntArrayArray25[1];
									}
								} else {
									local313 = local109 + 1 <= local92;
									local300 = local84 <= local109 - 1;
									if (!local300 && local41 <= local66 - 1) {
										local332 = local10.aShortArray36[local24 - 1];
										local338 = local33 + (local332 >> 8);
										local344 = local338 + (local332 & 0xFF);
										local300 = local338 < local109 && local109 < local344;
									}
									if (!local313 && local66 + 1 <= local58) {
										local332 = local10.aShortArray36[local24 + 1];
										local338 = (local332 >> 8) + local33;
										local344 = (local332 & 0xFF) + local338;
										local313 = local338 < local109 && local344 > local109;
									}
									if (local300 && local313) {
										local223 = Static169.anIntArrayArray25[0];
									} else if (local300) {
										local223 = Static169.anIntArrayArray25[1];
									} else if (local313) {
										local223 = Static169.anIntArrayArray25[1];
									}
								}
								if (local223 != null) {
									local22.anInt635 += ((local223.length >> 1) - 2) * 3;
									local22.anInt636 += local223.length >> 1;
								}
								continue;
							}
						}
						if (local130) {
							local169 = Static169.anIntArrayArray25[arg2[local109][local66]];
							local223 = Static244.anIntArrayArray36[arg2[local109][local66]];
							local22.anInt635 += (local169.length >> 1) * 3 - 6;
							local22.anInt635 += (local223.length >> 1) * 3 - 6;
							local22.anInt636 += local169.length >> 1;
							local22.anInt636 += local223.length >> 1;
						} else {
							local169 = Static169.anIntArrayArray25[0];
							local22.anInt635 += (local169.length >> 1) * 3 - 6;
							local22.anInt636 += local169.length >> 1;
						}
					}
					local24++;
				}
				local24 = 0;
				local22.method591();
				if ((local10.anInt2006 >> 7) - local10.anInt2002 < 0) {
					local24 = local10.anInt2002 - (local10.anInt2006 >> 7);
				}
				for (local66 = local41; local66 <= local58; local66++) {
					local78 = local10.aShortArray36[local24];
					local84 = (local78 >> 8) + local33;
					local92 = (local78 & 0xFF) + local84 - 1;
					if (local84 < 0) {
						local84 = 0;
					}
					if (local92 > 103) {
						local92 = 103;
					}
					for (local109 = local84; local109 <= local92; local109++) {
						@Pc(761) byte local761 = arg7[local109][local66];
						local128 = arg5[local109][local66] & 0xFF;
						@Pc(777) int local777 = arg10[local109][local66] & 0xFF;
						@Pc(779) boolean local779 = false;
						@Pc(793) Class128 local793;
						if (local128 == 0) {
							if (local777 == 0) {
								continue;
							}
							local793 = Static185.method3030(local777 - 1);
							if (local793.anInt3878 == -1) {
								continue;
							}
							if (arg2[local109][local66] != 0) {
								Static191.method3107(arg9, local66, local109, arg0, arg6, Static169.anIntArrayArray25[arg2[local109][local66]], arg7[local109][local66], local10, arg1, local22);
								continue;
							}
						} else if (local777 != 0) {
							local793 = Static185.method3030(local777 - 1);
							if (local793.anInt3878 == -1) {
								Static191.method3107(arg9, local66, local109, arg0, arg6, Static244.anIntArrayArray36[arg2[local109][local66]], arg7[local109][local66], local10, arg1, local22);
								continue;
							}
							@Pc(827) byte local827 = arg2[local109][local66];
							if (local827 != 0) {
								local779 = true;
							}
						}
						@Pc(891) Class161 local891 = Static178.method2963(arg4, local109, local66);
						if (local891 != null) {
							@Pc(902) int local902 = (int) (local891.aLong171 >> 14) & 0x3F;
							if (local902 == 9) {
								@Pc(915) int local915 = (int) (local891.aLong171 >> 20) & 0x3;
								@Pc(917) int[] local917 = null;
								@Pc(969) int local969;
								@Pc(992) boolean local992;
								@Pc(956) short local956;
								if ((local915 & 0x1) == 0) {
									local313 = local109 - 1 >= local84;
									local992 = local109 + 1 <= local92;
									if (!local313 && local66 + 1 <= local58) {
										local956 = local10.aShortArray36[local24 + 1];
										local344 = local33 + (local956 >> 8);
										local969 = (local956 & 0xFF) + local344;
										local313 = local344 < local109 && local109 < local969;
									}
									if (!local992 && local66 - 1 >= local41) {
										local956 = local10.aShortArray36[local24 - 1];
										local344 = local33 + (local956 >> 8);
										local969 = (local956 & 0xFF) + local344;
										local992 = local344 < local109 && local969 > local109;
									}
									if (local313 && local992) {
										local917 = Static169.anIntArrayArray25[0];
									} else if (local313) {
										local917 = Static169.anIntArrayArray25[1];
										local761 = 1;
									} else if (local992) {
										local917 = Static169.anIntArrayArray25[1];
										local761 = 3;
									}
								} else {
									local313 = local109 - 1 >= local84;
									if (!local313 && local41 <= local66 - 1) {
										local956 = local10.aShortArray36[local24 - 1];
										local344 = local33 + (local956 >> 8);
										local969 = (local956 & 0xFF) + local344;
										local313 = local344 < local109 && local109 < local969;
									}
									local992 = local109 + 1 <= local92;
									if (!local992 && local66 + 1 <= local58) {
										local956 = local10.aShortArray36[local24 + 1];
										local344 = local33 + (local956 >> 8);
										local969 = (local956 & 0xFF) + local344;
										local992 = local344 < local109 && local969 > local109;
									}
									if (local313 && local992) {
										local917 = Static169.anIntArrayArray25[0];
									} else if (local313) {
										local917 = Static169.anIntArrayArray25[1];
										local761 = 0;
									} else if (local992) {
										local761 = 2;
										local917 = Static169.anIntArrayArray25[1];
									}
								}
								if (local917 != null) {
									Static191.method3107(arg9, local66, local109, arg0, arg6, local917, local761, local10, arg1, local22);
								}
								continue;
							}
						}
						if (local779) {
							Static191.method3107(arg9, local66, local109, arg0, arg6, Static244.anIntArrayArray36[arg2[local109][local66]], arg7[local109][local66], local10, arg1, local22);
							Static191.method3107(arg9, local66, local109, arg0, arg6, Static169.anIntArrayArray25[arg2[local109][local66]], arg7[local109][local66], local10, arg1, local22);
						} else {
							Static191.method3107(arg9, local66, local109, arg0, arg6, Static169.anIntArrayArray25[0], local761, local10, arg1, local22);
						}
					}
					local24++;
				}
				if (local22.anInt634 > 0 && local22.anInt633 > 0) {
					local22.method592();
					local10.aClass26_1 = local22;
				}
			}
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IILclient!en;)V")
	public static void method4521(@OriginalArg(2) Class1_Sub14_Sub1 arg0) {
		while (true) {
			@Pc(16) Class1_Sub20 local16 = (Class1_Sub20) Static284.aClass59_37.method1704();
			if (local16 == null) {
				return;
			}
			@Pc(21) boolean local21 = false;
			@Pc(23) int local23;
			for (local23 = 0; local23 < local16.anInt3137; local23++) {
				if (local16.aClass185Array1[local23] != null) {
					if (local16.aClass185Array1[local23].anInt5276 == 2) {
						local16.anIntArray262[local23] = -5;
					}
					if (local16.aClass185Array1[local23].anInt5276 == 0) {
						local21 = true;
					}
				}
				if (local16.aClass185Array2[local23] != null) {
					if (local16.aClass185Array2[local23].anInt5276 == 2) {
						local16.anIntArray262[local23] = -6;
					}
					if (local16.aClass185Array2[local23].anInt5276 == 0) {
						local21 = true;
					}
				}
			}
			if (local21) {
				return;
			}
			arg0.method1408(180);
			arg0.method1390(0);
			local23 = arg0.anInt1480;
			arg0.method1387(local16.anInt3142);
			for (@Pc(110) int local110 = 0; local110 < local16.anInt3137; local110++) {
				if (local16.anIntArray262[local110] == 0) {
					try {
						@Pc(138) int local138 = local16.anIntArray264[local110];
						@Pc(150) Field local150;
						@Pc(154) int local154;
						if (local138 == 0) {
							local150 = (Field) local16.aClass185Array1[local110].anObject6;
							local154 = local150.getInt(null);
							arg0.method1390(0);
							arg0.method1387(local154);
						} else if (local138 == 1) {
							local150 = (Field) local16.aClass185Array1[local110].anObject6;
							local150.setInt(null, local16.anIntArray261[local110]);
							arg0.method1390(0);
						} else if (local138 == 2) {
							local150 = (Field) local16.aClass185Array1[local110].anObject6;
							local154 = local150.getModifiers();
							arg0.method1390(0);
							arg0.method1387(local154);
						}
						@Pc(224) Method local224;
						if (local138 == 3) {
							local224 = (Method) local16.aClass185Array2[local110].anObject6;
							@Pc(249) byte[][] local249 = local16.aByteArrayArrayArray10[local110];
							@Pc(253) Object[] local253 = new Object[local249.length];
							for (@Pc(255) int local255 = 0; local255 < local249.length; local255++) {
								@Pc(269) ObjectInputStream local269 = new ObjectInputStream(new ByteArrayInputStream(local249[local255]));
								local253[local255] = local269.readObject();
							}
							@Pc(282) Object local282 = local224.invoke(null, local253);
							if (local282 == null) {
								arg0.method1390(0);
							} else if (local282 instanceof Number) {
								arg0.method1390(1);
								arg0.method1374(((Number) local282).longValue());
							} else if (local282 instanceof String) {
								arg0.method1390(2);
								arg0.method1385((String) local282);
							} else {
								arg0.method1390(4);
							}
						} else if (local138 == 4) {
							local224 = (Method) local16.aClass185Array2[local110].anObject6;
							local154 = local224.getModifiers();
							arg0.method1390(0);
							arg0.method1387(local154);
						}
					} catch (@Pc(325) ClassNotFoundException local325) {
						arg0.method1390(-10);
					} catch (@Pc(331) InvalidClassException local331) {
						arg0.method1390(-11);
					} catch (@Pc(337) StreamCorruptedException local337) {
						arg0.method1390(-12);
					} catch (@Pc(343) OptionalDataException local343) {
						arg0.method1390(-13);
					} catch (@Pc(349) IllegalAccessException local349) {
						arg0.method1390(-14);
					} catch (@Pc(355) IllegalArgumentException local355) {
						arg0.method1390(-15);
					} catch (@Pc(361) InvocationTargetException local361) {
						arg0.method1390(-16);
					} catch (@Pc(367) SecurityException local367) {
						arg0.method1390(-17);
					} catch (@Pc(373) IOException local373) {
						arg0.method1390(-18);
					} catch (@Pc(379) NullPointerException local379) {
						arg0.method1390(-19);
					} catch (@Pc(385) Exception local385) {
						arg0.method1390(-20);
					} catch (@Pc(391) Throwable local391) {
						arg0.method1390(-21);
					}
				} else {
					arg0.method1390(local16.anIntArray262[local110]);
				}
			}
			arg0.method1365(local23);
			arg0.method1379(arg0.anInt1480 - local23);
			local16.method4779();
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(III)Lclient!hi;")
	public static Class66 method4522(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class66 local7 = Static53.method968(arg0);
		if (arg1 == -1) {
			return local7;
		} else if (local7 == null || local7.aClass66Array3 == null || local7.aClass66Array3.length <= arg1) {
			return null;
		} else {
			return local7.aClass66Array3[arg1];
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(ZLjava/lang/String;)Z")
	public static boolean method4523(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(13) int local13 = 0; local13 < Static120.anInt2510; local13++) {
			if (arg0.equalsIgnoreCase(Static106.aStringArray16[local13])) {
				return true;
			}
		}
		if (arg0.equalsIgnoreCase(Static90.aClass15_Sub5_Sub2_2.aString336)) {
			return true;
		} else {
			return false;
		}
	}
}
