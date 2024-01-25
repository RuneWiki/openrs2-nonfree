import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!hb", name = "w", descriptor = "Lclient!fj;")
	public static Class82 aClass82_1;

	@OriginalMember(owner = "client!hb", name = "A", descriptor = "[I")
	public static final int[] anIntArray301 = new int[2048];

	@OriginalMember(owner = "client!hb", name = "B", descriptor = "[I")
	public static final int[] anIntArray302 = new int[1024];

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILclient!ug;B)Lclient!jc;")
	public static Class116 method1913(@OriginalArg(0) int arg0, @OriginalArg(1) Class25_Sub1 arg1) {
		@Pc(12) Class116 local12;
		if (Static153.aClass116_1 == null) {
			local12 = new Class116();
		} else {
			local12 = Static153.aClass116_1;
			Static153.aClass116_1 = Static153.aClass116_1.aClass116_2;
			local12.aClass116_2 = null;
			Static367.anInt5933--;
		}
		local12.anInt3023 = arg0;
		local12.aClass25_Sub1_1 = arg1;
		return local12;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "([ILclient!bg;[IZ[I)V")
	public static void method1914(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class25_Sub1_Sub1_Sub1 arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg3.length; local7++) {
			@Pc(15) int local15 = arg3[local7];
			@Pc(19) int local19 = arg0[local7];
			@Pc(23) int local23 = arg2[local7];
			for (@Pc(25) int local25 = 0; local19 != 0 && local25 < arg1.aClass103Array3.length; local25++) {
				if ((local19 & 0x1) != 0) {
					if (local15 == -1) {
						arg1.aClass103Array3[local25] = null;
					} else {
						@Pc(46) Class185 local46 = Static25.aClass67_1.method1227(local15);
						@Pc(49) int local49 = local46.anInt4802;
						@Pc(54) Class103 local54 = arg1.aClass103Array3[local25];
						if (local54 != null) {
							if (local15 == local54.anInt2713) {
								if (local49 == 0) {
									local54 = arg1.aClass103Array3[local25] = null;
								} else if (local49 == 1) {
									local54.anInt2706 = 1;
									local54.anInt2709 = 0;
									local54.anInt2714 = 0;
									local54.anInt2712 = 0;
									local54.anInt2710 = local23;
									Static4.method52(0, arg1.anInt6080, Static321.aClass25_Sub1_Sub1_Sub1_2 == arg1, arg1.aByte70, local46, arg1.anInt6077);
								} else if (local49 == 2) {
									local54.anInt2714 = 0;
								}
							} else if (local46.anInt4805 >= Static25.aClass67_1.method1227(local54.anInt2713).anInt4805) {
								local54 = arg1.aClass103Array3[local25] = null;
							}
						}
						if (local54 == null) {
							local54 = arg1.aClass103Array3[local25] = new Class103();
							local54.anInt2709 = 0;
							local54.anInt2710 = local23;
							local54.anInt2706 = 1;
							local54.anInt2713 = local15;
							local54.anInt2714 = 0;
							local54.anInt2712 = 0;
							Static4.method52(0, arg1.anInt6080, arg1 == Static321.aClass25_Sub1_Sub1_Sub1_2, arg1.aByte70, local46, arg1.anInt6077);
						}
					}
				}
				local19 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIIZZ)V")
	public static void method1920(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) boolean arg3, @OriginalArg(6) boolean arg4) {
		Static365.anInt5876 = 7;
		Static53.anInt1116 = 0x1 << Static365.anInt5876;
		Static276.anInt5131 = Static53.anInt1116 >> 1;
		Static76.anInt5659 = (int) Math.sqrt((double) (Static276.anInt5131 * Static276.anInt5131 + Static276.anInt5131 * Static276.anInt5131));
		Static19.anInt329 = arg0;
		Static230.anInt6113 = arg1;
		Static32.anInt647 = arg2;
		Static66.aClass132ArrayArrayArray2 = new Class132[4][Static19.anInt329][Static230.anInt6113];
		Static239.aClass42Array4 = new Class42[4];
		if (arg3) {
			Static113.anIntArrayArray30 = new int[Static19.anInt329][Static230.anInt6113];
			Static35.aByteArrayArray1 = new byte[Static19.anInt329][Static230.anInt6113];
			Static351.aByteArrayArray20 = new byte[Static19.anInt329][Static230.anInt6113];
			Static329.aClass132ArrayArrayArray4 = new Class132[1][Static19.anInt329][Static230.anInt6113];
			Static77.aClass42Array2 = new Class42[1];
		} else {
			Static113.anIntArrayArray30 = null;
			Static35.aByteArrayArray1 = null;
			Static351.aByteArrayArray20 = null;
			Static329.aClass132ArrayArrayArray4 = null;
			Static77.aClass42Array2 = null;
		}
		if (arg4) {
			Static295.aLongArrayArrayArray1 = new long[4][arg0][arg1];
			Static300.aClass1_Sub27_Sub1Array3 = new Class1_Sub27_Sub1[65535];
			Static43.aBooleanArray3 = new boolean[65535];
			Static164.anInt2967 = 0;
		} else {
			Static295.aLongArrayArrayArray1 = null;
			Static300.aClass1_Sub27_Sub1Array3 = null;
			Static43.aBooleanArray3 = null;
			Static164.anInt2967 = 0;
		}
		Static390.method5529(false);
		Static120.aClass5Array1 = new Class5[500];
		Static287.anInt4942 = 0;
		Static146.aClass5Array2 = new Class5[500];
		Static56.anInt1158 = 0;
		Static248.anIntArrayArrayArray12 = new int[4][Static19.anInt329 + 1][Static230.anInt6113 + 1];
		Static65.aClass25_Sub1Array2 = new Class25_Sub1[5000];
		Static143.anInt2670 = 0;
		Static54.aBooleanArrayArray1 = new boolean[Static32.anInt647 + Static32.anInt647 + 1][Static32.anInt647 + Static32.anInt647 + 1];
		Static63.aBooleanArrayArray5 = new boolean[Static32.anInt647 + Static32.anInt647 + 2][Static32.anInt647 + Static32.anInt647 + 2];
		Static273.aClass54_1 = null;
	}
}
