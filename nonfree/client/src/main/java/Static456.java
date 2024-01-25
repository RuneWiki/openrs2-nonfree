import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static456 {

	@OriginalMember(owner = "client!rm", name = "B", descriptor = "Lclient!xa;")
	public static Class58 aClass58_41;

	@OriginalMember(owner = "client!rm", name = "x", descriptor = "I")
	public static int anInt7860 = -1;

	@OriginalMember(owner = "client!rm", name = "D", descriptor = "[[I")
	public static final int[][] anIntArrayArray72 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

	@OriginalMember(owner = "client!rm", name = "F", descriptor = "I")
	public static final int anInt7863 = 0;

	@OriginalMember(owner = "client!rm", name = "d", descriptor = "(I)V")
	public static void method6437() {
		@Pc(17) byte[] local17;
		if (Static507.anObject16 == null) {
			@Pc(10) Class17_Sub2_Sub1 local10 = new Class17_Sub2_Sub1();
			local17 = local10.method3450();
			Static507.anObject16 = Static531.method7230(local17);
		}
		if (Static532.anObject19 == null) {
			@Pc(32) Class17_Sub1_Sub1 local32 = new Class17_Sub1_Sub1();
			local17 = local32.method3652();
			Static532.anObject19 = Static531.method7230(local17);
		}
	}
}
