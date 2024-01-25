import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "Lclient!cb;")
	public static final Class46 aClass46_1 = new Class46(72, 7);

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "I")
	public static int anInt57 = -1;

	@OriginalMember(owner = "client!ac", name = "e", descriptor = "[[I")
	public static final int[][] anIntArrayArray1 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(II)V")
	public static void method67(@OriginalArg(0) int arg0) {
		@Pc(14) Class5_Sub5_Sub21 local14 = Static101.method1629(9, arg0);
		local14.method8961();
	}
}
