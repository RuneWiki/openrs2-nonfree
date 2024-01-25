import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static445 {

	@OriginalMember(owner = "client!ou", name = "G", descriptor = "I")
	public static int anInt6949;

	@OriginalMember(owner = "client!ou", name = "H", descriptor = "[I")
	public static int[] anIntArray481;

	@OriginalMember(owner = "client!ou", name = "O", descriptor = "I")
	public static int anInt6953;

	@OriginalMember(owner = "client!ou", name = "E", descriptor = "Lclient!hj;")
	public static final Class151 aClass151_147 = new Class151(49, 4);

	@OriginalMember(owner = "client!ou", name = "M", descriptor = "S")
	public static short aShort96 = 256;

	@OriginalMember(owner = "client!ou", name = "b", descriptor = "(B)Lclient!es;")
	public static Class4_Sub11 method6120() {
		@Pc(16) Class4_Sub11 local16 = new Class4_Sub11(518);
		anIntArray481 = new int[4];
		anIntArray481[2] = (int) (Math.random() * 9.9999999E7D);
		anIntArray481[1] = (int) (Math.random() * 9.9999999E7D);
		anIntArray481[3] = (int) (Math.random() * 9.9999999E7D);
		anIntArray481[0] = (int) (Math.random() * 9.9999999E7D);
		local16.method8822(10);
		local16.method8860(anIntArray481[0]);
		local16.method8860(anIntArray481[1]);
		local16.method8860(anIntArray481[2]);
		local16.method8860(anIntArray481[3]);
		return local16;
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "([I[ILclient!vk;[IB)V")
	public static void method6121(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class3_Sub1_Sub2_Sub2_Sub2 arg2, @OriginalArg(3) int[] arg3) {
		for (@Pc(8) int local8 = 0; local8 < arg0.length; local8++) {
			@Pc(14) int local14 = arg0[local8];
			@Pc(18) int local18 = arg3[local8];
			@Pc(22) int local22 = arg1[local8];
			for (@Pc(24) int local24 = 0; local18 != 0 && local24 < arg2.aClass143Array3.length; local24++) {
				if ((local18 & 0x1) != 0) {
					if (local14 == -1) {
						arg2.aClass143Array3[local24] = null;
					} else {
						@Pc(42) Class124 local42 = Static99.aClass2_1.method22(local14);
						@Pc(45) int local45 = local42.anInt3024;
						@Pc(50) Class143 local50 = arg2.aClass143Array3[local24];
						if (local50 != null) {
							if (local14 == local50.anInt3386) {
								if (local45 == 0) {
									local50 = arg2.aClass143Array3[local24] = null;
								} else if (local45 == 1) {
									local50.anInt3382 = 1;
									local50.anInt3388 = 0;
									local50.anInt3384 = 0;
									local50.anInt3383 = local22;
									local50.anInt3385 = 0;
									if (!arg2.aBoolean773) {
										Static633.method8389(0, arg2, local42);
									}
								} else if (local45 == 2) {
									local50.anInt3384 = 0;
								}
							} else if (local42.anInt3029 >= Static99.aClass2_1.method22(local50.anInt3386).anInt3029) {
								local50 = arg2.aClass143Array3[local24] = null;
							}
						}
						if (local50 == null) {
							local50 = arg2.aClass143Array3[local24] = new Class143();
							local50.anInt3388 = 0;
							local50.anInt3386 = local14;
							local50.anInt3382 = 1;
							local50.anInt3384 = 0;
							local50.anInt3385 = 0;
							local50.anInt3383 = local22;
							if (!arg2.aBoolean773) {
								Static633.method8389(0, arg2, local42);
							}
						}
					}
				}
				local18 >>>= 0x1;
			}
		}
	}
}
