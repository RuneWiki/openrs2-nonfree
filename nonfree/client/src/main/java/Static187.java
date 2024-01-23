import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static187 {

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "Lclient!oh;")
	public static Class1_Sub1_Sub10 aClass1_Sub1_Sub10_3;

	@OriginalMember(owner = "client!sb", name = "e", descriptor = "[I")
	public static int[] anIntArray434;

	@OriginalMember(owner = "client!sb", name = "g", descriptor = "Lclient!pa;")
	public static Class86 aClass86_71;

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "[Lclient!hh;")
	public static Class50[] aClass50Array73 = new Class50[100];

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "Lclient!hh;")
	private static Class50 aClass50_1244 = Static186.method3527("Free world");

	@OriginalMember(owner = "client!sb", name = "f", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1245 = aClass50_1244;

	@OriginalMember(owner = "client!sb", name = "i", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1246 = Static186.method3527("::clientdrop");

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(III)V")
	public static void method3088(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static152.anInt3168 != 0 && arg0 != -1) {
			Static200.method3205(Static152.anInt3168, arg0, Static212.aClass86_Sub1_41);
			Static159.aBoolean199 = true;
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)V")
	public static void method3089() {
		for (@Pc(14) int local14 = 0; local14 < Static80.anInt1584; local14++) {
			@Pc(20) int local20 = Static164.anIntArray360[local14];
			@Pc(24) Class20_Sub3_Sub1 local24 = Static232.aClass20_Sub3_Sub1Array1[local20];
			@Pc(28) int local28 = Static97.aClass1_Sub17_Sub1_2.method2142();
			if ((local28 & 0x2) != 0) {
				local28 += Static97.aClass1_Sub17_Sub1_2.method2142() << 8;
			}
			Static47.method720(local20, local24, local28);
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)I")
	public static int method3090(@OriginalArg(0) int arg0) {
		if (arg0 >= 97 && arg0 <= 122 || arg0 >= 224 && arg0 <= 254 && arg0 != 247) {
			return arg0 - 32;
		} else if (arg0 == 255) {
			return 159;
		} else if (arg0 == 156) {
			return 140;
		} else {
			return arg0;
		}
	}
}
