import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!ev", name = "d", descriptor = "[I")
	public static int[] anIntArray366;

	@OriginalMember(owner = "client!ev", name = "f", descriptor = "Lclient!bt;")
	public static Class34 aClass34_69;

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "Lclient!lja;")
	public static final Class216 aClass216_87 = new Class216(46, 3);

	@OriginalMember(owner = "client!ev", name = "b", descriptor = "Z")
	public static boolean aBoolean362 = true;

	@OriginalMember(owner = "client!ev", name = "e", descriptor = "S")
	public static short aShort80 = 256;

	@OriginalMember(owner = "client!ev", name = "g", descriptor = "J")
	public static long aLong153 = 0L;

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(IIIII)V")
	public static void method4309(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 != 8 && arg3 != 16) {
			@Pc(108) Class73 local108 = Static267.aClass73ArrayArrayArray2[arg1][arg0][arg2];
			if (local108 != null) {
				if (arg3 == 1) {
					local108.aShort32 = 0;
				} else if (arg3 == 2) {
					local108.aShort35 = 0;
				}
			}
			Static121.method2176();
			return;
		}
		for (@Pc(24) int local24 = 0; local24 < Static1.anInt6849; local24++) {
			@Pc(30) Class292 local30 = Static649.aClass292Array157[local24];
			if (local30.aByte107 == arg3 && local30.aShort102 == arg0 && local30.aShort104 == arg2 || local30.aShort103 == arg0 && arg2 == local30.aShort104) {
				if (Static1.anInt6849 != local24) {
					Static685.method6469(Static649.aClass292Array157, local24 + 1, Static649.aClass292Array157, local24, Static649.aClass292Array157.length - local24 - 1);
				}
				Static1.anInt6849--;
				return;
			}
		}
	}
}
