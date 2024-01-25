import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static514 {

	@OriginalMember(owner = "client!uh", name = "C", descriptor = "Lclient!cb;")
	public static final Class40 aClass40_181 = new Class40(94, 17);

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lclient!ud;[I[I[II)V")
	public static void method7077(@OriginalArg(0) Class29_Sub2_Sub1_Sub2 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			@Pc(13) int local13 = arg1[local7];
			@Pc(17) int local17 = arg3[local7];
			@Pc(21) int local21 = arg2[local7];
			for (@Pc(23) int local23 = 0; local17 != 0 && arg0.aClass325Array3.length > local23; local23++) {
				if ((local17 & 0x1) != 0) {
					if (local13 == -1) {
						arg0.aClass325Array3[local23] = null;
					} else {
						@Pc(45) Class108 local45 = Static31.aClass345_1.method7798(local13);
						@Pc(48) int local48 = local45.anInt2591;
						@Pc(53) Class325 local53 = arg0.aClass325Array3[local23];
						if (local53 != null) {
							if (local53.anInt9008 == local13) {
								if (local48 == 0) {
									local53 = arg0.aClass325Array3[local23] = null;
								} else if (local48 == 1) {
									local53.anInt9002 = 0;
									local53.anInt9006 = 0;
									local53.anInt9009 = local21;
									local53.anInt9005 = 1;
									local53.anInt9007 = 0;
									Static294.method4111(0, arg0.anInt9218, Static426.aClass29_Sub2_Sub1_Sub2_2 == arg0, arg0.anInt9222, local45, arg0.aByte103);
								} else if (local48 == 2) {
									local53.anInt9007 = 0;
								}
							} else if (local45.anInt2604 >= Static31.aClass345_1.method7798(local53.anInt9008).anInt2604) {
								local53 = arg0.aClass325Array3[local23] = null;
							}
						}
						if (local53 == null) {
							local53 = arg0.aClass325Array3[local23] = new Class325();
							local53.anInt9007 = 0;
							local53.anInt9002 = 0;
							local53.anInt9006 = 0;
							local53.anInt9009 = local21;
							local53.anInt9008 = local13;
							local53.anInt9005 = 1;
							Static294.method4111(0, arg0.anInt9218, arg0 == Static426.aClass29_Sub2_Sub1_Sub2_2, arg0.anInt9222, local45, arg0.aByte103);
						}
					}
				}
				local17 >>>= 0x1;
			}
		}
	}
}
