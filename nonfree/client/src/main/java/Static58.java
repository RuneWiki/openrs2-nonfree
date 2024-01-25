import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIBIII)V")
	public static void method1064(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(17) int local17 = 0;
		@Pc(19) int local19 = arg4;
		@Pc(23) int local23 = arg2 * arg2;
		@Pc(27) int local27 = arg4 * arg4;
		@Pc(31) int local31 = local27 << 1;
		@Pc(35) int local35 = local23 << 1;
		@Pc(39) int local39 = arg4 << 1;
		@Pc(48) int local48 = (1 - local39) * local23 + local31;
		@Pc(57) int local57 = local27 - local35 * (local39 - 1);
		@Pc(61) int local61 = local23 << 2;
		@Pc(65) int local65 = local27 << 2;
		@Pc(73) int local73 = local31 * 3;
		@Pc(81) int local81 = local35 * ((arg4 << 1) - 3);
		@Pc(87) int local87 = local65;
		@Pc(93) int local93 = (arg4 - 1) * local61;
		@Pc(111) int local111;
		@Pc(119) int local119;
		if (Static26.anInt345 <= arg1 && Static272.anInt4750 >= arg1) {
			local111 = Static97.method1633(arg2 + arg0, Static365.anInt6140, Static221.anInt3917);
			local119 = Static97.method1633(arg0 - arg2, Static365.anInt6140, Static221.anInt3917);
			Static349.method5265(local119, local111, arg3, Static325.anIntArrayArray50[arg1]);
		}
		while (local19 > 0) {
			if (local48 < 0) {
				while (local48 < 0) {
					local57 += local87;
					local48 += local73;
					local73 += local65;
					local17++;
					local87 += local65;
				}
			}
			if (local57 < 0) {
				local48 += local73;
				local57 += local87;
				local87 += local65;
				local17++;
				local73 += local65;
			}
			local48 += -local93;
			local57 += -local81;
			local81 -= local61;
			local19--;
			local93 -= local61;
			local111 = arg1 - local19;
			local119 = local19 + arg1;
			if (Static26.anInt345 <= local119 && Static272.anInt4750 >= local111) {
				@Pc(224) int local224 = Static97.method1633(local17 + arg0, Static365.anInt6140, Static221.anInt3917);
				@Pc(233) int local233 = Static97.method1633(arg0 - local17, Static365.anInt6140, Static221.anInt3917);
				if (local111 >= Static26.anInt345) {
					Static349.method5265(local233, local224, arg3, Static325.anIntArrayArray50[local111]);
				}
				if (Static272.anInt4750 >= local119) {
					Static349.method5265(local233, local224, arg3, Static325.anIntArrayArray50[local119]);
				}
			}
		}
	}
}
