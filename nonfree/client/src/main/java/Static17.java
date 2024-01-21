import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!cd", name = "q", descriptor = "[Lclient!e;")
	public static Class2_Sub1_Sub4_Sub1[] aClass2_Sub1_Sub4_Sub1Array3;

	@OriginalMember(owner = "client!cd", name = "s", descriptor = "Lclient!h;")
	public static Class33 aClass33_1;

	@OriginalMember(owner = "client!cd", name = "t", descriptor = "Lclient!na;")
	public static Class56 aClass56_8;

	@OriginalMember(owner = "client!cd", name = "w", descriptor = "Lclient!re;")
	public static Class56_Sub1 aClass56_Sub1_8;

	@OriginalMember(owner = "client!cd", name = "A", descriptor = "Lclient!na;")
	public static Class56 aClass56_9;

	@OriginalMember(owner = "client!cd", name = "d", descriptor = "Lclient!pe;")
	public static Class65 aClass65_136 = Static119.method1462("Fps:");

	@OriginalMember(owner = "client!cd", name = "f", descriptor = "Lclient!pe;")
	public static Class65 aClass65_137 = Static119.method1462("(Z");

	@OriginalMember(owner = "client!cd", name = "i", descriptor = "I")
	public static int anInt380 = 0;

	@OriginalMember(owner = "client!cd", name = "l", descriptor = "Lclient!wa;")
	public static Class2_Sub22 aClass2_Sub22_2 = null;

	@OriginalMember(owner = "client!cd", name = "n", descriptor = "I")
	public static int anInt384 = -1;

	@OriginalMember(owner = "client!cd", name = "p", descriptor = "I")
	public static int anInt386 = 1;

	@OriginalMember(owner = "client!cd", name = "u", descriptor = "[I")
	public static int[] anIntArray35 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!cd", name = "x", descriptor = "I")
	public static int anInt389 = 0;

	@OriginalMember(owner = "client!cd", name = "z", descriptor = "I")
	public static int anInt390 = 0;

	@OriginalMember(owner = "client!cd", name = "D", descriptor = "Lclient!pe;")
	private static Class65 aClass65_138 = Static119.method1462("RuneScape is loading )2 please wait)3)3)3");

	@OriginalMember(owner = "client!cd", name = "F", descriptor = "Lclient!pe;")
	public static Class65 aClass65_139 = aClass65_138;

	@OriginalMember(owner = "client!cd", name = "G", descriptor = "I")
	public static int anInt392 = 0;

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(B)V")
	public static void method264() {
		aClass56_9 = null;
		aClass65_139 = null;
		aClass33_1 = null;
		aClass56_8 = null;
		aClass2_Sub22_2 = null;
		aClass65_136 = null;
		aClass2_Sub1_Sub4_Sub1Array3 = null;
		aClass56_Sub1_8 = null;
		aClass65_137 = null;
		aClass65_138 = null;
		anIntArray35 = null;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IILclient!ha;B)V")
	public static void method266(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub1_Sub1_Sub4_Sub1 arg2) {
		if ((arg0 & 0x200) != 0) {
			arg2.anInt1947 = Static66.aClass2_Sub4_Sub1_2.method911();
			arg2.anInt1939 = Static66.aClass2_Sub4_Sub1_2.method923();
			arg2.anInt1941 = Static66.aClass2_Sub4_Sub1_2.method899();
			arg2.anInt1952 = Static66.aClass2_Sub4_Sub1_2.method911();
			arg2.anInt1963 = Static66.aClass2_Sub4_Sub1_2.method919() + Static10.anInt2951;
			arg2.anInt1928 = Static66.aClass2_Sub4_Sub1_2.method927() + Static10.anInt2951;
			arg2.anInt1957 = Static66.aClass2_Sub4_Sub1_2.method899();
			arg2.anInt1961 = 0;
			arg2.anInt1935 = 1;
		}
		@Pc(62) int local62;
		@Pc(66) int local66;
		if ((arg0 & 0x8) != 0) {
			local62 = Static66.aClass2_Sub4_Sub1_2.method933();
			local66 = Static66.aClass2_Sub4_Sub1_2.method923();
			arg2.method1467(local62, Static10.anInt2951, local66);
			arg2.anInt1951 = Static10.anInt2951 + 300;
			arg2.anInt1940 = Static66.aClass2_Sub4_Sub1_2.method899();
			arg2.anInt1968 = Static66.aClass2_Sub4_Sub1_2.method933();
		}
		if ((arg0 & 0x400) != 0) {
			arg2.anInt1975 = Static66.aClass2_Sub4_Sub1_2.method896();
			local62 = Static66.aClass2_Sub4_Sub1_2.method915();
			if (arg2.anInt1975 == 65535) {
				arg2.anInt1975 = -1;
			}
			arg2.anInt1924 = 0;
			arg2.anInt1937 = 0;
			arg2.anInt1916 = Static10.anInt2951 + (local62 & 0xFFFF);
			arg2.anInt1921 = local62 >> 16;
			if (arg2.anInt1916 > Static10.anInt2951) {
				arg2.anInt1924 = -1;
			}
		}
		if ((arg0 & 0x40) != 0) {
			arg2.anInt1971 = Static66.aClass2_Sub4_Sub1_2.method927();
			if (arg2.anInt1971 == 65535) {
				arg2.anInt1971 = -1;
			}
		}
		if ((arg0 & 0x100) != 0) {
			local62 = Static66.aClass2_Sub4_Sub1_2.method933();
			local66 = Static66.aClass2_Sub4_Sub1_2.method899();
			arg2.method1467(local62, Static10.anInt2951, local66);
			arg2.anInt1951 = Static10.anInt2951 + 300;
			arg2.anInt1940 = Static66.aClass2_Sub4_Sub1_2.method923();
			arg2.anInt1968 = Static66.aClass2_Sub4_Sub1_2.method923();
		}
		if ((arg0 & 0x80) != 0) {
			local62 = Static66.aClass2_Sub4_Sub1_2.method927();
			local66 = Static66.aClass2_Sub4_Sub1_2.method923();
			if (local62 == 65535) {
				local62 = -1;
			}
			Static21.method353(arg2, local62, local66);
		}
		if ((arg0 & 0x1) != 0) {
			local62 = Static66.aClass2_Sub4_Sub1_2.method927();
			local66 = Static66.aClass2_Sub4_Sub1_2.method899();
			@Pc(236) int local236 = Static66.aClass2_Sub4_Sub1_2.method933();
			@Pc(239) int local239 = Static66.aClass2_Sub4_Sub1_2.anInt1298;
			if (arg2.aClass65_457 != null && arg2.aClass9_2 != null) {
				@Pc(250) long local250 = arg2.aClass65_457.method1493();
				@Pc(252) boolean local252 = false;
				if (local66 <= 1) {
					for (@Pc(259) int local259 = 0; local259 < Static49.anInt1201; local259++) {
						if (Static30.aLongArray1[local259] == local250) {
							local252 = true;
							break;
						}
					}
				}
				if (!local252 && Static98.anInt2238 == 0) {
					Static128.aClass2_Sub4_35.anInt1298 = 0;
					Static66.aClass2_Sub4_Sub1_2.method935(local236, Static128.aClass2_Sub4_35.aByteArray20);
					Static128.aClass2_Sub4_35.anInt1298 = 0;
					@Pc(301) Class65 local301 = Static55.method2091(Static117.method1859(Static128.aClass2_Sub4_35).method1487());
					arg2.aClass65_838 = local301.method1474();
					arg2.anInt1950 = local62 & 0xFF;
					arg2.anInt1955 = 150;
					arg2.anInt1967 = local62 >> 8;
					if (local66 == 2 || local66 == 3) {
						Static59.method1098(1, Static35.method647(new Class65[] { Static14.aClass65_128, arg2.aClass65_457 }), local301);
					} else if (local66 == 1) {
						Static59.method1098(1, Static35.method647(new Class65[] { Static66.aClass65_675, arg2.aClass65_457 }), local301);
					} else {
						Static59.method1098(2, arg2.aClass65_457, local301);
					}
				}
			}
			Static66.aClass2_Sub4_Sub1_2.anInt1298 = local236 + local239;
		}
		if ((arg0 & 0x4) != 0) {
			arg2.anInt1933 = Static66.aClass2_Sub4_Sub1_2.method919();
			arg2.anInt1954 = Static66.aClass2_Sub4_Sub1_2.method902();
		}
		if ((arg0 & 0x10) != 0) {
			local62 = Static66.aClass2_Sub4_Sub1_2.method899();
			@Pc(402) byte[] local402 = new byte[local62];
			@Pc(407) Class2_Sub4 local407 = new Class2_Sub4(local402);
			Static66.aClass2_Sub4_Sub1_2.method932(local402, local62);
			Static43.aClass2_Sub4Array1[arg1] = local407;
			arg2.method731(local407);
		}
		if ((arg0 & 0x20) == 0) {
			return;
		}
		arg2.aClass65_838 = Static66.aClass2_Sub4_Sub1_2.method931();
		if (arg2.aClass65_838.method1510(0) == 126) {
			arg2.aClass65_838 = arg2.aClass65_838.method1501(1);
			Static59.method1098(2, arg2.aClass65_457, arg2.aClass65_838);
		} else if (Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1 == arg2) {
			Static59.method1098(2, arg2.aClass65_457, arg2.aClass65_838);
		}
		arg2.anInt1955 = 150;
		arg2.anInt1967 = 0;
		arg2.anInt1950 = 0;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(BI)Z")
	public static boolean method271(@OriginalArg(1) int arg0) {
		return (arg0 >> 30 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Ljava/awt/Color;Lclient!pe;II)V")
	public static void method272(@OriginalArg(0) Color arg0, @OriginalArg(1) Class65 arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(2) Graphics local2 = Static115.aCanvas1.getGraphics();
			if (Static99.aFont1 == null) {
				Static99.aFont1 = new Font("Helvetica", 1, 13);
				Static39.aFontMetrics1 = Static115.aCanvas1.getFontMetrics(Static99.aFont1);
			}
			if (Static43.aBoolean44) {
				Static43.aBoolean44 = false;
				local2.setColor(Color.black);
				local2.fillRect(0, 0, Static48.anInt1173, Static32.anInt755);
			}
			if (arg0 == null) {
				arg0 = new Color(140, 17, 17);
			}
			try {
				if (Static101.anImage4 == null) {
					Static101.anImage4 = Static115.aCanvas1.createImage(304, 34);
				}
				@Pc(47) Graphics local47 = Static101.anImage4.getGraphics();
				local47.setColor(arg0);
				local47.drawRect(0, 0, 303, 33);
				local47.fillRect(2, 2, arg2 * 3, 30);
				local47.setColor(Color.black);
				local47.drawRect(1, 1, 301, 31);
				local47.fillRect(arg2 * 3 + 2, 2, 300 - arg2 * 3, 30);
				local47.setFont(Static99.aFont1);
				local47.setColor(Color.white);
				arg1.method1491(22, local47, (304 - arg1.method1496(Static39.aFontMetrics1)) / 2);
				local2.drawImage(Static101.anImage4, Static48.anInt1173 / 2 - 152, Static32.anInt755 / 2 + -18, null);
			} catch (@Pc(125) Exception local125) {
				@Pc(131) int local131 = Static48.anInt1173 / 2 - 152;
				@Pc(137) int local137 = Static32.anInt755 / 2 - 18;
				local2.setColor(arg0);
				local2.drawRect(local131, local137, 303, 33);
				local2.fillRect(local131 + 2, local137 + 2, arg2 * 3, 30);
				local2.setColor(Color.black);
				local2.drawRect(local131 + 1, local137 - -1, 301, 31);
				local2.fillRect(arg2 * 3 + local131 + 2, local137 + 2, 300 - arg2 * 3, 30);
				local2.setFont(Static99.aFont1);
				local2.setColor(Color.white);
				arg1.method1491(local137 + 22, local2, local131 + (304 - arg1.method1496(Static39.aFontMetrics1)) / 2);
			}
		} catch (@Pc(215) Exception local215) {
			Static115.aCanvas1.repaint();
		}
	}
}
