import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static302 {

	@OriginalMember(owner = "client!kda", name = "b", descriptor = "F")
	public static float aFloat84;

	@OriginalMember(owner = "client!kda", name = "c", descriptor = "[C")
	public static final char[] aCharArray4 = new char[] { '[', ']', '#' };

	@OriginalMember(owner = "client!kda", name = "h", descriptor = "Z")
	public static boolean aBoolean416 = false;

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(ILclient!ic;Z)V")
	public static void method4634(@OriginalArg(1) Class8_Sub1_Sub3_Sub2_Sub1 arg0, @OriginalArg(2) boolean arg1) {
		if (Static481.anInt8130 >= 400) {
			return;
		}
		if (arg0 != Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1) {
			@Pc(179) String local179;
			if (arg0.anInt4218 == 0) {
				@Pc(72) boolean local72 = true;
				if (Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.anInt4197 != -1 && arg0.anInt4197 != -1) {
					@Pc(97) int local97 = Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.anInt4197 >= arg0.anInt4197 ? arg0.anInt4197 : Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.anInt4197;
					@Pc(104) int local104 = Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.anInt4205 - arg0.anInt4205;
					if (local104 < 0) {
						local104 = -local104;
					}
					if (local97 < local104) {
						local72 = false;
					}
				}
				@Pc(135) String local135 = Static256.aClass333_3 == Static521.aClass333_6 ? Static582.aClass335_31.method8349(Static323.anInt5795) : Static582.aClass335_29.method8349(Static323.anInt5795);
				if (arg0.anInt4185 <= arg0.anInt4205) {
					local179 = arg0.method3599() + (local72 ? Static464.method6792(arg0.anInt4205, Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.anInt4205) : "<col=ffffff>") + " (" + local135 + arg0.anInt4205 + ")";
				} else {
					local179 = arg0.method3599() + (local72 ? Static464.method6792(arg0.anInt4205, Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.anInt4205) : "<col=ffffff>") + " (" + local135 + arg0.anInt4205 + "+" + (arg0.anInt4185 - arg0.anInt4205) + ")";
				}
			} else if (arg0.anInt4218 == -1) {
				local179 = arg0.method3599();
			} else {
				local179 = arg0.method3599() + " (" + Static582.aClass335_30.method8349(Static323.anInt5795) + arg0.anInt4218 + ")";
			}
			if (Static199.aBoolean706 && !arg1 && (Static382.anInt9821 & 0x8) != 0) {
				Static152.method2122(0, (long) arg0.anInt6994, false, (long) arg0.anInt6994, Static211.aString54, 0, false, Static352.aString75 + " -> <col=ffffff>" + local179, Static586.anInt9800, 13, true, -1);
			}
			if (arg1) {
				Static152.method2122(0, (long) arg0.anInt6994, true, 0L, "<col=cccccc>" + local179, 0, false, "", -1, -1, false, 0);
			} else {
				for (@Pc(349) int local349 = 7; local349 >= 0; local349--) {
					if (Static560.aStringArray67[local349] != null) {
						@Pc(359) short local359 = 0;
						if (Static256.aClass333_3 == Static569.aClass333_7 && Static560.aStringArray67[local349].equalsIgnoreCase(Static582.aClass335_24.method8349(Static323.anInt5795))) {
							if (Static417.aBoolean554 && Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.anInt4205 < arg0.anInt4205) {
								local359 = 2000;
							}
							if (Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.anInt4223 == 0 || arg0.anInt4223 == 0) {
								if (arg0.aBoolean325) {
									local359 = 2000;
								}
							} else if (arg0.anInt4223 == Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.anInt4223) {
								local359 = 2000;
							} else {
								local359 = 0;
							}
						} else if (Static478.aBooleanArray19[local349]) {
							local359 = 2000;
						}
						@Pc(433) short local433 = (short) (local359 + Static447.aShortArray99[local349]);
						@Pc(445) int local445 = Static351.anIntArray340[local349] == -1 ? Static640.anInt10423 : Static351.anIntArray340[local349];
						Static152.method2122(0, (long) arg0.anInt6994, false, (long) arg0.anInt6994, Static560.aStringArray67[local349], 0, false, "<col=ffffff>" + local179, local445, local433, true, -1);
					}
				}
			}
			if (!arg1) {
				for (@Pc(489) Class5_Sub5_Sub19 local489 = (Class5_Sub5_Sub19) Static199.aClass102_63.method1916(); local489 != null; local489 = (Class5_Sub5_Sub19) Static199.aClass102_63.method1915()) {
					if (local489.anInt9210 == 12) {
						local489.aString121 = "<col=ffffff>" + local179;
						return;
					}
				}
			}
		} else if (Static199.aBoolean706 && (Static382.anInt9821 & 0x10) != 0) {
			Static152.method2122(0, (long) arg0.anInt6994, false, 0L, Static211.aString54, 0, false, Static352.aString75 + " -> <col=ffffff>" + Static582.aClass335_38.method8349(Static323.anInt5795), Static586.anInt9800, 9, true, -1);
		}
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(IIILclient!la;)Lclient!ija;")
	public static Class5_Sub5_Sub12 method4636(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class208 arg2) {
		@Pc(23) Class5_Sub23 local23 = new Class5_Sub23(arg2.method4991(arg1, arg0, 9));
		@Pc(57) Class5_Sub5_Sub12 local57 = new Class5_Sub5_Sub12(arg0, local23.method8497(), local23.method8497(), local23.method8527(), local23.method8527(), local23.method8529() == 1, local23.method8529(), local23.method8529());
		@Pc(61) int local61 = local23.method8529();
		for (@Pc(63) int local63 = 0; local63 < local61; local63++) {
			local57.aClass102_31.method1921(new Class5_Sub55(local23.method8529(), local23.method8519(), local23.method8519(), local23.method8519(), local23.method8519(), local23.method8519(), local23.method8519(), local23.method8519(), local23.method8519()));
		}
		local57.method3737();
		return local57;
	}
}
