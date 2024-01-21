import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!s", name = "X", descriptor = "[S")
	public static short[] aShortArray52;

	@OriginalMember(owner = "client!s", name = "M", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_1267 = Static161.method2452("Loading interfaces )2 ");

	@OriginalMember(owner = "client!s", name = "T", descriptor = "Z")
	public static boolean aBoolean154 = true;

	@OriginalMember(owner = "client!s", name = "U", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1268 = Static161.method2452("underlay)3dat");

	@OriginalMember(owner = "client!s", name = "cb", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_1272 = Static161.method2452("flash1:");

	@OriginalMember(owner = "client!s", name = "W", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1269 = aClass20_1272;

	@OriginalMember(owner = "client!s", name = "Y", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1270 = Static161.method2452("<col=ff9040>");

	@OriginalMember(owner = "client!s", name = "Z", descriptor = "Lclient!dc;")
	public static Class20 aClass20_1271 = aClass20_1272;

	@OriginalMember(owner = "client!s", name = "ab", descriptor = "[I")
	public static final int[] anIntArray364 = new int[256];

	@OriginalMember(owner = "client!s", name = "eb", descriptor = "Lclient!dc;")
	public static Class20 aClass20_1273 = aClass20_1267;

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!wa;Lclient!wa;Ljava/awt/Component;I)V")
	public static void method2623(@OriginalArg(0) Class23 arg0, @OriginalArg(1) Class23 arg1, @OriginalArg(2) Component arg2) {
		if (Static63.aBoolean71) {
			return;
		}
		Static42.method821();
		@Pc(15) byte[] local15 = arg0.method738(0, Static65.anInt1421);
		Static123.aClass5_Sub2_Sub10_Sub1_4 = new Class5_Sub2_Sub10_Sub1(local15, arg2);
		Static43.aClass5_Sub2_Sub10_Sub1_1 = Static123.aClass5_Sub2_Sub10_Sub1_4.method2416();
		Static130.aClass47_4 = Static176.method2676(arg1, Static73.anInt1587);
		Static30.aClass47_1 = Static176.method2676(arg1, Static4.anInt108);
		Static86.aClass47_2 = Static176.method2676(arg1, Static55.anInt1159);
		Static143.aClass47_Sub1Array1 = Static135.method2101(arg1, Static98.anInt2103);
		Static127.aClass47Array10 = Static213.method3128(arg1, Static123.anInt2609);
		Static205.anIntArray413 = new int[256];
		for (@Pc(54) int local54 = 0; local54 < 64; local54++) {
			Static205.anIntArray413[local54] = local54 * 262144;
		}
		for (@Pc(68) int local68 = 0; local68 < 64; local68++) {
			Static205.anIntArray413[local68 + 64] = local68 * 1024 + 16711680;
		}
		for (@Pc(88) int local88 = 0; local88 < 64; local88++) {
			Static205.anIntArray413[local88 + 128] = local88 * 4 + 16776960;
		}
		for (@Pc(106) int local106 = 0; local106 < 64; local106++) {
			Static205.anIntArray413[local106 + 192] = 16777215;
		}
		Static82.anIntArray177 = new int[256];
		for (@Pc(123) int local123 = 0; local123 < 64; local123++) {
			Static82.anIntArray177[local123] = local123 * 1024;
		}
		for (@Pc(139) int local139 = 0; local139 < 64; local139++) {
			Static82.anIntArray177[local139 + 64] = local139 * 4 + 65280;
		}
		for (@Pc(160) int local160 = 0; local160 < 64; local160++) {
			Static82.anIntArray177[local160 + 128] = local160 * 262144 + 65535;
		}
		for (@Pc(186) int local186 = 0; local186 < 64; local186++) {
			Static82.anIntArray177[local186 + 192] = 16777215;
		}
		Static72.anIntArray143 = new int[256];
		for (@Pc(203) int local203 = 0; local203 < 64; local203++) {
			Static72.anIntArray143[local203] = local203 * 4;
		}
		for (@Pc(219) int local219 = 0; local219 < 64; local219++) {
			Static72.anIntArray143[local219 + 64] = local219 * 262144 + 255;
		}
		for (@Pc(240) int local240 = 0; local240 < 64; local240++) {
			Static72.anIntArray143[local240 + 128] = local240 * 1024 + 16711935;
		}
		for (@Pc(258) int local258 = 0; local258 < 64; local258++) {
			Static72.anIntArray143[local258 + 192] = 16777215;
		}
		Static183.anIntArray379 = new int[32768];
		Static13.anIntArray409 = new int[256];
		Static56.anIntArray110 = new int[32768];
		Static217.method3204(null);
		Static90.anIntArray190 = new int[32768];
		Static214.anInt4152 = 0;
		Static158.aBoolean67 = false;
		Static17.aClass20_161 = Static17.aClass20_159;
		Static54.anIntArray108 = new int[32768];
		Static17.aClass20_162 = Static17.aClass20_159;
		if (Static46.anInt1037 == 0) {
			Static147.aBoolean129 = true;
		} else {
			Static147.aBoolean129 = false;
		}
		if (Static147.aBoolean129) {
			Static79.method1391();
		} else {
			Static90.method1499(Static8.anInt201, Static59.aClass23_Sub1_7, 255);
		}
		Static17.method285(false);
		Static63.aBoolean71 = true;
		Static209.method3117();
		Static96.aClass5_Sub2_Sub10_Sub1_3 = new Class5_Sub2_Sub10_Sub1(128, 254);
		Static93.aClass5_Sub2_Sub10_Sub1_5 = new Class5_Sub2_Sub10_Sub1(128, 254);
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	public static void method2624(@OriginalArg(0) Component arg0) {
		arg0.removeKeyListener(Static82.aClass37_1);
		arg0.removeFocusListener(Static82.aClass37_1);
		Static36.anInt784 = -1;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!dc;Z)V")
	public static void method2626(@OriginalArg(0) Class20 arg0) {
		if (Static129.aClass5_Sub19Array1 == null) {
			return;
		}
		@Pc(12) long local12 = arg0.method595();
		@Pc(14) int local14 = 0;
		if (local12 == 0L) {
			return;
		}
		while (local14 < Static129.aClass5_Sub19Array1.length && Static129.aClass5_Sub19Array1[local14].aLong253 != local12) {
			local14++;
		}
		if (Static129.aClass5_Sub19Array1.length > local14 && Static129.aClass5_Sub19Array1[local14] != null) {
			Static43.aClass5_Sub6_Sub1_2.method3087(87);
			Static43.aClass5_Sub6_Sub1_2.method3037(Static129.aClass5_Sub19Array1[local14].aLong253);
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIII)I")
	public static int method2627(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 < arg0) {
			return arg0;
		} else if (arg1 <= arg2) {
			return arg1;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(II)V")
	public static void method2628(@OriginalArg(1) int arg0) {
		if (arg0 == 37) {
			Static29.aDouble1 = 3.0D;
		} else if (arg0 == 50) {
			Static29.aDouble1 = 4.0D;
		} else if (arg0 == 75) {
			Static29.aDouble1 = 6.0D;
		} else {
			Static29.aDouble1 = 8.0D;
		}
		Static148.anInt3057 = -1;
		Static148.anInt3057 = -1;
	}
}
