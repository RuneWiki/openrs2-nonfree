import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	@OriginalMember(owner = "client!gfa", name = "j", descriptor = "[[Lclient!ir;")
	public static Class20_Sub2[][] aClass20_Sub2ArrayArray1;

	@OriginalMember(owner = "client!gfa", name = "n", descriptor = "F")
	public static float aFloat65;

	@OriginalMember(owner = "client!gfa", name = "b", descriptor = "Lclient!eba;")
	public static final Class81 aClass81_78 = new Class81(68, 2);

	@OriginalMember(owner = "client!gfa", name = "o", descriptor = "Lclient!lg;")
	public static final Class201 aClass201_16 = new Class201(2, 4, 4, 0);

	@OriginalMember(owner = "client!gfa", name = "p", descriptor = "[F")
	public static final float[] aFloatArray14 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(Lclient!wv;B)V")
	public static void method2552(@OriginalArg(0) Class365 arg0) {
		@Pc(13) Class365 local13 = Static498.method6955(arg0);
		@Pc(19) int local19;
		@Pc(17) int local17;
		if (local13 == null) {
			local17 = Static300.anInt5516;
			local19 = Static443.anInt7718;
		} else {
			local17 = local13.anInt9638;
			local19 = local13.anInt9578;
		}
		Static202.method3447(arg0, local19, false, local17);
		Static309.method4756(local17, local19, arg0);
	}

	@OriginalMember(owner = "client!gfa", name = "c", descriptor = "(I)V")
	public static void method2554() {
		if (Static389.anObject14 == null) {
			@Pc(5) Class6_Sub2_Sub1 local5 = new Class6_Sub2_Sub1();
			@Pc(12) byte[] local12 = local5.method5036();
			Static389.anObject14 = Static183.method3216(local12);
		}
		if (Static510.anObject22 == null) {
			@Pc(35) Class6_Sub1_Sub2 local35 = new Class6_Sub1_Sub2();
			@Pc(42) byte[] local42 = local35.method5142();
			Static510.anObject22 = Static183.method3216(local42);
		}
	}
}
