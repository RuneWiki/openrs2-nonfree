import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!le", name = "T", descriptor = "Lclient!dg;")
	public static Class2_Sub1_Sub1_Sub3_Sub1 aClass2_Sub1_Sub1_Sub3_Sub1_1;

	@OriginalMember(owner = "client!le", name = "bb", descriptor = "I")
	public static int anInt2977;

	@OriginalMember(owner = "client!le", name = "db", descriptor = "[I")
	public static int[] anIntArray342;

	@OriginalMember(owner = "client!le", name = "fb", descriptor = "I")
	public static int anInt2979;

	@OriginalMember(owner = "client!le", name = "ab", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_839 = Static158.method3034("Password: ");

	@OriginalMember(owner = "client!le", name = "U", descriptor = "Lclient!ob;")
	public static Class60 aClass60_837 = aClass60_839;

	@OriginalMember(owner = "client!le", name = "jb", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_843 = Static158.method3034("Please use a different world)3");

	@OriginalMember(owner = "client!le", name = "V", descriptor = "Lclient!ob;")
	public static Class60 aClass60_838 = aClass60_843;

	@OriginalMember(owner = "client!le", name = "X", descriptor = "Z")
	public static boolean aBoolean115 = false;

	@OriginalMember(owner = "client!le", name = "cb", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_840 = Static158.method3034("<col=ff9040>");

	@OriginalMember(owner = "client!le", name = "gb", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_841 = Static158.method3034("<col=ff3000>");

	@OriginalMember(owner = "client!le", name = "hb", descriptor = "Lclient!ob;")
	public static Class60 aClass60_842 = aClass60_843;

	@OriginalMember(owner = "client!le", name = "i", descriptor = "(I)V")
	public static void method2356() {
		try {
			if (Static42.anInt1306 == 0) {
				if (Static29.aClass66_10 != null) {
					Static29.aClass66_10.method2834();
					Static29.aClass66_10 = null;
				}
				Static123.aClass25_31 = null;
				Static155.anInt3943 = 0;
				Static42.anInt1306 = 1;
				Static62.aBoolean79 = false;
			}
			if (Static42.anInt1306 == 1) {
				if (Static123.aClass25_31 == null) {
					Static123.aClass25_31 = Static65.aClass81_1.method3156(Static50.aString1, Static147.anInt3823);
				}
				if (Static123.aClass25_31.anInt1695 == 2) {
					throw new IOException();
				}
				if (Static123.aClass25_31.anInt1695 == 1) {
					Static29.aClass66_10 = new Class66((Socket) Static123.aClass25_31.anObject2, Static65.aClass81_1);
					Static42.anInt1306 = 2;
					Static123.aClass25_31 = null;
				}
			}
			if (Static42.anInt1306 == 2) {
				@Pc(82) long local82 = Static152.aLong95 = Static95.aClass60_784.method2691();
				Static7.aClass2_Sub3_Sub1_43.anInt273 = 0;
				@Pc(92) int local92 = (int) (local82 >> 16 & 0x1FL);
				Static7.aClass2_Sub3_Sub1_43.method224(14);
				Static7.aClass2_Sub3_Sub1_43.method224(local92);
				Static29.aClass66_10.method2838(Static7.aClass2_Sub3_Sub1_43.aByteArray4, 2);
				Static139.aClass2_Sub3_Sub1_32.anInt273 = 0;
				Static42.anInt1306 = 3;
			}
			@Pc(129) int local129;
			if (Static42.anInt1306 == 3) {
				if (Static31.aClass8_1 != null) {
					Static31.aClass8_1.method2795();
				}
				if (Static113.aClass8_2 != null) {
					Static113.aClass8_2.method2795();
				}
				local129 = Static29.aClass66_10.method2835();
				if (Static31.aClass8_1 != null) {
					Static31.aClass8_1.method2795();
				}
				if (Static113.aClass8_2 != null) {
					Static113.aClass8_2.method2795();
				}
				if (local129 != 0) {
					Static145.method2927(local129);
					return;
				}
				Static42.anInt1306 = 4;
				Static139.aClass2_Sub3_Sub1_32.anInt273 = 0;
			}
			if (Static42.anInt1306 == 4) {
				if (Static139.aClass2_Sub3_Sub1_32.anInt273 < 8) {
					local129 = Static29.aClass66_10.method2841();
					if (8 - Static139.aClass2_Sub3_Sub1_32.anInt273 < local129) {
						local129 = 8 - Static139.aClass2_Sub3_Sub1_32.anInt273;
					}
					if (local129 > 0) {
						Static29.aClass66_10.method2839(local129, Static139.aClass2_Sub3_Sub1_32.aByteArray4, Static139.aClass2_Sub3_Sub1_32.anInt273);
						Static139.aClass2_Sub3_Sub1_32.anInt273 += local129;
					}
				}
				if (Static139.aClass2_Sub3_Sub1_32.anInt273 == 8) {
					Static139.aClass2_Sub3_Sub1_32.anInt273 = 0;
					Static48.aLong40 = Static139.aClass2_Sub3_Sub1_32.method204();
					Static42.anInt1306 = 5;
				}
			}
			if (Static42.anInt1306 == 5) {
				Static7.aClass2_Sub3_Sub1_43.anInt273 = 0;
				@Pc(226) int[] local226 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static48.aLong40 >> 32), (int) Static48.aLong40 };
				Static7.aClass2_Sub3_Sub1_43.method224(10);
				Static7.aClass2_Sub3_Sub1_43.method197(local226[0]);
				Static7.aClass2_Sub3_Sub1_43.method197(local226[1]);
				Static7.aClass2_Sub3_Sub1_43.method197(local226[2]);
				Static7.aClass2_Sub3_Sub1_43.method197(local226[3]);
				Static7.aClass2_Sub3_Sub1_43.method205(Static95.aClass60_784.method2691());
				Static7.aClass2_Sub3_Sub1_43.method226(Static95.aClass60_778);
				Static7.aClass2_Sub3_Sub1_43.method207(Static164.aBigInteger2, Static72.aBigInteger1);
				Static188.aClass2_Sub3_Sub1_40.anInt273 = 0;
				if (Static144.anInt3778 == 40) {
					Static188.aClass2_Sub3_Sub1_40.method224(18);
				} else {
					Static188.aClass2_Sub3_Sub1_40.method224(16);
				}
				Static188.aClass2_Sub3_Sub1_40.method224(Static7.aClass2_Sub3_Sub1_43.anInt273 + Static73.method1672(Static79.aClass60_642) + 125);
				Static188.aClass2_Sub3_Sub1_40.method197(490);
				Static188.aClass2_Sub3_Sub1_40.method224(Static8.aBoolean3 ? 1 : 0);
				Static190.method3484(Static188.aClass2_Sub3_Sub1_40);
				Static188.aClass2_Sub3_Sub1_40.method226(Static79.aClass60_642);
				Static188.aClass2_Sub3_Sub1_40.method197(Static143.anInt3754);
				Static188.aClass2_Sub3_Sub1_40.method197(Static24.aClass13_Sub1_2.anInt684);
				Static188.aClass2_Sub3_Sub1_40.method197(Static160.aClass13_Sub1_7.anInt684);
				Static188.aClass2_Sub3_Sub1_40.method197(Static65.aClass13_Sub1_8.anInt684);
				Static188.aClass2_Sub3_Sub1_40.method197(Static5.aClass13_Sub1_1.anInt684);
				Static188.aClass2_Sub3_Sub1_40.method197(Static73.aClass13_Sub1_10.anInt684);
				Static188.aClass2_Sub3_Sub1_40.method197(Static113.aClass13_Sub1_15.anInt684);
				Static188.aClass2_Sub3_Sub1_40.method197(Static142.aClass13_Sub1_20.anInt684);
				Static188.aClass2_Sub3_Sub1_40.method197(Static143.aClass13_Sub1_21.anInt684);
				Static188.aClass2_Sub3_Sub1_40.method197(Static99.aClass13_Sub1_13.anInt684);
				Static188.aClass2_Sub3_Sub1_40.method197(Static134.aClass13_Sub1_17.anInt684);
				Static188.aClass2_Sub3_Sub1_40.method197(Static56.aClass13_Sub1_3.anInt684);
				Static188.aClass2_Sub3_Sub1_40.method197(Static147.aClass13_Sub1_23.anInt684);
				Static188.aClass2_Sub3_Sub1_40.method197(Static88.aClass13_Sub1_11.anInt684);
				Static188.aClass2_Sub3_Sub1_40.method197(Static188.aClass13_Sub1_27.anInt684);
				Static188.aClass2_Sub3_Sub1_40.method197(Static141.aClass13_Sub1_19.anInt684);
				Static188.aClass2_Sub3_Sub1_40.method197(Static194.aClass13_Sub1_28.anInt684);
				Static188.aClass2_Sub3_Sub1_40.method197(Static68.aClass13_Sub1_9.anInt684);
				Static188.aClass2_Sub3_Sub1_40.method197(Static167.aClass13_Sub1_24.anInt684);
				Static188.aClass2_Sub3_Sub1_40.method197(Static98.aClass13_Sub1_12.anInt684);
				Static188.aClass2_Sub3_Sub1_40.method197(Static129.aClass13_Sub1_16.anInt684);
				Static188.aClass2_Sub3_Sub1_40.method197(Static112.aClass13_Sub1_14.anInt684);
				Static188.aClass2_Sub3_Sub1_40.method197(Static71.aClass13_Sub1_25.anInt684);
				Static188.aClass2_Sub3_Sub1_40.method197(Static136.aClass13_Sub1_18.anInt684);
				Static188.aClass2_Sub3_Sub1_40.method214(Static7.aClass2_Sub3_Sub1_43.anInt273, Static7.aClass2_Sub3_Sub1_43.aByteArray4);
				Static29.aClass66_10.method2838(Static188.aClass2_Sub3_Sub1_40.aByteArray4, Static188.aClass2_Sub3_Sub1_40.anInt273);
				Static7.aClass2_Sub3_Sub1_43.method252(local226);
				for (@Pc(488) int local488 = 0; local488 < 4; local488++) {
					local226[local488] += 50;
				}
				Static139.aClass2_Sub3_Sub1_32.method252(local226);
				Static42.anInt1306 = 6;
			}
			if (Static42.anInt1306 == 6 && Static29.aClass66_10.method2841() > 0) {
				local129 = Static29.aClass66_10.method2835();
				if (local129 == 21 && Static144.anInt3778 == 20) {
					Static42.anInt1306 = 7;
				} else if (local129 == 2) {
					Static42.anInt1306 = 9;
				} else if (local129 == 15 && Static144.anInt3778 == 40) {
					Static82.method1930();
					return;
				} else if (local129 == 23 && Static26.anInt785 < 1) {
					Static42.anInt1306 = 0;
					Static26.anInt785++;
				} else {
					Static145.method2927(local129);
					return;
				}
			}
			if (Static42.anInt1306 == 7 && Static29.aClass66_10.method2841() > 0) {
				Static21.anInt609 = (Static29.aClass66_10.method2835() + 3) * 60;
				Static42.anInt1306 = 8;
			}
			if (Static42.anInt1306 == 8) {
				Static155.anInt3943 = 0;
				Static21.method473(Static193.method3536(new Class60[] { Static72.method1661(Static21.anInt609 / 60), Static8.aClass60_77 }), Static52.aClass60_375, Static155.aClass60_1062);
				if (--Static21.anInt609 <= 0) {
					Static42.anInt1306 = 0;
				}
			} else {
				if (Static42.anInt1306 == 9 && Static29.aClass66_10.method2841() >= 9) {
					Static2.anInt4174 = Static29.aClass66_10.method2835();
					Static27.anInt836 = Static29.aClass66_10.method2835();
					Static167.aBoolean162 = Static29.aClass66_10.method2835() == 1;
					Static89.anInt2601 = Static29.aClass66_10.method2835();
					Static89.anInt2601 <<= 0x8;
					Static89.anInt2601 += Static29.aClass66_10.method2835();
					Static116.anInt3222 = Static29.aClass66_10.method2835();
					Static29.aClass66_10.method2839(1, Static139.aClass2_Sub3_Sub1_32.aByteArray4, 0);
					Static139.aClass2_Sub3_Sub1_32.anInt273 = 0;
					Static62.anInt1922 = Static139.aClass2_Sub3_Sub1_32.method251();
					Static29.aClass66_10.method2839(2, Static139.aClass2_Sub3_Sub1_32.aByteArray4, 0);
					Static139.aClass2_Sub3_Sub1_32.anInt273 = 0;
					Static168.anInt4121 = Static139.aClass2_Sub3_Sub1_32.method234();
					Static42.anInt1306 = 10;
				}
				if (Static42.anInt1306 != 10) {
					Static155.anInt3943++;
					if (Static155.anInt3943 > 2000) {
						if (Static26.anInt785 < 1) {
							Static26.anInt785++;
							Static42.anInt1306 = 0;
							if (Static147.anInt3823 == Static65.anInt1998) {
								Static147.anInt3823 = Static152.anInt2802;
							} else {
								Static147.anInt3823 = Static65.anInt1998;
							}
						} else {
							Static145.method2927(-3);
						}
					}
				} else if (Static29.aClass66_10.method2841() >= Static168.anInt4121) {
					Static139.aClass2_Sub3_Sub1_32.anInt273 = 0;
					Static29.aClass66_10.method2839(Static168.anInt4121, Static139.aClass2_Sub3_Sub1_32.aByteArray4, 0);
					Static42.method915();
					Static30.anInt898 = -1;
					Static57.method1339(false);
					Static62.anInt1922 = -1;
				}
			}
		} catch (@Pc(779) IOException local779) {
			if (Static26.anInt785 < 1) {
				Static26.anInt785++;
				Static42.anInt1306 = 0;
				if (Static147.anInt3823 == Static65.anInt1998) {
					Static147.anInt3823 = Static152.anInt2802;
				} else {
					Static147.anInt3823 = Static65.anInt1998;
				}
			} else {
				Static145.method2927(-2);
			}
		}
	}

	@OriginalMember(owner = "client!le", name = "c", descriptor = "(II)Lclient!ce;")
	public static Class2_Sub1_Sub5 method2357(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub1_Sub5 local10 = (Class2_Sub1_Sub5) Static122.aClass89_47.method3437((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(26) byte[] local26 = Static10.aClass13_5.method521(Static52.method1234(arg0), Static156.method3014(arg0));
		local10 = new Class2_Sub1_Sub5();
		if (local26 != null) {
			local10.method636(new Class2_Sub3(local26));
		}
		local10.method640();
		Static122.aClass89_47.method3432(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!le", name = "j", descriptor = "(I)V")
	public static void method2358() {
		@Pc(6) int local6 = Static149.anInt3852 + aClass2_Sub1_Sub1_Sub3_Sub1_1.anInt3302;
		if (Static57.aBooleanArray7[96]) {
			Static3.anInt57 += (-Static3.anInt57 - 24) / 2;
		} else if (Static57.aBooleanArray7[97]) {
			Static3.anInt57 += (24 - Static3.anInt57) / 2;
		} else {
			Static3.anInt57 /= 2;
		}
		Static188.anInt4484 = Static3.anInt57 / 2 + Static188.anInt4484 & 0x7FF;
		if (Static57.aBooleanArray7[98]) {
			Static183.anInt4439 += (12 - Static183.anInt4439) / 2;
		} else if (Static57.aBooleanArray7[99]) {
			Static183.anInt4439 += (-Static183.anInt4439 - 12) / 2;
		} else {
			Static183.anInt4439 /= 2;
		}
		@Pc(90) int local90 = aClass2_Sub1_Sub1_Sub3_Sub1_1.anInt3273 + Static1.anInt1;
		if (Static91.anInt2663 - local6 < -500 || Static91.anInt2663 - local6 > 500 || Static197.anInt4652 - local90 < -500 || Static197.anInt4652 - local90 > 500) {
			Static91.anInt2663 = local6;
			Static197.anInt4652 = local90;
		}
		Static138.anInt686 += Static183.anInt4439 / 2;
		if (Static138.anInt686 < 128) {
			Static138.anInt686 = 128;
		}
		if (local6 != Static91.anInt2663) {
			Static91.anInt2663 += (local6 - Static91.anInt2663) / 16;
		}
		@Pc(150) int local150 = Static91.anInt2663 >> 7;
		if (Static138.anInt686 > 383) {
			Static138.anInt686 = 383;
		}
		@Pc(159) int local159 = 0;
		if (Static197.anInt4652 != local90) {
			Static197.anInt4652 += (local90 - Static197.anInt4652) / 16;
		}
		@Pc(175) int local175 = Static197.anInt4652 >> 7;
		@Pc(181) int local181 = Static182.method3393(Static62.anInt1923, Static91.anInt2663, Static197.anInt4652);
		@Pc(201) int local201;
		if (local150 > 3 && local175 > 3 && local150 < 100 && local175 < 100) {
			for (local201 = local150 - 4; local201 <= local150 + 4; local201++) {
				for (@Pc(207) int local207 = local175 - 4; local207 <= local175 + 4; local207++) {
					@Pc(211) int local211 = Static62.anInt1923;
					if (local211 < 3 && (Static147.aByteArrayArrayArray36[1][local201][local207] & 0x2) == 2) {
						local211++;
					}
					@Pc(240) int local240 = local181 - Static32.anIntArrayArrayArray4[local211][local201][local207];
					if (local240 > local159) {
						local159 = local240;
					}
				}
			}
		}
		local201 = local159 * 192;
		if (local201 > 98048) {
			local201 = 98048;
		}
		if (local201 < 32768) {
			local201 = 32768;
		}
		if (Static55.anInt1772 < local201) {
			Static55.anInt1772 += (local201 - Static55.anInt1772) / 24;
		} else if (Static55.anInt1772 > local201) {
			Static55.anInt1772 += (local201 - Static55.anInt1772) / 80;
			return;
		}
	}
}
