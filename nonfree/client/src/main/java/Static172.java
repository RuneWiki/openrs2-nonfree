import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static172 {

	@OriginalMember(owner = "client!ig", name = "p", descriptor = "Lclient!jf;")
	public static Class123 aClass123_1;

	@OriginalMember(owner = "client!ig", name = "q", descriptor = "F")
	public static float aFloat91;

	@OriginalMember(owner = "client!ig", name = "k", descriptor = "Lclient!aa;")
	public static final Class2 aClass2_54 = new Class2(10, -1);

	@OriginalMember(owner = "client!ig", name = "n", descriptor = "[Z")
	public static final boolean[] aBooleanArray15 = new boolean[5];

	@OriginalMember(owner = "client!ig", name = "o", descriptor = "I")
	public static int anInt3086 = 2;

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method2495(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		if (arg7 < 1 || arg1 < 1 || arg7 > Static333.anInt3375 - 2 || Static102.anInt2086 - 2 < arg1) {
			return;
		}
		@Pc(26) int local26 = arg2;
		if (arg2 < 3 && Static148.method2268(arg1, arg7)) {
			local26 = arg2 + 1;
		}
		if (!Static130.aClass153_Sub1_1.method4229(Static377.anInt6113) && !Static446.method5667(local26, arg1, Static179.anInt7446, arg7)) {
			return;
		}
		if (Static19.aClass223ArrayArrayArray1 == null) {
			return;
		}
		Static386.aClass46_Sub1_2.method812(arg7, Static269.aClass51_9, arg2, arg1, arg6, Static179.aClass70Array3[arg2]);
		if (arg0 < 0) {
			return;
		}
		@Pc(69) boolean local69 = Static130.aClass153_Sub1_1.aBoolean347;
		Static130.aClass153_Sub1_1.aBoolean347 = true;
		Static386.aClass46_Sub1_2.method807(local26, arg1, arg7, Static179.aClass70Array3[arg2], arg5, arg4, arg3, arg2, Static269.aClass51_9, arg0);
		Static130.aClass153_Sub1_1.aBoolean347 = local69;
		return;
	}
}
