import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static233 {

	@OriginalMember(owner = "client!iea", name = "P", descriptor = "I")
	public static int anInt3794;

	@OriginalMember(owner = "client!iea", name = "yb", descriptor = "I")
	public static int anInt3814;

	@OriginalMember(owner = "client!iea", name = "J", descriptor = "Lclient!ju;")
	public static final Class179 aClass179_54 = new Class179(30, -1);

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(I[I[ILclient!am;[I)V")
	public static void method3200(@OriginalArg(1) int[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class13_Sub1_Sub1_Sub1_Sub1 arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			@Pc(13) int local13 = arg1[local7];
			@Pc(17) int local17 = arg0[local7];
			@Pc(21) int local21 = arg3[local7];
			@Pc(23) int local23 = 0;
			while (local17 != 0 && arg2.aClass250Array3.length > local23) {
				if ((local17 & 0x1) != 0) {
					if (local13 == -1) {
						arg2.aClass250Array3[local23] = null;
					} else {
						@Pc(40) Class81 local40 = Static540.aClass173_2.method3791(local13);
						@Pc(43) int local43 = local40.anInt2141;
						@Pc(48) Class250 local48 = arg2.aClass250Array3[local23];
						if (local48 != null) {
							if (local13 == local48.anInt6333) {
								if (local43 == 0) {
									local48 = arg2.aClass250Array3[local23] = null;
								} else if (local43 == 1) {
									local48.anInt6331 = 0;
									local48.anInt6330 = 0;
									local48.anInt6332 = local21;
									local48.anInt6329 = 0;
									local48.anInt6334 = 1;
									if (!arg2.aBoolean317) {
										Static589.method8022(0, local40, arg2);
									}
								} else if (local43 == 2) {
									local48.anInt6329 = 0;
								}
							} else if (local40.anInt2151 >= Static540.aClass173_2.method3791(local48.anInt6333).anInt2151) {
								local48 = arg2.aClass250Array3[local23] = null;
							}
						}
						if (local48 == null) {
							local48 = arg2.aClass250Array3[local23] = new Class250();
							local48.anInt6332 = local21;
							local48.anInt6329 = 0;
							local48.anInt6334 = 1;
							local48.anInt6331 = 0;
							local48.anInt6330 = 0;
							local48.anInt6333 = local13;
							if (!arg2.aBoolean317) {
								Static589.method8022(0, local40, arg2);
							}
						}
					}
				}
				local23++;
				local17 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(BII)Z")
	public static boolean method3202(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class191 local8 = Static319.aClass141_4.method2971(arg1);
		if (arg0 == 11) {
			arg0 = 10;
		}
		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}
		return local8.method4052(arg0);
	}
}
