import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static227 {

	@OriginalMember(owner = "client!lm", name = "m", descriptor = "Lclient!fk;")
	public static Class85 aClass85_3;

	@OriginalMember(owner = "client!lm", name = "p", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray21;

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "Lclient!vj;")
	public static final Class256 aClass256_81 = new Class256(" more options", " weitere Optionen", " autres options", " mais opções");

	@OriginalMember(owner = "client!lm", name = "n", descriptor = "Lclient!vj;")
	public static final Class256 aClass256_82 = new Class256("red:", "rot:", "rouge:", "vermelho:");

	@OriginalMember(owner = "client!lm", name = "t", descriptor = "[[I")
	public static final int[][] anIntArrayArray36 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIIII)V")
	public static void method3516(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 <= arg0) {
			Static49.method990(Static277.anIntArrayArray40[arg3], arg0, arg2, arg1);
		} else {
			Static49.method990(Static277.anIntArrayArray40[arg3], arg2, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIZI)V")
	public static void method3517(@OriginalArg(2) boolean arg0) {
		Static288.anInt5229 = 2;
		Static451.aBoolean125 = arg0;
		Static369.anInt6566 = 22050;
	}
}
