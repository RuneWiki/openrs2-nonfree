import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static684 {

	@OriginalMember(owner = "client!wr", name = "c", descriptor = "[[[Z")
	public static boolean[][][] aBooleanArrayArrayArray2;

	@OriginalMember(owner = "client!wr", name = "b", descriptor = "[I")
	public static final int[] anIntArray600 = new int[50];

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "I")
	public static int anInt11142 = 0;

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(II)I")
	public static int method9447(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static587.aShortArrayArray4 == null ? 0 : Static587.aShortArrayArray4[arg0][arg1] & 0xFFFF;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(IIZI)V")
	public static void method9448(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == Static260.anInt4868 && arg2 == Static530.anInt9101 && Static16.anInt226 == arg0) {
			return;
		}
		Static260.anInt4868 = arg1;
		Static282.aBoolean384 = true;
		Static16.anInt226 = arg0;
		Static530.anInt9101 = arg2;
		@Pc(40) double local40 = -((double) (arg1 * 2) * 3.141592653589793D) / 16384.0D;
		@Pc(50) double local50 = -((double) (arg2 * 2) * 3.141592653589793D) / 16384.0D;
		@Pc(53) double local53 = Math.cos(local50);
		@Pc(56) double local56 = Math.sin(local50);
		@Pc(59) double local59 = Math.cos(local40);
		@Pc(62) double local62 = Math.sin(local40);
		Static662.aDouble23 = local53 * local59;
		Static121.aDouble1 = local56 * local62;
		Static404.aDouble16 = local62;
		Static419.aDouble21 = 0.0D;
		Static237.aDouble14 = local53;
		Static566.aDouble19 = local59;
		Static211.aDouble12 = local56;
		Static654.aDouble22 = local59 * -local56;
		Static615.aDouble20 = -local53 * local62;
	}
}
