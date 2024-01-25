import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static379 {

	@OriginalMember(owner = "client!mo", name = "l", descriptor = "Lclient!mp;")
	public static final Class236 aClass236_8 = new Class236();

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(IIIIIIILclient!ha;I)V")
	public static void method6427(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class101 arg6, @OriginalArg(8) int arg7) {
		@Pc(11) Interface23 local11 = (Interface23) Static584.method4102(arg5, arg2, arg1);
		@Pc(20) Class331 local20;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(45) int local45;
		if (local11 != null) {
			local20 = Static251.aClass328_1.method8261(local11.method9451());
			local26 = local11.method9454() & 0x3;
			local30 = local11.method9452();
			if (local20.anInt9453 == -1) {
				local45 = arg3;
				if (local20.lb > 0) {
					local45 = arg0;
				}
				if (local30 == 0 || local30 == 2) {
					if (local26 == 0) {
						arg6.method8113(4, arg4, local45, arg7);
					} else if (local26 == 1) {
						arg6.method8099(arg7, 4, arg4, local45);
					} else if (local26 == 2) {
						arg6.method8113(4, arg4 + 3, local45, arg7);
					} else if (local26 == 3) {
						arg6.method8099(arg7 + 3, 4, arg4, local45);
					}
				}
				if (local30 == 3) {
					if (local26 == 0) {
						arg6.method8061(arg7, 1, local45, arg4, 1);
					} else if (local26 == 1) {
						arg6.method8061(arg7, 1, local45, arg4 + 3, 1);
					} else if (local26 == 2) {
						arg6.method8061(arg7 + 3, 1, local45, arg4 + 3, 1);
					} else if (local26 == 3) {
						arg6.method8061(arg7 + 3, 1, local45, arg4, 1);
					}
				}
				if (local30 == 2) {
					if (local26 == 0) {
						arg6.method8099(arg7, 4, arg4, local45);
					} else if (local26 == 1) {
						arg6.method8113(4, arg4 + 3, local45, arg7);
					} else if (local26 == 2) {
						arg6.method8099(arg7 + 3, 4, arg4, local45);
					} else if (local26 == 3) {
						arg6.method8113(4, arg4, local45, arg7);
					}
				}
			} else {
				Static350.method6052(arg6, arg7, local26, local20, arg4);
			}
		}
		local11 = (Interface23) Static174.method3415(arg5, arg2, arg1, vu.class);
		if (local11 != null) {
			local20 = Static251.aClass328_1.method8261(local11.method9451());
			local26 = local11.method9454() & 0x3;
			local30 = local11.method9452();
			if (local20.anInt9453 != -1) {
				Static350.method6052(arg6, arg7, local26, local20, arg4);
			} else if (local30 == 9) {
				local45 = -1118482;
				if (local20.lb > 0) {
					local45 = -1179648;
				}
				if (local26 == 0 || local26 == 2) {
					arg6.method8096(arg4, local45, arg4 + 3, arg7, arg7 + 3);
				} else {
					arg6.method8096(arg4, local45, arg4 + 3, arg7 + 3, arg7);
				}
			}
		}
		local11 = (Interface23) Static428.method7017(arg5, arg2, arg1);
		if (local11 == null) {
			return;
		}
		local20 = Static251.aClass328_1.method8261(local11.method9451());
		local26 = local11.method9454() & 0x3;
		if (local20.anInt9453 != -1) {
			Static350.method6052(arg6, arg7, local26, local20, arg4);
			return;
		}
	}

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "(IIIIIII)V")
	public static void method6429(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(18) int local18 = Static198.method3808(Static631.anInt10922, Static427.anInt7845, arg3);
		@Pc(24) int local24 = Static198.method3808(Static631.anInt10922, Static427.anInt7845, arg0);
		@Pc(32) int local32 = Static198.method3808(Static407.anInt7583, Static457.anInt8209, arg5);
		@Pc(40) int local40 = Static198.method3808(Static407.anInt7583, Static457.anInt8209, arg2);
		@Pc(48) int local48 = Static198.method3808(Static631.anInt10922, Static427.anInt7845, arg1 + arg3);
		@Pc(59) int local59 = Static198.method3808(Static631.anInt10922, Static427.anInt7845, arg0 - arg1);
		for (@Pc(61) int local61 = local18; local61 < local48; local61++) {
			Static567.method8614(local32, local40, Static186.anIntArrayArray12[local61], arg4);
		}
		for (@Pc(77) int local77 = local24; local77 > local59; local77--) {
			Static567.method8614(local32, local40, Static186.anIntArrayArray12[local77], arg4);
		}
		@Pc(99) int local99 = Static198.method3808(Static407.anInt7583, Static457.anInt8209, arg1 + arg5);
		@Pc(108) int local108 = Static198.method3808(Static407.anInt7583, Static457.anInt8209, arg2 - arg1);
		for (@Pc(110) int local110 = local48; local110 <= local59; local110++) {
			@Pc(116) int[] local116 = Static186.anIntArrayArray12[local110];
			Static567.method8614(local32, local99, local116, arg4);
			Static567.method8614(local108, local40, local116, arg4);
		}
	}
}
