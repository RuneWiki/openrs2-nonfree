import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "Lclient!mc;")
	public static Class43 aClass43_3;

	@OriginalMember(owner = "client!ed", name = "j", descriptor = "I")
	public static int anInt752;

	@OriginalMember(owner = "client!ed", name = "o", descriptor = "[I")
	public static int[] anIntArray59;

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "Lclient!v;")
	private static Class62 aClass62_312 = Static45.method753(" from your ignore list first");

	@OriginalMember(owner = "client!ed", name = "d", descriptor = "Lclient!v;")
	public static Class62 aClass62_313 = Static45.method753("Regeln versto\u001c1en hat)3");

	@OriginalMember(owner = "client!ed", name = "e", descriptor = "Lclient!v;")
	public static Class62 aClass62_314 = aClass62_312;

	@OriginalMember(owner = "client!ed", name = "h", descriptor = "I")
	public static int anInt751 = -1;

	@OriginalMember(owner = "client!ed", name = "i", descriptor = "Lclient!v;")
	public static Class62 aClass62_315 = Static45.method753("compass");

	@OriginalMember(owner = "client!ed", name = "k", descriptor = "I")
	public static int anInt753 = 78;

	@OriginalMember(owner = "client!ed", name = "l", descriptor = "Lclient!v;")
	public static Class62 aClass62_316 = Static45.method753("Privater Chat");

	@OriginalMember(owner = "client!ed", name = "m", descriptor = "[I")
	public static int[] anIntArray58 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)V")
	public static void method498(@OriginalArg(0) int arg0) {
		Static19.anInt2836 += arg0;
		while (Static14.anInt545 <= Static19.anInt2836) {
			Static19.anInt2836 -= Static14.anInt545;
			Static36.anInt1111 -= Static36.anInt1111 >> 2;
		}
		Static36.anInt1111 -= arg0 * 1000;
		if (Static36.anInt1111 < 0) {
			Static36.anInt1111 = 0;
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)V")
	public static void method499() {
		aClass62_314 = null;
		aClass62_316 = null;
		aClass43_3 = null;
		anIntArray58 = null;
		aClass62_315 = null;
		anIntArray59 = null;
		aFrame1 = null;
		aClass62_313 = null;
		aClass62_312 = null;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V")
	public static void method500() {
		while (true) {
			if (Static10.aClass3_Sub8_Sub1_5.method1820(Static63.anInt2386) >= 26) {
				@Pc(18) int local18 = Static10.aClass3_Sub8_Sub1_5.method1822(14);
				if (local18 != 16383) {
					if (Static80.aClass3_Sub1_Sub3_Sub1_Sub2Array1[local18] == null) {
						Static80.aClass3_Sub1_Sub3_Sub1_Sub2Array1[local18] = new Class3_Sub1_Sub3_Sub1_Sub2();
					}
					@Pc(37) Class3_Sub1_Sub3_Sub1_Sub2 local37 = Static80.aClass3_Sub1_Sub3_Sub1_Sub2Array1[local18];
					Static16.anIntArray52[Static39.anInt1159++] = local18;
					local37.anInt1875 = Static12.anInt451;
					local37.aClass3_Sub1_Sub4_1 = Static92.method1547(Static10.aClass3_Sub8_Sub1_5.method1822(13));
					local37.anInt1849 = Static20.anIntArray54[Static10.aClass3_Sub8_Sub1_5.method1822(3)];
					@Pc(69) int local69 = Static10.aClass3_Sub8_Sub1_5.method1822(5);
					@Pc(74) int local74 = Static10.aClass3_Sub8_Sub1_5.method1822(1);
					@Pc(79) int local79 = Static10.aClass3_Sub8_Sub1_5.method1822(5);
					@Pc(84) int local84 = Static10.aClass3_Sub8_Sub1_5.method1822(1);
					if (local79 > 15) {
						local79 -= 32;
					}
					if (local69 > 15) {
						local69 -= 32;
					}
					if (local84 == 1) {
						Static98.anIntArray283[Static90.anInt2427++] = local18;
					}
					local37.anInt1846 = local37.aClass3_Sub1_Sub4_1.anInt657;
					local37.anInt1847 = local37.aClass3_Sub1_Sub4_1.anInt653;
					local37.anInt1836 = local37.aClass3_Sub1_Sub4_1.anInt640;
					local37.anInt1879 = local37.aClass3_Sub1_Sub4_1.anInt662;
					local37.anInt1861 = local37.aClass3_Sub1_Sub4_1.anInt648;
					local37.anInt1833 = local37.aClass3_Sub1_Sub4_1.anInt658;
					local37.anInt1844 = local37.aClass3_Sub1_Sub4_1.anInt665;
					if (local37.anInt1844 == 0) {
						local37.anInt1849 = 0;
					}
					local37.method1150(Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anIntArray195[0] + local79, local69 + Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anIntArray194[0], local74 == 1);
					continue;
				}
			}
			Static10.aClass3_Sub8_Sub1_5.method1823();
			return;
		}
	}
}
