import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!me", name = "U", descriptor = "[[B")
	public static byte[][] aByteArrayArray7;

	@OriginalMember(owner = "client!me", name = "bb", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_955 = Static151.method2243("glow1:");

	@OriginalMember(owner = "client!me", name = "Y", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_954 = aClass62_955;

	@OriginalMember(owner = "client!me", name = "cb", descriptor = "I")
	public static int anInt2718 = 0;

	@OriginalMember(owner = "client!me", name = "db", descriptor = "[I")
	public static final int[] anIntArray244 = new int[2000];

	@OriginalMember(owner = "client!me", name = "gb", descriptor = "Lclient!mb;")
	public static Class62 aClass62_956 = aClass62_955;

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IIIIIB)V")
	public static void method1920(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(10) long local10 = Static77.method2472(arg3, arg4, arg0);
		@Pc(28) int local28;
		@Pc(21) int local21;
		@Pc(30) int local30;
		@Pc(60) int local60;
		@Pc(47) int local47;
		if (local10 != 0L) {
			local21 = (int) local10 >> 14 & 0x1F;
			local28 = (int) local10 >> 20 & 0x3;
			local30 = arg1;
			if (local10 > 0L) {
				local30 = arg2;
			}
			@Pc(40) int[] local40 = Static212.anIntArray398;
			local47 = Integer.MAX_VALUE & (int) (local10 >>> 32);
			local60 = (103 - arg0) * 2048 + arg4 * 4 + 24624;
			@Pc(64) Class2_Sub1_Sub11 local64 = Static60.method844(local47);
			if (local64.anInt1563 == -1) {
				if (local21 == 0 || local21 == 2) {
					if (local28 == 0) {
						local40[local60] = local30;
						local40[local60 + 512] = local30;
						local40[local60 + 1024] = local30;
						local40[local60 + 1536] = local30;
					} else if (local28 == 1) {
						local40[local60] = local30;
						local40[local60 + 1] = local30;
						local40[local60 + 2] = local30;
						local40[local60 + 3] = local30;
					} else if (local28 == 2) {
						local40[local60 + 3] = local30;
						local40[local60 + 3 + 512] = local30;
						local40[local60 + 3 + 1024] = local30;
						local40[local60 + 1536 + 3] = local30;
					} else if (local28 == 3) {
						local40[local60 + 1536] = local30;
						local40[local60 + 1536 + 1] = local30;
						local40[local60 + 2 + 1536] = local30;
						local40[local60 + 1536 + 3] = local30;
					}
				}
				if (local21 == 3) {
					if (local28 == 0) {
						local40[local60] = local30;
					} else if (local28 == 1) {
						local40[local60 + 3] = local30;
					} else if (local28 == 2) {
						local40[local60 + 1536 + 3] = local30;
					} else if (local28 == 3) {
						local40[local60 + 1536] = local30;
					}
				}
				if (local21 == 2) {
					if (local28 == 3) {
						local40[local60] = local30;
						local40[local60 + 512] = local30;
						local40[local60 + 1024] = local30;
						local40[local60 + 1536] = local30;
					} else if (local28 == 0) {
						local40[local60] = local30;
						local40[local60 + 1] = local30;
						local40[local60 + 2] = local30;
						local40[local60 + 3] = local30;
					} else if (local28 == 1) {
						local40[local60 + 3] = local30;
						local40[local60 + 512 + 3] = local30;
						local40[local60 + 1024 + 3] = local30;
						local40[local60 + 1536 + 3] = local30;
					} else if (local28 == 2) {
						local40[local60 + 1536] = local30;
						local40[local60 + 1537] = local30;
						local40[local60 + 2 + 1536] = local30;
						local40[local60 + 1536 + 3] = local30;
					}
				}
			} else {
				@Pc(383) Class42_Sub1 local383 = Static16.aClass42_Sub1Array1[local64.anInt1563];
				if (local383 != null) {
					@Pc(396) int local396 = (local64.anInt1559 * 4 - local383.anInt3591) / 2;
					@Pc(407) int local407 = (local64.anInt1556 * 4 - local383.anInt3594) / 2;
					local383.method2468(local407 + arg4 * 4 + 48, local396 + (-local64.anInt1559 + 104 - arg0) * 4 + 48);
				}
			}
		}
		local10 = Static47.method728(arg3, arg4, arg0);
		if (local10 != 0L) {
			local28 = (int) local10 >> 20 & 0x3;
			local21 = (int) local10 >> 14 & 0x1F;
			local30 = Integer.MAX_VALUE & (int) (local10 >>> 32);
			@Pc(467) Class2_Sub1_Sub11 local467 = Static60.method844(local30);
			@Pc(500) int local500;
			if (local467.anInt1563 != -1) {
				@Pc(476) Class42_Sub1 local476 = Static16.aClass42_Sub1Array1[local467.anInt1563];
				if (local476 != null) {
					local47 = (local467.anInt1556 * 4 - local476.anInt3594) / 2;
					local500 = (local467.anInt1559 * 4 - local476.anInt3591) / 2;
					local476.method2468(local47 + arg4 * 4 + 48, local500 + (-arg0 + 104 - local467.anInt1559) * 4 + 48);
				}
			} else if (local21 == 9) {
				local60 = 15658734;
				if (local10 > 0L) {
					local60 = 15597568;
				}
				@Pc(542) int[] local542 = Static212.anIntArray398;
				local500 = arg4 * 4 + (-(arg0 * 512) + 52736) * 4 + 24624;
				if (local28 == 0 || local28 == 2) {
					local542[local500 + 1536] = local60;
					local542[local500 + 1 + 1024] = local60;
					local542[local500 + 514] = local60;
					local542[local500 + 3] = local60;
				} else {
					local542[local500] = local60;
					local542[local500 + 512 + 1] = local60;
					local542[local500 + 1024 + 2] = local60;
					local542[local500 + 1536 + 3] = local60;
				}
			}
		}
		local10 = Static59.method819(arg3, arg4, arg0);
		if (local10 == 0L) {
			return;
		}
		local28 = Integer.MAX_VALUE & (int) (local10 >>> 32);
		@Pc(645) Class2_Sub1_Sub11 local645 = Static60.method844(local28);
		if (local645.anInt1563 == -1) {
			return;
		}
		@Pc(655) Class42_Sub1 local655 = Static16.aClass42_Sub1Array1[local645.anInt1563];
		if (local655 != null) {
			local60 = (local645.anInt1559 * 4 - local655.anInt3591) / 2;
			@Pc(678) int local678 = (local645.anInt1556 * 4 - local655.anInt3594) / 2;
			local655.method2468(local678 + arg4 * 4 + 48, (-arg0 + 104 - local645.anInt1559) * 4 + 48 + local60);
			return;
		}
	}

	@OriginalMember(owner = "client!me", name = "c", descriptor = "(B)V")
	public static void method1921() {
		Static165.method2410(Static13.aClass47_2);
		Static123.anInt4488++;
		if (Static83.aBoolean81 && Static90.aBoolean5) {
			@Pc(24) int local24 = Static163.anInt3446;
			@Pc(27) int local27 = Static13.aClass47_2.anInt1882;
			local24 -= Static56.anInt1141;
			if (Static121.anInt2679 > local24) {
				local24 = Static121.anInt2679;
			}
			if (Static13.aClass47_2.anInt1910 + local24 > Static121.anInt2679 - -Static35.aClass47_4.anInt1910) {
				local24 = Static121.anInt2679 + Static35.aClass47_4.anInt1910 - Static13.aClass47_2.anInt1910;
			}
			@Pc(56) int local56 = Static32.anInt773;
			@Pc(64) int local64 = Static35.aClass47_4.anInt1891 + local24 - Static121.anInt2679;
			local56 -= Static203.anInt4218;
			@Pc(73) int local73 = local24 - Static42.anInt4281;
			if (Static23.anInt557 > local56) {
				local56 = Static23.anInt557;
			}
			if (local56 + Static13.aClass47_2.anInt1858 > Static23.anInt557 + Static35.aClass47_4.anInt1858) {
				local56 = Static23.anInt557 + Static35.aClass47_4.anInt1858 - Static13.aClass47_2.anInt1858;
			}
			@Pc(100) int local100 = local56 - Static136.anInt4499;
			if (Static123.anInt4488 > Static13.aClass47_2.anInt1871 && (local73 > local27 || -local27 > local73 || local27 < local100 || -local27 > local100)) {
				Static169.aBoolean155 = true;
			}
			@Pc(137) int local137 = Static35.aClass47_4.anInt1836 + local56 - Static23.anInt557;
			@Pc(146) Class2_Sub13 local146;
			if (Static13.aClass47_2.anObjectArray4 != null && Static169.aBoolean155) {
				local146 = new Class2_Sub13();
				local146.anInt2444 = local64;
				local146.anObjectArray27 = Static13.aClass47_2.anObjectArray4;
				local146.aClass47_12 = Static13.aClass47_2;
				local146.anInt2446 = local137;
				Static140.method2145(local146);
			}
			if (Static55.anInt1137 == 0) {
				if (Static169.aBoolean155) {
					if (Static13.aClass47_2.anObjectArray19 != null) {
						local146 = new Class2_Sub13();
						local146.anInt2444 = local64;
						local146.aClass47_11 = Static68.aClass47_5;
						local146.anInt2446 = local137;
						local146.aClass47_12 = Static13.aClass47_2;
						local146.anObjectArray27 = Static13.aClass47_2.anObjectArray19;
						Static140.method2145(local146);
					}
					if (Static68.aClass47_5 != null && Static131.method1029(Static13.aClass47_2) != null) {
						Static58.aClass2_Sub11_Sub1_2.method1595(112);
						Static58.aClass2_Sub11_Sub1_2.method1533(Static68.aClass47_5.anInt1860);
						Static58.aClass2_Sub11_Sub1_2.method1543(Static13.aClass47_2.anInt1886);
						Static58.aClass2_Sub11_Sub1_2.method1544(Static68.aClass47_5.anInt1886);
						Static58.aClass2_Sub11_Sub1_2.method1578(Static13.aClass47_2.anInt1860);
					}
				} else if ((Static13.anInt329 == 1 || Static92.method1393(Static51.anInt1111 - 1)) && Static51.anInt1111 > 2) {
					Static104.method1631();
				} else if (Static51.anInt1111 > 0) {
					Static22.method398(Static51.anInt1111 - 1);
				}
				Static13.aClass47_2 = null;
			}
		} else if (Static123.anInt4488 > 1) {
			Static13.aClass47_2 = null;
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IIBIIII)V")
	public static void method1922(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		@Pc(11) int local11 = 0;
		@Pc(13) Class32[] local13 = Static181.aClass32Array1;
		while (local13.length > local11) {
			@Pc(19) Class32 local19 = local13[local11];
			if (local19 != null && local19.anInt1118 == 2) {
				Static42.method3003(local19.anInt1119 + (local19.anInt1117 - Static153.anInt3278 << 7), arg3 >> 1, (local19.anInt1116 - Static116.anInt2535 << 7) + local19.anInt1125, local19.anInt1123 * 2, arg0 >> 1);
				if (Static154.anInt3305 > -1 && Static25.anInt581 % 20 < 10) {
					Static15.aClass2_Sub1_Sub2Array2[local19.anInt1126].method280(arg2 + Static154.anInt3305 - 12, arg1 + -28 - -Static22.anInt515);
				}
			}
			local11++;
		}
	}

	@OriginalMember(owner = "client!me", name = "c", descriptor = "(II)I")
	public static int method1923(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(BI)I")
	public static int method1924(@OriginalArg(1) int arg0) {
		@Pc(1) int local1 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			local1 += 16;
			arg0 >>>= 0x10;
		}
		if (arg0 >= 256) {
			local1 += 8;
			arg0 >>>= 0x8;
		}
		if (arg0 >= 16) {
			arg0 >>>= 0x4;
			local1 += 4;
		}
		if (arg0 >= 4) {
			local1 += 2;
			arg0 >>>= 0x2;
		}
		if (arg0 >= 1) {
			arg0 >>>= 0x1;
			local1++;
		}
		return arg0 + local1;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IIII)I")
	public static int method1926(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 > 243) {
			arg2 >>= 0x4;
		} else if (arg1 > 217) {
			arg2 >>= 0x3;
		} else if (arg1 > 192) {
			arg2 >>= 0x2;
		} else if (arg1 > 179) {
			arg2 >>= 0x1;
		}
		return (arg0 >> 2 << 10) - (-(arg2 >> 5 << 7) - (arg1 >> 1));
	}
}
