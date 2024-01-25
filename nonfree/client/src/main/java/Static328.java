import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static328 {

	@OriginalMember(owner = "client!nda", name = "G", descriptor = "[F")
	public static final float[] aFloatArray37 = new float[16];

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "([I[I[IILclient!dw;)V")
	public static void method5055(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) Class29_Sub2_Sub1_Sub1 arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			@Pc(13) int local13 = arg1[local7];
			@Pc(17) int local17 = arg2[local7];
			@Pc(21) int local21 = arg0[local7];
			@Pc(23) int local23 = 0;
			while (local17 != 0 && local23 < arg3.aClass325Array3.length) {
				if ((local17 & 0x1) != 0) {
					if (local13 == -1) {
						arg3.aClass325Array3[local23] = null;
					} else {
						@Pc(40) Class108 local40 = Static31.aClass345_1.method7798(local13);
						@Pc(43) int local43 = local40.anInt2591;
						@Pc(48) Class325 local48 = arg3.aClass325Array3[local23];
						if (local48 != null) {
							if (local48.anInt9008 == local13) {
								if (local43 == 0) {
									local48 = arg3.aClass325Array3[local23] = null;
								} else if (local43 == 1) {
									local48.anInt9006 = 0;
									local48.anInt9002 = 0;
									local48.anInt9009 = local21;
									local48.anInt9007 = 0;
									local48.anInt9005 = 1;
									Static294.method4111(0, arg3.anInt9218, false, arg3.anInt9222, local40, arg3.aByte103);
								} else if (local43 == 2) {
									local48.anInt9007 = 0;
								}
							} else if (local40.anInt2604 >= Static31.aClass345_1.method7798(local48.anInt9008).anInt2604) {
								local48 = arg3.aClass325Array3[local23] = null;
							}
						}
						if (local48 == null) {
							local48 = arg3.aClass325Array3[local23] = new Class325();
							local48.anInt9005 = 1;
							local48.anInt9008 = local13;
							local48.anInt9006 = 0;
							local48.anInt9002 = 0;
							local48.anInt9007 = 0;
							local48.anInt9009 = local21;
							Static294.method4111(0, arg3.anInt9218, false, arg3.anInt9222, local40, arg3.aByte103);
						}
					}
				}
				local23++;
				local17 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(Lclient!dga;I)V")
	public static void method5057(@OriginalArg(0) Class6_Sub14 arg0) {
		for (@Pc(3) int local3 = 0; local3 < Static274.anInt3317; local3++) {
			@Pc(9) int local9 = arg0.method5998();
			@Pc(13) int local13 = arg0.method6006();
			if (local13 == 65535) {
				local13 = -1;
			}
			if (Static303.aClass8_Sub1Array1[local9] != null) {
				Static303.aClass8_Sub1Array1[local9].anInt2011 = local13;
			}
		}
	}
}
