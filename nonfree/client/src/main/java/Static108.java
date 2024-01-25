import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!gq", name = "h", descriptor = "I")
	public static int anInt2320;

	@OriginalMember(owner = "client!gq", name = "i", descriptor = "[Lclient!sa;")
	public static Class25_Sub1[] aClass25_Sub1Array3;

	@OriginalMember(owner = "client!gq", name = "j", descriptor = "Lclient!vr;")
	public static Class112 aClass112_1;

	@OriginalMember(owner = "client!gq", name = "e", descriptor = "Lclient!fi;")
	public static final Class66 aClass66_36 = new Class66(16);

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(IIZIBII)V")
	public static void method2166(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static6.anInt193 = arg4;
		Static54.anInt1333 = arg3;
		Class25_Sub1_Sub4.lb = arg1;
		Static32.anInt861 = arg5;
		Static339.anInt6358 = arg0;
		if (arg2 && Static32.anInt861 >= 100) {
			Static347.anInt6471 = Class25_Sub1_Sub4.lb * 128 + 64;
			Static347.anInt6472 = Static54.anInt1333 * 128 + 64;
			Static339.anInt6354 = Static66.method1393(Static347.anInt6471, Static156.anInt3123, Static347.anInt6472) - Static6.anInt193;
		}
		Static215.anInt4279 = 2;
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(IILclient!en;IZIZLclient!en;Lclient!tc;Lclient!eq;ZI)Lclient!kh;")
	public static Class54 method2168(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class59 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class59 arg6, @OriginalArg(8) Class91 arg7, @OriginalArg(9) Class61 arg8, @OriginalArg(10) boolean arg9, @OriginalArg(11) int arg10) {
		@Pc(15) Class54 local15 = Static193.method3496(arg1, arg0, arg2, arg10, arg5, arg8, arg3);
		if (local15 != null) {
			return local15;
		}
		@Pc(23) Class165 local23 = Static88.method1382(arg5);
		@Pc(35) int local35;
		if (arg3 > 1 && local23.anIntArray383 != null) {
			@Pc(33) int local33 = -1;
			for (local35 = 0; local35 < 10; local35++) {
				if (arg3 >= local23.anIntArray384[local35] && local23.anIntArray384[local35] != 0) {
					local33 = local23.anIntArray383[local35];
				}
			}
			if (local33 != -1) {
				local23 = Static88.method1382(local33);
			}
		}
		@Pc(75) Class150 local75 = Static17.method5326(local23.anInt4928, Static237.aClass170_82);
		if (local75 == null) {
			return null;
		}
		if (local23.aShortArray86 != null) {
			for (local35 = 0; local35 < local23.aShortArray86.length; local35++) {
				if (local23.aByteArray71 == null || local35 >= local23.aByteArray71.length) {
					local75.method3984(local23.aShortArray85[local35], local23.aShortArray86[local35]);
				} else {
					local75.method3984(Static110.aShortArray19[local23.aByteArray71[local35] & 0xFF], local23.aShortArray86[local35]);
				}
			}
		}
		if (local23.aShortArray83 != null) {
			for (local35 = 0; local35 < local23.aShortArray83.length; local35++) {
				local75.method3975(local23.aShortArray83[local35], local23.aShortArray84[local35]);
			}
		}
		if (arg8 != null) {
			for (local35 = 0; local35 < 5; local35++) {
				if (arg8.anIntArray101[local35] < Static165.aShortArrayArray9[local35].length) {
					local75.method3984(Static165.aShortArrayArray9[local35][arg8.anIntArray101[local35]], Static202.aShortArray47[local35]);
				}
				if (arg8.anIntArray101[local35] < Static336.aShortArrayArray13[local35].length) {
					local75.method3984(Static336.aShortArrayArray13[local35][arg8.anIntArray101[local35]], Static306.aShortArray99[local35]);
				}
			}
		}
		@Pc(214) short local214 = 1024;
		@Pc(216) boolean local216 = false;
		if (local23.anInt4935 != 128 || local23.lb != 128 || local23.anInt4914 != 128) {
			local214 = 1031;
			local216 = true;
		}
		@Pc(251) Class101 local251 = arg6.method4804(local75, local214, 0, local23.anInt4905 + 64, local23.anInt4949 + 768);
		if (!local251.method5170()) {
			return null;
		}
		if (local216) {
			local251.method5158(local23.anInt4935, local23.lb, local23.anInt4914);
		}
		@Pc(268) Class54 local268 = null;
		if (local23.anInt4944 != -1) {
			local268 = method2168(0, 1, arg2, 10, true, local23.anInt4908, arg6, arg7, arg8, true, 0);
			if (local268 == null) {
				return null;
			}
		} else if (local23.anInt4920 != -1) {
			local268 = method2168(arg0, arg1, arg2, arg3, false, local23.anInt4919, arg6, arg7, arg8, true, 0);
			if (local268 == null) {
				return null;
			}
		}
		@Pc(318) int local318 = local23.anInt4951;
		arg6.method4869(16, 16, 512, 512);
		if (arg4) {
			local318 = (int) ((double) local318 * 1.5D);
		} else if (arg1 == 2) {
			local318 = (int) ((double) local318 * 1.04D);
		}
		@Pc(348) Class112 local348 = arg6.method4789();
		local348.method3591();
		arg6.method4787(local348);
		arg6.method4791(1.0F);
		arg6.method4793(16777215, 1.0F, 1.0F, -50.0F, -10.0F, -50.0F);
		@Pc(367) Class112 local367 = arg6.method4798();
		local367.method3588(-local23.anInt4946 << 3);
		local367.method3597(local23.anInt4940 << 3);
		local367.method3584(local23.anInt4948, (local318 * Class5_Sub9_Sub12.anIntArray169[local23.anInt4958 << 3] >> 15) + (local23.anInt4945 - (local251.method5147() / 2)), (Class5_Sub9_Sub12.anIntArray170[local23.anInt4958 << 3] * local318 >> 15) + local23.anInt4945);
		local367.method3585(local23.anInt4958 << 3);
		@Pc(426) int local426 = arg6.method4839();
		@Pc(429) int local429 = arg6.method4878();
		arg6.method4886(50, Integer.MAX_VALUE);
		arg6.method4860();
		arg6.method4810();
		arg6.method4877(0, 0, 36, 32, 0, 0);
		local251.method5172(local367, null, 1);
		arg6.method4886(local426, local429);
		@Pc(461) int[] local461 = arg6.method4801();
		if (arg1 >= 1) {
			local461 = Static311.method5713(-16777215, local461);
			if (arg1 >= 2) {
				local461 = Static311.method5713(-1, local461);
			}
		}
		if (arg0 != 0) {
			Static265.method5498(local461, arg0);
		}
		arg6.method4834(local461, 36, 36, 32).method5569(0, 0);
		if (local23.anInt4944 != -1) {
			local268.method5569(0, 0);
		} else if (local23.anInt4920 != -1) {
			local268.method5569(0, 0);
		}
		if (arg10 == 1 || arg10 == 2 && (local23.anInt4953 == 1 || arg3 != 1) && arg3 != -1) {
			arg7.method5300(-16777215, 9, Static196.method3515(arg3), -256, 0);
		}
		local461 = arg6.method4801();
		for (@Pc(553) int local553 = 0; local553 < local461.length; local553++) {
			if ((local461[local553] & 0xFFFFFF) == 0) {
				local461[local553] = 0;
			} else {
				local461[local553] |= 0xFF000000;
			}
		}
		@Pc(597) Class54 local597;
		if (arg9) {
			local597 = arg6.method4834(local461, 36, 36, 32);
		} else {
			local597 = arg2.method4834(local461, 36, 36, 32);
		}
		if (!arg9) {
			@Pc(613) Class116 local613 = new Class116();
			local613.anInt3483 = arg3;
			local613.anInt3480 = arg5;
			local613.anInt3481 = arg0;
			local613.aBoolean251 = arg8 != null;
			local613.anInt3484 = arg2.anInt5487;
			local613.anInt3486 = arg10;
			local613.anInt3485 = arg1;
			Static250.aClass109_1.method2984(local597, local613);
		}
		return local597;
	}

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "(I)Z")
	public static boolean method2169() {
		if (Static309.aBoolean444) {
			try {
				if ((Boolean) Static367.method4779("showingVideoAd", Static202.aClass10_3.anApplet1)) {
					return false;
				}
				return true;
			} catch (@Pc(18) Throwable local18) {
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(ILclient!sl;BI)J")
	public static long method2170(@OriginalArg(0) int arg0, @OriginalArg(1) Interface8 arg1, @OriginalArg(3) int arg2) {
		@Pc(5) long local5 = 4194304L;
		@Pc(7) long local7 = 2147483648L;
		@Pc(9) long local9 = Long.MIN_VALUE;
		@Pc(20) Class137 local20 = Static228.method3923(arg1.method5549());
		@Pc(45) long local45 = (long) (arg1.method5554() << 14 | arg2 << 7 | arg0 | arg1.method5552() << 20 | 0x40000000);
		if (local20.anInt4164 == 0) {
			local45 |= local9;
		}
		if (local20.anInt4136 == 1) {
			local45 |= local5;
		}
		if (local20.aBoolean294) {
			local45 |= local7;
		}
		return local45 | (long) arg1.method5549() << 32;
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(II)V")
	public static void method2171(@OriginalArg(0) int arg0) {
		@Pc(12) Class5_Sub19 local12 = (Class5_Sub19) Static331.aClass42_54.method1052((long) arg0);
		if (local12 != null) {
			for (@Pc(17) int local17 = 0; local17 < local12.anIntArray135.length; local17++) {
				local12.anIntArray135[local17] = -1;
				local12.anIntArray134[local17] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(B[I[J)V")
	public static void method2172(@OriginalArg(1) int[] arg0, @OriginalArg(2) long[] arg1) {
		Static2.method8(arg1, 0, arg0, arg1.length - 1);
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(IIBI)I")
	public static int method2173(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg1 & 0x3;
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return 1023 - arg0;
		} else if (local3 == 2) {
			return 1023 - arg2;
		} else {
			return arg0;
		}
	}
}
