import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!gk", name = "K", descriptor = "I")
	public static int anInt3747;

	@OriginalMember(owner = "client!gk", name = "L", descriptor = "Lclient!cba;")
	public static final Class45 aClass45_48 = new Class45(26, -2);

	@OriginalMember(owner = "client!gk", name = "T", descriptor = "Lclient!ej;")
	public static final Class88 aClass88_95 = new Class88("shake:", "schütteln:", "tremblement:", "tremor:");

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Ljava/lang/String;IBIIIZJLjava/lang/String;IZ)V")
	public static void method3297(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) long arg6, @OriginalArg(8) String arg7, @OriginalArg(9) int arg8, @OriginalArg(10) boolean arg9) {
		if (!Static389.aBoolean533 && Static8.anInt118 < 500) {
			@Pc(33) int local33 = arg8 == -1 ? Static4.anInt69 : arg8;
			@Pc(47) Class12_Sub20 local47 = new Class12_Sub20(arg7, arg0, local33, arg3, arg4, arg6, arg2, arg1, arg5, arg9);
			Static192.aClass73_33.method2012(local47);
			Static8.anInt118++;
		}
	}

	@OriginalMember(owner = "client!gk", name = "f", descriptor = "(III)Lclient!fa;")
	public static Class30_Sub3 method3298(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class37 local7 = Static120.aClass37ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass30_Sub3_1 == null ? null : local7.aClass30_Sub3_1;
	}
}
