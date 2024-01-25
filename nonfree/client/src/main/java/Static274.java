import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static274 {

	@OriginalMember(owner = "client!lg", name = "f", descriptor = "[Lclient!ha;")
	public static Class12[] aClass12Array17;

	@OriginalMember(owner = "client!lg", name = "m", descriptor = "I")
	public static int anInt5374 = 0;

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Z)V")
	public static void method4671() {
		if (Static363.aClass199_14 != Static544.aClass199_15) {
			try {
				Static554.method4839(Static496.aClient1, "tbrefresh");
			} catch (@Pc(19) Throwable local19) {
			}
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(ILclient!lp;Lclient!gw;I)V")
	public static void method4673(@OriginalArg(0) int arg0, @OriginalArg(1) Class182 arg1, @OriginalArg(2) Class1_Sub13 arg2) {
		@Pc(7) Class1_Sub4 local7 = new Class1_Sub4();
		local7.anInt849 = arg2.method3043();
		local7.anInt850 = arg2.method3037();
		local7.aClass243Array2 = new Class243[local7.anInt849];
		local7.aClass243Array1 = new Class243[local7.anInt849];
		local7.anIntArray35 = new int[local7.anInt849];
		local7.anIntArray37 = new int[local7.anInt849];
		local7.aByteArrayArrayArray1 = new byte[local7.anInt849][][];
		local7.anIntArray36 = new int[local7.anInt849];
		for (@Pc(53) int local53 = 0; local53 < local7.anInt849; local53++) {
			try {
				@Pc(58) int local58 = arg2.method3043();
				@Pc(74) String local74;
				@Pc(80) String local80;
				@Pc(82) int local82;
				if (local58 == 0 || local58 == 1 || local58 == 2) {
					local74 = arg2.method3034();
					local80 = arg2.method3034();
					local82 = 0;
					if (local58 == 1) {
						local82 = arg2.method3037();
					}
					local7.anIntArray35[local53] = local58;
					local7.anIntArray36[local53] = local82;
					local7.aClass243Array2[local53] = arg1.method4809(local80, Static116.method2636(local74));
				} else if (local58 == 3 || local58 == 4) {
					local74 = arg2.method3034();
					local80 = arg2.method3034();
					local82 = arg2.method3043();
					@Pc(134) String[] local134 = new String[local82];
					for (@Pc(136) int local136 = 0; local136 < local82; local136++) {
						local134[local136] = arg2.method3034();
					}
					@Pc(152) byte[][] local152 = new byte[local82][];
					@Pc(164) int local164;
					if (local58 == 3) {
						for (@Pc(159) int local159 = 0; local159 < local82; local159++) {
							local164 = arg2.method3037();
							local152[local159] = new byte[local164];
							arg2.method3071(local152[local159], local164);
						}
					}
					local7.anIntArray35[local53] = local58;
					@Pc(193) Class[] local193 = new Class[local82];
					for (local164 = 0; local164 < local82; local164++) {
						local193[local164] = Static116.method2636(local134[local164]);
					}
					local7.aClass243Array1[local53] = arg1.method4798(local80, local193, Static116.method2636(local74));
					local7.aByteArrayArrayArray1[local53] = local152;
				}
			} catch (@Pc(233) ClassNotFoundException local233) {
				local7.anIntArray37[local53] = -1;
			} catch (@Pc(240) SecurityException local240) {
				local7.anIntArray37[local53] = -2;
			} catch (@Pc(247) NullPointerException local247) {
				local7.anIntArray37[local53] = -3;
			} catch (@Pc(254) Exception local254) {
				local7.anIntArray37[local53] = -4;
			} catch (@Pc(261) Throwable local261) {
				local7.anIntArray37[local53] = -5;
			}
		}
		Static205.aClass38_30.method1426(local7);
	}
}
