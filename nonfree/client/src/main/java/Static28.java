import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "Lclient!la;")
	public static Class64 aClass64_1;

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "Lclient!dg;")
	public static final Class70 aClass70_6 = new Class70(53, 0);

	@OriginalMember(owner = "client!ba", name = "h", descriptor = "[I")
	public static final int[] anIntArray44 = new int[] { 1, 4 };

	@OriginalMember(owner = "client!ba", name = "i", descriptor = "J")
	public static long aLong21 = -1L;

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Z)V")
	public static void method319() {
		Static201.aClass222_24.method4422();
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "([IILclient!paa;[I[I)V")
	public static void method320(@OriginalArg(0) int[] arg0, @OriginalArg(2) Class8_Sub3_Sub3_Sub1_Sub2 arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg2.length; local7++) {
			@Pc(13) int local13 = arg2[local7];
			@Pc(17) int local17 = arg0[local7];
			@Pc(21) int local21 = arg3[local7];
			@Pc(23) int local23 = 0;
			while (local17 != 0 && local23 < arg1.aClass255Array3.length) {
				if ((local17 & 0x1) != 0) {
					if (local13 == -1) {
						arg1.aClass255Array3[local23] = null;
					} else {
						@Pc(47) Class290 local47 = Static192.aClass211_1.method4277(local13);
						@Pc(50) int local50 = local47.anInt7801;
						@Pc(55) Class255 local55 = arg1.aClass255Array3[local23];
						if (local55 != null) {
							if (local55.anInt6889 == local13) {
								if (local50 == 0) {
									local55 = arg1.aClass255Array3[local23] = null;
								} else if (local50 == 1) {
									local55.anInt6888 = 0;
									local55.anInt6893 = 0;
									local55.anInt6887 = local21;
									local55.anInt6897 = 1;
									local55.anInt6896 = 0;
									Static137.method2090(local47, arg1.anInt9365, 0, false, arg1.anInt9370, arg1.aByte123);
								} else if (local50 == 2) {
									local55.anInt6896 = 0;
								}
							} else if (local47.anInt7802 >= Static192.aClass211_1.method4277(local55.anInt6889).anInt7802) {
								local55 = arg1.aClass255Array3[local23] = null;
							}
						}
						if (local55 == null) {
							local55 = arg1.aClass255Array3[local23] = new Class255();
							local55.anInt6889 = local13;
							local55.anInt6893 = 0;
							local55.anInt6896 = 0;
							local55.anInt6888 = 0;
							local55.anInt6887 = local21;
							local55.anInt6897 = 1;
							Static137.method2090(local47, arg1.anInt9365, 0, false, arg1.anInt9370, arg1.aByte123);
						}
					}
				}
				local23++;
				local17 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lclient!lca;B)I")
	public static int method321(@OriginalArg(0) Class203 arg0) {
		if (Static288.aClass203_11 == arg0) {
			return 6407;
		} else if (Static129.aClass203_5 == arg0) {
			return 6408;
		} else if (Static194.aClass203_8 == arg0) {
			return 6406;
		} else if (Static565.aClass203_17 == arg0) {
			return 6409;
		} else if (Static194.aClass203_7 == arg0) {
			return 6410;
		} else if (arg0 == Static457.aClass203_16) {
			return 6145;
		} else {
			throw new IllegalStateException();
		}
	}
}
