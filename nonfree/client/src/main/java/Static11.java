import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!ak", name = "n", descriptor = "I")
	public static int anInt297;

	@OriginalMember(owner = "client!ak", name = "q", descriptor = "I")
	public static int anInt299;

	@OriginalMember(owner = "client!ak", name = "s", descriptor = "Lclient!jd;")
	public static Class84 aClass84_7;

	@OriginalMember(owner = "client!ak", name = "u", descriptor = "Lclient!jd;")
	public static Class84 aClass84_8;

	@OriginalMember(owner = "client!ak", name = "c", descriptor = "Lclient!ec;")
	public static Class46 aClass46_4 = new Class46(16);

	@OriginalMember(owner = "client!ak", name = "l", descriptor = "I")
	public static int anInt295 = 0;

	@OriginalMember(owner = "client!ak", name = "m", descriptor = "I")
	public static int anInt296 = 0;

	@OriginalMember(owner = "client!ak", name = "o", descriptor = "I")
	public static int anInt298 = -1;

	@OriginalMember(owner = "client!ak", name = "p", descriptor = "Lclient!mn;")
	public static Class115 aClass115_1 = null;

	@OriginalMember(owner = "client!ak", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString14 = "Loaded defaults";

	@OriginalMember(owner = "client!ak", name = "t", descriptor = "Ljava/lang/String;")
	public static String aString15 = "Started 3d Library";

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method252(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static249.method3997(arg5)) {
			Static269.method4488(arg4, arg3, -1, arg2, arg1, arg7, Static219.aClass115ArrayArray1[arg5], arg6, arg0);
		} else if (arg6 == -1) {
			for (@Pc(29) int local29 = 0; local29 < 100; local29++) {
				Static165.aBooleanArray16[local29] = true;
			}
		} else {
			Static165.aBooleanArray16[arg6] = true;
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(III)V")
	public static void method254(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static249.method3997(arg1)) {
			Static34.method1667(Static219.aClass115ArrayArray1[arg1], arg0);
		}
	}

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "(III)Lclient!qi;")
	public static Class144 method255(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class144 local15 = new Class144();
		for (@Pc(20) Class2_Sub3_Sub18 local20 = (Class2_Sub3_Sub18) Static186.aClass79_16.method1992(); local20 != null; local20 = (Class2_Sub3_Sub18) Static186.aClass79_16.method1991()) {
			if (local20.aBoolean306 && local20.method2980(arg0, arg1)) {
				local15.method3662(local20);
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IZI)I")
	public static int method256(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = arg0 >>> 31;
		return (local14 + arg0) / arg1 - local14;
	}
}
