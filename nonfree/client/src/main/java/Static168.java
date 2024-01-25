import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static168 {

	@OriginalMember(owner = "client!kj", name = "e", descriptor = "I")
	public static int anInt3424;

	@OriginalMember(owner = "client!kj", name = "c", descriptor = "I")
	public static int anInt3422 = 0;

	@OriginalMember(owner = "client!kj", name = "d", descriptor = "I")
	public static int anInt3423 = 0;

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lclient!ae;IBZI[B[Lclient!p;)V")
	public static void method3164(@OriginalArg(0) Class4 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4, @OriginalArg(6) Class151[] arg5) {
		@Pc(15) Class2_Sub10 local15 = new Class2_Sub10(arg4);
		@Pc(17) int local17 = -1;
		while (true) {
			@Pc(21) int local21 = local15.method4448();
			if (local21 == 0) {
				return;
			}
			local17 += local21;
			@Pc(32) int local32 = 0;
			while (true) {
				@Pc(36) int local36 = local15.method4441();
				if (local36 == 0) {
					break;
				}
				local32 += local36 - 1;
				@Pc(48) int local48 = local32 & 0x3F;
				@Pc(54) int local54 = local32 >> 6 & 0x3F;
				@Pc(58) int local58 = local32 >> 12;
				@Pc(62) int local62 = local15.method4421();
				@Pc(66) int local66 = local62 >> 2;
				@Pc(70) int local70 = local62 & 0x3;
				@Pc(74) int local74 = local54 + arg1;
				@Pc(78) int local78 = arg3 + local48;
				if (local74 > 0 && local78 > 0 && Static95.anInt6381 - 1 > local74 && Static237.anInt4532 - 1 > local78) {
					@Pc(105) Class151 local105 = null;
					if (!arg2) {
						@Pc(109) int local109 = local58;
						if ((Static313.aByteArrayArrayArray12[1][local74][local78] & 0x2) == 2) {
							local109 = local58 - 1;
						}
						if (local109 >= 0) {
							local105 = arg5[local109];
						}
					}
					Static122.method3994(local66, local74, true, arg2, local17, local105, local58, -1, local58, arg0, local70, local78);
				}
			}
		}
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(BIIIIIII)V")
	public static void method3165(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg2 - 334;
		if (local7 < 0) {
			local7 = 0;
		} else if (local7 > 100) {
			local7 = 100;
		}
		@Pc(34) int local34 = (Static356.aShort93 - Static31.aShort16) * local7 / 100 + Static31.aShort16;
		@Pc(40) int local40 = local34 * arg4 >> 8;
		@Pc(58) int local58 = 16384 - arg1 & 0x3FFF;
		@Pc(65) int local65 = 16384 - arg0 & 0x3FFF;
		@Pc(67) int local67 = 0;
		@Pc(69) int local69 = 0;
		@Pc(71) int local71 = local40;
		if (local58 != 0) {
			local69 = -local40 * Class24.anIntArray35[local58] >> 15;
			local71 = local40 * Class24.anIntArray36[local58] >> 15;
		}
		if (local65 != 0) {
			local67 = Class24.anIntArray35[local65] * local71 >> 15;
			local71 = Class24.anIntArray36[local65] * local71 >> 15;
		}
		Static344.anInt6885 = 0;
		Static290.anInt5837 = arg6 - local71;
		Static283.anInt5723 = arg1;
		Static163.anInt1495 = arg5 - local69;
		Static287.anInt5819 = arg3 - local67;
		Static291.anInt5883 = arg0;
	}
}
