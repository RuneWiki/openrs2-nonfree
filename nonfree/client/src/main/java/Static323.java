import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static323 {

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIIIII)V")
	public static void method4805(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static310.method4637(arg1);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg1 - arg0;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(24) int local24 = arg1;
		@Pc(27) int local27 = -arg1;
		@Pc(29) int local29 = local15;
		@Pc(32) int local32 = -local15;
		@Pc(34) int local34 = -1;
		@Pc(53) int local53;
		@Pc(61) int local61;
		@Pc(69) int local69;
		@Pc(77) int local77;
		if (arg4 >= Static120.anInt2491 && arg4 <= Static71.anInt1350) {
			@Pc(44) int[] local44 = Static280.anIntArrayArray25[arg4];
			local53 = Static57.method966(Static194.anInt3788, Static330.anInt6025, arg3 - arg1);
			local61 = Static57.method966(Static194.anInt3788, Static330.anInt6025, arg3 + arg1);
			local69 = Static57.method966(Static194.anInt3788, Static330.anInt6025, arg3 - local15);
			local77 = Static57.method966(Static194.anInt3788, Static330.anInt6025, local15 + arg3);
			Static329.method4871(local53, local69, local44, arg5);
			Static329.method4871(local69, local77, local44, arg2);
			Static329.method4871(local77, local61, local44, arg5);
		}
		@Pc(97) int local97 = -1;
		while (local10 < local24) {
			local97 += 2;
			local34 += 2;
			local27 += local34;
			local32 += local97;
			if (local32 >= 0 && local29 >= 1) {
				local29--;
				Static464.anIntArray523[local29] = local10;
				local32 -= local29 << 1;
			}
			local10++;
			@Pc(246) int local246;
			@Pc(255) int local255;
			@Pc(266) int[] local266;
			@Pc(143) int local143;
			if (local27 >= 0) {
				local24--;
				local27 -= local24 << 1;
				local143 = arg4 - local24;
				local53 = arg4 + local24;
				if (local53 >= Static120.anInt2491 && Static71.anInt1350 >= local143) {
					if (local15 <= local24) {
						local61 = Static57.method966(Static194.anInt3788, Static330.anInt6025, local10 + arg3);
						local69 = Static57.method966(Static194.anInt3788, Static330.anInt6025, arg3 - local10);
						if (Static71.anInt1350 >= local53) {
							Static329.method4871(local69, local61, Static280.anIntArrayArray25[local53], arg5);
						}
						if (Static120.anInt2491 <= local143) {
							Static329.method4871(local69, local61, Static280.anIntArrayArray25[local143], arg5);
						}
					} else {
						local61 = Static464.anIntArray523[local24];
						local69 = Static57.method966(Static194.anInt3788, Static330.anInt6025, arg3 + local10);
						local77 = Static57.method966(Static194.anInt3788, Static330.anInt6025, arg3 - local10);
						local246 = Static57.method966(Static194.anInt3788, Static330.anInt6025, arg3 + local61);
						local255 = Static57.method966(Static194.anInt3788, Static330.anInt6025, arg3 - local61);
						if (Static71.anInt1350 >= local53) {
							local266 = Static280.anIntArrayArray25[local53];
							Static329.method4871(local77, local255, local266, arg5);
							Static329.method4871(local255, local246, local266, arg2);
							Static329.method4871(local246, local69, local266, arg5);
						}
						if (Static120.anInt2491 <= local143) {
							local266 = Static280.anIntArrayArray25[local143];
							Static329.method4871(local77, local255, local266, arg5);
							Static329.method4871(local255, local246, local266, arg2);
							Static329.method4871(local246, local69, local266, arg5);
						}
					}
				}
			}
			local143 = arg4 - local10;
			local53 = local10 + arg4;
			if (local53 >= Static120.anInt2491 && local143 <= Static71.anInt1350) {
				local61 = arg3 + local24;
				local69 = arg3 - local24;
				if (Static330.anInt6025 <= local61 && Static194.anInt3788 >= local69) {
					local61 = Static57.method966(Static194.anInt3788, Static330.anInt6025, local61);
					local69 = Static57.method966(Static194.anInt3788, Static330.anInt6025, local69);
					if (local15 <= local10) {
						if (Static71.anInt1350 >= local53) {
							Static329.method4871(local69, local61, Static280.anIntArrayArray25[local53], arg5);
						}
						if (Static120.anInt2491 <= local143) {
							Static329.method4871(local69, local61, Static280.anIntArrayArray25[local143], arg5);
						}
					} else {
						local77 = local29 >= local10 ? local29 : Static464.anIntArray523[local10];
						local246 = Static57.method966(Static194.anInt3788, Static330.anInt6025, local77 + arg3);
						local255 = Static57.method966(Static194.anInt3788, Static330.anInt6025, arg3 - local77);
						if (Static71.anInt1350 >= local53) {
							local266 = Static280.anIntArrayArray25[local53];
							Static329.method4871(local69, local255, local266, arg5);
							Static329.method4871(local255, local246, local266, arg2);
							Static329.method4871(local246, local61, local266, arg5);
						}
						if (Static120.anInt2491 <= local143) {
							local266 = Static280.anIntArrayArray25[local143];
							Static329.method4871(local69, local255, local266, arg5);
							Static329.method4871(local255, local246, local266, arg2);
							Static329.method4871(local246, local61, local266, arg5);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(B)V")
	public static void method4806() {
		if (Static520.aClass247_5 != null) {
			Static520.aClass247_5.method5318();
		}
		if (Static567.aThread9 == null) {
			return;
		}
		while (true) {
			try {
				Static567.aThread9.join();
				break;
			} catch (@Pc(14) InterruptedException local14) {
			}
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IZLjava/lang/String;I)I")
	public static int method4807(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(24) boolean local24 = false;
		@Pc(26) boolean local26 = false;
		@Pc(28) int local28 = 0;
		@Pc(31) int local31 = arg1.length();
		for (@Pc(33) int local33 = 0; local33 < local31; local33++) {
			@Pc(39) char local39 = arg1.charAt(local33);
			if (local33 == 0) {
				if (local39 == '-') {
					local24 = true;
					continue;
				}
				if (local39 == '+') {
					continue;
				}
			}
			@Pc(86) int local86;
			if (local39 >= '0' && local39 <= '9') {
				local86 = local39 - '0';
			} else if (local39 >= 'A' && local39 <= 'Z') {
				local86 = local39 - '7';
			} else if (local39 >= 'a' && local39 <= 'z') {
				local86 = local39 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (local86 >= arg0) {
				throw new NumberFormatException();
			}
			if (local24) {
				local86 = -local86;
			}
			@Pc(114) int local114 = local86 + arg0 * local28;
			if (local114 / arg0 != local28) {
				throw new NumberFormatException();
			}
			local28 = local114;
			local26 = true;
		}
		if (!local26) {
			throw new NumberFormatException();
		}
		return local28;
	}
}
