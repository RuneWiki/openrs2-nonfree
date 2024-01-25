import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static673 {

	@OriginalMember(owner = "client!wg", name = "w", descriptor = "I")
	public static int anInt10975;

	@OriginalMember(owner = "client!wg", name = "D", descriptor = "[[S")
	public static short[][] aShortArrayArray6;

	@OriginalMember(owner = "client!wg", name = "E", descriptor = "Lclient!wea;")
	public static Class390 aClass390_1;

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIII)I")
	public static int method9322(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(28) int local28 = ((arg1 & 0xFF00) * arg0 & 0xFF0000 | arg0 * (arg1 & 0xFF00FF) & 0xFF00FF00) >>> 8;
		@Pc(33) int local33 = 255 - arg0;
		return local28 + ((local33 * (arg2 & 0xFF00FF) & 0xFF00FF00 | local33 * (arg2 & 0xFF00) & 0xFF0000) >>> 8);
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(III)Z")
	public static boolean method9326(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 >= 1000 && arg0 < 1000) {
			return true;
		} else if (arg1 >= 1000 || arg0 >= 1000) {
			return arg1 >= 1000 && arg0 >= 1000;
		} else if (Static499.method7530(arg0)) {
			return true;
		} else {
			return !Static499.method7530(arg1);
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIILclient!ha;Ljava/lang/String;IBI)V")
	public static void method9334(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class144 arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5) {
		if (Static283.aClass45_16 == null || Static606.aClass45_31 == null) {
			if (Static99.aClass310_23.method7785(Static591.anInt9781) && Static99.aClass310_23.method7785(Static339.anInt5776)) {
				Static283.aClass45_16 = arg2.method6964(Static697.method6466(Static99.aClass310_23, Static591.anInt9781, 0), true);
				@Pc(59) Class266 local59 = Static697.method6466(Static99.aClass310_23, Static339.anInt5776, 0);
				Static606.aClass45_31 = arg2.method6964(local59, true);
				local59.method6460();
				Static284.aClass45_17 = arg2.method6964(local59, true);
			} else {
				arg2.aa(arg4, arg1, arg5, 20, Static634.anInt10389 | 255 - Static662.anInt10793 << 24, 1);
			}
		}
		if (Static283.aClass45_16 != null && Static606.aClass45_31 != null) {
			@Pc(88) int local88 = (arg5 - Static606.aClass45_31.method7510() * 2) / Static283.aClass45_16.method7510();
			for (@Pc(90) int local90 = 0; local90 < local88; local90++) {
				Static283.aClass45_16.method7488(Static606.aClass45_31.method7510() + arg4 + Static283.aClass45_16.method7510() * local90, arg1);
			}
			Static606.aClass45_31.method7488(arg4, arg1);
			Static284.aClass45_17.method7488(arg4 + arg5 - Static284.aClass45_17.method7510(), arg1);
		}
		Static255.aClass68_4.method9422(arg3, arg1 + 14, -1, arg4 + 3, Static220.anInt4304 | 0xFF000000);
		arg2.aa(arg4, arg1 + 20, arg5, arg0 - 20, -Static662.anInt10793 + 255 << 24 | Static634.anInt10389, 1);
	}
}
