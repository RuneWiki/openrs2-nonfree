import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!ji", name = "d", descriptor = "[Lclient!uj;")
	public static Class165[] aClass165Array3;

	@OriginalMember(owner = "client!ji", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString115 = "Loaded sprites";

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "([IIIBI)V")
	public static void method1523(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		arg3--;
		@Pc(11) int local11 = arg1 - 1;
		@Pc(15) int local15 = local11 - 7;
		while (arg3 < local15) {
			@Pc(24) int local24 = arg3 + 1;
			arg0[local24] = arg2;
			@Pc(29) int local29 = local24 + 1;
			arg0[local29] = arg2;
			@Pc(34) int local34 = local29 + 1;
			arg0[local34] = arg2;
			@Pc(39) int local39 = local34 + 1;
			arg0[local39] = arg2;
			@Pc(44) int local44 = local39 + 1;
			arg0[local44] = arg2;
			@Pc(49) int local49 = local44 + 1;
			arg0[local49] = arg2;
			@Pc(54) int local54 = local49 + 1;
			arg0[local54] = arg2;
			arg3 = local54 + 1;
			arg0[arg3] = arg2;
		}
		while (local11 > arg3) {
			arg3++;
			arg0[arg3] = arg2;
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(B)Lclient!bc;")
	public static Class12 method1524() {
		@Pc(23) Class12 local23;
		if (Static277.aBoolean412) {
			local23 = new Class12_Sub1(Static60.anInt1268, Static267.anInt5199, Static268.anIntArray461[0], Static289.anIntArray543[0], Static31.anIntArray78[0], Static44.anIntArray97[0], Static268.aByteArrayArray13[0], Static133.anIntArray266);
		} else {
			local23 = new Class12_Sub2(Static60.anInt1268, Static267.anInt5199, Static268.anIntArray461[0], Static289.anIntArray543[0], Static31.anIntArray78[0], Static44.anIntArray97[0], Static268.aByteArrayArray13[0], Static133.anIntArray266);
		}
		Static91.method1595();
		return local23;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method1526(@OriginalArg(0) String arg0) {
		return Static22.method421(10, arg0);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(III)Lclient!j;")
	public static Class72 method1527(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub26 local7 = Static74.aClass1_Sub26ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass72_1;
	}
}
