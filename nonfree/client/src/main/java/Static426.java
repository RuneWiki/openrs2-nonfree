import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static426 {

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "Lclient!hi;")
	public static final Class102 aClass102_211 = new Class102(26, -1);

	@OriginalMember(owner = "client!vh", name = "d", descriptor = "[F")
	public static final float[] aFloatArray33 = new float[4];

	@OriginalMember(owner = "client!vh", name = "e", descriptor = "Lclient!hi;")
	public static final Class102 aClass102_212 = new Class102(56, -1);

	@OriginalMember(owner = "client!vh", name = "f", descriptor = "Z")
	public static boolean aBoolean501 = true;

	@OriginalMember(owner = "client!vh", name = "g", descriptor = "Lclient!hi;")
	public static final Class102 aClass102_213 = new Class102(33, -1);

	@OriginalMember(owner = "client!vh", name = "h", descriptor = "I")
	public static int anInt6923 = 104;

	@OriginalMember(owner = "client!vh", name = "i", descriptor = "[F")
	public static final float[] aFloatArray34 = new float[16];

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIZIFBII)[I")
	public static int[] method5366(@OriginalArg(4) float arg0) {
		@Pc(6) int[] local6 = new int[2048];
		@Pc(10) Class2_Sub2_Sub24 local10 = new Class2_Sub2_Sub24();
		local10.anInt4591 = 8;
		local10.aBoolean327 = true;
		local10.anInt4593 = (int) (arg0 * 4096.0F);
		local10.anInt4594 = 4;
		local10.anInt4600 = 35;
		local10.anInt4599 = 8;
		local10.method5475();
		Static427.method5592(2048, 1);
		local10.method3744(local6, 0);
		return local6;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "([I[I[IBLclient!pf;)V")
	public static void method5368(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) Class3_Sub4_Sub1_Sub2 arg3) {
		for (@Pc(15) int local15 = 0; local15 < arg0.length; local15++) {
			@Pc(21) int local21 = arg0[local15];
			@Pc(25) int local25 = arg2[local15];
			@Pc(29) int local29 = arg1[local15];
			@Pc(31) int local31 = 0;
			while (local25 != 0 && arg3.aClass194Array3.length > local31) {
				if ((local25 & 0x1) != 0) {
					if (local21 == -1) {
						arg3.aClass194Array3[local31] = null;
					} else {
						@Pc(52) Class128 local52 = Static334.aClass62_2.method1418(local21);
						@Pc(55) int local55 = local52.anInt3329;
						@Pc(60) Class194 local60 = arg3.aClass194Array3[local31];
						if (local60 != null) {
							if (local60.anInt5380 == local21) {
								if (local55 == 0) {
									local60 = arg3.aClass194Array3[local31] = null;
								} else if (local55 == 1) {
									local60.anInt5379 = local29;
									local60.anInt5384 = 0;
									local60.anInt5376 = 1;
									local60.anInt5382 = 0;
									local60.anInt5385 = 0;
									Static128.method1905(local52, arg3.anInt6835, arg3 == Static60.aClass3_Sub4_Sub1_Sub2_1, arg3.aByte91, arg3.anInt6833, 0);
								} else if (local55 == 2) {
									local60.anInt5385 = 0;
								}
							} else if (local52.anInt3326 >= Static334.aClass62_2.method1418(local60.anInt5380).anInt3326) {
								local60 = arg3.aClass194Array3[local31] = null;
							}
						}
						if (local60 == null) {
							local60 = arg3.aClass194Array3[local31] = new Class194();
							local60.anInt5379 = local29;
							local60.anInt5376 = 1;
							local60.anInt5380 = local21;
							local60.anInt5384 = 0;
							local60.anInt5385 = 0;
							local60.anInt5382 = 0;
							Static128.method1905(local52, arg3.anInt6835, Static60.aClass3_Sub4_Sub1_Sub2_1 == arg3, arg3.aByte91, arg3.anInt6833, 0);
						}
					}
				}
				local31++;
				local25 >>>= 0x1;
			}
		}
	}
}
