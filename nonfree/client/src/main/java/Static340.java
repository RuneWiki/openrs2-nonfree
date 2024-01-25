import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static340 {

	@OriginalMember(owner = "client!re", name = "d", descriptor = "Lclient!uv;")
	public static final Class253 aClass253_122 = new Class253(20, 5);

	@OriginalMember(owner = "client!re", name = "e", descriptor = "[I")
	public static final int[] anIntArray497 = new int[32];

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!tm;ZLclient!tm;)V")
	public static void method4425(@OriginalArg(0) Class7_Sub4 arg0, @OriginalArg(2) Class7_Sub4 arg1) {
		if (arg0.aClass7_Sub4_58 != null) {
			arg0.method5661();
		}
		arg0.aClass7_Sub4_57 = arg1.aClass7_Sub4_57;
		arg0.aClass7_Sub4_58 = arg1;
		arg0.aClass7_Sub4_58.aClass7_Sub4_57 = arg0;
		arg0.aClass7_Sub4_57.aClass7_Sub4_58 = arg0;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!gk;I)Lclient!vn;")
	public static Class7_Sub3 method4426(@OriginalArg(0) Class7_Sub14 arg0) {
		arg0.method3981();
		@Pc(13) int local13 = arg0.method3981();
		@Pc(17) Class7_Sub3 local17 = Static20.method1881(local13);
		local17.anInt7278 = arg0.method3981();
		@Pc(31) int local31 = arg0.method3981();
		for (@Pc(33) int local33 = 0; local33 < local31; local33++) {
			@Pc(39) int local39 = arg0.method3981();
			local17.method5599(local39, arg0);
		}
		local17.method5593();
		return local17;
	}
}
