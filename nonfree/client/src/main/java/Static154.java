import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!fp", name = "J", descriptor = "Lclient!mh;")
	public static Class208 aClass208_3;

	@OriginalMember(owner = "client!fp", name = "Q", descriptor = "Lclient!tf;")
	public static Class322 aClass322_61;

	@OriginalMember(owner = "client!fp", name = "O", descriptor = "Lclient!sb;")
	public static final Class303 aClass303_39 = new Class303(11, 3);

	@OriginalMember(owner = "client!fp", name = "c", descriptor = "(I)V")
	public static void method2914() {
		for (@Pc(3) int local3 = 0; local3 < 5; local3++) {
			Static350.aBooleanArray20[local3] = false;
		}
		Static379.anInt6482 = 1;
		Static477.anInt7888 = 0;
		Static562.anInt9174 = 0;
		Static391.anInt6856 = -1;
		Static18.anInt314 = -1;
		Static91.anInt1908 = -1;
		Static1.anInt1 = -1;
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method2915(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static591.anInt9675; local11++) {
			if (arg0.equalsIgnoreCase(Static22.aStringArray1[local11])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.aString95);
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(Lclient!r;Z)V")
	public static void method2918(@OriginalArg(0) Class45 arg0) {
		Static212.aClass66Array1 = new Class66[Static213.anIntArray500.length];
		for (@Pc(15) int local15 = 0; local15 < Static213.anIntArray500.length; local15++) {
			@Pc(21) int local21 = Static213.anIntArray500[local15];
			@Pc(26) Class134 local26 = Static149.method2843(local21, Static258.aClass322_128);
			@Pc(34) Class54 local34 = arg0.method7394(local26, Static604.method6158(Static119.aClass322_43, local21));
			Static212.aClass66Array1[local15] = new Class66(local34, local26);
		}
	}

	@OriginalMember(owner = "client!fp", name = "g", descriptor = "(I)I")
	public static int method2919() {
		return Static213.anIntArray500 == null ? 0 : Static213.anIntArray500.length * 2;
	}
}
