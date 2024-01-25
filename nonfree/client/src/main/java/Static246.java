import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static246 {

	@OriginalMember(owner = "client!ir", name = "j", descriptor = "Lclient!jia;")
	public static final Class171 aClass171_4 = new Class171();

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(IIIBI)V")
	public static void method3382(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(10) int local10;
		if (arg0 > arg2) {
			for (local10 = arg2; local10 < arg0; local10++) {
				Static543.anIntArrayArray57[local10][arg1] = arg3;
			}
		} else {
			for (local10 = arg0; local10 < arg2; local10++) {
				Static543.anIntArrayArray57[local10][arg1] = arg3;
			}
		}
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(II)I")
	public static int method3383(@OriginalArg(1) int arg0) {
		@Pc(12) byte local12;
		if (arg0 > 12000) {
			Static558.method7640();
			local12 = 4;
		} else if (arg0 > 5000) {
			local12 = 3;
			Static206.method2918();
		} else if (arg0 <= 2000) {
			Static55.method858();
			local12 = 1;
		} else {
			local12 = 2;
			Static418.method5593();
		}
		if (Static234.aClass2_Sub5_48.aClass6_Sub21_2.method7280() != 2) {
			Static234.aClass2_Sub5_48.method176(2, Static234.aClass2_Sub5_48.aClass6_Sub21_1);
			Static317.method4257(false, 2);
		}
		Static329.method4407();
		return local12;
	}
}
