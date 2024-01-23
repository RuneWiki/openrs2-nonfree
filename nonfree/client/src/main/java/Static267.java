import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static267 {

	@OriginalMember(owner = "client!tf", name = "q", descriptor = "Lclient!io;")
	public static Class81 aClass81_3;

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Ljava/lang/String;Lclient!th;ZZ)Lclient!uf;")
	public static Class174 method4026(@OriginalArg(0) String arg0, @OriginalArg(1) Class168 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(10) int local10 = arg1.method4069(arg0);
		if (local10 == -1) {
			return new Class174(0);
		}
		@Pc(24) int[] local24 = arg1.method4044(local10);
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		@Pc(34) Class174 local34 = new Class174(local24.length);
		while (true) {
			while (local34.anInt5618 > local26) {
				@Pc(59) Class1_Sub14 local59 = new Class1_Sub14(arg1.method4058(local24[local28++], local10));
				@Pc(63) int local63 = local59.method2194();
				@Pc(67) int local67 = local59.method2244();
				@Pc(71) int local71 = local59.method2199();
				if (!arg2 && local71 == 1) {
					local34.anInt5618--;
				} else {
					local34.anIntArray509[local26] = local63;
					local34.aClass1_Sub3_Sub11Array1[local26] = new Class1_Sub3_Sub11();
					local34.aClass1_Sub3_Sub11Array1[local26].anInt3104 = local67;
					local26++;
				}
			}
			return local34;
		}
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(I)V")
	public static void method4034() {
		if (Static87.aClass61ArrayArray1 == null) {
			return;
		}
		@Pc(7) Class61 local7 = new Class61();
		for (@Pc(9) int local9 = 0; local9 < 13; local9++) {
			for (@Pc(16) int local16 = 0; local16 < 13; local16++) {
				Static87.aClass61ArrayArray1[local9][local16] = local7;
			}
		}
	}
}
