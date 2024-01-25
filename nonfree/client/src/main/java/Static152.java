import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static152 {

	@OriginalMember(owner = "client!jl", name = "d", descriptor = "I")
	public static int anInt2970;

	@OriginalMember(owner = "client!jl", name = "c", descriptor = "[B")
	public static final byte[] aByteArray58 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

	@OriginalMember(owner = "client!jl", name = "e", descriptor = "Lclient!uc;")
	public static final Class198 aClass198_24 = new Class198(10);

	@OriginalMember(owner = "client!jl", name = "i", descriptor = "I")
	public static int anInt2974 = 0;

	@OriginalMember(owner = "client!jl", name = "j", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray21 = new String[100];

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lclient!rj;ZILclient!tj;IZILclient!os;ILclient!tj;II)Lclient!l;")
	public static Class57 method2445(@OriginalArg(0) Class174 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class122 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class120 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Class122 arg9, @OriginalArg(10) int arg10) {
		@Pc(15) Class57 local15 = Static263.method4429(arg8, arg2, arg0, arg10, arg3, arg6, arg4);
		if (local15 != null) {
			return local15;
		}
		@Pc(30) Class41 local30 = Static230.method5537(arg4);
		@Pc(42) int local42;
		if (arg8 > 1 && local30.anIntArray78 != null) {
			@Pc(40) int local40 = -1;
			for (local42 = 0; local42 < 10; local42++) {
				if (arg8 >= local30.anIntArray80[local42] && local30.anIntArray80[local42] != 0) {
					local40 = local30.anIntArray78[local42];
				}
			}
			if (local40 != -1) {
				local30 = Static230.method5537(local40);
			}
		}
		@Pc(83) Class40 local83 = Static26.method559(Static169.aClass100_72, local30.anInt1180);
		if (local83 == null) {
			return null;
		}
		if (local30.aShortArray43 != null) {
			for (local42 = 0; local42 < local30.aShortArray43.length; local42++) {
				if (local30.aByteArray26 == null || local42 >= local30.aByteArray26.length) {
					local83.method913(local30.aShortArray44[local42], local30.aShortArray43[local42]);
				} else {
					local83.method913(Static232.aShortArray85[local30.aByteArray26[local42] & 0xFF], local30.aShortArray43[local42]);
				}
			}
		}
		if (local30.aShortArray42 != null) {
			for (local42 = 0; local42 < local30.aShortArray42.length; local42++) {
				local83.method910(local30.aShortArray42[local42], local30.aShortArray41[local42]);
			}
		}
		if (arg0 != null) {
			for (local42 = 0; local42 < 5; local42++) {
				if (Static196.aShortArrayArray4[local42].length > arg0.anIntArray434[local42]) {
					local83.method913(Static196.aShortArrayArray4[local42][arg0.anIntArray434[local42]], Static333.aShortArray111[local42]);
				}
				if (Static8.aShortArrayArray1[local42].length > arg0.anIntArray434[local42]) {
					local83.method913(Static8.aShortArrayArray1[local42][arg0.anIntArray434[local42]], Static157.aShortArray71[local42]);
				}
			}
		}
		@Pc(230) short local230 = 1024;
		@Pc(232) boolean local232 = false;
		if (local30.anInt1229 != 128 || local30.anInt1213 != 128 || local30.anInt1204 != 128) {
			local230 = 1031;
			local232 = true;
		}
		@Pc(268) Class124 local268 = arg9.method4794(local83, local230, 0, local30.anInt1191 + 64, 768 - -local30.anInt1224);
		if (local232) {
			local268.method4076(local30.anInt1229, local30.anInt1213, local30.anInt1204);
		}
		@Pc(280) Class57 local280 = null;
		if (local30.anInt1228 != -1) {
			local280 = method2445(arg0, true, 0, arg3, local30.anInt1233, true, 1, arg7, 10, arg9, 0);
			if (local280 == null) {
				return null;
			}
		} else if (local30.anInt1179 != -1) {
			local280 = method2445(arg0, false, arg2, arg3, local30.anInt1177, true, arg6, arg7, arg8, arg9, 0);
			if (local280 == null) {
				return null;
			}
		}
		@Pc(330) int local330 = local30.anInt1223;
		arg9.method4772(16, 16, 512, 512);
		if (arg1) {
			local330 = (int) ((double) local330 * 1.5D);
		} else if (arg6 == 2) {
			local330 = (int) ((double) local330 * 1.04D);
		}
		@Pc(360) Class56 local360 = arg9.method4743();
		local360.method4695();
		arg9.method4785(local360);
		arg9.method4752(1.0F);
		arg9.method4784(16777215, 1.0F, 1.0F, -50.0F, -10.0F, -50.0F);
		@Pc(379) Class56 local379 = arg9.method4739();
		local379.method4698(-local30.anInt1186 << 3);
		local379.method4690(local30.anInt1235 << 3);
		local379.method4691(local30.anInt1192, (Class19.anIntArray20[local30.anInt1184 << 3] * local330 >> 15) - (local268.method4106() / 2 - local30.anInt1195), (local330 * Class19.anIntArray21[local30.anInt1184 << 3] >> 15) + local30.anInt1195);
		local379.method4694(local30.anInt1184 << 3);
		@Pc(437) int local437 = arg9.method4795();
		@Pc(440) int local440 = arg9.method4776();
		arg9.method4738(50, Integer.MAX_VALUE);
		arg9.method4777();
		arg9.method4734();
		arg9.method4732(0, 0, 36, 32, 0, 0);
		if (!local268.method4117()) {
			return null;
		}
		local268.method4079(local379, null, 1);
		arg9.method4738(local437, local440);
		@Pc(477) int[] local477 = arg9.method4716();
		if (arg6 >= 1) {
			local477 = Static188.method3388(-16777215, local477);
			if (arg6 >= 2) {
				local477 = Static188.method3388(-1, local477);
			}
		}
		if (arg2 != 0) {
			Static204.method3549(local477, arg2);
		}
		arg9.method4762(local477, 36, 36, 32).method5448(0, 0);
		if (local30.anInt1228 != -1) {
			local280.method5448(0, 0);
		} else if (local30.anInt1179 != -1) {
			local280.method5448(0, 0);
		}
		if (arg10 == 1 || arg10 == 2 && (local30.anInt1175 == 1 || arg8 != 1) && arg8 != -1) {
			arg7.method5528(Static114.method1968(arg8), -16777215, 9, -256, 0);
		}
		local477 = arg9.method4716();
		for (@Pc(568) int local568 = 0; local568 < local477.length; local568++) {
			if ((local477[local568] & 0xFFFFFF) == 0) {
				local477[local568] = 0;
			} else {
				local477[local568] |= 0xFF000000;
			}
		}
		@Pc(608) Class57 local608;
		if (arg5) {
			local608 = arg9.method4762(local477, 36, 36, 32);
		} else {
			local608 = arg3.method4762(local477, 36, 36, 32);
		}
		if (!arg5) {
			@Pc(624) Class210 local624 = new Class210();
			local624.aBoolean439 = arg0 != null;
			local624.anInt6581 = arg2;
			local624.anInt6575 = arg10;
			local624.anInt6578 = arg8;
			local624.anInt6579 = arg6;
			local624.anInt6583 = arg4;
			local624.anInt6580 = arg3.anInt5595;
			Static196.aClass214_1.method5655(local624, local608);
		}
		return local608;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(II)Lclient!u;")
	public static Class196 method2446(@OriginalArg(1) int arg0) {
		@Pc(10) Class196 local10 = (Class196) Static111.aClass198_20.method5242((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static230.aClass100_124.method2319(1, arg0);
		local10 = new Class196();
		local10.anInt6162 = arg0;
		if (local20 != null) {
			local10.method5218(new Class3_Sub4(local20));
		}
		local10.method5223();
		if (local10.anInt6167 == 2 && Static331.aClass24_32.method609((long) arg0) == null) {
			Static331.aClass24_32.method598((long) arg0, new Class3_Sub22(Static107.anInt2276));
			Static317.aClass196Array3[Static107.anInt2276++] = local10;
		}
		Static111.aClass198_20.method5231((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIB)I")
	public static int method2448(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 = arg0 * (arg1 & 0x7F) >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0 + (arg1 & 0xFF80);
	}

	@OriginalMember(owner = "client!jl", name = "b", descriptor = "(II)I")
	public static int method2449(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(B)V")
	public static void method2450() {
		Static170.anInt6279 = 0;
		Static116.aClass127_12.method3401();
		Static168.aBoolean192 = false;
	}
}
