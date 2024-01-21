import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "I")
	public static int anInt2283 = 0;

	@OriginalMember(owner = "client!pe", name = "h", descriptor = "[I")
	public static int[] anIntArray307 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!pe", name = "i", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1042 = null;

	@OriginalMember(owner = "client!pe", name = "j", descriptor = "Lclient!bc;")
	public static Class7 aClass7_4 = new Class7(4096);

	@OriginalMember(owner = "client!pe", name = "k", descriptor = "I")
	public static int anInt2290 = 0;

	@OriginalMember(owner = "client!pe", name = "l", descriptor = "I")
	public static int anInt2291 = 0;

	@OriginalMember(owner = "client!pe", name = "m", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_5 = new CRC32();

	@OriginalMember(owner = "client!pe", name = "n", descriptor = "I")
	public static int anInt2292 = 0;

	@OriginalMember(owner = "client!pe", name = "o", descriptor = "I")
	public static int anInt2293 = 0;

	@OriginalMember(owner = "client!pe", name = "r", descriptor = "Lclient!wb;")
	private static Class65 aClass65_1045 = Static24.method441("Loading sprites )2 ");

	@OriginalMember(owner = "client!pe", name = "p", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1043 = aClass65_1045;

	@OriginalMember(owner = "client!pe", name = "q", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1044 = Static24.method441("Sprites geladen)3");

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(BLclient!wb;ILjava/awt/Color;)V")
	public static void method1354(@OriginalArg(1) Class65 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Color arg2) {
		try {
			@Pc(2) Graphics local2 = Static70.aCanvas1.getGraphics();
			if (Static53.aFont2 == null) {
				Static53.aFont2 = new Font("Helvetica", 1, 13);
				Static19.aFontMetrics3 = Static70.aCanvas1.getFontMetrics(Static53.aFont2);
			}
			if (Static38.aBoolean74) {
				Static38.aBoolean74 = false;
				local2.setColor(Color.black);
				local2.fillRect(0, 0, Static39.anInt1242, Static3.anInt183);
			}
			if (arg2 == null) {
				arg2 = new Color(140, 17, 17);
			}
			try {
				if (Static16.anImage1 == null) {
					Static16.anImage1 = Static70.aCanvas1.createImage(304, 34);
				}
				@Pc(47) Graphics local47 = Static16.anImage1.getGraphics();
				local47.setColor(arg2);
				local47.drawRect(0, 0, 303, 33);
				local47.fillRect(2, 2, arg1 * 3, 30);
				local47.setColor(Color.black);
				local47.drawRect(1, 1, 301, 31);
				local47.fillRect(arg1 * 3 + 2, 2, 300 - arg1 * 3, 30);
				local47.setFont(Static53.aFont2);
				local47.setColor(Color.white);
				arg0.method1758((304 - arg0.method1785(Static19.aFontMetrics3)) / 2, local47, 22);
				local2.drawImage(Static16.anImage1, Static39.anInt1242 / 2 - 152, Static3.anInt183 / 2 + -18, null);
			} catch (@Pc(125) Exception local125) {
				@Pc(131) int local131 = Static39.anInt1242 / 2 - 152;
				@Pc(137) int local137 = Static3.anInt183 / 2 - 18;
				local2.setColor(arg2);
				local2.drawRect(local131, local137, 303, 33);
				local2.fillRect(local131 + 2, local137 - -2, arg1 * 3, 30);
				local2.setColor(Color.black);
				local2.drawRect(local131 + 1, local137 + 1, 301, 31);
				local2.fillRect(local131 + arg1 * 3 + 2, local137 + 2, 300 - arg1 * 3, 30);
				local2.setFont(Static53.aFont2);
				local2.setColor(Color.white);
				arg0.method1758((304 - arg0.method1785(Static19.aFontMetrics3)) / 2 + local131, local2, local137 + 22);
			}
		} catch (@Pc(219) Exception local219) {
			Static70.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	public static void method1355(@OriginalArg(0) Component arg0) {
		arg0.removeMouseListener(Static108.aClass19_1);
		arg0.removeMouseMotionListener(Static108.aClass19_1);
		arg0.removeFocusListener(Static108.aClass19_1);
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V")
	public static void method1356() {
		aClass65_1044 = null;
		aCRC32_5 = null;
		aClass7_4 = null;
		aClass65_1042 = null;
		aClass65_1045 = null;
		aClass65_1043 = null;
		anIntArray307 = null;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)V")
	public static void method1357() {
		Static36.aClass21_11.method743();
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZLclient!od;)V")
	public static void method1358(@OriginalArg(1) Class2_Sub1_Sub1_Sub2 arg0) {
		arg0.anInt1542 = arg0.anInt1515;
		if (arg0.anInt1570 == 0) {
			arg0.anInt1567 = 0;
			return;
		}
		if (arg0.anInt1552 != -1 && arg0.anInt1569 == 0) {
			@Pc(35) Class2_Sub1_Sub6 local35 = Static71.method1291(arg0.anInt1552);
			if (arg0.anInt1534 > 0 && local35.anInt1197 == 0) {
				arg0.anInt1567++;
				return;
			}
			if (arg0.anInt1534 <= 0 && local35.anInt1191 == 0) {
				arg0.anInt1567++;
				return;
			}
		}
		@Pc(79) int local79 = arg0.anInt1521 * 64 + arg0.anIntArray208[arg0.anInt1570 - 1] * 128;
		@Pc(94) int local94 = arg0.anInt1521 * 64 + arg0.anIntArray209[arg0.anInt1570 - 1] * 128;
		@Pc(97) int local97 = arg0.anInt1518;
		@Pc(100) int local100 = arg0.anInt1562;
		if (local94 - local97 > 256 || local94 - local97 < -256 || local79 - local100 > 256 || local79 - local100 < -256) {
			arg0.anInt1562 = local79;
			arg0.anInt1518 = local94;
			return;
		}
		if (local94 > local97) {
			if (local100 < local79) {
				arg0.anInt1545 = 1280;
			} else if (local100 <= local79) {
				arg0.anInt1545 = 1536;
			} else {
				arg0.anInt1545 = 1792;
			}
		} else if (local94 < local97) {
			if (local100 < local79) {
				arg0.anInt1545 = 768;
			} else if (local100 > local79) {
				arg0.anInt1545 = 256;
			} else {
				arg0.anInt1545 = 512;
			}
		} else if (local100 < local79) {
			arg0.anInt1545 = 1024;
		} else if (local79 < local100) {
			arg0.anInt1545 = 0;
		}
		@Pc(210) int local210 = arg0.anInt1548;
		@Pc(219) int local219 = arg0.anInt1545 - arg0.anInt1540 & 0x7FF;
		if (local219 > 1024) {
			local219 -= 2048;
		}
		@Pc(227) int local227 = 4;
		if (local219 >= -256 && local219 <= 256) {
			local210 = arg0.anInt1528;
		} else if (local219 >= 256 && local219 < 768) {
			local210 = arg0.anInt1555;
		} else if (local219 >= -768 && local219 <= -256) {
			local210 = arg0.anInt1558;
		}
		if (arg0.anInt1545 != arg0.anInt1540 && arg0.anInt1527 == -1 && arg0.anInt1536 != 0) {
			local227 = 2;
		}
		if (local210 == -1) {
			local210 = arg0.anInt1528;
		}
		if (arg0.anInt1570 > 2) {
			local227 = 6;
		}
		arg0.anInt1542 = local210;
		if (arg0.anInt1570 > 3) {
			local227 = 8;
		}
		if (arg0.anInt1567 > 0 && arg0.anInt1570 > 1) {
			local227 = 8;
			arg0.anInt1567--;
		}
		if (arg0.aBooleanArray15[arg0.anInt1570 - 1]) {
			local227 <<= 0x1;
		}
		if (local97 < local94) {
			arg0.anInt1518 += local227;
			if (arg0.anInt1518 > local94) {
				arg0.anInt1518 = local94;
			}
		} else if (local97 > local94) {
			arg0.anInt1518 -= local227;
			if (local94 > arg0.anInt1518) {
				arg0.anInt1518 = local94;
			}
		}
		if (local100 < local79) {
			arg0.anInt1562 += local227;
			if (local79 < arg0.anInt1562) {
				arg0.anInt1562 = local79;
			}
		} else if (local100 > local79) {
			arg0.anInt1562 -= local227;
			if (arg0.anInt1562 < local79) {
				arg0.anInt1562 = local79;
			}
		}
		if (local94 == arg0.anInt1518 && arg0.anInt1562 == local79) {
			if (arg0.anInt1534 > 0) {
				arg0.anInt1534--;
			}
			arg0.anInt1570--;
		}
		if (local227 >= 8 && arg0.anInt1528 == arg0.anInt1542 && arg0.anInt1568 != -1) {
			arg0.anInt1542 = arg0.anInt1568;
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILclient!ab;)Z")
	public static boolean method1359(@OriginalArg(1) Class2_Sub1_Sub2 arg0) {
		if (arg0.anIntArray22 == null) {
			return false;
		}
		for (@Pc(17) int local17 = 0; local17 < arg0.anIntArray22.length; local17++) {
			@Pc(24) int local24 = Static110.method1845(local17, arg0);
			@Pc(29) int local29 = arg0.anIntArray25[local17];
			if (arg0.anIntArray22[local17] == 2) {
				if (local29 <= local24) {
					return false;
				}
			} else if (arg0.anIntArray22[local17] == 3) {
				if (local24 <= local29) {
					return false;
				}
			} else if (arg0.anIntArray22[local17] == 4) {
				if (local29 == local24) {
					return false;
				}
			} else if (local24 != local29) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(B)V")
	public static void method1360() {
		if (Static47.anInt1390 == 0) {
			return;
		}
		@Pc(13) int local13 = 0;
		@Pc(15) Class2_Sub1_Sub4_Sub4 local15 = Static110.aClass2_Sub1_Sub4_Sub4_3;
		if (Static33.anInt2359 != 0) {
			local13 = 1;
		}
		for (@Pc(24) int local24 = 0; local24 < 100; local24++) {
			if (Static34.aClass65Array5[local24] != null) {
				@Pc(34) int local34 = Static61.anIntArray249[local24];
				@Pc(38) Class65 local38 = Static78.aClass65Array4[local24];
				@Pc(40) byte local40 = 0;
				if (local38 != null && local38.method1783(Static69.aClass65_954)) {
					local40 = 1;
					local38 = local38.method1779(5);
				}
				if (local38 != null && local38.method1783(Static6.aClass65_117)) {
					local38 = local38.method1779(5);
					local40 = 2;
				}
				@Pc(100) int local100;
				if ((local34 == 3 || local34 == 7) && (local34 == 7 || Static42.anInt1350 == 0 || Static42.anInt1350 == 1 && Static4.method102(local38))) {
					local100 = 329 - local13 * 13;
					local13++;
					local15.method1828(Static85.aClass65_1106, 4, local100, 0);
					local15.method1828(Static85.aClass65_1106, 4, local100 - 1, 65535);
					@Pc(123) int local123 = local15.method1839(Static85.aClass65_1106) + 4;
					local123 += local15.method1829(32);
					if (local40 == 1) {
						Static46.aClass2_Sub1_Sub4_Sub3Array5[0].method1479(local123, local100 - 12);
						local123 += 14;
					}
					if (local40 == 2) {
						Static46.aClass2_Sub1_Sub4_Sub3Array5[1].method1479(local123, local100 - 12);
						local123 += 14;
					}
					local15.method1828(Static13.method282(new Class65[] { local38, Static17.aClass65_274, Static34.aClass65Array5[local24] }), local123, local100, 0);
					local15.method1828(Static13.method282(new Class65[] { local38, Static17.aClass65_274, Static34.aClass65Array5[local24] }), local123, local100 - 1, 65535);
					if (local13 >= 5) {
						return;
					}
				}
				if (local34 == 5 && Static42.anInt1350 < 2) {
					local100 = 329 - local13 * 13;
					local15.method1828(Static34.aClass65Array5[local24], 4, local100, 0);
					local13++;
					local15.method1828(Static34.aClass65Array5[local24], 4, local100 - 1, 65535);
					if (local13 >= 5) {
						return;
					}
				}
				if (local34 == 6 && Static42.anInt1350 < 2) {
					local100 = 329 - local13 * 13;
					local15.method1828(Static13.method282(new Class65[] { Static12.aClass65_222, Static22.aClass65_305, local38, Static17.aClass65_274, Static34.aClass65Array5[local24] }), 4, local100, 0);
					local13++;
					local15.method1828(Static13.method282(new Class65[] { Static12.aClass65_222, Static22.aClass65_305, local38, Static17.aClass65_274, Static34.aClass65Array5[local24] }), 4, local100 - 1, 65535);
					if (local13 >= 5) {
						return;
					}
				}
			}
		}
	}
}
