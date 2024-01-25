import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static212 {

	@OriginalMember(owner = "client!hga", name = "f", descriptor = "[I")
	public static final int[] anIntArray204 = new int[3];

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(CI)Z")
	public static boolean method3800(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "()V")
	public static void method3801() {
		for (@Pc(1) int local1 = 0; local1 < Static592.anInt10005; local1++) {
			@Pc(6) Class9_Sub4_Sub2 local6 = Static560.aClass9_Sub4_Sub2Array1[local1];
			Static179.method3382(local6, true);
			Static560.aClass9_Sub4_Sub2Array1[local1] = null;
		}
		Static592.anInt10005 = 0;
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(II)Lclient!qm;")
	public static Class281 method3802() {
		return new Class281(1, false);
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(IZLclient!ha;Z)Lclient!pga;")
	public static Class259 method3804(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class5 arg2) {
		if (arg0 == -1) {
			return null;
		}
		if (Static6.anIntArray10 != null) {
			for (@Pc(15) int local15 = 0; local15 < Static6.anIntArray10.length; local15++) {
				if (Static6.anIntArray10[local15] == arg0) {
					return Static429.aClass259Array1[local15];
				}
			}
		}
		@Pc(42) Class259 local42 = (Class259) Static412.aClass94_39.method2960((long) arg0);
		if (local42 != null) {
			if (arg1 && local42.aClass213_13 == null) {
				@Pc(54) Class213 local54 = Static50.method1622(Static379.aClass223_80, arg0);
				if (local54 == null) {
					return null;
				}
				local42.aClass213_13 = local54;
			}
			return local42;
		}
		@Pc(67) Class331[] local67 = Static655.method7891(Static347.aClass223_72, arg0);
		if (local67 == null) {
			return null;
		}
		@Pc(83) Class213 local83 = Static50.method1622(Static379.aClass223_80, arg0);
		if (local83 == null) {
			return null;
		}
		if (arg1) {
			local42 = new Class259(arg2.method6167(local83, local67), local83);
		} else {
			local42 = new Class259(arg2.method6167(local83, local67));
		}
		Static412.aClass94_39.method2963((long) arg0, local42);
		return local42;
	}
}
