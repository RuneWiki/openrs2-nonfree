import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static600 {

	@OriginalMember(owner = "client!ve", name = "n", descriptor = "I")
	public static int anInt10018;

	@OriginalMember(owner = "client!ve", name = "i", descriptor = "Lclient!pd;")
	public static final Class250 aClass250_16 = new Class250(3);

	@OriginalMember(owner = "client!ve", name = "l", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_177 = new Class268(55, -2);

	@OriginalMember(owner = "client!ve", name = "m", descriptor = "I")
	public static int anInt10017 = 0;

	@OriginalMember(owner = "client!ve", name = "o", descriptor = "I")
	public static int anInt10019 = 0;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(II)V")
	public static void method8446(@OriginalArg(0) int arg0) {
		@Pc(23) Class6_Sub2_Sub9 local23 = Static144.method2332(1, arg0);
		local23.method3722();
	}

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "(II)I")
	public static int method8449(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 >>> 1;
		@Pc(13) int local13 = local7 | local7 >>> 1;
		@Pc(19) int local19 = local13 | local13 >>> 2;
		@Pc(25) int local25 = local19 | local19 >>> 4;
		@Pc(31) int local31 = local25 | local25 >>> 8;
		@Pc(45) int local45 = local31 | local31 >>> 16;
		return ~local45 & arg0;
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)V")
	public static void method8452() {
		Static348.aClass6_Sub22_19.method3534(1, Static348.aClass6_Sub22_19.aClass15_Sub28_1);
		Static348.aClass6_Sub22_19.method3534(1, Static348.aClass6_Sub22_19.aClass15_Sub28_2);
		Static348.aClass6_Sub22_19.method3534(2, Static348.aClass6_Sub22_19.aClass15_Sub10_1);
		Static348.aClass6_Sub22_19.method3534(2, Static348.aClass6_Sub22_19.aClass15_Sub10_2);
		Static348.aClass6_Sub22_19.method3534(1, Static348.aClass6_Sub22_19.aClass15_Sub2_1);
		Static348.aClass6_Sub22_19.method3534(1, Static348.aClass6_Sub22_19.aClass15_Sub14_1);
		Static348.aClass6_Sub22_19.method3534(1, Static348.aClass6_Sub22_19.aClass15_Sub21_1);
		Static348.aClass6_Sub22_19.method3534(1, Static348.aClass6_Sub22_19.aClass15_Sub5_1);
		Static348.aClass6_Sub22_19.method3534(1, Static348.aClass6_Sub22_19.aClass15_Sub8_1);
		Static348.aClass6_Sub22_19.method3534(1, Static348.aClass6_Sub22_19.aClass15_Sub27_1);
		Static348.aClass6_Sub22_19.method3534(1, Static348.aClass6_Sub22_19.aClass15_Sub26_1);
		Static348.aClass6_Sub22_19.method3534(1, Static348.aClass6_Sub22_19.aClass15_Sub1_1);
		Static348.aClass6_Sub22_19.method3534(0, Static348.aClass6_Sub22_19.aClass15_Sub6_1);
		Static348.aClass6_Sub22_19.method3534(1, Static348.aClass6_Sub22_19.aClass15_Sub23_1);
		Static348.aClass6_Sub22_19.method3534(0, Static348.aClass6_Sub22_19.aClass15_Sub11_2);
		Static348.aClass6_Sub22_19.method3534(0, Static348.aClass6_Sub22_19.aClass15_Sub11_1);
		Static348.aClass6_Sub22_19.method3534(1, Static348.aClass6_Sub22_19.aClass15_Sub19_1);
		Static348.aClass6_Sub22_19.method3534(0, Static348.aClass6_Sub22_19.aClass15_Sub24_1);
		Static348.aClass6_Sub22_19.method3534(0, Static348.aClass6_Sub22_19.aClass15_Sub25_1);
		Static34.method4607();
		Static348.aClass6_Sub22_19.method3534(1, Static348.aClass6_Sub22_19.aClass15_Sub16_1);
		Static348.aClass6_Sub22_19.method3534(3, Static348.aClass6_Sub22_19.aClass15_Sub13_1);
		Static499.method7443();
		Static245.method5548();
		Static585.aBoolean670 = true;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILclient!k;ILclient!ha;IIIIIIII)V")
	public static void method8453(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub2_Sub12 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class100 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (arg4 > arg2 && arg0 + arg2 > arg4 && arg7 > arg8 - 13 && arg7 < arg8 + 3) {
			arg9 = arg10;
		}
		@Pc(35) String local35 = Static368.method5828(arg1);
		Static173.aClass50_5.method5749(arg2 + 3, arg9, arg8, local35, Static428.aClass32Array16, Static535.anIntArray567);
	}
}
