import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!es", name = "b", descriptor = "Lclient!ap;")
	public static Class17 aClass17_1;

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(IZ)Z")
	public static boolean method2310(@OriginalArg(0) int arg0) {
		return arg0 >= 4 && arg0 <= 8;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(Lclient!ek;B)V")
	public static void method2311(@OriginalArg(0) Class4_Sub13 arg0) {
		for (@Pc(5) int local5 = 0; local5 < Static112.anInt2568; local5++) {
			@Pc(15) int local15 = arg0.method7019();
			@Pc(19) int local19 = arg0.method7054();
			if (local19 == 65535) {
				local19 = -1;
			}
			if (Static481.aClass222_Sub1Array2[local15] != null) {
				Static481.aClass222_Sub1Array2[local15].anInt10273 = local19;
			}
		}
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;IBLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	public static void method2313(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4, @OriginalArg(6) String arg5, @OriginalArg(7) String arg6, @OriginalArg(8) String arg7) {
		@Pc(13) Class134 local13 = Static584.aClass134Array1[99];
		for (@Pc(15) int local15 = 99; local15 > 0; local15--) {
			Static584.aClass134Array1[local15] = Static584.aClass134Array1[local15 - 1];
		}
		if (local13 == null) {
			local13 = new Class134(arg1, arg0, arg3, arg6, arg7, arg2, arg4, arg5);
		} else {
			local13.method3003(arg5, arg4, arg7, arg2, arg1, arg0, arg3, arg6);
		}
		Static488.anInt9251++;
		Static173.anInt3651 = Static422.anInt8117;
		Static584.aClass134Array1[0] = local13;
	}
}
