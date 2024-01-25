import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!af", name = "gb", descriptor = "Lclient!ra;")
	public static final Class320 aClass320_1 = new Class320(1);

	@OriginalMember(owner = "client!af", name = "ab", descriptor = "Lclient!sja;")
	public static final Class342 aClass342_1 = new Class342();

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIIII)V")
	public static void method358(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(11) int local11 = Static689.method9122(Static334.anInt5381, Static549.anInt5294, arg1);
		@Pc(17) int local17 = Static689.method9122(Static334.anInt5381, Static549.anInt5294, arg0);
		@Pc(23) int local23 = Static689.method9122(Static77.anInt1737, Static82.anInt1902, arg3);
		@Pc(29) int local29 = Static689.method9122(Static77.anInt1737, Static82.anInt1902, arg2);
		for (@Pc(31) int local31 = local11; local31 <= local17; local31++) {
			Static202.method3077(Static118.anIntArrayArray7[local31], local23, arg4, local29);
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(ILclient!ika;I)Ljava/lang/String;")
	public static String method359(@OriginalArg(1) Class3_Sub2 arg0) {
		try {
			@Pc(18) int local18 = arg0.method2054();
			if (local18 > 32767) {
				local18 = 32767;
			}
			@Pc(30) byte[] local30 = new byte[local18];
			arg0.anInt2178 += Static332.aClass403_1.method9480(arg0.aByteArray20, arg0.anInt2178, local30, 0, local18);
			return Static579.method7511(0, local18, local30);
		} catch (@Pc(54) Exception local54) {
			return "Cabbage";
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(ZIII)Lclient!id;")
	public static Class3_Sub29 method360(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) Class3_Sub29 local15 = null;
		if (arg2 == 0) {
			local15 = Static507.method6901(Static362.aClass144_56, Static95.aClass292_2.aClass88_2);
		}
		if (arg2 == 1) {
			local15 = Static507.method6901(Static16.aClass144_5, Static95.aClass292_2.aClass88_2);
		}
		local15.aClass3_Sub2_Sub1_1.method2065(Static43.aClass50_1.method7394(82) ? 1 : 0);
		local15.aClass3_Sub2_Sub1_1.method2010(Static189.anInt3243 + arg0);
		local15.aClass3_Sub2_Sub1_1.method2037(Static291.anInt4448 + arg1);
		Static681.anInt10651 = arg1;
		Static216.aBoolean223 = false;
		Static517.anInt8136 = arg0;
		Static71.method1569();
		return local15;
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(II)I")
	public static int method361(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static329.aShortArrayArray2 == null ? 0 : Static329.aShortArrayArray2[arg0][arg1] & 0xFFFF;
	}
}
