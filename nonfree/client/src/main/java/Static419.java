import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static419 {

	@OriginalMember(owner = "client!ne", name = "p", descriptor = "Lclient!dka;")
	public static final Class85 aClass85_45 = new Class85(20);

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIZ)V")
	public static void method6126(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		Static519.anInt8267 = arg1;
		Static8.anInt99 = 0;
		Static617.anInt9501 = 0;
		Static14.anInt206 = arg0;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIZI)V")
	public static void method6128(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 >= Static8.anInt99 && Static14.anInt206 >= arg2) {
			@Pc(17) int local17 = Static67.method9535(Static617.anInt9501, arg3, Static519.anInt8267);
			@Pc(23) int local23 = Static67.method9535(Static617.anInt9501, arg1, Static519.anInt8267);
			Static544.method7598(arg2, local23, arg0, local17);
		}
	}
}
