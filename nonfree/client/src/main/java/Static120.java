import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!eba", name = "L", descriptor = "Lclient!hu;")
	public static Class150 aClass150_7;

	@OriginalMember(owner = "client!eba", name = "A", descriptor = "Z")
	public static boolean aBoolean645 = false;

	@OriginalMember(owner = "client!eba", name = "J", descriptor = "Lclient!hfa;")
	public static final Class141 aClass141_7 = new Class141();

	@OriginalMember(owner = "client!eba", name = "K", descriptor = "Z")
	public static boolean aBoolean646 = false;

	@OriginalMember(owner = "client!eba", name = "b", descriptor = "(IJ)I")
	public static int method7598(@OriginalArg(1) long arg0) {
		return (int) (arg0 / 86400000L) - 11745;
	}

	@OriginalMember(owner = "client!eba", name = "k", descriptor = "(I)V")
	public static void method7600() {
		Static447.anInt10239 = -2;
		Static642.anInt10721 = -2;
		Static499.anInt8832 = 0;
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(Lclient!je;Z[[[BIB)Z")
	public static boolean method7601(@OriginalArg(0) Class12_Sub2 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte[][][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		if (!Static252.aBoolean307) {
			return false;
		}
		@Pc(8) int local8 = arg0.anInt10998 >> Static579.anInt9935;
		@Pc(10) int local10 = local8;
		@Pc(15) int local15 = arg0.anInt11002 >> Static579.anInt9935;
		@Pc(17) int local17 = local15;
		if (arg0 instanceof Class12_Sub2_Sub2) {
			local10 = ((Class12_Sub2_Sub2) arg0).aShort112;
			local17 = ((Class12_Sub2_Sub2) arg0).aShort109;
			local8 = ((Class12_Sub2_Sub2) arg0).aShort111;
			local15 = ((Class12_Sub2_Sub2) arg0).aShort110;
		}
		for (@Pc(38) int local38 = local8; local38 <= local10; local38++) {
			for (@Pc(41) int local41 = local15; local41 <= local17; local41++) {
				if (arg0.aByte145 < Static613.anInt10338 && local38 >= Static384.anInt7056 && local38 < Static113.anInt2284 && local41 >= Static6.anInt41 && local41 < Static47.anInt1132) {
					if ((arg2 == null || arg0.aByte146 < arg3 || arg2[arg0.aByte146][local38][local41] != arg4) && arg0.method9167() && !arg0.method9155(Static533.aClass137_41)) {
						return false;
					}
					if (!arg1 && local38 >= Static358.anInt6609 - 16 && local38 <= Static358.anInt6609 + 16 && local41 >= Static297.anInt5235 - 16 && local41 <= Static297.anInt5235 + 16) {
						if (Static267.aBoolean322) {
							Static400.aClass134Array1[Static504.anInt8895++].method3034(arg0);
							Static504.anInt8895 %= Static535.anInt9236;
						} else {
							arg0.method9164(Static533.aClass137_41);
						}
					}
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(II)Z")
	public static boolean method7602(@OriginalArg(0) int arg0) {
		return arg0 == 1 || arg0 == 3 || arg0 == 5;
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(ZLclient!td;ILjava/lang/String;Z)V")
	public static void method7603(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class333 arg1, @OriginalArg(3) String arg2, @OriginalArg(4) boolean arg3) {
		Static630.method8817(arg0, "openjs", arg3, arg1, arg2);
	}
}
