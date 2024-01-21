import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "Lclient!ed;")
	public static Class23 aClass23_312 = Static169.method2903(" loggt sich aus)3");

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "Lclient!ed;")
	public static Class23 aClass23_313 = Static169.method2903("Null");

	@OriginalMember(owner = "client!dd", name = "e", descriptor = "Z")
	public static boolean aBoolean45 = false;

	@OriginalMember(owner = "client!dd", name = "f", descriptor = "Lclient!ed;")
	private static Class23 aClass23_314 = Static169.method2903("Try again in 60 secs)3)3)3");

	@OriginalMember(owner = "client!dd", name = "g", descriptor = "Lclient!ed;")
	public static Class23 aClass23_315 = aClass23_314;

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V")
	public static void method543() {
		aClass23_314 = null;
		aClass23_312 = null;
		aClass23_315 = null;
		aClass23_313 = null;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(II)V")
	public static void method544(@OriginalArg(1) int arg0) {
		if (!Static49.method916(arg0)) {
			return;
		}
		@Pc(14) Class60[] local14 = Static9.aClass60ArrayArray1[arg0];
		for (@Pc(24) int local24 = 0; local24 < local14.length; local24++) {
			@Pc(30) Class60 local30 = local14[local24];
			if (local30 != null) {
				local30.anInt3026 = 0;
				local30.anInt2976 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(ZLclient!ob;)Z")
	public static boolean method545(@OriginalArg(1) Class60 arg0) {
		if (arg0.anIntArray396 == null) {
			return false;
		}
		for (@Pc(10) int local10 = 0; local10 < arg0.anIntArray396.length; local10++) {
			@Pc(20) int local20 = Static33.method574(arg0, local10);
			@Pc(25) int local25 = arg0.anIntArray403[local10];
			if (arg0.anIntArray396[local10] == 2) {
				if (local20 >= local25) {
					return false;
				}
			} else if (arg0.anIntArray396[local10] == 3) {
				if (local20 <= local25) {
					return false;
				}
			} else if (arg0.anIntArray396[local10] == 4) {
				if (local25 == local20) {
					return false;
				}
			} else if (local20 != local25) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V")
	public static void method546() {
		Class88.aClass79_28.method2659();
	}
}
