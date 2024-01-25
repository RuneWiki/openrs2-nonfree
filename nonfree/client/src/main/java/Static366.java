import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static366 {

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(III)Z")
	public static boolean method5795(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(IIILjava/lang/Class;)Lclient!oda;")
	public static Class20_Sub2_Sub2 method5797(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class97 local7 = Static272.aClass97ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(14) Class196 local14 = local7.aClass196_2; local14 != null; local14 = local14.aClass196_3) {
			@Pc(18) Class20_Sub2_Sub2 local18 = local14.aClass20_Sub2_Sub2_1;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort124 == arg1 && local18.aShort123 == arg2) {
				return local18;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(ZI)V")
	public static void method5801(@OriginalArg(1) int arg0) {
		@Pc(14) Class6_Sub35 local14 = (Class6_Sub35) Static227.aClass128_12.method3560((long) arg0);
		if (local14 != null) {
			local14.aClass62_Sub1_1.method8478();
			Static133.method2180(local14.aBoolean533, local14.anInt7969);
			local14.method9043();
		}
	}
}
