import java.awt.Component;
import java.awt.Image;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!na", name = "u", descriptor = "I")
	public static int anInt2975;

	@OriginalMember(owner = "client!na", name = "y", descriptor = "B")
	public static byte aByte7;

	@OriginalMember(owner = "client!na", name = "L", descriptor = "Ljava/awt/Image;")
	public static Image anImage4;

	@OriginalMember(owner = "client!na", name = "W", descriptor = "Lclient!hi;")
	public static Class21 aClass21_1;

	@OriginalMember(owner = "client!na", name = "bb", descriptor = "Lclient!i;")
	private static Class41 aClass41_843 = Static184.method2923("Loaded sprites");

	@OriginalMember(owner = "client!na", name = "A", descriptor = "Lclient!i;")
	public static Class41 aClass41_838 = aClass41_843;

	@OriginalMember(owner = "client!na", name = "I", descriptor = "Lclient!i;")
	private static Class41 aClass41_840 = Static184.method2923("skill)2");

	@OriginalMember(owner = "client!na", name = "E", descriptor = "Lclient!i;")
	public static Class41 aClass41_839 = aClass41_840;

	@OriginalMember(owner = "client!na", name = "K", descriptor = "[I")
	public static int[] anIntArray318 = new int[32];

	@OriginalMember(owner = "client!na", name = "O", descriptor = "Lclient!i;")
	private static Class41 aClass41_841 = Static184.method2923("Please wait)3)3)3");

	@OriginalMember(owner = "client!na", name = "S", descriptor = "Lclient!i;")
	public static Class41 aClass41_842 = aClass41_841;

	@OriginalMember(owner = "client!na", name = "U", descriptor = "I")
	public static int anInt2989 = 1;

	@OriginalMember(owner = "client!na", name = "Z", descriptor = "I")
	public static int anInt2993 = 0;

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIII[Lclient!q;II)V")
	public static void method2078(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class80[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		for (@Pc(12) int local12 = 0; local12 < arg5.length; local12++) {
			@Pc(18) Class80 local18 = arg5[local12];
			if (local18 != null && (!local18.aBoolean215 || local18.anInt3640 == 0 || local18.aBoolean219 || Static70.method1287(local18) != 0 || Static45.aClass80_4 == local18 || local18.anInt3670 == 1338) && arg3 == local18.anInt3697 && (!local18.aBoolean215 || !Static63.method1161(local18))) {
				@Pc(61) int local61 = arg2 + local18.anInt3627;
				@Pc(66) int local66 = arg7 + local18.anInt3671;
				@Pc(94) int local94;
				@Pc(77) int local77;
				@Pc(116) int local116;
				@Pc(109) int local109;
				if (local18.anInt3640 == 2) {
					local109 = arg4;
					local116 = arg1;
					local77 = arg0;
					local94 = arg6;
				} else {
					local77 = arg0 >= local66 ? arg0 : local66;
					@Pc(82) int local82 = local66 + local18.anInt3660;
					@Pc(87) int local87 = local18.anInt3635 + local61;
					local94 = arg6 >= local61 ? arg6 : local61;
					if (local18.anInt3640 == 9) {
						local82++;
						local87++;
					}
					local109 = arg4 <= local82 ? arg4 : local82;
					local116 = local87 < arg1 ? local87 : arg1;
				}
				if (Static160.aClass80_13 == local18) {
					Static13.anInt407 = local61;
					Static134.aBoolean180 = true;
					Static120.anInt2895 = local66;
				}
				if (!local18.aBoolean215 || local94 < local116 && local77 < local109) {
					if (local18.anInt3640 == 0) {
						if (!local18.aBoolean215 && Static63.method1161(local18) && Static58.aClass80_7 != local18) {
							continue;
						}
						if (local18.aBoolean222 && local94 <= Static26.anInt663 && Static212.anInt4711 >= local77 && local116 > Static26.anInt663 && Static212.anInt4711 < local109) {
							for (@Pc(181) Class2_Sub5 local181 = (Class2_Sub5) Static65.aClass108_6.method3322(); local181 != null; local181 = (Class2_Sub5) Static65.aClass108_6.method3331()) {
								if (local181.aBoolean48) {
									local181.method3314();
								}
							}
							for (@Pc(201) Class2_Sub5 local201 = (Class2_Sub5) Static175.aClass108_14.method3322(); local201 != null; local201 = (Class2_Sub5) Static175.aClass108_14.method3331()) {
								if (local201.aBoolean48) {
									local201.method3314();
								}
							}
							if (Static201.anInt4512 == 0) {
								Static160.aClass80_13 = null;
								Static45.aClass80_4 = null;
							}
							Static157.aBoolean229 = false;
						}
					}
					if (local18.aBoolean215) {
						@Pc(234) boolean local234 = false;
						@Pc(236) boolean local236 = false;
						@Pc(262) boolean local262;
						if (Static26.anInt663 >= local94 && local77 <= Static212.anInt4711 && local116 > Static26.anInt663 && local109 > Static212.anInt4711) {
							local262 = true;
						} else {
							local262 = false;
						}
						if (Static34.anInt909 == 1 && local94 <= Static200.anInt4491 && Static154.anInt3614 >= local77 && Static200.anInt4491 < local116 && local109 > Static154.anInt3614) {
							local236 = true;
						}
						if (Static141.anInt3252 == 1 && local262) {
							local234 = true;
						}
						@Pc(308) int local308;
						@Pc(312) int local312;
						@Pc(321) int local321;
						if (Static71.anInt1877 > 0 && local18.aByteArray52 != null) {
							for (local308 = 0; local308 < local18.aByteArray52.length; local308++) {
								for (local312 = 0; local312 < Static71.anInt1877; local312++) {
									local321 = local18.aByteArray52[local308] & 0xFF;
									if (Static215.anIntArray490[local312] == local321) {
										Static179.method2860(local308 + 1, Static156.aClass41_981, -1, local18.anInt3661);
									}
								}
							}
						}
						if (local236) {
							Static70.method1289(Static200.anInt4491 - local61, Static154.anInt3614 + -local66, local18);
						}
						if (Static160.aClass80_13 != null && local18 != Static160.aClass80_13 && local262 && Static54.method1054(Static70.method1287(local18))) {
							Static108.aClass80_9 = local18;
						}
						if (local18 == Static45.aClass80_4) {
							Static27.aBoolean122 = true;
							Static26.anInt658 = local66;
							Static112.anInt2697 = local61;
						}
						if (local18.aBoolean219 || local18.anInt3670 != 0) {
							@Pc(415) Class2_Sub5 local415;
							if (local262 && Static79.anInt2046 != 0 && local18.anObjectArray22 != null) {
								local415 = new Class2_Sub5();
								local415.aBoolean48 = true;
								local415.anObjectArray3 = local18.anObjectArray22;
								local415.aClass80_3 = local18;
								local415.anInt947 = Static79.anInt2046;
								Static65.aClass108_6.method3334(local415);
							}
							if (Static160.aClass80_13 != null || Static120.aClass80_11 != null || Static94.aBoolean123 || local18.anInt3670 != 1400 && Static157.aBoolean229) {
								local262 = false;
								local236 = false;
								local234 = false;
							}
							if (local18.anInt3670 == 1337) {
								Static176.method2833(local18);
								continue;
							}
							if (local18.anInt3670 == 1338) {
								if (local236) {
									Static4.method77(Static200.anInt4491 - local61, -local66 + Static154.anInt3614, local18);
								}
								continue;
							}
							if (local18.anInt3670 == 1400) {
								Static79.aClass80_8 = local18;
								if (local236) {
									if (Static219.aBooleanArray25[82] && Static60.anInt4780 > 0) {
										local312 = Static40.anInt1214 + Static105.anInt2549 - Static142.anInt3263 - (int) ((double) (-(local18.anInt3660 / 2) + -local66 + Static154.anInt3614) * 2.0D / Static54.aDouble1);
										local308 = Static111.anInt2664 + (int) ((double) (Static200.anInt4491 - local18.anInt3635 / 2 - local61) * 2.0D / Static54.aDouble1) + Static15.anInt422;
										@Pc(593) Class41 local593 = Static149.method2324(new Class41[] { Static188.aClass41_1142, Static152.method2471(local308 >> 6), Static48.aClass41_401, Static152.method2471(local312 >> 6), Static48.aClass41_401, Static152.method2471(local308 & 0x3F), Static48.aClass41_401, Static152.method2471(local312 & 0x3F) });
										local593.method1399();
										Static84.method1527(local593);
										Static27.method1631();
										continue;
									}
									Static133.anInt3047 = Static26.anInt663;
									Static85.anInt2169 = Static142.anInt3263;
									Static183.anInt1328 = Static212.anInt4711;
									Static157.aBoolean229 = true;
									Static43.anInt1300 = Static111.anInt2664;
									continue;
								}
								if (local234 && Static157.aBoolean229) {
									Static207.method3193(Static43.anInt1300 + (int) ((double) (Static133.anInt3047 - Static26.anInt663) * 2.0D / Static135.aDouble10));
									Static154.method2518((int) ((double) (Static183.anInt1328 - Static212.anInt4711) * 2.0D / Static135.aDouble10) + Static85.anInt2169);
									continue;
								}
								Static157.aBoolean229 = false;
								continue;
							}
							if (local18.anInt3670 == 1401) {
								if (local234) {
									Static148.method2321(local18.anInt3635, Static212.anInt4711 - local66, Static26.anInt663 - local61, local18.anInt3660);
								}
								continue;
							}
							if (!local18.aBoolean224 && local236) {
								local18.aBoolean224 = true;
								if (local18.anObjectArray25 != null) {
									local415 = new Class2_Sub5();
									local415.anInt947 = Static154.anInt3614 - local66;
									local415.anObjectArray3 = local18.anObjectArray25;
									local415.aClass80_3 = local18;
									local415.aBoolean48 = true;
									local415.anInt950 = Static200.anInt4491 - local61;
									Static65.aClass108_6.method3334(local415);
								}
							}
							if (local18.aBoolean224 && local234 && local18.anObjectArray18 != null) {
								local415 = new Class2_Sub5();
								local415.aBoolean48 = true;
								local415.anObjectArray3 = local18.anObjectArray18;
								local415.aClass80_3 = local18;
								local415.anInt950 = Static26.anInt663 - local61;
								local415.anInt947 = Static212.anInt4711 - local66;
								Static65.aClass108_6.method3334(local415);
							}
							if (local18.aBoolean224 && !local234) {
								local18.aBoolean224 = false;
								if (local18.anObjectArray8 != null) {
									local415 = new Class2_Sub5();
									local415.aClass80_3 = local18;
									local415.anInt947 = Static212.anInt4711 - local66;
									local415.anObjectArray3 = local18.anObjectArray8;
									local415.anInt950 = Static26.anInt663 - local61;
									local415.aBoolean48 = true;
									Static175.aClass108_14.method3334(local415);
								}
							}
							if (local234 && local18.anObjectArray27 != null) {
								local415 = new Class2_Sub5();
								local415.anObjectArray3 = local18.anObjectArray27;
								local415.aBoolean48 = true;
								local415.anInt947 = Static212.anInt4711 - local66;
								local415.aClass80_3 = local18;
								local415.anInt950 = Static26.anInt663 - local61;
								Static65.aClass108_6.method3334(local415);
							}
							if (!local18.aBoolean221 && local262) {
								local18.aBoolean221 = true;
								if (local18.anObjectArray4 != null) {
									local415 = new Class2_Sub5();
									local415.anInt950 = Static26.anInt663 - local61;
									local415.anInt947 = Static212.anInt4711 - local66;
									local415.aBoolean48 = true;
									local415.aClass80_3 = local18;
									local415.anObjectArray3 = local18.anObjectArray4;
									Static65.aClass108_6.method3334(local415);
								}
							}
							if (local18.aBoolean221 && local262 && local18.anObjectArray29 != null) {
								local415 = new Class2_Sub5();
								local415.aClass80_3 = local18;
								local415.anInt947 = Static212.anInt4711 - local66;
								local415.anObjectArray3 = local18.anObjectArray29;
								local415.anInt950 = Static26.anInt663 - local61;
								local415.aBoolean48 = true;
								Static65.aClass108_6.method3334(local415);
							}
							if (local18.aBoolean221 && !local262) {
								local18.aBoolean221 = false;
								if (local18.anObjectArray17 != null) {
									local415 = new Class2_Sub5();
									local415.anObjectArray3 = local18.anObjectArray17;
									local415.aClass80_3 = local18;
									local415.aBoolean48 = true;
									local415.anInt950 = Static26.anInt663 - local61;
									local415.anInt947 = Static212.anInt4711 - local66;
									Static175.aClass108_14.method3334(local415);
								}
							}
							if (local18.anObjectArray21 != null) {
								local415 = new Class2_Sub5();
								local415.aClass80_3 = local18;
								local415.anObjectArray3 = local18.anObjectArray21;
								Static33.aClass108_1.method3334(local415);
							}
							@Pc(1018) Class2_Sub5 local1018;
							if (local18.anObjectArray23 != null && Static200.anInt4494 > local18.anInt3630) {
								if (local18.anIntArray388 == null || Static200.anInt4494 - local18.anInt3630 > 32) {
									local415 = new Class2_Sub5();
									local415.aClass80_3 = local18;
									local415.anObjectArray3 = local18.anObjectArray23;
									Static65.aClass108_6.method3334(local415);
								} else {
									label439: for (local308 = local18.anInt3630; local308 < Static200.anInt4494; local308++) {
										local312 = Static216.anIntArray492[local308 & 0x1F];
										for (local321 = 0; local321 < local18.anIntArray388.length; local321++) {
											if (local18.anIntArray388[local321] == local312) {
												local1018 = new Class2_Sub5();
												local1018.anObjectArray3 = local18.anObjectArray23;
												local1018.aClass80_3 = local18;
												Static65.aClass108_6.method3334(local1018);
												break label439;
											}
										}
									}
								}
								local18.anInt3630 = Static200.anInt4494;
							}
							if (local18.anObjectArray14 != null && Static198.anInt4445 > local18.anInt3650) {
								if (local18.anIntArray379 == null || Static198.anInt4445 - local18.anInt3650 > 32) {
									local415 = new Class2_Sub5();
									local415.anObjectArray3 = local18.anObjectArray14;
									local415.aClass80_3 = local18;
									Static65.aClass108_6.method3334(local415);
								} else {
									label415: for (local308 = local18.anInt3650; local308 < Static198.anInt4445; local308++) {
										local312 = Static205.anIntArray472[local308 & 0x1F];
										for (local321 = 0; local321 < local18.anIntArray379.length; local321++) {
											if (local312 == local18.anIntArray379[local321]) {
												local1018 = new Class2_Sub5();
												local1018.anObjectArray3 = local18.anObjectArray14;
												local1018.aClass80_3 = local18;
												Static65.aClass108_6.method3334(local1018);
												break label415;
											}
										}
									}
								}
								local18.anInt3650 = Static198.anInt4445;
							}
							if (local18.anObjectArray19 != null && local18.anInt3694 < Static104.anInt2519) {
								if (local18.anIntArray383 == null || Static104.anInt2519 - local18.anInt3694 > 32) {
									local415 = new Class2_Sub5();
									local415.anObjectArray3 = local18.anObjectArray19;
									local415.aClass80_3 = local18;
									Static65.aClass108_6.method3334(local415);
								} else {
									label391: for (local308 = local18.anInt3694; local308 < Static104.anInt2519; local308++) {
										local312 = anIntArray318[local308 & 0x1F];
										for (local321 = 0; local321 < local18.anIntArray383.length; local321++) {
											if (local18.anIntArray383[local321] == local312) {
												local1018 = new Class2_Sub5();
												local1018.aClass80_3 = local18;
												local1018.anObjectArray3 = local18.anObjectArray19;
												Static65.aClass108_6.method3334(local1018);
												break label391;
											}
										}
									}
								}
								local18.anInt3694 = Static104.anInt2519;
							}
							if (local18.anInt3676 < Static6.anInt309 && local18.anObjectArray30 != null) {
								local415 = new Class2_Sub5();
								local415.aClass80_3 = local18;
								local415.anObjectArray3 = local18.anObjectArray30;
								Static65.aClass108_6.method3334(local415);
							}
							if (local18.anInt3676 < Static18.anInt491 && local18.anObjectArray24 != null) {
								local415 = new Class2_Sub5();
								local415.aClass80_3 = local18;
								local415.anObjectArray3 = local18.anObjectArray24;
								Static65.aClass108_6.method3334(local415);
							}
							if (local18.anInt3676 < Static67.anInt1765 && local18.anObjectArray6 != null) {
								local415 = new Class2_Sub5();
								local415.aClass80_3 = local18;
								local415.anObjectArray3 = local18.anObjectArray6;
								Static65.aClass108_6.method3334(local415);
							}
							if (Static103.anInt2517 > local18.anInt3676 && local18.anObjectArray28 != null) {
								local415 = new Class2_Sub5();
								local415.aClass80_3 = local18;
								local415.anObjectArray3 = local18.anObjectArray28;
								Static65.aClass108_6.method3334(local415);
							}
							if (local18.anInt3676 < Static184.anInt4240 && local18.anObjectArray15 != null) {
								local415 = new Class2_Sub5();
								local415.aClass80_3 = local18;
								local415.anObjectArray3 = local18.anObjectArray15;
								Static65.aClass108_6.method3334(local415);
							}
							local18.anInt3676 = Static60.anInt4782;
							if (local18.anObjectArray5 != null) {
								for (local308 = 0; local308 < Static71.anInt1877; local308++) {
									@Pc(1399) Class2_Sub5 local1399 = new Class2_Sub5();
									local1399.aClass80_3 = local18;
									local1399.anInt944 = Static215.anIntArray490[local308];
									local1399.anInt948 = Static169.anIntArray415[local308];
									local1399.anObjectArray3 = local18.anObjectArray5;
									Static65.aClass108_6.method3334(local1399);
								}
							}
						}
					}
					if (!local18.aBoolean215 && Static160.aClass80_13 == null && Static120.aClass80_11 == null && !Static94.aBoolean123) {
						if ((local18.anInt3662 >= 0 || local18.anInt3666 != 0) && local94 <= Static26.anInt663 && Static212.anInt4711 >= local77 && Static26.anInt663 < local116 && local109 > Static212.anInt4711) {
							if (local18.anInt3662 < 0) {
								Static58.aClass80_7 = local18;
							} else {
								Static58.aClass80_7 = arg5[local18.anInt3662];
							}
						}
						if (local18.anInt3640 == 8 && local94 <= Static26.anInt663 && local77 <= Static212.anInt4711 && local116 > Static26.anInt663 && Static212.anInt4711 < local109) {
							Static34.aClass80_1 = local18;
						}
						if (local18.anInt3660 < local18.anInt3632) {
							Static104.method1781(local61 + local18.anInt3635, local18.anInt3632, Static26.anInt663, local18.anInt3660, Static212.anInt4711, local18, local66);
						}
					}
					if (local18.anInt3640 == 0) {
						method2078(local77, local116, local61 - local18.anInt3642, local18.anInt3661, local109, arg5, local94, local66 - local18.anInt3655);
						if (local18.aClass80Array1 != null) {
							method2078(local77, local116, local61 - local18.anInt3642, local18.anInt3661, local109, local18.aClass80Array1, local94, local66 - local18.anInt3655);
						}
						@Pc(1588) Class2_Sub21 local1588 = (Class2_Sub21) Static113.aClass70_8.method2205((long) local18.anInt3661);
						if (local1588 != null) {
							Static204.method3146(local66, local109, local77, local94, local116, local1588.anInt3435, local61);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(ZI)V")
	public static void method2079() {
		@Pc(13) byte[][] local13 = Static150.aByteArrayArray9;
		@Pc(18) int local18 = local13.length;
		@Pc(33) int local33;
		@Pc(47) int local47;
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			local33 = (Static131.anIntArray320[local20] >> 8) * 64 - Static198.anInt4451;
			@Pc(37) byte[] local37 = local13[local20];
			local47 = (Static131.anIntArray320[local20] & 0xFF) * 64 - Static168.anInt3899;
			if (local37 != null) {
				Static194.method3305();
				Static129.method413(Static96.anInt2367 * 8 - 48, local33, (Static125.anInt1525 - 6) * 8, Static149.aClass42Array1, local47, local37);
			}
		}
		for (local33 = 0; local33 < local18; local33++) {
			local47 = (Static131.anIntArray320[local33] >> 8) * 64 - Static198.anInt4451;
			@Pc(101) int local101 = (Static131.anIntArray320[local33] & 0xFF) * 64 - Static168.anInt3899;
			@Pc(105) byte[] local105 = local13[local33];
			if (local105 == null && Static96.anInt2367 < 800) {
				Static194.method3305();
				for (@Pc(118) int local118 = 0; local118 < 4; local118++) {
					Static16.method307(local118, 64, 64, local101, local47);
				}
			}
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(BLjava/awt/Component;)V")
	public static void method2080(@OriginalArg(1) Component arg0) {
		@Pc(18) Method local18 = Static162.aMethod2;
		if (local18 != null) {
			try {
				local18.invoke(arg0, Boolean.FALSE);
			} catch (@Pc(32) Throwable local32) {
			}
		}
		arg0.addKeyListener(Static149.aClass29_1);
		arg0.addFocusListener(Static149.aClass29_1);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(BLclient!ea;)Lclient!je;")
	public static Class28_Sub2 method2081(@OriginalArg(1) Class2_Sub3 arg0) {
		return new Class28_Sub2(arg0.method196(), arg0.method196(), arg0.method196(), arg0.method196(), arg0.method196(), arg0.method196(), arg0.method196(), arg0.method196(), arg0.method166(), arg0.method209());
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "([BB)V")
	public static void method2082(@OriginalArg(0) byte[] arg0) {
		@Pc(7) int local7 = 0;
		while (true) {
			while (local7 < arg0.length) {
				@Pc(21) int local21 = arg0[local7++] * 64 - Static15.anInt422;
				@Pc(31) int local31 = arg0[local7++] * 64 - Static105.anInt2549;
				@Pc(54) int local54;
				@Pc(58) int local58;
				if (local21 > 0 && local31 > 0 && local21 + 64 < Static95.anInt2353 && local31 + 64 < Static40.anInt1214) {
					local54 = local21 >> 6;
					local58 = Static40.anInt1214 - local31 - 1 >> 6;
					for (@Pc(116) int local116 = 0; local116 < 64; local116++) {
						for (@Pc(120) int local120 = -64; local120 < 0; local120++) {
							@Pc(127) byte local127 = arg0[local7++];
							if (local127 != 0) {
								@Pc(139) byte local139;
								if ((local127 & 0x1) == 1) {
									local139 = arg0[local7++];
									if (Static191.aByteArrayArrayArray11[local54][local58] == null) {
										Static191.aByteArrayArrayArray11[local54][local58] = new byte[4096];
									}
									Static191.aByteArrayArrayArray11[local54][local58][(-(local120 + 1) << 6) + local116] = (byte) local139;
								}
								if ((local127 & 0x2) == 2) {
									local139 = arg0[local7++];
									if (Static103.aByteArrayArrayArray8[local54][local58] == null) {
										Static103.aByteArrayArrayArray8[local54][local58] = new byte[4096];
									}
									Static103.aByteArrayArrayArray8[local54][local58][local116 + (-(local120 + 1) << 6)] = (byte) (local139 - 28);
								}
								if ((local127 & 0x4) == 4) {
									local7 += 3;
									@Pc(247) int local247 = (arg0[local7 - 1] & 0xFF) + ((arg0[local7 - 3] & 0xFF) << 16) + ((arg0[local7 - 2] & 0xFF) << 8);
									if (Static44.anIntArrayArrayArray6[local54][local58] == null) {
										Static44.anIntArrayArrayArray6[local54][local58] = new int[4096];
									}
									local247--;
									@Pc(267) Class2_Sub2_Sub14 local267 = Static168.method2705(local247);
									if (local267.anIntArray324 != null) {
										local267 = local267.method2120();
										if (local267 == null || local267.anInt3065 == -1) {
											continue;
										}
									}
									Static44.anIntArrayArrayArray6[local54][local58][(-(local120 + 1) << 6) + local116] = local267.anInt3075 + 1;
									@Pc(306) Class2_Sub8 local306 = new Class2_Sub8();
									local306.anInt1629 = Static40.anInt1214 - local31;
									local306.anInt1631 = local267.anInt3065;
									local306.anInt1630 = local21;
									Static206.aClass108_19.method3334(local306);
								}
							}
						}
					}
				} else {
					for (local54 = 0; local54 < 64; local54++) {
						for (local58 = -64; local58 < 0; local58++) {
							@Pc(65) byte local65 = arg0[local7++];
							if (local65 != 0) {
								if ((local65 & 0x1) == 1) {
									local7++;
								}
								if ((local65 & 0x2) == 2) {
									local7++;
								}
								if ((local65 & 0x4) == 4) {
									local7 += 3;
								}
							}
						}
					}
				}
			}
			return;
		}
	}
}
