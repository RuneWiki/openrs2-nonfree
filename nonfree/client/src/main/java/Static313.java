import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static313 {

	@OriginalMember(owner = "client!naa", name = "u", descriptor = "Z")
	public static boolean aBoolean513;

	@OriginalMember(owner = "client!naa", name = "w", descriptor = "[I")
	public static int[] anIntArray521;

	@OriginalMember(owner = "client!naa", name = "s", descriptor = "I")
	public static int anInt6819 = 0;

	@OriginalMember(owner = "client!naa", name = "t", descriptor = "[[I")
	public static final int[][] anIntArrayArray59 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!naa", name = "x", descriptor = "Lclient!rk;")
	public static final Class249 aClass249_47 = new Class249();

	@OriginalMember(owner = "client!naa", name = "B", descriptor = "Lclient!qu;")
	public static final Class243 aClass243_66 = new Class243(75, 3);

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(Lclient!ge;ILclient!ge;)V")
	public static void method5812(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(2) Class2_Sub13 arg1) {
		if (arg1.aClass2_Sub13_58 != null) {
			arg1.method7527();
		}
		arg1.aClass2_Sub13_59 = arg0.aClass2_Sub13_59;
		arg1.aClass2_Sub13_58 = arg0;
		arg1.aClass2_Sub13_58.aClass2_Sub13_59 = arg1;
		arg1.aClass2_Sub13_59.aClass2_Sub13_58 = arg1;
	}
}
