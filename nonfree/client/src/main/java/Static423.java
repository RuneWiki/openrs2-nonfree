import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static423 {

	@OriginalMember(owner = "client!ve", name = "E", descriptor = "Lclient!ub;")
	public static final Class240 aClass240_9 = new Class240("", 14);

	@OriginalMember(owner = "client!ve", name = "F", descriptor = "Lclient!hi;")
	public static final Class102 aClass102_207 = new Class102(30, 12);

	@OriginalMember(owner = "client!ve", name = "M", descriptor = "Lclient!hi;")
	public static final Class102 aClass102_208 = new Class102(11, 16);

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILclient!at;BI)V")
	public static void method5346(@OriginalArg(0) int arg0, @OriginalArg(1) Class16 arg1, @OriginalArg(3) int arg2) {
		Static447.anInt7168 = arg0;
		Static258.aClass16_12 = arg1;
		Static396.anInt7304 = arg2;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIIIBIIIIIIII)V")
	public static void method5347(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		if (Static345.aClass162Array3 == null) {
			return;
		}
		@Pc(8) Class3_Sub4_Sub1 local8 = null;
		@Pc(18) int local18;
		if (arg2 < 0) {
			local18 = -arg2 - 1;
			if (local18 == Static201.anInt3383) {
				local8 = Static60.aClass3_Sub4_Sub1_Sub2_1;
			} else {
				local8 = Static152.aClass3_Sub4_Sub1_Sub2Array1[local18];
			}
		} else {
			local18 = arg2 - 1;
			@Pc(40) Class2_Sub28 local40 = (Class2_Sub28) Static49.aClass72_11.method1659((long) local18);
			if (local40 != null) {
				local8 = local40.aClass3_Sub4_Sub1_Sub1_1;
			}
		}
		if (local8 == null) {
			return;
		}
		@Pc(53) Class192 local53 = Static50.aClass190_1.method4218(arg7);
		@Pc(64) int local64;
		@Pc(67) int local67;
		if (arg3 == 1 || arg3 == 3) {
			local64 = local53.anInt5321;
			local67 = local53.anInt5355;
		} else {
			local64 = local53.anInt5355;
			local67 = local53.anInt5321;
		}
		@Pc(82) int local82 = arg10 + (local67 >> 1);
		@Pc(91) int local91 = arg10 + (local67 + 1 >> 1);
		@Pc(97) int local97 = (local64 >> 1) + arg6;
		@Pc(105) int local105 = (local64 + 1 >> 1) + arg6;
		@Pc(109) Class162 local109 = Static345.aClass162Array3[arg12];
		@Pc(133) int local133 = local109.ua(local82, local97) + local109.ua(local91, local97) + local109.ua(local82, local105) + local109.ua(local91, local105) >> 2;
		@Pc(137) Class2_Sub41 local137 = new Class2_Sub41();
		local137.anInt6970 = arg0 + Static266.anInt4392;
		local137.anInt6958 = arg6;
		@Pc(162) int local162;
		if (arg8 < arg4) {
			local162 = arg4;
			arg4 = arg8;
			arg8 = local162;
		}
		local137.anInt6956 = Static266.anInt4392 + arg1;
		local137.anInt6963 = arg7;
		local137.anInt6960 = arg10;
		local137.anInt6972 = arg5;
		local137.anInt6964 = arg3;
		local137.anInt6957 = local8.aByte91;
		local137.anInt6969 = arg10 + arg8;
		if (arg11 > arg9) {
			local162 = arg11;
			arg11 = arg9;
			arg9 = local162;
		}
		local137.anInt6961 = arg10 + arg4;
		local137.anInt6962 = (local67 << 6) + (local137.anInt6960 << 7);
		local137.anInt6968 = arg9 + arg6;
		local137.anInt6959 = local133;
		local137.anInt6966 = arg11 + arg6;
		local137.anInt6973 = (local137.anInt6958 << 7) + (local64 << 6);
		Static148.aClass156_15.method3157(local137);
		local8.aClass2_Sub41_3 = local137;
	}
}
