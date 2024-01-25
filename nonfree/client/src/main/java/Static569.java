import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static569 {

	@OriginalMember(owner = "client!tg", name = "w", descriptor = "I")
	public static int anInt9543;

	@OriginalMember(owner = "client!tg", name = "p", descriptor = "[[I")
	public static int[][] anIntArrayArray54;

	@OriginalMember(owner = "client!tg", name = "t", descriptor = "I")
	public static int anInt9548;

	@OriginalMember(owner = "client!tg", name = "r", descriptor = "Lclient!to;")
	public static final Class333 aClass333_7 = new Class333("runescape", "RuneScape", 0);

	@OriginalMember(owner = "client!tg", name = "q", descriptor = "[F")
	public static final float[] aFloatArray104 = new float[16];

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lclient!ic;[IB[I[I)V")
	public static void method8191(@OriginalArg(0) Class8_Sub1_Sub3_Sub2_Sub1 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			@Pc(19) int local19 = arg1[local11];
			@Pc(23) int local23 = arg3[local11];
			@Pc(27) int local27 = arg2[local11];
			@Pc(29) int local29 = 0;
			while (local23 != 0 && local29 < arg0.aClass10Array3.length) {
				if ((local23 & 0x1) != 0) {
					if (local19 == -1) {
						arg0.aClass10Array3[local29] = null;
					} else {
						@Pc(57) Class165 local57 = Static158.aClass317_1.method7882(local19, 100);
						@Pc(60) int local60 = local57.anInt3919;
						@Pc(65) Class10 local65 = arg0.aClass10Array3[local29];
						if (local65 != null) {
							if (local19 == local65.anInt246) {
								if (local60 == 0) {
									local65 = arg0.aClass10Array3[local29] = null;
								} else if (local60 == 1) {
									local65.anInt243 = 1;
									local65.anInt244 = 0;
									local65.anInt242 = 0;
									local65.anInt245 = local27;
									local65.anInt240 = 0;
									if (!arg0.aBoolean540) {
										Static268.method4004(local57, arg0, 0);
									}
								} else if (local60 == 2) {
									local65.anInt242 = 0;
								}
							} else if (local57.anInt3910 >= Static158.aClass317_1.method7882(local65.anInt246, 100).anInt3910) {
								local65 = arg0.aClass10Array3[local29] = null;
							}
						}
						if (local65 == null) {
							local65 = arg0.aClass10Array3[local29] = new Class10();
							local65.anInt245 = local27;
							local65.anInt240 = 0;
							local65.anInt246 = local19;
							local65.anInt242 = 0;
							local65.anInt243 = 1;
							local65.anInt244 = 0;
							if (!arg0.aBoolean540) {
								Static268.method4004(local57, arg0, 0);
							}
						}
					}
				}
				local29++;
				local23 >>>= 0x1;
			}
		}
	}
}
