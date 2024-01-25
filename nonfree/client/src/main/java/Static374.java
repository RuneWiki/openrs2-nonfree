import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static374 {

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(II[BIII)V")
	public static void method4083(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 <= arg2) {
			return;
		}
		arg0 += arg2;
		@Pc(24) int local24 = arg3 - arg2 >> 2;
		while (true) {
			local24--;
			if (local24 < 0) {
				local24 = arg3 - arg2 & 0x3;
				while (true) {
					local24--;
					if (local24 < 0) {
						return;
					}
					arg1[arg0++] = 1;
				}
			}
			@Pc(29) int local29 = arg0 + 1;
			arg1[arg0] = 1;
			@Pc(34) int local34 = local29 + 1;
			arg1[local29] = 1;
			@Pc(39) int local39 = local34 + 1;
			arg1[local34] = 1;
			arg0 = local39 + 1;
			arg1[local39] = 1;
		}
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(IIIIZIILclient!ha;I)V")
	public static void method4084(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class16 arg6, @OriginalArg(8) int arg7) {
		@Pc(11) Interface27 local11 = (Interface27) Static418.method6567(arg5, arg2, arg4);
		@Pc(24) Class352 local24;
		@Pc(30) int local30;
		@Pc(34) int local34;
		@Pc(40) int local40;
		if (local11 != null) {
			local24 = Static437.aClass199_3.method5342(local11.method8342());
			local30 = local11.method8337() & 0x3;
			local34 = local11.method8343();
			if (local24.anInt10094 == -1) {
				local40 = arg7;
				if (local24.anInt10102 > 0) {
					local40 = arg3;
				}
				if (local34 == 0 || local34 == 2) {
					if (local30 == 0) {
						arg6.method6116(arg1, arg0, local40, 4);
					} else if (local30 == 1) {
						arg6.method6089(4, arg1, arg0, local40);
					} else if (local30 == 2) {
						arg6.method6116(arg1 + 3, arg0, local40, 4);
					} else if (local30 == 3) {
						arg6.method6089(4, arg1, arg0 + 3, local40);
					}
				}
				if (local34 == 3) {
					if (local30 == 0) {
						arg6.method6114(local40, arg1, 1, arg0, 1);
					} else if (local30 == 1) {
						arg6.method6114(local40, arg1 + 3, 1, arg0, 1);
					} else if (local30 == 2) {
						arg6.method6114(local40, arg1 + 3, 1, arg0 + 3, 1);
					} else if (local30 == 3) {
						arg6.method6114(local40, arg1, 1, arg0 + 3, 1);
					}
				}
				if (local34 == 2) {
					if (local30 == 0) {
						arg6.method6089(4, arg1, arg0, local40);
					} else if (local30 == 1) {
						arg6.method6116(arg1 + 3, arg0, local40, 4);
					} else if (local30 == 2) {
						arg6.method6089(4, arg1, arg0 + 3, local40);
					} else if (local30 == 3) {
						arg6.method6116(arg1, arg0, local40, 4);
					}
				}
			} else {
				Static519.method7413(arg0, local30, arg1, arg6, local24);
			}
		}
		local11 = (Interface27) Static575.method7984(arg5, arg2, arg4, wha.class);
		if (local11 != null) {
			local24 = Static437.aClass199_3.method5342(local11.method8342());
			local30 = local11.method8337() & 0x3;
			local34 = local11.method8343();
			if (local24.anInt10094 != -1) {
				Static519.method7413(arg0, local30, arg1, arg6, local24);
			} else if (local34 == 9) {
				local40 = -1118482;
				if (local24.anInt10102 > 0) {
					local40 = -1179648;
				}
				if (local30 == 0 || local30 == 2) {
					arg6.method6105(arg1, arg0, arg0 + 3, local40, arg1 + 3);
				} else {
					arg6.method6105(arg1, arg0 + 3, arg0, local40, arg1 + 3);
				}
			}
		}
		local11 = (Interface27) Static484.method7154(arg5, arg2, arg4);
		if (local11 == null) {
			return;
		}
		local24 = Static437.aClass199_3.method5342(local11.method8342());
		local30 = local11.method8337() & 0x3;
		if (local24.anInt10094 != -1) {
			Static519.method7413(arg0, local30, arg1, arg6, local24);
			return;
		}
	}
}
