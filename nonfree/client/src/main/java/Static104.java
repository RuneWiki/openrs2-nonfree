import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!dja", name = "d", descriptor = "[[[Lclient!naa;")
	public static Class243[][][] aClass243ArrayArrayArray1;

	@OriginalMember(owner = "client!dja", name = "c", descriptor = "I")
	public static int anInt2080;

	@OriginalMember(owner = "client!dja", name = "a", descriptor = "(II)I")
	public static int method2006(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!dja", name = "a", descriptor = "(IBIIII)V")
	public static void method2008(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = Static9.method118(Static223.anInt4380, Static605.anInt9561, arg1);
		@Pc(17) int local17 = Static9.method118(Static223.anInt4380, Static605.anInt9561, arg3);
		@Pc(23) int local23 = Static9.method118(Static8.anInt136, Static398.anInt6878, arg0);
		@Pc(29) int local29 = Static9.method118(Static8.anInt136, Static398.anInt6878, arg2);
		for (@Pc(36) int local36 = local11; local36 <= local17; local36++) {
			Static367.method5559(-7, local23, arg4, Static36.anIntArrayArray4[local36], local29);
		}
	}

	@OriginalMember(owner = "client!dja", name = "a", descriptor = "(BLclient!jka;)Ljava/lang/String;")
	public static String method2009(@OriginalArg(1) Class6_Sub2_Sub11 arg0) {
		if (arg0.aString56 == null || arg0.aString56.length() == 0) {
			return arg0.aString55 == null || arg0.aString55.length() <= 0 ? arg0.aString54 : arg0.aString54 + Static50.aClass43_31.method596(Static601.anInt9518) + arg0.aString55;
		} else if (arg0.aString55 == null || arg0.aString55.length() <= 0) {
			return arg0.aString54 + Static50.aClass43_31.method596(Static601.anInt9518) + arg0.aString56;
		} else {
			return arg0.aString54 + Static50.aClass43_31.method596(Static601.anInt9518) + arg0.aString55 + Static50.aClass43_31.method596(Static601.anInt9518) + arg0.aString56;
		}
	}
}
