import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static152 {

	@OriginalMember(owner = "client!hi", name = "e", descriptor = "I")
	public static int anInt2660;

	@OriginalMember(owner = "client!hi", name = "d", descriptor = "[Lclient!pf;")
	public static final Class3_Sub4_Sub1_Sub2[] aClass3_Sub4_Sub1_Sub2Array1 = new Class3_Sub4_Sub1_Sub2[2048];

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIILjava/lang/Class;)V")
	public static void method2186(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class270 local7 = Static309.aClass270ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(13) Class241 local13 = local7.aClass241_2; local13 != null; local13 = local13.aClass241_1) {
			@Pc(17) Class3_Sub4 local17 = local13.aClass3_Sub4_2;
			if (arg3.isAssignableFrom(local17.getClass()) && local17.aShort92 == arg1 && local17.aShort89 == arg2) {
				Static294.method794(local17);
				return;
			}
		}
	}
}
