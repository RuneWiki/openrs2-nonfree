import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!ch", name = "p", descriptor = "I")
	public static int anInt611;

	@OriginalMember(owner = "client!ch", name = "r", descriptor = "[I")
	public static int[] anIntArray52 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IZIII)V")
	public static void method565(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static99.method1656(Static220.anIntArrayArray36[arg0], arg3, arg1 - arg2, arg2 + arg1);
		@Pc(20) int local20 = 0;
		@Pc(33) int local33 = arg2;
		@Pc(36) int local36 = -arg2;
		@Pc(38) int local38 = -1;
		while (local33 > local20) {
			local38 += 2;
			local20++;
			local36 += local38;
			if (local36 >= 0) {
				local33--;
				local36 -= local33 << 1;
				@Pc(69) int[] local69 = Static220.anIntArrayArray36[arg0 - local33];
				@Pc(76) int[] local76 = Static220.anIntArrayArray36[arg0 + local33];
				@Pc(80) int local80 = arg1 - local20;
				@Pc(84) int local84 = arg1 + local20;
				Static99.method1656(local76, arg3, local80, local84);
				Static99.method1656(local69, arg3, local80, local84);
			}
			@Pc(101) int local101 = arg1 + local33;
			@Pc(106) int local106 = arg1 - local33;
			@Pc(112) int[] local112 = Static220.anIntArrayArray36[arg0 + local20];
			@Pc(118) int[] local118 = Static220.anIntArrayArray36[arg0 - local20];
			Static99.method1656(local112, arg3, local106, local101);
			Static99.method1656(local118, arg3, local106, local101);
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(II[JI[I)V")
	public static void method572(@OriginalArg(1) int arg0, @OriginalArg(2) long[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		if (arg0 <= arg2) {
			return;
		}
		@Pc(15) int local15 = (arg0 + arg2) / 2;
		@Pc(17) int local17 = arg2;
		@Pc(21) long local21 = arg1[local15];
		arg1[local15] = arg1[arg0];
		arg1[arg0] = local21;
		@Pc(35) int local35 = arg3[local15];
		arg3[local15] = arg3[arg0];
		arg3[arg0] = local35;
		for (@Pc(47) int local47 = arg2; local47 < arg0; local47++) {
			if (arg1[local47] < (long) (local47 & 0x1) + local21) {
				@Pc(70) long local70 = arg1[local47];
				arg1[local47] = arg1[local17];
				arg1[local17] = local70;
				@Pc(84) int local84 = arg3[local47];
				arg3[local47] = arg3[local17];
				arg3[local17++] = local84;
			}
		}
		arg1[arg0] = arg1[local17];
		arg1[local17] = local21;
		arg3[arg0] = arg3[local17];
		arg3[local17] = local35;
		method572(local17 - 1, arg1, arg2, arg3);
		method572(arg0, arg1, local17 + 1, arg3);
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Z[BIII[Lclient!ch;)V")
	public static void method576(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class30[] arg4) {
		@Pc(10) Class4_Sub10 local10 = new Class4_Sub10(arg1);
		@Pc(20) int local20 = -1;
		while (true) {
			@Pc(24) int local24 = local10.method4635();
			if (local24 == 0) {
				return;
			}
			local20 += local24;
			@Pc(37) int local37 = 0;
			while (true) {
				@Pc(41) int local41 = local10.method4616();
				if (local41 == 0) {
					break;
				}
				local37 += local41 - 1;
				@Pc(56) int local56 = local37 & 0x3F;
				@Pc(62) int local62 = local37 >> 6 & 0x3F;
				@Pc(66) int local66 = local10.method4666();
				@Pc(70) int local70 = local66 & 0x3;
				@Pc(74) int local74 = local66 >> 2;
				@Pc(79) int local79 = local62 + arg3;
				@Pc(84) int local84 = local56 + arg2;
				@Pc(88) int local88 = local37 >> 12;
				if (local79 > 0 && local84 > 0 && local79 < 103 && local84 < 103) {
					@Pc(104) Class30 local104 = null;
					if (!arg0) {
						@Pc(108) int local108 = local88;
						if ((Static174.aByteArrayArrayArray17[1][local79][local84] & 0x2) == 2) {
							local108 = local88 - 1;
						}
						if (local108 >= 0) {
							local104 = arg4[local108];
						}
					}
					Static143.method2194(local70, local88, local20, local88, local79, arg0, local84, local104, !arg0, local74);
				}
			}
		}
	}
}
