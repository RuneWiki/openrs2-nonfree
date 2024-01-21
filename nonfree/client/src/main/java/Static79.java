import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!na", name = "n", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!na", name = "w", descriptor = "[I")
	public static int[] anIntArray304;

	@OriginalMember(owner = "client!na", name = "j", descriptor = "Lclient!ua;")
	public static Class1_Sub20_Sub1 aClass1_Sub20_Sub1_2 = new Class1_Sub20_Sub1(5000);

	@OriginalMember(owner = "client!na", name = "m", descriptor = "Lclient!af;")
	public static Class5 aClass5_953 = Static45.method1937("Spieler");

	@OriginalMember(owner = "client!na", name = "o", descriptor = "Lclient!af;")
	private static Class5 aClass5_954 = Static45.method1937("To play on this world move to a free area first");

	@OriginalMember(owner = "client!na", name = "p", descriptor = "Z")
	public static boolean aBoolean64 = false;

	@OriginalMember(owner = "client!na", name = "r", descriptor = "I")
	public static int anInt1891 = 0;

	@OriginalMember(owner = "client!na", name = "s", descriptor = "Lclient!af;")
	public static Class5 aClass5_955 = Static45.method1937("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

	@OriginalMember(owner = "client!na", name = "v", descriptor = "Lclient!af;")
	public static Class5 aClass5_956 = aClass5_954;

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(B)V")
	public static void method1370() {
		for (@Pc(10) Class1_Sub22 local10 = (Class1_Sub22) Static66.aClass53_17.method1442(); local10 != null; local10 = (Class1_Sub22) Static66.aClass53_17.method1450()) {
			if (local10.anInt2727 == -1) {
				local10.anInt2742 = 0;
				Static100.method1695(local10);
			} else {
				local10.method2220();
			}
		}
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(B)V")
	public static void method1371() {
		while (true) {
			if (aClass1_Sub20_Sub1_2.method2122(Static77.anInt1803) >= 27) {
				@Pc(20) int local20 = aClass1_Sub20_Sub1_2.method2115(15);
				if (local20 != 32767) {
					@Pc(27) boolean local27 = false;
					if (Static104.aClass1_Sub3_Sub4_Sub2_Sub2Array1[local20] == null) {
						Static104.aClass1_Sub3_Sub4_Sub2_Sub2Array1[local20] = new Class1_Sub3_Sub4_Sub2_Sub2();
						local27 = true;
					}
					@Pc(43) Class1_Sub3_Sub4_Sub2_Sub2 local43 = Static104.aClass1_Sub3_Sub4_Sub2_Sub2Array1[local20];
					Static131.anIntArray468[Static93.anInt2338++] = local20;
					local43.anInt3066 = Static131.anInt3270;
					@Pc(59) int local59 = aClass1_Sub20_Sub1_2.method2115(5);
					if (local59 > 15) {
						local59 -= 32;
					}
					@Pc(68) int local68 = aClass1_Sub20_Sub1_2.method2115(5);
					@Pc(75) int local75 = Static5.anIntArray28[aClass1_Sub20_Sub1_2.method2115(3)];
					if (local68 > 15) {
						local68 -= 32;
					}
					if (local27) {
						local43.anInt3080 = local43.anInt3073 = local75;
					}
					local43.aClass1_Sub3_Sub12_1 = Static115.method2023(aClass1_Sub20_Sub1_2.method2115(14));
					@Pc(102) int local102 = aClass1_Sub20_Sub1_2.method2115(1);
					if (local102 == 1) {
						Static20.anIntArray83[Static86.anInt2184++] = local20;
					}
					@Pc(120) int local120 = aClass1_Sub20_Sub1_2.method2115(1);
					local43.anInt3056 = local43.aClass1_Sub3_Sub12_1.anInt2115;
					local43.anInt3078 = local43.aClass1_Sub3_Sub12_1.anInt2096;
					local43.anInt3051 = local43.aClass1_Sub3_Sub12_1.anInt2101;
					local43.anInt3046 = local43.aClass1_Sub3_Sub12_1.anInt2106;
					local43.anInt3063 = local43.aClass1_Sub3_Sub12_1.anInt2092;
					local43.anInt3041 = local43.aClass1_Sub3_Sub12_1.anInt2113;
					local43.anInt3062 = local43.aClass1_Sub3_Sub12_1.anInt2116;
					if (local43.anInt3056 == 0) {
						local43.anInt3073 = 0;
					}
					local43.anInt3050 = local43.aClass1_Sub3_Sub12_1.anInt2117;
					local43.anInt3055 = local43.aClass1_Sub3_Sub12_1.anInt2095;
					local43.method2151(local68 + Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anIntArray443[0], local59 + Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anIntArray446[0], local120 == 1);
					continue;
				}
			}
			aClass1_Sub20_Sub1_2.method2111();
			return;
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(BLjava/awt/Component;)V")
	public static void method1372(@OriginalArg(1) Component arg0) {
		arg0.addMouseListener(Static93.aClass18_1);
		arg0.addMouseMotionListener(Static93.aClass18_1);
		arg0.addFocusListener(Static93.aClass18_1);
	}

	@OriginalMember(owner = "client!na", name = "c", descriptor = "(B)V")
	public static void method1373() {
		aClass5_954 = null;
		aByteArrayArrayArray4 = null;
		aClass5_956 = null;
		anIntArray304 = null;
		aClass5_955 = null;
		aClass5_953 = null;
		aClass1_Sub20_Sub1_2 = null;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(I)V")
	public static void method1374() {
		Static44.anIntArray188 = new int[33];
		Static90.anIntArray337 = new int[151];
		Static12.anIntArray462 = new int[151];
		Static56.anIntArray220 = new int[33];
		@Pc(23) int local23;
		@Pc(25) int local25;
		@Pc(27) int local27;
		for (@Pc(19) int local19 = 0; local19 < 33; local19++) {
			local23 = 999;
			local25 = 0;
			for (local27 = 0; local27 < 34; local27++) {
				if (Static81.aClass1_Sub3_Sub1_Sub3_4.aByteArray33[local19 * Static81.aClass1_Sub3_Sub1_Sub3_4.anInt2443 + local27] == 0) {
					if (local23 == 999) {
						local23 = local27;
					}
				} else if (local23 != 999) {
					local25 = local27;
					break;
				}
			}
			Static56.anIntArray220[local19] = local23;
			Static44.anIntArray188[local19] = local25 - local23;
		}
		for (local23 = 5; local23 < 156; local23++) {
			local27 = 0;
			local25 = 999;
			for (@Pc(84) int local84 = 25; local84 < 172; local84++) {
				if (Static81.aClass1_Sub3_Sub1_Sub3_4.aByteArray33[local84 + Static81.aClass1_Sub3_Sub1_Sub3_4.anInt2443 * local23] == 0 && (local84 > 34 || local23 > 34)) {
					if (local25 == 999) {
						local25 = local84;
					}
				} else if (local25 != 999) {
					local27 = local84;
					break;
				}
			}
			Static90.anIntArray337[local23 - 5] = local25 - 25;
			Static12.anIntArray462[local23 - 5] = local27 - local25;
		}
	}
}
