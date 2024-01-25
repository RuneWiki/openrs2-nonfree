import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static204 {

	@OriginalMember(owner = "client!ke", name = "p", descriptor = "J")
	public static long aLong101;

	@OriginalMember(owner = "client!ke", name = "h", descriptor = "Lclient!vp;")
	public static Class254 aClass254_22 = new Class254();

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IBIIIII)V")
	public static void method2779(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		@Pc(3) Class209[] local3 = Static162.aClass209Array1;
		for (@Pc(13) int local13 = 0; local13 < local3.length; local13++) {
			@Pc(19) Class209 local19 = local3[local13];
			if (local19 != null && local19.anInt5510 == 2) {
				Static79.method1220(local19.anInt5507, local19.anInt5502, arg0 >> 1, local19.anInt5503 * 2, local19.anInt5506, arg3 >> 1);
				if (Static80.anIntArray72[0] > -1 && Static368.anInt6250 % 20 < 10) {
					Static454.aClass49Array146[local19.anInt5509].method5636(Static80.anIntArray72[0] + arg1 - 12, arg2 + -28 + Static80.anIntArray72[1]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIILclient!lh;Lclient!lh;)V")
	public static void method2781(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class20_Sub1 arg3, @OriginalArg(4) Class20_Sub1 arg4) {
		@Pc(4) Class82 local4 = Static15.method238(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass20_Sub1_2 = arg3;
			local4.aClass20_Sub1_3 = arg4;
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILclient!kn;IIILclient!qa;)V")
	public static void method2782(@OriginalArg(0) int arg0, @OriginalArg(1) Class141 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class128 arg4) {
		@Pc(9) Class188 local9 = Static346.aClass135_3.method2791(arg1.anInt3401);
		if (local9.anInt5032 == -1) {
			return;
		}
		if (arg1.aBoolean265) {
			@Pc(22) int local22 = arg3 + arg1.anInt3397;
			arg3 = local22 & 0x3;
		} else {
			arg3 = 0;
		}
		@Pc(38) Class49 local38 = local9.method3940(arg3, arg1.aBoolean270, arg4);
		if (local38 == null) {
			return;
		}
		@Pc(44) int local44 = arg1.anInt3423;
		@Pc(47) int local47 = arg1.anInt3403;
		if ((arg3 & 0x1) == 1) {
			local47 = arg1.anInt3423;
			local44 = arg1.anInt3403;
		}
		@Pc(63) int local63 = local38.ja();
		@Pc(75) int local75 = local38.JA();
		if (local9.aBoolean403) {
			local63 = local44 * 4;
			local75 = local47 * 4;
		}
		if (local9.anInt5031 == 0) {
			local38.method5640(arg0, arg2 + 4 - local47 * 4, local63, local75);
		} else {
			local38.M(arg0, arg2 - (local47 - 1) * 4, local63, local75, 0, local9.anInt5031 | 0xFF000000, 1);
		}
	}
}
