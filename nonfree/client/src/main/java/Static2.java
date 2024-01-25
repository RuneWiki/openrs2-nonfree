import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "Lclient!al;")
	public static Class16 aClass16_1;

	@OriginalMember(owner = "client!aaa", name = "c", descriptor = "[Lclient!s;")
	public static Class51[] aClass51Array1;

	@OriginalMember(owner = "client!aaa", name = "d", descriptor = "[Lclient!td;")
	public static Class24[] aClass24Array1;

	@OriginalMember(owner = "client!aaa", name = "e", descriptor = "Lclient!he;")
	public static Class135 aClass135_1;

	@OriginalMember(owner = "client!aaa", name = "f", descriptor = "I")
	public static int anInt5 = 0;

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(II)Z")
	public static boolean method22(@OriginalArg(0) int arg0) {
		return arg0 == 10 || arg0 == 11 || arg0 == 12;
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(III)V")
	public static void method23(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) boolean local20 = Static330.aClass77ArrayArrayArray2[0][arg1][arg2] != null && Static330.aClass77ArrayArrayArray2[0][arg1][arg2].aClass77_1 != null;
		for (@Pc(22) int local22 = arg0; local22 >= 0; local22--) {
			if (Static330.aClass77ArrayArrayArray2[local22][arg1][arg2] == null) {
				@Pc(44) Class77 local44 = Static330.aClass77ArrayArrayArray2[local22][arg1][arg2] = new Class77(local22);
				if (local20) {
					local44.aByte23++;
				}
			}
		}
	}
}
