import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static370 {

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "[[I")
	public static final int[][] anIntArrayArray68 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!nr", name = "c", descriptor = "I")
	public static int anInt6323 = 0;

	@OriginalMember(owner = "client!nr", name = "d", descriptor = "[I")
	public static final int[] anIntArray352 = new int[1000];

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(III)Z")
	public static boolean method5107(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(BI)V")
	public static void method5108() {
		@Pc(5) Class342 local5 = Static254.aClass342_96;
		synchronized (Static254.aClass342_96) {
			Static254.aClass342_96.method7697(5);
		}
		local5 = Static424.aClass342_187;
		synchronized (Static424.aClass342_187) {
			Static424.aClass342_187.method7697(5);
		}
	}
}
