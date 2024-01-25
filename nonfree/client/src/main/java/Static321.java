import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static321 {

	@OriginalMember(owner = "client!uf", name = "j", descriptor = "Lclient!vq;")
	public static final Class217 aClass217_192 = new Class217(8, 2);

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "([I[I[ILclient!we;I)V")
	public static void method5504(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) Class11_Sub2_Sub6_Sub2 arg3) {
		for (@Pc(11) int local11 = 0; local11 < arg2.length; local11++) {
			@Pc(17) int local17 = arg2[local11];
			@Pc(21) int local21 = arg1[local11];
			@Pc(25) int local25 = arg0[local11];
			for (@Pc(27) int local27 = 0; local21 != 0 && local27 < arg3.aClass163Array3.length; local27++) {
				if ((local21 & 0x1) != 0) {
					if (local17 == -1) {
						arg3.aClass163Array3[local27] = null;
					} else {
						@Pc(48) Class199 local48 = Static161.method3066(local17);
						@Pc(51) int local51 = local48.anInt6015;
						@Pc(56) Class163 local56 = arg3.aClass163Array3[local27];
						if (local56 != null) {
							if (local17 == local56.anInt5050) {
								if (local51 == 0) {
									local56 = arg3.aClass163Array3[local27] = null;
								} else if (local51 == 1) {
									local56.anInt5055 = 0;
									local56.anInt5053 = 0;
									local56.anInt5051 = local25;
									local56.anInt5052 = 1;
									local56.anInt5048 = 0;
									Static96.method2060(local48, false, arg3.aByte79, 0, arg3.anInt6729, arg3.anInt6726);
								} else if (local51 == 2) {
									local56.anInt5048 = 0;
								}
							} else if (local48.anInt6020 >= Static161.method3066(local56.anInt5050).anInt6020) {
								local56 = arg3.aClass163Array3[local27] = null;
							}
						}
						if (local56 == null) {
							local56 = arg3.aClass163Array3[local27] = new Class163();
							local56.anInt5055 = 0;
							local56.anInt5052 = 1;
							local56.anInt5050 = local17;
							local56.anInt5051 = local25;
							local56.anInt5053 = 0;
							local56.anInt5048 = 0;
							Static96.method2060(local48, false, arg3.aByte79, 0, arg3.anInt6729, arg3.anInt6726);
						}
					}
				}
				local21 >>>= 0x1;
			}
		}
	}
}
