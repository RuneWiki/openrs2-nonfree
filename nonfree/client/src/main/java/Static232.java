import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static232 {

	@OriginalMember(owner = "client!rk", name = "d", descriptor = "Lclient!ak;")
	public static Class7 aClass7_197;

	@OriginalMember(owner = "client!rk", name = "e", descriptor = "[[I")
	public static int[][] anIntArrayArray39;

	@OriginalMember(owner = "client!rk", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString165 = null;

	@OriginalMember(owner = "client!rk", name = "h", descriptor = "I")
	public static int anInt4966 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)V")
	public static void method3814() {
		@Pc(16) int local16 = Static220.method3518();
		if (local16 == 0) {
			Static119.aByteArrayArrayArray21 = null;
			Static9.method187(0);
		} else if (local16 == 1) {
			Static55.method930((byte) 0);
			Static9.method187(512);
			if (Static242.aByteArrayArrayArray23 != null) {
				Static35.method638();
			}
		} else {
			Static55.method930((byte) (Static152.anInt2841 - 4 & 0xFF));
			Static9.method187(2);
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method3817(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(13) Class1_Sub2_Sub11 local13 = Static163.method3579(3, arg0);
		local13.method1859();
		local13.aString70 = arg1;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(IB)V")
	public static void method3818(@OriginalArg(0) int arg0) {
		@Pc(14) Class1_Sub2_Sub11 local14 = Static163.method3579(11, arg0);
		local14.method1853();
	}

	@OriginalMember(owner = "client!rk", name = "c", descriptor = "(I)V")
	public static void method3821() {
		Static284.aClass31_43.method850();
		Static247.aClass31_36.method850();
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(IZIIIILclient!ac;ZBII)V")
	public static void method3822(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class2 arg6, @OriginalArg(7) boolean arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (arg1 && !Static39.method718() && (Static242.aByteArrayArrayArray23[0][arg4][arg2] & 0x2) == 0) {
			if ((Static242.aByteArrayArrayArray23[arg5][arg4][arg2] & 0x10) != 0) {
				return;
			}
			if (Static173.method2621(arg5, arg4, arg2) != Static92.anInt1754) {
				return;
			}
		}
		if (arg5 < Static297.anInt5897) {
			Static297.anInt5897 = arg5;
		}
		@Pc(55) Class104 local55 = Static35.method636(arg0);
		if (Static240.aBoolean369 && local55.aBoolean204) {
			return;
		}
		@Pc(73) int local73;
		@Pc(70) int local70;
		if (arg9 == 1 || arg9 == 3) {
			local73 = local55.anInt2817;
			local70 = local55.anInt2814;
		} else {
			local70 = local55.anInt2817;
			local73 = local55.anInt2814;
		}
		@Pc(92) int local92;
		@Pc(90) int local90;
		if (arg4 + local73 > 104) {
			local90 = arg4 + 1;
			local92 = arg4;
		} else {
			local90 = arg4 + (local73 + 1 >> 1);
			local92 = arg4 + (local73 >> 1);
		}
		@Pc(129) int local129;
		@Pc(123) int local123;
		if (arg2 + local70 <= 104) {
			local123 = (local70 + 1 >> 1) + arg2;
			local129 = (local70 >> 1) + arg2;
		} else {
			local123 = arg2 + 1;
			local129 = arg2;
		}
		@Pc(141) int[][] local141 = Static163.anIntArrayArrayArray16[arg8];
		@Pc(149) int local149 = (arg4 << 7) + (local73 << 6);
		@Pc(175) int local175 = local141[local90][local123] + local141[local92][local123] + local141[local92][local129] + local141[local90][local129] >> 2;
		@Pc(183) int local183 = (arg2 << 7) + (local70 << 6);
		@Pc(185) int local185 = 0;
		@Pc(196) int[][] local196;
		if (Static240.aBoolean369 && arg8 != 0) {
			local196 = Static163.anIntArrayArrayArray16[0];
			local185 = local175 - (local196[local92][local129] + local196[local90][local129] + local196[local92][local123] + local196[local90][local123] >> 2);
		}
		local196 = null;
		@Pc(248) long local248 = (long) ((arg9 | 0x400) << 20 | arg3 << 14 | arg4 | arg2 << 7);
		if (arg7) {
			local196 = Static152.anIntArrayArrayArray11[0];
		} else if (arg8 < 3) {
			local196 = Static163.anIntArrayArrayArray16[arg8 + 1];
		}
		if (local55.anInt2803 == 0 || arg7) {
			local248 |= Long.MIN_VALUE;
		}
		if (local55.anInt2825 == 1) {
			local248 |= 0x400000L;
		}
		if (local55.aBoolean203) {
			local248 |= 0x80000000L;
		}
		local248 |= (long) arg0 << 32;
		if (local55.method2346()) {
			Static280.method4296(local55, null, arg5, null, arg4, arg2, arg9);
		}
		@Pc(322) boolean local322 = local55.aBoolean207 & !arg7;
		@Pc(325) int local325 = local55.anInt2822;
		@Pc(382) Class6 local382;
		@Pc(369) Class169 local369;
		if (arg3 == 22) {
			if (Static287.aBoolean429 || local55.anInt2803 != 0 || local55.anInt2810 == 1 || local55.aBoolean199) {
				if (local325 == -1 && local55.anIntArray350 == null && !local55.aBoolean206) {
					local369 = local55.method2356(arg9, null, local183, local149, local322, 22, local196, local141, local175, arg1);
					if (Static240.aBoolean369 && local322) {
						Static78.method1328(local369.aClass48_Sub2_5, local149, local185, local183);
					}
					local382 = local369.aClass6_10;
				} else {
					local382 = new Class6_Sub5(arg0, 22, arg9, arg8, arg4, arg2, local325, local55.aBoolean201, null);
				}
				Static255.method3974(arg5, arg4, arg2, local175, local382, local248, local55.aBoolean211);
				if (local55.anInt2810 == 1 && arg6 != null) {
					arg6.method115(arg4, arg2);
				}
			}
		} else if (arg3 == 10 || arg3 == 11) {
			if (local325 == -1 && local55.anIntArray350 == null && !local55.aBoolean206) {
				local369 = local55.method2356(arg3 == 11 ? arg9 + 4 : arg9, null, local183, local149, local322, 10, local196, local141, local175, arg1);
				if (Static240.aBoolean369 && local322) {
					Static78.method1328(local369.aClass48_Sub2_5, local149, local185, local183);
				}
				local382 = local369.aClass6_10;
			} else {
				local382 = new Class6_Sub5(arg0, 10, arg3 == 11 ? arg9 + 4 : arg9, arg8, arg4, arg2, local325, local55.aBoolean201, null);
			}
			if (local382 != null) {
				@Pc(517) boolean local517 = Static149.method2334(arg5, arg4, arg2, local175, local73, local70, local382, local248);
				if (local55.aBoolean198 && local517 && arg1) {
					@Pc(527) int local527 = 15;
					if (local382 instanceof Class6_Sub2) {
						local527 = ((Class6_Sub2) local382).method2082() / 4;
						if (local527 > 30) {
							local527 = 30;
						}
					}
					for (@Pc(544) int local544 = 0; local544 <= local73; local544++) {
						for (@Pc(549) int local549 = 0; local549 <= local70; local549++) {
							if (local527 > Static38.aByteArrayArrayArray5[arg5][local544 + arg4][arg2 + local549]) {
								Static38.aByteArrayArrayArray5[arg5][local544 + arg4][local549 + arg2] = (byte) local527;
							}
						}
					}
				}
			}
			if (local55.anInt2810 != 0 && arg6 != null) {
				arg6.method118(local55.aBoolean202, local70, arg2, local73, arg4, !local55.aBoolean205);
			}
		} else if (arg3 >= 12) {
			if (local325 == -1 && local55.anIntArray350 == null && !local55.aBoolean206) {
				local369 = local55.method2356(arg9, null, local183, local149, local322, arg3, local196, local141, local175, arg1);
				if (Static240.aBoolean369 && local322) {
					Static78.method1328(local369.aClass48_Sub2_5, local149, local185, local183);
				}
				local382 = local369.aClass6_10;
			} else {
				local382 = new Class6_Sub5(arg0, arg3, arg9, arg8, arg4, arg2, local325, local55.aBoolean201, null);
			}
			Static149.method2334(arg5, arg4, arg2, local175, 1, 1, local382, local248);
			if (arg1 && arg3 >= 12 && arg3 <= 17 && arg3 != 13 && arg5 > 0 && local55.anInt2824 != 0) {
				Static253.anIntArrayArrayArray19[arg5][arg4][arg2] |= 0x4;
			}
			if (local55.anInt2810 != 0 && arg6 != null) {
				arg6.method118(local55.aBoolean202, local70, arg2, local73, arg4, !local55.aBoolean205);
			}
		} else if (arg3 == 0) {
			if (local325 == -1 && local55.anIntArray350 == null && !local55.aBoolean206) {
				local369 = local55.method2356(arg9, null, local183, local149, local322, 0, local196, local141, local175, arg1);
				if (Static240.aBoolean369 && local322) {
					Static78.method1328(local369.aClass48_Sub2_5, local149, local185, local183);
				}
				local382 = local369.aClass6_10;
			} else {
				local382 = new Class6_Sub5(arg0, 0, arg9, arg8, arg4, arg2, local325, local55.aBoolean201, null);
			}
			Static140.method2199(arg5, arg4, arg2, local175, local382, null, Static230.anIntArray566[arg9], 0, local248);
			if (arg1) {
				if (arg9 == 0) {
					if (local55.aBoolean198) {
						Static38.aByteArrayArrayArray5[arg5][arg4][arg2] = 50;
						Static38.aByteArrayArrayArray5[arg5][arg4][arg2 + 1] = 50;
					}
					if (local55.anInt2824 == 1) {
						Static253.anIntArrayArrayArray19[arg5][arg4][arg2] |= 0x1;
					}
				} else if (arg9 == 1) {
					if (local55.aBoolean198) {
						Static38.aByteArrayArrayArray5[arg5][arg4][arg2 + 1] = 50;
						Static38.aByteArrayArrayArray5[arg5][arg4 + 1][arg2 + 1] = 50;
					}
					if (local55.anInt2824 == 1) {
						Static253.anIntArrayArrayArray19[arg5][arg4][arg2 + 1] |= 0x2;
					}
				} else if (arg9 == 2) {
					if (local55.aBoolean198) {
						Static38.aByteArrayArrayArray5[arg5][arg4 + 1][arg2] = 50;
						Static38.aByteArrayArrayArray5[arg5][arg4 + 1][arg2 + 1] = 50;
					}
					if (local55.anInt2824 == 1) {
						Static253.anIntArrayArrayArray19[arg5][arg4 + 1][arg2] |= 0x1;
					}
				} else if (arg9 == 3) {
					if (local55.aBoolean198) {
						Static38.aByteArrayArrayArray5[arg5][arg4][arg2] = 50;
						Static38.aByteArrayArrayArray5[arg5][arg4 + 1][arg2] = 50;
					}
					if (local55.anInt2824 == 1) {
						Static253.anIntArrayArrayArray19[arg5][arg4][arg2] |= 0x2;
					}
				}
			}
			if (local55.anInt2810 != 0 && arg6 != null) {
				arg6.method107(!local55.aBoolean205, local55.aBoolean202, arg3, arg4, arg9, arg2);
			}
			if (local55.anInt2809 != 16) {
				Static77.method1322(arg5, arg4, arg2, local55.anInt2809);
			}
		} else if (arg3 == 1) {
			if (local325 == -1 && local55.anIntArray350 == null && !local55.aBoolean206) {
				local369 = local55.method2356(arg9, null, local183, local149, local322, 1, local196, local141, local175, arg1);
				if (Static240.aBoolean369 && local322) {
					Static78.method1328(local369.aClass48_Sub2_5, local149, local185, local183);
				}
				local382 = local369.aClass6_10;
			} else {
				local382 = new Class6_Sub5(arg0, 1, arg9, arg8, arg4, arg2, local325, local55.aBoolean201, null);
			}
			Static140.method2199(arg5, arg4, arg2, local175, local382, null, Static32.anIntArray110[arg9], 0, local248);
			if (local55.aBoolean198 && arg1) {
				if (arg9 == 0) {
					Static38.aByteArrayArrayArray5[arg5][arg4][arg2 + 1] = 50;
				} else if (arg9 == 1) {
					Static38.aByteArrayArrayArray5[arg5][arg4 + 1][arg2 + 1] = 50;
				} else if (arg9 == 2) {
					Static38.aByteArrayArrayArray5[arg5][arg4 + 1][arg2] = 50;
				} else if (arg9 == 3) {
					Static38.aByteArrayArrayArray5[arg5][arg4][arg2] = 50;
				}
			}
			if (local55.anInt2810 != 0 && arg6 != null) {
				arg6.method107(!local55.aBoolean205, local55.aBoolean202, arg3, arg4, arg9, arg2);
			}
		} else {
			@Pc(1218) int local1218;
			if (arg3 == 2) {
				local1218 = arg9 + 1 & 0x3;
				@Pc(1258) Class6 local1258;
				@Pc(1286) Class6 local1286;
				if (local325 == -1 && local55.anIntArray350 == null && !local55.aBoolean206) {
					@Pc(1244) Class169 local1244 = local55.method2356(arg9 + 4, null, local183, local149, local322, 2, local196, local141, local175, arg1);
					if (Static240.aBoolean369 && local322) {
						Static78.method1328(local1244.aClass48_Sub2_5, local149, local185, local183);
					}
					local1258 = local1244.aClass6_10;
					local1244 = local55.method2356(local1218, null, local183, local149, local322, 2, local196, local141, local175, arg1);
					if (Static240.aBoolean369 && local322) {
						Static78.method1328(local1244.aClass48_Sub2_5, local149, local185, local183);
					}
					local1286 = local1244.aClass6_10;
				} else {
					local1258 = new Class6_Sub5(arg0, 2, arg9 + 4, arg8, arg4, arg2, local325, local55.aBoolean201, null);
					local1286 = new Class6_Sub5(arg0, 2, local1218, arg8, arg4, arg2, local325, local55.aBoolean201, null);
				}
				Static140.method2199(arg5, arg4, arg2, local175, local1258, local1286, Static230.anIntArray566[arg9], Static230.anIntArray566[local1218], local248);
				if (local55.anInt2824 == 1 && arg1) {
					if (arg9 == 0) {
						Static253.anIntArrayArrayArray19[arg5][arg4][arg2] |= 0x1;
						Static253.anIntArrayArrayArray19[arg5][arg4][arg2 + 1] |= 0x2;
					} else if (arg9 == 1) {
						Static253.anIntArrayArrayArray19[arg5][arg4][arg2 + 1] |= 0x2;
						Static253.anIntArrayArrayArray19[arg5][arg4 + 1][arg2] |= 0x1;
					} else if (arg9 == 2) {
						Static253.anIntArrayArrayArray19[arg5][arg4 + 1][arg2] |= 0x1;
						Static253.anIntArrayArrayArray19[arg5][arg4][arg2] |= 0x2;
					} else if (arg9 == 3) {
						Static253.anIntArrayArrayArray19[arg5][arg4][arg2] |= 0x2;
						Static253.anIntArrayArrayArray19[arg5][arg4][arg2] |= 0x1;
					}
				}
				if (local55.anInt2810 != 0 && arg6 != null) {
					arg6.method107(!local55.aBoolean205, local55.aBoolean202, arg3, arg4, arg9, arg2);
				}
				if (local55.anInt2809 != 16) {
					Static77.method1322(arg5, arg4, arg2, local55.anInt2809);
				}
			} else if (arg3 == 3) {
				if (local325 == -1 && local55.anIntArray350 == null && !local55.aBoolean206) {
					local369 = local55.method2356(arg9, null, local183, local149, local322, 3, local196, local141, local175, arg1);
					if (Static240.aBoolean369 && local322) {
						Static78.method1328(local369.aClass48_Sub2_5, local149, local185, local183);
					}
					local382 = local369.aClass6_10;
				} else {
					local382 = new Class6_Sub5(arg0, 3, arg9, arg8, arg4, arg2, local325, local55.aBoolean201, null);
				}
				Static140.method2199(arg5, arg4, arg2, local175, local382, null, Static32.anIntArray110[arg9], 0, local248);
				if (local55.aBoolean198 && arg1) {
					if (arg9 == 0) {
						Static38.aByteArrayArrayArray5[arg5][arg4][arg2 + 1] = 50;
					} else if (arg9 == 1) {
						Static38.aByteArrayArrayArray5[arg5][arg4 + 1][arg2 + 1] = 50;
					} else if (arg9 == 2) {
						Static38.aByteArrayArrayArray5[arg5][arg4 + 1][arg2] = 50;
					} else if (arg9 == 3) {
						Static38.aByteArrayArrayArray5[arg5][arg4][arg2] = 50;
					}
				}
				if (local55.anInt2810 != 0 && arg6 != null) {
					arg6.method107(!local55.aBoolean205, local55.aBoolean202, arg3, arg4, arg9, arg2);
				}
			} else if (arg3 == 9) {
				if (local325 == -1 && local55.anIntArray350 == null && !local55.aBoolean206) {
					local369 = local55.method2356(arg9, null, local183, local149, local322, arg3, local196, local141, local175, arg1);
					if (Static240.aBoolean369 && local322) {
						Static78.method1328(local369.aClass48_Sub2_5, local149, local185, local183);
					}
					local382 = local369.aClass6_10;
				} else {
					local382 = new Class6_Sub5(arg0, arg3, arg9, arg8, arg4, arg2, local325, local55.aBoolean201, null);
				}
				Static149.method2334(arg5, arg4, arg2, local175, 1, 1, local382, local248);
				if (local55.anInt2810 != 0 && arg6 != null) {
					arg6.method118(local55.aBoolean202, local70, arg2, local73, arg4, !local55.aBoolean205);
				}
				if (local55.anInt2809 != 16) {
					Static77.method1322(arg5, arg4, arg2, local55.anInt2809);
				}
			} else if (arg3 == 4) {
				if (local325 == -1 && local55.anIntArray350 == null && !local55.aBoolean206) {
					local369 = local55.method2356(arg9, null, local183, local149, local322, 4, local196, local141, local175, arg1);
					if (Static240.aBoolean369 && local322) {
						Static78.method1328(local369.aClass48_Sub2_5, local149, local185, local183);
					}
					local382 = local369.aClass6_10;
				} else {
					local382 = new Class6_Sub5(arg0, 4, arg9, arg8, arg4, arg2, local325, local55.aBoolean201, null);
				}
				Static98.method1610(arg5, arg4, arg2, local175, local382, null, Static230.anIntArray566[arg9], 0, 0, 0, local248);
			} else {
				@Pc(1891) long local1891;
				@Pc(1959) Class6 local1959;
				@Pc(1932) Class169 local1932;
				if (arg3 == 5) {
					local1218 = 16;
					local1891 = Static291.method4472(arg5, arg4, arg2);
					if (local1891 != 0L) {
						local1218 = Static35.method636(Integer.MAX_VALUE & (int) (local1891 >>> 32)).anInt2809;
					}
					if (local325 == -1 && local55.anIntArray350 == null && !local55.aBoolean206) {
						local1932 = local55.method2356(arg9, null, local183, local149, local322, 4, local196, local141, local175, arg1);
						if (Static240.aBoolean369 && local322) {
							Static78.method1328(local1932.aClass48_Sub2_5, local149 - Static220.anIntArray521[arg9] * 8, local185, local183 - Static247.anIntArray591[arg9] * 8);
						}
						local1959 = local1932.aClass6_10;
					} else {
						local1959 = new Class6_Sub5(arg0, 4, arg9, arg8, arg4, arg2, local325, local55.aBoolean201, null);
					}
					Static98.method1610(arg5, arg4, arg2, local175, local1959, null, Static230.anIntArray566[arg9], 0, local1218 * Static220.anIntArray521[arg9], Static247.anIntArray591[arg9] * local1218, local248);
				} else if (arg3 == 6) {
					local1891 = Static291.method4472(arg5, arg4, arg2);
					local1218 = 8;
					if (local1891 != 0L) {
						local1218 = Static35.method636(Integer.MAX_VALUE & (int) (local1891 >>> 32)).anInt2809 / 2;
					}
					if (local325 == -1 && local55.anIntArray350 == null && !local55.aBoolean206) {
						local1932 = local55.method2356(arg9 + 4, null, local183, local149, local322, 4, local196, local141, local175, arg1);
						if (Static240.aBoolean369 && local322) {
							Static78.method1328(local1932.aClass48_Sub2_5, local149 - Static190.anIntArray420[arg9] * 8, local185, local183 - Static25.anIntArray356[arg9] * 8);
						}
						local1959 = local1932.aClass6_10;
					} else {
						local1959 = new Class6_Sub5(arg0, 4, arg9 + 4, arg8, arg4, arg2, local325, local55.aBoolean201, null);
					}
					Static98.method1610(arg5, arg4, arg2, local175, local1959, null, 256, arg9, local1218 * Static190.anIntArray420[arg9], Static25.anIntArray356[arg9] * local1218, local248);
				} else if (arg3 == 7) {
					@Pc(2128) int local2128 = arg9 + 2 & 0x3;
					if (local325 == -1 && local55.anIntArray350 == null && !local55.aBoolean206) {
						@Pc(2174) Class169 local2174 = local55.method2356(local2128 + 4, null, local183, local149, local322, 4, local196, local141, local175, arg1);
						if (Static240.aBoolean369 && local322) {
							Static78.method1328(local2174.aClass48_Sub2_5, local149, local185, local183);
						}
						local382 = local2174.aClass6_10;
					} else {
						local382 = new Class6_Sub5(arg0, 4, local2128 + 4, arg8, arg4, arg2, local325, local55.aBoolean201, null);
					}
					Static98.method1610(arg5, arg4, arg2, local175, local382, null, 256, local2128, 0, 0, local248);
				} else if (arg3 == 8) {
					local1218 = 8;
					local1891 = Static291.method4472(arg5, arg4, arg2);
					if (local1891 != 0L) {
						local1218 = Static35.method636(Integer.MAX_VALUE & (int) (local1891 >>> 32)).anInt2809 / 2;
					}
					@Pc(2237) int local2237 = arg9 + 2 & 0x3;
					@Pc(2278) Class6 local2278;
					if (local325 == -1 && local55.anIntArray350 == null && !local55.aBoolean206) {
						@Pc(2286) int local2286 = Static190.anIntArray420[arg9] * 8;
						@Pc(2292) int local2292 = Static25.anIntArray356[arg9] * 8;
						@Pc(2308) Class169 local2308 = local55.method2356(arg9 + 4, null, local183, local149, local322, 4, local196, local141, local175, arg1);
						if (Static240.aBoolean369 && local322) {
							Static78.method1328(local2308.aClass48_Sub2_5, local149 - local2286, local185, local183 - local2292);
						}
						local1959 = local2308.aClass6_10;
						local2308 = local55.method2356(local2237 + 4, null, local183, local149, local322, 4, local196, local141, local175, arg1);
						if (Static240.aBoolean369 && local322) {
							Static78.method1328(local2308.aClass48_Sub2_5, local149 - local2286, local185, local183 - local2292);
						}
						local2278 = local2308.aClass6_10;
					} else {
						local1959 = new Class6_Sub5(arg0, 4, arg9 + 4, arg8, arg4, arg2, local325, local55.aBoolean201, null);
						local2278 = new Class6_Sub5(arg0, 4, local2237 + 4, arg8, arg4, arg2, local325, local55.aBoolean201, null);
					}
					Static98.method1610(arg5, arg4, arg2, local175, local1959, local2278, 256, arg9, Static190.anIntArray420[arg9] * local1218, local1218 * Static25.anIntArray356[arg9], local248);
				}
			}
		}
	}
}
