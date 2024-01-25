import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ag", name = "d", descriptor = "[C")
	public static final char[] aCharArray5 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "client!ag", name = "e", descriptor = "Z")
	public static boolean aBoolean212 = false;

	@OriginalMember(owner = "client!ag", name = "g", descriptor = "Lclient!dj;")
	public static final Class43 aClass43_15 = new Class43(8);

	@OriginalMember(owner = "client!ag", name = "h", descriptor = "I")
	public static int anInt2965 = 0;

	@OriginalMember(owner = "client!ag", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString28 = null;

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)Lclient!ak;")
	public static Class4_Sub3 method2578() {
		if (Static54.aClass116_40 == null || Static128.aClass37_1 == null) {
			return null;
		}
		Static128.aClass37_1.method1015(Static54.aClass116_40);
		@Pc(23) Class4_Sub3 local23 = (Class4_Sub3) Static128.aClass37_1.method1016();
		if (local23 == null) {
			return null;
		} else {
			@Pc(32) Class136 local32 = Static11.method223(local23.anInt210);
			return local32 != null && local32.aBoolean328 && local32.method3851() ? local23 : Static80.method1991();
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2583(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(10) int local10 = arg3 - arg4;
		@Pc(19) int local19 = arg4 + arg6;
		for (@Pc(21) int local21 = arg6; local21 < local19; local21++) {
			Static135.method2878(Static223.anIntArrayArray124[local21], arg0, arg1, arg5);
		}
		for (@Pc(41) int local41 = arg3; local41 > local10; local41--) {
			Static135.method2878(Static223.anIntArrayArray124[local41], arg0, arg1, arg5);
		}
		@Pc(64) int local64 = arg0 - arg4;
		@Pc(68) int local68 = arg4 + arg5;
		for (@Pc(70) int local70 = local19; local70 <= local10; local70++) {
			@Pc(76) int[] local76 = Static223.anIntArrayArray124[local70];
			Static135.method2878(local76, local68, arg1, arg5);
			Static135.method2878(local76, local64, arg2, local68);
			Static135.method2878(local76, arg0, arg1, local64);
		}
	}

	@OriginalMember(owner = "client!ag", name = "d", descriptor = "(II)V")
	public static void method2585() {
		@Pc(1) Class198 local1 = Static269.aClass198_194;
		synchronized (Static269.aClass198_194) {
			Static269.aClass198_194.method5202(5);
		}
	}
}
