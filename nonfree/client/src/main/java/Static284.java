import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static284 {

	@OriginalMember(owner = "client!ns", name = "Cb", descriptor = "[I")
	public static final int[] anIntArray321 = new int[32];

	@OriginalMember(owner = "client!ns", name = "Db", descriptor = "I")
	public static int anInt5007 = 0;

	@OriginalMember(owner = "client!ns", name = "Fb", descriptor = "Lclient!wi;")
	public static final Class268 aClass268_40 = new Class268(4);

	@OriginalMember(owner = "client!ns", name = "Ib", descriptor = "I")
	public static final int anInt5011 = 0;

	@OriginalMember(owner = "client!ns", name = "Kb", descriptor = "S")
	public static short aShort65 = 32767;

	@OriginalMember(owner = "client!ns", name = "z", descriptor = "(I)V")
	public static void method4126() {
		if (!Static110.aBoolean118) {
			return;
		}
		while (true) {
			while (Static121.aClass41_Sub1Array1.length > Static276.anInt4607) {
				@Pc(26) Class41_Sub1 local26 = Static121.aClass41_Sub1Array1[Static276.anInt4607];
				if (local26 != null && local26.anInt7104 == -1) {
					if (Static367.aClass3_Sub23_2 == null) {
						Static367.aClass3_Sub23_2 = Static285.aClass126_1.method3160(local26.aString65);
					}
					@Pc(49) int local49 = Static367.aClass3_Sub23_2.anInt3004;
					if (local49 == -1) {
						return;
					}
					Static367.aClass3_Sub23_2 = null;
					local26.anInt7104 = local49;
					Static276.anInt4607++;
				} else {
					Static276.anInt4607++;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(IIIIIIIIBI)V")
	public static void method4129(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		if (arg8 >= Static399.anInt2866 && Static372.anInt6316 >= arg8 && Static399.anInt2866 <= arg2 && arg2 <= Static372.anInt6316 && Static399.anInt2866 <= arg6 && Static372.anInt6316 >= arg6 && arg5 >= Static399.anInt2866 && Static372.anInt6316 >= arg5 && arg1 >= Static316.anInt5349 && Static418.anInt7030 >= arg1 && arg4 >= Static316.anInt5349 && Static418.anInt7030 >= arg4 && Static316.anInt5349 <= arg7 && Static418.anInt7030 >= arg7 && arg0 >= Static316.anInt5349 && Static418.anInt7030 >= arg0) {
			Static361.method5050(arg5, arg0, arg6, arg2, arg1, arg8, arg3, arg4, arg7);
		} else {
			Static118.method1900(arg0, arg3, arg2, arg8, arg5, arg1, arg7, arg6, arg4);
		}
	}
}
