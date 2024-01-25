import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!client", name = "ob", descriptor = "Lclient!ha;")
	public static Class104 aClass104_7;

	@OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
	public static int anInt1587;

	@OriginalMember(owner = "client!client", name = "cb", descriptor = "Lclient!nd;")
	public static final Class1_Sub39 aClass1_Sub39_1 = new Class1_Sub39(0, 0);

	@OriginalMember(owner = "client!client", name = "qb", descriptor = "Lclient!vj;")
	public static final Class305 aClass305_66 = new Class305(111, 1);

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZILjava/io/File;)[B")
	public static byte[] method1566(@OriginalArg(1) int arg0, @OriginalArg(2) File arg1) {
		try {
			@Pc(11) byte[] local11 = new byte[arg0];
			Static499.method7643(arg0, local11, arg1);
			return local11;
		} catch (@Pc(19) IOException local19) {
			return null;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method1570() {
		for (@Pc(1) int local1 = 0; local1 < Static237.anInt4563; local1++) {
			@Pc(6) int[] local6 = Static118.anIntArrayArray26[local1];
			for (@Pc(8) int local8 = 0; local8 < Static373.anInt6694; local8++) {
				local6[local8] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	public static void method1571(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static207.anInt4085;
		@Pc(3) int[] local3 = Static209.anIntArray327;
		@Pc(11) int local11 = Static526.aBoolean698 ? local1 : local1 + Static141.anInt2822;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class20_Sub1_Sub1 local23;
			if (local13 < local1) {
				local23 = Static511.aClass20_Sub1_Sub1_Sub1Array1[local3[local13]];
			} else {
				local23 = ((Class1_Sub41) Static362.aClass230_46.method6144((long) Static220.anIntArray339[local13 - local1])).aClass20_Sub1_Sub1_Sub2_2;
			}
			if (local23.aByte108 == arg0) {
				local23.anInt8994 = 0;
				if (local23.anInt9029 < 0) {
					local23.aBoolean678 = false;
				} else {
					@Pc(54) int local54 = local23.method7808();
					if ((local54 & 0x1) == 0) {
						if ((local23.anInt8954 & 0x7F) != 0 || (local23.anInt8949 & 0x7F) != 0) {
							local23.aBoolean678 = false;
							continue;
						}
					} else if ((local23.anInt8954 & 0x7F) != 64 || (local23.anInt8949 & 0x7F) != 64) {
						local23.aBoolean678 = false;
						continue;
					}
					@Pc(96) int local96;
					@Pc(101) int local101;
					@Pc(126) int local126;
					if (local54 == 1) {
						local96 = local23.anInt8954 >> 7;
						local101 = local23.anInt8949 >> 7;
						if (local23.anInt9029 != Static118.anIntArrayArray26[local96][local101]) {
							local23.aBoolean678 = true;
							continue;
						}
						if (Static499.anIntArrayArray114[local96][local101] > 1) {
							local126 = Static499.anIntArrayArray114[local96][local101]--;
							local23.aBoolean678 = true;
							continue;
						}
					} else {
						local96 = (local54 - 1) * 64 + 60;
						local101 = local23.anInt8954 - local96 >> 7;
						@Pc(155) int local155 = local23.anInt8949 - local96 >> 7;
						@Pc(162) int local162 = local23.anInt8954 + local96 >> 7;
						@Pc(169) int local169 = local23.anInt8949 + local96 >> 7;
						if (!Static353.method5814(local155, local23.anInt9029, local162, local101, local169)) {
							for (@Pc(180) int local180 = local101; local180 <= local162; local180++) {
								for (@Pc(183) int local183 = local155; local183 <= local169; local183++) {
									if (local23.anInt9029 == Static118.anIntArrayArray26[local180][local183]) {
										local126 = Static499.anIntArrayArray114[local180][local183]--;
									}
								}
							}
							local23.aBoolean678 = true;
							continue;
						}
					}
					if (local23 instanceof Class20_Sub1_Sub1_Sub1 && local23.aClass1_Sub27_3 != null && Static445.anInt7791 >= local23.aClass1_Sub27_3.anInt4507 && Static445.anInt7791 < local23.aClass1_Sub27_3.anInt4512) {
						((Class20_Sub1_Sub1_Sub1) local23).aBoolean52 = false;
					}
					local23.aBoolean678 = false;
					local23.anInt8947 = Static508.method7754(local23.anInt8949, local23.anInt8954, local23.aByte108);
					Static391.method6237(local23, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIILclient!qa;III)V")
	public static void method1572(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class4 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(11) Interface7 local11 = (Interface7) Static47.method5108(arg5, arg0, arg1);
		@Pc(20) Class51 local20;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(36) int local36;
		if (local11 != null) {
			local20 = Static398.aClass18_4.method609(local11.method8046());
			local26 = local11.method8044() & 0x3;
			local30 = local11.method8047();
			if (local20.anInt1614 == -1) {
				local36 = arg3;
				if (local20.anInt1632 > 0) {
					local36 = arg7;
				}
				if (local30 == 0 || local30 == 2) {
					if (local26 == 0) {
						arg4.method7224(arg6, 4, local36, arg2);
					} else if (local26 == 1) {
						arg4.method7157(4, local36, arg2, arg6);
					} else if (local26 == 2) {
						arg4.method7224(arg6 + 3, 4, local36, arg2);
					} else if (local26 == 3) {
						arg4.method7157(4, local36, arg2 + 3, arg6);
					}
				}
				if (local30 == 3) {
					if (local26 == 0) {
						arg4.method7162(local36, 1, arg6, arg2, 1);
					} else if (local26 == 1) {
						arg4.method7162(local36, 1, arg6 + 3, arg2, 1);
					} else if (local26 == 2) {
						arg4.method7162(local36, 1, arg6 + 3, arg2 + 3, 1);
					} else if (local26 == 3) {
						arg4.method7162(local36, 1, arg6, arg2 + 3, 1);
					}
				}
				if (local30 == 2) {
					if (local26 == 0) {
						arg4.method7157(4, local36, arg2, arg6);
					} else if (local26 == 1) {
						arg4.method7224(arg6 + 3, 4, local36, arg2);
					} else if (local26 == 2) {
						arg4.method7157(4, local36, arg2 + 3, arg6);
					} else if (local26 == 3) {
						arg4.method7224(arg6, 4, local36, arg2);
					}
				}
			} else {
				Static50.method1400(arg2, local26, arg4, arg6, local20);
			}
		}
		local11 = (Interface7) Static100.method2041(arg5, arg0, arg1, fp.class);
		if (local11 != null) {
			local20 = Static398.aClass18_4.method609(local11.method8046());
			local26 = local11.method8044() & 0x3;
			local30 = local11.method8047();
			if (local20.anInt1614 != -1) {
				Static50.method1400(arg2, local26, arg4, arg6, local20);
			} else if (local30 == 9) {
				local36 = -1118482;
				if (local20.anInt1632 > 0) {
					local36 = -1179648;
				}
				if (local26 == 0 || local26 == 2) {
					arg4.method7194(arg6, local36, arg6 + 3, arg2, arg2 + 3);
				} else {
					arg4.method7194(arg6, local36, arg6 + 3, arg2 + 3, arg2);
				}
			}
		}
		local11 = (Interface7) Static465.method7066(arg5, arg0, arg1);
		if (local11 == null) {
			return;
		}
		local20 = Static398.aClass18_4.method609(local11.method8046());
		local26 = local11.method8044() & 0x3;
		if (local20.anInt1614 != -1) {
			Static50.method1400(arg2, local26, arg4, arg6, local20);
			return;
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method1574() {
		@Pc(1) int local1 = Static207.anInt4085;
		@Pc(3) int[] local3 = Static209.anIntArray327;
		@Pc(11) int local11 = Static526.aBoolean698 ? local1 : local1 + Static141.anInt2822;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class20_Sub1_Sub1 local23;
			if (local13 < local1) {
				local23 = Static511.aClass20_Sub1_Sub1_Sub1Array1[local3[local13]];
			} else {
				local23 = ((Class1_Sub41) Static362.aClass230_46.method6144((long) Static220.anIntArray339[local13 - local1])).aClass20_Sub1_Sub1_Sub2_2;
			}
			if (local23.anInt9029 >= 0) {
				@Pc(43) int local43 = local23.method7808();
				if ((local43 & 0x1) == 0) {
					if ((local23.anInt8954 & 0x7F) == 0 && (local23.anInt8949 & 0x7F) == 0) {
						continue;
					}
				} else if ((local23.anInt8954 & 0x7F) == 64 && (local23.anInt8949 & 0x7F) == 64) {
					continue;
				}
				if (local23 instanceof Class20_Sub1_Sub1_Sub1 && local23.aClass1_Sub27_3 != null && Static445.anInt7791 >= local23.aClass1_Sub27_3.anInt4507 && Static445.anInt7791 < local23.aClass1_Sub27_3.anInt4512) {
					((Class20_Sub1_Sub1_Sub1) local23).aBoolean52 = false;
				}
				local23.anInt8947 = Static508.method7754(local23.anInt8949, local23.anInt8954, local23.aByte108);
				Static391.method6237(local23, true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!et;)Z")
	public static boolean method1575(@OriginalArg(0) Class91 arg0) {
		if (Static428.aBoolean561) {
			if (method1580(arg0).anInt1806 != 0) {
				return false;
			}
			if (arg0.anInt2452 == 0) {
				return false;
			}
		}
		return arg0.aBoolean201;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!et;)Lclient!et;")
	public static Class91 method1576(@OriginalArg(0) Class91 arg0) {
		@Pc(4) int local4 = method1580(arg0).method1746();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static384.method6156(arg0.anInt2375);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
	public static void method1578(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static207.anInt4085;
		@Pc(3) int[] local3 = Static209.anIntArray327;
		for (@Pc(5) int local5 = 0; local5 < local1 + Static141.anInt2822; local5++) {
			@Pc(15) Class20_Sub1_Sub1 local15;
			if (local5 < local1) {
				local15 = Static511.aClass20_Sub1_Sub1_Sub1Array1[local3[local5]];
			} else {
				local15 = ((Class1_Sub41) Static362.aClass230_46.method6144((long) Static220.anIntArray339[local5 - local1])).aClass20_Sub1_Sub1_Sub2_2;
			}
			if (local15.aByte108 == arg0 && local15.anInt9029 >= 0) {
				@Pc(39) int local39 = local15.method7808();
				if ((local39 & 0x1) == 0) {
					if ((local15.anInt8954 & 0x7F) != 0 || (local15.anInt8949 & 0x7F) != 0) {
						continue;
					}
				} else if ((local15.anInt8954 & 0x7F) != 64 || (local15.anInt8949 & 0x7F) != 64) {
					continue;
				}
				@Pc(75) int local75;
				@Pc(80) int local80;
				@Pc(116) int local116;
				if (local39 == 1) {
					local75 = local15.anInt8954 >> 7;
					local80 = local15.anInt8949 >> 7;
					if (local15.anInt9029 > Static118.anIntArrayArray26[local75][local80]) {
						Static118.anIntArrayArray26[local75][local80] = local15.anInt9029;
						Static499.anIntArrayArray114[local75][local80] = 1;
					} else if (local15.anInt9029 == Static118.anIntArrayArray26[local75][local80]) {
						local116 = Static499.anIntArrayArray114[local75][local80]++;
					}
				} else {
					local75 = (local39 - 1) * 64 + 60;
					local80 = local15.anInt8954 - local75 >> 7;
					@Pc(142) int local142 = local15.anInt8949 - local75 >> 7;
					@Pc(149) int local149 = local15.anInt8954 + local75 >> 7;
					@Pc(156) int local156 = local15.anInt8949 + local75 >> 7;
					for (@Pc(158) int local158 = local80; local158 <= local149; local158++) {
						for (@Pc(161) int local161 = local142; local161 <= local156; local161++) {
							if (local15.anInt9029 > Static118.anIntArrayArray26[local158][local161]) {
								Static118.anIntArrayArray26[local158][local161] = local15.anInt9029;
								Static499.anIntArrayArray114[local158][local161] = 1;
							} else if (local15.anInt9029 == Static118.anIntArrayArray26[local158][local161]) {
								local116 = Static499.anIntArrayArray114[local158][local161]++;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!et;)Lclient!db;")
	public static Class1_Sub9 method1580(@OriginalArg(0) Class91 arg0) {
		@Pc(13) Class1_Sub9 local13 = (Class1_Sub9) Static339.aClass230_35.method6144(((long) arg0.anInt2368 << 32) + (long) arg0.anInt2395);
		return local13 == null ? arg0.aClass1_Sub9_2 : local13;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method1582() {
		@Pc(1) int local1 = Static207.anInt4085;
		@Pc(3) int[] local3 = Static209.anIntArray327;
		@Pc(20) boolean local20 = Static286.aClass1_Sub15_Sub1_1.anInt7034 == 1 && local1 > 200 || Static286.aClass1_Sub15_Sub1_1.anInt7034 == 0 && local1 > 50;
		@Pc(75) int local75;
		for (@Pc(22) int local22 = 0; local22 < local1; local22++) {
			@Pc(29) Class20_Sub1_Sub1_Sub1 local29 = Static511.aClass20_Sub1_Sub1_Sub1Array1[local3[local22]];
			if (local29.method726()) {
				local29.method7800();
				if (local29.aShort124 >= 0 && local29.aShort123 >= 0 && local29.aShort126 < Static237.anInt4563 && local29.aShort125 < Static373.anInt6694) {
					local29.aBoolean52 = local29.aBoolean677 ? local20 : false;
					if (local29 == Static107.aClass20_Sub1_Sub1_Sub1_1) {
						local29.anInt9029 = Integer.MAX_VALUE;
					} else {
						local75 = 0;
						if (!local29.aBoolean678) {
							local75++;
						}
						if (local29.anInt8982 > Static445.anInt7791) {
							local75 += 2;
						}
						local75 += 5 - local29.method7808() << 2;
						if (local29.aBoolean54) {
							local75 += 512;
						} else {
							if (Static432.anInt7508 == 0) {
								local75 += 32;
							} else {
								local75 += 128;
							}
							local75 += 256;
						}
						local29.anInt9029 = local75 + 1;
					}
				} else {
					local29.anInt9029 = -1;
				}
			} else {
				local29.anInt9029 = -1;
			}
		}
		for (@Pc(116) int local116 = 0; local116 < Static141.anInt2822; local116++) {
			@Pc(127) Class20_Sub1_Sub1_Sub2 local127 = ((Class1_Sub41) Static362.aClass230_46.method6144((long) Static220.anIntArray339[local116])).aClass20_Sub1_Sub1_Sub2_2;
			if (local127.method7825() && local127.aClass283_1.method7375(Static417.aClass10_1)) {
				local127.method7800();
				if (local127.aShort124 >= 0 && local127.aShort123 >= 0 && local127.aShort126 < Static237.anInt4563 && local127.aShort125 < Static373.anInt6694) {
					@Pc(164) int local164 = 0;
					if (!local127.aBoolean678) {
						local164++;
					}
					if (local127.anInt8982 > Static445.anInt7791) {
						local164 += 2;
					}
					local164 += 5 - local127.method7808() << 2;
					if (Static432.anInt7508 == 0) {
						if (local127.aClass283_1.aBoolean626) {
							local164 += 64;
						} else {
							local164 += 128;
						}
					} else if (Static432.anInt7508 == 1) {
						if (local127.aClass283_1.aBoolean626) {
							local164 += 32;
						} else {
							local164 += 64;
						}
					}
					if (local127.aClass283_1.aBoolean623) {
						local164 += 1024;
					} else if (!local127.aClass283_1.aBoolean622) {
						local164 += 256;
					}
					local127.anInt9029 = local164 + 1;
				} else {
					local127.anInt9029 = -1;
				}
			} else {
				local127.anInt9029 = -1;
			}
		}
		for (local75 = 0; local75 < Static261.aClass248Array1.length; local75++) {
			@Pc(230) Class248 local230 = Static261.aClass248Array1[local75];
			if (local230 != null) {
				if (local230.anInt7271 == 1) {
					@Pc(244) Class1_Sub41 local244 = (Class1_Sub41) Static362.aClass230_46.method6144((long) local230.anInt7267);
					if (local244 != null) {
						@Pc(249) Class20_Sub1_Sub1_Sub2 local249 = local244.aClass20_Sub1_Sub1_Sub2_2;
						if (local249.anInt9029 >= 0) {
							local249.anInt9029 += 2048;
						}
					}
				} else if (local230.anInt7271 == 10) {
					@Pc(268) Class20_Sub1_Sub1_Sub1 local268 = Static511.aClass20_Sub1_Sub1_Sub1Array1[local230.anInt7267];
					if (local268 != null && local268 != Static107.aClass20_Sub1_Sub1_Sub1_1 && local268.anInt9029 >= 0) {
						local268.anInt9029 += 2048;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!et;IIIIIIIII)V")
	public static void method1583(@OriginalArg(0) Class91[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class91 local6 = arg0[local1];
			if (local6 != null && local6.anInt2375 == arg1) {
				@Pc(17) int local17 = local6.anInt2423 + arg6;
				@Pc(22) int local22 = local6.anInt2409 + arg7;
				@Pc(28) int local28;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				if (local6.anInt2452 == 2) {
					local28 = arg2;
					local30 = arg3;
					local32 = arg4;
					local34 = arg5;
				} else {
					@Pc(40) int local40 = local17 + local6.anInt2399;
					@Pc(45) int local45 = local22 + local6.anInt2378;
					if (local6.anInt2452 == 9) {
						local40++;
						local45++;
					}
					local28 = local17 > arg2 ? local17 : arg2;
					local30 = local22 > arg3 ? local22 : arg3;
					local32 = local40 < arg4 ? local40 : arg4;
					local34 = local45 < arg5 ? local45 : arg5;
				}
				if (local6.anInt2452 == 0 || local6.aBoolean200 || method1580(local6).anInt1806 != 0 || local6 == Static441.aClass91_13 || local6.anInt2429 == Static155.anInt3070) {
					if (!method1575(local6)) {
						if (local6 == Static360.aClass91_10 && Static491.method7542(Static360.aClass91_10) != null) {
							Static518.aBoolean686 = true;
							Static119.anInt2480 = local17;
							Static438.anInt7678 = local22;
						}
						if (local6.aBoolean209 || local28 < local32 && local30 < local34) {
							if (local6.aBoolean197 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								for (@Pc(152) Class1_Sub10 local152 = (Class1_Sub10) Static282.aClass295_21.method7543(); local152 != null; local152 = (Class1_Sub10) Static282.aClass295_21.method7540()) {
									if (local152.aBoolean178) {
										local152.method8239();
										local152.aClass91_2.aBoolean207 = false;
									}
								}
								if (Static66.anInt1690 == 0) {
									Static360.aClass91_10 = null;
									Static441.aClass91_13 = null;
								}
								Static462.anInt7983 = 0;
								Static482.aBoolean635 = false;
								Static418.aBoolean499 = false;
								if (!Static238.aBoolean354) {
									Static130.method7388();
								}
							}
							@Pc(208) boolean local208;
							if (Static10.aClass99_1.method6618() >= local28 && Static10.aClass99_1.method6619() >= local30 && Static10.aClass99_1.method6618() < local32 && Static10.aClass99_1.method6619() < local34) {
								local208 = true;
							} else {
								local208 = false;
							}
							if (!Static181.aBoolean310 && local208) {
								if (local6.anInt2420 >= 0) {
									Static245.anInt4711 = local6.anInt2420;
								} else if (local6.aBoolean197) {
									Static245.anInt4711 = -1;
								}
							}
							if (!Static238.aBoolean354 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								Static161.method2902(local6, arg9 - local22, arg8 - local17);
							}
							@Pc(252) boolean local252 = false;
							if (Static10.aClass99_1.method6620() && local208) {
								local252 = true;
							}
							@Pc(262) boolean local262 = false;
							@Pc(267) Class1_Sub32 local267 = (Class1_Sub32) Static77.aClass295_9.method7543();
							if (local267 != null && local267.method5776() == 0 && local267.method5772() >= local28 && local267.method5774() >= local30 && local267.method5772() < local32 && local267.method5774() < local34) {
								local262 = true;
							}
							@Pc(300) int local300;
							@Pc(434) int local434;
							if (local6.aByteArray31 != null) {
								for (local300 = 0; local300 < local6.aByteArray31.length; local300++) {
									if (Static25.aClass241_1.method6303(local6.aByteArray31[local300])) {
										if (local6.anIntArray185 == null || Static445.anInt7791 >= local6.anIntArray185[local300]) {
											@Pc(332) byte local332 = local6.aByteArray32[local300];
											if (local332 == 0 || ((local332 & 0x8) == 0 || !Static25.aClass241_1.method6303(86) && !Static25.aClass241_1.method6303(82) && !Static25.aClass241_1.method6303(81)) && ((local332 & 0x2) == 0 || Static25.aClass241_1.method6303(86)) && ((local332 & 0x1) == 0 || Static25.aClass241_1.method6303(82)) && ((local332 & 0x4) == 0 || Static25.aClass241_1.method6303(81))) {
												if (local300 < 10) {
													Static465.method7075(local300 + 1, "", local6.anInt2368, -1);
												} else if (local300 == 10) {
													Static417.method6564();
													@Pc(403) Class1_Sub9 local403 = method1580(local6);
													Static37.method1113(local403.method1741(), local403.anInt1812, local6);
													Static151.aString116 = Static455.method6992(local6);
													if (Static151.aString116 == null) {
														Static151.aString116 = "Null";
													}
													Static201.aString84 = local6.aString54 + "<col=ffffff>";
												}
												local434 = local6.anIntArray181[local300];
												if (local6.anIntArray185 == null) {
													local6.anIntArray185 = new int[local6.aByteArray31.length];
												}
												if (local434 == 0) {
													local6.anIntArray185[local300] = Integer.MAX_VALUE;
												} else {
													local6.anIntArray185[local300] = Static445.anInt7791 + local434;
												}
											}
										}
									} else if (local6.anIntArray185 != null) {
										local6.anIntArray185[local300] = 0;
									}
								}
							}
							if (local262) {
								Static131.method2485(local267.method5774() - local22, local267.method5772() - local17, local6);
							}
							if (Static360.aClass91_10 != null && Static360.aClass91_10 != local6 && local208 && method1580(local6).method1743()) {
								Static467.aClass91_15 = local6;
							}
							if (local6 == Static441.aClass91_13) {
								Static276.aBoolean647 = true;
								Static497.anInt1561 = local17;
								Static67.anInt1732 = local22;
							}
							if (local6.aBoolean200 || local6.anInt2429 != 0) {
								@Pc(519) Class1_Sub10 local519;
								if (local208 && Static372.anInt6690 != 0 && local6.anObjectArray29 != null) {
									local519 = new Class1_Sub10();
									local519.aBoolean178 = true;
									local519.aClass91_2 = local6;
									local519.anInt2120 = Static372.anInt6690;
									local519.anObjectArray4 = local6.anObjectArray29;
									Static282.aClass295_21.method7533(local519);
								}
								if (Static360.aClass91_10 != null || Static238.aBoolean354 || local6.anInt2429 != Static215.anInt4291 && Static462.anInt7983 > 0) {
									local262 = false;
									local252 = false;
									local208 = false;
								}
								@Pc(674) int local674;
								if (local6.anInt2429 != 0) {
									if (local6.anInt2429 == Static429.anInt7441 || local6.anInt2429 == Static274.anInt5247) {
										Static400.aClass91_12 = local6;
										if (Static516.aClass62_1 != null) {
											Static516.aClass62_1.method1794(Static455.aClass4_11, local6.anInt2378);
										}
										if (local6.anInt2429 == Static429.anInt7441) {
											if (!Static238.aBoolean354 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
												Static35.method1104(arg8, arg9, Static455.aClass4_11);
												for (@Pc(602) Class46_Sub2 local602 = (Class46_Sub2) Static456.aClass184_37.method5138(); local602 != null; local602 = (Class46_Sub2) Static456.aClass184_37.method5145()) {
													if (arg8 >= local602.anInt1872 && arg8 < local602.anInt1873 && arg9 >= local602.anInt1870 && arg9 < local602.anInt1871) {
														Static130.method7388();
														Static487.method7515(local602.aClass20_Sub1_Sub1_1);
													}
												}
											}
											Static290.method5099(local22, local17, local6);
											continue;
										}
									}
									@Pc(713) int local713;
									if (local6.anInt2429 == Static155.anInt3070) {
										if (local6.method2287(Static455.aClass4_11) == null || Static235.anInt4528 != 0 && Static235.anInt4528 != 3 || Static238.aBoolean354 || arg8 < local28 || arg9 < local30 || arg8 >= local32 || arg9 >= local34) {
											continue;
										}
										local300 = arg8 - local17;
										local674 = arg9 - local22;
										local434 = local6.anIntArray189[local674];
										if (local300 < local434 || local300 > local434 + local6.anIntArray184[local674]) {
											continue;
										}
										local300 -= local6.anInt2399 / 2;
										local674 -= local6.anInt2378 / 2;
										if (Static170.anInt3418 == 4) {
											local713 = (int) Static135.aFloat193 & 0x3FFF;
										} else {
											local713 = (int) Static135.aFloat193 + Static445.anInt7798 & 0x3FFF;
										}
										@Pc(725) int local725 = Class200_Sub1.lb[local713];
										@Pc(729) int local729 = Class200_Sub1.anIntArray576[local713];
										if (Static170.anInt3418 != 4) {
											local725 = local725 * (Static220.anInt4325 + 256) >> 8;
											local729 = local729 * (Static220.anInt4325 + 256) >> 8;
										}
										@Pc(758) int local758 = local674 * local725 + local300 * local729 >> 15;
										@Pc(768) int local768 = local674 * local729 - local300 * local725 >> 15;
										@Pc(779) int local779;
										@Pc(787) int local787;
										if (Static170.anInt3418 == 4) {
											local779 = (Static341.anInt6297 >> 7) + (local758 >> 2);
											local787 = (Static181.anInt3812 >> 7) - (local768 >> 2);
										} else {
											@Pc(796) int local796 = (Static107.aClass20_Sub1_Sub1_Sub1_1.method7808() - 1) * 64;
											local779 = (Static107.aClass20_Sub1_Sub1_Sub1_1.anInt8954 - local796 >> 7) + (local758 >> 2);
											local787 = (Static107.aClass20_Sub1_Sub1_Sub1_1.anInt8949 - local796 >> 7) - (local768 >> 2);
										}
										if (Static181.aBoolean310 && (Static59.anInt1479 & 0x40) != 0) {
											@Pc(829) Class91 local829 = Static429.method6657(Static49.anInt1304, Static119.anInt2478);
											if (local829 == null) {
												Static417.method6564();
											} else {
												Static18.method539(15, true, local787, Static266.anInt5103, local779, " ->", Static151.aString116, 1L, false, local6.anInt2391);
											}
											continue;
										}
										if (Static332.aClass250_4 == Static116.aClass250_2) {
											Static18.method539(51, true, local787, -1, local779, "", Static467.aClass45_122.method1474(Static544.anInt7853), 1L, false, -1);
										}
										Static18.method539(11, true, local787, Static514.anInt9106, local779, "", Static252.aString108, 1L, false, -1);
										continue;
									}
									if (local6.anInt2429 == Static215.anInt4291) {
										Static267.aClass91_9 = local6;
										if (local208) {
											Static482.aBoolean635 = true;
										}
										if (local262) {
											local300 = (int) ((double) (local267.method5772() - local17 - local6.anInt2399 / 2) * 2.0D / (double) Static335.aFloat103);
											local674 = (int) -((double) (local267.method5774() - local22 - local6.anInt2378 / 2) * 2.0D / (double) Static335.aFloat103);
											local434 = Static64.anInt1610 + local300 + Static335.anInt4941;
											local713 = Static32.anInt1050 + local674 + Static335.anInt4935;
											@Pc(943) Class1_Sub2_Sub12 local943 = Static27.method796();
											if (local943 == null) {
												continue;
											}
											@Pc(948) int[] local948 = new int[3];
											local943.method5737(local948, local434, local713);
											if (local948 != null) {
												if (Static25.aClass241_1.method6303(82) && Static378.anInt6739 > 0) {
													Static89.method1899(local948[1], local948[0], local948[2]);
													continue;
												}
												Static418.aBoolean499 = true;
												Static375.anInt8461 = local948[0];
												Static338.anInt3837 = local948[1];
												Static76.anInt1814 = local948[2];
											}
											Static462.anInt7983 = 1;
											Static230.aBoolean345 = false;
											Static342.anInt6325 = Static10.aClass99_1.method6618();
											Static121.anInt2499 = Static10.aClass99_1.method6619();
											continue;
										}
										if (local252 && Static462.anInt7983 > 0) {
											if (Static462.anInt7983 == 1 && (Static342.anInt6325 != Static10.aClass99_1.method6618() || Static121.anInt2499 != Static10.aClass99_1.method6619())) {
												Static120.anInt8636 = Static64.anInt1610;
												Static241.anInt4646 = Static32.anInt1050;
												Static462.anInt7983 = 2;
											}
											if (Static462.anInt7983 == 2) {
												Static230.aBoolean345 = true;
												Static407.method6487(Static120.anInt8636 + (int) ((double) (Static342.anInt6325 - Static10.aClass99_1.method6618()) * 2.0D / (double) Static335.aFloat104));
												Static406.method6477(Static241.anInt4646 - (int) ((double) (Static121.anInt2499 - Static10.aClass99_1.method6619()) * 2.0D / (double) Static335.aFloat104));
											}
											continue;
										}
										if (Static462.anInt7983 > 0 && !Static230.aBoolean345) {
											if ((Static410.anInt7616 == 1 || Static455.method6993()) && Static197.anInt4015 > 2) {
												Static327.method5592(Static121.anInt2499, Static342.anInt6325);
											} else if (Static14.method516()) {
												Static327.method5592(Static121.anInt2499, Static342.anInt6325);
											}
										}
										Static462.anInt7983 = 0;
										continue;
									}
									if (local6.anInt2429 == Static197.anInt4012) {
										if (local252) {
											Static220.method4020(local6.anInt2378, local6.anInt2399, Static10.aClass99_1.method6618() - local17, Static10.aClass99_1.method6619() - local22);
										}
										continue;
									}
									if (local6.anInt2429 == Static323.anInt6118) {
										Static329.method5611(local6, local22, local17);
										continue;
									}
								}
								if (!local6.aBoolean206 && local262) {
									local6.aBoolean206 = true;
									if (local6.anObjectArray23 != null) {
										local519 = new Class1_Sub10();
										local519.aBoolean178 = true;
										local519.aClass91_2 = local6;
										local519.anInt2116 = local267.method5772() - local17;
										local519.anInt2120 = local267.method5774() - local22;
										local519.anObjectArray4 = local6.anObjectArray23;
										Static282.aClass295_21.method7533(local519);
									}
								}
								if (local6.aBoolean206 && local252 && local6.anObjectArray7 != null) {
									local519 = new Class1_Sub10();
									local519.aBoolean178 = true;
									local519.aClass91_2 = local6;
									local519.anInt2116 = Static10.aClass99_1.method6618() - local17;
									local519.anInt2120 = Static10.aClass99_1.method6619() - local22;
									local519.anObjectArray4 = local6.anObjectArray7;
									Static282.aClass295_21.method7533(local519);
								}
								if (local6.aBoolean206 && !local252) {
									local6.aBoolean206 = false;
									if (local6.anObjectArray35 != null) {
										local519 = new Class1_Sub10();
										local519.aBoolean178 = true;
										local519.aClass91_2 = local6;
										local519.anInt2116 = Static10.aClass99_1.method6618() - local17;
										local519.anInt2120 = Static10.aClass99_1.method6619() - local22;
										local519.anObjectArray4 = local6.anObjectArray35;
										Static500.aClass295_60.method7533(local519);
									}
								}
								if (local252 && local6.anObjectArray28 != null) {
									local519 = new Class1_Sub10();
									local519.aBoolean178 = true;
									local519.aClass91_2 = local6;
									local519.anInt2116 = Static10.aClass99_1.method6618() - local17;
									local519.anInt2120 = Static10.aClass99_1.method6619() - local22;
									local519.anObjectArray4 = local6.anObjectArray28;
									Static282.aClass295_21.method7533(local519);
								}
								if (!local6.aBoolean207 && local208) {
									local6.aBoolean207 = true;
									if (local6.anObjectArray10 != null) {
										local519 = new Class1_Sub10();
										local519.aBoolean178 = true;
										local519.aClass91_2 = local6;
										local519.anInt2116 = Static10.aClass99_1.method6618() - local17;
										local519.anInt2120 = Static10.aClass99_1.method6619() - local22;
										local519.anObjectArray4 = local6.anObjectArray10;
										Static282.aClass295_21.method7533(local519);
									}
								}
								if (local6.aBoolean207 && local208 && local6.anObjectArray27 != null) {
									local519 = new Class1_Sub10();
									local519.aBoolean178 = true;
									local519.aClass91_2 = local6;
									local519.anInt2116 = Static10.aClass99_1.method6618() - local17;
									local519.anInt2120 = Static10.aClass99_1.method6619() - local22;
									local519.anObjectArray4 = local6.anObjectArray27;
									Static282.aClass295_21.method7533(local519);
								}
								if (local6.aBoolean207 && !local208) {
									local6.aBoolean207 = false;
									if (local6.anObjectArray31 != null) {
										local519 = new Class1_Sub10();
										local519.aBoolean178 = true;
										local519.aClass91_2 = local6;
										local519.anInt2116 = Static10.aClass99_1.method6618() - local17;
										local519.anInt2120 = Static10.aClass99_1.method6619() - local22;
										local519.anObjectArray4 = local6.anObjectArray31;
										Static500.aClass295_60.method7533(local519);
									}
								}
								if (local6.anObjectArray22 != null) {
									local519 = new Class1_Sub10();
									local519.aClass91_2 = local6;
									local519.anObjectArray4 = local6.anObjectArray22;
									Static434.aClass295_47.method7533(local519);
								}
								@Pc(1487) Class1_Sub10 local1487;
								if (local6.anObjectArray5 != null && Static421.anInt7329 > local6.anInt2419) {
									if (local6.anIntArray188 == null || Static421.anInt7329 - local6.anInt2419 > 32) {
										local519 = new Class1_Sub10();
										local519.aClass91_2 = local6;
										local519.anObjectArray4 = local6.anObjectArray5;
										Static282.aClass295_21.method7533(local519);
									} else {
										label680: for (local300 = local6.anInt2419; local300 < Static421.anInt7329; local300++) {
											local674 = Static389.anIntArray672[local300 & 0x1F];
											for (local434 = 0; local434 < local6.anIntArray188.length; local434++) {
												if (local6.anIntArray188[local434] == local674) {
													local1487 = new Class1_Sub10();
													local1487.aClass91_2 = local6;
													local1487.anObjectArray4 = local6.anObjectArray5;
													Static282.aClass295_21.method7533(local1487);
													break label680;
												}
											}
										}
									}
									local6.anInt2419 = Static421.anInt7329;
								}
								if (local6.anObjectArray20 != null && Static232.anInt4496 > local6.anInt2407) {
									if (local6.anIntArray187 == null || Static232.anInt4496 - local6.anInt2407 > 32) {
										local519 = new Class1_Sub10();
										local519.aClass91_2 = local6;
										local519.anObjectArray4 = local6.anObjectArray20;
										Static282.aClass295_21.method7533(local519);
									} else {
										label656: for (local300 = local6.anInt2407; local300 < Static232.anInt4496; local300++) {
											local674 = Static117.anIntArray182[local300 & 0x1F];
											for (local434 = 0; local434 < local6.anIntArray187.length; local434++) {
												if (local6.anIntArray187[local434] == local674) {
													local1487 = new Class1_Sub10();
													local1487.aClass91_2 = local6;
													local1487.anObjectArray4 = local6.anObjectArray20;
													Static282.aClass295_21.method7533(local1487);
													break label656;
												}
											}
										}
									}
									local6.anInt2407 = Static232.anInt4496;
								}
								if (local6.anObjectArray6 != null && Static460.anInt7964 > local6.anInt2390) {
									if (local6.anIntArray180 == null || Static460.anInt7964 - local6.anInt2390 > 32) {
										local519 = new Class1_Sub10();
										local519.aClass91_2 = local6;
										local519.anObjectArray4 = local6.anObjectArray6;
										Static282.aClass295_21.method7533(local519);
									} else {
										label632: for (local300 = local6.anInt2390; local300 < Static460.anInt7964; local300++) {
											local674 = Static321.anIntArray479[local300 & 0x1F];
											for (local434 = 0; local434 < local6.anIntArray180.length; local434++) {
												if (local6.anIntArray180[local434] == local674) {
													local1487 = new Class1_Sub10();
													local1487.aClass91_2 = local6;
													local1487.anObjectArray4 = local6.anObjectArray6;
													Static282.aClass295_21.method7533(local1487);
													break label632;
												}
											}
										}
									}
									local6.anInt2390 = Static460.anInt7964;
								}
								if (local6.anObjectArray19 != null && Static131.anInt2627 > local6.anInt2385) {
									if (local6.anIntArray190 == null || Static131.anInt2627 - local6.anInt2385 > 32) {
										local519 = new Class1_Sub10();
										local519.aClass91_2 = local6;
										local519.anObjectArray4 = local6.anObjectArray19;
										Static282.aClass295_21.method7533(local519);
									} else {
										label608: for (local300 = local6.anInt2385; local300 < Static131.anInt2627; local300++) {
											local674 = Static512.anIntArray785[local300 & 0x1F];
											for (local434 = 0; local434 < local6.anIntArray190.length; local434++) {
												if (local6.anIntArray190[local434] == local674) {
													local1487 = new Class1_Sub10();
													local1487.aClass91_2 = local6;
													local1487.anObjectArray4 = local6.anObjectArray19;
													Static282.aClass295_21.method7533(local1487);
													break label608;
												}
											}
										}
									}
									local6.anInt2385 = Static131.anInt2627;
								}
								if (local6.anObjectArray34 != null && Static275.anInt5269 > local6.anInt2445) {
									if (local6.anIntArray183 == null || Static275.anInt5269 - local6.anInt2445 > 32) {
										local519 = new Class1_Sub10();
										local519.aClass91_2 = local6;
										local519.anObjectArray4 = local6.anObjectArray34;
										Static282.aClass295_21.method7533(local519);
									} else {
										label584: for (local300 = local6.anInt2445; local300 < Static275.anInt5269; local300++) {
											local674 = Static513.anIntArray788[local300 & 0x1F];
											for (local434 = 0; local434 < local6.anIntArray183.length; local434++) {
												if (local6.anIntArray183[local434] == local674) {
													local1487 = new Class1_Sub10();
													local1487.aClass91_2 = local6;
													local1487.anObjectArray4 = local6.anObjectArray34;
													Static282.aClass295_21.method7533(local1487);
													break label584;
												}
											}
										}
									}
									local6.anInt2445 = Static275.anInt5269;
								}
								if (Static295.anInt5594 > local6.anInt2379 && local6.anObjectArray17 != null) {
									local519 = new Class1_Sub10();
									local519.aClass91_2 = local6;
									local519.anObjectArray4 = local6.anObjectArray17;
									Static282.aClass295_21.method7533(local519);
								}
								if (Static82.anInt1887 > local6.anInt2379 && local6.anObjectArray21 != null) {
									local519 = new Class1_Sub10();
									local519.aClass91_2 = local6;
									local519.anObjectArray4 = local6.anObjectArray21;
									Static282.aClass295_21.method7533(local519);
								}
								if (Static223.anInt4338 > local6.anInt2379 && local6.anObjectArray33 != null) {
									local519 = new Class1_Sub10();
									local519.aClass91_2 = local6;
									local519.anObjectArray4 = local6.anObjectArray33;
									Static282.aClass295_21.method7533(local519);
								}
								if (Static26.anInt752 > local6.anInt2379 && local6.anObjectArray8 != null) {
									local519 = new Class1_Sub10();
									local519.aClass91_2 = local6;
									local519.anObjectArray4 = local6.anObjectArray8;
									Static282.aClass295_21.method7533(local519);
								}
								if (Static448.anInt7840 > local6.anInt2379 && local6.anObjectArray25 != null) {
									local519 = new Class1_Sub10();
									local519.aClass91_2 = local6;
									local519.anObjectArray4 = local6.anObjectArray25;
									Static282.aClass295_21.method7533(local519);
								}
								local6.anInt2379 = Static209.anInt4108;
								if (local6.anObjectArray24 != null) {
									for (local300 = 0; local300 < Static354.anInt6464; local300++) {
										@Pc(1955) Class1_Sub10 local1955 = new Class1_Sub10();
										local1955.aClass91_2 = local6;
										local1955.anInt2122 = Static463.anInterface18Array2[local300].method3596();
										local1955.anInt2121 = Static463.anInterface18Array2[local300].method3594();
										local1955.anObjectArray4 = local6.anObjectArray24;
										Static282.aClass295_21.method7533(local1955);
									}
								}
								if (Static274.aBoolean392 && local6.anObjectArray13 != null) {
									local519 = new Class1_Sub10();
									local519.aClass91_2 = local6;
									local519.anObjectArray4 = local6.anObjectArray13;
									Static282.aClass295_21.method7533(local519);
								}
							}
							if (local6.anInt2452 == 5 && local6.anInt2418 != -1) {
								local6.method2272(Static435.aClass280_1, Static402.aClass2_1).method1794(Static455.aClass4_11, local6.anInt2378);
							}
							Static238.method4285(local6);
							if (local6.anInt2452 == 0) {
								method1583(arg0, local6.anInt2368, local28, local30, local32, local34, local17 - local6.anInt2449, local22 - local6.anInt2406, arg8, arg9);
								if (local6.lb != null) {
									method1583(local6.lb, local6.anInt2368, local28, local30, local32, local34, local17 - local6.anInt2449, local22 - local6.anInt2406, arg8, arg9);
								}
								@Pc(2077) Class1_Sub35 local2077 = (Class1_Sub35) Static362.aClass230_45.method6144((long) local6.anInt2368);
								if (local2077 != null) {
									if (Static332.aClass250_4 == Static71.aClass250_1 && local2077.anInt5499 == 0 && !Static238.aBoolean354 && local208 && !Static428.aBoolean561) {
										Static130.method7388();
									}
									Static303.method5350(local34, local30, local17, arg9, arg8, local2077.anInt5502, local32, local28, local22);
								}
							}
						}
					}
				} else if (local28 < local32 && local30 < local34) {
					Static238.method4285(local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method1587() {
		Static413.anInt7228 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static141.anInt2822; local3++) {
			@Pc(14) Class20_Sub1_Sub1_Sub2 local14 = ((Class1_Sub41) Static362.aClass230_46.method6144((long) Static220.anIntArray339[local3])).aClass20_Sub1_Sub1_Sub2_2;
			if (local14.aBoolean678 && local14.method7813() != -1) {
				@Pc(32) int local32 = (local14.method7808() - 1) * 64 + 60;
				@Pc(39) int local39 = local14.anInt8954 - local32 >> 7;
				@Pc(46) int local46 = local14.anInt8949 - local32 >> 7;
				@Pc(53) Class20_Sub1_Sub1 local53 = Static186.method3578(local39, local46, local14.aByte108);
				if (local53 != null) {
					@Pc(58) int local58 = local53.anInt8969;
					if (local53 instanceof Class20_Sub1_Sub1_Sub2) {
						local58 += 2048;
					}
					if (local53.anInt8994 == 0 && local53.method7813() != -1) {
						Static340.anIntArray614[Static413.anInt7228] = local58;
						Static306.anIntArray459[Static413.anInt7228] = local58;
						Static413.anInt7228++;
						local53.anInt8994++;
					}
					Static340.anIntArray614[Static413.anInt7228] = local58;
					Static306.anIntArray459[Static413.anInt7228] = local14.anInt8969 + 2048;
					Static413.anInt7228++;
					local53.anInt8994++;
				}
			}
		}
		Static421.method6577(Static306.anIntArray459, 0, Static340.anIntArray614, Static413.anInt7228 - 1);
	}
}
