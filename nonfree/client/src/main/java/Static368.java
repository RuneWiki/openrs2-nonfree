import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static368 {

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "Lclient!kp;")
	public static Class196 aClass196_6;

	@OriginalMember(owner = "client!nr", name = "i", descriptor = "Lclient!pl;")
	public static Class259 aClass259_118;

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "Lclient!rga;")
	public static final Class286 aClass286_115 = new Class286(81, 2);

	@OriginalMember(owner = "client!nr", name = "d", descriptor = "[I")
	public static final int[] anIntArray450 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "([II[ILclient!qi;[I)V")
	public static void method5482(@OriginalArg(0) int[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class6_Sub1_Sub1_Sub1_Sub2 arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(15) int local15 = 0; local15 < arg0.length; local15++) {
			@Pc(21) int local21 = arg0[local15];
			@Pc(25) int local25 = arg1[local15];
			@Pc(29) int local29 = arg3[local15];
			for (@Pc(31) int local31 = 0; local25 != 0 && local31 < arg2.aClass19Array3.length; local31++) {
				if ((local25 & 0x1) != 0) {
					if (local21 == -1) {
						arg2.aClass19Array3[local31] = null;
					} else {
						@Pc(48) Class84 local48 = Static116.aClass140_2.method3287(local21);
						@Pc(51) int local51 = local48.anInt2056;
						@Pc(56) Class19 local56 = arg2.aClass19Array3[local31];
						if (local56 != null) {
							if (local56.anInt495 == local21) {
								if (local51 == 0) {
									local56 = arg2.aClass19Array3[local31] = null;
								} else if (local51 == 1) {
									local56.anInt496 = 0;
									local56.anInt494 = 0;
									local56.anInt498 = 1;
									local56.anInt493 = local29;
									local56.anInt497 = 0;
									Static434.method4018(arg2.aByte112, local48, arg2.anInt8761, arg2.anInt8764, 0, arg2 == Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2);
								} else if (local51 == 2) {
									local56.anInt497 = 0;
								}
							} else if (local48.anInt2065 >= Static116.aClass140_2.method3287(local56.anInt495).anInt2065) {
								local56 = arg2.aClass19Array3[local31] = null;
							}
						}
						if (local56 == null) {
							local56 = arg2.aClass19Array3[local31] = new Class19();
							local56.anInt493 = local29;
							local56.anInt497 = 0;
							local56.anInt495 = local21;
							local56.anInt498 = 1;
							local56.anInt496 = 0;
							local56.anInt494 = 0;
							Static434.method4018(arg2.aByte112, local48, arg2.anInt8761, arg2.anInt8764, 0, Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2 == arg2);
						}
					}
				}
				local25 >>>= 0x1;
			}
		}
	}
}
