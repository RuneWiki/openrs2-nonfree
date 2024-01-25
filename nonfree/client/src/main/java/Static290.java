import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static290 {

	@OriginalMember(owner = "client!ir", name = "e", descriptor = "I")
	public static int anInt4444;

	@OriginalMember(owner = "client!ir", name = "c", descriptor = "I")
	public static int anInt4445;

	@OriginalMember(owner = "client!ir", name = "f", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_79 = new Class397(83, 12);

	@OriginalMember(owner = "client!ir", name = "b", descriptor = "[I")
	public static final int[] anIntArray340 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(Ljava/awt/Canvas;IILclient!d;)Lclient!ha;")
	public static Class22 method4045(@OriginalArg(0) Canvas arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Interface4 arg2) {
		return new Class22_Sub1(arg0, arg2, arg1);
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(I)V")
	public static void method4046() {
		@Pc(8) Class3_Sub2_Sub1 local8 = Static95.aClass292_2.aClass3_Sub2_Sub1_2;
		local8.method225();
		@Pc(16) int local16 = local8.method216(8);
		@Pc(30) int local30;
		if (Static28.anInt1087 > local16) {
			for (local30 = local16; local30 < Static28.anInt1087; local30++) {
				Static485.anIntArray562[Static316.anInt5075++] = Static633.anIntArray705[local30];
			}
		}
		if (Static28.anInt1087 < local16) {
			throw new RuntimeException("gnpov1");
		}
		Static28.anInt1087 = 0;
		for (local30 = 0; local30 < local16; local30++) {
			@Pc(71) int local71 = Static633.anIntArray705[local30];
			@Pc(81) Class9_Sub1_Sub1_Sub2_Sub2 local81 = ((Class3_Sub52) Static94.aClass313_8.method7104((long) local71)).aClass9_Sub1_Sub1_Sub2_Sub2_2;
			@Pc(88) int local88 = local8.method216(1);
			if (local88 == 0) {
				Static633.anIntArray705[Static28.anInt1087++] = local71;
				local81.anInt8801 = Static216.anInt3560;
			} else {
				@Pc(113) int local113 = local8.method216(2);
				if (local113 == 0) {
					Static633.anIntArray705[Static28.anInt1087++] = local71;
					local81.anInt8801 = Static216.anInt3560;
					Static493.anIntArray574[Static412.anInt6361++] = local71;
				} else {
					@Pc(159) int local159;
					@Pc(171) int local171;
					if (local113 == 1) {
						Static633.anIntArray705[Static28.anInt1087++] = local71;
						local81.anInt8801 = Static216.anInt3560;
						local159 = local8.method216(3);
						local81.method7508(local159, 1);
						local171 = local8.method216(1);
						if (local171 == 1) {
							Static493.anIntArray574[Static412.anInt6361++] = local71;
						}
					} else if (local113 == 2) {
						Static633.anIntArray705[Static28.anInt1087++] = local71;
						local81.anInt8801 = Static216.anInt3560;
						if (local8.method216(1) == 1) {
							local159 = local8.method216(3);
							local81.method7508(local159, 2);
							local171 = local8.method216(3);
							local81.method7508(local171, 2);
						} else {
							local159 = local8.method216(3);
							local81.method7508(local159, 0);
						}
						local159 = local8.method216(1);
						if (local159 == 1) {
							Static493.anIntArray574[Static412.anInt6361++] = local71;
						}
					} else if (local113 == 3) {
						Static485.anIntArray562[Static316.anInt5075++] = local71;
					}
				}
			}
		}
	}
}
