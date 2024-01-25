import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static260 {

	@OriginalMember(owner = "client!in", name = "h", descriptor = "[I")
	public static int[] anIntArray268;

	@OriginalMember(owner = "client!in", name = "a", descriptor = "I")
	public static int anInt4561 = 0;

	@OriginalMember(owner = "client!in", name = "f", descriptor = "I")
	public static int anInt4566 = 0;

	@OriginalMember(owner = "client!in", name = "i", descriptor = "[[I")
	public static final int[][] anIntArrayArray31 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3888(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) Class3_Sub33 local7 = null;
		for (@Pc(12) Class3_Sub33 local12 = (Class3_Sub33) Static346.aClass302_39.method6603(); local12 != null; local12 = (Class3_Sub33) Static346.aClass302_39.method6605()) {
			if (local12.anInt5157 == arg2 && arg0 == local12.anInt5169 && arg6 == local12.anInt5170 && local12.anInt5163 == arg3) {
				local7 = local12;
				break;
			}
		}
		if (local7 == null) {
			local7 = new Class3_Sub33();
			local7.anInt5169 = arg0;
			local7.anInt5163 = arg3;
			local7.anInt5170 = arg6;
			local7.anInt5157 = arg2;
			if (arg0 >= 0 && arg6 >= 0 && Static98.anInt361 > arg0 && arg6 < Static438.anInt7120) {
				Static114.method1730(local7);
			}
			Static346.aClass302_39.method6613(local7);
		}
		local7.aBoolean341 = false;
		local7.aBoolean342 = true;
		local7.anInt5166 = arg4;
		local7.anInt5162 = arg1;
		local7.anInt5168 = arg5;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(I)Lclient!cfa;")
	public static Class52 method3889() {
		return Static529.method6837();
	}

	@OriginalMember(owner = "client!in", name = "b", descriptor = "(I)V")
	public static void method3890() {
		if (Static336.aClass3_Sub41_18.aClass14_Sub25_1.method6576() == 0 && Static570.anInt9192 != Static566.anInt9142) {
			Static469.method6284(Static586.anInt9541, false, Static55.anInt1158, 11);
		} else {
			Static294.method8853(Static119.aClass95_4);
			if (Static570.anInt9192 != Static516.anInt8124) {
				Static495.method6508();
			}
		}
	}
}
