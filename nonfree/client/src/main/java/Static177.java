import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

	@OriginalMember(owner = "client!ua", name = "J", descriptor = "I")
	public static int anInt3976;

	@OriginalMember(owner = "client!ua", name = "r", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1531 = Static120.method1824("settings");

	@OriginalMember(owner = "client!ua", name = "s", descriptor = "Lclient!af;")
	public static final Class5 aClass5_58 = new Class5(64);

	@OriginalMember(owner = "client!ua", name = "E", descriptor = "[[I")
	public static final int[][] anIntArrayArray39 = new int[104][104];

	@OriginalMember(owner = "client!ua", name = "G", descriptor = "Z")
	public static boolean aBoolean156 = false;

	@OriginalMember(owner = "client!ua", name = "H", descriptor = "I")
	public static int anInt3975 = 0;

	@OriginalMember(owner = "client!ua", name = "I", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1532 = Static120.method1824("; Max)2Age=");

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Z)I")
	public static int method2834() {
		return 6;
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(B)V")
	public static void method2835() {
		Static146.aClass3_Sub17_Sub1_3.method2146(71);
		Static146.aClass3_Sub17_Sub1_3.method2112(0L);
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(Z)Lclient!dg;")
	public static Class20 method2836() {
		try {
			return (Class20) Class.forName("Class20_Sub2").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return new Class20_Sub1();
		}
	}

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "(I)V")
	public static void method2837() {
		Static92.aClass20_2.method1226();
		for (@Pc(10) int local10 = 0; local10 < 32; local10++) {
			Static7.aLongArray1[local10] = 0L;
		}
		for (@Pc(24) int local24 = 0; local24 < 32; local24++) {
			Static42.aLongArray2[local24] = 0L;
		}
		Static6.anInt211 = 0;
	}

	@OriginalMember(owner = "client!ua", name = "e", descriptor = "(I)V")
	public static void method2839() {
		Static193.aBoolean174 = false;
		Static96.aBoolean83 = false;
	}
}
