import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!be", name = "R", descriptor = "[I")
	public static int[] anIntArray26;

	@OriginalMember(owner = "client!be", name = "L", descriptor = "Lclient!lt;")
	public static final Class151 aClass151_18 = new Class151(" is already on your ignore list.", " steht bereits auf deiner Ignorieren-Liste!", " est déjà dans votre liste noire.", " já está na sua lista de ignorados.");

	@OriginalMember(owner = "client!be", name = "N", descriptor = "I")
	public static int anInt495 = -1;

	@OriginalMember(owner = "client!be", name = "P", descriptor = "Lclient!ng;")
	public static final Class167 aClass167_7 = new Class167(4);

	@OriginalMember(owner = "client!be", name = "Q", descriptor = "Lclient!ri;")
	public static final Class214 aClass214_18 = new Class214(34, 6);

	@OriginalMember(owner = "client!be", name = "e", descriptor = "(I)V")
	public static void method430() {
		@Pc(9) int[] local9 = new int[Static227.aClass65_2.anInt1635];
		@Pc(11) int local11 = 0;
		for (@Pc(13) int local13 = 0; local13 < Static227.aClass65_2.anInt1635; local13++) {
			@Pc(20) Class74 local20 = Static227.aClass65_2.method1327(local13);
			if (local20.anInt1887 >= 0 || local20.anInt1853 >= 0) {
				local9[local11++] = local13;
			}
		}
		Static346.anIntArray340 = new int[local11];
		for (@Pc(53) int local53 = 0; local53 < local11; local53++) {
			Static346.anIntArray340[local53] = local9[local53];
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IIB)V")
	public static void method431(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static220.anInt3559 == 1) {
			Static74.method1179(Static261.aClass1_Sub45_2, arg1, arg0);
		} else if (Static220.anInt3559 == 2) {
			Static296.method3888(arg0, arg1);
		}
		Static220.anInt3559 = 0;
		Static261.aClass1_Sub45_2 = null;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!se;[I[II[I)V")
	public static void method433(@OriginalArg(0) Class20_Sub3_Sub3_Sub2 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(8) int local8 = 0; local8 < arg2.length; local8++) {
			@Pc(14) int local14 = arg2[local8];
			@Pc(18) int local18 = arg3[local8];
			@Pc(22) int local22 = arg1[local8];
			for (@Pc(24) int local24 = 0; local18 != 0 && local24 < arg0.aClass99Array3.length; local24++) {
				if ((local18 & 0x1) != 0) {
					if (local14 == -1) {
						arg0.aClass99Array3[local24] = null;
					} else {
						@Pc(39) Class171 local39 = Static152.aClass213_1.method4410(local14);
						@Pc(42) int local42 = local39.anInt4256;
						@Pc(47) Class99 local47 = arg0.aClass99Array3[local24];
						if (local47 != null) {
							if (local47.anInt2438 == local14) {
								if (local42 == 0) {
									local47 = arg0.aClass99Array3[local24] = null;
								} else if (local42 == 1) {
									local47.anInt2447 = 0;
									local47.anInt2446 = 0;
									local47.anInt2444 = local22;
									local47.anInt2441 = 1;
									local47.anInt2443 = 0;
									Static7.method4909(arg0.anInt6616, arg0.anInt6613, arg0.aByte89, false, local39, 0);
								} else if (local42 == 2) {
									local47.anInt2443 = 0;
								}
							} else if (local39.anInt4262 >= Static152.aClass213_1.method4410(local47.anInt2438).anInt4262) {
								local47 = arg0.aClass99Array3[local24] = null;
							}
						}
						if (local47 == null) {
							local47 = arg0.aClass99Array3[local24] = new Class99();
							local47.anInt2446 = 0;
							local47.anInt2438 = local14;
							local47.anInt2443 = 0;
							local47.anInt2444 = local22;
							local47.anInt2441 = 1;
							local47.anInt2447 = 0;
							Static7.method4909(arg0.anInt6616, arg0.anInt6613, arg0.aByte89, false, local39, 0);
						}
					}
				}
				local18 >>>= 0x1;
			}
		}
	}
}
