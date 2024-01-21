import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!ej", name = "y", descriptor = "I")
	public static int anInt1235;

	@OriginalMember(owner = "client!ej", name = "C", descriptor = "Lclient!dc;")
	public static final Class19 aClass19_1 = new Class19();

	@OriginalMember(owner = "client!ej", name = "G", descriptor = "Z")
	public static boolean aBoolean72 = false;

	@OriginalMember(owner = "client!ej", name = "I", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_375 = Static181.method2795("T");

	@OriginalMember(owner = "client!ej", name = "O", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_376 = Static181.method2795("Lade Schrifts-=tze )2 ");

	@OriginalMember(owner = "client!ej", name = "P", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_377 = Static181.method2795("lila:");

	@OriginalMember(owner = "client!ej", name = "S", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_378 = Static181.method2795("Mem:");

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(ILclient!eh;IILclient!eh;)Lclient!od;")
	public static Class2_Sub2_Sub5 method952(@OriginalArg(0) int arg0, @OriginalArg(1) Class28 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class28 arg3) {
		return Static66.method1261(arg2, arg0, arg1) ? Static200.method3030(arg3.method852(arg2, arg0)) : null;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIII)Z")
	public static boolean method953(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(9) int local9 = arg3 * Static112.anInt1951 + arg0 * Static213.anInt4239 >> 16;
		@Pc(19) int local19 = arg3 * Static213.anInt4239 - arg0 * Static112.anInt1951 >> 16;
		@Pc(29) int local29 = arg1 * Static163.anInt3267 + local19 * anInt1235 >> 16;
		@Pc(39) int local39 = arg1 * anInt1235 - local19 * Static163.anInt3267 >> 16;
		if (local29 < 1) {
			local29 = 1;
		}
		@Pc(50) int local50 = (local9 << 9) / local29;
		@Pc(56) int local56 = (local39 << 9) / local29;
		@Pc(66) int local66 = arg2 * Static163.anInt3267 + local19 * anInt1235 >> 16;
		@Pc(76) int local76 = arg2 * anInt1235 - local19 * Static163.anInt3267 >> 16;
		if (local66 < 1) {
			local66 = 1;
		}
		@Pc(87) int local87 = (local9 << 9) / local66;
		@Pc(93) int local93 = (local76 << 9) / local66;
		if (local29 < 50 && local66 < 50) {
			return false;
		} else if (local29 > 3500 && local66 > 3500) {
			return false;
		} else if (local50 < Static17.anInt498 && local87 < Static17.anInt498) {
			return false;
		} else if (local50 > Static120.anInt2732 && local87 > Static120.anInt2732) {
			return false;
		} else if (local56 < Static96.anInt2067 && local93 < Static96.anInt2067) {
			return false;
		} else {
			return local56 <= Static106.anInt2443 || local93 <= Static106.anInt2443;
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	public static void method958(@OriginalArg(0) Component arg0) {
		arg0.removeKeyListener(Static85.aClass27_1);
		arg0.removeFocusListener(Static85.aClass27_1);
		Static82.anInt1828 = -1;
	}

	@OriginalMember(owner = "client!ej", name = "c", descriptor = "(I)V")
	public static void method959() {
		Static98.anInt2124 = 0;
		Static121.anInt2747 = 0;
		Static148.anInt3046 = -1;
		Static131.anInt2843 = 0;
		Static168.anInt3481 = -1;
		Static159.aBoolean152 = false;
		Static130.anInt2830 = 0;
		Static2.anInt56 = -1;
		Static170.anInt3526 = 0;
		Static17.anInt503 = 0;
		Static69.aClass2_Sub3_Sub1_2.anInt340 = 0;
		Static33.aClass2_Sub3_Sub1_1.anInt340 = 0;
		Static197.anInt3927 = -1;
		for (@Pc(40) int local40 = 0; local40 < Static22.aClass24_Sub4_Sub1Array1.length; local40++) {
			if (Static22.aClass24_Sub4_Sub1Array1[local40] != null) {
				Static22.aClass24_Sub4_Sub1Array1[local40].anInt3299 = -1;
			}
		}
		for (@Pc(58) int local58 = 0; local58 < Static47.aClass24_Sub4_Sub2Array1.length; local58++) {
			if (Static47.aClass24_Sub4_Sub2Array1[local58] != null) {
				Static47.aClass24_Sub4_Sub2Array1[local58].anInt3299 = -1;
			}
		}
		Static153.method2527();
		Static197.method2972(30);
		for (@Pc(85) int local85 = 0; local85 < 100; local85++) {
			Static124.aBooleanArray16[local85] = true;
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lclient!ae;B)V")
	public static void method960(@OriginalArg(0) Class5 arg0) {
		@Pc(15) int local15 = arg0.anInt147 == 0 ? arg0.anInt157 : arg0.anInt147;
		@Pc(27) int local27 = arg0.anInt114 == 0 ? arg0.anInt100 : arg0.anInt114;
		Static210.method3195(local27, arg0.anInt159, Static175.aClass5ArrayArray1[arg0.anInt159 >> 16], local15);
		if (arg0.aClass5Array1 != null) {
			Static210.method3195(local27, arg0.anInt159, arg0.aClass5Array1, local15);
		}
		@Pc(63) Class2_Sub13 local63 = (Class2_Sub13) Static33.aClass63_3.method2110((long) arg0.anInt159);
		if (local63 != null) {
			Static22.method432(local63.anInt1869, local15, local27);
		}
	}
}
