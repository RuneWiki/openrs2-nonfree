import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!mg", name = "w", descriptor = "Lclient!nb;")
	public static Class66 aClass66_5;

	@OriginalMember(owner = "client!mg", name = "t", descriptor = "I")
	public static int anInt2732 = 0;

	@OriginalMember(owner = "client!mg", name = "u", descriptor = "Lclient!kg;")
	public static final Class53 aClass53_14 = new Class53(128);

	@OriginalMember(owner = "client!mg", name = "v", descriptor = "Z")
	public static boolean aBoolean120 = true;

	@OriginalMember(owner = "client!mg", name = "x", descriptor = "[J")
	public static final long[] aLongArray7 = new long[200];

	@OriginalMember(owner = "client!mg", name = "z", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_960 = Static151.method2243("Das ist eine Mitglieder)2Welt(Q");

	@OriginalMember(owner = "client!mg", name = "B", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_961 = Static151.method2243("blinken2:");

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(II)Z")
	public static boolean method1932(@OriginalArg(1) int arg0) {
		return (arg0 >> 30 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Ljava/awt/Component;Lclient!pb;Lclient!pb;I)V")
	public static void method1933(@OriginalArg(0) Component arg0, @OriginalArg(1) Class71 arg1, @OriginalArg(2) Class71 arg2) {
		if (Static12.aBoolean16) {
			return;
		}
		Static212.method3093();
		@Pc(15) byte[] local15 = arg2.method2130(Static59.anInt1227, 0);
		Static42.aClass2_Sub1_Sub2_Sub1_8 = new Class2_Sub1_Sub2_Sub1(local15, arg0);
		Static99.aClass2_Sub1_Sub2_Sub1_7 = Static42.aClass2_Sub1_Sub2_Sub1_8.method284();
		Static159.aClass42_4 = Static179.method2591(arg1, Static211.anInt4416);
		Static135.aClass42_3 = Static179.method2591(arg1, Static213.anInt4434);
		Static103.aClass42_2 = Static179.method2591(arg1, Static56.anInt1143);
		Static59.aClass42_Sub1Array2 = Static139.method2077(arg1, Static9.anInt245);
		Static25.aClass42Array1 = Static166.method2433(Static190.anInt3936, arg1);
		Static78.anIntArray137 = new int[256];
		for (@Pc(54) int local54 = 0; local54 < 64; local54++) {
			Static78.anIntArray137[local54] = local54 * 262144;
		}
		for (@Pc(70) int local70 = 0; local70 < 64; local70++) {
			Static78.anIntArray137[local70 + 64] = local70 * 1024 + 16711680;
		}
		for (@Pc(91) int local91 = 0; local91 < 64; local91++) {
			Static78.anIntArray137[local91 + 128] = local91 * 4 + 16776960;
		}
		for (@Pc(111) int local111 = 0; local111 < 64; local111++) {
			Static78.anIntArray137[local111 + 192] = 16777215;
		}
		Static7.anIntArray227 = new int[256];
		for (@Pc(135) int local135 = 0; local135 < 64; local135++) {
			Static7.anIntArray227[local135] = local135 * 1024;
		}
		for (@Pc(149) int local149 = 0; local149 < 64; local149++) {
			Static7.anIntArray227[local149 + 64] = local149 * 4 + 65280;
		}
		for (@Pc(168) int local168 = 0; local168 < 64; local168++) {
			Static7.anIntArray227[local168 + 128] = local168 * 262144 + 65535;
		}
		for (@Pc(186) int local186 = 0; local186 < 64; local186++) {
			Static7.anIntArray227[local186 + 192] = 16777215;
		}
		Static163.anIntArray302 = new int[256];
		for (@Pc(203) int local203 = 0; local203 < 64; local203++) {
			Static163.anIntArray302[local203] = local203 * 4;
		}
		for (@Pc(217) int local217 = 0; local217 < 64; local217++) {
			Static163.anIntArray302[local217 + 64] = local217 * 262144 + 255;
		}
		for (@Pc(237) int local237 = 0; local237 < 64; local237++) {
			Static163.anIntArray302[local237 + 128] = local237 * 1024 + 16711935;
		}
		for (@Pc(255) int local255 = 0; local255 < 64; local255++) {
			Static163.anIntArray302[local255 + 192] = 16777215;
		}
		Static57.anIntArray90 = new int[32768];
		Static142.anIntArray271 = new int[256];
		Static170.anIntArray312 = new int[32768];
		Static2.method60(null);
		Static198.anInt4146 = 0;
		Static56.aBoolean49 = false;
		Static137.aClass62_1030 = Static137.aClass62_1024;
		if (Static95.anInt2134 == 0) {
			Static153.aBoolean140 = true;
		} else {
			Static153.aBoolean140 = false;
		}
		Static137.aClass62_1026 = Static137.aClass62_1024;
		Static85.anIntArray156 = new int[32768];
		Static53.anIntArray84 = new int[32768];
		if (Static153.aBoolean140) {
			Static149.method2223();
		} else {
			Static173.method2525(Static63.aClass71_Sub1_5, 255, Static131.anInt1518);
		}
		Static149.method2221(false);
		Static12.aBoolean16 = true;
		Static116.method1788();
		Static5.aClass2_Sub1_Sub2_Sub1_1 = new Class2_Sub1_Sub2_Sub1(128, 254);
		Static56.aClass2_Sub1_Sub2_Sub1_5 = new Class2_Sub1_Sub2_Sub1(128, 254);
	}

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(II)Z")
	public static boolean method1934(@OriginalArg(1) int arg0) {
		if (Static184.aBooleanArray12[arg0]) {
			return true;
		} else if (Static121.aClass71_23.method2125(arg0)) {
			@Pc(30) int local30 = Static121.aClass71_23.method2117(arg0);
			if (local30 == 0) {
				Static184.aBooleanArray12[arg0] = true;
				return true;
			}
			if (Static89.aClass47ArrayArray1[arg0] == null) {
				Static89.aClass47ArrayArray1[arg0] = new Class47[local30];
			}
			for (@Pc(49) int local49 = 0; local49 < local30; local49++) {
				if (Static89.aClass47ArrayArray1[arg0][local49] == null) {
					@Pc(63) byte[] local63 = Static121.aClass71_23.method2130(arg0, local49);
					if (local63 != null) {
						Static89.aClass47ArrayArray1[arg0][local49] = new Class47();
						Static89.aClass47ArrayArray1[arg0][local49].anInt1886 = (arg0 << 16) + local49;
						if (local63[0] == -1) {
							Static89.aClass47ArrayArray1[arg0][local49].method1252(new Class2_Sub11(local63));
						} else {
							Static89.aClass47ArrayArray1[arg0][local49].method1253(new Class2_Sub11(local63));
						}
					}
				}
			}
			Static184.aBooleanArray12[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lclient!ii;I)Lclient!ii;")
	public static Class47 method1935(@OriginalArg(0) Class47 arg0) {
		@Pc(12) Class47 local12 = Static131.method1029(arg0);
		if (local12 == null) {
			local12 = arg0.aClass47_8;
		}
		return local12;
	}
}
