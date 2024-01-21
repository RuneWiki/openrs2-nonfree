import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!u", name = "kb", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!u", name = "ub", descriptor = "Lclient!ke;")
	public static Class41_Sub1 aClass41_Sub1_19;

	@OriginalMember(owner = "client!u", name = "vb", descriptor = "I")
	public static int anInt2503;

	@OriginalMember(owner = "client!u", name = "Z", descriptor = "I")
	public static int anInt2495 = -1;

	@OriginalMember(owner = "client!u", name = "cb", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1601 = Static69.method1153(" Sekunde(Xn(Y -Ubertragen)3");

	@OriginalMember(owner = "client!u", name = "db", descriptor = "I")
	public static int anInt2497 = -1;

	@OriginalMember(owner = "client!u", name = "eb", descriptor = "I")
	public static int anInt2498 = 0;

	@OriginalMember(owner = "client!u", name = "ib", descriptor = "Lclient!rd;")
	private static Class64 aClass64_1605 = Static69.method1153("Too many incorrect logins from your address)3");

	@OriginalMember(owner = "client!u", name = "fb", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1602 = aClass64_1605;

	@OriginalMember(owner = "client!u", name = "gb", descriptor = "Lclient!rd;")
	private static Class64 aClass64_1603 = Static69.method1153("Members object");

	@OriginalMember(owner = "client!u", name = "hb", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1604 = Static69.method1153("welle:");

	@OriginalMember(owner = "client!u", name = "jb", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1606 = aClass64_1603;

	@OriginalMember(owner = "client!u", name = "wb", descriptor = "Lclient!rd;")
	private static Class64 aClass64_1611 = Static69.method1153("Loaded interfaces");

	@OriginalMember(owner = "client!u", name = "mb", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1607 = aClass64_1611;

	@OriginalMember(owner = "client!u", name = "qb", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1608 = Static69.method1153("@gr1@");

	@OriginalMember(owner = "client!u", name = "sb", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1609 = Static69.method1153("Welt");

	@OriginalMember(owner = "client!u", name = "tb", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1610 = Static69.method1153("@whi@");

	@OriginalMember(owner = "client!u", name = "c", descriptor = "(B)V")
	public static void method1738() {
		aClass64_1611 = null;
		aClass64_1602 = null;
		aClass64_1608 = null;
		aByteArrayArrayArray6 = null;
		aClass64_1610 = null;
		aClass64_1601 = null;
		aClass64_1609 = null;
		aClass64_1605 = null;
		aClass64_1607 = null;
		aClass64_1604 = null;
		aClass41_Sub1_19 = null;
		aClass64_1603 = null;
		aClass64_1606 = null;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IZ)Lclient!hc;")
	public static Class1_Sub1_Sub6 method1739(@OriginalArg(0) int arg0) {
		@Pc(15) Class1_Sub1_Sub6 local15 = (Class1_Sub1_Sub6) Static27.aClass19_34.method410((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static98.aClass41_55.method1062(10, arg0);
		local15 = new Class1_Sub1_Sub6();
		local15.anInt960 = arg0;
		if (local25 != null) {
			local15.method717(new Class1_Sub6(local25));
		}
		local15.method723();
		if (local15.anInt967 != -1) {
			local15.method716(method1739(local15.anInt967), method1739(local15.anInt975));
		}
		if (!Static73.aBoolean92 && local15.aBoolean62) {
			local15.aClass64Array11 = null;
			local15.aClass64Array10 = null;
			local15.aClass64_646 = aClass64_1606;
			local15.anInt981 = 0;
		}
		Static27.aClass19_34.method409(local15, (long) arg0);
		return local15;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!ke;IIBIBZ)V")
	public static void method1740(@OriginalArg(0) Class41_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte arg4, @OriginalArg(6) boolean arg5) {
		@Pc(11) long local11 = (long) ((arg3 << 16) + arg1);
		@Pc(17) Class1_Sub1_Sub16 local17 = (Class1_Sub1_Sub16) Static110.aClass58_7.method1380(local11);
		if (local17 != null) {
			return;
		}
		local17 = (Class1_Sub1_Sub16) Static93.aClass58_6.method1380(local11);
		if (local17 != null) {
			return;
		}
		local17 = (Class1_Sub1_Sub16) Static58.aClass58_3.method1380(local11);
		if (local17 == null) {
			if (!arg5) {
				local17 = (Class1_Sub1_Sub16) Static89.aClass58_5.method1380(local11);
				if (local17 != null) {
					return;
				}
			}
			local17 = new Class1_Sub1_Sub16();
			local17.aByte4 = arg4;
			local17.anInt2501 = arg2;
			local17.aClass41_Sub1_18 = arg0;
			if (arg5) {
				Static110.aClass58_7.method1378(local11, local17);
				Static121.anInt2873++;
			} else {
				Static52.aClass10_33.method265(local17);
				Static58.aClass58_3.method1378(local11, local17);
				Static75.anInt1766++;
			}
		} else if (arg5) {
			local17.method2079();
			Static110.aClass58_7.method1378(local11, local17);
			Static121.anInt2873++;
			Static75.anInt1766--;
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(BLclient!f;)V")
	public static void method1741(@OriginalArg(1) Class1_Sub1_Sub2_Sub1 arg0) {
		arg0.anInt2396 = arg0.anInt2361;
		if (arg0.anInt2410 == 0) {
			arg0.anInt2371 = 0;
			return;
		}
		if (arg0.anInt2407 != -1 && arg0.anInt2368 == 0) {
			@Pc(35) Class1_Sub1_Sub4 local35 = Static10.method254(arg0.anInt2407);
			if (arg0.anInt2400 > 0 && local35.anInt716 == 0) {
				arg0.anInt2371++;
				return;
			}
			if (arg0.anInt2400 <= 0 && local35.anInt700 == 0) {
				arg0.anInt2371++;
				return;
			}
		}
		@Pc(76) int local76 = arg0.anInt2395 * 64 + arg0.anIntArray354[arg0.anInt2410 - 1] * 128;
		@Pc(79) int local79 = arg0.anInt2412;
		@Pc(82) int local82 = arg0.anInt2375;
		@Pc(98) int local98 = arg0.anIntArray355[arg0.anInt2410 - 1] * 128 + arg0.anInt2395 * 64;
		if (local76 - local82 > 256 || local76 - local82 < -256 || local98 - local79 > 256 || local98 - local79 < -256) {
			arg0.anInt2412 = local98;
			arg0.anInt2375 = local76;
			return;
		}
		if (local76 <= local82) {
			if (local76 >= local82) {
				if (local79 < local98) {
					arg0.anInt2386 = 1024;
				} else if (local98 < local79) {
					arg0.anInt2386 = 0;
				}
			} else if (local79 < local98) {
				arg0.anInt2386 = 768;
			} else if (local98 < local79) {
				arg0.anInt2386 = 256;
			} else {
				arg0.anInt2386 = 512;
			}
		} else if (local98 > local79) {
			arg0.anInt2386 = 1280;
		} else if (local79 > local98) {
			arg0.anInt2386 = 1792;
		} else {
			arg0.anInt2386 = 1536;
		}
		@Pc(215) int local215 = arg0.anInt2386 - arg0.anInt2363 & 0x7FF;
		if (local215 > 1024) {
			local215 -= 2048;
		}
		@Pc(223) int local223 = 4;
		@Pc(233) boolean local233 = true;
		@Pc(236) int local236 = arg0.anInt2398;
		if (local215 >= -256 && local215 <= 256) {
			local236 = arg0.anInt2360;
		} else if (local215 >= 256 && local215 < 768) {
			local236 = arg0.anInt2378;
		} else if (local215 >= -768 && local215 <= -256) {
			local236 = arg0.anInt2390;
		}
		if (local236 == -1) {
			local236 = arg0.anInt2360;
		}
		arg0.anInt2396 = local236;
		if (arg0 instanceof Class1_Sub1_Sub2_Sub1_Sub1) {
			local233 = ((Class1_Sub1_Sub2_Sub1_Sub1) arg0).aClass1_Sub1_Sub15_1.aBoolean139;
		}
		if (local233) {
			if (arg0.anInt2386 != arg0.anInt2363 && arg0.anInt2372 == -1 && arg0.anInt2383 != 0) {
				local223 = 2;
			}
			if (arg0.anInt2410 > 2) {
				local223 = 6;
			}
			if (arg0.anInt2410 > 3) {
				local223 = 8;
			}
			if (arg0.anInt2371 > 0 && arg0.anInt2410 > 1) {
				arg0.anInt2371--;
				local223 = 8;
			}
		} else {
			if (arg0.anInt2410 > 1) {
				local223 = 6;
			}
			if (arg0.anInt2410 > 2) {
				local223 = 8;
			}
			if (arg0.anInt2371 > 0 && arg0.anInt2410 > 1) {
				local223 = 8;
				arg0.anInt2371--;
			}
		}
		if (arg0.aBooleanArray11[arg0.anInt2410 - 1]) {
			local223 <<= 0x1;
		}
		if (local82 < local76) {
			arg0.anInt2375 += local223;
			if (arg0.anInt2375 > local76) {
				arg0.anInt2375 = local76;
			}
		} else if (local82 > local76) {
			arg0.anInt2375 -= local223;
			if (arg0.anInt2375 < local76) {
				arg0.anInt2375 = local76;
			}
		}
		if (local98 > local79) {
			arg0.anInt2412 += local223;
			if (arg0.anInt2412 > local98) {
				arg0.anInt2412 = local98;
			}
		} else if (local98 < local79) {
			arg0.anInt2412 -= local223;
			if (arg0.anInt2412 < local98) {
				arg0.anInt2412 = local98;
			}
		}
		if (local76 == arg0.anInt2375 && local98 == arg0.anInt2412) {
			arg0.anInt2410--;
			if (arg0.anInt2400 > 0) {
				arg0.anInt2400--;
			}
		}
		if (local223 >= 8 && arg0.anInt2360 == arg0.anInt2396 && arg0.anInt2409 != -1) {
			arg0.anInt2396 = arg0.anInt2409;
		}
	}

	@OriginalMember(owner = "client!u", name = "f", descriptor = "(I)V")
	public static void method1742() {
		for (@Pc(10) Class1_Sub1_Sub2_Sub6 local10 = (Class1_Sub1_Sub2_Sub6) Static46.aClass50_5.method1151(); local10 != null; local10 = (Class1_Sub1_Sub2_Sub6) Static46.aClass50_5.method1141()) {
			if (local10.anInt2468 != Static15.anInt463 || local10.aBoolean151) {
				local10.method2076();
			} else if (Static15.anInt471 >= local10.anInt2466) {
				local10.method1722(Static113.anInt1815);
				if (local10.aBoolean151) {
					local10.method2076();
				} else {
					Static82.aClass68_1.method1765(local10.anInt2468, local10.anInt2470, local10.anInt2465, local10.anInt2463, 60, local10, 0, -1, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!u", name = "g", descriptor = "(I)V")
	public static void method1743() {
		Static21.method412();
		Static14.method290();
		Static16.method304();
		Static19.method395();
		Static18.method361();
		Static121.method2105();
		Static50.method909();
		Static42.method699();
		Static105.method1720();
		Static20.method400();
		Static66.method1126();
		Static23.method454();
		((Class71) Static112.anInterface2_1).method2095();
		Static31.aClass19_28.method416();
		Static92.aClass41_Sub1_14.method1057();
		Static39.aClass41_Sub1_8.method1057();
		Static38.aClass41_Sub1_7.method1057();
		Static10.aClass41_Sub1_1.method1057();
		Static81.aClass41_Sub1_11.method1057();
		Static114.aClass41_Sub1_21.method1057();
		Static94.aClass41_Sub1_15.method1057();
		Static85.aClass41_Sub1_22.method1057();
		Static25.aClass41_Sub1_23.method1057();
		aClass41_Sub1_19.method1057();
		Static44.aClass41_Sub1_9.method1057();
		Static21.aClass41_Sub1_2.method1057();
	}
}
