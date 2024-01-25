import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!hc", name = "l", descriptor = "I")
	public static int anInt2547;

	@OriginalMember(owner = "client!hc", name = "n", descriptor = "[I")
	public static int[] anIntArray234;

	@OriginalMember(owner = "client!hc", name = "o", descriptor = "I")
	public static int anInt2549;

	@OriginalMember(owner = "client!hc", name = "s", descriptor = "F")
	public static float aFloat38;

	@OriginalMember(owner = "client!hc", name = "m", descriptor = "I")
	public static int anInt2548 = 0;

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(ZZLclient!up;I)V")
	public static void method2331(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class1_Sub37 arg2) {
		@Pc(13) int local13 = arg2.anInt6281;
		@Pc(17) int local17 = (int) arg2.aLong213;
		arg2.method5628();
		if (arg0) {
			Static327.method5307(local13);
		}
		Static224.method4189(local13);
		@Pc(32) Class12 local32 = Static9.method319(local17);
		if (local32 != null) {
			Static6.method247(local32);
		}
		Static49.method1301();
		if (!arg1 && Static89.anInt2231 != -1) {
			Static110.method5416(Static89.anInt2231, 1);
		}
		@Pc(53) Class100 local53 = new Class100(Static351.aClass197_33);
		for (@Pc(58) Class1_Sub37 local58 = (Class1_Sub37) local53.method2753(); local58 != null; local58 = (Class1_Sub37) local53.method2754()) {
			if (!local58.method5627()) {
				local58 = (Class1_Sub37) local53.method2753();
				if (local58 == null) {
					return;
				}
			}
			if (local58.anInt6278 == 3) {
				@Pc(82) int local82 = (int) local58.aLong213;
				if (local13 == local82 >>> 16) {
					method2331(true, arg1, local58);
				}
			}
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(BC)Z")
	public static boolean method2332(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}
