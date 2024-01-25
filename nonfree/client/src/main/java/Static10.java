import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(II[BBII)V")
	public static void method240(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		if (arg2 <= arg0) {
			return;
		}
		arg3 += arg0;
		@Pc(24) int local24 = arg2 - arg0 >> 2;
		while (true) {
			local24--;
			if (local24 < 0) {
				local24 = arg2 - arg0 & 0x3;
				while (true) {
					local24--;
					if (local24 < 0) {
						return;
					}
					arg1[arg3++] = 1;
				}
			}
			@Pc(31) int local31 = arg3 + 1;
			arg1[arg3] = 1;
			@Pc(36) int local36 = local31 + 1;
			arg1[local31] = 1;
			@Pc(41) int local41 = local36 + 1;
			arg1[local36] = 1;
			arg3 = local41 + 1;
			arg1[local41] = 1;
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "([I[IBLclient!ac;[I)V")
	public static void method241(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) Class6_Sub1_Sub1_Sub1_Sub1 arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			@Pc(9) int local9 = arg0[local3];
			@Pc(13) int local13 = arg3[local3];
			@Pc(17) int local17 = arg1[local3];
			@Pc(19) int local19 = 0;
			while (local13 != 0 && arg2.aClass19Array3.length > local19) {
				if ((local13 & 0x1) != 0) {
					if (local9 == -1) {
						arg2.aClass19Array3[local19] = null;
					} else {
						@Pc(45) Class84 local45 = Static116.aClass140_2.method3287(local9);
						@Pc(48) int local48 = local45.anInt2056;
						@Pc(53) Class19 local53 = arg2.aClass19Array3[local19];
						if (local53 != null) {
							if (local53.anInt495 == local9) {
								if (local48 == 0) {
									local53 = arg2.aClass19Array3[local19] = null;
								} else if (local48 == 1) {
									local53.anInt498 = 1;
									local53.anInt494 = 0;
									local53.anInt496 = 0;
									local53.anInt497 = 0;
									local53.anInt493 = local17;
									Static434.method4018(arg2.aByte112, local45, arg2.anInt8761, arg2.anInt8764, 0, false);
								} else if (local48 == 2) {
									local53.anInt497 = 0;
								}
							} else if (local45.anInt2065 >= Static116.aClass140_2.method3287(local53.anInt495).anInt2065) {
								local53 = arg2.aClass19Array3[local19] = null;
							}
						}
						if (local53 == null) {
							local53 = arg2.aClass19Array3[local19] = new Class19();
							local53.anInt495 = local9;
							local53.anInt494 = 0;
							local53.anInt497 = 0;
							local53.anInt496 = 0;
							local53.anInt493 = local17;
							local53.anInt498 = 1;
							Static434.method4018(arg2.aByte112, local45, arg2.anInt8761, arg2.anInt8764, 0, false);
						}
					}
				}
				local19++;
				local13 >>>= 0x1;
			}
		}
	}
}
