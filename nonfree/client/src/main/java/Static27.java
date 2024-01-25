import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!bn", name = "d", descriptor = "Lclient!jm;")
	public static Class107 aClass107_1;

	@OriginalMember(owner = "client!bn", name = "j", descriptor = "[I")
	public static int[] anIntArray40;

	@OriginalMember(owner = "client!bn", name = "n", descriptor = "Lclient!mo;")
	public static Class143 aClass143_17;

	@OriginalMember(owner = "client!bn", name = "w", descriptor = "Lclient!mo;")
	public static Class143 aClass143_18;

	@OriginalMember(owner = "client!bn", name = "e", descriptor = "I")
	public static int anInt614 = 0;

	@OriginalMember(owner = "client!bn", name = "g", descriptor = "[Lclient!kf;")
	public static final Class113[] aClass113Array1 = new Class113[8];

	@OriginalMember(owner = "client!bn", name = "l", descriptor = "Z")
	public static boolean aBoolean30 = true;

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IZI)Ljava/lang/String;")
	public static String method686(@OriginalArg(2) int arg0) {
		return arg0 < 0 ? Integer.toString(arg0) : Static144.method2888(arg0);
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lclient!tm;[I[I[IZ)V")
	public static void method688(@OriginalArg(0) Class10_Sub3_Sub3_Sub2 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg2.length; local3++) {
			@Pc(9) int local9 = arg2[local3];
			@Pc(13) int local13 = arg1[local3];
			@Pc(17) int local17 = arg3[local3];
			@Pc(19) int local19 = 0;
			while (local13 != 0 && arg0.aClass3Array3.length > local19) {
				if ((local13 & 0x1) != 0) {
					if (local9 == -1) {
						arg0.aClass3Array3[local19] = null;
					} else {
						@Pc(43) Class79 local43 = Static233.method4080(local9);
						@Pc(46) int local46 = local43.anInt2361;
						@Pc(51) Class3 local51 = arg0.aClass3Array3[local19];
						if (local51 != null) {
							if (local9 == local51.anInt103) {
								if (local46 == 0) {
									local51 = arg0.aClass3Array3[local19] = null;
								} else if (local46 == 1) {
									local51.anInt95 = local17;
									local51.anInt97 = 0;
									local51.anInt101 = 0;
									local51.anInt102 = 1;
									local51.anInt98 = 0;
									Static273.method4631(arg0.anInt5908, 0, arg0.anInt5910, Static173.aClass10_Sub3_Sub3_Sub2_1 == arg0, local43);
								} else if (local46 == 2) {
									local51.anInt101 = 0;
								}
							} else if (local43.anInt2357 >= Static233.method4080(local51.anInt103).anInt2357) {
								local51 = arg0.aClass3Array3[local19] = null;
							}
						}
						if (local51 == null) {
							local51 = arg0.aClass3Array3[local19] = new Class3();
							local51.anInt102 = 1;
							local51.anInt97 = 0;
							local51.anInt103 = local9;
							local51.anInt95 = local17;
							local51.anInt98 = 0;
							local51.anInt101 = 0;
							Static273.method4631(arg0.anInt5908, 0, arg0.anInt5910, Static173.aClass10_Sub3_Sub3_Sub2_1 == arg0, local43);
						}
					}
				}
				local19++;
				local13 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method689(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) Class14_Sub6 local7 = null;
		for (@Pc(12) Class14_Sub6 local12 = (Class14_Sub6) Static93.aClass18_8.method459(); local12 != null; local12 = (Class14_Sub6) Static93.aClass18_8.method453()) {
			if (arg2 == local12.anInt865 && arg3 == local12.anInt867 && local12.anInt874 == arg8 && arg4 == local12.anInt869) {
				local7 = local12;
				break;
			}
		}
		if (local7 == null) {
			local7 = new Class14_Sub6();
			local7.anInt869 = arg4;
			local7.anInt865 = arg2;
			local7.anInt867 = arg3;
			local7.anInt874 = arg8;
			Static215.method3867(local7);
			Static93.aClass18_8.method451(local7);
		}
		local7.anInt868 = arg7;
		local7.anInt873 = arg0;
		local7.anInt877 = arg1;
		local7.anInt878 = arg5;
		local7.anInt870 = arg6;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(I[IBII)V")
	public static void method690(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		arg3--;
		@Pc(10) int local10 = arg0 - 1;
		@Pc(14) int local14 = local10 - 7;
		while (local14 > arg3) {
			@Pc(17) int local17 = arg3 + 1;
			arg1[local17] = arg2;
			@Pc(22) int local22 = local17 + 1;
			arg1[local22] = arg2;
			@Pc(27) int local27 = local22 + 1;
			arg1[local27] = arg2;
			@Pc(32) int local32 = local27 + 1;
			arg1[local32] = arg2;
			@Pc(37) int local37 = local32 + 1;
			arg1[local37] = arg2;
			@Pc(42) int local42 = local37 + 1;
			arg1[local42] = arg2;
			@Pc(47) int local47 = local42 + 1;
			arg1[local47] = arg2;
			arg3 = local47 + 1;
			arg1[arg3] = arg2;
		}
		while (local10 > arg3) {
			arg3++;
			arg1[arg3] = arg2;
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lclient!mo;Lclient!uj;Lclient!mo;ILclient!mo;)Z")
	public static boolean method695(@OriginalArg(0) Class143 arg0, @OriginalArg(1) Class14_Sub19_Sub4 arg1, @OriginalArg(2) Class143 arg2, @OriginalArg(4) Class143 arg3) {
		Static134.aClass143_62 = arg3;
		Static223.aClass143_104 = arg2;
		Static130.aClass143_61 = arg0;
		Static143.aClass14_Sub19_Sub4_2 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IB)Lclient!ic;")
	public static Class14_Sub2_Sub8 method696(@OriginalArg(0) int arg0) {
		@Pc(15) Class14_Sub2_Sub8 local15 = (Class14_Sub2_Sub8) Static44.aClass178_3.method4772((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static9.aClass143_8.method3745(arg0, 0);
		if (local25 == null || local25.length <= 1) {
			return null;
		} else {
			local15 = Static16.method357(local25);
			Static44.aClass178_3.method4767(local15, (long) arg0);
			return local15;
		}
	}
}
