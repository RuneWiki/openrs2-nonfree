import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static243 {

	@OriginalMember(owner = "client!sh", name = "t", descriptor = "F")
	public static float aFloat56;

	@OriginalMember(owner = "client!sh", name = "q", descriptor = "Lclient!gd;")
	public static Class61 aClass61_47 = new Class61(64);

	@OriginalMember(owner = "client!sh", name = "u", descriptor = "Z")
	public static boolean aBoolean390 = false;

	@OriginalMember(owner = "client!sh", name = "v", descriptor = "[I")
	public static int[] anIntArray368 = new int[500];

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(BI)Lclient!tm;")
	public static Class8_Sub1_Sub20 method3654(@OriginalArg(1) int arg0) {
		@Pc(12) Class8_Sub1_Sub20 local12 = (Class8_Sub1_Sub20) Static22.aClass125_8.method2957((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(25) byte[] local25 = Static206.aClass132_71.method3194(arg0, 0);
		if (local25 == null) {
			return null;
		}
		local12 = new Class8_Sub1_Sub20();
		@Pc(39) Class8_Sub2 local39 = new Class8_Sub2(local25);
		local39.anInt2955 = local39.aByteArray24.length - 2;
		@Pc(69) int local69 = local39.method2375();
		@Pc(80) int local80 = local39.aByteArray24.length - local69 - 2 - 12;
		local39.anInt2955 = local80;
		@Pc(87) int local87 = local39.method2352();
		local12.anInt5224 = local39.method2375();
		local12.anInt5225 = local39.method2375();
		local12.anInt5227 = local39.method2375();
		local12.anInt5226 = local39.method2375();
		@Pc(111) int local111 = local39.method2334();
		@Pc(120) int local120;
		@Pc(127) int local127;
		if (local111 > 0) {
			local12.aClass129Array1 = new Class129[local111];
			for (local120 = 0; local120 < local111; local120++) {
				local127 = local39.method2375();
				@Pc(134) Class129 local134 = new Class129(Static95.method1518(local127));
				local12.aClass129Array1[local120] = local134;
				while (local127-- > 0) {
					@Pc(147) int local147 = local39.method2352();
					@Pc(151) int local151 = local39.method2352();
					local134.method3039(new Class8_Sub28(local151), (long) local147);
				}
			}
		}
		local39.anInt2955 = 0;
		local120 = 0;
		local12.aString186 = local39.method2369();
		local12.aStringArray75 = new String[local87];
		local12.anIntArray416 = new int[local87];
		local12.anIntArray417 = new int[local87];
		while (local39.anInt2955 < local80) {
			local127 = local39.method2375();
			if (local127 == 3) {
				local12.aStringArray75[local120] = local39.method2372().intern();
			} else if (local127 >= 100 || local127 == 21 || local127 == 38 || local127 == 39) {
				local12.anIntArray417[local120] = local39.method2334();
			} else {
				local12.anIntArray417[local120] = local39.method2352();
			}
			local12.anIntArray416[local120++] = local127;
		}
		Static22.aClass125_8.method2956((long) arg0, local12);
		return local12;
	}

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "(B)I")
	public static int method3656() {
		Static8.anInt5674 = 0;
		return Static293.method4284();
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIII[B[Lclient!mf;IIIZI)V")
	public static void method3657(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) Class112[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) int arg9) {
		@Pc(13) int local13 = -1;
		@Pc(18) Class8_Sub2 local18 = new Class8_Sub2(arg4);
		while (true) {
			@Pc(22) int local22 = local18.method2320();
			if (local22 == 0) {
				return;
			}
			local13 += local22;
			@Pc(33) int local33 = 0;
			while (true) {
				@Pc(37) int local37 = local18.method2382();
				if (local37 == 0) {
					break;
				}
				local33 += local37 - 1;
				@Pc(49) int local49 = local33 & 0x3F;
				@Pc(55) int local55 = local33 >> 6 & 0x3F;
				@Pc(59) int local59 = local33 >> 12;
				@Pc(63) int local63 = local18.method2334();
				@Pc(67) int local67 = local63 >> 2;
				@Pc(71) int local71 = local63 & 0x3;
				if (local59 == arg3 && arg1 <= local55 && arg1 + 8 > local55 && local49 >= arg2 && local49 < arg2 + 8) {
					@Pc(102) Class70 local102 = Static235.method3578(local13);
					@Pc(120) int local120 = arg7 + Static31.method509(local102.anInt2065, local55 & 0x7, local71, arg6, local102.anInt2063, local49 & 0x7);
					@Pc(139) int local139 = Static91.method1476(local49 & 0x7, local102.anInt2065, local71, arg6, local55 & 0x7, local102.anInt2063) + arg9;
					if (local120 > 0 && local139 > 0 && local120 < 103 && local139 < 103) {
						@Pc(157) Class112 local157 = null;
						if (!arg8) {
							@Pc(162) int local162 = arg0;
							if ((Static170.aByteArrayArrayArray9[1][local120][local139] & 0x2) == 2) {
								local162 = arg0 - 1;
							}
							if (local162 >= 0) {
								local157 = arg5[local162];
							}
						}
						Static127.method2066(local13, local71 + arg6 & 0x3, arg0, arg8, arg0, local157, !arg8, local67, local120, local139);
					}
				}
			}
		}
	}
}
