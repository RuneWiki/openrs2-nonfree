import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!dd", name = "e", descriptor = "I")
	public static int anInt723 = 0;

	@OriginalMember(owner = "client!dd", name = "g", descriptor = "Lclient!r;")
	private static Class61 aClass61_218 = Static129.method2060("flash3:");

	@OriginalMember(owner = "client!dd", name = "f", descriptor = "Lclient!r;")
	public static Class61 aClass61_217 = aClass61_218;

	@OriginalMember(owner = "client!dd", name = "i", descriptor = "I")
	public static int anInt725 = 0;

	@OriginalMember(owner = "client!dd", name = "j", descriptor = "Lclient!r;")
	public static Class61 aClass61_219 = aClass61_218;

	@OriginalMember(owner = "client!dd", name = "l", descriptor = "Lclient!r;")
	public static Class61 aClass61_220 = Static129.method2060("k");

	@OriginalMember(owner = "client!dd", name = "m", descriptor = "[I")
	public static int[] anIntArray126 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILclient!wa;ILclient!sc;IIIIB)V")
	public static void method500(@OriginalArg(0) int arg0, @OriginalArg(1) Class81 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class66 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (Static61.aBoolean57 && (Static30.aByteArrayArrayArray2[0][arg6][arg0] & 0x2) == 0) {
			if ((Static30.aByteArrayArrayArray2[arg2][arg6][arg0] & 0x10) != 0) {
				return;
			}
			if (Static28.method619(arg2, arg6, arg0) != Static55.anInt1403) {
				return;
			}
		}
		if (Static36.anInt1012 > arg2) {
			Static36.anInt1012 = arg2;
		}
		@Pc(50) Class5_Sub2_Sub16 local50 = Static43.method767(arg5);
		@Pc(64) int local64;
		@Pc(61) int local61;
		if (arg4 == 1 || arg4 == 3) {
			local64 = local50.anInt3126;
			local61 = local50.anInt3120;
		} else {
			local61 = local50.anInt3126;
			local64 = local50.anInt3120;
		}
		@Pc(95) int local95;
		@Pc(88) int local88;
		if (arg6 + local64 <= 104) {
			local88 = (local64 + 1 >> 1) + arg6;
			local95 = arg6 + (local64 >> 1);
		} else {
			local95 = arg6;
			local88 = arg6 + 1;
		}
		@Pc(110) int local110;
		@Pc(114) int local114;
		if (local61 + arg0 > 104) {
			local110 = arg0;
			local114 = arg0 + 1;
		} else {
			local110 = (local61 >> 1) + arg0;
			local114 = (local61 + 1 >> 1) + arg0;
		}
		@Pc(134) int[][] local134 = Static65.anIntArrayArrayArray3[arg2];
		@Pc(160) int local160 = local134[local88][local114] + local134[local95][local114] + local134[local95][local110] + local134[local88][local110] >> 2;
		@Pc(169) int local169 = (arg6 << 7) + (local64 << 6);
		@Pc(177) int local177 = (arg0 << 7) + (local61 << 6);
		@Pc(189) int local189 = (arg0 << 7) + arg6 + (arg5 << 14) + 1073741824;
		if (local50.anInt3137 == 0) {
			local189 += Integer.MIN_VALUE;
		}
		@Pc(205) int local205 = arg7 + (arg4 << 6);
		if (local50.anInt3131 == 1) {
			local205 += 256;
		}
		if (local50.method1959()) {
			Static41.method1520(arg6, local50, arg4, arg0, arg2);
		}
		@Pc(254) Class5_Sub2_Sub2 local254;
		if (arg7 != 22) {
			@Pc(359) int local359;
			if (arg7 == 10 || arg7 == 11) {
				if (local50.anInt3147 == -1 && local50.anIntArray377 == null) {
					local254 = local50.method1971(local169, local177, 10, arg4, local160, local134);
				} else {
					local254 = new Class5_Sub2_Sub2_Sub7(arg5, 10, arg4, arg2, arg6, arg0, local50.anInt3147, true, null);
				}
				if (local254 != null && arg1.method2099(arg2, arg6, arg0, local160, local64, local61, local254, arg7 == 11 ? 256 : 0, local189, local205) && local50.aBoolean115) {
					local359 = 15;
					if (local254 instanceof Class5_Sub2_Sub2_Sub6) {
						local359 = ((Class5_Sub2_Sub2_Sub6) local254).method2149() / 4;
						if (local359 > 30) {
							local359 = 30;
						}
					}
					for (@Pc(375) int local375 = 0; local375 <= local64; local375++) {
						for (@Pc(379) int local379 = 0; local379 <= local61; local379++) {
							if (Static20.aByteArrayArrayArray1[arg2][local375 + arg6][arg0 + local379] < local359) {
								Static20.aByteArrayArrayArray1[arg2][local375 + arg6][local379 + arg0] = (byte) local359;
							}
						}
					}
				}
				if (local50.anInt3133 != 0 && arg3 != null) {
					arg3.method1804(arg0, local61, local64, arg6, local50.aBoolean111);
				}
			} else if (arg7 >= 12) {
				if (local50.anInt3147 == -1 && local50.anIntArray377 == null) {
					local254 = local50.method1971(local169, local177, arg7, arg4, local160, local134);
				} else {
					local254 = new Class5_Sub2_Sub2_Sub7(arg5, arg7, arg4, arg2, arg6, arg0, local50.anInt3147, true, null);
				}
				arg1.method2099(arg2, arg6, arg0, local160, 1, 1, local254, 0, local189, local205);
				if (arg7 >= 12 && arg7 <= 17 && arg7 != 13 && arg2 > 0) {
					Static61.anIntArrayArrayArray2[arg2][arg6][arg0] |= 0x924;
				}
				if (local50.anInt3133 != 0 && arg3 != null) {
					arg3.method1804(arg0, local61, local64, arg6, local50.aBoolean111);
				}
			} else if (arg7 == 0) {
				if (local50.anInt3147 == -1 && local50.anIntArray377 == null) {
					local254 = local50.method1971(local169, local177, 0, arg4, local160, local134);
				} else {
					local254 = new Class5_Sub2_Sub2_Sub7(arg5, 0, arg4, arg2, arg6, arg0, local50.anInt3147, true, null);
				}
				arg1.method2101(arg2, arg6, arg0, local160, local254, null, Static114.anIntArray351[arg4], 0, local189, local205);
				if (arg4 == 0) {
					if (local50.aBoolean115) {
						Static20.aByteArrayArrayArray1[arg2][arg6][arg0] = 50;
						Static20.aByteArrayArrayArray1[arg2][arg6][arg0 + 1] = 50;
					}
					if (local50.aBoolean109) {
						Static61.anIntArrayArrayArray2[arg2][arg6][arg0] |= 0x249;
					}
				} else if (arg4 == 1) {
					if (local50.aBoolean115) {
						Static20.aByteArrayArrayArray1[arg2][arg6][arg0 + 1] = 50;
						Static20.aByteArrayArrayArray1[arg2][arg6 + 1][arg0 + 1] = 50;
					}
					if (local50.aBoolean109) {
						Static61.anIntArrayArrayArray2[arg2][arg6][arg0 + 1] |= 0x492;
					}
				} else if (arg4 == 2) {
					if (local50.aBoolean115) {
						Static20.aByteArrayArrayArray1[arg2][arg6 + 1][arg0] = 50;
						Static20.aByteArrayArrayArray1[arg2][arg6 + 1][arg0 + 1] = 50;
					}
					if (local50.aBoolean109) {
						Static61.anIntArrayArrayArray2[arg2][arg6 + 1][arg0] |= 0x249;
					}
				} else if (arg4 == 3) {
					if (local50.aBoolean115) {
						Static20.aByteArrayArrayArray1[arg2][arg6][arg0] = 50;
						Static20.aByteArrayArrayArray1[arg2][arg6 + 1][arg0] = 50;
					}
					if (local50.aBoolean109) {
						Static61.anIntArrayArrayArray2[arg2][arg6][arg0] |= 0x492;
					}
				}
				if (local50.anInt3133 != 0 && arg3 != null) {
					arg3.method1796(arg6, local50.aBoolean111, arg4, arg0, arg7);
				}
				if (local50.anInt3146 != 16) {
					arg1.method2117(arg2, arg6, arg0, local50.anInt3146);
				}
			} else if (arg7 == 1) {
				if (local50.anInt3147 == -1 && local50.anIntArray377 == null) {
					local254 = local50.method1971(local169, local177, 1, arg4, local160, local134);
				} else {
					local254 = new Class5_Sub2_Sub2_Sub7(arg5, 1, arg4, arg2, arg6, arg0, local50.anInt3147, true, null);
				}
				arg1.method2101(arg2, arg6, arg0, local160, local254, null, anIntArray126[arg4], 0, local189, local205);
				if (local50.aBoolean115) {
					if (arg4 == 0) {
						Static20.aByteArrayArrayArray1[arg2][arg6][arg0 + 1] = 50;
					} else if (arg4 == 1) {
						Static20.aByteArrayArrayArray1[arg2][arg6 + 1][arg0 + 1] = 50;
					} else if (arg4 == 2) {
						Static20.aByteArrayArrayArray1[arg2][arg6 + 1][arg0] = 50;
					} else if (arg4 == 3) {
						Static20.aByteArrayArrayArray1[arg2][arg6][arg0] = 50;
					}
				}
				if (local50.anInt3133 != 0 && arg3 != null) {
					arg3.method1796(arg6, local50.aBoolean111, arg4, arg0, arg7);
				}
			} else {
				@Pc(958) int local958;
				@Pc(996) Class5_Sub2_Sub2 local996;
				if (arg7 == 2) {
					local958 = arg4 + 1 & 0x3;
					@Pc(982) Class5_Sub2_Sub2 local982;
					if (local50.anInt3147 == -1 && local50.anIntArray377 == null) {
						local982 = local50.method1971(local169, local177, 2, arg4 + 4, local160, local134);
						local996 = local50.method1971(local169, local177, 2, local958, local160, local134);
					} else {
						local982 = new Class5_Sub2_Sub2_Sub7(arg5, 2, arg4 + 4, arg2, arg6, arg0, local50.anInt3147, true, null);
						local996 = new Class5_Sub2_Sub2_Sub7(arg5, 2, local958, arg2, arg6, arg0, local50.anInt3147, true, null);
					}
					arg1.method2101(arg2, arg6, arg0, local160, local982, local996, Static114.anIntArray351[arg4], Static114.anIntArray351[local958], local189, local205);
					if (local50.aBoolean109) {
						if (arg4 == 0) {
							Static61.anIntArrayArrayArray2[arg2][arg6][arg0] |= 0x249;
							Static61.anIntArrayArrayArray2[arg2][arg6][arg0 + 1] |= 0x492;
						} else if (arg4 == 1) {
							Static61.anIntArrayArrayArray2[arg2][arg6][arg0 + 1] |= 0x492;
							Static61.anIntArrayArrayArray2[arg2][arg6 + 1][arg0] |= 0x249;
						} else if (arg4 == 2) {
							Static61.anIntArrayArrayArray2[arg2][arg6 + 1][arg0] |= 0x249;
							Static61.anIntArrayArrayArray2[arg2][arg6][arg0] |= 0x492;
						} else if (arg4 == 3) {
							Static61.anIntArrayArrayArray2[arg2][arg6][arg0] |= 0x492;
							Static61.anIntArrayArrayArray2[arg2][arg6][arg0] |= 0x249;
						}
					}
					if (local50.anInt3133 != 0 && arg3 != null) {
						arg3.method1796(arg6, local50.aBoolean111, arg4, arg0, arg7);
					}
					if (local50.anInt3146 != 16) {
						arg1.method2117(arg2, arg6, arg0, local50.anInt3146);
					}
				} else if (arg7 == 3) {
					if (local50.anInt3147 == -1 && local50.anIntArray377 == null) {
						local254 = local50.method1971(local169, local177, 3, arg4, local160, local134);
					} else {
						local254 = new Class5_Sub2_Sub2_Sub7(arg5, 3, arg4, arg2, arg6, arg0, local50.anInt3147, true, null);
					}
					arg1.method2101(arg2, arg6, arg0, local160, local254, null, anIntArray126[arg4], 0, local189, local205);
					if (local50.aBoolean115) {
						if (arg4 == 0) {
							Static20.aByteArrayArrayArray1[arg2][arg6][arg0 + 1] = 50;
						} else if (arg4 == 1) {
							Static20.aByteArrayArrayArray1[arg2][arg6 + 1][arg0 + 1] = 50;
						} else if (arg4 == 2) {
							Static20.aByteArrayArrayArray1[arg2][arg6 + 1][arg0] = 50;
						} else if (arg4 == 3) {
							Static20.aByteArrayArrayArray1[arg2][arg6][arg0] = 50;
						}
					}
					if (local50.anInt3133 != 0 && arg3 != null) {
						arg3.method1796(arg6, local50.aBoolean111, arg4, arg0, arg7);
					}
				} else if (arg7 == 9) {
					if (local50.anInt3147 == -1 && local50.anIntArray377 == null) {
						local254 = local50.method1971(local169, local177, arg7, arg4, local160, local134);
					} else {
						local254 = new Class5_Sub2_Sub2_Sub7(arg5, arg7, arg4, arg2, arg6, arg0, local50.anInt3147, true, null);
					}
					arg1.method2099(arg2, arg6, arg0, local160, 1, 1, local254, 0, local189, local205);
					if (local50.anInt3133 != 0 && arg3 != null) {
						arg3.method1804(arg0, local61, local64, arg6, local50.aBoolean111);
					}
					if (local50.anInt3146 != 16) {
						arg1.method2117(arg2, arg6, arg0, local50.anInt3146);
					}
				} else if (arg7 == 4) {
					if (local50.anInt3147 == -1 && local50.anIntArray377 == null) {
						local254 = local50.method1971(local169, local177, 4, arg4, local160, local134);
					} else {
						local254 = new Class5_Sub2_Sub2_Sub7(arg5, 4, arg4, arg2, arg6, arg0, local50.anInt3147, true, null);
					}
					arg1.method2103(arg2, arg6, arg0, local160, local254, null, Static114.anIntArray351[arg4], 0, 0, 0, local189, local205);
				} else if (arg7 == 5) {
					local958 = 16;
					local359 = arg1.method2093(arg2, arg6, arg0);
					if (local359 != 0) {
						local958 = Static43.method767(local359 >> 14 & 0x7FFF).anInt3146;
					}
					if (local50.anInt3147 == -1 && local50.anIntArray377 == null) {
						local996 = local50.method1971(local169, local177, 4, arg4, local160, local134);
					} else {
						local996 = new Class5_Sub2_Sub2_Sub7(arg5, 4, arg4, arg2, arg6, arg0, local50.anInt3147, true, null);
					}
					arg1.method2103(arg2, arg6, arg0, local160, local996, null, Static114.anIntArray351[arg4], 0, local958 * Static99.anIntArray326[arg4], local958 * Static98.anIntArray325[arg4], local189, local205);
				} else if (arg7 == 6) {
					local359 = arg1.method2093(arg2, arg6, arg0);
					local958 = 8;
					if (local359 != 0) {
						local958 = Static43.method767(local359 >> 14 & 0x7FFF).anInt3146 / 2;
					}
					if (local50.anInt3147 == -1 && local50.anIntArray377 == null) {
						local996 = local50.method1971(local169, local177, 4, arg4 + 4, local160, local134);
					} else {
						local996 = new Class5_Sub2_Sub2_Sub7(arg5, 4, arg4 + 4, arg2, arg6, arg0, local50.anInt3147, true, null);
					}
					arg1.method2103(arg2, arg6, arg0, local160, local996, null, 256, arg4, local958 * Static29.anIntArray150[arg4], local958 * Static77.anIntArray272[arg4], local189, local205);
				} else if (arg7 == 7) {
					local359 = arg4 + 2 & 0x3;
					if (local50.anInt3147 == -1 && local50.anIntArray377 == null) {
						local254 = local50.method1971(local169, local177, 4, local359 + 4, local160, local134);
					} else {
						local254 = new Class5_Sub2_Sub2_Sub7(arg5, 4, local359 + 4, arg2, arg6, arg0, local50.anInt3147, true, null);
					}
					arg1.method2103(arg2, arg6, arg0, local160, local254, null, 256, local359, 0, 0, local189, local205);
				} else if (arg7 == 8) {
					local958 = 8;
					local359 = arg1.method2093(arg2, arg6, arg0);
					if (local359 != 0) {
						local958 = Static43.method767(local359 >> 14 & 0x7FFF).anInt3146 / 2;
					}
					@Pc(1759) int local1759 = arg4 + 2 & 0x3;
					@Pc(1790) Class5_Sub2_Sub2 local1790;
					if (local50.anInt3147 == -1 && local50.anIntArray377 == null) {
						local996 = local50.method1971(local169, local177, 4, arg4 + 4, local160, local134);
						local1790 = local50.method1971(local169, local177, 4, local1759 + 4, local160, local134);
					} else {
						local996 = new Class5_Sub2_Sub2_Sub7(arg5, 4, arg4 + 4, arg2, arg6, arg0, local50.anInt3147, true, null);
						local1790 = new Class5_Sub2_Sub2_Sub7(arg5, 4, local1759 + 4, arg2, arg6, arg0, local50.anInt3147, true, null);
					}
					arg1.method2103(arg2, arg6, arg0, local160, local996, local1790, 256, arg4, Static29.anIntArray150[arg4] * local958, Static77.anIntArray272[arg4] * local958, local189, local205);
				}
			}
		} else if (!Static61.aBoolean57 || local50.anInt3137 != 0 || local50.anInt3133 == 1 || local50.aBoolean110) {
			if (local50.anInt3147 == -1 && local50.anIntArray377 == null) {
				local254 = local50.method1971(local169, local177, 22, arg4, local160, local134);
			} else {
				local254 = new Class5_Sub2_Sub2_Sub7(arg5, 22, arg4, arg2, arg6, arg0, local50.anInt3147, true, null);
			}
			arg1.method2079(arg2, arg6, arg0, local160, local254, local189, local205);
			if (local50.anInt3133 == 1 && arg3 != null) {
				arg3.method1795(arg6, arg0);
			}
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "([BIBI)Lclient!r;")
	public static Class61 method501(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class61 local7 = new Class61();
		local7.anInt2675 = 0;
		local7.aByteArray38 = new byte[arg1];
		for (@Pc(24) int local24 = arg2; local24 < arg2 + arg1; local24++) {
			if (arg0[local24] != 0) {
				local7.aByteArray38[local7.anInt2675++] = arg0[local24];
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILclient!ff;IB)[Lclient!vd;")
	public static Class5_Sub2_Sub1_Sub4[] method502(@OriginalArg(0) int arg0, @OriginalArg(1) Class26 arg1, @OriginalArg(2) int arg2) {
		return Static8.method174(arg2, arg1, arg0) ? Static86.method1530() : null;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lclient!r;Lclient!r;Lclient!r;Z)V")
	public static void method503(@OriginalArg(0) Class61 arg0, @OriginalArg(1) Class61 arg1, @OriginalArg(2) Class61 arg2) {
		Static112.aClass61_883 = arg1;
		Static112.aClass61_885 = arg2;
		Static112.aClass61_884 = arg0;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V")
	public static void method504() {
		aClass61_217 = null;
		aClass61_219 = null;
		aClass61_218 = null;
		aClass61_220 = null;
		anIntArray126 = null;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(BLclient!ke;)V")
	public static void method505(@OriginalArg(1) Class5_Sub11 arg0) {
		if (Static123.anInt3069 == arg0.anInt1637) {
			Static48.aBooleanArray5[arg0.anInt1638] = true;
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(BLclient!pa;)V")
	public static void method506(@OriginalArg(1) Class5_Sub14 arg0) {
		@Pc(13) byte[] local13 = new byte[24];
		if (Static82.aClass8_5 != null) {
			@Pc(25) int local25;
			try {
				Static82.aClass8_5.method166(0L);
				Static82.aClass8_5.method162(local13);
				for (local25 = 0; local25 < 24 && local13[local25] == 0; local25++) {
				}
				if (local25 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(48) Exception local48) {
				for (local25 = 0; local25 < 24; local25++) {
					local13[local25] = -1;
				}
			}
		}
		arg0.method1484(24, local13);
	}
}
