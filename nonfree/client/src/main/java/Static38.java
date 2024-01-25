import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!bga", name = "Nb", descriptor = "[[[Z")
	public static boolean[][][] aBooleanArrayArrayArray1;

	@OriginalMember(owner = "client!bga", name = "Pb", descriptor = "I")
	public static int anInt732;

	@OriginalMember(owner = "client!bga", name = "Qb", descriptor = "Lclient!mga;")
	public static Class220 aClass220_2;

	@OriginalMember(owner = "client!bga", name = "Ib", descriptor = "Lclient!st;")
	public static final Class314 aClass314_9 = new Class314(58, 3);

	@OriginalMember(owner = "client!bga", name = "Ob", descriptor = "[I")
	public static final int[] anIntArray46 = new int[2048];

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method703(@OriginalArg(0) String arg0) {
		@Pc(17) StringBuffer local17 = new StringBuffer();
		@Pc(20) int local20 = arg0.length();
		for (@Pc(22) int local22 = 0; local22 < local20; local22++) {
			@Pc(28) char local28 = arg0.charAt(local22);
			if (local28 == '%' && local22 + 2 < local20) {
				local28 = arg0.charAt(local22 + 1);
				@Pc(99) int local99;
				if (local28 >= '0' && local28 <= '9') {
					local99 = local28 - 48;
				} else if (local28 >= 'a' && local28 <= 'f') {
					local99 = local28 + '\n' - 97;
				} else {
					if (local28 < 'A' || local28 > 'F') {
						local17.append('%');
						continue;
					}
					local99 = local28 + 10 - 'A';
				}
				local99 *= 16;
				local28 = arg0.charAt(local22 + 2);
				if (local28 >= '0' && local28 <= '9') {
					local99 += local28 - 48;
				} else if (local28 >= 'a' && local28 <= 'f') {
					local99 += local28 + 10 - 97;
				} else {
					if (local28 < 'A' || local28 > 'F') {
						local17.append('%');
						continue;
					}
					local99 += local28 - 55;
				}
				if (local99 != 0 && Static296.method5076((byte) local99)) {
					local17.append(Static408.method6346((byte) local99));
				}
				local22 += 2;
			} else if (local28 == '+') {
				local17.append(' ');
			} else {
				local17.append(local28);
			}
		}
		return local17.toString();
	}

	@OriginalMember(owner = "client!bga", name = "l", descriptor = "(B)Z")
	public static boolean method705() {
		try {
			@Pc(12) Class73 local12 = new Class73();
			@Pc(17) byte[] local17 = local12.method1726(Static139.aByteArray28);
			Static257.method4311(local17);
			return true;
		} catch (@Pc(24) Exception local24) {
			return false;
		}
	}

	@OriginalMember(owner = "client!bga", name = "w", descriptor = "(I)V")
	public static void method707() {
		for (@Pc(3) int local3 = 0; local3 < Static585.anInt9494; local3++) {
			@Pc(15) int local15 = Static533.anIntArray99[local3];
			@Pc(23) Class9_Sub2_Sub1_Sub2_Sub2 local23 = ((Class3_Sub43) Static545.aClass25_40.method426((long) local15)).aClass9_Sub2_Sub1_Sub2_Sub2_2;
			@Pc(27) int local27 = Static47.aClass3_Sub9_Sub2_1.method5633();
			if ((local27 & 0x1) != 0) {
				local27 += Static47.aClass3_Sub9_Sub2_1.method5633() << 8;
			}
			if ((local27 & 0x100) != 0) {
				local27 += Static47.aClass3_Sub9_Sub2_1.method5633() << 16;
			}
			if ((local27 & 0x8) != 0) {
				local23.anInt10260 = Static47.aClass3_Sub9_Sub2_1.method5583();
				local23.anInt10256 = Static47.aClass3_Sub9_Sub2_1.method5583();
			}
			@Pc(87) int local87;
			@Pc(91) int local91;
			@Pc(100) int local100;
			@Pc(104) int local104;
			@Pc(110) int local110;
			if ((local27 & 0x10000) != 0) {
				local87 = Static47.aClass3_Sub9_Sub2_1.method5583();
				local91 = Static47.aClass3_Sub9_Sub2_1.method5611();
				if (local87 == 65535) {
					local87 = -1;
				}
				local100 = Static47.aClass3_Sub9_Sub2_1.method5633();
				local104 = local100 & 0x7;
				local110 = local100 >> 3 & 0xF;
				if (local110 == 15) {
					local110 = -1;
				}
				local23.method8626(local104, local91, local110, local87, 2);
			}
			if ((local27 & 0x80) != 0) {
				local87 = Static47.aClass3_Sub9_Sub2_1.method5628();
				local91 = Static47.aClass3_Sub9_Sub2_1.method5585();
				if (local87 == 65535) {
					local87 = -1;
				}
				local100 = Static47.aClass3_Sub9_Sub2_1.method5594();
				local104 = local100 & 0x7;
				local110 = local100 >> 3 & 0xF;
				if (local110 == 15) {
					local110 = -1;
				}
				local23.method8626(local104, local91, local110, local87, 0);
			}
			@Pc(200) int local200;
			@Pc(184) int[] local184;
			@Pc(187) int[] local187;
			if ((local27 & 0x4000) != 0) {
				local87 = Static47.aClass3_Sub9_Sub2_1.method5626();
				local184 = new int[local87];
				local187 = new int[local87];
				@Pc(190) int[] local190 = new int[local87];
				for (local110 = 0; local110 < local87; local110++) {
					local200 = Static47.aClass3_Sub9_Sub2_1.method5634();
					if (local200 == 65535) {
						local200 = -1;
					}
					local184[local110] = local200;
					local187[local110] = Static47.aClass3_Sub9_Sub2_1.method5633();
					local190[local110] = Static47.aClass3_Sub9_Sub2_1.method5583();
				}
				Static202.method3202(local23, local187, local184, local190);
			}
			@Pc(313) int local313;
			@Pc(338) int local338;
			@Pc(279) int[] local279;
			@Pc(303) short[] local303;
			@Pc(328) short[] local328;
			@Pc(369) long local369;
			if ((local27 & 0x40000) != 0) {
				local87 = local23.aClass309_1.anIntArray552.length;
				local91 = 0;
				if (local23.aClass309_1.aShortArray126 != null) {
					local91 = local23.aClass309_1.aShortArray126.length;
				}
				if (local23.aClass309_1.aShortArray128 != null) {
					local91 = local23.aClass309_1.aShortArray128.length;
				}
				local104 = Static47.aClass3_Sub9_Sub2_1.method5602();
				if ((local104 & 0x1) != 1) {
					local279 = null;
					if ((local104 & 0x2) == 2) {
						local279 = new int[local87];
						for (local200 = 0; local200 < local87; local200++) {
							local279[local200] = Static47.aClass3_Sub9_Sub2_1.method5583();
						}
					}
					local303 = null;
					if ((local104 & 0x4) == 4) {
						local303 = new short[local91];
						for (local313 = 0; local313 < local91; local313++) {
							local303[local313] = (short) Static47.aClass3_Sub9_Sub2_1.method5628();
						}
					}
					local328 = null;
					if ((local104 & 0x8) == 8) {
						local328 = new short[0];
						for (local338 = 0; local338 < 0; local338++) {
							local328[local338] = (short) Static47.aClass3_Sub9_Sub2_1.method5583();
						}
					}
					local369 = (long) local15 | (long) local23.anInt10240++ << 32;
					new Class101(local369, local279, local303, local328);
				}
			}
			if ((local27 & 0x20000) != 0) {
				local23.aString108 = Static47.aClass3_Sub9_Sub2_1.method5607();
				if ("".equals(local23.aString108) || local23.aString108.equals(local23.aClass309_1.aString86)) {
					local23.aString108 = local23.aClass309_1.aString86;
				}
			}
			if ((local27 & 0x40) != 0) {
				local23.anInt10185 = Static47.aClass3_Sub9_Sub2_1.method5583();
				if (local23.anInt10185 == 65535) {
					local23.anInt10185 = -1;
				}
			}
			if ((local27 & 0x10) != 0) {
				@Pc(432) int[] local432 = new int[4];
				for (local91 = 0; local91 < 4; local91++) {
					local432[local91] = Static47.aClass3_Sub9_Sub2_1.method5628();
					if (local432[local91] == 65535) {
						local432[local91] = -1;
					}
				}
				local100 = Static47.aClass3_Sub9_Sub2_1.method5594();
				Static217.method3798(local432, local100, local23);
			}
			if ((local27 & 0x80000) != 0) {
				local23.anInt10238 = Static47.aClass3_Sub9_Sub2_1.method5634();
				if (local23.anInt10238 == 65535) {
					local23.anInt10238 = local23.aClass309_1.anInt8850;
				}
			}
			if ((local27 & 0x1000) != 0) {
				local87 = Static47.aClass3_Sub9_Sub2_1.method5634();
				local23.anInt10212 = Static47.aClass3_Sub9_Sub2_1.method5626();
				local23.anInt10213 = Static47.aClass3_Sub9_Sub2_1.method5626();
				local23.aBoolean774 = (local87 & 0x8000) != 0;
				local23.anInt10201 = local87 & 0x7FFF;
				local23.anInt10169 = Static304.anInt8391 + local23.anInt10201 + local23.anInt10212;
			}
			if ((local27 & 0x4) != 0) {
				local87 = Static47.aClass3_Sub9_Sub2_1.method5602();
				if (local87 > 0) {
					for (local91 = 0; local91 < local87; local91++) {
						local104 = -1;
						local110 = -1;
						local200 = -1;
						local100 = Static47.aClass3_Sub9_Sub2_1.method5606();
						if (local100 == 32767) {
							local100 = Static47.aClass3_Sub9_Sub2_1.method5606();
							local110 = Static47.aClass3_Sub9_Sub2_1.method5606();
							local104 = Static47.aClass3_Sub9_Sub2_1.method5606();
							local200 = Static47.aClass3_Sub9_Sub2_1.method5606();
						} else if (local100 == 32766) {
							local100 = -1;
						} else {
							local110 = Static47.aClass3_Sub9_Sub2_1.method5606();
						}
						local313 = Static47.aClass3_Sub9_Sub2_1.method5606();
						local338 = Static47.aClass3_Sub9_Sub2_1.method5602();
						local23.method8632(local104, Static304.anInt8391, local100, local110, local338, local313, local200);
					}
				}
			}
			if ((local27 & 0x800) != 0) {
				local23.aByte132 = Static47.aClass3_Sub9_Sub2_1.method5631();
				local23.aByte130 = Static47.aClass3_Sub9_Sub2_1.method5631();
				local23.aByte133 = Static47.aClass3_Sub9_Sub2_1.method5619();
				local23.aByte131 = (byte) Static47.aClass3_Sub9_Sub2_1.method5633();
				local23.anInt10207 = Static304.anInt8391 + Static47.aClass3_Sub9_Sub2_1.method5610();
				local23.anInt10184 = Static304.anInt8391 + Static47.aClass3_Sub9_Sub2_1.method5610();
			}
			if ((local27 & 0x8000) != 0) {
				local23.anInt10190 = Static47.aClass3_Sub9_Sub2_1.method5580();
				local23.anInt10199 = Static47.aClass3_Sub9_Sub2_1.method5619();
				local23.anInt10222 = Static47.aClass3_Sub9_Sub2_1.method5580();
				local23.anInt10183 = Static47.aClass3_Sub9_Sub2_1.method5619();
				local23.anInt10171 = Static47.aClass3_Sub9_Sub2_1.method5583() + Static304.anInt8391;
				local23.anInt10221 = Static47.aClass3_Sub9_Sub2_1.method5583() + Static304.anInt8391;
				local23.anInt10168 = Static47.aClass3_Sub9_Sub2_1.method5594();
				local23.anInt10190 += local23.anIntArray675[0];
				local23.anInt10183 += local23.anIntArray676[0];
				local23.anInt10222 += local23.anIntArray675[0];
				local23.anInt10236 = 1;
				local23.anInt10199 += local23.anIntArray676[0];
				local23.anInt10234 = 0;
			}
			if ((local27 & 0x200) != 0) {
				local87 = local23.aClass309_1.anIntArray551.length;
				local91 = 0;
				if (local23.aClass309_1.aShortArray126 != null) {
					local91 = local23.aClass309_1.aShortArray126.length;
				}
				local100 = 0;
				if (local23.aClass309_1.aShortArray128 != null) {
					local100 = local23.aClass309_1.aShortArray128.length;
				}
				local104 = Static47.aClass3_Sub9_Sub2_1.method5626();
				if ((local104 & 0x1) == 1) {
					local23.aClass101_1 = null;
				} else {
					local279 = null;
					if ((local104 & 0x2) == 2) {
						local279 = new int[local87];
						for (local200 = 0; local200 < local87; local200++) {
							local279[local200] = Static47.aClass3_Sub9_Sub2_1.method5628();
						}
					}
					local303 = null;
					if ((local104 & 0x4) == 4) {
						local303 = new short[local91];
						for (local313 = 0; local313 < local91; local313++) {
							local303[local313] = (short) Static47.aClass3_Sub9_Sub2_1.method5610();
						}
					}
					local328 = null;
					if ((local104 & 0x8) == 8) {
						local328 = new short[local100];
						for (local338 = 0; local338 < local100; local338++) {
							local328[local338] = (short) Static47.aClass3_Sub9_Sub2_1.method5634();
						}
					}
					local369 = (long) local23.anInt10245++ << 32 | (long) local15;
					local23.aClass101_1 = new Class101(local369, local279, local303, local328);
				}
			}
			if ((local27 & 0x400) != 0) {
				local87 = Static47.aClass3_Sub9_Sub2_1.method5634();
				if (local87 == 65535) {
					local87 = -1;
				}
				local91 = Static47.aClass3_Sub9_Sub2_1.method5597();
				local100 = Static47.aClass3_Sub9_Sub2_1.method5633();
				local104 = local100 & 0x7;
				local110 = local100 >> 3 & 0xF;
				if (local110 == 15) {
					local110 = -1;
				}
				local23.method8626(local104, local91, local110, local87, 1);
			}
			if ((local27 & 0x20) != 0) {
				local23.aString107 = Static47.aClass3_Sub9_Sub2_1.method5607();
				local23.anInt10187 = 100;
			}
			if ((local27 & 0x2) != 0) {
				if (local23.aClass309_1.method7589()) {
					Static250.method6647(local23);
				}
				local23.method8644(Static153.aClass2_1.method23(Static47.aClass3_Sub9_Sub2_1.method5634()));
				local23.method8630(local23.aClass309_1.anInt8833);
				local23.anInt10196 = local23.aClass309_1.anInt8862 << 3;
				if (local23.aClass309_1.method7589()) {
					Static280.method4567((Class9_Sub2_Sub1_Sub2_Sub1) null, 0, local23, local23.anIntArray675[0], local23.aByte127, (Class330) null, local23.anIntArray676[0]);
				}
			}
			if ((local27 & 0x2000) != 0) {
				local87 = Static47.aClass3_Sub9_Sub2_1.method5602();
				local184 = new int[local87];
				local187 = new int[local87];
				for (local104 = 0; local104 < local87; local104++) {
					local110 = Static47.aClass3_Sub9_Sub2_1.method5634();
					if ((local110 & 0xC000) == 49152) {
						local200 = Static47.aClass3_Sub9_Sub2_1.method5628();
						local184[local104] = local110 << 16 | local200;
					} else {
						local184[local104] = local110;
					}
					local187[local104] = Static47.aClass3_Sub9_Sub2_1.method5610();
				}
				local23.method8625(local184, local187);
			}
		}
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(IBLjava/lang/String;Lclient!rp;)Lclient!jg;")
	public static Class174 method708(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Class298 arg2) {
		if (arg0 == 0) {
			return arg2.method7283(arg1);
		}
		@Pc(36) Class174 local36;
		if (arg0 == 1) {
			try {
				Static652.method1819(Static303.anApplet3, "openjs", new Object[] { (new URL(Static303.anApplet3.getCodeBase(), arg1)).toString() });
				local36 = new Class174();
				local36.anInt5121 = 1;
				return local36;
			} catch (@Pc(42) Throwable local42) {
				local36 = new Class174();
				local36.anInt5121 = 2;
				return local36;
			}
		} else if (arg0 == 2) {
			try {
				Static303.anApplet3.getAppletContext().showDocument(new URL(Static303.anApplet3.getCodeBase(), arg1), "_blank");
				local36 = new Class174();
				local36.anInt5121 = 1;
				return local36;
			} catch (@Pc(76) Exception local76) {
				local36 = new Class174();
				local36.anInt5121 = 2;
				return local36;
			}
		} else if (arg0 == 3) {
			try {
				Static652.method1818("loggedout", Static303.anApplet3);
			} catch (@Pc(97) Throwable local97) {
			}
			try {
				Static303.anApplet3.getAppletContext().showDocument(new URL(Static303.anApplet3.getCodeBase(), arg1), "_top");
				local36 = new Class174();
				local36.anInt5121 = 1;
				return local36;
			} catch (@Pc(117) Exception local117) {
				local36 = new Class174();
				local36.anInt5121 = 2;
				return local36;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}
}
