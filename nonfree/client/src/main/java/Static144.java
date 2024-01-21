import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!ra", name = "g", descriptor = "Lclient!o;")
	public static Class4_Sub1 aClass4_Sub1_47;

	@OriginalMember(owner = "client!ra", name = "h", descriptor = "Lclient!dd;")
	private static Class13 aClass13_1216 = Static161.method2971("Loading interfaces )2 ");

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1214 = aClass13_1216;

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1215 = Static161.method2971(" )2> ");

	@OriginalMember(owner = "client!ra", name = "e", descriptor = "I")
	public static int anInt3535 = 0;

	@OriginalMember(owner = "client!ra", name = "f", descriptor = "[Lclient!o;")
	public static Class4_Sub1[] aClass4_Sub1Array1 = new Class4_Sub1[256];

	@OriginalMember(owner = "client!ra", name = "i", descriptor = "I")
	public static int anInt3536 = 0;

	@OriginalMember(owner = "client!ra", name = "k", descriptor = "[Lclient!j;")
	public static Class41[] aClass41Array1 = new Class41[4];

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(B)V")
	public static void method2549() {
		aClass13_1215 = null;
		aClass13_1216 = null;
		aClass4_Sub1_47 = null;
		aClass41Array1 = null;
		aClass4_Sub1Array1 = null;
		aClass13_1214 = null;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!dd;BZ)V")
	public static void method2550(@OriginalArg(0) Class13 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(22) int local22 = Static22.aClass1_Sub2_Sub1_Sub1_Sub1_5.method250(arg0, 250);
		@Pc(29) int local29 = Static22.aClass1_Sub2_Sub1_Sub1_Sub1_5.method248(arg0, 250) * 13;
		Static128.method565(6, 6, local22 + 4 + 4, local29 + 4 + 4, 0);
		Static128.method554(6, 6, local22 + 4 + 4, local29 + 4 - -4, 16777215);
		Static22.aClass1_Sub2_Sub1_Sub1_Sub1_5.method245(arg0, 10, 10, local22, local29, 16777215, -1, 1, 1, 0);
		Static186.method3019(local29 + 8, local22 + 4 + 4, 6, 6);
		if (!arg1) {
			Static63.method1431(local29, 10, local22, 10);
			return;
		}
		try {
			@Pc(108) Graphics local108 = Static106.aCanvas1.getGraphics();
			Static85.aClass14_1.method3032(local108);
		} catch (@Pc(116) Exception local116) {
			Static106.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(ZJ)V")
	public static void method2551(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < Static124.anInt3220; local17++) {
			if (arg0 == Static5.aLongArray1[local17]) {
				Static124.anInt3220--;
				for (@Pc(39) int local39 = local17; local39 < Static124.anInt3220; local39++) {
					Static5.aLongArray1[local39] = Static5.aLongArray1[local39 + 1];
					Static52.aClass13Array13[local39] = Static52.aClass13Array13[local39 + 1];
				}
				Static88.anInt2490 = Static10.anInt388;
				Static1.aClass1_Sub8_Sub1_1.method1654(71);
				Static1.aClass1_Sub8_Sub1_1.method1625(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!ag;I)V")
	public static void method2552(@OriginalArg(0) Class4 arg0) {
		Static170.aClass4_98 = arg0;
	}
}
