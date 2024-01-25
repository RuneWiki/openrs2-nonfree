import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static446 {

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(III)Z")
	public static boolean method7428(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(IIIIZ[B)Z")
	public static boolean method7434(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(7) boolean local7 = true;
		@Pc(12) Class5_Sub3 local12 = new Class5_Sub3(arg4);
		@Pc(14) int local14 = -1;
		label70: while (true) {
			@Pc(18) int local18 = local12.method4199();
			if (local18 == 0) {
				return local7;
			}
			local14 += local18;
			@Pc(29) int local29 = 0;
			@Pc(31) boolean local31 = false;
			while (true) {
				@Pc(64) int local64;
				@Pc(98) Class283 local98;
				do {
					@Pc(68) int local68;
					@Pc(72) int local72;
					do {
						do {
							do {
								do {
									@Pc(37) int local37;
									while (local31) {
										local37 = local12.method4231();
										if (local37 == 0) {
											continue label70;
										}
										local12.method4220();
									}
									local37 = local12.method4231();
									if (local37 == 0) {
										continue label70;
									}
									local29 += local37 - 1;
									@Pc(52) int local52 = local29 & 0x3F;
									@Pc(58) int local58 = local29 >> 6 & 0x3F;
									local64 = local12.method4220() >> 2;
									local68 = arg2 + local58;
									local72 = local52 + arg0;
								} while (local68 <= 0);
							} while (local72 <= 0);
						} while (arg1 - 1 <= local68);
					} while (local72 >= arg3 - 1);
					local98 = Static453.aClass88_3.method2294(local14);
				} while (local64 == 22 && !Static300.aClass5_Sub28_Sub1_1.aBoolean333 && local98.anInt8152 == 0 && local98.anInt8165 != 1 && !local98.aBoolean586);
				if (!local98.method6610()) {
					Static246.anInt5007++;
					local7 = false;
				}
				local31 = true;
			}
		}
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "([BBI[BIIIII)V")
	public static void method7435(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg6 >> 2);
		@Pc(15) int local15 = -(arg6 & 0x3);
		for (@Pc(31) int local31 = -arg4; local31 < 0; local31++) {
			@Pc(39) int local39;
			for (@Pc(35) int local35 = local10; local35 < 0; local35++) {
				local39 = arg1++;
				arg2[local39] += arg0[arg7++];
				@Pc(51) int local51 = arg1++;
				arg2[local51] += arg0[arg7++];
				@Pc(63) int local63 = arg1++;
				arg2[local63] += arg0[arg7++];
				@Pc(75) int local75 = arg1++;
				arg2[local75] += arg0[arg7++];
			}
			for (@Pc(93) int local93 = local15; local93 < 0; local93++) {
				local39 = arg1++;
				arg2[local39] += arg0[arg7++];
			}
			arg1 += arg3;
			arg7 += arg5;
		}
	}
}
