import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static300 {

	@OriginalMember(owner = "client!ka", name = "h", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_157 = new Class322(112, 4);

	@OriginalMember(owner = "client!ka", name = "j", descriptor = "I")
	public static final int anInt8497 = 50;

	@OriginalMember(owner = "client!ka", name = "f", descriptor = "[I")
	public static final int[] anIntArray534 = new int[anInt8497];

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "J")
	public static long aLong272 = 0L;

	@OriginalMember(owner = "client!ka", name = "g", descriptor = "[I")
	public static final int[] anIntArray535 = new int[anInt8497];

	@OriginalMember(owner = "client!ka", name = "p", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray35 = new String[anInt8497];

	@OriginalMember(owner = "client!ka", name = "o", descriptor = "[I")
	public static final int[] anIntArray536 = new int[anInt8497];

	@OriginalMember(owner = "client!ka", name = "q", descriptor = "[I")
	public static final int[] anIntArray537 = new int[anInt8497];

	@OriginalMember(owner = "client!ka", name = "m", descriptor = "[I")
	public static final int[] anIntArray538 = new int[anInt8497];

	@OriginalMember(owner = "client!ka", name = "u", descriptor = "[I")
	public static final int[] anIntArray539 = new int[anInt8497];

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILclient!ha;IIIZII)V")
	private static void method7400(@OriginalArg(0) int arg0, @OriginalArg(1) Class75 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(6) int arg4) {
		Static409.aClass75_13 = arg1;
		Static604.aClass109_11 = Static409.aClass75_13.method6709();
		Static47.aClass109_1 = Static409.aClass75_13.method6709();
		Static568.aClass109_13 = Static409.aClass75_13.method6709();
		Static682.anInt10442 = arg4;
		Static290.anInt10204 = 1;
		Static53.anInt668 = 2;
		Static100.anInt2036 = 2;
		Static662.anInt10244 = arg0;
		Static391.anInterface24_1 = null;
		Static6.anInt60 = 0;
		Static188.anInt3787 = 0;
		Static340.method5225(arg2, arg3);
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(B)V")
	public static void method7412() {
		Static518.method7499();
		@Pc(19) int local19 = Static687.aClass6_Sub44_33.aClass7_Sub9_1.method2017();
		if (local19 == 2) {
			Static7.method91(Static202.aClass75_5, Static535.anInt4128, Static274.anInt3226);
		} else if (local19 == 3) {
			method7400(Static208.anInt4171, Static202.aClass75_5, Static535.anInt4128, Static274.anInt3226, Static103.anInt2062);
		}
		if (Static687.aClass6_Sub44_33.aClass7_Sub9_1.method2021()) {
			Static320.method5028(Static4.aCanvas1);
		}
		if (Static202.aClass75_5 != null) {
			Static191.method3634();
		}
		Static490.aBoolean634 = Static687.aClass6_Sub44_33.aClass7_Sub9_1.method2017() != 0;
		Static93.aBoolean113 = Static687.aClass6_Sub44_33.aClass7_Sub9_1.method2021();
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILclient!vo;II)V")
	public static void method7415(@OriginalArg(0) int arg0, @OriginalArg(1) Class381 arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1 local8 = arg1.method8751(Static202.aClass75_5);
		if (local8 == null) {
			return;
		}
		Static202.aClass75_5.KA(arg2, arg0, arg2 + arg1.anInt10159, arg0 - -arg1.anInt10131);
		if (Static378.anInt6595 >= 3) {
			Static202.aClass75_5.A(-16777216, local8, arg2, arg0);
		} else {
			Static552.aClass49_35.method8992((float) arg2 + (float) arg1.anInt10159 / 2.0F, (float) arg0 + (float) arg1.anInt10131 / 2.0F, ((int) -Static409.aFloat135 & 0x3FFF) << 2, local8, arg2, arg0);
		}
	}
}
