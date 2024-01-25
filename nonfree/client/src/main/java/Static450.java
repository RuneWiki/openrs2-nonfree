import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static450 {

	@OriginalMember(owner = "client!rea", name = "e", descriptor = "Lclient!aj;")
	public static final Class10 aClass10_48 = new Class10(8);

	@OriginalMember(owner = "client!rea", name = "k", descriptor = "Lclient!sb;")
	public static final Class298 aClass298_153 = new Class298(73, -1);

	@OriginalMember(owner = "client!rea", name = "l", descriptor = "Z")
	public static boolean aBoolean583 = false;

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(IIBIIIII)V")
	public static void method6272(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(15) int local15 = arg1 - arg3;
		@Pc(19) int local19 = arg2 + arg3;
		for (@Pc(21) int local21 = arg2; local21 < local19; local21++) {
			Static337.method5150(arg4, arg5, arg0, Static176.anIntArrayArray28[local21]);
		}
		for (@Pc(39) int local39 = arg1; local39 > local15; local39--) {
			Static337.method5150(arg4, arg5, arg0, Static176.anIntArrayArray28[local39]);
		}
		@Pc(61) int local61 = arg4 - arg3;
		@Pc(65) int local65 = arg0 + arg3;
		for (@Pc(67) int local67 = local19; local67 <= local15; local67++) {
			@Pc(73) int[] local73 = Static176.anIntArrayArray28[local67];
			Static337.method5150(local65, arg5, arg0, local73);
			Static337.method5150(local61, arg6, local65, local73);
			Static337.method5150(arg4, arg5, local61, local73);
		}
	}

	@OriginalMember(owner = "client!rea", name = "b", descriptor = "(B)V")
	public static void method6276() {
		if (Static93.anInt2298 <= 0) {
			Static6.aString2 = "";
			return;
		}
		@Pc(17) int local17 = 0;
		for (@Pc(19) int local19 = 0; local19 < Static190.aStringArray24.length; local19++) {
			if (Static190.aStringArray24[local19].indexOf("--> ") != -1) {
				local17++;
				if (local17 == Static93.anInt2298) {
					Static6.aString2 = Static190.aStringArray24[local19].substring(Static190.aStringArray24[local19].indexOf(">") + 2);
					return;
				}
			}
		}
	}
}
