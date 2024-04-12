import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

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

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)V", line = 3)
	public static void method1239() {
		Class17.anInt440 = 0;
		@Pc(17) int local17 = (Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anInt2275 >> 7) + Static79.anInt2058;
		@Pc(24) int local24 = Static28.anInt725 + (Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anInt2284 >> 7);
		if (local17 >= 3053 && local17 <= 3156 && local24 >= 3056 && local24 <= 3136) {
			Class17.anInt440 = 1;
		}
		if (local17 >= 3072 && local17 <= 3118 && local24 >= 9492 && local24 <= 9535) {
			Class17.anInt440 = 1;
		}
		if (Class17.anInt440 == 1 && local17 >= 3139 && local17 <= 3199 && local24 >= 3008 && local24 <= 3062) {
			Class17.anInt440 = 0;
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZLclient!ke;)V", line = 32)
	public static void method1240(@OriginalArg(1) Class2_Sub2_Sub12_Sub1 arg0) {
		arg0.anInt2318 = arg0.anInt2290;
		if (arg0.anInt2309 == 0) {
			arg0.anInt2282 = 0;
			return;
		}
		if (arg0.anInt2307 != -1 && arg0.anInt2313 == 0) {
			@Pc(29) Class2_Sub2_Sub6 local29 = Static57.method1042(arg0.anInt2307);
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

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "(B)V", line = 222)
	public static void method1242() {
		Class27.aClass47_12.method1330();
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;I)I", line = 234)
	public static int method1243(@OriginalArg(0) KeyEvent arg0) {
		@Pc(10) int local10 = arg0.getKeyChar();
		if (local10 <= 0 || local10 >= 256) {
			local10 = -1;
		}
		return local10;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Z)V", line = 254)
	public static void method1245() {
		aClass2_Sub2_Sub2_Sub4_7 = null;
		aClass5_25 = null;
		aClass5_Sub1_14 = null;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V", line = 271)
	public static void method1246() {
		try {
			if (Class20.anInt693 == 0) {
				Class45.aBoolean164 = false;
				Class2_Sub2_Sub12_Sub5.anInt2039 = 0;
				Static48.aClass48_5 = null;
				Class20.anInt693 = 1;
				Static64.aClass25_36 = null;
			}
			if (Class20.anInt693 == 1) {
				if (Static48.aClass48_5 == null) {
					Static48.aClass48_5 = Static91.aClass7_2.method202(Static54.anInt1500);
				}
				if (Static48.aClass48_5.anInt1928 == 2) {
					throw new IOException();
				}
				if (Static48.aClass48_5.anInt1928 == 1) {
					Static64.aClass25_36 = new Class25((Socket) Static48.aClass48_5.anObject4, Static91.aClass7_2);
					Static48.aClass48_5 = null;
					Class20.anInt693 = 2;
				}
			}
			if (Class20.anInt693 == 2) {
				@Pc(71) long local71 = Static94.aLong150 = Class2_Sub2_Sub12_Sub5.aClass40_591.method1179();
				Class47.aClass2_Sub3_Sub1_4.anInt2546 = 0;
				@Pc(81) int local81 = (int) (local71 >> 16 & 0x1FL);
				Class47.aClass2_Sub3_Sub1_4.method1703(14);
				Class47.aClass2_Sub3_Sub1_4.method1703(local81);
				Static64.aClass25_36.method731(Class47.aClass2_Sub3_Sub1_4.aByteArray24, 2);
				Class20.anInt693 = 3;
				Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.anInt2546 = 0;
			}
			@Pc(108) int local108;
			if (Class20.anInt693 == 3) {
				local108 = Static64.aClass25_36.method726();
				if (local108 != 0) {
					Static88.method1552(local108);
					return;
				}
				Class20.anInt693 = 4;
				Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.anInt2546 = 0;
			}
			if (Class20.anInt693 == 4) {
				if (Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.anInt2546 < 8) {
					local108 = Static64.aClass25_36.method728();
					if (local108 > 8 - Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.anInt2546) {
						local108 = 8 - Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.anInt2546;
					}
					if (local108 > 0) {
						Static64.aClass25_36.method725(Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.anInt2546, local108, Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.aByteArray24);
						Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.anInt2546 += local108;
					}
				}
				if (Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.anInt2546 == 8) {
					Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.anInt2546 = 0;
					Class60.aLong139 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1717();
					Class20.anInt693 = 5;
				}
			}
			if (Class20.anInt693 == 5) {
				@Pc(185) int[] local185 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Class60.aLong139 >> 32), (int) Class60.aLong139 };
				Class47.aClass2_Sub3_Sub1_4.anInt2546 = 0;
				Class47.aClass2_Sub3_Sub1_4.method1703(10);
				Class47.aClass2_Sub3_Sub1_4.method1725(local185[0]);
				Class47.aClass2_Sub3_Sub1_4.method1725(local185[1]);
				Class47.aClass2_Sub3_Sub1_4.method1725(local185[2]);
				Class47.aClass2_Sub3_Sub1_4.method1725(local185[3]);
				Class47.aClass2_Sub3_Sub1_4.method1725(Static91.aClass7_2.anInt249);
				Class47.aClass2_Sub3_Sub1_4.method1680(Class2_Sub2_Sub12_Sub5.aClass40_591.method1179());
				Class47.aClass2_Sub3_Sub1_4.method1683(Class2_Sub2_Sub12_Sub5.aClass40_587);
				Class47.aClass2_Sub3_Sub1_4.method1685(Canvas_Sub1.aBigInteger2, Class9.aBigInteger1);
				Class35.aClass2_Sub3_Sub1_3.anInt2546 = 0;
				if (Class2_Sub2_Sub11.anInt1075 == 40) {
					Class35.aClass2_Sub3_Sub1_3.method1703(18);
				} else {
					Class35.aClass2_Sub3_Sub1_3.method1703(16);
				}
				Class35.aClass2_Sub3_Sub1_3.method1703(Class47.aClass2_Sub3_Sub1_4.anInt2546 + 53);
				Class35.aClass2_Sub3_Sub1_3.method1725(410);
				Class35.aClass2_Sub3_Sub1_3.method1703(Class1.aBoolean2 ? 1 : 0);
				Class35.aClass2_Sub3_Sub1_3.method1725(aClass5_Sub1_14.anInt95);
				Class35.aClass2_Sub3_Sub1_3.method1725(Static79.aClass5_Sub1_18.anInt95);
				Class35.aClass2_Sub3_Sub1_3.method1725(Static5.aClass5_Sub1_1.anInt95);
				Class35.aClass2_Sub3_Sub1_3.method1725(Static26.aClass5_Sub1_5.anInt95);
				Class35.aClass2_Sub3_Sub1_3.method1725(Static33.aClass5_Sub1_7.anInt95);
				Class35.aClass2_Sub3_Sub1_3.method1725(Static34.aClass5_Sub1_8.anInt95);
				Class35.aClass2_Sub3_Sub1_3.method1725(Static77.aClass5_Sub1_17.anInt95);
				Class35.aClass2_Sub3_Sub1_3.method1725(Static24.aClass5_Sub1_4.anInt95);
				Class35.aClass2_Sub3_Sub1_3.method1725(Static74.aClass5_Sub1_16.anInt95);
				Class35.aClass2_Sub3_Sub1_3.method1725(Static33.aClass5_Sub1_6.anInt95);
				Class35.aClass2_Sub3_Sub1_3.method1725(Static73.aClass5_Sub1_15.anInt95);
				Class35.aClass2_Sub3_Sub1_3.method1725(Static68.aClass5_Sub1_13.anInt95);
				Class35.aClass2_Sub3_Sub1_3.method1682(Class47.aClass2_Sub3_Sub1_4.aByteArray24, Class47.aClass2_Sub3_Sub1_4.anInt2546);
				Static64.aClass25_36.method731(Class35.aClass2_Sub3_Sub1_3.aByteArray24, Class35.aClass2_Sub3_Sub1_3.anInt2546);
				Class47.aClass2_Sub3_Sub1_4.method1734(local185);
				for (@Pc(379) int local379 = 0; local379 < 4; local379++) {
					local185[local379] += 50;
				}
				Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1734(local185);
				Class20.anInt693 = 6;
			}
			if (Class20.anInt693 == 6 && Static64.aClass25_36.method728() > 0) {
				local108 = Static64.aClass25_36.method726();
				if (local108 == 21 && Class2_Sub2_Sub11.anInt1075 == 20) {
					Class20.anInt693 = 7;
				} else if (local108 == 2) {
					Class20.anInt693 = 9;
				} else if (local108 == 15 && Class2_Sub2_Sub11.anInt1075 == 40) {
					Static80.method1406();
					return;
				} else if (local108 == 23 && Class37.anInt1649 < 1) {
					Class37.anInt1649++;
					Class20.anInt693 = 0;
				} else {
					Static88.method1552(local108);
					return;
				}
			}
			if (Class20.anInt693 == 7 && Static64.aClass25_36.method728() > 0) {
				Class9.anInt261 = (Static64.aClass25_36.method726() + 3) * 60;
				Class20.anInt693 = 8;
			}
			if (Class20.anInt693 == 8) {
				Class2_Sub2_Sub12_Sub5.anInt2039 = 0;
				Static45.method1537(Class2_Sub2_Sub10.aClass40_314, Static72.method1334(new Class40[] { Class58.aClass40_623, Static48.method859(Class9.anInt261 / 60) }));
				if (--Class9.anInt261 <= 0) {
					Class20.anInt693 = 0;
				}
			} else {
				if (Class20.anInt693 == 9 && Static64.aClass25_36.method728() >= 8) {
					Class34.anInt1550 = Static64.aClass25_36.method726();
					Class12.aBoolean149 = Static64.aClass25_36.method726() == 1;
					Class51.anInt1955 = Static64.aClass25_36.method726();
					Class51.anInt1955 <<= 0x8;
					Class51.anInt1955 += Static64.aClass25_36.method726();
					Class2_Sub2_Sub8.anInt927 = Static64.aClass25_36.method726();
					Static64.aClass25_36.method725(0, 1, Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.aByteArray24);
					Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.anInt2546 = 0;
					Class54.anInt2083 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1733();
					Static64.aClass25_36.method725(0, 2, Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.aByteArray24);
					Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.anInt2546 = 0;
					Class2_Sub2_Sub7.anInt785 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1704();
					Class20.anInt693 = 10;
				}
				if (Class20.anInt693 != 10) {
					Class2_Sub2_Sub12_Sub5.anInt2039++;
					if (Class2_Sub2_Sub12_Sub5.anInt2039 > 2000) {
						if (Class37.anInt1649 < 1) {
							Class37.anInt1649++;
							if (Static54.anInt1500 == Static88.anInt2341) {
								Static54.anInt1500 = Static47.anInt1173;
							} else {
								Static54.anInt1500 = Static88.anInt2341;
							}
							Class20.anInt693 = 0;
						} else {
							Static88.method1552(-3);
						}
					}
				} else if (Static64.aClass25_36.method728() >= Class2_Sub2_Sub7.anInt785) {
					Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.anInt2546 = 0;
					Static64.aClass25_36.method725(0, Class2_Sub2_Sub7.anInt785, Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.aByteArray24);
					Static97.method1671();
					Static51.anInt2327 = -1;
					Static91.method58(false);
					Class54.anInt2083 = -1;
				}
			}
		} catch (@Pc(661) IOException local661) {
			if (Class37.anInt1649 < 1) {
				if (Static54.anInt1500 == Static88.anInt2341) {
					Static54.anInt1500 = Static47.anInt1173;
				} else {
					Static54.anInt1500 = Static88.anInt2341;
				}
				Class37.anInt1649++;
				Class20.anInt693 = 0;
			} else {
				Static88.method1552(-2);
			}
		}
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)V", line = 590)
	public static void method1247() {
		Static11.aClass45_6.method1476();
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IB)I", line = 602)
	public static int method1248(@OriginalArg(0) int arg0) {
		return (int) (Math.log((double) arg0 * 0.00390625D) * 868.5889638065036D + 0.5D);
	}
}
