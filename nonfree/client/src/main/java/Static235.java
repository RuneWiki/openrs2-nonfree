import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static235 {

	@OriginalMember(owner = "client!ih", name = "f", descriptor = "Lclient!mia;")
	public static final Class208 aClass208_39 = new Class208(62, 8);

	@OriginalMember(owner = "client!ih", name = "l", descriptor = "[I")
	public static final int[] anIntArray268 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!ih", name = "m", descriptor = "Lclient!mb;")
	public static final Class201 aClass201_1 = new Class201();

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIILjava/lang/Class;)V")
	public static void method4077(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class97 local7 = Static272.aClass97ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(13) Class196 local13 = local7.aClass196_2; local13 != null; local13 = local13.aClass196_3) {
			@Pc(17) Class20_Sub2_Sub2 local17 = local13.aClass20_Sub2_Sub2_1;
			if (arg3.isAssignableFrom(local17.getClass()) && local17.aShort124 == arg1 && local17.aShort123 == arg2) {
				Static466.method6567(local17, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Z)V")
	public static void method4078() {
		Static119.aClient1.method1361();
		Static28.method4860();
		Static376.anInt6901 = 0;
		Static456.aClass6_Sub40_Sub2_2.anInt10169 = 0;
		Static328.anInt6241 = 0;
		Static441.aClass268_143 = null;
		Static112.aClass268_38 = null;
		Static457.aClass268_147 = null;
		Static50.method881();
		Static579.anInt9657 = 0;
		Static594.aString110 = null;
		Static301.anInt5871 = 0;
		Static635.aClass17Array3 = null;
		Static60.anInt1289 = 0;
	}
}
