import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static410 {

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "I")
	public static int anInt7198;

	@OriginalMember(owner = "client!uo", name = "b", descriptor = "[[I")
	public static final int[][] anIntArrayArray54 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

	@OriginalMember(owner = "client!uo", name = "c", descriptor = "Z")
	public static boolean aBoolean597 = true;

	@OriginalMember(owner = "client!uo", name = "e", descriptor = "I")
	public static int anInt7200 = 0;

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(II)V")
	public static void method5550(@OriginalArg(1) int arg0) {
		@Pc(12) Class1_Sub1_Sub1 local12 = Static190.method3007(arg0, 1);
		local12.method28();
	}
}
