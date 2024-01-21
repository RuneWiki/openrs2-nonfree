import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.zip.GZIPInputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!fb", name = "g", descriptor = "I")
	public static int anInt778;

	@OriginalMember(owner = "client!fb", name = "z", descriptor = "Lclient!ne;")
	public static Class3_Sub3_Sub2_Sub4 aClass3_Sub3_Sub2_Sub4_36;

	@OriginalMember(owner = "client!fb", name = "A", descriptor = "Lclient!td;")
	public static Class54 aClass54_15;

	@OriginalMember(owner = "client!fb", name = "D", descriptor = "Lclient!hb;")
	private static Class27 aClass27_386 = Static87.method1648(" from your friend list first");

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "Lclient!hb;")
	public static Class27 aClass27_382 = aClass27_386;

	@OriginalMember(owner = "client!fb", name = "t", descriptor = "Lclient!hb;")
	private static Class27 aClass27_384 = Static87.method1648("Click to continue");

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "Lclient!hb;")
	public static Class27 aClass27_383 = aClass27_384;

	@OriginalMember(owner = "client!fb", name = "h", descriptor = "I")
	public static int anInt779 = 0;

	@OriginalMember(owner = "client!fb", name = "r", descriptor = "Z")
	public static boolean aBoolean45 = false;

	@OriginalMember(owner = "client!fb", name = "v", descriptor = "Lclient!hb;")
	public static Class27 aClass27_385 = Static87.method1648("RuneScape wurde aktualisiert(Q");

	@OriginalMember(owner = "client!fb", name = "y", descriptor = "I")
	public static int anInt789 = 0;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(B[B)[B")
	public static byte[] method646(@OriginalArg(1) byte[] arg0) {
		@Pc(13) Class3_Sub11 local13 = new Class3_Sub11(arg0);
		@Pc(17) int local17 = local13.method1421();
		@Pc(21) int local21 = local13.method1444();
		if (local21 < 0 || Static76.anInt2137 != 0 && local21 > Static76.anInt2137) {
			throw new RuntimeException();
		} else if (local17 == 0) {
			@Pc(43) byte[] local43 = new byte[local21];
			local13.method1420(local21, local43);
			return local43;
		} else {
			@Pc(55) int local55 = local13.method1444();
			if (local55 < 0 || Static76.anInt2137 != 0 && Static76.anInt2137 < local55) {
				throw new RuntimeException();
			}
			@Pc(75) byte[] local75 = new byte[local55];
			if (local17 == 1) {
				Static23.method454(local75, local55, arg0, local21);
			} else {
				try {
					@Pc(102) DataInputStream local102 = new DataInputStream(new GZIPInputStream(new ByteArrayInputStream(arg0, 9, local21)));
					local102.readFully(local75);
					local102.close();
				} catch (@Pc(109) IOException local109) {
				}
			}
			return local75;
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)I")
	public static int method647() {
		return Static91.anInt2519++;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)V")
	public static void method649() {
		try {
			if (Static84.anInt2219 == 0) {
				if (Static91.aClass20_42 != null) {
					Static91.aClass20_42.method656();
					Static91.aClass20_42 = null;
				}
				Static74.anInt2071 = 0;
				Static41.aBoolean58 = false;
				Static84.anInt2219 = 1;
				Static62.aClass64_5 = null;
			}
			if (Static84.anInt2219 == 1) {
				if (Static62.aClass64_5 == null) {
					Static62.aClass64_5 = Static88.aClass32_4.method951(Static109.anInt2069);
				}
				if (Static62.aClass64_5.anInt2678 == 2) {
					throw new IOException();
				}
				if (Static62.aClass64_5.anInt2678 == 1) {
					Static91.aClass20_42 = new Class20((Socket) Static62.aClass64_5.anObject6, Static88.aClass32_4);
					Static62.aClass64_5 = null;
					Static84.anInt2219 = 2;
				}
			}
			if (Static84.anInt2219 == 2) {
				@Pc(72) long local72 = Static93.aLong71 = Static76.aClass27_1008.method758();
				Static78.aClass3_Sub11_Sub1_3.anInt2060 = 0;
				Static78.aClass3_Sub11_Sub1_3.method1443(14);
				@Pc(86) int local86 = (int) (local72 >> 16 & 0x1FL);
				Static78.aClass3_Sub11_Sub1_3.method1443(local86);
				Static91.aClass20_42.method651(2, Static78.aClass3_Sub11_Sub1_3.aByteArray17);
				Static84.anInt2219 = 3;
				Static47.aClass3_Sub11_Sub1_1.anInt2060 = 0;
			}
			@Pc(109) int local109;
			if (Static84.anInt2219 == 3) {
				local109 = Static91.aClass20_42.method650();
				if (local109 != 0) {
					Static65.method1194(local109);
					return;
				}
				Static84.anInt2219 = 4;
				Static47.aClass3_Sub11_Sub1_1.anInt2060 = 0;
			}
			if (Static84.anInt2219 == 4) {
				if (Static47.aClass3_Sub11_Sub1_1.anInt2060 < 8) {
					local109 = Static91.aClass20_42.method655();
					if (local109 > 8 - Static47.aClass3_Sub11_Sub1_1.anInt2060) {
						local109 = 8 - Static47.aClass3_Sub11_Sub1_1.anInt2060;
					}
					if (local109 > 0) {
						Static91.aClass20_42.method648(Static47.aClass3_Sub11_Sub1_1.anInt2060, Static47.aClass3_Sub11_Sub1_1.aByteArray17, local109);
						Static47.aClass3_Sub11_Sub1_1.anInt2060 += local109;
					}
				}
				if (Static47.aClass3_Sub11_Sub1_1.anInt2060 == 8) {
					Static47.aClass3_Sub11_Sub1_1.anInt2060 = 0;
					Static25.aLong27 = Static47.aClass3_Sub11_Sub1_1.method1450();
					Static84.anInt2219 = 5;
				}
			}
			if (Static84.anInt2219 == 5) {
				@Pc(189) int[] local189 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static25.aLong27 >> 32), (int) Static25.aLong27 };
				Static78.aClass3_Sub11_Sub1_3.anInt2060 = 0;
				Static78.aClass3_Sub11_Sub1_3.method1443(10);
				Static78.aClass3_Sub11_Sub1_3.method1425(local189[0]);
				Static78.aClass3_Sub11_Sub1_3.method1425(local189[1]);
				Static78.aClass3_Sub11_Sub1_3.method1425(local189[2]);
				Static78.aClass3_Sub11_Sub1_3.method1425(local189[3]);
				Static78.aClass3_Sub11_Sub1_3.method1425(Static88.aClass32_4.anInt1279);
				Static78.aClass3_Sub11_Sub1_3.method1468(Static76.aClass27_1008.method758());
				Static78.aClass3_Sub11_Sub1_3.method1430(Static76.aClass27_1010);
				Static78.aClass3_Sub11_Sub1_3.method1463(Static64.aBigInteger1, Static109.aBigInteger3);
				Static50.aClass3_Sub11_Sub1_2.anInt2060 = 0;
				if (Static59.anInt1508 == 40) {
					Static50.aClass3_Sub11_Sub1_2.method1443(18);
				} else {
					Static50.aClass3_Sub11_Sub1_2.method1443(16);
				}
				Static50.aClass3_Sub11_Sub1_2.method1443(Static78.aClass3_Sub11_Sub1_3.anInt2060 + 53);
				Static50.aClass3_Sub11_Sub1_2.method1425(423);
				Static50.aClass3_Sub11_Sub1_2.method1443(Static70.aBoolean94 ? 1 : 0);
				Static50.aClass3_Sub11_Sub1_2.method1425(Static78.aClass54_Sub1_37.anInt2269);
				Static50.aClass3_Sub11_Sub1_2.method1425(Static83.aClass54_Sub1_41.anInt2269);
				Static50.aClass3_Sub11_Sub1_2.method1425(Static87.aClass54_Sub1_39.anInt2269);
				Static50.aClass3_Sub11_Sub1_2.method1425(Static4.aClass54_Sub1_50.anInt2269);
				Static50.aClass3_Sub11_Sub1_2.method1425(Static90.aClass54_Sub1_44.anInt2269);
				Static50.aClass3_Sub11_Sub1_2.method1425(Static68.aClass54_Sub1_31.anInt2269);
				Static50.aClass3_Sub11_Sub1_2.method1425(Static80.aClass54_Sub1_38.anInt2269);
				Static50.aClass3_Sub11_Sub1_2.method1425(Static22.aClass54_Sub1_10.anInt2269);
				Static50.aClass3_Sub11_Sub1_2.method1425(Static90.aClass54_Sub1_43.anInt2269);
				Static50.aClass3_Sub11_Sub1_2.method1425(Static42.aClass54_Sub1_22.anInt2269);
				Static50.aClass3_Sub11_Sub1_2.method1425(Static106.aClass54_Sub1_15.anInt2269);
				Static50.aClass3_Sub11_Sub1_2.method1425(Static108.aClass54_Sub1_52.anInt2269);
				Static50.aClass3_Sub11_Sub1_2.method1439(Static78.aClass3_Sub11_Sub1_3.aByteArray17, Static78.aClass3_Sub11_Sub1_3.anInt2060);
				Static91.aClass20_42.method651(Static50.aClass3_Sub11_Sub1_2.anInt2060, Static50.aClass3_Sub11_Sub1_2.aByteArray17);
				Static78.aClass3_Sub11_Sub1_3.method1479(local189);
				for (@Pc(390) int local390 = 0; local390 < 4; local390++) {
					local189[local390] += 50;
				}
				Static47.aClass3_Sub11_Sub1_1.method1479(local189);
				Static84.anInt2219 = 6;
			}
			if (Static84.anInt2219 == 6 && Static91.aClass20_42.method655() > 0) {
				local109 = Static91.aClass20_42.method650();
				if (local109 == 21 && Static59.anInt1508 == 20) {
					Static84.anInt2219 = 7;
				} else if (local109 == 2) {
					Static84.anInt2219 = 9;
				} else if (local109 == 15 && Static59.anInt1508 == 40) {
					Static28.method617();
					return;
				} else if (local109 == 23 && Static84.anInt2212 < 1) {
					Static84.anInt2219 = 0;
					Static84.anInt2212++;
				} else {
					Static65.method1194(local109);
					return;
				}
			}
			if (Static84.anInt2219 == 7 && Static91.aClass20_42.method655() > 0) {
				Static74.anInt2074 = (Static91.aClass20_42.method650() + 3) * 60;
				Static84.anInt2219 = 8;
			}
			if (Static84.anInt2219 == 8) {
				Static74.anInt2071 = 0;
				Static2.method14(Static37.aClass27_443, Static18.aClass27_227, Static98.method1779(new Class27[] { Static97.method1616(Static74.anInt2074 / 60), Static65.aClass27_816 }));
				if (--Static74.anInt2074 <= 0) {
					Static84.anInt2219 = 0;
				}
			} else {
				if (Static84.anInt2219 == 9 && Static91.aClass20_42.method655() >= 8) {
					Static45.anInt345 = Static91.aClass20_42.method650();
					Static75.aBoolean100 = Static91.aClass20_42.method650() == 1;
					Static53.anInt1423 = Static91.aClass20_42.method650();
					Static53.anInt1423 <<= 0x8;
					Static53.anInt1423 += Static91.aClass20_42.method650();
					Static86.anInt2326 = Static91.aClass20_42.method650();
					Static91.aClass20_42.method648(0, Static47.aClass3_Sub11_Sub1_1.aByteArray17, 1);
					Static47.aClass3_Sub11_Sub1_1.anInt2060 = 0;
					Static34.anInt829 = Static47.aClass3_Sub11_Sub1_1.method1477();
					Static91.aClass20_42.method648(0, Static47.aClass3_Sub11_Sub1_1.aByteArray17, 2);
					Static47.aClass3_Sub11_Sub1_1.anInt2060 = 0;
					Static11.anInt2733 = Static47.aClass3_Sub11_Sub1_1.method1451();
					Static84.anInt2219 = 10;
				}
				if (Static84.anInt2219 != 10) {
					Static74.anInt2071++;
					if (Static74.anInt2071 > 2000) {
						if (Static84.anInt2212 < 1) {
							Static84.anInt2212++;
							Static84.anInt2219 = 0;
							if (Static109.anInt2069 == Static59.anInt1509) {
								Static109.anInt2069 = Static43.anInt1242;
							} else {
								Static109.anInt2069 = Static59.anInt1509;
							}
						} else {
							Static65.method1194(-3);
						}
					}
				} else if (Static91.aClass20_42.method655() >= Static11.anInt2733) {
					Static47.aClass3_Sub11_Sub1_1.anInt2060 = 0;
					Static91.aClass20_42.method648(0, Static47.aClass3_Sub11_Sub1_1.aByteArray17, Static11.anInt2733);
					Static2.method21();
					Static13.anInt762 = -1;
					Static34.method676(false);
					Static34.anInt829 = -1;
				}
			}
		} catch (@Pc(673) IOException local673) {
			if (Static84.anInt2212 < 1) {
				if (Static109.anInt2069 == Static59.anInt1509) {
					Static109.anInt2069 = Static43.anInt1242;
				} else {
					Static109.anInt2069 = Static59.anInt1509;
				}
				Static84.anInt2219 = 0;
				Static84.anInt2212++;
			} else {
				Static65.method1194(-2);
			}
		}
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(I)V")
	public static void method652() {
		aClass27_386 = null;
		aClass27_383 = null;
		aClass27_385 = null;
		aClass27_382 = null;
		aClass54_15 = null;
		aClass27_384 = null;
		aClass3_Sub3_Sub2_Sub4_36 = null;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIIILclient!ed;ILclient!pb;II)V")
	public static void method653(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class18 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class49 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(16) int local16 = Static55.anIntArrayArrayArray4[arg3][arg0][arg8];
		@Pc(28) int local28 = Static55.anIntArrayArrayArray4[arg3][arg0 + 1][arg8 + 1];
		@Pc(38) int local38 = Static55.anIntArrayArrayArray4[arg3][arg0 + 1][arg8];
		@Pc(48) int local48 = Static55.anIntArrayArrayArray4[arg3][arg0][arg8 + 1];
		@Pc(52) Class3_Sub3_Sub4 local52 = Static108.method1902(arg1);
		@Pc(58) int local58 = arg7 + (arg2 << 6);
		@Pc(68) int local68 = local48 + local28 + local38 + local16 >> 2;
		@Pc(81) int local81 = arg0 + (arg8 << 7) + (arg1 << 14) + 1073741824;
		if (local52.anInt1311 == 0) {
			local81 += Integer.MIN_VALUE;
		}
		if (local52.anInt1307 == 1) {
			local58 += 256;
		}
		@Pc(123) Class3_Sub3_Sub1 local123;
		if (arg7 == 22) {
			if (local52.anInt1318 == -1 && local52.anIntArray215 == null) {
				local123 = local52.method977(local48, local16, local38, 22, arg2, local28);
			} else {
				local123 = new Class3_Sub3_Sub1_Sub2(arg1, 22, arg2, local16, local38, local28, local48, local52.anInt1318, true);
			}
			arg4.method522(arg5, arg0, arg8, local68, local123, local81, local58);
			if (local52.aBoolean68 && local52.anInt1311 == 1) {
				arg6.method1525(arg0, arg8);
			}
			return;
		}
		@Pc(216) int local216;
		if (arg7 == 10 || arg7 == 11) {
			if (local52.anInt1318 == -1 && local52.anIntArray215 == null) {
				local123 = local52.method977(local48, local16, local38, 10, arg2, local28);
			} else {
				local123 = new Class3_Sub3_Sub1_Sub2(arg1, 10, arg2, local16, local38, local28, local48, local52.anInt1318, true);
			}
			if (local123 != null) {
				@Pc(213) int local213;
				if (arg2 == 1 || arg2 == 3) {
					local213 = local52.anInt1334;
					local216 = local52.anInt1309;
				} else {
					local216 = local52.anInt1334;
					local213 = local52.anInt1309;
				}
				@Pc(226) int local226 = 0;
				if (arg7 == 11) {
					local226 += 256;
				}
				arg4.method494(arg5, arg0, arg8, local68, local216, local213, local123, local226, local81, local58);
			}
			if (local52.aBoolean68) {
				arg6.method1534(arg0, arg8, local52.aBoolean64, arg2, local52.anInt1334, local52.anInt1309);
			}
		} else if (arg7 >= 12) {
			if (local52.anInt1318 == -1 && local52.anIntArray215 == null) {
				local123 = local52.method977(local48, local16, local38, arg7, arg2, local28);
			} else {
				local123 = new Class3_Sub3_Sub1_Sub2(arg1, arg7, arg2, local16, local38, local28, local48, local52.anInt1318, true);
			}
			arg4.method494(arg5, arg0, arg8, local68, 1, 1, local123, 0, local81, local58);
			if (local52.aBoolean68) {
				arg6.method1534(arg0, arg8, local52.aBoolean64, arg2, local52.anInt1334, local52.anInt1309);
			}
		} else if (arg7 == 0) {
			if (local52.anInt1318 == -1 && local52.anIntArray215 == null) {
				local123 = local52.method977(local48, local16, local38, 0, arg2, local28);
			} else {
				local123 = new Class3_Sub3_Sub1_Sub2(arg1, 0, arg2, local16, local38, local28, local48, local52.anInt1318, true);
			}
			arg4.method521(arg5, arg0, arg8, local68, local123, null, Static68.anIntArray300[arg2], 0, local81, local58);
			if (local52.aBoolean68) {
				arg6.method1531(local52.aBoolean64, arg0, arg7, arg8, arg2);
			}
		} else if (arg7 == 1) {
			if (local52.anInt1318 == -1 && local52.anIntArray215 == null) {
				local123 = local52.method977(local48, local16, local38, 1, arg2, local28);
			} else {
				local123 = new Class3_Sub3_Sub1_Sub2(arg1, 1, arg2, local16, local38, local28, local48, local52.anInt1318, true);
			}
			arg4.method521(arg5, arg0, arg8, local68, local123, null, Static18.anIntArray61[arg2], 0, local81, local58);
			if (local52.aBoolean68) {
				arg6.method1531(local52.aBoolean64, arg0, arg7, arg8, arg2);
			}
		} else {
			@Pc(469) int local469;
			@Pc(500) Class3_Sub3_Sub1 local500;
			if (arg7 == 2) {
				local469 = arg2 + 1 & 0x3;
				@Pc(488) Class3_Sub3_Sub1 local488;
				if (local52.anInt1318 == -1 && local52.anIntArray215 == null) {
					local488 = local52.method977(local48, local16, local38, 2, arg2 + 4, local28);
					local500 = local52.method977(local48, local16, local38, 2, local469, local28);
				} else {
					local488 = new Class3_Sub3_Sub1_Sub2(arg1, 2, arg2 + 4, local16, local38, local28, local48, local52.anInt1318, true);
					local500 = new Class3_Sub3_Sub1_Sub2(arg1, 2, local469, local16, local38, local28, local48, local52.anInt1318, true);
				}
				arg4.method521(arg5, arg0, arg8, local68, local488, local500, Static68.anIntArray300[arg2], Static68.anIntArray300[local469], local81, local58);
				if (local52.aBoolean68) {
					arg6.method1531(local52.aBoolean64, arg0, arg7, arg8, arg2);
				}
			} else if (arg7 == 3) {
				if (local52.anInt1318 == -1 && local52.anIntArray215 == null) {
					local123 = local52.method977(local48, local16, local38, 3, arg2, local28);
				} else {
					local123 = new Class3_Sub3_Sub1_Sub2(arg1, 3, arg2, local16, local38, local28, local48, local52.anInt1318, true);
				}
				arg4.method521(arg5, arg0, arg8, local68, local123, null, Static18.anIntArray61[arg2], 0, local81, local58);
				if (local52.aBoolean68) {
					arg6.method1531(local52.aBoolean64, arg0, arg7, arg8, arg2);
				}
			} else if (arg7 == 9) {
				if (local52.anInt1318 == -1 && local52.anIntArray215 == null) {
					local123 = local52.method977(local48, local16, local38, arg7, arg2, local28);
				} else {
					local123 = new Class3_Sub3_Sub1_Sub2(arg1, arg7, arg2, local16, local38, local28, local48, local52.anInt1318, true);
				}
				arg4.method494(arg5, arg0, arg8, local68, 1, 1, local123, 0, local81, local58);
				if (local52.aBoolean68) {
					arg6.method1534(arg0, arg8, local52.aBoolean64, arg2, local52.anInt1334, local52.anInt1309);
				}
			} else {
				if (local52.aBoolean67) {
					if (arg2 == 1) {
						local469 = local48;
						local48 = local28;
						local28 = local38;
						local38 = local16;
						local16 = local469;
					} else if (arg2 == 2) {
						local469 = local48;
						local48 = local38;
						local38 = local469;
						local469 = local28;
						local28 = local16;
						local16 = local469;
					} else if (arg2 == 3) {
						local469 = local48;
						local48 = local16;
						local16 = local38;
						local38 = local28;
						local28 = local469;
					}
				}
				if (arg7 == 4) {
					if (local52.anInt1318 == -1 && local52.anIntArray215 == null) {
						local123 = local52.method977(local48, local16, local38, 4, 0, local28);
					} else {
						local123 = new Class3_Sub3_Sub1_Sub2(arg1, 4, 0, local16, local38, local28, local48, local52.anInt1318, true);
					}
					arg4.method509(arg5, arg0, arg8, local68, local123, Static68.anIntArray300[arg2], arg2 * 512, 0, 0, local81, local58);
				} else if (arg7 == 5) {
					local469 = 16;
					local216 = arg4.method505(arg5, arg0, arg8);
					if (local216 > 0) {
						local469 = Static108.method1902(local216 >> 14 & 0x7FFF).anInt1336;
					}
					if (local52.anInt1318 == -1 && local52.anIntArray215 == null) {
						local500 = local52.method977(local48, local16, local38, 4, 0, local28);
					} else {
						local500 = new Class3_Sub3_Sub1_Sub2(arg1, 4, 0, local16, local38, local28, local48, local52.anInt1318, true);
					}
					arg4.method509(arg5, arg0, arg8, local68, local500, Static68.anIntArray300[arg2], arg2 * 512, Static72.anIntArray318[arg2] * local469, local469 * Static54.anIntArray237[arg2], local81, local58);
				} else if (arg7 == 6) {
					if (local52.anInt1318 == -1 && local52.anIntArray215 == null) {
						local123 = local52.method977(local48, local16, local38, 4, 0, local28);
					} else {
						local123 = new Class3_Sub3_Sub1_Sub2(arg1, 4, 0, local16, local38, local28, local48, local52.anInt1318, true);
					}
					arg4.method509(arg5, arg0, arg8, local68, local123, 256, arg2, 0, 0, local81, local58);
				} else if (arg7 == 7) {
					if (local52.anInt1318 == -1 && local52.anIntArray215 == null) {
						local123 = local52.method977(local48, local16, local38, 4, 0, local28);
					} else {
						local123 = new Class3_Sub3_Sub1_Sub2(arg1, 4, 0, local16, local38, local28, local48, local52.anInt1318, true);
					}
					arg4.method509(arg5, arg0, arg8, local68, local123, 512, arg2, 0, 0, local81, local58);
				} else if (arg7 == 8) {
					if (local52.anInt1318 == -1 && local52.anIntArray215 == null) {
						local123 = local52.method977(local48, local16, local38, 4, 0, local28);
					} else {
						local123 = new Class3_Sub3_Sub1_Sub2(arg1, 4, 0, local16, local38, local28, local48, local52.anInt1318, true);
					}
					arg4.method509(arg5, arg0, arg8, local68, local123, 768, arg2, 0, 0, local81, local58);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIILclient!ed;[Lclient!pb;IIII[BI)V")
	public static void method654(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class18 arg2, @OriginalArg(4) Class49[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) byte[] arg8, @OriginalArg(10) int arg9) {
		@Pc(15) Class3_Sub11 local15 = new Class3_Sub11(arg8);
		@Pc(17) int local17 = -1;
		while (true) {
			@Pc(21) int local21 = local15.method1469();
			if (local21 == 0) {
				return;
			}
			local17 += local21;
			@Pc(32) int local32 = 0;
			while (true) {
				@Pc(38) int local38 = local15.method1469();
				if (local38 == 0) {
					break;
				}
				local32 += local38 - 1;
				@Pc(53) int local53 = local32 & 0x3F;
				@Pc(57) int local57 = local32 >> 12;
				@Pc(63) int local63 = local32 >> 6 & 0x3F;
				@Pc(67) int local67 = local15.method1421();
				@Pc(71) int local71 = local67 & 0x3;
				@Pc(75) int local75 = local67 >> 2;
				if (local57 == arg1 && local63 >= arg0 && arg0 + 8 > local63 && local53 >= arg4 && local53 < arg4 + 8) {
					@Pc(106) Class3_Sub3_Sub4 local106 = Static108.method1902(local17);
					@Pc(124) int local124 = arg6 + Static88.method1686(local53 & 0x7, arg9, local63 & 0x7, local106.anInt1334, local71, local106.anInt1309);
					@Pc(141) int local141 = arg7 + Static57.method1101(local71, local106.anInt1334, local63 & 0x7, arg9, local53 & 0x7, local106.anInt1309);
					if (local124 > 0 && local141 > 0 && local124 < 103 && local141 < 103) {
						@Pc(158) int local158 = arg5;
						@Pc(160) Class49 local160 = null;
						if ((Static89.aByteArrayArrayArray11[1][local124][local141] & 0x2) == 2) {
							local158 = arg5 - 1;
						}
						if (local158 >= 0) {
							local160 = arg3[local158];
						}
						Static83.method1665(local141, arg5, local17, local75, arg9 + local71 & 0x3, local124, local160, arg2);
					}
				}
			}
		}
	}
}
