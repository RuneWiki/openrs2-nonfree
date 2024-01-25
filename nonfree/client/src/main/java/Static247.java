import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static247 {

	@OriginalMember(owner = "client!pn", name = "V", descriptor = "[[B")
	public static byte[][] aByteArrayArray19;

	@OriginalMember(owner = "client!pn", name = "R", descriptor = "Ljava/lang/String;")
	public static String aString189 = "K";

	@OriginalMember(owner = "client!pn", name = "W", descriptor = "Z")
	public static boolean aBoolean436 = false;

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(BI)V")
	public static void method4268() {
		@Pc(5) Class154 local5 = Static100.aClass154_35;
		synchronized (Static100.aClass154_35) {
			Static100.aClass154_35.method4220(5);
		}
		local5 = Static195.aClass154_67;
		synchronized (Static195.aClass154_67) {
			Static195.aClass154_67.method4220(5);
		}
		local5 = Static277.aClass154_85;
		synchronized (Static277.aClass154_85) {
			Static277.aClass154_85.method4220(5);
		}
		local5 = Static81.aClass154_26;
		synchronized (Static81.aClass154_26) {
			Static81.aClass154_26.method4220(5);
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(IIIII)V")
	public static void method4269(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 >= Static229.anInt4777 && arg1 <= Static165.anInt3366) {
			@Pc(21) int local21 = Static181.method3367(Static338.anInt5369, arg0, Static295.anInt5964);
			@Pc(29) int local29 = Static181.method3367(Static338.anInt5369, arg2, Static295.anInt5964);
			Static292.method4981(local21, arg1, local29, arg3);
		}
	}

	@OriginalMember(owner = "client!pn", name = "d", descriptor = "(II)Lclient!nq;")
	public static Class142 method4270(@OriginalArg(0) int arg0) {
		@Pc(5) Class154 local5 = Static154.aClass154_55;
		@Pc(14) Class142 local14;
		synchronized (Static154.aClass154_55) {
			local14 = (Class142) Static154.aClass154_55.method4222((long) arg0);
		}
		if (local14 != null) {
			return local14;
		}
		@Pc(34) byte[] local34 = Static171.aClass11_76.method288(Static39.method735(arg0), Static89.method1577(arg0));
		local14 = new Class142();
		local14.anInt4505 = arg0;
		if (local34 != null) {
			local14.method3718(new Class4_Sub7(local34));
		}
		local14.method3732();
		if (local14.anInt4468 != -1) {
			local14.method3734(method4270(local14.anInt4464), method4270(local14.anInt4468));
		}
		if (local14.anInt4470 != -1) {
			local14.method3727(method4270(local14.anInt4470), method4270(local14.anInt4462));
		}
		if (!Static277.aBoolean496 && local14.aBoolean380) {
			local14.anIntArray372 = null;
			local14.aStringArray36 = Static321.aStringArray43;
			local14.aStringArray37 = Static189.aStringArray30;
			local14.aString165 = Static101.aString107;
			local14.aBoolean381 = false;
			local14.anInt4511 = 0;
		}
		@Pc(115) Class154 local115 = Static154.aClass154_55;
		synchronized (Static154.aClass154_55) {
			Static154.aClass154_55.method4221((long) arg0, local14);
			return local14;
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(Lclient!vm;IBIILclient!qs;II)V")
	public static void method4271(@OriginalArg(0) Class92 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class174 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(10) Interface5 local10 = null;
		if (arg3 == 0) {
			local10 = (Interface5) Static122.method2458(arg6, arg2, arg5);
		}
		if (arg3 == 1) {
			local10 = (Interface5) Static186.method4780(arg6, arg2, arg5);
		}
		if (arg3 == 2) {
			local10 = (Interface5) Static166.method3153(arg6, arg2, arg5, io.class);
		}
		if (arg3 == 3) {
			local10 = (Interface5) Static5.method210(arg6, arg2, arg5);
		}
		if (local10 == null) {
			return;
		}
		@Pc(66) int local66 = local10.method4733();
		@Pc(70) int local70 = local10.method4734();
		@Pc(76) Class56 local76 = Static320.method5290(local10.method4729());
		if (local76.method1080()) {
			Static244.method4229(local76, arg5, arg2, arg6);
		}
		if (local10.method4728()) {
			local10.method4732(arg0);
		}
		if (arg3 != 0) {
			if (arg3 == 1) {
				Static179.method3343(arg6, arg2, arg5);
				return;
			}
			if (arg3 == 2) {
				Static46.method891(arg6, arg2, arg5, io.class);
				if (local76.anInt1350 == 0 || Static92.anInt2048 <= arg2 + local76.anInt1313 || local76.anInt1313 + arg5 >= Static290.anInt5893 || local76.anInt1330 + arg2 >= Static92.anInt2048 || Static290.anInt5893 <= local76.anInt1330 + arg5) {
					return;
				}
				arg4.method4660(arg5, local76.anInt1313, local70, arg2, local76.anInt1330, local76.aBoolean100, !local76.aBoolean105);
			} else if (arg3 == 3) {
				Static2.method4192(arg6, arg2, arg5);
				if (local76.anInt1350 == 1) {
					arg4.method4672(arg2, arg5);
					return;
				}
			}
			return;
		}
		Static117.method2096(arg6, arg2, arg5);
		if (local76.anInt1350 != 0) {
			arg4.method4661(local66, local76.aBoolean100, arg2, arg5, !local76.aBoolean105, local70);
			return;
		}
	}

	@OriginalMember(owner = "client!pn", name = "e", descriptor = "(II)Lclient!qf;")
	public static Class166 method4272(@OriginalArg(0) int arg0) {
		@Pc(5) Class154 local5 = Static339.aClass154_103;
		@Pc(14) Class166 local14;
		synchronized (Static339.aClass154_103) {
			local14 = (Class166) Static339.aClass154_103.method4222((long) arg0);
		}
		if (local14 != null) {
			return local14;
		}
		@Pc(30) byte[] local30 = Static38.aClass11_14.method288(arg0, 3);
		local14 = new Class166();
		if (local30 != null) {
			local14.method4370(new Class4_Sub7(local30));
		}
		@Pc(45) Class154 local45 = Static339.aClass154_103;
		synchronized (Static339.aClass154_103) {
			Static339.aClass154_103.method4221((long) arg0, local14);
			return local14;
		}
	}

	@OriginalMember(owner = "client!pn", name = "d", descriptor = "(I)V")
	public static void method4273() {
		@Pc(5) Class154 local5 = Static202.aClass154_69;
		synchronized (Static202.aClass154_69) {
			Static202.aClass154_69.method4212();
		}
		local5 = Static108.aClass154_36;
		synchronized (Static108.aClass154_36) {
			Static108.aClass154_36.method4212();
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(ZZ)V")
	public static void method4274(@OriginalArg(0) boolean arg0) {
		@Pc(18) byte local18;
		@Pc(20) byte[][] local20;
		if (arg0) {
			local18 = 1;
			local20 = aByteArrayArray19;
		} else {
			local20 = Static235.aByteArrayArray25;
			local18 = 4;
		}
		@Pc(28) int[] local28 = null;
		for (@Pc(30) int local30 = 0; local30 < local18; local30++) {
			Static294.method3383();
			for (@Pc(35) int local35 = 0; local35 < Static92.anInt2048 >> 3; local35++) {
				for (@Pc(39) int local39 = 0; local39 < Static290.anInt5893 >> 3; local39++) {
					@Pc(43) boolean local43 = false;
					@Pc(51) int local51 = Static254.anIntArrayArrayArray16[local30][local35][local39];
					if (local51 != -1) {
						@Pc(60) int local60 = local51 >> 24 & 0x3;
						if (!arg0 || local60 == 0) {
							@Pc(73) int local73 = local51 >> 1 & 0x3;
							@Pc(79) int local79 = local51 >> 14 & 0x3FF;
							@Pc(85) int local85 = local51 >> 3 & 0x7FF;
							@Pc(95) int local95 = (local79 / 8 << 8) + local85 / 8;
							for (@Pc(97) int local97 = 0; local97 < Static313.anIntArray505.length; local97++) {
								if (local95 == Static313.anIntArray505[local97] && local20[local97] != null) {
									@Pc(128) int[] local128 = Static190.method3455(local79, arg0, local85, local39 * 8, local35 * 8, local60, local73, Static164.aClass92_7, Static345.aClass174Array1, local20[local97], local30);
									local43 = true;
									if (local28 == null && local128 != null) {
										local28 = local128;
									}
									break;
								}
							}
						}
					}
					if (!local43) {
						Static183.method3401(local39 * 8, 8, local35 * 8, 8, local30);
					}
				}
			}
		}
		if (local28 == null) {
			Static93.aClass155_1 = null;
		} else {
			Static93.aClass155_1 = Static187.method3427(local28[1], local28[0], local28[2], local28[3]);
			Static313.anInt6288 = local28[4];
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(ZLjava/lang/String;I)V")
	public static void method4276(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1) {
		Static54.aClass11_20.anInt298 = 1;
		@Pc(11) String local11 = arg1.toLowerCase();
		@Pc(14) short[] local14 = new short[16];
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < Static94.anInt2090; local18++) {
			@Pc(24) Class142 local24 = method4270(local18);
			if ((!arg0 || local24.aBoolean381) && local24.anInt4468 == -1 && local24.anInt4470 == -1 && local24.anInt4473 == 0 && local24.aString165.toLowerCase().indexOf(local11) != -1) {
				if (local16 >= 250) {
					Static120.anInt2709 = -1;
					Static162.aShortArray57 = null;
					return;
				}
				if (local16 >= local14.length) {
					@Pc(68) short[] local68 = new short[local14.length * 2];
					for (@Pc(70) int local70 = 0; local70 < local16; local70++) {
						local68[local70] = local14[local70];
					}
					local14 = local68;
				}
				local14[local16++] = (short) local18;
			}
		}
		Static120.anInt2709 = local16;
		Static270.anInt6610 = 0;
		Static162.aShortArray57 = local14;
		@Pc(103) String[] local103 = new String[Static120.anInt2709];
		for (@Pc(105) int local105 = 0; local105 < Static120.anInt2709; local105++) {
			local103[local105] = method4270(local14[local105]).aString165;
		}
		Static322.method5311(local103, Static162.aShortArray57);
		Static54.aClass11_20.method285();
		Static54.aClass11_20.anInt298 = 2;
	}
}
