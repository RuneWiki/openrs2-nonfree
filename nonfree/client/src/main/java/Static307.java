import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static307 {

	@OriginalMember(owner = "client!kv", name = "m", descriptor = "[I")
	public static int[] anIntArray373;

	@OriginalMember(owner = "client!kv", name = "n", descriptor = "D")
	public static double aDouble12 = -1.0D;

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(IILclient!ha;Ljava/lang/String;ZIII)V")
	public static void method5436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class20 arg2, @OriginalArg(3) String arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static546.aClass46_27 == null || Static369.aClass46_24 == null) {
			if (Static214.aClass157_106.method4575(Static519.anInt9455) && Static214.aClass157_106.method4575(Static420.anInt7951)) {
				Static546.aClass46_27 = arg2.method7294(Static652.method7583(Static214.aClass157_106, Static519.anInt9455, 0), true);
				@Pc(28) Class296 local28 = Static652.method7583(Static214.aClass157_106, Static420.anInt7951, 0);
				Static369.aClass46_24 = arg2.method7294(local28, true);
				local28.method7580();
				Static143.aClass46_26 = arg2.method7294(local28, true);
			} else {
				arg2.aa(arg1, arg4, arg0, 20, 255 - Static251.anInt5400 << 24 | Static573.anInt10254, 1);
			}
		}
		if (Static546.aClass46_27 != null && Static369.aClass46_24 != null) {
			@Pc(75) int local75 = (arg0 - Static369.aClass46_24.method6210() * 2) / Static546.aClass46_27.method6210();
			for (@Pc(77) int local77 = 0; local77 < local75; local77++) {
				Static546.aClass46_27.method6213(Static369.aClass46_24.method6210() + arg1 + Static546.aClass46_27.method6210() * local77, arg4);
			}
			Static369.aClass46_24.method6213(arg1, arg4);
			Static143.aClass46_26.method6213(arg1 + arg0 - Static143.aClass46_26.method6210(), arg4);
		}
		Static571.aClass68_12.method8107(arg3, Static569.anInt10209 | 0xFF000000, arg4 + 14, arg1 + 3, -1);
		arg2.aa(arg1, arg4 + 20, arg0, arg5 - 20, Static573.anInt10254 | -Static251.anInt5400 + 255 << 24, 1);
	}

	@OriginalMember(owner = "client!kv", name = "c", descriptor = "(I)V")
	public static void method5437() {
		if (Static448.aBoolean598) {
			return;
		}
		Static403.method6567(Static281.aClass100ArrayArrayArray1);
		if (Static283.aClass100ArrayArrayArray2 != null) {
			Static403.method6567(Static283.aClass100ArrayArrayArray2);
		}
		Static448.aBoolean598 = true;
	}
}
