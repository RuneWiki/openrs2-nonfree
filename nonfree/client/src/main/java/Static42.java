import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!client", name = "bb", descriptor = "Lclient!ie;")
	public static Class78 aClass78_1;

	@OriginalMember(owner = "client!client", name = "H", descriptor = "Ljava/lang/String;")
	public static String aString29 = "Created gameworld";

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!rn;Z)V")
	public static void method610(@OriginalArg(0) Class155 arg0) {
		Static15.anInt4211 = arg0.method4120("p11_full");
		Static269.anInt5495 = arg0.method4120("p12_full");
		Static145.anInt2764 = arg0.method4120("b12_full");
		Static310.anInt6109 = arg0.method4120("hitmarks");
		Static18.anInt341 = arg0.method4120("hitbar_default");
		Static9.anInt188 = arg0.method4120("headicons_pk");
		Static292.anInt5825 = arg0.method4120("headicons_prayer");
		Static206.anInt4073 = arg0.method4120("hint_headicons");
		Static145.anInt2767 = arg0.method4120("hint_mapmarkers");
		Static250.anInt5140 = arg0.method4120("mapflag");
		Static67.anInt1238 = arg0.method4120("cross");
		Static107.anInt1964 = arg0.method4120("mapdots");
		Static166.anInt3122 = arg0.method4120("scrollbar");
		Static123.anInt2332 = arg0.method4120("name_icons");
		Static112.anInt5730 = arg0.method4120("floorshadows");
		Static75.anInt1407 = arg0.method4120("compass");
		Static6.anInt132 = arg0.method4120("hint_mapedge");
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!rg;)Lclient!ve;")
	public static Class3_Sub31 method612(@OriginalArg(0) Class151 arg0) {
		@Pc(13) Class3_Sub31 local13 = (Class3_Sub31) Static34.aClass30_2.method663(((long) arg0.anInt4800 << 32) + (long) arg0.anInt4776);
		return local13 == null ? arg0.aClass3_Sub31_2 : local13;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Throwable;)V")
	public static void method613(@OriginalArg(1) String arg0, @OriginalArg(2) Throwable arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg1 != null) {
				local7 = Static81.method1255(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg0;
			}
			Static284.method4680(local7);
			local7 = Static224.method4977("%3a", local7, ":");
			local7 = Static224.method4977("%40", local7, "@");
			local7 = Static224.method4977("%26", local7, "&");
			local7 = Static224.method4977("%23", local7, "#");
			if (Static202.aClass176_1.anApplet1 == null) {
				return;
			}
			@Pc(116) Class178 local116 = Static202.aClass176_1.method4515(new URL(Static202.aClass176_1.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static91.anInt1673 + "&u=" + Static299.aLong233 + "&v1=" + Static275.aString211 + "&v2=" + Static275.aString213 + "&e=" + local7));
			while (local116.anInt5649 == 0) {
				Static150.method2552(1L);
			}
			if (local116.anInt5649 == 1) {
				@Pc(134) DataInputStream local134 = (DataInputStream) local116.anObject6;
				local134.read();
				local134.close();
			}
		} catch (@Pc(141) Exception local141) {
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/lang/String;)J")
	public static long method615(@OriginalArg(1) String arg0) {
		@Pc(3) long local3 = 0L;
		@Pc(10) int local10 = arg0.length();
		for (@Pc(19) int local19 = 0; local19 < local10; local19++) {
			@Pc(30) char local30 = arg0.charAt(local19);
			local3 *= 37L;
			if (local30 >= 'A' && local30 <= 'Z') {
				local3 += local30 - 64;
			} else if (local30 >= 'a' && local30 <= 'z') {
				local3 += local30 - 96;
			} else if (local30 >= '0' && local30 <= '9') {
				local3 += local30 + 27 - 48;
			}
			if (local3 >= 177917621779460413L) {
				break;
			}
		}
		while (local3 % 37L == 0L && local3 != 0L) {
			local3 /= 37L;
		}
		return local3;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method618() {
		for (@Pc(1) int local1 = -1; local1 < Static152.anInt2869 + Static118.anInt2202; local1++) {
			@Pc(10) Class10_Sub5 local10;
			@Pc(12) long local12;
			@Pc(20) int local20;
			if (local1 < 0) {
				local10 = Static136.aClass10_Sub5_Sub1_1;
				local12 = 8791798054912L;
			} else if (local1 < Static152.anInt2869) {
				local20 = Static102.anIntArray188[local1];
				local10 = Static52.aClass10_Sub5_Sub1Array1[local20];
				local12 = (long) local20 << 32;
			} else {
				local20 = Static253.anIntArray547[local1 - Static152.anInt2869];
				@Pc(40) Class10_Sub5_Sub2 local40 = Static110.aClass10_Sub5_Sub2Array1[local20];
				local10 = local40;
				local12 = (long) local20 << 32 | 0x20000000L;
				if (!local40.aClass124_1.aBoolean271) {
					local12 |= Long.MIN_VALUE;
				}
			}
			if (local10.anInt5097 < 0) {
				local10.aBoolean351 = false;
			} else {
				local10.anInt5031 = -1;
				local20 = local10.method4186();
				if ((local20 & 0x1) == 0) {
					if ((local10.anInt5073 & 0x7F) != 0 || (local10.anInt5016 & 0x7F) != 0) {
						local10.aBoolean351 = false;
						continue;
					}
				} else if ((local10.anInt5073 & 0x7F) != 64 || (local10.anInt5016 & 0x7F) != 64) {
					local10.aBoolean351 = false;
					continue;
				}
				@Pc(157) int local157;
				@Pc(118) int local118;
				@Pc(113) int local113;
				if (local20 == 1) {
					local113 = local10.anInt5073 >> 7;
					local118 = local10.anInt5016 >> 7;
					if (local113 < 0 || local113 >= 104 || local118 < 0 || local118 >= 104) {
						local10.aBoolean351 = true;
						continue;
					}
					if (local10.anInt5097 != Static249.anIntArrayArray70[local113][local118]) {
						local10.aBoolean351 = true;
						continue;
					}
					if (Static222.anIntArrayArray62[local113][local118] > 1) {
						local157 = Static222.anIntArrayArray62[local113][local118]--;
						local10.aBoolean351 = true;
						continue;
					}
				} else {
					local113 = local10.anInt5073 - local20 * 64 >> 7;
					local118 = local10.anInt5016 - local20 * 64 >> 7;
					@Pc(187) int local187 = local113 + local20;
					@Pc(191) int local191 = local118 + local20;
					if (local113 < 0) {
						local113 = 0;
					}
					if (local187 > 104) {
						local187 = 104;
					}
					if (local118 < 0) {
						local118 = 0;
					}
					if (local191 > 104) {
						local191 = 104;
					}
					if (!Static150.method2548(local10.anInt5097, local118, local113, local191, local187)) {
						for (@Pc(220) int local220 = local113; local220 < local187; local220++) {
							for (@Pc(225) int local225 = local118; local225 < local191; local225++) {
								if (local10.anInt5097 == Static249.anIntArrayArray70[local220][local225]) {
									local157 = Static222.anIntArrayArray62[local220][local225]--;
								}
							}
						}
						local10.aBoolean351 = true;
						continue;
					}
				}
				if (local10 instanceof Class10_Sub5_Sub1 && local10.anObject5 != null && Static124.anInt2371 >= local10.anInt5082 && Static124.anInt2371 < local10.anInt5098) {
					((Class10_Sub5_Sub1) local10).aBoolean258 = false;
					local10.aBoolean351 = false;
					local10.anInt5046 = Static122.method2036(local10.anInt5016, local10.anInt5073, Static99.anInt1826);
					Static77.method1204(Static99.anInt1826, local10.anInt5073, local10.anInt5016, local10.anInt5046, local10, local10.anInt5043, local12, local10.anInt5038, local10.anInt5077, local10.anInt5041, local10.anInt5036);
				} else {
					local10.aBoolean351 = false;
					local10.anInt5046 = Static122.method2036(local10.anInt5016, local10.anInt5073, Static99.anInt1826);
					Static236.method3997(Static99.anInt1826, local10.anInt5073, local10.anInt5016, local10.anInt5046, (local20 - 1) * 64 + 60, local10, local10.anInt5043, local12, local10.aBoolean356);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method619() {
		Static288.anInt5767 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static118.anInt2202; local3++) {
			@Pc(12) Class10_Sub5_Sub2 local12 = Static110.aClass10_Sub5_Sub2Array1[Static253.anIntArray547[local3]];
			if (local12.aBoolean351 && local12.method4190() != -1) {
				@Pc(33) int local33 = local12.anInt5073 - (local12.method4186() - 1) * 64;
				@Pc(44) int local44 = local12.anInt5016 - (local12.method4186() - 1) * 64;
				@Pc(53) Class85 local53 = Static190.method3184(Static99.anInt1826, local33 >> 7, local44 >> 7);
				if (local53 != null) {
					@Pc(59) long local59 = local53.aLong107;
					@Pc(66) int local66 = (int) (local59 >>> 32) & Integer.MAX_VALUE;
					@Pc(78) Class10_Sub5 local78;
					if ((local59 >>> 29 & 0x3L) == 0L) {
						local78 = Static52.aClass10_Sub5_Sub1Array1[local66];
					} else {
						local78 = Static110.aClass10_Sub5_Sub2Array1[local66];
						local66 += 2048;
					}
					if (local78.anInt5031 == -1) {
						Static256.anIntArray553[Static288.anInt5767] = local66;
						Static41.anIntArray62[Static288.anInt5767++] = local66;
						local78.anInt5031 = 0;
					}
					Static256.anIntArray553[Static288.anInt5767] = local66;
					Static41.anIntArray62[Static288.anInt5767++] = Static253.anIntArray547[local3] + 2048;
				}
			}
		}
		Static126.method2191(Static256.anIntArray553, Static288.anInt5767 - 1, 0, Static41.anIntArray62);
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	public static void method620() {
		Static28.aClass98_6.method2572();
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method621() {
		for (@Pc(1) int local1 = -1; local1 < Static152.anInt2869 + Static118.anInt2202; local1++) {
			@Pc(10) Class10_Sub5 local10;
			if (local1 < 0) {
				local10 = Static136.aClass10_Sub5_Sub1_1;
			} else if (local1 < Static152.anInt2869) {
				local10 = Static52.aClass10_Sub5_Sub1Array1[Static102.anIntArray188[local1]];
			} else {
				local10 = Static110.aClass10_Sub5_Sub2Array1[Static253.anIntArray547[local1 - Static152.anInt2869]];
			}
			if (local10.anInt5097 >= 0) {
				@Pc(37) int local37 = local10.method4186();
				if ((local37 & 0x1) == 0) {
					if ((local10.anInt5073 & 0x7F) != 0 || (local10.anInt5016 & 0x7F) != 0) {
						continue;
					}
				} else if ((local10.anInt5073 & 0x7F) != 64 || (local10.anInt5016 & 0x7F) != 64) {
					continue;
				}
				@Pc(124) int local124;
				@Pc(73) int local73;
				@Pc(78) int local78;
				if (local37 == 1) {
					local73 = local10.anInt5073 >> 7;
					local78 = local10.anInt5016 >> 7;
					if (local73 >= 0 && local73 < 104 && local78 >= 0 && local78 < 104 && local10.anInt5097 >= Static249.anIntArrayArray70[local73][local78]) {
						if (local10.anInt5097 > Static249.anIntArrayArray70[local73][local78]) {
							Static249.anIntArrayArray70[local73][local78] = local10.anInt5097;
							Static222.anIntArrayArray62[local73][local78] = 1;
						} else {
							local124 = Static222.anIntArrayArray62[local73][local78]++;
						}
					}
				} else {
					local73 = local10.anInt5073 - local37 * 64 >> 7;
					local78 = local10.anInt5016 - local37 * 64 >> 7;
					@Pc(152) int local152 = local73 + local10.method4186();
					@Pc(158) int local158 = local78 + local10.method4186();
					if (local73 < 0) {
						local73 = 0;
					}
					if (local152 > 104) {
						local152 = 104;
					}
					if (local78 < 0) {
						local78 = 0;
					}
					if (local158 > 104) {
						local158 = 104;
					}
					for (@Pc(178) int local178 = local73; local178 < local152; local178++) {
						for (@Pc(183) int local183 = local78; local183 < local158; local183++) {
							if (local10.anInt5097 > Static249.anIntArrayArray70[local178][local183]) {
								Static249.anIntArrayArray70[local178][local183] = local10.anInt5097;
								Static222.anIntArrayArray62[local178][local183] = 1;
							} else if (local10.anInt5097 == Static249.anIntArrayArray70[local178][local183]) {
								local124 = Static222.anIntArrayArray62[local178][local183]++;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method622() {
		for (@Pc(1) int local1 = -1; local1 < Static152.anInt2869 + Static118.anInt2202; local1++) {
			@Pc(10) Class10_Sub5 local10;
			@Pc(12) long local12;
			@Pc(20) int local20;
			if (local1 < 0) {
				local10 = Static136.aClass10_Sub5_Sub1_1;
				local12 = 8791798054912L;
			} else if (local1 < Static152.anInt2869) {
				local20 = Static102.anIntArray188[local1];
				local10 = Static52.aClass10_Sub5_Sub1Array1[local20];
				local12 = (long) local20 << 32;
			} else {
				local20 = Static253.anIntArray547[local1 - Static152.anInt2869];
				@Pc(40) Class10_Sub5_Sub2 local40 = Static110.aClass10_Sub5_Sub2Array1[local20];
				local10 = local40;
				local12 = (long) local20 << 32 | 0x20000000L;
				if (!local40.aClass124_1.aBoolean271) {
					local12 |= Long.MIN_VALUE;
				}
			}
			if (local10.anInt5097 >= 0) {
				local20 = local10.method4186();
				if ((local20 & 0x1) == 0) {
					if ((local10.anInt5073 & 0x7F) == 0 && (local10.anInt5016 & 0x7F) == 0) {
						continue;
					}
				} else if ((local10.anInt5073 & 0x7F) == 64 && (local10.anInt5016 & 0x7F) == 64) {
					continue;
				}
				if (local10 instanceof Class10_Sub5_Sub1 && local10.anObject5 != null && Static124.anInt2371 >= local10.anInt5082 && Static124.anInt2371 < local10.anInt5098) {
					((Class10_Sub5_Sub1) local10).aBoolean258 = false;
					local10.anInt5046 = Static122.method2036(local10.anInt5016, local10.anInt5073, Static99.anInt1826);
					Static77.method1204(Static99.anInt1826, local10.anInt5073, local10.anInt5016, local10.anInt5046, local10, local10.anInt5043, local12, local10.anInt5038, local10.anInt5077, local10.anInt5041, local10.anInt5036);
				} else {
					local10.anInt5046 = Static122.method2036(local10.anInt5016, local10.anInt5073, Static99.anInt1826);
					Static236.method3997(Static99.anInt1826, local10.anInt5073, local10.anInt5016, local10.anInt5046, (local20 - 1) * 64 + 60, local10, local10.anInt5043, local12, local10.aBoolean356);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "()V")
	public static void method623() {
		@Pc(11) boolean local11 = Static40.aBoolean431 && Static152.anInt2869 > 200 || Static152.anInt2869 > 50;
		@Pc(13) int local13;
		@Pc(47) int local47;
		for (local13 = 0; local13 < Static152.anInt2869; local13++) {
			@Pc(22) Class10_Sub5_Sub1 local22 = Static52.aClass10_Sub5_Sub1Array1[Static102.anIntArray188[local13]];
			local22.aBoolean353 = false;
			if (local22.method4189()) {
				local22.aBoolean258 = local22.anInt5066 == local22.method4191().anInt912 ? local11 : false;
				local47 = 0;
				if (!local22.aBoolean351) {
					local47++;
				}
				if (local22.anInt5064 > Static124.anInt2371) {
					local47 += 2;
				}
				local47 += 5 - local22.method4186() << 2;
				if (Static100.anInt1839 == 0) {
					local47 += 32;
				} else {
					local47 += 128;
				}
				local47 += 256;
				local22.anInt5097 = local47 + 1;
			} else {
				local22.anInt5097 = -1;
			}
		}
		for (local13 = 0; local13 < Static118.anInt2202; local13++) {
			@Pc(90) Class10_Sub5_Sub2 local90 = Static110.aClass10_Sub5_Sub2Array1[Static253.anIntArray547[local13]];
			local90.aBoolean353 = false;
			if (local90.method4189() && local90.aClass124_1.method3190()) {
				local47 = 0;
				if (!local90.aBoolean351) {
					local47++;
				}
				if (local90.anInt5064 > Static124.anInt2371) {
					local47 += 2;
				}
				local47 += 5 - local90.method4186() << 2;
				if (Static100.anInt1839 == 0) {
					if (local90.aClass124_1.aBoolean269) {
						local47 += 64;
					} else {
						local47 += 128;
					}
				} else if (Static100.anInt1839 == 1) {
					if (local90.aClass124_1.aBoolean269) {
						local47 += 32;
					} else {
						local47 += 64;
					}
				}
				if (local90.aClass124_1.aBoolean267) {
					local47 += 512;
				} else if (!local90.aClass124_1.aBoolean266) {
					local47 += 256;
				}
				local90.anInt5097 = local47 + 1;
			} else {
				local90.anInt5097 = -1;
			}
		}
		for (local13 = 0; local13 < Static51.aClass121Array1.length; local13++) {
			@Pc(175) Class121 local175 = Static51.aClass121Array1[local13];
			if (local175 != null) {
				if (local175.anInt3691 == 1) {
					@Pc(187) Class10_Sub5_Sub2 local187 = Static110.aClass10_Sub5_Sub2Array1[local175.anInt3690];
					if (local187 != null && local187.anInt5097 != -1) {
						local187.anInt5097 += 1024;
					}
				} else if (local175.anInt3691 == 10) {
					@Pc(209) Class10_Sub5_Sub1 local209 = Static52.aClass10_Sub5_Sub1Array1[local175.anInt3690];
					if (local209 != null && local209.anInt5097 != -1) {
						local209.anInt5097 += 1024;
					}
				}
			}
		}
		Static136.aClass10_Sub5_Sub1_1.anInt5097 = Integer.MAX_VALUE;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!rg;IIIIIII)V")
	public static void method624(@OriginalArg(0) Class151[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(9) Class151 local9 = arg0[local1];
			if (local9 != null && local9.anInt4727 == arg1 && (!local9.aBoolean328 || local9.anInt4721 == 0 || local9.aBoolean332 || method612(local9).anInt5831 != 0 || local9 == Static168.aClass151_6 || local9.anInt4797 == 1338) && (!local9.aBoolean328 || !method629(local9))) {
				@Pc(50) int local50 = local9.anInt4756 + arg6;
				@Pc(55) int local55 = local9.anInt4730 + arg7;
				@Pc(61) int local61;
				@Pc(63) int local63;
				@Pc(65) int local65;
				@Pc(67) int local67;
				if (local9.anInt4721 == 2) {
					local61 = arg2;
					local63 = arg3;
					local65 = arg4;
					local67 = arg5;
				} else {
					@Pc(73) int local73 = local50 + local9.anInt4773;
					@Pc(78) int local78 = local55 + local9.anInt4751;
					if (local9.anInt4721 == 9) {
						local73++;
						local78++;
					}
					local61 = local50 > arg2 ? local50 : arg2;
					local63 = local55 > arg3 ? local55 : arg3;
					local65 = local73 < arg4 ? local73 : arg4;
					local67 = local78 < arg5 ? local78 : arg5;
				}
				if (local9 == Static191.aClass151_10) {
					Static112.aBoolean408 = true;
					Static54.anInt1014 = local50;
					Static165.anInt3088 = local55;
				}
				if (!local9.aBoolean328 || local61 < local65 && local63 < local67) {
					if (local9.anInt4721 == 0) {
						if (!local9.aBoolean328 && method629(local9) && Static166.aClass151_5 != local9) {
							continue;
						}
						if (local9.aBoolean327 && Static167.anInt3153 >= local61 && Static153.anInt2892 >= local63 && Static167.anInt3153 < local65 && Static153.anInt2892 < local67) {
							for (@Pc(164) Class3_Sub24 local164 = (Class3_Sub24) Static5.aClass56_1.method1281(); local164 != null; local164 = (Class3_Sub24) Static5.aClass56_1.method1278()) {
								if (local164.aBoolean303) {
									local164.method5013();
									local164.aClass151_13.aBoolean329 = false;
								}
							}
							if (Static248.anInt4999 == 0) {
								Static191.aClass151_10 = null;
								Static168.aClass151_6 = null;
							}
							Static129.anInt2458 = 0;
							Static201.aBoolean281 = false;
						}
					}
					if (local9.aBoolean328) {
						@Pc(209) boolean local209;
						if (Static167.anInt3153 >= local61 && Static153.anInt2892 >= local63 && Static167.anInt3153 < local65 && Static153.anInt2892 < local67) {
							local209 = true;
						} else {
							local209 = false;
						}
						@Pc(214) boolean local214 = false;
						if (Static39.anInt681 == 1 && local209) {
							local214 = true;
						}
						@Pc(223) boolean local223 = false;
						if (Static40.anInt6052 == 1 && Static293.anInt5844 >= local61 && Static7.anInt169 >= local63 && Static293.anInt5844 < local65 && Static7.anInt169 < local67) {
							local223 = true;
						}
						@Pc(245) int local245;
						@Pc(341) int local341;
						if (local9.aByteArray66 != null) {
							for (local245 = 0; local245 < local9.aByteArray66.length; local245++) {
								if (Static95.aBooleanArray39[local9.aByteArray66[local245]]) {
									if (local9.anIntArray518 == null || Static124.anInt2371 >= local9.anIntArray518[local245]) {
										@Pc(281) byte local281 = local9.aByteArray65[local245];
										if (local281 == 0 || ((local281 & 0x8) == 0 || !Static95.aBooleanArray39[86] && !Static95.aBooleanArray39[82] && !Static95.aBooleanArray39[81]) && ((local281 & 0x2) == 0 || Static95.aBooleanArray39[86]) && ((local281 & 0x1) == 0 || Static95.aBooleanArray39[82]) && ((local281 & 0x4) == 0 || Static95.aBooleanArray39[81])) {
											Static270.method4465(-1, local9.anInt4800, local245 + 1, "");
											local341 = local9.anIntArray520[local245];
											if (local9.anIntArray518 == null) {
												local9.anIntArray518 = new int[local9.aByteArray66.length];
											}
											if (local341 == 0) {
												local9.anIntArray518[local245] = Integer.MAX_VALUE;
											} else {
												local9.anIntArray518[local245] = Static124.anInt2371 + local341;
											}
										}
									}
								} else if (local9.anIntArray518 != null) {
									local9.anIntArray518[local245] = 0;
								}
							}
						}
						if (local223) {
							Static17.method294(local9, Static7.anInt169 - local55, Static293.anInt5844 - local50);
						}
						if (Static191.aClass151_10 != null && Static191.aClass151_10 != local9 && local209 && method612(local9).method4790()) {
							Static131.aClass151_4 = local9;
						}
						if (local9 == Static168.aClass151_6) {
							Static306.aBoolean429 = true;
							Static276.anInt5570 = local50;
							Static49.anInt947 = local55;
						}
						if (local9.aBoolean332 || local9.anInt4797 != 0) {
							@Pc(418) Class3_Sub24 local418;
							if (local209 && Static235.anInt4699 != 0 && local9.anObjectArray31 != null) {
								local418 = new Class3_Sub24();
								local418.aBoolean303 = true;
								local418.aClass151_13 = local9;
								local418.anInt4255 = Static235.anInt4699;
								local418.anObjectArray1 = local9.anObjectArray31;
								Static5.aClass56_1.method1282(local418);
							}
							if (Static191.aClass151_10 != null || Static73.aClass151_1 != null || Static118.aBoolean169 || local9.anInt4797 != 1400 && Static129.anInt2458 > 0) {
								local223 = false;
								local214 = false;
								local209 = false;
							}
							@Pc(522) int local522;
							if (local9.anInt4797 != 0) {
								if (local9.anInt4797 == 1337) {
									Static186.aClass151_9 = local9;
									continue;
								}
								if (local9.anInt4797 == 1338) {
									if (local223) {
										Static235.anInt4698 = Static293.anInt5844 - local50;
										Static130.anInt2466 = Static7.anInt169 - local55;
									}
									continue;
								}
								if (local9.anInt4797 == 1400) {
									Static287.aClass151_19 = local9;
									if (local209) {
										Static201.aBoolean281 = true;
									}
									if (local223) {
										local245 = (int) ((double) (Static293.anInt5844 - local50 - local9.anInt4773 / 2) * 2.0D / (double) Static228.aFloat19);
										local522 = (int) ((double) (Static7.anInt169 - local55 - local9.anInt4751 / 2) * 2.0D / (double) Static228.aFloat19);
										local341 = Static158.anInt2949 + local245;
										@Pc(530) int local530 = Static168.anInt3167 + local522;
										@Pc(534) int local534 = local341 + Static228.anInt1431;
										@Pc(542) int local542 = Static228.anInt1432 + Static228.anInt1435 - local530 - 1;
										@Pc(545) Class3_Sub4_Sub14 local545 = Static31.method473();
										if (local545 == null) {
											continue;
										}
										@Pc(550) int[] local550 = new int[3];
										local545.method2356(local550, local534, local542);
										if (local550 != null) {
											if (Static95.aBooleanArray39[82] && Static296.anInt5879 > 0) {
												Static268.method4448(local550[0], local550[2], local550[1]);
												Static117.method1916();
												continue;
											}
											Static215.aClass3_Sub26_Sub1_2.method3958(111);
											Static215.aClass3_Sub26_Sub1_2.method3944(local550[0] << 28 | local550[1] << 14 | local550[2]);
										}
										Static129.anInt2458 = 1;
										Static219.aBoolean308 = false;
										Static152.anInt2868 = Static167.anInt3153;
										Static39.anInt682 = Static153.anInt2892;
										continue;
									}
									if (local214 && Static129.anInt2458 > 0) {
										if (Static129.anInt2458 == 1 && (Static152.anInt2868 != Static167.anInt3153 || Static39.anInt682 != Static153.anInt2892)) {
											Static3.anInt59 = Static158.anInt2949;
											Static288.anInt5769 = Static168.anInt3167;
											Static129.anInt2458 = 2;
										}
										if (Static129.anInt2458 == 2) {
											Static219.aBoolean308 = true;
											Static195.method3236(Static3.anInt59 + (int) ((double) (Static152.anInt2868 - Static167.anInt3153) * 2.0D / (double) Static228.aFloat18));
											Static196.method3239(Static288.anInt5769 + (int) ((double) (Static39.anInt682 - Static153.anInt2892) * 2.0D / (double) Static228.aFloat18));
										}
										continue;
									}
									if (Static129.anInt2458 > 0 && !Static219.aBoolean308) {
										if ((Static11.anInt5182 == 1 || Static60.method598(Static152.anInt2876 - 1)) && Static152.anInt2876 > 2) {
											Static173.method2867();
										} else if (Static152.anInt2876 > 0) {
											Static138.method2355();
										}
									}
									Static129.anInt2458 = 0;
									continue;
								}
								if (local9.anInt4797 == 1401) {
									if (local214) {
										Static194.method3232(Static167.anInt3153 - local50, local9.anInt4773, Static153.anInt2892 - local55, local9.anInt4751);
									}
									continue;
								}
								if (local9.anInt4797 == 1402) {
									if (!Static283.aBoolean393) {
										Static134.method3639(local9);
									}
									continue;
								}
							}
							if (!local9.aBoolean320 && local223) {
								local9.aBoolean320 = true;
								if (local9.anObjectArray12 != null) {
									local418 = new Class3_Sub24();
									local418.aBoolean303 = true;
									local418.aClass151_13 = local9;
									local418.anInt4256 = Static293.anInt5844 - local50;
									local418.anInt4255 = Static7.anInt169 - local55;
									local418.anObjectArray1 = local9.anObjectArray12;
									Static5.aClass56_1.method1282(local418);
								}
							}
							if (local9.aBoolean320 && local214 && local9.anObjectArray20 != null) {
								local418 = new Class3_Sub24();
								local418.aBoolean303 = true;
								local418.aClass151_13 = local9;
								local418.anInt4256 = Static167.anInt3153 - local50;
								local418.anInt4255 = Static153.anInt2892 - local55;
								local418.anObjectArray1 = local9.anObjectArray20;
								Static5.aClass56_1.method1282(local418);
							}
							if (local9.aBoolean320 && !local214) {
								local9.aBoolean320 = false;
								if (local9.anObjectArray24 != null) {
									local418 = new Class3_Sub24();
									local418.aBoolean303 = true;
									local418.aClass151_13 = local9;
									local418.anInt4256 = Static167.anInt3153 - local50;
									local418.anInt4255 = Static153.anInt2892 - local55;
									local418.anObjectArray1 = local9.anObjectArray24;
									Static253.aClass56_24.method1282(local418);
								}
							}
							if (local214 && local9.anObjectArray10 != null) {
								local418 = new Class3_Sub24();
								local418.aBoolean303 = true;
								local418.aClass151_13 = local9;
								local418.anInt4256 = Static167.anInt3153 - local50;
								local418.anInt4255 = Static153.anInt2892 - local55;
								local418.anObjectArray1 = local9.anObjectArray10;
								Static5.aClass56_1.method1282(local418);
							}
							if (!local9.aBoolean329 && local209) {
								local9.aBoolean329 = true;
								if (local9.anObjectArray29 != null) {
									local418 = new Class3_Sub24();
									local418.aBoolean303 = true;
									local418.aClass151_13 = local9;
									local418.anInt4256 = Static167.anInt3153 - local50;
									local418.anInt4255 = Static153.anInt2892 - local55;
									local418.anObjectArray1 = local9.anObjectArray29;
									Static5.aClass56_1.method1282(local418);
								}
							}
							if (local9.aBoolean329 && local209 && local9.anObjectArray25 != null) {
								local418 = new Class3_Sub24();
								local418.aBoolean303 = true;
								local418.aClass151_13 = local9;
								local418.anInt4256 = Static167.anInt3153 - local50;
								local418.anInt4255 = Static153.anInt2892 - local55;
								local418.anObjectArray1 = local9.anObjectArray25;
								Static5.aClass56_1.method1282(local418);
							}
							if (local9.aBoolean329 && !local209) {
								local9.aBoolean329 = false;
								if (local9.anObjectArray19 != null) {
									local418 = new Class3_Sub24();
									local418.aBoolean303 = true;
									local418.aClass151_13 = local9;
									local418.anInt4256 = Static167.anInt3153 - local50;
									local418.anInt4255 = Static153.anInt2892 - local55;
									local418.anObjectArray1 = local9.anObjectArray19;
									Static253.aClass56_24.method1282(local418);
								}
							}
							if (local9.anObjectArray2 != null) {
								local418 = new Class3_Sub24();
								local418.aClass151_13 = local9;
								local418.anObjectArray1 = local9.anObjectArray2;
								Static236.aClass56_23.method1282(local418);
							}
							@Pc(1062) Class3_Sub24 local1062;
							if (local9.anObjectArray27 != null && Static177.anInt3303 > local9.anInt4739) {
								if (local9.anIntArray512 == null || Static177.anInt3303 - local9.anInt4739 > 32) {
									local418 = new Class3_Sub24();
									local418.aClass151_13 = local9;
									local418.anObjectArray1 = local9.anObjectArray27;
									Static5.aClass56_1.method1282(local418);
								} else {
									label598: for (local245 = local9.anInt4739; local245 < Static177.anInt3303; local245++) {
										local522 = Static158.anIntArray341[local245 & 0x1F];
										for (local341 = 0; local341 < local9.anIntArray512.length; local341++) {
											if (local9.anIntArray512[local341] == local522) {
												local1062 = new Class3_Sub24();
												local1062.aClass151_13 = local9;
												local1062.anObjectArray1 = local9.anObjectArray27;
												Static5.aClass56_1.method1282(local1062);
												break label598;
											}
										}
									}
								}
								local9.anInt4739 = Static177.anInt3303;
							}
							if (local9.anObjectArray14 != null && Static173.anInt3252 > local9.anInt4778) {
								if (local9.anIntArray521 == null || Static173.anInt3252 - local9.anInt4778 > 32) {
									local418 = new Class3_Sub24();
									local418.aClass151_13 = local9;
									local418.anObjectArray1 = local9.anObjectArray14;
									Static5.aClass56_1.method1282(local418);
								} else {
									label574: for (local245 = local9.anInt4778; local245 < Static173.anInt3252; local245++) {
										local522 = Static215.anIntArray465[local245 & 0x1F];
										for (local341 = 0; local341 < local9.anIntArray521.length; local341++) {
											if (local9.anIntArray521[local341] == local522) {
												local1062 = new Class3_Sub24();
												local1062.aClass151_13 = local9;
												local1062.anObjectArray1 = local9.anObjectArray14;
												Static5.aClass56_1.method1282(local1062);
												break label574;
											}
										}
									}
								}
								local9.anInt4778 = Static173.anInt3252;
							}
							if (local9.anObjectArray13 != null && Static88.anInt1660 > local9.anInt4760) {
								if (local9.anIntArray519 == null || Static88.anInt1660 - local9.anInt4760 > 32) {
									local418 = new Class3_Sub24();
									local418.aClass151_13 = local9;
									local418.anObjectArray1 = local9.anObjectArray13;
									Static5.aClass56_1.method1282(local418);
								} else {
									label550: for (local245 = local9.anInt4760; local245 < Static88.anInt1660; local245++) {
										local522 = Static156.anIntArray336[local245 & 0x1F];
										for (local341 = 0; local341 < local9.anIntArray519.length; local341++) {
											if (local9.anIntArray519[local341] == local522) {
												local1062 = new Class3_Sub24();
												local1062.aClass151_13 = local9;
												local1062.anObjectArray1 = local9.anObjectArray13;
												Static5.aClass56_1.method1282(local1062);
												break label550;
											}
										}
									}
								}
								local9.anInt4760 = Static88.anInt1660;
							}
							if (local9.anObjectArray22 != null && Static17.anInt330 > local9.anInt4798) {
								if (local9.anIntArray522 == null || Static17.anInt330 - local9.anInt4798 > 32) {
									local418 = new Class3_Sub24();
									local418.aClass151_13 = local9;
									local418.anObjectArray1 = local9.anObjectArray22;
									Static5.aClass56_1.method1282(local418);
								} else {
									label526: for (local245 = local9.anInt4798; local245 < Static17.anInt330; local245++) {
										local522 = Static252.anIntArray545[local245 & 0x1F];
										for (local341 = 0; local341 < local9.anIntArray522.length; local341++) {
											if (local9.anIntArray522[local341] == local522) {
												local1062 = new Class3_Sub24();
												local1062.aClass151_13 = local9;
												local1062.anObjectArray1 = local9.anObjectArray22;
												Static5.aClass56_1.method1282(local1062);
												break label526;
											}
										}
									}
								}
								local9.anInt4798 = Static17.anInt330;
							}
							if (local9.anObjectArray4 != null && Static196.anInt3827 > local9.anInt4741) {
								if (local9.anIntArray516 == null || Static196.anInt3827 - local9.anInt4741 > 32) {
									local418 = new Class3_Sub24();
									local418.aClass151_13 = local9;
									local418.anObjectArray1 = local9.anObjectArray4;
									Static5.aClass56_1.method1282(local418);
								} else {
									label502: for (local245 = local9.anInt4741; local245 < Static196.anInt3827; local245++) {
										local522 = Static229.anIntArray497[local245 & 0x1F];
										for (local341 = 0; local341 < local9.anIntArray516.length; local341++) {
											if (local9.anIntArray516[local341] == local522) {
												local1062 = new Class3_Sub24();
												local1062.aClass151_13 = local9;
												local1062.anObjectArray1 = local9.anObjectArray4;
												Static5.aClass56_1.method1282(local1062);
												break label502;
											}
										}
									}
								}
								local9.anInt4741 = Static196.anInt3827;
							}
							if (Static150.anInt2857 > local9.anInt4779 && local9.anObjectArray18 != null) {
								local418 = new Class3_Sub24();
								local418.aClass151_13 = local9;
								local418.anObjectArray1 = local9.anObjectArray18;
								Static5.aClass56_1.method1282(local418);
							}
							if (Static152.anInt2882 > local9.anInt4779 && local9.anObjectArray17 != null) {
								local418 = new Class3_Sub24();
								local418.aClass151_13 = local9;
								local418.anObjectArray1 = local9.anObjectArray17;
								Static5.aClass56_1.method1282(local418);
							}
							if (Static305.anInt6008 > local9.anInt4779 && local9.anObjectArray7 != null) {
								local418 = new Class3_Sub24();
								local418.aClass151_13 = local9;
								local418.anObjectArray1 = local9.anObjectArray7;
								Static5.aClass56_1.method1282(local418);
							}
							if (Static214.anInt4188 > local9.anInt4779 && local9.anObjectArray15 != null) {
								local418 = new Class3_Sub24();
								local418.aClass151_13 = local9;
								local418.anObjectArray1 = local9.anObjectArray15;
								Static5.aClass56_1.method1282(local418);
							}
							if (Static293.anInt5839 > local9.anInt4779 && local9.anObjectArray21 != null) {
								local418 = new Class3_Sub24();
								local418.aClass151_13 = local9;
								local418.anObjectArray1 = local9.anObjectArray21;
								Static5.aClass56_1.method1282(local418);
							}
							local9.anInt4779 = Static201.anInt3956;
							if (local9.anObjectArray26 != null) {
								for (local245 = 0; local245 < Static85.anInt1596; local245++) {
									@Pc(1526) Class3_Sub24 local1526 = new Class3_Sub24();
									local1526.aClass151_13 = local9;
									local1526.anInt4253 = Static307.anIntArray622[local245];
									local1526.anInt4260 = Static123.anIntArray281[local245];
									local1526.anObjectArray1 = local9.anObjectArray26;
									Static5.aClass56_1.method1282(local1526);
								}
							}
							if (Static223.aBoolean311 && local9.anObjectArray30 != null) {
								local418 = new Class3_Sub24();
								local418.aClass151_13 = local9;
								local418.anObjectArray1 = local9.anObjectArray30;
								Static5.aClass56_1.method1282(local418);
							}
						}
					}
					if (!local9.aBoolean328 && Static191.aClass151_10 == null && Static73.aClass151_1 == null && !Static118.aBoolean169) {
						if ((local9.anInt4744 >= 0 || local9.anInt4754 != 0) && Static167.anInt3153 >= local61 && Static153.anInt2892 >= local63 && Static167.anInt3153 < local65 && Static153.anInt2892 < local67) {
							if (local9.anInt4744 >= 0) {
								Static166.aClass151_5 = arg0[local9.anInt4744];
							} else {
								Static166.aClass151_5 = local9;
							}
						}
						if (local9.anInt4721 == 8 && Static167.anInt3153 >= local61 && Static153.anInt2892 >= local63 && Static167.anInt3153 < local65 && Static153.anInt2892 < local67) {
							Static243.aClass151_16 = local9;
						}
						if (local9.anInt4713 > local9.anInt4751) {
							Static281.method3946(local9.anInt4713, local50 + local9.anInt4773, local9, Static153.anInt2892, local9.anInt4751, local55, Static167.anInt3153);
						}
					}
					if (local9.anInt4721 == 0) {
						method624(arg0, local9.anInt4800, local61, local63, local65, local67, local50 - local9.anInt4757, local55 - local9.anInt4747);
						if (local9.aClass151Array2 != null) {
							method624(local9.aClass151Array2, local9.anInt4800, local61, local63, local65, local67, local50 - local9.anInt4757, local55 - local9.anInt4747);
						}
						@Pc(1691) Class3_Sub3 local1691 = (Class3_Sub3) Static205.aClass30_23.method663((long) local9.anInt4800);
						if (local1691 != null) {
							Static100.method1603(local1691.anInt183, local50, local55, local67, local65, local63, local61);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!rg;)Lclient!rg;")
	public static Class151 method625(@OriginalArg(0) Class151 arg0) {
		@Pc(4) int local4 = method612(arg0).method4789();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static243.method4115(arg0.anInt4727);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!rg;)Z")
	public static boolean method629(@OriginalArg(0) Class151 arg0) {
		if (Static244.aBoolean346) {
			if (method612(arg0).anInt5831 != 0) {
				return false;
			}
			if (arg0.anInt4721 == 0) {
				return false;
			}
		}
		return arg0.aBoolean334;
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "()V")
	public static void method630() {
		for (@Pc(1) int local1 = 0; local1 < 104; local1++) {
			@Pc(8) int[] local8 = Static249.anIntArrayArray70[local1];
			for (@Pc(10) int local10 = 0; local10 < 104; local10++) {
				local8[local10] = 0;
			}
		}
	}
}
