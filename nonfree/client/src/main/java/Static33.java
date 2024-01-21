import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!da", name = "T", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_243 = Static158.method3034("Sie befinden sich in einem Mitglieder)2Gebiet(Q");

	@OriginalMember(owner = "client!da", name = "eb", descriptor = "I")
	public static int anInt1058 = 0;

	@OriginalMember(owner = "client!da", name = "qb", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_244 = Static158.method3034("mem=");

	@OriginalMember(owner = "client!da", name = "yb", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_245 = Static158.method3034(")4l");

	@OriginalMember(owner = "client!da", name = "zb", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_246 = Static158.method3034("W-=hlen Sie eine Welt");

	@OriginalMember(owner = "client!da", name = "Bb", descriptor = "I")
	public static int anInt1074 = 0;

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIBIIII[Lclient!ra;I)V")
	public static void method821(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class72[] arg6, @OriginalArg(8) int arg7) {
		for (@Pc(12) int local12 = 0; local12 < arg6.length; local12++) {
			@Pc(18) Class72 local18 = arg6[local12];
			if (local18 != null && (!local18.aBoolean151 || local18.anInt3932 == 0 || local18.aBoolean154 || Static26.method637(local18) != 0 || local18 == Static181.aClass72_13 || local18.anInt3884 == 1338) && arg3 == local18.anInt3937 && (!local18.aBoolean151 || !Static20.method445(local18))) {
				@Pc(68) int local68 = local18.anInt3907 + arg2;
				@Pc(73) int local73 = arg4 + local18.anInt3919;
				if (Static62.aClass72_5 == local18) {
					Static100.anInt2885 = local68;
					Static122.aBoolean124 = true;
					Static139.anInt3670 = local73;
				}
				@Pc(92) int local92;
				@Pc(90) int local90;
				@Pc(94) int local94;
				@Pc(88) int local88;
				@Pc(154) int local154;
				if (local18.anInt3932 == 2) {
					local88 = arg0;
					local90 = arg5;
					local92 = arg1;
					local94 = arg7;
				} else {
					@Pc(123) int local123;
					@Pc(135) int local135;
					if (local18.anInt3932 == 9) {
						local154 = local73 + local18.anInt3871;
						local135 = local73;
						@Pc(162) int local162 = local68 + local18.anInt3878;
						local123 = local68;
						if (local68 > local162) {
							local123 = local162;
							local162 = local68;
						}
						if (local73 > local154) {
							local135 = local154;
							local154 = local73;
						}
						local154++;
						local90 = arg5 >= local135 ? arg5 : local135;
						local88 = local154 >= arg0 ? arg0 : local154;
						local162++;
						local92 = arg1 >= local123 ? arg1 : local123;
						local94 = local162 >= arg7 ? arg7 : local162;
					} else {
						local90 = local73 <= arg5 ? arg5 : local73;
						local92 = arg1 < local68 ? local68 : arg1;
						local123 = local18.anInt3878 + local68;
						local94 = local123 >= arg7 ? arg7 : local123;
						local135 = local18.anInt3871 + local73;
						local88 = arg0 <= local135 ? arg0 : local135;
					}
				}
				if (!local18.aBoolean151 || local94 > local92 && local88 > local90) {
					if (local18.anInt3884 == 1337) {
						Static39.method900(local18);
					} else {
						if (local18.anInt3932 == 0) {
							if (!local18.aBoolean151 && Static20.method445(local18) && local18 != Static150.aClass72_8) {
								continue;
							}
							method821(local88, local92, local68 - local18.anInt3903, local18.anInt3935, local73 - local18.anInt3926, local90, arg6, local94);
							if (local18.aClass72Array1 != null) {
								method821(local88, local92, local68 - local18.anInt3903, local18.anInt3935, local73 - local18.anInt3926, local90, local18.aClass72Array1, local94);
							}
							@Pc(312) Class2_Sub20 local312 = (Class2_Sub20) Static156.aClass51_11.method2458((long) local18.anInt3935);
							if (local312 != null) {
								Static88.method2050(local73, local68, local92, local94, local90, local88, local312.anInt3986);
							}
						}
						if (local18.aBoolean151) {
							@Pc(349) boolean local349;
							if (Static131.anInt215 >= local92 && local90 <= Static157.anInt3985 && Static131.anInt215 < local94 && Static157.anInt3985 < local88) {
								local349 = true;
							} else {
								local349 = false;
							}
							@Pc(355) boolean local355 = false;
							@Pc(357) boolean local357 = false;
							if (Static113.anInt3165 == 1 && local349) {
								local355 = true;
							}
							if (Static147.anInt3820 == 1 && Static74.anInt2294 >= local92 && local90 <= Static174.anInt4254 && Static74.anInt2294 < local94 && Static174.anInt4254 < local88) {
								local357 = true;
							}
							if (local18.anInt3884 == 1338) {
								if (local357) {
									Static138.method539(Static174.anInt4254 - local73, local18, Static74.anInt2294 - local68);
								}
								continue;
							}
							if (local357) {
								Static190.method3485(local18, Static74.anInt2294 - local68, -local73 + Static174.anInt4254);
							}
							if (Static62.aClass72_5 != null && Static62.aClass72_5 != local18 && local349 && Static123.method2612(Static26.method637(local18))) {
								Static168.aClass72_11 = local18;
							}
							if (local18 == Static181.aClass72_13) {
								Static182.anInt4408 = local68;
								Static100.aBoolean111 = true;
								Static145.anInt3787 = local73;
							}
							if (local18.aBoolean154) {
								@Pc(462) Class2_Sub25 local462;
								if (local349 && Static26.anInt803 != 0 && local18.anObjectArray21 != null) {
									local462 = new Class2_Sub25();
									local462.anObjectArray29 = local18.anObjectArray21;
									local462.anInt4604 = Static26.anInt803;
									local462.aClass72_15 = local18;
									Static196.aClass67_15.method2843(local462);
								}
								if (Static62.aClass72_5 != null || Static131.aClass72_2 != null || Static103.aBoolean115) {
									local357 = false;
									local355 = false;
									local349 = false;
								}
								if (!local18.aBoolean152 && local357) {
									local18.aBoolean152 = true;
									if (local18.anObjectArray15 != null) {
										local462 = new Class2_Sub25();
										local462.anInt4604 = Static174.anInt4254 - local73;
										local462.anInt4603 = Static74.anInt2294 - local68;
										local462.aClass72_15 = local18;
										local462.anObjectArray29 = local18.anObjectArray15;
										Static196.aClass67_15.method2843(local462);
									}
								}
								if (local18.aBoolean152 && local355 && local18.anObjectArray5 != null) {
									local462 = new Class2_Sub25();
									local462.anInt4604 = Static157.anInt3985 - local73;
									local462.anInt4603 = Static131.anInt215 - local68;
									local462.aClass72_15 = local18;
									local462.anObjectArray29 = local18.anObjectArray5;
									Static196.aClass67_15.method2843(local462);
								}
								if (local18.aBoolean152 && !local355) {
									local18.aBoolean152 = false;
									if (local18.anObjectArray27 != null) {
										local462 = new Class2_Sub25();
										local462.anObjectArray29 = local18.anObjectArray27;
										local462.anInt4604 = Static157.anInt3985 - local73;
										local462.anInt4603 = Static131.anInt215 - local68;
										local462.aClass72_15 = local18;
										Static179.aClass67_11.method2843(local462);
									}
								}
								if (local355 && local18.anObjectArray10 != null) {
									local462 = new Class2_Sub25();
									local462.aClass72_15 = local18;
									local462.anInt4603 = Static131.anInt215 - local68;
									local462.anObjectArray29 = local18.anObjectArray10;
									local462.anInt4604 = Static157.anInt3985 - local73;
									Static196.aClass67_15.method2843(local462);
								}
								if (!local18.aBoolean149 && local349) {
									local18.aBoolean149 = true;
									if (local18.anObjectArray6 != null) {
										local462 = new Class2_Sub25();
										local462.anInt4604 = Static157.anInt3985 - local73;
										local462.aClass72_15 = local18;
										local462.anInt4603 = Static131.anInt215 - local68;
										local462.anObjectArray29 = local18.anObjectArray6;
										Static196.aClass67_15.method2843(local462);
									}
								}
								if (local18.aBoolean149 && local349 && local18.anObjectArray26 != null) {
									local462 = new Class2_Sub25();
									local462.anObjectArray29 = local18.anObjectArray26;
									local462.anInt4603 = Static131.anInt215 - local68;
									local462.aClass72_15 = local18;
									local462.anInt4604 = Static157.anInt3985 - local73;
									Static196.aClass67_15.method2843(local462);
								}
								if (local18.aBoolean149 && !local349) {
									local18.aBoolean149 = false;
									if (local18.anObjectArray9 != null) {
										local462 = new Class2_Sub25();
										local462.anInt4604 = Static157.anInt3985 - local73;
										local462.anInt4603 = Static131.anInt215 - local68;
										local462.aClass72_15 = local18;
										local462.anObjectArray29 = local18.anObjectArray9;
										Static179.aClass67_11.method2843(local462);
									}
								}
								if (local18.anObjectArray13 != null) {
									local462 = new Class2_Sub25();
									local462.anObjectArray29 = local18.anObjectArray13;
									local462.aClass72_15 = local18;
									Static41.aClass67_2.method2843(local462);
								}
								@Pc(807) int local807;
								@Pc(809) int local809;
								@Pc(825) Class2_Sub25 local825;
								if (local18.anObjectArray18 != null && anInt1058 > local18.anInt3887) {
									if (local18.anIntArray427 == null || anInt1058 - local18.anInt3887 > 32) {
										local462 = new Class2_Sub25();
										local462.aClass72_15 = local18;
										local462.anObjectArray29 = local18.anObjectArray18;
										Static196.aClass67_15.method2843(local462);
									} else {
										label385: for (local154 = local18.anInt3887; local154 < anInt1058; local154++) {
											local807 = Static155.anIntArray439[local154 & 0x1F];
											for (local809 = 0; local809 < local18.anIntArray427.length; local809++) {
												if (local807 == local18.anIntArray427[local809]) {
													local825 = new Class2_Sub25();
													local825.anObjectArray29 = local18.anObjectArray18;
													local825.aClass72_15 = local18;
													Static196.aClass67_15.method2843(local825);
													break label385;
												}
											}
										}
									}
									local18.anInt3887 = anInt1058;
								}
								if (local18.anObjectArray22 != null && local18.anInt3873 < Static167.anInt4110) {
									if (local18.anIntArray429 == null || Static167.anInt4110 - local18.anInt3873 > 32) {
										local462 = new Class2_Sub25();
										local462.anObjectArray29 = local18.anObjectArray22;
										local462.aClass72_15 = local18;
										Static196.aClass67_15.method2843(local462);
									} else {
										label361: for (local154 = local18.anInt3873; local154 < Static167.anInt4110; local154++) {
											local807 = Static54.anIntArray168[local154 & 0x1F];
											for (local809 = 0; local809 < local18.anIntArray429.length; local809++) {
												if (local807 == local18.anIntArray429[local809]) {
													local825 = new Class2_Sub25();
													local825.anObjectArray29 = local18.anObjectArray22;
													local825.aClass72_15 = local18;
													Static196.aClass67_15.method2843(local825);
													break label361;
												}
											}
										}
									}
									local18.anInt3873 = Static167.anInt4110;
								}
								if (local18.anObjectArray16 != null && Static56.anInt1776 > local18.anInt3910) {
									if (local18.anIntArray431 == null || Static56.anInt1776 - local18.anInt3910 > 32) {
										local462 = new Class2_Sub25();
										local462.anObjectArray29 = local18.anObjectArray16;
										local462.aClass72_15 = local18;
										Static196.aClass67_15.method2843(local462);
									} else {
										label337: for (local154 = local18.anInt3910; local154 < Static56.anInt1776; local154++) {
											local807 = Static100.anIntArray332[local154 & 0x1F];
											for (local809 = 0; local809 < local18.anIntArray431.length; local809++) {
												if (local18.anIntArray431[local809] == local807) {
													local825 = new Class2_Sub25();
													local825.anObjectArray29 = local18.anObjectArray16;
													local825.aClass72_15 = local18;
													Static196.aClass67_15.method2843(local825);
													break label337;
												}
											}
										}
									}
									local18.anInt3910 = Static56.anInt1776;
								}
								if (local18.anInt3936 < Static136.anInt3588 && local18.anObjectArray17 != null) {
									local462 = new Class2_Sub25();
									local462.aClass72_15 = local18;
									local462.anObjectArray29 = local18.anObjectArray17;
									Static196.aClass67_15.method2843(local462);
								}
								if (Static1.anInt4 > local18.anInt3936 && local18.anObjectArray23 != null) {
									local462 = new Class2_Sub25();
									local462.anObjectArray29 = local18.anObjectArray23;
									local462.aClass72_15 = local18;
									Static196.aClass67_15.method2843(local462);
								}
								if (Static96.anInt3104 > local18.anInt3936 && local18.anObjectArray11 != null) {
									local462 = new Class2_Sub25();
									local462.aClass72_15 = local18;
									local462.anObjectArray29 = local18.anObjectArray11;
									Static196.aClass67_15.method2843(local462);
								}
								if (local18.anInt3936 < Static66.anInt2049 && local18.anObjectArray28 != null) {
									local462 = new Class2_Sub25();
									local462.anObjectArray29 = local18.anObjectArray28;
									local462.aClass72_15 = local18;
									Static196.aClass67_15.method2843(local462);
								}
								if (Static82.anInt2436 > local18.anInt3936 && local18.anObjectArray24 != null) {
									local462 = new Class2_Sub25();
									local462.aClass72_15 = local18;
									local462.anObjectArray29 = local18.anObjectArray24;
									Static196.aClass67_15.method2843(local462);
								}
								local18.anInt3936 = Static157.anInt3990;
								if (local18.anObjectArray8 != null) {
									for (local154 = 0; local154 < Static147.anInt3824; local154++) {
										@Pc(1181) Class2_Sub25 local1181 = new Class2_Sub25();
										local1181.aClass72_15 = local18;
										local1181.anInt4600 = Static4.anIntArray5[local154];
										local1181.anInt4601 = Static187.anIntArray505[local154];
										local1181.anObjectArray29 = local18.anObjectArray8;
										Static196.aClass67_15.method2843(local1181);
									}
								}
							}
						}
						if (!local18.aBoolean151) {
							if (Static62.aClass72_5 != null || Static131.aClass72_2 != null || Static103.aBoolean115) {
								return;
							}
							if ((local18.anInt3895 >= 0 || local18.anInt3905 != 0) && Static131.anInt215 >= local92 && local90 <= Static157.anInt3985 && Static131.anInt215 < local94 && local88 > Static157.anInt3985) {
								if (local18.anInt3895 < 0) {
									Static150.aClass72_8 = local18;
								} else {
									Static150.aClass72_8 = arg6[local18.anInt3895];
								}
							}
							if (local18.anInt3932 == 8 && local92 <= Static131.anInt215 && Static157.anInt3985 >= local90 && Static131.anInt215 < local94 && Static157.anInt3985 < local88) {
								Static16.aClass72_3 = local18;
							}
							if (local18.anInt3871 < local18.anInt3886) {
								Static190.method3483(local18.anInt3886, Static157.anInt3985, Static131.anInt215, local18.anInt3878 + local68, local18.anInt3871, local18, local73);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
	public static Class method822(@OriginalArg(0) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(B)V")
	public static void method826() {
		if (Static29.aClass66_10 != null) {
			Static29.aClass66_10.method2834();
			Static29.aClass66_10 = null;
		}
		Static15.method395();
		Static149.method2962();
		for (@Pc(17) int local17 = 0; local17 < 4; local17++) {
			Static48.aClass35Array1[local17].method1662();
		}
		System.gc();
		Static137.method2788();
		Static165.anInt4097 = -1;
		Static107.aBoolean118 = false;
		Static24.method612();
		Static139.method2831(10);
	}
}
