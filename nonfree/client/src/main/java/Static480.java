import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static480 {

	@OriginalMember(owner = "client!rba", name = "y", descriptor = "[I")
	public static int[] anIntArray523;

	@OriginalMember(owner = "client!rba", name = "m", descriptor = "Lclient!og;")
	public static final Class238 aClass238_12 = new Class238();

	@OriginalMember(owner = "client!rba", name = "v", descriptor = "I")
	public static int anInt8338 = -1;

	@OriginalMember(owner = "client!rba", name = "x", descriptor = "Lclient!mia;")
	public static final Class208 aClass208_71 = new Class208(58, -1);

	@OriginalMember(owner = "client!rba", name = "A", descriptor = "[[I")
	public static final int[][] anIntArrayArray40 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

	@OriginalMember(owner = "client!rba", name = "e", descriptor = "(I)V")
	public static void method7199() {
		for (@Pc(10) Class6_Sub35 local10 = (Class6_Sub35) Static227.aClass128_12.method3556(); local10 != null; local10 = (Class6_Sub35) Static227.aClass128_12.method3555()) {
			Static366.method5801(local10.anInt7969);
		}
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(II)V")
	public static void method7200(@OriginalArg(1) int arg0) {
		Static561.method8095();
		@Pc(13) int local13 = Static40.aClass245_1.method6511(arg0).anInt9155;
		if (local13 == 0) {
			return;
		}
		@Pc(24) int local24 = Static279.aClass294_1.anIntArray529[arg0];
		if (local13 == 5) {
			Static414.anInt7552 = local24;
		}
		if (local13 == 6) {
			Static522.anInt9104 = local24;
		}
	}
}
