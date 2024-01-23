import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "I")
	public static int anInt2865;

	@OriginalMember(owner = "client!ch", name = "m", descriptor = "Lclient!jb;")
	public static Class28 aClass28_51;

	@OriginalMember(owner = "client!ch", name = "e", descriptor = "Lclient!sc;")
	public static Class107 aClass107_770 = Static231.method3737("hint_headicons");

	@OriginalMember(owner = "client!ch", name = "i", descriptor = "Lclient!sc;")
	public static Class107 aClass107_771 = Static231.method3737("Sprites geladen)3");

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(III)V")
	public static void method2199(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static224.method3669(arg1)) {
			Static65.method1212(Static6.aClass86ArrayArray11[arg1], arg0);
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(ZI)Lclient!tj;")
	public static Class1_Sub2_Sub17 method2201(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub2_Sub17 local10 = (Class1_Sub2_Sub17) Static37.aClass8_2.method312((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(24) byte[] local24 = Static213.aClass28_75.method819(Static221.method3626(arg0), Static201.method3221(arg0));
		local10 = new Class1_Sub2_Sub17();
		if (local24 != null) {
			local10.method3281(new Class1_Sub26(local24));
		}
		Static37.aClass8_2.method304(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(B)I")
	public static int method2202() {
		return Static182.anInt4083;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(JI)V")
	public static void method2203(@OriginalArg(0) long arg0) {
		Static193.aClass1_Sub26_Sub1_2.anInt4021 = 0;
		Static193.aClass1_Sub26_Sub1_2.method2967(190);
		Static193.aClass1_Sub26_Sub1_2.method2940(arg0);
		Static122.anInt2676 = 1;
		Static143.anInt3140 = -3;
		Static100.anInt2168 = 0;
		Static59.anInt1428 = 0;
	}

	@OriginalMember(owner = "client!ch", name = "c", descriptor = "(I)Lclient!ka;")
	public static Class64_Sub1 method2206() {
		@Pc(25) Class64_Sub1 local25 = new Class64_Sub1(Static155.anInt432, Static182.anInt4094, Static56.anIntArray124[0], Static223.anIntArray373[0], Static141.anIntArray266[0], Static172.anIntArray329[0], Static158.aByteArrayArray7[0], Static169.anIntArray324);
		Static158.method2564();
		return local25;
	}
}
