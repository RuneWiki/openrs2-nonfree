import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static192 {

	@OriginalMember(owner = "client!jj", name = "e", descriptor = "Lclient!v;")
	public static Class244 aClass244_7;

	@OriginalMember(owner = "client!jj", name = "g", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray11;

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "Lclient!pi;")
	public static final Class184 aClass184_132 = new Class184(19, 0);

	@OriginalMember(owner = "client!jj", name = "f", descriptor = "[Lclient!ge;")
	public static Class83[] aClass83Array1 = new Class83[50];

	@OriginalMember(owner = "client!jj", name = "h", descriptor = "[I")
	public static final int[] anIntArray295 = new int[8];

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)V")
	public static void method3182() {
		Static343.anInt6238 = 0;
		@Pc(12) int local12 = Static108.anInt3458 + (Static113.aClass1_Sub3_Sub3_Sub1_4.anInt6053 >> 7);
		@Pc(19) int local19 = Static339.anInt6223 + (Static113.aClass1_Sub3_Sub3_Sub1_4.anInt6055 >> 7);
		if (local12 >= 3053 && local12 <= 3156 && local19 >= 3056 && local19 <= 3136) {
			Static343.anInt6238 = 1;
		}
		if (local12 >= 3072 && local12 <= 3118 && local19 >= 9492 && local19 <= 9535) {
			Static343.anInt6238 = 1;
		}
		if (Static343.anInt6238 == 1 && local12 >= 3139 && local12 <= 3199 && local19 >= 3008 && local19 <= 3062) {
			Static343.anInt6238 = 0;
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IBI)Z")
	public static boolean method3183(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIIIZ)V")
	public static void method3184(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		for (@Pc(12) int local12 = arg3; local12 <= arg1; local12++) {
			Static15.method463(arg0, Static376.anIntArrayArray64[local12], arg4, arg2);
		}
	}
}
