import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static248 {

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(IIIIII)V")
	public static void method4092(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (Static336.aClass3_Sub41_18.aClass14_Sub9_4.method2998() != 0 && arg4 != 0 && Static217.anInt10315 < 50 && arg0 != -1) {
			Static2.aClass51Array1[Static217.anInt10315++] = new Class51((byte) 1, arg0, arg4, arg1, arg2, 0, arg3, (Class34_Sub1) null);
		}
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(JJ)J")
	public static long method4093(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 & arg1;
	}
}
