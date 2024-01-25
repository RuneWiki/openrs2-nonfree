import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static433 {

	@OriginalMember(owner = "client!nn", name = "g", descriptor = "[I")
	public static int[] anIntArray407;

	@OriginalMember(owner = "client!nn", name = "i", descriptor = "Z")
	public static volatile boolean aBoolean579 = true;

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(Lclient!bla;)V")
	public static void method6363(@OriginalArg(0) Class19_Sub1 arg0) {
		if (arg0 == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < 2; local5++) {
			@Pc(8) Class19_Sub1 local8 = null;
			for (@Pc(12) Class19_Sub1 local12 = Static660.aClass19_Sub1Array5[local5]; local12 != null; local12 = local12.aClass19_Sub1_25) {
				if (local12 == arg0) {
					if (local8 == null) {
						Static660.aClass19_Sub1Array5[local5] = local12.aClass19_Sub1_25;
					} else {
						local8.aClass19_Sub1_25 = local12.aClass19_Sub1_25;
					}
					Static70.aBoolean89 = true;
					return;
				}
				local8 = local12;
			}
			local8 = null;
			for (@Pc(47) Class19_Sub1 local47 = Static358.aClass19_Sub1Array2[local5]; local47 != null; local47 = local47.aClass19_Sub1_25) {
				if (local47 == arg0) {
					if (local8 == null) {
						Static358.aClass19_Sub1Array2[local5] = local47.aClass19_Sub1_25;
					} else {
						local8.aClass19_Sub1_25 = local47.aClass19_Sub1_25;
					}
					Static70.aBoolean89 = true;
					return;
				}
				local8 = local47;
			}
			local8 = null;
			for (@Pc(82) Class19_Sub1 local82 = Static634.aClass19_Sub1Array4[local5]; local82 != null; local82 = local82.aClass19_Sub1_25) {
				if (local82 == arg0) {
					if (local8 == null) {
						Static634.aClass19_Sub1Array4[local5] = local82.aClass19_Sub1_25;
					} else {
						local8.aClass19_Sub1_25 = local82.aClass19_Sub1_25;
					}
					Static70.aBoolean89 = true;
					return;
				}
				local8 = local82;
			}
		}
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(IBIIIII)Lclient!dn;")
	public static Class77 method6364(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(33) long local33 = (long) arg5 * 76724863L ^ (long) arg4 * 986053L ^ (long) arg0 * 67481L ^ (long) arg1 * 97549L ^ (long) arg3 * 475427L ^ (long) arg2 * 32147369L;
		@Pc(47) Class77 local47 = (Class77) Static652.aClass338_60.method8049(local33);
		if (local47 == null) {
			local47 = Static510.aClass67_17.method7685(arg0, arg1, arg3, arg4, arg2, arg5);
			Static652.aClass338_60.method8044(local33, local47);
			return local47;
		} else {
			return local47;
		}
	}
}
