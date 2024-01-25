import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static510 {

	@OriginalMember(owner = "client!pu", name = "d", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(Lclient!ha;Lclient!d;B)V")
	public static void method6918(@OriginalArg(0) Class22 arg0, @OriginalArg(1) Interface4 arg1) {
		if (Static327.aClass3_Sub7_Sub18_2 == null) {
			return;
		}
		if (Static147.anInt2696 < 10) {
			if (!Static327.aClass182_6.method3953(Static327.aClass3_Sub7_Sub18_2.aString98)) {
				Static147.anInt2696 = Static196.aClass182_65.method3963(Static327.aClass3_Sub7_Sub18_2.aString98) / 10;
				return;
			}
			Static368.method5067();
			Static147.anInt2696 = 10;
		}
		if (Static147.anInt2696 == 10) {
			Static327.anInt1076 = Static327.aClass3_Sub7_Sub18_2.anInt8102 >> 6 << 6;
			Static327.anInt1084 = Static327.aClass3_Sub7_Sub18_2.anInt8097 >> 6 << 6;
			Static327.anInt1079 = (Static327.aClass3_Sub7_Sub18_2.anInt8111 >> 6 << 6) + 64 - Static327.anInt1076;
			Static327.anInt1080 = (Static327.aClass3_Sub7_Sub18_2.anInt8108 >> 6 << 6) + 64 - Static327.anInt1084;
			@Pc(78) int[] local78 = new int[3];
			@Pc(80) int local80 = -1;
			@Pc(82) int local82 = -1;
			if (Static327.aClass3_Sub7_Sub18_2.method6936(Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.aByte139, Static189.anInt3243 + (Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.anInt10695 >> 9), (Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.anInt10694 >> 9) + Static291.anInt4448, local78)) {
				local82 = local78[2] - Static327.anInt1076;
				local80 = local78[1] - Static327.anInt1084;
			}
			if (!Static284.aBoolean288 && local80 >= 0 && Static327.anInt1080 > local80 && local82 >= 0 && Static327.anInt1079 > local82) {
				local80 += (int) (Math.random() * 10.0D) - 5;
				local82 += (int) (Math.random() * 10.0D) - 5;
				Static550.anInt8467 = local80;
				Static90.anInt4562 = local82;
			} else if (Static512.anInt10673 == -1 || Static598.anInt9085 == -1) {
				Static327.aClass3_Sub7_Sub18_2.method6937(Static327.aClass3_Sub7_Sub18_2.anInt8107 & 0x3FFF, Static327.aClass3_Sub7_Sub18_2.anInt8107 >> 14 & 0x3FFF, local78);
				Static550.anInt8467 = local78[1] - Static327.anInt1084;
				Static90.anInt4562 = local78[2] - Static327.anInt1076;
			} else {
				Static327.aClass3_Sub7_Sub18_2.method6937(Static598.anInt9085, Static512.anInt10673, local78);
				if (local78 != null) {
					Static550.anInt8467 = local78[1] - Static327.anInt1084;
					Static90.anInt4562 = local78[2] - Static327.anInt1076;
				}
				Static598.anInt9085 = -1;
				Static512.anInt10673 = -1;
				Static284.aBoolean288 = false;
			}
			if (Static327.aClass3_Sub7_Sub18_2.anInt8101 == 37) {
				Static327.aFloat32 = 3.0F;
				Static327.aFloat31 = 3.0F;
			} else if (Static327.aClass3_Sub7_Sub18_2.anInt8101 == 50) {
				Static327.aFloat32 = 4.0F;
				Static327.aFloat31 = 4.0F;
			} else if (Static327.aClass3_Sub7_Sub18_2.anInt8101 == 75) {
				Static327.aFloat32 = 6.0F;
				Static327.aFloat31 = 6.0F;
			} else if (Static327.aClass3_Sub7_Sub18_2.anInt8101 == 100) {
				Static327.aFloat32 = 8.0F;
				Static327.aFloat31 = 8.0F;
			} else if (Static327.aClass3_Sub7_Sub18_2.anInt8101 == 200) {
				Static327.aFloat32 = 16.0F;
				Static327.aFloat31 = 16.0F;
			} else {
				Static327.aFloat32 = 8.0F;
				Static327.aFloat31 = 8.0F;
			}
			Static327.anInt1072 = (int) Static327.aFloat32 >> 1;
			Static327.aByteArrayArrayArray2 = Static179.method2871(Static327.anInt1072);
			Static400.method5406();
			Static327.method1025();
			Static654.aClass342_80 = new Class342();
			Static327.anInt1071 += (int) (Math.random() * 5.0D) - 2;
			if (Static327.anInt1071 < -8) {
				Static327.anInt1071 = -8;
			}
			if (Static327.anInt1071 > 8) {
				Static327.anInt1071 = 8;
			}
			Static327.anInt1073 += (int) (Math.random() * 5.0D) - 2;
			if (Static327.anInt1073 < -16) {
				Static327.anInt1073 = -16;
			}
			if (Static327.anInt1073 > 16) {
				Static327.anInt1073 = 16;
			}
			Static327.method1012(arg1, Static327.anInt1071 >> 2 << 10, Static327.anInt1073 >> 1);
			Static327.aClass111_2.method2744(1024, 256);
			Static327.aClass68_2.method1957(256, 256);
			Static327.aClass53_2.method1526(4096);
			Static90.aClass98_3.method2480(256);
			Static147.anInt2696 = 20;
		} else if (Static147.anInt2696 == 20) {
			Static315.method4631(true);
			Static327.method1020(arg0, Static327.anInt1071, Static327.anInt1073);
			Static147.anInt2696 = 60;
			Static315.method4631(true);
			Static32.method1057(94);
		} else if (Static147.anInt2696 == 60) {
			if (Static327.aClass182_6.method3973(Static327.aClass3_Sub7_Sub18_2.aString98 + "_staticelements")) {
				if (!Static327.aClass182_6.method3953(Static327.aClass3_Sub7_Sub18_2.aString98 + "_staticelements")) {
					return;
				}
				Static327.aClass377_2 = Static353.method4959(Static5.aBoolean3, Static327.aClass182_6, Static327.aClass3_Sub7_Sub18_2.aString98 + "_staticelements");
			} else {
				Static327.aClass377_2 = new Class377(0);
			}
			Static327.method1008();
			Static147.anInt2696 = 70;
			Static315.method4631(true);
			Static32.method1057(92);
		} else if (Static147.anInt2696 == 70) {
			Static322.aClass193_5 = new Class193(arg0, 11, true, Static508.aCanvas8);
			Static147.anInt2696 = 73;
			Static315.method4631(true);
			Static32.method1057(106);
		} else if (Static147.anInt2696 == 73) {
			Static577.aClass193_7 = new Class193(arg0, 12, true, Static508.aCanvas8);
			Static147.anInt2696 = 76;
			Static315.method4631(true);
			Static32.method1057(100);
		} else if (Static147.anInt2696 == 76) {
			Static720.aClass193_10 = new Class193(arg0, 14, true, Static508.aCanvas8);
			Static147.anInt2696 = 79;
			Static315.method4631(true);
			Static32.method1057(110);
		} else if (Static147.anInt2696 == 79) {
			Static700.aClass193_9 = new Class193(arg0, 17, true, Static508.aCanvas8);
			Static147.anInt2696 = 82;
			Static315.method4631(true);
			Static32.method1057(116);
		} else if (Static147.anInt2696 == 82) {
			Static675.aClass193_8 = new Class193(arg0, 19, true, Static508.aCanvas8);
			Static147.anInt2696 = 85;
			Static315.method4631(true);
			Static32.method1057(125);
		} else if (Static147.anInt2696 == 85) {
			Static146.aClass193_6 = new Class193(arg0, 22, true, Static508.aCanvas8);
			Static147.anInt2696 = 88;
			Static315.method4631(true);
			Static32.method1057(105);
		} else if (Static147.anInt2696 == 88) {
			Static235.aClass193_3 = new Class193(arg0, 26, true, Static508.aCanvas8);
			Static147.anInt2696 = 91;
			Static315.method4631(true);
			Static32.method1057(90);
		} else {
			Static205.aClass193_2 = new Class193(arg0, 30, true, Static508.aCanvas8);
			Static147.anInt2696 = 100;
			Static315.method4631(true);
			Static32.method1057(122);
			System.gc();
		}
	}

	@OriginalMember(owner = "client!pu", name = "b", descriptor = "(I)V")
	public static void method6922() {
		Static13.method500();
		Static347.aBoolean360 = false;
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(Ljava/lang/String;I)[B")
	public static byte[] method6924(@OriginalArg(0) String arg0) {
		@Pc(6) int local6 = arg0.length();
		if (local6 == 0) {
			return new byte[0];
		}
		@Pc(18) int local18 = local6 + 3 & 0xFFFFFFFC;
		@Pc(24) int local24 = local18 / 4 * 3;
		if (local18 - 2 >= local6 || Static340.method4862(arg0.charAt(local18 - 2)) == -1) {
			local24 -= 2;
		} else if (local18 - 1 >= local6 || Static340.method4862(arg0.charAt(local18 - 1)) == -1) {
			local24--;
		}
		@Pc(70) byte[] local70 = new byte[local24];
		Static524.method7017(0, arg0, local70);
		return local70;
	}
}
