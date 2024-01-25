import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static352 {

	@OriginalMember(owner = "client!of", name = "q", descriptor = "[[I")
	public static int[][] anIntArrayArray51;

	@OriginalMember(owner = "client!of", name = "l", descriptor = "I")
	public static int anInt6563 = 0;

	@OriginalMember(owner = "client!of", name = "n", descriptor = "I")
	public static int anInt6565 = 0;

	@OriginalMember(owner = "client!of", name = "p", descriptor = "Lclient!io;")
	public static final Class148 aClass148_11 = new Class148(7, 0, 1, 1);

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IB)V")
	public static void method5445(@OriginalArg(0) int arg0) {
		@Pc(12) Class5_Sub2_Sub7 local12 = Static144.method2728(arg0, 7);
		local12.method1324();
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(BI)Lclient!oh;")
	public static Class220 method5447(@OriginalArg(1) int arg0) {
		@Pc(14) int local14 = arg0 >> 16;
		@Pc(18) int local18 = arg0 & 0xFFFF;
		if (Static139.aClass220ArrayArray1[local14] == null || Static139.aClass220ArrayArray1[local14][local18] == null) {
			@Pc(32) boolean local32 = Static348.method5412(local14);
			if (!local32) {
				return null;
			}
		}
		return Static139.aClass220ArrayArray1[local14][local18];
	}
}
