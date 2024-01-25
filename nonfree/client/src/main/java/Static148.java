import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lclient!ha;III[Z)Z")
	public static boolean method2387(@OriginalArg(0) Class1_Sub3_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (Static20.aClass17Array1 != Static499.aClass17Array3) {
			@Pc(12) int local12 = Static158.aClass17Array2[arg1].method6637(arg2, arg3);
			for (@Pc(14) int local14 = 0; local14 <= arg1; local14++) {
				@Pc(19) Class17 local19 = Static158.aClass17Array2[local14];
				if (local19 != null) {
					@Pc(29) int local29 = local12 - local19.method6637(arg2, arg3);
					if (arg4 != null) {
						arg4[local14] = local19.method6646(arg0, arg2, local29, arg3);
						if (!arg4[local14]) {
							continue;
						}
					}
					local19.E(arg0, arg2, local29, arg3, 0, false);
					local1 = true;
				}
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIIILclient!to;)V")
	public static void method2388(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class1_Sub48 arg3) {
		arg3.aClass1_Sub20_Sub1_2.method4421(arg1);
		arg3.aClass1_Sub20_Sub1_2.method4409(arg2);
		arg3.aClass1_Sub20_Sub1_2.method4409(arg0);
	}
}
