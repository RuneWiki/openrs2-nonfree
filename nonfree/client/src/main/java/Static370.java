import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static370 {

	@OriginalMember(owner = "client!st", name = "b", descriptor = "I")
	public static int anInt6532;

	@OriginalMember(owner = "client!st", name = "g", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray14;

	@OriginalMember(owner = "client!st", name = "h", descriptor = "F")
	public static float aFloat192;

	@OriginalMember(owner = "client!st", name = "e", descriptor = "Lclient!cm;")
	public static final Class36 aClass36_119 = new Class36(7, 8);

	@OriginalMember(owner = "client!st", name = "f", descriptor = "[I")
	public static final int[] anIntArray573 = new int[3];

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(I[I[ILclient!bp;[I)V")
	public static void method5085(@OriginalArg(1) int[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class6_Sub2_Sub1_Sub1 arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			@Pc(22) int local22 = arg1[local7];
			@Pc(26) int local26 = arg3[local7];
			@Pc(30) int local30 = arg0[local7];
			@Pc(32) int local32 = 0;
			while (local26 != 0 && local32 < arg2.aClass109Array3.length) {
				if ((local26 & 0x1) != 0) {
					if (local22 == -1) {
						arg2.aClass109Array3[local32] = null;
					} else {
						@Pc(57) Class233 local57 = Static269.aClass10_1.method286(local22);
						@Pc(60) int local60 = local57.anInt6742;
						@Pc(65) Class109 local65 = arg2.aClass109Array3[local32];
						if (local65 != null) {
							if (local65.anInt2837 == local22) {
								if (local60 == 0) {
									local65 = arg2.aClass109Array3[local32] = null;
								} else if (local60 == 1) {
									local65.anInt2831 = 0;
									local65.anInt2834 = local30;
									local65.anInt2835 = 0;
									local65.anInt2833 = 0;
									local65.anInt2836 = 1;
									Static374.method5106(Static375.aClass6_Sub2_Sub1_Sub1_3 == arg2, 0, arg2.aByte86, local57, arg2.anInt6062, arg2.anInt6061);
								} else if (local60 == 2) {
									local65.anInt2831 = 0;
								}
							} else if (local57.anInt6754 >= Static269.aClass10_1.method286(local65.anInt2837).anInt6754) {
								local65 = arg2.aClass109Array3[local32] = null;
							}
						}
						if (local65 == null) {
							local65 = arg2.aClass109Array3[local32] = new Class109();
							local65.anInt2833 = 0;
							local65.anInt2831 = 0;
							local65.anInt2837 = local22;
							local65.anInt2835 = 0;
							local65.anInt2834 = local30;
							local65.anInt2836 = 1;
							Static374.method5106(arg2 == Static375.aClass6_Sub2_Sub1_Sub1_3, 0, arg2.aByte86, local57, arg2.anInt6062, arg2.anInt6061);
						}
					}
				}
				local32++;
				local26 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(Ljava/lang/Object;IZI)[B")
	public static byte[] method5087(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(18) byte[] local18 = (byte[]) arg0;
			return Static19.method437(arg1, local18);
		} else if (arg0 instanceof Class122) {
			@Pc(30) Class122 local30 = (Class122) arg0;
			return local30.method2590(arg1);
		} else {
			throw new IllegalArgumentException();
		}
	}
}
