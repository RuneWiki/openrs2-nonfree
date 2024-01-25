import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static269 {

	@OriginalMember(owner = "client!rj", name = "l", descriptor = "[I")
	public static int[] anIntArray432;

	@OriginalMember(owner = "client!rj", name = "q", descriptor = "[B")
	public static byte[] aByteArray83;

	@OriginalMember(owner = "client!rj", name = "r", descriptor = "[I")
	public static int[] anIntArray433;

	@OriginalMember(owner = "client!rj", name = "k", descriptor = "Lclient!m;")
	public static final Class127 aClass127_28 = new Class127();

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIILclient!ua;Lclient!ua;)V")
	public static void method4557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class5_Sub5 arg3, @OriginalArg(4) Class5_Sub5 arg4) {
		if (Static256.aClass45ArrayArrayArray2[arg0][arg1][arg2] == null) {
			Static128.method2212(arg0, arg1, arg2);
		}
		Static256.aClass45ArrayArrayArray2[arg0][arg1][arg2].aClass5_Sub5_1 = arg3;
		Static256.aClass45ArrayArrayArray2[arg0][arg1][arg2].aClass5_Sub5_2 = arg4;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lclient!tj;IIIILclient!ao;IB)V")
	public static void method4558(@OriginalArg(0) Class122 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class13 arg5, @OriginalArg(6) int arg6) {
		@Pc(5) Interface5 local5 = null;
		if (arg1 == 0) {
			local5 = (Interface5) Static132.method2235(arg3, arg6, arg2);
		}
		if (arg1 == 1) {
			local5 = (Interface5) Static2.method11(arg3, arg6, arg2);
		}
		if (arg1 == 2) {
			local5 = (Interface5) Static134.method2239(arg3, arg6, arg2, lk.class);
		}
		if (arg1 == 3) {
			local5 = (Interface5) Static135.method2262(arg3, arg6, arg2);
		}
		if (local5 == null) {
			return;
		}
		@Pc(66) int local66 = local5.method5342();
		@Pc(70) int local70 = local5.method5337();
		@Pc(76) Class170 local76 = Static268.method4553(local5.method5344());
		if (local76.method4400()) {
			Static301.method5087(arg2, arg3, local76, arg6);
		}
		if (local5.method5338()) {
			local5.method5340(arg0);
		}
		if (arg1 != 0) {
			if (arg1 == 1) {
				Static270.method4578(arg3, arg6, arg2);
			} else if (arg1 == 2) {
				Static252.method4229(arg3, arg6, arg2, lk.class);
				if (local76.anInt5211 != 0 && local76.anInt5235 + arg6 < Static162.anInt2152 && Static122.anInt2632 > arg2 + local76.anInt5235 && Static162.anInt2152 > arg6 + local76.anInt5251 && Static122.anInt2632 > local76.anInt5251 + arg2) {
					arg5.method238(local76.anInt5251, arg6, local76.anInt5235, !local76.aBoolean314, local70, arg2, local76.aBoolean303);
					return;
				}
			} else {
				if (arg1 == 3) {
					Static351.method5702(arg3, arg6, arg2);
					if (local76.anInt5211 == 1) {
						arg5.method246(arg6, arg2);
						return;
					}
				}
				return;
			}
			return;
		}
		Static8.method154(arg3, arg6, arg2);
		if (local76.anInt5211 != 0) {
			arg5.method235(arg6, !local76.aBoolean314, local70, local76.aBoolean303, local66, arg2);
			return;
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "()V")
	public static void method4563() {
		Static222.method3881(Static131.anInt2754);
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIIIIII)V")
	public static void method4565(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		@Pc(3) Class125[] local3 = Static108.aClass125Array11;
		for (@Pc(5) int local5 = 0; local5 < local3.length; local5++) {
			@Pc(11) Class125 local11 = local3[local5];
			if (local11 != null && local11.anInt3931 == 2) {
				Static219.method3813((local11.anInt3929 - Static186.anInt3094 << 7) + local11.anInt3928, arg0 >> 1, local11.anInt3927 * 2, arg1 >> 1, (local11.anInt3926 - Static296.anInt5889 << 7) + local11.anInt3930);
				if (Static187.anIntArray302[0] > -1 && Static51.anInt1101 % 20 < 10) {
					Static6.aClass57Array23[local11.anInt3924].method5448(Static187.anIntArray302[0] + arg3 - 12, Static187.anIntArray302[1] + arg2 - 28);
				}
			}
		}
	}
}
