import jagex3.jagmisc.jagmisc;
import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static550 {

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "I")
	public static int anInt9203 = 0;

	@OriginalMember(owner = "client!ve", name = "e", descriptor = "Lclient!lh;")
	public static final Class208 aClass208_105 = new Class208(77, 3);

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)I")
	public static int method7494() {
		@Pc(10) int local10;
		if (!Static86.aClass1_Sub30_Sub1_1.aBoolean482) {
			for (local10 = 0; local10 < Static149.anInt2839; local10++) {
				if (Static294.anInterface14Array2[local10].method6441() == 's' || Static294.anInterface14Array2[local10].method6441() == 'S') {
					Static86.aClass1_Sub30_Sub1_1.aBoolean482 = true;
					break;
				}
			}
		}
		@Pc(51) int local51;
		if (Static361.aClass246_2 == Static203.aClass246_1) {
			@Pc(42) Runtime local42 = Runtime.getRuntime();
			local51 = (int) ((local42.totalMemory() - local42.freeMemory()) / 1024L);
			@Pc(54) long local54 = Static480.method6650();
			if (Static303.aLong137 == 0L) {
				Static303.aLong137 = local54;
			}
			if (local51 > 16384 && local54 - Static303.aLong137 < 5000L) {
				if (local54 - Static110.aLong56 > 1000L) {
					System.gc();
					Static110.aLong56 = local54;
				}
				return 0;
			}
		}
		if (Static203.aClass246_1 == Static361.aClass246_3) {
			if (Static10.aClass65_1 == null) {
				Static10.aClass65_1 = new Class65(Static571.aClass205_3, Static175.aClass228_2, Static300.aBigInteger9, Static490.aBigInteger8);
			}
			if (!Static10.aClass65_1.method1453()) {
				return 0;
			}
			Static541.method7360(0, null);
			Static442.aBoolean591 = !Static547.method7471();
			Static453.aClass308_195 = Static486.method6700(false, Static442.aBoolean591 ? 34 : 32);
			Static570.aClass308_189 = Static486.method6700(false, 33);
			Static77.aClass308_183 = Static486.method6700(false, 13);
		}
		if (Static361.aClass246_4 == Static203.aClass246_1) {
			Static570.aClass308_189.method6535();
			local10 = Static578.aClass156_Sub1Array2[33].method4697();
			local10 += Static578.aClass156_Sub1Array2[Static442.aBoolean591 ? 34 : 32].method4697();
			local10 += Static578.aClass156_Sub1Array2[13].method4697();
			local10 += Static570.aClass308_189.method6562();
			if (local10 != 400) {
				return local10 / 4;
			}
			Static425.anInt7628 = Static453.aClass308_195.method6567();
			Static358.anInt9362 = Static570.aClass308_189.method6567();
			Static102.method1481(Static453.aClass308_195);
			local51 = Static86.aClass1_Sub30_Sub1_1.anInt6180;
			Static587.aClass169_6 = new Class169(Static101.aClass42_1, Static161.anInt3095, Static570.aClass308_189);
			@Pc(212) int[] local212 = Static587.aClass169_6.method3539(local51);
			@Pc(218) Class67 local218 = new Class67(Static453.aClass308_195, Static77.aClass308_183);
			if (local212.length > 0) {
				Static432.anInterface24Array1 = new Interface24[local212.length];
				for (@Pc(227) int local227 = 0; local227 < Static432.anInterface24Array1.length; local227++) {
					Static432.anInterface24Array1[local227] = new Class45(Static587.aClass169_6.method3541(local212[local227]), local218);
				}
			}
		}
		if (Static361.aClass246_5 == Static203.aClass246_1) {
			Static294.method4381(Static77.aClass308_183, Static453.aClass308_195, Static63.method1015());
		}
		if (Static203.aClass246_1 == Static361.aClass246_6) {
			local10 = Static565.method7635();
			local51 = Static570.method7680();
			if (local51 > local10) {
				return local10 * 100 / local51;
			}
		}
		if (Static203.aClass246_1 == Static361.aClass246_7) {
			if (Static432.anInterface24Array1 != null && Static432.anInterface24Array1.length > 0) {
				if (Static432.anInterface24Array1[0].method2171() < 100) {
					return 0;
				}
				if (Static432.anInterface24Array1.length > 1 && Static587.aClass169_6.method3540() && Static432.anInterface24Array1[1].method2171() < 100) {
					return 0;
				}
			}
			Static131.method2298(Static31.aClass78_18);
			Static1.method36(Static31.aClass78_18);
			Static318.method4726(1);
		}
		if (Static361.aClass246_8 == Static203.aClass246_1) {
			for (local10 = 0; local10 < 4; local10++) {
				Static590.aClass240Array1[local10] = Static403.method5806(Static458.anInt9736, Static378.anInt6747);
			}
		}
		if (Static203.aClass246_1 == Static361.aClass246_9) {
			Static121.aClass308_48 = Static486.method6700(false, 8);
			Static443.aClass308_158 = Static486.method6700(false, 0);
			Static118.aClass308_46 = Static486.method6700(false, 1);
			Static298.aClass308_106 = Static486.method6700(false, 2);
			Static227.aClass308_91 = Static486.method6700(false, 3);
			Static341.aClass308_120 = Static486.method6700(false, 4);
			Static141.aClass308_56 = Static486.method6700(true, 5);
			Static51.aClass308_24 = Static486.method6700(true, 6);
			Static184.aClass308_76 = Static486.method6700(false, 7);
			Static528.aClass308_179 = Static486.method6700(false, 9);
			Static294.aClass308_104 = Static486.method6700(false, 10);
			Static303.aClass308_109 = Static486.method6700(false, 11);
			Static220.aClass308_111 = Static486.method6700(false, 12);
			Static133.aClass308_53 = Static486.method6700(false, 14);
			Static218.aClass308_86 = Static486.method6700(false, 15);
			Static411.aClass308_147 = Static486.method6700(false, 16);
			Static379.aClass308_135 = Static486.method6700(false, 17);
			Static575.aClass308_192 = Static486.method6700(false, 18);
			Static161.aClass308_66 = Static486.method6700(false, 19);
			Static506.aClass308_171 = Static486.method6700(false, 20);
			Static231.aClass308_94 = Static486.method6700(false, 21);
			Static559.aClass308_187 = Static486.method6700(false, 22);
			Static193.aClass308_80 = Static486.method6700(true, 23);
			Static438.aClass308_156 = Static486.method6700(false, 24);
			Static485.aClass308_165 = Static486.method6700(false, 25);
			Static106.aClass308_41 = Static486.method6700(true, 26);
			Static584.aClass308_194 = Static486.method6700(false, 27);
			Static141.aClass308_57 = Static486.method6700(true, 28);
			Static563.aClass308_188 = Static486.method6700(false, 29);
			Static155.aClass308_60 = Static486.method6700(true, 30);
			Static461.aClass308_163 = Static486.method6700(true, 31);
		}
		if (Static203.aClass246_1 == Static361.aClass246_10) {
			local10 = 0;
			for (local51 = 0; local51 < 35; local51++) {
				if (Static578.aClass156_Sub1Array2[local51] != null) {
					local10 += Static578.aClass156_Sub1Array2[local51].method4697() * Static354.anIntArray387[local51] / 100;
				}
			}
			if (local10 != 100) {
				if (Static427.anInt7667 < 0) {
					Static427.anInt7667 = local10;
				}
				return (local10 - Static427.anInt7667) * 100 / (100 - Static427.anInt7667);
			}
			Static427.method6127(Static121.aClass308_48);
			Static294.method4381(Static77.aClass308_183, Static121.aClass308_48, Static63.method1015());
		}
		if (Static203.aClass246_1 == Static361.aClass246_11) {
			Static341.method5096();
			Static318.method4726(2);
		}
		if (Static361.aClass246_12 == Static203.aClass246_1) {
			Static353.method5270(Static155.aClass308_60, Static361.aClass198_3);
		}
		if (Static361.aClass246_13 == Static203.aClass246_1) {
			local10 = Static248.method1081();
			if (local10 < 100) {
				return local10;
			}
			Static35.method644(Static141.aClass308_57.method6547(1));
			Static468.method6493(Static141.aClass308_57.method6547(3));
		}
		if (Static361.aClass246_14 == Static203.aClass246_1) {
			if (Static155.anInt2940 != -1 && !Static184.aClass308_76.method6545(0, Static155.anInt2940)) {
				return 99;
			}
			Static302.anInterface9_12 = new Class37(Static106.aClass308_41, Static528.aClass308_179, Static121.aClass308_48);
			Static256.aClass263_1 = new Class263(Static101.aClass42_1, Static161.anInt3095, Static298.aClass308_106);
			Static241.aClass340_1 = new Class340(Static101.aClass42_1, Static161.anInt3095, Static298.aClass308_106);
			Static215.aClass18_2 = new Class18(Static101.aClass42_1, Static161.anInt3095, Static298.aClass308_106, Static121.aClass308_48);
			Static108.aClass98_1 = new Class98(Static101.aClass42_1, Static161.anInt3095, Static379.aClass308_135);
			Static7.aClass90_1 = new Class90(Static101.aClass42_1, Static161.anInt3095, Static298.aClass308_106);
			Static441.aClass92_4 = new Class92(Static101.aClass42_1, Static161.anInt3095, Static298.aClass308_106);
			Static423.aClass323_1 = new Class323(Static101.aClass42_1, Static161.anInt3095, Static298.aClass308_106, Static184.aClass308_76);
			Static168.aClass366_1 = new Class366(Static101.aClass42_1, Static161.anInt3095, Static298.aClass308_106);
			Static400.aClass351_1 = new Class351(Static101.aClass42_1, Static161.anInt3095, Static298.aClass308_106);
			Static347.aClass122_4 = new Class122(Static101.aClass42_1, Static161.anInt3095, true, Static411.aClass308_147, Static184.aClass308_76);
			Static144.aClass113_1 = new Class113(Static101.aClass42_1, Static161.anInt3095, Static298.aClass308_106, Static121.aClass308_48);
			Static191.aClass33_2 = new Class33(Static101.aClass42_1, Static161.anInt3095, Static298.aClass308_106, Static121.aClass308_48);
			Static84.aClass242_1 = new Class242(Static101.aClass42_1, Static161.anInt3095, true, Static575.aClass308_192, Static184.aClass308_76);
			Static230.aClass225_1 = new Class225(Static101.aClass42_1, Static161.anInt3095, true, Static256.aClass263_1, Static161.aClass308_66, Static184.aClass308_76);
			Static197.aClass284_1 = new Class284(Static101.aClass42_1, Static161.anInt3095, Static298.aClass308_106);
			Static223.aClass245_1 = new Class245(Static101.aClass42_1, Static161.anInt3095, Static506.aClass308_171, Static443.aClass308_158, Static118.aClass308_46);
			Static544.aClass237_1 = new Class237(Static101.aClass42_1, Static161.anInt3095, Static298.aClass308_106);
			Static40.aClass164_1 = new Class164(Static101.aClass42_1, Static161.anInt3095, Static298.aClass308_106);
			Static583.aClass256_2 = new Class256(Static101.aClass42_1, Static161.anInt3095, Static231.aClass308_94, Static184.aClass308_76);
			Static381.aClass359_1 = new Class359(Static101.aClass42_1, Static161.anInt3095, Static298.aClass308_106);
			Static146.aClass131_1 = new Class131(Static101.aClass42_1, Static161.anInt3095, Static298.aClass308_106);
			Static439.aClass331_7 = new Class331(Static101.aClass42_1, Static161.anInt3095, Static298.aClass308_106);
			Static300.aClass321_3 = new Class321(Static101.aClass42_1, Static161.anInt3095, Static559.aClass308_187);
			Static433.aClass117_2 = new Class117(Static101.aClass42_1, Static161.anInt3095, Static298.aClass308_106);
			Static488.method6722(Static184.aClass308_76, Static227.aClass308_91, Static121.aClass308_48, Static77.aClass308_183);
			Static289.method4340(Static563.aClass308_188);
			Static90.aClass128_7 = new Class128(Static161.anInt3095, Static438.aClass308_156, Static485.aClass308_165);
			Static109.aClass211_1 = new Class211(Static161.anInt3095, Static438.aClass308_156, Static485.aClass308_165, new Class243());
			Static8.method4850();
			Static347.aClass122_4.method2768(!Static86.aClass1_Sub30_Sub1_1.method5029(Static286.anInt5239));
			Static390.aClass353_29 = new Class353();
			Static308.method4625();
			Static233.method3450(Static584.aClass308_194);
			Static517.method7178(Static184.aClass308_76, Static302.anInterface9_12);
			@Pc(895) Class301 local895 = new Class301(Static294.aClass308_104.method6557("", "huffman"));
			Static124.method2218(local895);
			try {
				jagmisc.init();
			} catch (@Pc(902) Throwable local902) {
			}
			Static406.aClass188_1 = Static480.method6651();
			Static170.aClass1_Sub23_1 = new Class1_Sub23(true, Static361.aClass198_3);
		}
		if (Static361.aClass246_16 == Static203.aClass246_1) {
			local10 = Static404.method5814(Static121.aClass308_48) + Static274.method4004(true);
			local51 = Static148.method2486() + Static570.method7680();
			if (local51 > local10) {
				return local10 * 100 / local51;
			}
		}
		if (Static203.aClass246_1 == Static361.aClass246_17) {
			Static287.method3160(Static193.aClass308_80, Static7.aClass90_1, Static441.aClass92_4, Static347.aClass122_4, Static144.aClass113_1, Static191.aClass33_2, Static390.aClass353_29);
		}
		if (Static203.aClass246_1 == Static361.aClass246_18) {
			Static69.aStringArray1 = new String[Static146.aClass131_1.anInt3741];
			Static166.aBooleanArray34 = new boolean[Static439.aClass331_7.anInt8963];
			Static250.anIntArray251 = new int[Static439.aClass331_7.anInt8963];
			for (local51 = 0; local51 < Static439.aClass331_7.anInt8963; local51++) {
				if (Static439.aClass331_7.method7271(local51).anInt876 == 0) {
					Static166.aBooleanArray34[local51] = true;
					anInt9203++;
				}
				Static250.anIntArray251[local51] = -1;
			}
			Static486.method6703();
			Static80.anInt1541 = Static227.aClass308_91.method6558("loginscreen");
			Static142.anInt2751 = Static227.aClass308_91.method6558("lobbyscreen");
			Static141.aClass308_56.method6537(false);
			Static51.aClass308_24.method6537(true);
			Static121.aClass308_48.method6537(true);
			Static77.aClass308_183.method6537(true);
			Static294.aClass308_104.method6537(true);
			Static227.aClass308_91.method6537(true);
			Static169.aBoolean232 = true;
			Static298.aClass308_106.anInt8167 = 2;
			Static379.aClass308_135.anInt8167 = 2;
			Static411.aClass308_147.anInt8167 = 2;
			Static575.aClass308_192.anInt8167 = 2;
			Static161.aClass308_66.anInt8167 = 2;
			Static506.aClass308_171.anInt8167 = 2;
			Static231.aClass308_94.anInt8167 = 2;
		}
		@Pc(1089) Class160 local1089;
		if (Static361.aClass246_19 == Static203.aClass246_1) {
			if (!Static67.method1102(Static80.anInt1541)) {
				return 0;
			}
			for (local51 = 0; local51 < Static115.aClass160ArrayArray1[Static80.anInt1541].length; local51++) {
				local1089 = Static115.aClass160ArrayArray1[Static80.anInt1541][local51];
				if (local1089.anInt4166 == 5 && local1089.anInt4203 != -1) {
					local1089.method3354(Static31.aClass78_18);
				}
			}
		}
		if (Static361.aClass246_20 == Static203.aClass246_1) {
			for (local51 = 0; local51 < Static115.aClass160ArrayArray1[Static80.anInt1541].length; local51++) {
				local1089 = Static115.aClass160ArrayArray1[Static80.anInt1541][local51];
				if (local1089.anInt4166 == 5 && local1089.anInt4203 != -1 && local1089.method3354(Static31.aClass78_18) == null && Static376.aBoolean120) {
					return 0;
				}
			}
		}
		if (Static203.aClass246_1 == Static361.aClass246_21) {
			Static499.method7031(true);
		}
		if (Static203.aClass246_1 == Static361.aClass246_22) {
			Static520.aClass247_5.method5318();
			try {
				Static567.aThread9.join();
			} catch (@Pc(1163) InterruptedException local1163) {
				return 0;
			}
			Static520.aClass247_5 = null;
			Static432.anInterface24Array1 = null;
			Static567.aThread9 = null;
			Static453.aClass308_195 = null;
			Static587.aClass169_6 = null;
			Static570.aClass308_189 = null;
			Static308.method4623();
			Static216.aBoolean283 = Static86.aClass1_Sub30_Sub1_1.aBoolean482;
			Static86.aClass1_Sub30_Sub1_1.aBoolean482 = true;
			Static86.aClass1_Sub30_Sub1_1.method5035(Static361.aClass198_3);
			if (Static216.aBoolean283) {
				Static358.method7632(0);
			} else {
				Static358.method7632(Static86.aClass1_Sub30_Sub1_1.anInt6200);
			}
			Static447.method6284(-1, false, Static86.aClass1_Sub30_Sub1_1.anInt6199, -1);
			Static131.method2298(Static31.aClass78_18);
			Static1.method36(Static31.aClass78_18);
			Static455.method6411(Static31.aClass78_18, Static121.aClass308_48);
			Static392.method5629(Static360.aClass5Array17);
		}
		return Static11.method249();
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ZLclient!r;)V")
	public static void method7495(@OriginalArg(1) Class78 arg0) {
		if (Static406.aBoolean553) {
			Static173.method2775(arg0);
		} else {
			Static332.method4900(arg0);
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(BZLjava/awt/Component;)Lclient!oca;")
	public static Class238 method7496(@OriginalArg(2) Component arg0) {
		try {
			@Pc(24) Constructor local24 = Class.forName("Class238_Sub1").getDeclaredConstructor(Component.class, Boolean.TYPE);
			return (Class238) local24.newInstance(arg0, Boolean.valueOf(true));
		} catch (@Pc(48) Throwable local48) {
			return new Class238_Sub2(arg0, true);
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method7498(@OriginalArg(0) String arg0) {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		@Pc(12) int local12 = arg0.length();
		for (@Pc(19) int local19 = 0; local19 < local12; local19++) {
			@Pc(25) char local25 = arg0.charAt(local19);
			if (local25 == '%' && local19 + 2 < local12) {
				local25 = arg0.charAt(local19 + 1);
				@Pc(98) int local98;
				if (local25 >= '0' && local25 <= '9') {
					local98 = local25 - 48;
				} else if (local25 >= 'a' && local25 <= 'f') {
					local98 = local25 + 10 - 'a';
				} else {
					if (local25 < 'A' || local25 > 'F') {
						local9.append('%');
						continue;
					}
					local98 = local25 + '\n' - 65;
				}
				local25 = arg0.charAt(local19 + 2);
				local98 *= 16;
				if (local25 >= '0' && local25 <= '9') {
					local98 += local25 - '0';
				} else if (local25 >= 'a' && local25 <= 'f') {
					local98 += local25 + '\n' - 97;
				} else {
					if (local25 < 'A' || local25 > 'F') {
						local9.append('%');
						continue;
					}
					local98 += local25 + 10 - 65;
				}
				local19 += 2;
				if (local98 != 0 && Static195.method5288((byte) local98)) {
					local9.append(Static313.method4655((byte) local98));
				}
			} else if (local25 == '+') {
				local9.append(' ');
			} else {
				local9.append(local25);
			}
		}
		return local9.toString();
	}
}
