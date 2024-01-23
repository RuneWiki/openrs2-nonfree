import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static214 {

	@OriginalMember(owner = "client!pj", name = "Q", descriptor = "Lclient!th;")
	public static Class168 aClass168_159;

	@OriginalMember(owner = "client!pj", name = "V", descriptor = "F")
	public static float aFloat45;

	@OriginalMember(owner = "client!pj", name = "M", descriptor = "Z")
	public static boolean aBoolean289 = false;

	@OriginalMember(owner = "client!pj", name = "N", descriptor = "Z")
	public static boolean aBoolean290 = false;

	@OriginalMember(owner = "client!pj", name = "T", descriptor = "Lclient!jl;")
	public static Class89 aClass89_32 = new Class89(50);

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(BJ)V")
	public static void method3426(@OriginalArg(1) long arg0) {
		Static2.aClass1_Sub14_Sub1_1.anInt3000 = 0;
		Static2.aClass1_Sub14_Sub1_1.method2191(21);
		Static2.aClass1_Sub14_Sub1_1.method2193(arg0);
		Static251.anInt5521 = 1;
		Static252.anInt5113 = -3;
		Static119.anInt2584 = 0;
		Static264.anInt5301 = 0;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lclient!th;Lclient!th;Lclient!th;Lclient!th;Z)V")
	public static void method3427(@OriginalArg(0) Class168 arg0, @OriginalArg(1) Class168 arg1, @OriginalArg(2) Class168 arg2, @OriginalArg(3) Class168 arg3) {
		Static130.aClass168_99 = arg0;
		Static7.aClass168_9 = arg3;
		Static107.aClass168_56 = arg1;
		Static273.aClass168_185 = arg2;
		Static34.aClass191ArrayArray1 = new Class191[Static130.aClass168_99.method4075()][];
		Static103.aBooleanArray17 = new boolean[Static130.aClass168_99.method4075()];
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIIIILclient!hd;IJ)Z")
	public static boolean method3428(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class2 arg6, @OriginalArg(8) long arg7) {
		if (arg6 == null) {
			return true;
		} else {
			@Pc(11) int local11 = arg1 * 128 + arg4 * 64;
			@Pc(19) int local19 = arg2 * 128 + arg5 * 64;
			return Static79.method1342(arg0, arg1, arg2, arg4, arg5, local11, local19, arg3, arg6, 0, false, arg7);
		}
	}

	@OriginalMember(owner = "client!pj", name = "e", descriptor = "(I)V")
	public static void method3430() {
		Static211.aClass14_1.method3261();
		@Pc(16) int local16;
		for (local16 = 0; local16 < 32; local16++) {
			Static44.aLongArray3[local16] = 0L;
		}
		for (local16 = 0; local16 < 32; local16++) {
			Static219.aLongArray8[local16] = 0L;
		}
		Static167.anInt3760 = 0;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(ZC)Z")
	public static boolean method3431(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}
