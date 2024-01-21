import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!m", name = "ob", descriptor = "[Lclient!de;")
	public static Class1_Sub1_Sub4_Sub1[] aClass1_Sub1_Sub4_Sub1Array8;

	@OriginalMember(owner = "client!m", name = "pb", descriptor = "I")
	public static int anInt1854 = 0;

	@OriginalMember(owner = "client!m", name = "Ab", descriptor = "Lclient!kd;")
	private static Class39 aClass39_918 = Static108.method1915("Loading textures )2 ");

	@OriginalMember(owner = "client!m", name = "qb", descriptor = "Lclient!kd;")
	public static Class39 aClass39_917 = aClass39_918;

	@OriginalMember(owner = "client!m", name = "vb", descriptor = "I")
	public static int anInt1858 = 0;

	@OriginalMember(owner = "client!m", name = "Cb", descriptor = "Lclient!kd;")
	public static Class39 aClass39_919 = Static108.method1915("Bitte starten Sie eine Mitgliedschaft");

	@OriginalMember(owner = "client!m", name = "Wb", descriptor = "Lclient!kd;")
	private static Class39 aClass39_922 = Static108.method1915("flash1:");

	@OriginalMember(owner = "client!m", name = "Hb", descriptor = "Lclient!kd;")
	public static Class39 aClass39_920 = aClass39_922;

	@OriginalMember(owner = "client!m", name = "Ib", descriptor = "Lclient!kd;")
	public static Class39 aClass39_921 = Static108.method1915("titlebutton");

	@OriginalMember(owner = "client!m", name = "cc", descriptor = "Lclient!kd;")
	public static Class39 aClass39_923 = aClass39_922;

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIB)V")
	public static void method1279(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 < 128 || arg0 < 128 || arg1 > 13056 || arg0 > 13056) {
			Static9.anInt2985 = -1;
			Static38.anInt1158 = -1;
			return;
		}
		@Pc(32) int local32 = Static62.method2035(Static9.anInt2983, arg1, arg0) - arg2;
		@Pc(36) int local36 = Class1_Sub1_Sub4_Sub2.anIntArray142[Static104.anInt2640];
		@Pc(40) int local40 = local32 - Static22.anInt763;
		@Pc(44) int local44 = arg1 - Static28.anInt2564;
		@Pc(48) int local48 = Class1_Sub1_Sub4_Sub2.anIntArray138[Static104.anInt2640];
		@Pc(56) int local56 = Class1_Sub1_Sub4_Sub2.anIntArray138[Static38.anInt1156];
		@Pc(60) int local60 = Class1_Sub1_Sub4_Sub2.anIntArray142[Static38.anInt1156];
		@Pc(64) int local64 = arg0 - Static62.anInt2932;
		@Pc(74) int local74 = local44 * local60 + local64 * local56 >> 16;
		@Pc(84) int local84 = local60 * local64 - local56 * local44 >> 16;
		@Pc(86) int local86 = local74;
		@Pc(97) int local97 = local36 * local40 - local48 * local84 >> 16;
		@Pc(107) int local107 = local84 * local36 + local40 * local48 >> 16;
		if (local107 < 50) {
			Static38.anInt1158 = -1;
			Static9.anInt2985 = -1;
		} else {
			Static9.anInt2985 = (local86 << 9) / local107 + 256;
			Static38.anInt1158 = (local97 << 9) / local107 + 167;
		}
	}

	@OriginalMember(owner = "client!m", name = "d", descriptor = "(B)Lclient!oc;")
	public static Class54 method1282() {
		try {
			return (Class54) Class.forName("Class54_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(15) Throwable local15) {
			return null;
		}
	}

	@OriginalMember(owner = "client!m", name = "e", descriptor = "(I)V")
	public static void method1283() {
		aClass39_921 = null;
		aClass39_922 = null;
		aClass39_920 = null;
		aClass1_Sub1_Sub4_Sub1Array8 = null;
		aClass39_918 = null;
		aClass39_919 = null;
		aClass39_923 = null;
		aClass39_917 = null;
	}

	@OriginalMember(owner = "client!m", name = "e", descriptor = "(B)V")
	public static void method1284() {
		for (@Pc(10) Class1_Sub1_Sub2_Sub2 local10 = (Class1_Sub1_Sub2_Sub2) Static53.aClass31_32.method1000(); local10 != null; local10 = (Class1_Sub1_Sub2_Sub2) Static53.aClass31_32.method1003()) {
			if (Static9.anInt2983 != local10.anInt626 || local10.aBoolean55) {
				local10.method2128();
			} else if (Static45.anInt1256 >= local10.anInt615) {
				local10.method359(Static107.anInt2687);
				if (local10.aBoolean55) {
					local10.method2128();
				} else {
					Static32.aClass5_2.method108(local10.anInt626, local10.anInt625, local10.anInt632, local10.anInt619, 60, local10, 0, -1, false);
				}
			}
		}
	}
}
