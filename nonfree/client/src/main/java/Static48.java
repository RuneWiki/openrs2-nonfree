import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!j", name = "jc", descriptor = "Lclient!wc;")
	public static Class4 aClass4_33;

	@OriginalMember(owner = "client!j", name = "mc", descriptor = "Lclient!wc;")
	public static Class4 aClass4_34;

	@OriginalMember(owner = "client!j", name = "Mb", descriptor = "Lclient!ub;")
	public static Class63 aClass63_1 = new Class63();

	@OriginalMember(owner = "client!j", name = "dc", descriptor = "Lclient!a;")
	private static Class1 aClass1_1568 = Static94.method1596("Accept challenge");

	@OriginalMember(owner = "client!j", name = "ec", descriptor = "Lclient!a;")
	public static Class1 aClass1_1569 = Static94.method1596("Okay");

	@OriginalMember(owner = "client!j", name = "ic", descriptor = "Lclient!a;")
	private static Class1 aClass1_1572 = Static94.method1596("Loaded gamescreen");

	@OriginalMember(owner = "client!j", name = "fc", descriptor = "Lclient!a;")
	public static Class1 aClass1_1570 = aClass1_1572;

	@OriginalMember(owner = "client!j", name = "gc", descriptor = "Lclient!a;")
	public static Class1 aClass1_1571 = aClass1_1568;

	@OriginalMember(owner = "client!j", name = "hc", descriptor = "I")
	public static int anInt1607 = 0;

	@OriginalMember(owner = "client!j", name = "kc", descriptor = "Lclient!a;")
	public static Class1 aClass1_1573 = Static94.method1596("Bitte laden Sie die Seite neu)3");

	@OriginalMember(owner = "client!j", name = "lc", descriptor = "Lclient!a;")
	public static Class1 aClass1_1574 = Static94.method1596("");

	@OriginalMember(owner = "client!j", name = "nc", descriptor = "Lclient!a;")
	public static Class1 aClass1_1575 = Static94.method1596("Absender:");

	@OriginalMember(owner = "client!j", name = "oc", descriptor = "Lclient!a;")
	public static Class1 aClass1_1576 = Static94.method1596("mapfunction");

	@OriginalMember(owner = "client!j", name = "pc", descriptor = "I")
	public static int anInt1608 = 1;

	@OriginalMember(owner = "client!j", name = "g", descriptor = "(I)V")
	public static void method1067() {
		Static27.anInt1037 = 0;
		Static67.anInt2767 = 0;
		Static18.method520();
		Static71.method1366();
		Static22.method605();
		@Pc(27) int local27;
		for (@Pc(21) int local21 = 0; local21 < Static27.anInt1037; local21++) {
			local27 = Static10.anIntArray317[local21];
			if (Static69.anInt2806 != Static101.aClass2_Sub1_Sub1_Sub1_Sub2Array1[local27].anInt2755) {
				Static101.aClass2_Sub1_Sub1_Sub1_Sub2Array1[local27].aClass2_Sub1_Sub7_1 = null;
				Static101.aClass2_Sub1_Sub1_Sub1_Sub2Array1[local27] = null;
			}
		}
		if (Static83.anInt2224 != Static13.aClass2_Sub3_Sub1_1.anInt1168) {
			throw new RuntimeException("gnp1 pos:" + Static13.aClass2_Sub3_Sub1_1.anInt1168 + " psize:" + Static83.anInt2224);
		}
		for (local27 = 0; local27 < Static44.anInt1516; local27++) {
			if (Static101.aClass2_Sub1_Sub1_Sub1_Sub2Array1[Static20.anIntArray89[local27]] == null) {
				throw new RuntimeException("gnp2 pos:" + local27 + " size:" + Static44.anInt1516);
			}
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(ILclient!bd;I)Lclient!e;")
	public static Class2_Sub1_Sub2_Sub2 method1068(@OriginalArg(1) Class8 arg0, @OriginalArg(2) int arg1) {
		return Static7.method795(arg0, arg1) ? Static39.method1772() : null;
	}

	@OriginalMember(owner = "client!j", name = "c", descriptor = "(B)V")
	public static void method1069() {
		aClass1_1569 = null;
		aClass1_1576 = null;
		aClass4_33 = null;
		aClass1_1575 = null;
		aClass1_1572 = null;
		aClass1_1574 = null;
		aClass4_34 = null;
		aClass63_1 = null;
		aClass1_1570 = null;
		aClass1_1568 = null;
		aClass1_1571 = null;
		aClass1_1573 = null;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(ILclient!ab;[Lclient!ad;[BIB)V")
	public static void method1070(@OriginalArg(0) int arg0, @OriginalArg(1) Class3 arg1, @OriginalArg(2) Class5[] arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		@Pc(16) Class2_Sub3 local16 = new Class2_Sub3(arg3);
		@Pc(22) int local22 = -1;
		while (true) {
			@Pc(26) int local26 = local16.method825();
			if (local26 == 0) {
				return;
			}
			@Pc(33) int local33 = 0;
			local22 += local26;
			while (true) {
				@Pc(41) int local41 = local16.method825();
				if (local41 == 0) {
					break;
				}
				local33 += local41 - 1;
				@Pc(56) int local56 = local33 & 0x3F;
				@Pc(62) int local62 = local33 >> 6 & 0x3F;
				@Pc(66) int local66 = local33 >> 12;
				@Pc(70) int local70 = local16.method791();
				@Pc(74) int local74 = local70 >> 2;
				@Pc(78) int local78 = local70 & 0x3;
				@Pc(82) int local82 = local62 + arg0;
				@Pc(87) int local87 = local56 + arg4;
				if (local82 > 0 && local87 > 0 && local82 < 103 && local87 < 103) {
					@Pc(103) Class5 local103 = null;
					@Pc(105) int local105 = local66;
					if ((Static29.aByteArrayArrayArray2[1][local82][local87] & 0x2) == 2) {
						local105 = local66 - 1;
					}
					if (local105 >= 0) {
						local103 = arg2[local105];
					}
					Static18.method528(local78, local103, local82, arg1, local74, local22, local87, local66);
				}
			}
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(ILjava/awt/Color;Lclient!a;I)V")
	public static void method1071(@OriginalArg(0) int arg0, @OriginalArg(1) Color arg1, @OriginalArg(2) Class1 arg2) {
		try {
			@Pc(6) Graphics local6 = Static103.aCanvas1.getGraphics();
			if (Static27.aFont1 == null) {
				Static27.aFont1 = new Font("Helvetica", 1, 13);
				Static12.aFontMetrics5 = Static103.aCanvas1.getFontMetrics(Static27.aFont1);
			}
			if (Static80.aBoolean119) {
				Static80.aBoolean119 = false;
				local6.setColor(Color.black);
				local6.fillRect(0, 0, Static21.anInt918, Static79.anInt2102);
			}
			if (arg1 == null) {
				arg1 = new Color(140, 17, 17);
			}
			try {
				if (Static47.anImage3 == null) {
					Static47.anImage3 = Static103.aCanvas1.createImage(304, 34);
				}
				@Pc(51) Graphics local51 = Static47.anImage3.getGraphics();
				local51.setColor(arg1);
				local51.drawRect(0, 0, 303, 33);
				local51.fillRect(2, 2, arg0 * 3, 30);
				local51.setColor(Color.black);
				local51.drawRect(1, 1, 301, 31);
				local51.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
				local51.setFont(Static27.aFont1);
				local51.setColor(Color.white);
				arg2.method16((304 - arg2.method24(Static12.aFontMetrics5)) / 2, 22, local51);
				local6.drawImage(Static47.anImage3, Static21.anInt918 / 2 - 152, Static79.anInt2102 / 2 + -18, null);
			} catch (@Pc(137) Exception local137) {
				@Pc(143) int local143 = Static21.anInt918 / 2 - 152;
				@Pc(149) int local149 = Static79.anInt2102 / 2 - 18;
				local6.setColor(arg1);
				local6.drawRect(local143, local149, 303, 33);
				local6.fillRect(local143 + 2, local149 - -2, arg0 * 3, 30);
				local6.setColor(Color.black);
				local6.drawRect(local143 + 1, local149 + 1, 301, 31);
				local6.fillRect(arg0 * 3 + local143 + 2, local149 + 2, 300 - arg0 * 3, 30);
				local6.setFont(Static27.aFont1);
				local6.setColor(Color.white);
				arg2.method16((304 - arg2.method24(Static12.aFontMetrics5)) / 2 + local143, local149 + 22, local6);
			}
		} catch (@Pc(228) Exception local228) {
			Static103.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(BLclient!a;)V")
	public static void method1072(@OriginalArg(1) Class1 arg0) {
		if (arg0 == null || arg0.method10() == 0) {
			Static77.anInt2076 = 0;
			return;
		}
		@Pc(16) Class1 local16 = arg0;
		@Pc(19) Class1[] local19 = new Class1[100];
		@Pc(26) int local26 = 0;
		while (true) {
			@Pc(31) int local31 = local16.method8();
			if (local31 == -1) {
				local16 = local16.method40();
				if (local16.method10() > 0) {
					local19[local26++] = local16.method30();
				}
				Static77.anInt2076 = 0;
				label46: for (local31 = 0; local31 < Static54.anInt1773; local31++) {
					@Pc(101) Class2_Sub1_Sub17 local101 = Static73.method1374(local31);
					if (local101.anInt2427 == -1 && local101.aClass1_2571 != null) {
						@Pc(116) Class1 local116 = local101.aClass1_2571.method30();
						for (@Pc(118) int local118 = 0; local118 < local26; local118++) {
							if (local116.method11(local19[local118]) == -1) {
								continue label46;
							}
						}
						Static33.aClass1Array11[Static77.anInt2076] = local116;
						Static8.anIntArray45[Static77.anInt2076] = local31;
						Static77.anInt2076++;
						if (Static77.anInt2076 >= Static33.aClass1Array11.length) {
							return;
						}
					}
				}
				return;
			}
			@Pc(66) Class1 local66 = local16.method19(0, local31).method40();
			if (local66.method10() > 0) {
				local19[local26++] = local66.method30();
			}
			local16 = local16.method1(local31 + 1);
		}
	}

	@OriginalMember(owner = "client!j", name = "d", descriptor = "(B)V")
	public static void method1073() {
		Static7.aClass11_9.method435();
	}
}
