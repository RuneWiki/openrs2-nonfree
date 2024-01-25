import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "Lclient!lg;")
	public static final Class181 aClass181_1 = new Class181();

	@OriginalMember(owner = "client!baa", name = "c", descriptor = "Lclient!uv;")
	public static final Class296 aClass296_40 = new Class296(26, 12);

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(IILclient!kr;I)Lclient!hd;")
	public static Class1_Sub1_Sub5 method744(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class171 arg2) {
		@Pc(14) Class1_Sub6 local14 = new Class1_Sub6(arg2.method4339(arg0, arg1));
		@Pc(53) Class1_Sub1_Sub5 local53 = new Class1_Sub1_Sub5(arg1, local14.method3954(), local14.method3954(), local14.method3925(), local14.method3925(), local14.method3922() == 1, local14.method3922(), local14.method3922());
		@Pc(59) int local59 = local14.method3922();
		for (@Pc(61) int local61 = 0; local61 < local59; local61++) {
			local53.aClass37_40.method970(new Class1_Sub28(local14.method3922(), local14.method3967(), local14.method3967(), local14.method3967(), local14.method3967(), local14.method3967(), local14.method3967(), local14.method3967(), local14.method3967()));
		}
		local53.method2665();
		return local53;
	}
}
