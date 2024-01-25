import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static225 {

	@OriginalMember(owner = "client!hj", name = "g", descriptor = "I")
	public static int anInt4116 = 0;

	@OriginalMember(owner = "client!hj", name = "d", descriptor = "(I)V")
	public static void method3512() {
		Static262.aBoolean401 = true;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IB)V")
	public static void method3513(@OriginalArg(0) int arg0) {
		@Pc(13) Class3_Sub6_Sub7 local13 = Static198.method3146((long) arg0, 9);
		local13.method1709();
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(ZZIIIJLjava/lang/String;ILjava/lang/String;JBZI)V")
	public static void method3514(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) long arg5, @OriginalArg(6) String arg6, @OriginalArg(7) int arg7, @OriginalArg(8) String arg8, @OriginalArg(9) long arg9, @OriginalArg(11) boolean arg10, @OriginalArg(12) int arg11) {
		if (!Static463.aBoolean600 && Static37.anInt1104 < 500) {
			@Pc(21) int local21 = arg3 == -1 ? Static267.anInt5035 : arg3;
			@Pc(37) Class3_Sub6_Sub16 local37 = new Class3_Sub6_Sub16(arg8, arg6, local21, arg7, arg2, arg5, arg11, arg4, arg0, arg10, arg9, arg1);
			Static356.method5369(local37);
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(ZILclient!mfa;IFIFFFF[BII)V")
	public static void method3515(@OriginalArg(2) Class157 arg0, @OriginalArg(4) float arg1, @OriginalArg(6) float arg2, @OriginalArg(7) float arg3, @OriginalArg(8) float arg4, @OriginalArg(9) float arg5, @OriginalArg(10) byte[] arg6, @OriginalArg(12) int arg7) {
		for (@Pc(1) int local1 = 0; local1 < 16; local1++) {
			Static118.method2144(arg7, arg4, local1, arg0, arg1, arg2, arg3, arg6, arg5);
			arg7 += 16384;
		}
	}
}
