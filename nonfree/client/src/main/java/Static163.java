import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!gfa", name = "l", descriptor = "Lclient!jp;")
	public static Class177 aClass177_1;

	@OriginalMember(owner = "client!gfa", name = "r", descriptor = "I")
	public static int anInt2947 = 0;

	@OriginalMember(owner = "client!gfa", name = "s", descriptor = "I")
	public static int anInt2948 = 0;

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(I[Lclient!vg;BZII)V")
	public static void method2381(@OriginalArg(0) int arg0, @OriginalArg(1) Class341[] arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			@Pc(17) Class341 local17 = arg1[local11];
			if (local17 != null && local17.anInt9252 == arg3) {
				Static546.method7461(local17, arg2, arg4, arg0);
				Static227.method3464(arg4, local17, arg0);
				if (local17.anInt9267 > local17.anInt9326 - local17.anInt9300) {
					local17.anInt9267 = local17.anInt9326 - local17.anInt9300;
				}
				if (local17.anInt9267 < 0) {
					local17.anInt9267 = 0;
				}
				if (local17.anInt9274 - local17.anInt9248 < local17.anInt9256) {
					local17.anInt9256 = local17.anInt9274 - local17.anInt9248;
				}
				if (local17.anInt9256 < 0) {
					local17.anInt9256 = 0;
				}
				if (local17.anInt9309 == 0) {
					Static417.method6106(local17, arg2);
				}
			}
		}
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(IIILclient!ok;BI)Lclient!ot;")
	public static Class40_Sub3_Sub1 method2382(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class134_Sub2 arg3, @OriginalArg(5) int arg4) {
		if (arg3.aBoolean519 || Static230.method3483(arg2) && Static230.method3483(arg4)) {
			return new Class40_Sub3_Sub1(arg3, 3553, arg1, arg0, arg2, arg4, true);
		} else if (arg3.aBoolean505) {
			return new Class40_Sub3_Sub1(arg3, 34037, arg1, arg0, arg2, arg4, true);
		} else {
			return new Class40_Sub3_Sub1(arg3, arg1, arg0, arg2, arg4, Static457.method6299(arg2), Static457.method6299(arg4), true);
		}
	}

	@OriginalMember(owner = "client!gfa", name = "b", descriptor = "(I)V")
	public static void method2383() {
		for (@Pc(14) Class1_Sub6_Sub6 local14 = (Class1_Sub6_Sub6) Static356.aClass353_42.method7677(); local14 != null; local14 = (Class1_Sub6_Sub6) Static356.aClass353_42.method7687()) {
			@Pc(19) Class8_Sub3_Sub3_Sub3 local19 = local14.aClass8_Sub3_Sub3_Sub3_1;
			if (local19.aBoolean432) {
				local14.method7859();
				local19.method4377();
			} else if (Static301.anInt5197 >= local19.anInt5388) {
				local19.method4379(Static504.anInt5717);
				if (local19.aBoolean432) {
					local14.method7859();
				} else {
					Static227.method3465(local19, true);
				}
			}
		}
	}
}
