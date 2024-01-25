import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static459 {

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "Lclient!dt;")
	public static Class2_Sub10_Sub2 aClass2_Sub10_Sub2_4;

	@OriginalMember(owner = "client!rfa", name = "f", descriptor = "Lclient!vfa;")
	public static Class347 aClass347_5;

	@OriginalMember(owner = "client!rfa", name = "t", descriptor = "Lclient!tw;")
	public static Class326 aClass326_1;

	@OriginalMember(owner = "client!rfa", name = "p", descriptor = "Lclient!wea;")
	public static final Class357 aClass357_12 = new Class357(0, 1);

	@OriginalMember(owner = "client!rfa", name = "r", descriptor = "[Lclient!cv;")
	public static final Class64[] aClass64Array1 = new Class64[35];

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(III)V")
	public static void method6495(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = Static83.aClass294_6.method6718(Static290.aClass198_26.method4365(Static52.anInt1264));
		@Pc(28) int local28;
		for (@Pc(20) Class2_Sub5 local20 = (Class2_Sub5) Static375.aClass8_38.method210(); local20 != null; local20 = (Class2_Sub5) Static375.aClass8_38.method218()) {
			local28 = Static210.method3354(local20);
			if (local28 > local13) {
				local13 = local28;
			}
		}
		local13 += 8;
		local28 = Static347.anInt6255 * 16 + 21;
		@Pc(58) int local58 = arg0 - local13 / 2;
		if (local13 + local58 > Static140.anInt2937) {
			local58 = Static140.anInt2937 - local13;
		}
		if (local58 < 0) {
			local58 = 0;
		}
		@Pc(77) int local77 = arg1;
		if (Static120.anInt2371 < arg1 + local28) {
			local77 = Static120.anInt2371 - local28;
		}
		Static344.anInt6231 = local58;
		if (local77 < 0) {
			local77 = 0;
		}
		Static23.anInt642 = local13;
		Static306.anInt5446 = (Static316.aBoolean475 ? 26 : 22) + Static347.anInt6255 * 16;
		Static167.aBoolean291 = true;
		Static202.anInt3966 = local77;
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(IJ)V")
	public static void method6498(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static192.method3648(arg0 - 1L);
			Static192.method3648(1L);
		} else {
			Static192.method3648(arg0);
		}
	}
}
