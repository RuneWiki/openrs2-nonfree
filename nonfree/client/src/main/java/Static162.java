import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!ug", name = "o", descriptor = "[Lclient!fb;")
	public static Class3_Sub2_Sub2_Sub4[] aClass3_Sub2_Sub2_Sub4Array9 = new Class3_Sub2_Sub2_Sub4[1000];

	@OriginalMember(owner = "client!ug", name = "p", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1373 = Static170.method3101("Standort");

	@OriginalMember(owner = "client!ug", name = "q", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1374 = Static170.method3101("::");

	@OriginalMember(owner = "client!ug", name = "y", descriptor = "I")
	public static int anInt3948 = 500;

	@OriginalMember(owner = "client!ug", name = "C", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1375 = Static170.method3101("<br>");

	@OriginalMember(owner = "client!ug", name = "c", descriptor = "(I)V")
	public static void method3011() {
		Static80.anInt3606 = 0;
		Static81.anInt2370 = 0;
		Static5.method101();
		Static134.method2620();
		Static172.method3137();
		@Pc(20) int local20;
		for (@Pc(15) int local15 = 0; local15 < Static80.anInt3606; local15++) {
			local20 = Static93.anIntArray446[local15];
			if (Static115.aClass3_Sub2_Sub1_Sub2_Sub2Array1[local20].anInt1830 != Static14.anInt481) {
				Static115.aClass3_Sub2_Sub1_Sub2_Sub2Array1[local20].aClass3_Sub2_Sub7_1 = null;
				Static115.aClass3_Sub2_Sub1_Sub2_Sub2Array1[local20] = null;
			}
		}
		if (Static11.anInt410 != Static18.aClass3_Sub8_Sub1_1.anInt1948) {
			throw new RuntimeException("gnp1 pos:" + Static18.aClass3_Sub8_Sub1_1.anInt1948 + " psize:" + Static11.anInt410);
		}
		for (local20 = 0; local20 < Static69.anInt2115; local20++) {
			if (Static115.aClass3_Sub2_Sub1_Sub2_Sub2Array1[Static117.anIntArray523[local20]] == null) {
				throw new RuntimeException("gnp2 pos:" + local20 + " size:" + Static69.anInt2115);
			}
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IBILclient!ah;)Z")
	public static boolean method3012(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class7 arg2) {
		@Pc(17) byte[] local17 = arg2.method1021(arg0, arg1);
		if (local17 == null) {
			return false;
		} else {
			Static71.method1654(local17);
			return true;
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(B)V")
	public static void method3013() {
		aClass3_Sub2_Sub2_Sub4Array9 = null;
		aClass28_1374 = null;
		aClass28_1375 = null;
		aClass28_1373 = null;
	}
}
