import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static301 {

	@OriginalMember(owner = "client!lg", name = "h", descriptor = "Z")
	public static boolean aBoolean389;

	@OriginalMember(owner = "client!lg", name = "f", descriptor = "Lclient!ad;")
	public static final Class6 aClass6_34 = new Class6(8);

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V")
	public static void method4553() {
		Static585.method7831(Static405.aClass3_Sub3_Sub1_1.aBoolean586);
		Static292.aClass3_Sub4_Sub3_1 = new Class3_Sub4_Sub3();
		Static292.aClass3_Sub4_Sub3_1.method6340();
		Static9.aClass8_3 = Static298.method4426(Static387.aCanvas9, Static237.aClass258_3, 0, 22050);
		Static9.aClass8_3.method5515(Static292.aClass3_Sub4_Sub3_1);
		Static285.method4236(Static166.aClass322_66, Static50.aClass322_19, Static292.aClass3_Sub4_Sub3_1, Static167.aClass322_68);
		Static241.aClass8_2 = Static298.method4426(Static387.aCanvas9, Static237.aClass258_3, 1, 2048);
		Static353.aClass3_Sub4_Sub2_1 = new Class3_Sub4_Sub2();
		Static241.aClass8_2.method5515(Static353.aClass3_Sub4_Sub2_1);
		Static143.aClass166_1 = new Class166(22050, Static404.anInt6999);
		Static591.anInt9673 = Static287.aClass322_120.method6823("scape main");
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lclient!np;I)Lclient!dt;")
	public static Class65_Sub1_Sub1 method4554(@OriginalArg(0) Class3_Sub11 arg0) {
		@Pc(12) Class65_Sub1 local12 = Static222.method3505(arg0);
		@Pc(16) int local16 = arg0.method5231();
		return new Class65_Sub1_Sub1(local12.aClass63_16, local12.aClass249_16, local12.anInt5457, local12.anInt5460, local12.anInt5462, local12.anInt5461, local12.anInt5463, local12.anInt5459, local12.anInt5458, local12.anInt2131, local12.anInt2132, local12.anInt2126, local12.anInt2124, local12.anInt2128, local12.anInt2127, local16);
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIB)B")
	public static byte method4555(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(BLjava/lang/String;I)V")
	public static void method4556(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class3_Sub7_Sub18 local8 = Static543.method7218(3, arg1);
		local8.method7326();
		local8.aString82 = arg0;
	}
}
