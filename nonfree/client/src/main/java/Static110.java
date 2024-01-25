import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!go", name = "H", descriptor = "I")
	public static int anInt2235 = 0;

	@OriginalMember(owner = "client!go", name = "J", descriptor = "Ljava/lang/String;")
	public static String aString90 = "Please remove ";

	@OriginalMember(owner = "client!go", name = "N", descriptor = "I")
	public static volatile int anInt2240 = 0;

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(Lclient!eb;I)V")
	public static void method2055(@OriginalArg(0) Class1_Sub7 arg0) {
		@Pc(9) int local9 = arg0.method3145();
		Static275.aClass182Array1 = new Class182[local9];
		for (@Pc(14) int local14 = 0; local14 < local9; local14++) {
			Static275.aClass182Array1[local14] = new Class182();
			Static275.aClass182Array1[local14].anInt5376 = arg0.method3145();
			Static275.aClass182Array1[local14].aString216 = arg0.method3095();
		}
		Static116.anInt2306 = arg0.method3145();
		Static5.anInt98 = arg0.method3145();
		Static152.anInt3054 = arg0.method3145();
		Static253.aClass74_Sub1Array1 = new Class74_Sub1[Static5.anInt98 + 1 - Static116.anInt2306];
		for (@Pc(74) int local74 = 0; local74 < Static152.anInt3054; local74++) {
			@Pc(80) int local80 = arg0.method3145();
			@Pc(88) Class74_Sub1 local88 = Static253.aClass74_Sub1Array1[local80] = new Class74_Sub1();
			local88.anInt2254 = arg0.method3141();
			local88.anInt2255 = arg0.method3125();
			local88.anInt2267 = Static116.anInt2306 + local80;
			local88.aString92 = arg0.method3095();
			local88.aString91 = arg0.method3095();
		}
		Static335.anInt6373 = arg0.method3125();
		Static293.aBoolean499 = true;
	}
}
