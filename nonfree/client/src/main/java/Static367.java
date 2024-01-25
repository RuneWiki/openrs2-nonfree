import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static367 {

	@OriginalMember(owner = "client!mda", name = "g", descriptor = "I")
	public static int anInt6940;

	@OriginalMember(owner = "client!mda", name = "h", descriptor = "[I")
	public static int[] anIntArray329;

	@OriginalMember(owner = "client!mda", name = "i", descriptor = "[I")
	public static final int[] anIntArray330 = new int[32];

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(IIZ)V")
	public static void method6213(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(18) Class2_Sub1_Sub5 local18 = Static653.method9595(5, (long) arg1);
		local18.method2486();
		local18.anInt2680 = arg0;
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(IIBI)I")
	public static int method6216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg2 & 0x3;
		if (local7 == 0) {
			return arg1;
		} else if (local7 == 1) {
			return 4095 - arg0;
		} else if (local7 == 2) {
			return 4095 - arg1;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(Lclient!ea;[I[I[IB)V")
	public static void method6218(@OriginalArg(0) Class15_Sub3_Sub3_Sub1_Sub1 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg2.length; local3++) {
			@Pc(11) int local11 = arg2[local3];
			@Pc(15) int local15 = arg3[local3];
			@Pc(19) int local19 = arg1[local3];
			@Pc(21) int local21 = 0;
			while (local15 != 0 && local21 < arg0.aClass171Array3.length) {
				if ((local15 & 0x1) != 0) {
					if (local11 == -1) {
						arg0.aClass171Array3[local21] = null;
					} else {
						@Pc(42) Class178 local42 = Static354.aClass40_2.method1123(local11);
						@Pc(45) int local45 = local42.anInt5129;
						@Pc(50) Class171 local50 = arg0.aClass171Array3[local21];
						if (local50 != null) {
							if (local11 == local50.anInt5007) {
								if (local45 == 0) {
									local50 = arg0.aClass171Array3[local21] = null;
								} else if (local45 == 1) {
									local50.anInt5009 = local19;
									local50.anInt5010 = 1;
									local50.anInt5006 = 0;
									local50.anInt5003 = 0;
									local50.anInt5005 = 0;
									if (!arg0.aBoolean315) {
										Static509.method7938(local42, arg0, 0);
									}
								} else if (local45 == 2) {
									local50.anInt5006 = 0;
								}
							} else if (local42.anInt5138 >= Static354.aClass40_2.method1123(local50.anInt5007).anInt5138) {
								local50 = arg0.aClass171Array3[local21] = null;
							}
						}
						if (local50 == null) {
							local50 = arg0.aClass171Array3[local21] = new Class171();
							local50.anInt5007 = local11;
							local50.anInt5010 = 1;
							local50.anInt5003 = 0;
							local50.anInt5005 = 0;
							local50.anInt5006 = 0;
							local50.anInt5009 = local19;
							if (!arg0.aBoolean315) {
								Static509.method7938(local42, arg0, 0);
							}
						}
					}
				}
				local21++;
				local15 >>>= 0x1;
			}
		}
	}
}
