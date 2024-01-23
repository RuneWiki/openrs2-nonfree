import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static161 {

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "Lclient!sc;")
	public static Class158 aClass158_1;

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString105 = " is already on your ignore list.";

	@OriginalMember(owner = "client!lm", name = "c", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray28 = new String[1000];

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(BIIIII)V")
	public static void method2706(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 > Static59.anInt1155 || arg3 < Static240.anInt1319) {
			return;
		}
		@Pc(40) boolean local40;
		if (Static312.anInt5850 > arg4) {
			local40 = false;
			arg4 = Static312.anInt5850;
		} else if (Static214.anInt4216 < arg4) {
			local40 = false;
			arg4 = Static214.anInt4216;
		} else {
			local40 = true;
		}
		@Pc(63) boolean local63;
		if (Static312.anInt5850 > arg2) {
			arg2 = Static312.anInt5850;
			local63 = false;
		} else if (arg2 <= Static214.anInt4216) {
			local63 = true;
		} else {
			local63 = false;
			arg2 = Static214.anInt4216;
		}
		if (Static240.anInt1319 <= arg1) {
			Static109.method1795(arg2, Static51.anIntArrayArray1[arg1++], arg4, arg0);
		} else {
			arg1 = Static240.anInt1319;
		}
		if (arg3 <= Static59.anInt1155) {
			Static109.method1795(arg2, Static51.anIntArrayArray1[arg3--], arg4, arg0);
		} else {
			arg3 = Static59.anInt1155;
		}
		@Pc(122) int local122;
		if (local63 && local40) {
			for (local122 = arg1; local122 <= arg3; local122++) {
				@Pc(129) int[] local129 = Static51.anIntArrayArray1[local122];
				local129[arg2] = local129[arg4] = arg0;
			}
		} else if (local63) {
			for (local122 = arg1; local122 <= arg3; local122++) {
				Static51.anIntArrayArray1[local122][arg2] = arg0;
			}
		} else if (local40) {
			for (local122 = arg1; local122 <= arg3; local122++) {
				Static51.anIntArrayArray1[local122][arg4] = arg0;
			}
		}
	}
}
