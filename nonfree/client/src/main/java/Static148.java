import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "I")
	public static int anInt7258;

	@OriginalMember(owner = "client!hl", name = "i", descriptor = "[I")
	public static int[] anIntArray548;

	@OriginalMember(owner = "client!hl", name = "g", descriptor = "[I")
	public static int[] anIntArray547 = new int[2];

	@OriginalMember(owner = "client!hl", name = "h", descriptor = "Lclient!vp;")
	public static final Class254 aClass254_136 = new Class254(43, 3);

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lclient!ti;B)V")
	public static void method5603(@OriginalArg(0) Class1_Sub14 arg0) {
		@Pc(14) int local14 = arg0.method4521();
		Static153.aClass25Array2 = new Class25[local14];
		for (@Pc(19) int local19 = 0; local19 < local14; local19++) {
			Static153.aClass25Array2[local19] = new Class25();
			Static153.aClass25Array2[local19].anInt488 = arg0.method4521();
			Static153.aClass25Array2[local19].aString6 = arg0.method4492();
		}
		Static343.anInt6245 = arg0.method4521();
		Static231.anInt4052 = arg0.method4521();
		Static328.anInt5997 = arg0.method4521();
		Static57.aClass48_Sub1Array3 = new Class48_Sub1[Static231.anInt4052 + 1 - Static343.anInt6245];
		for (@Pc(66) int local66 = 0; local66 < Static328.anInt5997; local66++) {
			@Pc(72) int local72 = arg0.method4521();
			@Pc(80) Class48_Sub1 local80 = Static57.aClass48_Sub1Array3[local72] = new Class48_Sub1();
			local80.anInt1022 = arg0.method4548();
			local80.anInt1023 = arg0.method4500();
			local80.anInt1026 = Static343.anInt6245 + local72;
			local80.aString20 = arg0.method4492();
			local80.aString19 = arg0.method4492();
		}
		Static67.anInt1223 = arg0.method4500();
		Static444.aBoolean652 = true;
	}

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "(I)V")
	public static void method5607() {
		Static12.anIntArray15 = null;
		Static412.anIntArray545 = null;
		Static199.anIntArray292 = null;
		Static159.anIntArray218 = null;
		Static425.aBoolean635 = false;
		Static139.anIntArray201 = null;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(I[JB[II)V")
	public static void method5610(@OriginalArg(0) int arg0, @OriginalArg(1) long[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		if (arg0 <= arg3) {
			return;
		}
		@Pc(18) int local18 = (arg0 + arg3) / 2;
		@Pc(20) int local20 = arg3;
		@Pc(24) long local24 = arg1[local18];
		arg1[local18] = arg1[arg0];
		arg1[arg0] = local24;
		@Pc(38) int local38 = arg2[local18];
		arg2[local18] = arg2[arg0];
		arg2[arg0] = local38;
		@Pc(58) int local58 = ~local24 == Long.MIN_VALUE ? 0 : 1;
		for (@Pc(60) int local60 = arg3; local60 < arg0; local60++) {
			if ((long) (local58 & local60) + local24 > arg1[local60]) {
				@Pc(81) long local81 = arg1[local60];
				arg1[local60] = arg1[local20];
				arg1[local20] = local81;
				@Pc(95) int local95 = arg2[local60];
				arg2[local60] = arg2[local20];
				arg2[local20++] = local95;
			}
		}
		arg1[arg0] = arg1[local20];
		arg1[local20] = local24;
		arg2[arg0] = arg2[local20];
		arg2[local20] = local38;
		method5610(local20 - 1, arg1, arg2, arg3);
		method5610(arg0, arg1, arg2, local20 + 1);
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(Z)V")
	public static void method5612() {
		if (Static78.aBoolean125) {
			return;
		}
		Static128.method2030(Static346.aClass137ArrayArrayArray3);
		if (Static33.aClass137ArrayArrayArray1 != null) {
			Static128.method2030(Static33.aClass137ArrayArrayArray1);
		}
		Static78.aBoolean125 = true;
	}
}
