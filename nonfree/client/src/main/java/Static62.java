import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!k", name = "e", descriptor = "Lclient!ie;")
	public static Class35 aClass35_14;

	@OriginalMember(owner = "client!k", name = "g", descriptor = "Lclient!ie;")
	public static Class35 aClass35_15;

	@OriginalMember(owner = "client!k", name = "m", descriptor = "Lclient!h;")
	public static Class1_Sub1_Sub2_Sub3_Sub1 aClass1_Sub1_Sub2_Sub3_Sub1_4;

	@OriginalMember(owner = "client!k", name = "q", descriptor = "Lclient!vf;")
	public static Class6 aClass6_1;

	@OriginalMember(owner = "client!k", name = "c", descriptor = "Lclient!cb;")
	public static Class10 aClass10_2 = new Class10();

	@OriginalMember(owner = "client!k", name = "h", descriptor = "I")
	public static int anInt1671 = 0;

	@OriginalMember(owner = "client!k", name = "i", descriptor = "[I")
	public static int[] anIntArray177 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!k", name = "j", descriptor = "[I")
	public static int[] anIntArray178 = new int[500];

	@OriginalMember(owner = "client!k", name = "k", descriptor = "Lclient!id;")
	public static Class34 aClass34_785 = Static9.method266(" <col=ffffff>");

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Z)V")
	public static void method1058() {
		Static100.aClass63_19.method1665();
		Static76.aClass63_13.method1665();
		Static76.aClass63_12.method1665();
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(III)I")
	public static int method1059(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(49) int local49 = Static23.method461(arg0 + 91923, arg1 + 45365, 4) + (Static23.method461(arg0 + 37821, arg1 + 10294, 2) - 128 >> 1) + (Static23.method461(arg0, arg1, 1) - 128 >> 2) - 128;
		local49 = (int) ((double) local49 * 0.3D) + 35;
		if (local49 < 10) {
			local49 = 10;
		} else if (local49 > 60) {
			local49 = 60;
		}
		return local49;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(B)V")
	public static void method1060() {
		aClass34_785 = null;
		anIntArray177 = null;
		aClass35_14 = null;
		aClass1_Sub1_Sub2_Sub3_Sub1_4 = null;
		aClass10_2 = null;
		anIntArray178 = null;
		aClass6_1 = null;
		aClass35_15 = null;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(I[B)Lclient!h;")
	public static Class1_Sub1_Sub2_Sub3_Sub1 method1061(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(18) Class1_Sub1_Sub2_Sub3_Sub1 local18 = new Class1_Sub1_Sub2_Sub3_Sub1(arg0, Static78.anIntArray244, Static87.anIntArray297, Static91.anIntArray298, Static116.anIntArray351, Static32.anIntArray150, Static77.aByteArrayArray7);
			Static5.method212();
			return local18;
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "([BZ)[B")
	public static byte[] method1062(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class1_Sub19 local8 = new Class1_Sub19(arg0);
		@Pc(17) int local17 = local8.method2072();
		@Pc(21) int local21 = local8.method2046();
		if (local21 < 0 || Static80.anInt2131 != 0 && Static80.anInt2131 < local21) {
			throw new RuntimeException();
		} else if (local17 == 0) {
			@Pc(87) byte[] local87 = new byte[local21];
			local8.method2068(local21, local87);
			return local87;
		} else {
			@Pc(49) int local49 = local8.method2046();
			if (local49 < 0 || Static80.anInt2131 != 0 && Static80.anInt2131 < local49) {
				throw new RuntimeException();
			}
			@Pc(66) byte[] local66 = new byte[local49];
			if (local17 == 1) {
				Static125.method1979(local66, local49, arg0, local21);
			} else {
				Static73.aClass75_1.method1886(local66, local8);
			}
			return local66;
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(I)V")
	public static void method1063() {
		for (@Pc(17) Class1_Sub1_Sub1_Sub6 local17 = (Class1_Sub1_Sub1_Sub6) Static95.aClass38_20.method1034(); local17 != null; local17 = (Class1_Sub1_Sub1_Sub6) Static95.aClass38_20.method1038()) {
			if (local17.anInt2259 != Static42.anInt1208 || local17.aBoolean124) {
				local17.method2039();
			} else if (Static73.anInt1947 >= local17.anInt2275) {
				local17.method1487(Static67.anInt1767);
				if (local17.aBoolean124) {
					local17.method2039();
				} else {
					Static39.aClass44_1.method1150(local17.anInt2259, local17.anInt2274, local17.anInt2267, local17.anInt2268, 60, local17, 0, -1, false);
				}
			}
		}
	}
}
