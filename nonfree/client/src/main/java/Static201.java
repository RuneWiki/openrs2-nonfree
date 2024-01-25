import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static201 {

	@OriginalMember(owner = "client!lk", name = "U", descriptor = "Lclient!pp;")
	public static Class181 aClass181_6;

	@OriginalMember(owner = "client!lk", name = "F", descriptor = "I")
	public static int anInt4804 = 0;

	@OriginalMember(owner = "client!lk", name = "L", descriptor = "[I")
	public static final int[] anIntArray595 = new int[256];

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IZIIIIIIIII)Z")
	public static boolean method4206(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(32) int local32 = Static294.method4659(arg3, arg8, arg0, Static190.aClass239Array1[Static267.aClass12_Sub1_Sub2_Sub2_1.aByte74], arg4, arg6, arg1, Static267.aClass12_Sub1_Sub2_Sub2_1.method4706(), arg9, Static315.anIntArray686, arg7, arg2, arg5, Static360.anIntArray766);
		if (local32 < 1) {
			return false;
		}
		Static292.anInt5161 = Static360.anIntArray766[local32 - 1];
		Static204.anInt3770 = Static315.anIntArray686[local32 - 1];
		Static19.aBoolean29 = false;
		Static305.method2102();
		return true;
	}
}
