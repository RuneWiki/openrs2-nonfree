import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static263 {

	@OriginalMember(owner = "client!nd", name = "e", descriptor = "Lclient!uv;")
	public static Class10 aClass10_1;

	@OriginalMember(owner = "client!nd", name = "N", descriptor = "[[[Lclient!iq;")
	public static Class118[][][] aClass118ArrayArrayArray2;

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "([BIIIII)Z")
	public static boolean method3822(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(12) boolean local12 = true;
		@Pc(17) Class3_Sub7 local17 = new Class3_Sub7(arg0);
		@Pc(19) int local19 = -1;
		label56: while (true) {
			@Pc(23) int local23 = local17.method2592();
			if (local23 == 0) {
				return local12;
			}
			local19 += local23;
			@Pc(34) int local34 = 0;
			@Pc(36) boolean local36 = false;
			while (true) {
				@Pc(42) int local42;
				while (!local36) {
					local42 = local17.method2638();
					if (local42 == 0) {
						continue label56;
					}
					local34 += local42 - 1;
					@Pc(72) int local72 = local34 & 0x3F;
					@Pc(78) int local78 = local34 >> 6 & 0x3F;
					@Pc(84) int local84 = local17.method2582() >> 2;
					@Pc(89) int local89 = local78 + arg2;
					@Pc(93) int local93 = arg4 + local72;
					if (local89 > 0 && local93 > 0 && local89 < arg3 - 1 && local93 < arg1 - 1) {
						@Pc(118) Class93 local118 = Static435.aClass30_4.method769(local19);
						if (local84 != 22 || Static374.aClass20_Sub1_1.aBoolean183 || local118.anInt2768 != 0 || local118.anInt2780 == 1 || local118.aBoolean258) {
							if (!local118.method2063()) {
								Static180.anInt3570++;
								local12 = false;
							}
							local36 = true;
						}
					}
				}
				local42 = local17.method2638();
				if (local42 == 0) {
					break;
				}
				local17.method2582();
			}
		}
	}
}
