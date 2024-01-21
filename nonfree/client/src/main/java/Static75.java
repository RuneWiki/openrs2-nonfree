import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!id", name = "B", descriptor = "Lclient!pf;")
	public static Class1_Sub1_Sub1_Sub3 aClass1_Sub1_Sub1_Sub3_2;

	@OriginalMember(owner = "client!id", name = "v", descriptor = "I")
	public static int anInt2275 = 0;

	@OriginalMember(owner = "client!id", name = "w", descriptor = "I")
	public static int anInt2276 = 0;

	@OriginalMember(owner = "client!id", name = "x", descriptor = "Lclient!rf;")
	public static Class70 aClass70_733 = Static49.method1293("Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie");

	@OriginalMember(owner = "client!id", name = "z", descriptor = "Lclient!rf;")
	public static Class70 aClass70_734 = Static49.method1293(")3runescape)3com");

	@OriginalMember(owner = "client!id", name = "A", descriptor = "Lclient!rf;")
	public static Class70 aClass70_735 = Static49.method1293("und Ihr Passwort ein)3");

	@OriginalMember(owner = "client!id", name = "J", descriptor = "Lclient!rf;")
	private static Class70 aClass70_737 = Static49.method1293("Loaded config");

	@OriginalMember(owner = "client!id", name = "G", descriptor = "Lclient!rf;")
	public static Class70 aClass70_736 = aClass70_737;

	@OriginalMember(owner = "client!id", name = "H", descriptor = "I")
	public static int anInt2280 = 1;

	@OriginalMember(owner = "client!id", name = "K", descriptor = "[I")
	public static int[] anIntArray216 = new int[5];

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IBIIIIILclient!oa;)V")
	public static void method1677(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class59 arg6) {
		if (Static79.aBoolean91 && (Static20.aByteArrayArrayArray1[0][arg5][arg4] & 0x2) == 0) {
			if ((Static20.aByteArrayArrayArray1[arg2][arg5][arg4] & 0x10) != 0) {
				return;
			}
			if (Static144.method2838(arg5, arg2, arg4) != Static164.anInt4265) {
				return;
			}
		}
		if (Static122.anInt3337 > arg2) {
			Static122.anInt3337 = arg2;
		}
		@Pc(57) Class1_Sub1_Sub7 local57 = Static176.method3433(arg1);
		@Pc(69) int local69;
		@Pc(66) int local66;
		if (arg3 == 1 || arg3 == 3) {
			local66 = local57.anInt1818;
			local69 = local57.anInt1813;
		} else {
			local69 = local57.anInt1818;
			local66 = local57.anInt1813;
		}
		@Pc(91) int local91;
		@Pc(100) int local100;
		if (local69 + arg5 <= 104) {
			local91 = arg5 + (local69 >> 1);
			local100 = arg5 + (local69 + 1 >> 1);
		} else {
			local91 = arg5;
			local100 = arg5 + 1;
		}
		@Pc(112) int[][] local112 = Static142.anIntArrayArrayArray8[arg2];
		@Pc(121) int local121;
		@Pc(125) int local125;
		if (arg4 + local66 > 104) {
			local121 = arg4;
			local125 = arg4 + 1;
		} else {
			local125 = (local66 + 1 >> 1) + arg4;
			local121 = arg4 + (local66 >> 1);
		}
		@Pc(168) int local168 = local112[local91][local125] + local112[local100][local121] + local112[local91][local121] + local112[local100][local125] >> 2;
		@Pc(177) int local177 = (arg4 << 7) + (local66 << 6);
		@Pc(194) long local194 = (long) (arg3 << 20 | arg4 << 7 | arg5 | arg0 << 14 | 0x40000000);
		if (local57.anInt1809 == 0) {
			local194 |= Long.MIN_VALUE;
		}
		@Pc(212) int local212 = (local69 << 6) + (arg5 << 7);
		if (local57.anInt1843 == 1) {
			local194 |= 0x400000L;
		}
		local194 |= (long) arg1 << 32;
		if (local57.method1405()) {
			Static156.method3141(arg3, arg2, arg5, arg4, local57);
		}
		@Pc(279) Class1_Sub1_Sub4 local279;
		if (arg0 != 22) {
			@Pc(380) int local380;
			if (arg0 == 10 || arg0 == 11) {
				if (local57.anInt1832 == -1 && local57.anIntArray186 == null) {
					local279 = local57.method1401(local212, local177, local168, 10, local112, arg3);
				} else {
					local279 = new Class1_Sub1_Sub4_Sub4(arg1, 10, arg3, arg2, arg5, arg4, local57.anInt1832, true, null);
				}
				if (local279 != null && Static5.method187(arg2, arg5, arg4, local168, local69, local66, local279, arg0 == 11 ? 256 : 0, local194) && local57.aBoolean69) {
					local380 = 15;
					if (local279 instanceof Class1_Sub1_Sub4_Sub1) {
						local380 = ((Class1_Sub1_Sub4_Sub1) local279).method734() / 4;
						if (local380 > 30) {
							local380 = 30;
						}
					}
					for (@Pc(396) int local396 = 0; local396 <= local69; local396++) {
						for (@Pc(400) int local400 = 0; local400 <= local66; local400++) {
							if (local380 > Static65.aByteArrayArrayArray5[arg2][local396 + arg5][arg4 + local400]) {
								Static65.aByteArrayArrayArray5[arg2][local396 + arg5][arg4 + local400] = (byte) local380;
							}
						}
					}
				}
				if (local57.anInt1842 != 0 && arg6 != null) {
					arg6.method2469(local57.aBoolean67, arg5, arg4, local69, local66);
				}
			} else if (arg0 >= 12) {
				if (local57.anInt1832 == -1 && local57.anIntArray186 == null) {
					local279 = local57.method1401(local212, local177, local168, arg0, local112, arg3);
				} else {
					local279 = new Class1_Sub1_Sub4_Sub4(arg1, arg0, arg3, arg2, arg5, arg4, local57.anInt1832, true, null);
				}
				Static5.method187(arg2, arg5, arg4, local168, 1, 1, local279, 0, local194);
				if (arg0 >= 12 && arg0 <= 17 && arg0 != 13 && arg2 > 0) {
					Static39.anIntArrayArrayArray3[arg2][arg5][arg4] |= 0x924;
				}
				if (local57.anInt1842 != 0 && arg6 != null) {
					arg6.method2469(local57.aBoolean67, arg5, arg4, local69, local66);
				}
			} else if (arg0 == 0) {
				if (local57.anInt1832 == -1 && local57.anIntArray186 == null) {
					local279 = local57.method1401(local212, local177, local168, 0, local112, arg3);
				} else {
					local279 = new Class1_Sub1_Sub4_Sub4(arg1, 0, arg3, arg2, arg5, arg4, local57.anInt1832, true, null);
				}
				Static53.method1334(arg2, arg5, arg4, local168, local279, null, Static61.anIntArray191[arg3], 0, local194);
				if (arg3 == 0) {
					if (local57.aBoolean69) {
						Static65.aByteArrayArrayArray5[arg2][arg5][arg4] = 50;
						Static65.aByteArrayArrayArray5[arg2][arg5][arg4 + 1] = 50;
					}
					if (local57.aBoolean65) {
						Static39.anIntArrayArrayArray3[arg2][arg5][arg4] |= 0x249;
					}
				} else if (arg3 == 1) {
					if (local57.aBoolean69) {
						Static65.aByteArrayArrayArray5[arg2][arg5][arg4 + 1] = 50;
						Static65.aByteArrayArrayArray5[arg2][arg5 + 1][arg4 + 1] = 50;
					}
					if (local57.aBoolean65) {
						Static39.anIntArrayArrayArray3[arg2][arg5][arg4 + 1] |= 0x492;
					}
				} else if (arg3 == 2) {
					if (local57.aBoolean69) {
						Static65.aByteArrayArrayArray5[arg2][arg5 + 1][arg4] = 50;
						Static65.aByteArrayArrayArray5[arg2][arg5 + 1][arg4 + 1] = 50;
					}
					if (local57.aBoolean65) {
						Static39.anIntArrayArrayArray3[arg2][arg5 + 1][arg4] |= 0x249;
					}
				} else if (arg3 == 3) {
					if (local57.aBoolean69) {
						Static65.aByteArrayArrayArray5[arg2][arg5][arg4] = 50;
						Static65.aByteArrayArrayArray5[arg2][arg5 + 1][arg4] = 50;
					}
					if (local57.aBoolean65) {
						Static39.anIntArrayArrayArray3[arg2][arg5][arg4] |= 0x492;
					}
				}
				if (local57.anInt1842 != 0 && arg6 != null) {
					arg6.method2479(arg0, arg3, arg4, local57.aBoolean67, arg5);
				}
				if (local57.anInt1806 != 16) {
					Static63.method1489(arg2, arg5, arg4, local57.anInt1806);
				}
			} else if (arg0 == 1) {
				if (local57.anInt1832 == -1 && local57.anIntArray186 == null) {
					local279 = local57.method1401(local212, local177, local168, 1, local112, arg3);
				} else {
					local279 = new Class1_Sub1_Sub4_Sub4(arg1, 1, arg3, arg2, arg5, arg4, local57.anInt1832, true, null);
				}
				Static53.method1334(arg2, arg5, arg4, local168, local279, null, Static69.anIntArray205[arg3], 0, local194);
				if (local57.aBoolean69) {
					if (arg3 == 0) {
						Static65.aByteArrayArrayArray5[arg2][arg5][arg4 + 1] = 50;
					} else if (arg3 == 1) {
						Static65.aByteArrayArrayArray5[arg2][arg5 + 1][arg4 + 1] = 50;
					} else if (arg3 == 2) {
						Static65.aByteArrayArrayArray5[arg2][arg5 + 1][arg4] = 50;
					} else if (arg3 == 3) {
						Static65.aByteArrayArrayArray5[arg2][arg5][arg4] = 50;
					}
				}
				if (local57.anInt1842 != 0 && arg6 != null) {
					arg6.method2479(arg0, arg3, arg4, local57.aBoolean67, arg5);
				}
			} else {
				@Pc(973) int local973;
				if (arg0 == 2) {
					local973 = arg3 + 1 & 0x3;
					@Pc(1010) Class1_Sub1_Sub4 local1010;
					@Pc(996) Class1_Sub1_Sub4 local996;
					if (local57.anInt1832 == -1 && local57.anIntArray186 == null) {
						local996 = local57.method1401(local212, local177, local168, 2, local112, arg3 + 4);
						local1010 = local57.method1401(local212, local177, local168, 2, local112, local973);
					} else {
						local996 = new Class1_Sub1_Sub4_Sub4(arg1, 2, arg3 + 4, arg2, arg5, arg4, local57.anInt1832, true, null);
						local1010 = new Class1_Sub1_Sub4_Sub4(arg1, 2, local973, arg2, arg5, arg4, local57.anInt1832, true, null);
					}
					Static53.method1334(arg2, arg5, arg4, local168, local996, local1010, Static61.anIntArray191[arg3], Static61.anIntArray191[local973], local194);
					if (local57.aBoolean65) {
						if (arg3 == 0) {
							Static39.anIntArrayArrayArray3[arg2][arg5][arg4] |= 0x249;
							Static39.anIntArrayArrayArray3[arg2][arg5][arg4 + 1] |= 0x492;
						} else if (arg3 == 1) {
							Static39.anIntArrayArrayArray3[arg2][arg5][arg4 + 1] |= 0x492;
							Static39.anIntArrayArrayArray3[arg2][arg5 + 1][arg4] |= 0x249;
						} else if (arg3 == 2) {
							Static39.anIntArrayArrayArray3[arg2][arg5 + 1][arg4] |= 0x249;
							Static39.anIntArrayArrayArray3[arg2][arg5][arg4] |= 0x492;
						} else if (arg3 == 3) {
							Static39.anIntArrayArrayArray3[arg2][arg5][arg4] |= 0x492;
							Static39.anIntArrayArrayArray3[arg2][arg5][arg4] |= 0x249;
						}
					}
					if (local57.anInt1842 != 0 && arg6 != null) {
						arg6.method2479(arg0, arg3, arg4, local57.aBoolean67, arg5);
					}
					if (local57.anInt1806 != 16) {
						Static63.method1489(arg2, arg5, arg4, local57.anInt1806);
					}
				} else if (arg0 == 3) {
					if (local57.anInt1832 == -1 && local57.anIntArray186 == null) {
						local279 = local57.method1401(local212, local177, local168, 3, local112, arg3);
					} else {
						local279 = new Class1_Sub1_Sub4_Sub4(arg1, 3, arg3, arg2, arg5, arg4, local57.anInt1832, true, null);
					}
					Static53.method1334(arg2, arg5, arg4, local168, local279, null, Static69.anIntArray205[arg3], 0, local194);
					if (local57.aBoolean69) {
						if (arg3 == 0) {
							Static65.aByteArrayArrayArray5[arg2][arg5][arg4 + 1] = 50;
						} else if (arg3 == 1) {
							Static65.aByteArrayArrayArray5[arg2][arg5 + 1][arg4 + 1] = 50;
						} else if (arg3 == 2) {
							Static65.aByteArrayArrayArray5[arg2][arg5 + 1][arg4] = 50;
						} else if (arg3 == 3) {
							Static65.aByteArrayArrayArray5[arg2][arg5][arg4] = 50;
						}
					}
					if (local57.anInt1842 != 0 && arg6 != null) {
						arg6.method2479(arg0, arg3, arg4, local57.aBoolean67, arg5);
					}
				} else if (arg0 == 9) {
					if (local57.anInt1832 == -1 && local57.anIntArray186 == null) {
						local279 = local57.method1401(local212, local177, local168, arg0, local112, arg3);
					} else {
						local279 = new Class1_Sub1_Sub4_Sub4(arg1, arg0, arg3, arg2, arg5, arg4, local57.anInt1832, true, null);
					}
					Static5.method187(arg2, arg5, arg4, local168, 1, 1, local279, 0, local194);
					if (local57.anInt1842 != 0 && arg6 != null) {
						arg6.method2469(local57.aBoolean67, arg5, arg4, local69, local66);
					}
					if (local57.anInt1806 != 16) {
						Static63.method1489(arg2, arg5, arg4, local57.anInt1806);
					}
				} else if (arg0 == 4) {
					if (local57.anInt1832 == -1 && local57.anIntArray186 == null) {
						local279 = local57.method1401(local212, local177, local168, 4, local112, arg3);
					} else {
						local279 = new Class1_Sub1_Sub4_Sub4(arg1, 4, arg3, arg2, arg5, arg4, local57.anInt1832, true, null);
					}
					Static31.method791(arg2, arg5, arg4, local168, local279, null, Static61.anIntArray191[arg3], 0, 0, 0, local194);
				} else {
					@Pc(1515) long local1515;
					@Pc(1551) Class1_Sub1_Sub4 local1551;
					if (arg0 == 5) {
						local973 = 16;
						local1515 = Static5.method186(arg2, arg5, arg4);
						if (local1515 != 0L) {
							local973 = Static176.method3433(Integer.MAX_VALUE & (int) (local1515 >>> 32)).anInt1806;
						}
						if (local57.anInt1832 == -1 && local57.anIntArray186 == null) {
							local1551 = local57.method1401(local212, local177, local168, 4, local112, arg3);
						} else {
							local1551 = new Class1_Sub1_Sub4_Sub4(arg1, 4, arg3, arg2, arg5, arg4, local57.anInt1832, true, null);
						}
						Static31.method791(arg2, arg5, arg4, local168, local1551, null, Static61.anIntArray191[arg3], 0, Static172.anIntArray422[arg3] * local973, Static42.anIntArray133[arg3] * local973, local194);
					} else if (arg0 == 6) {
						local973 = 8;
						local1515 = Static5.method186(arg2, arg5, arg4);
						if (local1515 != 0L) {
							local973 = Static176.method3433((int) (local1515 >>> 32) & Integer.MAX_VALUE).anInt1806 / 2;
						}
						if (local57.anInt1832 == -1 && local57.anIntArray186 == null) {
							local1551 = local57.method1401(local212, local177, local168, 4, local112, arg3 + 4);
						} else {
							local1551 = new Class1_Sub1_Sub4_Sub4(arg1, 4, arg3 + 4, arg2, arg5, arg4, local57.anInt1832, true, null);
						}
						Static31.method791(arg2, arg5, arg4, local168, local1551, null, 256, arg3, local973 * Static44.anIntArray150[arg3], Static165.anIntArray409[arg3] * local973, local194);
					} else if (arg0 == 7) {
						local380 = arg3 + 2 & 0x3;
						if (local57.anInt1832 == -1 && local57.anIntArray186 == null) {
							local279 = local57.method1401(local212, local177, local168, 4, local112, local380 + 4);
						} else {
							local279 = new Class1_Sub1_Sub4_Sub4(arg1, 4, local380 + 4, arg2, arg5, arg4, local57.anInt1832, true, null);
						}
						Static31.method791(arg2, arg5, arg4, local168, local279, null, 256, local380, 0, 0, local194);
					} else if (arg0 == 8) {
						local973 = 8;
						local1515 = Static5.method186(arg2, arg5, arg4);
						if (local1515 != 0L) {
							local973 = Static176.method3433((int) (local1515 >>> 32) & Integer.MAX_VALUE).anInt1806 / 2;
						}
						@Pc(1772) int local1772 = arg3 + 2 & 0x3;
						@Pc(1804) Class1_Sub1_Sub4 local1804;
						if (local57.anInt1832 == -1 && local57.anIntArray186 == null) {
							local1551 = local57.method1401(local212, local177, local168, 4, local112, arg3 + 4);
							local1804 = local57.method1401(local212, local177, local168, 4, local112, local1772 + 4);
						} else {
							local1551 = new Class1_Sub1_Sub4_Sub4(arg1, 4, arg3 + 4, arg2, arg5, arg4, local57.anInt1832, true, null);
							local1804 = new Class1_Sub1_Sub4_Sub4(arg1, 4, local1772 + 4, arg2, arg5, arg4, local57.anInt1832, true, null);
						}
						Static31.method791(arg2, arg5, arg4, local168, local1551, local1804, 256, arg3, Static44.anIntArray150[arg3] * local973, local973 * Static165.anIntArray409[arg3], local194);
					}
				}
			}
		} else if (!Static79.aBoolean91 || local57.anInt1809 != 0 || local57.anInt1842 == 1 || local57.aBoolean64) {
			if (local57.anInt1832 == -1 && local57.anIntArray186 == null) {
				local279 = local57.method1401(local212, local177, local168, 22, local112, arg3);
			} else {
				local279 = new Class1_Sub1_Sub4_Sub4(arg1, 22, arg3, arg2, arg5, arg4, local57.anInt1832, true, null);
			}
			Static154.method3109(arg2, arg5, arg4, local168, local279, local194);
			if (local57.anInt1842 == 1 && arg6 != null) {
				arg6.method2475(arg4, arg5);
			}
		}
	}

	@OriginalMember(owner = "client!id", name = "d", descriptor = "(I)V")
	public static void method1678() {
		@Pc(21) int local21;
		for (@Pc(12) int local12 = -1; local12 < Static104.anInt2960; local12++) {
			if (local12 == -1) {
				local21 = 2047;
			} else {
				local21 = Static26.anIntArray46[local12];
			}
			@Pc(29) Class1_Sub1_Sub4_Sub2_Sub1 local29 = Static113.aClass1_Sub1_Sub4_Sub2_Sub1Array1[local21];
			if (local29 != null && local29.anInt1995 > 0) {
				local29.anInt1995--;
				if (local29.anInt1995 == 0) {
					local29.aClass70_631 = null;
				}
			}
		}
		for (local21 = 0; local21 < Static86.anInt2582; local21++) {
			@Pc(68) int local68 = Static152.anIntArray208[local21];
			@Pc(72) Class1_Sub1_Sub4_Sub2_Sub2 local72 = Static165.aClass1_Sub1_Sub4_Sub2_Sub2Array1[local68];
			if (local72 != null && local72.anInt1995 > 0) {
				local72.anInt1995--;
				if (local72.anInt1995 == 0) {
					local72.aClass70_631 = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!id", name = "c", descriptor = "(B)V")
	public static void method1679() {
		Static74.aClass25_12.method1300();
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IILclient!u;)Z")
	public static boolean method1680(@OriginalArg(0) int arg0, @OriginalArg(2) Class76 arg1) {
		@Pc(8) byte[] local8 = arg1.method3327(arg0);
		if (local8 == null) {
			return false;
		} else {
			Static92.method1989(local8);
			return true;
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(ILclient!u;II)[Lclient!pf;")
	public static Class1_Sub1_Sub1_Sub3[] method1681(@OriginalArg(0) int arg0, @OriginalArg(1) Class76 arg1, @OriginalArg(2) int arg2) {
		return Static95.method2048(arg2, arg1, arg0) ? Static33.method846() : null;
	}

	@OriginalMember(owner = "client!id", name = "e", descriptor = "(I)V")
	public static void method1682() {
		aClass70_737 = null;
		aClass1_Sub1_Sub1_Sub3_2 = null;
		aClass70_736 = null;
		aClass70_733 = null;
		aClass70_734 = null;
		anIntArray216 = null;
		aClass70_735 = null;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!u;BLclient!u;Lclient!u;Lclient!u;)V")
	public static void method1683(@OriginalArg(0) Class76 arg0, @OriginalArg(2) Class76 arg1, @OriginalArg(3) Class76 arg2, @OriginalArg(4) Class76 arg3) {
		Static144.aClass76_113 = arg3;
		Static60.aClass76_53 = arg1;
		Static37.aClass76_34 = arg2;
		Static118.aClass76_96 = arg0;
		Static77.aClass39ArrayArray1 = new Class39[Static144.aClass76_113.method3326()][];
		Static126.aBooleanArray5 = new boolean[Static144.aClass76_113.method3326()];
	}
}
