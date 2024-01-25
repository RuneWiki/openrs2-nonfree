import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static362 {

	@OriginalMember(owner = "client!sd", name = "F", descriptor = "Lclient!lt;")
	public static Class158 aClass158_80;

	@OriginalMember(owner = "client!sd", name = "j", descriptor = "I")
	public static int anInt6109 = 0;

	@OriginalMember(owner = "client!sd", name = "o", descriptor = "Lclient!oe;")
	public static final Class186 aClass186_112 = new Class186(76, -2);

	@OriginalMember(owner = "client!sd", name = "x", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray6 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

	@OriginalMember(owner = "client!sd", name = "A", descriptor = "[Lclient!ha;")
	public static final Class6_Sub15[] aClass6_Sub15Array1 = new Class6_Sub15[2048];

	@OriginalMember(owner = "client!sd", name = "D", descriptor = "[[I")
	public static final int[][] anIntArrayArray56 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZIIII)V")
	public static void method5121(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) Class6_Sub1_Sub12 local12 = Static449.method5975(arg3, 10);
		local12.method3043();
		local12.anInt3400 = arg0;
		local12.anInt3403 = arg1;
		local12.anInt3397 = arg2;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILclient!ha;)V")
	public static void method5126(@OriginalArg(1) Class6_Sub15 arg0) {
		@Pc(9) int local9 = arg0.method3090();
		Static232.aClass206Array1 = new Class206[local9];
		for (@Pc(14) int local14 = 0; local14 < local9; local14++) {
			Static232.aClass206Array1[local14] = new Class206();
			Static232.aClass206Array1[local14].anInt5319 = arg0.method3090();
			Static232.aClass206Array1[local14].aString45 = arg0.method3130();
		}
		Static201.anInt3536 = arg0.method3090();
		Static266.anInt4578 = arg0.method3090();
		Static200.anInt3522 = arg0.method3090();
		Static183.aClass184_Sub1Array3 = new Class184_Sub1[Static266.anInt4578 + 1 - Static201.anInt3536];
		for (@Pc(66) int local66 = 0; local66 < Static200.anInt3522; local66++) {
			@Pc(72) int local72 = arg0.method3090();
			@Pc(80) Class184_Sub1 local80 = Static183.aClass184_Sub1Array3[local72] = new Class184_Sub1();
			local80.anInt4766 = arg0.method3111();
			local80.anInt4769 = arg0.method3109();
			local80.anInt4776 = Static201.anInt3536 + local72;
			local80.aString41 = arg0.method3130();
			local80.aString40 = arg0.method3130();
		}
		Static16.anInt282 = arg0.method3109();
		Static301.aBoolean200 = true;
	}
}
