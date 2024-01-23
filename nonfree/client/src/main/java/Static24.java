import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!bn", name = "m", descriptor = "Lclient!th;")
	public static Class169 aClass169_17 = new Class169(64);

	@OriginalMember(owner = "client!bn", name = "q", descriptor = "I")
	public static int anInt469 = 0;

	@OriginalMember(owner = "client!bn", name = "v", descriptor = "I")
	public static int anInt474 = -1;

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IILclient!mf;II)V")
	public static void method455(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class112 arg2, @OriginalArg(3) int arg3) {
		if (Static316.anInt5941 >= 400) {
			return;
		}
		if (arg2.anIntArray283 != null) {
			arg2 = arg2.method2817();
		}
		if (arg2 == null || !arg2.aBoolean247) {
			return;
		}
		@Pc(37) String local37 = arg2.aString108;
		if (arg2.anInt3518 != 0) {
			@Pc(48) String local48 = Static35.anInt641 == 1 ? Static15.aString10 : Static234.aString154;
			local37 = local37 + Static159.method2691(Static229.aClass22_Sub3_Sub2_2.anInt4674, arg2.anInt3518) + " (" + local48 + arg2.anInt3518 + ")";
		}
		if (Static197.anInt3990 == 1) {
			Static59.method1004((short) 23, Static249.aString163, Static108.anInt2142, arg1, Static90.aString151 + " -> <col=ffff00>" + local37, arg0, (long) arg3);
		} else if (Static91.aBoolean136) {
			@Pc(87) Class1_Sub1_Sub15 local87 = Static213.anInt4211 == -1 ? null : Static217.method3426(Static213.anInt4211);
			if ((Static234.anInt4733 & 0x2) != 0 && (local87 == null || arg2.method2821(Static213.anInt4211, local87.anInt3964) != local87.anInt3964)) {
				Static59.method1004((short) 44, Static232.aString115, Static49.anInt937, arg1, Static86.aString53 + " -> <col=ffff00>" + local37, arg0, (long) arg3);
			}
		} else {
			@Pc(131) String[] local131 = arg2.aStringArray29;
			if (Static118.aBoolean180) {
				local131 = Static111.method1804(local131);
			}
			@Pc(144) int local144;
			if (local131 != null) {
				for (local144 = 4; local144 >= 0; local144--) {
					if (local131[local144] != null && (Static35.anInt641 != 0 || !local131[local144].equalsIgnoreCase(Static169.aString109))) {
						@Pc(167) byte local167 = 0;
						if (local144 == 0) {
							local167 = 28;
						}
						if (local144 == 1) {
							local167 = 30;
						}
						@Pc(188) int local188 = -1;
						if (local144 == 2) {
							local167 = 11;
						}
						if (local144 == arg2.anInt3524) {
							local188 = arg2.anInt3523;
						}
						if (arg2.anInt3502 == local144) {
							local188 = arg2.anInt3508;
						}
						if (local144 == 3) {
							local167 = 32;
						}
						if (local144 == 4) {
							local167 = 4;
						}
						Static59.method1004(local167, local131[local144], local188, arg1, "<col=ffff00>" + local37, arg0, (long) arg3);
					}
				}
			}
			if (Static35.anInt641 == 0 && local131 != null) {
				for (local144 = 4; local144 >= 0; local144--) {
					if (local131[local144] != null && local131[local144].equalsIgnoreCase(Static169.aString109)) {
						@Pc(290) short local290 = 0;
						if (Static229.aClass22_Sub3_Sub2_2.anInt4674 < arg2.anInt3518) {
							local290 = 2000;
						}
						@Pc(299) short local299 = 0;
						if (local144 == 0) {
							local299 = 28;
						}
						if (local144 == 1) {
							local299 = 30;
						}
						if (local144 == 2) {
							local299 = 11;
						}
						if (local144 == 3) {
							local299 = 32;
						}
						if (local144 == 4) {
							local299 = 4;
						}
						if (local299 != 0) {
							local299 += local290;
						}
						Static59.method1004(local299, local131[local144], arg2.anInt3496, arg1, "<col=ffff00>" + local37, arg0, (long) arg3);
					}
				}
			}
			Static59.method1004((short) 1001, Static300.aString191, Static243.anInt5650, arg1, "<col=ffff00>" + local37, arg0, (long) arg3);
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IZI)V")
	public static void method458(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class24 local13 = Static68.aClass24ArrayArrayArray1[Static295.anInt5586][arg1][arg0];
		if (local13 == null) {
			Static311.method4589(Static295.anInt5586, arg1, arg0);
			return;
		}
		@Pc(25) int local25 = -99999999;
		@Pc(27) Class1_Sub1_Sub18 local27 = null;
		@Pc(32) Class1_Sub1_Sub18 local32;
		for (local32 = (Class1_Sub1_Sub18) local13.method460(); local32 != null; local32 = (Class1_Sub1_Sub18) local13.method464()) {
			@Pc(41) Class149 local41 = Static271.method4006(local32.aClass22_Sub2_1.anInt543);
			@Pc(44) int local44 = local41.anInt4764;
			if (local41.anInt4790 == 1) {
				local44 *= local32.aClass22_Sub2_1.anInt536 + 1;
			}
			if (local25 < local44) {
				local25 = local44;
				local27 = local32;
			}
		}
		if (local27 == null) {
			Static311.method4589(Static295.anInt5586, arg1, arg0);
			return;
		}
		local13.method466(local27);
		local32 = (Class1_Sub1_Sub18) local13.method460();
		@Pc(99) Class22_Sub2 local99 = null;
		@Pc(101) Class22_Sub2 local101 = null;
		while (local32 != null) {
			@Pc(107) Class22_Sub2 local107 = local32.aClass22_Sub2_1;
			if (local27.aClass22_Sub2_1.anInt543 != local107.anInt543) {
				if (local101 == null) {
					local101 = local107;
				}
				if (local107.anInt543 != local101.anInt543 && local99 == null) {
					local99 = local107;
				}
			}
			local32 = (Class1_Sub1_Sub18) local13.method464();
		}
		@Pc(151) long local151 = (long) (arg1 + (arg0 << 7) + 1610612736);
		Static171.method2882(Static295.anInt5586, arg1, arg0, Static104.method1648(Static295.anInt5586, arg1 * 128 + 64, arg0 * 128 + 64), local27.aClass22_Sub2_1, local151, local101, local99);
	}
}
