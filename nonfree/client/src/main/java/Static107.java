import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!mh", name = "u", descriptor = "I")
	public static int anInt2616;

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "I")
	public static int anInt2606 = 0;

	@OriginalMember(owner = "client!mh", name = "e", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1540 = method1838(":");

	@OriginalMember(owner = "client!mh", name = "t", descriptor = "Lclient!gg;")
	private static Class28 aClass28_1544 = method1838("World");

	@OriginalMember(owner = "client!mh", name = "f", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1541 = aClass28_1544;

	@OriginalMember(owner = "client!mh", name = "g", descriptor = "I")
	public static int anInt2609 = 10;

	@OriginalMember(owner = "client!mh", name = "h", descriptor = "[Lclient!ka;")
	public static Class2_Sub4_Sub1_Sub5[] aClass2_Sub4_Sub1_Sub5Array1 = new Class2_Sub4_Sub1_Sub5[4];

	@OriginalMember(owner = "client!mh", name = "l", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1542 = method1838("Sichtbare Karte vorbereitet)3");

	@OriginalMember(owner = "client!mh", name = "s", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1543 = aClass28_1544;

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(I)V")
	public static void method1836() {
		aClass28_1540 = null;
		aClass28_1542 = null;
		aClass2_Sub4_Sub1_Sub5Array1 = null;
		aClass28_1544 = null;
		aClass28_1543 = null;
		aClass28_1541 = null;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(III)J")
	public static long method1837(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub14 local7 = Static133.aClass2_Sub14ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return 0L;
		}
		for (@Pc(13) int local13 = 0; local13 < local7.anInt2269; local13++) {
			@Pc(19) Class43 local19 = local7.aClass43Array56[local13];
			if ((local19.aLong83 >> 29 & 0x3L) == 2L && local19.anInt2326 == arg1 && local19.anInt2322 == arg2) {
				return local19.aLong83;
			}
		}
		return 0L;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(ILjava/lang/String;)Lclient!gg;")
	public static Class28 method1838(@OriginalArg(1) String arg0) {
		@Pc(6) byte[] local6 = arg0.getBytes();
		@Pc(9) int local9 = local6.length;
		@Pc(18) Class28 local18 = new Class28();
		@Pc(20) int local20 = 0;
		local18.aByteArray14 = new byte[local9];
		while (local20 < local9) {
			@Pc(32) int local32 = local6[local20++] & 0xFF;
			if (local32 <= 45 && local32 >= 40) {
				if (local9 <= local20) {
					break;
				}
				@Pc(71) int local71 = local6[local20++] & 0xFF;
				local18.aByteArray14[local18.anInt1718++] = (byte) (local32 * 43 + local71 - 1720 - 48);
			} else if (local32 != 0) {
				local18.aByteArray14[local18.anInt1718++] = (byte) local32;
			}
		}
		local18.method1113();
		return local18.method1127();
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(BI)V")
	public static void method1839(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return;
		}
		@Pc(10) int local10 = Static133.anIntArray281[arg0];
		@Pc(14) int local14 = Static176.aShortArray41[arg0];
		@Pc(18) int local18 = Static148.anIntArray315[arg0];
		if (local14 >= 2000) {
			local14 -= 2000;
		}
		@Pc(27) int local27 = (int) Static10.aLongArray2[arg0];
		@Pc(31) long local31 = Static10.aLongArray2[arg0];
		@Pc(40) Class2_Sub4_Sub1_Sub1_Sub1 local40;
		if (local14 == 48) {
			local40 = Static55.aClass2_Sub4_Sub1_Sub1_Sub1Array1[local27];
			if (local40 != null) {
				Static146.method2284(0, Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anIntArray139[0], 0, 1, 1, 2, local40.anIntArray139[0], Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anIntArray142[0], local40.anIntArray142[0], false, 0);
				Static164.anInt3646 = 0;
				Static33.anInt945 = Static101.anInt449;
				Static6.anInt366 = 2;
				Static49.anInt1287 = Static130.anInt3042;
				Static128.aClass2_Sub2_Sub1_2.method1711(236);
				Static128.aClass2_Sub2_Sub1_2.method1681(local27);
			}
		}
		@Pc(127) int local127;
		@Pc(107) Class24 local107;
		if (local14 == 40) {
			Static128.aClass2_Sub2_Sub1_2.method1711(64);
			Static128.aClass2_Sub2_Sub1_2.method1710(local18);
			local107 = Static58.method1035(local18);
			if (local107.anIntArrayArray6 != null && local107.anIntArrayArray6[0][0] == 5) {
				local127 = local107.anIntArrayArray6[0][1];
				if (Static24.anIntArray52[local127] != local107.anIntArray124[0]) {
					Static24.anIntArray52[local127] = local107.anIntArray124[0];
					Static10.method318(local127);
				}
			}
		}
		if (local14 == 6) {
			Static139.method2186();
		}
		if (local14 == 8) {
			local40 = Static55.aClass2_Sub4_Sub1_Sub1_Sub1Array1[local27];
			if (local40 != null) {
				Static146.method2284(0, Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anIntArray139[0], 0, 1, 1, 2, local40.anIntArray139[0], Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anIntArray142[0], local40.anIntArray142[0], false, 0);
				Static164.anInt3646 = 0;
				Static6.anInt366 = 2;
				Static33.anInt945 = Static101.anInt449;
				Static49.anInt1287 = Static130.anInt3042;
				Static128.aClass2_Sub2_Sub1_2.method1711(213);
				Static128.aClass2_Sub2_Sub1_2.method1681(local27);
			}
		}
		if (local14 == 41) {
			Static128.aClass2_Sub2_Sub1_2.method1711(35);
			Static128.aClass2_Sub2_Sub1_2.method1696(local10);
			Static128.aClass2_Sub2_Sub1_2.method1696(local27);
			Static128.aClass2_Sub2_Sub1_2.method1656(local18);
			Static104.anInt2592 = 0;
			Static146.aClass24_10 = Static58.method1035(local18);
			Static95.anInt2368 = local10;
		}
		if (local14 == 23) {
			Static128.aClass2_Sub2_Sub1_2.method1711(95);
			Static128.aClass2_Sub2_Sub1_2.method1696(local10);
			Static128.aClass2_Sub2_Sub1_2.method1658(local27);
			Static128.aClass2_Sub2_Sub1_2.method1678(local18);
			Static104.anInt2592 = 0;
			Static146.aClass24_10 = Static58.method1035(local18);
			Static95.anInt2368 = local10;
		}
		if (local14 == 4) {
			Static136.method2143(local18, local31, local10);
			Static128.aClass2_Sub2_Sub1_2.method1711(122);
			Static128.aClass2_Sub2_Sub1_2.method1658(Integer.MAX_VALUE & (int) (local31 >>> 32));
			Static128.aClass2_Sub2_Sub1_2.method1688(local10 + Static3.anInt2434);
			Static128.aClass2_Sub2_Sub1_2.method1681(Static39.anInt1055 + local18);
		}
		if (local14 == 1007) {
			Static136.method2143(local18, local31, local10);
			Static128.aClass2_Sub2_Sub1_2.method1711(109);
			Static128.aClass2_Sub2_Sub1_2.method1696(Integer.MAX_VALUE & (int) (local31 >>> 32));
			Static128.aClass2_Sub2_Sub1_2.method1688(local10 + Static3.anInt2434);
			Static128.aClass2_Sub2_Sub1_2.method1681(Static39.anInt1055 + local18);
		}
		@Pc(384) boolean local384;
		if (local14 == 34) {
			local384 = Static146.method2284(0, Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anIntArray139[0], 0, 0, 0, 2, local10, Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anIntArray142[0], local18, false, 0);
			if (!local384) {
				Static146.method2284(0, Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anIntArray139[0], 0, 1, 1, 2, local10, Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anIntArray142[0], local18, false, 0);
			}
			Static33.anInt945 = Static101.anInt449;
			Static164.anInt3646 = 0;
			Static49.anInt1287 = Static130.anInt3042;
			Static6.anInt366 = 2;
			Static128.aClass2_Sub2_Sub1_2.method1711(131);
			Static128.aClass2_Sub2_Sub1_2.method1696(local18 + Static39.anInt1055);
			Static128.aClass2_Sub2_Sub1_2.method1688(local10 + Static3.anInt2434);
			Static128.aClass2_Sub2_Sub1_2.method1696(local27);
		}
		if (local14 == 32) {
			Static136.method2143(local18, local31, local10);
			Static128.aClass2_Sub2_Sub1_2.method1711(238);
			Static128.aClass2_Sub2_Sub1_2.method1658((int) (local31 >>> 32) & Integer.MAX_VALUE);
			Static128.aClass2_Sub2_Sub1_2.method1658(local18 + Static39.anInt1055);
			Static128.aClass2_Sub2_Sub1_2.method1696(local10 + Static3.anInt2434);
		}
		if (local14 == 20) {
			Static128.aClass2_Sub2_Sub1_2.method1711(83);
			Static128.aClass2_Sub2_Sub1_2.method1678(local18);
			Static128.aClass2_Sub2_Sub1_2.method1658(local10);
			Static128.aClass2_Sub2_Sub1_2.method1688(local27);
			Static104.anInt2592 = 0;
			Static146.aClass24_10 = Static58.method1035(local18);
			Static95.anInt2368 = local10;
		}
		if (local14 == 44) {
			local40 = Static55.aClass2_Sub4_Sub1_Sub1_Sub1Array1[local27];
			if (local40 != null) {
				Static146.method2284(0, Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anIntArray139[0], 0, 1, 1, 2, local40.anIntArray139[0], Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anIntArray142[0], local40.anIntArray142[0], false, 0);
				Static33.anInt945 = Static101.anInt449;
				Static164.anInt3646 = 0;
				Static6.anInt366 = 2;
				Static49.anInt1287 = Static130.anInt3042;
				Static128.aClass2_Sub2_Sub1_2.method1711(127);
				Static128.aClass2_Sub2_Sub1_2.method1658(local27);
			}
		}
		if (local14 == 7) {
			local40 = Static55.aClass2_Sub4_Sub1_Sub1_Sub1Array1[local27];
			if (local40 != null) {
				Static146.method2284(0, Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anIntArray139[0], 0, 1, 1, 2, local40.anIntArray139[0], Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anIntArray142[0], local40.anIntArray142[0], false, 0);
				Static164.anInt3646 = 0;
				Static33.anInt945 = Static101.anInt449;
				Static49.anInt1287 = Static130.anInt3042;
				Static6.anInt366 = 2;
				Static128.aClass2_Sub2_Sub1_2.method1711(216);
				Static128.aClass2_Sub2_Sub1_2.method1658(local27);
			}
		}
		if (local14 == 16 && Static177.aClass24_14 == null) {
			Static124.method2022(local18, local10);
			Static177.aClass24_14 = Static12.method360(local10, local18);
			Static104.method1828(Static177.aClass24_14);
		}
		if (local14 == 46) {
			Static128.aClass2_Sub2_Sub1_2.method1711(0);
			Static128.aClass2_Sub2_Sub1_2.method1687(local18);
			Static128.aClass2_Sub2_Sub1_2.method1688(local10);
			Static128.aClass2_Sub2_Sub1_2.method1688(local27);
			Static104.anInt2592 = 0;
			Static146.aClass24_10 = Static58.method1035(local18);
			Static95.anInt2368 = local10;
		}
		if (local14 == 13) {
			local40 = Static55.aClass2_Sub4_Sub1_Sub1_Sub1Array1[local27];
			if (local40 != null) {
				Static146.method2284(0, Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anIntArray139[0], 0, 1, 1, 2, local40.anIntArray139[0], Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anIntArray142[0], local40.anIntArray142[0], false, 0);
				Static164.anInt3646 = 0;
				Static49.anInt1287 = Static130.anInt3042;
				Static33.anInt945 = Static101.anInt449;
				Static6.anInt366 = 2;
				Static128.aClass2_Sub2_Sub1_2.method1711(172);
				Static128.aClass2_Sub2_Sub1_2.method1696(Static17.anInt654);
				Static128.aClass2_Sub2_Sub1_2.method1696(local27);
				Static128.aClass2_Sub2_Sub1_2.method1678(Static112.anInt2709);
				Static128.aClass2_Sub2_Sub1_2.method1681(Static84.anInt2127);
			}
		}
		if (local14 == 3) {
			local384 = Static146.method2284(0, Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anIntArray139[0], 0, 0, 0, 2, local10, Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anIntArray142[0], local18, false, 0);
			if (!local384) {
				Static146.method2284(0, Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anIntArray139[0], 0, 1, 1, 2, local10, Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anIntArray142[0], local18, false, 0);
			}
			Static164.anInt3646 = 0;
			Static49.anInt1287 = Static130.anInt3042;
			Static6.anInt366 = 2;
			Static33.anInt945 = Static101.anInt449;
			Static128.aClass2_Sub2_Sub1_2.method1711(2);
			Static128.aClass2_Sub2_Sub1_2.method1681(local27);
			Static128.aClass2_Sub2_Sub1_2.method1681(Static17.anInt654);
			Static128.aClass2_Sub2_Sub1_2.method1681(local18 + Static39.anInt1055);
			Static128.aClass2_Sub2_Sub1_2.method1696(Static3.anInt2434 + local10);
			Static128.aClass2_Sub2_Sub1_2.method1681(Static84.anInt2127);
			Static128.aClass2_Sub2_Sub1_2.method1656(Static112.anInt2709);
		}
		@Pc(844) Class2_Sub4_Sub1_Sub1_Sub2 local844;
		if (local14 == 42) {
			local844 = Static34.aClass2_Sub4_Sub1_Sub1_Sub2Array1[local27];
			if (local844 != null) {
				Static146.method2284(0, Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anIntArray139[0], 0, 1, 1, 2, local844.anIntArray139[0], Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anIntArray142[0], local844.anIntArray142[0], false, 0);
				Static33.anInt945 = Static101.anInt449;
				Static49.anInt1287 = Static130.anInt3042;
				Static164.anInt3646 = 0;
				Static6.anInt366 = 2;
				Static128.aClass2_Sub2_Sub1_2.method1711(34);
				Static128.aClass2_Sub2_Sub1_2.method1688(local27);
			}
		}
		if (local14 == 25) {
			Static128.aClass2_Sub2_Sub1_2.method1711(148);
			Static128.aClass2_Sub2_Sub1_2.method1696(local27);
			Static128.aClass2_Sub2_Sub1_2.method1658(local10);
			Static128.aClass2_Sub2_Sub1_2.method1656(local18);
			Static128.aClass2_Sub2_Sub1_2.method1658(Static84.anInt2127);
			Static128.aClass2_Sub2_Sub1_2.method1681(Static17.anInt654);
			Static128.aClass2_Sub2_Sub1_2.method1687(Static112.anInt2709);
			Static104.anInt2592 = 0;
			Static146.aClass24_10 = Static58.method1035(local18);
			Static95.anInt2368 = local10;
		}
		if (local14 == 9) {
			Static128.aClass2_Sub2_Sub1_2.method1711(134);
			Static128.aClass2_Sub2_Sub1_2.method1688(local27);
			Static128.aClass2_Sub2_Sub1_2.method1696(local10);
			Static128.aClass2_Sub2_Sub1_2.method1678(local18);
			Static104.anInt2592 = 0;
			Static146.aClass24_10 = Static58.method1035(local18);
			Static95.anInt2368 = local10;
		}
		if (local14 == 1002) {
			local107 = Static58.method1035(local18);
			if (local107 == null || local107.anIntArray119[local10] < 100000) {
				Static128.aClass2_Sub2_Sub1_2.method1711(194);
				Static128.aClass2_Sub2_Sub1_2.method1658(local27);
			} else {
				Static93.method1632(0, Static136.aClass28_1828, Static83.method1481(new Class28[] { Static158.method2411(local107.anIntArray119[local10]), Static100.aClass28_1456, Static58.method1034(local27).aClass28_1344 }));
			}
			Static104.anInt2592 = 0;
			Static146.aClass24_10 = Static58.method1035(local18);
			Static95.anInt2368 = local10;
		}
		if (local14 == 36 && Static136.method2143(local18, local31, local10)) {
			Static128.aClass2_Sub2_Sub1_2.method1711(171);
			Static128.aClass2_Sub2_Sub1_2.method1681(Static39.anInt1055 + local18);
			Static128.aClass2_Sub2_Sub1_2.method1696(Static34.anInt958);
			Static128.aClass2_Sub2_Sub1_2.method1688(Static3.anInt2434 + local10);
			Static128.aClass2_Sub2_Sub1_2.method1687(Static59.anInt1550);
			Static128.aClass2_Sub2_Sub1_2.method1658(Integer.MAX_VALUE & (int) (local31 >>> 32));
		}
		if (local14 == 51) {
			local384 = Static146.method2284(0, Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anIntArray139[0], 0, 0, 0, 2, local10, Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anIntArray142[0], local18, false, 0);
			if (!local384) {
				Static146.method2284(0, Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anIntArray139[0], 0, 1, 1, 2, local10, Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anIntArray142[0], local18, false, 0);
			}
			Static6.anInt366 = 2;
			Static164.anInt3646 = 0;
			Static49.anInt1287 = Static130.anInt3042;
			Static33.anInt945 = Static101.anInt449;
			Static128.aClass2_Sub2_Sub1_2.method1711(183);
			Static128.aClass2_Sub2_Sub1_2.method1678(Static59.anInt1550);
			Static128.aClass2_Sub2_Sub1_2.method1658(local10 + Static3.anInt2434);
			Static128.aClass2_Sub2_Sub1_2.method1696(Static39.anInt1055 + local18);
			Static128.aClass2_Sub2_Sub1_2.method1681(local27);
			Static128.aClass2_Sub2_Sub1_2.method1688(Static34.anInt958);
		}
		if (local14 == 38) {
			Static128.aClass2_Sub2_Sub1_2.method1711(64);
			Static128.aClass2_Sub2_Sub1_2.method1710(local18);
			local107 = Static58.method1035(local18);
			if (local107.anIntArrayArray6 != null && local107.anIntArrayArray6[0][0] == 5) {
				local127 = local107.anIntArrayArray6[0][1];
				Static24.anIntArray52[local127] = 1 - Static24.anIntArray52[local127];
				Static10.method318(local127);
			}
		}
		if (local14 == 21) {
			local107 = Static58.method1035(local18);
			@Pc(1241) boolean local1241 = true;
			if (local107.anInt1388 > 0) {
				local1241 = Static154.method2376(local107);
			}
			if (local1241) {
				Static128.aClass2_Sub2_Sub1_2.method1711(64);
				Static128.aClass2_Sub2_Sub1_2.method1710(local18);
			}
		}
		if (local14 == 30) {
			Static128.aClass2_Sub2_Sub1_2.method1711(251);
			Static128.aClass2_Sub2_Sub1_2.method1658(local27);
			Static128.aClass2_Sub2_Sub1_2.method1696(local10);
			Static128.aClass2_Sub2_Sub1_2.method1687(local18);
			Static104.anInt2592 = 0;
			Static146.aClass24_10 = Static58.method1035(local18);
			Static95.anInt2368 = local10;
		}
		if (local14 == 15) {
			local384 = Static146.method2284(0, Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anIntArray139[0], 0, 0, 0, 2, local10, Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anIntArray142[0], local18, false, 0);
			if (!local384) {
				Static146.method2284(0, Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anIntArray139[0], 0, 1, 1, 2, local10, Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anIntArray142[0], local18, false, 0);
			}
			Static49.anInt1287 = Static130.anInt3042;
			Static164.anInt3646 = 0;
			Static33.anInt945 = Static101.anInt449;
			Static6.anInt366 = 2;
			Static128.aClass2_Sub2_Sub1_2.method1711(178);
			Static128.aClass2_Sub2_Sub1_2.method1681(local27);
			Static128.aClass2_Sub2_Sub1_2.method1688(Static39.anInt1055 + local18);
			Static128.aClass2_Sub2_Sub1_2.method1658(Static3.anInt2434 + local10);
		}
		if (local14 == 1005) {
			Static164.anInt3646 = 0;
			Static49.anInt1287 = Static130.anInt3042;
			Static33.anInt945 = Static101.anInt449;
			Static6.anInt366 = 2;
			Static128.aClass2_Sub2_Sub1_2.method1711(194);
			Static128.aClass2_Sub2_Sub1_2.method1658(local27);
		}
		if (local14 == 57) {
			local384 = Static146.method2284(0, Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anIntArray139[0], 0, 0, 0, 2, local10, Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anIntArray142[0], local18, false, 0);
			if (!local384) {
				Static146.method2284(0, Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anIntArray139[0], 0, 1, 1, 2, local10, Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anIntArray142[0], local18, false, 0);
			}
			Static164.anInt3646 = 0;
			Static6.anInt366 = 2;
			Static49.anInt1287 = Static130.anInt3042;
			Static33.anInt945 = Static101.anInt449;
			Static128.aClass2_Sub2_Sub1_2.method1711(124);
			Static128.aClass2_Sub2_Sub1_2.method1688(local27);
			Static128.aClass2_Sub2_Sub1_2.method1681(Static3.anInt2434 + local10);
			Static128.aClass2_Sub2_Sub1_2.method1696(Static39.anInt1055 + local18);
		}
		if (local14 == 49 || local14 == 1003) {
			Static158.method2415(local18, Static80.aClass28Array29[arg0], local27, local10);
		}
		if (local14 == 12) {
			local844 = Static34.aClass2_Sub4_Sub1_Sub1_Sub2Array1[local27];
			if (local844 != null) {
				Static146.method2284(0, Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anIntArray139[0], 0, 1, 1, 2, local844.anIntArray139[0], Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anIntArray142[0], local844.anIntArray142[0], false, 0);
				Static164.anInt3646 = 0;
				Static6.anInt366 = 2;
				Static49.anInt1287 = Static130.anInt3042;
				Static33.anInt945 = Static101.anInt449;
				Static128.aClass2_Sub2_Sub1_2.method1711(195);
				Static128.aClass2_Sub2_Sub1_2.method1658(local27);
			}
		}
		if (local14 == 35) {
			Static128.aClass2_Sub2_Sub1_2.method1711(103);
			Static128.aClass2_Sub2_Sub1_2.method1696(local10);
			Static128.aClass2_Sub2_Sub1_2.method1658(Static34.anInt958);
			Static128.aClass2_Sub2_Sub1_2.method1710(local18);
			Static128.aClass2_Sub2_Sub1_2.method1681(local27);
			Static128.aClass2_Sub2_Sub1_2.method1687(Static59.anInt1550);
			Static104.anInt2592 = 0;
			Static146.aClass24_10 = Static58.method1035(local18);
			Static95.anInt2368 = local10;
		}
		if (local14 == 45) {
			local384 = Static146.method2284(0, Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anIntArray139[0], 0, 0, 0, 2, local10, Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anIntArray142[0], local18, false, 0);
			if (!local384) {
				Static146.method2284(0, Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anIntArray139[0], 0, 1, 1, 2, local10, Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anIntArray142[0], local18, false, 0);
			}
			Static6.anInt366 = 2;
			Static33.anInt945 = Static101.anInt449;
			Static49.anInt1287 = Static130.anInt3042;
			Static164.anInt3646 = 0;
			Static128.aClass2_Sub2_Sub1_2.method1711(162);
			Static128.aClass2_Sub2_Sub1_2.method1688(Static3.anInt2434 + local10);
			Static128.aClass2_Sub2_Sub1_2.method1688(local18 + Static39.anInt1055);
			Static128.aClass2_Sub2_Sub1_2.method1681(local27);
		}
		if (local14 == 5 && Static136.method2143(local18, local31, local10)) {
			Static128.aClass2_Sub2_Sub1_2.method1711(55);
			Static128.aClass2_Sub2_Sub1_2.method1656(Static112.anInt2709);
			Static128.aClass2_Sub2_Sub1_2.method1681(Static39.anInt1055 + local18);
			Static128.aClass2_Sub2_Sub1_2.method1681(Static17.anInt654);
			Static128.aClass2_Sub2_Sub1_2.method1696(Integer.MAX_VALUE & (int) (local31 >>> 32));
			Static128.aClass2_Sub2_Sub1_2.method1688(Static84.anInt2127);
			Static128.aClass2_Sub2_Sub1_2.method1658(Static3.anInt2434 + local10);
		}
		if (local14 == 24) {
			Static136.method2143(local18, local31, local10);
			Static128.aClass2_Sub2_Sub1_2.method1711(77);
			Static128.aClass2_Sub2_Sub1_2.method1688((int) (local31 >>> 32) & Integer.MAX_VALUE);
			Static128.aClass2_Sub2_Sub1_2.method1688(Static3.anInt2434 + local10);
			Static128.aClass2_Sub2_Sub1_2.method1696(local18 + Static39.anInt1055);
		}
		if (local14 == 17) {
			local844 = Static34.aClass2_Sub4_Sub1_Sub1_Sub2Array1[local27];
			if (local844 != null) {
				Static146.method2284(0, Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anIntArray139[0], 0, 1, 1, 2, local844.anIntArray139[0], Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anIntArray142[0], local844.anIntArray142[0], false, 0);
				Static6.anInt366 = 2;
				Static164.anInt3646 = 0;
				Static33.anInt945 = Static101.anInt449;
				Static49.anInt1287 = Static130.anInt3042;
				Static128.aClass2_Sub2_Sub1_2.method1711(132);
				Static128.aClass2_Sub2_Sub1_2.method1678(Static112.anInt2709);
				Static128.aClass2_Sub2_Sub1_2.method1688(Static84.anInt2127);
				Static128.aClass2_Sub2_Sub1_2.method1658(local27);
				Static128.aClass2_Sub2_Sub1_2.method1696(Static17.anInt654);
			}
		}
		if (local14 == 31) {
			Static128.aClass2_Sub2_Sub1_2.method1711(26);
			Static128.aClass2_Sub2_Sub1_2.method1681(local27);
			Static128.aClass2_Sub2_Sub1_2.method1678(local18);
			Static128.aClass2_Sub2_Sub1_2.method1696(local10);
			Static104.anInt2592 = 0;
			Static146.aClass24_10 = Static58.method1035(local18);
			Static95.anInt2368 = local10;
		}
		if (local14 == 10) {
			local844 = Static34.aClass2_Sub4_Sub1_Sub1_Sub2Array1[local27];
			if (local844 != null) {
				Static146.method2284(0, Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anIntArray139[0], 0, 1, 1, 2, local844.anIntArray139[0], Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anIntArray142[0], local844.anIntArray142[0], false, 0);
				Static49.anInt1287 = Static130.anInt3042;
				Static164.anInt3646 = 0;
				Static33.anInt945 = Static101.anInt449;
				Static6.anInt366 = 2;
				Static128.aClass2_Sub2_Sub1_2.method1711(60);
				Static128.aClass2_Sub2_Sub1_2.method1681(local27);
			}
		}
		if (local14 == 33) {
			local107 = Static12.method360(local10, local18);
			if (local107 != null) {
				Static52.method964();
				Static27.method1957(local18, local10, Static167.method2617(Static10.method323(local107)));
				Static166.anInt3704 = 0;
				Static98.aClass28_1425 = Static76.method1367(local107);
				if (Static98.aClass28_1425 == null) {
					Static98.aClass28_1425 = Static6.aClass28_265;
				}
				if (local107.aBoolean63) {
					Static24.aClass28_499 = Static83.method1481(new Class28[] { local107.aClass28_816, Static79.aClass28_1209 });
					return;
				}
				Static24.aClass28_499 = Static83.method1481(new Class28[] { Static100.aClass28_1459, local107.aClass28_811, Static79.aClass28_1209 });
			}
			return;
		}
		if (local14 == 58) {
			local844 = Static34.aClass2_Sub4_Sub1_Sub1_Sub2Array1[local27];
			if (local844 != null) {
				Static146.method2284(0, Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anIntArray139[0], 0, 1, 1, 2, local844.anIntArray139[0], Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anIntArray142[0], local844.anIntArray142[0], false, 0);
				Static49.anInt1287 = Static130.anInt3042;
				Static6.anInt366 = 2;
				Static33.anInt945 = Static101.anInt449;
				Static164.anInt3646 = 0;
				Static128.aClass2_Sub2_Sub1_2.method1711(92);
				Static128.aClass2_Sub2_Sub1_2.method1696(local27);
			}
		}
		if (local14 == 1006) {
			Static33.anInt945 = Static101.anInt449;
			Static6.anInt366 = 2;
			Static49.anInt1287 = Static130.anInt3042;
			Static164.anInt3646 = 0;
			Static128.aClass2_Sub2_Sub1_2.method1711(93);
			Static128.aClass2_Sub2_Sub1_2.method1696(local27);
		}
		if (local14 == 43) {
			local844 = Static34.aClass2_Sub4_Sub1_Sub1_Sub2Array1[local27];
			if (local844 != null) {
				Static146.method2284(0, Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anIntArray139[0], 0, 1, 1, 2, local844.anIntArray139[0], Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anIntArray142[0], local844.anIntArray142[0], false, 0);
				Static6.anInt366 = 2;
				Static33.anInt945 = Static101.anInt449;
				Static164.anInt3646 = 0;
				Static49.anInt1287 = Static130.anInt3042;
				Static128.aClass2_Sub2_Sub1_2.method1711(108);
				Static128.aClass2_Sub2_Sub1_2.method1688(local27);
			}
		}
		if (local14 == 39) {
			local844 = Static34.aClass2_Sub4_Sub1_Sub1_Sub2Array1[local27];
			if (local844 != null) {
				Static146.method2284(0, Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anIntArray139[0], 0, 1, 1, 2, local844.anIntArray139[0], Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anIntArray142[0], local844.anIntArray142[0], false, 0);
				Static164.anInt3646 = 0;
				Static49.anInt1287 = Static130.anInt3042;
				Static33.anInt945 = Static101.anInt449;
				Static6.anInt366 = 2;
				Static128.aClass2_Sub2_Sub1_2.method1711(210);
				Static128.aClass2_Sub2_Sub1_2.method1658(local27);
			}
		}
		if (local14 == 2) {
			Static136.method2143(local18, local31, local10);
			Static128.aClass2_Sub2_Sub1_2.method1711(208);
			Static128.aClass2_Sub2_Sub1_2.method1696((int) (local31 >>> 32) & Integer.MAX_VALUE);
			Static128.aClass2_Sub2_Sub1_2.method1681(Static3.anInt2434 + local10);
			Static128.aClass2_Sub2_Sub1_2.method1696(Static39.anInt1055 + local18);
		}
		if (local14 == 37) {
			Static128.aClass2_Sub2_Sub1_2.method1711(22);
			Static128.aClass2_Sub2_Sub1_2.method1696(local27);
			Static128.aClass2_Sub2_Sub1_2.method1656(local18);
			Static128.aClass2_Sub2_Sub1_2.method1696(local10);
			Static104.anInt2592 = 0;
			Static146.aClass24_10 = Static58.method1035(local18);
			Static95.anInt2368 = local10;
		}
		if (local14 == 29) {
			local844 = Static34.aClass2_Sub4_Sub1_Sub1_Sub2Array1[local27];
			if (local844 != null) {
				Static146.method2284(0, Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anIntArray139[0], 0, 1, 1, 2, local844.anIntArray139[0], Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anIntArray142[0], local844.anIntArray142[0], false, 0);
				Static6.anInt366 = 2;
				Static164.anInt3646 = 0;
				Static33.anInt945 = Static101.anInt449;
				Static49.anInt1287 = Static130.anInt3042;
				Static128.aClass2_Sub2_Sub1_2.method1711(12);
				Static128.aClass2_Sub2_Sub1_2.method1681(local27);
			}
		}
		if (local14 == 14) {
			local40 = Static55.aClass2_Sub4_Sub1_Sub1_Sub1Array1[local27];
			if (local40 != null) {
				Static146.method2284(0, Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anIntArray139[0], 0, 1, 1, 2, local40.anIntArray139[0], Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anIntArray142[0], local40.anIntArray142[0], false, 0);
				Static6.anInt366 = 2;
				Static164.anInt3646 = 0;
				Static49.anInt1287 = Static130.anInt3042;
				Static33.anInt945 = Static101.anInt449;
				Static128.aClass2_Sub2_Sub1_2.method1711(86);
				Static128.aClass2_Sub2_Sub1_2.method1681(local27);
			}
		}
		if (local14 == 26) {
			local844 = Static34.aClass2_Sub4_Sub1_Sub1_Sub2Array1[local27];
			if (local844 != null) {
				Static146.method2284(0, Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anIntArray139[0], 0, 1, 1, 2, local844.anIntArray139[0], Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anIntArray142[0], local844.anIntArray142[0], false, 0);
				Static33.anInt945 = Static101.anInt449;
				Static164.anInt3646 = 0;
				Static6.anInt366 = 2;
				Static49.anInt1287 = Static130.anInt3042;
				Static128.aClass2_Sub2_Sub1_2.method1711(250);
				Static128.aClass2_Sub2_Sub1_2.method1658(local27);
			}
		}
		if (local14 == 11) {
			Static128.aClass2_Sub2_Sub1_2.method1711(74);
			Static128.aClass2_Sub2_Sub1_2.method1681(Static34.anInt958);
			Static128.aClass2_Sub2_Sub1_2.method1678(local18);
			Static128.aClass2_Sub2_Sub1_2.method1656(Static59.anInt1550);
			Static128.aClass2_Sub2_Sub1_2.method1681(local10);
		}
		if (local14 == 1) {
			Static128.aClass2_Sub2_Sub1_2.method1711(144);
			Static128.aClass2_Sub2_Sub1_2.method1696(local27);
			Static128.aClass2_Sub2_Sub1_2.method1678(local18);
			Static128.aClass2_Sub2_Sub1_2.method1696(local10);
			Static104.anInt2592 = 0;
			Static146.aClass24_10 = Static58.method1035(local18);
			Static95.anInt2368 = local10;
		}
		if (local14 == 1001) {
			Static164.anInt3646 = 0;
			Static33.anInt945 = Static101.anInt449;
			Static6.anInt366 = 2;
			Static49.anInt1287 = Static130.anInt3042;
			local40 = Static55.aClass2_Sub4_Sub1_Sub1_Sub1Array1[local27];
			if (local40 != null) {
				@Pc(2521) Class2_Sub4_Sub4 local2521 = local40.aClass2_Sub4_Sub4_1;
				if (local2521.anIntArray66 != null) {
					local2521 = local2521.method595();
				}
				if (local2521 != null) {
					Static128.aClass2_Sub2_Sub1_2.method1711(110);
					Static128.aClass2_Sub2_Sub1_2.method1688(local2521.anInt869);
				}
			}
		}
		if (local14 == 50) {
			local384 = Static146.method2284(0, Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anIntArray139[0], 0, 0, 0, 2, local10, Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anIntArray142[0], local18, false, 0);
			if (!local384) {
				Static146.method2284(0, Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anIntArray139[0], 0, 1, 1, 2, local10, Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anIntArray142[0], local18, false, 0);
			}
			Static33.anInt945 = Static101.anInt449;
			Static49.anInt1287 = Static130.anInt3042;
			Static164.anInt3646 = 0;
			Static6.anInt366 = 2;
			Static128.aClass2_Sub2_Sub1_2.method1711(69);
			Static128.aClass2_Sub2_Sub1_2.method1696(local27);
			Static128.aClass2_Sub2_Sub1_2.method1688(local18 + Static39.anInt1055);
			Static128.aClass2_Sub2_Sub1_2.method1681(local10 + Static3.anInt2434);
		}
		if (local14 == 28) {
			local40 = Static55.aClass2_Sub4_Sub1_Sub1_Sub1Array1[local27];
			if (local40 != null) {
				Static146.method2284(0, Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anIntArray139[0], 0, 1, 1, 2, local40.anIntArray139[0], Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anIntArray142[0], local40.anIntArray142[0], false, 0);
				Static49.anInt1287 = Static130.anInt3042;
				Static6.anInt366 = 2;
				Static164.anInt3646 = 0;
				Static33.anInt945 = Static101.anInt449;
				Static128.aClass2_Sub2_Sub1_2.method1711(72);
				Static128.aClass2_Sub2_Sub1_2.method1696(local27);
				Static128.aClass2_Sub2_Sub1_2.method1678(Static59.anInt1550);
				Static128.aClass2_Sub2_Sub1_2.method1688(Static34.anInt958);
			}
		}
		if (local14 == 18) {
			Static52.method964();
			local107 = Static58.method1035(local18);
			Static112.anInt2709 = local18;
			Static84.anInt2127 = local10;
			Static166.anInt3704 = 1;
			Static17.anInt654 = local27;
			Static104.method1828(local107);
			Static61.aClass28_954 = Static83.method1481(new Class28[] { Static95.aClass28_1407, Static58.method1034(local27).aClass28_1344, Static79.aClass28_1209 });
			if (Static61.aClass28_954 == null) {
				Static61.aClass28_954 = Static102.aClass28_1468;
			}
			return;
		}
		if (local14 == 47) {
			Static128.aClass2_Sub2_Sub1_2.method1711(198);
			Static128.aClass2_Sub2_Sub1_2.method1656(local18);
			Static128.aClass2_Sub2_Sub1_2.method1658(local10);
			Static128.aClass2_Sub2_Sub1_2.method1658(local27);
			Static104.anInt2592 = 0;
			Static146.aClass24_10 = Static58.method1035(local18);
			Static95.anInt2368 = local10;
		}
		if (local14 == 19) {
			Static3.method1677(Static103.anInt2568, local10, local18);
		}
		if (local14 == 22) {
			local844 = Static34.aClass2_Sub4_Sub1_Sub1_Sub2Array1[local27];
			if (local844 != null) {
				Static146.method2284(0, Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anIntArray139[0], 0, 1, 1, 2, local844.anIntArray139[0], Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anIntArray142[0], local844.anIntArray142[0], false, 0);
				Static33.anInt945 = Static101.anInt449;
				Static6.anInt366 = 2;
				Static164.anInt3646 = 0;
				Static49.anInt1287 = Static130.anInt3042;
				Static128.aClass2_Sub2_Sub1_2.method1711(222);
				Static128.aClass2_Sub2_Sub1_2.method1688(Static34.anInt958);
				Static128.aClass2_Sub2_Sub1_2.method1678(Static59.anInt1550);
				Static128.aClass2_Sub2_Sub1_2.method1681(local27);
			}
		}
		if (Static166.anInt3704 != 0) {
			Static166.anInt3704 = 0;
			Static104.method1828(Static58.method1035(Static112.anInt2709));
		}
		if (Static163.aBoolean157) {
			Static52.method964();
		}
		if (Static146.aClass24_10 != null && Static104.anInt2592 == 0) {
			Static104.method1828(Static146.aClass24_10);
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "([Lclient!gg;I)[Lclient!gg;")
	public static Class28[] method1840(@OriginalArg(0) Class28[] arg0) {
		@Pc(8) Class28[] local8 = new Class28[5];
		for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
			local8[local15] = Static83.method1481(new Class28[] { Static158.method2411(local15), Static110.aClass28_1578 });
			if (arg0 != null && arg0[local15] != null) {
				local8[local15] = Static83.method1481(new Class28[] { local8[local15], arg0[local15] });
			}
		}
		return local8;
	}

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "(I)V")
	public static void method1841() {
		Static122.aClass65_11 = new Class65();
	}
}
