import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!bv", name = "d", descriptor = "Lclient!ft;")
	public static Class79_Sub1 aClass79_Sub1_1;

	@OriginalMember(owner = "client!bv", name = "f", descriptor = "[I")
	public static int[] anIntArray31;

	@OriginalMember(owner = "client!bv", name = "g", descriptor = "Lclient!hv;")
	public static Class3_Sub23 aClass3_Sub23_1;

	@OriginalMember(owner = "client!bv", name = "h", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray1;

	@OriginalMember(owner = "client!bv", name = "e", descriptor = "Lclient!of;")
	public static final Class174 aClass174_24 = new Class174("purple:", "lila:", "violet:", "roxo:");

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(IIIIIIZIB)Z")
	public static boolean method636(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7) {
		@Pc(13) int local13 = Static203.aClass1_Sub2_Sub6_Sub2_1.anIntArray510[0];
		@Pc(18) int local18 = Static203.aClass1_Sub2_Sub6_Sub2_1.anIntArray509[0];
		if (local13 < 0 || local13 >= Static373.anInt6324 || local18 < 0 || Static291.anInt5062 <= local18) {
			return false;
		} else if (arg7 >= 0 && arg7 < Static373.anInt6324 && arg1 >= 0 && arg1 < Static291.anInt5062) {
			@Pc(84) int local84 = Static454.method6201(Static226.anIntArray444, arg5, local18, arg2, arg0, arg3, arg1, arg6, Static203.aClass1_Sub2_Sub6_Sub2_1.method6204(), arg7, Static296.anIntArray328, Static250.aClass128Array1[Static203.aClass1_Sub2_Sub6_Sub2_1.aByte101], arg4, local13);
			if (local84 < 1) {
				return false;
			}
			Static31.anInt592 = Static296.anIntArray328[local84 - 1];
			Static392.anInt6568 = Static226.anIntArray444[local84 - 1];
			Static356.aBoolean488 = false;
			Static336.method4668();
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "([Ljava/lang/Object;I[J)V")
	public static void method637(@OriginalArg(0) Object[] arg0, @OriginalArg(2) long[] arg1) {
		Static421.method5764(arg0, arg1.length - 1, 0, arg1);
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(BC)Z")
	public static boolean method638(@OriginalArg(1) char arg0) {
		return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
	}
}
