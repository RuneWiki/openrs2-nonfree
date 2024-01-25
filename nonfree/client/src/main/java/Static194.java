import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static194 {

	@OriginalMember(owner = "client!hs", name = "b", descriptor = "[Lclient!mh;")
	public static Class196[] aClass196Array1;

	@OriginalMember(owner = "client!hs", name = "e", descriptor = "[I")
	public static int[] anIntArray273;

	@OriginalMember(owner = "client!hs", name = "f", descriptor = "I")
	public static int anInt3739;

	@OriginalMember(owner = "client!hs", name = "c", descriptor = "I")
	public static int anInt3737 = 0;

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(ZB)Z")
	public static boolean method3241(@OriginalArg(0) boolean arg0) {
		@Pc(14) boolean local14 = Static110.aClass62_15.method7031();
		if (local14 == arg0) {
			return true;
		}
		if (!arg0) {
			Static110.aClass62_15.method7039();
		} else if (!Static110.aClass62_15.method7033()) {
			arg0 = false;
		}
		if (arg0 == local14) {
			return false;
		} else {
			Static300.aClass5_Sub28_Sub1_1.aBoolean335 = arg0;
			Static300.aClass5_Sub28_Sub1_1.method4132(Static159.aClass9_10);
			return true;
		}
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(IIIZI)Lclient!sf;")
	public static Class5_Sub43 method3243(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) Class5_Sub43 local7 = new Class5_Sub43();
		local7.anInt7805 = arg0;
		local7.anInt7801 = arg2;
		Static307.aClass42_24.method1106((long) arg1, local7);
		Static430.method6131(arg2);
		@Pc(26) Class220 local26 = Static352.method5447(arg1);
		if (local26 != null) {
			Static377.method5650(local26);
		}
		if (Static381.aClass220_16 != null) {
			Static377.method5650(Static381.aClass220_16);
			Static381.aClass220_16 = null;
		}
		Static238.method4072();
		if (local26 != null) {
			Static428.method6119(local26, !arg3);
		}
		if (!arg3) {
			Static266.method4402(arg2);
		}
		if (!arg3 && Static395.anInt7085 != -1) {
			Static207.method3360(Static395.anInt7085, 1);
		}
		return local7;
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(III)I")
	public static int method3244(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 > 22050) {
			arg0 = arg1;
			arg1 = 22050;
		}
		while (arg1 != 0) {
			@Pc(34) int local34 = arg0 % arg1;
			arg0 = arg1;
			arg1 = local34;
		}
		return arg0;
	}
}
