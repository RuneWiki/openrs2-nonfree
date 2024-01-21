import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "Lclient!ad;")
	public static Class5_Sub1 aClass5_Sub1_14;

	@OriginalMember(owner = "client!ib", name = "g", descriptor = "I")
	public static int anInt1849;

	@OriginalMember(owner = "client!ib", name = "k", descriptor = "Lclient!vb;")
	public static Class2_Sub2_Sub2_Sub4 aClass2_Sub2_Sub2_Sub4_7;

	@OriginalMember(owner = "client!ib", name = "m", descriptor = "Z")
	public static boolean aBoolean150;

	@OriginalMember(owner = "client!ib", name = "n", descriptor = "Lclient!ud;")
	public static Class5 aClass5_25;

	@OriginalMember(owner = "client!ib", name = "e", descriptor = "Z")
	public static boolean aBoolean149 = false;

	@OriginalMember(owner = "client!ib", name = "h", descriptor = "I")
	public static int anInt1850 = 0;

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)V")
	public static void method1239() {
		Static19.anInt440 = 0;
		@Pc(17) int local17 = (Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.anInt2275 >> 7) + Static87.anInt2058;
		@Pc(24) int local24 = Static30.anInt725 + (Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.anInt2284 >> 7);
		if (local17 >= 3053 && local17 <= 3156 && local24 >= 3056 && local24 <= 3136) {
			Static19.anInt440 = 1;
		}
		if (local17 >= 3072 && local17 <= 3118 && local24 >= 9492 && local24 <= 9535) {
			Static19.anInt440 = 1;
		}
		if (Static19.anInt440 == 1 && local17 >= 3139 && local17 <= 3199 && local24 >= 3008 && local24 <= 3062) {
			Static19.anInt440 = 0;
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZLclient!ke;)V")
	public static void method1240(@OriginalArg(1) Class2_Sub2_Sub12_Sub1 arg0) {
		arg0.anInt2318 = arg0.anInt2290;
		if (arg0.anInt2309 == 0) {
			arg0.anInt2282 = 0;
			return;
		}
		if (arg0.anInt2307 != -1 && arg0.anInt2313 == 0) {
			@Pc(29) Class2_Sub2_Sub6 local29 = Static62.method1042(arg0.anInt2307);
			if (arg0.anInt2281 > 0 && local29.anInt663 == 0) {
				arg0.anInt2282++;
				return;
			}
			if (arg0.anInt2281 <= 0 && local29.anInt666 == 0) {
				arg0.anInt2282++;
				return;
			}
		}
		@Pc(68) int local68 = arg0.anInt2284;
		@Pc(71) int local71 = arg0.anInt2275;
		@Pc(87) int local87 = arg0.anIntArray492[arg0.anInt2309 - 1] * 128 + arg0.anInt2278 * 64;
		@Pc(102) int local102 = arg0.anInt2278 * 64 + arg0.anIntArray496[arg0.anInt2309 - 1] * 128;
		if (local87 - local71 > 256 || local87 - local71 < -256 || local102 - local68 > 256 || local102 - local68 < -256) {
			arg0.anInt2275 = local87;
			arg0.anInt2284 = local102;
			return;
		}
		if (local71 < local87) {
			if (local102 > local68) {
				arg0.anInt2283 = 1280;
			} else if (local102 >= local68) {
				arg0.anInt2283 = 1536;
			} else {
				arg0.anInt2283 = 1792;
			}
		} else if (local87 < local71) {
			if (local102 > local68) {
				arg0.anInt2283 = 768;
			} else if (local102 < local68) {
				arg0.anInt2283 = 256;
			} else {
				arg0.anInt2283 = 512;
			}
		} else if (local68 >= local102) {
			arg0.anInt2283 = 0;
		} else {
			arg0.anInt2283 = 1024;
		}
		@Pc(216) int local216 = arg0.anInt2283 - arg0.anInt2305 & 0x7FF;
		if (local216 > 1024) {
			local216 -= 2048;
		}
		@Pc(225) int local225 = arg0.anInt2303;
		@Pc(227) int local227 = 4;
		if (arg0.anInt2305 != arg0.anInt2283 && arg0.anInt2324 == -1 && arg0.anInt2285 != 0) {
			local227 = 2;
		}
		if (local216 >= -256 && local216 <= 256) {
			local225 = arg0.anInt2269;
		} else if (local216 >= 256 && local216 < 768) {
			local225 = arg0.anInt2322;
		} else if (local216 >= -768 && local216 <= -256) {
			local225 = arg0.anInt2304;
		}
		if (local225 == -1) {
			local225 = arg0.anInt2269;
		}
		arg0.anInt2318 = local225;
		if (arg0.anInt2309 > 2) {
			local227 = 6;
		}
		if (arg0.anInt2309 > 3) {
			local227 = 8;
		}
		if (arg0.anInt2282 > 0 && arg0.anInt2309 > 1) {
			arg0.anInt2282--;
			local227 = 8;
		}
		if (arg0.aBooleanArray34[arg0.anInt2309 - 1]) {
			local227 <<= 0x1;
		}
		if (local71 < local87) {
			arg0.anInt2275 += local227;
			if (local87 < arg0.anInt2275) {
				arg0.anInt2275 = local87;
			}
		} else if (local71 > local87) {
			arg0.anInt2275 -= local227;
			if (local87 > arg0.anInt2275) {
				arg0.anInt2275 = local87;
			}
		}
		if (local102 > local68) {
			arg0.anInt2284 += local227;
			if (arg0.anInt2284 > local102) {
				arg0.anInt2284 = local102;
			}
		} else if (local68 > local102) {
			arg0.anInt2284 -= local227;
			if (local102 > arg0.anInt2284) {
				arg0.anInt2284 = local102;
			}
		}
		if (arg0.anInt2275 == local87 && arg0.anInt2284 == local102) {
			if (arg0.anInt2281 > 0) {
				arg0.anInt2281--;
			}
			arg0.anInt2309--;
		}
		if (local227 >= 8 && arg0.anInt2318 == arg0.anInt2269 && arg0.anInt2273 != -1) {
			arg0.anInt2318 = arg0.anInt2273;
		}
	}

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "(B)V")
	public static void method1242() {
		Static45.aClass47_12.method1330();
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;I)I")
	public static int method1243(@OriginalArg(0) KeyEvent arg0) {
		@Pc(10) int local10 = arg0.getKeyChar();
		if (local10 <= 0 || local10 >= 256) {
			local10 = -1;
		}
		return local10;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Z)V")
	public static void method1245() {
		aClass2_Sub2_Sub2_Sub4_7 = null;
		aClass5_25 = null;
		aClass5_Sub1_14 = null;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V")
	public static void method1246() {
		try {
			if (Static27.anInt693 == 0) {
				Static76.aBoolean164 = false;
				Static86.anInt2039 = 0;
				Static53.aClass48_5 = null;
				Static27.anInt693 = 1;
				Static70.aClass25_36 = null;
			}
			if (Static27.anInt693 == 1) {
				if (Static53.aClass48_5 == null) {
					Static53.aClass48_5 = Static99.aClass7_2.method202(Static59.anInt1500);
				}
				if (Static53.aClass48_5.anInt1928 == 2) {
					throw new IOException();
				}
				if (Static53.aClass48_5.anInt1928 == 1) {
					Static70.aClass25_36 = new Class25((Socket) Static53.aClass48_5.anObject4, Static99.aClass7_2);
					Static53.aClass48_5 = null;
					Static27.anInt693 = 2;
				}
			}
			if (Static27.anInt693 == 2) {
				@Pc(71) long local71 = Static102.aLong150 = Static86.aClass40_591.method1179();
				Static80.aClass2_Sub3_Sub1_4.anInt2546 = 0;
				@Pc(81) int local81 = (int) (local71 >> 16 & 0x1FL);
				Static80.aClass2_Sub3_Sub1_4.method1703(14);
				Static80.aClass2_Sub3_Sub1_4.method1703(local81);
				Static70.aClass25_36.method731(Static80.aClass2_Sub3_Sub1_4.aByteArray24, 2);
				Static27.anInt693 = 3;
				Static56.aClass2_Sub3_Sub1_5.anInt2546 = 0;
			}
			@Pc(108) int local108;
			if (Static27.anInt693 == 3) {
				local108 = Static70.aClass25_36.method726();
				if (local108 != 0) {
					Static96.method1552(local108);
					return;
				}
				Static27.anInt693 = 4;
				Static56.aClass2_Sub3_Sub1_5.anInt2546 = 0;
			}
			if (Static27.anInt693 == 4) {
				if (Static56.aClass2_Sub3_Sub1_5.anInt2546 < 8) {
					local108 = Static70.aClass25_36.method728();
					if (local108 > 8 - Static56.aClass2_Sub3_Sub1_5.anInt2546) {
						local108 = 8 - Static56.aClass2_Sub3_Sub1_5.anInt2546;
					}
					if (local108 > 0) {
						Static70.aClass25_36.method725(Static56.aClass2_Sub3_Sub1_5.anInt2546, local108, Static56.aClass2_Sub3_Sub1_5.aByteArray24);
						Static56.aClass2_Sub3_Sub1_5.anInt2546 += local108;
					}
				}
				if (Static56.aClass2_Sub3_Sub1_5.anInt2546 == 8) {
					Static56.aClass2_Sub3_Sub1_5.anInt2546 = 0;
					Static98.aLong139 = Static56.aClass2_Sub3_Sub1_5.method1717();
					Static27.anInt693 = 5;
				}
			}
			if (Static27.anInt693 == 5) {
				@Pc(185) int[] local185 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static98.aLong139 >> 32), (int) Static98.aLong139 };
				Static80.aClass2_Sub3_Sub1_4.anInt2546 = 0;
				Static80.aClass2_Sub3_Sub1_4.method1703(10);
				Static80.aClass2_Sub3_Sub1_4.method1725(local185[0]);
				Static80.aClass2_Sub3_Sub1_4.method1725(local185[1]);
				Static80.aClass2_Sub3_Sub1_4.method1725(local185[2]);
				Static80.aClass2_Sub3_Sub1_4.method1725(local185[3]);
				Static80.aClass2_Sub3_Sub1_4.method1725(Static99.aClass7_2.anInt249);
				Static80.aClass2_Sub3_Sub1_4.method1680(Static86.aClass40_591.method1179());
				Static80.aClass2_Sub3_Sub1_4.method1683(Static86.aClass40_587);
				Static80.aClass2_Sub3_Sub1_4.method1685(Static51.aBigInteger2, Static10.aBigInteger1);
				Static62.aClass2_Sub3_Sub1_3.anInt2546 = 0;
				if (Static44.anInt1075 == 40) {
					Static62.aClass2_Sub3_Sub1_3.method1703(18);
				} else {
					Static62.aClass2_Sub3_Sub1_3.method1703(16);
				}
				Static62.aClass2_Sub3_Sub1_3.method1703(Static80.aClass2_Sub3_Sub1_4.anInt2546 + 53);
				Static62.aClass2_Sub3_Sub1_3.method1725(410);
				Static62.aClass2_Sub3_Sub1_3.method1703(Static1.aBoolean2 ? 1 : 0);
				Static62.aClass2_Sub3_Sub1_3.method1725(aClass5_Sub1_14.anInt95);
				Static62.aClass2_Sub3_Sub1_3.method1725(Static87.aClass5_Sub1_18.anInt95);
				Static62.aClass2_Sub3_Sub1_3.method1725(Static5.aClass5_Sub1_1.anInt95);
				Static62.aClass2_Sub3_Sub1_3.method1725(Static27.aClass5_Sub1_5.anInt95);
				Static62.aClass2_Sub3_Sub1_3.method1725(Static35.aClass5_Sub1_7.anInt95);
				Static62.aClass2_Sub3_Sub1_3.method1725(Static36.aClass5_Sub1_8.anInt95);
				Static62.aClass2_Sub3_Sub1_3.method1725(Static85.aClass5_Sub1_17.anInt95);
				Static62.aClass2_Sub3_Sub1_3.method1725(Static25.aClass5_Sub1_4.anInt95);
				Static62.aClass2_Sub3_Sub1_3.method1725(Static82.aClass5_Sub1_16.anInt95);
				Static62.aClass2_Sub3_Sub1_3.method1725(Static35.aClass5_Sub1_6.anInt95);
				Static62.aClass2_Sub3_Sub1_3.method1725(Static81.aClass5_Sub1_15.anInt95);
				Static62.aClass2_Sub3_Sub1_3.method1725(Static74.aClass5_Sub1_13.anInt95);
				Static62.aClass2_Sub3_Sub1_3.method1682(Static80.aClass2_Sub3_Sub1_4.aByteArray24, Static80.aClass2_Sub3_Sub1_4.anInt2546);
				Static70.aClass25_36.method731(Static62.aClass2_Sub3_Sub1_3.aByteArray24, Static62.aClass2_Sub3_Sub1_3.anInt2546);
				Static80.aClass2_Sub3_Sub1_4.method1734(local185);
				for (@Pc(379) int local379 = 0; local379 < 4; local379++) {
					local185[local379] += 50;
				}
				Static56.aClass2_Sub3_Sub1_5.method1734(local185);
				Static27.anInt693 = 6;
			}
			if (Static27.anInt693 == 6 && Static70.aClass25_36.method728() > 0) {
				local108 = Static70.aClass25_36.method726();
				if (local108 == 21 && Static44.anInt1075 == 20) {
					Static27.anInt693 = 7;
				} else if (local108 == 2) {
					Static27.anInt693 = 9;
				} else if (local108 == 15 && Static44.anInt1075 == 40) {
					Static88.method1406();
					return;
				} else if (local108 == 23 && Static66.anInt1649 < 1) {
					Static66.anInt1649++;
					Static27.anInt693 = 0;
				} else {
					Static96.method1552(local108);
					return;
				}
			}
			if (Static27.anInt693 == 7 && Static70.aClass25_36.method728() > 0) {
				Static10.anInt261 = (Static70.aClass25_36.method726() + 3) * 60;
				Static27.anInt693 = 8;
			}
			if (Static27.anInt693 == 8) {
				Static86.anInt2039 = 0;
				Static49.method1537(Static42.aClass40_314, Static80.method1334(new Class40[] { Static93.aClass40_623, Static53.method859(Static10.anInt261 / 60) }));
				if (--Static10.anInt261 <= 0) {
					Static27.anInt693 = 0;
				}
			} else {
				if (Static27.anInt693 == 9 && Static70.aClass25_36.method728() >= 8) {
					Static61.anInt1550 = Static70.aClass25_36.method726();
					aBoolean149 = Static70.aClass25_36.method726() == 1;
					Static83.anInt1955 = Static70.aClass25_36.method726();
					Static83.anInt1955 <<= 0x8;
					Static83.anInt1955 += Static70.aClass25_36.method726();
					Static37.anInt927 = Static70.aClass25_36.method726();
					Static70.aClass25_36.method725(0, 1, Static56.aClass2_Sub3_Sub1_5.aByteArray24);
					Static56.aClass2_Sub3_Sub1_5.anInt2546 = 0;
					Static88.anInt2083 = Static56.aClass2_Sub3_Sub1_5.method1733();
					Static70.aClass25_36.method725(0, 2, Static56.aClass2_Sub3_Sub1_5.aByteArray24);
					Static56.aClass2_Sub3_Sub1_5.anInt2546 = 0;
					Static33.anInt785 = Static56.aClass2_Sub3_Sub1_5.method1704();
					Static27.anInt693 = 10;
				}
				if (Static27.anInt693 != 10) {
					Static86.anInt2039++;
					if (Static86.anInt2039 > 2000) {
						if (Static66.anInt1649 < 1) {
							Static66.anInt1649++;
							if (Static59.anInt1500 == Static96.anInt2341) {
								Static59.anInt1500 = Static52.anInt1173;
							} else {
								Static59.anInt1500 = Static96.anInt2341;
							}
							Static27.anInt693 = 0;
						} else {
							Static96.method1552(-3);
						}
					}
				} else if (Static70.aClass25_36.method728() >= Static33.anInt785) {
					Static56.aClass2_Sub3_Sub1_5.anInt2546 = 0;
					Static70.aClass25_36.method725(0, Static33.anInt785, Static56.aClass2_Sub3_Sub1_5.aByteArray24);
					Static105.method1671();
					Static56.anInt2327 = -1;
					Static99.method58(false);
					Static88.anInt2083 = -1;
				}
			}
		} catch (@Pc(661) IOException local661) {
			if (Static66.anInt1649 < 1) {
				if (Static59.anInt1500 == Static96.anInt2341) {
					Static59.anInt1500 = Static52.anInt1173;
				} else {
					Static59.anInt1500 = Static96.anInt2341;
				}
				Static66.anInt1649++;
				Static27.anInt693 = 0;
			} else {
				Static96.method1552(-2);
			}
		}
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)V")
	public static void method1247() {
		Static12.aClass45_6.method1476();
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IB)I")
	public static int method1248(@OriginalArg(0) int arg0) {
		return (int) (Math.log((double) arg0 * 0.00390625D) * 868.5889638065036D + 0.5D);
	}
}
