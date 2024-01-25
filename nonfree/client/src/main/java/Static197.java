import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static197 {

	@OriginalMember(owner = "client!js", name = "l", descriptor = "I")
	public static int anInt6471;

	@OriginalMember(owner = "client!js", name = "t", descriptor = "[I")
	public static int[] anIntArray566;

	@OriginalMember(owner = "client!js", name = "g", descriptor = "Lclient!cm;")
	public static final Class36 aClass36_117 = new Class36(75, 6);

	@OriginalMember(owner = "client!js", name = "m", descriptor = "Z")
	public static boolean aBoolean435 = false;

	@OriginalMember(owner = "client!js", name = "n", descriptor = "[I")
	public static final int[] anIntArray565 = new int[256];

	@OriginalMember(owner = "client!js", name = "q", descriptor = "Z")
	public static boolean aBoolean436 = false;

	@OriginalMember(owner = "client!js", name = "a", descriptor = "([IB[ILclient!rk;[I)V")
	public static void method5036(@OriginalArg(0) int[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class6_Sub2_Sub1_Sub2 arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg3.length; local7++) {
			@Pc(13) int local13 = arg3[local7];
			@Pc(17) int local17 = arg1[local7];
			@Pc(21) int local21 = arg0[local7];
			@Pc(23) int local23 = 0;
			while (local17 != 0 && arg2.aClass109Array3.length > local23) {
				if ((local17 & 0x1) != 0) {
					if (local13 == -1) {
						arg2.aClass109Array3[local23] = null;
					} else {
						@Pc(40) Class233 local40 = Static269.aClass10_1.method286(local13);
						@Pc(43) int local43 = local40.anInt6742;
						@Pc(48) Class109 local48 = arg2.aClass109Array3[local23];
						if (local48 != null) {
							if (local48.anInt2837 == local13) {
								if (local43 == 0) {
									local48 = arg2.aClass109Array3[local23] = null;
								} else if (local43 == 1) {
									local48.anInt2835 = 0;
									local48.anInt2834 = local21;
									local48.anInt2836 = 1;
									local48.anInt2833 = 0;
									local48.anInt2831 = 0;
									Static374.method5106(false, 0, arg2.aByte86, local40, arg2.anInt6062, arg2.anInt6061);
								} else if (local43 == 2) {
									local48.anInt2831 = 0;
								}
							} else if (local40.anInt6754 >= Static269.aClass10_1.method286(local48.anInt2837).anInt6754) {
								local48 = arg2.aClass109Array3[local23] = null;
							}
						}
						if (local48 == null) {
							local48 = arg2.aClass109Array3[local23] = new Class109();
							local48.anInt2831 = 0;
							local48.anInt2836 = 1;
							local48.anInt2837 = local13;
							local48.anInt2833 = 0;
							local48.anInt2835 = 0;
							local48.anInt2834 = local21;
							Static374.method5106(false, 0, arg2.aByte86, local40, arg2.anInt6062, arg2.anInt6061);
						}
					}
				}
				local23++;
				local17 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(IC)Z")
	public static boolean method5039(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(BI)V")
	public static void method5040(@OriginalArg(1) int arg0) {
		@Pc(16) Class4_Sub1_Sub8 local16 = Static416.method5456(arg0, 4);
		local16.method2761();
	}

	@OriginalMember(owner = "client!js", name = "b", descriptor = "(I)[Lclient!wi;")
	public static Class263[] method5044() {
		return new Class263[] { Static105.aClass263_15, Static50.aClass263_9, Static270.aClass263_40, Static48.aClass263_8, Static360.aClass263_48, Static132.aClass263_18, Static260.aClass263_57, Static46.aClass263_43, Static175.aClass263_27, Static266.aClass263_38, Static443.aClass263_55, Static169.aClass263_24, Static267.aClass263_39, Static313.aClass263_45 };
	}
}
