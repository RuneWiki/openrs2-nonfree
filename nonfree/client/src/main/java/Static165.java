import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "Lclient!oo;")
	public static Class172 aClass172_1;

	@OriginalMember(owner = "client!jf", name = "t", descriptor = "Lclient!fc;")
	public static Class71 aClass71_40;

	@OriginalMember(owner = "client!jf", name = "v", descriptor = "[I")
	public static int[] anIntArray330;

	@OriginalMember(owner = "client!jf", name = "m", descriptor = "Z")
	public static boolean aBoolean219 = false;

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIIIBIII)V")
	public static void method2698(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg0 < 1 || arg5 < 1 || Static392.anInt6751 - 2 < arg0 || arg5 > Static307.anInt5484 - 2) {
			return;
		}
		if (!Static43.method900() && !Static122.method2233(Static303.anInt5442, arg0, arg7, arg5)) {
			return;
		}
		if (Static297.aClass227ArrayArrayArray7 == null) {
			return;
		}
		Static314.aClass134_Sub1_3.method5431(arg5, arg7, Static304.aClass82_4, arg0, arg1, Static190.aClass239Array1[arg7]);
		if (arg3 < 0) {
			return;
		}
		@Pc(60) boolean local60 = Static364.aBoolean378;
		Static364.aBoolean378 = true;
		@Pc(64) int local64 = arg7;
		if (arg7 < 3 && Static231.method3806(arg0, arg5)) {
			local64 = arg7 + 1;
		}
		Static314.aClass134_Sub1_3.method5432(Static304.aClass82_4, arg4, arg3, arg6, arg5, arg2, local64, arg0, arg7, Static190.aClass239Array1[arg7]);
		Static364.aBoolean378 = local60;
		return;
	}

	@OriginalMember(owner = "client!jf", name = "d", descriptor = "(II)Lclient!bp;")
	public static Class24 method2707(@OriginalArg(0) int arg0) {
		@Pc(10) Class24 local10 = (Class24) Static202.aClass154_26.method3751((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static111.aClass71_24.method1555(1, arg0);
		local10 = new Class24();
		local10.anInt584 = arg0;
		if (local25 != null) {
			local10.method650(new Class2_Sub13(local25));
		}
		local10.method649();
		if (local10.anInt575 == 2 && Static17.aClass214_5.method5059((long) arg0) == null) {
			Static17.aClass214_5.method5065((long) arg0, new Class2_Sub44(Static191.anInt3367));
			Static231.aClass24Array1[Static191.anInt3367++] = local10;
		}
		Static202.aClass154_26.method3745((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(ZLclient!qr;)I")
	public static int method2708(@OriginalArg(1) Class12_Sub1_Sub2_Sub2 arg0) {
		@Pc(13) int local13 = arg0.anInt5388;
		@Pc(17) Class170 local17 = arg0.method4711();
		if (arg0.aBoolean422) {
			local13 = arg0.anInt5397;
		} else if (arg0.anInt5339 == local17.anInt4562 || local17.anInt4530 == arg0.anInt5339 || arg0.anInt5339 == local17.anInt4566 || local17.anInt4535 == arg0.anInt5339) {
			local13 = arg0.anInt5384;
		} else if (arg0.anInt5339 == local17.anInt4564 || arg0.anInt5339 == local17.anInt4569 || local17.anInt4546 == arg0.anInt5339 || local17.anInt4533 == arg0.anInt5339) {
			local13 = arg0.anInt5415;
		}
		return local13;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IILclient!dq;Lclient!lk;)V")
	public static void method2709(@OriginalArg(0) int arg0, @OriginalArg(2) Class53 arg1, @OriginalArg(3) Class2_Sub13 arg2) {
		@Pc(9) Class2_Sub17 local9 = new Class2_Sub17();
		local9.anInt2475 = arg2.method4240();
		local9.anInt2471 = arg2.method4239();
		local9.anIntArray282 = new int[local9.anInt2475];
		local9.anIntArray280 = new int[local9.anInt2475];
		local9.aClass1Array2 = new Class1[local9.anInt2475];
		local9.aByteArrayArrayArray6 = new byte[local9.anInt2475][][];
		local9.anIntArray279 = new int[local9.anInt2475];
		local9.aClass1Array1 = new Class1[local9.anInt2475];
		for (@Pc(56) int local56 = 0; local56 < local9.anInt2475; local56++) {
			try {
				@Pc(62) int local62 = arg2.method4240();
				@Pc(79) String local79;
				@Pc(83) String local83;
				@Pc(85) int local85;
				if (local62 == 0 || local62 == 1 || local62 == 2) {
					local79 = arg2.method4201();
					local83 = arg2.method4201();
					local85 = 0;
					if (local62 == 1) {
						local85 = arg2.method4239();
					}
					local9.anIntArray280[local56] = local62;
					local9.anIntArray279[local56] = local85;
					local9.aClass1Array2[local56] = arg1.method1196(local83, Static354.method5361(local79));
				} else if (local62 == 3 || local62 == 4) {
					local79 = arg2.method4201();
					local83 = arg2.method4201();
					local85 = arg2.method4240();
					@Pc(138) String[] local138 = new String[local85];
					for (@Pc(140) int local140 = 0; local140 < local85; local140++) {
						local138[local140] = arg2.method4201();
					}
					@Pc(159) byte[][] local159 = new byte[local85][];
					@Pc(172) int local172;
					if (local62 == 3) {
						for (@Pc(166) int local166 = 0; local166 < local85; local166++) {
							local172 = arg2.method4239();
							local159[local166] = new byte[local172];
							arg2.method4244(local159[local166], local172);
						}
					}
					local9.anIntArray280[local56] = local62;
					@Pc(201) Class[] local201 = new Class[local85];
					for (local172 = 0; local172 < local85; local172++) {
						local201[local172] = Static354.method5361(local138[local172]);
					}
					local9.aClass1Array1[local56] = arg1.method1184(local83, local201, Static354.method5361(local79));
					local9.aByteArrayArrayArray6[local56] = local159;
				}
			} catch (@Pc(236) ClassNotFoundException local236) {
				local9.anIntArray282[local56] = -1;
			} catch (@Pc(243) SecurityException local243) {
				local9.anIntArray282[local56] = -2;
			} catch (@Pc(250) NullPointerException local250) {
				local9.anIntArray282[local56] = -3;
			} catch (@Pc(257) Exception local257) {
				local9.anIntArray282[local56] = -4;
			} catch (@Pc(264) Throwable local264) {
				local9.anIntArray282[local56] = -5;
			}
		}
		Static79.aClass210_13.method5044(local9);
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(B)V")
	public static void method2711() {
		@Pc(7) int local7 = Static168.anInt3003;
		@Pc(9) int[] local9 = Static7.anIntArray24;
		for (@Pc(11) int local11 = 0; local11 < local7; local11++) {
			@Pc(19) Class12_Sub1_Sub2_Sub2 local19 = Static90.aClass12_Sub1_Sub2_Sub2Array1[local9[local11]];
			if (local19 != null && local19.anInt5335 > 0) {
				local19.anInt5335--;
				if (local19.anInt5335 == 0) {
					local19.aString50 = null;
				}
			}
		}
		for (@Pc(48) int local48 = 0; local48 < Static199.anInt3672; local48++) {
			@Pc(54) int local54 = Static346.anIntArray730[local48];
			@Pc(58) Class12_Sub1_Sub2_Sub1 local58 = Static107.aClass12_Sub1_Sub2_Sub1Array1[local54];
			if (local58 != null && local58.anInt5335 > 0) {
				local58.anInt5335--;
				if (local58.anInt5335 == 0) {
					local58.aString50 = null;
				}
			}
		}
	}
}
