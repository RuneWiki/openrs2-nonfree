import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static408 {

	@OriginalMember(owner = "client!un", name = "a", descriptor = "Lclient!om;")
	public static Class1_Sub1_Sub2 aClass1_Sub1_Sub2_3 = new Class1_Sub1_Sub2(8192);

	@OriginalMember(owner = "client!un", name = "e", descriptor = "I")
	public static int anInt7059 = -1;

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method5508(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg2 >= Static83.anInt7380 && arg2 <= Static221.anInt4001 && arg0 >= Static83.anInt7380 && arg0 <= Static221.anInt4001 && Static83.anInt7380 <= arg5 && Static221.anInt4001 >= arg5 && arg4 >= Static83.anInt7380 && arg4 <= Static221.anInt4001 && arg7 >= Static305.anInt5429 && arg7 <= Static212.anInt452 && Static305.anInt5429 <= arg8 && arg8 <= Static212.anInt452 && Static305.anInt5429 <= arg3 && arg3 <= Static212.anInt452 && arg6 >= Static305.anInt5429 && arg6 <= Static212.anInt452) {
			Static195.method2964(arg8, arg7, arg3, arg4, arg0, arg1, arg5, arg2, arg6);
		} else {
			Static350.method4843(arg8, arg1, arg5, arg3, arg0, arg4, arg6, arg7, arg2);
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IIIIIZZ)V")
	public static void method5510(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) boolean arg3, @OriginalArg(6) boolean arg4) {
		Static139.anInt2355 = 7;
		Static337.anInt7424 = 0x1 << Static139.anInt2355;
		Static122.anInt2160 = Static337.anInt7424 >> 1;
		Static273.anInt4870 = (int) Math.sqrt((double) (Static122.anInt2160 * Static122.anInt2160 + Static122.anInt2160 * Static122.anInt2160));
		Static13.anInt328 = Static337.anInt7424 >> 2;
		Static238.anInt4271 = Static337.anInt7424;
		Static377.anInt6467 = arg0;
		Static378.anInt6480 = arg1;
		Static11.anInt315 = arg2;
		Static182.aClass211ArrayArrayArray6 = new Class211[4][Static377.anInt6467][Static378.anInt6480];
		Static328.aClass136Array3 = new Class136[4];
		if (arg3) {
			Static51.anIntArrayArray28 = new int[Static377.anInt6467][Static378.anInt6480];
			Static403.aByteArrayArray135 = new byte[Static377.anInt6467][Static378.anInt6480];
			Static242.aByteArrayArray83 = new byte[Static377.anInt6467][Static378.anInt6480];
			Static87.aClass211ArrayArrayArray1 = new Class211[1][Static377.anInt6467][Static378.anInt6480];
			Static160.aClass136Array2 = new Class136[1];
		} else {
			Static51.anIntArrayArray28 = null;
			Static403.aByteArrayArray135 = null;
			Static242.aByteArrayArray83 = null;
			Static87.aClass211ArrayArrayArray1 = null;
			Static160.aClass136Array2 = null;
		}
		if (arg4) {
			Static242.aLongArrayArrayArray1 = new long[4][arg0][arg1];
			Static110.aClass124Array2 = new Class124[65535];
			Static439.aBooleanArray29 = new boolean[65535];
			Static139.anInt2353 = 0;
		} else {
			Static242.aLongArrayArrayArray1 = null;
			Static110.aClass124Array2 = null;
			Static439.aBooleanArray29 = null;
			Static139.anInt2353 = 0;
		}
		Static126.method1875(false);
		Static179.aClass226Array1 = new Class226[1000];
		Static361.anInt6131 = 0;
		Static446.aClass226Array2 = new Class226[1000];
		Static172.anInt3166 = 0;
		Static223.anIntArrayArrayArray10 = new int[4][Static377.anInt6467 + 1][Static378.anInt6480 + 1];
		Static455.aClass26_Sub2Array5 = new Class26_Sub2[5000];
		Static22.anInt3913 = 0;
		Static250.aBooleanArrayArray3 = new boolean[Static11.anInt315 + Static11.anInt315 + 1][Static11.anInt315 + Static11.anInt315 + 1];
		Static420.aBooleanArrayArray6 = new boolean[Static11.anInt315 + Static11.anInt315 + 2][Static11.anInt315 + Static11.anInt315 + 2];
		Static66.aClass54_1 = null;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(Lclient!tf;[I[I[IB)V")
	public static void method5511(@OriginalArg(0) Class26_Sub2_Sub2_Sub1 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		for (@Pc(8) int local8 = 0; local8 < arg1.length; local8++) {
			@Pc(14) int local14 = arg1[local8];
			@Pc(18) int local18 = arg2[local8];
			@Pc(22) int local22 = arg3[local8];
			@Pc(24) int local24 = 0;
			while (local18 != 0 && local24 < arg0.aClass137Array3.length) {
				if ((local18 & 0x1) != 0) {
					if (local14 == -1) {
						arg0.aClass137Array3[local24] = null;
					} else {
						@Pc(47) Class191 local47 = Static191.aClass28_1.method567(local14);
						@Pc(50) int local50 = local47.anInt5751;
						@Pc(55) Class137 local55 = arg0.aClass137Array3[local24];
						if (local55 != null) {
							if (local55.anInt3849 == local14) {
								if (local50 == 0) {
									local55 = arg0.aClass137Array3[local24] = null;
								} else if (local50 == 1) {
									local55.anInt3856 = 1;
									local55.anInt3850 = local22;
									local55.anInt3855 = 0;
									local55.anInt3858 = 0;
									local55.anInt3854 = 0;
									Static228.method3411(arg0.anInt7065, arg0 == Static196.aClass26_Sub2_Sub2_Sub1_1, arg0.anInt7068, local47, 0, arg0.aByte95);
								} else if (local50 == 2) {
									local55.anInt3855 = 0;
								}
							} else if (local47.anInt5740 >= Static191.aClass28_1.method567(local55.anInt3849).anInt5740) {
								local55 = arg0.aClass137Array3[local24] = null;
							}
						}
						if (local55 == null) {
							local55 = arg0.aClass137Array3[local24] = new Class137();
							local55.anInt3850 = local22;
							local55.anInt3855 = 0;
							local55.anInt3849 = local14;
							local55.anInt3856 = 1;
							local55.anInt3854 = 0;
							local55.anInt3858 = 0;
							Static228.method3411(arg0.anInt7065, arg0 == Static196.aClass26_Sub2_Sub2_Sub1_1, arg0.anInt7068, local47, 0, arg0.aByte95);
						}
					}
				}
				local24++;
				local18 >>>= 0x1;
			}
		}
	}
}
