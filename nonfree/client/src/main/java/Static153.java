import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!fh", name = "f", descriptor = "I")
	public static int anInt3029;

	@OriginalMember(owner = "client!fh", name = "c", descriptor = "I")
	public static int anInt3027 = 0;

	@OriginalMember(owner = "client!fh", name = "d", descriptor = "[I")
	public static final int[] anIntArray145 = new int[200];

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2807(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(18) int local18 = arg3 + arg0;
		@Pc(22) int local22 = arg5 - arg0;
		for (@Pc(24) int local24 = arg3; local24 < local18; local24++) {
			Static611.method8472(arg2, arg1, Static460.anIntArrayArray53[local24], arg6);
		}
		for (@Pc(40) int local40 = arg5; local40 > local22; local40--) {
			Static611.method8472(arg2, arg1, Static460.anIntArrayArray53[local40], arg6);
		}
		@Pc(59) int local59 = arg2 - arg0;
		@Pc(63) int local63 = arg0 + arg1;
		for (@Pc(65) int local65 = local18; local65 <= local22; local65++) {
			@Pc(71) int[] local71 = Static460.anIntArrayArray53[local65];
			Static611.method8472(local63, arg1, local71, arg6);
			Static611.method8472(local59, local63, local71, arg4);
			Static611.method8472(arg2, local59, local71, arg6);
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(BIIILclient!hga;I)Ljava/awt/Frame;")
	public static Frame method2808(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Class138 arg2, @OriginalArg(5) int arg3) {
		if (!arg2.method3571()) {
			return null;
		}
		@Pc(20) Class347[] local20 = Static265.method4360(arg2);
		if (local20 == null) {
			return null;
		}
		@Pc(26) boolean local26 = false;
		for (@Pc(28) int local28 = 0; local28 < local20.length; local28++) {
			if (local20[local28].anInt9596 == arg3 && local20[local28].anInt9597 == arg1 && (!local26 || local20[local28].anInt9593 > arg0)) {
				local26 = true;
				arg0 = local20[local28].anInt9593;
			}
		}
		if (!local26) {
			return null;
		}
		@Pc(85) Class304 local85 = arg2.method3585(arg1, arg3, arg0);
		while (local85.anInt8838 == 0) {
			Static258.method4293(10L);
		}
		@Pc(105) Frame local105 = (Frame) local85.anObject16;
		if (local105 == null) {
			return null;
		} else if (local85.anInt8838 == 2) {
			Static261.method4323(arg2, local105);
			return null;
		} else {
			return local105;
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(II)V")
	public static void method2809(@OriginalArg(0) int arg0) {
		Static391.anInt7253 = arg0;
		@Pc(7) Class102 local7 = Static236.aClass102_26;
		synchronized (Static236.aClass102_26) {
			Static236.aClass102_26.method2681();
		}
	}
}
