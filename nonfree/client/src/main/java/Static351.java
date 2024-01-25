import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static351 {

	@OriginalMember(owner = "client!ri", name = "n", descriptor = "[Lclient!aa;")
	public static Class2[] aClass2Array36;

	@OriginalMember(owner = "client!ri", name = "s", descriptor = "I")
	public static int anInt6220;

	@OriginalMember(owner = "client!ri", name = "z", descriptor = "Lclient!ci;")
	public static Class38 aClass38_73;

	@OriginalMember(owner = "client!ri", name = "C", descriptor = "Z")
	public static boolean aBoolean462 = false;

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(ZZI)Lclient!st;")
	public static Class4_Sub38 method5112(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(17) long local17 = (long) (arg1 | (arg0 ? Integer.MIN_VALUE : 0));
		return (Class4_Sub38) Static201.aClass96_28.method2797(local17);
	}

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "(I)V")
	public static void method5115() {
		Static448.method6134(Static219.aClass212_60);
		Static457.aClass4_Sub20_Sub1_5.method4558(Static424.anInt7324);
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lclient!i;IBIIILclient!tf;Lclient!aa;)V")
	public static void method5117(@OriginalArg(0) Class74 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class240 arg5, @OriginalArg(7) Class2 arg6) {
		if (arg6 == null) {
			return;
		}
		@Pc(26) int local26;
		if (Static275.anInt5173 == 4) {
			local26 = (int) Static322.aFloat82 & 0x3FFF;
		} else {
			local26 = (int) Static322.aFloat82 + Static53.anInt4624 & 0x3FFF;
		}
		@Pc(48) int local48 = Math.max(arg5.anInt6904 / 2, arg5.anInt6894 / 2) + 10;
		@Pc(57) int local57 = arg1 * arg1 + arg3 * arg3;
		if (local57 > local48 * local48) {
			return;
		}
		@Pc(71) int local71 = Class4_Sub13.anIntArray497[local26];
		@Pc(75) int local75 = Class4_Sub13.anIntArray496[local26];
		if (Static275.anInt5173 != 4) {
			local75 = local75 * 256 / (Static437.anInt7473 + 256);
			local71 = local71 * 256 / (Static437.anInt7473 + 256);
		}
		@Pc(107) int local107 = arg3 * local71 + local75 * arg1 >> 15;
		@Pc(118) int local118 = local75 * arg3 - local71 * arg1 >> 15;
		arg6.method5916(arg5.anInt6904 / 2 + arg2 + local107 - arg6.d() / 2, arg4 - -(arg5.anInt6894 / 2) + -local118 + -(arg6.ga() / 2), arg0, arg2, arg4);
	}
}
