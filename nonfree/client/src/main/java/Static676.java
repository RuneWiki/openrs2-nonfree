import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static676 {

	@OriginalMember(owner = "client!wu", name = "p", descriptor = "I")
	public static int anInt11192;

	@OriginalMember(owner = "client!wu", name = "q", descriptor = "[[I")
	public static int[][] anIntArrayArray62;

	@OriginalMember(owner = "client!wu", name = "n", descriptor = "Lclient!so;")
	public static final Class14_Sub29 aClass14_Sub29_10 = new Class14_Sub29(1350);

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(III)V")
	public static void method9296(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static367.anInt6812 = arg1 - Static498.anInt8796;
		Static157.anInt3118 = arg0 - Static498.anInt8795;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(IIIIBI)Z")
	public static boolean method9297(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(14) int local14 = arg3; local14 <= arg2; local14++) {
			for (@Pc(18) int local18 = arg4; local18 <= arg0; local18++) {
				if (Static566.anIntArrayArray53[local14][local18] == arg1 && Static155.anIntArrayArray17[local14][local18] <= 1) {
					return true;
				}
			}
		}
		return false;
	}
}
