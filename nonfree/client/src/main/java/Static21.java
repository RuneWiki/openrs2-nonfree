import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!bi", name = "x", descriptor = "I")
	public static int anInt4304;

	@OriginalMember(owner = "client!bi", name = "z", descriptor = "[I")
	public static int[] anIntArray385;

	@OriginalMember(owner = "client!bi", name = "C", descriptor = "I")
	public static int anInt4307;

	@OriginalMember(owner = "client!bi", name = "E", descriptor = "[I")
	public static int[] anIntArray386 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(II)Lclient!cc;")
	public static Class22 method3453(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 & 0xFFFF;
		@Pc(17) int local17 = arg0 >> 16;
		if (Static148.aClass22ArrayArray1[local17] == null || Static148.aClass22ArrayArray1[local17][local7] == null) {
			@Pc(33) boolean local33 = Static222.method3559(local17);
			if (!local33) {
				return null;
			}
		}
		return Static148.aClass22ArrayArray1[local17][local7];
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIZIZILclient!hm;IIII)V")
	public static void method3455(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class63 arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (arg4 && !Static62.method957() && (Static46.aByteArrayArrayArray2[0][arg7][arg9] & 0x2) == 0) {
			if ((Static46.aByteArrayArrayArray2[arg3][arg7][arg9] & 0x10) != 0) {
				return;
			}
			if (Static99.method1612(arg7, arg3, arg9) != Static168.anInt3342) {
				return;
			}
		}
		if (arg3 < Static145.anInt2969) {
			Static145.anInt2969 = arg3;
		}
		@Pc(58) Class47 local58 = Static170.method2683(arg8);
		if (Static178.aBoolean216 && local58.aBoolean108) {
			return;
		}
		@Pc(76) int local76;
		@Pc(73) int local73;
		if (arg1 == 1 || arg1 == 3) {
			local73 = local58.anInt1327;
			local76 = local58.anInt1354;
		} else {
			local73 = local58.anInt1354;
			local76 = local58.anInt1327;
		}
		@Pc(96) int local96;
		@Pc(105) int local105;
		if (arg7 + local76 <= 104) {
			local96 = (local76 >> 1) + arg7;
			local105 = arg7 + (local76 + 1 >> 1);
		} else {
			local105 = arg7 + 1;
			local96 = arg7;
		}
		@Pc(134) int local134;
		@Pc(128) int local128;
		if (local73 + arg9 <= 104) {
			local128 = arg9 + (local73 + 1 >> 1);
			local134 = (local73 >> 1) + arg9;
		} else {
			local134 = arg9;
			local128 = arg9 + 1;
		}
		@Pc(146) int[][] local146 = Static250.anIntArrayArrayArray13[arg5];
		@Pc(173) int local173 = local146[local105][local128] + local146[local96][local128] + local146[local96][local134] + local146[local105][local134] >> 2;
		@Pc(181) int local181 = (local76 << 6) + (arg7 << 7);
		@Pc(189) int local189 = (local73 << 6) + (arg9 << 7);
		@Pc(191) int local191 = 0;
		@Pc(199) int[][] local199;
		if (Static178.aBoolean216 && arg5 != 0) {
			local199 = Static250.anIntArrayArrayArray13[0];
			local191 = local173 - (local199[local96][local128] + local199[local105][local134] + local199[local96][local134] + local199[local105][local128] >> 2);
		}
		local199 = null;
		if (arg2) {
			local199 = Static231.anIntArrayArrayArray12[0];
		} else if (arg5 < 3) {
			local199 = Static250.anIntArrayArrayArray13[arg5 + 1];
		}
		@Pc(264) long local264 = (long) (arg1 << 20 | arg0 << 14 | arg7 | arg9 << 7 | 0x40000000);
		if (local58.anInt1340 == 0 || arg2) {
			local264 |= Long.MIN_VALUE;
		}
		if (local58.anInt1332 == 1) {
			local264 |= 0x400000L;
		}
		if (local58.aBoolean109) {
			local264 |= 0x80000000L;
		}
		local264 |= (long) arg8 << 32;
		if (local58.method1093()) {
			Static54.method872(arg9, null, null, arg1, arg7, local58, arg3);
		}
		@Pc(320) int local320 = local58.anInt1336;
		@Pc(329) boolean local329 = !arg2 & local58.aBoolean111;
		@Pc(386) Class12 local386;
		@Pc(372) Class154 local372;
		if (arg0 == 22) {
			if (Static114.aBoolean166 || local58.anInt1340 != 0 || local58.anInt1339 == 1 || local58.aBoolean97) {
				if (local320 == -1 && local58.anIntArray142 == null && !local58.aBoolean98) {
					local372 = local58.method1091(local199, 22, local146, arg1, arg4, local329, null, local173, local189, local181);
					if (Static178.aBoolean216 && local329) {
						Static64.method972(local372.aClass59_Sub2_4, local181, local191, local189);
					}
					local386 = local372.aClass12_9;
				} else {
					local386 = new Class12_Sub6(arg8, 22, arg1, arg5, arg7, arg9, local320, local58.aBoolean112, null);
				}
				Static229.method4268(arg3, arg7, arg9, local173, local386, local264, local58.aBoolean102);
				if (local58.anInt1339 == 1 && arg6 != null) {
					arg6.method1661(arg9, arg7);
				}
			}
		} else if (arg0 == 10 || arg0 == 11) {
			if (local320 == -1 && local58.anIntArray142 == null && !local58.aBoolean98) {
				local372 = local58.method1091(local199, 10, local146, arg0 == 11 ? arg1 + 4 : arg1, arg4, local329, null, local173, local189, local181);
				if (Static178.aBoolean216 && local329) {
					Static64.method972(local372.aClass59_Sub2_4, local181, local191, local189);
				}
				local386 = local372.aClass12_9;
			} else {
				local386 = new Class12_Sub6(arg8, 10, arg0 == 11 ? arg1 + 4 : arg1, arg5, arg7, arg9, local320, local58.aBoolean112, null);
			}
			if (local386 != null) {
				@Pc(520) boolean local520 = Static171.method2688(arg3, arg7, arg9, local173, local76, local73, local386, local264);
				if (local58.aBoolean107 && local520 && arg4) {
					@Pc(529) int local529 = 15;
					if (local386 instanceof Class12_Sub2) {
						local529 = ((Class12_Sub2) local386).method3142() / 4;
						if (local529 > 30) {
							local529 = 30;
						}
					}
					for (@Pc(548) int local548 = 0; local548 <= local76; local548++) {
						for (@Pc(553) int local553 = 0; local553 <= local73; local553++) {
							if (Static227.aByteArrayArrayArray14[arg3][arg7 + local548][local553 + arg9] < local529) {
								Static227.aByteArrayArrayArray14[arg3][local548 + arg7][arg9 + local553] = (byte) local529;
							}
						}
					}
				}
			}
			if (local58.anInt1339 != 0 && arg6 != null) {
				arg6.method1662(local76, !local58.aBoolean105, local58.aBoolean113, local73, arg7, arg9);
			}
		} else if (arg0 >= 12) {
			if (local320 == -1 && local58.anIntArray142 == null && !local58.aBoolean98) {
				local372 = local58.method1091(local199, arg0, local146, arg1, arg4, local329, null, local173, local189, local181);
				if (Static178.aBoolean216 && local329) {
					Static64.method972(local372.aClass59_Sub2_4, local181, local191, local189);
				}
				local386 = local372.aClass12_9;
			} else {
				local386 = new Class12_Sub6(arg8, arg0, arg1, arg5, arg7, arg9, local320, local58.aBoolean112, null);
			}
			Static171.method2688(arg3, arg7, arg9, local173, 1, 1, local386, local264);
			if (arg4 && arg0 >= 12 && arg0 <= 17 && arg0 != 13 && arg3 > 0 && local58.anInt1362 != 0) {
				Static84.anIntArrayArrayArray6[arg3][arg7][arg9] |= 0x4;
			}
			if (local58.anInt1339 != 0 && arg6 != null) {
				arg6.method1662(local76, !local58.aBoolean105, local58.aBoolean113, local73, arg7, arg9);
			}
		} else if (arg0 == 0) {
			if (local320 == -1 && local58.anIntArray142 == null && !local58.aBoolean98) {
				local372 = local58.method1091(local199, 0, local146, arg1, arg4, local329, null, local173, local189, local181);
				if (Static178.aBoolean216 && local329) {
					Static64.method972(local372.aClass59_Sub2_4, local181, local191, local189);
				}
				local386 = local372.aClass12_9;
			} else {
				local386 = new Class12_Sub6(arg8, 0, arg1, arg5, arg7, arg9, local320, local58.aBoolean112, null);
			}
			Static139.method2268(arg3, arg7, arg9, local173, local386, null, Static152.anIntArray284[arg1], 0, local264);
			if (arg4) {
				if (arg1 == 0) {
					if (local58.aBoolean107) {
						Static227.aByteArrayArrayArray14[arg3][arg7][arg9] = 50;
						Static227.aByteArrayArrayArray14[arg3][arg7][arg9 + 1] = 50;
					}
					if (local58.anInt1362 == 1) {
						Static84.anIntArrayArrayArray6[arg3][arg7][arg9] |= 0x1;
					}
				} else if (arg1 == 1) {
					if (local58.aBoolean107) {
						Static227.aByteArrayArrayArray14[arg3][arg7][arg9 + 1] = 50;
						Static227.aByteArrayArrayArray14[arg3][arg7 + 1][arg9 + 1] = 50;
					}
					if (local58.anInt1362 == 1) {
						Static84.anIntArrayArrayArray6[arg3][arg7][arg9 + 1] |= 0x2;
					}
				} else if (arg1 == 2) {
					if (local58.aBoolean107) {
						Static227.aByteArrayArrayArray14[arg3][arg7 + 1][arg9] = 50;
						Static227.aByteArrayArrayArray14[arg3][arg7 + 1][arg9 + 1] = 50;
					}
					if (local58.anInt1362 == 1) {
						Static84.anIntArrayArrayArray6[arg3][arg7 + 1][arg9] |= 0x1;
					}
				} else if (arg1 == 3) {
					if (local58.aBoolean107) {
						Static227.aByteArrayArrayArray14[arg3][arg7][arg9] = 50;
						Static227.aByteArrayArrayArray14[arg3][arg7 + 1][arg9] = 50;
					}
					if (local58.anInt1362 == 1) {
						Static84.anIntArrayArrayArray6[arg3][arg7][arg9] |= 0x2;
					}
				}
			}
			if (local58.anInt1339 != 0 && arg6 != null) {
				arg6.method1674(arg7, local58.aBoolean113, arg0, arg9, !local58.aBoolean105, arg1);
			}
			if (local58.anInt1338 != 16) {
				Static239.method3686(arg3, arg7, arg9, local58.anInt1338);
			}
		} else if (arg0 == 1) {
			if (local320 == -1 && local58.anIntArray142 == null && !local58.aBoolean98) {
				local372 = local58.method1091(local199, 1, local146, arg1, arg4, local329, null, local173, local189, local181);
				if (Static178.aBoolean216 && local329) {
					Static64.method972(local372.aClass59_Sub2_4, local181, local191, local189);
				}
				local386 = local372.aClass12_9;
			} else {
				local386 = new Class12_Sub6(arg8, 1, arg1, arg5, arg7, arg9, local320, local58.aBoolean112, null);
			}
			Static139.method2268(arg3, arg7, arg9, local173, local386, null, Static287.anIntArray237[arg1], 0, local264);
			if (local58.aBoolean107 && arg4) {
				if (arg1 == 0) {
					Static227.aByteArrayArrayArray14[arg3][arg7][arg9 + 1] = 50;
				} else if (arg1 == 1) {
					Static227.aByteArrayArrayArray14[arg3][arg7 + 1][arg9 + 1] = 50;
				} else if (arg1 == 2) {
					Static227.aByteArrayArrayArray14[arg3][arg7 + 1][arg9] = 50;
				} else if (arg1 == 3) {
					Static227.aByteArrayArrayArray14[arg3][arg7][arg9] = 50;
				}
			}
			if (local58.anInt1339 != 0 && arg6 != null) {
				arg6.method1674(arg7, local58.aBoolean113, arg0, arg9, !local58.aBoolean105, arg1);
			}
		} else {
			@Pc(1234) int local1234;
			if (arg0 == 2) {
				local1234 = arg1 + 1 & 0x3;
				@Pc(1302) Class12 local1302;
				@Pc(1274) Class12 local1274;
				if (local320 == -1 && local58.anIntArray142 == null && !local58.aBoolean98) {
					@Pc(1260) Class154 local1260 = local58.method1091(local199, 2, local146, arg1 + 4, arg4, local329, null, local173, local189, local181);
					if (Static178.aBoolean216 && local329) {
						Static64.method972(local1260.aClass59_Sub2_4, local181, local191, local189);
					}
					local1274 = local1260.aClass12_9;
					local1260 = local58.method1091(local199, 2, local146, local1234, arg4, local329, null, local173, local189, local181);
					if (Static178.aBoolean216 && local329) {
						Static64.method972(local1260.aClass59_Sub2_4, local181, local191, local189);
					}
					local1302 = local1260.aClass12_9;
				} else {
					local1274 = new Class12_Sub6(arg8, 2, arg1 + 4, arg5, arg7, arg9, local320, local58.aBoolean112, null);
					local1302 = new Class12_Sub6(arg8, 2, local1234, arg5, arg7, arg9, local320, local58.aBoolean112, null);
				}
				Static139.method2268(arg3, arg7, arg9, local173, local1274, local1302, Static152.anIntArray284[arg1], Static152.anIntArray284[local1234], local264);
				if (local58.anInt1362 == 1 && arg4) {
					if (arg1 == 0) {
						Static84.anIntArrayArrayArray6[arg3][arg7][arg9] |= 0x1;
						Static84.anIntArrayArrayArray6[arg3][arg7][arg9 + 1] |= 0x2;
					} else if (arg1 == 1) {
						Static84.anIntArrayArrayArray6[arg3][arg7][arg9 + 1] |= 0x2;
						Static84.anIntArrayArrayArray6[arg3][arg7 + 1][arg9] |= 0x1;
					} else if (arg1 == 2) {
						Static84.anIntArrayArrayArray6[arg3][arg7 + 1][arg9] |= 0x1;
						Static84.anIntArrayArrayArray6[arg3][arg7][arg9] |= 0x2;
					} else if (arg1 == 3) {
						Static84.anIntArrayArrayArray6[arg3][arg7][arg9] |= 0x2;
						Static84.anIntArrayArrayArray6[arg3][arg7][arg9] |= 0x1;
					}
				}
				if (local58.anInt1339 != 0 && arg6 != null) {
					arg6.method1674(arg7, local58.aBoolean113, arg0, arg9, !local58.aBoolean105, arg1);
				}
				if (local58.anInt1338 != 16) {
					Static239.method3686(arg3, arg7, arg9, local58.anInt1338);
				}
			} else if (arg0 == 3) {
				if (local320 == -1 && local58.anIntArray142 == null && !local58.aBoolean98) {
					local372 = local58.method1091(local199, 3, local146, arg1, arg4, local329, null, local173, local189, local181);
					if (Static178.aBoolean216 && local329) {
						Static64.method972(local372.aClass59_Sub2_4, local181, local191, local189);
					}
					local386 = local372.aClass12_9;
				} else {
					local386 = new Class12_Sub6(arg8, 3, arg1, arg5, arg7, arg9, local320, local58.aBoolean112, null);
				}
				Static139.method2268(arg3, arg7, arg9, local173, local386, null, Static287.anIntArray237[arg1], 0, local264);
				if (local58.aBoolean107 && arg4) {
					if (arg1 == 0) {
						Static227.aByteArrayArrayArray14[arg3][arg7][arg9 + 1] = 50;
					} else if (arg1 == 1) {
						Static227.aByteArrayArrayArray14[arg3][arg7 + 1][arg9 + 1] = 50;
					} else if (arg1 == 2) {
						Static227.aByteArrayArrayArray14[arg3][arg7 + 1][arg9] = 50;
					} else if (arg1 == 3) {
						Static227.aByteArrayArrayArray14[arg3][arg7][arg9] = 50;
					}
				}
				if (local58.anInt1339 != 0 && arg6 != null) {
					arg6.method1674(arg7, local58.aBoolean113, arg0, arg9, !local58.aBoolean105, arg1);
				}
			} else if (arg0 == 9) {
				if (local320 == -1 && local58.anIntArray142 == null && !local58.aBoolean98) {
					local372 = local58.method1091(local199, arg0, local146, arg1, arg4, local329, null, local173, local189, local181);
					if (Static178.aBoolean216 && local329) {
						Static64.method972(local372.aClass59_Sub2_4, local181, local191, local189);
					}
					local386 = local372.aClass12_9;
				} else {
					local386 = new Class12_Sub6(arg8, arg0, arg1, arg5, arg7, arg9, local320, local58.aBoolean112, null);
				}
				Static171.method2688(arg3, arg7, arg9, local173, 1, 1, local386, local264);
				if (local58.anInt1339 != 0 && arg6 != null) {
					arg6.method1662(local76, !local58.aBoolean105, local58.aBoolean113, local73, arg7, arg9);
				}
				if (local58.anInt1338 != 16) {
					Static239.method3686(arg3, arg7, arg9, local58.anInt1338);
				}
			} else if (arg0 == 4) {
				if (local320 == -1 && local58.anIntArray142 == null && !local58.aBoolean98) {
					local372 = local58.method1091(local199, 4, local146, arg1, arg4, local329, null, local173, local189, local181);
					if (Static178.aBoolean216 && local329) {
						Static64.method972(local372.aClass59_Sub2_4, local181, local191, local189);
					}
					local386 = local372.aClass12_9;
				} else {
					local386 = new Class12_Sub6(arg8, 4, arg1, arg5, arg7, arg9, local320, local58.aBoolean112, null);
				}
				Static254.method3832(arg3, arg7, arg9, local173, local386, null, Static152.anIntArray284[arg1], 0, 0, 0, local264);
			} else {
				@Pc(1903) long local1903;
				@Pc(1973) Class12 local1973;
				@Pc(1946) Class154 local1946;
				if (arg0 == 5) {
					local1903 = Static215.method3428(arg3, arg7, arg9);
					local1234 = 16;
					if (local1903 != 0L) {
						local1234 = Static170.method2683((int) (local1903 >>> 32) & Integer.MAX_VALUE).anInt1338;
					}
					if (local320 == -1 && local58.anIntArray142 == null && !local58.aBoolean98) {
						local1946 = local58.method1091(local199, 4, local146, arg1, arg4, local329, null, local173, local189, local181);
						if (Static178.aBoolean216 && local329) {
							Static64.method972(local1946.aClass59_Sub2_4, local181 - Static95.anIntArray212[arg1] * 8, local191, local189 - Static145.anIntArray277[arg1] * 8);
						}
						local1973 = local1946.aClass12_9;
					} else {
						local1973 = new Class12_Sub6(arg8, 4, arg1, arg5, arg7, arg9, local320, local58.aBoolean112, null);
					}
					Static254.method3832(arg3, arg7, arg9, local173, local1973, null, Static152.anIntArray284[arg1], 0, local1234 * Static95.anIntArray212[arg1], local1234 * Static145.anIntArray277[arg1], local264);
				} else if (arg0 == 6) {
					local1234 = 8;
					local1903 = Static215.method3428(arg3, arg7, arg9);
					if (local1903 != 0L) {
						local1234 = Static170.method2683(Integer.MAX_VALUE & (int) (local1903 >>> 32)).anInt1338 / 2;
					}
					if (local320 == -1 && local58.anIntArray142 == null && !local58.aBoolean98) {
						local1946 = local58.method1091(local199, 4, local146, arg1 + 4, arg4, local329, null, local173, local189, local181);
						if (Static178.aBoolean216 && local329) {
							Static64.method972(local1946.aClass59_Sub2_4, local181 - Static79.anIntArray166[arg1] * 8, local191, local189 - Static65.anIntArray135[arg1] * 8);
						}
						local1973 = local1946.aClass12_9;
					} else {
						local1973 = new Class12_Sub6(arg8, 4, arg1 + 4, arg5, arg7, arg9, local320, local58.aBoolean112, null);
					}
					Static254.method3832(arg3, arg7, arg9, local173, local1973, null, 256, arg1, local1234 * Static79.anIntArray166[arg1], Static65.anIntArray135[arg1] * local1234, local264);
				} else if (arg0 == 7) {
					@Pc(2147) int local2147 = arg1 + 2 & 0x3;
					if (local320 == -1 && local58.anIntArray142 == null && !local58.aBoolean98) {
						@Pc(2190) Class154 local2190 = local58.method1091(local199, 4, local146, local2147 + 4, arg4, local329, null, local173, local189, local181);
						if (Static178.aBoolean216 && local329) {
							Static64.method972(local2190.aClass59_Sub2_4, local181, local191, local189);
						}
						local386 = local2190.aClass12_9;
					} else {
						local386 = new Class12_Sub6(arg8, 4, local2147 + 4, arg5, arg7, arg9, local320, local58.aBoolean112, null);
					}
					Static254.method3832(arg3, arg7, arg9, local173, local386, null, 256, local2147, 0, 0, local264);
				} else if (arg0 == 8) {
					local1234 = 8;
					local1903 = Static215.method3428(arg3, arg7, arg9);
					if (local1903 != 0L) {
						local1234 = Static170.method2683(Integer.MAX_VALUE & (int) (local1903 >>> 32)).anInt1338 / 2;
					}
					@Pc(2251) int local2251 = arg1 + 2 & 0x3;
					@Pc(2295) Class12 local2295;
					if (local320 == -1 && local58.anIntArray142 == null && !local58.aBoolean98) {
						@Pc(2303) int local2303 = Static79.anIntArray166[arg1] * 8;
						@Pc(2309) int local2309 = Static65.anIntArray135[arg1] * 8;
						@Pc(2325) Class154 local2325 = local58.method1091(local199, 4, local146, arg1 + 4, arg4, local329, null, local173, local189, local181);
						if (Static178.aBoolean216 && local329) {
							Static64.method972(local2325.aClass59_Sub2_4, local181 - local2303, local191, local189 - local2309);
						}
						local1973 = local2325.aClass12_9;
						local2325 = local58.method1091(local199, 4, local146, local2251 + 4, arg4, local329, null, local173, local189, local181);
						if (Static178.aBoolean216 && local329) {
							Static64.method972(local2325.aClass59_Sub2_4, local181 - local2303, local191, local189 - local2309);
						}
						local2295 = local2325.aClass12_9;
					} else {
						local1973 = new Class12_Sub6(arg8, 4, arg1 + 4, arg5, arg7, arg9, local320, local58.aBoolean112, null);
						local2295 = new Class12_Sub6(arg8, 4, local2251 + 4, arg5, arg7, arg9, local320, local58.aBoolean112, null);
					}
					Static254.method3832(arg3, arg7, arg9, local173, local1973, local2295, 256, arg1, Static79.anIntArray166[arg1] * local1234, local1234 * Static65.anIntArray135[arg1], local264);
				}
			}
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method3456(@OriginalArg(0) String arg0) {
		Static90.aString56 = arg0;
		if (Static87.aClass164_2.anApplet1 == null) {
			return;
		}
		try {
			@Pc(15) String local15 = Static87.aClass164_2.anApplet1.getParameter("cookieprefix");
			@Pc(20) String local20 = Static87.aClass164_2.anApplet1.getParameter("cookiehost");
			@Pc(35) String local35 = local15 + "settings=" + arg0 + "; version=1; path=/; domain=" + local20;
			if (arg0.length() == 0) {
				local35 = local35 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local35 = local35 + "; Expires=" + Static248.method3756(Static133.method2163() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static301.method122(Static87.aClass164_2.anApplet1, "document.cookie=\"" + local35 + "\"");
		} catch (@Pc(90) Throwable local90) {
		}
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(B)V")
	public static void method3457() {
		anIntArray385 = null;
		anIntArray386 = null;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(III)Lclient!v;")
	public static Class173 method3459(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class4_Sub11 local7 = Static127.aClass4_Sub11ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(13) int local13 = 0; local13 < local7.anInt1054; local13++) {
			@Pc(22) Class173 local22 = local7.aClass173Array1[local13];
			if ((local22.aLong183 >> 29 & 0x3L) == 2L && local22.anInt5149 == arg1 && local22.anInt5157 == arg2) {
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!bi", name = "e", descriptor = "(II)I")
	public static int method3465(@OriginalArg(1) int arg0) {
		if (arg0 > 0) {
			return 1;
		} else if (arg0 < 0) {
			return -1;
		} else {
			return 0;
		}
	}
}
