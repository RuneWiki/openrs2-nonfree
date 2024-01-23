import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "Lclient!g;")
	public static Class56 aClass56_13;

	@OriginalMember(owner = "client!jh", name = "g", descriptor = "Lclient!jk;")
	public static Class88 aClass88_1;

	@OriginalMember(owner = "client!jh", name = "f", descriptor = "I")
	public static int anInt3071 = 0;

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(III)Lclient!nk;")
	public static Class122 method2469(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub13 local7 = Static52.aClass2_Sub13ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class122 local14 = local7.aClass122_1;
			local7.aClass122_1 = null;
			return local14;
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IB)V")
	public static void method2470(@OriginalArg(0) int arg0) {
		Static54.anInt1326 = -1;
		Static54.anInt1326 = -1;
		Static67.anInt1659 = arg0;
		Static202.method2140();
	}

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "(IB)I")
	public static int method2471(@OriginalArg(0) int arg0) {
		if (Static253.aClass34_3 != null) {
			Static253.aClass34_3.method1077();
			Static253.aClass34_3 = null;
		}
		Static296.anInt5746++;
		if (Static296.anInt5746 > 4) {
			Static296.anInt5746 = 0;
			Static209.anInt4316 = 0;
			return arg0;
		}
		Static209.anInt4316 = 0;
		if (Static195.anInt6032 == Static276.anInt5458) {
			Static276.anInt5458 = Static284.anInt5624;
		} else {
			Static276.anInt5458 = Static195.anInt6032;
		}
		return -1;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(ILclient!oe;)V")
	public static void method2472(@OriginalArg(1) Class2_Sub16 arg0) {
		@Pc(9) int local9 = arg0.method2161();
		Static282.aClass71Array1 = new Class71[local9];
		@Pc(19) int local19;
		for (local19 = 0; local19 < local9; local19++) {
			Static282.aClass71Array1[local19] = new Class71();
			Static282.aClass71Array1[local19].anInt2455 = arg0.method2161();
			Static282.aClass71Array1[local19].aString88 = arg0.method2160();
		}
		Static5.anInt4794 = arg0.method2161();
		Static13.anInt260 = arg0.method2161();
		Static39.anInt981 = arg0.method2161();
		Static279.aClass58_Sub1Array2 = new Class58_Sub1[Static13.anInt260 + 1 - Static5.anInt4794];
		for (local19 = 0; local19 < Static39.anInt981; local19++) {
			@Pc(78) int local78 = arg0.method2161();
			@Pc(86) Class58_Sub1 local86 = Static279.aClass58_Sub1Array2[local78] = new Class58_Sub1();
			local86.anInt2149 = arg0.method2146();
			local86.anInt2159 = arg0.method2145();
			local86.anInt2165 = Static5.anInt4794 + local78;
			local86.aString79 = arg0.method2160();
			local86.aString78 = arg0.method2160();
		}
		Static187.anInt3993 = arg0.method2145();
		Static218.aBoolean299 = true;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2474(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		Static80.method1475(arg6, arg1, arg4, arg3, arg0, 0, arg5, arg2);
	}
}
