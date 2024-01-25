import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static250 {

	@OriginalMember(owner = "client!pl", name = "c", descriptor = "[Lclient!gl;")
	public static Class2[] aClass2Array15;

	@OriginalMember(owner = "client!pl", name = "k", descriptor = "I")
	public static int anInt4833;

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "[I")
	public static final int[] anIntArray436 = new int[25];

	@OriginalMember(owner = "client!pl", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString182 = "Loading sprites - ";

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIIIB)V")
	public static void method4350(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class14_Sub2_Sub13 local8 = Static1.method5711(10, arg3);
		local8.method3540();
		local8.anInt3802 = arg2;
		local8.anInt3808 = arg0;
		local8.anInt3805 = arg1;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIB)V")
	public static void method4353(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = Static173.aClass10_Sub3_Sub3_Sub2_1.anIntArray535[0];
		@Pc(18) int local18 = Static173.aClass10_Sub3_Sub3_Sub2_1.anIntArray536[0];
		if (Static45.anInt1136 == 1) {
			if (!Static229.method4046(-2, 1, arg0, 0, false, 0, local18, local13, 1, arg1)) {
				Static229.method4046(-3, 1, arg0, 0, false, 0, local18, local13, 1, arg1);
			}
		} else if (!Static229.method4046(-3, 1, arg0, 0, false, 0, local18, local13, 1, arg1)) {
			Static229.method4046(-2, 1, arg0, 0, false, 0, local18, local13, 1, arg1);
		}
	}
}
