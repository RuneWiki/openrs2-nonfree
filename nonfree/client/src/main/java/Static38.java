import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "Lclient!ir;")
	public static Class100 aClass100_14;

	@OriginalMember(owner = "client!cc", name = "f", descriptor = "[I")
	public static final int[] anIntArray54 = new int[25];

	@OriginalMember(owner = "client!cc", name = "g", descriptor = "[I")
	public static final int[] anIntArray55 = new int[2500];

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIIIBII)V")
	public static void method677(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg4 < 0 || arg6 < 0 || arg4 >= Static162.anInt2152 - 1 || arg6 >= Static122.anInt2632 - 1) {
			return;
		}
		if (Static256.aClass45ArrayArrayArray2 == null) {
			return;
		}
		@Pc(46) Interface5 local46;
		if (arg0 != 0) {
			if (arg0 == 1) {
				local46 = (Interface5) Static2.method11(arg1, arg4, arg6);
				if (local46 != null) {
					if (local46 instanceof Class5_Sub1_Sub2) {
						((Class5_Sub1_Sub2) local46).aClass173_2.method4534(arg3);
						return;
					}
					@Pc(62) int local62 = local46.method5344();
					if (arg5 == 4 || arg5 == 5) {
						Static306.method5115(local62, arg0, arg2, arg1, arg3, arg6, arg4, 4);
					} else if (arg5 == 6) {
						Static306.method5115(local62, arg0, arg2 + 4, arg1, arg3, arg6, arg4, 4);
						return;
					} else if (arg5 == 7) {
						Static306.method5115(local62, arg0, (arg2 + 2 & 0x3) + 4, arg1, arg3, arg6, arg4, 4);
						return;
					} else if (arg5 == 8) {
						Static306.method5115(local62, arg0, arg2 + 4, arg1, arg3, arg6, arg4, 4);
						Static306.method5115(local62, arg0, (arg2 + 2 & 0x3) + 4, arg1, arg3, arg6, arg4, 4);
						return;
					}
					return;
				}
				return;
			}
			if (arg0 != 2) {
				if (arg0 == 3) {
					local46 = (Interface5) Static135.method2262(arg1, arg4, arg6);
					if (local46 != null) {
						if (!(local46 instanceof Class5_Sub3_Sub2)) {
							Static306.method5115(local46.method5344(), arg0, arg2, arg1, arg3, arg6, arg4, arg5);
							return;
						}
						((Class5_Sub3_Sub2) local46).aClass173_3.method4534(arg3);
						return;
					}
				}
				return;
			}
			local46 = (Interface5) Static134.method2239(arg1, arg4, arg6, lk.class);
			if (local46 != null) {
				if (arg5 == 11) {
					arg5 = 10;
				}
				if (!(local46 instanceof Class5_Sub4_Sub2)) {
					Static306.method5115(local46.method5344(), arg0, arg2, arg1, arg3, arg6, arg4, arg5);
					return;
				}
				((Class5_Sub4_Sub2) local46).aClass173_1.method4534(arg3);
				return;
			}
			return;
		}
		local46 = (Interface5) Static132.method2235(arg1, arg4, arg6);
		@Pc(250) Interface5 local250 = (Interface5) Static63.method1013(arg1, arg4, arg6);
		if (local46 != null && arg5 != 2) {
			if (local46 instanceof Class5_Sub5_Sub2) {
				((Class5_Sub5_Sub2) local46).aClass173_4.method4534(arg3);
			} else {
				Static306.method5115(local46.method5344(), arg0, arg2, arg1, arg3, arg6, arg4, arg5);
			}
		}
		if (local250 == null) {
			return;
		}
		if (local250 instanceof Class5_Sub5_Sub2) {
			((Class5_Sub5_Sub2) local250).aClass173_4.method4534(arg3);
			return;
		}
		Static306.method5115(local250.method5344(), arg0, arg2, arg1, arg3, arg6, arg4, arg5);
		return;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method678(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(8) Class3_Sub7_Sub11 local8 = Static116.method2029(arg0, 2);
		local8.method2509();
		local8.aString117 = arg1;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)V")
	public static void method679(@OriginalArg(0) int arg0) {
		if (!Static149.method2419(arg0)) {
			return;
		}
		@Pc(14) Class181[] local14 = Static311.aClass181ArrayArray1[arg0];
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(22) Class181 local22 = local14[local16];
			if (local22 != null) {
				local22.anInt5744 = 1;
				local22.anInt5754 = 0;
				local22.anInt5774 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZI)I")
	public static int method680(@OriginalArg(1) int arg0) {
		@Pc(18) int local18 = arg0 * (arg0 * arg0 >> 12) >> 12;
		@Pc(24) int local24 = arg0 * 6 - 61440;
		@Pc(32) int local32 = (local24 * arg0 >> 12) + 40960;
		return local32 * local18 >> 12;
	}
}
