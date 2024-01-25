import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static517 {

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIIZIII)Lclient!vr;")
	public static Class3 method8015(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(33) long local33 = (long) arg1 * 76724863L ^ (long) arg4 * 986053L ^ (long) arg2 * 67481L ^ (long) arg5 * 97549L ^ (long) arg3 * 475427L ^ (long) arg0 * 32147369L;
		@Pc(44) Class3 local44 = (Class3) Static662.aClass22_62.method462(local33);
		if (local44 == null) {
			local44 = Static595.aClass101_14.method8130(arg2, arg5, arg3, arg4, arg0, arg1);
			Static662.aClass22_62.method470(local33, local44);
			return local44;
		} else {
			return local44;
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(I[Ljava/lang/String;)V")
	public static void method8016(@OriginalArg(1) String[] arg0) {
		if (arg0.length <= 1) {
			Static356.aString80 = Static356.aString80 + arg0[0];
			Static154.anInt3391 += arg0[0].length();
			return;
		}
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			if (arg0[local13].startsWith("pause")) {
				@Pc(32) int local32 = 5;
				try {
					local32 = Integer.parseInt(arg0[local13].substring(6));
				} catch (@Pc(41) Exception local41) {
				}
				Static455.method7295("Pausing for " + local32 + " seconds...");
				Static64.aStringArray3 = arg0;
				Static421.anInt7733 = local13 + 1;
				Static175.aLong94 = (long) (local32 * 1000) + Static99.method1701();
				return;
			}
			Static356.aString80 = arg0[local13];
			Static201.method3842(false);
		}
	}
}
