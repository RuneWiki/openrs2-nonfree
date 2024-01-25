import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lclient!dk;III)Lclient!rg;")
	public static Class2_Sub5_Sub15 method2233(@OriginalArg(0) Class54 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class2_Sub13 local14 = new Class2_Sub13(arg0.method1126(arg1, arg2));
		@Pc(53) Class2_Sub5_Sub15 local53 = new Class2_Sub5_Sub15(arg2, local14.method3582(), local14.method3582(), local14.method3574(), local14.method3574(), local14.method3580() == 1, local14.method3580(), local14.method3580());
		@Pc(57) int local57 = local14.method3580();
		for (@Pc(59) int local59 = 0; local59 < local57; local59++) {
			local53.aClass156_51.method3157(new Class2_Sub38(local14.method3580(), local14.method3555(), local14.method3555(), local14.method3555(), local14.method3555(), local14.method3555(), local14.method3555(), local14.method3555(), local14.method3555()));
		}
		local53.method4570();
		return local53;
	}
}
