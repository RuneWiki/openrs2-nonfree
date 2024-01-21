import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "I")
	public static int anInt49;

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "Lclient!af;")
	public static Class7_Sub1 aClass7_Sub1_1;

	@OriginalMember(owner = "client!ad", name = "e", descriptor = "Lclient!ga;")
	public static Class29 aClass29_1;

	@OriginalMember(owner = "client!ad", name = "l", descriptor = "Lclient!af;")
	public static Class7_Sub1 aClass7_Sub1_2;

	@OriginalMember(owner = "client!ad", name = "u", descriptor = "Lclient!eb;")
	public static Class20 aClass20_1;

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "I")
	public static int anInt48 = 1;

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "Lclient!rd;")
	public static Class63 aClass63_22 = Static80.method1463("m-Ochte sich mit Ihnen duellieren)3");

	@OriginalMember(owner = "client!ad", name = "f", descriptor = "Lclient!rd;")
	public static Class63 aClass63_23 = Static80.method1463("");

	@OriginalMember(owner = "client!ad", name = "i", descriptor = "I")
	public static int anInt52 = 0;

	@OriginalMember(owner = "client!ad", name = "j", descriptor = "Lclient!rd;")
	public static Class63 aClass63_24 = Static80.method1463("redstone3");

	@OriginalMember(owner = "client!ad", name = "m", descriptor = "I")
	public static int anInt54 = 0;

	@OriginalMember(owner = "client!ad", name = "n", descriptor = "Lclient!rd;")
	public static Class63 aClass63_25 = Static80.method1463("leuchten3:");

	@OriginalMember(owner = "client!ad", name = "q", descriptor = "Lclient!rd;")
	public static Class63 aClass63_26 = Static80.method1463("scrollen:");

	@OriginalMember(owner = "client!ad", name = "s", descriptor = "Lclient!rd;")
	public static Class63 aClass63_27 = Static80.method1463("Passwort: ");

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Z)V")
	public static void method35() {
		aClass63_24 = null;
		aClass63_27 = null;
		aClass29_1 = null;
		aClass7_Sub1_2 = null;
		aClass63_25 = null;
		aClass63_22 = null;
		aClass63_23 = null;
		aClass63_26 = null;
		aClass20_1 = null;
		aClass7_Sub1_1 = null;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V")
	public static void method36() {
		Static117.anIntArray345 = null;
		Static22.anIntArray65 = null;
		Static59.anIntArray189 = null;
		Static61.anIntArray190 = null;
		Static39.anIntArray143 = null;
		Static61.aByteArrayArray6 = null;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IZII)I")
	public static int method37(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) int local14 = arg1 - 1 & arg0;
		@Pc(18) int local18 = arg0 / arg1;
		@Pc(22) int local22 = arg2 / arg1;
		@Pc(27) int local27 = Static93.method1702(local18, local22);
		@Pc(34) int local34 = Static93.method1702(local18 + 1, local22);
		@Pc(40) int local40 = arg2 & arg1 - 1;
		@Pc(47) int local47 = Static93.method1702(local18, local22 + 1);
		@Pc(56) int local56 = Static93.method1702(local18 + 1, local22 + 1);
		@Pc(63) int local63 = Static11.method1287(local34, local14, local27, arg1);
		@Pc(70) int local70 = Static11.method1287(local56, local14, local47, arg1);
		return Static11.method1287(local70, local40, local63, arg1);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIIIBI)I")
	public static int method38(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = arg0 & 0x3;
		if ((arg3 & 0x1) == 1) {
			@Pc(17) int local17 = arg1;
			arg1 = arg5;
			arg5 = local17;
		}
		if (local3 == 0) {
			return arg4;
		} else if (local3 == 1) {
			return 7 + 1 - arg2 - arg1;
		} else if (local3 == 2) {
			return 1 + 7 - arg5 - arg4;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(B)V")
	public static void method39() {
		Static60.aByteArrayArrayArray51 = new byte[4][104][104];
		Static44.aByteArrayArrayArray38 = new byte[4][104][104];
		Static89.anIntArrayArrayArray9 = new int[4][105][105];
		Static31.aByteArrayArrayArray28 = new byte[4][105][105];
		Static32.anIntArray136 = new int[104];
		Static66.aByteArrayArrayArray91 = new byte[4][104][104];
		Static18.anIntArray62 = new int[104];
		Static54.anIntArray178 = new int[104];
		Static79.aByteArrayArrayArray59 = new byte[4][104][104];
		Static31.anInt1021 = 99;
		Static105.anIntArray321 = new int[104];
		Static92.anIntArray286 = new int[104];
		Static53.anIntArrayArray36 = new int[105][105];
	}

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "(B)V")
	public static void method40() {
		Static43.anInt129 = 0;
		Static69.anInt2002 = 0;
		Static84.method1573();
		Static43.method102();
		Static110.method2039();
		Static44.method960();
		@Pc(25) int local25;
		for (@Pc(19) int local19 = 0; local19 < Static69.anInt2002; local19++) {
			local25 = Static89.anIntArray282[local19];
			if (Static73.anInt2064 != Static78.aClass6_Sub3_Sub1_Sub2_Sub2Array1[local25].anInt2324) {
				Static78.aClass6_Sub3_Sub1_Sub2_Sub2Array1[local25] = null;
			}
		}
		if (Static14.anInt464 != Static88.aClass6_Sub4_Sub1_5.anInt1949) {
			throw new RuntimeException("gpp1 pos:" + Static88.aClass6_Sub4_Sub1_5.anInt1949 + " psize:" + Static14.anInt464);
		}
		for (local25 = 0; local25 < Static81.anInt2219; local25++) {
			if (Static78.aClass6_Sub3_Sub1_Sub2_Sub2Array1[Static114.anIntArray356[local25]] == null) {
				throw new RuntimeException("gpp2 pos:" + local25 + " size:" + Static81.anInt2219);
			}
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILclient!rd;Ljava/awt/Color;I)V")
	public static void method41(@OriginalArg(0) int arg0, @OriginalArg(1) Class63 arg1, @OriginalArg(2) Color arg2) {
		try {
			@Pc(2) Graphics local2 = Static38.aCanvas1.getGraphics();
			if (Static46.aFont1 == null) {
				Static46.aFont1 = new Font("Helvetica", 1, 13);
				Static60.aFontMetrics1 = Static38.aCanvas1.getFontMetrics(Static46.aFont1);
			}
			if (Static92.aBoolean135) {
				Static92.aBoolean135 = false;
				local2.setColor(Color.black);
				local2.fillRect(0, 0, Static79.anInt2163, Static118.anInt3181);
			}
			if (arg2 == null) {
				arg2 = new Color(140, 17, 17);
			}
			try {
				if (Static24.anImage1 == null) {
					Static24.anImage1 = Static38.aCanvas1.createImage(304, 34);
				}
				@Pc(47) Graphics local47 = Static24.anImage1.getGraphics();
				local47.setColor(arg2);
				local47.drawRect(0, 0, 303, 33);
				local47.fillRect(2, 2, arg0 * 3, 30);
				local47.setColor(Color.black);
				local47.drawRect(1, 1, 301, 31);
				local47.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
				local47.setFont(Static46.aFont1);
				local47.setColor(Color.white);
				arg1.method1809(local47, 22, (304 - arg1.method1795(Static60.aFontMetrics1)) / 2);
				local2.drawImage(Static24.anImage1, Static79.anInt2163 / 2 - 152, Static118.anInt3181 / 2 + -18, null);
			} catch (@Pc(134) Exception local134) {
				@Pc(140) int local140 = Static118.anInt3181 / 2 - 18;
				@Pc(146) int local146 = Static79.anInt2163 / 2 - 152;
				local2.setColor(arg2);
				local2.drawRect(local146, local140, 303, 33);
				local2.fillRect(local146 + 2, local140 - -2, arg0 * 3, 30);
				local2.setColor(Color.black);
				local2.drawRect(local146 + 1, local140 - -1, 301, 31);
				local2.fillRect(local146 + arg0 * 3 + 2, local140 + 2, 300 - arg0 * 3, 30);
				local2.setFont(Static46.aFont1);
				local2.setColor(Color.white);
				arg1.method1809(local2, local140 + 22, local146 - -((-arg1.method1795(Static60.aFontMetrics1) + 304) / 2));
			}
		} catch (@Pc(226) Exception local226) {
			Static38.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "(B)V")
	public static void method42() {
		if (Static19.anInt642 != 1) {
			return;
		}
		if (Static59.anInt1765 >= 539 && Static59.anInt1765 <= 573 && Static61.anInt1804 >= 169 && Static61.anInt1804 < 205 && Static111.anIntArray352[0] != -1) {
			Static10.aBoolean20 = true;
			Static12.aBoolean22 = true;
			Static86.anInt2366 = 0;
		}
		if (Static59.anInt1765 >= 569 && Static59.anInt1765 <= 599 && Static61.anInt1804 >= 168 && Static61.anInt1804 < 205 && Static111.anIntArray352[1] != -1) {
			Static86.anInt2366 = 1;
			Static12.aBoolean22 = true;
			Static10.aBoolean20 = true;
		}
		if (Static59.anInt1765 >= 597 && Static59.anInt1765 <= 627 && Static61.anInt1804 >= 168 && Static61.anInt1804 < 205 && Static111.anIntArray352[2] != -1) {
			Static86.anInt2366 = 2;
			Static12.aBoolean22 = true;
			Static10.aBoolean20 = true;
		}
		if (Static59.anInt1765 >= 625 && Static59.anInt1765 <= 669 && Static61.anInt1804 >= 168 && Static61.anInt1804 < 203 && Static111.anIntArray352[3] != -1) {
			Static10.aBoolean20 = true;
			Static86.anInt2366 = 3;
			Static12.aBoolean22 = true;
		}
		if (Static59.anInt1765 >= 666 && Static59.anInt1765 <= 696 && Static61.anInt1804 >= 168 && Static61.anInt1804 < 205 && Static111.anIntArray352[4] != -1) {
			Static86.anInt2366 = 4;
			Static10.aBoolean20 = true;
			Static12.aBoolean22 = true;
		}
		if (Static59.anInt1765 >= 694 && Static59.anInt1765 <= 724 && Static61.anInt1804 >= 168 && Static61.anInt1804 < 205 && Static111.anIntArray352[5] != -1) {
			Static86.anInt2366 = 5;
			Static12.aBoolean22 = true;
			Static10.aBoolean20 = true;
		}
		if (Static59.anInt1765 >= 722 && Static59.anInt1765 <= 756 && Static61.anInt1804 >= 169 && Static61.anInt1804 < 205 && Static111.anIntArray352[6] != -1) {
			Static86.anInt2366 = 6;
			Static12.aBoolean22 = true;
			Static10.aBoolean20 = true;
		}
		if (Static59.anInt1765 >= 540 && Static59.anInt1765 <= 574 && Static61.anInt1804 >= 466 && Static61.anInt1804 < 502 && Static111.anIntArray352[7] != -1) {
			Static10.aBoolean20 = true;
			Static86.anInt2366 = 7;
			Static12.aBoolean22 = true;
		}
		if (Static59.anInt1765 >= 572 && Static59.anInt1765 <= 602 && Static61.anInt1804 >= 466 && Static61.anInt1804 < 503 && Static111.anIntArray352[8] != -1) {
			Static10.aBoolean20 = true;
			Static12.aBoolean22 = true;
			Static86.anInt2366 = 8;
		}
		if (Static59.anInt1765 >= 599 && Static59.anInt1765 <= 629 && Static61.anInt1804 >= 466 && Static61.anInt1804 < 503 && Static111.anIntArray352[9] != -1) {
			Static12.aBoolean22 = true;
			Static10.aBoolean20 = true;
			Static86.anInt2366 = 9;
		}
		if (Static59.anInt1765 >= 627 && Static59.anInt1765 <= 671 && Static61.anInt1804 >= 467 && Static61.anInt1804 < 502 && Static111.anIntArray352[10] != -1) {
			Static12.aBoolean22 = true;
			Static10.aBoolean20 = true;
			Static86.anInt2366 = 10;
		}
		if (Static59.anInt1765 >= 669 && Static59.anInt1765 <= 699 && Static61.anInt1804 >= 466 && Static61.anInt1804 < 503 && Static111.anIntArray352[11] != -1) {
			Static12.aBoolean22 = true;
			Static10.aBoolean20 = true;
			Static86.anInt2366 = 11;
		}
		if (Static59.anInt1765 >= 696 && Static59.anInt1765 <= 726 && Static61.anInt1804 >= 466 && Static61.anInt1804 < 503 && Static111.anIntArray352[12] != -1) {
			Static12.aBoolean22 = true;
			Static86.anInt2366 = 12;
			Static10.aBoolean20 = true;
		}
		if (Static59.anInt1765 >= 724 && Static59.anInt1765 <= 758 && Static61.anInt1804 >= 466 && Static61.anInt1804 < 502 && Static111.anIntArray352[13] != -1) {
			Static12.aBoolean22 = true;
			Static86.anInt2366 = 13;
			Static10.aBoolean20 = true;
		}
	}
}
