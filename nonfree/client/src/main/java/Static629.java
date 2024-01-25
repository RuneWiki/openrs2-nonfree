import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static629 {

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "[[Lclient!dm;")
	public static Class78[][] aClass78ArrayArray2;

	@OriginalMember(owner = "client!wi", name = "c", descriptor = "I")
	public static int anInt10135;

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIIIBII)V")
	public static void method8477(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static189.method3427(arg4);
		@Pc(21) int local21 = 0;
		@Pc(26) int local26 = arg4 - arg2;
		if (local26 < 0) {
			local26 = 0;
		}
		@Pc(35) int local35 = arg4;
		@Pc(38) int local38 = -arg4;
		@Pc(40) int local40 = local26;
		@Pc(43) int local43 = -local26;
		@Pc(45) int local45 = -1;
		@Pc(68) int local68;
		@Pc(76) int local76;
		@Pc(84) int local84;
		@Pc(92) int local92;
		if (arg1 >= Static570.anInt9385 && arg1 <= Static177.anInt3963) {
			@Pc(59) int[] local59 = Static618.anIntArrayArray101[arg1];
			local68 = Static108.method1816(Static252.anInt4988, arg0 - arg4, Static306.anInt5020);
			local76 = Static108.method1816(Static252.anInt4988, arg4 + arg0, Static306.anInt5020);
			local84 = Static108.method1816(Static252.anInt4988, arg0 - local26, Static306.anInt5020);
			local92 = Static108.method1816(Static252.anInt4988, local26 + arg0, Static306.anInt5020);
			Static259.method4236(local68, local84, arg3, local59);
			Static259.method4236(local84, local92, arg5, local59);
			Static259.method4236(local92, local76, arg3, local59);
		}
		@Pc(112) int local112 = -1;
		while (local21 < local35) {
			local112 += 2;
			local45 += 2;
			local38 += local45;
			local43 += local112;
			if (local43 >= 0 && local40 >= 1) {
				local40--;
				Static29.anIntArray98[local40] = local21;
				local43 -= local40 << 1;
			}
			local21++;
			@Pc(251) int local251;
			@Pc(260) int local260;
			@Pc(267) int[] local267;
			@Pc(160) int local160;
			if (local38 >= 0) {
				local35--;
				local38 -= local35 << 1;
				local160 = arg1 - local35;
				local68 = local35 + arg1;
				if (Static570.anInt9385 <= local68 && local160 <= Static177.anInt3963) {
					if (local26 <= local35) {
						local76 = Static108.method1816(Static252.anInt4988, local21 + arg0, Static306.anInt5020);
						local84 = Static108.method1816(Static252.anInt4988, arg0 - local21, Static306.anInt5020);
						if (Static177.anInt3963 >= local68) {
							Static259.method4236(local84, local76, arg3, Static618.anIntArrayArray101[local68]);
						}
						if (local160 >= Static570.anInt9385) {
							Static259.method4236(local84, local76, arg3, Static618.anIntArrayArray101[local160]);
						}
					} else {
						local76 = Static29.anIntArray98[local35];
						local84 = Static108.method1816(Static252.anInt4988, local21 + arg0, Static306.anInt5020);
						local92 = Static108.method1816(Static252.anInt4988, arg0 - local21, Static306.anInt5020);
						local251 = Static108.method1816(Static252.anInt4988, arg0 + local76, Static306.anInt5020);
						local260 = Static108.method1816(Static252.anInt4988, arg0 - local76, Static306.anInt5020);
						if (Static177.anInt3963 >= local68) {
							local267 = Static618.anIntArrayArray101[local68];
							Static259.method4236(local92, local260, arg3, local267);
							Static259.method4236(local260, local251, arg5, local267);
							Static259.method4236(local251, local84, arg3, local267);
						}
						if (Static570.anInt9385 <= local160) {
							local267 = Static618.anIntArrayArray101[local160];
							Static259.method4236(local92, local260, arg3, local267);
							Static259.method4236(local260, local251, arg5, local267);
							Static259.method4236(local251, local84, arg3, local267);
						}
					}
				}
			}
			local160 = arg1 - local21;
			local68 = arg1 + local21;
			if (local68 >= Static570.anInt9385 && local160 <= Static177.anInt3963) {
				local76 = local35 + arg0;
				local84 = arg0 - local35;
				if (local76 >= Static306.anInt5020 && Static252.anInt4988 >= local84) {
					local76 = Static108.method1816(Static252.anInt4988, local76, Static306.anInt5020);
					local84 = Static108.method1816(Static252.anInt4988, local84, Static306.anInt5020);
					if (local26 <= local21) {
						if (local68 <= Static177.anInt3963) {
							Static259.method4236(local84, local76, arg3, Static618.anIntArrayArray101[local68]);
						}
						if (Static570.anInt9385 <= local160) {
							Static259.method4236(local84, local76, arg3, Static618.anIntArrayArray101[local160]);
						}
					} else {
						local92 = local40 >= local21 ? local40 : Static29.anIntArray98[local21];
						local251 = Static108.method1816(Static252.anInt4988, local92 + arg0, Static306.anInt5020);
						local260 = Static108.method1816(Static252.anInt4988, arg0 - local92, Static306.anInt5020);
						if (local68 <= Static177.anInt3963) {
							local267 = Static618.anIntArrayArray101[local68];
							Static259.method4236(local84, local260, arg3, local267);
							Static259.method4236(local260, local251, arg5, local267);
							Static259.method4236(local251, local76, arg3, local267);
						}
						if (Static570.anInt9385 <= local160) {
							local267 = Static618.anIntArrayArray101[local160];
							Static259.method4236(local84, local260, arg3, local267);
							Static259.method4236(local260, local251, arg5, local267);
							Static259.method4236(local251, local76, arg3, local267);
						}
					}
				}
			}
		}
	}
}
