import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!bb", name = "v", descriptor = "F")
	public static float aFloat6;

	@OriginalMember(owner = "client!bb", name = "r", descriptor = "I")
	public static int anInt568 = 0;

	@OriginalMember(owner = "client!bb", name = "x", descriptor = "[I")
	public static int[] anIntArray48 = new int[2];

	@OriginalMember(owner = "client!bb", name = "d", descriptor = "(I)V")
	public static void method547() {
		Static393.aClass134_50.method3272();
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(III)Z")
	public static boolean method548(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIB)V")
	public static void method549(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class93 local9 = Static427.aClass93ArrayArray3[arg0][arg1];
		if (local9 != null) {
			Static245.anInt4498 = local9.anInt2699;
			Static229.anInt4176 = local9.anInt2705;
			Static97.anInt2014 = local9.anInt2696;
		}
		Static199.method3243();
	}
}
