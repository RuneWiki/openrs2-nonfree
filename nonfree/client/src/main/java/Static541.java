import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static541 {

	@OriginalMember(owner = "client!s", name = "k", descriptor = "I")
	public static int anInt9251;

	@OriginalMember(owner = "client!s", name = "n", descriptor = "I")
	public static int anInt9249 = 0;

	@OriginalMember(owner = "client!s", name = "a", descriptor = "[I")
	public static final int[] anIntArray602 = new int[2048];

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method8070(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(25) int local25 = 0; local25 < Static265.anInt5023; local25++) {
			if (arg0.equalsIgnoreCase(Static35.aStringArray5[local25])) {
				return local25;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(BZZLjava/lang/String;ILjava/lang/String;I)V")
	public static void method8073(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4, @OriginalArg(6) int arg5) {
		Static479.aClass223_94.anInt5858 = 1;
		@Pc(11) String local11 = arg2.toLowerCase();
		@Pc(14) short[] local14 = new short[16];
		@Pc(16) int local16 = -1;
		@Pc(18) String local18 = null;
		if (arg3 != -1) {
			@Pc(26) Class302 local26 = Static521.aClass20_21.method250(arg3);
			if (local26 == null || local26.method7331() != arg1) {
				return;
			}
			if (local26.method7331()) {
				local18 = local26.aString96;
			} else {
				local16 = local26.anInt8386;
			}
		}
		@Pc(50) int local50 = 0;
		for (@Pc(52) int local52 = 0; local52 < Static149.aClass244_1.anInt6698; local52++) {
			@Pc(66) Class282 local66 = Static149.aClass244_1.method5958(local52);
			if ((!arg0 || local66.aBoolean601) && local66.anInt7895 == -1 && local66.anInt7929 == -1 && local66.anInt7880 == -1 && local66.anInt7890 == 0 && local66.aString87.toLowerCase().indexOf(local11) != -1) {
				if (arg3 != -1) {
					if (arg1) {
						if (!arg4.equals(local66.method6980(local18, arg3))) {
							continue;
						}
					} else if (arg5 != local66.method6975(arg3, local16)) {
						continue;
					}
				}
				if (local50 >= 250) {
					Static327.anInt5649 = -1;
					Static141.aShortArray139 = null;
					return;
				}
				if (local50 >= local14.length) {
					@Pc(176) short[] local176 = new short[local14.length * 2];
					for (@Pc(178) int local178 = 0; local178 < local50; local178++) {
						local176[local178] = local14[local178];
					}
					local14 = local176;
				}
				local14[local50++] = (short) local52;
			}
		}
		Static141.aShortArray139 = local14;
		Static12.anInt187 = 0;
		Static327.anInt5649 = local50;
		@Pc(222) String[] local222 = new String[Static327.anInt5649];
		for (@Pc(224) int local224 = 0; local224 < Static327.anInt5649; local224++) {
			local222[local224] = Static149.aClass244_1.method5958(local14[local224]).aString87;
		}
		Static608.method8374(Static141.aShortArray139, local222);
		Static479.aClass223_94.method5268();
		Static479.aClass223_94.anInt5858 = 2;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIZ)V")
	public static void method8076(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) int local5 = Static458.anInt7940;
		@Pc(14) int local14 = Static205.anInt4119;
		if (Static93.aBoolean113) {
			local5 += Static24.method290();
			local14 += Static488.method7227();
		}
		@Pc(35) Class49 local35;
		if (Static266.anInt5026 == 1) {
			local35 = Static406.aClass49Array10[Static129.anInt2573 / 100];
			local35.method8997(local5 - 8, local14 - 8);
			Static494.method3707(local14 - 8, local5 + -8, local35.method8987() + local14 - 8, local5 - -local35.method8991() + -8);
		}
		if (Static266.anInt5026 == 2) {
			local35 = Static406.aClass49Array10[Static129.anInt2573 / 100 + 4];
			local35.method8997(local5 - 8, local14 + -8);
			Static494.method3707(local14 - 8, local5 + -8, local14 + local35.method8987() - 8, local35.method8991() + -8 + local5);
		}
		Static453.method6959();
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(ILjava/lang/String;IIJZLjava/lang/String;IZIZIJ)V")
	public static void method8078(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(4) long arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) String arg5, @OriginalArg(7) int arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) int arg8, @OriginalArg(10) boolean arg9, @OriginalArg(11) int arg10, @OriginalArg(12) long arg11) {
		if (!Static484.aBoolean623 && Static539.anInt8776 < 500) {
			@Pc(22) int local22 = arg0 == -1 ? Static475.anInt8093 : arg0;
			@Pc(38) Class6_Sub2_Sub11 local38 = new Class6_Sub2_Sub11(arg5, arg1, local22, arg10, arg6, arg11, arg2, arg8, arg4, arg9, arg3, arg7);
			Static8.method113(local38);
		}
	}
}
